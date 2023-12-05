# PJATK_PPJ
Ćwiczenia z przedmiotu ppj na pjatk

Poniżej treści zadań:

--- 

# Ćwiczenie 03.01
Przygotuj plik zawierający publiczną klasę Program3, który wyświetli na ekranie przykładowe literały zawierające sufiksy.

# Ćwiczenie 03.02
Utwór program, który wyświetli na ekranie dwa literały:
1000000
1_000_000
Czy przedstawiona w literałach wartość różni się? Odpowiedź zawrzyj w komentarzu.

# Ćwiczenie 03.03
Dane są literały:
.2, 16.3, 178, 4L, 567d, 15.87F, false, "PPJ", 'A', 0b1_0101, 0b10101, 0120, 0x2F, '\u0041', 0.031415e2.
Zadeklaruj zmienne odpowiednich typów, zainicjalizowane podanymi literałami.

# Ćwiczenie 03.04
Utwórz program sprawdzający, jak zachowują się operacje matematyczne (+,-,*,/,%) gdy operują na parach literałów:
liczb całkowitych
liczb rzeczywistych
znaków
Nie działające operacje wykomentuj.

# Ćwiczenie 03.05
Przyjmij że Twój numer studenta reprezentuje liczbę w systemie heksadecymalnym.
Przekształć ją na postać binarną. Używając literału w postaci binarnej oraz symbolu _ oddziel jej części w taki sposób by poszczególne cyfry z zapisu heksadecymalnego były wyszczególnione.

---

# Ćwiczenie 04.01
Utwórz klasę Person zawierającą publiczne pola:
String name
String surname
int birthyear
Utwórz obiekt klasy Person i przechowaj go w zmiennej person.
Wykorzystaj możliwość dostępu do publicznych pól tej klasy i przypisz im literały lub wartości opisujące tworzoną osobę.

# Ćwiczenie 04.02
Utwórz klasę Fruit z polami String name i double weight. Nazwa owocu zostanie dostarczona do konstruktora klasy, natomiast waga zostanie zainicjowana losową wartością z przedziału 0.5- 0.8.

# Ćwiczenie 04.03
Utwórz klasę Kwadrat z polem bok. Zainicjalizuj pole w konstruktorze. Dodaj metodę show wyświetlającą:
pole powierzchni tego kwadratu,
objętość sześcianu zbudowanego na podstawie tego kwadratu
Przedstaw wykorzystanie tej klasy na przykładzie.

--- 

# Ćwiczenie 05.01
Utwórz klasę Point2D zawierającą pola opisane jako x i y, oraz:
- rezultatową metodę get dostarczającą wartość typu String prezentującą wartości x, y oraz 1  każda w nowej linii np:
  x 

  y

  1
- bezrezultatową metodę set ustalającą współrzędne x, y na podstawie dostarczonych argumentów

# Ćwiczenie 05.02
Utwórz klasę Square z prywatnym polem side. Zainicjuj pole w konstruktorze. Dodaj metodę show i toString wyświetlające:

pole powierzchni tego kwadratu,
objętość sześcianu zbudowanego na podstawie tego kwadratu.
Przedstaw wykorzystanie tej klasy na przykładzie, tworząc instancję klasy i wywołując metodę show() i toString().

W programie nie należy wykorzystywać klas niezdefiniowanych przez autora, co oznacza, że wszystkie klasy używane w programie powinny być zdefiniowane przez Państwa.

# Ćwiczenie 05.03
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

# Ćwiczenie 06.01
Utwórz klasę Rectangle i dziedziczącą po niej klasę Cuboid.  Zadbaj aby:

klasy zawierały wszystkie niezbędne pola;
wszystkie pola były poprzedzone specyfikatorem private;
konstruktory inicjowały wartości pól zarówno na podstawie dostarczonych wartości liczbowych jak i obiektu klasy bazowej;
wszystkie klasy figur posiadały metodę wyświetlającą pole powierzchni;
wszystkie klasy brył posiadały metody wyświetlające pole powierzchni oraz objętość bryły;
Zadanie dostarcz w pojedynczym pliku *.java nie wykorzystując zagnieżdżania klas.

# Ćwiczenie 06.02
Utwórz klasę Person z prywatnym polem String name i dziedziczącą po niej klasę Welder z polam lengthOfService. Utwórz w obu klasach metodę String show(), która wykorzystując słowo kluczowe super zwróci ciąg znaków zawierający wszystkie informacje zawarte w obiekcie tej klasy.

# Ćwiczenie 06.03
Utwórz klasę Vehicle z polem String color i dziedziczącą po niej klasę WheeledVechicle z prywatnym polem numberOfAxels. Następnie utwórz dziedziczącą po klasie WheeledVechicle klasę Truck z polem mass, oraz bezparametrową metodą startEngine, która sprawdzi jaki jest nacisk pojazdu na oś. Jeżeli nacisk przekracza 11 ton wyświetlony zostanie komunikat "Jazda niebezpieczna, odmowa uruchomienia silnika".

---








