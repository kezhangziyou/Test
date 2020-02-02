package design.pattern.strategy.demo2;


/**
 * Created by 刘权 on 2020-2-2.
 */
public abstract class Duck {

    private FlyStrategy flyStrategy;

    public void setFlyStrategy(FlyStrategy flyStrategy) {
        this.flyStrategy = flyStrategy;
    }

    /**
     * 显示鸭子的外观
     * ，鸭子的外观各不相同，声明为抽象类，由子类实现
     */
    public abstract void display();

    /**
     * 鸭子的叫声
     * 通用行为，由超类实现
     */
    public void quack() {
        System.out.print("嘎嘎嘎");

    }
    /**
     * 让鸭子实现飞的功能，
     * 实现1；继承，灵活性太差
     * 实现2：抽象方法，子内要累死
     * 实现3；策略模式，复合优先于继承，多用组合，少用继承
     * 复合：在那种增加一个私有域，应用另一个已有的类的实例，
     * 通过调用引用实例的方法从而获得新的功能，这种功能额称为组合。
     * 将飞行行为抽象为接口，在父类中持有该接口，并由该接口实现飞行行为。
     */
    public void fly(){
        flyStrategy.performFly();
    }

}
