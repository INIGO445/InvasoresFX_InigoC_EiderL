package com.aetxabao.invasoresfx.sprite;

import com.aetxabao.invasoresfx.sprite.weaponry.AShot;
import com.aetxabao.invasoresfx.sprite.weaponry.AWeapon;
import com.aetxabao.invasoresfx.util.Rect;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;

import java.util.ArrayList;

public class Teletranporte extends EnemyShip implements ICanTeleport{
    @Override
    public void setWeapon(AWeapon weapon) {
        super.setWeapon(weapon);
    }

    @Override
    public boolean hasWeapon() {
        return super.hasWeapon();
    }

    @Override
    public ArrayList<AShot> shoot() {
        return super.shoot();
    }

    @Override
    public void setPos(int x, int y) {
        super.setPos(x, y);
    }

    @Override
    public int getXSpeed() {
        return super.getXSpeed();
    }

    @Override
    public void setXSpeed(int xSpeed) {
        super.setXSpeed(xSpeed);
    }

    @Override
    public int getYSpeed() {
        return super.getYSpeed();
    }

    @Override
    public void setYSpeed(int ySpeed) {
        super.setYSpeed(ySpeed);
    }

    @Override
    public Rect[] getRects() {
        return super.getRects();
    }

    @Override
    public boolean collides(ASprite sprite) {
        return super.collides(sprite);
    }

    @Override
    public void setVidas(int vidas) {
        super.setVidas(vidas);
    }

    @Override
    public int getVidas() {
        return super.getVidas();
    }

    @Override
    public void updateFrame() {
        super.updateFrame();
    }

    @Override
    public Rect getRect() {
        return super.getRect();
    }

    @Override
    public void update() {
        super.update();
    }

    @Override
    public void draw(GraphicsContext gc) {
        super.draw(gc);
    }

    public Teletranporte(Rect gameRect, Image img, int N) {
        super(gameRect, img, N);
    }

    @Override
    public boolean impact() {
        return true;
    }
    
    @Override
    public void teleport() {
        int randomX = (int) (Math.random()*230*2);
        int randomY = (int) (Math.random()*500);
        setPos(randomX,randomY);
    }
}
