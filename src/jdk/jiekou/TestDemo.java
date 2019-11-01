package jdk.jiekou;

/**
 * @author zhangke
 * @version 1.0
 * @className TestDemo
 * @description TODO
 * @date 2019/6/27 2:56 PM
 **/

/**
 * 定义 一个接口，接口中的抽象方法必须有子类，FunctionalInterface表示这是函数式编程接口，只能有一个方法。
 */
@FunctionalInterface
interface  IMessage {
     void print();
}

public class TestDemo {
    //接口式编程
    //public static  void main(String [] args){
    //    IMessage iMessage=new IMessage() {
    //        @Override
    //        public void print() {
    //            System.out.println("hello woerld");
    //
    //        }
    //    };
    //    iMessage.print();
    //}

    public static  void main(String [] args){

        IMessage iMessage=new IMessage() {
            @Override
            public void print() {
                System.out.println("hello world");

            }
        };
        iMessage.print();
        //函数式编程，如果方法体重有多行语句，这需要大括号{}

        IMessage iMessage1=()->System.out.println("hello world");
        IMessage iMessage2=()->{
            System.out.println("hello world1");
            System.out.println("hello world2");
            System.out.println("hello world3");
        };
        iMessage1.print();
        iMessage2.print();
    }
}