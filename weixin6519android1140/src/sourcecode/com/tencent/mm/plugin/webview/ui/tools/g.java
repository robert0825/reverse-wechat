package com.tencent.mm.plugin.webview.ui.tools;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.modelsns.d;
import com.tencent.mm.plugin.webview.model.aj;
import com.tencent.mm.sdk.platformtools.aa;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;

public final class g
{
  public static g rKp;
  private String eDA;
  boolean gpJ;
  private int networkType;
  String pCq;
  String rKq;
  
  static
  {
    GMTrace.i(12123216281600L, 90325);
    rKp = new g();
    GMTrace.o(12123216281600L, 90325);
  }
  
  private g()
  {
    GMTrace.i(12122545192960L, 90320);
    this.gpJ = false;
    GMTrace.o(12122545192960L, 90320);
  }
  
  final void c(int paramInt1, String paramString, int paramInt2)
  {
    GMTrace.i(12123082063872L, 90324);
    d locald = new d();
    locald.q("20adInfo", this.pCq + ",");
    locald.q("21optype", paramInt1 + ",");
    locald.q("22sessionId", this.eDA + ",");
    locald.q("23currURL", this.rKq + ",");
    locald.q("24referURL", paramString + ",");
    locald.q("25errCode", paramInt2 + ",");
    locald.q("26networkType", this.networkType + ",");
    locald.q("27timeStamp", bg.Pv() + ",");
    w.i("MicroMsg.WebViewReportUtil", "report logbuffer adPageOp(13791): optype:%d, sessionId:%s, currUrl:%s, referUrl:%s, errCode:%d, networkType:%d", new Object[] { Integer.valueOf(paramInt1), this.eDA, this.rKq, paramString, Integer.valueOf(paramInt2), Integer.valueOf(this.networkType) });
    com.tencent.mm.plugin.report.service.g.ork.i(13791, new Object[] { locald });
    GMTrace.o(12123082063872L, 90324);
  }
  
  public final void close()
  {
    GMTrace.i(12122813628416L, 90322);
    w.v("MicroMsg.WebViewReportUtil", "close traceid %s", new Object[] { this.pCq });
    this.gpJ = true;
    if (bg.nm(this.pCq))
    {
      GMTrace.o(12122813628416L, 90322);
      return;
    }
    nU(4);
    this.pCq = null;
    GMTrace.o(12122813628416L, 90322);
  }
  
  public final void el(String paramString1, String paramString2)
  {
    GMTrace.i(18067048366080L, 134610);
    w.i("MicroMsg.WebViewReportUtil", "setting traceid " + paramString1 + ",usename " + paramString2);
    this.pCq = paramString1;
    this.networkType = aj.bCs();
    this.eDA = aa.RP(paramString2 + bg.Pv());
    this.gpJ = false;
    GMTrace.o(18067048366080L, 134610);
  }
  
  final void nU(int paramInt)
  {
    GMTrace.i(12122947846144L, 90323);
    c(paramInt, "", 0);
    GMTrace.o(12122947846144L, 90323);
  }
  
  public final void xR(int paramInt)
  {
    GMTrace.i(12122679410688L, 90321);
    w.v("MicroMsg.WebViewReportUtil", "onReceivedError traceid %s", new Object[] { this.pCq });
    if (bg.nm(this.pCq))
    {
      GMTrace.o(12122679410688L, 90321);
      return;
    }
    c(3, "", paramInt);
    GMTrace.o(12122679410688L, 90321);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\webview\ui\tools\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */