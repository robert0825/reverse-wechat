package com.tencent.mm.booter;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.a.h;
import com.tencent.mm.k.e;
import com.tencent.mm.k.g;
import com.tencent.mm.protocal.d;
import com.tencent.mm.sdk.a.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.f;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.y.at;
import com.tencent.mm.y.c;

public final class j
{
  public static void run()
  {
    GMTrace.i(495531851776L, 3692);
    int i = g.ut().getInt("EnableForgroundService", 0);
    at.AR();
    int j = h.aw(c.ww(), 101);
    if ((b.bPq()) || ((i > 0) && (j >= 0) && (j <= i))) {}
    for (boolean bool2 = true;; bool2 = false)
    {
      boolean bool1 = bool2;
      if (!bool2) {
        bool1 = d.tJF;
      }
      bool2 = bool1;
      if (!bool1) {
        bool2 = b.bPq();
      }
      if (f.eqV == 1) {
        bool2 = false;
      }
      ab.getContext().getSharedPreferences("system_config_prefs", 0).edit().putBoolean("set_service", bool2).commit();
      w.i("MicroMsg.PostTaskSetPushForegroundService", "Set service, userHash:%d, prob:%d, enabled: %b  isalpha:%b channel:%d", new Object[] { Integer.valueOf(j), Integer.valueOf(i), Boolean.valueOf(bool2), Boolean.valueOf(d.tJF), Integer.valueOf(f.eqV) });
      GMTrace.o(495531851776L, 3692);
      return;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\booter\j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */