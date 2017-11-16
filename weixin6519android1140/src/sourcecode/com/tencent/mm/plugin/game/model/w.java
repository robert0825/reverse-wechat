package com.tencent.mm.plugin.game.model;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.e;
import com.tencent.mm.ad.k;
import com.tencent.mm.ad.n;
import com.tencent.mm.y.at;

public final class w
  implements e
{
  public w()
  {
    GMTrace.i(12594454724608L, 93836);
    at.wS().a(1223, this);
    GMTrace.o(12594454724608L, 93836);
  }
  
  public static void b(String paramString1, int paramInt1, int paramInt2, String paramString2, String paramString3)
  {
    GMTrace.i(12594723160064L, 93838);
    com.tencent.mm.sdk.platformtools.w.i("MicroMsg.GameMsgReportService", "appId = %s, opType = %d, opStatus = %d, extInfo = %s", new Object[] { paramString1, Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString3 });
    paramString1 = new av(paramString1, paramInt1, paramInt2, paramString2, paramString3);
    at.wS().a(paramString1, 0);
    GMTrace.o(12594723160064L, 93838);
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(12594588942336L, 93837);
    GMTrace.o(12594588942336L, 93837);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\game\model\w.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */