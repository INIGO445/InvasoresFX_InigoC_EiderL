package com.aetxabao.invasoresfx.sprite.weaponry;

import com.aetxabao.invasoresfx.sprite.ASprite;

import java.util.ArrayList;

import static com.aetxabao.invasoresfx.game.AppConsts.BALL_SPRITE_IMAGE;
import static com.aetxabao.invasoresfx.game.AppConsts.FANTASMA;

public class Fantasma extends AWeapon{
    @Override
    public ArrayList<AShot> shoot(ASprite sprite) {
        ArrayList<AShot> list = new ArrayList<>();
        AShot shot = new Cannonball(FANTASMA);
        shot.setPos(sprite.getRect().centerX(), sprite.getRect().bottom);
        list.add(shot);
        return list;
    }
}
