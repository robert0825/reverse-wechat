package com.tencent.liteav.beauty.gpu_filters.beauty2;

import com.tencent.liteav.basic.opengl.TXCGPUFilter;
import com.tencent.liteav.beauty.NativeLoad;

public class TXCTILSkinFilter
  extends TXCGPUFilter
{
  TXCTILSkinFilter()
  {
    super("attribute vec4 position;\nattribute vec4 inputTextureCoordinate;\n \nvarying vec2 textureCoordinate;\n \nvoid main()\n{\n    gl_Position = position;\n    textureCoordinate = inputTextureCoordinate.xy;\n}", "varying lowp vec2 textureCoordinate;\n \nuniform sampler2D inputImageTexture;\n \nvoid main()\n{\n     gl_FragColor = texture2D(inputImageTexture, textureCoordinate);\n}");
  }
  
  public boolean init()
  {
    NativeLoad.getInstance();
    this.mGLProgId = NativeLoad.nativeLoadGLProgram(6);
    if ((this.mGLProgId != 0) && (onInit())) {}
    for (this.mIsInitialized = true;; this.mIsInitialized = false)
    {
      onInitialized();
      return this.mIsInitialized;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\liteav\beauty\gpu_filters\beauty2\TXCTILSkinFilter.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */