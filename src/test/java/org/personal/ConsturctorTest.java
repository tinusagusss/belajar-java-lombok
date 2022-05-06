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

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 *
 * @author Agus Tinus Turnip
 */
public class ConsturctorTest {

    @Test
    public void testNoArgsConstructor() {

        var teacher = new ScienceTeacher();

        var id = "01";
        var name = "Abdi";

        teacher.setId(id);
        teacher.setName(name);

        Assertions.assertEquals(teacher.getId(), id);
        Assertions.assertEquals(teacher.getName(), name);
    }

    @Test
    public void testAllArgsConstructor() {

        var id = "02";
        var name = "Satria";

        var teacher = new ScienceTeacher(id, name);

        Assertions.assertEquals(teacher.getId(), id);
        Assertions.assertEquals(teacher.getName(), name);
    }

    @Test
    public void testStaticConstuctor() {

        var id = "03";
        var name = "Keanu";

        var teacher = HistoryTeacher.create(id, name);

        Assertions.assertEquals(teacher.getId(), id);
        Assertions.assertEquals(teacher.getName(), name);

        var history = HistoryTeacher.createEmpty();

        Assertions.assertNull(history.getId());
        Assertions.assertNull(history.getName());
    }

    @Test
    public void testRequiredArgsConstructor() {
        var id = "04";

        var teacher = new JavanaseTeacher(id);

        Assertions.assertEquals(teacher.getId(), id);

    }

    @Test
    public void testToString() {
        var teacher = new BahasaTeacher();

        var id = "05";
        var name = "Surti";

        teacher.setId(id);
        teacher.setName(name);

        Assertions.assertEquals(teacher.getId(), id);
        Assertions.assertEquals(teacher.getName(), name);

        System.out.println(teacher);

    }

    @Test
    public void testExcludeToString() {
        var teacher = new EnglishTeacher();

        var id = "06";
        var name = "Surti";

        teacher.setId(id);
        teacher.setName(name);

        Assertions.assertEquals(teacher.getId(), id);
        Assertions.assertEquals(teacher.getName(), name);

        System.out.println(teacher);
    }
}
