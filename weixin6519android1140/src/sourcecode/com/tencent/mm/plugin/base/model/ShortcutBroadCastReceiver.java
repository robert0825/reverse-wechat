package com.tencent.mm.plugin.base.model;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.comm.a.h;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.base.h;

public class ShortcutBroadCastReceiver
  extends BroadcastReceiver
{
  public ShortcutBroadCastReceiver()
  {
    GMTrace.i(20354386886656L, 151652);
    GMTrace.o(20354386886656L, 151652);
  }
  
  public void onReceive(Context paramContext, Intent paramIntent)
  {
    GMTrace.i(20354521104384L, 151653);
    if (paramIntent == null)
    {
      w.e("MicroMsg.ShortcutBroadCastReceiver", "alvinluo shortcut receiver intent is null");
      GMTrace.o(20354521104384L, 151653);
      return;
    }
    h.bm(paramContext, paramContext.getString(a.h.cRL));
    GMTrace.o(20354521104384L, 151653);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\base\model\ShortcutBroadCastReceiver.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */