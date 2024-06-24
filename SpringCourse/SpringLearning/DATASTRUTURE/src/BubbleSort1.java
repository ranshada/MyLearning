public class BubbleSort1 {

    public static void main(String[] args) {
        int[] array={20, 35, -15, 7, 55, 1, -22};

       int len= array.length;
       for (int i=len-1; i>0; i--){
           for (int j=0; j<i;j++){
               if(array[j]>array[j+1]){
                   swap(array, j, j+1);
               }
           }
       }
       for(int i=0; i<len;i++)
        System.out.println(array[i]);
    }

    public static void swap(int[] array, int i, int j){
        if(i==j){
            return;
        }
        int temp=array[i];
        array[i]=array[j];
        array[j]=temp;
    }
}
