import java.util.*;
public class stone {
    public static void main(String[] args) {
        int y=0;
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        String p=s.next();
        if(p.length()!=n){
            System.exit(0);
        }
       
        for (int i = 0; i < p.length(); i++) {
            int j=i+1;
            if(j<p.length()){
            if(p.charAt(i)==p.charAt(j)){
                y++;
            }
        }
           
            
        }
        System.out.println(y);
    }
    
}
