import java.util.Scanner;
public class MyScanner
{

    public void run() {
        Scanner scanner = new Scanner(System.in);
        Scanner n = new Scanner (System.in);
        Scanner s = new Scanner (System.in).useDelimiter("\\s*,\\s*");
        while (true) {
            int x = scanner.nextInt();
            System.out.println(x);
            scanner.close();
            int num = n.nextInt();
            int mult = num*3;
            System.out.println(mult);
            n.close();
            String w = s.next();
            System.out.println(w);
        }
    }

    public static void main(String[] args) {
        MyScanner myScanner = new MyScanner();
        myScanner.run();
    }
}
