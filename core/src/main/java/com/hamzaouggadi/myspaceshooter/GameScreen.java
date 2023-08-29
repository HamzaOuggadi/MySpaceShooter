package com.hamzaouggadi.myspaceshooter;

import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.Camera;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.viewport.StretchViewport;
import com.badlogic.gdx.utils.viewport.Viewport;

public class GameScreen implements Screen {

    //Screen
    private Camera camera;
    private Viewport viewport;

    //Graphics
    private SpriteBatch batch;
    private Texture[] backgrounds;

    //timing
    private float[] backgroundOffsets = {0,0,0,0};
    private float backgroundMaxScrollingSpeed;

    //World parameters
    private final int WORLD_WIDTH = 72;
    private final int WORLD_HEIGHT = 128;

    public GameScreen() {
        camera = new OrthographicCamera();
        viewport = new StretchViewport(WORLD_WIDTH, WORLD_HEIGHT, camera);

        backgrounds[0] = new Texture("Starscape00.png");
        backgrounds[1] = new Texture("Starscape01.png");
        backgrounds[2] = new Texture("Starscape02.png");
        backgrounds[3] = new Texture("Starscape03.png");

        backgroundMaxScrollingSpeed = (float) (WORLD_HEIGHT / 4);

        batch = new SpriteBatch();
    }

    @Override
    public void render(float delta) {
        batch.begin();



        batch.end();
    }

    @Override
    public void resize(int width, int height) {
        viewport.update(width, height, true);
        batch.setProjectionMatrix(camera.combined);
    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void hide() {

    }

    @Override
    public void dispose() {

    }

    @Override
    public void show() {

    }
}
