/*
 * JBoss, Home of Professional Open Source.
 * Copyright 2006, Red Hat Middleware LLC, and individual contributors
 * as indicated by the @author tags. See the copyright.txt file in the
 * distribution for a full listing of individual contributors.
 *
 * This is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation; either version 2.1 of
 * the License, or (at your option) any later version.
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this software; if not, write to the Free
 * Software Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA
 * 02110-1301 USA, or see the FSF site: http://www.fsf.org.
 */
package org.jboss.wsf.spi.invocation;

import org.jboss.wsf.spi.deployment.Endpoint;

/**
 * Associates the endpoint meta data with the current thread. 
 * 
 * @author Thomas.Diesler@jboss.org
 * @since 10-May-2007
 */
public final class EndpointAssociation
{
   private static final ThreadLocal<Endpoint> endpoint = new ThreadLocal<Endpoint>();

   public static void setEndpoint(Endpoint ep)
   {
      endpoint.set(ep);
   }

   public static Endpoint getEndpoint()
   {
      return endpoint.get();
   }

   public static void removeEndpoint()
   {
      endpoint.remove();
   }
}
