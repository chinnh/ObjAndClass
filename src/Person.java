import java.lang.reflect.Constructor;
import java.util.Scanner;

public class Person { //Tên lớp public phải trùng với tên file
    public int age; //Thuộc tính
    public String name;
    /*
    Các thuộc tính thì có giá trị mặc định, nếu không quy định giá trị
    thì giá trị mặc định sẽ phụ thuộc vào kiểu dữ liệu (int = 0; double = 0.0; boolean = false;
    String = null;...)
     */

    public String gender = "Nam";

    public Person(int age, String name, String gender) {
        this.age = age;
        this.name = name;
        this.gender = gender;
    }

    public Person() {
    }

    public String hello(){ //Khai báo phương thức
        return this.name + " Huy ngu";
    }

    public void go(String from){ //void : không cần giá trị trả về
        System.out.println(this.name + " đang đi đến " + from);
    }
}
/*
Lớp : là khuôn mẫu sinh ra các đối tượng cụ thể
Lớp có :
    - Thuộc tính : dữ liệu mà các đối tượng có, đại diện cho đặc điểm của các đối tượng - biến toàn cục trong java
        + Biến thuộc tính
    - Constructor : là 1 hàm thực hiện tạo ra các đối tượng, constructor thì có tên trùng với tên lớp
và không có giá trị trả về, có thể có nhiều constructor
    - Khi không khai báo constructor nào thì tự động có 1 constructor rỗng,
nếu có constructor khác thì constructor mặc định vừa nói sẽ không còn
    - Phương thức (Methos, hàm, Function) : đại diện cho hành động của các đối tượng
 */