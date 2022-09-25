import java.util.Scanner;
public class HesapMak {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int n1,n2,select;
        System.out.println("n1 giriniz:");
        n1 = input.nextInt();
        System.out.println("n2 giriniz:");
        n2 = input.nextInt();
        
        System.out.println("1-toplama \n2-Çıkarma \n3-Bölme \n4-Çarpma");
        select = input.nextInt();
        
        switch(select){
            case 1:
                System.out.println(n1+n2);
                break;
            case 2:
                System.out.println(n1-n2);
                break;
            case 3:
                System.out.println(n1/n2);
                break;
            case 4:
                System.out.println(n1*n2);
                break;
            default:
                System.out.println("geçersiz seçimler");
            
        }   
        input.close();
    }
}
