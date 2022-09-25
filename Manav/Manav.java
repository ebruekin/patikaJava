import java.util.Scanner;
public class Manav {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        double armut,elma,domates,muz,patlican,total;

        System.out.println("Elma kg ?");
        elma = input.nextDouble();

        System.out.println("Armut kg ?");
        armut = input.nextDouble();

        System.out.println("domates kg ?");
        domates = input.nextDouble();

        System.out.println("muz kg ?");
        muz = input.nextDouble();

        System.out.println("patlican kg ?");
        patlican = input.nextDouble();

        total = armut*2.14 + elma*3.67 + domates*1.11 + muz*0.95 + patlican*5.00;

        System.out.println(total);
        

        input.close();
    }
}
