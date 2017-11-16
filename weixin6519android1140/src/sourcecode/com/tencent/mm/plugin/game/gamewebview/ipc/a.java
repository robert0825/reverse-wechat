package com.tencent.mm.plugin.game.gamewebview.ipc;

import android.os.Bundle;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.network.n;
import com.tencent.mm.network.n.a;
import com.tencent.mm.pluginsdk.ui.tools.s;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.y.at;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public final class a
{
  private static HashMap<Integer, GameMMToClientEvent> hXj;
  private static n lqE;
  
  static
  {
    GMTrace.i(16944048635904L, 126243);
    hXj = new HashMap();
    n.a local1 = new n.a()
    {
      private final byte[] fJa;
      
      public final void db(int paramAnonymousInt)
      {
        GMTrace.i(16961094287360L, 126370);
        synchronized (this.fJa)
        {
          Bundle localBundle = new Bundle();
          localBundle.putInt("mm_to_client_notify_type", 1);
          localBundle.putString("js_event_name", "onNetWorkChange");
          localBundle.putString("netType", s.bCt());
          a.A(localBundle);
          GMTrace.o(16961094287360L, 126370);
          return;
        }
      }
    };
    lqE = local1;
    at.a(local1);
    GMTrace.o(16944048635904L, 126243);
  }
  
  public static void A(Bundle paramBundle)
  {
    try
    {
      GMTrace.i(16943914418176L, 126242);
      w.d("MicroMsg.GameMMToClientEventCenter", "notifyToAllClint");
      Iterator localIterator = hXj.entrySet().iterator();
      while (localIterator.hasNext())
      {
        Map.Entry localEntry = (Map.Entry)localIterator.next();
        GameMMToClientEvent localGameMMToClientEvent = (GameMMToClientEvent)localEntry.getValue();
        if (localGameMMToClientEvent != null)
        {
          localGameMMToClientEvent.lGn = ((Integer)localEntry.getKey()).intValue();
          localGameMMToClientEvent.ler = paramBundle;
          localGameMMToClientEvent.VL();
        }
      }
      GMTrace.o(16943914418176L, 126242);
    }
    finally {}
  }
  
  public static void a(int paramInt, GameMMToClientEvent paramGameMMToClientEvent)
  {
    GMTrace.i(16943645982720L, 126240);
    hXj.put(Integer.valueOf(paramInt), paramGameMMToClientEvent);
    GMTrace.o(16943645982720L, 126240);
  }
  
  public static void oz(int paramInt)
  {
    GMTrace.i(16943780200448L, 126241);
    hXj.remove(Integer.valueOf(paramInt));
    GMTrace.o(16943780200448L, 126241);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\game\gamewebview\ipc\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */