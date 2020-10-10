package org.wecancodeit.reviewssite;

import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
public class ReviewRepository {

    Map<Long, Review> reviewList = new HashMap<>();

    public ReviewRepository(){
        Review scarHands = new Review(1L,"Scar Hands","/images/action","Action","2.5 Hours","One of the best films of the year");
        Review lifeWithKids = new Review(2L,"Life With Kids","/images/romcom","Rom Com","1.5 Hours","SometimesI laughed, sometimes I cried");
        Review scaryHarry = new Review(3L,"Scary Harry","/images/scary","Horror","3 Hours","One of the worst films of the year");

        reviewList.put(scarHands.getId(), scarHands);
        reviewList.put(lifeWithKids.getId(), lifeWithKids);
        reviewList.put(scaryHarry.getId(), scaryHarry);

    }

    public ReviewRepository (Review ...reviewsToAdd) {
        for(Review review: reviewsToAdd){
            reviewList.put(review.getId(), review);
        }
    }

    public Review findOne(long id) {
        return reviewList.get(id);
    }

    public Collection<Review> findAll() {
        return reviewList.values();
    }
}
