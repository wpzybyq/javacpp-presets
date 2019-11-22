// Targeted by JavaCPP version 1.5.2: DO NOT EDIT THIS FILE

package org.bytedeco.ffmpeg.avutil;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.ffmpeg.global.avutil.*;


@Properties(inherit = org.bytedeco.ffmpeg.presets.avutil.class)
public class LogCallback extends FunctionPointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public    LogCallback(Pointer p) { super(p); }
    protected LogCallback() { allocate(); }
    private native void allocate();
    public native void call(int level, @Cast("const char*") BytePointer msg);
}