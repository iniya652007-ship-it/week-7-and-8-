import java.util.Scanner;

public class Chocolates {

    public static int[] findRemainderAndQuotient(int chocolates, int children) {
        int each = chocolates / children;
        int remaining = chocolates % children;
        return new int[]{each, remaining};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter chocolates: ");
        int choco = sc.nextInt();

        System.out.print("Enter children: ");
        int children = sc.nextInt();

        int[] result = findRemainderAndQuotient(choco, children);

        System.out.println("Each child gets: " + result[0]);
        System.out.println("Remaining chocolates: " + result[1]);
    }
}