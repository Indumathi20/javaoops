package oops1;

interface A {
    void a();

    void b();

    void c();

    void d();
}

abstract class B implements A {
    public void c() {
        System.out.println("this is c");
    }
}

class M extends B {
    public void a() {
        System.out.println("this is a");
    }

    public void b() {
        System.out.println("this is b");
    }

//    // We override c() to have specific behavior for class M
//    public void c() {
//        System.out.println("this is c for M");
//    }

    public void d() {
        System.out.println("this is d");
    }
}

public class interfaceex {
    public static void main(String[] args) {
        A a = new M();
        a.a();
        a.b();
        a.c();
        a.d();
    }
}
