import java.util.Scanner;
public class KitleIndex {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double kilo,boy,kIndex;
        System.out.println("kilonuzu giriniz: ");
        kilo = input.nextDouble();
        System.out.println("boyunuzu giriniz: ");
        boy = input.nextDouble();
        kIndex = kilo/(boy*boy);
        System.out.println(kIndex);
        input.close();

    }
}
