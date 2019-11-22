// Targeted by JavaCPP version 1.5.2: DO NOT EDIT THIS FILE

package org.bytedeco.cpython;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.cpython.global.python.*;

// #endif

// #ifndef Py_LIMITED_API
@Properties(inherit = org.bytedeco.cpython.presets.python.class)
public class PyListObject extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public PyListObject() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public PyListObject(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public PyListObject(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public PyListObject position(long position) {
        return (PyListObject)super.position(position);
    }

    public native @ByRef PyVarObject ob_base(); public native PyListObject ob_base(PyVarObject setter);
    /* Vector of pointers to list elements.  list[0] is ob_item[0], etc. */
    public native PyObject ob_item(int i); public native PyListObject ob_item(int i, PyObject setter);
    public native @Cast("PyObject**") PointerPointer ob_item(); public native PyListObject ob_item(PointerPointer setter);

    /* ob_item contains space for 'allocated' elements.  The number
     * currently in use is ob_size.
     * Invariants:
     *     0 <= ob_size <= allocated
     *     len(list) == ob_size
     *     ob_item == NULL implies ob_size == allocated == 0
     * list.sort() temporarily sets allocated to -1 to detect mutations.
     *
     * Items must normally not be NULL, except during construction when
     * the list is not yet visible outside the function that builds it.
     */
    public native @Cast("Py_ssize_t") long allocated(); public native PyListObject allocated(long setter);
}