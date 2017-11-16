package com.tencent.liteav.beauty.gpu_filters.beauty2;

import android.opengl.GLES20;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.beauty.NativeLoad;
import com.tencent.liteav.beauty.gpu_filters.TXCGPUTwoInputFilter;

public class TXCBeautyBlend
  extends TXCGPUTwoInputFilter
{
  private final String TAG = "BeautyBlend";
  private int m_RuddyDegreeUniform = -1;
  private int m_contrastUniform = -1;
  private int m_whiteDegreeUniform = -1;
  
  public TXCBeautyBlend()
  {
    super("varying lowp vec2 textureCoordinate;\n \nuniform sampler2D inputImageTexture;\n \nvoid main()\n{\n     gl_FragColor = texture2D(inputImageTexture, textureCoordinate);\n}");
  }
  
  private void getParamHandle()
  {
    this.m_whiteDegreeUniform = GLES20.glGetUniformLocation(getProgram(), "whiteDegree");
    this.m_contrastUniform = GLES20.glGetUniformLocation(getProgram(), "contrast");
    this.m_RuddyDegreeUniform = GLES20.glGetUniformLocation(getProgram(), "ruddyDegree");
  }
  
  public boolean init()
  {
    NativeLoad.getInstance();
    this.mGLProgId = NativeLoad.nativeLoadGLProgram(12);
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
  
  public void setBrightLevel(float paramFloat)
  {
    TXCLog.i("BeautyBlend", "setBrightLevel " + paramFloat);
    setFloat(this.m_whiteDegreeUniform, paramFloat);
  }
  
  public void setContract(float paramFloat)
  {
    setFloat(this.m_contrastUniform, paramFloat / 10.0F + 1.0F);
  }
  
  public void setRuddyLevel(float paramFloat)
  {
    setFloat(this.m_RuddyDegreeUniform, paramFloat / 2.0F);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\liteav\beauty\gpu_filters\beauty2\TXCBeautyBlend.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */