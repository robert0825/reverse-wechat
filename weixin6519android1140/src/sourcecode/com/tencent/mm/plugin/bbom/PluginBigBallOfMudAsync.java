package com.tencent.mm.plugin.bbom;

import android.content.Context;
import android.content.DialogInterface.OnDismissListener;
import android.os.Bundle;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.app.WorkerProfile;
import com.tencent.mm.kernel.h;
import com.tencent.mm.plugin.webview.ui.tools.widget.MMWebViewWithJsApi.a;
import com.tencent.mm.pluginsdk.ui.applet.o.a;
import com.tencent.mm.pluginsdk.ui.applet.r;
import com.tencent.mm.pluginsdk.ui.d.j;
import com.tencent.mm.pluginsdk.ui.d.j.3;
import com.tencent.mm.pluginsdk.ui.d.j.4;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.base.i;
import com.tencent.mm.ui.p;
import com.tencent.mm.ui.widget.MMWebView;
import com.tencent.mm.x.f.a;
import com.tencent.mm.x.m;
import com.tencent.mm.x.m.a;
import com.tencent.xweb.n;
import java.util.List;

public class PluginBigBallOfMudAsync
  extends com.tencent.mm.kernel.b.d
  implements com.tencent.mm.plugin.bbom.a.a
{
  public PluginBigBallOfMudAsync()
  {
    GMTrace.i(14555375730688L, 108446);
    GMTrace.o(14555375730688L, 108446);
  }
  
  public void configure(com.tencent.mm.kernel.b.e parame)
  {
    GMTrace.i(14555912601600L, 108450);
    if ((parame.eR("")) && (((com.tencent.mm.kernel.b.f)parame).mProfileCompat != null)) {
      ((com.tencent.mm.plugin.notification.b.a)h.j(com.tencent.mm.plugin.notification.b.a.class)).setNotification(((WorkerProfile)((com.tencent.mm.kernel.b.f)parame).mProfileCompat).getNotification());
    }
    com.tencent.mm.pluginsdk.ui.applet.r.a.txX = new r()
    {
      public final i a(p paramAnonymousp, String paramAnonymousString1, String paramAnonymousString2, String paramAnonymousString3, String paramAnonymousString4, o.a paramAnonymousa)
      {
        GMTrace.i(18471580598272L, 137624);
        paramAnonymousp = com.tencent.mm.pluginsdk.ui.applet.e.a(paramAnonymousp, paramAnonymousString1, paramAnonymousString2, paramAnonymousString3, null, true, paramAnonymousString4, paramAnonymousa);
        GMTrace.o(18471580598272L, 137624);
        return paramAnonymousp;
      }
    };
    m.a.a(new m()
    {
      public final int a(f.a paramAnonymousa, String paramAnonymousString1, String paramAnonymousString2, String paramAnonymousString3, String paramAnonymousString4, byte[] paramAnonymousArrayOfByte)
      {
        GMTrace.i(18471849033728L, 137626);
        int i = com.tencent.mm.pluginsdk.model.app.l.a(paramAnonymousa, paramAnonymousString1, paramAnonymousString2, paramAnonymousString3, paramAnonymousString4, paramAnonymousArrayOfByte);
        GMTrace.o(18471849033728L, 137626);
        return i;
      }
    });
    com.tencent.mm.pluginsdk.ui.d.c.a.tDL = new com.tencent.mm.pluginsdk.ui.d.c()
    {
      public final void a(Context paramAnonymousContext, String paramAnonymousString, DialogInterface.OnDismissListener paramAnonymousOnDismissListener, Bundle paramAnonymousBundle)
      {
        GMTrace.i(18472520122368L, 137631);
        j.a(paramAnonymousContext, paramAnonymousString, paramAnonymousOnDismissListener, paramAnonymousBundle);
        GMTrace.o(18472520122368L, 137631);
      }
      
      public final void a(Context paramAnonymousContext, List<String> paramAnonymousList, DialogInterface.OnDismissListener paramAnonymousOnDismissListener)
      {
        GMTrace.i(18472385904640L, 137630);
        if ((paramAnonymousList.isEmpty()) || (paramAnonymousContext == null))
        {
          GMTrace.o(18472385904640L, 137630);
          return;
        }
        new com.tencent.mm.ui.tools.l(paramAnonymousContext).a(null, new j.3(paramAnonymousList), new j.4(paramAnonymousContext), paramAnonymousOnDismissListener);
        GMTrace.o(18472385904640L, 137630);
      }
    };
    com.tencent.mm.plugin.webview.ui.tools.widget.c.a.rVm = new com.tencent.mm.plugin.webview.ui.tools.widget.c()
    {
      public final MMWebView cb(Context paramAnonymousContext)
      {
        GMTrace.i(19565455081472L, 145774);
        paramAnonymousContext = MMWebViewWithJsApi.a.dx(paramAnonymousContext);
        GMTrace.o(19565455081472L, 145774);
        return paramAnonymousContext;
      }
    };
    com.tencent.mm.plugin.webview.ui.tools.widget.a.a.rVl = new com.tencent.mm.plugin.webview.ui.tools.widget.a()
    {
      public final n a(MMWebView paramAnonymousMMWebView, com.tencent.mm.plugin.webview.ui.tools.widget.b paramAnonymousb)
      {
        GMTrace.i(20652618678272L, 153874);
        paramAnonymousMMWebView = new com.tencent.mm.plugin.webview.ui.tools.widget.f(paramAnonymousMMWebView, false, paramAnonymousb);
        GMTrace.o(20652618678272L, 153874);
        return paramAnonymousMMWebView;
      }
    };
    h.a(com.tencent.mm.plugin.fav.a.b.class, new com.tencent.mm.pluginsdk.model.f());
    h.a(com.tencent.mm.plugin.fav.a.a.class, new com.tencent.mm.pluginsdk.model.d());
    if ((((com.tencent.mm.kernel.b.f)parame).mProfileCompat != null) && (parame.eR("")))
    {
      Object localObject = (WorkerProfile)((com.tencent.mm.kernel.b.f)parame).mProfileCompat;
      parame = ((WorkerProfile)localObject).etF;
      localObject = ((WorkerProfile)localObject).etG;
      com.tencent.mm.bj.c.tIP = parame;
      com.tencent.mm.bj.c.tIQ = (com.tencent.mm.pluginsdk.l)localObject;
    }
    GMTrace.o(14555912601600L, 108450);
  }
  
  public void dependency()
  {
    GMTrace.i(14555778383872L, 108449);
    dependsOn(PluginBigBallOfMud.class);
    dependsOn(com.tencent.mm.plugin.notification.b.a.class);
    GMTrace.o(14555778383872L, 108449);
  }
  
  public void execute(com.tencent.mm.kernel.b.e parame)
  {
    GMTrace.i(14556046819328L, 108451);
    if ((((com.tencent.mm.kernel.b.f)parame).mProfileCompat != null) && (parame.eR("")))
    {
      w.i("MicroMsg.PluginBigBallOfMudAsync", "before WorkerProfile oncreate.");
      ((com.tencent.mm.kernel.b.f)parame).mProfileCompat.onCreate();
    }
    if (parame.eR(""))
    {
      ((com.tencent.mm.plugin.welab.a.a.d)h.h(com.tencent.mm.plugin.welab.a.a.d.class)).a("labs1de6f3", new com.tencent.mm.plugin.welab.b.b());
      ((com.tencent.mm.plugin.welab.a.a.d)h.h(com.tencent.mm.plugin.welab.a.a.d.class)).a(new com.tencent.mm.plugin.welab.d.a());
      ((com.tencent.mm.plugin.welab.a.a.d)h.h(com.tencent.mm.plugin.welab.a.a.d.class)).a("labs_browse", new com.tencent.mm.plugin.welab.b.a());
    }
    GMTrace.o(14556046819328L, 108451);
  }
  
  public void installed()
  {
    GMTrace.i(14555644166144L, 108448);
    alias(com.tencent.mm.plugin.bbom.a.a.class);
    GMTrace.o(14555644166144L, 108448);
  }
  
  public String toString()
  {
    GMTrace.i(14555509948416L, 108447);
    GMTrace.o(14555509948416L, 108447);
    return "plugin-big-ball-of-mud-async";
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\bbom\PluginBigBallOfMudAsync.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */