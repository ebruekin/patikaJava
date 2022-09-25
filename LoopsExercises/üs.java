import java.util.Scanner;
public class üs {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int taban,üs,sonuc=1;

        System.out.println("Taban sayiyi giriniz = ");
        taban = input.nextInt();

        System.out.println("üs'ü giriniz");
        üs = input.nextInt();
        input.close();

        for(int i = 1 ; i <= üs ; i++){
            sonuc = sonuc*taban;
            
        }
        System.out.println(sonuc);
    }
}