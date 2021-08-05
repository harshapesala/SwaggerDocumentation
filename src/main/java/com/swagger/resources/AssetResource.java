package com.swagger.resources;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/asset")
public class AssetResource {
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	@PathParam("/{ahn}/property")
	public String getAssetDetails(@PathParam("ahn") String assectHolderName) {
		return assectHolderName;
		
	}

}
