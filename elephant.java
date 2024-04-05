import java.util.Scanner;
public class elephant {
    public static void main(String[] args) {
        int y=0;
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        while(n>=1){
            n=n-5;
            y++;
        }
        System.out.println(y);
    }
    
}
