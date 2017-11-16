package com.tencent.mm.wallet_core.d;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.wallet_core.model.af;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.wallet_core.g.a.c;
import com.tencent.mm.wallet_core.g.a.d;
import com.tencent.mm.wallet_core.g.a.f;
import com.tencent.mm.wallet_core.g.a.g;
import com.tencent.mm.wallet_core.g.a.i;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class a
  implements com.tencent.mm.ad.e
{
  private i xDK;
  private int xDL;
  private com.tencent.mm.ad.e xDM;
  
  public a(com.tencent.mm.ad.e parame)
  {
    GMTrace.i(1434250641408L, 10686);
    this.xDL = 0;
    this.xDM = parame;
    GMTrace.o(1434250641408L, 10686);
  }
  
  private void a(int paramInt1, int paramInt2, String paramString, JSONObject paramJSONObject)
  {
    GMTrace.i(1434787512320L, 10690);
    w.i("MicroMsg.DelayQueryOrderHelper", "doRealCallback errCode = " + paramInt2 + "errType = " + paramInt1);
    if ((this.xDK != null) && (paramJSONObject != null) && (paramInt1 == 0) && (paramInt2 == 0))
    {
      w.i("MicroMsg.DelayQueryOrderHelper", "doRealCallback mScene !=null");
      this.xDK.a(paramInt2, paramString, paramJSONObject);
      this.xDM.a(paramInt1, paramInt2, paramString, this.xDK);
    }
    for (;;)
    {
      w.i("MicroMsg.DelayQueryOrderHelper", "doRealCallback reset");
      this.xDL = 0;
      GMTrace.o(1434787512320L, 10690);
      return;
      if (this.xDM != null)
      {
        w.i("MicroMsg.DelayQueryOrderHelper", "doRealCallback mRealCallback !=null");
        this.xDM.a(paramInt1, paramInt2, paramString, this.xDK);
      }
    }
  }
  
  private void c(i parami)
  {
    GMTrace.i(1434653294592L, 10689);
    this.xDK = parami;
    this.xDK.xEm = true;
    com.tencent.mm.kernel.h.xz();
    com.tencent.mm.kernel.h.xx().fYr.a(385, this);
    parami = com.tencent.mm.plugin.wallet_core.model.n.byx();
    int i;
    Object localObject;
    label110:
    int k;
    label134:
    int m;
    StringBuilder localStringBuilder;
    if (parami.rjC > 0)
    {
      i = parami.rjC;
      this.xDL += 1;
      parami = this.xDK.cmf();
      localObject = (String)parami.get("req_key");
      if (!bg.nm((String)localObject)) {
        break label259;
      }
      w.i("MicroMsg.DelayQueryOrderHelper", "no reqKey");
      parami = new com.tencent.mm.wallet_core.g.a.e(parami);
      parami.xDX = true;
      k = com.tencent.mm.plugin.wallet_core.model.n.byx().mRetryCount;
      if (this.xDL < k) {
        break label426;
      }
      j = 1;
      m = this.xDL;
      localObject = new HashMap();
      localStringBuilder = new StringBuilder();
      if (j == 0) {
        break label431;
      }
    }
    label259:
    label426:
    label431:
    for (int j = 1;; j = 0)
    {
      ((HashMap)localObject).put("is_last_query", j);
      ((HashMap)localObject).put("curr_query_count", String.valueOf(m));
      parami.ao((Map)localObject);
      w.i("MicroMsg.DelayQueryOrderHelper", "doLoopDelayScene,delay = %s queryOrderCount %s", new Object[] { Integer.valueOf(i), Integer.valueOf(k) });
      com.tencent.mm.kernel.h.xz();
      com.tencent.mm.kernel.h.xx().fYr.a(parami, i);
      GMTrace.o(1434653294592L, 10689);
      return;
      i = 10000;
      break;
      w.i("MicroMsg.DelayQueryOrderHelper", "payorder reqKey: %s", new Object[] { localObject });
      w.i("MicroMsg.DelayQueryOrderHelper", "delayquery go new split cgi");
      if (((String)localObject).startsWith("sns_aa_"))
      {
        parami = new com.tencent.mm.wallet_core.g.a.a(parami);
        break label110;
      }
      if (((String)localObject).startsWith("sns_tf_"))
      {
        parami = new g(parami);
        break label110;
      }
      if (((String)localObject).startsWith("sns_ff_"))
      {
        parami = new com.tencent.mm.wallet_core.g.a.b(parami);
        break label110;
      }
      if (((String)localObject).startsWith("ts_"))
      {
        parami = new c(parami);
        break label110;
      }
      if (((String)localObject).startsWith("sns_"))
      {
        parami = new f(parami);
        break label110;
      }
      if (((String)localObject).startsWith("offline_"))
      {
        parami = new d(parami);
        break label110;
      }
      parami = new com.tencent.mm.wallet_core.g.a.e(parami);
      break label110;
      j = 0;
      break label134;
    }
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ad.k paramk)
  {
    GMTrace.i(1434921730048L, 10691);
    w.d("MicroMsg.DelayQueryOrderHelper", "errType: %d, errCode: %d, errMsg: %s scene %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString, paramk });
    if ((paramk instanceof com.tencent.mm.wallet_core.g.a.e))
    {
      com.tencent.mm.kernel.h.xz();
      com.tencent.mm.kernel.h.xx().fYr.b(385, this);
      paramk = (com.tencent.mm.wallet_core.g.a.e)paramk;
      w.d("MicroMsg.DelayQueryOrderHelper", "handlerLoopQueryOrder errType: %d, errCode: %d, errMsg: %s scene %s  errmsgtype %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString, paramk, Integer.valueOf(paramk.xDW) });
      if (paramk.xDW == 1)
      {
        w.i("MicroMsg.DelayQueryOrderHelper", "handlerLoopQueryOrder step A");
        a(paramInt1, paramInt2, paramString, paramk.cmd());
        GMTrace.o(1434921730048L, 10691);
        return;
      }
      if ((paramInt1 == 0) && (paramInt2 == 0))
      {
        w.i("MicroMsg.DelayQueryOrderHelper", "handlerLoopQueryOrder step B");
        if (paramk.xDW != 2)
        {
          a(paramInt1, paramInt2, paramString, paramk.cmd());
          GMTrace.o(1434921730048L, 10691);
        }
      }
      else
      {
        if (paramk.xDq) {
          break label283;
        }
        w.i("MicroMsg.DelayQueryOrderHelper", "handlerLoopQueryOrder step C");
        w.i("MicroMsg.DelayQueryOrderHelper", "PaySuccess error %s", new Object[] { com.tencent.mm.plugin.wallet_core.model.n.byx().rjD });
      }
      label283:
      do
      {
        a(this.xDK.xEe, this.xDK.xEf, this.xDK.xEg, this.xDK.xEh);
        GMTrace.o(1434921730048L, 10691);
        return;
        if (a(this.xDK))
        {
          w.i("MicroMsg.DelayQueryOrderHelper", "handlerLoopQueryOrder step D doLoopDelayScene");
          c(this.xDK);
          GMTrace.o(1434921730048L, 10691);
          return;
        }
        w.i("MicroMsg.DelayQueryOrderHelper", "handlerLoopQueryOrder step D fail");
      } while (paramk.xDW != 1);
      a(paramInt1, paramInt2, paramString, paramk.cmd());
      GMTrace.o(1434921730048L, 10691);
      return;
    }
    if ((paramk instanceof i))
    {
      com.tencent.mm.kernel.h.xz();
      com.tencent.mm.kernel.h.xx().fYr.b(385, this);
      if (((i)paramk).xEn)
      {
        if (this.xDK.qZD)
        {
          w.i("MicroMsg.DelayQueryOrderHelper", "PaySuccess ok");
          a(paramInt1, paramInt2, paramString, ((i)paramk).xEh);
          GMTrace.o(1434921730048L, 10691);
          return;
        }
        if (this.xDK.cmg())
        {
          w.i("MicroMsg.DelayQueryOrderHelper", "try isServerDelayQuery true");
          c(this.xDK);
          GMTrace.o(1434921730048L, 10691);
          return;
        }
        paramString = com.tencent.mm.plugin.wallet_core.model.n.byx().rjD;
        w.i("MicroMsg.DelayQueryOrderHelper", "PaySuccess error %s", new Object[] { paramString });
        a(paramInt1, paramInt2, paramString, ((i)paramk).xEh);
      }
    }
    GMTrace.o(1434921730048L, 10691);
  }
  
  public final boolean a(i parami)
  {
    GMTrace.i(1434384859136L, 10687);
    int i = com.tencent.mm.plugin.wallet_core.model.n.byx().mRetryCount;
    w.i("MicroMsg.DelayQueryOrderHelper", " isServerDelayQuery %s mDelayQueryTime %s ", new Object[] { Boolean.valueOf(parami.cmg()), Integer.valueOf(this.xDL) });
    if ((parami.cmg()) && (this.xDL < i))
    {
      GMTrace.o(1434384859136L, 10687);
      return true;
    }
    GMTrace.o(1434384859136L, 10687);
    return false;
  }
  
  public final void b(i parami)
  {
    GMTrace.i(1434519076864L, 10688);
    w.i("MicroMsg.DelayQueryOrderHelper", "startDelayScene");
    this.xDL = 0;
    c(parami);
    GMTrace.o(1434519076864L, 10688);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\wallet_core\d\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */