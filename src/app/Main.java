package app;

public class Main {

    public static void main(String[] args) {
        Amplifier amp = new Amplifier("Top-O-Line Amplifier");
        Tuner tuner = new Tuner("Top-O-Line AM/FM Tuner", amp);
        DvdPlayer dvd = new DvdPlayer("Top-O-Line DVD Player", amp);
        CdPlayer cd = new CdPlayer("Top-O-Line CD Player", amp);
        Projector projector = new Projector("Top-O-Line Projector", dvd);
        TheaterLights lights = new TheaterLights("Theater Ceiling Lights");
        Screen screen = new Screen("Theater Screen");
        PopcornPopper popper = new PopcornPopper("Popcorn Popper");

        HomeCinema cinema = new HomeCinema(
                amp,
                tuner,
                dvd,
                cd,
                projector,
                lights,
                screen,
                popper
        );

        cinema.playMovie("The Lord of The Rings: The Fellowship of the Ring");
        cinema.stopMovie();

        cinema.playMusic("Rick Astley - Never Gonna Give You Up");
        cinema.stopMusic();

        cinema.playRadio(133.7);
        cinema.stopRadio();
    }
}
