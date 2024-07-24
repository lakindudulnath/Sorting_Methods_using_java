package bubble_Sort_Code_Java;

public class BubbleSort {

	public static void main(String[] args) {
		 int[] array = {64, 34, 25, 12, 22, 11, 90};
	        bubbleSort(array);
	        System.out.println("Sorted array:");
	        printArray(array);

	}
	
	  public static void bubbleSort(int[] array) {
	        int n = array.length;
	        for (int i = 0; i < n - 1; i++) {
	            for (int j = 0; j < n - i - 1; j++) {
	                if (array[j] > array[j + 1]) {
	                    int temp = array[j];
	                    array[j] = array[j + 1];
	                    array[j + 1] = temp;
	                }
	            }
	        }
	    }
	  
	  public static void printArray(int[] array) {
	        for (int i : array) {
	            System.out.print(i + " ");
	        }
	        System.out.println();
	    }
	}








