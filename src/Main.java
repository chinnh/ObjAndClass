import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Person person = new Person(20, "huy", "Nam");
        System.out.println(person.hello()); //Truy xuất phương thức của đối tượng\
        person.go(" nhà ");
//        System.out.println(person.name);
//        System.out.println(person.age);
//        System.out.println(person.gender);
//        Person person1 = new Person();
//        //Dựa vào giá trị truyền vào để xác định constructor mà nó gọi
//        System.out.println(person1.age);
//        System.out.println(person1.name);
//        System.out.printf(person1.gender);
//        Person person2 = new Person();
    }
}
//Đối tượng : là các thực thể cụ thể sinh ra từ lớp