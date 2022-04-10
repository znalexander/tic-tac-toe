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

package alexander.zakharov.study.java.tictactoe.model;

import java.util.Arrays;

/**
 * @author Aleksandr Zakharov
 * @link http://alexander.zakharov.org/java-oop
 */
public class GameTable {

    private final char[][] table = {
        {' ', ' ', ' '},
        {' ', ' ', ' '},
        {' ', ' ', ' '}
    };

    public boolean isCellEmpty(final Cell cell) {
        return table[cell.getRow()][cell.getCol()] == ' ';
    }

    public char getSing(final Cell cell) {
        return table[cell.getRow()][cell.getCol()];
    }

    public void setSing(final Cell cell, final char sing) {
        table[cell.getRow()][cell.getCol()] = sing;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("GameTable{");
        sb.append("table=");
        for (int i = 0; i < table.length; i++) {
            sb.append(Arrays.toString(table[i]));
            if (i < table.length - 1) {
                sb.append(' ');
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
