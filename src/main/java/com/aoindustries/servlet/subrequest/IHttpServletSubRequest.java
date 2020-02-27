/*
 * ao-servlet-subrequest - Servlet sub-request wrappers with optional concurrency.
 * Copyright (C) 2019, 2020  AO Industries, Inc.
 *     support@aoindustries.com
 *     7262 Bull Pen Cir
 *     Mobile, AL 36695
 *
 * This file is part of ao-servlet-subrequest.
 *
 * ao-servlet-subrequest is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * ao-servlet-subrequest is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with ao-servlet-subrequest.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.aoindustries.servlet.subrequest;

import javax.servlet.http.HttpServletRequest;

public interface IHttpServletSubRequest extends IServletSubRequest, HttpServletRequest {

	/**
	 * Overrides the method for the subrequest.
	 */
	void setMethod(String method);

	/**
	 * Checks if {@link #logout()} was called during the subrequest.
	 */
	boolean isLoggedOut();
}
