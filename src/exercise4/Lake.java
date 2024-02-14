package exercise4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Lake implements  Iterable<Integer>{
    List<Integer> list;

    public Lake() {
        this.list = new ArrayList<>();
    }

    public Lake(String input){
        list = new ArrayList<>(Arrays.stream(input.split("\\s*,\\s+")) // \\s* 0 ili vise razmaka
                .map(Integer::parseInt).collect(Collectors.toList()));//mapiranje iz string u int i ubacivanje u listu
    }

    public void jump(){ //zaba prvo skace po elementima sa parnim brojevima INDEKSA pa onda po elementima sa neparnim brojevima INDEKSA
        List<Integer> result = new ArrayList<>();
        IntStream.range(0,list.size()).filter(i -> i % 2 == 0).forEach(i -> result.add(list.get(i)));
        IntStream.range(0,list.size()).filter(i -> i % 2 != 0).forEach(i -> result.add(list.get(i)));
        System.out.println(result.toString().replaceAll("[\\[\\]]","")); //bez replace on vraca listu u uglastim zagradama a to nam nije po uputstvu


    }


    @Override
    public Iterator<Integer> iterator() {
        return null;
    }

    @Override
    public void forEach(Consumer<? super Integer> consumer) {
        for(int value : list){
            consumer.accept(value);
        }
    }
}
