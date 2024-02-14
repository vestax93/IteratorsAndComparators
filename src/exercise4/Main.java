package exercise4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();

        while(!line.equals("END")){
            Lake lake = new Lake(line);
            lake.jump();
            line = sc.nextLine();
        }
    }
}
