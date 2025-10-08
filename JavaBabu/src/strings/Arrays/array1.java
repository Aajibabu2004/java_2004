package array;
import java.util.*;
public class array1 {

	public static void main(String[] args) {
		
		        Scanner scanner = new Scanner(System.in);

		        // Input array size
		        System.out.print("Enter the size of the array: ");
		        int size = scanner.nextInt();

		        // Validate size
		        if (size <= 0) {
		            System.out.println("Array size must be greater than 0.");
		            return;
		        }

		        // Input array elements
		        int[] array = new int[size];
		        System.out.println("Enter " + size + " elements:");
		        for (int i = 0; i < size; i++) {
		            array[i] = scanner.nextInt();
		        }

		        // Find the largest element
		        int largest = array[0];
		        for (int i = 1; i < size; i++) {
		            if (array[i] > largest) {
		                largest = array[i];
		            }
		        }

		        // Output the largest element
		        System.out.println("The largest element in the array is: " + largest);
		    }
		

	}

