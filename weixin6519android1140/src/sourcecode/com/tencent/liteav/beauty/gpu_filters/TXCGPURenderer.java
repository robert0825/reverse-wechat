package com.tencent.liteav.beauty.gpu_filters;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.graphics.Canvas;
import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import android.hardware.Camera.Parameters;
import android.hardware.Camera.PreviewCallback;
import android.hardware.Camera.Size;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView.Renderer;
import android.opengl.GLUtils;
import android.util.TypedValue;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.basic.opengl.TXCGPUFilter;
import com.tencent.liteav.basic.opengl.TXCOpenGlUtils;
import com.tencent.liteav.basic.opengl.TXCRotation;
import com.tencent.liteav.basic.opengl.TXCTextureRotationUtil;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.util.LinkedList;
import java.util.Queue;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

public class TXCGPURenderer
  implements Camera.PreviewCallback, GLSurfaceView.Renderer
{
  static final float[] CUBE = { -1.0F, -1.0F, 1.0F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F };
  public static final int NO_IMAGE = -1;
  private String TAG = "GPURenderer";
  private int WriteCount = 0;
  public int mAddedPadding;
  private float mBackgroundBlue = 0.0F;
  private float mBackgroundGreen = 0.0F;
  private float mBackgroundRed = 0.0F;
  private Context mContext;
  public TXCGPUFilter mFilter;
  private boolean mFlipHorizontal;
  private boolean mFlipVertical;
  private final FloatBuffer mGLCubeBuffer;
  private IntBuffer mGLRgbBuffer;
  private final FloatBuffer mGLTextureBuffer;
  public int mGLTextureId = -1;
  public int mImageHeight;
  public int mImageWidth;
  private FileOutputStream mOutPutFile;
  public int mOutputHeight;
  public int mOutputWidth;
  private TXCRotation mRotation;
  private final Queue<Runnable> mRunOnDraw;
  private final Queue<Runnable> mRunOnDrawEnd;
  private TXCGPUImage.ScaleType mScaleType = TXCGPUImage.ScaleType.CENTER_CROP;
  public final Object mSurfaceChangedWaiter = new Object();
  public SurfaceTexture mSurfaceTexture = null;
  private int mTestID = -1;
  private int mValueID;
  
  public TXCGPURenderer(TXCGPUFilter paramTXCGPUFilter)
  {
    this.mFilter = paramTXCGPUFilter;
    this.mRunOnDraw = new LinkedList();
    this.mRunOnDrawEnd = new LinkedList();
    this.mGLCubeBuffer = ByteBuffer.allocateDirect(CUBE.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
    this.mGLCubeBuffer.put(CUBE).position(0);
    this.mGLTextureBuffer = ByteBuffer.allocateDirect(TXCTextureRotationUtil.TEXTURE_NO_ROTATION.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
    setRotation(TXCRotation.NORMAL, false, false);
  }
  
  private float addDistance(float paramFloat1, float paramFloat2)
  {
    if (paramFloat1 == 0.0F) {
      return paramFloat2;
    }
    return 1.0F - paramFloat2;
  }
  
  private void runAll(Queue<Runnable> paramQueue)
  {
    if (paramQueue == null)
    {
      TXCLog.e(this.TAG, "runAll queue is null!");
      return;
    }
    try
    {
      while (!paramQueue.isEmpty()) {
        ((Runnable)paramQueue.poll()).run();
      }
    }
    finally {}
  }
  
  public void adjustImageScaling()
  {
    float f2 = this.mOutputWidth;
    float f1 = this.mOutputHeight;
    if ((this.mRotation == TXCRotation.ROTATION_270) || (this.mRotation == TXCRotation.ROTATION_90))
    {
      f2 = this.mOutputHeight;
      f1 = this.mOutputWidth;
    }
    float f3 = Math.max(f2 / this.mImageWidth, f1 / this.mImageHeight);
    int i = Math.round(this.mImageWidth * f3);
    int j = Math.round(f3 * this.mImageHeight);
    f2 = i / f2;
    f1 = j / f1;
    float[] arrayOfFloat3 = CUBE;
    float[] arrayOfFloat2 = TXCTextureRotationUtil.getRotation(this.mRotation, this.mFlipHorizontal, this.mFlipVertical);
    float[] arrayOfFloat1;
    if (this.mScaleType == TXCGPUImage.ScaleType.CENTER_CROP)
    {
      f2 = (1.0F - 1.0F / f2) / 2.0F;
      f1 = (1.0F - 1.0F / f1) / 2.0F;
      arrayOfFloat1 = new float[8];
      arrayOfFloat1[0] = addDistance(arrayOfFloat2[0], f2);
      arrayOfFloat1[1] = addDistance(arrayOfFloat2[1], f1);
      arrayOfFloat1[2] = addDistance(arrayOfFloat2[2], f2);
      arrayOfFloat1[3] = addDistance(arrayOfFloat2[3], f1);
      arrayOfFloat1[4] = addDistance(arrayOfFloat2[4], f2);
      arrayOfFloat1[5] = addDistance(arrayOfFloat2[5], f1);
      arrayOfFloat1[6] = addDistance(arrayOfFloat2[6], f2);
      arrayOfFloat1[7] = addDistance(arrayOfFloat2[7], f1);
    }
    for (arrayOfFloat2 = arrayOfFloat3;; arrayOfFloat2 = arrayOfFloat3)
    {
      arrayOfFloat1[0] = 0.0F;
      arrayOfFloat1[1] = 1.0F;
      arrayOfFloat1[2] = 1.0F;
      arrayOfFloat1[3] = 1.0F;
      arrayOfFloat1[4] = 0.0F;
      arrayOfFloat1[5] = 0.0F;
      arrayOfFloat1[6] = 1.0F;
      arrayOfFloat1[7] = 0.0F;
      this.mGLCubeBuffer.clear();
      this.mGLCubeBuffer.put(arrayOfFloat2).position(0);
      this.mGLTextureBuffer.clear();
      this.mGLTextureBuffer.put(arrayOfFloat1).position(0);
      return;
      arrayOfFloat3 = new float[] { CUBE[0] / f1, CUBE[1] / f2, CUBE[2] / f1, CUBE[3] / f2, CUBE[4] / f1, CUBE[5] / f2, CUBE[6] / f1, CUBE[7] / f2 };
      arrayOfFloat1 = arrayOfFloat2;
    }
  }
  
  public void deleteImage()
  {
    runOnDraw(new Runnable()
    {
      public void run()
      {
        GLES20.glDeleteTextures(1, new int[] { TXCGPURenderer.this.mGLTextureId }, 0);
        TXCGPURenderer.this.mGLTextureId = -1;
      }
    });
  }
  
  protected int getFrameHeight()
  {
    return this.mOutputHeight;
  }
  
  protected int getFrameWidth()
  {
    return this.mOutputWidth;
  }
  
  public TXCRotation getRotation()
  {
    return this.mRotation;
  }
  
  public boolean isFlippedHorizontally()
  {
    return this.mFlipHorizontal;
  }
  
  public boolean isFlippedVertically()
  {
    return this.mFlipVertical;
  }
  
  public void onDrawFrame(GL10 paramGL10)
  {
    int i = 0;
    int j = 0;
    GLES20.glClear(16640);
    runAll(this.mRunOnDraw);
    if (this.mTestID == -1)
    {
      paramGL10 = new int[1];
      GLES20.glGenTextures(1, paramGL10, 0);
      this.mTestID = paramGL10[0];
      GLES20.glBindTexture(3553, this.mTestID);
      GLES20.glTexParameterf(3553, 10240, 9729.0F);
      GLES20.glTexParameterf(3553, 10241, 9729.0F);
      GLES20.glTexParameterf(3553, 10242, 33071.0F);
      GLES20.glTexParameterf(3553, 10243, 33071.0F);
      paramGL10 = new TypedValue();
      localObject = new BitmapFactory.Options();
      ((BitmapFactory.Options)localObject).inTargetDensity = paramGL10.density;
      paramGL10 = BitmapFactory.decodeResource(this.mContext.getResources(), this.mValueID, (BitmapFactory.Options)localObject);
      GLES20.glBindTexture(3553, this.mTestID);
      GLUtils.texImage2D(3553, 0, paramGL10, 0);
    }
    this.mFilter.onDraw(this.mTestID, this.mGLCubeBuffer, this.mGLTextureBuffer);
    Object localObject = IntBuffer.allocate(250000);
    GLES20.glReadPixels(0, 0, 500, 500, 6408, 5121, (Buffer)localObject);
    int k = this.WriteCount;
    this.WriteCount = (k + 1);
    if (k == 50) {}
    for (;;)
    {
      byte[] arrayOfByte;
      try
      {
        if (this.mOutPutFile == null) {
          this.mOutPutFile = new FileOutputStream(new File("/mnt/sdcard/", "rgbBuffer"));
        }
        paramGL10 = ((IntBuffer)localObject).order().toString();
        localObject = ((IntBuffer)localObject).array();
        arrayOfByte = new byte[1000000];
        if (paramGL10.compareTo("LITTLE_ENDIAN") == 0) {
          break label461;
        }
        i = j;
      }
      catch (Exception paramGL10)
      {
        continue;
      }
      this.mOutPutFile.write(arrayOfByte, 0, 1000000);
      this.mOutPutFile.flush();
      runAll(this.mRunOnDrawEnd);
      if (this.mSurfaceTexture != null) {
        this.mSurfaceTexture.updateTexImage();
      }
      return;
      TXCLog.e("check1", this.WriteCount);
      continue;
      while (i < 250000)
      {
        arrayOfByte[(i * 4 + 3)] = ((byte)(localObject[i] >> 24 & 0xFF));
        arrayOfByte[(i * 4 + 2)] = ((byte)(localObject[i] >> 16 & 0xFF));
        arrayOfByte[(i * 4 + 1)] = ((byte)(localObject[i] >> 8 & 0xFF));
        arrayOfByte[(i * 4)] = ((byte)(localObject[i] & 0xFF));
        i += 1;
      }
      continue;
      label461:
      while (i < 250000)
      {
        arrayOfByte[(i * 4)] = ((byte)(localObject[i] >> 24 & 0xFF));
        arrayOfByte[(i * 4 + 1)] = ((byte)(localObject[i] >> 16 & 0xFF));
        arrayOfByte[(i * 4 + 2)] = ((byte)(localObject[i] >> 8 & 0xFF));
        arrayOfByte[(i * 4 + 3)] = ((byte)(localObject[i] & 0xFF));
        i += 1;
      }
    }
  }
  
  public void onPreviewFrame(byte[] paramArrayOfByte, Camera paramCamera)
  {
    paramArrayOfByte = paramCamera.getParameters().getPreviewSize();
    if ((this.mGLRgbBuffer == null) && (paramArrayOfByte != null))
    {
      int i = paramArrayOfByte.width;
      this.mGLRgbBuffer = IntBuffer.allocate(paramArrayOfByte.height * i);
    }
    if (this.mRunOnDraw.isEmpty()) {
      runOnDraw(new Runnable()
      {
        public void run() {}
      });
    }
  }
  
  public void onSurfaceChanged(GL10 arg1, int paramInt1, int paramInt2)
  {
    this.mOutputWidth = paramInt1;
    this.mOutputHeight = paramInt2;
    GLES20.glViewport(0, 0, paramInt1, paramInt2);
    GLES20.glUseProgram(this.mFilter.getProgram());
    this.mFilter.onOutputSizeChanged(paramInt1, paramInt2);
    adjustImageScaling();
    synchronized (this.mSurfaceChangedWaiter)
    {
      this.mSurfaceChangedWaiter.notifyAll();
      return;
    }
  }
  
  public void onSurfaceCreated(GL10 paramGL10, EGLConfig paramEGLConfig)
  {
    GLES20.glClearColor(this.mBackgroundRed, this.mBackgroundGreen, this.mBackgroundBlue, 1.0F);
    GLES20.glDisable(2929);
    this.mFilter.init();
  }
  
  protected void runOnDraw(Runnable paramRunnable)
  {
    synchronized (this.mRunOnDraw)
    {
      this.mRunOnDraw.add(paramRunnable);
      return;
    }
  }
  
  protected void runOnDrawEnd(Runnable paramRunnable)
  {
    synchronized (this.mRunOnDrawEnd)
    {
      this.mRunOnDrawEnd.add(paramRunnable);
      return;
    }
  }
  
  public void setBackgroundColor(float paramFloat1, float paramFloat2, float paramFloat3)
  {
    this.mBackgroundRed = paramFloat1;
    this.mBackgroundGreen = paramFloat2;
    this.mBackgroundBlue = paramFloat3;
  }
  
  public void setContext(Context paramContext, int paramInt)
  {
    this.mContext = paramContext;
    this.mValueID = paramInt;
  }
  
  public void setFilter(final TXCGPUFilter paramTXCGPUFilter)
  {
    runOnDraw(new Runnable()
    {
      public void run()
      {
        TXCGPUFilter localTXCGPUFilter = TXCGPURenderer.this.mFilter;
        TXCGPURenderer.this.mFilter = paramTXCGPUFilter;
        if (localTXCGPUFilter != null) {
          localTXCGPUFilter.destroy();
        }
        TXCGPURenderer.this.mFilter.init();
        GLES20.glUseProgram(TXCGPURenderer.this.mFilter.getProgram());
        TXCGPURenderer.this.mFilter.onOutputSizeChanged(TXCGPURenderer.this.mOutputWidth, TXCGPURenderer.this.mOutputHeight);
      }
    });
  }
  
  public void setImageBitmap(Bitmap paramBitmap)
  {
    setImageBitmap(paramBitmap, true);
  }
  
  public void setImageBitmap(final Bitmap paramBitmap, final boolean paramBoolean)
  {
    if (paramBitmap == null) {
      return;
    }
    runOnDraw(new Runnable()
    {
      public void run()
      {
        Bitmap localBitmap;
        TXCGPURenderer localTXCGPURenderer;
        if (paramBitmap.getWidth() % 2 == 1)
        {
          localBitmap = Bitmap.createBitmap(paramBitmap.getWidth() + 1, paramBitmap.getHeight(), Bitmap.Config.ARGB_8888);
          localObject = new Canvas(localBitmap);
          ((Canvas)localObject).drawARGB(0, 0, 0, 0);
          ((Canvas)localObject).drawBitmap(paramBitmap, 0.0F, 0.0F, null);
          TXCGPURenderer.this.mAddedPadding = 1;
          localTXCGPURenderer = TXCGPURenderer.this;
          if (localBitmap == null) {
            break label159;
          }
        }
        label159:
        for (Object localObject = localBitmap;; localObject = paramBitmap)
        {
          localTXCGPURenderer.mGLTextureId = TXCOpenGlUtils.loadTexture((Bitmap)localObject, TXCGPURenderer.this.mGLTextureId, paramBoolean);
          if (localBitmap != null) {
            localBitmap.recycle();
          }
          TXCGPURenderer.this.mImageWidth = paramBitmap.getWidth();
          TXCGPURenderer.this.mImageHeight = paramBitmap.getHeight();
          TXCGPURenderer.this.adjustImageScaling();
          return;
          TXCGPURenderer.this.mAddedPadding = 0;
          localBitmap = null;
          break;
        }
      }
    });
  }
  
  public void setRotation(TXCRotation paramTXCRotation)
  {
    this.mRotation = paramTXCRotation;
    adjustImageScaling();
  }
  
  public void setRotation(TXCRotation paramTXCRotation, boolean paramBoolean1, boolean paramBoolean2)
  {
    this.mFlipHorizontal = paramBoolean1;
    this.mFlipVertical = paramBoolean2;
    setRotation(paramTXCRotation);
  }
  
  public void setRotationCamera(TXCRotation paramTXCRotation, boolean paramBoolean1, boolean paramBoolean2)
  {
    setRotation(paramTXCRotation, paramBoolean2, paramBoolean1);
  }
  
  public void setScaleType(TXCGPUImage.ScaleType paramScaleType)
  {
    this.mScaleType = paramScaleType;
  }
  
  public void setUpSurfaceTexture(final Camera paramCamera)
  {
    runOnDraw(new Runnable()
    {
      public void run()
      {
        int[] arrayOfInt = new int[1];
        GLES20.glGenTextures(1, arrayOfInt, 0);
        TXCGPURenderer.this.mSurfaceTexture = new SurfaceTexture(arrayOfInt[0]);
        try
        {
          paramCamera.setPreviewTexture(TXCGPURenderer.this.mSurfaceTexture);
          paramCamera.setPreviewCallback(TXCGPURenderer.this);
          paramCamera.startPreview();
          return;
        }
        catch (IOException localIOException) {}
      }
    });
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\liteav\beauty\gpu_filters\TXCGPURenderer.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */