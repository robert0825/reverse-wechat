package com.tencent.mm.plugin.freewifi;

import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build.VERSION;
import android.telephony.TelephonyManager;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.l;
import com.tencent.mm.ad.e;
import com.tencent.mm.ap.b;
import com.tencent.mm.ap.b.a;
import com.tencent.mm.plugin.freewifi.d.a;
import com.tencent.mm.plugin.freewifi.model.j;
import com.tencent.mm.plugin.freewifi.ui.FreeWifiFrontPageUI;
import com.tencent.mm.plugin.freewifi.ui.FreeWifiFrontPageUI.a;
import com.tencent.mm.plugin.freewifi.ui.FreeWifiFrontPageUI.b;
import com.tencent.mm.plugin.freewifi.ui.FreeWifiFrontPageUI.d;
import com.tencent.mm.protocal.c.eb;
import com.tencent.mm.protocal.c.pw;
import com.tencent.mm.sdk.e.i;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.am;
import com.tencent.mm.sdk.platformtools.an;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import com.tencent.mm.ui.MMWizardActivity;
import com.tencent.mm.ui.bindmobile.BindMContactUI;
import com.tencent.mm.y.at;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.net.ConnectException;
import java.net.NetworkInterface;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.UUID;

public final class m
{
  private static SimpleDateFormat iZf;
  
  static
  {
    GMTrace.i(7153402249216L, 53297);
    iZf = new SimpleDateFormat("yyyy-MM-dd_HH:mm:ss");
    GMTrace.o(7153402249216L, 53297);
  }
  
  public static void B(Intent paramIntent)
  {
    GMTrace.i(7149509935104L, 53268);
    if (yp(paramIntent.getStringExtra("free_wifi_sessionkey"))) {
      d(paramIntent, aAF());
    }
    GMTrace.o(7149509935104L, 53268);
  }
  
  public static String C(Intent paramIntent)
  {
    GMTrace.i(7149912588288L, 53271);
    paramIntent = yr(paramIntent.getStringExtra("free_wifi_sessionkey"));
    GMTrace.o(7149912588288L, 53271);
    return paramIntent;
  }
  
  public static int D(Intent paramIntent)
  {
    GMTrace.i(7150046806016L, 53272);
    int i = paramIntent.getIntExtra("ConstantsFreeWifi.FREE_WIFI_LOG_STEP_ID", 0) + 1;
    paramIntent.putExtra("ConstantsFreeWifi.FREE_WIFI_LOG_STEP_ID", i);
    GMTrace.o(7150046806016L, 53272);
    return i;
  }
  
  public static int E(Intent paramIntent)
  {
    GMTrace.i(7150181023744L, 53273);
    int i = paramIntent.getIntExtra("ConstantsFreeWifi.FREE_WIFI_PROTOCOL_NUMBER", 0);
    GMTrace.o(7150181023744L, 53273);
    return i;
  }
  
  public static int F(Intent paramIntent)
  {
    GMTrace.i(7150315241472L, 53274);
    int i = paramIntent.getIntExtra("free_wifi_channel_id", 0);
    GMTrace.o(7150315241472L, 53274);
    return i;
  }
  
  public static String G(Intent paramIntent)
  {
    GMTrace.i(7150449459200L, 53275);
    paramIntent = paramIntent.getStringExtra("free_wifi_ap_key");
    GMTrace.o(7150449459200L, 53275);
    return paramIntent;
  }
  
  public static String a(int paramInt1, k.b paramb, int paramInt2)
  {
    GMTrace.i(7151523201024L, 53283);
    w.i("MicroMsg.FreeWifi.Utils", "getUiErrorCode, protocol=%d, stageName=%s, stageCode=%d, errocode=%d", new Object[] { Integer.valueOf(paramInt1), paramb.name, Long.valueOf(paramb.lpi), Integer.valueOf(paramInt2) });
    paramInt2 = Math.abs(paramInt2);
    StringBuilder localStringBuilder = new StringBuilder().append(String.format("%02d", new Object[] { Integer.valueOf(paramInt1) })).append(String.format("%03d", new Object[] { Long.valueOf(paramb.lpi) }));
    if (paramInt2 <= 999) {}
    for (paramb = String.format("%03d", new Object[] { Integer.valueOf(paramInt2) });; paramb = Integer.valueOf(paramInt2))
    {
      paramb = paramb;
      GMTrace.o(7151523201024L, 53283);
      return paramb;
    }
  }
  
  public static String a(String paramString1, LinkedHashMap<String, Class> paramLinkedHashMap, i parami, String paramString2)
  {
    GMTrace.i(7153133813760L, 53295);
    if (paramLinkedHashMap.size() == 0)
    {
      GMTrace.o(7153133813760L, 53295);
      return "";
    }
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(paramString1).append("\r\n");
    Object localObject1 = new StringBuilder();
    Object localObject2 = paramLinkedHashMap.entrySet().iterator();
    while (((Iterator)localObject2).hasNext()) {
      ((StringBuilder)localObject1).append((String)((Map.Entry)((Iterator)localObject2).next()).getKey()).append(",");
    }
    if (((StringBuilder)localObject1).length() > 0) {
      ((StringBuilder)localObject1).delete(((StringBuilder)localObject1).length() - 1, ((StringBuilder)localObject1).length());
    }
    localObject1 = "select " + ((StringBuilder)localObject1).toString() + " from " + paramString1;
    localObject2 = paramLinkedHashMap.entrySet().iterator();
    while (((Iterator)localObject2).hasNext()) {
      localStringBuilder.append((String)((Map.Entry)((Iterator)localObject2).next()).getKey()).append("\t");
    }
    localStringBuilder.append("\r\n");
    parami = parami.rawQuery((String)localObject1, new String[0]);
    for (;;)
    {
      int i;
      try
      {
        if (!parami.moveToNext()) {
          break;
        }
        localObject1 = paramLinkedHashMap.entrySet().iterator();
        i = 0;
        if (!((Iterator)localObject1).hasNext()) {
          break label532;
        }
        localObject2 = (Class)((Map.Entry)((Iterator)localObject1).next()).getValue();
        if (localObject2 != String.class) {
          continue;
        }
        localStringBuilder.append(parami.getString(i));
      }
      catch (Exception paramLinkedHashMap)
      {
        w.i(paramString2, "print " + paramString1 + "error." + paramLinkedHashMap.getMessage());
        parami.close();
        GMTrace.o(7153133813760L, 53295);
        return "";
        if (localObject2 != Long.TYPE) {
          break label440;
        }
        localStringBuilder.append(parami.getLong(i));
        continue;
      }
      finally
      {
        parami.close();
      }
      localStringBuilder.append("\t");
      i += 1;
      continue;
      if (localObject2 == Integer.TYPE) {
        localStringBuilder.append(parami.getInt(i));
      } else {
        label440:
        if (localObject2 == Float.TYPE)
        {
          localStringBuilder.append(parami.getFloat(i));
        }
        else if (localObject2 == Double.TYPE)
        {
          localStringBuilder.append(parami.getDouble(i));
        }
        else
        {
          w.e(paramString2, "unkonwn type " + ((Class)localObject2).toString());
          localStringBuilder.append(parami.getString(i));
          continue;
          label532:
          localStringBuilder.append("\r\n");
        }
      }
    }
    w.i(paramString2, localStringBuilder.toString());
    paramLinkedHashMap = localStringBuilder.toString();
    parami.close();
    GMTrace.o(7153133813760L, 53295);
    return paramLinkedHashMap;
  }
  
