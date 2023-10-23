import java.util.Scanner;
public class TwoMyScanner
{
    public void run() {
        Scanner n = new Scanner (System.in).useDelimiter("\\s* \\s*");
        while (true) {
            while (n.hasNextInt()) {
                int num = n.nextInt();
                int mult = num*3;
                System.out.println(mult);
            }
        }
    }

    public static void main(String[] args) {
        TwoMyScanner myScanner = new TwoMyScanner();
        myScanner.run();
    }
}
