package com.tencent.mm.plugin.appbrand.jsapi.wifi.wifisdk.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.wifi.WifiConfiguration;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.tencent.gmtrace.GMTrace;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public final class a
{
  public boolean ioH;
  public BroadcastReceiver ioI;
  public String ioL;
  public String ioM;
  private com.tencent.mm.plugin.appbrand.jsapi.wifi.wifisdk.a ioV;
  public Context ioW;
  a ioX;
  b ioY;
  public WifiConfiguration ioZ;
  public ConnectivityManager ipa;
  private int ipb;
  private final int ipc;
  public Handler mHandler;
  
  public a(com.tencent.mm.plugin.appbrand.jsapi.wifi.wifisdk.a parama, Context paramContext)
  {
    GMTrace.i(19820468764672L, 147674);
    this.mHandler = null;
    this.ioX = null;
    this.ioY = null;
    this.ioZ = null;
    this.ioH = false;
    this.ioI = null;
    this.ipb = 0;
    this.ipc = 13000;
    this.ioV = parama;
    this.ioW = paramContext;
    try
    {
      this.ipa = ((ConnectivityManager)this.ioW.getSystemService("connectivity"));
      this.mHandler = new Handler(paramContext.getMainLooper())
      {
        public final void handleMessage(Message paramAnonymousMessage)
        {
          GMTrace.i(19822482030592L, 147689);
          if (paramAnonymousMessage == null)
          {
            GMTrace.o(19822482030592L, 147689);
            return;
          }
          switch (paramAnonymousMessage.what)
          {
          }
          for (;;)
          {
            GMTrace.o(19822482030592L, 147689);
            return;
            if (!a.this.Yf()) {
              a.this.qX("fail to connect wifi:time out");
            }
          }
        }
      };
      GMTrace.o(19820468764672L, 147674);
      return;
    }
    catch (Exception parama)
    {
      for (;;) {}
    }
  }
  
  private static Object a(a parama, String paramString)
  {
    GMTrace.i(19820334546944L, 147673);
    paramString = Class.forName(paramString);
    parama = Proxy.newProxyInstance(paramString.getClassLoader(), new Class[] { paramString }, parama);
    GMTrace.o(19820334546944L, 147673);
    return parama;
  }
  
  public final boolean Yf()
  {
    GMTrace.i(19820737200128L, 147676);
    if ((this.ipb == 3) || (this.ipb == 2))
    {
      GMTrace.o(19820737200128L, 147676);
      return true;
    }
    GMTrace.o(19820737200128L, 147676);
    return false;
  }
  
  public final boolean a(WifiConfiguration paramWifiConfiguration)
  {
    GMTrace.i(19820602982400L, 147675);
    if ((paramWifiConfiguration == null) || (paramWifiConfiguration.networkId == d.ipg) || (this.ipa == null))
    {
      GMTrace.o(19820602982400L, 147675);
      return false;
    }
    try
    {
      Class localClass1 = Class.forName("android.net.wifi.WifiManager");
      if (Build.VERSION.SDK_INT < 16)
      {
        localClass1.getMethod("asyncConnect", new Class[] { Context.class, Handler.class }).invoke(c.aDQ, new Object[] { this.ioW, this.mHandler });
        localClass1.getMethod("connectNetwork", new Class[] { Integer.TYPE }).invoke(c.aDQ, new Object[] { Integer.valueOf(paramWifiConfiguration.networkId) });
        GMTrace.o(19820602982400L, 147675);
        return true;
      }
      if (Build.VERSION.SDK_INT == 16)
      {
        if (this.ioY == null) {
          this.ioY = new b();
        }
        localObject1 = a(this.ioX, "android.net.wifi.WifiManager$ChannelListener");
        localObject1 = localClass1.getMethod("initialize", new Class[] { Context.class, Looper.class, Class.forName("android.net.wifi.WifiManager$ChannelListener") }).invoke(c.aDQ, new Object[] { this.ioW, this.ioW.getMainLooper(), localObject1 });
        if (this.ioX == null) {
          this.ioX = new a();
        }
        localObject2 = a(this.ioX, "android.net.wifi.WifiManager$ActionListener");
        Class localClass2 = Class.forName("android.net.wifi.WifiManager$ActionListener");
        localClass1.getMethod("connect", new Class[] { Class.forName("android.net.wifi.WifiManager$Channel"), Integer.TYPE, localClass2 }).invoke(c.aDQ, new Object[] { localObject1, Integer.valueOf(paramWifiConfiguration.networkId), localObject2 });
        GMTrace.o(19820602982400L, 147675);
        return true;
      }
      if (this.ioX == null) {
        this.ioX = new a();
      }
      Object localObject1 = a(this.ioX, "android.net.wifi.WifiManager$ActionListener");
      Object localObject2 = Class.forName("android.net.wifi.WifiManager$ActionListener");
      localClass1.getMethod("connect", new Class[] { Integer.TYPE, localObject2 }).invoke(c.aDQ, new Object[] { Integer.valueOf(paramWifiConfiguration.networkId), localObject1 });
      GMTrace.o(19820602982400L, 147675);
      return true;
    }
    catch (Exception localException)
    {
      boolean bool = c.iS(paramWifiConfiguration.networkId);
      GMTrace.o(19820602982400L, 147675);
      return bool;
    }
  }
  
  public final void e(boolean paramBoolean, String paramString)
  {
    GMTrace.i(19821139853312L, 147679);
    if (!Yf())
    {
      if (this.ioV != null)
      {
        com.tencent.mm.plugin.appbrand.jsapi.wifi.wifisdk.a locala = this.ioV;
        if (paramBoolean) {
          paramString = "ok";
        }
        locala.qW(paramString);
      }
      this.mHandler.removeMessages(1);
      if (this.ioH)
      {
        this.ioW.unregisterReceiver(this.ioI);
        this.ioH = false;
      }
      if (!paramBoolean) {
        break label116;
      }
    }
    label116:
    for (int i = 2;; i = 3)
    {
      iQ(i);
      if ((!paramBoolean) && (this.ioZ != null)) {
        b.iR(this.ioZ.networkId);
      }
      GMTrace.o(19821139853312L, 147679);
      return;
    }
  }
  
  public final void iQ(int paramInt)
  {
    GMTrace.i(19821005635584L, 147678);
    StringBuilder localStringBuilder;
    String str;
    if (this.ipb != paramInt)
    {
      this.ipb = paramInt;
      localStringBuilder = new StringBuilder("switchState:");
      switch (this.ipb)
      {
      default: 
        str = "UnknowState";
      }
    }
    for (;;)
    {
      localStringBuilder.append(str);
      GMTrace.o(19821005635584L, 147678);
      return;
      str = "STATE_CONNECTED";
      continue;
      str = "STATE_CONNECTING";
      continue;
      str = "STATE_FAIL";
      continue;
      str = "STATE_NONE";
    }
  }
  
  public final void qX(String paramString)
  {
    GMTrace.i(19820871417856L, 147677);
    if (this.ioZ != null)
    {
      b.iR(this.ioZ.networkId);
      e(false, paramString);
      new StringBuilder("cancelConnect, ").append(d.qY(this.ioZ.SSID)).append(" networkId:").append(this.ioZ.networkId);
    }
    GMTrace.o(19820871417856L, 147677);
  }
  
  final class a
    implements InvocationHandler
  {
    a()
    {
      GMTrace.i(19823421554688L, 147696);
      GMTrace.o(19823421554688L, 147696);
    }
    
    public final Object invoke(Object paramObject, Method paramMethod, Object[] paramArrayOfObject)
    {
      GMTrace.i(19823555772416L, 147697);
      if (paramMethod.getName().compareTo("onSuccess") == 0)
      {
        GMTrace.o(19823555772416L, 147697);
        return null;
      }
      if (paramMethod.getName().compareTo("onFailure") == 0) {
        if ((paramArrayOfObject == null) || (!(paramArrayOfObject[0] instanceof Integer))) {
          break label97;
        }
      }
      label97:
      for (final int i = ((Integer)paramArrayOfObject[0]).intValue();; i = -1)
      {
        a.this.mHandler.post(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(19821676724224L, 147683);
            a.this.e(false, "fail to connect wifi:actionListener" + i);
            GMTrace.o(19821676724224L, 147683);
          }
        });
        GMTrace.o(19823555772416L, 147697);
        return null;
      }
    }
  }
  
  final class b
    implements InvocationHandler
  {
    b()
    {
      GMTrace.i(19821274071040L, 147680);
      GMTrace.o(19821274071040L, 147680);
    }
    
    public final Object invoke(Object paramObject, Method paramMethod, Object[] paramArrayOfObject)
    {
      GMTrace.i(19821408288768L, 147681);
      new StringBuilder("Method:").append(paramMethod).append(" getName:").append(paramMethod.getName()).append(" ,Args:").append(paramArrayOfObject);
      GMTrace.o(19821408288768L, 147681);
      return null;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\jsapi\wifi\wifisdk\internal\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */