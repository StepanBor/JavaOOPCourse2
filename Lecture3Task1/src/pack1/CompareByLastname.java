package pack1;

import java.util.Comparator;

public class CompareByLastname implements Comparator<Student> {
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


        return o1.getLastname().compareToIgnoreCase(o2.getLastname());
    }
}
