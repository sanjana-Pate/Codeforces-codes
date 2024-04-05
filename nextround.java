import java.util.Scanner;
public class nextround {
    public static void main(String[] args) {
        int n,k,j=0;
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
        int []a=new int[n];
        k=s.nextInt();

        for (int i = 0; i < n; i++) {
            a[i]=s.nextInt(); 
            if(a[i]>=a[k-1]&&a[i]>0){
            j++;
            }
        
            
        }
        System.out.println(j);
        
    }
    
}


