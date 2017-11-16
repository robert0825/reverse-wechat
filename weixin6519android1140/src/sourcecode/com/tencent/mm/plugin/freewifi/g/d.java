package com.tencent.mm.plugin.freewifi.g;

import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.e.e;
import com.tencent.mm.sdk.e.i;
import com.tencent.mm.sdk.platformtools.aa;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;

public final class d
  extends i<c>
{
  public static final String[] fTX;
  
  static
  {
    GMTrace.i(7155683950592L, 53314);
    fTX = new String[] { i.a(c.fTp, "FreeWifiInfo"), "CREATE INDEX IF NOT EXISTS freewifi_md5_ssid  on FreeWifiInfo  (  ssidmd5 )" };
    GMTrace.o(7155683950592L, 53314);
  }
  
  public d(e parame)
  {
    super(parame, c.fTp, "FreeWifiInfo", null);
    GMTrace.i(7155012861952L, 53309);
    GMTrace.o(7155012861952L, 53309);
  }
  
  public final c aBG()
  {
    GMTrace.i(7155415515136L, 53312);
    w.d("MicroMsg.FreeWifi.FreeWifiInfoStorage", "getLastConnectSuccessWifiInfo, sql : %s", new Object[] { "select * from FreeWifiInfo where connectState = 2" });
    Cursor localCursor = rawQuery("select * from FreeWifiInfo where connectState = 2", new String[0]);
    if (localCursor == null)
    {
      w.e("MicroMsg.FreeWifi.FreeWifiInfoStorage", "no connected sucess wifi info");
      GMTrace.o(7155415515136L, 53312);
      return null;
    }
    if (localCursor.moveToFirst())
    {
      c localc = new c();
      localc.b(localCursor);
      localCursor.close();
      GMTrace.o(7155415515136L, 53312);
      return localc;
    }
    localCursor.close();
    GMTrace.o(7155415515136L, 53312);
    return null;
  }
  
  public final c yG(String paramString)
  {
    GMTrace.i(7155147079680L, 53310);
    if (bg.nm(paramString))
    {
      w.e("MicroMsg.FreeWifi.FreeWifiInfoStorage", "ssid is null");
      GMTrace.o(7155147079680L, 53310);
      return null;
    }
    paramString = "select * from FreeWifiInfo where ssidmd5 = '" + aa.RP(paramString) + "' and wifiType = 1";
    w.d("MicroMsg.FreeWifi.FreeWifiInfoStorage", "getFreeWifiInfoBySSID, sql : %s", new Object[] { paramString });
    paramString = rawQuery(paramString, new String[0]);
    if (paramString == null)
    {
      w.e("MicroMsg.FreeWifi.FreeWifiInfoStorage", "cursor is null");
      GMTrace.o(7155147079680L, 53310);
      return null;
    }
    if (paramString.moveToFirst())
    {
      c localc = new c();
      localc.b(paramString);
      paramString.close();
      GMTrace.o(7155147079680L, 53310);
      return localc;
    }
    paramString.close();
    GMTrace.o(7155147079680L, 53310);
    return null;
  }
  
  public final c yH(String paramString)
  {
    GMTrace.i(7155281297408L, 53311);
    if (bg.nm(paramString))
    {
      w.e("MicroMsg.FreeWifi.FreeWifiInfoStorage", "ssid is null");
      GMTrace.o(7155281297408L, 53311);
      return null;
    }
    paramString = "select * from FreeWifiInfo where ssidmd5 = '" + aa.RP(paramString) + "'";
    w.d("MicroMsg.FreeWifi.FreeWifiInfoStorage", "getFreeWifiInfoBySSID, sql : %s", new Object[] { paramString });
    paramString = rawQuery(paramString, new String[0]);
    if (paramString == null)
    {
      w.e("MicroMsg.FreeWifi.FreeWifiInfoStorage", "cursor is null");
      GMTrace.o(7155281297408L, 53311);
      return null;
    }
    if (paramString.moveToFirst())
    {
      c localc = new c();
      localc.b(paramString);
      paramString.close();
      GMTrace.o(7155281297408L, 53311);
      return localc;
    }
    paramString.close();
    GMTrace.o(7155281297408L, 53311);
    return null;
  }
  
  public final void yI(String paramString)
  {
    GMTrace.i(7155549732864L, 53313);
    paramString = "update FreeWifiInfo set connectState = -1 where ssidmd5 !='" + aa.RP(paramString) + "'";
    w.d("MicroMsg.FreeWifi.FreeWifiInfoStorage", "updateOtherAp : %s", new Object[] { paramString });
    w.d("MicroMsg.FreeWifi.FreeWifiInfoStorage", "update other ap  ret = %b", new Object[] { Boolean.valueOf(eZ("FreeWifiInfo", paramString)) });
    GMTrace.o(7155549732864L, 53313);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\freewifi\g\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */