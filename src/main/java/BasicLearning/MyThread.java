package BasicLearning;

/**
 * Created by 任纹乾 on
 * 2017/5/9.
 */
public class MyThread extends Thread {
        public void run(){
            for (int i=0;i<10;i++){
                try{
                    Thread.sleep(100);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
                System.out.println("MyThread"+i);
            }
        }

    }
