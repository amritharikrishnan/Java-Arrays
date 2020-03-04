import java.util.Scanner;
class Question5{
	public static void main(String[]args){
		Scanner sc =new Scanner(System.in);
		int sum=0,count=0,c=0;
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
		for(int i=1;i<=arr1.length;i++){
			if(i%2==0){
				rslt[i-1]=arr1[i-1];
			}
			else{
				rslt[i-1]=arr2[i-1];
			}
		}
		System.out.println();
		System.out.print(" {");
		for(int i=0;i<arr1.length;i++){
			System.out.print(rslt[i]+", ");
		}
		System.out.print(" }");
	}
}