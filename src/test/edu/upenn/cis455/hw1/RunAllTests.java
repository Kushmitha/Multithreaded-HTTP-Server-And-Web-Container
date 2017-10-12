package test.edu.upenn.cis455.hw1;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class RunAllTests extends TestCase {
        @SuppressWarnings("rawtypes")
        public static Test suite() {
                Class[] testClasses = {
                				TestRequest.class,
                				TestResponse.class,
                                TestSession.class,
                                TestContext.class,
                                TestConfig.class
                };
                return new TestSuite(testClasses);
        }
}
