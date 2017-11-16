package com.tencent.liteav.beauty.gpu_filters;

import android.opengl.GLES20;
import com.tencent.liteav.basic.opengl.TXCGPUFilter;
import com.tencent.liteav.beauty.NativeLoad;

public class TXCGPUFaceFilter
  extends TXCGPUFilter
{
  private static final String bShaderFragmentShader = "precision highp float;  \nuniform sampler2D inputImageTexture;  \nuniform sampler2D inputImageTexture2;  \nvarying vec2 textureCoordinate;  \nvarying vec2 textureCoordinate2;  \nvoid main()  \n{  \n\tgl_FragColor = texture2D(inputImageTexture2, textureCoordinate2) - texture2D(inputImageTexture, textureCoordinate) * texture2D(inputImageTexture2, textureCoordinate2);  \n}  \n";
  private static final String retShaderFragmentShader = "precision highp float;   \nuniform sampler2D inputImageTexture;   \nuniform sampler2D inputImageTexture2;  \nuniform sampler2D inputImageTexture3;   \nvarying vec2 textureCoordinate;   \nvarying vec2 textureCoordinate2;  \nvarying vec2 textureCoordinate3;    \nvoid main()   \n{   \n\tgl_FragColor = texture2D(inputImageTexture, textureCoordinate) * texture2D(inputImageTexture3, textureCoordinate3) + texture2D(inputImageTexture2, textureCoordinate2);   \n}   \n";
  private int[] frameBufferTextures;
  private int[] frameBuffers;
  private bShader mBShader;
  private TXCGPUBoxBlurFilter mBoxFilter;
  boolean mCustomizeSamplingRatio;
  private retShader mRetShader;
  private TXCGPUFilter mSamplingFilter;
  int mSamplingHeight;
  private float mSamplingRatio = 4.0F;
  int mSamplingWidth;
  private varShader mVarShader;
  
  public void onDestroy()
  {
    if (this.mIsInitialized)
    {
      super.onDestroy();
      this.mBoxFilter.destroy();
      this.mVarShader.destroy();
      this.mBShader.destroy();
      this.mRetShader.destroy();
      this.mSamplingFilter.destroy();
      if (this.frameBuffers != null)
      {
        GLES20.glDeleteFramebuffers(this.frameBuffers.length, this.frameBuffers, 0);
        GLES20.glDeleteTextures(this.frameBuffers.length, this.frameBufferTextures, 0);
        this.frameBuffers = null;
      }
      this.frameBufferTextures = null;
    }
  }
  
  public int onDrawToTexture(int paramInt)
  {
    if (this.mSamplingRatio != 1.0F) {
      GLES20.glViewport(0, 0, this.mSamplingWidth, this.mSamplingHeight);
    }
    for (int i = this.mSamplingFilter.onDrawToTexture(paramInt);; i = paramInt)
    {
      int j = this.mBoxFilter.onDrawToTexture(i, this.frameBuffers[4], this.frameBufferTextures[4]);
      i = this.mVarShader.onDrawToTexture(i, j, this.frameBuffers[0], this.frameBufferTextures[0]);
      j = this.mBShader.onDrawToTexture(i, j, this.frameBuffers[1], this.frameBufferTextures[1]);
      int k = this.mBoxFilter.onDrawToTexture(i, this.frameBuffers[2], this.frameBufferTextures[2]);
      int m = this.mBoxFilter.onDrawToTexture(j, this.frameBuffers[3], this.frameBufferTextures[3]);
      j = k;
      i = m;
      if (this.mSamplingRatio != 1.0F)
      {
        GLES20.glViewport(0, 0, this.mOutputWidth, this.mOutputHeight);
        j = this.mSamplingFilter.onDrawToTexture(k, this.frameBuffers[5], this.frameBufferTextures[5]);
        i = this.mSamplingFilter.onDrawToTexture(m, this.frameBuffers[6], this.frameBufferTextures[6]);
      }
      return this.mRetShader.onDrawToTexture(j, i, paramInt, this.frameBuffers[7], this.frameBufferTextures[7]);
    }
  }
  
  public boolean onInit()
  {
    boolean bool2 = super.onInit();
    if (bool2)
    {
      this.mBoxFilter = new TXCGPUBoxBlurFilter();
      boolean bool1 = bool2;
      if (bool2) {
        bool1 = this.mBoxFilter.init();
      }
      this.mVarShader = new varShader();
      bool2 = bool1;
      if (bool1) {
        bool2 = this.mVarShader.init();
      }
      this.mBShader = new bShader("precision highp float;  \nuniform sampler2D inputImageTexture;  \nuniform sampler2D inputImageTexture2;  \nvarying vec2 textureCoordinate;  \nvarying vec2 textureCoordinate2;  \nvoid main()  \n{  \n\tgl_FragColor = texture2D(inputImageTexture2, textureCoordinate2) - texture2D(inputImageTexture, textureCoordinate) * texture2D(inputImageTexture2, textureCoordinate2);  \n}  \n");
      bool1 = bool2;
      if (bool2) {
        bool1 = this.mBShader.init();
      }
      this.mRetShader = new retShader("precision highp float;   \nuniform sampler2D inputImageTexture;   \nuniform sampler2D inputImageTexture2;  \nuniform sampler2D inputImageTexture3;   \nvarying vec2 textureCoordinate;   \nvarying vec2 textureCoordinate2;  \nvarying vec2 textureCoordinate3;    \nvoid main()   \n{   \n\tgl_FragColor = texture2D(inputImageTexture, textureCoordinate) * texture2D(inputImageTexture3, textureCoordinate3) + texture2D(inputImageTexture2, textureCoordinate2);   \n}   \n");
      bool2 = bool1;
      if (bool1) {
        bool2 = this.mRetShader.init();
      }
      this.mSamplingFilter = new TXCGPUFilter();
      this.mSamplingFilter.setHasFrameBuffer(true);
      bool1 = bool2;
      if (bool2) {
        bool1 = this.mSamplingFilter.init();
      }
      if (bool1) {
        return true;
      }
    }
    destroy();
    return false;
  }
  
  public void onOutputSizeChanged(int paramInt1, int paramInt2)
  {
    super.onOutputSizeChanged(paramInt1, paramInt2);
    int i;
    if (!this.mCustomizeSamplingRatio)
    {
      if (paramInt1 >= paramInt2) {
        break label360;
      }
      if (paramInt1 < 540) {
        this.mSamplingRatio = 1.0F;
      }
    }
    else
    {
      this.mSamplingWidth = ((int)(paramInt1 / this.mSamplingRatio));
      this.mSamplingHeight = ((int)(paramInt2 / this.mSamplingRatio));
      this.mSamplingFilter.onOutputSizeChanged(this.mSamplingWidth, this.mSamplingHeight);
      this.mVarShader.onOutputSizeChanged(this.mSamplingWidth, this.mSamplingHeight);
      this.mBShader.onOutputSizeChanged(this.mSamplingWidth, this.mSamplingHeight);
      this.mRetShader.onOutputSizeChanged(paramInt1, paramInt2);
      this.mBoxFilter.onOutputSizeChanged(this.mSamplingWidth, this.mSamplingHeight);
      if (this.frameBuffers != null)
      {
        GLES20.glDeleteFramebuffers(this.frameBuffers.length, this.frameBuffers, 0);
        GLES20.glDeleteTextures(this.frameBuffers.length, this.frameBufferTextures, 0);
        this.frameBuffers = null;
        this.frameBufferTextures = null;
      }
      this.frameBuffers = new int[8];
      this.frameBufferTextures = new int[this.frameBuffers.length];
      GLES20.glGenFramebuffers(this.frameBuffers.length, this.frameBuffers, 0);
      GLES20.glGenTextures(this.frameBuffers.length, this.frameBufferTextures, 0);
      i = 0;
      label213:
      if (i >= this.frameBuffers.length) {
        return;
      }
      GLES20.glBindTexture(3553, this.frameBufferTextures[i]);
      if (i < 5) {
        break label384;
      }
      GLES20.glTexImage2D(3553, 0, 6408, paramInt1, paramInt2, 0, 6408, 5121, null);
    }
    for (;;)
    {
      GLES20.glTexParameterf(3553, 10240, 9729.0F);
      GLES20.glTexParameterf(3553, 10241, 9729.0F);
      GLES20.glTexParameterf(3553, 10242, 33071.0F);
      GLES20.glTexParameterf(3553, 10243, 33071.0F);
      GLES20.glBindFramebuffer(36160, this.frameBuffers[i]);
      GLES20.glFramebufferTexture2D(36160, 36064, 3553, this.frameBufferTextures[i], 0);
      GLES20.glBindTexture(3553, 0);
      GLES20.glBindFramebuffer(36160, 0);
      i += 1;
      break label213;
      this.mSamplingRatio = 4.0F;
      break;
      label360:
      if (paramInt2 < 540)
      {
        this.mSamplingRatio = 1.0F;
        break;
      }
      this.mSamplingRatio = 4.0F;
      break;
      label384:
      GLES20.glTexImage2D(3553, 0, 6408, this.mSamplingWidth, this.mSamplingHeight, 0, 6408, 5121, null);
    }
  }
  
  public void setSamplingRatio(float paramFloat)
  {
    this.mSamplingRatio = paramFloat;
    this.mCustomizeSamplingRatio = true;
  }
  
  private static class bShader
    extends TXCGPUTwoInputFilter
  {
    public bShader(String paramString)
    {
      super();
    }
    
    public boolean onInit()
    {
      return super.onInit();
    }
  }
  
  private static class retShader
    extends TXCGPUThreeInputFilter
  {
    public retShader(String paramString)
    {
      super();
    }
    
    public boolean onInit()
    {
      return super.onInit();
    }
  }
  
  private static class varShader
    extends TXCGPUTwoInputFilter
  {
    int mHeightOffsetLocation;
    float mTexelSpacing = 1.5F;
    int mWidthOffsetLocation;
    
    public varShader()
    {
      super(null);
    }
    
    public boolean init()
    {
      NativeLoad.getInstance();
      this.mGLProgId = NativeLoad.nativeLoadGLProgram(2);
      if ((this.mGLProgId != 0) && (onInit())) {}
      for (this.mIsInitialized = true;; this.mIsInitialized = false)
      {
        onInitialized();
        return this.mIsInitialized;
      }
    }
    
    void initTexelSpace(float paramFloat)
    {
      this.mTexelSpacing = paramFloat;
      setFloat(this.mWidthOffsetLocation, this.mTexelSpacing / this.mOutputWidth);
      setFloat(this.mHeightOffsetLocation, this.mTexelSpacing / this.mOutputHeight);
    }
    
    public boolean onInit()
    {
      if (super.onInit())
      {
        this.mWidthOffsetLocation = GLES20.glGetUniformLocation(this.mGLProgId, "texelWidthOffset");
        this.mHeightOffsetLocation = GLES20.glGetUniformLocation(this.mGLProgId, "texelHeightOffset");
        return true;
      }
      return false;
    }
    
    public void onOutputSizeChanged(int paramInt1, int paramInt2)
    {
      super.onOutputSizeChanged(paramInt1, paramInt2);
      initTexelSpace(this.mTexelSpacing);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\liteav\beauty\gpu_filters\TXCGPUFaceFilter.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */