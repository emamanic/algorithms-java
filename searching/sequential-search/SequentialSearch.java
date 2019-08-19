public class SequentialSearch<T extends Number> {

	public boolean search(T[] values, T value) {
		if(values.length > 0) {
			for(int i = 0; i <= values.length - 1; i++) {
				if(values[i].equals(value)) {
					return true;
				}
			}

			return false;
		} else {
			return false;
		}
	}	
		

	public static void main(String args[]) {
		SequentialSearch<Integer> seqSearch = new SequentialSearch<Integer>();
		Integer[] numbers = new Integer[] {5, 2, 10, 40, 50};

		for(Integer number : numbers) {
			System.out.printf("%3d", number);
		}
		System.out.println();

		System.out.printf("%d belongs to C set = %B\n", 30, seqSearch.search(numbers, 30));
		System.out.printf("%d belongs to C set = %B\n", 40, seqSearch.search(numbers, 40));
	}
}
