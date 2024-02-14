package exercise7;

import java.util.Scanner;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TreeSet<Person> nameSet = new TreeSet<>(new NameComparator()); //konstruktor TreeSet-a kao parametar moye da primi komparator po kome ce raditi poredjenje a samim tim i sortiranje
        TreeSet<Person> ageSet = new TreeSet<>(new AgeComparator());
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
            String[] tokens = sc.nextLine().split("\\s+");
            Person p = new Person(tokens[0], Integer.parseInt(tokens[1])); //prvi clan niza je uvek ime, a drugi uzrast
            nameSet.add(p); //ubacujemo isti element u nameSet i ageSet, ali ce se oni drugacije sortirati jer ovi setovi imaju drugacije komparatore
            ageSet.add(p);
        }
        for(Person p : nameSet){ //stampamo redosled nameSet-a
            System.out.println(p);
        }
        for(Person p : ageSet){ //stampamo redosled ageSet-a
            System.out.println(p);
        }
    }
}
