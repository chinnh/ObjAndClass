public class Rectangle {
    public int height;
    public int width;
    public Rectangle(int height, int width) {
        this.height = height;
        this.width = width;
    }
    public int perimeter(){
        return (height+width) * 2;
    }
    public int area(){
        return (height*width);
    }
    public void show(){
        System.out.println("Diện tích của hình là " + area() + " và chu vi là " + perimeter());
    }

}
