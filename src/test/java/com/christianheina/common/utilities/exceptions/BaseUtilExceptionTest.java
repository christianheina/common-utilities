/*
 * Copyright 2024 Christian Heina
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.christianheina.common.utilities.exceptions;

import org.testng.annotations.Test;

import com.christianheina.common.utilities.exceptions.BaseUtilException;

/**
 * Unit test for {@link BaseUtilException}.
 * 
 * @author Christian Heina (developer@christianheina.com)
 */
public class BaseUtilExceptionTest {

    @Test(expectedExceptions = BaseUtilException.class)
    public void PhasedArrayAntennaExceptionWithMessageTest() {
        throw new BaseUtilException("Test");
    }

    @Test(expectedExceptions = BaseUtilException.class)
    public void PhasedArrayAntennaExceptionWithThrowableTest() {
        throw new BaseUtilException(new RuntimeException());
    }

    @Test(expectedExceptions = BaseUtilException.class)
    public void PhasedArrayAntennaExceptionWithMessageAndThrowableTest() {
        throw new BaseUtilException("Test", new RuntimeException());
    }

}
