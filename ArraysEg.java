import java.util.Arrays;

public class ArraysEg {
    public static void main(String[] args) {
        int [] numbers = new int[5];
        int [] numbers1 = { 2,3,4,5,6};
        numbers[0] =1;
        numbers[1] =2;
        Arrays.sort(numbers);
      
        System.out.println(Arrays.toString(numbers));
        System.out.println(numbers1.length);
    }
    
}
