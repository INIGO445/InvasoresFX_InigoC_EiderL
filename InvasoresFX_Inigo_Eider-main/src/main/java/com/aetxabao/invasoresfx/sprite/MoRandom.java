package com.aetxabao.invasoresfx.sprite;

import com.aetxabao.invasoresfx.sprite.weaponry.AShot;
import com.aetxabao.invasoresfx.sprite.weaponry.AWeapon;
import com.aetxabao.invasoresfx.util.Rect;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;

import java.util.ArrayList;

public class MoRandom extends EnemyShipDiagonal implements Random{
    public MoRandom(Rect gameRect, Image img, int N) {
        super(gameRect, img, N);
    }

    @Override
    public boolean impact() {
        return true;
    }
    public int getX()
    {
        return super.x;
    }
    public int getY()
    {
        return super.y;
    }
    @Override
    public void cambio() {
        int random = (int) (Math.random()*15 + 1);
        int randomX = (int) (Math.random()*20 - 10);
        int randomY = (int) (Math.random()*20 - 10);

        if (getXSpeed() %2 != 0)
        {
            int randomA = (int) (Math.random()*2 + 1);
            if (randomA == 1)
            {
                setXSpeed(getXSpeed() -1);
            }
            else
            {
                setXSpeed(getXSpeed() +1);
            }
        }
        if (getYSpeed() %2 != 0)
        {
            int randomB = (int) (Math.random()*2 + 1);
            if (randomB == 1)
            {
                setYSpeed(getYSpeed() -1);
            }
            else
            {
                setYSpeed(getYSpeed() +1);
            }
        }
        if (getXSpeed() == 0)
        {
            setXSpeed(5);
        }
        if (getYSpeed() == 0)
        {
            setYSpeed(5);
        }
        switch (random)
        {
            case 1:
                setXSpeed(getXSpeed() * 2);
                break;
            case 2:
                int a = (int) getXSpeed() /2;
                setXSpeed(getXSpeed() / 2);
                break;
            case 3:
                setYSpeed(getYSpeed() * 2);
                break;
            case 4:
                setYSpeed(getYSpeed() / 2);
                break;
            case 5:
                setYSpeed(-getYSpeed());
                break;
            case 6:
                setXSpeed(-getXSpeed());
                break;
            case 7:
                setXSpeed(0);
                break;
            case 8:
                setYSpeed(0);
                break;
            case 9:
                setXSpeed(0);
                setYSpeed(0);
                break;
            case 10:
                setYSpeed(-getYSpeed() * 2);
                break;
            case 11:
                setYSpeed(-getYSpeed() / 2);
                break;
            case 12:
                setXSpeed(-getXSpeed() * 2);
                break;
            case 13:
                setXSpeed(-getXSpeed() / 2);
                break;
            case 14:
                setXSpeed(randomX);
                setYSpeed(randomY);
                break;
            case 15:
                setXSpeed(randomX);
                break;
            case 16:
                setYSpeed(randomY);
                break;
            case 17:
                setXSpeed(randomX * 2);
                break;
            case 18:
                setYSpeed(randomY * 2);
                break;
            case 19:
                setXSpeed(randomX / 2);
                break;
            case 20:
                setYSpeed(randomY / 2);
                break;
            default:
                break;
        }
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
    public void setTeleport(boolean teleport) {
        super.setTeleport(teleport);
    }

    @Override
    public boolean isTeleport() {
        return super.isTeleport();
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
}
