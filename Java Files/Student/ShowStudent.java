package student;

public class ShowStudent {

    public static void main(String args[]) {
        Student Student = new Student();

        //student info
        Student.setIDnumber("18-7022-183");
        Student.setHours(5);
        Student.setPoints(18);

        //for Output
        Student.showIDnumber();
        Student.showPoints();
        Student.showHours();
        Student.ShowAve();

    }
}