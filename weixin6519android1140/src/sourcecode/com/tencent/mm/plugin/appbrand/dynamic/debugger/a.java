package com.tencent.mm.plugin.appbrand.dynamic.debugger;

import android.os.Bundle;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ipcinvoker.c;
import com.tencent.mm.ipcinvoker.e;
import com.tencent.mm.jsapi.core.MiniJsBridge.a;
import com.tencent.mm.modelappbrand.LogInfo;
import com.tencent.mm.sdk.platformtools.w;
import java.util.ArrayList;

public final class a
{
  private static MiniJsBridge.a hTw;
  
  static
  {
    GMTrace.i(18316156469248L, 136466);
    hTw = new MiniJsBridge.a()
    {
      public final void r(String paramAnonymousString, int paramAnonymousInt)
      {
        GMTrace.i(18314814291968L, 136456);
        Bundle localBundle = new Bundle();
        localBundle.putString("id", paramAnonymousString);
        localBundle.putInt("status", paramAnonymousInt);
        e.a("com.tencent.mm", localBundle, a.a.class, null);
        GMTrace.o(18314814291968L, 136456);
      }
    };
    GMTrace.o(18316156469248L, 136466);
  }
  
  public static MiniJsBridge.a Vc()
  {
    GMTrace.i(19922876891136L, 148437);
    MiniJsBridge.a locala = hTw;
    GMTrace.o(19922876891136L, 148437);
    return locala;
  }
  
  public static void a(String paramString, ArrayList<LogInfo> paramArrayList)
  {
    GMTrace.i(18315888033792L, 136464);
    Bundle localBundle = new Bundle();
    localBundle.putString("id", paramString);
    localBundle.putParcelableArrayList("logList", paramArrayList);
    e.a("com.tencent.mm", localBundle, b.class, null);
    GMTrace.o(18315888033792L, 136464);
  }
  
  private static class a
    implements com.tencent.mm.ipcinvoker.a
  {
    private a()
    {
      GMTrace.i(18316827557888L, 136471);
      GMTrace.o(18316827557888L, 136471);
    }
    
    public final void a(Bundle paramBundle, c paramc)
    {
      GMTrace.i(18316961775616L, 136472);
      b.r(paramBundle.getString("id"), paramBundle.getInt("status"));
      GMTrace.o(18316961775616L, 136472);
    }
  }
  
  private static class b
    implements com.tencent.mm.ipcinvoker.a
  {
    private b()
    {
      GMTrace.i(18317095993344L, 136473);
      GMTrace.o(18317095993344L, 136473);
    }
    
    public final void a(Bundle paramBundle, c paramc)
    {
      GMTrace.i(18317230211072L, 136474);
      paramc = paramBundle.getParcelableArrayList("logList");
      if ((paramc == null) || (paramc.isEmpty()))
      {
        w.i("MicroMsg.WidgetDebugIPCBridge", "logList is null or nil.");
        GMTrace.o(18317230211072L, 136474);
        return;
      }
      b.a(paramBundle.getString("id"), paramc);
      GMTrace.o(18317230211072L, 136474);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\dynamic\debugger\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */