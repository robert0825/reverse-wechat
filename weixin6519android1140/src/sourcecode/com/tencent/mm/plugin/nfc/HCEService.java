package com.tencent.mm.plugin.nfc;

import android.annotation.TargetApi;
import android.content.ComponentName;
import android.content.Intent;
import android.nfc.NfcAdapter;
import android.nfc.cardemulation.CardEmulation;
import android.nfc.cardemulation.HostApduService;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.util.Base64;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.a.hx;
import com.tencent.mm.g.a.hz;
import com.tencent.mm.kernel.h;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.util.ArrayList;
import java.util.List;

@TargetApi(19)
public class HCEService
  extends HostApduService
{
  private static long mStartTime;
  private static final byte[] nwS;
  private String hyD;
  private ArrayList<String> nwL;
  private boolean nwM;
  private boolean nwN;
  private boolean nwO;
  private boolean nwP;
  private a nwQ;
  private c nwR;
  private com.tencent.mm.sdk.b.c<hx> nwT;
  
  static
  {
    GMTrace.i(20990847352832L, 156394);
    nwS = new byte[] { 0, 0 };
    mStartTime = -1L;
    GMTrace.o(20990847352832L, 156394);
  }
  
  public HCEService()
  {
    GMTrace.i(20987089256448L, 156366);
    this.hyD = null;
    this.nwM = false;
    this.nwN = true;
    this.nwO = false;
    this.nwP = false;
    this.nwQ = new b();
    this.nwR = new d();
    this.nwT = new com.tencent.mm.sdk.b.c() {};
    GMTrace.o(20987089256448L, 156366);
  }
  
  @TargetApi(21)
  private void aTY()
  {
    GMTrace.i(20987491909632L, 156369);
    if (this.nwL == null)
    {
      w.e("MicroMsg.HCEService", "alvinluo mAidList is null, fail to register");
      GMTrace.o(20987491909632L, 156369);
      return;
    }
    Object localObject = NfcAdapter.getDefaultAdapter(this);
    if (localObject == null)
    {
      w.e("MicroMsg.HCEService", "alvinluo NfcAdapter is null when register aids");
      GMTrace.o(20987491909632L, 156369);
      return;
    }
    if (Build.VERSION.SDK_INT < 21)
    {
      w.e("MicroMsg.HCEService", "alvinluo android version: %d is not satisfied when register aids", new Object[] { Integer.valueOf(Build.VERSION.SDK_INT) });
      GMTrace.o(20987491909632L, 156369);
      return;
    }
    localObject = CardEmulation.getInstance((NfcAdapter)localObject);
    if (localObject != null) {
      try
      {
        ComponentName localComponentName = new ComponentName(this, HCEService.class);
        boolean bool = ((CardEmulation)localObject).registerAidsForService(localComponentName, "payment", this.nwL);
        w.i("MicroMsg.HCEService", "alvinluo register aids result: %b", new Object[] { Boolean.valueOf(bool) });
        if (bool)
        {
          gs(true);
          localObject = ((CardEmulation)localObject).getAidsForService(localComponentName, "payment");
          if ((localObject != null) && (((List)localObject).size() > 0))
          {
            int i = 0;
            while (i < ((List)localObject).size())
            {
              w.e("MicroMsg.HCEService", "dynamicAIDList aid=" + (String)((List)localObject).get(i));
              i += 1;
            }
          }
        }
        GMTrace.o(20987491909632L, 156369);
        return;
      }
      catch (Exception localException)
      {
        w.printErrStackTrace("MicroMsg.HCEService", localException, "alvinluo HCEService register aid exception", new Object[0]);
        gs(false);
      }
    }
    GMTrace.o(20987491909632L, 156369);
  }
  
  @TargetApi(21)
  private void aTZ()
  {
    GMTrace.i(20987894562816L, 156372);
    Object localObject = NfcAdapter.getDefaultAdapter(this);
    if (localObject == null)
    {
      GMTrace.o(20987894562816L, 156372);
      return;
    }
    if (Build.VERSION.SDK_INT < 21)
    {
      GMTrace.o(20987894562816L, 156372);
      return;
    }
    localObject = CardEmulation.getInstance((NfcAdapter)localObject);
    if (localObject != null)
    {
      ComponentName localComponentName = new ComponentName(this, HCEService.class);
      w.i("MicroMsg.HCEService", "alvinluo HCEService unregister aids");
      ((CardEmulation)localObject).removeAidsForService(localComponentName, "payment");
    }
    GMTrace.o(20987894562816L, 156372);
  }
  
  private static void d(String paramString, int paramInt, Bundle paramBundle)
  {
    GMTrace.i(20987760345088L, 156371);
    hz localhz = new hz();
    localhz.eLt.appId = paramString;
    localhz.eLt.type = paramInt;
    localhz.eLt.extras = paramBundle;
    a.vgX.m(localhz);
    GMTrace.o(20987760345088L, 156371);
  }
  
  private void d(byte[] paramArrayOfByte, boolean paramBoolean)
  {
    try
    {
      GMTrace.i(20988431433728L, 156376);
      w.i("MicroMsg.HCEService", "alvinluo HCECOMMAND sendResponseCommandToSystem isDefaultCommand: %b, hasCommandNotResponded: %b", new Object[] { Boolean.valueOf(paramBoolean), Boolean.valueOf(this.nwN) });
      if (this.nwN)
      {
        this.nwN = false;
        long l = System.currentTimeMillis();
        w.i("MicroMsg.HCEService", "alvinluo HCECOMMAND send response command time: %d, cost: %d", new Object[] { Long.valueOf(l), Long.valueOf(l - mStartTime) });
        sendResponseApdu(paramArrayOfByte);
        if (paramBoolean)
        {
          paramArrayOfByte = this.hyD;
          w.i("MicroMsg.HCEReportManager", "alvinluo reportHCEtimeExceeded appId: %s", new Object[] { paramArrayOfByte });
          g.ork.A(14838, paramArrayOfByte);
        }
      }
      GMTrace.o(20988431433728L, 156376);
      return;
    }
    finally {}
  }
  
  private void gs(boolean paramBoolean)
  {
    GMTrace.i(20987626127360L, 156370);
    Bundle localBundle = new Bundle();
    if (paramBoolean)
    {
      localBundle.putInt("errCode", 0);
      localBundle.putString("errMsg", "");
    }
    for (;;)
    {
      d(this.hyD, 12, localBundle);
      GMTrace.o(20987626127360L, 156370);
      return;
      localBundle.putInt("errCode", 13006);
      localBundle.putString("errMsg", "register aids failed");
    }
  }
  
  public void onCreate()
  {
    GMTrace.i(20987223474176L, 156367);
    super.onCreate();
    w.i("MicroMsg.HCEService", "alvinluo HCEService onCreate");
    if (!a.vgX.d(this.nwT)) {
      a.vgX.a(this.nwT);
    }
    GMTrace.o(20987223474176L, 156367);
  }
  
  public void onDeactivated(int paramInt)
  {
    GMTrace.i(20988297216000L, 156375);
    w.i("MicroMsg.HCEService", "alvinluo HCEService onDeactivated reason: %d", new Object[] { Integer.valueOf(paramInt) });
    this.nwO = false;
    this.nwP = false;
    Bundle localBundle = new Bundle();
    localBundle.putInt("key_on_deactivated_reason", paramInt);
    d(this.hyD, 41, localBundle);
    GMTrace.o(20988297216000L, 156375);
  }
  
  public void onDestroy()
  {
    GMTrace.i(20987357691904L, 156368);
    super.onDestroy();
    w.i("MicroMsg.HCEService", "alvinluo HCEService onDestroy");
    aTZ();
    if (a.vgX.d(this.nwT)) {
      a.vgX.c(this.nwT);
    }
    GMTrace.o(20987357691904L, 156368);
  }
  
  public int onStartCommand(Intent paramIntent, int paramInt1, int paramInt2)
  {
    GMTrace.i(20988028780544L, 156373);
    w.i("MicroMsg.HCEService", "alvinluo HCEService onStartCommand");
    long l1 = System.currentTimeMillis();
    w.i("MicroMsg.HCEService", "alvinluo HCEService onStartCommand start: %d", new Object[] { Long.valueOf(l1) });
    if (paramIntent == null)
    {
      paramInt1 = super.onStartCommand(paramIntent, paramInt1, paramInt2);
      GMTrace.o(20988028780544L, 156373);
      return paramInt1;
    }
    this.hyD = paramIntent.getStringExtra("key_appid");
    this.nwL = paramIntent.getStringArrayListExtra("key_aid_list");
    aTY();
    this.nwM = false;
    long l2 = System.currentTimeMillis();
    w.i("MicroMsg.HCEService", "alvinluo HCEService onStartCommand end: %d, total: %d", new Object[] { Long.valueOf(l2), Long.valueOf(l2 - l1) });
    paramInt1 = super.onStartCommand(paramIntent, paramInt1, paramInt2);
    GMTrace.o(20988028780544L, 156373);
    return paramInt1;
  }
  
  public byte[] processCommandApdu(byte[] paramArrayOfByte, Bundle paramBundle)
  {
    GMTrace.i(20988162998272L, 156374);
    w.i("MicroMsg.HCEService", "alvinluo HCECOMMAND processCommandApdu, received command from system: %s", new Object[] { c.aB(paramArrayOfByte) });
    if (this.nwQ != null)
    {
      paramArrayOfByte = Base64.encode(paramArrayOfByte, 2);
      this.nwQ.dg(this.hyD, new String(paramArrayOfByte));
    }
    GMTrace.o(20988162998272L, 156374);
    return null;
  }
  
  static abstract interface a
  {
    public abstract void dg(String paramString1, String paramString2);
    
    public abstract void dh(String paramString1, String paramString2);
  }
  
  private final class b
    implements HCEService.a
  {
    public b()
    {
      GMTrace.i(20986149732352L, 156359);
      GMTrace.o(20986149732352L, 156359);
    }
    
    public final void dg(String paramString1, String paramString2)
    {
      GMTrace.i(20986283950080L, 156360);
      w.i("MicroMsg.HCEService", "alvinluo HCECOMMAND send to AppBrand, appId: %s, command: %s", new Object[] { paramString1, paramString2 });
      if ((bg.nm(paramString1)) || (bg.nm(paramString2)))
      {
        w.e("MicroMsg.HCEService", "alvinluo HCECOMMAND invalid appId or command when send request command to AppBrand");
        GMTrace.o(20986283950080L, 156360);
        return;
      }
      Bundle localBundle = new Bundle();
      localBundle.putString("key_apdu_command", paramString2);
      HCEService.c(paramString1, localBundle);
      HCEService.d(HCEService.this);
      if (!HCEService.e(HCEService.this))
      {
        HCEService.f(HCEService.this);
        HCEService.a(HCEService.this, false);
        HCEService.cV(System.currentTimeMillis());
        h.xB().h(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(20991652659200L, 156400);
            w.i("MicroMsg.HCEService", "alvinluo HCEService timer check, timeLimit: %d, hasCommandNotResponded: %b", new Object[] { Integer.valueOf(1500), Boolean.valueOf(HCEService.g(HCEService.this)) });
            HCEService.a(HCEService.this, true);
            HCEService.a(HCEService.this, HCEService.aUa(), true);
            GMTrace.o(20991652659200L, 156400);
          }
        }, 1500L);
        GMTrace.o(20986283950080L, 156360);
        return;
      }
      if (HCEService.h(HCEService.this))
      {
        w.w("MicroMsg.HCEService", "alvinluo HCECOMMAND TimeExceeded, just return default command");
        HCEService.a(HCEService.this, HCEService.aUa(), true);
        HCEService.a(HCEService.this, false);
      }
      GMTrace.o(20986283950080L, 156360);
    }
    
    public final void dh(String paramString1, String paramString2)
    {
      GMTrace.i(20986418167808L, 156361);
      if ((HCEService.i(HCEService.this) == null) || (!HCEService.i(HCEService.this).equals(paramString1)) || (bg.nm(paramString2)))
      {
        w.e("MicroMsg.HCEService", "alvinluo HCECOMMAND not the same appId, or invalid response command, mAppId: %s, appId: %s, responseCommand: %s", new Object[] { HCEService.i(HCEService.this), paramString1, paramString2 });
        GMTrace.o(20986418167808L, 156361);
        return;
      }
      byte[] arrayOfByte = Base64.decode(paramString2, 2);
      w.i("MicroMsg.HCEService", "alvinluo HCECOMMAND response from AppBrand, appId: %s, command in base64: %s, send to system: %s, hasCommandNotResponded: %b", new Object[] { paramString1, paramString2, c.aB(arrayOfByte), Boolean.valueOf(HCEService.g(HCEService.this)) });
      HCEService.a(HCEService.this, arrayOfByte, false);
      GMTrace.o(20986418167808L, 156361);
    }
  }
  
  static abstract interface c
  {
    public abstract void onCreate();
    
    public abstract void onDestroy();
    
    public abstract void onPause();
    
    public abstract void onResume();
  }
  
  private final class d
    implements HCEService.c
  {
    public d()
    {
      GMTrace.i(20991786876928L, 156401);
      GMTrace.o(20991786876928L, 156401);
    }
    
    public final void onCreate()
    {
      GMTrace.i(20991921094656L, 156402);
      w.i("MicroMsg.HCEService", "alvinluo HCELifeCycle AppBrandUI onCreate");
      GMTrace.o(20991921094656L, 156402);
    }
    
    public final void onDestroy()
    {
      GMTrace.i(20992323747840L, 156405);
      w.i("MicroMsg.HCEService", "alvinluo HCELifeCycle AppBrandUI onDestroy");
      GMTrace.o(20992323747840L, 156405);
    }
    
    public final void onPause()
    {
      GMTrace.i(20992189530112L, 156404);
      w.i("MicroMsg.HCEService", "alvinluo HCELifeCycle AppBrandUI onPause");
      HCEService.c(HCEService.this);
      HCEService.b(HCEService.this, true);
      GMTrace.o(20992189530112L, 156404);
    }
    
    public final void onResume()
    {
      GMTrace.i(20992055312384L, 156403);
      w.i("MicroMsg.HCEService", "alvinluo HCELifeCycle AppBrandUI onResume");
      if (HCEService.j(HCEService.this))
      {
        HCEService.k(HCEService.this);
        HCEService.b(HCEService.this, false);
      }
      GMTrace.o(20992055312384L, 156403);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\nfc\HCEService.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */