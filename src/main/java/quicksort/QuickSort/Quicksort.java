package quicksort.QuickSort;

public class Quicksort {
	/**
	 * \brief atributos privados
	 */
	private int[] numbers;
	private int number;
	
	/**
	 * \brief Metodo de ordenacion por Quick.
	 * @param values
	 */
	public void sort(int[] values) {
		// Check for empty or null array
		if (values == null || values.length == 0) {
			return;
		}
		this.numbers = values;
		number = values.length;
		quicksort(0, number - 1);
	}
	
	/**
	 * \brief Metodo recursivo QuickSort.
	 * \param low
	 * \param high
	 */
	private void quicksort(int low, int high) {
		int i = low, j = high;
		/**
		 * \brief Obtener el pivote situado en la mitad de la lista.
		 */
		int pivot = numbers[low + (high - low) / 2];
		/**
		 * \brief Divide la lista en dos.
		 */
		while (i <= j) {
			/**
			 * \brief Si el valor actual de la lista izquierda es menor que el pivote
			 * \brief entonces sigue hasta encontrar un valor mayor al pivote.
			 */
			while (numbers[i] < pivot) {
				i++;
			}
			// If the current value from the right list is larger then the pivot
			// element then get the next element from the right list
			/**
			 * \brief Si el valor actual de la lista derecha es mayor que el pivote
			 * \brief entonces sigue hasta encontrar un valor menor al pivote.
			 */
			while (numbers[j] > pivot) {
				j--;
			}
			
			/**
			 * \brief Si hemos encontrado un elemento mayor al pivote por la iquierda
			 * \brief y un elemento menor al pivote por la derecha, entonces
			 * \brief intercambiamos los valores.
			 * \brief Posteriormente aumentamos la i y disminuimos la j .
			 */
			
			if (i <= j) {
				exchange(i, j);
				i++;
				j--;
			}
		}

		/**
		 * \brief Recursividad.
		 */
		if (low < j)
			quicksort(low, j);
		if (i < high)
			quicksort(i, high);
	}
	
	/**
	 * \brief Metodo pivote.
	 * \param i
	 * \param j
	 */
	private void exchange(int i, int j) {
		int temp = numbers[i];
		numbers[i] = numbers[j];
		numbers[j] = temp;
	}
	
	/**
	 * \brief Metodo que imprime el array.
	 * \param values
	 */
	public void print(int[] values) {
		for (int i = 0; i < values.length; i++) {
			System.out.print(values[i] + " ");
		}
		System.out.println();
	}
}