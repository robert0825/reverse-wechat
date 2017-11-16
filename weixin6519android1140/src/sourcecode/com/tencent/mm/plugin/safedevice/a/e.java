package com.tencent.mm.plugin.safedevice.a;

import android.content.Context;
import android.os.Build;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.l;
import com.tencent.mm.plugin.c.a;
import com.tencent.mm.plugin.messenger.foundation.a.a.e.a;
import com.tencent.mm.pluginsdk.l;
import com.tencent.mm.protocal.c.azs;
import com.tencent.mm.protocal.c.azt;
import com.tencent.mm.protocal.c.uu;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.t;
import com.tencent.mm.y.at;
import com.tencent.mm.y.q;
import java.util.Iterator;
import java.util.List;

public final class e
{
  static void a(azt paramazt)
  {
    GMTrace.i(12858192560128L, 95801);
    if ((paramazt != null) && (paramazt.jhd != null))
    {
      paramazt = paramazt.jhd;
      if ((paramazt != null) && (paramazt.size() >= 0))
      {
        f.bcf().eZ("SafeDeviceInfo", "delete from SafeDeviceInfo");
        paramazt = paramazt.iterator();
        while (paramazt.hasNext())
        {
          azs localazs = (azs)paramazt.next();
          f.bcf().a(new c(localazs));
        }
      }
    }
    GMTrace.o(12858192560128L, 95801);
  }
  
  public static String bcd()
  {
    GMTrace.i(12858460995584L, 95803);
    String str = Build.MANUFACTURER + "-" + Build.MODEL;
    GMTrace.o(12858460995584L, 95803);
    return str;
  }
  
  public static String da(Context paramContext)
  {
    GMTrace.i(12858326777856L, 95802);
    if (paramContext == null)
    {
      if (com.tencent.mm.sdk.platformtools.f.vhv)
      {
        paramContext = ab.getContext().getString(R.l.dUl);
        GMTrace.o(12858326777856L, 95802);
        return paramContext;
      }
      paramContext = ab.getContext().getString(R.l.dUk);
      GMTrace.o(12858326777856L, 95802);
      return paramContext;
    }
    if (com.tencent.mm.sdk.platformtools.f.vhv)
    {
      paramContext = paramContext.getString(R.l.dUl);
      GMTrace.o(12858326777856L, 95802);
      return paramContext;
    }
    paramContext = paramContext.getString(R.l.dUk);
    GMTrace.o(12858326777856L, 95802);
    return paramContext;
  }
  
  public static void r(boolean paramBoolean1, boolean paramBoolean2)
  {
    GMTrace.i(12858058342400L, 95800);
    if (!at.AU())
    {
      GMTrace.o(12858058342400L, 95800);
      return;
    }
    int i = q.zK();
    uu localuu;
    if (paramBoolean1)
    {
      i |= 0x4000;
      at.AR();
      com.tencent.mm.y.c.xh().set(40, Integer.valueOf(i));
      if (paramBoolean2)
      {
        localuu = new uu();
        localuu.umY = 28;
        if (!paramBoolean1) {
          break label130;
        }
      }
    }
    label130:
    for (i = 1;; i = 2)
    {
      localuu.umZ = i;
      at.AR();
      com.tencent.mm.y.c.yJ().b(new e.a(23, localuu));
      a.hnI.pr();
      GMTrace.o(12858058342400L, 95800);
      return;
      i &= 0xBFFF;
      break;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\safedevice\a\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */