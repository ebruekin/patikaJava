import java.util.Scanner;
public class Bilet {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int km,age,type;
        double nTutar,yasIndirimi,gidisDönüs,indirimliTutar=0,toplamTutar;
        
        System.out.println("Kaç km gideceksiniz = ");
        km =input.nextInt();
        if(!(km > 0)){
            System.out.println("Hatali veri girdiniz!!");
        }

        System.out.println("Yasinizi giriniz = ");
        age = input.nextInt();
        if(!(age > 0)){
            System.out.println("Hatali veri girdiniz!!");
        }

        System.out.println("Yolculuk tipinizi seçiniz \n1 Tek Yön \n2 Gidiş-Dönüş");
        type = input.nextInt();
        if(!(type == 1 || type ==2)){
            System.out.println("Hatali veri girdiniz!!");
        }

        nTutar = km * 0.10;
        // AGE < 12
        if(age < 12){
            if(type==2){
                yasIndirimi = nTutar*0.50;
                indirimliTutar = nTutar-yasIndirimi;
                System.out.println("Normal tutar = " + nTutar);
                System.out.println("yas indirimi = " + yasIndirimi);
                System.out.println("İndirimli tutar = " + indirimliTutar);
                gidisDönüs = indirimliTutar*0.20;
                toplamTutar = (indirimliTutar-gidisDönüs)*2;
                System.out.println("cift yön indirimi = " + gidisDönüs);
                System.out.println("Ödenecek tutar = " + toplamTutar);
            }else{
                yasIndirimi = nTutar*0.50;
                indirimliTutar = nTutar-yasIndirimi;
                System.out.println("Normal tutar = " + nTutar);
                System.out.println("yas indirimi = " + yasIndirimi);
                System.out.println("İndirimli tutar = " + indirimliTutar);
            }
        }else if(age >= 12 && age <= 24){
            if(type==2){
                yasIndirimi = nTutar*0.10;
                indirimliTutar = nTutar-yasIndirimi;
                System.out.println("Normal tutar = " + nTutar);
                System.out.println("yas indirimi = " + yasIndirimi);
                System.out.println("İndirimli tutar = " + indirimliTutar);
                gidisDönüs = indirimliTutar*0.20;
                toplamTutar = (indirimliTutar-gidisDönüs)*2;
                System.out.println("cift yön indirimi = " + gidisDönüs);
                System.out.println("Ödenecek tutar = " + toplamTutar);
            }else{
                yasIndirimi = nTutar*0.10;
                indirimliTutar = nTutar-yasIndirimi;
                System.out.println("Normal tutar = " + nTutar);
                System.out.println("yas indirimi = " + yasIndirimi);
                System.out.println("İndirimli tutar = " + indirimliTutar);
            }
        }else if(age > 65){
            if(type==2){
                yasIndirimi = nTutar*0.30;
                indirimliTutar = nTutar-yasIndirimi;
                System.out.println("Normal tutar = " + nTutar);
                System.out.println("yas indirimi = " + yasIndirimi);
                System.out.println("İndirimli tutar = " + indirimliTutar);
                gidisDönüs = indirimliTutar*0.20;
                toplamTutar = (indirimliTutar-gidisDönüs)*2;
                System.out.println("cift yön indirimi = " + gidisDönüs);
                System.out.println("Ödenecek tutar = " + toplamTutar);
            }else{
                yasIndirimi = nTutar*0.30;
                indirimliTutar = nTutar-yasIndirimi;
                System.out.println("Normal tutar = " + nTutar);
                System.out.println("yas indirimi = " + yasIndirimi);
                System.out.println("İndirimli tutar = " + indirimliTutar);
            }
        }else{
            if(type==1){
                nTutar = km * 0.10;
                System.out.println("Toplam tutar =" + nTutar);
            }else{
                nTutar = km * 0.10;
                toplamTutar=nTutar*2;
                System.out.println("Toplam tutar =" + toplamTutar);
            }
        }
        input.close();
        }       

    }

