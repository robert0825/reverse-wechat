package com.tencent.mm.plugin.backup.b;

import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.b.aj;
import com.tencent.mm.plugin.backup.a.d;
import com.tencent.mm.plugin.backup.a.h;
import com.tencent.mm.plugin.backup.e.a.a;
import com.tencent.mm.plugin.backup.g.a;
import com.tencent.mm.pointers.PLong;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.ae;
import com.tencent.mm.storage.ar;
import com.tencent.mm.storage.as;
import com.tencent.mm.storage.au;
import com.tencent.mm.storage.x;
import com.tencent.mm.y.at;
import com.tencent.mm.y.s;
import java.util.LinkedList;

public final class b
{
  public boolean iVL;
  
  public b()
  {
    GMTrace.i(9474429419520L, 70590);
    this.iVL = false;
    GMTrace.o(9474429419520L, 70590);
  }
  
  public final void a(final a parama)
  {
    GMTrace.i(18452790116352L, 137484);
    w.i("MicroMsg.BackupCalculator", "calculateChooseConversation start");
    long l = bg.Pv();
    final LinkedList localLinkedList = new LinkedList();
    Cursor localCursor = a.afG().afH().yP().c(s.gmw, h.aet(), "*");
    if (localCursor.getCount() == 0)
    {
      if (parama != null) {
        com.tencent.mm.sdk.platformtools.af.t(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(9476979556352L, 70609);
            if (parama != null) {
              parama.u(localLinkedList);
            }
            GMTrace.o(9476979556352L, 70609);
          }
        });
      }
      w.i("MicroMsg.BackupCalculator", "calculateChooseConversation empty conversation!");
      localCursor.close();
      GMTrace.o(18452790116352L, 137484);
      return;
    }
    localCursor.moveToFirst();
    w.i("MicroMsg.BackupCalculator", "calculateChooseConversation count[%d]", new Object[] { Integer.valueOf(localCursor.getCount()) });
    for (;;)
    {
      if (this.iVL)
      {
        w.e("MicroMsg.BackupCalculator", "calculateChooseConversation cancel.");
        localCursor.close();
        GMTrace.o(18452790116352L, 137484);
        return;
      }
      ae localae = new ae();
      localae.b(localCursor);
      int i;
      if (!bg.nm(localae.field_username))
      {
        i = a.afG().afH().yM().Cp(localae.field_username);
        if (i > 0) {
          break label307;
        }
        w.i("MicroMsg.BackupCalculator", "calculateChooseConversation empty conversation:%s", new Object[] { localae.field_username });
      }
      while (!localCursor.moveToNext())
      {
        localCursor.close();
        if ((!this.iVL) && (parama != null)) {
          com.tencent.mm.sdk.platformtools.af.t(new Runnable()
          {
            public final void run()
            {
              GMTrace.i(9469731799040L, 70555);
              if ((!b.this.iVL) && (parama != null)) {
                parama.u(localLinkedList);
              }
              GMTrace.o(9469731799040L, 70555);
            }
          });
        }
        w.i("MicroMsg.BackupCalculator", "calculateChooseConversation finish, use time[%d]", new Object[] { Long.valueOf(bg.aH(l)) });
        GMTrace.o(18452790116352L, 137484);
        return;
        label307:
        at.AR();
        if (x.At(com.tencent.mm.y.c.yK().TE(localae.field_username).field_verifyFlag))
        {
          w.i("MicroMsg.BackupCalculator", "calculateChooseConversation Biz conv:%s, msgCount[%d]", new Object[] { localae.field_username, Integer.valueOf(i) });
        }
        else
        {
          d locald = new d();
          locald.iVh = localae.field_username;
          locald.iVi = a.afG().afH().yM().Cu(localae.field_username);
          locald.iVj = a.afG().afH().yM().Cv(localae.field_username);
          w.i("MicroMsg.BackupCalculator", "calculateChooseConversation add conv:%s, msgCount[%d], firstMsgTime[%d], lastMsgTime[%d]", new Object[] { locald.iVh, Integer.valueOf(i), Long.valueOf(locald.iVi), Long.valueOf(locald.iVj) });
          localLinkedList.add(locald);
        }
      }
    }
  }
  
  public final boolean a(d paramd, String paramString, long paramLong)
  {
    GMTrace.i(14729992994816L, 109747);
    if (paramd == null)
    {
      GMTrace.o(14729992994816L, 109747);
      return false;
    }
    Cursor localCursor = a.afG().afH().yM().Cj(paramd.iVh);
    w.i("MicroMsg.BackupCalculator", "calConversation start convName:%s msgCnt:%d[cu.getCount]", new Object[] { paramd.iVh, Integer.valueOf(localCursor.getCount()) });
    if (localCursor.moveToFirst())
    {
      PLong localPLong1 = new PLong();
      PLong localPLong2 = new PLong();
      for (;;)
      {
        if (!localCursor.isAfterLast())
        {
          if (this.iVL)
          {
            w.i("MicroMsg.BackupCalculator", "calConversation cancel, return");
            localCursor.close();
            GMTrace.o(14729992994816L, 109747);
            return true;
          }
          au localau = new au();
          localau.b(localCursor);
          try
          {
            a.a.a(localau, true, paramString, localPLong1, null, null, false, false, paramLong);
            localPLong2.value += 1L;
            localCursor.moveToNext();
          }
          catch (Exception localException)
          {
            for (;;)
            {
              w.printErrStackTrace("MicroMsg.BackupCalculator", localException, "packedMsg", new Object[0]);
            }
          }
        }
      }
      paramd.iVk = localPLong1.value;
      paramd.iVl = localPLong2.value;
      w.i("MicroMsg.BackupCalculator", "calConversation convName:%s, convDataSize:%d, convMsgCount:%d", new Object[] { paramd.iVh, Long.valueOf(paramd.iVk), Long.valueOf(paramd.iVl) });
    }
    localCursor.close();
    GMTrace.o(14729992994816L, 109747);
    return false;
  }
  
  public final void cancel()
  {
    GMTrace.i(9474563637248L, 70591);
    w.i("MicroMsg.BackupCalculator", "cancel. stack:%s", new Object[] { bg.bQW() });
    this.iVL = true;
    GMTrace.o(9474563637248L, 70591);
  }
  
  public static abstract interface a
  {
    public abstract void u(LinkedList<d> paramLinkedList);
  }
  
  public static abstract interface b
    extends b.a
  {
    public abstract void a(LinkedList<d> paramLinkedList, d paramd, int paramInt);
    
    public abstract void v(LinkedList<d> paramLinkedList);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\backup\b\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */