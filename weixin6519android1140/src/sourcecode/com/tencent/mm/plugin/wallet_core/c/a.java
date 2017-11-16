package com.tencent.mm.plugin.wallet_core.c;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.network.q;
import com.tencent.mm.plugin.wallet_core.model.h;
import com.tencent.mm.protocal.c.mi;
import com.tencent.mm.protocal.c.mj;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.wallet_core.c.l;
import com.tencent.mm.wallet_core.c.o;

public final class a
  extends l
{
  public b fUa;
  private com.tencent.mm.ad.e fUd;
  public int yvp;
  
  public a(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, String paramString7)
  {
    this(paramString1, paramString2, paramString3, paramString4, paramString5, paramString6, paramString7, 1);
    GMTrace.i(7032337858560L, 52395);
    GMTrace.o(7032337858560L, 52395);
  }
  
  public a(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, String paramString7, int paramInt)
  {
    GMTrace.i(7032203640832L, 52394);
    this.yvp = 0;
    this.yvp = paramInt;
    Object localObject = new b.a();
    ((b.a)localObject).gtF = new mi();
    ((b.a)localObject).gtG = new mj();
    ((b.a)localObject).uri = "/cgi-bin/mmpay-bin/checkpayjsapi";
    ((b.a)localObject).gtE = 580;
    ((b.a)localObject).gtH = 0;
    ((b.a)localObject).gtI = 0;
    this.fUa = ((b.a)localObject).DA();
    localObject = (mi)this.fUa.gtC.gtK;
    ((mi)localObject).lQa = paramString1;
    ((mi)localObject).tUz = paramString2;
    ((mi)localObject).udf = paramString3;
    ((mi)localObject).udg = paramString4;
    ((mi)localObject).udi = paramString5;
    ((mi)localObject).udh = paramString6;
    ((mi)localObject).ucv = paramString7;
    ((mi)localObject).udj = paramInt;
    ((mi)localObject).tYT = h.byp();
    if (o.clM()) {
      ((mi)localObject).udk = o.clO();
    }
    GMTrace.o(7032203640832L, 52394);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(7032606294016L, 52397);
    this.fUd = parame1;
    int i = a(parame, this.fUa, this);
    GMTrace.o(7032606294016L, 52397);
    return i;
  }
  
  public final String aWg()
  {
    GMTrace.i(7032874729472L, 52399);
    String str = ((mj)this.fUa.gtD.gtK).token;
    GMTrace.o(7032874729472L, 52399);
    return str;
  }
  
  public final void e(int paramInt1, int paramInt2, String paramString, q paramq)
  {
    GMTrace.i(7032740511744L, 52398);
    w.d("MicroMsg.NetSceneCheckPayJsapi", "errType:" + paramInt1 + ",errCode:" + paramInt2 + ",errMsg" + paramString);
    String str = paramString;
    if (paramInt1 == 0)
    {
      str = paramString;
      if (paramInt2 == 0)
      {
        paramString = (mj)((b)paramq).gtD.gtK;
        w.i("MicroMsg.NetSceneCheckPayJsapi", "NetSceneCheckPayJsapi resp.ErrCode is " + paramString.kBk + " resp.ErrMsg is " + paramString.kBl);
        str = paramString.kBl;
      }
    }
    this.fUd.a(paramInt1, paramInt2, str, this);
    GMTrace.o(7032740511744L, 52398);
  }
  
  public final int getType()
  {
    GMTrace.i(7032472076288L, 52396);
    GMTrace.o(7032472076288L, 52396);
    return 580;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\wallet_core\c\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */