package Tasks;

public class Task013_Odd_Even_Numbers_Array {

    public static void main(String[] args) {
        int arr [] = {2,4,5,3,6,7,12,23,25,14,56,78,76,87,432,34,56};

        StringBuffer evennumbers = new StringBuffer();
        StringBuffer oddnumbers = new StringBuffer();

        for (int num : arr){
            if(num % 2 == 0){
                evennumbers.append(num).append(" ");
            }else {
                oddnumbers.append(num).append(" ");
            }
        }
        System.out.println("Even numbers are : " + evennumbers.toString());
        System.out.println("odd numbers are :  " + oddnumbers.toString());
    }
}
