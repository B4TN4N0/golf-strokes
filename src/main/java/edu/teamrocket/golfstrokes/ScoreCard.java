package edu.teamrocket.golfstrokes;

import java.util.Optional;
import java.util.ArrayList;
import java.util.List;

public class ScoreCard {

    private Optional<Player> playerA = Optional.empty();
    private Optional<Player> playerB = Optional.empty();
    private Optional<Player> playerC = Optional.empty();
    private Optional<Player> playerD = Optional.empty();

    private final List<Hole> holes = new ArrayList<Hole>();

    private Course playersCourse;

    public ScoreCard() {};


}
