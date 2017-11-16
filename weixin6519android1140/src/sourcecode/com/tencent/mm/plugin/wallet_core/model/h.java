package com.tencent.mm.plugin.wallet_core.model;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.net.wifi.WifiInfo;
import android.util.Base64;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.jniinterface.AesEcb;
import com.tencent.mm.kernel.e;
import com.tencent.mm.modelgeo.a.a;
import com.tencent.mm.modelgeo.c;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.plugin.wallet_core.a.a;
import com.tencent.mm.plugin.wxpay.a.c;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.pluginsdk.m;
import com.tencent.mm.protocal.c.at;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.am;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.ar;
import com.tencent.mm.storage.t;
import com.tencent.mm.storage.w.a;
import com.tencent.mm.storage.x;
import com.tencent.mm.y.q;
import java.lang.ref.WeakReference;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class h
{
  public static c mEj;
  private static a rgu;
  private static h rgv;
  public static at rgw;
  public JSONArray rgx;
  
  static
  {
    GMTrace.i(6907381153792L, 51464);
    rgw = null;
    GMTrace.o(6907381153792L, 51464);
  }
  
  private h()
  {
    GMTrace.i(6905904758784L, 51453);
    init();
    GMTrace.o(6905904758784L, 51453);
  }
  
  public static c Ir()
  {
    GMTrace.i(6906307411968L, 51456);
    if (mEj == null) {
      mEj = c.Ir();
    }
    c localc = mEj;
    GMTrace.o(6906307411968L, 51456);
    return localc;
  }
  
  protected static void Kd(String paramString)
  {
    GMTrace.i(17628424830976L, 131342);
    if (rgw == null) {
      rgw = new at();
    }
    w.d("MicroMsg.GpsReportHelper", "encrpydata %s", new Object[] { paramString });
    byte[] arrayOfByte = new byte[16];
    Object localObject2 = com.tencent.mm.wallet_core.c.n.clL().getBytes();
    if (localObject2 != null)
    {
      localObject1 = localObject2;
      if (localObject2.length > 0) {}
    }
    else
    {
      localObject1 = System.currentTimeMillis().getBytes();
    }
    int j = 0;
    int i = 0;
    int k;
    do
    {
      arrayOfByte[i] = localObject1[j];
      k = i + 1;
      j += 1;
      i = j;
      if (j >= localObject1.length) {
        i = 0;
      }
      j = i;
      i = k;
    } while (k < 16);
    Object localObject1 = Base64.encode(arrayOfByte, 0);
    localObject2 = rgw;
    if (k.rgz == null) {
      k.rgz = new k();
    }
    ((at)localObject2).tOU = k.rgz.aM((byte[])localObject1);
    w.d("MicroMsg.GpsReportHelper", "mLocationInfo.encrypt_key %s", new Object[] { rgw.tOU });
    paramString = Base64.encode(AesEcb.aesCryptEcb(paramString.getBytes(), arrayOfByte, true, true), 0);
    rgw.tOT = new String(paramString);
    w.d("MicroMsg.GpsReportHelper", "mLocationInfo.encrypt_userinfo %s", new Object[] { new String(paramString) });
    GMTrace.o(17628424830976L, 131342);
  }
  
  public static h byo()
  {
    GMTrace.i(6906173194240L, 51455);
    if (rgv == null) {
      rgv = new h();
    }
    h localh = rgv;
    GMTrace.o(6906173194240L, 51455);
    return localh;
  }
  
  public static at byp()
  {
    GMTrace.i(6906575847424L, 51458);
    at localat = rgw;
    GMTrace.o(6906575847424L, 51458);
    return localat;
  }
  
  public static void g(Activity paramActivity, final int paramInt)
  {
    int i = 1;
    GMTrace.i(6906441629696L, 51457);
    w.i("MicroMsg.GpsReportHelper", "reflashLocationInfo " + paramInt);
    Object localObject1 = n.byx().byW();
    if ((((ad)localObject1).rjq & 0x2000) > 0) {}
    Object localObject2;
    for (boolean bool = true;; bool = false)
    {
      w.i("MicroMsg.WalletSwitchConfig", "isReportLocation, ret = %s switchBit %s", new Object[] { Boolean.valueOf(bool), Integer.valueOf(((ad)localObject1).rjq) });
      if (!bool) {
        break label435;
      }
      if ((c.Is()) || (c.It())) {
        break label289;
      }
      if (!byo().wQ(paramInt)) {
        break;
      }
      w.i("MicroMsg.GpsReportHelper", "should show lbs dialog,scene:%d", new Object[] { Integer.valueOf(paramInt) });
      com.tencent.mm.kernel.h.xz();
      localObject1 = (String)com.tencent.mm.kernel.h.xy().xh().get(w.a.vuk, paramActivity.getString(a.i.tfX));
      com.tencent.mm.kernel.h.xz();
      localObject2 = (String)com.tencent.mm.kernel.h.xy().xh().get(w.a.vul, paramActivity.getString(a.i.tfW));
      com.tencent.mm.kernel.h.xz();
      com.tencent.mm.kernel.h.xy().xh().a(w.a.vui, Long.valueOf(bg.Pu()));
      com.tencent.mm.ui.base.h.a(paramActivity, (String)localObject2, (String)localObject1, paramActivity.getString(a.i.dFX), paramActivity.getString(a.i.cSk), false, new DialogInterface.OnClickListener()new DialogInterface.OnClickListener
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(6865102569472L, 51149);
          this.na.startActivity(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"));
          g.ork.i(13446, new Object[] { Integer.valueOf(paramInt), Integer.valueOf(2), Long.valueOf(bg.Pu()) });
          paramAnonymousDialogInterface.dismiss();
          GMTrace.o(6865102569472L, 51149);
        }
      }, new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(6899730743296L, 51407);
          paramAnonymousDialogInterface.dismiss();
          GMTrace.o(6899730743296L, 51407);
        }
      }, a.c.aPp);
      GMTrace.o(6906441629696L, 51457);
      return;
    }
    w.i("MicroMsg.GpsReportHelper", "should'n show lbs dialog,scene:%d", new Object[] { Integer.valueOf(paramInt) });
    GMTrace.o(6906441629696L, 51457);
    return;
    label289:
    w.i("MicroMsg.GpsReportHelper", "reflashLocationInfo scene:%d", new Object[] { Integer.valueOf(paramInt) });
    if (paramActivity != null)
    {
      localObject1 = Ir();
      if (rgu == null) {
        rgu = new a(paramActivity);
      }
      label420:
      for (;;)
      {
        if (rgu != null) {
          rgu.gsq = 0;
        }
        ((c)localObject1).a(rgu, false);
        GMTrace.o(6906441629696L, 51457);
        return;
        localObject2 = rgu;
        if ((paramActivity != null) && (((a)localObject2).rgy != null) && (paramActivity.equals(((a)localObject2).rgy.get()))) {}
        for (paramInt = i;; paramInt = 0)
        {
          if (paramInt != 0) {
            break label420;
          }
          rgu = new a(paramActivity);
          break;
        }
      }
    }
    rgu = null;
    GMTrace.o(6906441629696L, 51457);
    return;
    label435:
    rgu = null;
    paramActivity = n.byx().byW();
    if ((paramActivity.rjq & 0x40000) > 0) {}
    for (bool = true;; bool = false)
    {
      w.i("MicroMsg.WalletSwitchConfig", "isReportWifiSSid, ret = %s switchBit %s", new Object[] { Boolean.valueOf(bool), Integer.valueOf(paramActivity.rjq) });
      if (bool)
      {
        WifiInfo localWifiInfo = am.getWifiInfo(ab.getContext());
        localObject2 = "";
        localObject1 = "";
        paramActivity = "";
        if (localWifiInfo != null)
        {
          localObject2 = localWifiInfo.getSSID();
          localObject1 = System.currentTimeMillis();
          paramActivity = localWifiInfo.getBSSID();
        }
        Kd(String.format("wifissid=%s&wifibssid=%s&ssid_timestamp=%s", new Object[] { localObject2, paramActivity, localObject1 }));
      }
      GMTrace.o(6906441629696L, 51457);
      return;
    }
  }
  
  private void init()
  {
    GMTrace.i(6906038976512L, 51454);
    com.tencent.mm.kernel.h.xz();
    String str = (String)com.tencent.mm.kernel.h.xy().xh().get(w.a.vuj, "");
    w.i("MicroMsg.GpsReportHelper", "GpsReportHelper " + str);
    if (!bg.nm(str)) {
      try
      {
        this.rgx = new JSONArray(str);
        GMTrace.o(6906038976512L, 51454);
        return;
      }
      catch (JSONException localJSONException)
      {
        w.printErrStackTrace("MicroMsg.GpsReportHelper", localJSONException, "", new Object[0]);
        w.e("MicroMsg.GpsReportHelper", "parse lbs config error", new Object[] { localJSONException });
      }
    }
    GMTrace.o(6906038976512L, 51454);
  }
  
  private boolean wQ(int paramInt)
  {
    GMTrace.i(6906710065152L, 51459);
    if ((paramInt == 5) || (paramInt == 6))
    {
      GMTrace.o(6906710065152L, 51459);
      return false;
    }
    boolean bool2 = false;
    boolean bool1 = false;
    com.tencent.mm.kernel.h.xz();
    long l1 = ((Long)com.tencent.mm.kernel.h.xy().xh().get(w.a.vui, Long.valueOf(0L))).longValue();
    if (this.rgx == null) {
      init();
    }
    if (this.rgx != null)
    {
      int i = 0;
      bool2 = bool1;
      if (i < this.rgx.length())
      {
        JSONObject localJSONObject = this.rgx.optJSONObject(i);
        bool2 = bool1;
        if (localJSONObject != null)
        {
          bool2 = bool1;
          if (localJSONObject.optInt("scene") == paramInt) {
            if (localJSONObject.optInt("is_show_tips", 0) != 1) {
              break label204;
            }
          }
        }
        label204:
        for (int j = 1;; j = 0)
        {
          int k = localJSONObject.optInt("show_interval", 0);
          long l2 = bg.Pu();
          bool2 = bool1;
          if (j != 0)
          {
            bool2 = bool1;
            if (l2 - l1 > k) {
              bool2 = true;
            }
          }
          i += 1;
          bool1 = bool2;
          break;
        }
      }
    }
    w.i("MicroMsg.GpsReportHelper", "shouldShow? %s mLbsConfig: %s ", new Object[] { Boolean.valueOf(bool2), this.rgx });
    GMTrace.o(6906710065152L, 51459);
    return bool2;
  }
  
  private static final class a
    implements a.a
  {
    int gsq;
    WeakReference<Activity> rgy;
    
    public a(Activity paramActivity)
    {
      GMTrace.i(6866310529024L, 51158);
      this.gsq = 0;
      this.rgy = new WeakReference(paramActivity);
      GMTrace.o(6866310529024L, 51158);
    }
    
    public final boolean a(boolean paramBoolean, float paramFloat1, float paramFloat2, int paramInt, double paramDouble1, double paramDouble2, double paramDouble3)
    {
      GMTrace.i(15394773401600L, 114700);
      if (paramBoolean)
      {
        if (h.rgw == null) {
          h.rgw = new at();
        }
        Object localObject = q.zE();
        com.tencent.mm.kernel.h.xz();
        localObject = ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).yK().TE((String)localObject);
        h.rgw.fjl = ((x)localObject).getCityCode();
        h.rgw.fjk = ((x)localObject).bSD();
        long l = h.Ir().gEX;
        WifiInfo localWifiInfo = am.getWifiInfo(ab.getContext());
        String str2 = "";
        String str1 = "";
        localObject = "";
        if (localWifiInfo != null)
        {
          str2 = localWifiInfo.getSSID();
          str1 = System.currentTimeMillis();
          localObject = localWifiInfo.getBSSID();
        }
        h.Kd(String.format("latitude=%.6f&longitude=%.6f&location_timestamp=%s&wifissid=%s&wifibssid=%s&ssid_timestamp=%s", new Object[] { Float.valueOf(paramFloat2), Float.valueOf(paramFloat1), Long.valueOf(l), str2, localObject, str1 }));
        w.i("MicroMsg.GpsReportHelper", "fLongitude=" + paramFloat1 + ";fLatitude=" + paramFloat2 + " tryCount: " + this.gsq);
        this.gsq += 1;
        if (this.gsq > 3) {
          h.mEj.c(this);
        }
        GMTrace.o(15394773401600L, 114700);
        return true;
      }
      w.e("MicroMsg.GpsReportHelper", "get Location fail;isOk=" + paramBoolean);
      h.mEj.c(this);
      if ((this.rgy != null) && (this.rgy.get() != null) && (a.hnH != null)) {
        a.hnH.an((Context)this.rgy.get());
      }
      GMTrace.o(15394773401600L, 114700);
      return false;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\wallet_core\model\h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */