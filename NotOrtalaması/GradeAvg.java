import java.util.Scanner;

public class GradeAvg{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        //*get the grades from user

        int mat,fiz,kim,tur,tar,muz,toplam;

        System.out.println("Enter math grade :");
        mat = input.nextInt();

        System.out.println("Enter fiz grade ");
        fiz = input.nextInt();
        
        System.out.println("Enter kim grade :");
        kim = input.nextInt();

        System.out.println("Enter tur grade ");
        tur = input.nextInt();

        System.out.println("Enter tar grade :");
        tar = input.nextInt();

        System.out.println("Enter muz grade ");
        muz = input.nextInt();

        toplam = (mat+fiz+kim+tur+tar+muz);
        double avg = toplam / 6;
        System.out.println("total garde: " + toplam + "\navg grade: " + avg);    

   
       
        //boolean sonuc = avg < 60 || avg >= 60;

        String str = avg >= 60 ? "Gectiniz" : "Kaldiniz";

        System.out.println(str);

        input.close();
    }
}