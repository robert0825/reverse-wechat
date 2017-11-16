package com.tencent.mm.compatible.d;

import android.hardware.Camera;
import android.hardware.Camera.CameraInfo;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.w;

final class h
  implements c.a
{
  h()
  {
    GMTrace.i(13811406864384L, 102903);
    GMTrace.o(13811406864384L, 102903);
  }
  
  public static c.a.a en(int paramInt)
  {
    GMTrace.i(13811675299840L, 102905);
    c.a.a locala = new c.a.a();
    locala.fPj = null;
    try
    {
      locala.fPj = Camera.open(paramInt);
      if (locala.fPj == null)
      {
        GMTrace.o(13811675299840L, 102905);
        return null;
      }
    }
    catch (Exception localException1)
    {
      GMTrace.o(13811675299840L, 102905);
      return null;
    }
    localException1.eSp = 0;
    w.d("CameraUtilImplConfig", "DeviceInfo.mCameraInfo.hasVRInfo " + p.fQC.fOI);
    w.d("CameraUtilImplConfig", "DeviceInfo.mCameraInfo.mVRFaceRotate " + p.fQC.fOJ);
    w.d("CameraUtilImplConfig", "DeviceInfo.mCameraInfo.mVRFaceDisplayOrientation " + p.fQC.fOK);
    w.d("CameraUtilImplConfig", "DeviceInfo.mCameraInfo.mVRBackRotate " + p.fQC.fOL);
    w.d("CameraUtilImplConfig", "DeviceInfo.mCameraInfo.mVRBackDisplayOrientation " + p.fQC.fOM);
    if (getNumberOfCameras() > 1) {}
    for (;;)
    {
      try
      {
        Camera.CameraInfo localCameraInfo = new Camera.CameraInfo();
        Camera.getCameraInfo(paramInt, localCameraInfo);
        w.d("CameraUtilImplConfig", "info.facing " + localCameraInfo.facing);
        if (localCameraInfo.facing != 1) {
          continue;
        }
        if ((p.fQC.fOI) && (p.fQC.fOJ != -1)) {
          localException1.eSp = p.fQC.fOJ;
        }
        if ((p.fQC.fOI) && (p.fQC.fOK != -1)) {
          localException1.fPj.setDisplayOrientation(p.fQC.fOK);
        }
      }
      catch (Exception localException2)
      {
        w.printErrStackTrace("CameraUtilImplConfig", localException2, "", new Object[0]);
        continue;
      }
      GMTrace.o(13811675299840L, 102905);
      return localException1;
      if ((p.fQC.fOI) && (p.fQC.fOL != -1)) {
        localException1.eSp = p.fQC.fOL;
      }
      if ((p.fQC.fOI) && (p.fQC.fOM != -1))
      {
        localException1.fPj.setDisplayOrientation(p.fQC.fOM);
        continue;
        if ((p.fQC.fOI) && (p.fQC.fOL != -1)) {
          localException1.eSp = p.fQC.fOL;
        }
        if ((p.fQC.fOI) && (p.fQC.fOM != -1)) {
          localException1.fPj.setDisplayOrientation(p.fQC.fOM);
        }
      }
    }
  }
  
  public static int getNumberOfCameras()
  {
    GMTrace.i(13811541082112L, 102904);
    if ((p.fQC.fOO) && (p.fQC.fON != -1))
    {
      i = p.fQC.fON;
      w.d("CameraUtilImplConfig", "mVRCameraNum " + i);
      GMTrace.o(13811541082112L, 102904);
      return i;
    }
    int i = c.getNumberOfCameras();
    w.d("CameraUtilImplConfig", "getNumberOfCameras " + i);
    if (i > 1)
    {
      GMTrace.o(13811541082112L, 102904);
      return i;
    }
    GMTrace.o(13811541082112L, 102904);
    return 0;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\compatible\d\h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */