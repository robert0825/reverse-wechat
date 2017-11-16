package com.tencent.liteav.beauty.gpu_filters;

import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.basic.opengl.TXCGPUFilter;
import com.tencent.liteav.basic.opengl.TXCOpenGlUtils;
import java.nio.FloatBuffer;

public class TXCGPURotateFilter
  extends TXCGPUFilter
{
  private FloatBuffer FULL_RECTANGLE_TEX_BUF = null;
  private String TAG = "RotateFilter";
  
  public TXCGPURotateFilter(int paramInt)
  {
    super("attribute vec4 position;\nattribute vec4 inputTextureCoordinate;\n \nvarying vec2 textureCoordinate;\n \nvoid main()\n{\n    gl_Position = position;\n    textureCoordinate = inputTextureCoordinate.xy;\n}", "varying lowp vec2 textureCoordinate;\n \nuniform sampler2D inputImageTexture;\n \nvoid main()\n{\n     gl_FragColor = texture2D(inputImageTexture, textureCoordinate);\n}");
    setRotate(paramInt);
  }
  
  public void onDraw(int paramInt, FloatBuffer paramFloatBuffer1, FloatBuffer paramFloatBuffer2)
  {
    super.onDraw(paramInt, paramFloatBuffer1, this.FULL_RECTANGLE_TEX_BUF);
  }
  
  public void setRotate(int paramInt)
  {
    if (180 == paramInt)
    {
      this.FULL_RECTANGLE_TEX_BUF = TXCOpenGlUtils.FULL_RECTANGLE_TEX_BUF_MIRROR;
      return;
    }
    if (90 == paramInt)
    {
      this.FULL_RECTANGLE_TEX_BUF = TXCOpenGlUtils.FULL_RECTANGLE_TEX_BUF_CLOCKWISE_90;
      return;
    }
    if (-90 == paramInt)
    {
      this.FULL_RECTANGLE_TEX_BUF = TXCOpenGlUtils.FULL_RECTANGLE_TEX_BUF_ANTICLOCKWISE_90;
      return;
    }
    TXCLog.e(this.TAG, "don't support angle");
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes4-dex2jar.jar!\com\tencent\liteav\beauty\gpu_filters\TXCGPURotateFilter.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */