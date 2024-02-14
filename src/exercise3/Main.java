package exercise3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CustomStack stack = new CustomStack();
        String line = sc.nextLine();
        while(!line.equals("END")){
            String[] tokens = line.trim().replaceAll(",","").split("\\s+");//repalceAll menja sve zareze sa praznim stringomvima
            switch (tokens[0]){ //prvi clan niza tj. naredba push ili pop
                case "Push":
                    for (int i = 1; i < tokens.length; i++) { //BITNO: krece se od drugog elementa niza jer je prvi naziv komande
                        stack.push(Integer.parseInt(tokens[i])); //parsiramo u int i dodajemo element u stack
                    }
                    break;
                case "Pop":
                    stack.pop(); //sklanjamo iz stacka
                    break;
                    
            }
            line = sc.nextLine();
        }
        stack.forEachModified(System.out::println); //stampamo dva puta jer je tako zahtev
        stack.forEachModified(System.out::println);
    }
}
