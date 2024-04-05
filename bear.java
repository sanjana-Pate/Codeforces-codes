import java.util.Scanner;
public class bear {
    public static void main(String[] args) {
        int y=0;
        int l,b;
        java.util.Scanner s=new Scanner(System.in);
        l=s.nextInt();
        b=s.nextInt();
        while (l<=b) {
            l=l*3;
            b=b*2;
            y++;   
        }
        System.out.println(y);
    }
    
}
