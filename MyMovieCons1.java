package myConsumer;
	import java.util.ArrayList;
	import java.util.Objects;
	import java.util.function.Consumer;

//	class Movie1{
//		
//		String name;
//		String review;
//		String collection;
//		
//		public Movie1(String name,String review,String collection) {
//			this.name=name;
//			this.review=review;
//			this.collection=collection;
//		}	
//		public String getName() {
//			return name;
//		}
//		public String getReview() {
//			return review;
//		}
//		public String getCollection() {
//			return collection;
//		}
//		@Override
//		public String toString() {
//			return "Movie [name=" + name + ", review=" + review + ", collection=" + collection + "]";
//		}
//		@Override
//		public int hashCode() {
//			return Objects.hash(collection, name, review);
//		}
//		@Override
//		public boolean equals(Object obj) {
//			if (this == obj)
//				return true;
//			if (obj == null)
//				return false;
//			if (getClass() != obj.getClass())
//				return false;
//			Movie other = (Movie) obj;
//			return Objects.equals(collection, other.collection) && Objects.equals(name, other.name)
//					&& Objects.equals(review, other.review);
//			
//		}
//		
//	}

	record Movie1(String Name,String Revew,String collection) {
		
	}
	public class MyMovieCons1 {

		public static void main(String[] args) {
			
			ArrayList<Movie1> al=new ArrayList<>();
			al.add(new Movie1("Dhurandar", "Hit", "10000"));
			al.add(new Movie1("Dhurandar:The revenge", "Hit", "20000"));
			al.add(new Movie1("KGF", "Hit", "15000"));
			al.add(new Movie1("Pushpa", "Hit", "9000"));
			al.add(new Movie1("Game Changer", "Flop", "5000"));
			al.add(new Movie1("Dhadak2", "Flop", "6500")); 
			al.add(new Movie1("Double iSmart", "Flop", "6900"));
			
			Consumer<Movie1> c=(m)->{
				if(m.Revew().equals("Hit")) {
					System.out.println(m.Name());
				}
			};
			for(Movie1 m:al) {
				c.accept(m);
			}

		}

	}