package com.tencent.mm.plugin.webview.b;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.e;
import com.tencent.mm.ad.k;
import com.tencent.mm.g.a.lr;
import com.tencent.mm.plugin.webview.ui.tools.jsapi.h;
import com.tencent.mm.protocal.c.bao;
import com.tencent.mm.sdk.b.c;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.y.at;
import java.util.Map;

public final class a
  implements e
{
  public a rBe;
  private c rBf;
  
  public a()
  {
    GMTrace.i(12475940470784L, 92953);
    this.rBe = new a();
    this.rBf = new c() {};
    com.tencent.mm.sdk.b.a.vgX.b(this.rBf);
    GMTrace.o(12475940470784L, 92953);
  }
  
  public static String o(Map<String, Object> paramMap, String paramString)
  {
    GMTrace.i(12476343123968L, 92956);
    if (paramMap.containsKey(paramString))
    {
      if (paramMap.get(paramString) != null)
      {
        paramMap = paramMap.get(paramString).toString();
        GMTrace.o(12476343123968L, 92956);
        return paramMap;
      }
      GMTrace.o(12476343123968L, 92956);
      return "";
    }
    GMTrace.o(12476343123968L, 92956);
    return "";
  }
  
  public static int p(Map<String, Object> paramMap, String paramString)
  {
    GMTrace.i(12476477341696L, 92957);
    paramMap = o(paramMap, paramString);
    if (bg.nm(paramMap))
    {
      GMTrace.o(12476477341696L, 92957);
      return 0;
    }
    int i = Integer.valueOf(paramMap).intValue();
    GMTrace.o(12476477341696L, 92957);
    return i;
  }
  
  public final boolean L(Map<String, Object> paramMap)
  {
    GMTrace.i(12476074688512L, 92954);
    w.i("MicroMsg.emoji.EmojiStoreWebViewLogic", "getSearchEmotionData: %s", new Object[] { paramMap.toString() });
    String str1 = o(paramMap, "keyword");
    String str2 = o(paramMap, "nextPageBuffer");
    int i = p(paramMap, "type");
    int j = p(paramMap, "webview_instance_id");
    paramMap = o(paramMap, "searchID");
    if (bg.nm(paramMap)) {}
    for (long l = 0L;; l = Long.valueOf(paramMap).longValue())
    {
      this.rBe.a(i, str1, str2, j, l);
      GMTrace.o(12476074688512L, 92954);
      return false;
    }
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(12476208906240L, 92955);
    if ((paramk instanceof b))
    {
      at.wS().b(234, this);
      this.rBe.aDI = false;
      paramString = (b)paramk;
      if ((paramInt1 == 0) && (paramInt2 == 0)) {
        break label134;
      }
      this.rBe.eFN = false;
      h.yp(paramString.rBk).a("{}", paramString.rBl, "", 0L);
    }
    for (;;)
    {
      paramk = paramString.bBF().uOm;
      String str = com.tencent.mm.platformtools.n.b(paramString.bBF().uqp);
      long l = paramString.bBF().uqs;
      h.yp(paramString.rBk).a(paramk, paramString.rBl, str, l);
      GMTrace.o(12476208906240L, 92955);
      return;
      label134:
      this.rBe.eFN = true;
    }
  }
  
  private final class a
  {
    public boolean aDI;
    public boolean eFN;
    private b rBh;
    private String rBi;
    private long rBj;
    
    public a()
    {
      GMTrace.i(12474866728960L, 92945);
      GMTrace.o(12474866728960L, 92945);
    }
    
    public final void a(int paramInt1, String paramString1, String paramString2, int paramInt2, long paramLong)
    {
      GMTrace.i(12475000946688L, 92946);
      if (bg.nm(paramString1))
      {
        if (paramString2 == null) {}
        for (paramString2 = "";; paramString2 = paramString2.toString())
        {
          w.i("MicroMsg.emoji.EmojiStoreWebViewLogic", "error query:%s type:%d pagebuf:%s ", new Object[] { paramString1, Integer.valueOf(paramInt1), paramString2 });
          GMTrace.o(12475000946688L, 92946);
          return;
        }
      }
      Object localObject = new StringBuffer();
      ((StringBuffer)localObject).append(paramString1);
      ((StringBuffer)localObject).append(paramInt1);
      localObject = com.tencent.mm.a.g.n(((StringBuffer)localObject).toString().getBytes());
      if ((!bg.nm(this.rBi)) && (this.rBi.equals(localObject)) && (System.currentTimeMillis() - this.rBj <= 8000L) && (bg.nm(paramString2)))
      {
        if (this.eFN)
        {
          w.i("MicroMsg.emoji.EmojiStoreWebViewLogic", "hit the search cache %s", new Object[] { paramString1 });
          h.yp(paramInt2).a(this.rBh.bBF().uOm, true, com.tencent.mm.platformtools.n.b(this.rBh.bBF().uqp), this.rBh.bBF().uqs);
          GMTrace.o(12475000946688L, 92946);
          return;
        }
        if (this.aDI)
        {
          if (this.rBh != null) {
            this.rBh.rBk = paramInt2;
          }
          w.i("MicroMsg.emoji.EmojiStoreWebViewLogic", "wait the netscene running");
          GMTrace.o(12475000946688L, 92946);
          return;
        }
        w.i("MicroMsg.emoji.EmojiStoreWebViewLogic", "netscene error try again");
      }
      w.i("MicroMsg.emoji.EmojiStoreWebViewLogic", "start New NetScene query:%s newMD5:%s webviewID:%d", new Object[] { paramString1, localObject, Integer.valueOf(paramInt2) });
      if (this.rBh != null) {
        at.wS().c(this.rBh);
      }
      this.rBi = ((String)localObject);
      this.rBj = System.currentTimeMillis();
      this.aDI = true;
      this.eFN = false;
      at.wS().a(234, a.this);
      this.rBh = new b(paramInt1, paramString1, paramString2.getBytes(), paramInt2, paramLong);
      at.wS().a(this.rBh, 0);
      GMTrace.o(12475000946688L, 92946);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\webview\b\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */