package ex_01_Java_Basic;

public class Lab001_HelloWorldProgram {
    public static void main(String[] args) {
//        System.out.println("Hello world am started learning core JAVA");
// dnsjkl
//        star pattern program
        int n = 6;
        for (int i = 1; i  <=n; i++) {

            for (int j = 1; j <=n-i+1; j++) {
                System.out.print("* ");
            }

            System.out.println();

        }

    }
}
