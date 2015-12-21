package com.bazola.spaceylife;

import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.input.GestureDetector;

/**
 * Originally created by Zomis on 2014-11-12.
 */
public class CameraPanner extends GestureDetector.GestureAdapter {
    private final OrthographicCamera camera;
    private boolean enabled;

    public CameraPanner(OrthographicCamera camera) {
        this.camera = camera;
    }

    @Override
    public boolean pan(float x, float y, float deltaX, float deltaY) {
        if (!enabled) {
            return false;
        }
        camera.position.add(-deltaX * camera.zoom, deltaY * camera.zoom, 0);
        return true;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public boolean isEnabled() {
        return enabled;
    }
}
