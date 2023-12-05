package com.ld04gr02.berzerk.model.game.elements;

import com.ld04gr02.berzerk.model.Direction;

public class StickMan extends MovingElement {
    static final int MAX_LIVES = 5;
    private int lives = 3;
    private int score = 0;
    private boolean collided = false;
    private boolean isShooting = false;

    public StickMan(int x, int y, Direction direction) {
        super(x, y, direction);

    }
    public boolean increaseLives() {
        if(this.lives < MAX_LIVES) {
            this.lives++;
            return true;
        }
        return false;
    }

    public void decreaseLives() {
        this.lives--;
    }

    public int getLives() {
        return lives;
    }

    public  int getMaxLives() {
        return MAX_LIVES;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getScore() {
        return score;
    }

    public boolean isCollided() {
        return collided;
    }
    public void setCollided(boolean collided) {
        this.collided = collided;
    }

    public boolean isShooting() {
        return isShooting;
    }

    public void setShooting(boolean shooting) {
        isShooting = shooting;
    }
}
