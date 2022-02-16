package com.example.klientprojekt_v2;

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
        CellNode leftCell = null;
        CellNode rightCell = null;
        if (cell.hasPiece()) {
            if (cell.getPieceColor() == Color.RED) {
                downCalc(cell, markedCell);
            } else {
                upCalc(cell, markedCell);
            }
        }
    }

    private void downCalc(CellNode current, int markedCell) {
        CellNode rightCell = null;
        CellNode leftCell = null;

        if ((markedCell % X_MAX) % 2 == 0 ) {
            rightCell = cellNodeList.get(markedCell + X_MAX);
            if (markedCell % X_MAX != 0) {
                leftCell = cellNodeList.get(markedCell + X_MAX -1);
            }
        } else {
            leftCell = cellNodeList.get(markedCell -X_MAX);
            if (markedCell % X_MAX != 3) {
                rightCell = cellNodeList.get(markedCell + X_MAX +1);
            }
        }

        if (current.pieceIsKing()) {
            upCalc(current, markedCell);
        }


    }

    public void upCalc(CellNode current, int markedCell) {
        CellNode rightCell = null;
        CellNode leftCell = null;
        if ((markedCell % X_MAX) % 2 == 0) {
            rightCell = cellNodeList.get(markedCell - X_MAX);
            if (markedCell % X_MAX != 0) {
                leftCell = cellNodeList.get(markedCell - X_MAX -1);
            }
        } else {
            leftCell = cellNodeList.get(markedCell - X_MAX);
            if(markedCell % X_MAX != 3) {
                rightCell = cellNodeList.get(markedCell - X_MAX +1);
            }
        }
        if (current.pieceIsKing()) {
            downCalc(current, markedCell);
        }
    }
}
