package collections;

public class GenericType<T> {
    private T value; 
    public void set(T value) {
        this.value = value;
    }

    
    public T get() {
        return value;
    }
    public static void main(String[] args) {
   
        GenericType<String> g = new GenericType<>();

        
        g.set("aajibabu");

        
        System.out.println(g.get());
    }
}
