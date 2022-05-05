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
public class SetterGetterTest {

    @Test
    public void testSetterGetterBahasaTeacher() {
        var teacher = new BahasaTeacher();

        var id = "01";
        var name = "Susi";

        teacher.setId(id);
        teacher.setName(name);

        Assertions.assertSame(teacher.getId(), id);
        Assertions.assertSame(teacher.getName(), name);
    }
}
