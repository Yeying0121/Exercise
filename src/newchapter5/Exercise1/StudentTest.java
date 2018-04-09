package newchapter5.Exercise1;

public class StudentTest {
    public static void main(String[] args) {
        Student student = new Student();
        student.getStudentId();
        student.getClasses();
        student.getAge();
        student.getSex();
        System.out.println(student.toString());
        student.changeAge(13);
    }
}
