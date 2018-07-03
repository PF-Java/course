public class CourseTest {
    public static void main(String[] args) {
        Course course = new Course("Java");
        String trang = "trang";
        course.addStudent(trang);
        System.out.println(course.getName());
        System.out.println(course.getStudents());
        System.out.println(course.getStudentsCount());
    }
}
