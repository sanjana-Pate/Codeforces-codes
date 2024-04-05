import java.util.Scanner;
public class tram {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int []a=new int[n];
        int []b=new int[n];
        int []c=new int[n];
        for (int i = 0; i <n; i++) {
            a[i]=s.nextInt();
            b[i]=s.nextInt();      
        }
        c[0]=b[0];
        for (int i = 1; i < n; i++) {
            c[i]=c[i-1]-a[i]+b[i];
            
        }
        int max=c[0];
       
        for (int i = 0; i < n; i++) {
            if(max<c[i]){
                max=c[i];
            }
            
          
        }
        System.out.println(max);
    }
    
}
