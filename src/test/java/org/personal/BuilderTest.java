/*
 * Copyright 2022 Agus Tinus Turnip.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.personal;

import java.util.ArrayList;
import org.junit.jupiter.api.Test;

/**
 *
 * @author Agus Tinus Turnip
 */
public class BuilderTest {

    @Test
    public void testViaConstructor() {

        var softwares = new ArrayList<String>();
        softwares.add("NetBeans");
        softwares.add("Visual Studio Code");
        softwares.add("Photoshop");

        var id = "01";
        var name = "Kyla";
        var age = 22;
        var teacher = new ComputerTeacher(id, name, age, softwares);

        System.out.println(teacher);

    }

    @Test
    public void testViaBuilder() {

        var softwares = new ArrayList<String>();
        softwares.add("NetBeans");
        softwares.add("Visual Studio Code");
        softwares.add("Photoshop");

        var id = "02";
        var name = "Mark";
        var age = 45;

        var teacher = ComputerTeacher.builder()
                .id(id)
                .name(name)
                .age(age)
                .softwares(softwares)
                .build();

        System.out.println(teacher);
    }

    @Test
    public void testSingularViaBuilder() {
        var softwares = new ArrayList<String>();
        softwares.add("NetBeans");
        softwares.add("Visual Studio Code");
        softwares.add("Photoshop");

        var id = "03";
        var name = "Zacn";
        var age = 25;

        var teacher = ComputerTeacher.builder()
                .id(id)
                .name(name)
                .age(age)
                .softwares(softwares)
                .software("Microsft Word")
                .software("Adobe Illustrator")
                .build();

        System.out.println(teacher);
    }
}
