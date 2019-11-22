// Targeted by JavaCPP version 1.5.2: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;
        // for int64

@Namespace("tensorflow::checkpoint") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class TensorSliceSet extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public TensorSliceSet(Pointer p) { super(p); }

  public TensorSliceSet(@Const @ByRef TensorShape shape, @Cast("tensorflow::DataType") int type) { super((Pointer)null); allocate(shape, type); }
  private native void allocate(@Const @ByRef TensorShape shape, @Cast("tensorflow::DataType") int type);

  public native @Const @ByRef TensorShape shape();
  public native @Cast("const tensorflow::DataType") int type();

  // Register a new slice for the tensor. The "tag" is an arbitrary string
  // associated with the slice (in one application it denotes the name of the
  // file that contains the slice); the "data" points to the data of the tensor
  // slice (it can be a nullptr).
  public native @ByVal Status Register(@Const @ByRef TensorSlice slice, @StdString BytePointer tag);
  public native @ByVal Status Register(@Const @ByRef TensorSlice slice, @StdString String tag);

  // Alternative way of querying about a new slice: instead of copying the
  // data, it returns a list of meta data about the stored slices that will
  // supply data for the slice.
  public native @Cast("bool") boolean QueryMeta(
        @Const @ByRef TensorSlice slice,
        @StdVector TensorSlideStringPair results);

  public static class SliceInfo extends Pointer {
      static { Loader.load(); }
      /** Default native constructor. */
      public SliceInfo() { super((Pointer)null); allocate(); }
      /** Native array allocator. Access with {@link Pointer#position(long)}. */
      public SliceInfo(long size) { super((Pointer)null); allocateArray(size); }
      /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
      public SliceInfo(Pointer p) { super(p); }
      private native void allocate();
      private native void allocateArray(long size);
      @Override public SliceInfo position(long position) {
          return (SliceInfo)super.position(position);
      }
  
    public native @ByRef TensorSlice slice(); public native SliceInfo slice(TensorSlice setter);
    public native @StdString BytePointer tag(); public native SliceInfo tag(BytePointer setter);
    public native @Cast("tensorflow::int64") long num_floats(); public native SliceInfo num_floats(long setter);
  }

  // Returns the map from slice string to SliceInfo.
  public native @Const @ByRef StringSliceInfoMap Slices();
}