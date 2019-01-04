Na podstawie diagramu oraz poniższych wytycznych utwórz w swojej bazie strukturę forum i wypełnij ją danymi testowymi.

[![](sql2_forum.jpg)](sql2_forum.jpg)

1. Schemat - utwórz w swojej bazie (nazwa bazy to Twój login) schemat o nazwie Forum.
2. Tabele - utwórz w schemacie Forum poniższe tabele:

Nazwa tabeli | Opis 
-------------|-------------------------------------
Topics  | Każdy temat/post utworzony w forum jest przechowywany w tej tabeli. Każdy główny post wątku (zazwyczaj pytanie), ma ustawioną wartość NULL w kolumnie ParentID. Każdy następny post w tym wątku (odpowiedź) ma zapisany w ParentID identyfikator głównego postu. Tylko zarejestrowani i zalogowani użytkownicy mogą tworzyć nowe posty, a więc wystarczy kolumna AuthorID, która jest kluczem obcym do tabeli Users.|
Clues | Działy forum, w których można pisać posty.|
Users | Lista zarejestrowanych użytkowników, którzy mogą pisać posty.
UsersLogins | Data i czas wraz z adresem IP dla każdego logowania na forum. Historia logowań.
UserStats | Data i czas wyświetlenia każdego z postów przez każdego z użytkowników. Na podstawie tej tabeli widać czy użytkownik X otwierał już poszczególne posty i odpowiednio wyróżnić nieprzeczytane (nowe).

3. Klucze obce

Nazwa tabeli | Nazwa kolumny Powiązana  | tabela i kolumna
-------------|--------------------------|------------------
<td rowspan=3>Topics | ParentID | Topics.ID
| AuthorID | Users.ID
| ClueID | Clues.ID
UsersStats | UserID | Users.ID
| TopicID | Topics.ID
UsersLogins | UserID  | Users.ID