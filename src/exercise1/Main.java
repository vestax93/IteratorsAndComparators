package exercise1;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        ListyIterator<String> listyIterator = null;
        while(!line.equals("END")){
            String[] tokens = line.split("\\s+");
            String command = tokens[0]; //prvo je uvek komanda Create, HasNext, Move ili Print
            switch (command){
                //Create Peter Steven Anne Samantha
                case "Create":
                    if(tokens.length > 1){
                        listyIterator = new ListyIterator<>(Arrays.copyOfRange(tokens,1,tokens.length)); //uzimamo samo deo niza tokens od drugog clana (index = 1) do kraja
                    } else {
                        listyIterator = new ListyIterator<>(); //ako nisu prosledjeni clanovi pravimo praznu
                    }
                    break;
                case "Move":
                    System.out.println(listyIterator.move());
                    break;
                case "HasNext":
                    System.out.println(listyIterator.hasNext());
                    break;
                case "Print":
                    try{
                        listyIterator.print();
                    } catch (IllegalStateException e){
                        System.out.println(e.getMessage());
                    }
                    break;
            }
            line = sc.nextLine();
        }
    }
}
