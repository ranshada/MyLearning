public class BubbleSort {
    public static void main(String[] args) {
        int[] intArray=new int[7];

        intArray[0]=20;
        intArray[1]=35;
        intArray[2]=-15;
        intArray[3]=7;
        intArray[4]=55;
        intArray[5]=11;
        intArray[6]=-35;
int temp=0;
int max_length=intArray.length;
for(int j=0;j<max_length;j++){
        for(int i=0;i < j;i++) {
            if (intArray[i] > intArray[i+1]) {
                temp = intArray[i];
                intArray[i] = intArray[i + 1];
                intArray[i + 1] = temp;

            }
            max_length--;
        }
        }
        for (int i=0; i<intArray.length;i++){
            System.out.println(intArray[i]);
        }
    }
}
