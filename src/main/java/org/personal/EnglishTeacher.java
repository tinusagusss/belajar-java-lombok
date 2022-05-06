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

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 *
 * @author Agus Tinus Turnip
 */
@Getter
@ToString(exclude = "id")
public class EnglishTeacher {

    @Setter(value = AccessLevel.PROTECTED)
    private String id;

    @Setter(value = AccessLevel.PUBLIC)
    private String name;

}
