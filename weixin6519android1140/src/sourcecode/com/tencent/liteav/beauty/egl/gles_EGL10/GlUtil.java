package com.tencent.liteav.beauty.egl.gles_EGL10;

import android.opengl.GLES20;
import android.opengl.Matrix;
import com.tencent.liteav.basic.log.TXCLog;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;

public class GlUtil
{
  public static final float[] IDENTITY_MATRIX;
  private static final int SIZEOF_FLOAT = 4;
  public static final String TAG = "GlUtil";
  
  static
  {
    float[] arrayOfFloat = new float[16];
    IDENTITY_MATRIX = arrayOfFloat;
    Matrix.setIdentityM(arrayOfFloat, 0);
  }
  
  public static void checkGlError(String paramString)
  {
    int i = GLES20.glGetError();
    if (i != 0) {
      TXCLog.e("GlUtil", paramString + ": glError 0x" + Integer.toHexString(i));
    }
  }
  
  public static void checkLocation(int paramInt, String paramString)
  {
    if (paramInt < 0) {
      throw new RuntimeException("Unable to locate '" + paramString + "' in program");
    }
  }
  
  public static FloatBuffer createFloatBuffer(float[] paramArrayOfFloat)
  {
    Object localObject = ByteBuffer.allocateDirect(paramArrayOfFloat.length * 4);
    ((ByteBuffer)localObject).order(ByteOrder.nativeOrder());
    localObject = ((ByteBuffer)localObject).asFloatBuffer();
    ((FloatBuffer)localObject).put(paramArrayOfFloat);
    ((FloatBuffer)localObject).position(0);
    return (FloatBuffer)localObject;
  }
  
  public static int createImageTexture(ByteBuffer paramByteBuffer, int paramInt1, int paramInt2, int paramInt3)
  {
    int[] arrayOfInt = new int[1];
    GLES20.glGenTextures(1, arrayOfInt, 0);
    int i = arrayOfInt[0];
    checkGlError("glGenTextures");
    GLES20.glBindTexture(3553, i);
    GLES20.glTexParameteri(3553, 10241, 9729);
    GLES20.glTexParameteri(3553, 10240, 9729);
    checkGlError("loadImageTexture");
    GLES20.glTexImage2D(3553, 0, paramInt3, paramInt1, paramInt2, 0, paramInt3, 5121, paramByteBuffer);
    checkGlError("loadImageTexture");
    return i;
  }
  
  public static int createProgram(String paramString1, String paramString2)
  {
    int i = loadShader(35633, paramString1);
    if (i == 0) {}
    int j;
    do
    {
      return 0;
      j = loadShader(35632, paramString2);
    } while (j == 0);
    int k = GLES20.glCreateProgram();
    checkGlError("glCreateProgram");
    if (k == 0) {
      TXCLog.e("GlUtil", "Could not create program");
    }
    GLES20.glAttachShader(k, i);
    checkGlError("glAttachShader");
    GLES20.glAttachShader(k, j);
    checkGlError("glAttachShader");
    GLES20.glLinkProgram(k);
    paramString1 = new int[1];
    GLES20.glGetProgramiv(k, 35714, paramString1, 0);
    if (paramString1[0] != 1)
    {
      TXCLog.e("GlUtil", "Could not link program: ");
      TXCLog.e("GlUtil", GLES20.glGetProgramInfoLog(k));
      GLES20.glDeleteProgram(k);
      return 0;
    }
    return k;
  }
  
  public static int loadShader(int paramInt, String paramString)
  {
    int i = GLES20.glCreateShader(paramInt);
    checkGlError("glCreateShader type=" + paramInt);
    GLES20.glShaderSource(i, paramString);
    GLES20.glCompileShader(i);
    paramString = new int[1];
    GLES20.glGetShaderiv(i, 35713, paramString, 0);
    if (paramString[0] == 0)
    {
      TXCLog.e("GlUtil", "Could not compile shader " + paramInt + ":");
      TXCLog.e("GlUtil", " " + GLES20.glGetShaderInfoLog(i));
      GLES20.glDeleteShader(i);
      return 0;
    }
    return i;
  }
  
  public static void logVersionInfo()
  {
    TXCLog.i("GlUtil", "vendor  : " + GLES20.glGetString(7936));
    TXCLog.i("GlUtil", "renderer: " + GLES20.glGetString(7937));
    TXCLog.i("GlUtil", "version : " + GLES20.glGetString(7938));
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\liteav\beauty\egl\gles_EGL10\GlUtil.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */