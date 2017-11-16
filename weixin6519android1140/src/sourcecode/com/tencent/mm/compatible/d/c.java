package com.tencent.mm.compatible.d;

import android.content.Context;
import android.hardware.Camera;
import android.hardware.Camera.CameraInfo;
import android.os.Build;
import android.os.Build.VERSION;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.w;

public final class c
{
  public static int getNumberOfCameras()
  {
    GMTrace.i(13813420130304L, 102918);
    if ((p.fQC.fOI) && (p.fQC.fOO))
    {
      new h();
      i = h.getNumberOfCameras();
      GMTrace.o(13813420130304L, 102918);
      return i;
    }
    new f();
    int i = Camera.getNumberOfCameras();
    GMTrace.o(13813420130304L, 102918);
    return i;
  }
  
  public static c.a.a o(Context paramContext, int paramInt)
  {
    GMTrace.i(13813822783488L, 102921);
    if (p.fQC.fOQ == 1)
    {
      w.d("MicroMsg.CameraUtil", "openCamera(), CameraUtilImpl20, cameraId = " + paramInt);
      new d();
      paramContext = d.sH();
      GMTrace.o(13813822783488L, 102921);
      return paramContext;
    }
    if (p.fQC.fOI)
    {
      w.d("MicroMsg.CameraUtil", "openCamera(), CameraUtilImplConfig, cameraId = " + paramInt);
      new h();
      paramContext = h.en(paramInt);
      GMTrace.o(13813822783488L, 102921);
      return paramContext;
    }
    if (Build.MODEL.equals("M9"))
    {
      new i();
      paramContext = i.sH();
      GMTrace.o(13813822783488L, 102921);
      return paramContext;
    }
    if (getNumberOfCameras() > 1)
    {
      w.d("MicroMsg.CameraUtil", "openCamera(), CameraUtilImpl23, cameraId = " + paramInt);
      new f();
      paramContext = f.o(paramContext, paramInt);
      GMTrace.o(13813822783488L, 102921);
      return paramContext;
    }
    new e();
    paramContext = e.en(paramInt);
    GMTrace.o(13813822783488L, 102921);
    return paramContext;
  }
  
  public static int sF()
  {
    GMTrace.i(13813554348032L, 102919);
    if (p.fQL.fPH == 1)
    {
      GMTrace.o(13813554348032L, 102919);
      return 0;
    }
    int j = Camera.getNumberOfCameras();
    Camera.CameraInfo localCameraInfo = new Camera.CameraInfo();
    int i = 0;
    if (i < j)
    {
      Camera.getCameraInfo(i, localCameraInfo);
      if (localCameraInfo.facing == 0) {
        w.d("MicroMsg.CameraUtil", "tigercam get bid %d", new Object[] { Integer.valueOf(i) });
      }
    }
    for (;;)
    {
      w.d("MicroMsg.CameraUtil", "tigercam getBackCameraId %d", new Object[] { Integer.valueOf(i) });
      GMTrace.o(13813554348032L, 102919);
      return i;
      i += 1;
      break;
      i = 0;
    }
  }
  
  public static boolean sG()
  {
    GMTrace.i(13813688565760L, 102920);
    if (p.fQC.fOQ == 1)
    {
      GMTrace.o(13813688565760L, 102920);
      return true;
    }
    if ((Build.VERSION.SDK_INT == 10) && (Build.MODEL.equals("GT-S5360")))
    {
      GMTrace.o(13813688565760L, 102920);
      return true;
    }
    GMTrace.o(13813688565760L, 102920);
    return false;
  }
  
  public static abstract interface a
  {
    public static final class a
    {
      public int eSp;
      public Camera fPj;
      
      public a()
      {
        GMTrace.i(13796106043392L, 102789);
        GMTrace.o(13796106043392L, 102789);
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\compatible\d\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */