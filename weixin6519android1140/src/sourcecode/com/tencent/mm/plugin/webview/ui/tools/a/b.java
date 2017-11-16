package com.tencent.mm.plugin.webview.ui.tools.a;

import android.content.Context;
import android.os.Bundle;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.a.dq;
import com.tencent.mm.g.a.dq.a;
import com.tencent.mm.g.a.dr;
import com.tencent.mm.g.a.dr.a;
import com.tencent.mm.g.a.ds;
import com.tencent.mm.g.a.ds.a;
import com.tencent.mm.g.a.dt;
import com.tencent.mm.g.a.dt.a;
import com.tencent.mm.g.a.dw;
import com.tencent.mm.g.a.dw.b;
import com.tencent.mm.g.a.ec;
import com.tencent.mm.g.a.ec.b;
import com.tencent.mm.g.a.kx;
import com.tencent.mm.g.a.kx.a;
import com.tencent.mm.plugin.webview.stub.e;
import com.tencent.mm.pluginsdk.ui.tools.r.a;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.b.c;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;

public final class b
  implements r.a
{
  private static final byte[] kAc;
  private static b rOd;
  public String eEs;
  public boolean hasInit;
  public byte[] rNT;
  public boolean rNV;
  public a rOc;
  public int rOe;
  public boolean rOf;
  
  static
  {
    GMTrace.i(12295820279808L, 91611);
    kAc = new byte[] { -2, 1, 1 };
    GMTrace.o(12295820279808L, 91611);
  }
  
  private b()
  {
    GMTrace.i(12294880755712L, 91604);
    this.hasInit = false;
    this.rNT = null;
    this.rOe = -1;
    this.rNV = false;
    this.rOf = false;
    GMTrace.o(12294880755712L, 91604);
  }
  
  public static boolean aU(byte[] paramArrayOfByte)
  {
    GMTrace.i(12295417626624L, 91608);
    if ((paramArrayOfByte != null) && (paramArrayOfByte.length >= 9) && (paramArrayOfByte[(paramArrayOfByte.length - 7)] == 1) && (paramArrayOfByte[(paramArrayOfByte.length - 8)] == 1) && (paramArrayOfByte[(paramArrayOfByte.length - 9)] == -2))
    {
      GMTrace.o(12295417626624L, 91608);
      return true;
    }
    GMTrace.o(12295417626624L, 91608);
    return false;
  }
  
  public static b bEH()
  {
    GMTrace.i(12295014973440L, 91605);
    if (rOd == null) {
      rOd = new b();
    }
    b localb = rOd;
    GMTrace.o(12295014973440L, 91605);
    return localb;
  }
  
  public final void bEF()
  {
    GMTrace.i(12295283408896L, 91607);
    w.i("MicroMsg.webview.WebViewExDeviceMgr", "stopPlugin, isScaning = %s", new Object[] { Boolean.valueOf(this.rNV) });
    if (this.rNV)
    {
      localObject = new dw();
      ((dw)localObject).eFA.eEt = false;
      ((dw)localObject).eFA.eEs = this.eEs;
      a.vgX.m((com.tencent.mm.sdk.b.b)localObject);
      if (!((dw)localObject).eFB.eEu) {
        w.e("MicroMsg.webview.WebViewExDeviceMgr", "stopScanWXDevice fail");
      }
      this.rNV = false;
    }
    this.hasInit = false;
    if (this.rOc != null)
    {
      a.vgX.c(this.rOc.rOg);
      a.vgX.c(this.rOc.rOh);
      a.vgX.c(this.rOc.rOi);
      a.vgX.c(this.rOc.rNW);
      a.vgX.c(this.rOc.oQN);
      this.rOc = null;
    }
    this.rNT = null;
    Object localObject = new ec();
    ((ec)localObject).eFR.esG = "";
    ((ec)localObject).eFR.direction = 0;
    ((ec)localObject).eFR.clear = true;
    a.vgX.m((com.tencent.mm.sdk.b.b)localObject);
    w.i("MicroMsg.webview.WebViewExDeviceMgr", "stop EcDeviceMgr for webview %s", new Object[] { Boolean.valueOf(((ec)localObject).eFS.eEu) });
    GMTrace.o(12295283408896L, 91607);
  }
  
  public final void bEG()
  {
    GMTrace.i(12295686062080L, 91610);
    GMTrace.o(12295686062080L, 91610);
  }
  
  public final void du(Context paramContext)
  {
    GMTrace.i(12295551844352L, 91609);
    GMTrace.o(12295551844352L, 91609);
  }
  
  public final String getName()
  {
    GMTrace.i(12295149191168L, 91606);
    GMTrace.o(12295149191168L, 91606);
    return "WebViewExDeviceMgr";
  }
  
  public static final class a
  {
    private String eEs;
    public c oQN;
    private e rEM;
    public c rNW;
    public c rOg;
    public c rOh;
    public c rOi;
    
    public a(e parame, String paramString)
    {
      GMTrace.i(12297833545728L, 91626);
      this.rEM = null;
      this.eEs = "";
      this.rOg = new c() {};
      this.rOh = new c() {};
      this.rNW = new c() {};
      this.rOi = new c() {};
      this.oQN = new c() {};
      this.rEM = parame;
      this.eEs = paramString;
      GMTrace.o(12297833545728L, 91626);
    }
    
    public final boolean h(com.tencent.mm.sdk.b.b paramb)
    {
      GMTrace.i(12297967763456L, 91627);
      if (paramb == null)
      {
        GMTrace.o(12297967763456L, 91627);
        return false;
      }
      if (this.rEM == null)
      {
        w.e("MicroMsg.webview.WebViewExDeviceMgr", "callbacker is null");
        GMTrace.o(12297967763456L, 91627);
        return false;
      }
      Object localObject;
      try
      {
        if ((paramb instanceof dt))
        {
          w.i("MicroMsg.webview.WebViewExDeviceMgr", "ExDeviceOnScanDeviceResultEvent");
          paramb = (dt)paramb;
          localObject = new Bundle();
          ((Bundle)localObject).putString("exdevice_device_id", paramb.eFx.esG);
          ((Bundle)localObject).putByteArray("exdevice_broadcast_data", paramb.eFx.eFo);
          ((Bundle)localObject).putBoolean("exdevice_is_complete", paramb.eFx.eFp);
          this.rEM.m(15, (Bundle)localObject);
        }
        for (;;)
        {
          GMTrace.o(12297967763456L, 91627);
          return true;
          if (!(paramb instanceof ds)) {
            break;
          }
          w.i("MicroMsg.webview.WebViewExDeviceMgr", "ExDeviceOnRecvDataFromDeviceEvent");
          paramb = (ds)paramb;
          if ((!bg.nm(paramb.eFw.esG)) && (!bg.nm(paramb.eFw.eEs)))
          {
            localObject = paramb.eFw.data;
            if (localObject != null) {}
          }
          else
          {
            GMTrace.o(12297967763456L, 91627);
            return true;
          }
          localObject = new Bundle();
          ((Bundle)localObject).putString("exdevice_device_id", paramb.eFw.esG);
          ((Bundle)localObject).putByteArray("exdevice_data", paramb.eFw.data);
          ((Bundle)localObject).putString("exdevice_brand_name", paramb.eFw.eEs);
          this.rEM.m(16, (Bundle)localObject);
        }
      }
      catch (Exception paramb)
      {
        do
        {
          for (;;)
          {
            w.w("MicroMsg.webview.WebViewExDeviceMgr", "exception in WVExDeviceEventListener callback, %s", new Object[] { paramb.getMessage() });
            continue;
            boolean bool;
            if ((paramb instanceof dr))
            {
              w.d("MicroMsg.webview.WebViewExDeviceMgr", "ExDeviceOnDeviceBindStateChangeEvent");
              paramb = (dr)paramb;
              bool = bg.nm(paramb.eFv.esG);
              if (bool)
              {
                GMTrace.o(12297967763456L, 91627);
                return true;
              }
              localObject = new Bundle();
              ((Bundle)localObject).putString("exdevice_device_id", paramb.eFv.esG);
              ((Bundle)localObject).putBoolean("exdevice_is_bound", paramb.eFv.eEp);
              this.rEM.m(17, (Bundle)localObject);
            }
            else
            {
              if (!(paramb instanceof kx)) {
                break;
              }
              paramb = (kx)paramb;
              int i = paramb.ePc.op;
              if (i != 2)
              {
                GMTrace.o(12297967763456L, 91627);
                return true;
              }
              if (!bg.nm(paramb.ePc.eMz))
              {
                bool = this.eEs.equals(paramb.ePc.eMz);
                if (bool) {}
              }
              else
              {
                GMTrace.o(12297967763456L, 91627);
                return true;
              }
              localObject = new Bundle();
              ((Bundle)localObject).putString("exdevice_device_id", paramb.ePc.esG);
              ((Bundle)localObject).putInt("exdevice_on_state_change_state", paramb.ePc.eFl);
              this.rEM.m(1004, (Bundle)localObject);
            }
          }
        } while (!(paramb instanceof dq));
        paramb = (dq)paramb;
        localObject = new Bundle();
        if (paramb.eFt.eFu != 12) {
          break label587;
        }
      }
      ((Bundle)localObject).putBoolean("exdevice_bt_state", true);
      for (;;)
      {
        this.rEM.m(18, (Bundle)localObject);
        break;
        label587:
        ((Bundle)localObject).putBoolean("exdevice_bt_state", false);
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\webview\ui\tools\a\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */