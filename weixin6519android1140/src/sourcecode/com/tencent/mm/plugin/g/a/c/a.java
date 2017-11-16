package com.tencent.mm.plugin.g.a.c;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.HandlerThread;
import com.jg.JgClassChecked;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.w;
import java.util.HashMap;
import java.util.UUID;
import junit.framework.Assert;

@JgClassChecked(author=20, fComment="checked", lastDate="20140429", reviewer=20, vComment={com.jg.EType.RECEIVERCHECK})
public final class a
{
  public static final UUID joc;
  public static final UUID jod;
  public final BroadcastReceiver idj;
  public BluetoothAdapter jkt;
  public HashMap<Long, b> jla;
  public a joe;
  public Context jof;
  public ae mHandler;
  public boolean mIsInit;
  private Runnable mRunnable;
  
  static
  {
    GMTrace.i(4805397315584L, 35803);
    joc = UUID.fromString("e5b152ed-6b46-09e9-4678-665e9a972cbc");
    jod = UUID.fromString("e5b152ed-6b46-09e9-4678-665e9a972cbc");
    GMTrace.o(4805397315584L, 35803);
  }
  
  public a(af paramaf)
  {
    GMTrace.i(4804592009216L, 35797);
    this.mIsInit = false;
    this.idj = new BroadcastReceiver()
    {
      public final void onReceive(Context paramAnonymousContext, Intent paramAnonymousIntent)
      {
        GMTrace.i(4807007928320L, 35815);
        if (paramAnonymousIntent == null)
        {
          GMTrace.o(4807007928320L, 35815);
          return;
        }
        paramAnonymousContext = paramAnonymousIntent.getAction();
        w.i("MicroMsg.exdevice.BluetoothChatManager", "------onReceive------ action  = " + paramAnonymousContext);
        if ("android.bluetooth.device.action.FOUND".equals(paramAnonymousContext))
        {
          paramAnonymousContext = (BluetoothDevice)paramAnonymousIntent.getParcelableExtra("android.bluetooth.device.extra.DEVICE");
          if (paramAnonymousContext.getBondState() != 12) {
            a.this.joe.bw(paramAnonymousContext.getAddress(), paramAnonymousContext.getName());
          }
          GMTrace.o(4807007928320L, 35815);
          return;
        }
        if ("android.bluetooth.adapter.action.DISCOVERY_FINISHED".equals(paramAnonymousContext))
        {
          a.this.joe.ahb();
          GMTrace.o(4807007928320L, 35815);
          return;
        }
        if ("android.bluetooth.adapter.action.SCAN_MODE_CHANGED".equals(paramAnonymousContext))
        {
          switch (paramAnonymousIntent.getIntExtra("android.bluetooth.adapter.extra.SCAN_MODE", -1))
          {
          }
          for (;;)
          {
            GMTrace.o(4807007928320L, 35815);
            return;
            paramAnonymousContext = a.this.joe;
            GMTrace.o(4807007928320L, 35815);
            return;
            paramAnonymousContext = a.this.joe;
          }
        }
        if ("android.bluetooth.device.action.ACL_DISCONNECTED".equals(paramAnonymousContext))
        {
          paramAnonymousContext = (BluetoothDevice)paramAnonymousIntent.getParcelableExtra("android.bluetooth.device.extra.DEVICE");
          paramAnonymousIntent = paramAnonymousContext.getAddress();
          if (!a.this.jla.containsKey(Long.valueOf(com.tencent.mm.plugin.exdevice.j.b.xh(paramAnonymousIntent))))
          {
            GMTrace.o(4807007928320L, 35815);
            return;
          }
          w.i("MicroMsg.exdevice.BluetoothChatManager", "------ACTION_ACL_DISCONNECTED------ device name = %s, device Mac = %s", new Object[] { paramAnonymousContext.getName(), paramAnonymousIntent });
          if (a.this.joe != null) {
            a.this.joe.d(com.tencent.mm.plugin.exdevice.j.b.xh(paramAnonymousIntent), false);
          }
        }
        GMTrace.o(4807007928320L, 35815);
      }
    };
    this.jla = new HashMap();
    this.mHandler = new ae(paramaf.ngv.getLooper());
    this.mRunnable = new Runnable()
    {
      public final void run()
      {
        GMTrace.i(4805665751040L, 35805);
        if (a.this.jkt.isDiscovering()) {
          a.this.jkt.cancelDiscovery();
        }
        GMTrace.o(4805665751040L, 35805);
      }
    };
    GMTrace.o(4804592009216L, 35797);
  }
  
