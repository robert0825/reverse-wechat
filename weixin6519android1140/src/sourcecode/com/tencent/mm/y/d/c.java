package com.tencent.mm.y.d;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.aw.j;
import com.tencent.mm.aw.t;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.bh;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.y.at;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class c
  implements com.tencent.mm.ad.e
{
  private static c gqS;
  private ArrayList<a> fUn;
  public SharedPreferences ghC;
  private final int gqO;
  private final String gqP;
  private final long gqQ;
  public volatile boolean gqR;
  
  private c()
  {
    GMTrace.i(611630186496L, 4557);
    this.gqO = 21;
    this.gqP = "trace_config_last_update_time";
    this.gqQ = 86400000L;
    this.gqR = false;
    this.ghC = ab.bPV();
    this.fUn = new ArrayList();
    GMTrace.o(611630186496L, 4557);
  }
  
  public static c CC()
  {
    GMTrace.i(611764404224L, 4558);
    if (gqS == null) {}
    try
    {
      if (gqS == null) {
        gqS = new c();
      }
      c localc = gqS;
      GMTrace.o(611764404224L, 4558);
      return localc;
    }
    finally {}
  }
  
  private void fH(int paramInt)
  {
    GMTrace.i(612032839680L, 4560);
    t.Kj();
    Object localObject1 = com.tencent.mm.aw.n.Kf();
    Object localObject2 = t.Kj().aT(paramInt, 21);
    label479:
    for (;;)
    {
      try
      {
        Object localObject3 = bh.q(com.tencent.mm.a.e.be(new File(new File((String)localObject1), (String)localObject2).getPath()), "TraceConfig");
        if (localObject3 == null)
        {
          w.d("MicroMsg.TraceConfigUpdater", "summer kvMap is null and ret");
          GMTrace.o(612032839680L, 4560);
          return;
        }
        localObject2 = new HashMap();
        i = 0;
        Object localObject4 = new StringBuilder().append(".TraceConfig.Item");
        if (i == 0)
        {
          localObject1 = "";
          localObject1 = localObject1;
          localObject4 = (String)((Map)localObject3).get((String)localObject1 + ".$key");
          if (localObject4 != null)
          {
            i += 1;
            long l = bg.getLong((String)((Map)localObject3).get(localObject1), -1L);
            if (l < 0L) {
              break label479;
            }
            w.i("MicroMsg.TraceConfigUpdater", "summer updateTraceConfig i: " + i + " key: " + (String)localObject4 + "|value: " + l);
            ((Map)localObject2).put(localObject4, Long.valueOf(l));
          }
        }
        else
        {
          localObject1 = Integer.valueOf(i);
          continue;
        }
        localObject1 = this.ghC.edit();
        localObject3 = ((Map)localObject2).entrySet().iterator();
        if (((Iterator)localObject3).hasNext())
        {
          localObject4 = (Map.Entry)((Iterator)localObject3).next();
          ((SharedPreferences.Editor)localObject1).putLong((String)((Map.Entry)localObject4).getKey(), ((Long)((Map.Entry)localObject4).getValue()).longValue());
          continue;
        }
        com.tencent.mm.aw.m localm;
        localm.putLong("trace_config_last_update_time", System.currentTimeMillis()).commit();
      }
      catch (IOException localIOException)
      {
        w.printErrStackTrace("MicroMsg.TraceConfigUpdater", localIOException, "", new Object[0]);
        localm = t.Kj().aR(paramInt, 21);
        localm.status = 2;
        t.Kj().b(localm);
        GMTrace.o(612032839680L, 4560);
        return;
      }
      w.d("MicroMsg.TraceConfigUpdater", "summer updateTraceConfig configMap size: " + ((Map)localObject2).size());
      int j = this.fUn.size();
      int i = 0;
      while (i < j)
      {
        ((a)this.fUn.get(i)).Cy();
        i += 1;
      }
    }
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ad.k paramk)
  {
    GMTrace.i(611898621952L, 4559);
    int i = paramk.getType();
    w.i("MicroMsg.TraceConfigUpdater", "summer onSceneEnd: errType:[%d], errCode:[%d], type:[%d]", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(i) });
    if ((!(paramk instanceof com.tencent.mm.ad.m)) || (((com.tencent.mm.ad.m)paramk).DM() != 21))
    {
      w.i("MicroMsg.TraceConfigUpdater", "summer onSceneEnd another scene and ret");
      GMTrace.o(611898621952L, 4559);
      return;
    }
    if (i == 159)
    {
      if ((paramInt1 == 0) && (paramInt2 == 0))
      {
        paramString = t.Kj().gJ(21);
        if ((paramString == null) || (paramString.length == 0))
        {
          w.i("MicroMsg.TraceConfigUpdater", "summer doDownload error no pkg found.");
          release();
          GMTrace.o(611898621952L, 4559);
          return;
        }
        paramString = paramString[0];
        w.i("MicroMsg.TraceConfigUpdater", "summer doDownload pkg id:" + paramString.id + " version:" + paramString.version + " status:" + paramString.status + " type:" + paramString.eII);
        if (5 == paramString.status)
        {
          paramString = new j(paramString.id, 21);
          at.wS().a(paramString, 0);
          GMTrace.o(611898621952L, 4559);
          return;
        }
        w.i("MicroMsg.TraceConfigUpdater", "summer pkgInfo has downloaded and release");
        this.ghC.edit().putLong("trace_config_last_update_time", System.currentTimeMillis()).commit();
        release();
        GMTrace.o(611898621952L, 4559);
        return;
      }
      release();
      GMTrace.o(611898621952L, 4559);
      return;
    }
    if (i == 160)
    {
      if ((paramInt1 == 0) && (paramInt2 == 0)) {
        fH(((j)paramk).gQc);
      }
      release();
    }
    GMTrace.o(611898621952L, 4559);
  }
  
  public final boolean a(a parama)
  {
    GMTrace.i(612301275136L, 4562);
    if ((parama != null) && (!this.fUn.contains(parama)))
    {
      boolean bool = this.fUn.add(parama);
      GMTrace.o(612301275136L, 4562);
      return bool;
    }
    GMTrace.o(612301275136L, 4562);
    return false;
  }
  
  public final void release()
  {
    GMTrace.i(612167057408L, 4561);
    w.i("MicroMsg.TraceConfigUpdater", "summer release");
    this.gqR = false;
    at.wS().b(159, this);
    at.wS().b(160, this);
    GMTrace.o(612167057408L, 4561);
  }
  
  public static abstract interface a
  {
    public abstract void Cy();
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\y\d\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */