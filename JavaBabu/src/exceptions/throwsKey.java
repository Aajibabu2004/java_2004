package exception;

class Sample {

    public void show() throws Exception {
        String s = null;

        
        throw new NullPointerException("NoNullValue");
    }
}


public class throwsKey {
    public static void main(String[] args) {
       
        try {
            Sample s = new Sample();
            s.show(); 
        } catch (Exception e) {
           
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}

