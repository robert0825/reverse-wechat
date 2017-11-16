package com.tencent.mm.plugin.offline.a;

import android.content.Context;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.compatible.util.p;
import com.tencent.mm.network.q;
import com.tencent.mm.platformtools.n;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.protocal.c.azp;
import com.tencent.mm.protocal.c.biv;
import com.tencent.mm.protocal.c.biw;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.bh;
import com.tencent.mm.sdk.platformtools.w;
import com.tenpay.android.wechat.TenpayUtil;
import java.util.Arrays;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;

public abstract class h
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  private b fUa;
  private com.tencent.mm.ad.e fUd;
  
  public h()
  {
    GMTrace.i(6190658486272L, 46124);
    GMTrace.o(6190658486272L, 46124);
  }
  
  public int Bb()
  {
    GMTrace.i(6191732228096L, 46132);
    GMTrace.o(6191732228096L, 46132);
    return 385;
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(6191329574912L, 46129);
    this.fUd = parame1;
    int i = a(parame, this.fUa, this);
    GMTrace.o(6191329574912L, 46129);
    return i;
  }
  
  public void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(6191463792640L, 46130);
    w.i("MicroMsg.NetSceneTenpayOfflineBase", "Cmd : " + aoD() + ", errType = " + paramInt2 + ", errCode = " + paramInt3 + ", errMsg = " + paramString);
    biw localbiw = (biw)((b)paramq).gtD.gtK;
    int i;
    if ((paramInt2 == 0) && (paramInt3 == 0)) {
      if (localbiw.uwY == 0)
      {
        paramq = n.b(localbiw.uwX);
        try
        {
          JSONObject localJSONObject = new JSONObject(paramq);
          paramInt1 = localJSONObject.getInt("retcode");
          paramArrayOfByte = localbiw.uJe;
          paramq = paramArrayOfByte;
          if (bg.nm(paramArrayOfByte)) {
            paramq = localJSONObject.optString("retmsg");
          }
          i = localbiw.uJd;
          if ((paramInt1 != 0) || (i != 0)) {
            break label313;
          }
          a(paramInt1, paramq, localJSONObject);
          i = paramInt3;
          paramInt1 = paramInt2;
        }
        catch (Exception paramString)
        {
          for (;;)
          {
            w.printErrStackTrace("MicroMsg.NetSceneTenpayOfflineBase", paramString, "", new Object[0]);
            paramInt1 = 1000;
            i = 2;
            paramString = ab.getContext().getString(a.i.tbj);
          }
        }
        if (paramInt1 != 0) {
          w.e("MicroMsg.NetSceneTenpayOfflineBase", "Cmd : " + aoD() + ", errType = " + paramInt1 + ", errCode = " + i + ", errMsg = " + paramString);
        }
        this.fUd.a(paramInt1, i, paramString, this);
        w.d("MicroMsg.NetSceneTenpayOfflineBase", "Cmd : " + aoD() + ", errType = " + paramInt1 + ", errCode = " + i + ", errMsg = " + paramString);
        GMTrace.o(6191463792640L, 46130);
        return;
        label313:
        w.i("MicroMsg.NetSceneTenpayOfflineBase", "ErrCode tenpayErrType : " + i);
        paramInt1 = 1000;
        if (i != 0) {
          break label479;
        }
        i = 64536;
      }
    }
    label479:
    for (;;)
    {
      w.d("MicroMsg.NetSceneTenpayOfflineBase", "ErrCode errMsg : " + paramq);
      paramString = paramq;
      break;
      paramInt1 = 1000;
      i = 2;
      paramString = localbiw.uwZ;
      break;
      paramq = bh.q(paramString, "e");
      paramInt1 = paramInt2;
      i = paramInt3;
      if (paramq == null) {
        break;
      }
      w.d("MicroMsg.NetSceneTenpayOfflineBase", "CDN error!");
      paramString = (String)paramq.get(".e.Content");
      paramInt1 = paramInt2;
      i = paramInt3;
      break;
    }
  }
  
  public abstract void a(int paramInt, String paramString, JSONObject paramJSONObject);
  
  public abstract int aoD();
  
  public final int getType()
  {
    GMTrace.i(6191195357184L, 46128);
    GMTrace.o(6191195357184L, 46128);
    return 385;
  }
  
  public String getUri()
  {
    GMTrace.i(6191598010368L, 46131);
    GMTrace.o(6191598010368L, 46131);
    return "/cgi-bin/micromsg-bin/tenpay";
  }
  
  public final void x(Map<String, String> paramMap)
  {
    int m = 0;
    GMTrace.i(6191061139456L, 46127);
    if (this.fUa == null)
    {
      localObject1 = new b.a();
      ((b.a)localObject1).gtF = new biv();
      ((b.a)localObject1).gtG = new biw();
      localObject2 = getUri();
      i = Bb();
      ((b.a)localObject1).uri = ((String)localObject2);
      ((b.a)localObject1).gtE = i;
      ((b.a)localObject1).gtH = 185;
      ((b.a)localObject1).gtI = 1000000185;
      this.fUa = ((b.a)localObject1).DA();
    }
    Object localObject1 = (biv)this.fUa.gtC.gtK;
    ((biv)localObject1).uwU = aoD();
    ((biv)localObject1).uwV = 1;
    Object localObject2 = paramMap.keySet().toArray();
    Arrays.sort((Object[])localObject2);
    Object localObject3 = new StringBuilder();
    int i = 0;
    String str1;
    int k;
    for (int j = 0; i < localObject2.length; j = k)
    {
      localObject4 = localObject2[i];
      str1 = (String)paramMap.get(localObject4);
      k = j;
      if (!bg.nm(str1))
      {
        if (j != 0) {
          ((StringBuilder)localObject3).append("&");
        }
        ((StringBuilder)localObject3).append(localObject4);
        ((StringBuilder)localObject3).append("=");
        ((StringBuilder)localObject3).append(str1);
        k = 1;
      }
      i += 1;
    }
    localObject3 = TenpayUtil.signWith3Des(((StringBuilder)localObject3).toString());
    Object localObject4 = new StringBuilder();
    i = 0;
    j = m;
    if (j < localObject2.length)
    {
      str1 = localObject2[j];
      String str2 = (String)paramMap.get(str1);
      if (bg.nm(str2)) {
        break label440;
      }
      if (i != 0) {
        ((StringBuilder)localObject4).append("&");
      }
      ((StringBuilder)localObject4).append(str1);
      ((StringBuilder)localObject4).append("=");
      ((StringBuilder)localObject4).append(p.encode(str2));
      i = 1;
    }
    label440:
    for (;;)
    {
      j += 1;
      break;
      if (i != 0) {}
      for (paramMap = "&";; paramMap = "")
      {
        ((StringBuilder)localObject4).append(paramMap);
        ((StringBuilder)localObject4).append("WCPaySign");
        ((StringBuilder)localObject4).append("=");
        ((StringBuilder)localObject4).append((String)localObject3);
        paramMap = ((StringBuilder)localObject4).toString().getBytes();
        ((biv)localObject1).uwW = new azp().be(paramMap);
        GMTrace.o(6191061139456L, 46127);
        return;
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\offline\a\h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */