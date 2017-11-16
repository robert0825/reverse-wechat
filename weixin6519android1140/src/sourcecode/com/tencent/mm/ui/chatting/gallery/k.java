package com.tencent.mm.ui.chatting.gallery;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ao.c.a;
import com.tencent.mm.g.b.ce;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.au;
import com.tencent.mm.y.at;
import java.util.HashSet;

public final class k
  implements c.a
{
  private static k wOb;
  HashSet<Long> wOc;
  c.a wOd;
  
  private k()
  {
    GMTrace.i(2436051763200L, 18150);
    this.wOc = new HashSet();
    GMTrace.o(2436051763200L, 18150);
  }
  
  public static k cfV()
  {
    GMTrace.i(2436185980928L, 18151);
    if (wOb == null) {
      wOb = new k();
    }
    k localk = wOb;
    GMTrace.o(2436185980928L, 18151);
    return localk;
  }
  
  public final void a(long paramLong1, long paramLong2, int paramInt1, int paramInt2, Object paramObject)
  {
    GMTrace.i(2436722851840L, 18155);
    if (this.wOd != null) {
      this.wOd.a(paramLong1, paramLong2, paramInt1, paramInt2, paramObject);
    }
    this.wOc.remove(Long.valueOf(paramLong2));
    GMTrace.o(2436722851840L, 18155);
  }
  
  public final void a(long paramLong1, long paramLong2, int paramInt1, int paramInt2, Object paramObject, int paramInt3, int paramInt4, com.tencent.mm.ad.k paramk)
  {
    GMTrace.i(2436454416384L, 18153);
    if (this.wOd != null) {
      this.wOd.a(paramLong1, paramLong2, paramInt1, paramInt2, paramObject, paramInt3, paramInt4, paramk);
    }
    GMTrace.o(2436454416384L, 18153);
  }
  
  public final void a(long paramLong1, long paramLong2, int paramInt1, int paramInt2, Object paramObject, int paramInt3, int paramInt4, String paramString, com.tencent.mm.ad.k paramk)
  {
    GMTrace.i(2436588634112L, 18154);
    if (this.wOd != null) {
      this.wOd.a(paramLong1, paramLong2, paramInt1, paramInt2, paramObject, paramInt3, paramInt4, paramString, paramk);
    }
    for (;;)
    {
      this.wOc.remove(Long.valueOf(paramLong2));
      GMTrace.o(2436588634112L, 18154);
      return;
      at.AR();
      paramObject = com.tencent.mm.y.c.yM().cM(paramLong2);
      w.i("MicroMsg.ImageHDDownloadAndSaveMgr", "[oreh download_and_save] hdImg end at background, msgLocalId:%d", new Object[] { Long.valueOf(((ce)paramObject).field_msgId) });
      b.b(ab.getContext(), (au)paramObject, false);
    }
  }
  
  public final boolean fk(long paramLong)
  {
    GMTrace.i(2436320198656L, 18152);
    boolean bool = this.wOc.contains(Long.valueOf(paramLong));
    GMTrace.o(2436320198656L, 18152);
    return bool;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\chatting\gallery\k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */