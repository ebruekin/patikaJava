package Harmonic;

public class Harmonic {
    
    public static double harmonik(double[] arr){
        double harm =0;
        for(int i = 1; i < arr.length; i++){
            harm = harm + (1/arr[i]);            
        }
        return harm;
    }   

    public static void main(String[] args) {

        double[] arr ={1,2,3,4,5,1};
        System.out.println(harmonik(arr));

    }
}
