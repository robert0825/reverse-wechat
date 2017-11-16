package com.tencent.mm.plugin.w;

import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.a.p;
import com.tencent.mm.g.b.af;
import com.tencent.mm.g.b.aj;
import com.tencent.mm.g.b.ce;
import com.tencent.mm.plugin.backup.g.a;
import com.tencent.mm.plugin.backup.h.k;
import com.tencent.mm.pointers.PInt;
import com.tencent.mm.pointers.PLong;
import com.tencent.mm.protocal.c.el;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.ar;
import com.tencent.mm.storage.as;
import com.tencent.mm.storage.au;
import com.tencent.mm.storage.t;
import com.tencent.mm.storage.x;
import com.tencent.mm.y.at;
import java.io.File;
import java.util.Iterator;
import java.util.LinkedList;

public final class c
{
  public boolean nlv;
  public a.a nlw;
  
  public c()
  {
    GMTrace.i(14717108092928L, 109651);
    this.nlv = false;
    GMTrace.o(14717108092928L, 109651);
  }
  
  public final boolean a(a parama, String paramString, int paramInt, PInt paramPInt, PLong paramPLong, long paramLong)
  {
    GMTrace.i(16145587372032L, 120294);
    at.AR();
    if (x.At(com.tencent.mm.y.c.yK().TE(parama.iVy).field_verifyFlag))
    {
      GMTrace.o(16145587372032L, 120294);
      return true;
    }
    w.i("MicroMsg.MsgSynchronizePack", "summerbak backupChatMsg convName:%s, unReadCount:%d", new Object[] { parama.iVy, Integer.valueOf(paramInt) });
    LinkedList localLinkedList1 = new LinkedList();
    LinkedList localLinkedList2 = new LinkedList();
    long l = ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).zv().BV(parama.iVy);
    Object localObject1 = a.afG().afH().yM().g(parama.iVy, b.nls, l);
    Object localObject3;
    while (((Cursor)localObject1).moveToNext())
    {
      if (this.nlv)
      {
        ((Cursor)localObject1).close();
        GMTrace.o(16145587372032L, 120294);
        return false;
      }
      localObject3 = new au();
      ((au)localObject3).b((Cursor)localObject1);
      if (((paramLong >= 0L) && (((ce)localObject3).field_createTime >= paramLong)) || (paramLong < 0L)) {
        localLinkedList2.add(localObject3);
      }
    }
    ((Cursor)localObject1).close();
    int i = 0;
    LinkedList localLinkedList3;
    boolean bool;
    if (i < localLinkedList2.size())
    {
      localObject1 = (au)localLinkedList2.get(i);
      localObject3 = new PLong();
      localLinkedList3 = new LinkedList();
      if (paramInt > 0) {
        bool = true;
      }
    }
    label512:
    for (;;)
    {
      try
      {
        localObject1 = com.tencent.mm.plugin.backup.e.a.a.a((au)localObject1, false, paramString, (PLong)localObject3, localLinkedList3, null, bool, true, 0L);
        if (localObject1 == null) {
          break label512;
        }
        localLinkedList1.add(localObject1);
        paramPLong.value += 1L;
        paramInt -= 1;
        i += 1;
        break;
        bool = false;
        continue;
      }
      catch (Exception localException)
      {
        w.printErrStackTrace("MicroMsg.MsgSynchronizePack", localException, "backupChatMsg", new Object[0]);
        Object localObject2 = null;
        continue;
      }
      paramString = new el();
      paramString.jhd = localLinkedList1;
      paramString.jhc = localLinkedList1.size();
      try
      {
        paramPLong = paramString.toByteArray();
        parama = "MSG_" + localLinkedList1.size() + "_" + parama.iVy + "_" + bg.Pv();
        f.d(f.aQM(), parama, paramPLong);
        w.i("MicroMsg.MsgSynchronizePack", "add MsgSynchronize, tagTextClientId:%s", new Object[] { parama });
        paramPInt.value += 1;
        GMTrace.o(16145587372032L, 120294);
        return true;
      }
      catch (Exception parama)
      {
        for (;;)
        {
          w.e("MicroMsg.MsgSynchronizePack", "ERROR: BakChatMsgList to Buffer list:%d :%s", new Object[] { Integer.valueOf(paramString.jhc), parama.getMessage() });
        }
      }
    }
  }
  
  public final void b(final LinkedList<a> paramLinkedList, final long paramLong)
  {
    GMTrace.i(16145453154304L, 120293);
    com.tencent.mm.sdk.f.e.d(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(14714289520640L, 109630);
        long l = bg.Pv();
        if (paramLinkedList == null)
        {
          w.e("MicroMsg.MsgSynchronizePack", "MsgSynchronizeSessionList is null.");
          if (c.this.nlw != null) {
            c.this.nlw.aee();
          }
          GMTrace.o(14714289520640L, 109630);
          return;
        }
        com.tencent.mm.a.e.f(new File(f.aQN()));
        com.tencent.mm.a.e.f(new File(f.aQO()));
        f.aQP();
        Object localObject1 = new LinkedList();
        String str = (String)a.afG().afH().xh().get(2, null);
        PInt localPInt = new PInt();
        Object localObject3 = new PInt();
        PLong localPLong = new PLong();
        Iterator localIterator = paramLinkedList.iterator();
        c.a locala;
        Object localObject4;
        if (localIterator.hasNext())
        {
          locala = (c.a)localIterator.next();
          localObject4 = a.afG().afH().yP().TO(locala.iVy);
          if (localObject4 == null) {
            break label359;
          }
        }
        label359:
        for (int i = ((aj)localObject4).field_unReadCount;; i = 0)
        {
          if (((PInt)localObject3).value < b.nlt)
          {
            localObject4 = new k();
            ((k)localObject4).jhi = locala.iVy;
            ((k)localObject4).jhg = ((int)(a.afG().afH().yM().Cv(locala.iVy) / 1000L));
            ((k)localObject4).jhh = i;
            ((LinkedList)localObject1).add(localObject4);
            ((PInt)localObject3).value += 1;
            if (localPInt.value < b.nlr) {
              c.this.a(locala, str, i, localPInt, localPLong, paramLong);
            }
            if (!c.this.nlv) {
              break;
            }
          }
          if (!c.this.nlv) {
            break label364;
          }
          w.e("MicroMsg.MsgSynchronizePack", "MsgSynchronizePack canceled!");
          GMTrace.o(14714289520640L, 109630);
          return;
        }
        label364:
        localObject3 = new com.tencent.mm.plugin.backup.h.l();
        ((com.tencent.mm.plugin.backup.h.l)localObject3).jhj = ((LinkedList)localObject1);
        ((com.tencent.mm.plugin.backup.h.l)localObject3).jhk = com.tencent.mm.bc.l.ML().Mz();
        try
        {
          localObject1 = ((com.tencent.mm.plugin.backup.h.l)localObject3).toByteArray();
          f.d(f.aQM(), "sessionlist", (byte[])localObject1);
          w.i("MicroMsg.MsgSynchronizePack", "BackupSessionInfoList pack finish.");
          p.a(new File(f.aQN()), false, f.aQO());
          localObject3 = a.afG().afH().jcJ;
          l = bg.aH(l);
          if (localObject3 == null)
          {
            localObject1 = "null";
            w.i("MicroMsg.MsgSynchronizePack", "synchronize finish, backupCostTime:%d, isTempDb[%s]", new Object[] { Long.valueOf(l), localObject1 });
            if (localObject3 != null) {
              a.afG().n(new Runnable()
              {
                public final void run()
                {
                  GMTrace.i(14716168568832L, 109644);
                  w.i("MicroMsg.MsgSynchronizePack", "closeTempDB end");
                  w.bPM();
                  GMTrace.o(14716168568832L, 109644);
                }
              });
            }
            l = com.tencent.mm.a.e.aY(f.aQO());
            if (c.this.nlw != null) {
              c.this.nlw.a(f.aQO(), paramLinkedList.size(), str, localPInt.value, localPLong.value, l / 1024L);
            }
            GMTrace.o(14714289520640L, 109630);
            return;
          }
        }
        catch (Exception localException)
        {
          for (;;)
          {
            w.e("MicroMsg.MsgSynchronizePack", "ERROR: BackupSessionInfoList to Buffer, list:%d :%s", new Object[] { Integer.valueOf(((com.tencent.mm.plugin.backup.h.l)localObject3).jhj.size()), localException.getMessage() });
            continue;
            Object localObject2 = localObject3;
          }
        }
      }
    }, "msgSynchronizePackThread", 10).start();
    GMTrace.o(16145453154304L, 120293);
  }
  
  public static final class a
  {
    public String iVy;
    
    public a(String paramString)
    {
      GMTrace.i(14715363262464L, 109638);
      this.iVy = paramString;
      GMTrace.o(14715363262464L, 109638);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\w\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */