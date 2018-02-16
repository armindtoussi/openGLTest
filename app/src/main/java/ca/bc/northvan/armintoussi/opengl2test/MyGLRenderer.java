package ca.bc.northvan.armintoussi.opengl2test;

import android.opengl.GLES20;
import android.opengl.GLSurfaceView;

import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

/**
 * Created by armin2 on 2/15/2018.
 */

public class MyGLRenderer implements GLSurfaceView.Renderer {


    private Triangle mTriangle;


    @Override
    public void onSurfaceCreated(GL10 gl, EGLConfig config) {
        //set background frame color
        GLES20.glClearColor(0.0f, 0.0f,0.0f, 1.0f);

        //init triangle
        mTriangle = new Triangle();
    }

    @Override
    public void onSurfaceChanged(GL10 gl, int width, int height) {
        GLES20.glViewport(0,0, width, height);
    }

    @Override
    public void onDrawFrame(GL10 gl) {
        // Redraw background color;
        GLES20.glClear(GLES20.GL_COLOR_BUFFER_BIT);

        mTriangle.draw();
    }

    public static int loadShader(int type, String shaderCode) {
        // Create a vertext shader type (GLES20.GL_VERTEXT_SHADER)
        // or a fragment shader type (GLES20.GL_FRAGMENT_SHADER)
        int shader = GLES20.glCreateShader(type);

        //add the source code to the shader and compile it.
        GLES20.glShaderSource(shader, shaderCode);
        GLES20.glCompileShader(shader);

        return shader;
    }
}
