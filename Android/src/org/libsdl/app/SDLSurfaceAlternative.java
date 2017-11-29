package org.libsdl.app;

import android.content.Context;
import android.view.Surface;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;

/**
    !!! augmentation [2017.10.25 c4augustus]
    Alternative for SDLSurface so that we can replace it.
*/
//public abstract class SDLSurfaceAlternative extends View {
public abstract class SDLSurfaceAlternative extends TextureView {
//public abstract class SDLSurfaceAlternative extends SurfaceView {
    SDLSurfaceAlternative(Context context) {
        super(context);
    }
    abstract public void handlePause();
    abstract public void handleResume();
    abstract public Surface getNativeSurface();
}
