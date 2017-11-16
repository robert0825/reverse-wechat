package com.tencent.mm.plugin.exdevice.model;

import android.content.Context;
import android.os.Looper;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.n;
import com.tencent.mm.g.a.cv;
import com.tencent.mm.g.a.cv.a;
import com.tencent.mm.plugin.exdevice.service.f;
import com.tencent.mm.plugin.exdevice.service.f.a;
import com.tencent.mm.plugin.exdevice.service.j;
import com.tencent.mm.plugin.exdevice.service.k;
import com.tencent.mm.plugin.exdevice.service.m;
import com.tencent.mm.plugin.exdevice.service.u;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.aj;
import com.tencent.mm.sdk.platformtools.aj.a;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.y.at;
import java.util.HashMap;

public final class d
{
  private static int kxz;
  public j kxA;
  public Object kxB;
  public com.tencent.mm.plugin.exdevice.service.c kxu;
  private com.tencent.mm.plugin.exdevice.service.w kxv;
  public HashMap<Long, aj> kxw;
  public HashMap<Long, aj> kxx;
  public HashMap<Long, Integer> kxy;
  
  static
  {
    GMTrace.i(10960756539392L, 81664);
    kxz = 0;
    GMTrace.o(10960756539392L, 81664);
  }
  
  public d()
  {
    GMTrace.i(10958072184832L, 81644);
    this.kxA = null;
    this.kxB = new Object();
    u.aut().kxp = new c.a()
    {
      public final void aty()
      {
        GMTrace.i(10974849400832L, 81769);
        if (d.this.kxu == null)
        {
          d.this.kxu = new com.tencent.mm.plugin.exdevice.service.c();
          d.this.kxu.kCW = null;
        }
        d.this.kxu.ck(ab.getContext());
        GMTrace.o(10974849400832L, 81769);
      }
    };
    if (this.kxv == null) {
      this.kxv = new com.tencent.mm.plugin.exdevice.service.w()
      {
        public final void a(long paramAnonymousLong1, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3, long paramAnonymousLong2)
        {
          GMTrace.i(10924115099648L, 81391);
          com.tencent.mm.sdk.platformtools.w.i("MicroMsg.exdevice.ExdeviceConnectManager", "onStateChange, deviceId = %s, oldSate = %d, newState = %d, errCode = %d", new Object[] { com.tencent.mm.plugin.exdevice.j.b.bS(paramAnonymousLong1), Integer.valueOf(paramAnonymousInt1), Integer.valueOf(paramAnonymousInt2), Integer.valueOf(paramAnonymousInt3) });
          if (ab.getContext() == null)
          {
            com.tencent.mm.sdk.platformtools.w.e("MicroMsg.exdevice.ExdeviceConnectManager", "MMApplicationContext is null");
            GMTrace.o(10924115099648L, 81391);
            return;
          }
          Object localObject;
          if (4 == paramAnonymousInt2)
          {
            u.aus().bK(paramAnonymousLong1);
            localObject = com.tencent.mm.plugin.exdevice.h.a.wR("shut_down_device");
            if ((localObject != null) && (localObject.length != 0))
            {
              int i = localObject.length;
              paramAnonymousInt3 = 0;
              while (paramAnonymousInt3 < i)
              {
                paramAnonymousLong2 = localObject[paramAnonymousInt3];
                if (paramAnonymousLong2 == paramAnonymousLong1)
                {
                  com.tencent.mm.sdk.platformtools.w.i("MicroMsg.exdevice.ExdeviceConnectManager", "Stop channel in the shut down device list, deviceId = %d", new Object[] { Long.valueOf(paramAnonymousLong2) });
                  d.bv(paramAnonymousLong2);
                  if (!com.tencent.mm.plugin.exdevice.h.a.v("shut_down_device", paramAnonymousLong2)) {
                    com.tencent.mm.sdk.platformtools.w.e("MicroMsg.exdevice.ExdeviceConnectManager", "removeFromSharedPreferences failed!!!");
                  }
                }
                paramAnonymousInt3 += 1;
              }
            }
            if (d.this.kxy.get(Long.valueOf(paramAnonymousLong1)) == null) {
              break label347;
            }
            com.tencent.mm.sdk.platformtools.w.i("MicroMsg.exdevice.ExdeviceConnectManager", "Device connect strategy(%d)", new Object[] { d.this.kxy.get(Long.valueOf(paramAnonymousLong1)) });
            localObject = new cv();
            com.tencent.mm.sdk.b.a.vgX.m((com.tencent.mm.sdk.b.b)localObject);
            if ((!((cv)localObject).eEi.euF) || ((((Integer)d.this.kxy.get(Long.valueOf(paramAnonymousLong1))).intValue() & 0x1) != 1)) {
              d.bv(paramAnonymousLong1);
            }
          }
          while (paramAnonymousInt1 != paramAnonymousInt2)
          {
            localObject = ad.atR().wS(String.valueOf(paramAnonymousLong1));
            if ((localObject == null) || (bg.nm(((com.tencent.mm.plugin.exdevice.h.b)localObject).field_brandName)))
            {
              com.tencent.mm.sdk.platformtools.w.e("MicroMsg.exdevice.ExdeviceConnectManager", "get hdinfo by mac failed : %d", new Object[] { Long.valueOf(paramAnonymousLong1) });
              GMTrace.o(10924115099648L, 81391);
              return;
              label347:
              d.bv(paramAnonymousLong1);
            }
            else
            {
              f.a locala = u.aus().bH(paramAnonymousLong1);
              if (locala != null) {
                locala.eFl = paramAnonymousInt2;
              }
              while (paramAnonymousInt2 == 2)
              {
                com.tencent.mm.sdk.platformtools.w.w("MicroMsg.exdevice.ExdeviceConnectManager", "newState = EMMACCS_connected");
                GMTrace.o(10924115099648L, 81391);
                return;
                com.tencent.mm.sdk.platformtools.w.i("MicroMsg.exdevice.ExdeviceConnectManager", "get connect state faild : %d", new Object[] { Long.valueOf(paramAnonymousLong1) });
              }
              ad.auc();
              e.b(((com.tencent.mm.plugin.exdevice.h.b)localObject).field_brandName, ((com.tencent.mm.plugin.exdevice.h.b)localObject).field_url, paramAnonymousInt2, ((com.tencent.mm.plugin.exdevice.h.b)localObject).field_deviceID);
            }
          }
          GMTrace.o(10924115099648L, 81391);
        }
      };
    }
    this.kxw = new HashMap();
    this.kxx = new HashMap();
    this.kxy = new HashMap();
    GMTrace.o(10958072184832L, 81644);
  }
  
  public static int atz()
  {
    GMTrace.i(10958206402560L, 81645);
    int i = kxz;
    GMTrace.o(10958206402560L, 81645);
    return i;
  }
  
  private boolean b(String paramString, final long paramLong, final int paramInt)
  {
    for (;;)
    {
      try
      {
        GMTrace.i(10959280144384L, 81653);
        int i = at.wS().DN();
        if ((i != 4) && (i != 6))
        {
          com.tencent.mm.sdk.platformtools.w.e("MicroMsg.exdevice.ExdeviceConnectManager", "now network is not avaiable, notify directly");
          GMTrace.o(10959280144384L, 81653);
          bool = false;
          return bool;
        }
        if (this.kxx.containsKey(Long.valueOf(paramLong)))
        {
          com.tencent.mm.sdk.platformtools.w.i("MicroMsg.exdevice.ExdeviceConnectManager", "now the device is syncing data : %s, %d, Just leave!!!", new Object[] { paramString, Long.valueOf(paramLong) });
          GMTrace.o(10959280144384L, 81653);
          bool = false;
          continue;
        }
        aj localaj = new aj(Looper.getMainLooper(), new aj.a()
        {
          public final boolean pM()
          {
            GMTrace.i(10983573553152L, 81834);
            int i = u.aus().bG(paramLong);
            com.tencent.mm.sdk.platformtools.w.i("MicroMsg.exdevice.ExdeviceConnectManager", "now it is time to check the sync connect state, brand name = %s, deviceid = %d, bluetooth version = %d, connect state = %d", new Object[] { paramInt, Long.valueOf(paramLong), Integer.valueOf(this.kxL), Integer.valueOf(i) });
            d.bv(paramLong);
            d.this.kxx.remove(Long.valueOf(paramLong));
            GMTrace.o(10983573553152L, 81834);
            return false;
          }
        }, false);
        long l = com.tencent.mm.plugin.exdevice.j.b.avg();
        com.tencent.mm.sdk.platformtools.w.i("MicroMsg.exdevice.ExdeviceConnectManager", "now sync time out is : %d", new Object[] { Long.valueOf(l) });
        localaj.z(l, l);
        this.kxx.put(Long.valueOf(paramLong), localaj);
        if (u.aut().kxo != null)
        {
          com.tencent.mm.sdk.platformtools.w.i("MicroMsg.exdevice.ExdeviceConnectManager", "start channel now : %s, %d", new Object[] { paramString, Long.valueOf(paramLong) });
          bool = u.aut().kxo.a(paramLong, paramInt, this.kxv);
          GMTrace.o(10959280144384L, 81653);
          continue;
        }
        com.tencent.mm.sdk.platformtools.w.e("MicroMsg.exdevice.ExdeviceConnectManager", "MMExDeviceCore.getTaskQueue().getDispatcher() == null");
      }
      finally {}
      GMTrace.o(10959280144384L, 81653);
      boolean bool = false;
    }
  }
  
  public static void bv(long paramLong)
  {
    GMTrace.i(10959011708928L, 81651);
    if (u.aut().kxo != null) {
      com.tencent.mm.sdk.platformtools.w.i("MicroMsg.exdevice.ExdeviceConnectManager", "now stop the devide channel : %d, result : %b", new Object[] { Long.valueOf(paramLong), Boolean.valueOf(u.aut().kxo.bN(paramLong)) });
    }
    GMTrace.o(10959011708928L, 81651);
  }
  
  public static boolean ea(boolean paramBoolean)
  {
    GMTrace.i(10959414362112L, 81654);
    if (u.aut().kxo != null)
    {
      long[] arrayOfLong = u.aut().kxo.aug();
      if ((arrayOfLong == null) || (arrayOfLong.length <= 0))
      {
        com.tencent.mm.sdk.platformtools.w.w("MicroMsg.exdevice.ExdeviceConnectManager", "connectedDevices = null or connectedDevices.length = 0");
        GMTrace.o(10959414362112L, 81654);
        return false;
      }
      int j = arrayOfLong.length;
      int i = 0;
      if (i < j)
      {
        long l = arrayOfLong[i];
        com.tencent.mm.sdk.platformtools.w.i("MicroMsg.exdevice.ExdeviceConnectManager", "deviceId = %s", new Object[] { Long.valueOf(l) });
        com.tencent.mm.plugin.exdevice.h.b localb = ad.atR().bR(l);
        if (localb == null) {
          com.tencent.mm.sdk.platformtools.w.w("MicroMsg.exdevice.ExdeviceConnectManager", "Get device info failed, deviceId = %s", new Object[] { Long.valueOf(l) });
        }
        for (;;)
        {
          i += 1;
          break;
          if ((paramBoolean) && ((localb.field_closeStrategy & 0x1) == 0))
          {
            com.tencent.mm.sdk.platformtools.w.i("MicroMsg.exdevice.ExdeviceConnectManager", "Device is not close after exit chatting, deviceId = %s", new Object[] { Long.valueOf(l) });
          }
          else
          {
            com.tencent.mm.sdk.platformtools.w.i("MicroMsg.exdevice.ExdeviceConnectManager", "Stop channel, deviceId = %s", new Object[] { Long.valueOf(l) });
            u.aut().kxo.bN(l);
          }
        }
      }
    }
    else
    {
      com.tencent.mm.sdk.platformtools.w.w("MicroMsg.exdevice.ExdeviceConnectManager", "MMExDeviceCore.getTaskQueue().getDispatcher is null!");
      GMTrace.o(10959414362112L, 81654);
      return false;
    }
    GMTrace.o(10959414362112L, 81654);
    return true;
  }
  
  public final void a(final int paramInt, j paramj)
  {
    GMTrace.i(10959548579840L, 81655);
    com.tencent.mm.sdk.platformtools.w.i("MicroMsg.exdevice.ExdeviceConnectManager", "scanLogic, bluetooth version = %d", new Object[] { Integer.valueOf(paramInt) });
    if (paramj == null)
    {
      com.tencent.mm.sdk.platformtools.w.e("MicroMsg.exdevice.ExdeviceConnectManager", "null == aCallback");
      GMTrace.o(10959548579840L, 81655);
      return;
    }
    this.kxA = paramj;
    if (this.kxu == null)
    {
      this.kxu = new com.tencent.mm.plugin.exdevice.service.c();
      this.kxu.kCW = new com.tencent.mm.plugin.exdevice.service.c.a(paramInt)
      {
        public final void onServiceConnected()
        {
          GMTrace.i(10923578228736L, 81387);
          if (!u.aut().kxo.b(paramInt, d.this.kxA)) {
            com.tencent.mm.sdk.platformtools.w.e("MicroMsg.exdevice.ExdeviceConnectManager", "scan failed!!!");
          }
          GMTrace.o(10923578228736L, 81387);
        }
      };
      this.kxu.ck(ab.getContext());
      GMTrace.o(10959548579840L, 81655);
      return;
    }
    com.tencent.mm.sdk.platformtools.w.i("MicroMsg.exdevice.ExdeviceConnectManager", "try start scan");
    if (u.aut().kxo == null)
    {
      com.tencent.mm.sdk.platformtools.w.e("MicroMsg.exdevice.ExdeviceConnectManager", "dispatcher is null.");
      GMTrace.o(10959548579840L, 81655);
      return;
    }
    if (!u.aut().kxo.b(paramInt, this.kxA)) {
      com.tencent.mm.sdk.platformtools.w.e("MicroMsg.exdevice.ExdeviceConnectManager", "scan failed!!!");
    }
    GMTrace.o(10959548579840L, 81655);
  }
  
  public final void a(Long paramLong, int paramInt)
  {
    try
    {
      GMTrace.i(10958474838016L, 81647);
      this.kxy.put(paramLong, Integer.valueOf(paramInt));
      GMTrace.o(10958474838016L, 81647);
      return;
    }
    finally
    {
      paramLong = finally;
      throw paramLong;
    }
  }
  
  public final void a(String paramString, long paramLong, int paramInt)
  {
    GMTrace.i(10958609055744L, 81648);
    a(paramString, paramLong, paramInt, false);
    GMTrace.o(10958609055744L, 81648);
  }
  
  public final void a(final String paramString, final long paramLong, int paramInt, boolean paramBoolean)
  {
    GMTrace.i(10958743273472L, 81649);
    com.tencent.mm.plugin.exdevice.h.a.v("shut_down_device", paramLong);
    if (this.kxu == null)
    {
      com.tencent.mm.sdk.platformtools.w.i("MicroMsg.exdevice.ExdeviceConnectManager", "Bind exdeviceService");
      this.kxu = new com.tencent.mm.plugin.exdevice.service.c();
      this.kxu.kCW = new com.tencent.mm.plugin.exdevice.service.c.a(paramInt)
      {
        public final void onServiceConnected()
        {
          GMTrace.i(10981157634048L, 81816);
          d.this.kxu.kCW = null;
          d.this.b(paramString, paramLong, this.eFC, this.hXC);
          GMTrace.o(10981157634048L, 81816);
        }
      };
      this.kxu.ck(ab.getContext());
      GMTrace.o(10958743273472L, 81649);
      return;
    }
    if ((this.kxu != null) && (!this.kxu.kCX))
    {
      com.tencent.mm.sdk.platformtools.w.i("MicroMsg.exdevice.ExdeviceConnectManager", "ExdeviceService setConnected");
      this.kxu.kCW = new com.tencent.mm.plugin.exdevice.service.c.a(paramInt)
      {
        public final void onServiceConnected()
        {
          GMTrace.i(10950555992064L, 81588);
          d.this.kxu.kCW = null;
          d.this.b(paramString, paramLong, this.eFC, this.hXC);
          GMTrace.o(10950555992064L, 81588);
        }
      };
      this.kxu.ck(ab.getContext());
      GMTrace.o(10958743273472L, 81649);
      return;
    }
    b(paramString, paramLong, paramInt, paramBoolean);
    GMTrace.o(10958743273472L, 81649);
  }
  
  public final void atA()
  {
    GMTrace.i(10959145926656L, 81652);
    if ((this.kxu != null) && (this.kxu.kCX)) {
      try
      {
        ab.getContext().unbindService(this.kxu);
        GMTrace.o(10959145926656L, 81652);
        return;
      }
      catch (Exception localException) {}
    }
    GMTrace.o(10959145926656L, 81652);
  }
  
  public final void b(String paramString, final long paramLong, final int paramInt, boolean paramBoolean)
  {
    GMTrace.i(10958877491200L, 81650);
    com.tencent.mm.sdk.platformtools.w.i("MicroMsg.exdevice.ExdeviceConnectManager", "doConnect");
    if (paramBoolean) {
      paramBoolean = b(paramString, paramLong, paramInt);
    }
    for (;;)
    {
      com.tencent.mm.sdk.platformtools.w.i("MicroMsg.exdevice.ExdeviceConnectManager", "startChannel Ret = %s", new Object[] { Boolean.valueOf(paramBoolean) });
      GMTrace.o(10958877491200L, 81650);
      return;
      if (at.wS().DN() != 4)
      {
        com.tencent.mm.sdk.platformtools.w.i("MicroMsg.exdevice.ExdeviceConnectManager", "now network is not avaiable, notify directly");
        paramBoolean = false;
      }
      else
      {
        aj localaj;
        if (this.kxw.containsKey(Long.valueOf(paramLong)))
        {
          com.tencent.mm.sdk.platformtools.w.i("MicroMsg.exdevice.ExdeviceConnectManager", "now the device is connecting, reset timer : brand name = %s, deviceid = %d, bluetooth version = %d", new Object[] { paramString, Long.valueOf(paramLong), Integer.valueOf(paramInt) });
          localaj = (aj)this.kxw.get(Long.valueOf(paramLong));
          localaj.stopTimer();
          localaj.z(30000L, 30000L);
        }
        for (;;)
        {
          if (u.aut().kxo != null) {
            break label292;
          }
          com.tencent.mm.sdk.platformtools.w.w("MicroMsg.exdevice.ExdeviceConnectManager", "MMExDeviceCore.getTaskQueue().getDispatcher() == null, Just leave, brand name is %s, device id is %d, bluetooth version is %d", new Object[] { paramString, Long.valueOf(paramLong), Integer.valueOf(paramInt) });
          paramBoolean = false;
          break;
          com.tencent.mm.sdk.platformtools.w.i("MicroMsg.exdevice.ExdeviceConnectManager", "the device is not connecting, brand name = %s, deviceid = %d, bluetooth version = %d", new Object[] { paramString, Long.valueOf(paramLong), Integer.valueOf(paramInt) });
          localaj = new aj(Looper.getMainLooper(), new aj.a()
          {
            public final boolean pM()
            {
              GMTrace.i(10961293410304L, 81668);
              int i = u.aus().bG(paramLong);
              com.tencent.mm.sdk.platformtools.w.i("MicroMsg.exdevice.ExdeviceConnectManager", "now it is time to notify ui show the connect time out tips, brand name = %s, deviceid = %d, bluetooth version = %d, connect state = %d", new Object[] { paramInt, Long.valueOf(paramLong), Integer.valueOf(this.kxL), Integer.valueOf(i) });
              if (i != 2)
              {
                ad.auc();
                e.aR(paramInt, 2);
              }
              d.this.kxw.remove(Long.valueOf(paramLong));
              GMTrace.o(10961293410304L, 81668);
              return false;
            }
          }, false);
          localaj.z(30000L, 30000L);
          this.kxw.put(Long.valueOf(paramLong), localaj);
        }
        label292:
        paramString = u.aus().bH(paramLong);
        if (paramString == null)
        {
          com.tencent.mm.sdk.platformtools.w.w("MicroMsg.exdevice.ExdeviceConnectManager", "Device unbond: %s", new Object[] { Long.valueOf(paramLong) });
          paramBoolean = false;
        }
        else
        {
          com.tencent.mm.sdk.platformtools.w.i("MicroMsg.exdevice.ExdeviceConnectManager", "onStateChange, connectState = %d ", new Object[] { Integer.valueOf(paramString.eFl) });
          if ((paramString.eFl != 2) && (paramString.eFl != 1)) {
            u.aut().kxo.a(paramLong, paramInt, this.kxv);
          }
          paramBoolean = true;
        }
      }
    }
  }
  
  public final void mW(int paramInt)
  {
    try
    {
      GMTrace.i(10958340620288L, 81646);
      com.tencent.mm.sdk.platformtools.w.i("MicroMsg.exdevice.ExdeviceConnectManager", "setConnectMode, mode = %d", new Object[] { Integer.valueOf(paramInt) });
      kxz = paramInt;
      GMTrace.o(10958340620288L, 81646);
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\exdevice\model\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */