package methodoverload;

public class MethodOverload {
    public void show(){
        System.out.println("This is show method");
    }

    public int show(int a){
        return a;
    }

    public void show(int a , int b){
        System.out.println("The Values of A & B : "+a+" & "+b);
    }
}