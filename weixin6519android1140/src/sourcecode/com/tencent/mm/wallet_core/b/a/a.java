package com.tencent.mm.wallet_core.b.a;

import android.content.Context;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.network.q;
import com.tencent.mm.platformtools.n;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.protocal.c.ahl;
import com.tencent.mm.protocal.c.ahm;
import com.tencent.mm.protocal.c.azp;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.bh;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.wallet_core.c.l;
import java.util.Arrays;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;

public abstract class a
  extends l
{
  private b fUa;
  private com.tencent.mm.ad.e fUd;
  
  public a()
  {
    GMTrace.i(16863249563648L, 125641);
    GMTrace.o(16863249563648L, 125641);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(16863920652288L, 125646);
    this.fUd = parame1;
    int i = a(parame, this.fUa, this);
    GMTrace.o(16863920652288L, 125646);
    return i;
  }
  
  public abstract void a(int paramInt, String paramString, JSONObject paramJSONObject);
  
  public abstract String aoA();
  
  public abstract int aoB();
  
  public boolean aoC()
  {
    GMTrace.i(16864054870016L, 125647);
    GMTrace.o(16864054870016L, 125647);
    return false;
  }
  
  public final void e(int paramInt1, int paramInt2, String paramString, q paramq)
  {
    GMTrace.i(16863786434560L, 125645);
    w.i("MiroMsg.NetSceneTenpayH5TransferBase", "Cmd : " + aoB() + ", errType = " + paramInt1 + ", errCode = " + paramInt2 + ", errMsg = " + paramString + " " + getType());
    ahm localahm = (ahm)((b)paramq).gtD.gtK;
    int i;
    int j;
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      i = localahm.uwY;
      paramq = n.b(localahm.uwX);
      if ((i == 0) && (!bg.nm(paramq))) {
        j = localahm.eDB;
      }
    }
    for (;;)
    {
      try
      {
        localJSONObject = new JSONObject(paramq);
        i = localJSONObject.getInt("retcode");
        String str = localJSONObject.optString("retmsg");
        paramq = str;
        if (!bg.nm(str)) {
          break label401;
        }
        paramq = localahm.errorMsg;
      }
      catch (Exception paramString)
      {
        JSONObject localJSONObject;
        w.printErrStackTrace("MiroMsg.NetSceneTenpayH5TransferBase", paramString, "", new Object[0]);
        paramInt1 = 1000;
        paramInt2 = 2;
        paramString = ab.getContext().getString(a.i.tbj);
        continue;
      }
      if (aoC())
      {
        a(i, paramq, localJSONObject);
        if (paramInt1 != 0) {
          w.e("MiroMsg.NetSceneTenpayH5TransferBase", "Cmd : " + aoB() + ", errType = " + paramInt1 + ", errCode = " + paramInt2 + ", errMsg = " + paramString);
        }
        this.fUd.a(paramInt1, paramInt2, paramString, this);
        GMTrace.o(16863786434560L, 125645);
        return;
      }
      i = 1000;
      if (j == 0)
      {
        paramInt1 = 64536;
        paramString = paramq;
        paramInt2 = paramInt1;
        paramInt1 = i;
        continue;
        paramInt1 = 1000;
        paramInt2 = 2;
        paramString = localahm.uwZ;
        continue;
        paramString = bh.q(paramString, "e");
        if (paramString != null)
        {
          w.d("MiroMsg.NetSceneTenpayH5TransferBase", "CDN error!");
          paramString = (String)paramString.get(".e.Content");
        }
        else
        {
          paramString = ab.getContext().getString(a.i.tbj);
        }
      }
      else
      {
        paramInt1 = j;
        continue;
        label401:
        if (i == 0) {
          if (j == 0) {}
        }
      }
    }
  }
  
  public final void x(Map<String, String> paramMap)
  {
    GMTrace.i(16863652216832L, 125644);
    if (this.fUa == null)
    {
      localObject1 = new b.a();
      ((b.a)localObject1).gtF = new ahl();
      ((b.a)localObject1).gtG = new ahm();
      ((b.a)localObject1).uri = aoA();
      ((b.a)localObject1).gtE = getType();
      ((b.a)localObject1).gtH = 0;
      ((b.a)localObject1).gtI = 0;
      this.fUa = ((b.a)localObject1).DA();
      this.fUa.gtT = true;
    }
    Object localObject1 = (ahl)this.fUa.gtC.gtK;
    ((ahl)localObject1).uwU = aoB();
    ((ahl)localObject1).uwV = 1;
    Object[] arrayOfObject = paramMap.keySet().toArray();
    Arrays.sort(arrayOfObject);
    StringBuilder localStringBuilder = new StringBuilder();
    int i = 0;
    int k;
    for (int j = 0; i < arrayOfObject.length; j = k)
    {
      Object localObject2 = arrayOfObject[i];
      String str = (String)paramMap.get(localObject2);
      k = j;
      if (!bg.nm(str))
      {
        if (j != 0) {
          localStringBuilder.append("&");
        }
        localStringBuilder.append(localObject2);
        localStringBuilder.append("=");
        localStringBuilder.append(str);
        k = 1;
      }
      i += 1;
    }
    w.i("MiroMsg.NetSceneTenpayH5TransferBase", "Cmd : " + ((ahl)localObject1).uwU + ", req = " + localStringBuilder.toString());
    paramMap = localStringBuilder.toString().getBytes();
    ((ahl)localObject1).uwW = new azp().be(paramMap);
    GMTrace.o(16863652216832L, 125644);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\wallet_core\b\a\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */