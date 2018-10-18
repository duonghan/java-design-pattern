package interface_abstrasct.interface_demo;

public class Student {
    private String name;
    private int point;
    private University university;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPoint() {
        return point;
    }

    private void setPoint(int point) {
        this.point = point;
    }

    public University getUniversity() {
        return university;
    }

    private void setUniversity(University university) {
        this.university = university;
    }

    private void displayName(){
        System.out.println(name + " gets " + university.calculatePoint(point));
    }

    public static void main(String[] args) {
        Student student = new Student();

        student.setName("bob");
        student.setPoint(55);
        student.setUniversity(new UniversityB());

        student.displayName();
    }
}
