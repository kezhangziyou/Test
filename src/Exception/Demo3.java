package Exception;

/**
 * @author zhangke
 * @version 1.0
 * @className Demo3
 * @description TODO MyException是继承于Exception的子类。mysqlConnectionTest()的try语句块中产生ArithmeticException异常(除数为0)，
 * 并在catch中捕获该异常；接着抛出MyException异常。main()方法对test()中抛出的MyException进行捕获处理。
 * @date 2019/1/14 下午4:26
 **/

public class Demo3 {

    public static void main(String[] args) {
        try {
            test();
        } catch (MyException e) {
            System.out.println("Catch My Exception");
            e.printStackTrace();
        }
    }
    public static void test() throws MyException{
        try {
            int i = 10/0;
            System.out.println("i="+i);
        } catch (ArithmeticException e) {
            throw new MyException("This is MyException");
        }
    }
}