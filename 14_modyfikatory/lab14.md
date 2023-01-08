# Laboratorium 14

Napisz program symulujący działanie schroniska dla zwierząt, w tym celu:
 * stwórz abstrakcyjną klasę Animal z dwoma abstrakcyjnymi metodami getType() oraz getInstanceNumber()
 * zadaniem metody getType() będzie zwrócenie typu zwierzęcia jako tekst np. pies, kot itp.
 * zadaniem metody getInstanceNumber() będzie zwrócenie liczby utworzonych obiektów danej klasy (podklasy Animal)
 * stwórz 3 klasy reprezentujące zwierzęta, klasy powinny rozszerzać klasę Animal i implementować odpowiednie metody
 * w tworzonych klasach zastosuj zasady hermetyzacji
 * w klasie AnimalShelter przechowuj zwierzęta w tablicy 100-elementowej imitującej kojce (jeden kojec mieści jedno zwierzę)
 * zwierzęta umieszczaj w kojcach losowo
 * wyświetl informacje jakie zwierzę zostało umieszczone w kojcu nr 33 oraz ile tego rodzaju zwierząt przebywa obecnie w schronisku
 
 Podpowiedź:
 - do wylosowania liczby całkowitej z przedziału od 0 do 2 użyj konstrukcji:
 ```java
Random random = new Random();
int i = random.nextInt(3);
```

