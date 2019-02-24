package com.alfox.pong.desktop;

import com.alfox.pong.PongGdxGame;
import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;

public class DesktopLauncher {
  public static void main(String[] arg) {
    LwjglApplicationConfiguration applicationConfig = new LwjglApplicationConfiguration();
    applicationConfig.resizable = false;
    applicationConfig.backgroundFPS = 10;
    applicationConfig.foregroundFPS = 60;
    applicationConfig.title = "Alfox Pong";
    new LwjglApplication(new PongGdxGame(), applicationConfig);
  }
}
