package ch.bitz.designpatterns.structural.adapterself;

public class GodfatherDVD implements DVD {

	@Override
	public void play() {
		System.out.println("Watching Godfather DVD");
	}

	@Override
	public void eject() {
		System.out.println("Ejected Godfather DVD");
	}

}
