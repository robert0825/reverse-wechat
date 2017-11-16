package com.tencent.mm.compatible.d;

import android.hardware.Camera;
import android.os.Build;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.bg;

final class i
  implements c.a
{
  i()
  {
    GMTrace.i(13811809517568L, 102906);
    GMTrace.o(13811809517568L, 102906);
  }
  
  public static c.a.a sH()
  {
    int j = -1;
    GMTrace.i(13811943735296L, 102907);
    c.a.a locala = new c.a.a();
    try
    {
      locala.fPj = Camera.open();
      locala.eSp = 0;
      if (locala.fPj == null)
      {
        GMTrace.o(13811943735296L, 102907);
        return null;
      }
    }
    catch (Exception localException)
    {
      GMTrace.o(13811943735296L, 102907);
      return null;
    }
    if (Build.DISPLAY.startsWith("Flyme"))
    {
      localException.eSp = 90;
      localException.fPj.setDisplayOrientation(90);
    }
    label183:
    for (;;)
    {
      GMTrace.o(13811943735296L, 102907);
      return localException;
      int i;
      if (!Build.MODEL.equals("M9")) {
        i = j;
      }
      for (;;)
      {
        if (i < 7093) {
          break label183;
        }
        localException.eSp = 90;
        localException.fPj.setDisplayOrientation(180);
        break;
        Object localObject = Build.DISPLAY;
        i = j;
        if (!((String)localObject).substring(0, 0).equals("1"))
        {
          localObject = ((String)localObject).split("-");
          i = j;
          if (localObject != null)
          {
            i = j;
            if (localObject.length >= 2) {
              i = bg.getInt(localObject[1], 0);
            }
          }
        }
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\compatible\d\i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */