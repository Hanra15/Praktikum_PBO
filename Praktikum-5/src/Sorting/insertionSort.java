package Sorting;

public class insertionSort {
	public static void main(String[]args) {
		int arr[]= {7,2,9,1,5};
		System.out.println("---Array sebelum sorting---");
		printarray(arr);
		bubblesort(arr);
		System.out.println("---Array setelah sorting---");
		printarray(arr);
	}
	static void bubblesort(int[]array) {
		int n = array.length;
		int temp = 0;
//		looping through array length
		for(int i=0;i<n;i++) {
//			compare array [j-1]
			for(int j=1;j<(n-i);j++) {
//				swap element
				if(array[j-1]>array[j]) {
					temp = array[j-1];
					array[j-1] = array[j];
					array[j] = temp;
					printarray(array);
				}
			}
		}
	}
	static void printarray(int[]array) {
		for(int i=0;i<array.length;i++) {
			System.out.print(array[i]+" ");
		}
		System.out.println();
	}
}
