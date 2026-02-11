public class Main {
    public static void main(String[] args) {
        A a = () -> System.out.println("Привет");

        a.SayHello();



    }
}
@FunctionalInterface
interface A{
    void SayHello();
}



