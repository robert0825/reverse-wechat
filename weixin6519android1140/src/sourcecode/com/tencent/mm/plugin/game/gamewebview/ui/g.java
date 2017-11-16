package com.tencent.mm.plugin.game.gamewebview.ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.game.gamewebview.ipc.CommonLogicTask;
import com.tencent.mm.plugin.game.gamewebview.ipc.GWMainProcessTask;
import com.tencent.mm.plugin.game.gamewebview.ipc.GameWebViewMainProcessService;
import com.tencent.mm.plugin.webview.ui.tools.game.menu.b.b;
import com.tencent.mm.plugin.webview.ui.tools.game.menu.b.c;
import com.tencent.mm.plugin.webview.ui.tools.game.menu.c;
import com.tencent.mm.plugin.webview.ui.tools.widget.WebViewSearchContentInputFooter;
import com.tencent.mm.protocal.c.agw;
import com.tencent.mm.protocal.c.aob;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.base.n;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class g
  extends i
{
  public Map<Integer, aob> lKA;
  
  public g(b paramb)
  {
    super(paramb);
    GMTrace.i(17998731542528L, 134101);
    this.lKA = new HashMap();
    GMTrace.o(17998731542528L, 134101);
  }
  
  public final void aEG()
  {
    GMTrace.i(17998865760256L, 134102);
    if (bg.nm(getBundle().getString("game_hv_menu_appid")))
    {
      super.aEG();
      GMTrace.o(17998865760256L, 134102);
      return;
    }
    final com.tencent.mm.plugin.webview.ui.tools.game.menu.d locald = new com.tencent.mm.plugin.webview.ui.tools.game.menu.d(this.lJb);
    locald.a(new b.c()
    {
      public final void g(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(17995241881600L, 134075);
        paramAnonymousMenuItem = (aob)g.this.lKA.get(Integer.valueOf(paramAnonymousMenuItem.getItemId()));
        if (paramAnonymousMenuItem == null)
        {
          GMTrace.o(17995241881600L, 134075);
          return;
        }
        switch (g.5.lKD[com.tencent.mm.plugin.webview.ui.tools.game.menu.c.a.yj(paramAnonymousMenuItem.und).ordinal()])
        {
        }
        for (;;)
        {
          GMTrace.o(17995241881600L, 134075);
          return;
          Object localObject = new Intent();
          ((Intent)localObject).putExtra("rawUrl", paramAnonymousMenuItem.une);
          if (com.tencent.xweb.x5.sdk.d.getTbsVersion(g.this.lJb) >= 43114)
          {
            com.tencent.mm.bj.d.b(g.this.lJb, "game", ".gamewebview.ui.GameWebViewUI", (Intent)localObject);
            GMTrace.o(17995241881600L, 134075);
            return;
          }
          com.tencent.mm.bj.d.b(g.this.lJb, "webview", ".ui.tools.game.GameWebViewUI", (Intent)localObject);
          GMTrace.o(17995241881600L, 134075);
          return;
          g.this.aEJ();
          GMTrace.o(17995241881600L, 134075);
          return;
          g.this.aEK();
          GMTrace.o(17995241881600L, 134075);
          return;
          g.this.aER();
          GMTrace.o(17995241881600L, 134075);
          return;
          g.this.aEN();
          GMTrace.o(17995241881600L, 134075);
          return;
          g.this.aEO();
          GMTrace.o(17995241881600L, 134075);
          return;
          g.this.refresh();
          GMTrace.o(17995241881600L, 134075);
          return;
          g.this.aEQ();
          GMTrace.o(17995241881600L, 134075);
          return;
          g.this.aEU();
          GMTrace.o(17995241881600L, 134075);
          return;
          localObject = new Bundle();
          ((Bundle)localObject).putInt("mm_to_client_notify_type", 1);
          ((Bundle)localObject).putString("js_event_name", "onCustomGameMenuClicked");
          ((Bundle)localObject).putInt("itemId", paramAnonymousMenuItem.uDY);
          com.tencent.mm.plugin.game.gamewebview.ipc.a.A((Bundle)localObject);
        }
      }
    });
    locald.rRp = new b.b()
    {
      public final void a(n paramAnonymousn)
      {
        GMTrace.i(17994033922048L, 134066);
        com.tencent.mm.plugin.report.service.g.ork.a(480L, 0L, 1L, false);
        n localn = g.this.aEH();
        if (localn != null) {
          paramAnonymousn.wdA.addAll(localn.wdA);
        }
        GMTrace.o(17994033922048L, 134066);
      }
    };
    if (this.lKt.isFullScreen()) {
      locald.rRu = true;
    }
    for (locald.rRv = true; this.lKt.lHe.lJt.isShown(); locald.rRv = false)
    {
      this.lKt.lHe.eU(false);
      af.i(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(17997792018432L, 134094);
          if (g.this.lJb.isFinishing())
          {
            w.i("MicroMsg.GameWebViewMenuHelp", "tryShow sheet failed, the activity has been destroyed.");
            GMTrace.o(17997792018432L, 134094);
            return;
          }
          locald.bFk();
          GMTrace.o(17997792018432L, 134094);
        }
      }, 100L);
      GMTrace.o(17998865760256L, 134102);
      return;
      locald.rRu = false;
    }
    this.lJb.aLo();
    af.i(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(17995510317056L, 134077);
        if (g.this.lJb.isFinishing())
        {
          w.i("MicroMsg.GameWebViewMenuHelp", "tryShow sheet failed, the activity has been destroyed.");
          GMTrace.o(17995510317056L, 134077);
          return;
        }
        locald.bFk();
        GMTrace.o(17995510317056L, 134077);
      }
    }, 100L);
    GMTrace.o(17998865760256L, 134102);
  }
  
  public final n aEH()
  {
    GMTrace.i(17998999977984L, 134103);
    label216:
    for (;;)
    {
      try
      {
        Object localObject1 = com.tencent.mm.plugin.webview.ui.tools.game.menu.a.rQV;
        Object localObject2 = new CommonLogicTask();
        ((CommonLogicTask)localObject2).type = 9;
        ((CommonLogicTask)localObject2).ler.putString("game_hv_menu_appid", getBundle().getString("game_hv_menu_appid"));
        GameWebViewMainProcessService.b((GWMainProcessTask)localObject2);
        localObject2 = ((CommonLogicTask)localObject2).ler.getString("game_hv_menu_pbcache");
        if (bg.nm((String)localObject2)) {
          break label216;
        }
        localObject2 = ((String)localObject2).getBytes("ISO-8859-1");
        Object localObject3 = new agw();
        ((agw)localObject3).aD((byte[])localObject2);
        if (bg.cc(((agw)localObject3).uwi)) {
          break label216;
        }
        localObject1 = ((agw)localObject3).uwi;
        w.i("MicroMsg.GameWebViewMenuHelp", "use net menu data");
        this.lKA.clear();
        localObject2 = ((List)localObject1).iterator();
        if (((Iterator)localObject2).hasNext())
        {
          localObject3 = (aob)((Iterator)localObject2).next();
          this.lKA.put(Integer.valueOf(((aob)localObject3).uDY), localObject3);
          continue;
        }
        localn = c.bFj().f(localException, Ok());
      }
      catch (Exception localException)
      {
        w.e("MicroMsg.GameWebViewMenuHelp", "get cache hv game menu fail! exception:%s", new Object[] { localException.getMessage() });
        GMTrace.o(17998999977984L, 134103);
        return null;
      }
      n localn;
      GMTrace.o(17998999977984L, 134103);
      return localn;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\game\gamewebview\ui\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */