import java.util.Scanner;

public class bit {
    public static void main(String[] args) {
        int x=0;
        Scanner s = new Scanner(System.in);
         int n = s.nextInt();
        for (int i = 0; i < n; i++) {
            String st;
            st = s.next();
            if (st.length() != 3) {
                System.exit(0);
            }
            if (st.contains("++")) {
                x=x+1;
            }
            else if (st.contains("--")) {
                x=x-1;
            }
            else{
                x=0;
            }

        }
        System.out.println(x);

        s.close();
    }
}
