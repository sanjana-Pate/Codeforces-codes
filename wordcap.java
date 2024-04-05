import java.util.*;
public class wordcap {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String sp=s.next();
        StringBuilder t=new StringBuilder(sp);
      
           System.out.println(Character.toUpperCase(t.charAt(0))+t.substring(1));
            
        
        
    }
    
}
