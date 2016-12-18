package quicksort.QuickSort;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class QuicksortTestI extends TestCase{
	Quicksort Q = new Quicksort();
	int[] v = new int[10];
	int[] vr = new int[10];
	
	/**
	 * Create the test case
	 *
	 * @param testName
	 *            name of the test case
	 */
	public QuicksortTestI(String testName) {
		super(testName);
	}

	/**
	 * @return the suite of tests being tested
	 */
	public static Test suite() {
		return new TestSuite(AppTest.class);
	}
	
	public void testSort() {
		v[0] = 7;
		v[1] = 6;
		v[2] = 2;
		v[3] = 1;
		v[4] = 9;
		v[5] = 4;
		v[6] = 5;
		v[7] = 3;
		v[8] = 8;
		v[9] = 0;
		
		vr[0] = 0;
		vr[1] = 1;
		vr[2] = 2;
		vr[3] = 3;
		vr[4] = 4;
		vr[5] = 5;
		vr[6] = 6;
		vr[7] = 7;
		vr[8] = 8;
		vr[9] = 9;
		
		Q.sort(v);
		for (int i = 0; i < v.length; i++)
			assertEquals(vr[i], v[i]);
	}
}
