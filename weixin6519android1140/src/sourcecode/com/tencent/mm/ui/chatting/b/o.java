package com.tencent.mm.ui.chatting.b;

import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.ListView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.a.pc;
import com.tencent.mm.g.a.pc.a;
import com.tencent.mm.g.b.aj;
import com.tencent.mm.g.b.ce;
import com.tencent.mm.modelmulti.b;
import com.tencent.mm.modelmulti.b.a;
import com.tencent.mm.modelmulti.b.c;
import com.tencent.mm.modelmulti.q;
import com.tencent.mm.platformtools.n;
import com.tencent.mm.plugin.report.d;
import com.tencent.mm.protocal.c.bv;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.as;
import com.tencent.mm.storage.as.a;
import com.tencent.mm.storage.au;
import com.tencent.mm.ui.base.MMPullDownView;
import com.tencent.mm.ui.chatting.cv;
import com.tencent.mm.y.at;

public final class o
  implements b.c, as.a
{
  public static int wJh;
  public boolean wCF;
  public boolean wCG;
  public int wCI;
  public boolean wCJ;
  public com.tencent.mm.sdk.b.c wJi;
  public h wtd;
  
  static
  {
    GMTrace.i(19084552962048L, 142191);
    wJh = 350;
    GMTrace.o(19084552962048L, 142191);
  }
  
  public o(h paramh)
  {
    GMTrace.i(19083747655680L, 142185);
    this.wCF = false;
    this.wCG = false;
    this.wCI = -1;
    this.wCJ = true;
    this.wJi = new com.tencent.mm.sdk.b.c()
    {
      private boolean a(pc paramAnonymouspc)
      {
        GMTrace.i(19079050035200L, 142150);
        final Object localObject = paramAnonymouspc.eUc.data;
        if (localObject != null) {
          paramAnonymouspc = new bv();
        }
        for (;;)
        {
          try
          {
            paramAnonymouspc.aD((byte[])localObject);
            localObject = n.a(paramAnonymouspc.tQf);
            w.i("MicroMsg.ChattingUI.SilenceMsgImp", "summerbadcr SilenceNotifyEvent callback chatRoomId[%s], current talker[%s]", new Object[] { localObject, o.this.wtd.ccY().field_username });
            if ((!bg.nm((String)localObject)) && (((String)localObject).equals(o.this.wtd.ccY().field_username)))
            {
              final int i = paramAnonymouspc.tQe;
              final int j = paramAnonymouspc.tQg;
              at.xB().A(new Runnable()
              {
                public final void run()
                {
                  GMTrace.i(19083076567040L, 142180);
                  w.i("MicroMsg.ChattingUI.SilenceMsgImp", "summerbadcr SilenceNotifyEvent in chatting lastSeq[%d], undeliverCount[%d]", new Object[] { Integer.valueOf(i), Integer.valueOf(j) });
                  long l1 = i;
                  long l3 = i;
                  int i = j;
                  at.AR();
                  Object localObject = com.tencent.mm.y.c.yP().TO(localObject);
                  int j;
                  if ((localObject != null) && (((aj)localObject).field_lastSeq == i) && (((aj)localObject).field_UnDeliverCount > 1))
                  {
                    j = ((aj)localObject).field_UnDeliverCount;
                    long l2 = ((aj)localObject).field_firstUnDeliverSeq;
                    if (((aj)localObject).field_lastSeq - l2 >= j)
                    {
                      w.i("MicroMsg.ChattingUI.SilenceMsgImp", "summerbadcr SilenceNotifyEvent in chatting change up [%d, %d, %d, %d]", new Object[] { Long.valueOf(l2), Long.valueOf(l3), Integer.valueOf(j), Integer.valueOf(1) });
                      d.oqe.a(403L, 2L, 1L, false);
                      int k = 1;
                      i = j;
                      l1 = l2;
                      j = k;
                    }
                  }
                  for (;;)
                  {
                    o.this.wCF = false;
                    localObject = new b.a(localObject, (int)l1, (int)l3, i, j);
                    q.JG().a((b.a)localObject, o.this);
                    GMTrace.o(19083076567040L, 142180);
                    return;
                    d.oqe.a(403L, 4L, 1L, false);
                    j = 0;
                    continue;
                    d.oqe.a(403L, 4L, 1L, false);
                    j = 0;
                  }
                }
              });
            }
            GMTrace.o(19079050035200L, 142150);
            return false;
          }
          catch (Exception paramAnonymouspc)
          {
            w.printErrStackTrace("MicroMsg.ChattingUI.SilenceMsgImp", paramAnonymouspc, "summerbadcr SilenceNotifyEvent callback parse:", new Object[0]);
            GMTrace.o(19079050035200L, 142150);
            return false;
          }
          w.e("MicroMsg.ChattingUI.SilenceMsgImp", "summerbadcr silenceNotifyListener callback event data is null");
        }
      }
    };
    this.wtd = paramh;
    GMTrace.o(19083747655680L, 142185);
  }
  
  public final String Jx()
  {
    GMTrace.i(19083881873408L, 142186);
    if (this.wtd.ccU())
    {
      String str = this.wtd.ccY().field_username;
      GMTrace.o(19083881873408L, 142186);
      return str;
    }
    GMTrace.o(19083881873408L, 142186);
    return "";
  }
  
  public final boolean Jy()
  {
    GMTrace.i(19084150308864L, 142188);
    boolean bool = this.wCF;
    GMTrace.o(19084150308864L, 142188);
    return bool;
  }
  
  public final void a(final com.tencent.mm.storage.ae paramae, as paramas)
  {
    GMTrace.i(19084284526592L, 142189);
    w.i("MicroMsg.ChattingUI.SilenceMsgImp", "summerbadcr onMsgChangeNotify cvs.getUsername[%s] tid[%d]", new Object[] { paramae.field_username, Long.valueOf(Thread.currentThread().getId()) });
    int n;
    int i1;
    if ((this.wtd.ccU()) && (this.wtd.ccY().field_username.equals(paramae.field_username)))
    {
      int i = paramae.field_msgCount;
      int j = this.wtd.cdn().gQB;
      w.i("MicroMsg.ChattingUI.SilenceMsgImp", "summerbadcr onMsgChangeNotify newCvsCount[%d], total[%d], dealHistoryGetMsg[%b], UnDeliverCount[%d]", new Object[] { Integer.valueOf(i), Integer.valueOf(j), Boolean.valueOf(this.wCF), Integer.valueOf(paramae.field_UnDeliverCount) });
      if (i >= j)
      {
        if (i > j) {}
        for (paramas = paramae.vAo; (paramas == null) || (paramas.field_msgId == 0L); paramas = (au)this.wtd.cdn().getItem(0))
        {
          GMTrace.o(19084284526592L, 142189);
          return;
        }
        int k = paramas.field_flag;
        w.i("MicroMsg.ChattingUI.SilenceMsgImp", "summerbadcr onMsgChangeNotify receive get msg svrId[%d], seq[%d], flag[%d], stack[%s]", new Object[] { Long.valueOf(paramas.field_msgSvrId), Long.valueOf(paramas.field_msgSeq), Integer.valueOf(k), bg.bQW() });
        if ((k & 0x2) == 0)
        {
          GMTrace.o(19084284526592L, 142189);
          return;
        }
        if ((k & 0x4) == 0)
        {
          w.i("MicroMsg.ChattingUI.SilenceMsgImp", "summerbadcr onMsgChangeNotify down dealHistoryGetMsg: %b", new Object[] { Boolean.valueOf(this.wCF) });
          if (this.wCF)
          {
            w.i("MicroMsg.ChattingUI.SilenceMsgImp", "summerbadcr onMsgChangeNotify down but dealHistoryGetMsg so ignore");
            GMTrace.o(19084284526592L, 142189);
            return;
          }
          k = this.wtd.cdm().getFirstVisiblePosition();
          m = this.wtd.cdn().getCount();
          this.wtd.cdn().ccz();
          n = this.wtd.cdn().getCount();
          i1 = n - m;
          w.i("MicroMsg.ChattingUI.SilenceMsgImp", "summerbadcr onMsgChangeNotify down talker[%s],firstVisiblePosition:%d, new oldTotal[%d,%d,%d], now preCount:[%d,%d,%d] fromcount:%d, needCheckHistoryTips:%b", new Object[] { this.wtd.ccY().field_username, Integer.valueOf(k), Integer.valueOf(i), Integer.valueOf(j), Integer.valueOf(i - j), Integer.valueOf(n), Integer.valueOf(m), Integer.valueOf(i1), Integer.valueOf(this.wtd.cdn().jRt), Boolean.valueOf(this.wCG) });
          if (i1 > 1)
          {
            this.wtd.cdm().setAdapter(this.wtd.cdn());
            this.wtd.cdm().setSelection(k);
          }
          GMTrace.o(19084284526592L, 142189);
          return;
        }
        k = this.wtd.cdn().getCount();
        this.wtd.cdn().ccz();
        int m = this.wtd.cdn().getCount();
        n = i - j;
        i1 = m - k;
        w.i("MicroMsg.ChattingUI.SilenceMsgImp", "summerbadcr onMsgChangeNotify up talker[%s],new oldTotal[%d,%d,%d], now preCount:[%d,%d,%d] fromcount:%d needCheckHistoryTips:%b", new Object[] { this.wtd.ccY().field_username, Integer.valueOf(i), Integer.valueOf(j), Integer.valueOf(n), Integer.valueOf(m), Integer.valueOf(k), Integer.valueOf(i1), Integer.valueOf(this.wtd.cdn().jRt), Boolean.valueOf(this.wCG) });
        if ((i1 <= 0) || (n != i1) || (this.wtd.cdn().jRt < 0)) {
          break label976;
        }
        this.wtd.cdn().CK(i1);
        w.i("MicroMsg.ChattingUI.SilenceMsgImp", "summerbadcr onMsgChangeNotify up nowCount > preCount on set select:%d position %d", new Object[] { Integer.valueOf(i1), Integer.valueOf(i1 + 1) });
        l.a(this.wtd.cdm(), i1 + 1, this.wtd.cdR() + this.wtd.cdo().wdP, false);
      }
    }
    for (;;)
    {
      this.wtd.cdo().lH(false);
      this.wtd.cdn().wzF = true;
      if (paramae.field_UnDeliverCount <= 0) {
        this.wtd.ceg();
      }
      if (this.wCG)
      {
        this.wCG = false;
        this.wtd.cdo().lE(this.wtd.cdn().ccB());
        this.wtd.cdo().lF(this.wtd.cds());
        this.wtd.cdo().lI(false);
        w.i("MicroMsg.ChattingUI.SilenceMsgImp", "summerbadcr onMsgChangeNotify set needCheckHistoryTips[%b]", new Object[] { Boolean.valueOf(this.wCG) });
        this.wtd.cdh().postDelayed(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(19093411332096L, 142257);
            w.i("MicroMsg.ChattingUI.SilenceMsgImp", "summerbadcr onMsgChangeNotify updateGoBacktoHistroyMessage up UnDeliver:%d, UnRead:%d", new Object[] { Integer.valueOf(paramae.field_UnDeliverCount), Integer.valueOf(paramae.field_unReadCount) });
            o.this.wtd.a(paramae, true);
            GMTrace.o(19093411332096L, 142257);
          }
        }, 500L);
      }
      GMTrace.o(19084284526592L, 142189);
      return;
      label976:
      w.i("MicroMsg.ChattingUI.SilenceMsgImp", "summerbadcr onMsgChangeNotify up incTotal incCount[%d, %d, %d] keep same", new Object[] { Integer.valueOf(n), Integer.valueOf(i1), Integer.valueOf(this.wtd.cdn().jRt) });
    }
  }
  
  public final void aQ(au paramau)
  {
    GMTrace.i(19084418744320L, 142190);
    long l1;
    long l2;
    boolean bool;
    int j;
    com.tencent.mm.storage.ae localae;
    if ((paramau != null) && (paramau.field_msgId != 0L))
    {
      l1 = 0L;
      l2 = paramau.field_msgSeq;
      if ((paramau.field_flag & 0x4) == 0) {
        break label231;
      }
      bool = true;
      j = 18;
      at.AR();
      localae = com.tencent.mm.y.c.yP().TO(this.wtd.ccY().field_username);
      i = j;
      if (localae != null)
      {
        if (!bool) {
          break label237;
        }
        l1 = localae.field_firstUnDeliverSeq;
        label91:
        if ((!bool) || (l1 != 0L)) {
          break label252;
        }
      }
    }
    label231:
    label237:
    label252:
    for (int i = localae.field_UnDeliverCount;; i = j)
    {
      w.i("MicroMsg.ChattingUI.SilenceMsgImp", "summerbadcr getChatroomMsgWithFaultMsg filterSeq[%d], lastSeq[%d], needCount[%d], flag[%d], up[%b]", new Object[] { Long.valueOf(l1), Long.valueOf(l2), Integer.valueOf(i), Integer.valueOf(paramau.field_flag), Boolean.valueOf(bool) });
      this.wCF = false;
      paramau = this.wtd.ccY().field_username;
      int k = (int)l1;
      int m = (int)l2;
      if (bool) {}
      for (j = 1;; j = 0)
      {
        paramau = new b.a(paramau, k, m, i, j);
        q.JG().a(paramau, this);
        GMTrace.o(19084418744320L, 142190);
        return;
        bool = false;
        break;
        l1 = localae.field_lastSeq;
        break label91;
      }
    }
  }
  
  public final void gB(int paramInt)
  {
    GMTrace.i(19084016091136L, 142187);
    w.i("MicroMsg.ChattingUI.SilenceMsgImp", "summerbadcr onGetFinish retcode[%d] thread[%d], dealHistoryGetMsg[%b], needCheckHistoryTips[%b]", new Object[] { Integer.valueOf(paramInt), Long.valueOf(Thread.currentThread().getId()), Boolean.valueOf(this.wCF), Boolean.valueOf(this.wCG) });
    if ((paramInt != 0) || (!this.wCF))
    {
      com.tencent.mm.sdk.platformtools.af.t(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(19077573640192L, 142139);
          o.this.wtd.cdo().lH(false);
          if (o.this.wCG)
          {
            o.this.wCG = false;
            o.this.wtd.cdo().lE(o.this.wtd.cdn().ccB());
            o.this.wtd.cdo().lF(o.this.wtd.cds());
            o.this.wtd.cdo().lI(false);
            w.i("MicroMsg.ChattingUI.SilenceMsgImp", "summerbadcr onGetFinish set needCheckHistoryTips[%b]", new Object[] { Boolean.valueOf(o.this.wCG) });
          }
          GMTrace.o(19077573640192L, 142139);
        }
      });
      GMTrace.o(19084016091136L, 142187);
      return;
    }
    at.AR();
    com.tencent.mm.storage.ae localae = com.tencent.mm.y.c.yP().TO(this.wtd.ccY().field_username);
    if (localae != null)
    {
      paramInt = localae.field_unReadCount;
      int i = localae.field_UnDeliverCount;
      at.AR();
      int j = com.tencent.mm.y.c.yM().Cp(this.wtd.ccY().field_username);
      final int k = j - this.wCI - paramInt;
      w.i("MicroMsg.ChattingUI.SilenceMsgImp", "summerbadcr onGetFinish unReadCount[%d] unDeliverCount[%d] beforemsgCount[%d], msgCount[%d] pos[%d]", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(i), Integer.valueOf(this.wCI), Integer.valueOf(j), Integer.valueOf(k) });
      com.tencent.mm.sdk.platformtools.af.t(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(19082271260672L, 142174);
          o.this.wtd.ae(k, true);
          GMTrace.o(19082271260672L, 142174);
        }
      });
    }
    GMTrace.o(19084016091136L, 142187);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\chatting\b\o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */