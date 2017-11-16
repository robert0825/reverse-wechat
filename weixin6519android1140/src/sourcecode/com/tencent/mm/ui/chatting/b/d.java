package com.tencent.mm.ui.chatting.b;

import android.annotation.SuppressLint;
import android.os.Message;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.k;
import com.tencent.mm.g.b.af;
import com.tencent.mm.k.g;
import com.tencent.mm.modelsimple.j;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.s;
import com.tencent.mm.storage.x;
import com.tencent.mm.ui.u;
import com.tencent.mm.y.at;
import com.tencent.mm.y.bf;
import com.tencent.mm.y.bf.a;
import java.util.LinkedList;
import java.util.List;

public final class d
{
  @SuppressLint({"HandlerLeak"})
  public ae handler;
  int heG;
  public boolean wCP;
  int wIn;
  public h wtd;
  
  public d(h paramh)
  {
    GMTrace.i(19076902551552L, 142134);
    this.heG = -1;
    this.wCP = false;
    this.handler = new ae()
    {
      public final void handleMessage(Message paramAnonymousMessage)
      {
        GMTrace.i(19081197518848L, 142166);
        if (d.this.wtd.cdg().isFinishing())
        {
          GMTrace.o(19081197518848L, 142166);
          return;
        }
        if (d.this.wCP)
        {
          d.this.wCP = false;
          d.this.wtd.cbI();
          d.this.wtd.bZV();
        }
        GMTrace.o(19081197518848L, 142166);
      }
    };
    this.wtd = paramh;
    GMTrace.o(19076902551552L, 142134);
  }
  
  public final void CW(int paramInt)
  {
    GMTrace.i(19077305204736L, 142137);
    int i = ((Integer)at.AP().get(35, Integer.valueOf(10))).intValue();
    Object localObject = new LinkedList();
    ((List)localObject).add(this.wtd.cci());
    if (i == -2)
    {
      if ((this.wtd.ccT()) && ((paramInt == 1) || (paramInt == 2)))
      {
        w.d("MicroMsg.DirectScendImp", "oreh old logic doDirectSend not support chatStatus:%d", new Object[] { Integer.valueOf(paramInt) });
        GMTrace.o(19077305204736L, 142137);
        return;
      }
      w.d("MicroMsg.DirectScendImp", "oreh old logic doDirectSend done chatStatus:%d", new Object[] { Integer.valueOf(paramInt) });
      localObject = new j((List)localObject, com.tencent.mm.a.n.cS(paramInt));
      at.wS().a((k)localObject, 0);
      GMTrace.o(19077305204736L, 142137);
      return;
    }
    if ((this.wtd.ccT()) || (x.Tq(this.wtd.ccY().field_username)) || (x.To(this.wtd.ccY().field_username)) || (this.wtd.ccY().bSA()))
    {
      w.d("MicroMsg.DirectScendImp", "oreh doDirectSend not support");
      GMTrace.o(19077305204736L, 142137);
      return;
    }
    long l = bg.aH(this.wtd.cdi());
    if ((i == -1) || (l > i * 1000L))
    {
      w.d("MicroMsg.DirectScendImp", "oreh doDirectSend interval too long: %d;  interval: %d", new Object[] { Long.valueOf(l / 1000L), Integer.valueOf(i) });
      GMTrace.o(19077305204736L, 142137);
      return;
    }
    w.d("MicroMsg.DirectScendImp", "oreh doDirectSend done chatStatus:%d, delt:%d", new Object[] { Integer.valueOf(paramInt), Long.valueOf(l / 1000L) });
    localObject = new j((List)localObject, com.tencent.mm.a.n.cS(paramInt));
    at.wS().a((k)localObject, 0);
    GMTrace.o(19077305204736L, 142137);
  }
  
  public final void keepSignalling()
  {
    GMTrace.i(19077036769280L, 142135);
    if (this.wIn == -2) {
      at.wS().a(new bf(new bf.a()
      {
        public final void a(com.tencent.mm.network.e paramAnonymouse)
        {
          GMTrace.i(19093679767552L, 142259);
          if (paramAnonymouse == null)
          {
            GMTrace.o(19093679767552L, 142259);
            return;
          }
          paramAnonymouse.keepSignalling();
          GMTrace.o(19093679767552L, 142259);
        }
      }), 0);
    }
    GMTrace.o(19077036769280L, 142135);
  }
  
  public final void stopSignalling()
  {
    GMTrace.i(19077170987008L, 142136);
    at.wS().a(new bf(new bf.a()
    {
      public final void a(com.tencent.mm.network.e paramAnonymouse)
      {
        GMTrace.i(19079452688384L, 142153);
        if (paramAnonymouse == null)
        {
          GMTrace.o(19079452688384L, 142153);
          return;
        }
        paramAnonymouse.stopSignalling();
        GMTrace.o(19079452688384L, 142153);
      }
    }), 0);
    GMTrace.o(19077170987008L, 142136);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\chatting\b\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */