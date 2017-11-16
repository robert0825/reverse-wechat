package com.tencent.mm.plugin.exdevice.model;

import android.os.Looper;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.a.eh;
import com.tencent.mm.plugin.exdevice.service.f;
import com.tencent.mm.plugin.exdevice.service.f.a;
import com.tencent.mm.plugin.exdevice.service.j.a;
import com.tencent.mm.plugin.exdevice.service.k.a;
import com.tencent.mm.plugin.exdevice.service.m;
import com.tencent.mm.plugin.exdevice.service.s.a;
import com.tencent.mm.plugin.exdevice.service.t;
import com.tencent.mm.plugin.exdevice.service.u;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.w;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class h
  extends s.a
{
  protected static final String TAG;
  private boolean kzq;
  f kzr;
  private j.a kzs;
  
  static
  {
    GMTrace.i(10971091304448L, 81741);
    TAG = h.class.getName();
    GMTrace.o(10971091304448L, 81741);
  }
  
  public h()
  {
    GMTrace.i(10970017562624L, 81733);
    this.kzq = false;
    this.kzr = new f();
    this.kzs = new j.a()
    {
      public final void a(int paramAnonymousInt1, int paramAnonymousInt2, String paramAnonymousString1, String paramAnonymousString2, String paramAnonymousString3, int paramAnonymousInt3, byte[] paramAnonymousArrayOfByte)
      {
        GMTrace.i(10978339061760L, 81795);
        w.d(h.TAG, "onScanCallback. messageType=%d, errCode=%d, errMsg=%s, deviceMac=%s, deviceName=%s, rssi=%d, advertisment=%s", new Object[] { Integer.valueOf(paramAnonymousInt1), Integer.valueOf(paramAnonymousInt2), paramAnonymousString1, paramAnonymousString2, paramAnonymousString3, Integer.valueOf(paramAnonymousInt3), com.tencent.mm.plugin.exdevice.j.b.al(paramAnonymousArrayOfByte) });
        if (1 == paramAnonymousInt1) {
          ad.auc().j(paramAnonymousString3, paramAnonymousString2, false);
        }
        for (;;)
        {
          if (ad.atR().bR(com.tencent.mm.plugin.exdevice.j.b.xh(paramAnonymousString2)) != null) {
            w.d(h.TAG, "the founded device hasn't been binded");
          }
          GMTrace.o(10978339061760L, 81795);
          return;
          if (2 == paramAnonymousInt1) {
            ad.auc().j(paramAnonymousString3, paramAnonymousString2, true);
          } else {
            w.e(h.TAG, "unknown message type %d", new Object[] { Integer.valueOf(paramAnonymousInt1) });
          }
        }
      }
    };
    GMTrace.o(10970017562624L, 81733);
  }
  
  public static boolean a(long paramLong, byte[] paramArrayOfByte, t paramt)
  {
    GMTrace.i(10970688651264L, 81738);
    if ((paramArrayOfByte == null) || (paramArrayOfByte.length <= 0))
    {
      w.e(TAG, "no data for transmit");
      GMTrace.o(10970688651264L, 81738);
      return false;
    }
    if (u.aut().kxo == null)
    {
      w.e(TAG, "can not send data");
      GMTrace.o(10970688651264L, 81738);
      return false;
    }
    boolean bool = u.aut().kxo.b(paramLong, paramArrayOfByte, paramt);
    if (!bool) {
      w.e(TAG, "simpleBluetoothSendData error");
    }
    GMTrace.o(10970688651264L, 81738);
    return bool;
  }
  
  public static void bv(long paramLong)
  {
    GMTrace.i(10970554433536L, 81737);
    d locald = ad.atY();
    w.d("MicroMsg.exdevice.ExdeviceConnectManager", "simpleBTDisconnect");
    if (locald.kxu == null)
    {
      w.i("MicroMsg.exdevice.ExdeviceConnectManager", "exdevice process is dead, just leave");
      GMTrace.o(10970554433536L, 81737);
      return;
    }
    if (u.aut().kxo == null)
    {
      w.e("MicroMsg.exdevice.ExdeviceConnectManager", "dispatcher is null.");
      GMTrace.o(10970554433536L, 81737);
      return;
    }
    if (!u.aut().kxo.bQ(paramLong)) {
      w.e("MicroMsg.exdevice.ExdeviceConnectManager", "simpleBluetoothDisconnect failed!!!");
    }
    GMTrace.o(10970554433536L, 81737);
  }
  
  public final void a(long paramLong, final a parama)
  {
    GMTrace.i(10970420215808L, 81736);
    Object localObject = this.kzr.bI(paramLong);
    if ((localObject != null) && (2 == ((f.a)localObject).eFl))
    {
      w.d(TAG, "device(" + paramLong + ") has been connected");
      parama.a(paramLong, 2, 2, 0, ((f.a)localObject).jlY);
      GMTrace.o(10970420215808L, 81736);
      return;
    }
    localObject = ad.atY();
    parama = new k.a()
    {
      public final void a(long paramAnonymousLong1, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3, long paramAnonymousLong2)
      {
        GMTrace.i(10923846664192L, 81389);
        w.d(h.TAG, "mac=%d, oldState=%d, newState=%d, errCode=%d, profileType=%d", new Object[] { Long.valueOf(paramAnonymousLong1), Integer.valueOf(paramAnonymousInt1), Integer.valueOf(paramAnonymousInt2), Integer.valueOf(paramAnonymousInt3), Long.valueOf(paramAnonymousLong2) });
        f.a locala = h.a(h.this).bI(paramAnonymousLong1);
        if (locala != null)
        {
          locala.eFl = paramAnonymousInt2;
          locala.jlY = paramAnonymousLong2;
        }
        for (;;)
        {
          parama.a(paramAnonymousLong1, paramAnonymousInt1, paramAnonymousInt2, paramAnonymousInt3, paramAnonymousLong2);
          GMTrace.o(10923846664192L, 81389);
          return;
          w.i(h.TAG, "get connect state faild : %d", new Object[] { Long.valueOf(paramAnonymousLong1) });
        }
      }
    };
    w.d("MicroMsg.exdevice.ExdeviceConnectManager", "simpleBTConnect");
    if (((d)localObject).kxu == null)
    {
      ((d)localObject).kxu = new com.tencent.mm.plugin.exdevice.service.c();
      ((d)localObject).kxu.kCW = new d.3((d)localObject, paramLong, parama);
      ((d)localObject).kxu.ck(ab.getContext());
      GMTrace.o(10970420215808L, 81736);
      return;
    }
    w.i("MicroMsg.exdevice.ExdeviceConnectManager", "try start connect");
    localObject = u.aut().kxo;
    if ((localObject == null) || (!((m)localObject).a(paramLong, parama))) {
      w.e("MicroMsg.exdevice.ExdeviceConnectManager", "connect failed!!!");
    }
    GMTrace.o(10970420215808L, 81736);
  }
  
  public final void agW()
  {
    GMTrace.i(10970285998080L, 81735);
    if (!this.kzq)
    {
      w.d(TAG, "not yet scan. return");
      GMTrace.o(10970285998080L, 81735);
      return;
    }
    d locald = ad.atY();
    j.a locala = this.kzs;
    w.d("MicroMsg.exdevice.ExdeviceConnectManager", "simpleBTStopScan");
    if (locald.kxu == null) {
      w.i("MicroMsg.exdevice.ExdeviceConnectManager", "exdevice process is dead, just leave");
    }
    for (;;)
    {
      this.kzq = false;
      GMTrace.o(10970285998080L, 81735);
      return;
      if (u.aut().kxo == null) {
        w.e("MicroMsg.exdevice.ExdeviceConnectManager", "dispatcher is null.");
      } else if (!u.aut().kxo.b(locala)) {
        w.e("MicroMsg.exdevice.ExdeviceConnectManager", "stopScan failed!!!");
      }
    }
  }
  
  public final void atH()
  {
    GMTrace.i(10970151780352L, 81734);
    if (this.kzq)
    {
      w.d(TAG, "still scanning. return");
      GMTrace.o(10970151780352L, 81734);
      return;
    }
    d locald = ad.atY();
    j.a locala = this.kzs;
    w.d("MicroMsg.exdevice.ExdeviceConnectManager", "simpleBTScan");
    if (locald.kxu == null)
    {
      locald.kxu = new com.tencent.mm.plugin.exdevice.service.c();
      locald.kxu.kCW = new d.2(locald, locala);
      locald.kxu.ck(ab.getContext());
    }
    for (;;)
    {
      this.kzq = true;
      GMTrace.o(10970151780352L, 81734);
      return;
      if (u.aut().kxo == null)
      {
        w.e("MicroMsg.exdevice.ExdeviceConnectManager", "dispatcher is null.");
      }
      else
      {
        w.i("MicroMsg.exdevice.ExdeviceConnectManager", "try start scan");
        if (!u.aut().kxo.a(locala)) {
          w.e("MicroMsg.exdevice.ExdeviceConnectManager", "scan failed!!!");
        }
      }
    }
  }
  
  public final void c(long paramLong, byte[] paramArrayOfByte)
  {
    GMTrace.i(10970822868992L, 81739);
    if ((paramArrayOfByte == null) || (paramArrayOfByte.length <= 0))
    {
      w.e(TAG, "data is null or nil");
      GMTrace.o(10970822868992L, 81739);
      return;
    }
    w.d(TAG, "onDataRecv. mac=%d, data=%s", new Object[] { Long.valueOf(paramLong), com.tencent.mm.plugin.exdevice.j.b.al(paramArrayOfByte) });
    Object localObject1 = ad.auc();
    String str = com.tencent.mm.plugin.exdevice.j.b.bS(paramLong);
    LinkedList localLinkedList;
    synchronized (((e)localObject1).kxN)
    {
      localLinkedList = new LinkedList(((e)localObject1).kxN);
      ??? = localLinkedList.iterator();
      if (((Iterator)???).hasNext()) {
        ((e.b)((Iterator)???).next()).b(str, paramArrayOfByte, true);
      }
    }
    localLinkedList.clear();
    localObject1 = ((e)localObject1).kxO.values().iterator();
    while (((Iterator)localObject1).hasNext()) {
      ((e.b)((Iterator)localObject1).next()).b(str, paramArrayOfByte, true);
    }
    localObject1 = new eh();
    ((eh)localObject1).eGb.mac = str;
    ((eh)localObject1).eGb.data = paramArrayOfByte;
    a.vgX.a((com.tencent.mm.sdk.b.b)localObject1, Looper.getMainLooper());
    GMTrace.o(10970822868992L, 81739);
  }
  
  public static abstract interface a
  {
    public abstract void a(long paramLong1, int paramInt1, int paramInt2, int paramInt3, long paramLong2);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\exdevice\model\h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */