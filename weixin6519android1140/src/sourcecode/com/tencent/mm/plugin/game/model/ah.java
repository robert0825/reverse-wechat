package com.tencent.mm.plugin.game.model;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.e;
import com.tencent.mm.ad.n;
import com.tencent.mm.pluginsdk.model.app.al;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.y.at;
import java.util.ArrayList;

public final class ah
  implements e
{
  ArrayList<a> lOs;
  private boolean lOt;
  
  public ah()
  {
    GMTrace.i(12592575676416L, 93822);
    this.lOt = false;
    at.wS().a(427, this);
    this.lOs = new ArrayList();
    GMTrace.o(12592575676416L, 93822);
  }
  
  private void aFX()
  {
    GMTrace.i(12592844111872L, 93824);
    do
    {
      if (this.lOt)
      {
        w.i("MicroMsg.AppReportService", "is doing scene, wait for a minite");
        GMTrace.o(12592844111872L, 93824);
        return;
      }
      if ((this.lOs == null) || (this.lOs.size() == 0))
      {
        w.d("MicroMsg.AppReportService", "report queue is null, no need do scnene");
        GMTrace.o(12592844111872L, 93824);
        return;
      }
      localObject = (a)this.lOs.remove(0);
    } while (localObject == null);
    this.lOt = true;
    Object localObject = new al(((a)localObject).gXq, ((a)localObject).lOu);
    at.wS().a((com.tencent.mm.ad.k)localObject, 0);
    GMTrace.o(12592844111872L, 93824);
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ad.k paramk)
  {
    GMTrace.i(12592978329600L, 93825);
    this.lOt = false;
    aFX();
    GMTrace.o(12592978329600L, 93825);
  }
  
  public final void a(a parama)
  {
    GMTrace.i(12592709894144L, 93823);
    if (!this.lOs.contains(parama)) {
      this.lOs.add(parama);
    }
    aFX();
    GMTrace.o(12592709894144L, 93823);
  }
  
  public static final class a
  {
    public int gXq;
    public String lOu;
    
    public a()
    {
      GMTrace.i(12584388395008L, 93761);
      GMTrace.o(12584388395008L, 93761);
    }
    
    public static a h(int paramInt, Object... paramVarArgs)
    {
      GMTrace.i(12584522612736L, 93762);
      a locala = new a();
      locala.gXq = paramInt;
      StringBuilder localStringBuilder = new StringBuilder();
      int j = paramVarArgs.length - 1;
      int i = 0;
      while (i < j)
      {
        localStringBuilder.append(String.valueOf(paramVarArgs[i])).append(',');
        i += 1;
      }
      localStringBuilder.append(String.valueOf(paramVarArgs[j]));
      locala.lOu = localStringBuilder.toString();
      if (k.eJE > 0) {
        w.i("MicroMsg.AppReportService", "appStat logID=%d, vals.size=%d, val = %s", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(paramVarArgs.length), localStringBuilder.toString() });
      }
      for (;;)
      {
        GMTrace.o(12584522612736L, 93762);
        return locala;
        w.d("MicroMsg.AppReportService", "appStat logID=%d, vals.size=%d, val = %s", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(paramVarArgs.length), localStringBuilder.toString() });
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\game\model\ah.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */