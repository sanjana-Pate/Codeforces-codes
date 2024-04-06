import java.util.Scanner;
public class insearchofeasy {
    public static void main(String[] args) {
        int c=0,d=0;
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        for (int i = 0; i < n; i++) {
            int j=s.nextInt();
            if(j==0){
                c++;
            }
            else if(j==1){
                d++;
            } else{
                System.exit(0);
            }           
        }
        if(d!=0){
            System.out.println("HARD");
           
        }else{
            System.out.println("EASY");
        }
    }
    
}
