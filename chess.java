import java.util.Scanner;
public class chess {
    public static void main(String[] args) {
        int w=0,e=0;
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        String p=s.next();
        if(p.length()!=n){
            System.exit(0);
        }
        for (int i = 0; i <p.length(); i++) {
            if(p.charAt(i)=='A'){
                w++;
            }
            else{
                e++;
            }
            
        }
        if(w>e){
            System.out.println("Anton");
        }
        else if(w<e){
            System.out.println("Danik");
        }
        else{
            System.out.println("Friendship");
        }
    }
}
