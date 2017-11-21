package bytecode;

public class StackSize {  
  
    private int size = 1;  
      
    public void stackLeak(){  
        size++;  
        stackLeak();  
    }  
    public static void main(String[]args) {  
        StackSize gg = new StackSize();  
        try{  
            gg.stackLeak();  
        } catch (Throwable e) {  
        } finally {
        	System.out.println(gg.size);
        }
    }  
}  