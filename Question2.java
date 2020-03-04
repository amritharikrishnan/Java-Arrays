import java.util.Scanner;
class Question2{
	public static void main(String[]args){
		Scanner sc =new Scanner(System.in);
		int sum=0,count=0,c=0;
		double avg=0;
		System.out.println("Enter the limit the Arrays :");
		int[] arr1=new int[sc.nextInt()];
		int[] arr2=new int[arr1.length];
		int[] rslt=new int[arr1.length];
		System.out.println("Enter the Values of First Array");
		for(int i=0;i<arr1.length;i++){
			arr1[i]=sc.nextInt();
		}
		System.out.println("Enter the Values of Second Array");
		for(int i=0;i<arr1.length;i++){
			arr2[i]=sc.nextInt();
		}
		System.out.println();
		System.out.print(" { ");
		for(int i=0;i<arr1.length;i++){
			for(int j=0;j<arr1.length;j++){
				if(arr1[i]==arr2[j]){
					System.out.print(arr1[i]+" ");
					count++;
				}
			}
		}
		System.out.print(" } ");
		System.out.println();
		System.out.println("Similar :"+count);
		
	}
}