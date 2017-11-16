package com.tencent.liteav.basic.opengl;

public class CropRect
{
  public int cropHeight;
  public int cropWidth;
  public int xOffset;
  public int yOffset;
  
  public CropRect()
  {
    this(0, 0, 0, 0);
  }
  
  public CropRect(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    this.xOffset = paramInt1;
    this.yOffset = paramInt2;
    this.cropWidth = paramInt3;
    this.cropHeight = paramInt4;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\liteav\basic\opengl\CropRect.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */