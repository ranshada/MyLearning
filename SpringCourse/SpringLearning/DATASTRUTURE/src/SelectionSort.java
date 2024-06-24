public class SelectionSort {

    public static void main(String[] args) {
        int[] array={20, 35, -15, 7, 55, 1, -22};
int len =array.length;

for (int i =len-1;i>0;i--){
    int largest=0;
    for(int j=1;j<=i;j++){
        if (array[largest]< array[j]) {
largest=j;
        }
int temp=array[i];
        array[i]=array[largest];
        array[largest]=temp;
        }
    }

for(int i=0; i<len;i++){
    System.out.println(array[i]);
}
    }


}
