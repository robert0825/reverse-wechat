package com.tencent.mm.plugin.translate.a;

import android.util.SparseArray;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.e;
import com.tencent.mm.ad.k;
import com.tencent.mm.sdk.platformtools.aj;
import com.tencent.mm.sdk.platformtools.aj.a;
import com.tencent.mm.sdk.platformtools.w;
import java.util.LinkedList;

public final class d
  implements e
{
  public int index;
  public SparseArray<c.c> qBs;
  public boolean qBt;
  public b qBu;
  public a qBv;
  public aj qBw;
  long start;
  
  public d(int paramInt, a parama)
  {
    GMTrace.i(7272453373952L, 54184);
    this.qBs = null;
    this.qBt = false;
    this.qBw = new aj(new aj.a()
    {
      public final boolean pM()
      {
        GMTrace.i(7270574325760L, 54170);
        if (d.this.qBt)
        {
          w.e("MicroMsg.WorkingTranslate", "this work is time out, index: %s", new Object[] { Integer.valueOf(d.this.index) });
          d.this.bsY();
          d.this.qBv.a(-1, d.this.qBs, null);
        }
        GMTrace.o(7270574325760L, 54170);
        return false;
      }
    }, false);
    this.index = paramInt;
    this.qBv = parama;
    GMTrace.o(7272453373952L, 54184);
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(7272721809408L, 54186);
    if (this.qBu != paramk)
    {
      w.e("MicroMsg.WorkingTranslate", "not my translate work");
      GMTrace.o(7272721809408L, 54186);
      return;
    }
    this.qBw.stopTimer();
    w.d("MicroMsg.WorkingTranslate", "translate take time : %s", new Object[] { Long.valueOf(System.currentTimeMillis() - this.start) });
    if (((b)paramk).qBk != null) {}
    for (int i = ((b)paramk).qBk.size();; i = 0)
    {
      w.d("MicroMsg.WorkingTranslate", "errType : %s, errCode : %s, errMsg : %s, translatedMsg.size() : %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString, Integer.valueOf(i) });
      bsY();
      this.qBv.a(paramInt2, this.qBs, ((b)paramk).qBk);
      GMTrace.o(7272721809408L, 54186);
      return;
    }
  }
  
  public final void bsY()
  {
    GMTrace.i(7272587591680L, 54185);
    this.qBu = null;
    this.qBt = false;
    GMTrace.o(7272587591680L, 54185);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\translate\a\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */