package com.mccoy.providers;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("bankservices")
public class Myservices 
{
	@GET
	//@Produces(MediaType.APPLICATION_JSON)
	public Map<String,Integer> getservice()
	{
		Mydao dao=new Mydao();
		List l=(List) dao.fetchAll();
		System.out.println(l);
	/*	Map<String, Integer> map=new HashMap<>();
		map.put("SBI",5);
		map.put("Canara",4);
		map.put("ICICI", 3);
		map.put("BOI",2);
		return map;*/
		return null;
		
	}
	
	
}