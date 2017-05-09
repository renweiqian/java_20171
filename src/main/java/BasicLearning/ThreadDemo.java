package BasicLearning;

/**
 * Created by 任纹乾 on
 * 2017/5/9.
 */
public class ThreadDemo {
    public static void main(String[] args) {

    MyThread mt = new MyThread();
    mt.start();
       // mt.run();执行完调用的run才会执行“程序执行完毕”
        //这样的调用它就是一个单线程丧失了多线程的功能
        for (int i=0;i<10;i++){
            try{
                Thread.sleep(100);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
            System.out.println("主线程"+i);
        }

        System.out.println("程序执行完毕");
    }
}
