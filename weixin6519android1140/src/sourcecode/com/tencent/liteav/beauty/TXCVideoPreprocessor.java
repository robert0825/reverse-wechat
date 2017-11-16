package com.tencent.liteav.beauty;

import android.annotation.TargetApi;
import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.ConfigurationInfo;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build.VERSION;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.basic.opengl.CropRect;
import com.tencent.liteav.basic.opengl.TXCOpenGlUtils;
import java.util.List;

public class TXCVideoPreprocessor
{
  private static final int ROTATE_180 = 2;
  private static final int ROTATE_270 = 3;
  private static final int ROTATE_90 = 1;
  protected static final String TAG = "TXCVideoPreprocessor";
  public static final String VERSION = "VideoPreprocessor-v1.1";
  protected InitConfig mConfig = new InitConfig();
  protected Context mContext;
  protected TXCFilterDrawer mDrawer;
  protected InitParam mInitParam = null;
  protected CropRect mRectCrop = null;
  protected boolean mbIfGLContext = true;
  protected boolean mbIfxMirrox = false;
  private boolean mbProcessPerformModel = false;
  protected int miOutputAngle = 0;
  protected int miOutputHeight = 0;
  protected int miOutputWidth = 0;
  
  public TXCVideoPreprocessor(Context paramContext, boolean paramBoolean)
  {
    Object localObject = (ActivityManager)paramContext.getSystemService("activity");
    TXCLog.i("TXCVideoPreprocessor", "TXCVideoPreprocessor version: VideoPreprocessor-v1.1");
    localObject = ((ActivityManager)localObject).getDeviceConfigurationInfo();
    if (localObject != null)
    {
      TXCLog.i("TXCVideoPreprocessor", "opengl es version " + ((ConfigurationInfo)localObject).reqGlEsVersion);
      TXCLog.i("TXCVideoPreprocessor", "set GLContext " + paramBoolean);
      if (((ConfigurationInfo)localObject).reqGlEsVersion > 131072)
      {
        TXCLog.i("TXCVideoPreprocessor", "This devices is OpenGlUtils.OPENGL_ES_3");
        TXCOpenGlUtils.setOpenGLVersion(3);
      }
    }
    for (;;)
    {
      this.mContext = paramContext;
      this.mbIfGLContext = paramBoolean;
      this.mDrawer = new TXCFilterDrawer(this.mContext, this.mbIfGLContext);
      ReportDuaManage.getInstance().reportSDKInit(paramContext);
      return;
      TXCLog.i("TXCVideoPreprocessor", "This devices is OpenGlUtils.OPENGL_ES_2");
      TXCOpenGlUtils.setOpenGLVersion(2);
      continue;
      TXCLog.e("TXCVideoPreprocessor", "getDeviceConfigurationInfo opengl Info failed!");
    }
  }
  
  private int getInputAngle(int paramInt)
  {
    switch (paramInt)
    {
    default: 
      return paramInt;
    case 1: 
      return 90;
    case 2: 
      return 180;
    }
    return 270;
  }
  
  private boolean init(InitParam paramInitParam)
  {
    this.mConfig.mOriginWidth = paramInitParam.originWidth;
    this.mConfig.mOriginHeight = paramInitParam.originHeight;
    this.mConfig.mCropRect = paramInitParam.cropRect;
    this.mConfig.mInputWidth = paramInitParam.inputWidth;
    this.mConfig.mInputHeight = paramInitParam.inputHeight;
    this.mConfig.mInputAngle = ((paramInitParam.inputAngle + 360) % 360);
    this.mConfig.mOutputWidht = paramInitParam.outputWidth;
    this.mConfig.mOutputHeight = paramInitParam.outputHeight;
    this.mConfig.mOutputAngle = paramInitParam.outputAngle;
    this.mConfig.mHasGLContext = paramInitParam.hasGLContext;
    this.mConfig.mInputXMirror = paramInitParam.inputXMirror;
    this.mConfig.inputFormat = paramInitParam.inputFormat;
    this.mConfig.outputFormat = paramInitParam.outputFormat;
    if (this.mDrawer == null) {
      this.mDrawer = new TXCFilterDrawer(this.mContext, paramInitParam.hasGLContext);
    }
    return this.mDrawer.init(this.mConfig);
  }
  
  private boolean initSDK(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
  {
    if (this.mInitParam == null) {
      this.mInitParam = new InitParam();
    }
    if ((paramInt1 != this.mInitParam.originWidth) || (paramInt2 != this.mInitParam.originHeight) || (paramInt3 != this.mInitParam.inputAngle) || ((this.miOutputWidth > 0) && (this.miOutputWidth != this.mInitParam.outputWidth)) || ((this.miOutputHeight > 0) && (this.miOutputHeight != this.mInitParam.outputHeight)) || ((this.miOutputAngle > 0) && (this.miOutputAngle != this.mInitParam.outputAngle)) || ((this.mRectCrop != null) && (((this.mRectCrop.cropWidth > 0) && ((this.mInitParam.cropRect == null) || (this.mRectCrop.cropWidth != this.mInitParam.cropRect.cropWidth))) || ((this.mRectCrop.cropHeight > 0) && ((this.mInitParam.cropRect == null) || (this.mRectCrop.cropHeight != this.mInitParam.cropRect.cropHeight))) || ((this.mRectCrop.xOffset >= 0) && ((this.mInitParam.cropRect == null) || (this.mRectCrop.xOffset != this.mInitParam.cropRect.xOffset))) || ((this.mRectCrop.yOffset >= 0) && ((this.mInitParam.cropRect == null) || (this.mRectCrop.yOffset != this.mInitParam.cropRect.yOffset))))) || (this.mbIfxMirrox != this.mInitParam.inputXMirror))
    {
      TXCLog.i("TXCVideoPreprocessor", "Init sdk");
      TXCLog.i("TXCVideoPreprocessor", "Input widht " + paramInt1 + " height " + paramInt2);
      this.mInitParam.originWidth = paramInt1;
      this.mInitParam.originHeight = paramInt2;
      int j = paramInt1;
      int i = paramInt2;
      if (this.mRectCrop != null)
      {
        j = paramInt1;
        i = paramInt2;
        if (this.mRectCrop.xOffset >= 0)
        {
          j = paramInt1;
          i = paramInt2;
          if (this.mRectCrop.yOffset >= 0)
          {
            j = paramInt1;
            i = paramInt2;
            if (this.mRectCrop.cropWidth > 0)
            {
              j = paramInt1;
              i = paramInt2;
              if (this.mRectCrop.cropHeight > 0)
              {
                TXCLog.i("TXCVideoPreprocessor", "set Crop Rect; init ");
                if (paramInt1 - this.mRectCrop.xOffset <= this.mRectCrop.cropWidth) {
                  break label872;
                }
                paramInt1 = this.mRectCrop.cropWidth;
                if (paramInt2 - this.mRectCrop.yOffset <= this.mRectCrop.cropHeight) {
                  break label885;
                }
                paramInt2 = this.mRectCrop.cropHeight;
                label490:
                this.mRectCrop.cropWidth = paramInt1;
                this.mRectCrop.cropHeight = paramInt2;
                j = this.mRectCrop.cropWidth;
                i = this.mRectCrop.cropHeight;
                this.mInitParam.cropRect = this.mRectCrop;
              }
            }
          }
        }
      }
      this.mInitParam.inputAngle = paramInt3;
      this.mInitParam.hasGLContext = this.mbIfGLContext;
      this.mInitParam.inputFormat = paramInt4;
      this.mInitParam.outputFormat = paramInt5;
      if (true == this.mbProcessPerformModel)
      {
        this.mInitParam.outputWidth = this.miOutputWidth;
        this.mInitParam.outputHeight = this.miOutputHeight;
        label602:
        this.mInitParam.outputAngle = this.miOutputAngle;
        if (this.mInitParam.outputAngle <= 0) {
          this.mInitParam.outputAngle = 0;
        }
        if ((this.mInitParam.outputWidth <= 0) || (this.mInitParam.outputHeight <= 0))
        {
          if ((90 != this.mInitParam.outputAngle) && (270 != this.mInitParam.outputAngle)) {
            break label917;
          }
          this.mInitParam.outputWidth = i;
          this.mInitParam.outputHeight = j;
        }
        label694:
        if ((90 != this.mInitParam.outputAngle) && (270 != this.mInitParam.outputAngle)) {
          break label938;
        }
        this.mInitParam.inputWidth = this.mInitParam.outputHeight;
        this.mInitParam.inputHeight = this.mInitParam.outputWidth;
        label747:
        if (true != this.mbProcessPerformModel)
        {
          this.mInitParam.outputWidth = this.miOutputWidth;
          this.mInitParam.outputHeight = this.miOutputHeight;
          if ((this.mInitParam.outputWidth <= 0) || (this.mInitParam.outputHeight <= 0))
          {
            if ((90 != this.mInitParam.outputAngle) && (270 != this.mInitParam.outputAngle)) {
              break label969;
            }
            this.mInitParam.outputWidth = i;
          }
        }
      }
      for (this.mInitParam.outputHeight = j;; this.mInitParam.outputHeight = i)
      {
        this.mInitParam.inputXMirror = this.mbIfxMirrox;
        if (init(this.mInitParam)) {
          break label1059;
        }
        TXCLog.e("TXCVideoPreprocessor", "init failed!");
        return false;
        label872:
        paramInt1 -= this.mRectCrop.xOffset;
        break;
        label885:
        paramInt2 -= this.mRectCrop.yOffset;
        break label490;
        this.mInitParam.outputWidth = 0;
        this.mInitParam.outputHeight = 0;
        break label602;
        label917:
        this.mInitParam.outputWidth = j;
        this.mInitParam.outputHeight = i;
        break label694;
        label938:
        this.mInitParam.inputWidth = this.mInitParam.outputWidth;
        this.mInitParam.inputHeight = this.mInitParam.outputHeight;
        break label747;
        label969:
        this.mInitParam.outputWidth = j;
      }
    }
    if ((paramInt4 != this.mInitParam.inputFormat) || (paramInt5 != this.mInitParam.outputFormat))
    {
      this.mInitParam.inputFormat = paramInt4;
      this.mConfig.inputFormat = paramInt4;
      this.mInitParam.outputFormat = paramInt5;
      this.mConfig.outputFormat = paramInt5;
      this.mDrawer.setOutPutFormat(paramInt5);
    }
    label1059:
    return true;
  }
  
  public String getVersion()
  {
    return "VideoPreprocessor-v1.1";
  }
  
  public int processFrame(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6)
  {
    try
    {
      initSDK(paramInt2, paramInt3, getInputAngle(paramInt4), paramInt5, paramInt6);
      this.mDrawer.initYUVFilter(this.mConfig);
      paramInt1 = this.mDrawer.onDrawToTexture(paramInt1, paramInt5);
      return paramInt1;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public int processFrame(byte[] paramArrayOfByte, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
  {
    try
    {
      initSDK(paramInt1, paramInt2, getInputAngle(paramInt3), paramInt4, paramInt5);
      this.mDrawer.initYUVFilter(this.mConfig);
      paramInt1 = this.mDrawer.onDrawToTexture(paramArrayOfByte, paramInt4);
      return paramInt1;
    }
    finally
    {
      paramArrayOfByte = finally;
      throw paramArrayOfByte;
    }
  }
  
  public void release()
  {
    try
    {
      if (this.mDrawer != null) {
        this.mDrawer.release();
      }
      this.mInitParam = null;
      return;
    }
    finally {}
  }
  
  public void setBeautyLevel(int paramInt)
  {
    if (paramInt > 9) {}
    for (;;)
    {
      try
      {
        TXCLog.e("TXCVideoPreprocessor", "Beauty value too large! set max value 9");
        i = 9;
        if (this.mDrawer != null) {
          this.mDrawer.setBeautyLevel(i);
        }
        return;
      }
      finally {}
      int i = paramInt;
      if (paramInt < 0)
      {
        TXCLog.e("TXCVideoPreprocessor", "Beauty < 0; set 0");
        i = 0;
      }
    }
  }
  
  public void setBeautyStyle(int paramInt)
  {
    try
    {
      if (this.mDrawer != null) {
        this.mDrawer.setBeautyStyle(paramInt);
      }
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public void setChinLevel(int paramInt)
  {
    if (this.mDrawer != null) {
      this.mDrawer.setChinLevel(paramInt);
    }
  }
  
  public void setCrop(CropRect paramCropRect)
  {
    try
    {
      this.mRectCrop = paramCropRect;
      return;
    }
    finally
    {
      paramCropRect = finally;
      throw paramCropRect;
    }
  }
  
  public void setEyeScaleLevel(int paramInt)
  {
    try
    {
      if (this.mDrawer != null) {
        this.mDrawer.setEyeScaleLevel(paramInt);
      }
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public void setFaceShortLevel(int paramInt)
  {
    if (this.mDrawer != null) {
      this.mDrawer.setFaceShortLevel(paramInt);
    }
  }
  
  public void setFaceSlimLevel(int paramInt)
  {
    try
    {
      if (this.mDrawer != null) {
        this.mDrawer.setFaceSlimLevel(paramInt);
      }
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public void setFaceVLevel(int paramInt)
  {
    if (this.mDrawer != null) {
      this.mDrawer.setFaceVLevel(paramInt);
    }
  }
  
  public void setFilterImage(Bitmap paramBitmap)
  {
    try
    {
      if (this.mDrawer != null) {
        this.mDrawer.setFilterImage(paramBitmap);
      }
      return;
    }
    finally
    {
      paramBitmap = finally;
      throw paramBitmap;
    }
  }
  
  public void setFilterImage(String paramString)
  {
    if (paramString != null) {}
    for (;;)
    {
      Bitmap localBitmap;
      try
      {
        if (true == paramString.isEmpty())
        {
          TXCLog.e("TXCVideoPreprocessor", "imagePath is empty!");
          return;
        }
        localBitmap = BitmapFactory.decodeFile(paramString);
        if (localBitmap == null)
        {
          TXCLog.e("TXCVideoPreprocessor", "image " + paramString + " Bitmap parse failed!");
          continue;
        }
        if (this.mDrawer == null) {
          continue;
        }
      }
      finally {}
      this.mDrawer.setFilterImage(localBitmap);
    }
  }
  
  public void setFilterMixLevel(float paramFloat)
  {
    try
    {
      if (this.mDrawer != null) {
        this.mDrawer.setFilterMixLevel(paramFloat);
      }
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  /* Error */
  public int setFilterType(int paramInt)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_2
    //   2: aload_0
    //   3: monitorenter
    //   4: aload_0
    //   5: getfield 134	com/tencent/liteav/beauty/TXCVideoPreprocessor:mContext	Landroid/content/Context;
    //   8: invokevirtual 355	android/content/Context:getResources	()Landroid/content/res/Resources;
    //   11: invokevirtual 361	android/content/res/Resources:getAssets	()Landroid/content/res/AssetManager;
    //   14: astore_3
    //   15: iload_1
    //   16: tableswitch	default:+259->275, 1:+66->82, 2:+94->110, 3:+110->126, 4:+126->142, 5:+142->158, 6:+158->174, 7:+174->190, 8:+190->206, 9:+206->222
    //   68: ldc 32
    //   70: ldc_w 363
    //   73: invokestatic 157	com/tencent/liteav/basic/log/TXCLog:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   76: iconst_m1
    //   77: istore_1
    //   78: aload_0
    //   79: monitorexit
    //   80: iload_1
    //   81: ireturn
    //   82: ldc 32
    //   84: ldc_w 365
    //   87: invokestatic 94	com/tencent/liteav/basic/log/TXCLog:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   90: aload_0
    //   91: getfield 140	com/tencent/liteav/beauty/TXCVideoPreprocessor:mDrawer	Lcom/tencent/liteav/beauty/TXCFilterDrawer;
    //   94: ifnull +11 -> 105
    //   97: aload_0
    //   98: getfield 140	com/tencent/liteav/beauty/TXCVideoPreprocessor:mDrawer	Lcom/tencent/liteav/beauty/TXCFilterDrawer;
    //   101: aload_2
    //   102: invokevirtual 326	com/tencent/liteav/beauty/TXCFilterDrawer:setFilterImage	(Landroid/graphics/Bitmap;)V
    //   105: iconst_0
    //   106: istore_1
    //   107: goto -29 -> 78
    //   110: aload_3
    //   111: ldc_w 367
    //   114: invokevirtual 373	android/content/res/AssetManager:open	(Ljava/lang/String;)Ljava/io/InputStream;
    //   117: invokestatic 377	android/graphics/BitmapFactory:decodeStream	(Ljava/io/InputStream;)Landroid/graphics/Bitmap;
    //   120: astore_3
    //   121: aload_3
    //   122: astore_2
    //   123: goto -33 -> 90
    //   126: aload_3
    //   127: ldc_w 379
    //   130: invokevirtual 373	android/content/res/AssetManager:open	(Ljava/lang/String;)Ljava/io/InputStream;
    //   133: invokestatic 377	android/graphics/BitmapFactory:decodeStream	(Ljava/io/InputStream;)Landroid/graphics/Bitmap;
    //   136: astore_3
    //   137: aload_3
    //   138: astore_2
    //   139: goto -49 -> 90
    //   142: aload_3
    //   143: ldc_w 381
    //   146: invokevirtual 373	android/content/res/AssetManager:open	(Ljava/lang/String;)Ljava/io/InputStream;
    //   149: invokestatic 377	android/graphics/BitmapFactory:decodeStream	(Ljava/io/InputStream;)Landroid/graphics/Bitmap;
    //   152: astore_3
    //   153: aload_3
    //   154: astore_2
    //   155: goto -65 -> 90
    //   158: aload_3
    //   159: ldc_w 383
    //   162: invokevirtual 373	android/content/res/AssetManager:open	(Ljava/lang/String;)Ljava/io/InputStream;
    //   165: invokestatic 377	android/graphics/BitmapFactory:decodeStream	(Ljava/io/InputStream;)Landroid/graphics/Bitmap;
    //   168: astore_3
    //   169: aload_3
    //   170: astore_2
    //   171: goto -81 -> 90
    //   174: aload_3
    //   175: ldc_w 385
    //   178: invokevirtual 373	android/content/res/AssetManager:open	(Ljava/lang/String;)Ljava/io/InputStream;
    //   181: invokestatic 377	android/graphics/BitmapFactory:decodeStream	(Ljava/io/InputStream;)Landroid/graphics/Bitmap;
    //   184: astore_3
    //   185: aload_3
    //   186: astore_2
    //   187: goto -97 -> 90
    //   190: aload_3
    //   191: ldc_w 387
    //   194: invokevirtual 373	android/content/res/AssetManager:open	(Ljava/lang/String;)Ljava/io/InputStream;
    //   197: invokestatic 377	android/graphics/BitmapFactory:decodeStream	(Ljava/io/InputStream;)Landroid/graphics/Bitmap;
    //   200: astore_3
    //   201: aload_3
    //   202: astore_2
    //   203: goto -113 -> 90
    //   206: aload_3
    //   207: ldc_w 389
    //   210: invokevirtual 373	android/content/res/AssetManager:open	(Ljava/lang/String;)Ljava/io/InputStream;
    //   213: invokestatic 377	android/graphics/BitmapFactory:decodeStream	(Ljava/io/InputStream;)Landroid/graphics/Bitmap;
    //   216: astore_3
    //   217: aload_3
    //   218: astore_2
    //   219: goto -129 -> 90
    //   222: aload_3
    //   223: ldc_w 391
    //   226: invokevirtual 373	android/content/res/AssetManager:open	(Ljava/lang/String;)Ljava/io/InputStream;
    //   229: invokestatic 377	android/graphics/BitmapFactory:decodeStream	(Ljava/io/InputStream;)Landroid/graphics/Bitmap;
    //   232: astore_3
    //   233: aload_3
    //   234: astore_2
    //   235: goto -145 -> 90
    //   238: astore_2
    //   239: aload_0
    //   240: monitorexit
    //   241: aload_2
    //   242: athrow
    //   243: astore_3
    //   244: goto -154 -> 90
    //   247: astore_3
    //   248: goto -158 -> 90
    //   251: astore_3
    //   252: goto -162 -> 90
    //   255: astore_3
    //   256: goto -166 -> 90
    //   259: astore_3
    //   260: goto -170 -> 90
    //   263: astore_3
    //   264: goto -174 -> 90
    //   267: astore_3
    //   268: goto -178 -> 90
    //   271: astore_3
    //   272: goto -182 -> 90
    //   275: goto -207 -> 68
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	278	0	this	TXCVideoPreprocessor
    //   0	278	1	paramInt	int
    //   1	234	2	localObject1	Object
    //   238	4	2	localObject2	Object
    //   14	220	3	localObject3	Object
    //   243	1	3	localIOException1	java.io.IOException
    //   247	1	3	localIOException2	java.io.IOException
    //   251	1	3	localIOException3	java.io.IOException
    //   255	1	3	localIOException4	java.io.IOException
    //   259	1	3	localIOException5	java.io.IOException
    //   263	1	3	localIOException6	java.io.IOException
    //   267	1	3	localIOException7	java.io.IOException
    //   271	1	3	localIOException8	java.io.IOException
    // Exception table:
    //   from	to	target	type
    //   4	15	238	finally
    //   68	76	238	finally
    //   82	90	238	finally
    //   90	105	238	finally
    //   110	121	238	finally
    //   126	137	238	finally
    //   142	153	238	finally
    //   158	169	238	finally
    //   174	185	238	finally
    //   190	201	238	finally
    //   206	217	238	finally
    //   222	233	238	finally
    //   222	233	243	java/io/IOException
    //   206	217	247	java/io/IOException
    //   190	201	251	java/io/IOException
    //   174	185	255	java/io/IOException
    //   158	169	259	java/io/IOException
    //   142	153	263	java/io/IOException
    //   126	137	267	java/io/IOException
    //   110	121	271	java/io/IOException
  }
  
  public void setGausBlurLevel(float paramFloat)
  {
    try
    {
      if (this.mDrawer != null) {
        this.mDrawer.setGausBlurLevel(paramFloat);
      }
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  @TargetApi(18)
  public boolean setGreenScreenFile(String paramString, boolean paramBoolean)
  {
    if (Build.VERSION.SDK_INT < 18) {
      return false;
    }
    if (this.mDrawer != null) {
      this.mDrawer.setGreenScreenFile(paramString, paramBoolean);
    }
    return true;
  }
  
  public void setInputMatrix(float[] paramArrayOfFloat)
  {
    if (this.mDrawer != null) {
      this.mDrawer.setInputMatrix(paramArrayOfFloat);
    }
  }
  
  /* Error */
  public void setListener(TXIVideoPreprocessorListener paramTXIVideoPreprocessorListener)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 140	com/tencent/liteav/beauty/TXCVideoPreprocessor:mDrawer	Lcom/tencent/liteav/beauty/TXCFilterDrawer;
    //   6: ifnonnull +14 -> 20
    //   9: ldc 32
    //   11: ldc_w 416
    //   14: invokestatic 157	com/tencent/liteav/basic/log/TXCLog:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   17: aload_0
    //   18: monitorexit
    //   19: return
    //   20: aload_0
    //   21: getfield 140	com/tencent/liteav/beauty/TXCVideoPreprocessor:mDrawer	Lcom/tencent/liteav/beauty/TXCFilterDrawer;
    //   24: aload_1
    //   25: invokevirtual 418	com/tencent/liteav/beauty/TXCFilterDrawer:setListener	(Lcom/tencent/liteav/beauty/TXIVideoPreprocessorListener;)V
    //   28: goto -11 -> 17
    //   31: astore_1
    //   32: aload_0
    //   33: monitorexit
    //   34: aload_1
    //   35: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	36	0	this	TXCVideoPreprocessor
    //   0	36	1	paramTXIVideoPreprocessorListener	TXIVideoPreprocessorListener
    // Exception table:
    //   from	to	target	type
    //   2	17	31	finally
    //   20	28	31	finally
  }
  
  public void setMirror(boolean paramBoolean)
  {
    try
    {
      this.mbIfxMirrox = paramBoolean;
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public void setMotionTmpl(String paramString)
  {
    try
    {
      if (this.mDrawer != null) {
        this.mDrawer.setMotionTmpl(paramString);
      }
      return;
    }
    finally
    {
      paramString = finally;
      throw paramString;
    }
  }
  
  public void setNoseSlimLevel(int paramInt)
  {
    if (this.mDrawer != null) {
      this.mDrawer.setNoseSlimLevel(paramInt);
    }
  }
  
  /* Error */
  public void setNotifyListener(com.tencent.liteav.basic.listener.TXINotifyListener paramTXINotifyListener)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 140	com/tencent/liteav/beauty/TXCVideoPreprocessor:mDrawer	Lcom/tencent/liteav/beauty/TXCFilterDrawer;
    //   6: ifnonnull +14 -> 20
    //   9: ldc 32
    //   11: ldc_w 416
    //   14: invokestatic 157	com/tencent/liteav/basic/log/TXCLog:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   17: aload_0
    //   18: monitorexit
    //   19: return
    //   20: aload_0
    //   21: getfield 140	com/tencent/liteav/beauty/TXCVideoPreprocessor:mDrawer	Lcom/tencent/liteav/beauty/TXCFilterDrawer;
    //   24: aload_1
    //   25: invokevirtual 431	com/tencent/liteav/beauty/TXCFilterDrawer:setNotify	(Lcom/tencent/liteav/basic/listener/TXINotifyListener;)V
    //   28: goto -11 -> 17
    //   31: astore_1
    //   32: aload_0
    //   33: monitorexit
    //   34: aload_1
    //   35: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	36	0	this	TXCVideoPreprocessor
    //   0	36	1	paramTXINotifyListener	com.tencent.liteav.basic.listener.TXINotifyListener
    // Exception table:
    //   from	to	target	type
    //   2	17	31	finally
    //   20	28	31	finally
  }
  
  public void setOutputFrameSize(int paramInt1, int paramInt2)
  {
    try
    {
      this.miOutputWidth = paramInt1;
      this.miOutputHeight = paramInt2;
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public void setProcessPerformaceMode(boolean paramBoolean)
  {
    try
    {
      this.mbProcessPerformModel = paramBoolean;
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public void setRotate(int paramInt)
  {
    try
    {
      this.miOutputAngle = paramInt;
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public void setRuddyLevel(int paramInt)
  {
    if (paramInt > 9) {}
    for (;;)
    {
      try
      {
        TXCLog.e("TXCVideoPreprocessor", "Ruddy value too large! set max value 9");
        i = 9;
        if (this.mDrawer != null) {
          this.mDrawer.setRuddyLevel(i);
        }
        return;
      }
      finally {}
      int i = paramInt;
      if (paramInt < 0)
      {
        TXCLog.e("TXCVideoPreprocessor", "Ruddy < 0; set 0");
        i = 0;
      }
    }
  }
  
  public void setSharnessLevel(int paramInt)
  {
    int i;
    if (paramInt > 9)
    {
      TXCLog.e("TXCVideoPreprocessor", "Brightness value too large! set max value 9");
      i = 9;
    }
    for (;;)
    {
      if (this.mDrawer != null) {
        this.mDrawer.setSharpnessLevel(i);
      }
      return;
      i = paramInt;
      if (paramInt < 0)
      {
        TXCLog.e("TXCVideoPreprocessor", "Brightness < 0; set 0");
        i = 0;
      }
    }
  }
  
  public void setWaterMark(Bitmap paramBitmap, float paramFloat1, float paramFloat2, float paramFloat3)
  {
    if ((paramFloat1 < 0.0F) || (paramFloat2 < 0.0F) || (paramFloat3 < 0.0D)) {}
    for (;;)
    {
      try
      {
        TXCLog.e("TXCVideoPreprocessor", "WaterMark param is Error!");
        return;
      }
      finally {}
      if (this.mDrawer != null) {
        this.mDrawer.setWaterMark(paramBitmap, paramFloat1, paramFloat2, paramFloat3);
      }
    }
  }
  
  public void setWaterMarkList(List<WaterMakeTag> paramList)
  {
    try
    {
      if (this.mDrawer != null)
      {
        ReportDuaManage.getInstance().reportWarterMarkDua();
        this.mDrawer.setWaterMarkList(paramList);
      }
      return;
    }
    finally
    {
      paramList = finally;
      throw paramList;
    }
  }
  
  public void setWhitenessLevel(int paramInt)
  {
    if (paramInt > 9) {}
    for (;;)
    {
      try
      {
        TXCLog.e("TXCVideoPreprocessor", "Brightness value too large! set max value 9");
        i = 9;
        if (this.mDrawer != null) {
          this.mDrawer.setWhitenessLevel(i);
        }
        return;
      }
      finally {}
      int i = paramInt;
      if (paramInt < 0)
      {
        TXCLog.e("TXCVideoPreprocessor", "Brightness < 0; set 0");
        i = 0;
      }
    }
  }
  
  public static class EventVideoProcess
  {
    public static final int EVENT_VIDEOPROCESS_FACERECOGNISE_FAILED = 4002;
    public static final int EVENT_VIDEOPROCESS_FACERECOGNISE_SUCESS = 4001;
  }
  
  public static class FrameFormat
  {
    public static final int I420 = 1;
    public static final int NONE = 5;
    public static final int NV21 = 3;
    public static final int RGBA = 2;
    public static final int TEXTURE = 0;
    public static final int TEXTURE_EXT = 4;
  }
  
  static class InitConfig
  {
    public int inputFormat = 5;
    CropRect mCropRect = null;
    boolean mHasGLContext;
    int mInputAngle;
    int mInputHeight;
    int mInputWidth;
    boolean mInputXMirror;
    int mOriginHeight;
    int mOriginWidth;
    int mOutputAngle;
    int mOutputHeight;
    int mOutputWidht;
    public int outputFormat = 0;
  }
  
  private static class InitParam
  {
    public CropRect cropRect = null;
    public boolean hasGLContext;
    public int inputAngle;
    public int inputFormat = 5;
    public int inputHeight;
    public int inputWidth;
    public boolean inputXMirror = false;
    public int originHeight;
    public int originWidth;
    public int outputAngle;
    public int outputFormat = 0;
    public int outputHeight;
    public int outputWidth;
  }
  
  public static class WaterMakeTag
  {
    public Bitmap bitmap;
    public float fWidth;
    public float xOffset;
    public float yOffset;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\liteav\beauty\TXCVideoPreprocessor.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */