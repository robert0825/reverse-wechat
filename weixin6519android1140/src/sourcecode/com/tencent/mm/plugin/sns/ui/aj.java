package com.tencent.mm.plugin.sns.ui;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.sns.model.ae;
import com.tencent.mm.plugin.sns.model.al.a;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;

public final class aj
{
  String kNA;
  long pWd;
  String pWe;
  int pWf;
  int position;
  long pvz;
  
  public aj()
  {
    GMTrace.i(8617046573056L, 64202);
    this.pWd = 0L;
    this.kNA = "";
    this.pWe = "";
    this.position = 0;
    this.pWf = 0;
    this.pvz = 0L;
    GMTrace.o(8617046573056L, 64202);
  }
  
  public final boolean boe()
  {
    GMTrace.i(8616912355328L, 64201);
    long l = bg.aI(this.pWd);
    w.i("MicroMsg.ResumeSnsControl", "resume time %d", new Object[] { Long.valueOf(l) });
    w.i("MicroMsg.ResumeSnsControl", "lastSnsTime %s limitSeq %s respMinSeq %s timeLastId %s position %s topy %s", new Object[] { Long.valueOf(this.pWd), this.kNA, this.pWe, Long.valueOf(this.pvz), Integer.valueOf(this.position), Integer.valueOf(this.pWf) });
    if ((l < 180000L) && (this.position > 0))
    {
      w.i("MicroMsg.ResumeSnsControl", "timeLastId is %d ", new Object[] { Long.valueOf(this.pvz) });
      if (this.pvz == 0L)
      {
        GMTrace.o(8616912355328L, 64201);
        return false;
      }
      ae.biT().w(this.pvz, -1);
      GMTrace.o(8616912355328L, 64201);
      return true;
    }
    GMTrace.o(8616912355328L, 64201);
    return false;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\sns\ui\aj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */