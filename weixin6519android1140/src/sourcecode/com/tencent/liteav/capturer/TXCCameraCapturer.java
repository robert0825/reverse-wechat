package com.tencent.liteav.capturer;

import android.content.res.Resources;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import android.hardware.Camera.Area;
import android.hardware.Camera.AutoFocusCallback;
import android.hardware.Camera.CameraInfo;
import android.hardware.Camera.Parameters;
import android.hardware.Camera.Size;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import com.tencent.liteav.basic.listener.TXINotifyListener;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.basic.serverconfig.TXCConfigCenter;
import com.tencent.liteav.basic.util.TXCTimeUtil;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class TXCCameraCapturer
  implements Camera.AutoFocusCallback
{
  public static final int CAMERA_BACK = 2;
  public static final int CAMERA_FAIL = -1;
  public static final int CAMERA_FRONT = 1;
  public static final int CAMERA_HOME_DOWN = 1;
  public static final int CAMERA_HOME_LEFT = 2;
  public static final int CAMERA_HOME_RIGHT = 0;
  public static final int CAMERA_HOME_UP = 3;
  public static final int CAMERA_INVALID_PARAM = -2;
  public static final int CAMERA_INVALID_RESOLUTION = -3;
  public static final int CAMERA_RESOLUTION_180_320 = 1;
  public static final int CAMERA_RESOLUTION_270_480 = 2;
  public static final int CAMERA_RESOLUTION_320_480 = 3;
  public static final int CAMERA_RESOLUTION_360_640 = 4;
  public static final int CAMERA_RESOLUTION_540_960 = 5;
  public static final int CAMERA_RESOLUTION_720_1280 = 6;
  public static final int CAMERA_RESOLUTION_HIGHEST = 7;
  public static final int CAMERA_SUCCESS = 0;
  private static final int FOCUS_AREA_SIZE_DP = 70;
  private static final String TAG = TXCCameraCapturer.class.getSimpleName();
  private Camera mCamera;
  private TXICameraCapturerListener mCaptureListener;
  private int mFPS = 15;
  private boolean mFlashEnable;
  private int mFocusAreaSize = 0;
  private Matrix mFocusMatrix = new Matrix();
  private int mHomeOriention = 1;
  private boolean mIsFront = true;
  private TXINotifyListener mNotifyListener;
  private int mPreviewAngle;
  private int mPreviewHeight;
  private SurfaceTexture mPreviewSurfaceTexture;
  private int mPreviewWidth;
  private int mResolution;
  private boolean mSupportFocusAreas;
  private boolean mSupportMeteringArea;
  private boolean mTouchFocus = false;
  
  private Rect calculateSensorArea(float paramFloat1, float paramFloat2, float paramFloat3)
  {
    int m = 1000;
    float f = 200.0F * paramFloat3;
    paramFloat3 = paramFloat1;
    if (this.mIsFront == true) {
      paramFloat3 = 1.0F - paramFloat1;
    }
    int j = this.mPreviewAngle / 90;
    int i = 0;
    while (i < j)
    {
      paramFloat1 = --(paramFloat2 - 0.5F);
      paramFloat2 = -(paramFloat3 - 0.5F);
      paramFloat3 = paramFloat1 + 0.5F;
      paramFloat2 += 0.5F;
      i += 1;
    }
    i = (int)(paramFloat3 * 2000.0F - 1000.0F);
    j = (int)(paramFloat2 * 2000.0F - 1000.0F);
    if (i < 64536) {
      i = 64536;
    }
    for (;;)
    {
      if (j < 64536) {
        j = 64536;
      }
      for (;;)
      {
        int i1 = i + (int)f;
        int n = (int)f + j;
        int k = i1;
        if (i1 > 1000) {
          k = 1000;
        }
        if (n > 1000) {}
        for (;;)
        {
          return new Rect(i, j, k, m);
          m = n;
        }
      }
    }
  }
  
  private Rect calculateSensorArea(int paramInt1, int paramInt2, Rect paramRect, int paramInt3, int paramInt4)
  {
    if ((paramInt4 == 0) || (paramInt3 == 0)) {
      return new Rect(0, 0, 0, 0);
    }
    float f1 = paramInt1 * 1.0F / paramInt3;
    float f2 = paramInt2 * 1.0F / paramInt4;
    float f3;
    Matrix localMatrix;
    if (paramInt4 * f1 > paramInt2)
    {
      f2 = paramInt3 * f1;
      f3 = paramInt4 * f1;
      this.mFocusMatrix.reset();
      localMatrix = this.mFocusMatrix;
      if (!this.mIsFront) {
        break label281;
      }
    }
    label281:
    for (f1 = -1.0F;; f1 = 1.0F)
    {
      localMatrix.setScale(f1, 1.0F);
      this.mFocusMatrix.postRotate(this.mPreviewAngle);
      this.mFocusMatrix.postScale(f2 / 2000.0F, f3 / 2000.0F);
      this.mFocusMatrix.postTranslate(f2 / 2.0F, f3 / 2.0F);
      this.mFocusMatrix.invert(this.mFocusMatrix);
      f1 = (f2 - paramInt1) / 2.0F + paramRect.left;
      f2 = (f3 - paramInt2) / 2.0F + paramRect.top;
      paramRect = new RectF(f1, f2, paramRect.right - paramRect.left + f1, paramRect.right - paramRect.left + f2);
      this.mFocusMatrix.mapRect(paramRect);
      return new Rect(Math.round(paramRect.left), Math.round(paramRect.top), Math.round(paramRect.right), Math.round(paramRect.bottom));
      f1 = f2;
      break;
    }
  }
  
  private int clamp(int paramInt1, int paramInt2, int paramInt3)
  {
    if (paramInt1 > paramInt3) {
      return paramInt3;
    }
    if (paramInt1 < paramInt2) {
      return paramInt2;
    }
    return paramInt1;
  }
  
  private int getCameraDisplayOrientation(int paramInt)
  {
    Camera.CameraInfo localCameraInfo = new Camera.CameraInfo();
    Camera.getCameraInfo(paramInt, localCameraInfo);
    if (localCameraInfo.facing == 1) {
      return (360 - localCameraInfo.orientation) % 360;
    }
    return (localCameraInfo.orientation + 360) % 360;
  }
  
  private int getSupportedFPS(int paramInt)
  {
    int i = 0;
    List localList = this.mCamera.getParameters().getSupportedPreviewFrameRates();
    if (localList == null)
    {
      TXCLog.e(TAG, "getSupportedFPS error");
      return 1;
    }
    int k;
    for (int j = ((Integer)localList.get(0)).intValue(); i < localList.size(); j = k)
    {
      int m = ((Integer)localList.get(i)).intValue();
      k = j;
      if (Math.abs(m - paramInt) - Math.abs(j - paramInt) < 0) {
        k = m;
      }
      i += 1;
    }
    TXCLog.i(TAG, "choose fpts=" + j);
    return j;
  }
  
  private Size getSupportedPreviewSizes(int paramInt)
  {
    List localList = this.mCamera.getParameters().getSupportedPreviewSizes();
    ArrayList localArrayList = new ArrayList();
    switch (paramInt)
    {
    default: 
      paramInt = 0;
    }
    for (;;)
    {
      if (paramInt >= localArrayList.size()) {
        break label884;
      }
      Size localSize = (Size)localArrayList.get(paramInt);
      int i = 0;
      for (;;)
      {
        if (i >= localList.size()) {
          break label877;
        }
        Camera.Size localSize1 = (Camera.Size)localList.get(i);
        if ((localSize1.width == localSize.width) && (localSize1.height == localSize.height))
        {
          new StringBuilder("wanted:").append(localSize.width).append("*").append(localSize.height);
          return localSize;
          localArrayList.add(new Size(640, 360));
          localArrayList.add(new Size(768, 432));
          localArrayList.add(new Size(960, 540));
          localArrayList.add(new Size(800, 480));
          localArrayList.add(new Size(640, 480));
          localArrayList.add(new Size(960, 720));
          localArrayList.add(new Size(1280, 720));
          break;
          localArrayList.add(new Size(960, 540));
          localArrayList.add(new Size(960, 720));
          localArrayList.add(new Size(1280, 720));
          localArrayList.add(new Size(800, 480));
          localArrayList.add(new Size(640, 360));
          localArrayList.add(new Size(640, 480));
          break;
          localArrayList.add(new Size(1280, 720));
          localArrayList.add(new Size(1920, 1080));
          localArrayList.add(new Size(960, 540));
          localArrayList.add(new Size(960, 720));
          localArrayList.add(new Size(800, 480));
          localArrayList.add(new Size(640, 360));
          localArrayList.add(new Size(640, 480));
          localArrayList.add(new Size(480, 320));
          localArrayList.add(new Size(640, 360));
          localArrayList.add(new Size(640, 480));
          localArrayList.add(new Size(768, 432));
          break;
          localArrayList.add(new Size(1280, 720));
          localArrayList.add(new Size(960, 540));
          localArrayList.add(new Size(960, 720));
          localArrayList.add(new Size(800, 480));
          localArrayList.add(new Size(768, 432));
          localArrayList.add(new Size(640, 360));
          localArrayList.add(new Size(640, 480));
          break;
        }
        i += 1;
      }
      label877:
      paramInt += 1;
    }
    label884:
    return null;
  }
  
  private Rect getTouchRect(int paramInt1, int paramInt2, int paramInt3, int paramInt4, float paramFloat, View paramView)
  {
    if (this.mFocusAreaSize == 0) {
      this.mFocusAreaSize = ((int)(70.0F * paramView.getResources().getDisplayMetrics().density + 0.5F));
    }
    int i = Float.valueOf(this.mFocusAreaSize * paramFloat).intValue();
    paramInt1 = clamp(paramInt1 - i / 2, 0, paramInt3 - i);
    paramInt2 = clamp(paramInt2 - i / 2, 0, paramInt4 - i);
    return new Rect(paramInt1, paramInt2, paramInt1 + i, i + paramInt2);
  }
  
  public int getAngle()
  {
    return this.mPreviewAngle;
  }
  
  public boolean getIsFrontCamera()
  {
    return this.mIsFront;
  }
  
  public int getMaxZoom()
  {
    int j = 0;
    int i = j;
    if (this.mCamera != null)
    {
      Camera.Parameters localParameters = this.mCamera.getParameters();
      i = j;
      if (localParameters.getMaxZoom() > 0)
      {
        i = j;
        if (localParameters.isZoomSupported()) {
          i = localParameters.getMaxZoom();
        }
      }
    }
    return i;
  }
  
  public int getPreviewHeight()
  {
    return this.mPreviewHeight;
  }
  
  public int getPreviewWidth()
  {
    return this.mPreviewWidth;
  }
  
  public SurfaceTexture getSurfaceTexture()
  {
    return this.mPreviewSurfaceTexture;
  }
  
  public void onAutoFocus(boolean paramBoolean, Camera paramCamera)
  {
    if (paramBoolean)
    {
      TXCLog.i(TAG, "AUTO focus success");
      return;
    }
    TXCLog.i(TAG, "AUTO focus failed");
  }
  
  public void setCameraType(int paramInt)
  {
    boolean bool = true;
    Object localObject;
    if (paramInt == 1)
    {
      this.mIsFront = bool;
      if (this.mCamera != null)
      {
        localObject = this.mPreviewSurfaceTexture;
        stopCapture();
        this.mPreviewSurfaceTexture = ((SurfaceTexture)localObject);
        paramInt = startCapture();
        localObject = new Bundle();
        ((Bundle)localObject).putLong("EVT_TIME", TXCTimeUtil.getTimeTick());
        if (paramInt != 0) {
          break label106;
        }
        ((Bundle)localObject).putInt("EVT_ID", 1003);
        ((Bundle)localObject).putCharSequence("EVT_MSG", "打开摄像头成功");
      }
    }
    for (;;)
    {
      if (this.mNotifyListener != null) {
        this.mNotifyListener.onNotifyEvent(1003, (Bundle)localObject);
      }
      return;
      bool = false;
      break;
      label106:
      ((Bundle)localObject).putInt("EVT_ID", 64235);
      ((Bundle)localObject).putCharSequence("EVT_MSG", "打开摄像头失败，请确认摄像头权限是否打开");
    }
  }
  
  public void setExposureCompensation(float paramFloat)
  {
    float f2 = 1.0F;
    float f1 = -1.0F;
    if (this.mCamera != null)
    {
      if (paramFloat <= 1.0F) {
        break label203;
      }
      paramFloat = f2;
    }
    label203:
    for (;;)
    {
      if (paramFloat < -1.0F) {
        paramFloat = f1;
      }
      for (;;)
      {
        Camera.Parameters localParameters = this.mCamera.getParameters();
        int i = localParameters.getMinExposureCompensation();
        int j = localParameters.getMaxExposureCompensation();
        if ((i != 0) && (j != 0))
        {
          int k = TXCConfigCenter.getInstance().getExposureCompensation();
          paramFloat *= j;
          if ((k != 0) && (k <= j) && (k >= i))
          {
            TXCLog.d(TAG, "camera setExposureCompensation: " + k);
            localParameters.setExposureCompensation(k);
          }
        }
        for (;;)
        {
          try
          {
            this.mCamera.setParameters(localParameters);
            return;
          }
          catch (Exception localException)
          {
            return;
          }
          if ((paramFloat <= j) && (paramFloat >= i))
          {
            TXCLog.d(TAG, "camera setExposureCompensation: " + paramFloat);
            localParameters.setExposureCompensation((int)paramFloat);
            continue;
            TXCLog.e(TAG, "camera not support setExposureCompensation!");
          }
        }
      }
    }
  }
  
  public void setFPS(int paramInt)
  {
    this.mFPS = paramInt;
  }
  
  public void setFlashEnable(boolean paramBoolean)
  {
    this.mFlashEnable = paramBoolean;
    Camera.Parameters localParameters;
    List localList;
    if (this.mCamera != null)
    {
      localParameters = this.mCamera.getParameters();
      localList = localParameters.getSupportedFlashModes();
      if (!paramBoolean) {
        break label70;
      }
      if ((localList != null) && (localList.contains("torch")))
      {
        TXCLog.i(TAG, "set FLASH_MODE_TORCH");
        localParameters.setFlashMode("torch");
      }
    }
    for (;;)
    {
      label70:
      try
      {
        this.mCamera.setParameters(localParameters);
        return;
      }
      catch (Exception localException) {}
      if ((localList != null) && (localList.contains("off")))
      {
        TXCLog.i(TAG, "set FLASH_MODE_OFF");
        localParameters.setFlashMode("off");
      }
    }
  }
  
  public void setFocusPosition(float paramFloat1, float paramFloat2)
  {
    if (!this.mTouchFocus) {
      return;
    }
    try
    {
      this.mCamera.cancelAutoFocus();
      Camera.Parameters localParameters = this.mCamera.getParameters();
      ArrayList localArrayList;
      if (this.mSupportFocusAreas)
      {
        localArrayList = new ArrayList();
        localArrayList.add(new Camera.Area(calculateSensorArea(paramFloat1, paramFloat2, 2.0F), 1000));
        localParameters.setFocusAreas(localArrayList);
      }
      if (this.mSupportMeteringArea)
      {
        localArrayList = new ArrayList();
        localArrayList.add(new Camera.Area(calculateSensorArea(paramFloat1, paramFloat2, 3.0F), 1000));
        localParameters.setMeteringAreas(localArrayList);
      }
      try
      {
        this.mCamera.setParameters(localParameters);
        this.mCamera.autoFocus(this);
        return;
      }
      catch (Exception localException1) {}
      return;
    }
    catch (Exception localException2) {}
  }
  
  public void setFocusPosition(int paramInt1, int paramInt2, View paramView, int paramInt3, int paramInt4)
  {
    if (!this.mTouchFocus) {
      return;
    }
    try
    {
      this.mCamera.cancelAutoFocus();
      Camera.Parameters localParameters = this.mCamera.getParameters();
      Object localObject = getTouchRect(paramInt1, paramInt2, paramView.getWidth(), paramView.getHeight(), 1.0F, paramView);
      Rect localRect = getTouchRect(paramInt1, paramInt2, paramView.getWidth(), paramView.getHeight(), 1.5F, paramView);
      if (this.mSupportFocusAreas)
      {
        ArrayList localArrayList = new ArrayList();
        localArrayList.add(new Camera.Area(calculateSensorArea(paramView.getWidth(), paramView.getHeight(), (Rect)localObject, paramInt3, paramInt4), 1000));
        localParameters.setFocusAreas(localArrayList);
      }
      if (this.mSupportMeteringArea)
      {
        localObject = new ArrayList();
        ((List)localObject).add(new Camera.Area(calculateSensorArea(paramView.getWidth(), paramView.getHeight(), localRect, paramInt3, paramInt4), 1000));
        localParameters.setMeteringAreas((List)localObject);
      }
      try
      {
        this.mCamera.setParameters(localParameters);
        this.mCamera.autoFocus(this);
        return;
      }
      catch (Exception paramView) {}
      return;
    }
    catch (Exception paramView) {}
  }
  
  public void setHomeOriention(int paramInt)
  {
    this.mHomeOriention = paramInt;
  }
  
  public void setListener(TXICameraCapturerListener paramTXICameraCapturerListener)
  {
    this.mCaptureListener = paramTXICameraCapturerListener;
  }
  
  public void setNotifyListener(TXINotifyListener paramTXINotifyListener)
  {
    this.mNotifyListener = paramTXINotifyListener;
  }
  
  public void setResolution(int paramInt)
  {
    this.mResolution = paramInt;
  }
  
  public void setTouchFocus(boolean paramBoolean)
  {
    this.mTouchFocus = paramBoolean;
  }
  
  public boolean setZoom(int paramInt)
  {
    boolean bool = false;
    Camera.Parameters localParameters;
    if (this.mCamera != null)
    {
      localParameters = this.mCamera.getParameters();
      if ((localParameters.getMaxZoom() > 0) && (localParameters.isZoomSupported()) && ((paramInt < 0) || (paramInt > localParameters.getMaxZoom()))) {
        break label60;
      }
    }
    label60:
    try
    {
      localParameters.setZoom(paramInt);
      this.mCamera.setParameters(localParameters);
      bool = true;
      return bool;
    }
    catch (Exception localException) {}
    TXCLog.e(TAG, "invalid zoom value : " + paramInt + ", while max zoom is " + localParameters.getMaxZoom());
    return false;
    TXCLog.e(TAG, "camera not support zoom!");
    return false;
    return false;
  }
  
  public void setup(SurfaceTexture paramSurfaceTexture)
  {
    this.mPreviewSurfaceTexture = paramSurfaceTexture;
  }
  
  public int startCapture()
  {
    try
    {
      if (this.mPreviewSurfaceTexture == null) {
        return -2;
      }
      if (this.mCamera != null) {
        stopCapture();
      }
      Object localObject1 = new Camera.CameraInfo();
      int j = 0;
      int i = -1;
      int k = -1;
      if (j < Camera.getNumberOfCameras())
      {
        Camera.getCameraInfo(j, (Camera.CameraInfo)localObject1);
        TXCLog.i(TAG, "camera index " + j + ", facing = " + ((Camera.CameraInfo)localObject1).facing);
        if (((Camera.CameraInfo)localObject1).facing == 1) {
          k = j;
        }
        if (((Camera.CameraInfo)localObject1).facing == 0) {
          i = j;
        }
      }
      else
      {
        TXCLog.i(TAG, "camera front, id = " + k);
        TXCLog.i(TAG, "camera back , id = " + i);
        if ((k == -1) && (i != -1))
        {
          j = i;
          break label625;
        }
      }
      for (;;)
      {
        label171:
        if (this.mIsFront)
        {
          this.mCamera = Camera.open(j);
          localObject1 = this.mCamera.getParameters();
          localObject2 = ((Camera.Parameters)localObject1).getSupportedFocusModes();
          if ((!this.mTouchFocus) || (localObject2 == null) || (!((List)localObject2).contains("auto"))) {
            break label372;
          }
          TXCLog.i(TAG, "support FOCUS_MODE_AUTO");
          ((Camera.Parameters)localObject1).setFocusMode("auto");
        }
        for (;;)
        {
          if (Build.VERSION.SDK_INT >= 14)
          {
            if (((Camera.Parameters)localObject1).getMaxNumFocusAreas() > 0) {
              this.mSupportFocusAreas = true;
            }
            if (((Camera.Parameters)localObject1).getMaxNumMeteringAreas() > 0) {
              this.mSupportMeteringArea = true;
            }
          }
          localObject2 = ((Camera.Parameters)localObject1).getSupportedPreviewSizes();
          if (localObject2 == null) {
            break label410;
          }
          k = 0;
          while (k < ((List)localObject2).size())
          {
            Camera.Size localSize = (Camera.Size)((List)localObject2).get(k);
            TXCLog.i(TAG, String.format("camera supported preview size %dx%d", new Object[] { Integer.valueOf(localSize.width), Integer.valueOf(localSize.height) }));
            k += 1;
          }
          this.mCamera = Camera.open(i);
          break;
          label372:
          if ((localObject2 != null) && (((List)localObject2).contains("continuous-video")))
          {
            TXCLog.i(TAG, "support FOCUS_MODE_CONTINUOUS_VIDEO");
            ((Camera.Parameters)localObject1).setFocusMode("continuous-video");
          }
        }
        label410:
        Object localObject2 = getSupportedPreviewSizes(this.mResolution);
        if (localObject2 == null)
        {
          this.mCamera.release();
          this.mCamera = null;
          TXCLog.d(TAG, "不支持的视频分辨率");
          return -3;
        }
        TXCLog.i("search", String.format("get camera supported preview size %d * %d ", new Object[] { Integer.valueOf(((Size)localObject2).width), Integer.valueOf(((Size)localObject2).height) }));
        this.mPreviewWidth = ((Size)localObject2).width;
        this.mPreviewHeight = ((Size)localObject2).height;
        ((Camera.Parameters)localObject1).setPreviewSize(((Size)localObject2).width, ((Size)localObject2).height);
        ((Camera.Parameters)localObject1).setPreviewFrameRate(getSupportedFPS(this.mFPS));
        if (this.mIsFront) {}
        for (;;)
        {
          this.mPreviewAngle = ((getCameraDisplayOrientation(j) - 90 + this.mHomeOriention * 90 + 360) % 360);
          this.mCamera.setDisplayOrientation(0);
          this.mCamera.setPreviewTexture(this.mPreviewSurfaceTexture);
          this.mCamera.setParameters((Camera.Parameters)localObject1);
          this.mCamera.startPreview();
          return 0;
          j = i;
        }
        label625:
        do
        {
          break label171;
          j = k;
          continue;
          j += 1;
          break;
        } while ((i != -1) || (j == -1));
        i = j;
      }
      return -1;
    }
    catch (IOException localIOException)
    {
      return -1;
    }
    catch (Exception localException) {}
  }
  
  public void stopCapture()
  {
    if (this.mCamera != null) {}
    try
    {
      this.mCamera.setPreviewCallback(null);
      this.mCamera.stopPreview();
      this.mCamera.release();
      this.mCamera = null;
      this.mPreviewSurfaceTexture = null;
      return;
    }
    catch (Exception localException)
    {
      localException = localException;
      this.mCamera = null;
      this.mPreviewSurfaceTexture = null;
      return;
    }
    finally
    {
      localObject = finally;
      this.mCamera = null;
      this.mPreviewSurfaceTexture = null;
      throw ((Throwable)localObject);
    }
  }
  
  private class Size
  {
    public int height = 720;
    public int width = 1280;
    
    Size() {}
    
    Size(int paramInt1, int paramInt2)
    {
      this.width = paramInt1;
      this.height = paramInt2;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\liteav\capturer\TXCCameraCapturer.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */