package com.tencent.mm.plugin.zero;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.bz.b;
import com.tencent.mm.kernel.a;
import com.tencent.mm.kernel.h;
import com.tencent.mm.platformtools.n;
import com.tencent.mm.plugin.zero.a.f;
import com.tencent.mm.protocal.c.nk;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;

public final class c
{
  public static volatile b<f> tkz;
  private final f tkA;
  
  public c()
  {
    GMTrace.i(13623636262912L, 101504);
    if (tkz != null)
    {
      this.tkA = ((f)tkz.get());
      GMTrace.o(13623636262912L, 101504);
      return;
    }
    this.tkA = null;
    GMTrace.o(13623636262912L, 101504);
  }
  
  public final boolean a(nk paramnk, boolean paramBoolean)
  {
    GMTrace.i(13623904698368L, 101506);
    if (!h.xw().wL())
    {
      w.e("MicroMsg.SyncDoCmdDelegate", "account storage disabled, discard all commands");
      GMTrace.o(13623904698368L, 101506);
      return false;
    }
    long l = bg.Pv();
    byte[] arrayOfByte = n.a(paramnk.uej);
    w.i("MicroMsg.SyncDoCmdDelegate", "doCmd %d cmdid:%d buf:%d thr:[%d]", new Object[] { Long.valueOf(l), Integer.valueOf(paramnk.uei), Integer.valueOf(bg.br(arrayOfByte)), Long.valueOf(Thread.currentThread().getId()) });
    if (bg.bq(arrayOfByte))
    {
      w.e("MicroMsg.SyncDoCmdDelegate", "docmd: no protobuf found.");
      GMTrace.o(13623904698368L, 101506);
      return false;
    }
    try
    {
      if (this.tkA != null) {
        this.tkA.a(paramnk, arrayOfByte, paramBoolean);
      }
      w.i("MicroMsg.SyncDoCmdDelegate", "doCmd FIN %d cmdid:%d Time:%d", new Object[] { Long.valueOf(l), Integer.valueOf(paramnk.uei), Long.valueOf(bg.aH(l)) });
      GMTrace.o(13623904698368L, 101506);
      return true;
    }
    catch (Exception paramnk)
    {
      w.printErrStackTrace("MicroMsg.SyncDoCmdDelegate", paramnk, "", new Object[0]);
      GMTrace.o(13623904698368L, 101506);
    }
    return false;
  }
  
  public final void bc(Object paramObject)
  {
    GMTrace.i(13623770480640L, 101505);
    if (this.tkA != null) {
      this.tkA.bc(paramObject);
    }
    GMTrace.o(13623770480640L, 101505);
  }
  
  public final void bd(Object paramObject)
  {
    GMTrace.i(13624038916096L, 101507);
    if (this.tkA != null) {
      this.tkA.bd(paramObject);
    }
    GMTrace.o(13624038916096L, 101507);
  }
  
  public final void be(Object paramObject)
  {
    GMTrace.i(13624173133824L, 101508);
    if (this.tkA != null) {
      this.tkA.be(paramObject);
    }
    GMTrace.o(13624173133824L, 101508);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\zero\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */