package com.tencent.mm.plugin.offline.a;

import android.content.Context;
import android.text.TextUtils;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.network.q;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.protocal.c.abt;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.wallet_core.c.l;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class a
  extends l
{
  private final b fUa;
  private com.tencent.mm.ad.e fUd;
  private ArrayList<String> ikk;
  private String nAu;
  private String nAv;
  
  private void F(JSONObject paramJSONObject)
  {
    GMTrace.i(6194550800384L, 46153);
    this.nAu = paramJSONObject.optString("micropay_tips");
    try
    {
      paramJSONObject = paramJSONObject.getJSONArray("head_url_list");
      if (paramJSONObject != null)
      {
        i = paramJSONObject.length();
        if (i != 0) {}
      }
      else
      {
        GMTrace.o(6194550800384L, 46153);
        return;
      }
      int i = 0;
      while (i < paramJSONObject.length())
      {
        String str = (String)paramJSONObject.get(i);
        this.ikk.add(str);
        i += 1;
      }
      GMTrace.o(6194550800384L, 46153);
      return;
    }
    catch (JSONException paramJSONObject)
    {
      w.printErrStackTrace("MicroMsg.NetSceneGetOffLineInfo", paramJSONObject, "", new Object[0]);
      GMTrace.o(6194550800384L, 46153);
    }
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(6194282364928L, 46151);
    this.fUd = parame1;
    int i = a(parame, this.fUa, this);
    GMTrace.o(6194282364928L, 46151);
    return i;
  }
  
  public final void e(int paramInt1, int paramInt2, String paramString, q paramq)
  {
    GMTrace.i(6194416582656L, 46152);
    if (paramInt1 != 0) {
      w.e("MicroMsg.NetSceneGetOffLineInfo", "Cmd : 606" + ", errType = " + paramInt1 + ", errCode = " + paramInt2 + ", errMsg = " + paramString);
    }
    abt localabt = (abt)((b)paramq).gtD.gtK;
    i = paramInt1;
    j = paramInt2;
    paramq = paramString;
    if (paramInt1 == 0)
    {
      i = paramInt1;
      j = paramInt2;
      paramq = paramString;
      if (paramInt2 != 0) {}
    }
    try
    {
      if (!TextUtils.isEmpty(localabt.usm))
      {
        paramq = new JSONObject(localabt.usm);
        i = paramq.optInt("InitValue");
        j = paramq.optInt("FastChangedLimit");
        this.nAv = paramq.optString("guide_tips");
        com.tencent.mm.plugin.offline.c.a.sj(i);
        com.tencent.mm.plugin.offline.c.a.sk(j);
        w.v("MicroMsg.NetSceneGetOffLineInfo", "initValue:" + i + " fastChangeValue:" + j);
      }
      i = paramInt1;
      j = paramInt2;
      paramq = paramString;
      if (!TextUtils.isEmpty(localabt.usn))
      {
        F(new JSONObject(localabt.usn));
        paramq = paramString;
        j = paramInt2;
        i = paramInt1;
      }
    }
    catch (Exception paramString)
    {
      for (;;)
      {
        w.printErrStackTrace("MicroMsg.NetSceneGetOffLineInfo", paramString, "", new Object[0]);
        i = 1000;
        j = 2;
        paramq = ab.getContext().getString(a.i.tbj);
      }
    }
    if (this.fUd != null) {
      this.fUd.a(i, j, paramq, this);
    }
    GMTrace.o(6194416582656L, 46152);
  }
  
  public final int getType()
  {
    GMTrace.i(6194148147200L, 46150);
    GMTrace.o(6194148147200L, 46150);
    return 606;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\offline\a\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */