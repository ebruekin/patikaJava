import java.util.Scanner;
public class Even {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Sayi giriniz = ");
        int num = input.nextInt();     
        input.close();
        int total = 0 , count = 0 , avg;

        for(int i = 0 ; i <= num; i++ ){
            if(i % 3 == 0 && i % 4 == 0){
                total += i;
                System.out.println("total =" + total);
                count += 1;                
            }            
        }
        avg = total /count;
        System.out.println(avg);
    }
}
