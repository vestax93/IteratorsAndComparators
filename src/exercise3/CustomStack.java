package exercise3;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.function.Consumer;

public class CustomStack implements Iterable<Integer> {
    private final Deque<Integer> stack;

    public CustomStack() {
        this.stack = new ArrayDeque<>();
    }

    public void push(int value){
        this.stack.push(value); //dodavanje u stack
    }

    public void pop(){
        if(iterator().hasNext()){ //proveravamo da li postoji sledeci element u stacku
            stack.pop(); //ako psotoji izbacujemo ga iz stacka
        } else {
            System.out.println("No elements"); //ako ne postoji ispisujemo
        }
    }


    public void forEachModified(Consumer<? super Integer> consumer) {
        for(int value : stack){
            consumer.accept(value);
        }
    }



    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            @Override
            public boolean hasNext() {
                return !stack.isEmpty(); //ako je stack prazan nema vise elemenata sa kojim bismo radili
            }

            @Override
            public Integer next() {
                return stack.peek(); //sledeci element je onaj koji je na vrhu i njega vraca peek ALI ga ne uklanja kao push
            }
        };
    }
}
