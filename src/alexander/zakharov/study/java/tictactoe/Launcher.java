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

package alexander.zakharov.study.java.tictactoe;

import alexander.zakharov.study.java.tictactoe.component.CellVerifier;
import alexander.zakharov.study.java.tictactoe.component.ComputerMove;
import alexander.zakharov.study.java.tictactoe.component.DataPrinter;
import alexander.zakharov.study.java.tictactoe.component.Game;
import alexander.zakharov.study.java.tictactoe.component.UserMove;
import alexander.zakharov.study.java.tictactoe.component.WinnerVerifier;

/**
 * @author Aleksandr Zakharov
 * @link http://alexander.zakharov.org/java-oop
 */
public final class Launcher {

    public static void main(final String[] args) {
        Game game =
            new Game(new DataPrinter(), new UserMove(), new ComputerMove(), new WinnerVerifier(), new CellVerifier());
        game.play();
    }
}
