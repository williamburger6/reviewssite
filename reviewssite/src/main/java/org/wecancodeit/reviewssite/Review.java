package org.wecancodeit.reviewssite;

public class Review {

    private Long id;
    private String title;
    private String image;
    private String reviewCategory;
    private String content;
    private String accessor;


    public Long getId() {
        return id;
    }

    public String getTitle(){
        return title;
    }

    public String getImage(){
        return image;
    }

    public String getReviewCategory(){
        return reviewCategory;
    }

    public String getContent(){
        return content;
    }

    public String getAccessor(){
        return accessor;
    }

    public Review(long id, String title, String image, String reviewCategory, String content, String accessor) {
        this.id = id;
        this.title = title;
        this.image = image;
        this.reviewCategory = reviewCategory;
        this.content = content;
        this.accessor = accessor;
    }
}
