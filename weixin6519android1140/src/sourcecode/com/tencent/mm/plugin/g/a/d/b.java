package com.tencent.mm.plugin.g.a.d;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothManager;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Build.VERSION;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.compatible.util.f;
import com.tencent.mm.plugin.exdevice.service.v;
import com.tencent.mm.plugin.g.a.b.g;
import com.tencent.mm.plugin.g.a.c.a;
import com.tencent.mm.plugin.g.a.c.a.a;
import com.tencent.mm.plugin.g.a.c.a.b;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.w;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import junit.framework.Assert;

public final class b
{
  public com.tencent.mm.plugin.g.a.b.b joA;
  public a joB;
  public c joC;
  final HashSet<String> joD;
  private ae mHandler;
  
  public b(Context paramContext, c paramc, af paramaf)
  {
    GMTrace.i(4811437113344L, 35848);
    this.mHandler = null;
    this.joA = null;
    this.joB = null;
    this.joC = null;
    this.joD = new HashSet();
    this.joB = new a(paramaf);
    Object localObject;
    if (Build.VERSION.SDK_INT >= 18)
    {
      this.joA = new com.tencent.mm.plugin.g.a.b.b(paramaf);
      paramaf = this.joA;
      localObject = new b();
      w.i("MicroMsg.exdevice.BluetoothLEManager", "------init------");
      Assert.assertNotNull(paramContext);
      Assert.assertNotNull(localObject);
      if (!paramaf.mIsInit)
      {
        paramaf.mIsInit = true;
        paramaf.sN = paramContext;
        paramaf.jkZ = ((com.tencent.mm.plugin.g.a.b.b.a)localObject);
        paramaf.jlc = com.tencent.mm.plugin.g.a.b.c.ahc();
        if (f.et(21)) {
          paramaf.jld = g.ahl();
        }
        if (paramaf.aha()) {
          break label309;
        }
        w.w("MicroMsg.exdevice.BluetoothLEManager", "BLE Unsupport!!!");
      }
    }
    for (;;)
    {
      paramaf = this.joB;
      localObject = new a();
      w.i("MicroMsg.exdevice.BluetoothChatManager", "------init------");
      Assert.assertNotNull(paramContext);
      Assert.assertNotNull(localObject);
      if (!paramaf.mIsInit)
      {
        paramaf.mIsInit = true;
        paramaf.joe = ((a.a)localObject);
        paramaf.jof = paramContext;
        paramContext = new IntentFilter();
        paramContext.addAction("android.bluetooth.adapter.action.DISCOVERY_FINISHED");
        paramContext.addAction("android.bluetooth.device.action.FOUND");
        paramContext.addAction("android.bluetooth.adapter.action.SCAN_MODE_CHANGED");
        paramContext.addAction("android.bluetooth.device.action.ACL_DISCONNECTED");
        paramaf.jof.registerReceiver(paramaf.idj, paramContext);
        paramaf.jkt = BluetoothAdapter.getDefaultAdapter();
      }
      this.mHandler = new c(v.auu().kxr.ngv.getLooper(), this);
      this.joC = paramc;
      GMTrace.o(4811437113344L, 35848);
      return;
      label309:
      paramaf.jkt = ((BluetoothManager)paramaf.sN.getSystemService("bluetooth")).getAdapter();
    }
  }
  
  public final boolean a(int paramInt, int... paramVarArgs)
  {
    GMTrace.i(4811571331072L, 35849);
    w.i("MicroMsg.exdevice.BluetoothSDKManager", "---scan--- aBluetoothVersion = " + paramInt);
    switch (paramInt)
    {
    default: 
      Assert.assertTrue(false);
      GMTrace.o(4811571331072L, 35849);
      return false;
    case 1: 
      if (this.joB == null)
      {
        w.e("MicroMsg.exdevice.BluetoothSDKManager", "mMrgBC == null");
        GMTrace.o(4811571331072L, 35849);
        return false;
      }
      bool = this.joB.dn(true);
      GMTrace.o(4811571331072L, 35849);
      return bool;
    }
    if (this.joA == null)
    {
      w.e("MicroMsg.exdevice.BluetoothSDKManager", "mMrgBLE == null");
      GMTrace.o(4811571331072L, 35849);
      return false;
    }
    if (paramVarArgs == null)
    {
      bool = this.joA.a(true, new int[0]);
      GMTrace.o(4811571331072L, 35849);
      return bool;
    }
    boolean bool = this.joA.a(true, paramVarArgs);
    GMTrace.o(4811571331072L, 35849);
    return bool;
  }
  
