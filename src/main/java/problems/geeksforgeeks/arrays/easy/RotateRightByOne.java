package problems.geeksforgeeks.arrays.easy;

import java.util.Arrays;
import java.util.Objects;

public class RotateRightByOne {

	public static void main(String[] args) {
		
		int[] arr= new int[] {9, 8, 7, 6, 4, 2, 1, 3};
		System.out.println(Arrays.toString(arr));
		new RotateRightByOne().rotate(arr);
		System.out.println(Arrays.toString(arr));
	}
	
	/**
	 * Logic:
	 * 
	 * 1) Keep hold of last element
	 * 2) Traverse the array in reverse from n-1..1 and copy element at index i-1 to i
	 * 3) Replace element at index 0 with element we kept hold in step 1
	 * 
	 * T.C --> O(n)
	 * A.S.C --> O(1)
	 * 
	 * @param array of integers
	 * 
	 */
	public void rotate(int arr[])
    {
		if(Objects.isNull(arr) || arr.length == 0)
			throw new ArrayIndexOutOfBoundsException();
		
		int temp = arr[arr.length -1];
		for(int i=arr.length-1; i>0; i--) {
			arr[i] = arr[i-1];
		}
		arr[0] = temp;
    }
}
