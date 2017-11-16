package com.tencent.mm.plugin.api.recordView;

import android.opengl.GLES20;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.w;

public final class b
{
  public static int Rh()
  {
    GMTrace.i(20180574928896L, 150357);
    int[] arrayOfInt = new int[1];
    GLES20.glGenTextures(1, arrayOfInt, 0);
    GLES20.glBindTexture(3553, arrayOfInt[0]);
    GLES20.glTexParameteri(3553, 10241, 9729);
    GLES20.glTexParameteri(3553, 10240, 9728);
    GLES20.glTexParameteri(3553, 10242, 33071);
    GLES20.glTexParameteri(3553, 10243, 33071);
    int i = arrayOfInt[0];
    GMTrace.o(20180574928896L, 150357);
    return i;
  }
  
  public static int az(String paramString1, String paramString2)
  {
    GMTrace.i(20180843364352L, 150359);
    int[] arrayOfInt = new int[1];
    int i = loadShader(paramString1, 35633);
    if (i == 0)
    {
      w.e("MicroMsg.MMSightCameraGLUtil", "load vertex shader failed");
      GMTrace.o(20180843364352L, 150359);
      return 0;
    }
    int j = loadShader(paramString2, 35632);
    if (j == 0)
    {
      w.e("MicroMsg.MMSightCameraGLUtil", "load fragment shader failed");
      GMTrace.o(20180843364352L, 150359);
      return 0;
    }
    int k = GLES20.glCreateProgram();
    GLES20.glAttachShader(k, i);
    GLES20.glAttachShader(k, j);
    GLES20.glLinkProgram(k);
    GLES20.glGetProgramiv(k, 35714, arrayOfInt, 0);
    if (arrayOfInt[0] <= 0)
    {
      w.e("MicroMsg.MMSightCameraGLUtil", "link program failed");
      GMTrace.o(20180843364352L, 150359);
      return 0;
    }
    GLES20.glDeleteShader(i);
    GLES20.glDeleteShader(j);
    GMTrace.o(20180843364352L, 150359);
    return k;
  }
  
  private static int loadShader(String paramString, int paramInt)
  {
    GMTrace.i(20180709146624L, 150358);
    int[] arrayOfInt = new int[1];
    paramInt = GLES20.glCreateShader(paramInt);
    GLES20.glShaderSource(paramInt, paramString);
    GLES20.glCompileShader(paramInt);
    GLES20.glGetShaderiv(paramInt, 35713, arrayOfInt, 0);
    if (arrayOfInt[0] == 0)
    {
      w.e("loadShader error, infoLog: %s", GLES20.glGetShaderInfoLog(paramInt));
      GMTrace.o(20180709146624L, 150358);
      return 0;
    }
    GMTrace.o(20180709146624L, 150358);
    return paramInt;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\api\recordView\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */