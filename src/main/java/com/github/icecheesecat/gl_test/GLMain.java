package com.github.icecheesecat.gl_test;

import org.lwjgl.BufferUtils;
import static org.lwjgl.opengl.GL45.*;

import java.nio.ByteBuffer;

public class GLMain {

    public GLMain() {

        glBindBuffer(GL_ARRAY_BUFFER, );

        int buffer_gl = glCreateBuffers();
        ByteBuffer buffer = BufferUtils.createByteBuffer(4 * 3 * 3);
        //dim 1
        buffer.putFloat(0.0f);
        buffer.putFloat(0.0f);
        buffer.putFloat(0.0f);
        //dim 2
        buffer.putFloat(0.0f);
        buffer.putFloat(1.0f);
        buffer.putFloat(1.0f);
        //dim 3
        buffer.putFloat(1.0f);
        buffer.putFloat(0.0f);
        buffer.putFloat(1.0f);
        buffer.flip();
        glBufferData(GL_ARRAY_BUFFER, buffer, GL_READ_WRITE);
        //generic vertex attributes
        glVertexAttribPointer(0, 3, GL_FLOAT, true, Float.BYTES*3, buffer);
        glEnableVertexAttribArray(GL_ARRAY_BUFFER);

    }

}
