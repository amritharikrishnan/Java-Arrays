import java.util.Scanner;
class Question1{
	public static void main(String[]args){
		Scanner sc =new Scanner(System.in);
		int sum=0,count=0,c=0;;
		double avg=0;
		System.out.println("Enter the limit of Array :");
		int[] arr=new int[sc.nextInt()];
		int[] pos=new int[arr.length];
		System.out.println("Enter the Values :");
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<arr.length;i++){
			count=0;
			for(int j=i;j>=1;j--){
				if(i%j==0){
					count++;
				}
			}
			if(count==2){	
				sum=sum+arr[i];
				c++;
			}
		}
		avg=sum/c;
		System.out.println();
		System.out.print("Sum :"+sum);
		System.out.println();
		System.out.print("Average :"+avg);
	}
}