import java.util.Scanner;

public class MainRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Rectangle rectangle = new Rectangle(5,2);
        System.out.println("Hình chữ nhật có chiều dài là " + rectangle.height + " và chiều rộng "+ rectangle.width);
        rectangle.show();
        System.out.println("Nhập chiều dài hình");
        rectangle.height = sc.nextInt();
        System.out.println("Nhập chiều rộng hình");
        rectangle.width = sc.nextInt();
        System.out.println("Hình chữ nhật sau thay đổi có chiều dài là " + rectangle.height + " và chiều rộng "+ rectangle.width);
        rectangle.show();
    }
}