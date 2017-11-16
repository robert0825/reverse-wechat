package com.tencent.mm.plugin.i.c;

import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.b.ce;
import com.tencent.mm.plugin.i.b;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.au;
import com.tencent.mm.y.at;

public final class c
  implements Runnable
{
  private int aCN;
  public boolean isStop;
  private String jwq;
  private long jwr;
  private a jws;
  
  public c(String paramString, long paramLong, int paramInt, a parama)
  {
    GMTrace.i(20654095073280L, 153885);
    this.jwq = paramString;
    this.jwr = paramLong;
    this.aCN = paramInt;
    this.jws = parama;
    w.d("MicroMsg.ScanMsgTask", "%d scan msg[%d %d]", new Object[] { Integer.valueOf(hashCode()), Long.valueOf(this.jwr), Integer.valueOf(this.aCN) });
    GMTrace.o(20654095073280L, 153885);
  }
  
  public final void run()
  {
    int i = 0;
    GMTrace.i(20654229291008L, 153886);
    if (this.isStop)
    {
      GMTrace.o(20654229291008L, 153886);
      return;
    }
    long l = bg.Pw();
    Object localObject3 = null;
    Cursor localCursor2 = null;
    localCursor1 = localCursor2;
    localObject1 = localObject3;
    try
    {
      at.AR();
      localCursor1 = localCursor2;
      localObject1 = localObject3;
      localCursor2 = com.tencent.mm.y.c.yM().d(this.jwq, this.jwr, this.aCN);
      localCursor1 = localCursor2;
      localObject1 = localCursor2;
      l = bg.aI(l);
      localCursor1 = localCursor2;
      localObject1 = localCursor2;
      b.aiA();
      localCursor1 = localCursor2;
      localObject1 = localCursor2;
      b.o(this.aCN, l);
      boolean bool;
      do
      {
        localCursor1 = localCursor2;
        localObject1 = localCursor2;
        if (!localCursor2.moveToNext()) {
          break;
        }
        i += 1;
        localCursor1 = localCursor2;
        localObject1 = localCursor2;
        localObject3 = new au();
        localCursor1 = localCursor2;
        localObject1 = localCursor2;
        ((au)localObject3).b(localCursor2);
        localCursor1 = localCursor2;
        localObject1 = localCursor2;
        b.aiA().G((au)localObject3);
        localCursor1 = localCursor2;
        localObject1 = localCursor2;
        b.aiA().aW(((ce)localObject3).field_msgId);
        localCursor1 = localCursor2;
        localObject1 = localCursor2;
        bool = this.isStop;
      } while (!bool);
      if (localCursor2 != null) {
        localCursor2.close();
      }
      GMTrace.o(20654229291008L, 153886);
      return;
      localCursor1 = localCursor2;
      localObject1 = localCursor2;
      w.d("MicroMsg.ScanMsgTask", "%d scan msg count[%d] limit[%d]", new Object[] { Integer.valueOf(hashCode()), Integer.valueOf(i), Integer.valueOf(this.aCN) });
      localCursor1 = localCursor2;
      localObject1 = localCursor2;
      if (i < this.aCN)
      {
        localCursor1 = localCursor2;
        localObject1 = localCursor2;
        localObject3 = b.aiA();
        localCursor1 = localCursor2;
        localObject1 = localCursor2;
        b.aiA();
        localCursor1 = localCursor2;
        localObject1 = localCursor2;
        ((b)localObject3).aW(b.aiD());
      }
      if (localCursor2 != null) {
        localCursor2.close();
      }
    }
    catch (Exception localException)
    {
      for (;;)
      {
        localObject1 = localCursor1;
        w.printErrStackTrace("MicroMsg.ScanMsgTask", localException, "", new Object[0]);
        if (localCursor1 != null) {
          localCursor1.close();
        }
      }
    }
    finally
    {
      if (localObject1 == null) {
        break label436;
      }
      ((Cursor)localObject1).close();
    }
    if (this.jws != null) {
      this.jws.finish();
    }
    GMTrace.o(20654229291008L, 153886);
  }
  
  public static abstract interface a
  {
    public abstract void finish();
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\i\c\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */