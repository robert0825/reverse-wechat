package com.tencent.mm.plugin.sandbox;

import android.content.Context;
import android.content.DialogInterface.OnCancelListener;
import android.content.Intent;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.bu.g.d;
import com.tencent.mm.pluginsdk.p.s;
import com.tencent.mm.pluginsdk.p.t;
import com.tencent.mm.pluginsdk.p.u;
import com.tencent.mm.sandbox.a.a;
import com.tencent.mm.sandbox.monitor.ExceptionMonitorService;
import com.tencent.mm.sandbox.monitor.c;
import com.tencent.mm.sandbox.updater.AppUpdaterUI;
import com.tencent.mm.sandbox.updater.Updater;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.y.aq;
import java.util.HashMap;

public class SubCoreSandBox
  implements p.u, aq
{
  public static boolean osy;
  public static boolean osz;
  
  static
  {
    GMTrace.i(8935947894784L, 66578);
    osy = false;
    osz = false;
    GMTrace.o(8935947894784L, 66578);
  }
  
  public SubCoreSandBox()
  {
    GMTrace.i(8933800411136L, 66562);
    w.i("MicroMsg.SubCoreSandBox", "SubCoreSandBox constructor at: " + System.currentTimeMillis());
    GMTrace.o(8933800411136L, 66562);
  }
  
  public final String FM(String paramString)
  {
    GMTrace.i(8935545241600L, 66575);
    paramString = c.FM(paramString);
    GMTrace.o(8935545241600L, 66575);
    return paramString;
  }
  
  public final p.s a(Context paramContext, DialogInterface.OnCancelListener paramOnCancelListener)
  {
    GMTrace.i(8934739935232L, 66569);
    paramContext = Updater.c(paramContext, paramOnCancelListener);
    GMTrace.o(8934739935232L, 66569);
    return paramContext;
  }
  
  public final void aX(boolean paramBoolean)
  {
    GMTrace.i(8934203064320L, 66565);
    w.i("MicroMsg.SubCoreSandBox", "SubCoreSandBox onAccountPostReset at: " + System.currentTimeMillis());
    GMTrace.o(8934203064320L, 66565);
  }
  
  public final void aY(boolean paramBoolean)
  {
    GMTrace.i(8934337282048L, 66566);
    w.i("MicroMsg.SubCoreSandBox", "SubCoreSandBox onSdcardMount at: " + System.currentTimeMillis());
    GMTrace.o(8934337282048L, 66566);
  }
  
  public final p.s b(Context paramContext, DialogInterface.OnCancelListener paramOnCancelListener)
  {
    GMTrace.i(8934874152960L, 66570);
    paramContext = Updater.d(paramContext, paramOnCancelListener);
    GMTrace.o(8934874152960L, 66570);
    return paramContext;
  }
  
  public final void bcj()
  {
    GMTrace.i(8934605717504L, 66568);
    Updater.Af(16);
    GMTrace.o(8934605717504L, 66568);
  }
  
  public final p.t bck()
  {
    GMTrace.i(8935411023872L, 66574);
    a locala = new a(2);
    GMTrace.o(8935411023872L, 66574);
    return locala;
  }
  
  public final void d(String paramString1, int paramInt, String paramString2, String paramString3)
  {
    GMTrace.i(8935276806144L, 66573);
    Updater.d(paramString1, paramInt, paramString2, paramString3);
    GMTrace.o(8935276806144L, 66573);
  }
  
  public final p.s db(Context paramContext)
  {
    GMTrace.i(8935008370688L, 66571);
    paramContext = Updater.ej(paramContext);
    GMTrace.o(8935008370688L, 66571);
    return paramContext;
  }
  
  public final void dc(Context paramContext)
  {
    GMTrace.i(8935142588416L, 66572);
    Updater.dc(paramContext);
    GMTrace.o(8935142588416L, 66572);
  }
  
  public final void eI(int paramInt)
  {
    GMTrace.i(8934068846592L, 66564);
    w.i("MicroMsg.SubCoreSandBox", "SubCoreSandBox clearPluginData at: " + System.currentTimeMillis());
    GMTrace.o(8934068846592L, 66564);
  }
  
  public final void gY(boolean paramBoolean)
  {
    GMTrace.i(8935813677056L, 66577);
    osy = true;
    osz = paramBoolean;
    GMTrace.o(8935813677056L, 66577);
  }
  
  public final void onAccountRelease()
  {
    GMTrace.i(8934471499776L, 66567);
    w.i("MicroMsg.SubCoreSandBox", "SubCoreSandBox onAccountRelease at: " + System.currentTimeMillis());
    GMTrace.o(8934471499776L, 66567);
  }
  
  public final void r(Context paramContext, Intent paramIntent)
  {
    GMTrace.i(8935679459328L, 66576);
    if (paramContext != null)
    {
      paramIntent.setClass(paramContext, ExceptionMonitorService.class);
      ab.getContext().startService(paramIntent);
    }
    GMTrace.o(8935679459328L, 66576);
  }
  
  public final void s(Context paramContext, Intent paramIntent)
  {
    GMTrace.i(18997311438848L, 141541);
    paramIntent.setClass(paramContext, AppUpdaterUI.class);
    paramContext.startActivity(paramIntent);
    GMTrace.o(18997311438848L, 141541);
  }
  
  public final HashMap<Integer, g.d> vH()
  {
    GMTrace.i(8933934628864L, 66563);
    w.i("MicroMsg.SubCoreSandBox", "SubCoreSandBox getBaseDBFactories at: " + System.currentTimeMillis());
    GMTrace.o(8933934628864L, 66563);
    return null;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\sandbox\SubCoreSandBox.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */