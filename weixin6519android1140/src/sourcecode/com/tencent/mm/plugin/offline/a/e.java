package com.tencent.mm.plugin.offline.a;

import android.content.Context;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.network.q;
import com.tencent.mm.plugin.wallet_core.id_verify.util.RealnameGuideHelper;
import com.tencent.mm.plugin.wallet_core.model.h;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.protocal.c.aqu;
import com.tencent.mm.protocal.c.aqv;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.wallet_core.c.l;
import org.json.JSONObject;

public final class e
  extends l
{
  private final b fUa;
  private com.tencent.mm.ad.e fUd;
  public int jWs;
  private String jWt;
  public int nAA;
  public String nAB;
  public int nAC;
  public RealnameGuideHelper nAD;
  private String nAE;
  private String nAF;
  private String nAG;
  private String nAH;
  private String nAI;
  public String nAz;
  
  public e(int paramInt, String paramString1, String paramString2)
  {
    GMTrace.i(6193611276288L, 46146);
    this.nAz = "";
    this.jWs = -1;
    this.jWt = "";
    this.nAA = -1;
    this.nAB = "";
    this.nAC = 1;
    Object localObject = new b.a();
    ((b.a)localObject).gtF = new aqu();
    ((b.a)localObject).gtG = new aqv();
    ((b.a)localObject).uri = "/cgi-bin/mmpay-bin/offlinepayconfirm";
    ((b.a)localObject).gtE = 609;
    ((b.a)localObject).gtH = 0;
    ((b.a)localObject).gtI = 0;
    this.fUa = ((b.a)localObject).DA();
    localObject = (aqu)this.fUa.gtC.gtK;
    ((aqu)localObject).uGZ = paramInt;
    ((aqu)localObject).mmR = paramString1;
    ((aqu)localObject).riF = paramString2;
    ((aqu)localObject).tYT = h.byp();
    this.nAC = paramInt;
    GMTrace.o(6193611276288L, 46146);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(6193879711744L, 46148);
    this.fUd = parame1;
    int i = a(parame, this.fUa, this);
    GMTrace.o(6193879711744L, 46148);
    return i;
  }
  
  public final void e(int paramInt1, int paramInt2, String paramString, q paramq)
  {
    GMTrace.i(6194013929472L, 46149);
    if (paramInt1 != 0) {
      w.e("MicroMsg.NetSceneOfflinePayConfirm", "Cmd : 609" + ", errType = " + paramInt1 + ", errCode = " + paramInt2 + ", errMsg = " + paramString);
    }
    Object localObject = (aqv)((b)paramq).gtD.gtK;
    i = paramInt1;
    j = paramInt2;
    paramq = paramString;
    if (paramInt1 == 0)
    {
      i = paramInt1;
      j = paramInt2;
      paramq = paramString;
      if (paramInt2 == 0)
      {
        i = paramInt1;
        j = paramInt2;
        paramq = paramString;
      }
    }
    try
    {
      if (((aqv)localObject).usm != null)
      {
        localObject = new JSONObject(((aqv)localObject).usm);
        this.nAz = ((JSONObject)localObject).optString("transaction_id");
        this.jWs = ((JSONObject)localObject).optInt("retcode");
        this.jWt = ((JSONObject)localObject).optString("retmsg");
        this.nAA = ((JSONObject)localObject).optInt("wx_error_type");
        this.nAB = ((JSONObject)localObject).optString("wx_error_msg");
        w.d("MicroMsg.NetSceneOfflinePayConfirm", "onGYNetEnd %s", new Object[] { ((JSONObject)localObject).toString() });
        i = paramInt1;
        j = paramInt2;
        paramq = paramString;
        if (((JSONObject)localObject).has("real_name_info"))
        {
          paramq = ((JSONObject)localObject).optJSONObject("real_name_info");
          this.nAE = paramq.optString("guide_flag");
          this.nAF = paramq.optString("guide_wording");
          this.nAG = paramq.optString("left_button_wording");
          this.nAH = paramq.optString("right_button_wording");
          this.nAI = paramq.optString("upload_credit_url");
          if (!"1".equals(this.nAE))
          {
            i = paramInt1;
            j = paramInt2;
            paramq = paramString;
            if (!"2".equals(this.nAE)) {}
          }
          else
          {
            this.nAD = new RealnameGuideHelper();
            this.nAD.a(this.nAE, this.nAF, this.nAG, this.nAH, this.nAI, 0);
            paramq = paramString;
            j = paramInt2;
            i = paramInt1;
          }
        }
      }
    }
    catch (Exception paramString)
    {
      for (;;)
      {
        w.printErrStackTrace("MicroMsg.NetSceneOfflinePayConfirm", paramString, "", new Object[0]);
        i = 1000;
        j = 2;
        paramq = ab.getContext().getString(a.i.tbj);
      }
    }
    if (this.fUd != null) {
      this.fUd.a(i, j, paramq, this);
    }
    GMTrace.o(6194013929472L, 46149);
  }
  
  public final int getType()
  {
    GMTrace.i(6193745494016L, 46147);
    GMTrace.o(6193745494016L, 46147);
    return 609;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\offline\a\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */