// Targeted by JavaCPP version 1.5.2: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_ximgproc;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;
import org.bytedeco.opencv.opencv_core.*;
import static org.bytedeco.opencv.global.opencv_core.*;
import org.bytedeco.opencv.opencv_imgproc.*;
import static org.bytedeco.opencv.global.opencv_imgproc.*;
import static org.bytedeco.opencv.global.opencv_imgcodecs.*;
import org.bytedeco.opencv.opencv_videoio.*;
import static org.bytedeco.opencv.global.opencv_videoio.*;
import org.bytedeco.opencv.opencv_highgui.*;
import static org.bytedeco.opencv.global.opencv_highgui.*;
import org.bytedeco.opencv.opencv_flann.*;
import static org.bytedeco.opencv.global.opencv_flann.*;
import org.bytedeco.opencv.opencv_features2d.*;
import static org.bytedeco.opencv.global.opencv_features2d.*;
import org.bytedeco.opencv.opencv_calib3d.*;
import static org.bytedeco.opencv.global.opencv_calib3d.*;

import static org.bytedeco.opencv.global.opencv_ximgproc.*;


/** \brief Class implementing the SLIC (Simple Linear Iterative Clustering) superpixels
algorithm described in \cite Achanta2012.
<p>
SLIC (Simple Linear Iterative Clustering) clusters pixels using pixel channels and image plane space
to efficiently generate compact, nearly uniform superpixels. The simplicity of approach makes it
extremely easy to use a lone parameter specifies the number of superpixels and the efficiency of
the algorithm makes it very practical.
Several optimizations are available for SLIC class:
SLICO stands for "Zero parameter SLIC" and it is an optimization of baseline SLIC descibed in \cite Achanta2012.
MSLIC stands for "Manifold SLIC" and it is an optimization of baseline SLIC described in \cite Liu_2017_IEEE.
 */

@Namespace("cv::ximgproc") @Properties(inherit = org.bytedeco.opencv.presets.opencv_ximgproc.class)
public class SuperpixelSLIC extends Algorithm {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public SuperpixelSLIC(Pointer p) { super(p); }


    /** \brief Calculates the actual amount of superpixels on a given segmentation computed
    and stored in SuperpixelSLIC object.
     */
    public native int getNumberOfSuperpixels();

    /** \brief Calculates the superpixel segmentation on a given image with the initialized
    parameters in the SuperpixelSLIC object.
    <p>
    This function can be called again without the need of initializing the algorithm with
    createSuperpixelSLIC(). This save the computational cost of allocating memory for all the
    structures of the algorithm.
    <p>
    @param num_iterations Number of iterations. Higher number improves the result.
    <p>
    The function computes the superpixels segmentation of an image with the parameters initialized
    with the function createSuperpixelSLIC(). The algorithms starts from a grid of superpixels and
    then refines the boundaries by proposing updates of edges boundaries.
     <p>
     */
    public native void iterate( int num_iterations/*=10*/ );
    public native void iterate( );

    /** \brief Returns the segmentation labeling of the image.
    <p>
    Each label represents a superpixel, and each pixel is assigned to one superpixel label.
    <p>
    @param labels_out Return: A CV_32SC1 integer array containing the labels of the superpixel
    segmentation. The labels are in the range [0, getNumberOfSuperpixels()].
    <p>
    The function returns an image with the labels of the superpixel segmentation. The labels are in
    the range [0, getNumberOfSuperpixels()].
     */
    public native void getLabels( @ByVal Mat labels_out );
    public native void getLabels( @ByVal UMat labels_out );
    public native void getLabels( @ByVal GpuMat labels_out );

    /** \brief Returns the mask of the superpixel segmentation stored in SuperpixelSLIC object.
    <p>
    @param image Return: CV_8U1 image mask where -1 indicates that the pixel is a superpixel border,
    and 0 otherwise.
    <p>
    @param thick_line If false, the border is only one pixel wide, otherwise all pixels at the border
    are masked.
    <p>
    The function return the boundaries of the superpixel segmentation.
     */
    public native void getLabelContourMask( @ByVal Mat image, @Cast("bool") boolean thick_line/*=true*/ );
    public native void getLabelContourMask( @ByVal Mat image );
    public native void getLabelContourMask( @ByVal UMat image, @Cast("bool") boolean thick_line/*=true*/ );
    public native void getLabelContourMask( @ByVal UMat image );
    public native void getLabelContourMask( @ByVal GpuMat image, @Cast("bool") boolean thick_line/*=true*/ );
    public native void getLabelContourMask( @ByVal GpuMat image );

    /** \brief Enforce label connectivity.
    <p>
    @param min_element_size The minimum element size in percents that should be absorbed into a bigger
    superpixel. Given resulted average superpixel size valid value should be in 0-100 range, 25 means
    that less then a quarter sized superpixel should be absorbed, this is default.
    <p>
    The function merge component that is too small, assigning the previously found adjacent label
    to this component. Calling this function may change the final number of superpixels.
     */
    public native void enforceLabelConnectivity( int min_element_size/*=25*/ );
    public native void enforceLabelConnectivity( );


}