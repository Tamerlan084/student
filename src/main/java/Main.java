public class Main {
    public static void main(String[] args) {
        StudentsSAXBuilder saxBuilder = new StudentsSAXBuilder();
        saxBuilder.buildSetStudents("src/main/resources/students.xml");
        System.out.println(saxBuilder.getStudents());
    }
}
