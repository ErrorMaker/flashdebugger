/*
 *  Copyright (C) 2015 JPEXS, All rights reserved.
 * 
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 3.0 of the License, or (at your option) any later version.
 * 
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 * 
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library.
 */
package com.jpexs.debugger.flash.messages.out;

import com.jpexs.debugger.flash.DebuggerConnection;
import com.jpexs.debugger.flash.OutDebuggerMessage;
import java.io.IOException;
import java.io.OutputStream;

/**
 *
 * @author JPEXS
 */
public class OutSwfInfo extends OutDebuggerMessage {

    public static int ID = 38;

    public int swfIndex;

    @Override
    public String toString() {
        return super.toString() + "(swfIndex=" + swfIndex + ")";
    }

    public OutSwfInfo(DebuggerConnection c, int swfIndex) {
        super(c, ID);
        this.swfIndex = swfIndex;
        //receive InSwfInfo
    }

    @Override
    public void writeTo(OutputStream os) throws IOException {
        writeWord(os, swfIndex);
        writeWord(os, 0); //reserved
    }

}
