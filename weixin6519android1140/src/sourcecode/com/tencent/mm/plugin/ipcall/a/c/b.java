package com.tencent.mm.plugin.ipcall.a.c;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.w;

public final class b
{
  public String countryCode;
  public String htr;
  public long mir;
  public int mjF;
  public long mjG;
  public int mjI;
  public int mkV;
  public int mkW;
  public int mkX;
  public int mkY;
  public int mkZ;
  public long mla;
  public long mlb;
  public int mlc;
  public long mld;
  public int mle;
  public long mlf;
  public int mlg;
  public String mlh;
  public long mli;
  public long mlj;
  public long mlk;
  public long mll;
  public String mlm;
  public String mln;
  public String mlo;
  public long mlp;
  public long mlq;
  public long mlr;
  public int mls;
  public int mlt;
  public int mlu;
  public int mlv;
  
  public b()
  {
    GMTrace.i(11570641895424L, 86208);
    this.mkV = 0;
    this.mkW = 0;
    this.mkX = 0;
    this.mkY = 0;
    this.mkZ = 0;
    this.mla = 0L;
    this.mlb = 0L;
    this.mlc = 0;
    this.mld = 0L;
    this.mle = 0;
    this.mjI = 0;
    this.mjF = 0;
    this.mjG = 0L;
    this.mlf = 0L;
    this.htr = "";
    this.mlg = 0;
    this.mlh = "";
    this.mli = 0L;
    this.mlj = 0L;
    this.mir = 0L;
    this.mlk = 0L;
    this.mll = 0L;
    this.mlm = "";
    this.mln = "";
    this.mlo = "";
    this.mlp = 0L;
    this.mlq = 0L;
    this.countryCode = "";
    this.mlr = 0L;
    this.mls = 0;
    this.mlt = 0;
    this.mlu = 0;
    this.mlv = 0;
    GMTrace.o(11570641895424L, 86208);
  }
  
  public final void aIM()
  {
    GMTrace.i(11570776113152L, 86209);
    w.i("MicroMsg.IPCallReportHelper", "selfShutdown");
    this.mkZ = 1;
    GMTrace.o(11570776113152L, 86209);
  }
  
  public final void aIN()
  {
    GMTrace.i(11570910330880L, 86210);
    w.i("MicroMsg.IPCallReportHelper", "selfCancel");
    this.mkY = 1;
    if ((this.mlr == 0L) && (this.mli != 0L))
    {
      this.mlr = (System.currentTimeMillis() - this.mli);
      w.d("MicroMsg.IPCallReportHelper", "cancelTime: %d", new Object[] { Long.valueOf(this.mlr) });
    }
    GMTrace.o(11570910330880L, 86210);
  }
  
  public final void aIO()
  {
    GMTrace.i(11571044548608L, 86211);
    w.i("MicroMsg.IPCallReportHelper", "channelConnect");
    this.mlc = 1;
    GMTrace.o(11571044548608L, 86211);
  }
  
  public final void aIP()
  {
    GMTrace.i(11571178766336L, 86212);
    if (this.mlu == 0) {
      this.mlu = 1;
    }
    GMTrace.o(11571178766336L, 86212);
  }
  
  public final void aIQ()
  {
    GMTrace.i(11571312984064L, 86213);
    w.d("MicroMsg.IPCallReportHelper", "markConnect");
    if (this.mlp == 0L)
    {
      this.mlp = System.currentTimeMillis();
      this.mlq = (this.mlp - this.mli);
      w.d("MicroMsg.IPCallReportHelper", "connectTime: %d", new Object[] { Long.valueOf(this.mlq) });
    }
    GMTrace.o(11571312984064L, 86213);
  }
  
  public final void aIR()
  {
    GMTrace.i(11571447201792L, 86214);
    w.d("MicroMsg.IPCallReportHelper", "markStartTalk");
    if (this.mlk == 0L) {
      this.mlk = System.currentTimeMillis();
    }
    GMTrace.o(11571447201792L, 86214);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\ipcall\a\c\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */