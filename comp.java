import java.util.Scanner;
public class comp {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String a=s.next();
        String b=s.next();
        if(a.length()!=b.length()){
            System.exit(0);
        }
        int j=a.compareToIgnoreCase(b);
        if(j>0){
            System.out.println("1");
        }
        else if(j<0){
            System.out.println("-1");
        }
        else{
            System.out.println("0");
        }
    }
    
}
