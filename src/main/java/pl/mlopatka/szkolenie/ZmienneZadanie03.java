package pl.mlopatka.szkolenie;

public class ZmienneZadanie03 {

    private static final int NAJWYZSZA_OCENA = 6;

    public static void main(String[] args) {
        System.out.println("***Zadanie 3***");
        int ocenaTytusa = 3;
        int ocenaRomka = 5;
        int ocenaAtomka = NAJWYZSZA_OCENA;

        wypiszOceny(ocenaTytusa, ocenaRomka, ocenaAtomka);

        ocenaTytusa--;
        ocenaRomka = ocenaAtomka;
        ocenaAtomka = 4;

        wypiszOceny(ocenaTytusa, ocenaRomka, ocenaAtomka);

        ocenaTytusa = ocenaAtomka--;
        ocenaRomka = --ocenaAtomka;
        ocenaAtomka = ocenaTytusa - ocenaRomka;

        wypiszOceny(ocenaTytusa, ocenaRomka, ocenaAtomka);

        ocenaTytusa = ocenaAtomka + 1;
        ocenaRomka = ocenaAtomka + 1;
        ocenaAtomka = ocenaAtomka + 1;

        wypiszOceny(ocenaTytusa, ocenaRomka, ocenaAtomka);
    }

    private static void wypiszOceny(int ocenaTytusa, int ocenaRomka, int ocenaAtomka) {
        System.out.println("Ocena Tytusa: " + ocenaTytusa);
        System.out.println("Ocena Romka: " + ocenaRomka);
        System.out.println("Ocena Atomka: " + ocenaAtomka);
    }
}
