package Encapulations;

class Tv {

	//int volume,brightness;
	private int volume,brightness;// encaplation 
	
	public Tv (int volume,int brightness){                                      //1-Zero parameter constracter
							                   		      //2- No argument constructer
											//3- Defult constracter
		
		//if (volume<=50 && brightness) {
			this.brightness=brightness;
		    this.volume = volume ;
		}
		//System.out.println("Tv object ceated");
	//}
	
	public void watchMovie()  {

		System.out.println("Watching moviein a tv");
	
	}



	public int getVolume() {
		return volume;
	}



	public void setVolume(int volume) {
		this.volume = volume;
	
			if (volume<=50) {
				this.volume=volume;
			}
	}
	

	public int getBrightness() {
		return brightness;
	}



	public void setBrightness(int brightness) {
		this.brightness = brightness;
	}
}
    public class Home {
	
   public static void main(String [] args) {
	   Tv t= new Tv();
	   t.setVolume(40);
	   t.setBrightness(100);
	   System.out.println(t.getVolume());
	   System.out.println(t.getBrightness());
   }
	}


