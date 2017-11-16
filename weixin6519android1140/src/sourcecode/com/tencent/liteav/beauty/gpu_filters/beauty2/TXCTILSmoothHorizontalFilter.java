package com.tencent.liteav.beauty.gpu_filters.beauty2;

import android.opengl.GLES20;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.basic.opengl.TXCGPUFilter;
import com.tencent.liteav.beauty.NativeLoad;

public class TXCTILSmoothHorizontalFilter
  extends TXCGPUFilter
{
  private String TAG = "SmoothHorizontal";
  private int m_texelHeightOffsetLocation = -1;
  private int m_texelWidthOffsetLocation = -1;
  private float m_textureRation = 4.0F;
  
  TXCTILSmoothHorizontalFilter()
  {
    super("attribute vec4 position;\nattribute vec4 inputTextureCoordinate;\n \nvarying vec2 textureCoordinate;\n \nvoid main()\n{\n    gl_Position = position;\n    textureCoordinate = inputTextureCoordinate.xy;\n}", "varying lowp vec2 textureCoordinate;\n \nuniform sampler2D inputImageTexture;\n \nvoid main()\n{\n     gl_FragColor = texture2D(inputImageTexture, textureCoordinate);\n}");
  }
  
  public void getParamHandle()
  {
    this.m_texelWidthOffsetLocation = GLES20.glGetUniformLocation(getProgram(), "texelWidthOffset");
    this.m_texelHeightOffsetLocation = GLES20.glGetUniformLocation(getProgram(), "texelHeightOffset");
  }
  
  public boolean init()
  {
    NativeLoad.getInstance();
    this.mGLProgId = NativeLoad.nativeLoadGLProgram(13);
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
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\liteav\beauty\gpu_filters\beauty2\TXCTILSmoothHorizontalFilter.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */