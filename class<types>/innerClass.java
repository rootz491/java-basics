class innerClassExample {
	//	data structure
	private final static int SIZE = 15;
	private int[] arrayOfInts = new int[SIZE];

	public innerClassExample() {
		//	fill array with some values.
		for (int i=0; i<SIZE; i++) {
			arrayOfInts[i] = i*10;
		}
	}


	interface DataStructureIterator extends java.util.Iterator<Integer> {}
	//	inner class implements the dataStructureIterator interface,
	//	which extends the Iterator<Integer> interface.

	private class EvenIterator implements DataStructureIterator {
		//	start from beginning
		private int nextIndex = 0;

		//	check if current element is last in the array
		public boolean hasNext() {
			return (nextIndex <= SIZE - 1);
		}

		//	get the value of next even index of the array
		public Integer next() {
			//	record value of even inder of array
			Integer retValue = Integer.valueOf(arrayOfInts[nextIndex]);

			nextIndex += 2;
			return retValue;
		}
	}


	//	using the EvenIterator class here
	public void printEven() {
		//	print out values of even indices of the array
		DataStructureIterator iterator = this.new EvenIterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next() + " ");
		}
		System.out.println();
	}



	// main function
	public static void main(String[] args) {
		innerClassExample ds = new innerClassExample();
		ds.printEven();
	}

}