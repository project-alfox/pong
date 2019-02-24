package com.alfox.pong;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class PongGdxGame extends ApplicationAdapter {
  private SpriteBatch spriteBatch;
  private Texture badLogicImage;

  @Override
  public void create() {
    spriteBatch = new SpriteBatch();
    badLogicImage = new Texture("badlogic.jpg");
  }

  @Override
  public void render() {
    // Clear the screen so we can draw on a blank canvas.
    Gdx.gl.glClearColor(1, 0, 0, 1);
    Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

    // Draw the image. We use .begin() and .end() so that we aren't doing draw calls seperately.
    // The sprite bactch can send them to the GPU at the same time, and is a lot more efficient.
    // This is why we aren't just drawing each thing on its own.
    spriteBatch.begin();
    spriteBatch.draw(badLogicImage, 0, 0);
    spriteBatch.end();
  }

  @Override
  public void dispose() {
    spriteBatch.dispose();
    badLogicImage.dispose();
  }
}
