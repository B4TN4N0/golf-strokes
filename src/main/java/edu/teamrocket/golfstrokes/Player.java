package edu.teamrocket.golfstrokes;

class Player extends Object {

    private String initials = "";
    private Byte handicap;
    private Short score = 0;
    private Short points = 0;

    Player(String initials, Byte strokes) {
        this.initials = initials;
        this.handicap = strokes;
    }

    String getInitials() {
        return this.initials;
    }

    Byte getHandicap() {
        return this.handicap;
    }
    
    Short getPoints() {
        return this.points;
    }
}