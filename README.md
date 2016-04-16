# Ginkgo4j
##A Java BDD Testing Framework  (based on [ginkgo](http://onsi.github.io/ginkgo/))

Just getting up and running.  

Currently supports:-
- Describe, Context, BeforeEach, JustBeforeEach, It and AfterEach constructs
- Any level of nested contexts
- Threaded execution (default is 4 threads)

## Getting Started

- Create a junit test
- Annotate your test class with `@RunWith(Ginkgo4jRunner.class)`
- Control the number of threads used with `@Ginkgo4jConfiguration(threads = 1)`

See the ginkgo docs for more information of BDD and writing ginkgo BDD tests.  

Ginkgo4j is tested with itself.  See [RunnerThreadTests.java](src/test/java/impl/org/paulcwarren/ginkgo4j/runner/RunnerThreadTests.java) or [ExecutableChainBuilderTests.java](src/test/java/impl/org/paulcwarren/ginkgo4j/builder/ExecutableChainBuilderTests.java) for Java examples. 

More readable Java examples to follow.... 