package com.tencent.liteav.basic.opengl;

public class TXCTextureRotationUtil
{
  public static final float[] CUBE = { -1.0F, -1.0F, 1.0F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F };
  public static final float[] TEXTURE_NO_ROTATION = { 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F };
  public static final float[] TEXTURE_ROTATED_180;
  public static final float[] TEXTURE_ROTATED_270;
  public static final float[] TEXTURE_ROTATED_90 = { 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F };
  
  static
  {
    TEXTURE_ROTATED_180 = new float[] { 1.0F, 0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 0.0F, 1.0F };
    TEXTURE_ROTATED_270 = new float[] { 0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 0.0F, 1.0F, 1.0F };
  }
  
  private static float flip(float paramFloat)
  {
    float f = 0.0F;
    if (paramFloat == 0.0F) {
      f = 1.0F;
    }
    return f;
  }
  
  public static float[] getRotation(TXCRotation paramTXCRotation, boolean paramBoolean1, boolean paramBoolean2)
  {
    switch (paramTXCRotation)
    {
    default: 
      paramTXCRotation = (float[])TEXTURE_NO_ROTATION.clone();
      if (paramBoolean1)
      {
        float[] arrayOfFloat = new float[8];
        arrayOfFloat[0] = flip(paramTXCRotation[0]);
        arrayOfFloat[1] = paramTXCRotation[1];
        arrayOfFloat[2] = flip(paramTXCRotation[2]);
        arrayOfFloat[3] = paramTXCRotation[3];
        arrayOfFloat[4] = flip(paramTXCRotation[4]);
        arrayOfFloat[5] = paramTXCRotation[5];
        arrayOfFloat[6] = flip(paramTXCRotation[6]);
        arrayOfFloat[7] = paramTXCRotation[7];
        paramTXCRotation = arrayOfFloat;
      }
      break;
    }
    for (;;)
    {
      if (paramBoolean2)
      {
        return new float[] { paramTXCRotation[0], flip(paramTXCRotation[1]), paramTXCRotation[2], flip(paramTXCRotation[3]), paramTXCRotation[4], flip(paramTXCRotation[5]), paramTXCRotation[6], flip(paramTXCRotation[7]) };
        paramTXCRotation = (float[])TEXTURE_ROTATED_90.clone();
        break;
        paramTXCRotation = (float[])TEXTURE_ROTATED_180.clone();
        break;
        paramTXCRotation = (float[])TEXTURE_ROTATED_270.clone();
        break;
      }
      return paramTXCRotation;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\liteav\basic\opengl\TXCTextureRotationUtil.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */