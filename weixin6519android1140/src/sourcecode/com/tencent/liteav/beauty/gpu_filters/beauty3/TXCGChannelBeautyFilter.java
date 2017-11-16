package com.tencent.liteav.beauty.gpu_filters.beauty3;

import android.opengl.GLES20;
import com.tencent.liteav.basic.opengl.TXCGPUFilter;
import com.tencent.liteav.beauty.NativeLoad;

public class TXCGChannelBeautyFilter
  extends TXCGPUFilter
{
  private String TAG = "Beauty3Filter";
  private float[] mBeautyParam = new float[4];
  private int mBeautyParamsHandle = -1;
  private int mSingleStepOffsetLoc = -1;
  
  public TXCGChannelBeautyFilter()
  {
    super("attribute vec4 position;\nattribute vec4 inputTextureCoordinate;\n \nvarying vec2 textureCoordinate;\n \nvoid main()\n{\n    gl_Position = position;\n    textureCoordinate = inputTextureCoordinate.xy;\n}", "varying lowp vec2 textureCoordinate;\n \nuniform sampler2D inputImageTexture;\n \nvoid main()\n{\n     gl_FragColor = texture2D(inputImageTexture, textureCoordinate);\n}");
  }
  
  private void setBeautyParam(float[] paramArrayOfFloat)
  {
    setFloatVec4(this.mBeautyParamsHandle, paramArrayOfFloat);
  }
  
  public boolean init()
  {
    NativeLoad.getInstance();
    this.mGLProgId = NativeLoad.nativeLoadGLProgram(14);
    if ((this.mGLProgId != 0) && (onInit())) {}
    for (this.mIsInitialized = true;; this.mIsInitialized = false)
    {
      onInitialized();
      return this.mIsInitialized;
    }
  }
  
  public boolean onInit()
  {
    boolean bool = super.onInit();
    this.mSingleStepOffsetLoc = GLES20.glGetUniformLocation(getProgram(), "singleStepOffset");
    this.mBeautyParamsHandle = GLES20.glGetUniformLocation(getProgram(), "beautyParams");
    setBeautyLevel(5.0F);
    return bool;
  }
  
  public void onOutputSizeChanged(int paramInt1, int paramInt2)
  {
    super.onOutputSizeChanged(paramInt1, paramInt2);
    setTexSize(paramInt1, paramInt2);
  }
  
  public void setBeautyLevel(float paramFloat)
  {
    this.mBeautyParam[0] = paramFloat;
    setBeautyParam(this.mBeautyParam);
  }
  
  public void setRouguanLevel(float paramFloat)
  {
    this.mBeautyParam[3] = (1.0F - paramFloat / 10.0F);
    setBeautyParam(this.mBeautyParam);
  }
  
  public void setRuddyLevel(float paramFloat)
  {
    this.mBeautyParam[2] = paramFloat;
    setBeautyParam(this.mBeautyParam);
  }
  
  public void setTexSize(int paramInt1, int paramInt2)
  {
    setFloatVec2(this.mSingleStepOffsetLoc, new float[] { 2.0F / paramInt1, 2.0F / paramInt2 });
  }
  
  public void setWhitenessLevel(float paramFloat)
  {
    this.mBeautyParam[1] = paramFloat;
    setBeautyParam(this.mBeautyParam);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\liteav\beauty\gpu_filters\beauty3\TXCGChannelBeautyFilter.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */