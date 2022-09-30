package MaxMin;

import java.util.Arrays;
public class NearestMaxMin {

    public static void findMM(int[] list,int x){
        //int min = arr[0];
        //int max = arr[0];
        for(int i = 0; i < list.length; i++) {
            if(list[i] >= x) {
                System.out.println("Girilen sayıdan küçük en yakın sayı: " + list[i-1]);
                break;
            }
        }

        for(int j = 0; j <  list.length; j++) {
            if(list[j] > x) {
                System.out.println("Girilen sayıdan büyük en yakın sayı: " + list[j]);
                break;
            }
        }

    }

    public static void main(String[] args) {
        int[] x = {2,6,3,1};
        Arrays.sort(x);
        findMM(x, 4);    

    }
}
