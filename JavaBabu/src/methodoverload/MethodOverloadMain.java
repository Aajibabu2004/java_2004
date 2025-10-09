package methodoverload;

public class MethodOverloadMain {
    public static void main(String[] args) {
        MethodOverload ml = new MethodOverload();

        ml.show();
        System.out.println(ml.show(10));
        ml.show(1,2);
    }
}