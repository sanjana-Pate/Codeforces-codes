import java.util.Scanner;
public class beautifulyear {
    public static void main(String[] args) {
 
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        if(n>9000){
            System.exit(0);
        }
        for (int i = n+1; ; i++) {
          
            String p=Integer.toString(i);
            if(p.charAt(0)!=p.charAt(1)&&p.charAt(1)!=p.charAt(2)&&p.charAt(2)!=p.charAt(3)&&p.charAt(0)!=p.charAt(2)&&p.charAt(3)!=p.charAt(0)&&p.charAt(1)!=p.charAt(3))
            {
                System.out.println(i);
                break;
            }
           
            
           
        }


    }}