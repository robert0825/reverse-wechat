package com.tencent.liteav.basic.opengl;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.hardware.Camera.Size;
import android.opengl.GLES20;
import android.opengl.GLES30;
import android.opengl.GLUtils;
import com.tencent.liteav.basic.log.TXCLog;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;

public class TXCOpenGlUtils
{
  static final boolean DEBUG_MODE = false;
  private static float[] FULL_RECTANGLE_COORDS = { -1.0F, -1.0F, 1.0F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F };
  public static FloatBuffer FULL_RECTANGLE_CUB_BUF;
  public static FloatBuffer FULL_RECTANGLE_TEX_BUF;
  public static FloatBuffer FULL_RECTANGLE_TEX_BUF_ANTICLOCKWISE_90 = createFloatBuffer(FULL_RECTANGLE_TEX_COORDS_ANTICLOCKWISE_90);
  public static FloatBuffer FULL_RECTANGLE_TEX_BUF_CLOCKWISE_90;
  public static FloatBuffer FULL_RECTANGLE_TEX_BUF_MIRROR = createFloatBuffer(FULL_RECTANGLE_TEX_COORDS_MIRROR);
  private static float[] FULL_RECTANGLE_TEX_COORDS = { 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F };
  private static float[] FULL_RECTANGLE_TEX_COORDS_ANTICLOCKWISE_90;
  private static float[] FULL_RECTANGLE_TEX_COORDS_CLOCKWISE_90 = { 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F };
  private static float[] FULL_RECTANGLE_TEX_COORDS_MIRROR;
  public static final int NOT_INIT = -1;
  public static final int NO_TEXTURE = -1;
  public static final int ON_DRAWN = 1;
  public static final int OPENGL_ES_2 = 2;
  public static final int OPENGL_ES_3 = 3;
  public static final int PROGRAM_BEAUTY = 1;
  public static final int PROGRAM_BEAUTY2 = 5;
  public static final int PROGRAM_BEAUTY3_FILTER = 14;
  public static final int PROGRAM_BEAUTYBLEND = 12;
  public static final int PROGRAM_EYE_SCALE = 3;
  public static final int PROGRAM_FACE_SLIM = 4;
  public static final int PROGRAM_FACE_VAR = 2;
  public static final int PROGRAM_I4202RGBA = 7;
  public static final int PROGRAM_NV122RGBA = 10;
  public static final int PROGRAM_NV212RGBA = 9;
  public static final int PROGRAM_RGBA2I420 = 8;
  public static final int PROGRAM_RGBA2NV21 = 11;
  public static final int PROGRAM_SKIN = 6;
  public static final int PROGRAM_SMOOTHHORIZONTAL = 13;
  private static int mOpenGlVERSION = 2;
  
  static
  {
    FULL_RECTANGLE_TEX_COORDS_ANTICLOCKWISE_90 = new float[] { 1.0F, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F, 1.0F };
    FULL_RECTANGLE_TEX_COORDS_MIRROR = new float[] { 1.0F, 0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 0.0F, 1.0F };
    FULL_RECTANGLE_CUB_BUF = createFloatBuffer(FULL_RECTANGLE_COORDS);
    FULL_RECTANGLE_TEX_BUF = createFloatBuffer(FULL_RECTANGLE_TEX_COORDS);
    FULL_RECTANGLE_TEX_BUF_CLOCKWISE_90 = createFloatBuffer(FULL_RECTANGLE_TEX_COORDS_CLOCKWISE_90);
  }
  
  public static void checkGlError(String paramString)
  {
    int i = GLES20.glGetError();
    if (i != 0)
    {
      paramString = paramString + ": glError 0x" + Integer.toHexString(i);
      TXCLog.e("OpenGlUtils", paramString);
      throw new RuntimeException(paramString);
    }
  }
  
  public static void createDrawFrameBuffer(int[] paramArrayOfInt1, int[] paramArrayOfInt2, int paramInt1, int paramInt2)
  {
    GLES20.glGenFramebuffers(1, paramArrayOfInt1, 0);
    paramArrayOfInt2[0] = createTexture(paramInt1, paramInt2, 6408, 6408, paramArrayOfInt2);
    GLES20.glBindFramebuffer(36160, paramArrayOfInt1[0]);
    GLES20.glFramebufferTexture2D(36160, 36064, 3553, paramArrayOfInt2[0], 0);
    GLES20.glBindFramebuffer(36160, 0);
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
  
  public static int createPBO(int paramInt1, int paramInt2, int[] paramArrayOfInt)
  {
    GLES30.glGenBuffers(1, paramArrayOfInt, 0);
    GLES30.glBindBuffer(35051, paramArrayOfInt[0]);
    GLES30.glBufferData(35051, paramInt1 * paramInt2 * 4, null, 35049);
    GLES30.glBindBuffer(35051, 0);
    return paramArrayOfInt[0];
  }
  
  public static int createTexture(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    return createTexture(paramInt1, paramInt2, paramInt3, paramInt4, null);
  }
  
  public static int createTexture(int paramInt1, int paramInt2, int paramInt3, int paramInt4, IntBuffer paramIntBuffer)
  {
    int i = getSimpleTextureID();
    GLES20.glBindTexture(3553, i);
    GLES20.glTexImage2D(3553, 0, paramInt3, paramInt1, paramInt2, 0, paramInt4, 5121, paramIntBuffer);
    GLES20.glBindTexture(3553, 0);
    return i;
  }
  
  public static int createTexture(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int[] paramArrayOfInt)
  {
    GLES20.glGenTextures(1, paramArrayOfInt, 0);
    GLES20.glBindTexture(3553, paramArrayOfInt[0]);
    GLES20.glTexParameteri(3553, 10242, 33071);
    GLES20.glTexParameteri(3553, 10243, 33071);
    GLES20.glTexParameteri(3553, 10241, 9728);
    GLES20.glTexParameteri(3553, 10240, 9729);
    GLES20.glTexImage2D(3553, 0, paramInt3, paramInt1, paramInt2, 0, paramInt4, 5121, null);
    return paramArrayOfInt[0];
  }
  
  public static int getExternalOESTextureID()
  {
    int[] arrayOfInt = new int[1];
    GLES20.glGenTextures(1, arrayOfInt, 0);
    GLES20.glBindTexture(36197, arrayOfInt[0]);
    GLES20.glTexParameterf(36197, 10241, 9729.0F);
    GLES20.glTexParameterf(36197, 10240, 9729.0F);
    GLES20.glTexParameteri(36197, 10242, 33071);
    GLES20.glTexParameteri(36197, 10243, 33071);
    return arrayOfInt[0];
  }
  
  /* Error */
  public static Bitmap getImageFromAssetsFile(Context paramContext, String paramString)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_3
    //   2: aconst_null
    //   3: astore_2
    //   4: aload_0
    //   5: invokevirtual 234	android/content/Context:getResources	()Landroid/content/res/Resources;
    //   8: invokevirtual 240	android/content/res/Resources:getAssets	()Landroid/content/res/AssetManager;
    //   11: astore_0
    //   12: aload_0
    //   13: aload_1
    //   14: invokevirtual 246	android/content/res/AssetManager:open	(Ljava/lang/String;)Ljava/io/InputStream;
    //   17: astore_1
    //   18: aload_3
    //   19: astore_0
    //   20: aload_1
    //   21: invokestatic 252	android/graphics/BitmapFactory:decodeStream	(Ljava/io/InputStream;)Landroid/graphics/Bitmap;
    //   24: astore_2
    //   25: aload_2
    //   26: astore_0
    //   27: aload_1
    //   28: invokevirtual 257	java/io/InputStream:close	()V
    //   31: aload_2
    //   32: areturn
    //   33: astore_0
    //   34: aconst_null
    //   35: astore_1
    //   36: aload_2
    //   37: astore_0
    //   38: aload_0
    //   39: astore_2
    //   40: aload_1
    //   41: ifnull -10 -> 31
    //   44: aload_1
    //   45: invokevirtual 257	java/io/InputStream:close	()V
    //   48: aload_0
    //   49: areturn
    //   50: astore_1
    //   51: aload_0
    //   52: areturn
    //   53: astore_2
    //   54: goto -16 -> 38
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	57	0	paramContext	Context
    //   0	57	1	paramString	String
    //   3	37	2	localObject1	Object
    //   53	1	2	localIOException	IOException
    //   1	18	3	localObject2	Object
    // Exception table:
    //   from	to	target	type
    //   12	18	33	java/io/IOException
    //   44	48	50	java/io/IOException
    //   20	25	53	java/io/IOException
    //   27	31	53	java/io/IOException
  }
  
  public static final int getOpenGLVersion()
  {
    return mOpenGlVERSION;
  }
  
  public static int getSimpleTextureID()
  {
    int[] arrayOfInt = new int[1];
    GLES20.glGenTextures(1, arrayOfInt, 0);
    GLES20.glBindTexture(3553, arrayOfInt[0]);
    GLES20.glTexParameterf(3553, 10241, 9729.0F);
    GLES20.glTexParameterf(3553, 10240, 9729.0F);
    GLES20.glTexParameteri(3553, 10242, 33071);
    GLES20.glTexParameteri(3553, 10243, 33071);
    GLES20.glBindTexture(3553, 0);
    return arrayOfInt[0];
  }
  
  public static int loadProgram(String paramString1, String paramString2)
  {
    int[] arrayOfInt = new int[1];
    int i = loadShader(paramString1, 35633);
    if (i == 0)
    {
      TXCLog.d("Load Program", "Vertex Shader Failed");
      return 0;
    }
    int j = loadShader(paramString2, 35632);
    if (j == 0)
    {
      TXCLog.d("Load Program", "Fragment Shader Failed");
      return 0;
    }
    int k = GLES20.glCreateProgram();
    GLES20.glAttachShader(k, i);
    GLES20.glAttachShader(k, j);
    GLES20.glLinkProgram(k);
    GLES20.glGetProgramiv(k, 35714, arrayOfInt, 0);
    if (arrayOfInt[0] <= 0)
    {
      TXCLog.d("Load Program", "Linking Failed");
      return 0;
    }
    GLES20.glDeleteShader(i);
    GLES20.glDeleteShader(j);
    return k;
  }
  
  public static int loadShader(String paramString, int paramInt)
  {
    int[] arrayOfInt = new int[1];
    paramInt = GLES20.glCreateShader(paramInt);
    GLES20.glShaderSource(paramInt, paramString);
    GLES20.glCompileShader(paramInt);
    GLES20.glGetShaderiv(paramInt, 35713, arrayOfInt, 0);
    if (arrayOfInt[0] == 0)
    {
      TXCLog.d("Load Shader Failed", "Compilation\n" + GLES20.glGetShaderInfoLog(paramInt));
      return 0;
    }
    return paramInt;
  }
  
  public static int loadTexture(Context paramContext, String paramString)
  {
    int[] arrayOfInt = new int[1];
    GLES20.glGenTextures(1, arrayOfInt, 0);
    if (arrayOfInt[0] != 0)
    {
      paramContext = getImageFromAssetsFile(paramContext, paramString);
      if (paramContext == null) {
        return arrayOfInt[0];
      }
      GLES20.glBindTexture(3553, arrayOfInt[0]);
      GLES20.glTexParameteri(3553, 10240, 9729);
      GLES20.glTexParameteri(3553, 10241, 9729);
      GLES20.glTexParameteri(3553, 10242, 33071);
      GLES20.glTexParameteri(3553, 10243, 33071);
      GLUtils.texImage2D(3553, 0, paramContext, 0);
      paramContext.recycle();
    }
    if (arrayOfInt[0] == 0) {
      throw new RuntimeException("Error loading texture.");
    }
    return arrayOfInt[0];
  }
  
  public static int loadTexture(Bitmap paramBitmap, int paramInt)
  {
    return loadTexture(paramBitmap, paramInt, true);
  }
  
