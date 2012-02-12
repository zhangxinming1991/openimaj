/**
 * Copyright (c) 2011, The University of Southampton and the individual contributors.
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without modification,
 * are permitted provided that the following conditions are met:
 *
 *   * 	Redistributions of source code must retain the above copyright notice,
 * 	this list of conditions and the following disclaimer.
 *
 *   *	Redistributions in binary form must reproduce the above copyright notice,
 * 	this list of conditions and the following disclaimer in the documentation
 * 	and/or other materials provided with the distribution.
 *
 *   *	Neither the name of the University of Southampton nor the names of its
 * 	contributors may be used to endorse or promote products derived from this
 * 	software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR
 * ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 * LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON
 * ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package org.openimaj.math.geometry.shape;

import org.openimaj.math.geometry.point.Point2d;

import Jama.Matrix;

/**
 * Interface for classes that represent a shape.
 * 
 * @author Jonathon Hare <jsh2@ecs.soton.ac.uk>
 */
public interface Shape extends Cloneable {
	/**
	 * Test whether the point p is inside the shape.
	 *  
	 * @param point the point
	 * @return true if the point is inside; false otherwise
	 */
	public boolean isInside(Point2d point);
	
	/**
	 * Compute the regular (oriented to the axes) bounding box
	 * of the shape.
	 * 
	 * @return the regular bounding box as [x,y,width,height]
	 */
	public Rectangle calculateRegularBoundingBox();
	
	/**
	 * Translate the shapes position
	 *  
	 * @param x x-translation
	 * @param y y-translation
	 */
	public void translate(float x, float y);
	
	/**
	 * Scale the shape by the given amount about (0,0). Scalefactors
	 * between 0 and 1 shrink the shape. 
	 * @param sc the scale factor.
	 */
	public void scale(float sc);
	
	/**
	 * Scale the shape by the given amount about the given point. 
	 * Scalefactors between 0 and 1 shrink the shape.
	 * @param centre the centre of the scaling operation
	 * @param sc the scale factor
	 */
	public void scale(Point2d centre, float sc);
	
	/**
	 * Scale the shape about its centre of gravity.
	 * Scalefactors between 0 and 1 shrink the shape.
	 * @param sc the scale factor
	 */
	public void scaleCOG( float sc );
	
	/**
	 * Get the centre of gravity of the shape
	 * @return the centre of gravity of the shape
	 */
	public Point2d getCOG();
		
	/**
	 * Calculate the area of the shape
	 * @return the area of the shape
	 */
	public double calculateArea();
	
	/**
	 * @return the minimum x-ordinate
	 */
	public double minX();
	
	/**
	 * @return the minimum y-ordinate
	 */
	public double minY();
	
	/**
	 * @return the maximum x-ordinate
	 */
	public double maxX();
	
	/**
	 * @return the maximum y-ordinate
	 */
	public double maxY();
	
	/**
	 * @return the width of the regular bounding box 
	 */
	public double getWidth();
	
	/**
	 * @return the height of the regular bounding box
	 */
	public double getHeight();
	
	/**
	 * Apply a 3x3 transform matrix to a copy of the shape
	 * and return it
	 * @param transform 3x3 transform matrix
	 * @return the transformed shape
	 */
	public Shape transform(Matrix transform);
	
	/**
	 * Convert the shape to a polygon representation
	 * @return a polygon representation of the shape 
	 */
	public Polygon asPolygon();
	
	/**
	 * Calls {@link Polygon#intersectionArea(Shape, int)} with 1 step per pixel dimension. Subsequently this 
	 * function returns the shared whole pixels of this polygon and that.
	 * @param that
	 * @return intersection area
	 */
	public double intersectionArea(Shape that);
	
	/**
	 * Return an estimate for the area of the intersection of this polygon and another polygon. For
	 * each pixel step 1 is added if the point is inside both polygons.
	 * The length of a step in each direction is calculated as follows:
	 * 
	 * max(intersectionWidth,intersectionHeight)/ (nStepsPerDimention)
	 * 
	 * The total number of points inside the intersection of the shames is divided by the number of points read 
	 * and multiplied by the total area of the intersection. 
	 * 
	 * @param that
	 * @param nStepsPerDimention
	 * @return normalised intersection area
	 */
	public double intersectionArea(Shape that, int nStepsPerDimention);
}