  public final void c(long paramLong1, long paramLong2, int paramInt)
  {
    GMTrace.i(4811705548800L, 35850);
    w.i("MicroMsg.exdevice.BluetoothSDKManager", "***createSession*** deviceId = " + paramLong1 + "aBluetoothVersion = " + paramInt);
    switch (paramInt)
    {
    default: 
      Assert.assertTrue(false);
      GMTrace.o(4811705548800L, 35850);
      return;
    case 1: 
      if (this.joB == null)
      {
        w.e("MicroMsg.exdevice.BluetoothSDKManager", "mMrgBC == null");
        GMTrace.o(4811705548800L, 35850);
        return;
      }
      localObject = this.joB;
      w.i("MicroMsg.exdevice.BluetoothChatManager", "createSession");
      Assert.assertTrue(((a)localObject).mIsInit);
      if (!((a)localObject).ahn())
      {
        w.e("MicroMsg.exdevice.BluetoothChatManager", "BC Unsupport!!!");
        GMTrace.o(4811705548800L, 35850);
        return;
      }
      Assert.assertTrue(((a)localObject).mHandler.post(new a.b((a)localObject, paramLong1, paramLong2)));
      GMTrace.o(4811705548800L, 35850);
      return;
    }
    if (this.joA == null)
    {
      w.e("MicroMsg.exdevice.BluetoothSDKManager", "mMrgBLE == null");
      GMTrace.o(4811705548800L, 35850);
      return;
    }
    Object localObject = this.joA;
    w.i("MicroMsg.exdevice.BluetoothLEManager", "------createSession------ macAddr = %d channelId = %d", new Object[] { Long.valueOf(paramLong1), Long.valueOf(paramLong2) });
    Assert.assertTrue(((com.tencent.mm.plugin.g.a.b.b)localObject).mIsInit);
    if (!((com.tencent.mm.plugin.g.a.b.b)localObject).aha())
    {
      w.e("MicroMsg.exdevice.BluetoothLEManager", "BLE Unsupport");
      GMTrace.o(4811705548800L, 35850);
      return;
    }
    Assert.assertTrue(((com.tencent.mm.plugin.g.a.b.b)localObject).mHandler.post(new com.tencent.mm.plugin.g.a.b.b.b((com.tencent.mm.plugin.g.a.b.b)localObject, paramLong1, paramLong2)));
    GMTrace.o(4811705548800L, 35850);
  }
  
  public final boolean e(int paramInt1, int paramInt2, Object paramObject)
  {
    GMTrace.i(16023986110464L, 119388);
    boolean bool = this.mHandler.sendMessage(this.mHandler.obtainMessage(paramInt1, paramInt2, 0, paramObject));
    GMTrace.o(16023986110464L, 119388);
    return bool;
  }
  
  final class a
    extends a.a
  {
    a()
    {
      GMTrace.i(4812376637440L, 35855);
      GMTrace.o(4812376637440L, 35855);
    }
    
    public final void a(long paramLong1, long paramLong2, long paramLong3)
    {
      GMTrace.i(4812510855168L, 35856);
      w.i("MicroMsg.exdevice.BluetoothSDKManager", "***BC onSessionCreate*** sessionID = " + paramLong1 + " deviceID = " + paramLong2);
      b.d locald = new b.d(paramLong1, paramLong2, paramLong3);
      Assert.assertTrue(b.this.e(6, 1, locald));
      GMTrace.o(4812510855168L, 35856);
    }
    
    public final void ahb()
    {
      GMTrace.i(4812645072896L, 35857);
      w.i("MicroMsg.exdevice.BluetoothSDKManager", "***BC onDiscoverFinished***");
      b.this.joD.clear();
      Assert.assertTrue(b.this.e(2, 1, null));
      GMTrace.o(4812645072896L, 35857);
    }
    
    public final void b(long paramLong, int paramInt, String paramString)
    {
      GMTrace.i(4813316161536L, 35862);
      w.i("MicroMsg.exdevice.BluetoothSDKManager", "***BC onError*** SessionId = " + paramLong + " errorCode = " + paramInt + " errorInfo = " + paramString);
      paramString = new b.g(paramLong, paramInt, paramString);
      Assert.assertTrue(b.this.e(5, 1, paramString));
      GMTrace.o(4813316161536L, 35862);
    }
    
    public final void b(long paramLong, byte[] paramArrayOfByte)
    {
      GMTrace.i(4813047726080L, 35860);
      w.i("MicroMsg.exdevice.BluetoothSDKManager", "***BC onRecv*** sessionId = " + paramLong);
      paramArrayOfByte = new b.h(paramLong, paramArrayOfByte);
      Assert.assertTrue(b.this.e(1, 1, paramArrayOfByte));
      GMTrace.o(4813047726080L, 35860);
    }
    
    public final void bw(String paramString1, String paramString2)
    {
      GMTrace.i(4812779290624L, 35858);
      b localb = b.this;
      int i;
      if (paramString1 == null)
      {
        w.e("MicroMsg.exdevice.BluetoothSDKManager", "null == aDeviceMac");
        i = 0;
      }
      while (i == 0)
      {
        GMTrace.o(4812779290624L, 35858);
        return;
        if (localb.joD.contains(paramString1))
        {
          i = 0;
        }
        else
        {
          localb.joD.add(paramString1);
          i = 1;
        }
      }
      w.i("MicroMsg.exdevice.BluetoothSDKManager", "***BC onDiscover*** deviceMac = " + paramString1 + "deviceName = " + paramString2);
      paramString1 = new b.i(paramString1, paramString2, 0, null);
      Assert.assertTrue(b.this.e(3, 1, paramString1));
      GMTrace.o(4812779290624L, 35858);
    }
    
    public final void d(long paramLong, boolean paramBoolean)
    {
      GMTrace.i(4812913508352L, 35859);
      w.i("MicroMsg.exdevice.BluetoothSDKManager", "***BC onConnected*** SessionId = " + paramLong + " Connected = " + paramBoolean);
      b.f localf = new b.f(paramLong, paramBoolean);
      Assert.assertTrue(b.this.e(4, 1, localf));
      GMTrace.o(4812913508352L, 35859);
    }
    
    public final void e(long paramLong, boolean paramBoolean)
    {
      GMTrace.i(4813181943808L, 35861);
      w.i("MicroMsg.exdevice.BluetoothSDKManager", "***BC onSend*** SessionId = " + paramLong + " success = " + paramBoolean);
      b.j localj = new b.j(paramLong, paramBoolean);
      Assert.assertTrue(b.this.e(0, 1, localj));
      GMTrace.o(4813181943808L, 35861);
    }
  }
  
  final class b
    extends com.tencent.mm.plugin.g.a.b.b.a
  {
    b()
    {
      GMTrace.i(4813584596992L, 35864);
      GMTrace.o(4813584596992L, 35864);
    }
    
    public final void a(long paramLong1, long paramLong2, long paramLong3)
    {
      GMTrace.i(4813718814720L, 35865);
      w.i("MicroMsg.exdevice.BluetoothSDKManager", "***BLE onSessionCreate*** sessionID = " + paramLong1 + " deviceID = " + paramLong2);
      b.d locald = new b.d(paramLong1, paramLong2, paramLong3);
      Assert.assertTrue(b.this.e(6, 0, locald));
      GMTrace.o(4813718814720L, 35865);
    }
    
    public final void a(String paramString1, String paramString2, int paramInt, byte[] paramArrayOfByte)
    {
      GMTrace.i(4813987250176L, 35867);
      w.d("MicroMsg.exdevice.BluetoothSDKManager", "---BLE onDiscover---, %s, %s", new Object[] { paramString1, paramString2 });
      paramString1 = new b.i(paramString1, paramString2, paramInt, paramArrayOfByte);
      Assert.assertTrue(b.this.e(3, 0, paramString1));
      GMTrace.o(4813987250176L, 35867);
    }
    
    public final void ahb()
    {
      GMTrace.i(4813853032448L, 35866);
      w.i("MicroMsg.exdevice.BluetoothSDKManager", "***BLE onDiscoverFinished***");
      b.this.joD.clear();
      Assert.assertTrue(b.this.e(2, 0, null));
      GMTrace.o(4813853032448L, 35866);
    }
    
    public final void b(long paramLong, byte[] paramArrayOfByte)
    {
      GMTrace.i(4814255685632L, 35869);
      w.i("MicroMsg.exdevice.BluetoothSDKManager", "***BLE onRecv*** sessionId = " + paramLong);
      paramArrayOfByte = new b.h(paramLong, paramArrayOfByte);
      Assert.assertTrue(b.this.e(1, 0, paramArrayOfByte));
      GMTrace.o(4814255685632L, 35869);
    }
    
    public final void d(long paramLong, boolean paramBoolean)
    {
      GMTrace.i(4814121467904L, 35868);
      w.i("MicroMsg.exdevice.BluetoothSDKManager", "***BLE onConnected*** SessionId = " + paramLong + " Connected = " + paramBoolean);
      b.f localf = new b.f(paramLong, paramBoolean);
      Assert.assertTrue(b.this.e(4, 0, localf));
      GMTrace.o(4814121467904L, 35868);
    }
    
    public final void e(long paramLong, boolean paramBoolean)
    {
      GMTrace.i(4814389903360L, 35870);
      w.i("MicroMsg.exdevice.BluetoothSDKManager", "***BLE onSend*** SessionId = " + paramLong + " success = " + paramBoolean);
      b.j localj = new b.j(paramLong, paramBoolean);
      Assert.assertTrue(b.this.e(0, 0, localj));
      GMTrace.o(4814389903360L, 35870);
    }
  }
  
  static final class c
    extends ae
  {
    private WeakReference<b> jlI;
    
    public c(Looper paramLooper, b paramb)
    {
      super();
      GMTrace.i(4811973984256L, 35852);
      this.jlI = null;
      this.jlI = new WeakReference(paramb);
      GMTrace.o(4811973984256L, 35852);
    }
    
    public final void handleMessage(Message paramMessage)
    {
      GMTrace.i(4812108201984L, 35853);
      b localb = (b)this.jlI.get();
      if (localb == null)
      {
        w.w("MicroMsg.exdevice.BluetoothSDKManager", "null == BluetoothSdkManager");
        GMTrace.o(4812108201984L, 35853);
        return;
      }
      w.i("MicroMsg.exdevice.BluetoothSDKManager", "handleMessage Message.What = " + paramMessage.what);
      switch (paramMessage.what)
      {
      }
      for (;;)
      {
        GMTrace.o(4812108201984L, 35853);
        return;
        paramMessage = (b.f)paramMessage.obj;
        localb.joC.d(paramMessage.joG, paramMessage.joH);
        GMTrace.o(4812108201984L, 35853);
        return;
        paramMessage = (b.g)paramMessage.obj;
        localb.joC.aT(paramMessage.mSessionId);
        GMTrace.o(4812108201984L, 35853);
        return;
        paramMessage = (b.h)paramMessage.obj;
        localb.joC.b(paramMessage.mSessionId, paramMessage.jkV);
        GMTrace.o(4812108201984L, 35853);
        return;
        localb.joC.kX(paramMessage.arg1);
        GMTrace.o(4812108201984L, 35853);
        return;
        b.i locali = (b.i)paramMessage.obj;
        localb.joC.a(locali.joI, locali.joJ, paramMessage.arg1, locali.joK, locali.joL);
        GMTrace.o(4812108201984L, 35853);
        return;
        paramMessage = (b.j)paramMessage.obj;
        localb.joC.e(paramMessage.joG, paramMessage.joH);
        GMTrace.o(4812108201984L, 35853);
        return;
        paramMessage = (b.d)paramMessage.obj;
        localb.joC.a(paramMessage.mSessionId, paramMessage.joF, paramMessage.jlm);
      }
    }
  }
  
  private static final class d
  {
    long jlm;
    long joF;
    long mSessionId;
    
    public d(long paramLong1, long paramLong2, long paramLong3)
    {
      GMTrace.i(4814792556544L, 35873);
      this.mSessionId = paramLong1;
      this.joF = paramLong2;
      this.jlm = paramLong3;
      GMTrace.o(4814792556544L, 35873);
    }
  }
  
  private static class e
  {
    long joG;
    boolean joH;
    
    public e(long paramLong, boolean paramBoolean)
    {
      GMTrace.i(4810900242432L, 35844);
      this.joG = paramLong;
      this.joH = paramBoolean;
      GMTrace.o(4810900242432L, 35844);
    }
  }
  
  private static final class f
    extends b.e
  {
    public f(long paramLong, boolean paramBoolean)
    {
      super(paramBoolean);
      GMTrace.i(4813450379264L, 35863);
      GMTrace.o(4813450379264L, 35863);
    }
  }
  
  private static final class g
  {
    private int mErrorCode;
    private String mErrorInfo;
    long mSessionId;
    
    public g(long paramLong, int paramInt, String paramString)
    {
      GMTrace.i(4812242419712L, 35854);
      this.mSessionId = paramLong;
      this.mErrorCode = paramInt;
      this.mErrorInfo = paramString;
      GMTrace.o(4812242419712L, 35854);
    }
  }
  
  private static final class h
  {
    byte[] jkV;
    long mSessionId;
    
    public h(long paramLong, byte[] paramArrayOfByte)
    {
      GMTrace.i(4811302895616L, 35847);
      this.mSessionId = paramLong;
      this.jkV = paramArrayOfByte;
      GMTrace.o(4811302895616L, 35847);
    }
  }
  
  private static final class i
  {
    String joI;
    String joJ;
    int joK;
    byte[] joL;
    
    public i(String paramString1, String paramString2, int paramInt, byte[] paramArrayOfByte)
    {
      GMTrace.i(4811168677888L, 35846);
      this.joI = paramString1;
      this.joJ = paramString2;
      this.joK = paramInt;
      this.joL = paramArrayOfByte;
      GMTrace.o(4811168677888L, 35846);
    }
  }
  
  private static final class j
    extends b.e
  {
    public j(long paramLong, boolean paramBoolean)
    {
      super(paramBoolean);
      GMTrace.i(4810766024704L, 35843);
      GMTrace.o(4810766024704L, 35843);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\g\a\d\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */