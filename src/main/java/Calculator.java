public class Calculator {


    //argumentele de tip "vararg" (...) trebuie sa fie declarate ca si ultim parametru
    public int adunare(int... numere) {

        int rezultat = 0;

        for (int i : numere) {
            rezultat += i;
        }

        return rezultat;
    }

    public int inmultire(int... numere) {
        int rezultat = 1;

        for (int i : numere) {
            rezultat *= i;
        }

        return rezultat;
    }

    public int scadere(int... numere) {
        int rezultat = numere[0];

        for (int i = 1; i < numere.length; i++) {
            rezultat -= numere[i];
        }

        return rezultat;
    }

    public double impartire(double... numere) {
        double rezultat = numere[0];

        for (int i = 1; i < numere.length; i++) {
            rezultat /= numere[i];
        }

        return rezultat;
    }


}
