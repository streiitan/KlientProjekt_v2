package com.example.klientprojekt_v2;


/**
 * Ett spelbräde bör ha koordinaterna 4x8. Även om de spelas på 8x8 men eftersom de endast är de
 * svarta rutorna som spelas på kan man minska till 4x8
 */
public class CellNode {

    private Piece piece = null;

    public CellNode() {

    }

    public boolean hasPiece() {
        if (piece == null) {
            return false;
        }
        return true;
    }

    public void setPiece(Piece piece) {
        this.piece = piece;
    }

    public void removePiece() {
        this.piece = null;
    }

    public Color getPieceColor() {
        return piece.COLOR;
    }

    public boolean pieceIsKing() {
        return piece.isKing();
    }

}
