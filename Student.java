import java.util.Scanner;
public class Student 
{
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		System.out.println("请输入学生人数:");
		int renshu=in.nextInt();//存储学生的人数
		System.out.println("请输入课程的数目：");
		int courseNum=in.nextInt();//存储课程的数目
		String[] name=new String[renshu];//声明一个String数组来存储学生的姓名
		String[] course=new String[courseNum];//声明一个String数组来存储课程的名称
		int[][] number=new int[renshu][courseNum];
		int[] sum=new int[renshu];
		int[] avg=new int[renshu];
		String[] str=new String[renshu];
		/*用来循环存储课程的名称*/
		for(int i=0;i<course.length;i++)
		{
			System.out.println("请定义第"+(i+1)+"门课程的名字");
			course[i]=in.next();
		}
		for(int i=0;i<renshu;i++)
		{
			int s=0;
			System.out.println("请输入学生的姓名：");
			name[i]=in.next();
			String str11="";
			for(int j=0;j<courseNum;j++)
			{
				System.out.println("请输入学生"+name[i]+course[j]+"的成绩");
				number[i][j]=in.nextInt();
				s+=number[i][j];
				str11+=number[i][j]+"\t";
			}
			sum[i]=s;
			avg[i]=s/courseNum;
			str[i]=name[i]+"\t"+str11+sum[i]+"\t"+avg[i];
		}
		for(int i=0;i<str.length-1;i++)
		{
			for(int j=0;j<str.length-1;j++)
			{
				if(sum[j]<sum[j+1])
				{
					int t1=sum[j]; String t2=str[j];
					sum[j]=sum[j+1]; str[j]=str[j+1];
					sum[j+1]=t1; str[j+1]=t2;
				}
			}
		}
		/*效果输出*/
		System.out.print("学生");
		for(int i=0;i<course.length;i++)
		{
			System.out.print("\t"+course[i]);
	    }
		System.out.print("\t总分\t平均分\t排行榜");
		System.out.println();
		for(int i=0;i<renshu;i++)
			{
			System.out.println(str[i]+"\t第"+(i+1)+"名");
			}
			
	}
}

