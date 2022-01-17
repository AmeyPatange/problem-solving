package problems.geeksforgeeks.arrays.easy;

import java.util.Objects;

public class LargestElement {
	
	public static void main(String[] args) {
		
		int[] arr = {1, 2, 0, 3, 2, 4, 5};
		System.out.println(new LargestElement().getLargest(arr));
	}
	
	/**
	 * Logic:
	 * 
	 * Assume first element as maximum in array.
	 * Traverse through the array from index 1..n-1 and compare it with max
	 * 		1) If element is greater than max, it is considered as new max
	 * 		2) Ignore
	 * 
	 * T.C --> O(n)
	 * A.S.C --> O(1)
	 * 
	 * @param array of integers
	 * @return maximum element in array
	 * 
	 */
	public int getLargest(int[] arr) {
		
		if(Objects.isNull(arr) || arr.length == 0)
			throw new ArrayIndexOutOfBoundsException();
		
		int maxEle = arr[0];
		
		for(int i=1; i<arr.length; i++) {
			if(arr[i] > maxEle)
				maxEle = arr[i];
		}
		
		return maxEle;
	}
	
}
