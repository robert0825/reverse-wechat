package com.tencent.mm.plugin.collect.reward.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.kernel.h;
import com.tencent.mm.network.q;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.protocal.c.kx;
import com.tencent.mm.protocal.c.ky;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import com.tencent.mm.storage.w.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class f
  extends a
{
  private final String TAG;
  private b fUa;
  private com.tencent.mm.ad.e fUd;
  public ky jXe;
  
  public f(LinkedList<Integer> paramLinkedList, String paramString, boolean paramBoolean1, boolean paramBoolean2)
  {
    GMTrace.i(19351780458496L, 144182);
    this.TAG = "MicroMsg.NetSceneQrRewardSetCode";
    Object localObject = new b.a();
    ((b.a)localObject).gtF = new kx();
    ((b.a)localObject).gtG = new ky();
    ((b.a)localObject).gtE = 1562;
    ((b.a)localObject).uri = "/cgi-bin/mmpay-bin/setrewardqrcode";
    ((b.a)localObject).gtH = 0;
    ((b.a)localObject).gtI = 0;
    this.fUa = ((b.a)localObject).DA();
    localObject = (kx)this.fUa.gtC.gtK;
    ((kx)localObject).ubb = paramLinkedList;
    ((kx)localObject).desc = paramString;
    ((kx)localObject).ubA = paramBoolean1;
    ((kx)localObject).ubB = paramBoolean2;
    w.i("MicroMsg.NetSceneQrRewardSetCode", "desc: %s, flag: %s, default: %s", new Object[] { paramString, Boolean.valueOf(paramBoolean1), Boolean.valueOf(paramBoolean2) });
    GMTrace.o(19351780458496L, 144182);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(19352048893952L, 144184);
    this.fUd = parame1;
    int i = a(parame, this.fUa, this);
    GMTrace.o(19352048893952L, 144184);
    return i;
  }
  
  public final void b(int paramInt1, int paramInt2, String paramString, q paramq)
  {
    GMTrace.i(19352183111680L, 144185);
    w.i("MicroMsg.NetSceneQrRewardSetCode", "errType: %s, errCode: %s, errMsg: %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
    this.jXe = ((ky)((b)paramq).gtD.gtK);
    w.i("MicroMsg.NetSceneQrRewardSetCode", "retcode: %s, retmsg: %s", new Object[] { Integer.valueOf(this.jXe.jWs), this.jXe.jWt });
    if ((!this.jWW) && (this.jXe.jWs != 0)) {
      this.jWX = true;
    }
    if ((!this.jWW) && (!this.jWX))
    {
      h.xy().xh().a(w.a.vzz, Integer.valueOf(this.jXe.ube));
      h.xy().xh().a(w.a.vzA, Integer.valueOf(this.jXe.uba));
      h.xy().xh().a(w.a.vzC, this.jXe.desc);
      h.xy().xh().a(w.a.vzI, this.jXe.uaY);
      paramq = new ArrayList();
      Iterator localIterator = this.jXe.ubb.iterator();
      while (localIterator.hasNext()) {
        paramq.add(String.valueOf(((Integer)localIterator.next()).intValue()));
      }
      h.xy().xh().a(w.a.vzF, bg.c(paramq, ","));
      g.ork.a(724L, 5L, 1L, false);
    }
    for (;;)
    {
      if (this.fUd != null) {
        this.fUd.a(paramInt1, paramInt2, paramString, this);
      }
      GMTrace.o(19352183111680L, 144185);
      return;
      if (this.jWW) {
        g.ork.a(724L, 7L, 1L, false);
      } else {
        g.ork.a(724L, 6L, 1L, false);
      }
    }
  }
  
  public final int getType()
  {
    GMTrace.i(19351914676224L, 144183);
    GMTrace.o(19351914676224L, 144183);
    return 1562;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\collect\reward\a\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */