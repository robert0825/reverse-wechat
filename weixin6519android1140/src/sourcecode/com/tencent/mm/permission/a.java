package com.tencent.mm.permission;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.e;
import com.tencent.mm.aw.j;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.y.at;
import com.tencent.mm.y.c;

public final class a
  implements e
{
  private static a hiy;
  private int hiz;
  private boolean mIsUpdating;
  
  public a()
  {
    GMTrace.i(3494895419392L, 26039);
    this.mIsUpdating = false;
    this.hiz = 3;
    GMTrace.o(3494895419392L, 26039);
  }
  
  private static void Kd()
  {
    GMTrace.i(3495566508032L, 26044);
    if (!at.AU())
    {
      GMTrace.o(3495566508032L, 26044);
      return;
    }
    at.AR();
    c.xh().set(327944, Long.valueOf(bg.Pv()));
    GMTrace.o(3495566508032L, 26044);
  }
  
  public static a Ph()
  {
    GMTrace.i(3495029637120L, 26040);
    if (hiy == null) {
      hiy = new a();
    }
    a locala = hiy;
    GMTrace.o(3495029637120L, 26040);
    return locala;
  }
  
  private void release()
  {
    GMTrace.i(3495298072576L, 26042);
    this.mIsUpdating = false;
    at.wS().b(159, this);
    at.wS().b(160, this);
    GMTrace.o(3495298072576L, 26042);
  }
  
  public final void Pi()
  {
    GMTrace.i(3495163854848L, 26041);
    if (!at.AU())
    {
      GMTrace.o(3495163854848L, 26041);
      return;
    }
    if (!this.mIsUpdating)
    {
      at.AR();
      if (c.isSDCardAvailable()) {}
    }
    else
    {
      w.e("MicroMsg.PermissionConfigUpdater", "not to update, isUpdating: %s", new Object[] { Boolean.valueOf(this.mIsUpdating) });
      GMTrace.o(3495163854848L, 26041);
      return;
    }
    at.AR();
    long l = ((Long)c.xh().get(327944, Long.valueOf(0L))).longValue();
    if (bg.Pv() - l < 86400000L)
    {
      GMTrace.o(3495163854848L, 26041);
      return;
    }
    release();
    this.mIsUpdating = true;
    com.tencent.mm.aw.k localk = new com.tencent.mm.aw.k(23);
    at.wS().a(localk, 0);
    at.wS().a(159, this);
    at.wS().a(160, this);
    GMTrace.o(3495163854848L, 26041);
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ad.k paramk)
  {
    GMTrace.i(3495432290304L, 26043);
    if ((!(paramk instanceof com.tencent.mm.ad.m)) || (((com.tencent.mm.ad.m)paramk).DM() != 23))
    {
      w.d("MicroMsg.PermissionConfigUpdater", "another scene");
      GMTrace.o(3495432290304L, 26043);
      return;
    }
    int i = paramk.getType();
    if (159 == i)
    {
      if ((paramInt1 == 0) && (paramInt2 == 0))
      {
        Kd();
        paramString = com.tencent.mm.aw.t.Kj().gJ(23);
        if ((paramString == null) || (paramString.length == 0))
        {
          w.i("MicroMsg.PermissionConfigUpdater", "error no pkg found.");
          release();
          GMTrace.o(3495432290304L, 26043);
          return;
        }
        paramString = paramString[0];
        w.i("MicroMsg.PermissionConfigUpdater", "permission, pkgId: %d, version: %d, status: %d, type: %d", new Object[] { Integer.valueOf(paramString.id), Integer.valueOf(paramString.version), Integer.valueOf(paramString.status), Integer.valueOf(paramString.eII) });
        if (5 != paramString.status)
        {
          release();
          GMTrace.o(3495432290304L, 26043);
          return;
        }
        paramString = new j(paramString.id, 23);
        at.wS().a(paramString, 0);
        GMTrace.o(3495432290304L, 26043);
        return;
      }
      paramInt1 = this.hiz - 1;
      this.hiz = paramInt1;
      if (paramInt1 <= 0)
      {
        if (at.AU())
        {
          at.AR();
          c.xh().set(327944, Long.valueOf(bg.Pv() - 86400000L + 3600000L));
        }
        this.hiz = 3;
      }
      release();
      GMTrace.o(3495432290304L, 26043);
      return;
    }
    if (160 == i)
    {
      if ((paramInt1 == 0) && (paramInt2 == 0)) {
        Kd();
      }
      release();
    }
    GMTrace.o(3495432290304L, 26043);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\permission\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */