package com.example.klientprojekt_v2;

public class Piece {
    private boolean king;
    private int x;
    private int y;
    public final Color COLOR;

    public Piece(Color color) {
        king = false;
        this.COLOR = color;
    }

    public boolean isKing() {
        return king;
    }

    public void setKing() {
        king = true;
    }

    public void setCoordinates(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
