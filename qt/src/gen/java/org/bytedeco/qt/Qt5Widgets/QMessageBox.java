// Targeted by JavaCPP version 1.5.4-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.qt.Qt5Widgets;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.qt.Qt5Core.*;
import static org.bytedeco.qt.global.Qt5Core.*;
import org.bytedeco.qt.Qt5Gui.*;
import static org.bytedeco.qt.global.Qt5Gui.*;

import static org.bytedeco.qt.global.Qt5Widgets.*;

// Parsed from QtWidgets/qmessagebox.h

@Properties(inherit = org.bytedeco.qt.presets.Qt5Widgets.class)
public class QMessageBox extends QDialog {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public QMessageBox(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public QMessageBox(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public QMessageBox position(long position) {
        return (QMessageBox)super.position(position);
    }
    @Override public QMessageBox getPointer(long i) {
        return new QMessageBox(this).position(position + i);
    }

    /** enum QMessageBox::Icon */
    public static final int
        // keep this in sync with QMessageDialogOptions::Icon
        NoIcon = 0,
        Information = 1,
        Warning = 2,
        Critical = 3,
        Question = 4;
    

    /** enum QMessageBox::ButtonRole */
    public static final int
        // keep this in sync with QDialogButtonBox::ButtonRole and QPlatformDialogHelper::ButtonRole
        InvalidRole = -1,
        AcceptRole = 0,
        RejectRole = 1,
        DestructiveRole = 2,
        ActionRole = 3,
        HelpRole = 4,
        YesRole = 5,
        NoRole = 6,
        ResetRole = 7,
        ApplyRole = 8,

        NRoles = 9;

    /** enum QMessageBox::StandardButton */
    public static final int
        // keep this in sync with QDialogButtonBox::StandardButton and QPlatformDialogHelper::StandardButton
        NoButton           = 0x00000000,
        Ok                 = 0x00000400,
        Save               = 0x00000800,
        SaveAll            = 0x00001000,
        Open               = 0x00002000,
        Yes                = 0x00004000,
        YesToAll           = 0x00008000,
        No                 = 0x00010000,
        NoToAll            = 0x00020000,
        Abort              = 0x00040000,
        Retry              = 0x00080000,
        Ignore             = 0x00100000,
        Close              = 0x00200000,
        Cancel             = 0x00400000,
        Discard            = 0x00800000,
        Help               = 0x01000000,
        Apply              = 0x02000000,
        Reset              = 0x04000000,
        RestoreDefaults    = 0x08000000,

        FirstButton        = Ok,                // internal
        LastButton         = RestoreDefaults,   // internal

        YesAll             = YesToAll,          // obsolete
        NoAll              = NoToAll,           // obsolete

        Default            = 0x00000100,        // obsolete
        Escape             = 0x00000200,        // obsolete
        FlagMask           = 0x00000300,        // obsolete
        ButtonMask         = ~FlagMask;          // obsolete  // obsolete

//     #define Q_DECLARE_FLAGS(arg0, arg1)(StandardButtons, StandardButton)
    

    public QMessageBox(QWidget parent/*=nullptr*/) { super((Pointer)null); allocate(parent); }
    private native void allocate(QWidget parent/*=nullptr*/);
    public QMessageBox() { super((Pointer)null); allocate(); }
    private native void allocate();
    public QMessageBox(@Cast("QMessageBox::Icon") int icon, @Const @ByRef QString title, @Const @ByRef QString text,
                    @ByVal(nullValue = "QMessageBox::StandardButtons(QMessageBox::NoButton)") @Cast("QMessageBox::StandardButtons") int buttons, QWidget parent/*=nullptr*/,
                    @ByVal(nullValue = "Qt::WindowFlags(Qt::Dialog | Qt::MSWindowsFixedSizeDialogHint)") @Cast("Qt::WindowFlags") int flags) { super((Pointer)null); allocate(icon, title, text, buttons, parent, flags); }
    private native void allocate(@Cast("QMessageBox::Icon") int icon, @Const @ByRef QString title, @Const @ByRef QString text,
                    @ByVal(nullValue = "QMessageBox::StandardButtons(QMessageBox::NoButton)") @Cast("QMessageBox::StandardButtons") int buttons, QWidget parent/*=nullptr*/,
                    @ByVal(nullValue = "Qt::WindowFlags(Qt::Dialog | Qt::MSWindowsFixedSizeDialogHint)") @Cast("Qt::WindowFlags") int flags);
    public QMessageBox(@Cast("QMessageBox::Icon") int icon, @Const @ByRef QString title, @Const @ByRef QString text) { super((Pointer)null); allocate(icon, title, text); }
    private native void allocate(@Cast("QMessageBox::Icon") int icon, @Const @ByRef QString title, @Const @ByRef QString text);

    public native void addButton(QAbstractButton button, @Cast("QMessageBox::ButtonRole") int role);
    public native QPushButton addButton(@Const @ByRef QString text, @Cast("QMessageBox::ButtonRole") int role);
    public native QPushButton addButton(@Cast("QMessageBox::StandardButton") int button);
    public native void removeButton(QAbstractButton button);
    public native void open(QObject receiver, @Cast("const char*") BytePointer member);
    public native void open(QObject receiver, String member);
    public native @Cast("QMessageBox::ButtonRole") int buttonRole(QAbstractButton button);

    public native void setStandardButtons(@ByVal @Cast("QMessageBox::StandardButtons") int buttons);
    public native @ByVal @Cast("QMessageBox::StandardButtons") int standardButtons();
    public native @Cast("QMessageBox::StandardButton") int standardButton(QAbstractButton button);
    public native QAbstractButton button(@Cast("QMessageBox::StandardButton") int which);

    public native QPushButton defaultButton();
    public native void setDefaultButton(QPushButton button);
    public native void setDefaultButton(@Cast("QMessageBox::StandardButton") int button);

    public native QAbstractButton escapeButton();
    public native void setEscapeButton(QAbstractButton button);
    public native void setEscapeButton(@Cast("QMessageBox::StandardButton") int button);

    public native QAbstractButton clickedButton();

    public native @ByVal QString text();
    public native void setText(@Const @ByRef QString text);

    public native @Cast("QMessageBox::Icon") int icon();
    public native void setIcon(@Cast("QMessageBox::Icon") int arg0);

    public native @Cast("Qt::TextFormat") int textFormat();
    public native void setTextFormat(@Cast("Qt::TextFormat") int format);

    public native void setTextInteractionFlags(@ByVal @Cast("Qt::TextInteractionFlags") int flags);
    public native @ByVal @Cast("Qt::TextInteractionFlags") int textInteractionFlags();

    public native void setCheckBox(QCheckBox cb);
    public native QCheckBox checkBox();

    public static native @Cast("QMessageBox::StandardButton") int information(QWidget parent, @Const @ByRef QString title,
             @Const @ByRef QString text, @ByVal(nullValue = "QMessageBox::StandardButtons(QMessageBox::Ok)") @Cast("QMessageBox::StandardButtons") int buttons,
             @Cast("QMessageBox::StandardButton") int defaultButton/*=QMessageBox::NoButton*/);
    public static native @Cast("QMessageBox::StandardButton") int information(QWidget parent, @Const @ByRef QString title,
             @Const @ByRef QString text);
    public static native @Cast("QMessageBox::StandardButton") int question(QWidget parent, @Const @ByRef QString title,
             @Const @ByRef QString text, @ByVal(nullValue = "QMessageBox::StandardButtons(QMessageBox::Yes | QMessageBox::No)") @Cast("QMessageBox::StandardButtons") int buttons,
             @Cast("QMessageBox::StandardButton") int defaultButton/*=QMessageBox::NoButton*/);
    public static native @Cast("QMessageBox::StandardButton") int question(QWidget parent, @Const @ByRef QString title,
             @Const @ByRef QString text);
    public static native @Cast("QMessageBox::StandardButton") int warning(QWidget parent, @Const @ByRef QString title,
             @Const @ByRef QString text, @ByVal(nullValue = "QMessageBox::StandardButtons(QMessageBox::Ok)") @Cast("QMessageBox::StandardButtons") int buttons,
             @Cast("QMessageBox::StandardButton") int defaultButton/*=QMessageBox::NoButton*/);
    public static native @Cast("QMessageBox::StandardButton") int warning(QWidget parent, @Const @ByRef QString title,
             @Const @ByRef QString text);
    public static native @Cast("QMessageBox::StandardButton") int critical(QWidget parent, @Const @ByRef QString title,
             @Const @ByRef QString text, @ByVal(nullValue = "QMessageBox::StandardButtons(QMessageBox::Ok)") @Cast("QMessageBox::StandardButtons") int buttons,
             @Cast("QMessageBox::StandardButton") int defaultButton/*=QMessageBox::NoButton*/);
    public static native @Cast("QMessageBox::StandardButton") int critical(QWidget parent, @Const @ByRef QString title,
             @Const @ByRef QString text);
    public static native void about(QWidget parent, @Const @ByRef QString title, @Const @ByRef QString text);
    public static native void aboutQt(QWidget parent, @Const @ByRef(nullValue = "QString()") QString title);
    public static native void aboutQt(QWidget parent);

    // the following functions are obsolete:

    public QMessageBox(@Const @ByRef QString title, @Const @ByRef QString text, @Cast("QMessageBox::Icon") int icon,
                      int button0, int button1, int button2,
                      QWidget parent/*=nullptr*/,
                      @ByVal(nullValue = "Qt::WindowFlags(Qt::Dialog | Qt::MSWindowsFixedSizeDialogHint)") @Cast("Qt::WindowFlags") int f) { super((Pointer)null); allocate(title, text, icon, button0, button1, button2, parent, f); }
    private native void allocate(@Const @ByRef QString title, @Const @ByRef QString text, @Cast("QMessageBox::Icon") int icon,
                      int button0, int button1, int button2,
                      QWidget parent/*=nullptr*/,
                      @ByVal(nullValue = "Qt::WindowFlags(Qt::Dialog | Qt::MSWindowsFixedSizeDialogHint)") @Cast("Qt::WindowFlags") int f);
    public QMessageBox(@Const @ByRef QString title, @Const @ByRef QString text, @Cast("QMessageBox::Icon") int icon,
                      int button0, int button1, int button2) { super((Pointer)null); allocate(title, text, icon, button0, button1, button2); }
    private native void allocate(@Const @ByRef QString title, @Const @ByRef QString text, @Cast("QMessageBox::Icon") int icon,
                      int button0, int button1, int button2);

    public static native int information(QWidget parent, @Const @ByRef QString title,
                               @Const @ByRef QString text,
                               int button0, int button1/*=0*/, int button2/*=0*/);
    public static native int information(QWidget parent, @Const @ByRef QString title,
                               @Const @ByRef QString text,
                               int button0);
    public static native int information(QWidget parent, @Const @ByRef QString title,
                               @Const @ByRef QString text,
                               @Const @ByRef QString button0Text,
                               @Const @ByRef(nullValue = "QString()") QString button1Text,
                               @Const @ByRef(nullValue = "QString()") QString button2Text,
                               int defaultButtonNumber/*=0*/,
                               int escapeButtonNumber/*=-1*/);
    public static native int information(QWidget parent, @Const @ByRef QString title,
                               @Const @ByRef QString text,
                               @Const @ByRef QString button0Text);

    public static native int question(QWidget parent, @Const @ByRef QString title,
                            @Const @ByRef QString text,
                            int button0, int button1/*=0*/, int button2/*=0*/);
    public static native int question(QWidget parent, @Const @ByRef QString title,
                            @Const @ByRef QString text,
                            int button0);
    public static native int question(QWidget parent, @Const @ByRef QString title,
                            @Const @ByRef QString text,
                            @Const @ByRef QString button0Text,
                            @Const @ByRef(nullValue = "QString()") QString button1Text,
                            @Const @ByRef(nullValue = "QString()") QString button2Text,
                            int defaultButtonNumber/*=0*/,
                            int escapeButtonNumber/*=-1*/);
    public static native int question(QWidget parent, @Const @ByRef QString title,
                            @Const @ByRef QString text,
                            @Const @ByRef QString button0Text);

    public static native int warning(QWidget parent, @Const @ByRef QString title,
                           @Const @ByRef QString text,
                           int button0, int button1, int button2/*=0*/);
    public static native int warning(QWidget parent, @Const @ByRef QString title,
                           @Const @ByRef QString text,
                           @Const @ByRef QString button0Text,
                           @Const @ByRef(nullValue = "QString()") QString button1Text,
                           @Const @ByRef(nullValue = "QString()") QString button2Text,
                           int defaultButtonNumber/*=0*/,
                           int escapeButtonNumber/*=-1*/);
    public static native int warning(QWidget parent, @Const @ByRef QString title,
                           @Const @ByRef QString text,
                           @Const @ByRef QString button0Text);

    public static native int critical(QWidget parent, @Const @ByRef QString title,
                            @Const @ByRef QString text,
                            int button0, int button1, int button2/*=0*/);
    public static native int critical(QWidget parent, @Const @ByRef QString title,
                            @Const @ByRef QString text,
                            @Const @ByRef QString button0Text,
                            @Const @ByRef(nullValue = "QString()") QString button1Text,
                            @Const @ByRef(nullValue = "QString()") QString button2Text,
                            int defaultButtonNumber/*=0*/,
                            int escapeButtonNumber/*=-1*/);
    public static native int critical(QWidget parent, @Const @ByRef QString title,
                            @Const @ByRef QString text,
                            @Const @ByRef QString button0Text);

    public native @ByVal QString buttonText(int button);
    public native void setButtonText(int button, @Const @ByRef QString text);

    public native @ByVal QString informativeText();
    public native void setInformativeText(@Const @ByRef QString text);

// #if QT_CONFIG(textedit)
    public native @ByVal QString detailedText();
    public native void setDetailedText(@Const @ByRef QString text);
// #endif

    public native void setWindowTitle(@Const @ByRef QString title);
    public native void setWindowModality(@Cast("Qt::WindowModality") int windowModality);
    @Virtual public native int exec();
    @Virtual protected native @Cast("bool") boolean event(QEvent e);
    @Virtual protected native void closeEvent(QCloseEvent event);
    @Virtual protected native void changeEvent(QEvent event);
}
