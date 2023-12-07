package com.ld04gr02.berzerk.gui;

import com.ld04gr02.berzerk.model.Position;
import com.ld04gr02.berzerk.model.menu.GameOverMenu;
import com.ld04gr02.berzerk.model.menu.InstructionsMenu;
import com.ld04gr02.berzerk.model.menu.MainMenu;
import com.ld04gr02.berzerk.model.menu.PauseMenu;

import java.awt.*;
import java.io.IOException;
import java.net.URISyntaxException;

public interface GUI {
    void clear();

    void refresh() throws IOException;

    void close() throws IOException;

    public void drawFrame(int width, int height);
    public void drawWall(Position position, String color);
    public void drawEvilSmile(Position position);

    public void drawSprite(Position position, String[] sprite, char symbol, String color);

    public void drawMainMenu(MainMenu model);

    public void drawGameOverMenu(GameOverMenu model);

    public void drawPauseMenu(PauseMenu model);

    public void drawInstructionsMenu(InstructionsMenu model);

    public KEY getPressedKey() throws IOException;
    public String getCharPressedKey() throws IOException;


    public void createGameScreen(int width, int height) throws URISyntaxException, IOException, FontFormatException;
    public void createMenuScreen(int width, int height) throws IOException, URISyntaxException, FontFormatException;

    enum KEY {
        ARROW_LEFT,
        ARROW_RIGHT,
        ARROW_UP,
        ARROW_DOWN,
        ENTER,
        ESC,
        SPACE,
        CHAR,
        NONE;
    }
}