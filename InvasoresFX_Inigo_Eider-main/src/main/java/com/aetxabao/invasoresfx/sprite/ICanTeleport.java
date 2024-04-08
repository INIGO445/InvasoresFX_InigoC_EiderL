package com.aetxabao.invasoresfx.sprite;

public interface ICanTeleport extends IHaveShield{
    @Override
    boolean impact();

    void teleport();
}
