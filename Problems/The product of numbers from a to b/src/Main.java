import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long a = scan.nextInt();
        long b = scan.nextInt();
        long product = 1;

        while (a < b) {
            product *= a;
            a++;
        }
        System.out.println(product);
    }
}