package com.tencent.mm.plugin.freewifi.b;

import android.database.MatrixCursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.e;
import com.tencent.mm.ad.k;
import com.tencent.mm.g.a.ew;
import com.tencent.mm.g.a.ew.a;
import com.tencent.mm.plugin.freewifi.d.j;
import com.tencent.mm.plugin.freewifi.m;
import com.tencent.mm.protocal.c.ank;
import com.tencent.mm.protocal.c.anl;
import com.tencent.mm.protocal.c.anm;
import com.tencent.mm.sdk.platformtools.w;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

public final class c
{
  public static final String[] lpC;
  private static final String[] lpD;
  private int lpE;
  private int lpF;
  private long lpG;
  
  static
  {
    GMTrace.i(7126290268160L, 53095);
    lpC = new String[] { "ssid", "bssid", "rssi", "isWechatWifi", "wechatShopName", "maxApCount", "intervalSeconds" };
    lpD = new String[] { "errcode", "errmsg", "maxApCount", "intervalSeconds" };
    GMTrace.o(7126290268160L, 53095);
  }
  
  public c()
  {
    GMTrace.i(7124411219968L, 53081);
    this.lpE = 200;
    this.lpF = 180;
    this.lpG = 0L;
    GMTrace.o(7124411219968L, 53081);
  }
  
  public static void a(ew paramew, MatrixCursor paramMatrixCursor)
  {
    GMTrace.i(16034723528704L, 119468);
    w.i("MicroMsg.FreeWifi.FreeWifiManufacturerGetWifiListHelper", "FreeWifiManufacturerGetWifiListHelper setResult. errorcode=%d, errmsg=%s", new Object[] { Integer.valueOf(1), null });
    paramew.eGR.eGT = paramMatrixCursor;
    paramew.eGR.eGx = 1;
    if (paramew.eDO != null) {
      paramew.eDO.run();
    }
    GMTrace.o(16034723528704L, 119468);
  }
  
  public static c aAL()
  {
    GMTrace.i(7124545437696L, 53082);
    c localc = a.lpL;
    GMTrace.o(7124545437696L, 53082);
    return localc;
  }
  
