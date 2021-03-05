package soundsystem;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("Revolver")
public class Revolver implements CompactDisc {

    public void play() {
        System.out.println("inn revolver");
    }

    public void playTrack(int trackNumber) {

    }
}