  private boolean aho()
  {
    GMTrace.i(4804860444672L, 35799);
    if (!this.jkt.isDiscovering())
    {
      GMTrace.o(4804860444672L, 35799);
      return true;
    }
    if (!this.jkt.cancelDiscovery())
    {
      w.e("MicroMsg.exdevice.BluetoothChatManager", "mAdapter.cancelDiscovery Failed!!!");
      GMTrace.o(4804860444672L, 35799);
      return false;
    }
    this.mHandler.removeCallbacks(this.mRunnable);
    GMTrace.o(4804860444672L, 35799);
    return true;
  }
  
  public final boolean ahn()
  {
    GMTrace.i(4804726226944L, 35798);
    Assert.assertTrue(this.mIsInit);
    if (this.jkt == null)
    {
      GMTrace.o(4804726226944L, 35798);
      return false;
    }
    GMTrace.o(4804726226944L, 35798);
    return true;
  }
  
  public final boolean dn(boolean paramBoolean)
  {
    GMTrace.i(4804994662400L, 35800);
    StringBuilder localStringBuilder = new StringBuilder("scanDevices");
    if (paramBoolean) {}
    for (String str = "true";; str = "false")
    {
      w.i("MicroMsg.exdevice.BluetoothChatManager", str);
      Assert.assertTrue(this.mIsInit);
      if (ahn()) {
        break;
      }
      w.e("MicroMsg.exdevice.BluetoothChatManager", "BC Unsupport!!!");
      GMTrace.o(4804994662400L, 35800);
      return false;
    }
    if (paramBoolean)
    {
      if ((this.jkt.isDiscovering()) && (!aho()))
      {
        GMTrace.o(4804994662400L, 35800);
        return false;
      }
      if (!this.jkt.startDiscovery())
      {
        w.e("MicroMsg.exdevice.BluetoothChatManager", "mAdapter.startDiscovery() Failed");
        GMTrace.o(4804994662400L, 35800);
        return false;
      }
      this.mHandler.postDelayed(this.mRunnable, 10000L);
      GMTrace.o(4804994662400L, 35800);
      return true;
    }
    paramBoolean = aho();
    GMTrace.o(4804994662400L, 35800);
    return paramBoolean;
  }
  
  public static abstract class a
  {
    public a()
    {
      GMTrace.i(4808081670144L, 35823);
      GMTrace.o(4808081670144L, 35823);
    }
    
    public void a(long paramLong1, long paramLong2, long paramLong3)
    {
      GMTrace.i(4808215887872L, 35824);
      GMTrace.o(4808215887872L, 35824);
    }
    
    public void ahb()
    {
      GMTrace.i(4808484323328L, 35826);
      GMTrace.o(4808484323328L, 35826);
    }
    
    public void b(long paramLong, int paramInt, String paramString)
    {
      GMTrace.i(4809021194240L, 35830);
      GMTrace.o(4809021194240L, 35830);
    }
    
    public void b(long paramLong, byte[] paramArrayOfByte)
    {
      GMTrace.i(4808752758784L, 35828);
      GMTrace.o(4808752758784L, 35828);
    }
    
    public void bw(String paramString1, String paramString2)
    {
      GMTrace.i(4808350105600L, 35825);
      GMTrace.o(4808350105600L, 35825);
    }
    
    public void d(long paramLong, boolean paramBoolean)
    {
      GMTrace.i(4808618541056L, 35827);
      GMTrace.o(4808618541056L, 35827);
    }
    
    public void e(long paramLong, boolean paramBoolean)
    {
      GMTrace.i(4808886976512L, 35829);
      GMTrace.o(4808886976512L, 35829);
    }
  }
  
  private final class b
    implements Runnable
  {
    private long jll;
    private long jlm;
    
    public b(long paramLong1, long paramLong2)
    {
      GMTrace.i(4806605275136L, 35812);
      this.jll = 0L;
      this.jlm = 0L;
      this.jll = paramLong1;
      this.jlm = paramLong2;
      GMTrace.o(4806605275136L, 35812);
    }
    
    public final void run()
    {
      GMTrace.i(4806739492864L, 35813);
      a locala = a.this;
      b localb1 = new b(this.jll);
      long l = localb1.mSessionId;
      b localb2 = (b)locala.jla.remove(Long.valueOf(l));
      if (localb2 != null) {
        localb2.disconnect();
      }
      locala.jla.put(Long.valueOf(l), localb1);
      if (a.this.joe != null) {
        a.this.joe.a(l, this.jll, this.jlm);
      }
      GMTrace.o(4806739492864L, 35813);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\g\a\c\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */