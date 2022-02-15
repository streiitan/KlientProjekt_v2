package com.example.klientprojekt_v2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.ArrayList;

public class PlayActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play);
    }

    /**
     * Hanterar cellnoderna samt sätter upp brädet vid start
     */
    private class movingManeger {

        private final int NUMBER_OF_CELLS = 32;
        private final int X_MAX = 4;
        private final int Y_MAX = 8;
        private ArrayList<CellNode> cellNodeList;


        /**
         * Sätter upp CellNoder för hela brädet
         * Ska användas vid start
         */
        public void setCellNodes() {
            cellNodeList = new ArrayList<CellNode>();
            for (int i = 0; i < NUMBER_OF_CELLS; i++) {
                CellNode cellNode = new CellNode();
                cellNodeList.add(cellNode);
            }
        }

        /**
         * Sätter upp spelpjäserna vid start
         */
        public void setUpPieces() {

        }

        /**
         * Hämtar cellen genom en beräkning av vilken plats i arrayListen den ligger på
         * @param x
         * @param y
         */
        public void cellMarked(int x, int y) {
            int markedCell = y * X_MAX + x;
            CellNode cell = cellNodeList.get(markedCell);
            if (cell.hasPiece) {

            }
        }
    }
}