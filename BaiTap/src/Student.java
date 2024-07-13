public class Student {
    private String name;
    private int age;
    private double[] score;

    public Student(String name, int age, double[] score) {
        this.name = name;
        this.age = age;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public double[] getScore() {
        return score;
    }
    public void setScore(double[] score) {
        this.score = score;
    }

    public void show() {
        System.out.println("Tên sinh viên là : " + name);
        System.out.println("Tuổi sinh viên là : " + age);
        System.out.println("Điểm của sinh viên là : " + java.util.Arrays.toString(score));
    }
    public double avrageScore(){
        double sum = 0;
        for (double score : score) {
            sum += score;
        }
        return sum/score.length;
    }

}
