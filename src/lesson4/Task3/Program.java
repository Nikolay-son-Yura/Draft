package lesson4.Task3;

public class Program {

    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();
        D d = new D();


        Gen<A> g = new Gen<A>(a);
        Gen<B> g2 = new Gen<B>(b);
        Gen<C> g3 = new Gen<C>(c);
        Gen<D> g4 = new Gen<D>(d);

        test(g);
        test(g2);
        test(g3);
//        test(g4);
    }

        public static void test(Gen <? extends A>o){
        //
    }
//    public static void test(Gen<? super C> o) {
//        //
//    }
    }
