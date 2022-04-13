package net.sevecek.turtle;

import net.sevecek.turtle.engine.*;

public class HlavniProgram {

    public void main(String[] args) {
        Turtle zofka;

        zofka = new Turtle();
        nakresliDomecek(zofka);
    }
    private void nakresliDomecek(Turtle zofka){
        zofka.turnRight(180);
        zofka.move(150);
        zofka.turnLeft(90);
        zofka.move(100);
        zofka.turnLeft(90);
        zofka.move(150);
        zofka.turnLeft(90);
        zofka.move(100);
        zofka.turnRight(135);
        zofka.move(70);
        zofka.turnRight(90);
        zofka.move(70);
        zofka.turnLeft(45);
    }
}

