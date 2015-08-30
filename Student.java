import java.util.*;
public class Student {
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		System.out.println("请输入学生人数:");
		int renshu=in.nextInt();
		System.out.println("请输入课程的数目：");
		int courseNum=in.nextInt();
		String[] name=new String[renshu];
		String[] course=new String[courseNum];
		for(int i=0;i<course.length;i++){
			System.out.println("请定义第"+(i+1)+"门课程的名字");
			course[i]=in.next();
		}
		for(int i=0;i<renshu;i++){
			int s=0;
			System.out.println("请输入学生的姓名：");
			name[i]=in.next();
			for(int j=0;j<courseNum;j++){
				System.out.println("请输入学生"+name[i]+course[i]+course[j]+"成绩");
				int number[][];
				number[i][j]=in.nextInt();
				s+=number[i][j];
			}
		}
	}
