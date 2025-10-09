package abstraciont;

public abstract class Abstract {
    public abstract void display();

    public void show(){
        System.out.println("This is show method");
    }
    
}

class Abstract2 extends Abstract{
    @Override
    public void display(){
        System.out.println("This is Display Method");
    }

}