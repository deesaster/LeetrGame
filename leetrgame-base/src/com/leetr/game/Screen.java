package com.leetr.game;

/**
 * Created By: Denis Smirnov <denis@deesastudio.com>
 * <p/>
 * Date: 11-06-04
 * Time: 11:08 AM
 */
public abstract class Screen {
    GdxGame game;

    public Screen(GdxGame game) {
        this.game = game;
    }

    public abstract void update(float deltaTime);

    public abstract void present(float deltaTime);

    public abstract void pause();

    public abstract void resume();

    public abstract void dispose();
}
