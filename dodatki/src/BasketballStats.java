/*
Analiza Statystyk Zawodników w Lidze Koszykówki

Napisz program w Javie, który pobierze dane statystyczne zawodników z pliku CSV, a następnie przeprowadzi analizę tych danych, wykorzystując różne typy kolekcji. Program powinien:

    Wczytać dane z pliku CSV.
    Przechować dane zawodników w odpowiednich strukturach danych.
    Wykonać kilka operacji analitycznych, takich jak:
        Znalezienie zawodnika o najwyższej średniej punktów na mecz.
        Policz liczbę zawodników w każdym z zespołów.
        Znajdź zespół z najwyższą sumą punktów.

 */

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BasketballStats {
    public static void main(String[] args) {
        String filePath = "src/collections/players.csv";

        List players = loadPlayersFromCSV(filePath);
        Player bestPlayer = findHighestAveragePointsPlayer(players);
        Map<String, Integer> teamPlayerCount = countPlayersByTeam(players);
        Map bestTeamAndPoints = findBestTeam(players);

        System.out.println("Zawodnik z najwyższą średnią punktów na mecz: " + bestPlayer);
        System.out.println("Liczba zawodników w każdej z drużyn: " + teamPlayerCount);
        System.out.println("Drużyna z największą sumaryczną liczbą punktów: " + bestTeamAndPoints);
    }

    private static List<Player> loadPlayersFromCSV(String filePath) {
        List<Player> players = new ArrayList<>();
        try {
            List<String> lines = Files.readAllLines(Paths.get(filePath));

            for (int i = 1; i < lines.size(); i++) {
                String line = lines.get(i);
                String[] fields = line.split(",");
                String name = fields[0];
                String team = fields[1];
                int games = Integer.parseInt(fields[2]);
                int points = Integer.parseInt(fields[3]);
                Player player = new Player(name, team, games, points);
                players.add(player);
            }
        } catch (IOException e) {
            System.out.println("Błąd podczas wczytywania pliku csv: " + e.getMessage());
        }
        return players;
    }

    private static Player findHighestAveragePointsPlayer(List<Player> players) {
        Player highestAveragePointsPlayer = players.get(0);
        for (Player player : players) {
            if (player.getPoints() / player.getGames() > highestAveragePointsPlayer.getPoints() / highestAveragePointsPlayer.getGames()) {
                highestAveragePointsPlayer = player;
            }
        }
        return highestAveragePointsPlayer;
    }

    private static Map<String, Integer> countPlayersByTeam(List<Player> players) {
        Map<String, Integer> teamPlayerCount = new HashMap<>();
        for (Player player : players) {
            teamPlayerCount.put(player.getTeam(), teamPlayerCount.getOrDefault(player.getTeam(), 0) + 1);
        }
        return teamPlayerCount;
    }

    private static Map<String, Integer> findBestTeam(List<Player> players) {
        Map<String, Integer> teamPoints = new HashMap<>();
        for (Player player : players) {
            teamPoints.put(player.getTeam(), teamPoints.getOrDefault(player.getTeam(), 0) + player.getPoints());
        }

        String bestTeam = null;
        int highestPoints = 0;
        for (Map.Entry<String, Integer> entry : teamPoints.entrySet()) {
            if (entry.getValue() > highestPoints) {
                highestPoints = entry.getValue();
                bestTeam = entry.getKey();
            }
        }
        Map<String, Integer> bestTeamAndPoints = new HashMap<>();
        bestTeamAndPoints.put(bestTeam, highestPoints);
        return bestTeamAndPoints;
    }

}

