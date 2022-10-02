package Duplicate;

public class Duplicate {
    public static void main(String[] args) {
        int[] arr = {1,1,1,2,3,4,2,2,4,6,6,3,4};
        int[] dup = new int[arr.length];
        int startI = 0;

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if(i!=j && arr[i]==arr[j] && arr[i]%2 == 0){
                    dup[startI++] = arr[i];   
                    break;                 
                }
                
            }
        }

        for(int val : dup){
            if(val != 0){
                System.out.println(val);
            }
        }
    }
}
