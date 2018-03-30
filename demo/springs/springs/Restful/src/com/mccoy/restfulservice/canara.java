package com.mccoy.restfulservice;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("canara")
public class canara
{
	   @GET
	   @Produces(MediaType.TEXT_PLAIN)
	   public int getmessage()
	   {
		int rate=4;
		return rate;
		}

}
