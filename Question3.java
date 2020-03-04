import java.util.Scanner;
class Question3{
	public static void main(String[]args){
		Scanner sc =new Scanner(System.in);
		int sum=0;
		System.out.println("Enter the limit the Arrays :");
		int[] arr=new int[sc.nextInt()];
		int[] arr1=new int[arr.length];
		System.out.println("Enter the values :");
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}
		for(int i=1;i<=arr.length;i++){
			if(i%2==0){
				arr1[i-1]=arr[i-1]*arr[i-1];
			}
			else{
				arr1[i-1]=arr[i-1]*arr[i-1]*arr[i-1];
			}
		}
		System.out.println();
		for(int i=0;i<arr.length;i++){
			sum=sum+arr1[i];
		}
		System.out.println("Sum :"+sum);
	}
}