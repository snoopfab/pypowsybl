/**
 * Copyright (c) 2021, RTE (http://www.rte-france.com)
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package com.powsybl.python.update;

import org.graalvm.nativeimage.c.type.CIntPointer;

/**
 * @author Etienne Lesot {@literal <etienne.lesot at rte-france.com>}
 */
public class IntSeries implements Series<CIntPointer> {

    private final CIntPointer values;
    private final String name;
    private final int size;

    public IntSeries(String name, int size, CIntPointer values) {
        this.name = name;
        this.size = size;
        this.values = values;
    }

    public String getName() {
        return name;
    }

    public int getSize() {
        return size;
    }

    public CIntPointer getValues() {
        return values;
    }
}