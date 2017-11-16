package com.tencent.mm.plugin.shake.d.a;

import android.bluetooth.BluetoothAdapter;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build.VERSION;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.compatible.d.p;
import com.tencent.mm.modelstat.n;
import com.tencent.mm.network.q;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.protocal.c.ahx;
import com.tencent.mm.protocal.c.ahy;
import com.tencent.mm.protocal.c.aid;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.y.bk;
import java.util.Collection;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class d
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  int action;
  private com.tencent.mm.ad.e fUd;
  final b gMj;
  private long oOm;
  
  public d(Collection<h.a> paramCollection, float paramFloat1, float paramFloat2, int paramInt)
  {
    GMTrace.i(6600827863040L, 49180);
    this.action = 1;
    this.oOm = 0L;
    this.action = 1;
    Object localObject1 = new b.a();
    ((b.a)localObject1).gtF = new ahx();
    ((b.a)localObject1).gtG = new ahy();
    ((b.a)localObject1).uri = "/cgi-bin/micromsg-bin/ibeaconboardcast";
    ((b.a)localObject1).gtE = 658;
    ((b.a)localObject1).gtH = 0;
    ((b.a)localObject1).gtI = 0;
    this.gMj = ((b.a)localObject1).DA();
    Object localObject2 = bk.BE();
    localObject1 = bg.nl(((bk)localObject2).goV);
    localObject2 = bg.nl(((bk)localObject2).goU);
    BluetoothAdapter localBluetoothAdapter = BluetoothAdapter.getDefaultAdapter();
    ahx localahx = (ahx)this.gMj.gtC.gtK;
    localahx.uxu = bg.nl(null);
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("{\"Beacons\":[");
    if (paramCollection != null)
    {
      j = paramCollection.size();
      Iterator localIterator = paramCollection.iterator();
      i = 0;
      while (localIterator.hasNext())
      {
        h.a locala = (h.a)localIterator.next();
        localStringBuilder.append("{\"UUID\":\"" + locala.lOv + "\",\"Location\":{\"Major\":" + locala.major + ",\"Minor\":" + locala.minor + "},\"Distance\":" + locala.gSX + ",\"Extra\":\"\",\"MacAddress\":\"" + locala.oOw + "\",\"Rssi\":\"" + locala.oOx + "\",\"MeasurePower\":\"" + locala.oOy + "\"}");
        if (i < j - 1) {
          localStringBuilder.append(",");
        }
        i += 1;
      }
    }
    int j = 1;
    boolean bool = ab.getContext().getPackageManager().hasSystemFeature("android.hardware.bluetooth_le");
    int i = j;
    if (localBluetoothAdapter != null)
    {
      i = j;
      if (localBluetoothAdapter.getState() == 12)
      {
        i = j;
        if (Build.VERSION.SDK_INT >= 18)
        {
          i = j;
          if (bool) {
            i = 0;
          }
        }
      }
    }
    localStringBuilder.append("],\"Action\":1" + ",\"LBS\":{\"Latitude\":" + paramFloat1 + ",\"Longitude\":" + paramFloat2 + ",\"Province\":\"" + (String)localObject1 + "\",\"City\":\"" + (String)localObject2 + "\"},\"MachineID\":\"" + p.ta() + "\",\"ZBBeaconState\":\"" + i + "\"}");
    localahx.nIp = localStringBuilder.toString();
    if (paramCollection != null) {}
    for (i = paramCollection.size();; i = 0)
    {
      w.i("MicroMsg.NetSceneShakeIbeacon", "[oneliang]beaconCollection.size:%d,json:%s", new Object[] { Integer.valueOf(i), localahx.nIp });
      n.a(2008, paramFloat2, paramFloat1, paramInt);
      GMTrace.o(6600827863040L, 49180);
      return;
    }
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(6601096298496L, 49182);
    this.oOm = System.currentTimeMillis();
    this.fUd = parame1;
    int i = a(parame, this.gMj, this);
    GMTrace.o(6601096298496L, 49182);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(6601230516224L, 49183);
    w.i("MicroMsg.NetSceneShakeIbeacon", "[oneliang][NetSceneShakeIbeacon]:netId:%s,errType:%s,errCode:%s,errMsg:%s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    this.fUd.a(paramInt2, paramInt3, paramString, this);
    this.oOm = (System.currentTimeMillis() - this.oOm);
    g.ork.i(11497, new Object[] { String.valueOf((int)(this.oOm / 1000L + 0.5D)), Integer.valueOf(1), Integer.valueOf((int)this.oOm) });
    if ((paramInt2 == 0) && (paramInt3 == 0))
    {
      w.d("MicroMsg.NetSceneShakeIbeacon", "[oneliang][NetSceneShakeIbeacon]:net end ok");
      paramString = (ahy)this.gMj.gtD.gtK;
    }
    for (;;)
    {
      Object localObject1;
      int i;
      try
      {
        paramq = new JSONObject(((ahx)this.gMj.gtC.gtK).nIp);
        localObject1 = paramq.getJSONArray("Beacons");
        paramInt1 = ((JSONArray)localObject1).length();
        paramArrayOfByte = paramq.getJSONObject("LBS");
        paramInt2 = paramq.getInt("Action");
        paramq = paramArrayOfByte.getString("Latitude");
        paramArrayOfByte = paramArrayOfByte.getString("Longitude");
        if (paramInt1 > 0)
        {
          Object localObject2 = ((JSONArray)localObject1).getJSONObject(0);
          localObject1 = ((JSONObject)localObject2).getString("UUID");
          localObject2 = ((JSONObject)localObject2).getJSONObject("Location");
          paramInt3 = ((JSONObject)localObject2).getInt("Major");
          i = ((JSONObject)localObject2).getInt("Minor");
          if (paramString.uxv.ucS == 0)
          {
            localObject2 = paramString.uxv.lPJ;
            if ((paramInt2 == 1) && (localObject2 != null) && (!((String)localObject2).equals("")) && (new JSONObject((String)localObject2).getJSONArray("msgs").length() == 0)) {
              g.ork.i(12659, new Object[] { Integer.valueOf(1), Integer.valueOf(paramInt1), localObject1, Integer.valueOf(paramInt3), Integer.valueOf(i), paramq, paramArrayOfByte, Integer.valueOf(2), Integer.valueOf(paramString.uxv.ucS) });
            }
            GMTrace.o(6601230516224L, 49183);
            return;
          }
          g.ork.i(12659, new Object[] { Integer.valueOf(1), Integer.valueOf(paramInt1), localObject1, Integer.valueOf(paramInt3), Integer.valueOf(i), paramq, paramArrayOfByte, Integer.valueOf(2), Integer.valueOf(paramString.uxv.ucS) });
          GMTrace.o(6601230516224L, 49183);
          return;
        }
      }
      catch (JSONException paramString)
      {
        w.e("MicroMsg.NetSceneShakeIbeacon", "parse IBeaconBoardcastRequest json error!");
        GMTrace.o(6601230516224L, 49183);
        return;
      }
      g.ork.i(12659, new Object[] { Integer.valueOf(1), Integer.valueOf(paramInt1), "", Integer.valueOf(0), Integer.valueOf(0), paramq, paramArrayOfByte, Integer.valueOf(2), Integer.valueOf(paramString.uxv.ucS) });
      GMTrace.o(6601230516224L, 49183);
      return;
      w.d("MicroMsg.NetSceneShakeIbeacon", "[oneliang][NetSceneShakeIbeacon]:net end not ok");
      paramString = ((ahx)this.gMj.gtC.gtK).nIp;
      try
      {
        paramString = new JSONObject(paramString);
        paramArrayOfByte = paramString.getJSONArray("Beacons");
        paramInt1 = paramArrayOfByte.length();
        paramq = paramString.getJSONObject("LBS");
        paramString = paramq.getString("Latitude");
        paramq = paramq.getString("Longitude");
        if (paramInt1 <= 0) {
          break;
        }
        localObject1 = paramArrayOfByte.getJSONObject(0);
        paramArrayOfByte = ((JSONObject)localObject1).getString("UUID");
        localObject1 = ((JSONObject)localObject1).getJSONObject("Location");
        paramInt2 = ((JSONObject)localObject1).getInt("Major");
        i = ((JSONObject)localObject1).getInt("Minor");
        g.ork.i(12659, new Object[] { Integer.valueOf(1), Integer.valueOf(paramInt1), paramArrayOfByte, Integer.valueOf(paramInt2), Integer.valueOf(i), paramString, paramq, Integer.valueOf(1), Integer.valueOf(paramInt3) });
        GMTrace.o(6601230516224L, 49183);
        return;
      }
      catch (JSONException paramString)
      {
        w.e("MicroMsg.NetSceneShakeIbeacon", "parse IBeaconBoardcastRequest json error!");
      }
    }
    g.ork.i(12659, new Object[] { Integer.valueOf(1), Integer.valueOf(paramInt1), "", Integer.valueOf(0), Integer.valueOf(0), paramString, paramq, Integer.valueOf(1), Integer.valueOf(paramInt3) });
    GMTrace.o(6601230516224L, 49183);
  }
  
  public final int getType()
  {
    GMTrace.i(6600962080768L, 49181);
    GMTrace.o(6600962080768L, 49181);
    return 658;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\shake\d\a\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */