package methodoverride;

public class OverRide {
    public void method1(){
        System.out.println("This is Method 1");
    }
}

class Over2 extends OverRide{
    @Override
    public void method1(){
        System.out.println("This is Overriden Method 1");
    }
}