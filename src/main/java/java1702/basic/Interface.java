package java1702.basic;

import java.io.InputStreamReader;

/**
 * Created by 任纹乾 on
 * 2017/3/23.
 */
public interface Interface{
    int ONE = 1;
    void m();

interface A {
    void a();
}

interface B {
    void b();
}

interface C {
    void c();
}

interface D {
    void d();
}
    class InterfaceTest implements Interface,A,B,C,D{

        @Override
        public void m() {

        }

        @Override
        public void a() {

        }

        @Override
        public void b() {

        }

        @Override
        public void c() {

        }

        @Override
        public void d() {

        }

        public static void main(String[] args) {
            System.out.println(ONE);
        }
    }
}