package com.tencent.mm.plugin.normsg.utils;

import android.app.ActivityManager;
import android.app.ActivityManager.RecentTaskInfo;
import android.content.Context;
import android.os.Build.VERSION;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.w;
import java.lang.reflect.Field;
import java.util.List;

public final class d
{
  public static boolean nxV;
  
  static
  {
    GMTrace.i(17527090446336L, 130587);
    nxV = false;
    long l = System.nanoTime();
    try
    {
      nxV = false;
      if (Build.VERSION.SDK_INT < 21) {}
      for (nxV = false;; nxV = false)
      {
        w.i("MicroMsg.NormalMsgSource.QSDTH", "QSDT, result: %b, time: %d ns", new Object[] { Boolean.valueOf(nxV), Long.valueOf(System.nanoTime() - l) });
        GMTrace.o(17527090446336L, 130587);
        return;
        Field localField = ActivityManager.RecentTaskInfo.class.getDeclaredField("instanceId");
        localField.setAccessible(true);
        localList = ((ActivityManager)ab.getContext().getApplicationContext().getSystemService("activity")).getRecentTasks(1, 2);
        if ((localList != null) && (localList.size() != 0)) {
          break;
        }
      }
    }
    catch (Throwable localThrowable)
    {
      for (;;)
      {
        List localList;
        nxV = false;
        w.i("MicroMsg.NormalMsgSource.QSDTH", "QSDT, result: %b, time: %d ns", new Object[] { Boolean.valueOf(nxV), Long.valueOf(System.nanoTime() - l) });
        GMTrace.o(17527090446336L, 130587);
        return;
        if (localThrowable.getInt((ActivityManager.RecentTaskInfo)localList.get(0)) > 0) {
          nxV = true;
        }
      }
    }
    finally
    {
      w.i("MicroMsg.NormalMsgSource.QSDTH", "QSDT, result: %b, time: %d ns", new Object[] { Boolean.valueOf(nxV), Long.valueOf(System.nanoTime() - l) });
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\normsg\utils\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */