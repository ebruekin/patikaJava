import java.util.Scanner;
public class ArmstrongNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Kontrol etmek için bir sayı giriniz...");
        int n = input.nextInt();
        
        input.close();
        
        int check = n;
        int a = Integer.toString(n).length();
        int res = 0;
        
        for(int i=0;i<a;i++){
            res+= Math.pow(n%10,a);
            System.out.println("resr = " + res);
            System.out.println("n = " + n);
            n = Math.floorDiv(n, 10);
        }
        
        if(res == check){
            System.out.println("Armstrong!");
        }else{
            System.out.println("Not armstrong..");
        }
        
    }
}
