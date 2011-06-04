package com.leetr.game;

import com.badlogic.gdx.Application;
import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.Gdx;

/**
 * Created By: Denis Smirnov <denis@deesastudio.com>
 * <p/>
 * Date: 11-06-04
 * Time: 10:36 AM
 */
public abstract class GdxGame implements ApplicationListener{
    Screen screen;
    /**
     * Called when the {@link com.badlogic.gdx.Application} is first created.
     */
    @Override
    public void create() {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    /**
     * Called when the {@link com.badlogic.gdx.Application} is resumed from a paused state. On Android this happens when the activity gets focus
     * again. On the desktop this method will never be called.
     */
    @Override
    public void resume() {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    /**
     * Called when the {@link com.badlogic.gdx.Application} should render itself.
     */
    @Override
    public void render() {
        Application app = Gdx.app;
    }

    /**
     * Called when the {@link com.badlogic.gdx.Application} is resized. This can happen at any point during a non-paused state but will never happen
     * before a call to {@link #create()}.
     *
     * @param width  the new width in pixels
     * @param height the new height in pixels
     */
    @Override
    public void resize(int width, int height) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    /**
     * Called when the {@link com.badlogic.gdx.Application} is paused. An Application is paused before it is destroyed, when a user pressed the Home
     * button on Android or an incoming call happend. On the desktop this will only be called immediately before {@link #dispose()}
     * is called.
     */
    @Override
    public void pause() {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    /**
     * Called when the {@link com.badlogic.gdx.Application} is destroyed. Preceded by a call to {@link #pause()}.
     */
    @Override
    public void dispose() {
        //To change body of implemented methods use File | Settings | File Templates.
    }
}
