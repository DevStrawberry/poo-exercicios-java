package exercicios.animais;

import java.util.LinkedList;
import java.util.List;

class Animal {
    public void andar() {
        System.out.println("Anda como um animal genérico");
    }
}

class Arara extends Animal {
    @Override
    public void andar() {
        System.out.println("Voa como uma arara");
    }
}

class Cobra extends Animal {
    @Override
    public void andar() {
        System.out.println("Rasteja como uma cobra");
    }

    public void morder() {
        System.out.println("Morde como uma cobra");
    }
}

class Urso extends Animal {
    @Override
    public void andar() {
        System.out.println("Caminha como um urso");
    }
}

public class Main {
    static void main() {
        List<Animal> animais = new LinkedList<Animal>();

        // Upcasting
        animais.add(new Arara());
        animais.add(new Cobra());
        animais.add(new Urso());
        animais.add(new Animal());

        for (Animal a: animais) {
            a.andar();
            if (a instanceof Cobra) {
                // Downcasting
                // Cobra c = (Cobra) a;
                // c.morder();
                ((Cobra) a).morder();
            }
        }
    }
}
