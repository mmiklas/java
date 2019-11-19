# Laboratorium 15

 1. Stwórz szkielet programu symulującego działanie różnych odtwarzaczy muzycznych jak Mp3, CD itd, wg wytycznych:
 * konkretne odtwarzacze powinny rozszerzać abstrakcyjną klasę MusicPlayer
 * abstrakcyjna klasa MusicPlayer powinna implementować interfejs Player
 * interfejs Player powienien dostarczać takich funkcji jak odtwarzaj, pauza stop, następny utwór, poprzedni utwór
 * przetestuj działanie odwtwarzaczy (np. symulując działanie przez wyświetlenie odpowiednich komunikatów 'Gra odtwarzacz MP3')
 
 2. Rozbuduj szkielet programu z punktu 1 o zasilenie odtwarzaczy zbiorami piosenek, w tym celu:
 * zaprojektuj hermetyczną klasę Song przechowującą takie informacje jak nazwa artysty, tytuł utworu, nazwa albumu
 * każdy odtwarzacz powinien przechowywać swój zbiór utworów
 * zbiory piosenek powinny być ładowane podczas tworzenia odtwarzaczy
 * użycie akcji odwtarzaj powinno wyświetlać informację o odtwazranym utworze
 * akcje następny, poprzedni powinny odpowiednio zmieniać utwory

