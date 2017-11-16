package com.tencent.mm.plugin.webview.wepkg.model;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.a.kg;
import com.tencent.mm.g.a.kg.a;
import com.tencent.mm.plugin.webview.wepkg.ipc.WepkgProcessPreloadService;
import com.tencent.mm.plugin.webview.wepkg.utils.a;
import com.tencent.mm.plugin.webview.wepkg.utils.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Set;

public class d
  extends com.tencent.mm.sdk.b.c<kg>
{
  public static volatile String eVw;
  private static volatile long rYa;
  public static volatile long rYb;
  private static Set<String> rYc;
  
  static
  {
    GMTrace.i(14583024582656L, 108652);
    rYc = new HashSet();
    GMTrace.o(14583024582656L, 108652);
  }
  
  public d()
  {
    GMTrace.i(12388296294400L, 92300);
    this.vhf = kg.class.getName().hashCode();
    GMTrace.o(12388296294400L, 92300);
  }
  
  private boolean a(kg paramkg)
  {
    GMTrace.i(12388430512128L, 92301);
    switch (paramkg.eOy.type)
    {
    }
    for (;;)
    {
      GMTrace.o(12388430512128L, 92301);
      return false;
      int i = paramkg.eOy.type;
      int j = hashCode();
      int k = paramkg.hashCode();
      long l = Thread.currentThread().getId();
      boolean bool;
      label88:
      Object localObject1;
      if (Thread.currentThread() == Looper.getMainLooper().getThread())
      {
        bool = true;
        w.i("MicroMsg.Wepkg.NotifyGameWebviewOperationListener", "on NotifyGameWebviewOperationListener operation listener, type:%d, hashcode:%s, event hashcode:%s, threadId:%s, isUIThead:%s", new Object[] { Integer.valueOf(i), Integer.valueOf(j), Integer.valueOf(k), Long.valueOf(l), Boolean.valueOf(bool) });
        localObject1 = "";
      }
      try
      {
        localObject2 = paramkg.eOy.intent.getStringExtra("rawUrl");
        localObject1 = localObject2;
      }
      catch (Exception localException)
      {
        Object localObject2;
        for (;;) {}
      }
      try
      {
        if (bg.nl(eVw).equalsIgnoreCase((String)localObject1))
        {
          w.i("MicroMsg.Wepkg.NotifyGameWebviewOperationListener", "forbid to open same page two times");
          GMTrace.o(12388430512128L, 92301);
          return false;
          bool = false;
          break label88;
        }
        eVw = (String)localObject1;
        rYa = System.currentTimeMillis();
        rYb = System.currentTimeMillis();
        if (ab.bPY()) {
          b.rZp = com.tencent.mm.k.g.uu().uf();
        }
        if (com.tencent.mm.plugin.webview.wepkg.utils.d.Ni((String)localObject1))
        {
          w.i("MicroMsg.Wepkg.NotifyGameWebviewOperationListener", "exist pkgid:%s, to reload", new Object[] { com.tencent.mm.plugin.webview.wepkg.utils.d.Nf((String)localObject1) });
          localObject2 = com.tencent.mm.a.g.n(bg.nl((String)localObject1).getBytes()) + "_" + System.currentTimeMillis();
          paramkg.eOy.group = ((String)localObject2);
          af.i(new a(paramkg), 500L);
          paramkg = new c(paramkg)
          {
            public final void m(Message paramAnonymousMessage)
            {
              GMTrace.i(15177743335424L, 113083);
              w.i("MicroMsg.Wepkg.NotifyGameWebviewOperationListener", "preload complete. total time:%d", new Object[] { Long.valueOf(System.currentTimeMillis() - d.rYb) });
              if (this.rXZ != null)
              {
                paramAnonymousMessage = this.rXZ.get();
                if ((paramAnonymousMessage instanceof kg))
                {
                  paramAnonymousMessage = (kg)paramAnonymousMessage;
                  if (paramAnonymousMessage != null) {
                    d.b(paramAnonymousMessage);
                  }
                }
              }
              GMTrace.o(15177743335424L, 113083);
            }
          };
          localObject2 = new Bundle(1);
          ((Bundle)localObject2).putInt("call_cmd_type", 0);
          ((Bundle)localObject2).putString("call_raw_url", (String)localObject1);
          WepkgProcessPreloadService.a(paramkg, (Bundle)localObject2);
          continue;
        }
      }
      finally {}
      w.i("MicroMsg.Wepkg.NotifyGameWebviewOperationListener", "dont have pkgid or disable wepkg, normal turn page. disableWepkg:" + b.rZp);
      b(paramkg);
    }
  }
  
  public static void b(kg paramkg)
  {
    try
    {
      GMTrace.i(12388564729856L, 92302);
      af.i(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(12385075068928L, 92276);
          w.i("MicroMsg.Wepkg.NotifyGameWebviewOperationListener", "interval:%sms, allow enter url:%s", new Object[] { Integer.valueOf(1000), d.eVw });
          d.eVw = "";
          GMTrace.o(12385075068928L, 92276);
        }
      }, 1000L);
      if (paramkg == null) {
        GMTrace.o(12388564729856L, 92302);
      }
      for (;;)
      {
        return;
        if (bg.nm(paramkg.eOy.group)) {
          break label123;
        }
        if (!rYc.contains(paramkg.eOy.group)) {
          break;
        }
        rYc.remove(paramkg.eOy.group);
        GMTrace.o(12388564729856L, 92302);
      }
      rYc.add(paramkg.eOy.group);
    }
    finally {}
    label123:
    Object localObject2 = paramkg.eOy.context;
    Object localObject1 = localObject2;
    if (localObject2 == null) {
      localObject1 = ab.getContext();
    }
    if (paramkg.eOy.intent == null) {
      paramkg.eOy.intent = new Intent();
    }
    paramkg.eOy.intent.putExtra("disable_wepkg", b.rZp);
    switch (paramkg.eOy.type)
    {
    }
    for (;;)
    {
      long l = System.currentTimeMillis() - rYa;
      w.i("MicroMsg.Wepkg.NotifyGameWebviewOperationListener", "turn to GameWebViewUI time:%d", new Object[] { Long.valueOf(l) });
      localObject1 = "";
      try
      {
        localObject2 = paramkg.eOy.intent.getStringExtra("rawUrl");
        localObject1 = localObject2;
        paramkg.eOy.context = null;
      }
      catch (Exception paramkg)
      {
        for (;;)
        {
          localObject2 = localObject1;
        }
      }
      a.b("preloadWebTime", (String)localObject2, com.tencent.mm.plugin.webview.wepkg.utils.d.Nf((String)localObject2), null, -1L, l, null);
      GMTrace.o(12388564729856L, 92302);
      break;
      com.tencent.mm.bj.d.b((Context)localObject1, "webview", ".ui.tools.game.GameWebViewUI", paramkg.eOy.intent);
      continue;
      com.tencent.mm.bj.d.b((Context)localObject1, "webview", ".ui.tools.TransparentWebViewUI", paramkg.eOy.intent);
    }
  }
  
  private static final class a
    implements Runnable
  {
    private final kg rYe;
    
    public a(kg paramkg)
    {
      GMTrace.i(14582219276288L, 108646);
      this.rYe = paramkg;
      GMTrace.o(14582219276288L, 108646);
    }
    
    public final void run()
    {
      GMTrace.i(14582353494016L, 108647);
      d.b(this.rYe);
      GMTrace.o(14582353494016L, 108647);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\webview\wepkg\model\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */