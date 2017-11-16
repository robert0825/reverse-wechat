package com.tencent.mm.plugin.wallet_core.id_verify.model;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.adc;
import com.tencent.mm.protocal.c.add;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import com.tencent.mm.storage.w.a;
import java.util.Iterator;
import java.util.LinkedList;
import org.json.JSONException;
import org.json.JSONObject;

public final class b
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  private com.tencent.mm.ad.b fUa;
  private com.tencent.mm.ad.e fUd;
  private long rdC;
  
  public b()
  {
    GMTrace.i(6844030386176L, 50992);
    this.rdC = 10L;
    w.i("MicroMsg.NetSceneGetRealnameWording", "NetSceneGetRealnameWording call");
    b.a locala = new b.a();
    adc localadc = new adc();
    localadc.tYT = com.tencent.mm.plugin.wallet_core.model.h.byp();
    locala.gtF = localadc;
    locala.gtG = new add();
    locala.uri = "/cgi-bin/mmpay-bin/getrealnamewording";
    locala.gtE = 1666;
    this.fUa = locala.DA();
    this.fUa.gtT = true;
    GMTrace.o(6844030386176L, 50992);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(6844298821632L, 50994);
    this.fUd = parame1;
    int i = a(parame, this.fUa, this);
    GMTrace.o(6844298821632L, 50994);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(6844433039360L, 50995);
    w.i("MicroMsg.NetSceneGetRealnameWording", "onGYNetEnd,errType=" + paramInt2 + "errCode=" + paramInt3);
    Object localObject;
    long l;
    if ((paramInt2 == 0) && (paramInt3 == 0))
    {
      localObject = (add)((com.tencent.mm.ad.b)paramq).gtD.gtK;
      if (((add)localObject).utk <= 0L) {
        l = this.rdC;
      }
    }
    for (;;)
    {
      paramq = new JSONObject();
      try
      {
        paramq.put("bindcardTitle", ((add)localObject).utd);
        paramq.put("bindcardSubTitle", ((add)localObject).ute);
        paramq.put("bindIdTitle", ((add)localObject).utf);
        paramq.put("bindIdSubTitle", ((add)localObject).utg);
        paramq.put("extral_wording", ((add)localObject).uth);
        paramq.put("question_answer_switch", ((add)localObject).uti);
        paramq.put("question_answer_url", ((add)localObject).utj);
        paramq.put("cache_time", l);
        paramq.put("timestamp", Long.valueOf(System.currentTimeMillis() / 1000L));
        paramq.put("isShowBindCard", ((add)localObject).utl);
        paramq.put("isShowBindCardVerify", ((add)localObject).utn);
        paramq.put("isShowBindId", ((add)localObject).utm);
        paramq.put("bindCardVerifyTitle", ((add)localObject).uto);
        paramq.put("bindCardVerifySubtitle", ((add)localObject).utp);
        paramq.put("bindCardVerifyAlertViewRightBtnTxt", ((add)localObject).utq);
        paramq.put("bindCardVerifyAlertViewContent", ((add)localObject).utr);
        paramq.put("isShowBindCardVerifyAlertView", ((add)localObject).uts);
        if ((((add)localObject).utt != null) && (((add)localObject).utt.size() > 0))
        {
          paramArrayOfByte = new StringBuffer();
          paramInt1 = 0;
          localObject = ((add)localObject).utt.iterator();
          for (;;)
          {
            if (((Iterator)localObject).hasNext())
            {
              String str = (String)((Iterator)localObject).next();
              if (paramInt1 != 0) {
                paramArrayOfByte.append("\n");
              }
              paramArrayOfByte.append(str);
              paramInt1 = 1;
              continue;
              l = ((add)localObject).utk;
              break;
            }
          }
          paramq.put("cache_header_titles", paramArrayOfByte.toString());
        }
        com.tencent.mm.kernel.h.xz();
        com.tencent.mm.kernel.h.xy().xh().a(w.a.vue, paramq.toString());
        com.tencent.mm.kernel.h.xz();
        com.tencent.mm.kernel.h.xy().xh().kL(true);
      }
      catch (JSONException paramq)
      {
        for (;;)
        {
          w.printErrStackTrace("MicroMsg.NetSceneGetRealnameWording", paramq, "", new Object[0]);
        }
      }
    }
    this.fUd.a(paramInt2, paramInt3, paramString, this);
    GMTrace.o(6844433039360L, 50995);
  }
  
  public final int getType()
  {
    GMTrace.i(15394639183872L, 114699);
    GMTrace.o(15394639183872L, 114699);
    return 1666;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\wallet_core\id_verify\model\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */