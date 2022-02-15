package com.example.klientprojekt_v2;

public class Piece {
    private boolean king;

    public Piece() {
        king = false;
    }

    public boolean isKing() {
        return king;
    }

    public void setKing() {
        king = true;
    }
}
