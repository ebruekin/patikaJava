import java.util.Scanner;
public class MinMax {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int nCount,number,min=0,max=0;
        
        System.out.print("Kac sayi gireceksiniz : ");
        nCount = input.nextInt();

        for(int i=1; i<=nCount;i++){
            System.out.print(i + ". Sayiyi giriniz : "  );          
            number = input.nextInt(); 
            
            if(number == 1){
                min = number;
                max = number;
            }
            else{
                if(number > max){
                    max = number;
                }else {
                    min = number;
                }
            }

        }
        System.out.println("max = " + max);
        System.out.println("min = " + min);
        input.close();
    }
}
