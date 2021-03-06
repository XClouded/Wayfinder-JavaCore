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

package com.wayfinder.core.shared.util.io;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/**
 * An extended version of {@link DataOutputStream}.
 */
public class WFDataOutputStream extends DataOutputStream {

    /**
     * Creates a WFDataOutputStream that writes data to the specified
     * output stream.
     * 
     * @param out - the stream to write to.
     */
    public WFDataOutputStream(OutputStream out) {
        super(out);
    }

    /**
     * <p>writeUTF() the string s if and only if
     * s != null && s.length() > 0.</p>
     *
     * <p>Can be used to avoid wasting buffer space and processor time in
     * RMS subsystem on empty strings.</p>
     *
     * @param s - the string to write or null.
     * @return true if anything was written and false otherwise
     * @throws IOException if an I/O error occurs.
     */
    public boolean writeStringUnlessEmpty(String s)
        throws IOException {

        if (s != null && s.length() > 0) {
            writeUTF(s);

            return true;
        } else {
            return false;
        }
    }
}
