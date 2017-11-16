package com.tencent.mm.plugin.g.a.b;

import android.annotation.TargetApi;
import android.bluetooth.BluetoothDevice;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.HandlerThread;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.exdevice.j.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.w;
import java.util.HashMap;
import java.util.HashSet;
import java.util.concurrent.locks.ReentrantLock;

@TargetApi(18)
public final class e
{
  public a jlJ;
  public HashSet<Long> jlK;
  public final HashMap<Long, Boolean> jlL;
  public f.a jlM;
  public final HashMap<Long, f> jla;
  public c jlc;
  public c.a jlf;
  public ae mHandler;
  private ReentrantLock mLock;
  public Runnable mRunnable;
  public Context sN;
  
  public e(a parama)
  {
    GMTrace.i(4826201063424L, 35958);
    this.sN = null;
    this.mLock = new ReentrantLock();
    this.mHandler = null;
    this.mRunnable = null;
    this.jlf = new c.a()
    {
      public final void ahb()
      {
        GMTrace.i(4832911949824L, 36008);
        w.d("MicroMsg.exdevice.BluetoothLESimpleManager", "------onDiscoverFinished------");
        if (e.this.jlJ != null) {
          e.this.jlJ.ahb();
        }
        for (;;)
        {
          e.this.jlK.clear();
          GMTrace.o(4832911949824L, 36008);
          return;
          w.w("MicroMsg.exdevice.BluetoothLESimpleManager", "no SimpleBLEManagerCallback");
        }
      }
      
      public final void c(BluetoothDevice paramAnonymousBluetoothDevice, int paramAnonymousInt, byte[] paramAnonymousArrayOfByte)
      {
        GMTrace.i(4832777732096L, 36007);
        long l = b.xh(paramAnonymousBluetoothDevice.getAddress());
        if (!e.this.jlK.contains(Long.valueOf(l)))
        {
          w.d("MicroMsg.exdevice.BluetoothLESimpleManager", "------onDiscover------ device Name = %s, mac = %s(%d), scanRecord = %s", new Object[] { paramAnonymousBluetoothDevice.getName(), paramAnonymousBluetoothDevice.getAddress(), Long.valueOf(l), b.al(paramAnonymousArrayOfByte) });
          e.this.jlK.add(Long.valueOf(l));
          if (com.tencent.mm.plugin.g.a.b.a.c.ab(paramAnonymousArrayOfByte)) {
            e.this.jlJ.a(paramAnonymousBluetoothDevice.getAddress(), paramAnonymousBluetoothDevice.getName(), paramAnonymousInt, paramAnonymousArrayOfByte);
          }
        }
        GMTrace.o(4832777732096L, 36007);
      }
    };
    this.jlK = new HashSet();
    this.jla = new HashMap();
    this.jlL = new HashMap();
    this.jlM = new f.a()
    {
      public final void a(final long paramAnonymousLong1, boolean paramAnonymousBoolean, final long paramAnonymousLong2)
      {
        GMTrace.i(4827274805248L, 35966);
        String str2 = b.bS(paramAnonymousLong1);
        if (paramAnonymousBoolean) {}
        for (String str1 = "true";; str1 = "false")
        {
          w.d("MicroMsg.exdevice.BluetoothLESimpleManager", "onConnected. mac = %s, connected = %s", new Object[] { str2, str1 });
          e.this.o(new Runnable()
          {
            public final void run()
            {
              GMTrace.i(4837072699392L, 36039);
              f localf = (f)e.this.jla.get(Long.valueOf(paramAnonymousLong1));
              if (!paramAnonymousLong2) {}
              for (int i = 1; (localf != null) || (i != 0); i = 0)
              {
                if (e.this.jlJ != null)
                {
                  e.this.jlJ.a(paramAnonymousLong1, paramAnonymousLong2, this.jlQ);
                  if (i != 0) {
                    w.d("MicroMsg.exdevice.BluetoothLESimpleManager", "disconnected, mBLEManagerCallback callback mac=%s", new Object[] { b.bS(paramAnonymousLong1) });
                  }
                }
                if (i == 0) {
                  break label214;
                }
                w.d("MicroMsg.exdevice.BluetoothLESimpleManager", "remove seesion(mac=%s)", new Object[] { b.bS(paramAnonymousLong1) });
                e.this.jla.remove(Long.valueOf(paramAnonymousLong1));
                e.this.jlL.remove(Long.valueOf(paramAnonymousLong1));
                GMTrace.o(4837072699392L, 36039);
                return;
              }
              w.e("MicroMsg.exdevice.BluetoothLESimpleManager", "no seesion(mac=%s) found", new Object[] { b.bS(paramAnonymousLong1) });
              label214:
              GMTrace.o(4837072699392L, 36039);
            }
          });
          w.d("MicroMsg.exdevice.BluetoothLESimpleManager", "session size = %d", new Object[] { Integer.valueOf(e.this.jla.size()) });
          GMTrace.o(4827274805248L, 35966);
          return;
        }
      }
      
      public final void b(long paramAnonymousLong, byte[] paramAnonymousArrayOfByte)
      {
        GMTrace.i(4827409022976L, 35967);
        w.d("MicroMsg.exdevice.BluetoothLESimpleManager", "onRecv. mac = %s", new Object[] { b.bS(paramAnonymousLong) });
        if (e.this.jlJ != null)
        {
          e.this.jlJ.b(paramAnonymousLong, paramAnonymousArrayOfByte);
          GMTrace.o(4827409022976L, 35967);
          return;
        }
        w.w("MicroMsg.exdevice.BluetoothLESimpleManager", "no BLEManagerCallback");
        GMTrace.o(4827409022976L, 35967);
      }
      
      public final void e(long paramAnonymousLong, boolean paramAnonymousBoolean)
      {
        GMTrace.i(4827543240704L, 35968);
        String str2 = b.bS(paramAnonymousLong);
        if (paramAnonymousBoolean) {}
        for (String str1 = "true";; str1 = "false")
        {
          w.d("MicroMsg.exdevice.BluetoothLESimpleManager", "onSend. mac = %s, success = %s", new Object[] { str2, str1 });
          if (e.this.jlJ != null) {
            e.this.jlJ.e(paramAnonymousLong, paramAnonymousBoolean);
          }
          GMTrace.o(4827543240704L, 35968);
          return;
        }
      }
    };
    this.sN = ab.getContext();
    this.jlJ = parama;
    this.jlc = c.ahc();
    this.mRunnable = new Runnable()
    {
      public final void run()
      {
        GMTrace.i(4818147999744L, 35898);
        e.this.jlc.a(false, e.this.jlf);
        w.i("MicroMsg.exdevice.BluetoothLESimpleManager", "Time out for discovering. Stop it");
        GMTrace.o(4818147999744L, 35898);
      }
    };
    this.mHandler = new ae(new af("BluetoothLESimpleManagerThread").ngv.getLooper());
    GMTrace.o(4826201063424L, 35958);
  }
  
  @TargetApi(18)
  public final boolean aha()
  {
    GMTrace.i(4826469498880L, 35960);
    boolean bool = this.sN.getPackageManager().hasSystemFeature("android.hardware.bluetooth_le");
    GMTrace.o(4826469498880L, 35960);
    return bool;
  }
  
  public final void o(Runnable paramRunnable)
  {
    GMTrace.i(4826335281152L, 35959);
    this.mLock.lock();
    paramRunnable.run();
    this.mLock.unlock();
    GMTrace.o(4826335281152L, 35959);
  }
  
  public static abstract class a
  {
    public a()
    {
      GMTrace.i(4827677458432L, 35969);
      GMTrace.o(4827677458432L, 35969);
    }
    
    public void a(long paramLong1, boolean paramBoolean, long paramLong2)
    {
      GMTrace.i(4827811676160L, 35970);
      GMTrace.o(4827811676160L, 35970);
    }
    
    public void a(String paramString1, String paramString2, int paramInt, byte[] paramArrayOfByte)
    {
      GMTrace.i(4828214329344L, 35973);
      GMTrace.o(4828214329344L, 35973);
    }
    
    public void ahb()
    {
      GMTrace.i(4828348547072L, 35974);
      GMTrace.o(4828348547072L, 35974);
    }
    
    public void b(long paramLong, byte[] paramArrayOfByte)
    {
      GMTrace.i(4827945893888L, 35971);
      GMTrace.o(4827945893888L, 35971);
    }
    
    public void e(long paramLong, boolean paramBoolean)
    {
      GMTrace.i(4828080111616L, 35972);
      GMTrace.o(4828080111616L, 35972);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\g\a\b\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */