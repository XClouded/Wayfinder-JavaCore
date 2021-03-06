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
package com.wayfinder.core.map.vectormap.internal.process;

import com.wayfinder.core.shared.internal.debug.LogFactory;
import com.wayfinder.core.shared.internal.debug.Logger;

/**
 * 
 * 
 * 
 *
 */
public class ExtendedStrings {

    private static final Logger LOG = LogFactory
            .getLoggerForClass(ExtendedStrings.class);
        
    private static final int PERFORMER  = 1;
//    private static final int PLACE      = 2;
    
    private String iPerformerString /*, iPlaceString*/;
    public int iFeatureIndex;
    
    public ExtendedStrings(int aFeatureindex, int aType, String aString) {
        iFeatureIndex = aFeatureindex;
        addString(aType, aString);
    }
    
    public void addString(int aType, String aString) {      
        switch (aType) {
            case PERFORMER:
                iPerformerString = aString;
                break;
                
//          case PLACE:
//              iPlaceString = aString;
//              break;
                
            default:
                if(LOG.isError()) {
                    LOG.error("ExtendedStrings.addString()", "Unknown type: "+aType);
                }
                break;
        }   
    }
    
    public String getPerformer() {
        return iPerformerString;
    }
    
//  public String getPlace() {
//      return iPlaceString;
//  }

}
