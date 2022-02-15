package com.example.klientprojekt_v2;

public class Piece {
    private boolean king;
    private int x;
    private int y;

    public Piece() {
        king = false;
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
