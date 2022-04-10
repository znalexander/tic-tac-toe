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

import java.util.Scanner;
import alexander.zakharov.study.java.tictactoe.model.Cell;
import alexander.zakharov.study.java.tictactoe.model.GameTable;

/**
 * @author Aleksandr Zakharov
 * @link http://alexander.zakharov.org/java-oop
 */
public class UserMove {

    private final CellNumberConverter cellNumberConverter;

    public UserMove(final CellNumberConverter cellNumberConverter) {
        this.cellNumberConverter = cellNumberConverter;
    }

    public void make(final GameTable gameTable) {
        while (true) {
            final Cell cellEnteredByTheUser = getUserCell();
            if (gameTable.isCellEmpty(cellEnteredByTheUser)) {
                gameTable.setSing(cellEnteredByTheUser, 'X');
                return;
            } else {
                System.out.println("Can't make a move, because the cell is not free! Try again!");
            }
        }
    }

    private Cell getUserCell() {
        while (true) {
            System.out.println("Please type number between 1 and 9:");
            final String enteredCell = new Scanner(System.in).nextLine();
            if (enteredCell.length() == 1) {
                final char ch = enteredCell.charAt(0);
                if (ch > '0' && ch <= '9') {
                    return cellNumberConverter.toCell(ch);
                }
            }
        }
    }
}
