public class Asal {
    public static void main(String[] args) {

        int n = 100,sayac=0;
        for(int i=2;i<n;i++){
            for(int j=2;j<i;j++){
                if(i%j == 0){
                    sayac++;
                    break;
                }
            }
            if(sayac == 0){
                System.out.print(i + " ");
            }
            sayac = 0;
        }        
    }
}
