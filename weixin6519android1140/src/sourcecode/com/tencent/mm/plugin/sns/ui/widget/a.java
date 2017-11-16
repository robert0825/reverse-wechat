package com.tencent.mm.plugin.sns.ui.widget;

import android.content.Context;
import android.content.res.Resources;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.kiss.widget.textview.a.b;
import com.tencent.mm.plugin.sns.i.c;
import com.tencent.mm.sdk.platformtools.ab;

public final class a
{
  private static a qoF;
  private com.tencent.mm.kiss.widget.textview.a.a qoD;
  public int qoE;
  
  static
  {
    GMTrace.i(8329954852864L, 62063);
    qoF = new a();
    GMTrace.o(8329954852864L, 62063);
  }
  
  public a()
  {
    GMTrace.i(8329552199680L, 62060);
    this.qoD = null;
    this.qoE = 0;
    GMTrace.o(8329552199680L, 62060);
  }
  
  public static a bqp()
  {
    GMTrace.i(8329686417408L, 62061);
    a locala = qoF;
    GMTrace.o(8329686417408L, 62061);
    return locala;
  }
  
  public final com.tencent.mm.kiss.widget.textview.a.a bqq()
  {
    GMTrace.i(8329820635136L, 62062);
    int i = com.tencent.mm.br.a.fromDPToPix(ab.getContext(), (int)(14.0F * com.tencent.mm.br.a.dZ(ab.getContext())));
    if ((this.qoD == null) || ((int)this.qoD.gbV != i)) {
      this.qoD = b.xW().K(i).fk(ab.getContext().getResources().getColor(i.c.oXc)).fj(16).gbE;
    }
    com.tencent.mm.kiss.widget.textview.a.a locala = this.qoD;
    GMTrace.o(8329820635136L, 62062);
    return locala;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\sns\ui\widget\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */