import java.util.Scanner;
public class TersUcgen {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int depth;
        
        System.out.print("Derinlik giriniz = ");
        depth = input.nextInt();

        input.close();

        for(int i=depth;i>=1;i--){
            
            for(int k=depth-i;k>=1;k--){
                System.out.print(" ");
            }
            for(int j=2*i-1;j>=1;j--){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
