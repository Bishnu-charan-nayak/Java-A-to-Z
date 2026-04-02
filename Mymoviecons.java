package myConsumer;
	import java.util.Objects;

	class Movie {
	     String name;
	     String review;
	     String collection;

	    // Constructor
	    public Movie(String name, String review, String collection) {
	        this.name = name;
	        this.review = review;
	        this.collection = collection;
	    }

	    // Getters
	    public String getName() {
	        return name;
	    }

	    public String getReview() {
	        return review;
	    }

	    public String getCollection() {
	        return collection;
	    }

	    // Setters
	    public void setName(String name) {
	        this.name = name;
	    }

	    public void setReview(String review) {
	        this.review = review;
	    }

	    public void setCollection(String collection) {
	        this.collection = collection;
	    }

	    // toString()
	    @Override
	    public String toString() {
	        return "Movie [name=" + name + ", review=" + review + ", collection=" + collection + "]";
	    }

	    // equals()
	    @Override
	    public boolean equals(Object o) {
	        if (this == o) return true;
	        if (!(o instanceof Movie)) return false;
	        Movie movie = (Movie) o;
	        return Objects.equals(name, movie.name) &&
	               Objects.equals(review, movie.review) &&
	               Objects.equals(collection, movie.collection);
	    }

	    // hashCode()
	    @Override
	    public int hashCode() {
	        return Objects.hash(name, review, collection);
	    }
	}


public class Mymoviecons {
	public static void main(String[] args) {

        Movie m1 = new Movie("RRR", "Super Hit", "₹1100Cr");
        Movie m2 = new Movie("Avatar", "Super Hit", "₹990Cr");
        Movie m3 = new Movie("Kgf", "Super Hit", "₹1500Cr");
        Movie m4 = new Movie("Chote Miya Bademiya", "Flop", "₹390Cr");
        Movie m5 = new Movie("Spider-Man", "Super Hit", "₹15,950 Cr");
        Movie m6 = new Movie("End Game", "Super Hit", " ₹19,000 cr");
        Movie m7 = new Movie("Durandhar", "Super Hit", "₹1460Cr");

        System.out.println(m1);
        System.out.println(m2);
        System.out.println(m3);
        System.out.println(m4);
        System.out.println(m5);
        System.out.println(m6);
        System.out.println(m7);

        System.out.println("Equals: " + m1.equals(m2));

	}

}
