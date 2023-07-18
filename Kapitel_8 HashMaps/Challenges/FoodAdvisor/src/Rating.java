/**
 * This class represents a rating for a restaurant, including the number of upvotes, downvotes, and the name of the restaurant.
 */
public class Rating {
    private  int upvotes;
    private int downvotes;

    /**
     * Returns the number of upvotes for this rating.
     * @return the number of upvotes
     */
    public int getUpvotes() {
        return upvotes;
    }

    /**
     * Sets the number of upvotes for this rating.
     * @param upvotes the number of upvotes to set
     */
    public void setUpvotes(int upvotes) {
        this.upvotes = upvotes;
    }

    /**
     * Returns the number of downvotes for this rating.
     * @return the number of downvotes
     */
    public int getDownvotes() {
        return downvotes;
    }

    /**
     * Sets the number of downvotes for this rating.
     * @param downvotes the number of downvotes to set
     */
    public void setDownvotes(int downvotes) {
        this.downvotes = downvotes;
    }

    public float getRating() {
        return 100 / (upvotes + downvotes) * upvotes;
    }


    /**
     * Constructs a new Rating object with the specified number of upvotes, downvotes.
     * @param upvotes the number of upvotes for this rating
     * @param downvotes the number of downvotes for this rating
     */
    public Rating(int upvotes, int downvotes) {
        this.upvotes = upvotes;
        this.downvotes = downvotes;
    }

    
}
