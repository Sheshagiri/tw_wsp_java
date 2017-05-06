package org.books.services;

import junit.framework.Assert;
import junit.framework.TestCase;

public class ReviewServiceTest extends TestCase {
	ReviewService review;
	protected void setUp() throws Exception {
		review = new ReviewService();
		super.setUp();
	}

	public void testAddReview() {
		Assert.assertEquals("adding review.", review.addReview(null).getEntity().toString());
	}

	public void testGetAllReviews() {
		Assert.assertEquals("get all the reviews.", review.getAllReviews().getEntity().toString());
	}

	public void testGetReview() {
		Assert.assertEquals("get review 123456", review.getReview("123456").getEntity().toString());
	}

	public void testDeleteReviewString() {
		Assert.assertEquals("delete review 123456", review.deleteReview("123456").getEntity().toString());
	}

	public void testUpdateReview() {
		Assert.assertEquals("update review 123456", review.updateReview("123456", null).getEntity().toString());
	}

}
