import java.util.Arrays;

public class RemovingFromArray {
    public static void main (String[] args){
        int [] numbsArray = {0, 2, 2, 4, 3, 3, 7, 8, };
        System.out.println(Arrays.toString(removeNummber(numbsArray,2)));

    }
    public static int[] removeNummber (int[] num, int arg) {
        int offset = 0;

        for (int i = 0; i <num.length ; i++) {
            if (num[i] == arg){
                offset++;
            } else {
                num[i-offset] = num[i];
            }

        }
        return Arrays.copyOf(num, num.length - offset);
    }
}

