package ragini_demo;

public class FindNthMaxNum {

	public static void main(String[] args) {
		int[] arr = {2,4,1,7,9,8,6,3}; //index =5 //4th largest num
		int n = 4;
		//Logic to sort a array
		for(int i=0; i<arr.length;i++) {
			for(int j=i+1; j<arr.length;j++) {
				if(arr[i]<arr[j]) {
					int temp = arr[i];
					arr[i] =arr[j];
					arr[j]=temp;
				}
			}
		}
		// to print to array
		for(int i=0; i<arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		System.out.println(arr[n-1]);
	}

}
