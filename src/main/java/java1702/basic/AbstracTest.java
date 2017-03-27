package java1702.basic;

/**
 * Created by 任纹乾 on
 * 2017/3/21.
 */
//class = field + method
public abstract class AbstracTest {//抽象类
    //abstract adj.\抽象的；深奥的

    private  int i;//modifier  修饰符\

    public abstract void method1();
    public abstract void method2();
    public abstract String method3( int i, double d, boolean b);
    public void method4(){

    }
    public static void main(String[] args) {
       // AbstracTest abstracTest = new AbstracTest() ;//instantiated  实例化
        SubAbstactTest subAbstactTest = new SubAbstactTest();
        System.out.println(subAbstactTest);
        subAbstactTest.method1();
        subAbstactTest.method4();
            }
        }
        class SubAbstactTest extends AbstracTest{
            //implement      实现
            @Override
            public void method1(){
                System.out.println("in SubAbstactTest...");

            }
            @Override
            public void method2(){
               return;

            }

            @Override
            public String method3(int i, double d, boolean b) {
                return null;
            }

        }

