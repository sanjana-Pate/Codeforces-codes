import java.util.Scanner;
public class team {
    public static void main(String[] args) {
        
        int n,p,v,t;
        int sum=0;
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
        int []a=new int[n];
        for (int i = 0; i <n; i++) {
            p=s.nextInt();
            v=s.nextInt();
            t=s.nextInt();
            if(p!=0&&p!=1){
                System.exit(0);
            }
            if(v!=0&&v!=1){
                System.exit(0);
            }
            if(t!=0&&t!=1){
                System.exit(0);
            }
            if(p==1&&v==1||v==1&&t==1||t==1&&p==1){
                a[i]=1;
            }
            
        }
        for (int j = 0; j < n; j++) {
        
         sum=sum+a[j];
        }
        System.out.println(sum);
    }
    
}
