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

    public String getInitials() {
        return this.initials;
    }

    public Byte getHandicap() {
        return this.handicap;
    }

    public Short getPoints() {
        return this.points;
    }

    @Override
    public String toString(){
        return (initials + " ---> H'cap: " + handicap + "   Strokes: " + score +"   Stableford points: " + points);
    }
}
