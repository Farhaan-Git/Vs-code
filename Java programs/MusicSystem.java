interface Playable{
	void play();
	void stop();
}
class Mp3Player implements Playable{
	boolean play=false;
	public void play() {
		if(!play) {
			System.out.println("Mp3 player is playing...");
			play=true;
		}
		else {
			System.out.println("Mp3 player is already playing...");
		}
	}
	public void stop() {
		if(play) {
			System.out.println("Mp3 player is stoped playing..");
			play=false;
		}
		else {
			System.out.println("Mp3 player is already stoped playing..");
		}
	}
}
class Radio implements Playable{
	boolean play=false;
	public void play() {
		if(!play) {
			System.out.println("Radio is playing...");
			play=true;
		}
		else {
			System.out.println("Radio is already playing...");
		}
	}
	public void stop() {
		if(play) {
			System.out.println("Radio is stoped playing..");
			play=false;
		}
		else {
			System.out.println("Radio is already stoped playing..");
		}
	}
}
public class MusicSystem {

	public static void main(String[] args) {
		Mp3Player mp3 = new Mp3Player();
		Radio r = new Radio();
		mp3.play();
		mp3.stop();
		r.play();
		r.stop();
	}

}
