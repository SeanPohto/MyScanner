import java.util.Scanner;
public class MyScanner
{
    public void run() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            int x = scanner.nextInt();
            System.out.println(x);
        }
    }

    public static void main(String[] args) {
        MyScanner myScanner = new MyScanner();
        myScanner.run();
    }
}
