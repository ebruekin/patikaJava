import java.util.Scanner;
public class Burc {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int day,month;
        
        System.out.println("Doğduğunuz günü girin = ");
        day = input.nextInt();
        
        System.out.println("doğdugunuz ayi girin");
        month = input.nextInt();


        if((day >= 21 && month ==3) || (day <= 20 && month == 4)){
            System.out.println("Koç Burcusunuz");
        }
        else if((day >= 21 && month ==4) || (day <= 21 && month == 5)){
            System.out.println("Boğa Burcusunuz");
        }
        else if((day >= 22 && month ==5) || (day <= 22 && month == 6)){
            System.out.println("İkizler Burcusunuz");
        }
        else if((day >= 23 && month ==6) || (day <= 22 && month == 7)){
            System.out.println("Yengec Burcusunuz");
        }
        else if((day >= 23 && month ==7) || (day <= 22 && month == 8)){
            System.out.println("Aslan Burcusunuz");
        }
        else if((day >= 23 && month ==8) || (day <= 22 && month == 9)){
            System.out.println("Başak Burcusunuz");
        }
        else if((day >= 23 && month ==9) || (day <= 22 && month == 10)){
            System.out.println("Terazi Burcusunuz");
        }
        else if((day >= 23 && month ==10) || (day <= 21 && month == 11)){
            System.out.println("Akrep Burcusunuz");
        }
        else if((day >= 22 && month ==10) || (day <= 21 && month == 12)){
            System.out.println("Yay Burcusunuz");
        }
        else if((day >= 22 && month ==12) || (day <= 21 && month == 1)){
            System.out.println("Oğlak Burcusunuz");
        }
        else if((day >= 22 && month ==1) || (day <= 19 && month == 2)){
            System.out.println("Kova Burcusunuz");
        }else{
            System.out.println("Balık Burcusunuz");
        }   
        
        input.close();
    }
}
