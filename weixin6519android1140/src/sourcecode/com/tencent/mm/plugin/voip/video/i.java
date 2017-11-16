package com.tencent.mm.plugin.voip.video;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Point;
import android.hardware.Camera;
import android.hardware.Camera.CameraInfo;
import android.os.Build.VERSION;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.compatible.d.b;
import com.tencent.mm.compatible.d.b.a;
import com.tencent.mm.compatible.d.p;
import com.tencent.mm.sdk.platformtools.w;

public final class i
{
  public static g qPY;
  public static int qPZ;
  public static int qQa;
  public static int qQb;
  public static int qQc;
  public static int qQd;
  public static boolean qQe;
  
  static
  {
    GMTrace.i(5380520280064L, 40088);
    qPZ = -1;
    qQa = -1;
    qQb = 0;
    qQc = 0;
    qQd = 0;
    qQe = true;
    GMTrace.o(5380520280064L, 40088);
  }
  
  public static boolean bwe()
  {
    GMTrace.i(5379983409152L, 40084);
    if ((p.fQC.fOB) && (p.fQC.fOA == 8))
    {
      GMTrace.o(5379983409152L, 40084);
      return false;
    }
    GMTrace.o(5379983409152L, 40084);
    return true;
  }
  
  private static boolean bwf()
  {
    boolean bool = false;
    GMTrace.i(5380117626880L, 40085);
    try
    {
      if (Class.forName("android.hardware.Camera").getDeclaredMethod("getNumberOfCameras", null) == null) {
        w.d("GetfcMethod", "GetfcMethod is null");
      }
      for (;;)
      {
        GMTrace.o(5380117626880L, 40085);
        return bool;
        bool = true;
      }
    }
    catch (Exception localException)
    {
      for (;;)
      {
        w.e("MicroMsg.CameraUtil", "find getNumberOfCameras failed: " + localException.getMessage());
      }
    }
  }
  
  private static void bwg()
  {
    GMTrace.i(5380386062336L, 40087);
    qPY.fOy = Camera.getNumberOfCameras();
    Camera.CameraInfo localCameraInfo = new Camera.CameraInfo();
    int i = 0;
    for (;;)
    {
      try
      {
        if (i < qPY.fOy)
        {
          Camera.getCameraInfo(i, localCameraInfo);
          if (localCameraInfo.facing == 1)
          {
            qPZ = i;
            qPY.qOI = localCameraInfo.orientation;
            qPY.qOG = true;
          }
          else if (localCameraInfo.facing == 0)
          {
            qQa = i;
            qPY.qOJ = localCameraInfo.orientation;
            qPY.qOH = true;
          }
        }
      }
      catch (Exception localException)
      {
        w.e("MicroMsg.CameraUtil", "get camera info error: %s", new Object[] { localException.getMessage() });
        String str = System.getProperty("ro.media.enc.camera.platform", null);
        boolean bool;
        if (str == null)
        {
          bool = false;
          if ((qPY.qOI == 270) || ((bool) && (qPY.qOI == 0)))
          {
            qQb = 1;
            if ((qPY.qOJ != 270) && ((!bool) || (qPY.qOJ != 0))) {
              continue;
            }
            qQc = 1;
            GMTrace.o(5380386062336L, 40087);
          }
        }
        else
        {
          bool = str.equalsIgnoreCase("Mediatek");
          continue;
        }
        qQb = 0;
        continue;
        qQc = 0;
        GMTrace.o(5380386062336L, 40087);
        return;
      }
      i += 1;
    }
  }
  
  public static void jdMethod_do(Context paramContext)
  {
    GMTrace.i(5380251844608L, 40086);
    if (qPY != null)
    {
      GMTrace.o(5380251844608L, 40086);
      return;
    }
    qPY = new g("*");
    boolean bool = bwf();
    qQe = bool;
    if ((bool) && (!p.fQC.fOz))
    {
      bwg();
      if (p.fQC.fOD) {
        qQd = p.fQC.fOC;
      }
      w.i("MicroMsg.CameraUtil", "gCameraNum:" + qPY.fOy + "\ngIsHasFrontCamera:" + qPY.qOG + "\ngIsHasBackCamera:" + qPY.qOH + "\ngFrontCameraId:" + qPZ + "\ngBackCameraId:" + qQa + "\ngBackOrientation:" + qPY.qOJ + "\ngFrontOrientation:" + qPY.qOI + "\ngBestFps:" + qPY.qOF + "\ngFacePreviewSize:" + qPY.qOK + "\ngNonFacePreviewSize:" + qPY.qOL + "\ngFaceCameraIsRotate180:" + qQb + "\ngMainCameraIsRotate180:" + qQc + "\ngCameraFormat:" + qQd + "\ngFaceNotRotate:SDK:" + Build.VERSION.SDK_INT + "\n");
      GMTrace.o(5380251844608L, 40086);
      return;
    }
    if ((qQe) && (p.fQC.fOz)) {
      bwg();
    }
    if (p.fQC.fOz) {
      qPY.fOy = p.fQC.fOy;
    }
    if (p.fQC.fOH)
    {
      if (p.fQC.fOG.fPf != 0) {
        qPY.qOH = true;
      }
    }
    else {
      label348:
      if (p.fQC.fOF) {
        if (p.fQC.fOE.fPf == 0) {
          break label724;
        }
      }
    }
    label724:
    for (qPY.qOG = true;; qPY.qOG = false)
    {
      if ((p.fQC.fOF) && (p.fQC.fOE.fPg >= 0))
      {
        qPY.qOI = p.fQC.fOE.fPg;
        qQb = qPY.qOI;
      }
      if ((p.fQC.fOH) && (p.fQC.fOG.fPg >= 0))
      {
        qPY.qOJ = p.fQC.fOG.fPg;
        qQc = qPY.qOJ;
      }
      if (p.fQC.fOF)
      {
        if (qPY.qOK == null) {
          qPY.qOK = new Point(0, 0);
        }
        qPY.qOK = new Point(p.fQC.fOE.width, p.fQC.fOE.height);
      }
      if (p.fQC.fOH)
      {
        if (qPY.qOL == null) {
          qPY.qOL = new Point(0, 0);
        }
        qPY.qOL = new Point(p.fQC.fOG.width, p.fQC.fOG.height);
      }
      if ((p.fQC.fOH) && (p.fQC.fOG.fps != 0)) {
        qPY.qOF = p.fQC.fOG.fps;
      }
      if ((p.fQC.fOF) && (p.fQC.fOE.fps != 0)) {
        qPY.qOF = p.fQC.fOE.fps;
      }
      paramContext = paramContext.getPackageManager();
      if ((p.fQC.fOz) || (paramContext.hasSystemFeature("android.hardware.camera"))) {
        break;
      }
      qPY.fOy = 0;
      qPY.qOG = false;
      qPY.qOH = false;
      break;
      qPY.qOH = false;
      break label348;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\voip\video\i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */