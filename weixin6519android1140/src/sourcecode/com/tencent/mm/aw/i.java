package com.tencent.mm.aw;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.kernel.b;
import com.tencent.mm.kernel.h;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;

public final class i
  implements com.tencent.mm.ad.e
{
  public i()
  {
    GMTrace.i(12943420817408L, 96436);
    h.xx().fYr.a(159, this);
    h.xx().fYr.a(160, this);
    k localk = new k(5);
    h.xx().fYr.a(localk, 0);
    GMTrace.o(12943420817408L, 96436);
  }
  
  private static void Kd()
  {
    GMTrace.i(12943823470592L, 96439);
    h.xy().xh().set(81939, Long.valueOf(bg.Pv()));
    GMTrace.o(12943823470592L, 96439);
  }
  
  private void release()
  {
    GMTrace.i(12943555035136L, 96437);
    h.xx().fYr.b(159, this);
    h.xx().fYr.b(160, this);
    GMTrace.o(12943555035136L, 96437);
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ad.k paramk)
  {
    GMTrace.i(12943689252864L, 96438);
    if ((!(paramk instanceof com.tencent.mm.ad.m)) || (((com.tencent.mm.ad.m)paramk).DM() != 5))
    {
      w.d("MicroMsg.LangPackageUpdater", "another scene");
      GMTrace.o(12943689252864L, 96438);
      return;
    }
    int i = paramk.getType();
    if (i == 159)
    {
      if ((paramInt1 == 0) && (paramInt2 == 0))
      {
        Kd();
        paramString = t.Kj().gJ(5);
        if ((paramString == null) || (paramString.length == 0))
        {
          w.i("MicroMsg.LangPackageUpdater", "error no pkg found.");
          release();
          GMTrace.o(12943689252864L, 96438);
          return;
        }
        paramString = paramString[0];
        w.i("MicroMsg.LangPackageUpdater", "dkregcode Pkg id:" + paramString.id + " version:" + paramString.version + " status:" + paramString.status + " type:" + paramString.eII);
        if (5 != paramString.status)
        {
          release();
          GMTrace.o(12943689252864L, 96438);
          return;
        }
        paramString = new j(paramString.id, 5);
        h.xx().fYr.a(paramString, 0);
        GMTrace.o(12943689252864L, 96438);
        return;
      }
      release();
      GMTrace.o(12943689252864L, 96438);
      return;
    }
    if (i == 160)
    {
      if ((paramInt1 == 0) && (paramInt2 == 0)) {
        Kd();
      }
      release();
    }
    GMTrace.o(12943689252864L, 96438);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\aw\i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */