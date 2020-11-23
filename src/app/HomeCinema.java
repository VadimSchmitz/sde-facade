package app;

public class HomeCinema {
    private Amplifier amp;
    private Tuner tuner;
    private DvdPlayer dvd;
    private CdPlayer cd;
    private Projector projector;
    private TheaterLights lights;
    private Screen screen;
    private PopcornPopper popper;
    
    public HomeCinema(Amplifier amp, Tuner tuner, DvdPlayer dvd, CdPlayer cd, Projector projector, TheaterLights lights, Screen screen, PopcornPopper popper) {
        this.amp = amp;
        this.tuner = tuner;
        this.dvd = dvd;
        this.cd = cd;
        this.projector = projector;
        this.lights = lights;
        this.screen = screen;
        this.popper = popper;
    }

    /**
     * Start playing a movie
     */
    public void playMovie(String movie) {
        this.popper.on();
        this.popper.pop();
        this.lights.dim(10);
        this.screen.down();
        this.projector.on();
        this.projector.wideScreenMode();
        this.amp.on();
        this.amp.setDvd(this.dvd);
        this.amp.setSurroundSound();
        this.amp.setVolume(5);
        this.dvd.on();
        this.dvd.play(movie);
    }

    /**
     * Stop playing a movie
     */
    public void stopMovie() {
        this.popper.off();
        this.lights.on();
        this.screen.up();
        this.projector.off();
        this.amp.off();
        this.dvd.stop();
        this.dvd.eject();
        this.dvd.off();
    }

    /**
     * Start playing music
     */
    public void playMusic(String track) {
        this.lights.on();
        this.amp.on();
        this.amp.setVolume(5);
        this.amp.setCd(this.cd);
        this.amp.setStereoSound();
        this.cd.on();
        this.cd.play(track);
    }

    /**
     * Stop playing music
     */
    public void stopMusic() {
        this.amp.off();
        this.amp.setCd(this.cd);
        this.cd.eject();
        this.cd.off();
    }

    /**
     * Start playing the radio
     */
    public void playRadio(double frequency) {
        this.tuner.on();
        this.tuner.setFrequency(frequency);
        this.amp.on();
        this.amp.setVolume(5);
        this.amp.setTuner(this.tuner);
    }

    /**
     * Stop playing the radio
     */
    public void stopRadio() {
        this.tuner.off();
        this.amp.off();
    }
}
