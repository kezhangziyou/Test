package fanxing.nei;


/**
 * @author zhangke
 * @version 1.0
 * @className mysqlConnectionTest
 * @description TODO
 * @date 2019/2/23 上午12:04
 **/
public class test {
    public static  void main(String [] args){
        //泛型的类型参数只能是类类型（包括自定义类），不能是简单基本类型int
        //传入的实参类型需与泛型的类型参数类型相同，即为Integer.
        Generic<Integer> genericInteger = new Generic<Integer>(123456);
        //传入的实参类型需与泛型的类型参数类型相同，即为String.
        Generic<String> genericString = new Generic<String>("key_vlaue");
        System.out.println("泛型测试,key is"+ genericInteger.getKey());
        System.out.println("泛型测试,key is"+ genericString.getKey());
    }
}