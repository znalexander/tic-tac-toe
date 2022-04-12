#!/usr/bin/env sh
#
# Copyright (c) 2022. Aleksandr Zakharov
#
# Licensed under the Apache License, Version 2.0 (the "License");
# you may not use this file except in compliance with the License.
# You may obtain a copy of the License at
#
#     http://www.apache.org/licenses/LICENSE-2.0
#
# Unless required by applicable law or agreed to in writing, software
# distributed under the License is distributed on an "AS IS" BASIS,
# WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
# See the License for the specific language governing permissions and
# limitations under the License.
#####################################################################################################################
# The cmd script to start the tic-tac-toe game for Unix systems
#
# @author Aleksandr Zakharov
# @email  a.zakharov.n@gmail.com
#####################################################################################################################

java -jar ${project.build.finalName}.jar
echo "Press Enter to continue . . . "
read -r test
