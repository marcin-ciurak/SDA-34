package zadaniaInterfejsy.zadanieInterfejsySchematyNr1;

public class OpisySchematyNr1 {
}

/*
Zaprojektuj w postaci schematu (podobnie jak w prezentacji) odpowiednio oznaczając strzałki dziedziczenia i kompozycji, oraz zaimplementuj kod.
Spróbuj zaimplementować klasy z odpowiednimi rozszerzeniami (slowko extends lub obiekty jako pole). W miejscach gdzie występuje kompozycja stwórz chociaż jedno pole odpowiadające tej kompozycji. Np. W Kuchni jest lodówka (więc lodówka będzie polem).
- 2a.:
Pomieszczenie, Kuchnia, Salon, Łazienka, Pokój, Mebel, Fotel, Lodówka, Urządzenie, Kuchenka, Kanapa, Telewizor
- 2b.:
Pojazd, Samochód, Okręt, Koła, Stery, Silnik, Nazwa, Marka, Samolot, Fotel, Prom
- 2c.:
Szkoła podstawowa, Liceum, Politechnika, Uczelnia, Instytucja edukacyjna, Uczeń, Nauczyciel, Człowiek, Klasa
 */

/*
2a.:
Pomieszczenie
extends:     Kuchnia    Pokój   Salon   Lazienka

Urządzenie (abstract)
extends:     Lodówka    Kuchenka    Telewizor

Kuchnia  has: Lodówka, Kuchenka
Salon has:  Telewizor Kanapa Fotel

2b.:
Pojazd (abstract)
extends:    Samochód   Okręt   Samolot Prom

Pojazd   has:  Nazwa,  Marka
Samochód  has: Silnik   Koła
Okręt has: Stery

2c.:
Instytucja edukacyjna (abstract)
extends:   Uczelnia (abstract)

Uczelnia (abstract)
extends:    SzkołaPodstawowa    Liceum  Politechnika

Człowiek
extends:    Uczen Nauczyciel

Instytucja edukacyjna has: Nauczyciel Uczen
Uczelnia   has:  Klasa
 */