package 练习题;

/**
 * Created by 任纹乾 on
 * 2017/5/9.
 */
//利用继承Thread类创建三个线程，线程1输出三个“good morning!”，
  //      线程2输出三个“good afternoon!”，线程
  //      3输出三个“good night!”，每个线程输出一次后休眠100s。
  //      在main主线程中创建并启动这三个线程
public class MultiThreading  extends Thread{
        private String threadMsg; //线程要说的话
        public MultiThreading(String msg){
            this.threadMsg = msg;
        }
        public void run(){
            for(int i=0;i<3;i++){
                //循环，每个线程输出三次
                System.out.println(Thread.currentThread().getName()+ threadMsg);
                try {
                    //每一次输出睡眠100s 因为睡眠函数的参数是以ms为单位的，所以100s 就是 1000ms *100
                    Thread.sleep(1000*100);
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        }
        public static void main(String[] args) {
//建立一个数组
            MultiThreading thread[] = new MultiThreading[3];

            //生成对应的对象，并且启用线程。
            thread[0] = new MultiThreading("good morning!");
            thread[0].start();

            thread[1] = new MultiThreading("good afternoon!");
            thread[1].start();

            thread[2] = new MultiThreading("good night!");
            thread[2].start();
        }
    }



