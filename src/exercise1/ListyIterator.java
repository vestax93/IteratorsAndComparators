package exercise1;

import java.util.Arrays;
import java.util.List;

public class ListyIterator<T> {
    private List<T> elements;
    private int currentIndex; //trenutni interni pokazivac dokle se stiglo sa iteracijama kroz listu

    public ListyIterator(T... elements) { //... oznacavaju unapred nepoznat broj argumenata (0,1,2,3...)
        this.elements = Arrays.asList(elements); //pretvaramo niz T[] u List<T>
        this.currentIndex = 0; //pocetni index je 0
    }
    public boolean hasNext(){ //vraca true ako postoji sledeci element u list tj. nismo jos dosli do kraja
        if(currentIndex < elements.size() - 1){ //proveravamo da li je trenutni index na nekoj poziciji (od prve) do pretposlednje
            // tj. trenutni index < poslednjePozicije (elements.size() - 1)
            return true; //ako posotji sledeci element
        }
        return false; //ako ne postoji sledeci element

        //return currentIndex < elements.size() - 1; drugaciji zapis uslova iznad, validna su oba
    }

    public boolean move(){
        if(hasNext()){
            this.currentIndex++;
            return true;
        }
        return false;
    }

    public void print(){
        if(this.elements.size() == 0){
            throw new IllegalStateException("Invalid Operation!");
        }
        System.out.println(this.elements.get(currentIndex));
    }
}
