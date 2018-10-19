package composite;

import java.util.ArrayList;

public class Class implements Education{
    // Composite
    ArrayList<Student> list = new ArrayList<>();


    public Class() {
        for (int i=0; i< 20; i++){
            list.add(new Student((float) (i-0.5)/i, (float)(i-0.5)/i));
        }
    }

    @Override
    public float calculatePoint() {
        float sum = 0;
        for (Student s: list ){
            sum += s.calculatePoint();
        }

        return sum/list.size();
    }
}
