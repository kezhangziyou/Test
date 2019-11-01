package thread.callable;

import java.util.concurrent.Callable;

/**
 * @author zhangke
 * @version 1.0
 * @className callable
 * @description TODO
 * @date 2019/2/27 下午6:55
 **/
public class callable  implements Callable{
    @Override
    public Integer call() throws Exception {
        int sum = 0;

        for (int i = 0; i <= 10; i++) {
            sum += i;
        }

        return sum;
    }
}