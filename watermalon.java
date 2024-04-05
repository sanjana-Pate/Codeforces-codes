import java.util.Scanner;
class watermalon{
    public static void main(String []args){
        int n;
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
        if(n==2||n%2!=0){
            System.out.println("NO");
        }
        else{
            System.out.println("YES");
        }

    }

}