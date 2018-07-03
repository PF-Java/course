public class CourseTest {
    public static void main(String[] args) {
        Course course = new Course("Java");
        displayCourse(course);

        String trang = "Trang";
        course.addStudent(trang);
        displayCourse(course);

        String loan = "Loan";
        course.addStudent(loan);
        displayCourse(course);

        String anh = "Anh";
        course.addStudent(anh);
        displayCourse(course);
    }

    public static void displayCourse(Course course) {
        System.out.println("Course \"" + course.getName() + "\" has " + course.getStudentsCount() + " student(s): {");
        String[] students = course.getStudents();
        for (int i = 0; i < course.getStudentsCount(); i++) {
            System.out.println("\t\"" + students[i] + "\",");
        }
        System.out.println("}");
    }
}
