package soundsystem;

import org.springframework.context.annotation.*;
import org.springframework.core.env.Environment;

@Configuration
//@ComponentScan
public class CDPlayerConfig {

    Environment

    @Bean(name = "lonelyHeartsClubBand")
    public CompactDisc sgtPeppers() {
        return new SgtPeppers();
    }

    @Bean
    public CDPlayer cdPlayer() {
        return new CDPlayer(sgtPeppers());
    }

    @Profile("")
    @Bean
    public CompactDisc randomBeatlesCD() {
        int choice = (int) Math.floor(Math.random() * 4);
        if (choice == 0) {
            return new SgtPeppers();
        } else if (choice == 1) {
            return new WhiteAlbum();
        } else if (choice == 2 ) {
            return new HardDayNight();
        } else {
            return new Revolver();
        }
    }
}
