package week3.day1;

public class Androidphone extends Mobile {
	public void takeVideo() {
		System.out.println("Video is taken");
	}
	public static void main(String[] args) {
		Androidphone ap = new Androidphone();
		ap.saveConatct();
		ap.sendSMS();
		ap.takeVideo();
		ap.makeCall();
{
	
}

	}

}
