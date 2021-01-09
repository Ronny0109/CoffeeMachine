import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int a,b,c;
        a = number % 10;
        b = number % 100;
        b = b -a;
        c = number % 1000;
        c = c-(b+a);
        a = a*100;
        c = c/100;
        System.out.print(a+b+c);
    }
}