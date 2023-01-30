import java.util.Arrays;

public class FrequencyOfArray {
    public static void main(String[] args){
        int arr[]={1,4,5,3,2,4,6,2,4};
        Arrays.sort(arr);
        int frequency,i,j;
        System.out.println("frequency");
        for ( i=0;i< arr.length;i++){
            frequency=1;
            for ( j=i+1;j<arr.length;j++){
                if (arr[j]==arr[i]){
                    frequency++;

                }else {
                    break;
                }
            }
            i=j-1;
            if(frequency>1){
                System.out.println(arr[i]+" is "+frequency+" times");
            }

        }

    }
}
