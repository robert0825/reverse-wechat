package com.tencent.mm.plugin.webview.ui.tools.a;

import android.content.Context;
import android.os.Bundle;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.a.dl;
import com.tencent.mm.g.a.dl.a;
import com.tencent.mm.g.a.dm;
import com.tencent.mm.g.a.dm.a;
import com.tencent.mm.g.a.dn;
import com.tencent.mm.g.a.dn.a;
import com.tencent.mm.g.a.do;
import com.tencent.mm.g.a.do.a;
import com.tencent.mm.g.a.dr;
import com.tencent.mm.g.a.dr.a;
import com.tencent.mm.g.a.dv;
import com.tencent.mm.g.a.em;
import com.tencent.mm.plugin.webview.stub.e;
import com.tencent.mm.pluginsdk.ui.tools.r.a;
import com.tencent.mm.sdk.b.b;
import com.tencent.mm.sdk.b.c;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;

public final class a
  implements r.a
{
  public static String DEVICE_TYPE;
  private static a rNS;
  public String eEs;
  public boolean hasInit;
  public a rNR;
  public byte[] rNT;
  private int rNU;
  public boolean rNV;
  
  static
  {
    GMTrace.i(12294209667072L, 91599);
    DEVICE_TYPE = "lan";
    GMTrace.o(12294209667072L, 91599);
  }
  
  private a()
  {
    GMTrace.i(12293270142976L, 91592);
    this.hasInit = false;
    this.rNT = null;
    this.rNU = -1;
    this.rNV = false;
    GMTrace.o(12293270142976L, 91592);
  }
  
  public static a bEE()
  {
    GMTrace.i(12293404360704L, 91593);
    if (rNS == null) {
      rNS = new a();
    }
    a locala = rNS;
    GMTrace.o(12293404360704L, 91593);
    return locala;
  }
  
  public final void bEF()
  {
    GMTrace.i(12293672796160L, 91595);
    w.i("MicroMsg.webview.WebViewExDeviceLanMgr", "stopPlugin, isScaning = %s", new Object[] { Boolean.valueOf(this.rNV) });
    if (this.rNV)
    {
      localObject = new em();
      ((em)localObject).eGj.eEt = false;
      com.tencent.mm.sdk.b.a.vgX.m((b)localObject);
      this.rNV = false;
    }
    this.hasInit = false;
    if (this.rNR != null)
    {
      com.tencent.mm.sdk.b.a.vgX.c(this.rNR.rNW);
      com.tencent.mm.sdk.b.a.vgX.c(this.rNR.rNX);
      com.tencent.mm.sdk.b.a.vgX.c(this.rNR.rNZ);
      com.tencent.mm.sdk.b.a.vgX.c(this.rNR.rNY);
      com.tencent.mm.sdk.b.a.vgX.c(this.rNR.rOa);
      this.rNR = null;
    }
    this.rNT = null;
    Object localObject = new dv();
    ((dv)localObject).eFz.eEt = false;
    com.tencent.mm.sdk.b.a.vgX.m((b)localObject);
    GMTrace.o(12293672796160L, 91595);
  }
  
  public final void bEG()
  {
    GMTrace.i(12293941231616L, 91597);
    GMTrace.o(12293941231616L, 91597);
  }
  
  public final void du(Context paramContext)
  {
    GMTrace.i(12293807013888L, 91596);
    GMTrace.o(12293807013888L, 91596);
  }
  
  public final String getName()
  {
    GMTrace.i(12293538578432L, 91594);
    GMTrace.o(12293538578432L, 91594);
    return "WebViewExDeviceLanMgr";
  }
  
  public static final class a
  {
    private String eEs;
    private e rEM;
    public c rNW;
    public c rNX;
    public c rNY;
    public c rNZ;
    public c rOa;
    
    public a(e parame, String paramString)
    {
      GMTrace.i(12298101981184L, 91628);
      this.rEM = null;
      this.eEs = "";
      this.rNW = new c() {};
      this.rNX = new c() {};
      this.rNY = new c() {};
      this.rNZ = new c() {};
      this.rOa = new c() {};
      this.rEM = parame;
      this.eEs = paramString;
      GMTrace.o(12298101981184L, 91628);
    }
    
    public final boolean h(b paramb)
    {
      GMTrace.i(12298236198912L, 91629);
      if (paramb == null)
      {
        GMTrace.o(12298236198912L, 91629);
        return false;
      }
      if (this.rEM == null)
      {
        w.e("MicroMsg.webview.WebViewExDeviceLanMgr", "callbacker is null");
        GMTrace.o(12298236198912L, 91629);
        return false;
      }
      Object localObject;
      for (;;)
      {
        try
        {
          if (!(paramb instanceof dr)) {
            continue;
          }
          w.d("MicroMsg.webview.WebViewExDeviceLanMgr", "ExDeviceOnDeviceBindStateChangeEvent");
          paramb = (dr)paramb;
          bool = bg.nm(paramb.eFv.esG);
          if (bool)
          {
            GMTrace.o(12298236198912L, 91629);
            return true;
          }
          localObject = new Bundle();
          ((Bundle)localObject).putString("exdevice_device_id", paramb.eFv.esG);
          ((Bundle)localObject).putBoolean("exdevice_is_bound", paramb.eFv.eEp);
          this.rEM.m(17, (Bundle)localObject);
        }
        catch (Exception paramb)
        {
          boolean bool;
          w.w("MicroMsg.webview.WebViewExDeviceLanMgr", "exception in WVExDeviceEventListener callback, %s", new Object[] { paramb.getMessage() });
          continue;
          if (!(paramb instanceof dm)) {
            continue;
          }
          w.d("MicroMsg.webview.WebViewExDeviceLanMgr", "ExDeviceLanDeviceRecvDataEvent");
          paramb = (dm)paramb;
          if ((bg.nm(paramb.eFm.esG)) || (bg.nm(paramb.eFm.eEs))) {
            continue;
          }
          localObject = paramb.eFm.data;
          if (localObject != null) {
            continue;
          }
          GMTrace.o(12298236198912L, 91629);
          return true;
          localObject = new Bundle();
          ((Bundle)localObject).putString("exdevice_device_id", paramb.eFm.esG);
          ((Bundle)localObject).putByteArray("exdevice_data", paramb.eFm.data);
          ((Bundle)localObject).putString("exdevice_brand_name", paramb.eFm.eEs);
          ((Bundle)localObject).putString("exdevice_device_type", a.DEVICE_TYPE);
          this.rEM.m(16, (Bundle)localObject);
          continue;
          if (!(paramb instanceof dn)) {
            continue;
          }
          w.i("MicroMsg.webview.WebViewExDeviceLanMgr", "ExDeviceLanDeviceScanResultEvent");
          paramb = (dn)paramb;
          localObject = new Bundle();
          ((Bundle)localObject).putString("exdevice_device_id", paramb.eFn.esG);
          ((Bundle)localObject).putByteArray("exdevice_broadcast_data", paramb.eFn.eFo);
          ((Bundle)localObject).putBoolean("exdevice_is_complete", paramb.eFn.eFp);
          ((Bundle)localObject).putBoolean("exdevice_is_lan_device", true);
          ((Bundle)localObject).putString("exdevice_device_type", a.DEVICE_TYPE);
          this.rEM.m(15, (Bundle)localObject);
          continue;
          if (!(paramb instanceof do)) {
            continue;
          }
          w.i("MicroMsg.webview.WebViewExDeviceLanMgr", "ExDeviceLanDeviceStateChangeEvent");
          paramb = (do)paramb;
          localObject = new Bundle();
          if (paramb.eFq.eFr != true) {
            break label588;
          }
        }
        GMTrace.o(12298236198912L, 91629);
        return true;
        if (!(paramb instanceof dl)) {
          continue;
        }
        w.d("MicroMsg.webview.WebViewExDeviceLanMgr", "ExDeviceLanDeviceConnectStateEvent");
        paramb = (dl)paramb;
        if (!bg.nm(paramb.eFk.esG))
        {
          bool = this.eEs.equals(paramb.eFk.eEs);
          if (bool) {}
        }
        else
        {
          GMTrace.o(12298236198912L, 91629);
          return true;
        }
        localObject = new Bundle();
        ((Bundle)localObject).putString("exdevice_device_id", paramb.eFk.esG);
        ((Bundle)localObject).putInt("exdevice_on_state_change_state", paramb.eFk.eFl);
        ((Bundle)localObject).putString("exdevice_device_type", a.DEVICE_TYPE);
        this.rEM.m(1004, (Bundle)localObject);
      }
      ((Bundle)localObject).putBoolean("exdevice_lan_state", true);
      for (;;)
      {
        this.rEM.m(47, (Bundle)localObject);
        break;
        label588:
        ((Bundle)localObject).putBoolean("exdevice_lan_state", false);
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\webview\ui\tools\a\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */