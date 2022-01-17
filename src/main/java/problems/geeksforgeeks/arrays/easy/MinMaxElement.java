package problems.geeksforgeeks.arrays.easy;

import java.util.Objects;

public class MinMaxElement {

	public static void main(String[] args) {

		long[] arr = { 3, 2, 1, 56, 10000, 167 };
		System.out.println(new MinMaxElement().getMinMax(arr));	
	}

	/**
	 * Logic:
	 * 
	 * 1) Initialize min to maximum data type value and max to minimum data type value
	 * 2) Traverse the array from 0..n-1
	 * 		a) Update max if element at index i is greater than max
	 * 		b) Update min if element at index i is lesser than min
	 * 
	 * T.C --> O(n)
	 * A.S.C --> O(1)
	 * 
	 * @param arr
	 * @return pair with first as min and second as max
	 */
	pair getMinMax(long arr[]) {
		if (Objects.isNull(arr) || arr.length == 0)
			throw new ArrayIndexOutOfBoundsException();

		long max = Long.MIN_VALUE;
		long min = Long.MAX_VALUE;

		for (int i = 0; i < arr.length; i++) {
			max = Math.max(max, arr[i]);
			min = Math.min(min, arr[i]);
		}

		return new pair(min, max);
	}

	private class pair {

		long first, second;

		public pair(long first, long second) {
			this.first = first;
			this.second = second;
		}

		@Override
		public String toString() {
			return "pair [first=" + first + ", second=" + second + "]";
		}
	}
}
