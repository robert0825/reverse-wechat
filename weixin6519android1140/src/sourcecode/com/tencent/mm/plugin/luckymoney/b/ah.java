package com.tencent.mm.plugin.luckymoney.b;

import android.net.Uri;
import android.os.Looper;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.k;
import com.tencent.mm.g.a.tc;
import com.tencent.mm.g.a.tc.a;
import com.tencent.mm.g.a.tc.b;
import com.tencent.mm.g.b.ce;
import com.tencent.mm.kernel.b;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.au;
import com.tencent.mm.x.f.a;
import com.tencent.mm.y.q;
import com.tencent.mm.y.s;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class ah
  implements com.tencent.mm.ad.e
{
  boolean mJY;
  public ae mJZ;
  public ab mKa;
  private u mKb;
  public com.tencent.mm.sdk.b.c mKc;
  
  public ah()
  {
    GMTrace.i(9743938617344L, 72598);
    this.mKc = new com.tencent.mm.sdk.b.c()
    {
      private boolean a(tc paramAnonymoustc)
      {
        GMTrace.i(9735214465024L, 72533);
        if ((paramAnonymoustc instanceof tc)) {
          switch (paramAnonymoustc.eYy.action)
          {
          }
        }
        label275:
        for (;;)
        {
          GMTrace.o(9735214465024L, 72533);
          return false;
          ah localah = ah.this;
          long l = paramAnonymoustc.eYy.eCL;
          if (!localah.mJY)
          {
            localah.mJY = true;
            au localau = ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).aOf().cM(l);
            paramAnonymoustc = localau.field_content;
            if (paramAnonymoustc != null) {}
            for (paramAnonymoustc = f.a.C(paramAnonymoustc, localau.field_reserved);; paramAnonymoustc = null)
            {
              if (paramAnonymoustc == null) {
                break label275;
              }
              paramAnonymoustc = bg.nl(paramAnonymoustc.gkb);
              Uri localUri = Uri.parse(paramAnonymoustc);
              String str = localUri.getQueryParameter("sendid");
              int i = bg.getInt(localUri.getQueryParameter("channelid"), 1);
              if (localah.mJZ != null)
              {
                com.tencent.mm.kernel.h.xz();
                com.tencent.mm.kernel.h.xx().fYr.c(localah.mJZ);
                localah.mJZ = null;
              }
              com.tencent.mm.kernel.h.xz();
              com.tencent.mm.kernel.h.xx().fYr.a(1581, localah);
              localah.mJZ = new ae(i, str, paramAnonymoustc, 3, "v1.0");
              localah.mJZ.eDs = localau.field_talker;
              localah.mJZ.eDr = l;
              com.tencent.mm.kernel.h.xz();
              com.tencent.mm.kernel.h.xx().fYr.a(localah.mJZ, 0);
              break;
            }
          }
        }
      }
    };
    a.vgX.b(this.mKc);
    GMTrace.o(9743938617344L, 72598);
  }
  
  private static void a(e parame, long paramLong, String paramString)
  {
    GMTrace.i(9744341270528L, 72601);
    tc localtc = new tc();
    localtc.eYy.action = 2;
    localtc.eYz.eCL = paramLong;
    localtc.eYz.eYB = parame.eYB;
    localtc.eYz.eYC = parame.mIr;
    localtc.eYz.eYD = new ArrayList();
    if (s.eb(paramString))
    {
      parame = parame.mIz.iterator();
      while (parame.hasNext())
      {
        paramString = (m)parame.next();
        paramString = com.tencent.mm.ac.n.Dv().hV(paramString.mIX) + "=" + paramString.mIW + "=" + paramString.mIJ;
        localtc.eYz.eYD.add(paramString);
      }
    }
    a.vgX.a(localtc, Looper.getMainLooper());
    GMTrace.o(9744341270528L, 72601);
  }
  
  private static void cK(long paramLong)
  {
    GMTrace.i(9744207052800L, 72600);
    tc localtc = new tc();
    localtc.eYy.action = 2;
    localtc.eYz.eCL = paramLong;
    localtc.eYz.eYB = 0L;
    localtc.eYz.eYC = "";
    a.vgX.a(localtc, Looper.getMainLooper());
    GMTrace.o(9744207052800L, 72600);
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(9744072835072L, 72599);
    com.tencent.mm.kernel.h.xz();
    com.tencent.mm.kernel.h.xx().fYr.b(1581, this);
    com.tencent.mm.kernel.h.xz();
    com.tencent.mm.kernel.h.xx().fYr.b(1685, this);
    com.tencent.mm.kernel.h.xz();
    com.tencent.mm.kernel.h.xx().fYr.b(1585, this);
    if ((paramk instanceof ae))
    {
      paramString = (ae)paramk;
      if ((paramInt1 != 0) || (paramInt2 != 0))
      {
        this.mJY = false;
        cK(paramString.eDr);
        GMTrace.o(9744072835072L, 72599);
        return;
      }
      if (paramString.eYn == 4)
      {
        if (this.mKb != null)
        {
          com.tencent.mm.kernel.h.xz();
          com.tencent.mm.kernel.h.xx().fYr.c(this.mKb);
          this.mKb = null;
        }
        com.tencent.mm.kernel.h.xz();
        com.tencent.mm.kernel.h.xx().fYr.a(1585, this);
        this.mKb = new u(paramString.mFr, 11, 0, paramString.eYm, "v1.0");
        this.mKb.eDs = paramString.eDs;
        this.mKb.eDr = paramString.eDr;
        com.tencent.mm.kernel.h.xz();
        com.tencent.mm.kernel.h.xx().fYr.a(this.mKb, 0);
        w.i("MicroMsg.Wear.WearLuckyLogic", "start to get detail");
        GMTrace.o(9744072835072L, 72599);
        return;
      }
      if ((paramString.eYo != 1) && (paramString.eYn != 5) && (paramString.eYn != 1))
      {
        if (this.mKa != null)
        {
          com.tencent.mm.kernel.h.xz();
          com.tencent.mm.kernel.h.xx().fYr.c(this.mKa);
          this.mKa = null;
        }
        com.tencent.mm.kernel.h.xz();
        com.tencent.mm.kernel.h.xx().fYr.a(1685, this);
        this.mKa = new ab(paramString.msgType, paramString.eqV, paramString.mFr, paramString.eYm, n.aMg(), q.zG(), paramString.eDs, "v1.0", paramString.mJV);
        this.mKa.eDr = paramString.eDr;
        com.tencent.mm.kernel.h.xz();
        com.tencent.mm.kernel.h.xx().fYr.a(this.mKa, 0);
        w.i("MicroMsg.Wear.WearLuckyLogic", "start to open lucky");
        GMTrace.o(9744072835072L, 72599);
        return;
      }
      this.mJY = false;
      w.i("MicroMsg.Wear.WearLuckyLogic", "receive lucky already");
      cK(paramString.eDr);
      GMTrace.o(9744072835072L, 72599);
      return;
    }
    if ((paramk instanceof ab))
    {
      this.mJY = false;
      paramString = (ab)paramk;
      if ((paramInt1 != 0) || (paramInt2 != 0))
      {
        cK(paramString.eDr);
        GMTrace.o(9744072835072L, 72599);
        return;
      }
      paramk = paramString.mJj;
      if (paramk.eYo == 2)
      {
        a(paramk, paramString.eDr, paramString.eDs);
        GMTrace.o(9744072835072L, 72599);
        return;
      }
      cK(paramString.eDr);
      GMTrace.o(9744072835072L, 72599);
      return;
    }
    if ((paramk instanceof u))
    {
      this.mJY = false;
      paramString = (u)paramk;
      if ((paramInt1 != 0) || (paramInt2 != 0))
      {
        cK(paramString.eDr);
        GMTrace.o(9744072835072L, 72599);
        return;
      }
      a(paramString.mJj, paramString.eDr, paramString.eDs);
    }
    GMTrace.o(9744072835072L, 72599);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\luckymoney\b\ah.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */