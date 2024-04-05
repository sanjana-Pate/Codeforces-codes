import java.util.Scanner;
public class lang {
    public static void main(String[] args) {
        Scanner m=new Scanner(System.in);
        String s=m.next();
        String p=m.next();
        StringBuilder r= new StringBuilder(s);
        if(p.equals(r.reverse().toString())){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
        
    }
    
}
