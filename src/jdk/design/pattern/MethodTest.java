package jdk.design.pattern;

import jdk.design.pattern.model.Product;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zhangke
 * @version 1.0
 * @className MethodTest
 * @description TODO
 * @date 2019/5/16 4:12 PM
 **/
public class MethodTest {
	public static  void main(String [] args){
		/**
		 我们发现实际上这些过滤方法的核心就只有if语句中的条件判断，其他均为模版代码，
		 每次变更一下需求，都需要新增一个方法，然后复制黏贴，假设这个过滤方法有几百行，
		 那么这样的做法难免笨拙了一点。如何进行优化呢？
		 */

	}

    // 筛选颜色为红色
    public  List<Product> filterProductByColor(List<Product> list){
        List<Product> prods = new ArrayList<>();
        for (Product product : list){
            if ("红色".equals(product.getColor())){
                prods.add(product);
            }
        }
        return prods;
    }

    // 筛选价格小于8千的
    public  List<Product> filterProductByPrice(List<Product> list){
        List<Product> prods = new ArrayList<>();
        for (Product product : list){
            if (product.getPrice() < 8000){
                prods.add(product);
            }
        }
        return prods;
    }

}