  public static int loadTexture(Bitmap paramBitmap, int paramInt, boolean paramBoolean)
  {
    int[] arrayOfInt = new int[1];
    if (paramInt == -1)
    {
      GLES20.glGenTextures(1, arrayOfInt, 0);
      GLES20.glBindTexture(3553, arrayOfInt[0]);
      GLES20.glTexParameterf(3553, 10240, 9729.0F);
      GLES20.glTexParameterf(3553, 10241, 9729.0F);
      GLES20.glTexParameterf(3553, 10242, 33071.0F);
      GLES20.glTexParameterf(3553, 10243, 33071.0F);
      GLUtils.texImage2D(3553, 0, paramBitmap, 0);
    }
    for (;;)
    {
      if (paramBoolean) {
        paramBitmap.recycle();
      }
      return arrayOfInt[0];
      GLES20.glBindTexture(3553, paramInt);
      GLUtils.texSubImage2D(3553, 0, 0, 0, paramBitmap);
      arrayOfInt[0] = paramInt;
    }
  }
  
  public static int loadTexture(ByteBuffer paramByteBuffer, int paramInt1, int paramInt2, int paramInt3)
  {
    int[] arrayOfInt = new int[1];
    if (paramInt3 == -1)
    {
      GLES20.glGenTextures(1, arrayOfInt, 0);
      GLES20.glBindTexture(3553, arrayOfInt[0]);
      GLES20.glTexParameterf(3553, 10240, 9729.0F);
      GLES20.glTexParameterf(3553, 10241, 9729.0F);
      GLES20.glTexParameterf(3553, 10242, 33071.0F);
      GLES20.glTexParameterf(3553, 10243, 33071.0F);
      GLES20.glTexImage2D(3553, 0, 6408, paramInt1, paramInt2, 0, 6408, 5121, paramByteBuffer);
    }
    for (;;)
    {
      return arrayOfInt[0];
      GLES20.glBindTexture(3553, paramInt3);
      GLES20.glTexSubImage2D(3553, 0, 0, 0, paramInt1, paramInt2, 6408, 5121, paramByteBuffer);
      arrayOfInt[0] = paramInt3;
    }
  }
  
  public static int loadTexture(IntBuffer paramIntBuffer, Camera.Size paramSize, int paramInt)
  {
    int[] arrayOfInt = new int[1];
    if (paramInt == -1)
    {
      GLES20.glGenTextures(1, arrayOfInt, 0);
      GLES20.glBindTexture(3553, arrayOfInt[0]);
      GLES20.glTexParameterf(3553, 10240, 9729.0F);
      GLES20.glTexParameterf(3553, 10241, 9729.0F);
      GLES20.glTexParameterf(3553, 10242, 33071.0F);
      GLES20.glTexParameterf(3553, 10243, 33071.0F);
      GLES20.glTexImage2D(3553, 0, 6408, paramSize.width, paramSize.height, 0, 6408, 5121, paramIntBuffer);
    }
    for (;;)
    {
      return arrayOfInt[0];
      GLES20.glBindTexture(3553, paramInt);
      GLES20.glTexSubImage2D(3553, 0, 0, 0, paramSize.width, paramSize.height, 6408, 5121, paramIntBuffer);
      arrayOfInt[0] = paramInt;
    }
  }
  
  public static int loadTextureAsBitmap(IntBuffer paramIntBuffer, Camera.Size paramSize, int paramInt)
  {
    return loadTexture(Bitmap.createBitmap(paramIntBuffer.array(), paramSize.width, paramSize.height, Bitmap.Config.ARGB_8888), paramInt);
  }
  
  public static String readShaderFromRawResource(Context paramContext, int paramInt)
  {
    paramContext = new BufferedReader(new InputStreamReader(paramContext.getResources().openRawResource(paramInt)));
    localStringBuilder = new StringBuilder();
    try
    {
      for (;;)
      {
        String str = paramContext.readLine();
        if (str == null) {
          break;
        }
        localStringBuilder.append(str);
        localStringBuilder.append('\n');
      }
      return localStringBuilder.toString();
    }
    catch (IOException paramContext)
    {
      return null;
    }
  }
  
  public static float rnd(float paramFloat1, float paramFloat2)
  {
    return (float)Math.random() * (paramFloat2 - paramFloat1) + paramFloat1;
  }
  
  public static void setOpenGLVersion(int paramInt)
  {
    mOpenGlVERSION = paramInt;
  }
  
  public static abstract interface OnDrawTaskHandler
  {
    public abstract void addOnDrawTask(Runnable paramRunnable);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\liteav\basic\opengl\TXCOpenGlUtils.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */