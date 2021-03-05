package soundsystem;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("WhiteAlbum")
public class WhiteAlbum implements CompactDisc {

    public void play() {
        System.out.println("in whiteAlbum");
    }

    public void playTrack(int trackNumber) {

    }
}
