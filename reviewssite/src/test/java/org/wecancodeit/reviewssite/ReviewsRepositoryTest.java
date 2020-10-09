package org.wecancodeit.reviewssite;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Collection;

public class ReviewsRepositoryTest {

    private ReviewRepository underTest;
    Review reviewOne = new Review(12, "title", "image url", "review category", "content", "accessor");
    Review reviewTwo = new Review(13, "title", "image url", "review category", "content", "accessor");

    @Test
    public void shouldFindReviewOne() {
        ReviewRepository underTest = new ReviewRepository(reviewOne);
        Review foundReview = underTest.findOne(12);
        assertEquals(reviewOne, foundReview);
    }

    @Test
    public void shouldFindReviewOneAndTwo() {
        ReviewRepository underTest = new ReviewRepository(reviewOne, reviewTwo);
        Collection<Review> foundReviews = underTest.findAll();
        assertThat(foundReviews).contains(reviewOne, reviewTwo);

    }


}
