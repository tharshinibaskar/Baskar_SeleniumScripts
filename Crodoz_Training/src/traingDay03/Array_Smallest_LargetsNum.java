package traingDay03;

public class Array_Smallest_LargetsNum {
	public static void main(String[] args) {
		int[] numbers = {88,33,55,23,64,123};
		int smallest = Integer.MAX_VALUE;
		int largest = Integer.MIN_VALUE;
		for(int i =0;i<numbers.length;i++) {
			if(smallest > numbers[i]) {
				smallest = numbers[i];
			}
			if(largest < numbers[i]) {
				largest = numbers[i];
			}
		}
		System.out.println("Smallest number in array is  " +smallest);
		System.out.println("Largest number in array is  " +largest);
	}
}
