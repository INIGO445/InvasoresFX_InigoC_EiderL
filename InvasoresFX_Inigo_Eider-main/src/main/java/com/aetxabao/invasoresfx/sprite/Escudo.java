package com.aetxabao.invasoresfx.sprite;

import com.aetxabao.invasoresfx.sprite.weaponry.AShot;
import com.aetxabao.invasoresfx.sprite.weaponry.AWeapon;
import com.aetxabao.invasoresfx.util.Rect;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;

import java.util.ArrayList;

public class Escudo extends EnemyShip implements IHaveShield{

    public Escudo(Rect gameRect, Image img, int N) {
        super(gameRect, img, N);
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
    public boolean impact() {
        return true;
    }
}
