1. Korzystając z narzędzi dostępnych w JDK napisz, skompiluj i uruchom pierwszy program w języku Java.

```java
public class HelloWorld {
        public static void main(String[] args) {
                System.out.println("Hello World!");
        }
}
``` 
* Uruchom w Windows **Wiersz polecenia** (przycisk Start, cmd).
* Sprawdź wersje oraz dostępność zainstalowanych komponentów JDK.

```bash
java -version
javac -version
```

* Na dysku Z: utwórz za pomocą notatnika plik _HelloWorld.java_ i wpisz w nim program.
* Korzystając z kompilatora javac, skompiluj program do bajtkodu otrzymując plik _HelloWorld.java_.

```bash
javac HelloWorld.java
```

* Poleceniem _java_ uruchom wirtualną maszynę i wykonaj skompilowany wcześniej program.
**TIP:** Gdy uruchamiasz program podaj tylko nazwę pliku/klasy, nie wpisuj rozszerzenia.

```bash
java HelloWorld
```

2. Korzystając z IDE IntelliJ IDEA "wyklikaj" i uruchom program _HelloWorld_ z punktu 1.
* Otwórz środowisko programistyczne **IntelliJ IDEA** (przycisk Start, idea).
* Na ekranie powitalnym kliknij opcję **Create New Project**.
* Zaznacz typ projektu **Java** i klikajac przycisk **New** wskaż ścieżkę do odpowiedniego SDK *(C:\Program Files\Java\jdk1.8.0_144)*.
* Nie wybieraj dodatkowych bibliotek ani framework'ów, kliknij przycisk **Next**.
* Zaznacz opcję tworzenia projektu z szablonu **Create project from template**, szablon - **Java HelloWorld**, kliknij **Next**.
* Nazwij projekt *HelloWorld* i kliknij **Finish**.
* Skompiluj i uruchom program korzystając z przycisku **RUN** *(Shift+F10)*.
* Przeanalizuj automatycznie wygenerowany kod źródłowy, wskaż różnice w stosunku do programu z punktu 1.
