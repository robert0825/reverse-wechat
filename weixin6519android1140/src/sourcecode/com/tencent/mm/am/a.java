package com.tencent.mm.am;

import android.os.HandlerThread;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.bu.g.d;
import com.tencent.mm.sdk.f.e;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.y.aq;
import java.util.HashMap;

public class a
  implements aq
{
  private static HandlerThread gFR;
  private static ae gFS;
  
  static
  {
    GMTrace.i(1425526489088L, 10621);
    gFR = null;
    gFS = null;
    GMTrace.o(1425526489088L, 10621);
  }
  
  public a()
  {
    GMTrace.i(14464107675648L, 107766);
    GMTrace.o(14464107675648L, 107766);
  }
  
  public static boolean c(Runnable paramRunnable, long paramLong)
  {
    boolean bool2 = false;
    GMTrace.i(1424721182720L, 10615);
    if (paramRunnable == null)
    {
      GMTrace.o(1424721182720L, 10615);
      return false;
    }
    boolean bool1;
    if ((gFS == null) || (gFR == null))
    {
      if (gFS != null)
      {
        bool1 = true;
        if (gFR != null) {
          bool2 = true;
        }
        w.w("MicroMsg.GIF.SubCoreGIF", "check decoder thread available fail, handler[%B] thread[%B] stack[%s]", new Object[] { Boolean.valueOf(bool1), Boolean.valueOf(bool2), bg.bQW() });
        if (gFS != null) {
          gFS.removeCallbacksAndMessages(null);
        }
        if (gFR != null) {
          gFR.quit();
        }
        HandlerThread localHandlerThread = e.SV("GIF-Decoder");
        gFR = localHandlerThread;
        localHandlerThread.start();
        gFS = new ae(gFR.getLooper());
      }
    }
    else
    {
      if (paramLong <= 0L) {
        break label178;
      }
      gFS.postDelayed(paramRunnable, paramLong);
    }
    for (;;)
    {
      GMTrace.o(1424721182720L, 10615);
      return true;
      bool1 = false;
      break;
      label178:
      gFS.post(paramRunnable);
    }
  }
  
  public final void aX(boolean paramBoolean)
  {
    GMTrace.i(1425123835904L, 10618);
    if (gFS != null) {
      gFS.removeCallbacksAndMessages(null);
    }
    GMTrace.o(1425123835904L, 10618);
  }
  
  public final void aY(boolean paramBoolean)
  {
    GMTrace.i(1425258053632L, 10619);
    GMTrace.o(1425258053632L, 10619);
  }
  
  public final void eI(int paramInt)
  {
    GMTrace.i(1424989618176L, 10617);
    GMTrace.o(1424989618176L, 10617);
  }
  
  public final void onAccountRelease()
  {
    GMTrace.i(1425392271360L, 10620);
    if (gFS != null) {
      gFS.removeCallbacksAndMessages(null);
    }
    GMTrace.o(1425392271360L, 10620);
  }
  
  public final HashMap<Integer, g.d> vH()
  {
    GMTrace.i(1424855400448L, 10616);
    GMTrace.o(1424855400448L, 10616);
    return null;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\am\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */