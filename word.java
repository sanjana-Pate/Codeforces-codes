import java.util.*;
public class word {
    public static void main(String[] args) {
        int y=0,z=0;
        Scanner s= new Scanner(System.in);
        String p=s.next();
        for (int i = 0; i < p.length(); i++) {
            if(Character.isUpperCase(p.charAt(i))){
                y++;
            }else{
                z++;
            }
            
        }
        if(z>y){
            System.out.println(p.toLowerCase());
        }
        else if(y>z){
            System.out.println(p.toUpperCase());
        }
        else{
            System.out.println(p.toLowerCase());
        }
    }
    
}
