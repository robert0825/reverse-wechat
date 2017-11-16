package com.tencent.mm.compatible.d;

import android.annotation.TargetApi;
import android.content.Context;
import android.hardware.Camera;
import android.hardware.Camera.CameraInfo;
import android.view.Display;
import android.view.WindowManager;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.w;

final class e
  implements c.a
{
  e()
  {
    GMTrace.i(13812883259392L, 102914);
    GMTrace.o(13812883259392L, 102914);
  }
  
  @TargetApi(8)
  public static c.a.a en(int paramInt)
  {
    GMTrace.i(13813017477120L, 102915);
    c.a.a locala = new c.a.a();
    try
    {
      locala.fPj = Camera.open();
      locala.eSp = 90;
      if (locala.fPj == null)
      {
        GMTrace.o(13813017477120L, 102915);
        return null;
      }
    }
    catch (Exception localException)
    {
      GMTrace.o(13813017477120L, 102915);
      return null;
    }
    Camera.CameraInfo localCameraInfo = new Camera.CameraInfo();
    Camera.getCameraInfo(paramInt, localCameraInfo);
    switch (((WindowManager)ab.getContext().getSystemService("window")).getDefaultDisplay().getRotation())
    {
    default: 
      paramInt = 0;
      if (localCameraInfo.facing != 1) {
        break;
      }
    }
    for (int i = (360 - (localCameraInfo.orientation + paramInt) % 360) % 360;; i = (localCameraInfo.orientation - paramInt + 360) % 360)
    {
      w.d("MicroMsg.CameraUtil.CameraUtilImpl22", "CameraUtilImpl22, open camera, info.orientation: %d, degrees: %d, result:%d", new Object[] { Integer.valueOf(localCameraInfo.orientation), Integer.valueOf(paramInt), Integer.valueOf(i) });
      localException.fPj.setDisplayOrientation(i);
      GMTrace.o(13813017477120L, 102915);
      return localException;
      paramInt = 0;
      break;
      paramInt = 90;
      break;
      paramInt = 180;
      break;
      paramInt = 270;
      break;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\compatible\d\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */