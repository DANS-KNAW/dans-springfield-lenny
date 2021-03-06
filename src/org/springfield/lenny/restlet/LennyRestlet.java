/* 
* LennyRestlet.java
* 
* Copyright (c) 2016 Noterik B.V.
* 
* This file is part of Lenny, related to the Noterik Springfield project.
*
* Lenny is free software: you can redistribute it and/or modify
* it under the terms of the GNU General Public License as published by
* the Free Software Foundation, either version 3 of the License, or
* (at your option) any later version.
*
* Lenny is distributed in the hope that it will be useful,
* but WITHOUT ANY WARRANTY; without even the implied warranty of
* MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
* GNU General Public License for more details.
*
* You should have received a copy of the GNU General Public License
* along with Lenny.  If not, see <http://www.gnu.org/licenses/>.
*/
package org.springfield.lenny.restlet;

import org.restlet.Context;
import org.restlet.routing.Router;

/**
 * LennyRestlet.java
 *
 * @author Pieter van Leeuwen
 * @copyright Copyright: Noterik B.V. 2016
 * @package org.springfield.lenny.restlet
 * 
 */
public class LennyRestlet extends Router {
	
	public LennyRestlet(Context cx) {
		super (cx);
		
		this.attach("/logging", LoggingResource.class);
		this.attachDefault(LennyResource.class);
	}
}
