package impl.com.github.paulcwarren.ginkgo4j.junit;

import java.util.Map;

import org.junit.AssumptionViolatedException;
import org.junit.runner.Description;
import org.junit.runner.notification.Failure;
import org.junit.runner.notification.RunNotifier;

import impl.com.github.paulcwarren.ginkgo4j.runner.RunnerListener;

public class JunitRunnerListener implements RunnerListener {

	private RunNotifier notifier;
	private Map<String,Description> descriptions;
	
	public JunitRunnerListener(RunNotifier notifier, Map<String, Description> descriptions) {
		super();
		this.notifier = notifier;
		this.descriptions = descriptions;
	}

	@Override
	public void testStarted(String specId) {
		notifier.fireTestStarted(descriptions.get(specId));
	}

	@Override
	public void testException(String specId, Exception e) {
		if (e instanceof AssumptionViolatedException) {
			notifier.fireTestAssumptionFailed(new Failure(descriptions.get(specId), e));
		} else {
			notifier.fireTestFailure(new Failure(descriptions.get(specId), e));
		}
	}

	@Override
	public void testFinished(String specId) {
		notifier.fireTestFinished(descriptions.get(specId));
	}

	@Override
	public void testSkipped(String specId) {
		notifier.fireTestIgnored(descriptions.get(specId));
	}
}