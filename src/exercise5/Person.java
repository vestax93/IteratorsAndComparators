package exercise5;

public class Person implements Comparable<Person>{
    String name;
    int age;
    String town;

    public Person(String name, int age, String town) {
        this.name = name;
        this.age = age;
        this.town = town;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    @Override
    public int compareTo(Person person) {
        int n = this.name.compareTo(person.getName()); //compareTo vraca 0 ako su objekti koji se pored siti, a - ili + ako su razliciti
        if(n == 0){
            n = Integer.compare(this.age,person.getAge()); //integer ima ugradjenu metode compare i prima dva parametra, vraca 0 ako su isti
            if(n == 0){
                n = this.town.compareTo(person.getTown()); //poredjenje gradova i vraca 0 ako su isti
            }
        }
        return n;
    }
}
