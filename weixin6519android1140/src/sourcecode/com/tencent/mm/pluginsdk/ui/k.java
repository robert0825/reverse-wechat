package com.tencent.mm.pluginsdk.ui;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.l;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.ui.base.h;

public final class k
{
  public static boolean dU(Context paramContext)
  {
    GMTrace.i(1166620491776L, 8692);
    if (!ad.RS("network_doctor_shown"))
    {
      GMTrace.o(1166620491776L, 8692);
      return false;
    }
    h.a(paramContext, R.l.dLo, R.l.cUG, new DialogInterface.OnClickListener()
    {
      public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
      {
        GMTrace.i(923015315456L, 6877);
        this.val$context.startActivity(new Intent("android.settings.WIRELESS_SETTINGS"));
        GMTrace.o(923015315456L, 6877);
      }
    }, null);
    GMTrace.o(1166620491776L, 8692);
    return true;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\pluginsdk\ui\k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */