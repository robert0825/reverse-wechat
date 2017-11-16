package com.tencent.mm.booter;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import com.jg.JgClassChecked;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;

@JgClassChecked(author=20, fComment="checked", lastDate="20140429", reviewer=20, vComment={com.jg.EType.RECEIVERCHECK})
public class InstallReceiver
  extends BroadcastReceiver
{
  public InstallReceiver()
  {
    GMTrace.i(505598181376L, 3767);
    GMTrace.o(505598181376L, 3767);
  }
  
  public void onReceive(Context paramContext, Intent paramIntent)
  {
    GMTrace.i(505732399104L, 3768);
    if ((paramContext == null) || (paramIntent == null))
    {
      GMTrace.o(505732399104L, 3768);
      return;
    }
    String str = paramIntent.getAction();
    w.i("MicroMsg.InstallReceiver", "action:[%s]", new Object[] { str });
    if ((bg.nm(str)) || (!str.equals("com.android.vending.INSTALL_REFERRER")))
    {
      w.e("MicroMsg.InstallReceiver", "action is null or nil, or not the installed action");
      GMTrace.o(505732399104L, 3768);
      return;
    }
    str = "";
    try
    {
      paramIntent = paramIntent.getStringExtra("referrer");
      w.i("MicroMsg.InstallReceiver", "get referer:[%s]", new Object[] { paramIntent });
      if (bg.nm(paramIntent))
      {
        w.e("MicroMsg.InstallReceiver", "get referer is null or nil");
        GMTrace.o(505732399104L, 3768);
        return;
      }
    }
    catch (Exception paramIntent)
    {
      for (;;)
      {
        w.e("MicroMsg.InstallReceiver", "%s", new Object[] { bg.f(paramIntent) });
        paramIntent = str;
      }
      w.d("MicroMsg.InstallReceiver", "[PREF] write installreferer = " + paramIntent);
      paramContext.getSharedPreferences(ab.bPU(), 0).edit().putString("installreferer", paramIntent).commit();
      GMTrace.o(505732399104L, 3768);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\booter\InstallReceiver.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */