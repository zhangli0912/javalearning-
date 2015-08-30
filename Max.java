import java.util.Scanner;
public class Max {
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		System.out.println("请定义学生的人数：");
		int num=in.nextInt();
		int[] arr=new int[num];
		int max=arr[0];
		for(int i=0;i<arr.length;i++){
			System.out.println("请输入第"+(i+1)+"个学生");
			arr[i]=in.nextInt();
			}
		for(int i=0;i<arr.length;i++){
			if(max<arr[i]){
				max=arr[i];
			}
		}
		System.out.println("最大值为"+max);
	}
}
