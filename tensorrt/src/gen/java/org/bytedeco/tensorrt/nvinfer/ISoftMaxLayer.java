// Targeted by JavaCPP version 1.5.2: DO NOT EDIT THIS FILE

package org.bytedeco.tensorrt.nvinfer;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import org.bytedeco.cuda.cudart.*;
import static org.bytedeco.cuda.global.cudart.*;

import static org.bytedeco.tensorrt.global.nvinfer.*;


/**
 *  \class ISoftMaxLayer
 * 
 *  \brief A Softmax layer in a network definition.
 * 
 *  This layer applies a per-channel softmax to its input.
 * 
 *  The output size is the same as the input size.
 * 
 *  \warning Do not inherit from this class, as doing so will break forward-compatibility of the API and ABI.
 *  */
@Namespace("nvinfer1") @Properties(inherit = org.bytedeco.tensorrt.presets.nvinfer.class)
public class ISoftMaxLayer extends ILayer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ISoftMaxLayer(Pointer p) { super(p); }

    /**
     *  \brief Set the axis along which softmax is computed. Currently, only one axis can be set.
     * 
     *  The axis is specified by setting the bit corresponding to the axis to 1.
     *  Let's say we have an NCHW tensor as input (three non-batch dimensions).
     * 
     *  In implicit mode :
     *  Bit 0 corresponds to the C dimension boolean.
     *  Bit 1 corresponds to the H dimension boolean.
     *  Bit 2 corresponds to the W dimension boolean.
     *  By default, softmax is performed on the axis which is the number of axes minus three. It is 0 if
     *  there are fewer than 3 non-batch axes. For example, if the input is NCHW, the default axis is C. If the input
     *  is NHW, then the default axis is H.
     * 
     *  In explicit mode :
     *  Bit 0 corresponds to the N dimension boolean.
     *  Bit 1 corresponds to the C dimension boolean.
     *  Bit 2 corresponds to the H dimension boolean.
     *  Bit 3 corresponds to the W dimension boolean.
     *  By default, softmax is performed on the axis which is the number of axes minus three. It is 0 if
     *  there are fewer than 3 axes. For example, if the input is NCHW, the default axis is C. If the input
     *  is NHW, then the default axis is N.
     * 
     *  For example, to perform softmax on axis R of a NPQRCHW input, set bit 2 with implicit batch mode,
     *  set bit 3 with explicit batch mode.
     * 
     *  @param axes The axis along which softmax is computed.
     *         Here axes is a bitmap. For example, when doing softmax along axis 0, bit 0 is set to 1, axes = 1 << axis = 1.
     *  */
    
    
    //!
    //!
    //!
    public native void setAxes(@Cast("uint32_t") int axes);

    /**
     *  \brief Get the axis along which softmax occurs.
     * 
     *  @see setAxes()
     *  */
    public native @Cast("uint32_t") int getAxes();
}