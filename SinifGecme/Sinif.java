import java.util.Scanner;
public class Sinif {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int mat,fizik,turkce,kimya,muzik,avg;
        int total = 0,sayac=0;
        System.out.println("Mat notunuzu girin: ");
        mat = input.nextInt();

        System.out.println("Fizik notunuzu girin: ");
        fizik = input.nextInt();

        System.out.println("Turkce notunuzu girin: ");
        turkce = input.nextInt();

        System.out.println("Kimya  notunuzu girin: ");
        kimya = input.nextInt();

        System.out.println("Muzik notunuzu girin: ");
        muzik = input.nextInt();

        if(0 <= mat && mat <= 100){
            total += mat;
            sayac++;
        }
        if(0 <= fizik && fizik <= 100){
            total += fizik;
            sayac++;
        }
        if(0 <= kimya && kimya <= 100){
            total += kimya;
            sayac++;
        }
        if(0 <= turkce && turkce <= 100){
            total += turkce;
            sayac++;
        }
        if(0 <= muzik && muzik <= 100){
            total += muzik;
            sayac++;
        }     
        
        if(sayac == 0){
            System.out.println("gecersiz");
        }
        avg = total/sayac;
        System.out.println(total);

        if(avg >= 55){
            System.out.println("Gectiniz ortalamaniz = " + avg);
        } else{
            System.out.println("Kaldiniz ortalamaniz = " + avg);
        }        
        input.close();
    }   
}
