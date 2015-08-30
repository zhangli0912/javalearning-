import java.util.*;
public class Arrange {
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		int[] arr=new int[10];
		for(int i=0;i<arr.length;i++){
			System.out.println("请输入第"+(i+1)+"学生的成绩");
			arr[i]=in.nextInt();
		}
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
		Arrays.sort(arr);//对成绩进行升序排列
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
	}
}
