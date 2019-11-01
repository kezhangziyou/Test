package fanxing.nei;

/**
 * @author zhangke
 * @version 1.0
 * @className ComparatorTest.test1
 * @description TODO
 * @date 2019/2/23 上午12:07
 **/
public class test1 {
    public static  void main(String [] args){
        /**
         * 定义的泛型类，就一定要传入泛型类型实参么？并不是这样，
         * 在使用泛型的时候如果传入泛型实参，则会根据传入的泛型实参做相应的限制，
         * 此时泛型才会起到本应起到的限制作用。如果不传入泛型类型实参的话，
         * 在泛型类中使用泛型的方法或成员变量定义的类型可以为任何的类型。
         */
        Generic generic = new Generic("111111");
        Generic generic1 = new Generic(4444);
        Generic generic2 = new Generic(55.55);
        Generic generic3 = new Generic(false);
        System.out.println("泛型测试,key is"+ generic.getKey());
        System.out.println("泛型测试,key is"+ generic1.getKey());
        System.out.println("泛型测试,key is"+ generic2.getKey());
        System.out.println("泛型测试,key is"+ generic3.getKey());
        Student student =new Student(1,"zhangke");
        Generic generic4 = new Generic<>(student);
        System.out.println(generic4.getKey());
        Generic generic5= new Generic(student);
        System.out.println(generic5.getClass());

    }
}