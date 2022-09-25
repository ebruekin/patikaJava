import java.util.Scanner;
public class Banka {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String uName,passwd;

        System.out.println("Enter username..");
        uName = input.nextLine();

        System.out.println("Enter password..");
        passwd = input.nextLine();    

        int remain = 3,select,total=1500,yPara,cPara;

        if(uName.equals("ebru") && passwd.equals("Ebru123")){
            System.out.println("Operation Succesfull..Welcome");
            System.out.println("Select the action you want todo.. \n1-para yatirma \n2-para çekme \n3-bakiye sorgulama \n4-exit");
            select = input.nextInt();
            
            switch(select){
                case 1:
                    System.out.println("Yatirmak istediğiniz tutari giriniz..");
                    yPara = input.nextInt();
                    total += yPara;
                    System.out.println("Güncel bakiyeniz = " + total);
                    break;
                case 2:
                    System.out.println("Cekmek istediğiniz tutari giriniz");
                    cPara = input.nextInt();
                    if(cPara > total){
                        System.out.println("Yetersiz bakiye");
                    }
                    else{
                        total -= cPara;
                        System.out.println("Kalan bakiye =" + total);
                    }
                    break;
                case 3:
                    System.out.println("bakiyeniz" + total);
                    break;
                case 4:
                    System.out.println("cikis yapiliyor..");
                    break;
                default:
                    System.out.println("Gecersiz seci yaptiniz..");
            }
        }
        else{
            remain--;
            System.out.println("Hatali girş tekrar deneyiniz..");
            if(remain==0){
                System.out.println("Hesabiniz bloke olmustur..");
            }else{
                System.out.println("Kalan hak = " + remain);
            }
        }
        input.close();       
    }
}
