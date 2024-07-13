import java.util.Scanner;

public class QuadraticEquationMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập giá trị a");
        double a = sc.nextDouble();
        System.out.println("Nhập giá trị b");
        double b = sc.nextDouble();
        System.out.println("Nhập giá trị c");
        double c = sc.nextDouble();
        QuadraticEquation quadraticEquation = new QuadraticEquation(a, b, c);
        double delta = quadraticEquation.getDiscriminant();
        if (delta >= 0) {
            System.out.println("Phương trình có 2 nghiệm r1 " + quadraticEquation.getRoot1() + " và r2 " + quadraticEquation.getRoot2());
        } else if (delta == 0) {
            System.out.println("Phương trình có 1 nghiệm " + quadraticEquation.getRoot1());
        }
        else {
            System.out.println("The equation has no roots");
        }
    }
}
