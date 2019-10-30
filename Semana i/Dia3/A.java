import java.util.ArrayList;
import java.util.Scanner;

public class A{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int[] arr;
		int count = sc.nextInt();
		arr = new int[count];
		for(int i= 0; i< count; i++){
			int num = sc.nextInt();
			arr[i] = num;
		}
		System.out.println(unimodal(arr));
	}
	public static String unimodal(int[] arr){
		int block = 1;  
		for (int i= 0; i< arr.length-1 ; i++){
			if(block == 1){
				if (arr[i] == arr[i+1])
					block = 2;
				else {
					if (arr[i] > arr[i+1])
						block=3;
				} 
			}
			else if(block == 2){
				if(arr[i]> arr[i+1])
					block = 3;
				else{
					if(arr[i]< arr[i+1])
						return "NO";
				}
			}
			else if(block == 3){
				if(arr[i] < arr[i+1])
					return "NO";
				else{
					if (arr[i] == arr[i+1])
						return "NO";
				}
			}
		}
		return "YES";
	}
}