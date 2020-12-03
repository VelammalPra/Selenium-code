package week3.day1;

public class Smartphone extends Androidphone {
	public void connectWhatsapp() {
		System.out.println("Whatsapp is connected");

	}
	public void takeVideo() {
		System.out.println("Video is taken brightly");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Smartphone sp = new Smartphone();
		sp.connectWhatsapp();
		sp.makeCall();
		sp.saveConatct();
		sp.sendSMS();
		sp.takeVideo();

	}

}