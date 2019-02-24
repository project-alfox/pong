package com.alfox.pong.desktop;

import com.alfox.pong.GameConstants;
import com.alfox.pong.PongGdxGame;
import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.badlogic.gdx.graphics.Color;

public class DesktopLauncher {
  public static void main(String[] arg) {
    LwjglApplicationConfiguration applicationConfig = new LwjglApplicationConfiguration();
    applicationConfig.title = GameConstants.TITLE;
    applicationConfig.width = GameConstants.SCREEN_WIDTH;
    applicationConfig.height = GameConstants.SCREEN_HEIGHT;
    applicationConfig.initialBackgroundColor = Color.BLACK;
    applicationConfig.resizable = false;
    applicationConfig.backgroundFPS = 10;
    applicationConfig.foregroundFPS = 60;
    applicationConfig.allowSoftwareMode = false;
    applicationConfig.fullscreen = false;
    // can be changed at runtime via {@link Graphics#setVSync(boolean)}
    applicationConfig.vSyncEnabled = true;
    new LwjglApplication(new PongGdxGame(), applicationConfig);
  }
}
