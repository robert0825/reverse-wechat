package com.tencent.mm.plugin.game.gamewebview.e;

import android.content.Intent;
import android.os.Bundle;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.game.gamewebview.ipc.CommonLogicTask;
import com.tencent.mm.plugin.game.gamewebview.ipc.GameWebViewMainProcessService;
import com.tencent.mm.plugin.webview.ui.tools.e;
import com.tencent.mm.plugin.webview.ui.tools.jsapi.b;
import com.tencent.mm.pluginsdk.ui.tools.s;
import com.tencent.mm.protocal.GeneralControlWrapper;
import com.tencent.mm.protocal.JsapiPermissionWrapper;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class c
{
  public e ioi;
  private List<b> lLq;
  public long lLr;
  
  public c(com.tencent.mm.plugin.game.gamewebview.ui.d paramd)
  {
    GMTrace.i(16966060343296L, 126407);
    this.lLq = new ArrayList();
    this.ioi = paramd.lJA;
    this.lLr = paramd.lJB;
    this.lLq.add(new a());
    this.lLq.add(new b());
    GMTrace.o(16966060343296L, 126407);
  }
  
  public final boolean zE(String paramString)
  {
    GMTrace.i(16966194561024L, 126408);
    Iterator localIterator = this.lLq.iterator();
    while (localIterator.hasNext())
    {
      b localb = (b)localIterator.next();
      if (localb.zE(paramString))
      {
        localb.zF(paramString);
        GMTrace.o(16966194561024L, 126408);
        return true;
      }
    }
    GMTrace.o(16966194561024L, 126408);
    return false;
  }
  
  private final class a
    implements b
  {
    public a()
    {
      GMTrace.i(16966597214208L, 126411);
      GMTrace.o(16966597214208L, 126411);
    }
    
    public final boolean zE(String paramString)
    {
      GMTrace.i(16966731431936L, 126412);
      if (bg.nm(paramString))
      {
        GMTrace.o(16966731431936L, 126412);
        return false;
      }
      boolean bool = s.eK(paramString, "weixin://jump/");
      GMTrace.o(16966731431936L, 126412);
      return bool;
    }
    
    public final boolean zF(String paramString)
    {
      GMTrace.i(16966865649664L, 126413);
      if ((c.this.ioi == null) || (!c.this.ioi.bDN().bOd()))
      {
        w.e("MicroMsg.UrlHandler", "ActivityJumpHandler not allow, no inner url generalcontrol, url = %s", new Object[] { paramString });
        GMTrace.o(16966865649664L, 126413);
        return true;
      }
      CommonLogicTask localCommonLogicTask = new CommonLogicTask();
      localCommonLogicTask.type = 1;
      Bundle localBundle = new Bundle();
      localBundle.putBoolean("permission_allow", c.this.ioi.bDM().eS(7));
      localBundle.putString("url", paramString);
      localCommonLogicTask.ler = localBundle;
      GameWebViewMainProcessService.a(localCommonLogicTask);
      GMTrace.o(16966865649664L, 126413);
      return true;
    }
  }
  
  private final class b
    implements b
  {
    public b()
    {
      GMTrace.i(16965657690112L, 126404);
      GMTrace.o(16965657690112L, 126404);
    }
    
    public final boolean zE(String paramString)
    {
      GMTrace.i(16965791907840L, 126405);
      if (bg.nm(paramString))
      {
        GMTrace.o(16965791907840L, 126405);
        return false;
      }
      boolean bool = s.eK(paramString, "weixin://");
      GMTrace.o(16965791907840L, 126405);
      return bool;
    }
    
    public final boolean zF(String paramString)
    {
      boolean bool = true;
      GMTrace.i(16965926125568L, 126406);
      if (com.tencent.mm.pluginsdk.d.aa(paramString, c.this.lLr)) {}
      for (;;)
      {
        try
        {
          CommonLogicTask localCommonLogicTask = new CommonLogicTask();
          if ("weixin://dl/posts".equals(paramString))
          {
            localCommonLogicTask.type = 3;
            GameWebViewMainProcessService.a(localCommonLogicTask);
            GMTrace.o(16965926125568L, 126406);
            return bool;
          }
          if ("weixin://dl/moments".equals(paramString))
          {
            localCommonLogicTask.type = 4;
            GameWebViewMainProcessService.a(localCommonLogicTask);
            continue;
          }
        }
        catch (Exception paramString)
        {
          w.e("MicroMsg.UrlHandler", "kv report fail, ex = %s", new Object[] { paramString.getMessage() });
          continue;
          if ("weixin://dl/scan".equals(paramString))
          {
            com.tencent.mm.bj.d.a(ab.getContext(), "scanner", ".ui.SingleTopScanUI", new Intent(), false);
            continue;
          }
          com.tencent.mm.pluginsdk.d.NZ(paramString);
          continue;
        }
        bool = false;
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\game\gamewebview\e\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */