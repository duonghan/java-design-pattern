package interface_abstrasct.interface_demo;

public class UniversityB implements University {
    @Override
    public String calculatePoint(int point) {
        return new Integer(Math.round(point / (float)10.0)).toString();
    }
}
