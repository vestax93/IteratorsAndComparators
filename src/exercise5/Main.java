package exercise5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        List<Person> list = new ArrayList<>();
        while(!line.equals("END")){
            String[] tokens = line.split("\\s+");
            String name = tokens[0];
            int age = Integer.parseInt(tokens[1]);
            String town = tokens[2];
            Person p = new Person(name,age,town);
            list.add(p);
            line = sc.nextLine();
        }
        int n = Integer.parseInt(sc.nextLine()) - 1; //pozicija je data u ljudskom brojanju i zato smanjujemo za 1 da bismo imali indeksiranje od 0
        matchAndPrint(list,n);//trazi osobu i stampa broj duplikata, broj razlicitih i ukupan broj
    }

    private static void matchAndPrint(List<Person> list, int i) {
        Person search = list.get(i); //uzeli osobu sa zadate pozicije
        int[] match = {0,0,list.size()}; //•	“{number of equal people,number of not equal people,total number of people}”
        for(Person p : list){ //prolazimo kroz listu osoba
            if(search.compareTo(p) == 0){ //ako se poklapaju osobe
                match[0]++; //povecavamo brojac na prvom mestu (broj ljudi koji se poklapaju)
            } else {
                match[1]++; //povecavamo brojac na drugom mestu (broj ljudi koji se ne poklapaju)
            }
        }
        //match[0] broj ljudi koji se poklapaju
        if(match[0] == 1){ //match[0] = 1 jer se ta osoba koja je zadata sigurno poklapa sa samom sobom i to je sve
            System.out.println("No matches");
        } else {
            System.out.println(match[0] + " " + match[1] + " " + match[2]); //stampamo number of equal people,number of not equal people,total number of people
        }
    }
}
