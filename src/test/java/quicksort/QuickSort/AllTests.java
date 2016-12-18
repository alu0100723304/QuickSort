package quicksort.QuickSort;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class AllTests extends TestCase {
	public static Test suite() {
		TestSuite suite = new TestSuite(AllTests.class.getName());
		//$JUnit-BEGIN$
		suite.addTest(AppTest.suite());
		suite.addTestSuite(QuicksortTest01.class);
		suite.addTestSuite(QuicksortTest02.class);
		//$JUnit-END$
		return suite;
	}
}
