package WEEK1_DesignPattern.MVC;

public class MVCPatternExample {
    public static void main(String[] args) {
        // Create a model
        Student student = new Student("John Doe", 1, "A");

        // Create a view
        StudentView view = new StudentView();

        // Create a controller
        StudentController controller = new StudentController(student, view);

        // Update the view
        controller.updateView();

        // Update model data
        controller.setStudentName("Jane Doe");
        controller.setStudentId(2);
        controller.setStudentGrade("B");

        // Update the view again
        controller.updateView();
    }
}
