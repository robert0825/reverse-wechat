package com.tencent.liteav.beauty.gpu_filters;

import android.opengl.GLES20;
import com.tencent.liteav.beauty.NativeLoad;

public class TXCGPUBeautyFilter
  extends TXCBeautyInterFace
{
  private static final String TAG = TXCGPUBeautyFilter.class.getSimpleName();
  private BeautyCoreFilter mBeautyCoreFilter;
  private float mBeautyLevel = 0.0F;
  private int mFrameHeight = -1;
  private int mFrameWidth = -1;
  private TXCGPUFaceFilter mNewFaceFilter;
  private float mRuddyLevel = 0.0F;
  private float mSharnessLevel = 0.0F;
  private TXCGPUSharpenFilter mSharpenessFilter = null;
  private float mWhiteLevel = 0.0F;
  
  private static float getDistance(int paramInt)
  {
    float f2 = paramInt;
    if (f2 > 1.0F)
    {
      float f1;
      if (f2 < 4.1D) {
        f1 = getValue((f2 - 1.0F) / 3.1F, 4.0F, 3.0F);
      }
      do
      {
        return f1;
        if (f2 < 5.6D) {
          return getValue((f2 - 4.1F) / 1.5F, 3.0F, 2.8F);
        }
        if (f2 < 6.8D) {
          return getValue((f2 - 5.6F) / 1.2000003F, 2.8F, 3.0F);
        }
        f1 = f2;
      } while (f2 > 7.0D);
      return getValue((f2 - 6.8F) / 0.19999981F, 3.0F, 2.0F);
    }
    return 4.0F;
  }
  
  public static float getNewBeautyLevel(float paramFloat)
  {
    if (paramFloat > 1.0F)
    {
      float f;
      if (paramFloat < 2.5D) {
        f = getValue((paramFloat - 1.0F) / 1.5F, 1.0F, 4.1F);
      }
      for (;;)
      {
        return f / 10.0F;
        if (paramFloat < 4.0F)
        {
          f = getValue((paramFloat - 2.5F) / 1.5F, 4.1F, 5.6F);
        }
        else if (paramFloat < 5.5D)
        {
          f = getValue((paramFloat - 4.0F) / 1.5F, 5.6F, 6.8F);
        }
        else
        {
          f = paramFloat;
          if (paramFloat <= 7.0D) {
            f = getValue((paramFloat - 5.5F) / 1.5F, 6.8F, 7.0F);
          }
        }
      }
    }
    return 0.1F;
  }
  
  private static float getValue(float paramFloat1, float paramFloat2, float paramFloat3)
  {
    return (paramFloat3 - paramFloat2) * paramFloat1 + paramFloat2;
  }
  
  public boolean init(int paramInt1, int paramInt2)
  {
    this.mFrameWidth = paramInt1;
    this.mFrameHeight = paramInt2;
    if (this.mSharpenessFilter == null)
    {
      this.mSharpenessFilter = new TXCGPUSharpenFilter();
      this.mSharpenessFilter.setHasFrameBuffer(true);
      if (!this.mSharpenessFilter.init()) {
        return false;
      }
      this.mSharpenessFilter.onOutputSizeChanged(this.mFrameWidth, this.mFrameHeight);
    }
    this.mNewFaceFilter = new TXCGPUFaceFilter();
    this.mNewFaceFilter.setHasFrameBuffer(true);
    this.mBeautyCoreFilter = new BeautyCoreFilter();
    this.mBeautyCoreFilter.setHasFrameBuffer(true);
    if ((this.mBeautyCoreFilter.init()) && (this.mNewFaceFilter.init()))
    {
      this.mBeautyCoreFilter.onOutputSizeChanged(this.mFrameWidth, this.mFrameHeight);
      this.mNewFaceFilter.onOutputSizeChanged(this.mFrameWidth, this.mFrameHeight);
      if (GLES20.glGetError() != 0)
      {
        onDestroy();
        return false;
      }
    }
    else
    {
      onDestroy();
      return false;
    }
    return true;
  }
  
  public void onDestroy()
  {
    if (this.mBeautyCoreFilter != null)
    {
      this.mBeautyCoreFilter.destroy();
      this.mBeautyCoreFilter = null;
    }
    if (this.mNewFaceFilter != null)
    {
      this.mNewFaceFilter.destroy();
      this.mNewFaceFilter = null;
    }
    if (this.mSharpenessFilter != null)
    {
      this.mSharpenessFilter.destroy();
      this.mSharpenessFilter = null;
    }
  }
  
  public int onDrawToTexture(int paramInt)
  {
    if ((this.mBeautyLevel <= 0.0F) && (this.mWhiteLevel <= 0.0F))
    {
      i = paramInt;
      if (this.mRuddyLevel <= 0.0F) {}
    }
    else
    {
      if (this.mBeautyLevel == 0.0F) {
        break label80;
      }
    }
    label80:
    for (int i = this.mNewFaceFilter.onDrawToTexture(paramInt);; i = paramInt)
    {
      i = this.mBeautyCoreFilter.onDrawToTexture(i, paramInt, paramInt);
      paramInt = i;
      if (this.mSharnessLevel > 0.0F) {
        paramInt = this.mSharpenessFilter.onDrawToTexture(i);
      }
      return paramInt;
    }
  }
  
  public void onOutputSizeChanged(int paramInt1, int paramInt2)
  {
    if (this.mBeautyCoreFilter != null) {
      this.mBeautyCoreFilter.onOutputSizeChanged(paramInt1, paramInt2);
    }
    if (this.mNewFaceFilter != null) {
      this.mNewFaceFilter.onOutputSizeChanged(paramInt1, paramInt2);
    }
  }
  
  public void setBeautyLevel(int paramInt)
  {
    this.mBeautyLevel = paramInt;
    if (this.mBeautyCoreFilter != null) {
      this.mBeautyCoreFilter.setBeautyLevel(paramInt);
    }
  }
  
  public void setRuddyLevel(int paramInt)
  {
    this.mRuddyLevel = paramInt;
    if (this.mBeautyCoreFilter != null) {
      this.mBeautyCoreFilter.setRuddyLevel(paramInt);
    }
  }
  
  public void setShapenLevel(int paramInt)
  {
    this.mSharnessLevel = (paramInt / 15.0F);
    if (this.mSharpenessFilter != null) {
      this.mSharpenessFilter.setSharpness(this.mSharnessLevel);
    }
  }
  
  public void setWhitenessLevel(int paramInt)
  {
    this.mWhiteLevel = paramInt;
    if (this.mBeautyCoreFilter != null) {
      this.mBeautyCoreFilter.setBrightLevel(paramInt);
    }
  }
  
  public static class BeautyCoreFilter
    extends TXCGPUThreeInputFilter
  {
    private int beautyDegreeLocation = -1;
    private int brightDegreeLocation = -1;
    private int mRuddyLocation = -1;
    
    public BeautyCoreFilter()
    {
      super("varying lowp vec2 textureCoordinate;\n \nuniform sampler2D inputImageTexture;\n \nvoid main()\n{\n     gl_FragColor = texture2D(inputImageTexture, textureCoordinate);\n}");
    }
    
    public boolean init()
    {
      NativeLoad.getInstance();
      this.mGLProgId = NativeLoad.nativeLoadGLProgram(1);
      if ((this.mGLProgId != 0) && (onInit())) {}
      for (this.mIsInitialized = true;; this.mIsInitialized = false)
      {
        onInitialized();
        return this.mIsInitialized;
      }
    }
    
    public boolean onInit()
    {
      return super.onInit();
    }
    
    public void onOutputSizeChanged(int paramInt1, int paramInt2)
    {
      super.onOutputSizeChanged(paramInt1, paramInt2);
      this.beautyDegreeLocation = GLES20.glGetUniformLocation(getProgram(), "smoothDegree");
      this.brightDegreeLocation = GLES20.glGetUniformLocation(getProgram(), "brightDegree");
      this.mRuddyLocation = GLES20.glGetUniformLocation(getProgram(), "ruddyDegree");
    }
    
    public void setBeautyLevel(float paramFloat)
    {
      setFloat(this.beautyDegreeLocation, TXCGPUBeautyFilter.getNewBeautyLevel(paramFloat));
    }
    
    public void setBrightLevel(float paramFloat)
    {
      setFloat(this.brightDegreeLocation, paramFloat / 3.0F);
    }
    
    public void setRuddyLevel(float paramFloat)
    {
      setFloat(this.mRuddyLocation, paramFloat / 10.0F / 2.0F);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\liteav\beauty\gpu_filters\TXCGPUBeautyFilter.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */