package com.tencent.mm.plugin.luckymoney.b;

import android.content.Context;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.g.a.oz;
import com.tencent.mm.platformtools.n;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.protocal.c.ahl;
import com.tencent.mm.protocal.c.ahm;
import com.tencent.mm.protocal.c.azp;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.bh;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.ar;
import com.tencent.mm.storage.x;
import com.tencent.mm.wallet_core.c.l;
import java.util.Arrays;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;

public abstract class p
  extends l
{
  com.tencent.mm.ad.b fUa;
  private com.tencent.mm.ad.e fUd;
  
  public p()
  {
    GMTrace.i(9739777867776L, 72567);
    GMTrace.o(9739777867776L, 72567);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(9740448956416L, 72572);
    this.fUd = parame1;
    int i = a(parame, this.fUa, this);
    GMTrace.o(9740448956416L, 72572);
    return i;
  }
  
  public abstract void a(int paramInt, String paramString, JSONObject paramJSONObject);
  
  public final int aMh()
  {
    GMTrace.i(9740717391872L, 72574);
    int i = aoB();
    GMTrace.o(9740717391872L, 72574);
    return i;
  }
  
  public abstract String aoA();
  
  public int aoB()
  {
    GMTrace.i(9740583174144L, 72573);
    GMTrace.o(9740583174144L, 72573);
    return -1;
  }
  
  public final void e(int paramInt1, int paramInt2, String paramString, com.tencent.mm.network.q paramq)
  {
    GMTrace.i(9740314738688L, 72571);
    w.i("MicroMsg.NetSceneLuckyMoneyBase", "Cmd : " + aoB() + ", errType = " + paramInt1 + ", errCode = " + paramInt2 + ", errMsg = " + paramString);
    paramq = (ahm)((com.tencent.mm.ad.b)paramq).gtD.gtK;
    int i;
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      i = paramq.uwY;
      Object localObject = n.b(paramq.uwX);
      if ((i == 0) && (!bg.nm((String)localObject)))
      {
        i = paramq.eDB;
        for (;;)
        {
          try
          {
            localJSONObject = new JSONObject((String)localObject);
            j = localJSONObject.getInt("retcode");
            localObject = paramq.errorMsg;
            paramq = (com.tencent.mm.network.q)localObject;
            if (bg.nm((String)localObject)) {
              paramq = localJSONObject.optString("retmsg");
            }
            if (!localJSONObject.has("showmess")) {
              continue;
            }
            w.i("MicroMsg.NetSceneLuckyMoneyBase", "has alert item");
            paramq = ac.E(localJSONObject);
            localObject = new oz();
            ((oz)localObject).eTU.eTV = paramq;
            a.vgX.m((com.tencent.mm.sdk.b.b)localObject);
          }
          catch (Exception paramString)
          {
            JSONObject localJSONObject;
            int j;
            w.printErrStackTrace("MicroMsg.NetSceneLuckyMoneyBase", paramString, "", new Object[0]);
            paramString = ab.getContext().getString(a.i.tbj);
            paramInt2 = 2;
            paramInt1 = 1000;
            continue;
          }
          if (paramInt1 != 0) {
            w.e("MicroMsg.NetSceneLuckyMoneyBase", "Cmd : " + aoB() + ", errType = " + paramInt1 + ", errCode = " + paramInt2 + ", errMsg = " + paramString);
          }
          this.fUd.a(paramInt1, paramInt2, paramString, this);
          GMTrace.o(9740314738688L, 72571);
          return;
          if ((j != 0) || (i != 0)) {
            break;
          }
          a(j, paramq, localJSONObject);
        }
        if (i != 0) {
          break label434;
        }
      }
    }
    label434:
    for (paramInt1 = 64536;; paramInt1 = i)
    {
      paramString = paramq;
      paramInt2 = paramInt1;
      paramInt1 = 1000;
      break;
      paramString = paramq.uwZ;
      paramInt2 = 2;
      paramInt1 = 1000;
      break;
      paramString = bh.q(paramString, "e");
      if (paramString != null)
      {
        w.d("MicroMsg.NetSceneLuckyMoneyBase", "CDN error!");
        paramString = (String)paramString.get(".e.Content");
        break;
      }
      paramString = ab.getContext().getString(a.i.tbj);
      break;
    }
  }
  
  public final void x(Map<String, String> paramMap)
  {
    GMTrace.i(9740180520960L, 72570);
    Object localObject1 = com.tencent.mm.y.q.zE();
    com.tencent.mm.kernel.h.xz();
    localObject1 = ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).yK().TE((String)localObject1);
    if (localObject1 != null)
    {
      paramMap.put("province", ((x)localObject1).bSD());
      paramMap.put("city", ((x)localObject1).getCityCode());
    }
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
    localObject1 = (ahl)this.fUa.gtC.gtK;
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
    w.i("MicroMsg.NetSceneLuckyMoneyBase", "Cmd : " + ((ahl)localObject1).uwU + ", req = " + localStringBuilder.toString());
    paramMap = localStringBuilder.toString().getBytes();
    ((ahl)localObject1).uwW = new azp().be(paramMap);
    GMTrace.o(9740180520960L, 72570);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\luckymoney\b\p.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */