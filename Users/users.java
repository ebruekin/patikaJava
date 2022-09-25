import java.util.Scanner;
public class users {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        String user,passwd,nPasswd;
        int cvp;
        
        System.out.println("Kullanıcı adı giriniz:");
        user = input.nextLine();
        
        System.out.println("Passwword giriniz: ");
        passwd = input.nextLine();

        if(user.equals("ebru") && passwd.equals("ebru123")){
           System.out.println("Giriş Basarili");
        }
        else{
            System.out.println("Kullanici adi veya password hatali değiştirmek istermisinzi \n1-evet \n2-hayir");
            cvp = input.nextInt();
            input.nextLine();
            if(cvp == 1){
                System.out.println("yeni sifrenizi girin:");
                nPasswd = input.nextLine();
                if(nPasswd.equals(passwd)){
                    System.out.println("Eski şifre ile ayni olamaz baska sifre giriniz");
                } else{
                    System.out.println("Basarili bir sekilde degistirildi");
                }       
                    
            } else {
                System.out.println("Değisiklik yapmak istemediniz");
            }
        }
        input.close();
    }
}
