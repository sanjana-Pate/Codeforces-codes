
import java.util.Scanner;
public class str {
    public static void main(String[] args) {
        int n;
        Scanner S=new Scanner(System.in);
        n=S.nextInt();
        String[] a=new String[n];
        for (int i = 0; i <n; i++) {
            a[i]=S.next();
        }
        for (int i = 0; i < n; i++) {
            int j=a[i].length();
            if(j<=10){
                System.out.println(a[i]);
            }

            else{
                System.out.print(a[i].charAt(0));
                System.out.print(a[i].length()-2);
                System.out.print(a[i].charAt(j-1));
                System.out.println();
            }
            
        }

    }
    
}
