import java.util.Scanner;
public class sub {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n,k;
        n=s.nextInt();
        k=s.nextInt();
        for (int i = 0; i <k; i++) {
            if(n%10!=0){
                n--;
            }
            else{
                n=n/10;
            }

            
        }
        System.out.println(n);
    }
    
}
