public class minMaxSearch {
    public static int findMin(int[] x){
        int min = x[0];
        for(int i = 1;i< x.length;i++){
            if (x[i]<min){
                min=x[i];
            }
        }
        return min;
    }
    public static int findMax(int[] x){
        int max = x[0];
        for(int i = 1;i< x.length;i++){
            if (x[i]>max){
                max=x[i];
            }
        }
        return max;
    }
}
