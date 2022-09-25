import java.util.Scanner;
public class Star {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Derinlik giriniz..");
        int depth = input.nextInt();
        input.close();

        for(int i=1;i<=depth;i++){  

            for(int k=1;k<=depth-i;k++){
                System.out.print(" ");
            } 

            for(int j=1;j<=2*i-1;j++){
                System.out.print("*");
            }

            System.out.println(" ");                
        }
        for(int i=depth-1;i>0;i--){ 

            for(int j=i;j<depth;j++){
                System.out.print(" ");

            } 
            for(int k=i*2-1;k>0;k--){
                System.out.print("*");
            } System.out.println(" ");
        }
        System.out.print("ööö");







        }
    }
