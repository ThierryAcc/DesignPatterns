package ch.bitz.designpatterns.structural.adapterself;

public class GodfatherVideo implements Video {

	@Override
	public void play() {
		System.out.println("Watching Godfather VIDEO");
	}

	@Override
	public void eject() {
		System.out.println("Ejected Godfather VIDEO");
	}

	@Override
	public void forward() {
		System.out.println("Forwarded Godfather VIDEO");
	}

}
