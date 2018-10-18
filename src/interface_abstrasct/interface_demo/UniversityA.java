package interface_abstrasct.interface_demo;

public class UniversityA implements University{
    @Override
    public String calculatePoint(int point) {
        if(point > 85){
            return "A";
        }else if(point > 70){
            return "B";
        } else if(point > 55){
            return "C";
        } else {
            return "D";
        }
    }
}
