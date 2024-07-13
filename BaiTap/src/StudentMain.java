import java.util.Scanner;

public class StudentMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student student1 = new Student("a", 12, new double[]{1.1, 2.2, 3.3, 4.4});
        Student student2 = new Student("b", 13, new double[]{2.2, 3.3, 4.4});
        student1.show();
        student2.show();

        if(student1.avrageScore() > student2.avrageScore()){
            System.out.println("Điểm trung bình sinh viên 1 " + student1.avrageScore());
        }else {
            System.out.println("Điểm trung bình sinh viên 2 " + student2.avrageScore());
        }
    }
}
