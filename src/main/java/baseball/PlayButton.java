package baseball;

public class PlayButton {
    private static final String PLAY_AGAIN_BUTTON = "1";
    private static final String PLAY_END_BUTTON = "2";

    private final String playAgainButton;

    public PlayButton(String playAgainButton) throws IllegalAccessError {
        this.playAgainButton = playAgainButton;
    }

    public boolean playAgain() {
        return playAgainButton.equals(PLAY_AGAIN_BUTTON);
    }
}
