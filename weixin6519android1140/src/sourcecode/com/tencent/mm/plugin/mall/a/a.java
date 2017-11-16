package com.tencent.mm.plugin.mall.a;

import android.util.SparseArray;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.network.q;
import com.tencent.mm.plugin.wallet_core.model.mall.MallFunction;
import com.tencent.mm.plugin.wallet_core.model.mall.MallNews;
import com.tencent.mm.plugin.wallet_core.model.mall.c;
import com.tencent.mm.plugin.wallet_core.model.n;
import com.tencent.mm.protocal.c.acc;
import com.tencent.mm.protocal.c.acd;
import com.tencent.mm.protocal.c.azq;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class a
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  private com.tencent.mm.ad.b fUa;
  private com.tencent.mm.ad.e fUd;
  private String mRd;
  public ArrayList<MallFunction> mRe;
  public ArrayList<MallNews> mRf;
  public ArrayList<com.tencent.mm.plugin.wallet_core.model.mall.a> mRg;
  public SparseArray<String> mRh;
  public int mRi;
  
  public a(int paramInt, String paramString)
  {
    this(paramInt, paramString, null, null);
    GMTrace.i(7990249783296L, 59532);
    GMTrace.o(7990249783296L, 59532);
  }
  
  private a(int paramInt, String paramString1, String paramString2, String paramString3)
  {
    GMTrace.i(7990518218752L, 59534);
    this.mRe = null;
    this.mRf = null;
    this.mRg = null;
    this.mRh = null;
    this.mRi = 0;
    this.mRi = paramInt;
    Object localObject1 = new b.a();
    ((b.a)localObject1).gtF = new acc();
    ((b.a)localObject1).gtG = new acd();
    ((b.a)localObject1).uri = "/cgi-bin/micromsg-bin/getpayfunctionlist";
    ((b.a)localObject1).gtE = 495;
    ((b.a)localObject1).gtH = 227;
    ((b.a)localObject1).gtI = 1000000227;
    this.fUa = ((b.a)localObject1).DA();
    acc localacc = (acc)this.fUa.gtC.gtK;
    localacc.usy = paramString1;
    LinkedList localLinkedList = new LinkedList();
    Object localObject2;
    if (!bg.nm(paramString2))
    {
      localObject2 = (MallNews)c.bzi().rkd.get(paramString2);
      if ((localObject2 != null) && (!bg.nm(((MallNews)localObject2).eEU)))
      {
        localObject1 = new ArrayList();
        ((List)localObject1).add(((MallNews)localObject2).eEU);
      }
    }
    while ((localObject1 != null) && (((List)localObject1).size() > 0))
    {
      localObject2 = ((List)localObject1).iterator();
      localObject1 = "";
      for (;;)
      {
        if (((Iterator)localObject2).hasNext())
        {
          String str = (String)((Iterator)localObject2).next();
          azq localazq = new azq();
          localazq.Rq(str);
          localLinkedList.add(localazq);
          localObject1 = (String)localObject1 + "; + " + str;
          continue;
          localObject1 = null;
          break;
          localObject1 = c.bzi().bzj();
          break;
        }
      }
      w.d("MicroMsg.NetSceneGetPayFunctionList", "post with list : " + (String)localObject1);
    }
    localacc.usA = localLinkedList;
    localacc.usz = localLinkedList.size();
    if (bg.nm(paramString3)) {}
    for (localacc.lTj = String.format("tpa_country=%s", new Object[] { Integer.valueOf(paramInt) });; localacc.lTj = String.format("%s&tpa_country=%s", new Object[] { paramString3, Integer.valueOf(paramInt) }))
    {
      this.mRd = paramString2;
      w.d("MicroMsg.NetSceneGetPayFunctionList", "telephonyNetIso " + paramString1 + " ExtInfo: " + localacc.lTj);
      GMTrace.o(7990518218752L, 59534);
      return;
    }
  }
  
  public a(int paramInt, String paramString1, String paramString2, String paramString3, String paramString4)
  {
    this(paramInt, paramString1, paramString3, String.format("appid=%s&funcid=%s&url=%s", new Object[] { paramString2, paramString3, URLEncoder.encode(paramString4, "ISO-8859-1").toString() }));
    GMTrace.i(7990384001024L, 59533);
    GMTrace.o(7990384001024L, 59533);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(7990920871936L, 59537);
    this.fUd = parame1;
    int i = a(parame, this.fUa, this);
    GMTrace.o(7990920871936L, 59537);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(7990652436480L, 59535);
    w.i("MicroMsg.NetSceneGetPayFunctionList", "errCode " + paramInt3 + ", errMsg " + paramString);
    if ((paramInt2 == 0) && (paramInt3 == 0))
    {
      paramq = (acd)((com.tencent.mm.ad.b)paramq).gtD.gtK;
      w.i("MicroMsg.NetSceneGetPayFunctionList", "resp.PayFunctionList wallet_regionL " + this.mRi + " " + paramq.usB);
    }
    try
    {
      if (!bg.nm(paramq.usB))
      {
        Object localObject = new JSONObject(paramq.usB);
        paramq = ((JSONObject)localObject).optString("pay_func_list");
        this.mRe = com.tencent.mm.plugin.wallet_core.model.mall.b.w(new JSONArray(paramq));
        paramArrayOfByte = ((JSONObject)localObject).optString("global_activity_list");
        String str = ((JSONObject)localObject).optString("pay_banner_list");
        localObject = ((JSONObject)localObject).optString("type_info_list");
        n.byC().b(this.mRi, paramq, paramArrayOfByte, str, (String)localObject);
        d.aMY().mRl.clear();
      }
      this.fUd.a(paramInt2, paramInt3, paramString, this);
      GMTrace.o(7990652436480L, 59535);
      return;
    }
    catch (JSONException paramq)
    {
      for (;;)
      {
        w.printErrStackTrace("MicroMsg.NetSceneGetPayFunctionList", paramq, "", new Object[0]);
      }
    }
  }
  
  public final int getType()
  {
    GMTrace.i(7990786654208L, 59536);
    GMTrace.o(7990786654208L, 59536);
    return 495;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\mall\a\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */