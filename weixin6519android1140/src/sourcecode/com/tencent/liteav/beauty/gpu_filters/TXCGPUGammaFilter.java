package com.tencent.liteav.beauty.gpu_filters;

import android.opengl.GLES20;
import com.tencent.liteav.basic.opengl.TXCGPUFilter;

public class TXCGPUGammaFilter
  extends TXCGPUFilter
{
  public static final String GAMMA_FRAGMENT_SHADER = "varying lowp vec2 textureCoordinate;\n \n uniform sampler2D inputImageTexture;\n uniform lowp float gamma;\n \n void main()\n {\n     lowp vec4 textureColor = texture2D(inputImageTexture, textureCoordinate);\n     \n     gl_FragColor = vec4(pow(textureColor.rgb, vec3(gamma)), textureColor.w);\n }";
  private float mGamma;
  private int mGammaLocation;
  
  public TXCGPUGammaFilter()
  {
    this(1.2F);
  }
  
  public TXCGPUGammaFilter(float paramFloat)
  {
    super("attribute vec4 position;\nattribute vec4 inputTextureCoordinate;\n \nvarying vec2 textureCoordinate;\n \nvoid main()\n{\n    gl_Position = position;\n    textureCoordinate = inputTextureCoordinate.xy;\n}", "varying lowp vec2 textureCoordinate;\n \n uniform sampler2D inputImageTexture;\n uniform lowp float gamma;\n \n void main()\n {\n     lowp vec4 textureColor = texture2D(inputImageTexture, textureCoordinate);\n     \n     gl_FragColor = vec4(pow(textureColor.rgb, vec3(gamma)), textureColor.w);\n }");
    this.mGamma = paramFloat;
  }
  
  public boolean onInit()
  {
    boolean bool = super.onInit();
    this.mGammaLocation = GLES20.glGetUniformLocation(getProgram(), "gamma");
    return bool;
  }
  
  public void onInitialized()
  {
    super.onInitialized();
    setGamma(this.mGamma);
  }
  
  public void setGamma(float paramFloat)
  {
    this.mGamma = paramFloat;
    setFloat(this.mGammaLocation, this.mGamma);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\liteav\beauty\gpu_filters\TXCGPUGammaFilter.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */