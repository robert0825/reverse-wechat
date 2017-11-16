package com.tencent.mm.as;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.l;
import com.tencent.mm.pluginsdk.p.a;
import com.tencent.mm.pluginsdk.p.r;
import com.tencent.mm.ui.base.i;
import com.tencent.mm.ui.base.i.a;

public final class a
{
  public static boolean JK()
  {
    GMTrace.i(4502333685760L, 33545);
    if ((p.a.tmc != null) && (p.a.tmc.aKD()))
    {
      GMTrace.o(4502333685760L, 33545);
      return true;
    }
    GMTrace.o(4502333685760L, 33545);
    return false;
  }
  
  public static i a(Context paramContext, int paramInt, Runnable paramRunnable)
  {
    GMTrace.i(4502467903488L, 33546);
    paramContext = new i.a(paramContext);
    paramContext.BN(R.l.cUG);
    paramContext.BO(paramInt);
    paramContext.BQ(R.l.dJS).a(new DialogInterface.OnClickListener()
    {
      public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
      {
        GMTrace.i(4503004774400L, 33550);
        if (this.gON != null) {
          this.gON.run();
        }
        GMTrace.o(4503004774400L, 33550);
      }
    });
    paramContext.lz(true);
    paramContext.d(new DialogInterface.OnCancelListener()
    {
      public final void onCancel(DialogInterface paramAnonymousDialogInterface)
      {
        GMTrace.i(4502736338944L, 33548);
        if (this.gON != null) {
          this.gON.run();
        }
        GMTrace.o(4502736338944L, 33548);
      }
    });
    paramContext = paramContext.aax();
    paramContext.show();
    GMTrace.o(4502467903488L, 33546);
    return paramContext;
  }
  
  public static boolean aP(Context paramContext)
  {
    GMTrace.i(4501931032576L, 33542);
    boolean bool = com.tencent.mm.p.a.aP(paramContext);
    GMTrace.o(4501931032576L, 33542);
    return bool;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\as\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */