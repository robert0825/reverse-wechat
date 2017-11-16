package com.tencent.liteav.beauty.gpu_filters;

import android.opengl.GLES20;
import com.tencent.liteav.basic.opengl.TXCGPUFilter;
import java.util.List;

public class TXCGPUTwoPassTextureSamplingFilter
  extends TXCGPUTwoPassFilter
{
  protected float mTexelSpacing = 4.0F;
  
  public TXCGPUTwoPassTextureSamplingFilter(String paramString1, String paramString2, String paramString3, String paramString4)
  {
    super(paramString1, paramString2, paramString3, paramString4);
  }
  
  public float getHorizontalTexelOffsetRatio()
  {
    return this.mTexelSpacing;
  }
  
  public float getVerticalTexelOffsetRatio()
  {
    return this.mTexelSpacing;
  }
  
  protected void initTexelOffsets()
  {
    float f = getHorizontalTexelOffsetRatio();
    TXCGPUFilter localTXCGPUFilter = (TXCGPUFilter)this.mFilters.get(0);
    int i = GLES20.glGetUniformLocation(localTXCGPUFilter.getProgram(), "texelWidthOffset");
    int j = GLES20.glGetUniformLocation(localTXCGPUFilter.getProgram(), "texelHeightOffset");
    localTXCGPUFilter.setFloat(i, f / this.mOutputWidth);
    localTXCGPUFilter.setFloat(j, 0.0F);
    f = getVerticalTexelOffsetRatio();
    localTXCGPUFilter = (TXCGPUFilter)this.mFilters.get(1);
    i = GLES20.glGetUniformLocation(localTXCGPUFilter.getProgram(), "texelWidthOffset");
    j = GLES20.glGetUniformLocation(localTXCGPUFilter.getProgram(), "texelHeightOffset");
    localTXCGPUFilter.setFloat(i, 0.0F);
    localTXCGPUFilter.setFloat(j, f / this.mOutputHeight);
  }
  
  public boolean onInit()
  {
    return (super.onInit()) && (GLES20.glGetError() == 0);
  }
  
  public void onOutputSizeChanged(int paramInt1, int paramInt2)
  {
    super.onOutputSizeChanged(paramInt1, paramInt2);
    initTexelOffsets();
  }
  
  public void setTexelSpacing(float paramFloat)
  {
    this.mTexelSpacing = paramFloat;
    initTexelOffsets();
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\liteav\beauty\gpu_filters\TXCGPUTwoPassTextureSamplingFilter.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */