import java.util.Scanner;
public class fence {
    public static void main(String[] args) {
        int f,h,w=0;
        Scanner s=new Scanner(System.in);
        f=s.nextInt();
        h=s.nextInt();
        int []a=new int[f];
        for (int i = 0; i < f; i++) {
            a[i]=s.nextInt();
            
        }
        for (int j = 0; j < f; j++) {
            if(a[j]>h){
                    w+=2;

            }else{
                w++;
            }
            
        }
        System.out.println(w);
    }
    
}
