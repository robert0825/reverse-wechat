package com.tencent.liteav.beauty.gpu_filters;

import com.tencent.liteav.basic.opengl.TXCGPUFilter;

public class TXCBeautyInterFace
  extends TXCGPUFilter
{
  public TXCBeautyInterFace() {}
  
  public TXCBeautyInterFace(String paramString1, String paramString2)
  {
    super(paramString1, paramString2, false);
  }
  
  public boolean init(int paramInt1, int paramInt2)
  {
    return false;
  }
  
  public void setBeautyLevel(int paramInt) {}
  
  public void setRuddyLevel(int paramInt) {}
  
  public void setShapenLevel(int paramInt) {}
  
  public void setWhitenessLevel(int paramInt) {}
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\liteav\beauty\gpu_filters\TXCBeautyInterFace.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */