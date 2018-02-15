package ca.bc.northvan.armintoussi.opengl2test;

import android.content.Context;
import android.opengl.GLSurfaceView;

/**
 * Created by armin2 on 2/15/2018.
 */

public class MyGLSurfaceView extends GLSurfaceView {

    private final MyGLRenderer mRenderer;

    public MyGLSurfaceView(Context context) {
        super(context);

        //create an openGL ES 2.0 context.
        setEGLContextClientVersion(2);

        mRenderer =  new MyGLRenderer();

        //set the rendered for drawing on the GLSurfaceView
        setRenderer(mRenderer);
        setRenderMode(GLSurfaceView.RENDERMODE_WHEN_DIRTY);
    }
}
