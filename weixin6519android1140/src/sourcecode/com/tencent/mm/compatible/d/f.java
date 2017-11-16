package com.tencent.mm.compatible.d;

import android.content.Context;
import android.hardware.Camera;
import android.hardware.Camera.CameraInfo;
import android.view.Display;
import android.view.WindowManager;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;

public final class f
  implements c.a
{
  public f()
  {
    GMTrace.i(13812614823936L, 102912);
    GMTrace.o(13812614823936L, 102912);
  }
  
  public static c.a.a o(Context paramContext, int paramInt)
  {
    GMTrace.i(13812749041664L, 102913);
    c.a.a locala = new c.a.a();
    locala.fPj = null;
    try
    {
      l = bg.Pw();
      w.i("MicroMsg.CameraUtil", "ashu::begin to try Call Camera.open cameraID %d", new Object[] { Integer.valueOf(paramInt) });
      locala.fPj = Camera.open(paramInt);
      w.i("MicroMsg.CameraUtil", "ashu::Call Camera.open back, use %dms", new Object[] { Long.valueOf(bg.aI(l)) });
      if (locala.fPj == null)
      {
        w.e("MicroMsg.CameraUtil", "open camera error, not exception, but camera null");
        GMTrace.o(13812749041664L, 102913);
        return null;
      }
    }
    catch (Exception paramContext)
    {
      w.e("MicroMsg.CameraUtil", "open camera error %s", new Object[] { paramContext.getMessage() });
      w.printErrStackTrace("MicroMsg.CameraUtil", paramContext, "", new Object[0]);
      GMTrace.o(13812749041664L, 102913);
      return null;
    }
    Camera.CameraInfo localCameraInfo = new Camera.CameraInfo();
    long l = bg.Pw();
    w.i("MicroMsg.CameraUtil", "ashu::begin to Call Camera.getCameraInfo cameraID %d", new Object[] { Integer.valueOf(paramInt) });
    Camera.getCameraInfo(paramInt, localCameraInfo);
    w.i("MicroMsg.CameraUtil", "ashu::Call Camera.getCameraInfo back, use %dms", new Object[] { Long.valueOf(bg.aI(l)) });
    switch (((WindowManager)paramContext.getSystemService("window")).getDefaultDisplay().getRotation())
    {
    default: 
      paramInt = 0;
      if (localCameraInfo.facing != 1) {
        break;
      }
    }
    for (paramInt = (360 - localCameraInfo.orientation % 360) % 360;; paramInt = (localCameraInfo.orientation - paramInt + 360) % 360)
    {
      l = bg.Pw();
      w.i("MicroMsg.CameraUtil", "ashu::begin to Call Camera.setDisplayOrientation %d", new Object[] { Integer.valueOf(paramInt) });
      locala.fPj.setDisplayOrientation(paramInt);
      w.i("MicroMsg.CameraUtil", "ashu::Call Camera.setDisplayOrientation back, use %dms", new Object[] { Long.valueOf(bg.aI(l)) });
      locala.eSp = localCameraInfo.orientation;
      GMTrace.o(13812749041664L, 102913);
      return locala;
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


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\compatible\d\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */