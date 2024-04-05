import java.util.*;
public class hpmaths {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        String a=s.next();
        char []c=a.toCharArray();
        char []h=new char[a.length()/2+1];
        for (int i = 0,j=0; i < c.length; i=i+2,j++) {
            h[j]=c[i];
            
        }
        Arrays.sort(h);
        for (int i = 0,j=0; i < c.length; i=i+2,j++) {
         c[i]=h[j];
            
        }
      System.out.println(c);
     
    }
}