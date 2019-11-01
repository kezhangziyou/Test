package jdk.design.pattern;

import jdk.design.pattern.model.Product;
import jdk.design.pattern.predicate.ColorPredicate;
import jdk.design.pattern.predicate.MyPredicate;
import jdk.design.pattern.predicate.PricePredicate;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zhangke
 * @version 1.0
 * @className filterTest
 * @description 定义过滤方法，将过滤接口当做参数传入，这样这个过滤方法就不用修改，
 * 在实际调用的时候将具体的实现类传入即可。
 * @date 2019/5/16 4:18 PM
 **/
public class FilterTest {
	public static  void main(String [] args){
		List<Product> productList = new ArrayList<Product>() {
			{
				add(new Product("红色", 2200));
				add(new Product("蓝色", 20000));
				add(new Product("红色", 22000));
				add(new Product("绿色", 2000));
				add(new Product("白色", 2000));

			}
		};
		//颜色过滤
		ColorPredicate colorPredicate = new ColorPredicate();
		List<Product> filterProductByColorPredicate= filterProductByPredicate(productList, colorPredicate);
		filterProductByColorPredicate.forEach((x)->System.out.println(x));

		//价格过滤
		PricePredicate pricePredicate = new PricePredicate();
		List<Product> filterProductByPricePredicate = filterProductByPredicate(productList, pricePredicate);
		filterProductByPricePredicate.forEach((x)->System.out.println(x));


	}

    public static List<Product> filterProductByPredicate(List<Product> list, MyPredicate<Product> mp){
        List<Product> prods = new ArrayList<>();
        for (Product prod : list){
            if (mp.test(prod)){
                prods.add(prod);
            }
        }
        return prods;
    }



}