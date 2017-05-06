package org.books.services;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

import org.library.modal.Review;

@Path("/reviews")
public class ReviewService {
	@POST
	public Response addReview(Review review){
		return Response.ok().entity("adding review.").build();
	}
	
	@GET
	public Response getAllReviews(){
		return Response.ok().entity("get all the reviews.").build();
	}
	
	@GET
	@Path("/{review-id}")
	public Response getReview(@PathParam("review-id") String reviewId){
		return Response.ok().entity("get review "+reviewId).build();
	}
	
	@DELETE
	@Path("/{review-id}")
	public Response deleteReview(@PathParam("review-id") String reviewId){
		return Response.ok().entity("delete review "+reviewId).build();
	}
	
	@PUT
	@Path("/{review-id}")
	public Response updateReview(@PathParam("review-id") String reviewId,Review review){
		return Response.ok().entity("update review "+reviewId).build();
	}
}
