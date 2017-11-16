package com.tencent.mm.ui.chatting.b;

import android.graphics.Bitmap;
import android.widget.ListView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.g;
import com.tencent.mm.ad.k;
import com.tencent.mm.ao.a;
import com.tencent.mm.ao.c.a;
import com.tencent.mm.ao.d;
import com.tencent.mm.ao.n;
import com.tencent.mm.g.a.ar;
import com.tencent.mm.g.b.ce;
import com.tencent.mm.platformtools.j.a;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.aj;
import com.tencent.mm.sdk.platformtools.aj.a;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.au;
import com.tencent.mm.ui.chatting.cv;
import com.tencent.mm.ui.chatting.gallery.f.a;
import com.tencent.mm.y.at;
import java.util.HashSet;

public final class g
  implements c.a, j.a
{
  public com.tencent.mm.sdk.b.c wIv;
  public aj wIw;
  public com.tencent.mm.ui.chatting.gallery.f wIx;
  public h wtd;
  
  public g(h paramh)
  {
    GMTrace.i(19200919732224L, 143058);
    this.wIv = new com.tencent.mm.sdk.b.c() {};
    this.wIw = new aj(new aj.a()
    {
      public final boolean pM()
      {
        GMTrace.i(19197966942208L, 143036);
        com.tencent.mm.modelcontrol.c.Gs();
        boolean bool = com.tencent.mm.modelcontrol.c.Gt();
        int i = g.this.wtd.cdm().getFirstVisiblePosition();
        int m = g.this.wtd.cdm().getHeaderViewsCount();
        int j = g.this.wtd.cdm().getLastVisiblePosition();
        int k = g.this.wtd.cdm().getHeaderViewsCount();
        i = Math.max(i - m, 0);
        j = Math.max(Math.min(j - k, g.this.wtd.cdn().getCount()), 0);
        w.d("MicroMsg.ChattingUI.GetImageImp", "first: " + i + " last: " + j);
        if (j < i)
        {
          w.d("MicroMsg.ChattingUI.GetImageImp", "start timer to wait listview refresh");
          g.this.wIw.z(1000L, 1000L);
          GMTrace.o(19197966942208L, 143036);
          return false;
        }
        n.Ja().gGI = true;
        while (i <= j)
        {
          au localau = (au)g.this.wtd.cdn().getItem(i);
          if ((localau != null) && (localau.field_isSend == 0) && (localau.bTC()))
          {
            d locald = n.IZ().ap(localau.field_msgSvrId);
            if ((!locald.IH()) && (localau.fwF != 2)) {
              if (localau.fwF != 1)
              {
                if (bool)
                {
                  com.tencent.mm.modelcontrol.c.Gs();
                  if (!com.tencent.mm.modelcontrol.c.l(localau)) {}
                }
              }
              else
              {
                com.tencent.mm.modelcdntran.g.Gk().gzL.add("image_" + localau.field_msgId);
                n.Ja().a(locald.gGR, localau.field_msgId, 0, Integer.valueOf(i), R.g.aVi, g.this);
              }
            }
          }
          i += 1;
        }
        n.Ja().ID();
        GMTrace.o(19197966942208L, 143036);
        return false;
      }
    }, false);
    this.wIx = f.a.wMd;
    this.wtd = paramh;
    GMTrace.o(19200919732224L, 143058);
  }
  
  public final void a(long paramLong1, long paramLong2, int paramInt1, int paramInt2, Object paramObject)
  {
    GMTrace.i(19201590820864L, 143063);
    GMTrace.o(19201590820864L, 143063);
  }
  
  public final void a(long paramLong1, long paramLong2, int paramInt1, int paramInt2, Object paramObject, int paramInt3, int paramInt4, k paramk)
  {
    GMTrace.i(19201322385408L, 143061);
    GMTrace.o(19201322385408L, 143061);
  }
  
  public final void a(long paramLong1, long paramLong2, int paramInt1, int paramInt2, Object paramObject, int paramInt3, int paramInt4, String paramString, k paramk)
  {
    GMTrace.i(19201456603136L, 143062);
    com.tencent.mm.modelcontrol.c.Gs();
    if (!com.tencent.mm.modelcontrol.c.Gt()) {
      n.Ja().a(this);
    }
    if ((paramInt3 == 0) && (paramInt4 == 0)) {}
    for (boolean bool = true;; bool = false)
    {
      n.Jb();
      a.a(paramLong1, paramLong2, bool);
      at.AR();
      paramObject = com.tencent.mm.y.c.yM().cM(paramLong2);
      this.wtd.cdn().a(paramLong2, (au)paramObject, bool);
      GMTrace.o(19201456603136L, 143062);
      return;
    }
  }
  
  public final void ceA()
  {
    GMTrace.i(19201053949952L, 143059);
    this.wIw.stopTimer();
    this.wIw.z(1000L, 1000L);
    GMTrace.o(19201053949952L, 143059);
  }
  
  public final void k(String paramString, Bitmap paramBitmap)
  {
    GMTrace.i(19201725038592L, 143064);
    if ((bg.nm(paramString)) || (this.wtd.cdm() == null) || (paramBitmap == null))
    {
      GMTrace.o(19201725038592L, 143064);
      return;
    }
    this.wtd.cdh().post(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(19202530344960L, 143070);
        g.this.wtd.bZV();
        GMTrace.o(19202530344960L, 143070);
      }
    });
    GMTrace.o(19201725038592L, 143064);
  }
  
  public final void stopTimer()
  {
    GMTrace.i(20356937023488L, 151671);
    if (at.AU()) {
      n.Ja().a(this);
    }
    this.wIw.stopTimer();
    GMTrace.o(20356937023488L, 151671);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\chatting\b\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */