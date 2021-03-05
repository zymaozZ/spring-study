package soundsystem;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("HardDayNight")
public class HardDayNight implements CompactDisc {

    public void play() {
        System.out.println("in HardDayNight");
    }

    public void playTrack(int trackNumber) {

    }
}
