/*******************************************************************************
 * Copyright (c) 1999-2010, Vodafone Group Services
 * All rights reserved.
 * 
 * Redistribution and use in source and binary forms, with or without 
 * modification, are permitted provided that the following conditions 
 * are met:
 * 
 *     * Redistributions of source code must retain the above copyright 
 *       notice, this list of conditions and the following disclaimer.
 *     * Redistributions in binary form must reproduce the above 
 *       copyright notice, this list of conditions and the following 
 *       disclaimer in the documentation and/or other materials provided 
 *       with the distribution.
 *     * Neither the name of Vodafone Group Services nor the names of its 
 *       contributors may be used to endorse or promote products derived 
 *       from this software without specific prior written permission.
 * 
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" 
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE 
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE 
 * ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE 
 * LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR 
 * CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF 
 * SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS 
 * INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN 
 * CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING 
 * IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY 
 * OF SUCH DAMAGE.
 ******************************************************************************/
/*
 * Copyright, Wayfinder Systems AB, 2009
 */

package com.wayfinder.core.shared.util.units_formatter_test;
import com.wayfinder.core.shared.util.UnitsFormatter;
import com.wayfinder.core.shared.util.UnitsFormatterSettings;
import com.wayfinder.core.shared.util.UnitsFormatterSettingsEN;

import junit.framework.TestCase;

public class MilesFeetTest extends TestCase {

    UnitsFormatter m_uf;
    private final int UNIT_SYSTEM = UnitsFormatterSettings.UNITS_MILES_FEET; 
    
    protected void setUp() throws Exception {
        super.setUp();
        UnitsFormatterSettings ufs = new UnitsFormatterSettingsEN(UNIT_SYSTEM);
        m_uf = new UnitsFormatter(ufs);
    }

    public void testLongMiles() {
        UnitsFormatter.FormattingResult fr = m_uf.formatDistance(12345);
        testLongMilesInternal(fr);
    }

    protected static void
    testLongMilesInternal(UnitsFormatter.FormattingResult fr) {
        assertEquals("7.7", fr.getRoundedValue());
        assertEquals("miles", fr.getUnit());
        assertEquals("mi", fr.getUnitAbbr());        
    }
}
