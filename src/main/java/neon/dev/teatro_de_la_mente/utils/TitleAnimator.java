package neon.dev.teatro_de_la_mente.utils;

import javafx.animation.FadeTransition;
import javafx.scene.text.Text;
import javafx.util.Duration;

public class TitleAnimator {

    public static void animateFade(Text text, int durationMillis) {
        FadeTransition fade = new FadeTransition(Duration.millis(durationMillis), text);
        fade.setFromValue(0.0);
        fade.setToValue(1.0);
        fade.setCycleCount(1);
        fade.play();
    }
}
