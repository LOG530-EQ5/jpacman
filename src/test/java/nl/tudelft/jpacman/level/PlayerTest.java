package nl.tudelft.jpacman.level;

import static org.assertj.core.api.Assertions.assertThat;

import nl.tudelft.jpacman.board.Direction;
import nl.tudelft.jpacman.sprite.PacManSprites;
import nl.tudelft.jpacman.sprite.Sprite;
import org.junit.jupiter.api.Test;

public class PlayerTest {
    /**
     * Is a Player Alive
     */
    @Test
    void isAlive() {
        PacManSprites sprite = new PacManSprites();
        PlayerFactory factory = new PlayerFactory(sprite);
        Player playerTest = factory.createPacMan();

        assertThat(playerTest.isAlive()).isTrue();
    }
}
