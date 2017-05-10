package 练习题;

/**
 * Created by 任纹乾 on
 * 2017/5/10.
 */
public class Account {
    private int money;
    public void  withdraw(int money){
        this.money = money;

    }
    public int getMoney(){
        return money;
    }
}
class AccounTest implements Runnable{

    @Override
    public void run() {

    }
}
