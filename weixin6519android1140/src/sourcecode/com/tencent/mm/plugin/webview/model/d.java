package com.tencent.mm.plugin.webview.model;

import android.content.ContentValues;
import android.os.HandlerThread;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.bu.g;
import com.tencent.mm.g.b.by;
import com.tencent.mm.sdk.e.c.a;
import com.tencent.mm.sdk.e.i;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.at.b;
import com.tencent.mm.sdk.platformtools.at.c;

public final class d
  implements at.c<Integer, Long>
{
  public static final String[] fTX;
  private static final c.a hIP;
  public final g goN;
  public final com.tencent.mm.sdk.platformtools.at<Integer, Long> rDZ;
  private long rEa;
  
  static
  {
    GMTrace.i(11995441004544L, 89373);
    hIP = by.qM();
    fTX = new String[] { i.a(hIP, "JsLogBlockList") };
    GMTrace.o(11995441004544L, 89373);
  }
  
  public d(g paramg)
  {
    GMTrace.i(11994769915904L, 89368);
    this.goN = paramg;
    this.rDZ = new com.tencent.mm.sdk.platformtools.at(this, com.tencent.mm.y.at.xB().ngv.getLooper(), 100, 20, 300000L, 1000L);
    GMTrace.o(11994769915904L, 89368);
  }
  
  public final boolean Mp()
  {
    GMTrace.i(11995038351360L, 89370);
    if (this.goN.inTransaction())
    {
      GMTrace.o(11995038351360L, 89370);
      return false;
    }
    this.rEa = this.goN.cE(Thread.currentThread().getId());
    if (this.rEa > 0L)
    {
      GMTrace.o(11995038351360L, 89370);
      return true;
    }
    GMTrace.o(11995038351360L, 89370);
    return false;
  }
  
  public final void Mq()
  {
    GMTrace.i(11995306786816L, 89372);
    if (this.rEa > 0L) {
      this.goN.aL(this.rEa);
    }
    GMTrace.o(11995306786816L, 89372);
  }
  
  public final void a(com.tencent.mm.sdk.platformtools.at<Integer, Long> paramat, at.b<Integer, Long> paramb)
  {
    GMTrace.i(11995172569088L, 89371);
    switch (paramb.vkv)
    {
    }
    for (;;)
    {
      GMTrace.o(11995172569088L, 89371);
      return;
      this.goN.delete("JsLogBlockList", "logId=" + paramb.tGT, null);
      GMTrace.o(11995172569088L, 89371);
      return;
      paramat = new ContentValues(2);
      paramat.put("logId", (Integer)paramb.tGT);
      paramat.put("liftTime", (Long)paramb.values);
      this.goN.replace("JsLogBlockList", "logId", paramat);
    }
  }
  
  public final void bCc()
  {
    GMTrace.i(11994904133632L, 89369);
    this.rDZ.kI(true);
    GMTrace.o(11994904133632L, 89369);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\webview\model\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */