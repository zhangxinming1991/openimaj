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
package org.openimaj.hardware.kinect.freenect;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ValuedEnum;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
import org.openimaj.hardware.kinect.freenect.libfreenectLibrary.freenect_tilt_status_code;

/**
 * <i>native declaration : /usr/include/stdint.h</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.free.fr/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("freenect")
@SuppressWarnings({"unchecked", "rawtypes"})
public class freenect_raw_tilt_state extends StructObject {
	public freenect_raw_tilt_state() {
		super();
	}
	public freenect_raw_tilt_state(Pointer pointer) {
		super(pointer);
	}
	/// < Raw accelerometer data for X-axis, see FREENECT_COUNTS_PER_G for conversion
	@Field(0) 
	public short accelerometer_x() {
		return this.io.getShortField(this, 0);
	}
	/// < Raw accelerometer data for X-axis, see FREENECT_COUNTS_PER_G for conversion
	@Field(0) 
	public freenect_raw_tilt_state accelerometer_x(short accelerometer_x) {
		this.io.setShortField(this, 0, accelerometer_x);
		return this;
	}
	/// < Raw accelerometer data for Y-axis, see FREENECT_COUNTS_PER_G for conversion
	@Field(1) 
	public short accelerometer_y() {
		return this.io.getShortField(this, 1);
	}
	/// < Raw accelerometer data for Y-axis, see FREENECT_COUNTS_PER_G for conversion
	@Field(1) 
	public freenect_raw_tilt_state accelerometer_y(short accelerometer_y) {
		this.io.setShortField(this, 1, accelerometer_y);
		return this;
	}
	/// < Raw accelerometer data for Z-axis, see FREENECT_COUNTS_PER_G for conversion
	@Field(2) 
	public short accelerometer_z() {
		return this.io.getShortField(this, 2);
	}
	/// < Raw accelerometer data for Z-axis, see FREENECT_COUNTS_PER_G for conversion
	@Field(2) 
	public freenect_raw_tilt_state accelerometer_z(short accelerometer_z) {
		this.io.setShortField(this, 2, accelerometer_z);
		return this;
	}
	/// < Raw tilt motor angle encoder information
	@Field(3) 
	public byte tilt_angle() {
		return this.io.getByteField(this, 3);
	}
	/// < Raw tilt motor angle encoder information
	@Field(3) 
	public freenect_raw_tilt_state tilt_angle(byte tilt_angle) {
		this.io.setByteField(this, 3, tilt_angle);
		return this;
	}
	/**
	 * < State of the tilt motor (stopped, moving, etc...)<br>
	 * C type : freenect_tilt_status_code
	 * @return the tilt state
	 */
	@Field(4) 
	public ValuedEnum<freenect_tilt_status_code > tilt_status() {
		return this.io.getEnumField(this, 4);
	}
	/**
	 * < State of the tilt motor (stopped, moving, etc...)<br>
	 * C type : freenect_tilt_status_code
	 * @param tilt_status 
	 * @return return the tilt state
	 */
	@Field(4) 
	public freenect_raw_tilt_state tilt_status(ValuedEnum<freenect_tilt_status_code > tilt_status) {
		this.io.setEnumField(this, 4, tilt_status);
		return this;
	}
}
