class Vehicle{
	
	double mileage;
	int year;
	String manufacturer;
	
	void drive(){
		System.out.println("Drive");
	}
	
}


class Car extends Vehicle{
	
	private MusicPlayer MusicPlayerObj;
	
	/*In order to create a weak association[Aggregation], the container object holds only the reference of the contained object*/
	
	void setMusicPlayer(MusicPlayer musicplayer){
		this.MusicPlayerObj = musicplayer;
	}
	
	void playMusic(){
		if(MusicPlayerObj != null){
			MusicPlayerObj.playMusic();
		}
		
	}
	
	
	private final Engine EngineObj;
	
	/*In order to create a strong association[Compostition], the container object holds directly the contained object*/
	Car(Engine engine){
		EngineObj = new Engine(engine);
	}


}


class Musicplayer{
	
	
}

class Engine{
	
	
	
}

