/*
 * Copyright (c) 2022. Aleksandr Zakharov
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */

package alexander.zakharov.study.java.tictactoe.component;

import alexander.zakharov.study.java.tictactoe.model.Cell;
import alexander.zakharov.study.java.tictactoe.model.GameTable;

/**
 * @author Aleksandr Zakharov
 * @link http://alexander.zakharov.org/java-oop
 */
public class WinnerVerifier {

    public boolean isUserWin(final GameTable gameTable) {
        return isWinner(gameTable, 'X');
    }

    public boolean isComputerWin(final GameTable gameTable) {
        return isWinner(gameTable, 'O');
    }

    private boolean isWinner(final GameTable gameTable, final char sing) {
        return isWinnerByRows(gameTable, sing) ||
            isWinnerByCols(gameTable, sing) ||
            isWinnerByMainDiagonal(gameTable, sing) ||
            isWinnerBySecondaryDiagonal(gameTable, sing);
    }

    private boolean isWinnerByRows(final GameTable gameTable, final char sing) {
        for (int i = 0; i < 3; i++) {
            if (gameTable.getSing(new Cell(i, 0)) == gameTable.getSing(new Cell(i, 1))
                && gameTable.getSing(new Cell(i, 1)) == gameTable.getSing(new Cell(i, 2))
                && gameTable.getSing(new Cell(i, 2)) == sing) {
                return true;
            }
        }
        return false;
    }

    private boolean isWinnerByCols(final GameTable gameTable, final char sing) {
        for (int i = 0; i < 3; i++) {
            if (gameTable.getSing(new Cell(0, i)) == gameTable.getSing(new Cell(1, i))
                && gameTable.getSing(new Cell(1, i)) == gameTable.getSing(new Cell(2, i))
                && gameTable.getSing(new Cell(2, i)) == sing) {
                return true;
            }
        }
        return false;
    }

    private boolean isWinnerByMainDiagonal(final GameTable gameTable, final char sing) {
        return gameTable.getSing(new Cell(0, 0)) == gameTable.getSing(new Cell(1, 1))
            && gameTable.getSing(new Cell(1, 1)) == gameTable.getSing(new Cell(2, 2))
            && gameTable.getSing(new Cell(2, 2)) == sing;
    }

    private boolean isWinnerBySecondaryDiagonal(final GameTable gameTable, final char sing) {
        return gameTable.getSing(new Cell(0, 2)) == gameTable.getSing(new Cell(1, 1))
            && gameTable.getSing(new Cell(1, 1)) == gameTable.getSing(new Cell(2, 0))
            && gameTable.getSing(new Cell(2, 0)) == sing;
    }
}
