package java1702.basic;

/**
 * Created by 任纹乾 on
 * 2017/3/24.
 */
public class ScopeTest {
        private int i;

    public static void main(String[] args) {
        ScopeTest scopeTest = new ScopeTest();
        scopeTest.method();
    }
  public void method() {
           i = 0;
         int j = 1;
        System.out.println(j);
        for (int k = 0 ; k < 10 ; k++){
            j = 2;
            System.out.println(j);
        }
        for (int k = 0 ; k < 10 ; k++){
           i = 2;
            System.out.println(i);
        }
    }
  }

