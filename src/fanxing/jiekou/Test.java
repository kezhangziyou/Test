package fanxing.jiekou;

/**
 * @author zhangke
 * @version 1.0
 * @className ComparatorTest
 * @description TODO
 * @date 2019/2/23 上午12:22
 **/

public class Test {
    /**
     * 在之类定义泛型的时候继续使用泛型
     * @param <T>
     */
    class FruitGenerator <T> implements Generator<T> {

        @Override
        public T next() {
            return null;
        }
    }
    public static  void main(String [] args){


    }
}