package com.example.klientprojekt_v2;

import androidx.annotation.NonNull;

import java.util.ArrayList;

public class MovingManager {

    private final int NUMBER_OF_CELLS = 32;

    private final int X_MAX = 4;
    private final int Y_MAX = 8;

    private ArrayList<CellNode> cellNodeList;

    /**
     * Sätter upp CellNoder för hela brädet
     * Ska användas vid start
     */
    public void setCellNodes() {
        cellNodeList = new ArrayList<>();
        for (int i = 0; i < NUMBER_OF_CELLS; i++) {
            CellNode cellNode = new CellNode();
            cellNodeList.add(cellNode);
        }
    }

    /**
     * Sätter upp spelpjäserna vid start
     */
    public void setUpPieces() {
        for (int i = 0; i < 12; i++) {
            CellNode cell = cellNodeList.get(i);
            cell.setPiece(new Piece(Color.RED));
        }

        for (int i = 20; i < NUMBER_OF_CELLS; i++) {
            CellNode cell = cellNodeList.get(i);
            cell.setPiece(new Piece(Color.BLACK));
        }
    }

    /**
     * Hämtar cellen genom en beräkning av vilken plats i arrayListen den ligger på
     * När knappen trycks skickas x- och y-värdet in
     * @param x-koordinaten
     * @param y-koordinaten
     */
    public void cellMarked(int x, int y) {
        int markedCell = y * X_MAX + x;
        CellNode cell = cellNodeList.get(markedCell);
        if (cell.hasPiece()) {
            if (cell.getPieceColor() == Color.RED) {
                if (y % 2 == 0 ) {
                    CellNode rightCell = cellNodeList.get(markedCell + X_MAX);
                    if (markedCell % 4 != 0) {
                        CellNode leftCell = cellNodeList.get(markedCell + X_MAX -1);
                    }
                } else {
                    CellNode leftCell = cellNodeList.get(markedCell -X_MAX);
                    if (markedCell % 4 != 3) {
                        CellNode rightCell = cellNodeList.get(markedCell + X_MAX +1);
                    }
                }
                if (cell.pieceIsKing()) {
                    //TODO lägg till bakåt
                }
            } else {
                if (y % 2 == 0) {
                    CellNode rightCell = cellNodeList.get(markedCell - X_MAX);
                    if (markedCell % 4 != 0) {
                        CellNode leftCell = cellNodeList.get(markedCell - X_MAX -1);
                    }
                } else {

                }
            };
        }
    }

    public void cellMarked(int i, CellNode cell) {
        int markedCell = i;

    }
}
