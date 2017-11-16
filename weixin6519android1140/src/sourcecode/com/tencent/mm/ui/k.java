package com.tencent.mm.ui;

import android.app.Activity;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.modelstat.d;
import com.tencent.mm.platformtools.t;
import com.tencent.mm.sdk.f.e;
import com.tencent.mm.sdk.platformtools.w;

public final class k
{
  public static void a(Activity paramActivity, final int paramInt1, final int paramInt2, String paramString)
  {
    GMTrace.i(19031536959488L, 141796);
    e.post(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(19038784716800L, 141850);
        Activity localActivity = this.na;
        int i = paramInt1;
        int j = paramInt2;
        w.i("MicroMsg.LauncherUI.HomeUtil", "clickFlowStat index:%d op:%d %s", new Object[] { Integer.valueOf(j), Integer.valueOf(i), t.Py() });
        if (j >= 0)
        {
          String str = "MainUI";
          if (j == 1) {
            str = "AddressUI";
          }
          if (j == 2) {
            str = "FindMoreFriendUI";
          }
          if (j == 3) {
            str = "MoreTabUI";
          }
          d.a(i, str, localActivity.hashCode() / 16 * 16 + j);
        }
        GMTrace.o(19038784716800L, 141850);
      }
    }, paramString);
    GMTrace.o(19031536959488L, 141796);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */