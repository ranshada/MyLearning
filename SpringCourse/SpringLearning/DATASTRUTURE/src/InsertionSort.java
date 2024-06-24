public class InsertionSort {
    public static void main(String[] args) {
        int[] array={20, 35, -15, 7, 55, 1, -22};
        int len =array.length;

        for(int i=1;i<=len-1;i++){
int newElement=array[i];
            for (int j=0;j<=i;j++){
                if(array[i]<array[j]){

                    array[j+1]=array[j];
                }
                else {
                    array[j+1]=array[i];

                }
            }
        }
    }
}
