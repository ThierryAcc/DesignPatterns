package ch.bitz.designpatterns.structural.adapterself;

public class Video2DVDAdapter implements DVD {

	Video video;
	
	public Video2DVDAdapter(Video video) {
		super();
		this.video = video;
	}

	@Override
	public void play() {
		video.forward();
		video.play();
	}

	@Override
	public void eject() {
		video.forward();
		video.eject();
	}

}
