public class hybridinheritancedemo {
    interface A {
        void methodA(); }
    interface B {
        void methodB(); }
    static class C implements A, B {
        public void methodA() {
            System.out.println("Method A from Interface A");
        }
        public void methodB() {
            System.out.println("Method B from Interface B");
        } }
    static class D extends C {
        void methodD() {
            System.out.println("Method D from Class D");
        } }
     public static void main(String[] args) {
        D obj = new D();
        obj.methodA();  // From Interface A
        obj.methodB();  // From Interface B
        obj.methodD();  // From Class D }
}}
