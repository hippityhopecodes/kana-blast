package com.kanablast.service;
import main.java.com.kanablast.service.GameService;
import main.java.com.kanablast.model.JapaneseCharacter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Tests GameService class
 * @author hippityhopecodes
 */
public class GameServiceTest {

    private GameService gameService;

    @BeforeEach
    public void setUp() {
        gameService = new GameService();
    }

    @Test
    public void testCheckAnswer_Correct() {
        assertTrue(gameService.checkAnswer("ア", "a"));
    }

    @Test
    public void testCheckAnswer_Incorrect() {
        assertFalse(gameService.checkAnswer("ア", "i"));
    }

    @Test
    public void testIncrementScore() {
        gameService.incrementScore(10);
        assertEquals(10, gameService.getScore());
    }

    @Test
    public void testGetSecondsRemaining() {
        assertEquals(60, gameService.getSecondsRemaining());
    }

    @Test
    public void testDecrementTime() {
        gameService.decrementTime();
        assertEquals(59, gameService.getSecondsRemaining());
    }

    @Test
    public void testResetGame() {
        gameService.incrementScore(10);
        gameService.decrementTime();
        gameService.resetGame();
        assertEquals(0, gameService.getScore());
        assertEquals(60, gameService.getSecondsRemaining());
    }
}
