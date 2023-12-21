
﻿<div align="center">
# Ćwiczenia z przedmiotu "Podstawy programowania w javie (PPJ)" na PJATK

![pobrane (1)](https://github.com/oskarklkt/PJATK_PPJ/assets/117487714/e61ab832-e052-4b93-9d11-96339d6723ec)
</div>


--- 

### Ćwiczenie 03.01
Przygotuj plik zawierający publiczną klasę Program3, który wyświetli na ekranie przykładowe literały zawierające sufiksy.

### Ćwiczenie 03.02
Utwór program, który wyświetli na ekranie dwa literały:
1000000
1_000_000
Czy przedstawiona w literałach wartość różni się? Odpowiedź zawrzyj w komentarzu.

### Ćwiczenie 03.03
Dane są literały:
.2, 16.3, 178, 4L, 567d, 15.87F, false, "PPJ", 'A', 0b1_0101, 0b10101, 0120, 0x2F, '\u0041', 0.031415e2.
Zadeklaruj zmienne odpowiednich typów, zainicjalizowane podanymi literałami.

### Ćwiczenie 03.04
Utwórz program sprawdzający, jak zachowują się operacje matematyczne (+,-,*,/,%) gdy operują na parach literałów:
liczb całkowitych
liczb rzeczywistych
znaków
Nie działające operacje wykomentuj.

### Ćwiczenie 03.05
Przyjmij że Twój numer studenta reprezentuje liczbę w systemie heksadecymalnym.
Przekształć ją na postać binarną. Używając literału w postaci binarnej oraz symbolu _ oddziel jej części w taki sposób by poszczególne cyfry z zapisu heksadecymalnego były wyszczególnione.

---

### Ćwiczenie 04.01
Utwórz klasę Person zawierającą publiczne pola:
String name
String surname
int birthyear
Utwórz obiekt klasy Person i przechowaj go w zmiennej person.
Wykorzystaj możliwość dostępu do publicznych pól tej klasy i przypisz im literały lub wartości opisujące tworzoną osobę.

### Ćwiczenie 04.02
Utwórz klasę Fruit z polami String name i double weight. Nazwa owocu zostanie dostarczona do konstruktora klasy, natomiast waga zostanie zainicjowana losową wartością z przedziału 0.5- 0.8.

### Ćwiczenie 04.03
Utwórz klasę Kwadrat z polem bok. Zainicjalizuj pole w konstruktorze. Dodaj metodę show wyświetlającą:
pole powierzchni tego kwadratu,
objętość sześcianu zbudowanego na podstawie tego kwadratu
Przedstaw wykorzystanie tej klasy na przykładzie.

-------

### Ćwiczenie 05.01
Utwórz klasę Point2D zawierającą pola opisane jako x i y, oraz:
  1.  rezultatową metodę get dostarczającą wartość typu String prezentującą wartości x, y oraz 1  każda w nowej linii np:
  
  x 

  y

  1
  
  2. bezrezultatową metodę set ustalającą współrzędne x, y na podstawie dostarczonych argumentów

### Ćwiczenie 05.02
Utwórz klasę Square z prywatnym polem side. Zainicjuj pole w konstruktorze. Dodaj metodę show i toString wyświetlające:

pole powierzchni tego kwadratu,
objętość sześcianu zbudowanego na podstawie tego kwadratu.
Przedstaw wykorzystanie tej klasy na przykładzie, tworząc instancję klasy i wywołując metodę show() i toString().

W programie nie należy wykorzystywać klas niezdefiniowanych przez autora, co oznacza, że wszystkie klasy używane w programie powinny być zdefiniowane przez Państwa.

### Ćwiczenie 05.03
Przygotuj klasę o nazwie ‘Person’, która definiuje pola:
‘name’ typu String,
‘birthYear’ typu int.

Klasa powinna również definiować:
konstruktor dwuargumentowy, który inicjuje pola klasy;
konstruktor jednoargumentowy, który przyjmuje jako parametr ‘name’ typu String, a jako pole ‘birthYear’ przypisuje wartość 1990;
metodę ‘getName()’, która zwraca wartość pola ‘name’;
metodę ‘getAge()’, która zwraca wiek osoby;
metodę 'equals(...)', która sprawdzi czy obiekty wskazywane przez referencje reprezentują identyczne dane.
Przedstaw przykład użycia wszystkich metod w kodzie demonstracyjnym.

---

### Ćwiczenie 06.01
Utwórz klasę Rectangle i dziedziczącą po niej klasę Cuboid.  Zadbaj aby:

klasy zawierały wszystkie niezbędne pola;
wszystkie pola były poprzedzone specyfikatorem private;
konstruktory inicjowały wartości pól zarówno na podstawie dostarczonych wartości liczbowych jak i obiektu klasy bazowej;
wszystkie klasy figur posiadały metodę wyświetlającą pole powierzchni;
wszystkie klasy brył posiadały metody wyświetlające pole powierzchni oraz objętość bryły;
Zadanie dostarcz w pojedynczym pliku *.java nie wykorzystując zagnieżdżania klas.

### Ćwiczenie 06.02
Utwórz klasę Person z prywatnym polem String name i dziedziczącą po niej klasę Welder z polam lengthOfService. Utwórz w obu klasach metodę String show(), która wykorzystując słowo kluczowe super zwróci ciąg znaków zawierający wszystkie informacje zawarte w obiekcie tej klasy.

### Ćwiczenie 06.03
Utwórz klasę Vehicle z polem String color i dziedziczącą po niej klasę WheeledVechicle z prywatnym polem numberOfAxels. Następnie utwórz dziedziczącą po klasie WheeledVechicle klasę Truck z polem mass, oraz bezparametrową metodą startEngine, która sprawdzi jaki jest nacisk pojazdu na oś. Jeżeli nacisk przekracza 11 ton wyświetlony zostanie komunikat "Jazda niebezpieczna, odmowa uruchomienia silnika".

---

### Ćwiczenie 07.01
Dane są następujące zbiory:

<img width="212" alt="pobrane" src="https://github.com/oskarklkt/PJATK_PPJ/assets/117487714/57cbb6ae-b057-46a6-9d30-50282aefd3e1">

Napisz program weryfikujący, czy zmienna int wrt należy do części wspólnej wszystkich trzech zbiorów.


Zadbaj aby klasyfikacja do części wspólnej nie była składana z cząstkowych przynależności do zbiorów, a była jednoznacznie klasyfikowana do części wspólnej zbiorów.

### Ćwiczenie 07.02
Przyjmując że a i b są zmiennymi typu int, zapisz poniższe wyrażenie w możliwie prostej postaci:

(!(a < b) && !(a > b))

### Ćwiczenie 07.03
Utwórz program wczytujący z klawiatury pojedynczy znak, a następnie wypisujący na ekranie informację czy znak ten jest spółgłoską czy samogłoską.

---

### Ćwiczenie 08.01
Utwórz program wczytujący z klawiatury liczbę, reprezentującą Twój numer studenta.

Następnie wyświetl sumę wszystkich liczb od 0 do wprowadzonego numeru studenta.

### Ćwiczenie 08.02
Dane są zmienne

int day
int month
int year
które należy zainicjalizować wartościami liczbowymi literałów opisujących bieżącą dzień, miesiąc i rok.

Napisz program liczący ile dni upłynęło od rozpoczęcia bierzącego roku do daty opisanej wartościami zmiennych. 

### Ćwiczenie 08.03
Napisz program inicjalizujący zmienną typu long wartością naturalną dodatnią oraz wyprowadzający na konsolę największy dzielnik, będący liczbą pierwszą, podanej wartości.

---

### Ćwiczenie 09.01
Każdy prostokąt o bokach równoległych do osi układu współrzędnych na płaszczyźnie jest określony przez 2 punkty: lewy górny i prawy dolny, z których każdy jest reprezentowany przez parę współrzędnych/liczb całkowitych.
Napisz program pobierający od użytkownika parametry dwóch prostokątów A, B (tj. 8 liczb całkowitych). Użyj ich do inicjalizacji odpowiednich zmiennych. Wyświetl na konsoli wartość pola powierzchni części wspólnej A i B.

### Ćwiczenie 09.02
Utwórz program który pozwoli wprowadzić z klawiatury wartość size i wyświetli na ekranie poniższy znak o rozmiarze (2*size+1) na (2*size+1):

![image](https://github.com/oskarklkt/PJATK_PPJ/assets/117487714/a0713a9c-27ea-4cb5-9c98-1f3f2542c829)

Przedstaw rozwiązanie nie używające tablic.

### Ćwiczenie 09.03
Utwórz program odczytujący wprowadzoną z klawiatury wartość rzeczywistą wyrażającą kwotę w PLN, a następnie wyświetlający na ekranie ilość i rodzaj bilonu konieczny do wydania tej kwoty. Np. dla wartości 1.75 zl otrzymamy:

1 * 1 zl

1 * 50 gr

1 * 20 gr

1 * 5 gr

---

### Ćwiczenie 10.01
Zadeklaruj tablicę zmiennych typu char i wypełnij ją trzema dowolnymi znakami. Następnie używając pętli przeanalizuj tablicę i wskaż indeks elementu o najmniejszej wartości.

### Ćwiczenie 10.02
Przygotuj i wypełnij wartościami dwie tablice liczb opisujących współrzędne x i y pewnego zbioru punktów na płaszczyźnie. 
Następnie wylicz najmniejszy prostokąt zawierający wszystkie punkty i wyświetl na ekranie współrzędne środka, wysokość i szerokość.

### Ćwiczenie 10.03
Dana jest n-elementowa tablica (posortowana niemalejąco) liczb całkowitych, gdzie n >= 2. 
Napisz program zliczający ile jest różnych wartości w podanej tablicy.
Przykład: w tablicy {1, 1, 2, 3, 3} występują trzy różne wartości 1, 2, 3.

---

### Ćwiczenie 11.01
Dana jest tablica:

    int[][] tab = {

    	{1, 0, 0, 0, 0},

    	{0, 1, 0, 0},

    	{0, 0, 1}

    };

Napisz program, który zamieni tab na tablicę jednowymiarową, zawierającą wszystkie elementy zawarte wewnątrz tablicy dwuwymiarowej.

### Ćwiczenie 11.02
Przygotuj prostokątną tablicę (o losowych wymiarach naturalnych dodatnich) zmiennych typu int i wypełnij ją losowymi wartościami z przedziału [0,10). Utwórz i wyświetl nową tablicę powstającą z tablicy wejściowej poprzez usunięcie duplikatów z każdego wiersza (pozostawiając tylko jedno wystąpienie każdej wartości), zachowując jednocześnie kolejność wystąpień.

### Ćwiczenie 11.03
Zadeklaruj zmienną size określającą wielkość obu wymiarów tablicy dwuwymiarowej. Poczym:

wylosuj parę liczb z przedziału -(0.2*size) do (1.2*size) i zapisz je w zmiennych x oraz y, które będą opisywać indeksy w tablicy;
dokonaj sprawdzenia, czy wylosowane indeksy znajdują się we wnętrzu tablicy tj. nie wychodzą poza jej obszar. Jeżeli okaże się że współrzędne wychodzą poza obszar tablicy wyświetl komunikat coordinates outside array range(x,y);
Powyższe operacje powtarzaj aż uzyskasz 20 przypadków niepoprawnych współrzędnych.

---








