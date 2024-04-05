import java.util.Scanner;
public class luckey {
    public static void main(String[] args) {
        int y=0;
        int flag=1;
        Scanner s=new Scanner(System.in);
        long n=s.nextLong();
        String g=Long.toString(n);
        for (int i = 0; i < g.length(); i++) {
            if(g.charAt(i)=='4'||g.charAt(i)=='7'){
                flag=1;
                y++;
            }
            
        }
        if(flag==1){
        if(y==4||y==7){
            System.out.println("YES");
        }
        else
        {
            System.out.println("NO");
        }
    }
        

    }
    
}
