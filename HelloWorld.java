public class HelloWorld{
    //定义了一个方法名为print的方法，实现输出信息功能
    public void print(){
        System.out.println("Hello World");
    }
    public static void main(String[] args){
        //在main方法中调用print方法
        HelloWorld test=new HelloWorld();
        test.print();
    }
}
      
