package com.tencent.liteav.beauty.gpu_filters;

import android.opengl.GLES20;

public class TXCGPUColorScreenFilter
  extends TXCGPUThreeInputFilter
{
  public static final String COLORSCREEN_FILTER_FRAGMENT_SHADER = "precision mediump float;\nvarying highp vec2 textureCoordinate;\nvarying highp vec2 textureCoordinate2;\nvarying highp vec2 textureCoordinate3;\nuniform sampler2D inputImageTexture;\nuniform sampler2D inputImageTexture2;\nuniform sampler2D inputImageTexture3;\nuniform mediump vec3 screenReplaceColor; //YUV数据\nuniform float screenMirrorX;\nuniform float screenMirrorY;\n\nvoid main()\n{\n    highp vec4 _smooth = texture2D(inputImageTexture,textureCoordinate);\n    highp vec4 origin = texture2D(inputImageTexture2,textureCoordinate2);\n    \n    lowp float r = origin.r;\n    lowp float g = origin.g;\n    lowp float b = origin.b;\n    float Cr = 128.0 - 37.797 * r - 74.203 * g + 112.0 * b;\n    float Cb = 128.0 + 112.0 * r - 93.768 * g - 18.214 * b;\n    \n    highp vec2 screenPos = textureCoordinate3;\n    if(screenMirrorX != 0.0)screenPos.x = 1.0 - screenPos.x;\n    if(screenMirrorY != 0.0)screenPos.y = 1.0 - screenPos.y;\n    highp vec4 screen = texture2D(inputImageTexture3, screenPos);\n    float Y = 0.2989 * r + 0.5866 * g + 0.1145 * b;\n    Cr = 0.7132 * (r - Y);\n    Cb = 0.5647 * (b - Y);\n    float blendValue = 1.0 - smoothstep(0.4, 0.4 + 0.1, distance(vec2(Cr, Cb), vec2(screenReplaceColor.g, screenReplaceColor.b)));\n    vec3 diff = screen.rgb - _smooth.rgb;\n    _smooth.rgb = _smooth.rgb + blendValue * diff;\n    gl_FragColor = _smooth;\n}\n";
  private float[] mtx = new float[16];
  private int screenColorLocation = -1;
  private int screenMirrorXLocation = -1;
  private int screenMirrorYLocation = -1;
  private int screenModeLocation = -1;
  private float[] screenReplaceColor = { 0.0F, 1.0F, 0.0F };
  
  TXCGPUColorScreenFilter()
  {
    super("precision mediump float;\nvarying highp vec2 textureCoordinate;\nvarying highp vec2 textureCoordinate2;\nvarying highp vec2 textureCoordinate3;\nuniform sampler2D inputImageTexture;\nuniform sampler2D inputImageTexture2;\nuniform sampler2D inputImageTexture3;\nuniform mediump vec3 screenReplaceColor; //YUV数据\nuniform float screenMirrorX;\nuniform float screenMirrorY;\n\nvoid main()\n{\n    highp vec4 _smooth = texture2D(inputImageTexture,textureCoordinate);\n    highp vec4 origin = texture2D(inputImageTexture2,textureCoordinate2);\n    \n    lowp float r = origin.r;\n    lowp float g = origin.g;\n    lowp float b = origin.b;\n    float Cr = 128.0 - 37.797 * r - 74.203 * g + 112.0 * b;\n    float Cb = 128.0 + 112.0 * r - 93.768 * g - 18.214 * b;\n    \n    highp vec2 screenPos = textureCoordinate3;\n    if(screenMirrorX != 0.0)screenPos.x = 1.0 - screenPos.x;\n    if(screenMirrorY != 0.0)screenPos.y = 1.0 - screenPos.y;\n    highp vec4 screen = texture2D(inputImageTexture3, screenPos);\n    float Y = 0.2989 * r + 0.5866 * g + 0.1145 * b;\n    Cr = 0.7132 * (r - Y);\n    Cb = 0.5647 * (b - Y);\n    float blendValue = 1.0 - smoothstep(0.4, 0.4 + 0.1, distance(vec2(Cr, Cb), vec2(screenReplaceColor.g, screenReplaceColor.b)));\n    vec3 diff = screen.rgb - _smooth.rgb;\n    _smooth.rgb = _smooth.rgb + blendValue * diff;\n    gl_FragColor = _smooth;\n}\n");
  }
  
  public void enableScreenMode(boolean paramBoolean)
  {
    int i = this.screenModeLocation;
    if (paramBoolean) {}
    for (float f = 1.0F;; f = 0.0F)
    {
      setFloat(i, f);
      return;
    }
  }
  
  public void onInitialized()
  {
    super.onInitialized();
    this.screenModeLocation = GLES20.glGetUniformLocation(getProgram(), "screenMode");
    this.screenColorLocation = GLES20.glGetUniformLocation(getProgram(), "screenReplaceColor");
    this.screenMirrorXLocation = GLES20.glGetUniformLocation(getProgram(), "screenMirrorX");
    this.screenMirrorYLocation = GLES20.glGetUniformLocation(getProgram(), "screenMirrorY");
    setScreenColor(this.screenReplaceColor);
  }
  
  public void setScreenColor(float[] paramArrayOfFloat)
  {
    float[] arrayOfFloat = new float[3];
    arrayOfFloat[0] = ((float)(0.2989D * paramArrayOfFloat[0] + 0.5866D * paramArrayOfFloat[1] + 0.1145D * paramArrayOfFloat[2]));
    arrayOfFloat[1] = ((float)(0.7132D * (paramArrayOfFloat[0] - arrayOfFloat[0])));
    arrayOfFloat[2] = ((float)(0.5647D * (paramArrayOfFloat[2] - arrayOfFloat[0])));
    setFloatVec3(this.screenColorLocation, arrayOfFloat);
  }
  
  public void setScreenMirrorX(boolean paramBoolean)
  {
    int i = this.screenMirrorXLocation;
    if (paramBoolean) {}
    for (float f = 1.0F;; f = 0.0F)
    {
      setFloat(i, f);
      return;
    }
  }
  
  public void setScreenMirrorY(boolean paramBoolean)
  {
    int i = this.screenMirrorYLocation;
    if (paramBoolean) {}
    for (float f = 1.0F;; f = 0.0F)
    {
      setFloat(i, f);
      return;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\liteav\beauty\gpu_filters\TXCGPUColorScreenFilter.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */