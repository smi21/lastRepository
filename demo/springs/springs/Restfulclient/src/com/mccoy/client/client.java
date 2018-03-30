package com.mccoy.client;

import java.net.URI;
import java.util.Scanner;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriBuilder;

import org.glassfish.jersey.client.ClientConfig;

public class client 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		ClientConfig config = new ClientConfig();

		System.out.println("client configured");

		Client client = ClientBuilder.newClient(config);
		System.out.println("new client");

		WebTarget target = client.target(getBaseURI());
		System.out.println(target);
		System.out.println("geturl done");

		System.out.println("1.SBI");
		int plainAnswer =
				target.path("rest").path("sbi").request().accept(MediaType.TEXT_PLAIN).get(Integer.class);
		System.out.println("Rate= "+plainAnswer);

		
		System.out.println("2.Canara");
		int plainAnswer1 =
				target.path("rest").path("canara").request().accept(MediaType.TEXT_PLAIN).get(Integer.class);
		System.out.println("Rate= "+plainAnswer1);
		
		
		System.out.println("Enter your choice");
		int ch=sc.nextInt();
		switch (ch) 
		{
		case 1:
			
			System.out.println("enter Amount");
			double am=sc.nextDouble();
			System.out.println("enter time");
			int t=sc.nextInt();
			String response = target.path("rest").path("sbi").request().accept(MediaType.TEXT_PLAIN).get(Response.class).toString();
			System.out.println(response);

			
			System.out.println(plainAnswer);
			double si=(am*t*plainAnswer)/100;
			System.out.println("Simple interest= "+si);
		break;
		case 2:
			System.out.println("enter Amount");
			double am1=sc.nextDouble();
			System.out.println("enter time");
			int t1=sc.nextInt();
			
			String response1 = target.path("rest").path("canara").request().accept(MediaType.TEXT_PLAIN).get(Response.class).toString();
			System.out.println(response1);

		
		System.out.println(plainAnswer1);
		double si1=(am1*t1*plainAnswer1)/100;
		System.out.println("Simple interest= "+si1);

		default:
			break;
		}


		/*   String response = target.path("rest").path("sbi").request().accept(MediaType.TEXT_PLAIN).get(Response.class).toString();
        System.out.println(response);

        String plainAnswer =
                target.path("rest").path("sbi").request().accept(MediaType.TEXT_PLAIN).get(String.class);
     /*   String xmlAnswer =
                target.path("rest").path("canara").request().accept(MediaType.TEXT_PLAIN).get(String.class);
        String htmlAnswer=
                target.path("rest").path("icici").request().accept(MediaType.TEXT_PLAIN).get(String.class);*/

		//System.out.println(response);
		// System.out.println(plainAnswer);
		//   System.out.println(xmlAnswer);
		// System.out.println(htmlAnswer);
	}
	private static URI getBaseURI() 
	{
		return UriBuilder.fromUri("http://localhost:8050/Restful").build();
	}

}