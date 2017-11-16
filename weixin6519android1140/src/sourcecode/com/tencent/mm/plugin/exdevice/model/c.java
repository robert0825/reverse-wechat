package com.tencent.mm.plugin.exdevice.model;

import android.os.Looper;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.exdevice.i.d;
import com.tencent.mm.plugin.exdevice.service.m;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.aj;
import com.tencent.mm.sdk.platformtools.aj.a;
import com.tencent.mm.sdk.platformtools.w;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Vector;

public final class c
  implements d
{
  public static c kxn;
  private byte[] fJa;
  private final Map<Integer, Set<d>> guw;
  public m kxo;
  a kxp;
  Vector<ae> kxq;
  private af kxr;
  
  public c()
  {
    GMTrace.i(10963843547136L, 81687);
    this.guw = new HashMap();
    this.fJa = new byte[0];
    this.kxq = new Vector();
    this.kxr = new af("ExdeviceHandlerThread");
    GMTrace.o(10963843547136L, 81687);
  }
  
  public final void a(long paramLong, int paramInt1, int paramInt2, String arg5)
  {
    GMTrace.i(10964246200320L, 81690);
    w.i("MicroMsg.exdevice.ExDeviceTaskService", "onTaskSceneEnd, taskid =%d, errType =%d, errCode = %d, errMsg =%s, wattingtask size : %d", new Object[] { Long.valueOf(paramLong), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), ???, Integer.valueOf(this.kxq.size()) });
    synchronized (this.fJa)
    {
      atx();
      GMTrace.o(10964246200320L, 81690);
      return;
    }
  }
  
  public final boolean a(final ae paramae)
  {
    GMTrace.i(10963977764864L, 81688);
    this.kxr.A(new Runnable()
    {
      public final void run()
      {
        int i = 1;
        GMTrace.i(10989076480000L, 81875);
        c localc = c.this;
        ae localae = paramae;
        if (localc.kxo == null)
        {
          w.w("MicroMsg.exdevice.ExDeviceTaskService", "dispathcer is null, now try to reset it");
          if (localc.kxp == null) {
            break label110;
          }
          w.i("MicroMsg.exdevice.ExDeviceTaskService", "prepare dispatcher is not null. not prepare it");
          localc.kxp.aty();
          new aj(Looper.getMainLooper(), new c.1(localc), true).z(100L, 100L);
        }
        for (;;)
        {
          i = 0;
          if (i == 0) {
            break;
          }
          localae.a(localc.kxo, localc);
          GMTrace.o(10989076480000L, 81875);
          return;
          label110:
          w.e("MicroMsg.exdevice.ExDeviceTaskService", "prepare dispatcher is null");
        }
        localc.kxq.add(localae);
        GMTrace.o(10989076480000L, 81875);
      }
    });
    GMTrace.o(10963977764864L, 81688);
    return true;
  }
  
  public final void atx()
  {
    GMTrace.i(10964111982592L, 81689);
    w.i("MicroMsg.exdevice.ExDeviceTaskService", "now watting task size is %d", new Object[] { Integer.valueOf(this.kxq.size()) });
    if (!this.kxq.isEmpty()) {
      a((ae)this.kxq.remove(0));
    }
    GMTrace.o(10964111982592L, 81689);
  }
  
  public static abstract interface a
  {
    public abstract void aty();
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\exdevice\model\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */