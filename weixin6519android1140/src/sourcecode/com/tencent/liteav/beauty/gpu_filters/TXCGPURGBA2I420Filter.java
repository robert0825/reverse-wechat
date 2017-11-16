package com.tencent.liteav.beauty.gpu_filters;

import android.opengl.GLES20;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.basic.opengl.TXCGPUFilter;
import com.tencent.liteav.beauty.NativeLoad;

public class TXCGPURGBA2I420Filter
  extends TXCGPUFilter
{
  private String TAG = "RGBA2I420Filter";
  private int mDataFormat = 1;
  private int mHeightLocation = -1;
  private int mWidthLocation = -1;
  
  public TXCGPURGBA2I420Filter(int paramInt)
  {
    super("attribute vec4 position;\nattribute vec4 inputTextureCoordinate;\n \nvarying vec2 textureCoordinate;\n \nvoid main()\n{\n    gl_Position = position;\n    textureCoordinate = inputTextureCoordinate.xy;\n}", "varying lowp vec2 textureCoordinate;\n \nuniform sampler2D inputImageTexture;\n \nvoid main()\n{\n     gl_FragColor = texture2D(inputImageTexture, textureCoordinate);\n}");
    this.mDataFormat = paramInt;
  }
  
  public void getParamHandle()
  {
    this.mWidthLocation = GLES20.glGetUniformLocation(getProgram(), "width");
    this.mHeightLocation = GLES20.glGetUniformLocation(getProgram(), "height");
  }
  
  public boolean init()
  {
    if (1 == this.mDataFormat)
    {
      NativeLoad.getInstance();
      this.mGLProgId = NativeLoad.nativeLoadGLProgram(8);
      TXCLog.i(this.TAG, "RGB-->I420 init!");
      if ((this.mGLProgId == 0) || (!onInit())) {
        break label160;
      }
    }
    label160:
    for (this.mIsInitialized = true;; this.mIsInitialized = false)
    {
      onInitialized();
      return this.mIsInitialized;
      if (3 == this.mDataFormat)
      {
        TXCLog.i(this.TAG, "RGB-->NV21 init!");
        NativeLoad.getInstance();
        this.mGLProgId = NativeLoad.nativeLoadGLProgram(11);
        break;
      }
      if (2 == this.mDataFormat)
      {
        TXCLog.i(this.TAG, "RGBA Format init!");
        return super.init();
      }
      TXCLog.i(this.TAG, "don't support format " + this.mDataFormat + " use default I420");
      NativeLoad.getInstance();
      this.mGLProgId = NativeLoad.nativeLoadGLProgram(8);
      break;
    }
  }
  
  public boolean onInit()
  {
    super.onInit();
    getParamHandle();
    return true;
  }
  
  public void onInitialized()
  {
    super.onInitialized();
  }
  
  public void onOutputSizeChanged(int paramInt1, int paramInt2)
  {
    if ((paramInt1 <= 0) || (paramInt2 <= 0))
    {
      TXCLog.e(this.TAG, "width or height is error!");
      return;
    }
    super.onOutputSizeChanged(paramInt1, paramInt2);
    TXCLog.i(this.TAG, "RGBA2I420Filter width " + paramInt1 + " height " + paramInt2);
    setFloat(this.mWidthLocation, paramInt1);
    setFloat(this.mHeightLocation, paramInt2);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\liteav\beauty\gpu_filters\TXCGPURGBA2I420Filter.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */