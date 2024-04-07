package com.aetxabao.invasoresfx.sprite;

import com.aetxabao.invasoresfx.util.Rect;
import javafx.scene.image.Image;

public class PACMAN extends EnemyShip implements SoyPacman{
    public PACMAN(Rect gameRect, Image img, int N) {
        super(gameRect, img, N);
    }

    @Override
    public boolean impact() {
        return true;
    }
}
