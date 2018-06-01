package pack1;

import java.util.Comparator;

public class CompareByAvarageBall implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {

        if(o1!=null & o2==null) {
            return 1;
        }

        if(o1==null & o2!=null) {
            return -1;
        }

        if(o1==null & o2==null) {
            return 0;
        }

        if(o1.getAveregeBall()>o2.getAveregeBall()) {
            return -1;
        }

        if(o1.getAveregeBall()<o2.getAveregeBall()) {
            return 1;
        }

        return 0;
    }

}
