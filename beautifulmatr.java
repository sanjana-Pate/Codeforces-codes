import java.util.Scanner;
public class beautifulmatr {
    public static void main(String[] args) {
        int p=0,q=0,sum=0;
         Scanner s=new Scanner(System.in);
       
         int [][]a=new int[5][5];
         for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                a[i][j]=s.nextInt();
                if(a[i][j]!=0&&a[i][j]!=1){
                    System.exit(0);
                }
                if(a[i][j]==1){
                     p=i;
                     q=j;
                }
            }
        }
       
       
           
               while(p!=2){
                 if(p>2){
                    p--;
                    sum++;
                 }
                 if(p<2){
                    p++;
                    sum++;
                 }
               }
               while(q!=2){
                if(q>2){
                    q--;
                    sum++;
                 }
                 if(q<2){
                    q++;
                    sum++;
                 }

            }
            System.out.println((sum));
        
    
}

}