  public static void a(final Intent paramIntent, final String paramString1, final int paramInt1, final int paramInt2, final a parama, String paramString2)
  {
    GMTrace.i(7151791636480L, 53285);
    j.aBh().aAR().post(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(7266279358464L, 54138);
        Object localObject = k.aAB();
        ((k.a)localObject).ssid = m.ys(this.lpl);
        ((k.a)localObject).bssid = m.yt(this.lpl);
        ((k.a)localObject).eCF = m.yu(this.lpl);
        ((k.a)localObject).eCE = paramString1;
        ((k.a)localObject).lov = m.C(paramIntent);
        ((k.a)localObject).low = paramInt1;
        ((k.a)localObject).lox = k.b.loJ.lpi;
        ((k.a)localObject).loy = k.b.loJ.name;
        ((k.a)localObject).ePH = m.F(paramIntent);
        ((k.a)localObject).result = 0;
        ((k.a)localObject).aAD().aAC();
        localObject = m.yt(this.lpl);
        String str = m.ys(this.lpl);
        int i = com.tencent.mm.plugin.freewifi.model.d.aAU();
        w.i(this.lpl, "NetStatusUtil.getNetType(MMApplicationContext.getContext()) = " + am.getNetType(ab.getContext()));
        w.i(this.lpl, "sessionKey=%s, step=%d, method=getBackPageInfoAfterConnectSuccess, desc=it starts net request [apauth.getBackPage]  for backpage info. fullUrl=%s, nowApMac=%s, nowNetworkSSID=%s, rssi=%d", new Object[] { m.C(paramIntent), Integer.valueOf(m.D(paramIntent)), paramString1, localObject, str, Integer.valueOf(i) });
        new a(paramString1, (String)localObject, str, i, paramInt2, m.C(paramIntent)).b(new e()
        {
          public final void a(int paramAnonymous2Int1, int paramAnonymous2Int2, String paramAnonymous2String, com.tencent.mm.ad.k paramAnonymous2k)
          {
            GMTrace.i(7148704628736L, 53262);
            w.i(m.2.this.lpl, "sessionKey=%s, step=%d, desc=net request [apauth.getBackPage] returns. errType=%d, errCode=%d, errMsg=%s", new Object[] { m.C(m.2.this.val$intent), Integer.valueOf(m.D(m.2.this.val$intent)), Integer.valueOf(paramAnonymous2Int1), Integer.valueOf(paramAnonymous2Int2), paramAnonymous2String });
            k.a locala = k.aAB();
            locala.ssid = m.ys(m.2.this.lpl);
            locala.bssid = m.yt(m.2.this.lpl);
            locala.eCF = m.yu(m.2.this.lpl);
            locala.eCE = m.2.this.lpn;
            locala.lov = m.C(m.2.this.val$intent);
            locala.low = m.E(m.2.this.val$intent);
            locala.lox = k.b.loM.lpi;
            locala.loy = k.b.loM.name;
            locala.ePH = m.F(m.2.this.val$intent);
            locala.result = paramAnonymous2Int2;
            locala.jNb = paramAnonymous2String;
            locala.aAD().b(m.2.this.val$intent, true).aAC();
            m.2.this.lpp.h(paramAnonymous2Int1, paramAnonymous2Int2, paramAnonymous2String, paramAnonymous2k);
            GMTrace.o(7148704628736L, 53262);
          }
        });
        GMTrace.o(7266279358464L, 54138);
      }
    });
    GMTrace.o(7151791636480L, 53285);
  }
  
  public static void a(Intent paramIntent, String paramString1, final int paramInt1, int paramInt2, final FreeWifiFrontPageUI paramFreeWifiFrontPageUI, String paramString2)
  {
    GMTrace.i(7151657418752L, 53284);
    a(paramIntent, paramString1, paramInt1, paramInt2, new a()
    {
      public final void h(int paramAnonymousInt1, int paramAnonymousInt2, String paramAnonymousString, com.tencent.mm.ad.k paramAnonymousk)
      {
        GMTrace.i(7126827139072L, 53099);
        Object localObject2;
        if ((paramAnonymousInt1 == 0) && (paramAnonymousInt2 == 0))
        {
          if (!(paramAnonymousk instanceof a))
          {
            GMTrace.o(7126827139072L, 53099);
            return;
          }
          paramAnonymousString = ((a)paramAnonymousk).aBs();
          if (paramAnonymousString != null)
          {
            w.i(this.lpl, "backPageInfo appid: %s, nickName: %s, userName: %s, finishActionCode: %d, finishUrl: %s, signature: %s, qingHuaiPageUrl: %s", new Object[] { paramAnonymousString.lTf, paramAnonymousString.jio, paramAnonymousString.jhi, Integer.valueOf(paramAnonymousString.tSG), paramAnonymousString.tSH, paramAnonymousString.gCA, paramAnonymousString.tSI });
            paramAnonymousk = paramFreeWifiFrontPageUI;
            localObject1 = FreeWifiFrontPageUI.d.ltE;
            localObject2 = new FreeWifiFrontPageUI.b();
            ((FreeWifiFrontPageUI.b)localObject2).ltA = paramAnonymousString;
            paramAnonymousk.a((FreeWifiFrontPageUI.d)localObject1, localObject2);
            GMTrace.o(7126827139072L, 53099);
            return;
          }
          w.i(this.lpl, "backPageInfo is null");
          paramAnonymousString = paramFreeWifiFrontPageUI;
          paramAnonymousk = FreeWifiFrontPageUI.d.ltD;
          localObject1 = new FreeWifiFrontPageUI.a();
          ((FreeWifiFrontPageUI.a)localObject1).ltc = m.a(paramInt1, k.b.loK, 21);
          paramAnonymousString.a(paramAnonymousk, localObject1);
          GMTrace.o(7126827139072L, 53099);
          return;
        }
        if ((m.cg(paramAnonymousInt1, paramAnonymousInt2)) && (!m.yp(paramAnonymousString)))
        {
          paramAnonymousk = paramFreeWifiFrontPageUI;
          localObject1 = FreeWifiFrontPageUI.d.ltD;
          localObject2 = new FreeWifiFrontPageUI.a();
          ((FreeWifiFrontPageUI.a)localObject2).text = paramAnonymousString;
          ((FreeWifiFrontPageUI.a)localObject2).ltc = m.a(paramInt1, k.b.loK, paramAnonymousInt2);
          paramAnonymousk.a((FreeWifiFrontPageUI.d)localObject1, localObject2);
          GMTrace.o(7126827139072L, 53099);
          return;
        }
        paramAnonymousString = paramFreeWifiFrontPageUI;
        paramAnonymousk = FreeWifiFrontPageUI.d.ltD;
        Object localObject1 = new FreeWifiFrontPageUI.a();
        ((FreeWifiFrontPageUI.a)localObject1).ltc = m.a(paramInt1, k.b.loK, paramAnonymousInt2);
        paramAnonymousString.a(paramAnonymousk, localObject1);
        GMTrace.o(7126827139072L, 53099);
      }
    }, paramString2);
    GMTrace.o(7151657418752L, 53284);
  }
  
  public static boolean aAE()
  {
    GMTrace.i(7149375717376L, 53267);
    String str = bg.bs(ab.getContext());
    if ((str != null) && (str.toLowerCase().startsWith(ab.getPackageName())))
    {
      GMTrace.o(7149375717376L, 53267);
      return true;
    }
    GMTrace.o(7149375717376L, 53267);
    return false;
  }
  
  public static String aAF()
  {
    GMTrace.i(7149644152832L, 53269);
    String str = UUID.randomUUID().toString().replace("-", "");
    GMTrace.o(7149644152832L, 53269);
    return str;
  }
  
  public static String aAG()
  {
    GMTrace.i(7151120547840L, 53280);
    long l = System.currentTimeMillis();
    try
    {
      if (NetworkInterface.getNetworkInterfaces() != null)
      {
        Object localObject1 = Collections.list(NetworkInterface.getNetworkInterfaces()).iterator();
        while (((Iterator)localObject1).hasNext())
        {
          Object localObject2 = (NetworkInterface)((Iterator)localObject1).next();
          if (((NetworkInterface)localObject2).getName().equalsIgnoreCase("wlan0"))
          {
            localObject1 = ((NetworkInterface)localObject2).getHardwareAddress();
            if (localObject1 == null)
            {
              w.d("MicroMsg.FreeWifi.Utils", "et mobile mac from net time cost :" + (System.currentTimeMillis() - l));
              GMTrace.o(7151120547840L, 53280);
              return "02:00:00:00:00:00";
            }
            localObject2 = new StringBuilder();
            int j = localObject1.length;
            int i = 0;
            while (i < j)
            {
              ((StringBuilder)localObject2).append(String.format("%02X:", new Object[] { Byte.valueOf(localObject1[i]) }));
              i += 1;
            }
            if (((StringBuilder)localObject2).length() > 0) {
              ((StringBuilder)localObject2).deleteCharAt(((StringBuilder)localObject2).length() - 1);
            }
            w.d("MicroMsg.FreeWifi.Utils", "et mobile mac from net time cost :" + (System.currentTimeMillis() - l));
            localObject1 = ((StringBuilder)localObject2).toString();
            GMTrace.o(7151120547840L, 53280);
            return (String)localObject1;
          }
        }
      }
    }
    catch (Exception localException)
    {
      w.e("MicroMsg.FreeWifi.Utils", "get mobile mac from net fail!" + localException);
      w.d("MicroMsg.FreeWifi.Utils", "et mobile mac from net time cost :" + (System.currentTimeMillis() - l));
      GMTrace.o(7151120547840L, 53280);
    }
    return "02:00:00:00:00:00";
  }
  
  public static int aAH()
  {
    GMTrace.i(7151925854208L, 53286);
    Object localObject = com.tencent.mm.modelfriend.m.Ho();
    if ((localObject == com.tencent.mm.modelfriend.m.a.gDk) || (localObject == com.tencent.mm.modelfriend.m.a.gDl))
    {
      GMTrace.o(7151925854208L, 53286);
      return 1;
    }
    at.AR();
    localObject = (String)com.tencent.mm.y.c.xh().get(6, null);
    if (yp((String)localObject))
    {
      GMTrace.o(7151925854208L, 53286);
      return 1;
    }
    if (((String)localObject).startsWith("+")) {}
    for (localObject = an.AL((String)localObject); "86".equals(localObject); localObject = "86")
    {
      GMTrace.o(7151925854208L, 53286);
      return 2;
    }
    GMTrace.o(7151925854208L, 53286);
    return 3;
  }
  
  public static boolean aAI()
  {
    GMTrace.i(7152865378304L, 53293);
    if (((ConnectivityManager)ab.getContext().getSystemService("connectivity")).getNetworkInfo(1).isConnected())
    {
      w.i("TAG", "isWifiConnected()=true");
      GMTrace.o(7152865378304L, 53293);
      return true;
    }
    w.i("TAG", "isWifiConnected()=false");
    GMTrace.o(7152865378304L, 53293);
    return false;
  }
  
  public static pw aAJ()
  {
    GMTrace.i(7152999596032L, 53294);
    pw localpw = new pw();
    localpw.deviceBrand = com.tencent.mm.protocal.d.tJv;
    if ((d.lob != null) && (!d.lob.equals(""))) {}
    for (localpw.ufT = d.lob;; localpw.ufT = yu("MicroMsg.FreeWifi.Utils"))
    {
      localpw.deviceModel = com.tencent.mm.protocal.d.tJw;
      localpw.osName = com.tencent.mm.protocal.d.tJy;
      localpw.osVersion = com.tencent.mm.protocal.d.tJz;
      GMTrace.o(7152999596032L, 53294);
      return localpw;
    }
  }
  
  public static boolean cf(int paramInt1, int paramInt2)
  {
    GMTrace.i(7152194289664L, 53288);
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      GMTrace.o(7152194289664L, 53288);
      return true;
    }
    GMTrace.o(7152194289664L, 53288);
    return false;
  }
  
  public static boolean cg(int paramInt1, int paramInt2)
  {
    GMTrace.i(7152328507392L, 53289);
    if ((paramInt1 == 4) && (paramInt2 <= 35536) && (paramInt2 > 34536))
    {
      GMTrace.o(7152328507392L, 53289);
      return true;
    }
    GMTrace.o(7152328507392L, 53289);
    return false;
  }
  
  private static boolean ch(String paramString1, String paramString2)
  {
    GMTrace.i(7152731160576L, 53292);
    int i = bg.getInt(paramString1, 0);
    int j = bg.getInt(paramString2, 0);
    if ((i == 0) && (j != 0) && (com.tencent.mm.protocal.d.tJC <= j))
    {
      GMTrace.o(7152731160576L, 53292);
      return true;
    }
    if ((i != 0) && (j == 0) && (com.tencent.mm.protocal.d.tJC >= i))
    {
      GMTrace.o(7152731160576L, 53292);
      return true;
    }
    if ((i != 0) && (j != 0) && (com.tencent.mm.protocal.d.tJC >= i) && (com.tencent.mm.protocal.d.tJC <= j))
    {
      GMTrace.o(7152731160576L, 53292);
      return true;
    }
    GMTrace.o(7152731160576L, 53292);
    return false;
  }
  
  public static void cw(Context paramContext)
  {
    GMTrace.i(7152060071936L, 53287);
    Intent localIntent = new Intent(paramContext, BindMContactUI.class);
    localIntent.putExtra("is_bind_for_safe_device", false);
    localIntent.putExtra("is_bind_for_change_mobile", false);
    Object localObject = ((TelephonyManager)paramContext.getSystemService("phone")).getSimCountryIso();
    if (!bg.nm((String)localObject))
    {
      localObject = b.h(paramContext, (String)localObject, paramContext.getString(R.l.bsf));
      if (localObject != null)
      {
        localIntent.putExtra("country_name", ((b.a)localObject).gLy);
        localIntent.putExtra("couttry_code", ((b.a)localObject).gLx);
      }
    }
    MMWizardActivity.A(paramContext, localIntent);
    GMTrace.o(7152060071936L, 53287);
  }
  
  public static String d(Exception paramException)
  {
    GMTrace.i(7151254765568L, 53281);
    Object localObject = new StringWriter();
    paramException.printStackTrace(new PrintWriter((Writer)localObject));
    localObject = yr(((StringWriter)localObject).toString());
    paramException = (Exception)localObject;
    if (((String)localObject).length() > 1024) {
      paramException = ((String)localObject).substring(0, 1024);
    }
    GMTrace.o(7151254765568L, 53281);
    return paramException;
  }
  
  public static void d(Intent paramIntent, String paramString)
  {
    GMTrace.i(7149778370560L, 53270);
    paramIntent.putExtra("free_wifi_sessionkey", paramString);
    paramIntent.putExtra("ConstantsFreeWifi.FREE_WIFI_LOG_STEP_ID", 0);
    GMTrace.o(7149778370560L, 53270);
  }
  
  public static String e(Exception paramException)
  {
    GMTrace.i(7151388983296L, 53282);
    StringWriter localStringWriter = new StringWriter();
    paramException.printStackTrace(new PrintWriter(localStringWriter));
    paramException = yr(localStringWriter.toString());
    GMTrace.o(7151388983296L, 53282);
    return paramException;
  }
  
  public static int f(Exception paramException)
  {
    GMTrace.i(7152462725120L, 53290);
    if ((paramException instanceof SocketTimeoutException))
    {
      paramException = e(paramException);
      if (paramException.indexOf(".read") != -1)
      {
        GMTrace.o(7152462725120L, 53290);
        return 105;
      }
      if (paramException.indexOf(".connect") != -1)
      {
        GMTrace.o(7152462725120L, 53290);
        return 104;
      }
      GMTrace.o(7152462725120L, 53290);
      return 101;
    }
    if ((paramException instanceof ConnectException))
    {
      GMTrace.o(7152462725120L, 53290);
      return 106;
    }
    if ((paramException instanceof UnknownHostException))
    {
      GMTrace.o(7152462725120L, 53290);
      return 102;
    }
    GMTrace.o(7152462725120L, 53290);
    return 101;
  }
  
  public static boolean i(Map<String, String> paramMap, String paramString)
  {
    GMTrace.i(7152596942848L, 53291);
    w.i(paramString, "CLIENT_VERSION=" + com.tencent.mm.protocal.d.tJC);
    String str1 = (String)paramMap.get(".sysmsg.apply_versions.version_desc.$minInclude");
    String str2 = (String)paramMap.get(".sysmsg.apply_versions.version_desc.$maxInclude");
    w.i(paramString, "checkMsgPushedVersion. min0=%s,max0=%s", new Object[] { str1, str2 });
    if ((yp(str1)) && (yp(str2)))
    {
      GMTrace.o(7152596942848L, 53291);
      return false;
    }
    if (ch(str1, str2))
    {
      GMTrace.o(7152596942848L, 53291);
      return true;
    }
    int i = 1;
    for (;;)
    {
      str1 = (String)paramMap.get(".sysmsg.apply_versions.version_desc#" + i + ".$minInclude");
      str2 = (String)paramMap.get(".sysmsg.apply_versions.version_desc#" + i + ".$maxInclude");
      w.i(paramString, "checkMsgPushedVersion. min" + i + "=%s,max" + i + "=%s", new Object[] { str1, str2 });
      if ((yp(str1)) && (yp(str2))) {
        break;
      }
      if (ch(str1, str2))
      {
        GMTrace.o(7152596942848L, 53291);
        return true;
      }
      i += 1;
    }
    GMTrace.o(7152596942848L, 53291);
    return false;
  }
  
  public static boolean yp(String paramString)
  {
    GMTrace.i(7149107281920L, 53265);
    if ((paramString == null) || (paramString.length() == 0))
    {
      GMTrace.o(7149107281920L, 53265);
      return true;
    }
    GMTrace.o(7149107281920L, 53265);
    return false;
  }
  
  public static String yq(String paramString)
  {
    GMTrace.i(7149241499648L, 53266);
    if (yp(paramString))
    {
      GMTrace.o(7149241499648L, 53266);
      return "";
    }
    String str = paramString;
    if (paramString.startsWith("\""))
    {
      str = paramString;
      if (paramString.endsWith("\"")) {
        str = paramString.substring(1, paramString.length() - 1);
      }
    }
    GMTrace.o(7149241499648L, 53266);
    return str;
  }
  
  public static String yr(String paramString)
  {
    GMTrace.i(7150583676928L, 53276);
    if (paramString == null)
    {
      GMTrace.o(7150583676928L, 53276);
      return "";
    }
    GMTrace.o(7150583676928L, 53276);
    return paramString;
  }
  
  public static String ys(String paramString)
  {
    GMTrace.i(7150717894656L, 53277);
    if (!aAI())
    {
      w.i(paramString, "wifi not connected. getConnectedWifiSsid() is empty");
      GMTrace.o(7150717894656L, 53277);
      return "";
    }
    Object localObject = (WifiManager)ab.getContext().getSystemService("wifi");
    if (localObject == null)
    {
      GMTrace.o(7150717894656L, 53277);
      return "";
    }
    localObject = ((WifiManager)localObject).getConnectionInfo();
    if (localObject == null)
    {
      GMTrace.o(7150717894656L, 53277);
      return "";
    }
    localObject = ((WifiInfo)localObject).getSSID();
    if (yp((String)localObject))
    {
      w.i(paramString, "getConnectedWifiSsid() is empty");
      GMTrace.o(7150717894656L, 53277);
      return "";
    }
    w.i(paramString, "getConnectedWifiSsid()=" + yq((String)localObject));
    paramString = yq((String)localObject);
    GMTrace.o(7150717894656L, 53277);
    return paramString;
  }
  
  public static String yt(String paramString)
  {
    GMTrace.i(7150852112384L, 53278);
    if (!aAI())
    {
      w.i(paramString, "wifi not connected. getConnectedWifiBssid() is empty");
      GMTrace.o(7150852112384L, 53278);
      return "";
    }
    Object localObject = (WifiManager)ab.getContext().getSystemService("wifi");
    if (localObject == null)
    {
      GMTrace.o(7150852112384L, 53278);
      return "";
    }
    localObject = ((WifiManager)localObject).getConnectionInfo();
    if (localObject == null)
    {
      GMTrace.o(7150852112384L, 53278);
      return "";
    }
    localObject = yr(((WifiInfo)localObject).getBSSID()).toLowerCase();
    w.i(paramString, "getConnectedWifiBssid()=" + (String)localObject);
    GMTrace.o(7150852112384L, 53278);
    return (String)localObject;
  }
  
  public static String yu(String paramString)
  {
    GMTrace.i(7150986330112L, 53279);
    Object localObject = (WifiManager)ab.getContext().getSystemService("wifi");
    if (localObject == null)
    {
      w.e(paramString, "error wifiManager is null!!");
      GMTrace.o(7150986330112L, 53279);
      return "";
    }
    localObject = ((WifiManager)localObject).getConnectionInfo();
    if (localObject == null)
    {
      w.e(paramString, "error wifiInfo is null!!");
      GMTrace.o(7150986330112L, 53279);
      return "";
    }
    String str = ((WifiInfo)localObject).getMacAddress();
    localObject = str;
    if (Build.VERSION.SDK_INT > 22) {
      if (str != null)
      {
        localObject = str;
        if (!str.equals("02:00:00:00:00:00")) {}
      }
      else
      {
        localObject = aAG();
      }
    }
    localObject = yr((String)localObject).toLowerCase();
    w.i(paramString, "getConnectedWifiClientMac()=" + (String)localObject);
    GMTrace.o(7150986330112L, 53279);
    return (String)localObject;
  }
  
  public static void yv(String paramString)
  {
    GMTrace.i(7153268031488L, 53296);
    w.i("FreeWifi", paramString);
    GMTrace.o(7153268031488L, 53296);
  }
  
  public static abstract interface a
  {
    public abstract void h(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ad.k paramk);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\freewifi\m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */