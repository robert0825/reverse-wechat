package com.tencent.mm.plugin.appbrand.dynamic;

import android.os.Bundle;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ipcinvoker.a;
import com.tencent.mm.ipcinvoker.e;
import com.tencent.mm.kernel.b;
import com.tencent.mm.kernel.h;
import com.tencent.mm.network.n.a;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

public final class f
{
  private static n.a hSH;
  
  static
  {
    GMTrace.i(17755931672576L, 132292);
    hSH = new n.a()
    {
      public final void db(int paramAnonymousInt)
      {
        GMTrace.i(17736067448832L, 132144);
        Bundle localBundle = new Bundle();
        localBundle.putInt("status", paramAnonymousInt);
        e.a("com.tencent.mm:support", localBundle, f.a.class, null);
        GMTrace.o(17736067448832L, 132144);
      }
    };
    GMTrace.o(17755931672576L, 132292);
  }
  
  public static void initialize()
  {
    GMTrace.i(17755663237120L, 132290);
    if (!ab.bPY())
    {
      GMTrace.o(17755663237120L, 132290);
      return;
    }
    h.xz();
    h.xx().a(hSH);
    GMTrace.o(17755663237120L, 132290);
  }
  
  public static void release()
  {
    GMTrace.i(17755797454848L, 132291);
    h.xz();
    h.xx().b(hSH);
    GMTrace.o(17755797454848L, 132291);
  }
  
  private static final class a
    implements a
  {
    private a()
    {
      GMTrace.i(17729490780160L, 132095);
      GMTrace.o(17729490780160L, 132095);
    }
    
    public final void a(Bundle paramBundle, com.tencent.mm.ipcinvoker.c paramc)
    {
      GMTrace.i(18317364428800L, 136475);
      Object localObject = d.UO().hSE.values();
      if ((localObject == null) || (((Collection)localObject).isEmpty()))
      {
        GMTrace.o(18317364428800L, 136475);
        return;
      }
      paramc = new com.tencent.mm.plugin.appbrand.dynamic.e.d();
      paramBundle = paramc.name;
      paramc = paramc.on().toString();
      localObject = ((Collection)localObject).iterator();
      while (((Iterator)localObject).hasNext())
      {
        c localc = (c)((Iterator)localObject).next();
        if (localc != null) {
          localc.aT(paramBundle, paramc);
        }
      }
      GMTrace.o(18317364428800L, 136475);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\dynamic\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */