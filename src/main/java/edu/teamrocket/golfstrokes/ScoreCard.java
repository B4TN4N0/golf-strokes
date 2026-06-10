package edu.teamrocket.golfstrokes;

import java.util.Optional;
import java.util.HashMap;
import java.util.Map;


public class ScoreCard {
    // Referencias a los jugadores (son opcionales, por defecto null)
    private String playerA;
    private String playerB;
    private String playerC;
    private String playerD;

    // Referencia al campo (opcional hasta que se asigne)
    private Course playersCourse;

    // Colección de hoyos con su par correspondiente (Hoyo -> Par)
    private final Map<Integer, Integer> holePars = new HashMap<>();

    // Matriz de puntuaciones: Jugador ('A','B','C','D') -> (Hoyo -> Golpes)
    private final Map<Player, Map<Integer, Integer>> playerScores = new HashMap<>();

    public ScoreCard() {
    }

    public void setPlayerA(String playerA){
        this.playerA = playerA;
    }

    public void setPlayerB(String playerB){
        this.playerB = playerB;
    }

    public void setPlayerC(String playerC){
        this.playerC = playerC;
    }

    public void setPlayerD(String playerD){
        this.playerD = playerD;
    }

    public void setCourse(Course course) {
        this.playersCourse = course;
    }

    public Optional<String> getPlayerA() {
        return Optional.ofNullable(this.playerA);
    }

    public Optional<String> getPlayerB() {
        return Optional.ofNullable(this.playerB);
    }

    public Optional<String> getPlayerC() {
        return Optional.ofNullable(this.playerC);
    }

    public Optional<String> getPlayerD() {
        return Optional.ofNullable(this.playerD);
    }

    public Optional<Course> getCourse() {
        return Optional.ofNullable(this.playersCourse);
    }

    public void setScore(char player, int holeNumber, int score) {

    }

    public Optional<Integer> getScore(char player, int holeNumber) {
    }
}
