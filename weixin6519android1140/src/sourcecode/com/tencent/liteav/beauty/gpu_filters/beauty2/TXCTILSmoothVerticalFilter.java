package com.tencent.liteav.beauty.gpu_filters.beauty2;

import android.opengl.GLES20;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.beauty.NativeLoad;
import com.tencent.liteav.beauty.gpu_filters.TXCGPUTwoInputFilter;

public class TXCTILSmoothVerticalFilter
  extends TXCGPUTwoInputFilter
{
  private String TAG = "SmoothVertical";
  private float m_beautyLevel = 0.5F;
  private int m_saturateDegreeUniform = -1;
  private int m_smoothDegreeUniform = -1;
  private int m_texelHeightOffsetLocation = -1;
  private int m_texelWidthOffsetLocation = -1;
  private float m_textureRation = 2.0F;
  
  TXCTILSmoothVerticalFilter()
  {
    super("attribute vec4 position;\nattribute vec4 inputTextureCoordinate;\n \nvarying vec2 textureCoordinate;\n \nvoid main()\n{\n    gl_Position = position;\n    textureCoordinate = inputTextureCoordinate.xy;\n}", "varying lowp vec2 textureCoordinate;\n \nuniform sampler2D inputImageTexture;\n \nvoid main()\n{\n     gl_FragColor = texture2D(inputImageTexture, textureCoordinate);\n}");
  }
  
  public void getParamHandle()
  {
    this.m_texelWidthOffsetLocation = GLES20.glGetUniformLocation(getProgram(), "texelWidthOffset");
    this.m_texelHeightOffsetLocation = GLES20.glGetUniformLocation(getProgram(), "texelHeightOffset");
    this.m_smoothDegreeUniform = GLES20.glGetUniformLocation(getProgram(), "smoothDegree");
  }
  
  public boolean init()
  {
    NativeLoad.getInstance();
    this.mGLProgId = NativeLoad.nativeLoadGLProgram(5);
    if ((this.mGLProgId != 0) && (onInit())) {}
    for (this.mIsInitialized = true;; this.mIsInitialized = false)
    {
      onInitialized();
      return this.mIsInitialized;
    }
  }
  
  public boolean onInit()
  {
    super.onInit();
    getParamHandle();
    return true;
  }
  
  public void onOutputSizeChanged(int paramInt1, int paramInt2)
  {
    super.onOutputSizeChanged(paramInt1, paramInt2);
    if (paramInt1 > paramInt2) {
      if (paramInt2 < 540) {
        this.m_textureRation = 2.0F;
      }
    }
    for (;;)
    {
      TXCLog.i(this.TAG, "m_textureRation " + this.m_textureRation);
      setFloat(this.m_texelWidthOffsetLocation, this.m_textureRation / paramInt1);
      setFloat(this.m_texelHeightOffsetLocation, this.m_textureRation / paramInt2);
      return;
      this.m_textureRation = 4.0F;
      continue;
      if (paramInt1 < 540) {
        this.m_textureRation = 2.0F;
      } else {
        this.m_textureRation = 4.0F;
      }
    }
  }
  
  public void setBeautyLevel(float paramFloat)
  {
    this.m_beautyLevel = paramFloat;
    TXCLog.i(this.TAG, "setBeautyLevel " + paramFloat);
    setFloat(this.m_smoothDegreeUniform, paramFloat);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\liteav\beauty\gpu_filters\beauty2\TXCTILSmoothVerticalFilter.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */