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

/**
 * @author Aleksandr Zakharov
 * @link http://alexander.zakharov.org/java-oop
 */
public class CellNumberConverter {

    private final char[][] gamepad = {
        {'7', '8', '9'},
        {'4', '5', '6'},
        {'1', '2', '3'}
    };

    public Cell toCell(final char number) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (gamepad[i][j] == number) {
                    return new Cell(i, j);
                }
            }
        }
        return null;
    }

    public char toNumber(final Cell cell) {
        return gamepad[cell.getRow()][cell.getCol()];
    }
}
