package exercise7;

import java.util.Comparator;

public class NameComparator implements Comparator<Person> {

    @Override
    public int compare(Person o1, Person o2) {
        int result = Integer.compare(o1.getName().length(),o2.getName().length()); //poredimo duzinu imena izmedju dve osobe
        if(result == 0){ //ako su im imena iste duzine
            result = Character.compare(o1.getName().toLowerCase().charAt(0),o2.getName().toLowerCase().charAt(0)); //poredimo prvo slovo imena
        }
        return result;
    }
}
