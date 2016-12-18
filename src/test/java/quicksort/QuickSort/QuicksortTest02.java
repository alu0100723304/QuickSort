package quicksort.QuickSort;

import junit.framework.TestCase;

public class QuicksortTest02 extends TestCase {
	Quicksort Q = new Quicksort();
	int[] v = new int[10];
	int[] vr = new int[10];
	
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
		
		vr[0] = 7;
		vr[1] = 6;
		vr[2] = 1;
		vr[3] = 2;
		vr[4] = 9;
		vr[5] = 4;
		vr[6] = 5;
		vr[7] = 3;
		vr[8] = 0;
		vr[9] = 8;
		
		Q.sort(v);		
		for (int i = 0; i < v.length; i++){
			assertNotSame(vr[i], v[i]);
		}
	}
}