  private long aAO()
  {
    try
    {
      GMTrace.i(7125484961792L, 53089);
      long l = this.lpG;
      GMTrace.o(7125484961792L, 53089);
      return l;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final void a(final ew paramew)
  {
    int j = 0;
    for (;;)
    {
      Object localObject;
      try
      {
        GMTrace.i(7124679655424L, 53083);
        w.i("MicroMsg.FreeWifi.FreeWifiManufacturerGetWifiListHelper", "method getWifiList called. reqMaxApCount=" + aAM() + "; reqIntervalSeconds=" + aAN());
        localObject = paramew.eGQ.eGS;
        if ((localObject != null) && (localObject.length != 0)) {
          continue;
        }
        a(paramew, 1101, "Args is empty.");
        GMTrace.o(7124679655424L, 53083);
      }
      finally
      {
        try
        {
          StringBuilder localStringBuilder;
          i = Integer.valueOf(localObject[0]).intValue();
          if (i != 1) {
            break label738;
          }
          if (localObject.length == 3) {
            break label266;
          }
          a(paramew, 1104, "Args.length should be 3, but now it is " + localObject.length + ".");
          GMTrace.o(7124679655424L, 53083);
        }
        catch (Exception localException1)
        {
          a(paramew, 1102, "Args[0] is not an integer.");
          GMTrace.o(7124679655424L, 53083);
        }
        paramew = finally;
      }
      return;
      localStringBuilder = new StringBuilder();
      int i = 0;
      if (i < localObject.length)
      {
        localStringBuilder.append("args[" + i + "] = " + localObject[i]);
        i += 1;
      }
      else
      {
        w.i("MicroMsg.FreeWifi.FreeWifiManufacturerGetWifiListHelper", "args: " + localStringBuilder.toString());
        continue;
        label266:
        final int k;
        try
        {
          k = Integer.valueOf(localObject[2]).intValue();
          if ((k == 1) || (k == 2)) {
            break label334;
          }
          a(paramew, 1106, "Args[2] should be integer 1 (from setting) or integer 2 (from background).");
          GMTrace.o(7124679655424L, 53083);
        }
        catch (Exception localException2)
        {
          a(paramew, 1107, "Args[2] is not a valid int value.");
          GMTrace.o(7124679655424L, 53083);
        }
        continue;
        label334:
        if ((aAO() != 0L) && (System.currentTimeMillis() - aAO() < aAN()) && (k == 2))
        {
          a(paramew, 1109, "Request frequence is out of limit. The time btween two background request should be more than  " + this.lpF + " seconds.");
          GMTrace.o(7124679655424L, 53083);
        }
        else if (m.yp(localObject[1]))
        {
          a(paramew, 1105, "Args[1] should be an ap list json string, but now it is empty.");
          GMTrace.o(7124679655424L, 53083);
        }
        else
        {
          LinkedList localLinkedList = new LinkedList();
          try
          {
            localObject = new JSONArray(localObject[1]);
            if (((JSONArray)localObject).length() > aAM())
            {
              a(paramew, 1110, "jsonArray.length()=" + ((JSONArray)localObject).length() + ". Too many ap. The number of ap requested per time should be between 1 and " + aAM() + ".");
              GMTrace.o(7124679655424L, 53083);
              continue;
            }
            i = j;
            if (((JSONArray)localObject).length() == 0)
            {
              a(paramew, 1110, "jsonArray.length()=" + ((JSONArray)localObject).length() + ". Too many ap. The number of ap requested per time should be between 1 and " + aAM() + ".");
              GMTrace.o(7124679655424L, 53083);
              continue;
            }
            while (i < ((JSONArray)localObject).length())
            {
              JSONObject localJSONObject = ((JSONArray)localObject).getJSONObject(i);
              anl localanl = new anl();
              localanl.ssid = m.yq(localJSONObject.getString("ssid"));
              localanl.bssid = localJSONObject.getString("bssid");
              localanl.eGw = localJSONObject.getInt("rssi");
              localLinkedList.add(localanl);
              i += 1;
            }
          }
          catch (Exception localException3)
          {
            a(paramew, 1105, "Args[1] is not a valid json array value and it should be a string like  [  {    \"ssid\": \"SSID_NAME\",    \"bssid\": \"0e:00:00:00:00:00\",    \"rssi\": -45  }].");
            GMTrace.o(7124679655424L, 53083);
          }
          new j(localException3, k).b(new e()
          {
            public final void a(int paramAnonymousInt1, int paramAnonymousInt2, String paramAnonymousString, k paramAnonymousk)
            {
              GMTrace.i(7121458429952L, 53059);
              synchronized (c.this)
              {
                paramAnonymousk = ((j)paramAnonymousk).aBy();
                c.this.cz(System.currentTimeMillis());
                localObject1 = c.this;
                int i;
                if (paramAnonymousk.lpF <= 0) {
                  i = 180;
                }
                for (;;)
                {
                  ((c)localObject1).nR(i);
                  w.i("MicroMsg.FreeWifi.FreeWifiManufacturerGetWifiListHelper", "resp.reqMaxApCount=" + paramAnonymousk.lpE);
                  if (paramAnonymousk.lpE <= 0)
                  {
                    i = 200;
                    label101:
                    w.i("MicroMsg.FreeWifi.FreeWifiManufacturerGetWifiListHelper", "_reqMaxApCount = " + i);
                    c.this.nQ(i);
                    if ((paramAnonymousInt1 != 0) || (paramAnonymousInt2 != 0)) {
                      break label1034;
                    }
                    paramAnonymousString = paramAnonymousk.uCn;
                    localObject1 = null;
                  }
                  for (;;)
                  {
                    try
                    {
                      paramAnonymousk = new MatrixCursor(c.lpC);
                    }
                    catch (Exception paramAnonymousString)
                    {
                      anm localanm;
                      Object localObject2;
                      paramAnonymousk = (k)localObject1;
                      continue;
                      paramAnonymousInt1 += 1;
                      continue;
                    }
                    try
                    {
                      localObject1 = new HashMap();
                      paramAnonymousInt1 = 0;
                      if (paramAnonymousInt1 < paramAnonymousString.size())
                      {
                        localanm = (anm)paramAnonymousString.get(paramAnonymousInt1);
                        ((Map)localObject1).put(localanm.ssid + "-" + localanm.bssid, Integer.valueOf(paramAnonymousInt1));
                        paramAnonymousInt1 += 1;
                        continue;
                        i = paramAnonymousk.lpF;
                        break;
                        i = paramAnonymousk.lpE;
                        break label101;
                      }
                      paramAnonymousInt1 = 0;
                      if (paramAnonymousInt1 >= localException3.size()) {
                        continue;
                      }
                      localObject2 = (anl)localException3.get(paramAnonymousInt1);
                      localanm = new anm();
                      localanm.ssid = ((anl)localObject2).ssid;
                      localanm.bssid = ((anl)localObject2).bssid;
                      localanm.eGw = ((anl)localObject2).eGw;
                      localanm.uCo = 0;
                      localanm.uCp = null;
                      localanm.low = 0;
                      localanm.eCE = null;
                      if (((Map)localObject1).get(localanm.ssid + "-" + localanm.bssid) != null)
                      {
                        localObject2 = (Integer)((Map)localObject1).get(localanm.ssid + "-" + localanm.bssid);
                        if (paramAnonymousString.get(((Integer)localObject2).intValue()) != null)
                        {
                          localanm.uCo = ((anm)paramAnonymousString.get(((Integer)localObject2).intValue())).uCo;
                          localanm.uCp = ((anm)paramAnonymousString.get(((Integer)localObject2).intValue())).uCp;
                          localanm.low = ((anm)paramAnonymousString.get(((Integer)localObject2).intValue())).low;
                          localanm.eCE = ((anm)paramAnonymousString.get(((Integer)localObject2).intValue())).eCE;
                        }
                      }
                      if ((localanm.low != 4) && (localanm.low != 31))
                      {
                        paramAnonymousk.addRow(new Object[] { localanm.ssid, localanm.bssid, Integer.valueOf(localanm.eGw), Integer.valueOf(0), null, Integer.valueOf(c.this.aAM()), Integer.valueOf(c.this.aAN()) });
                        w.i("MicroMsg.FreeWifi.FreeWifiManufacturerGetWifiListHelper", "cursor add row. ssid=%s, bssid=%s, rssi=%d, isWechatwifi=%d, wechatShopName=%s, maxApCount=%d, reqIntervalSeconds=%d", new Object[] { localanm.ssid, localanm.bssid, Integer.valueOf(localanm.eGw), Integer.valueOf(0), null, Integer.valueOf(c.this.aAM()), Integer.valueOf(c.this.aAN()) });
                      }
                      else
                      {
                        paramAnonymousk.addRow(new Object[] { localanm.ssid, localanm.bssid, Integer.valueOf(localanm.eGw), Integer.valueOf(localanm.uCo), localanm.uCp, Integer.valueOf(c.this.aAM()), Integer.valueOf(c.this.aAN()) });
                        w.i("MicroMsg.FreeWifi.FreeWifiManufacturerGetWifiListHelper", "cursor add row. ssid=%s, bssid=%s, rssi=%d, isWechatwifi=%d, wechatShopName=%s, maxApCount=%d, reqIntervalSeconds=%d", new Object[] { localanm.ssid, localanm.bssid, Integer.valueOf(localanm.eGw), Integer.valueOf(localanm.uCo), localanm.uCp, Integer.valueOf(c.this.aAM()), Integer.valueOf(c.this.aAN()) });
                        if ((localanm.uCo == 1) && (k == 1))
                        {
                          a.a.lpx.c(localanm.ssid, localanm.bssid, localanm.eCE, localanm.low);
                          w.i("MicroMsg.FreeWifi.FreeWifiManufacturerGetWifiListHelper", "cached : ssid=%s, bssid=%s, apKey=%s, protocolType=%d. ", new Object[] { localanm.ssid, localanm.bssid, localanm.eCE, Integer.valueOf(localanm.low) });
                        }
                      }
                    }
                    catch (Exception paramAnonymousString) {}
                  }
                }
                if (paramAnonymousk != null) {
                  paramAnonymousk.close();
                }
                w.e("MicroMsg.FreeWifi.FreeWifiManufacturerGetWifiListHelper", "exception in getWifiList syncTaskCur.", new Object[] { paramAnonymousString });
                c.this.a(paramew, 1108, "cursor exception.");
                GMTrace.o(7121458429952L, 53059);
                return;
                c.a(paramew, paramAnonymousk);
                GMTrace.o(7121458429952L, 53059);
                return;
                label1034:
                if (paramAnonymousInt2 == 35501)
                {
                  c.this.a(paramew, 1110, "Too many ap. The number of ap requested per time should be between 1 and " + c.this.aAM() + ".");
                  GMTrace.o(7121458429952L, 53059);
                  return;
                }
                c.this.a(paramew, 1121, "Server returns errtype= " + paramAnonymousInt1 + ", errcode=" + paramAnonymousInt2 + ", errMsg=" + m.yr(paramAnonymousString) + ".");
                GMTrace.o(7121458429952L, 53059);
                return;
              }
            }
          });
          GMTrace.o(7124679655424L, 53083);
          continue;
          label738:
          a(paramew, 1103, "Wechant installed currently only supports version 1.");
          GMTrace.o(7124679655424L, 53083);
        }
      }
    }
  }
  
  public final void a(ew paramew, int paramInt, String paramString)
  {
    GMTrace.i(7124813873152L, 53084);
    w.i("MicroMsg.FreeWifi.FreeWifiManufacturerGetWifiListHelper", "FreeWifiManufacturerGetWifiListHelper setErrorResult. errorcode=%d, errmsg=%s", new Object[] { Integer.valueOf(paramInt), paramString });
    try
    {
      localMatrixCursor = new MatrixCursor(lpD);
      if (localMatrixCursor == null) {
        break label141;
      }
    }
    catch (Exception paramString)
    {
      try
      {
        localMatrixCursor.addRow(new Object[] { Integer.valueOf(paramInt), paramString, Integer.valueOf(aAM()), Integer.valueOf(aAN()) });
        paramew.eGR.eGT = localMatrixCursor;
        paramew.eGR.eGx = 1;
        if (paramew.eDO != null) {
          paramew.eDO.run();
        }
        GMTrace.o(7124813873152L, 53084);
        return;
      }
      catch (Exception paramString)
      {
        MatrixCursor localMatrixCursor;
        for (;;) {}
      }
      paramString = paramString;
      localMatrixCursor = null;
    }
    localMatrixCursor.close();
    label141:
    w.e("MicroMsg.FreeWifi.FreeWifiManufacturerGetWifiListHelper", "exception in getWifiList syncTaskCur.", new Object[] { paramString });
    paramew.eGR.eGT = null;
    paramew.eGR.eGx = 1;
    if (paramew.eDO != null) {
      paramew.eDO.run();
    }
    GMTrace.o(7124813873152L, 53084);
  }
  
  public final int aAM()
  {
    try
    {
      GMTrace.i(7124948090880L, 53085);
      w.i("MicroMsg.FreeWifi.FreeWifiManufacturerGetWifiListHelper", "getReqMaxApCount() returns " + this.lpE);
      int i = this.lpE;
      GMTrace.o(7124948090880L, 53085);
      return i;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final int aAN()
  {
    try
    {
      GMTrace.i(7125216526336L, 53087);
      int i = this.lpF;
      GMTrace.o(7125216526336L, 53087);
      return i;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final void cz(long paramLong)
  {
    try
    {
      GMTrace.i(7125619179520L, 53090);
      this.lpG = paramLong;
      GMTrace.o(7125619179520L, 53090);
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final void nQ(int paramInt)
  {
    try
    {
      GMTrace.i(7125082308608L, 53086);
      w.i("MicroMsg.FreeWifi.FreeWifiManufacturerGetWifiListHelper", "setReqMaxApCount() param reqMaxApCount = " + paramInt);
      this.lpE = paramInt;
      w.i("MicroMsg.FreeWifi.FreeWifiManufacturerGetWifiListHelper", "setReqMaxApCount() this.reqMaxApCount = " + this.lpE);
      GMTrace.o(7125082308608L, 53086);
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final void nR(int paramInt)
  {
    try
    {
      GMTrace.i(7125350744064L, 53088);
      this.lpF = paramInt;
      GMTrace.o(7125350744064L, 53088);
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  private static final class a
  {
    public static c lpL;
    
    static
    {
      GMTrace.i(7123740131328L, 53076);
      lpL = new c();
      GMTrace.o(7123740131328L, 53076);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\freewifi\b\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */