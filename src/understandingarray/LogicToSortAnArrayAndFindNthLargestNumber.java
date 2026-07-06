package understandingarray;

public class LogicToSortAnArrayAndFindNthLargestNumber {
	public static void main(String[] args) {
		int[] arr = {9,8,5,6,7,3,4,2,1};
		int n = 4;
		
		//Sorting logic
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i] < arr[j]) {
					//swapping logic
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		
		System.out.println(arr[n-1] + " is the " + n + "th largest number in the array");
	}
}
