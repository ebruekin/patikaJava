import java.util.Scanner;
public class Ebob {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n1,n2;

        System.out.println("enter n1..");
        n1 = input.nextInt();

        System.out.println("enter n2..");
        n2 = input.nextInt();

        int ebob = 1,i = 1,ekok;

        while(i<=n1 || i<= n2){
            if(n1%i==0 && n2%i==0){
                ebob = i;                
            }
            i++;
        }
        input.close();
        System.out.println("ebob " + ebob);
        ekok = (n1*n2)/ebob;
        System.out.println("ekok.." + ekok);
    }
}
