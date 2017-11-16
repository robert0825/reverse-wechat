package com.tencent.mm.plugin.wallet_ecard.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.arm;
import com.tencent.mm.protocal.c.arn;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import org.json.JSONException;
import org.json.JSONObject;

public final class d
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  private b fUa;
  private com.tencent.mm.ad.e fUd;
  public int jWs;
  public String jWt;
  public String rrA;
  public String rrB;
  public arn rry;
  public String rrz;
  
  public d(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, int paramInt, boolean paramBoolean)
  {
    this(paramString1, paramString2, paramString3, paramString4, paramString5, paramInt, paramBoolean, false);
    GMTrace.i(19590688014336L, 145962);
    GMTrace.o(19590688014336L, 145962);
  }
  
  public d(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, int paramInt, boolean paramBoolean1, boolean paramBoolean2)
  {
    GMTrace.i(19590822232064L, 145963);
    this.jWs = 0;
    this.jWt = "";
    Object localObject = new b.a();
    ((b.a)localObject).gtF = new arm();
    ((b.a)localObject).gtG = new arn();
    ((b.a)localObject).gtE = 1985;
    ((b.a)localObject).uri = "/cgi-bin/mmpay-bin/openecard";
    ((b.a)localObject).gtH = 0;
    ((b.a)localObject).gtI = 0;
    this.fUa = ((b.a)localObject).DA();
    localObject = (arm)this.fUa.gtC.gtK;
    ((arm)localObject).tUk = paramString1;
    ((arm)localObject).tUl = paramString2;
    this.fUa.gtT = true;
    if (paramBoolean1)
    {
      ((arm)localObject).uHG = paramString3;
      if (!paramBoolean2) {
        break label257;
      }
    }
    label257:
    for (((arm)localObject).uHI = 1;; ((arm)localObject).uHI = 0)
    {
      ((arm)localObject).rcs = paramString4;
      ((arm)localObject).nDt = paramString5;
      ((arm)localObject).ePo = paramInt;
      this.rrz = paramString3;
      this.rrA = paramString4;
      this.rrB = paramString5;
      w.d("MicroMsg.NetSceneOpenECard", "cardNo: %s", new Object[] { paramString3 });
      w.i("MicroMsg.NetSceneOpenECard", "cardType: %s, reqSerial: %s, openScene: %s, mobileNo: %s, bankType: %s", new Object[] { paramString1, paramString2, Integer.valueOf(paramInt), paramString4, paramString5 });
      GMTrace.o(19590822232064L, 145963);
      return;
      ((arm)localObject).uHH = paramString3;
      break;
    }
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(19591224885248L, 145966);
    this.fUd = parame1;
    int i = a(parame, this.fUa, this);
    GMTrace.o(19591224885248L, 145966);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(19590956449792L, 145964);
    w.i("MicroMsg.NetSceneOpenECard", "errType: %s, errCode: %s, errMsg: %s", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    this.rry = ((arn)((b)paramq).gtD.gtK);
    w.i("MicroMsg.NetSceneOpenECard", "ret_code: %d, ret_msg: %s", new Object[] { Integer.valueOf(this.rry.jzH), this.rry.jzI });
    if (!bg.nm(this.rry.uHF)) {
      w.d("MicroMsg.NetSceneOpenECard", "rettext: %s", new Object[] { this.rry.uHF });
    }
    try
    {
      paramq = new JSONObject(this.rry.uHF);
      this.jWs = paramq.optInt("retcode", 0);
      this.jWt = paramq.optString("retmsg", "");
      if (this.fUd != null) {
        this.fUd.a(paramInt2, paramInt3, paramString, this);
      }
      GMTrace.o(19590956449792L, 145964);
      return;
    }
    catch (JSONException paramq)
    {
      for (;;)
      {
        w.printErrStackTrace("MicroMsg.NetSceneOpenECard", paramq, "", new Object[0]);
      }
    }
  }
  
  public final int getType()
  {
    GMTrace.i(19591090667520L, 145965);
    GMTrace.o(19591090667520L, 145965);
    return 1985;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\wallet_ecard\a\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */