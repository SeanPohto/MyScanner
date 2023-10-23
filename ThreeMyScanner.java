import java.util.Scanner;
public class ThreeMyScanner
{
    public void run() {
        Scanner c = new Scanner (System.in).useDelimiter("\\s*,\\s*");
        Scanner s = new Scanner (System.in).useDelimiter("\\s* \\s*");
        while (true) {
            while (s.hasNext()) {
                String w = c.next();
                System.out.println(w);
            }
        }
    }

    public static void main(String[] args) {
        ThreeMyScanner myScanner = new ThreeMyScanner();
        myScanner.run();
    }
}
