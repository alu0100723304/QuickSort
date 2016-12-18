package quicksort.QuickSort;

/**
 * \Class Main
 * \author Joel Perez Ramos
 */
public class App {
	public static void main(String[] args) {
		int[] v = new int[10];
		
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
		
		Quicksort Q = new Quicksort();
		Q.print(v);
		Q.sort(v);
		Q.print(v);
	}
}
