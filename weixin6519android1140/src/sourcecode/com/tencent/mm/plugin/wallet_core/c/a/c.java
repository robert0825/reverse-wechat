package com.tencent.mm.plugin.wallet_core.c.a;

import android.content.Context;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.network.q;
import com.tencent.mm.plugin.wallet_core.model.Orders;
import com.tencent.mm.plugin.wallet_core.model.Orders.Commodity;
import com.tencent.mm.plugin.wallet_core.model.Orders.b;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.protocal.c.ask;
import com.tencent.mm.protocal.c.ast;
import com.tencent.mm.protocal.c.asu;
import com.tencent.mm.protocal.c.asv;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.wallet_core.c.l;
import java.util.ArrayList;
import java.util.List;

public final class c
  extends l
{
  private b fUa;
  private com.tencent.mm.ad.e fUd;
  public Orders rcB;
  
  public c(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, String paramString7)
  {
    GMTrace.i(7031129899008L, 52386);
    Object localObject = new b.a();
    ((b.a)localObject).gtF = new ast();
    ((b.a)localObject).gtG = new asu();
    ((b.a)localObject).uri = "/cgi-bin/mmpay-bin/payibgjsgettransaction";
    ((b.a)localObject).gtE = 1565;
    ((b.a)localObject).gtH = 0;
    ((b.a)localObject).gtI = 0;
    this.fUa = ((b.a)localObject).DA();
    localObject = (ast)this.fUa.gtC.gtK;
    ((ast)localObject).lQa = paramString1;
    ((ast)localObject).udg = paramString4;
    ((ast)localObject).udf = paramString2;
    ((ast)localObject).udh = paramString5;
    ((ast)localObject).udi = paramString6;
    ((ast)localObject).tUz = paramString3;
    ((ast)localObject).ucv = paramString7;
    GMTrace.o(7031129899008L, 52386);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(7031532552192L, 52389);
    this.fUd = parame1;
    int i = a(parame, this.fUa, this);
    GMTrace.o(7031532552192L, 52389);
    return i;
  }
  
  public final void e(int paramInt1, int paramInt2, String paramString, q paramq)
  {
    GMTrace.i(7031264116736L, 52387);
    w.i("MicroMsg.NetSceneIbgGetTransaction", "hy: get h5 transaction: errType: %d, errCode: %d, errMsg: %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
    asu localasu = (asu)((b)paramq).gtD.gtK;
    int i = paramInt2;
    paramq = paramString;
    if (paramInt2 == 0)
    {
      i = paramInt2;
      paramq = paramString;
      if (paramInt1 == 0)
      {
        i = localasu.kBk;
        paramq = localasu.kBl;
      }
    }
    this.rcB = new Orders();
    this.rcB.rcw = 1;
    if ((localasu == null) || (localasu.uIE == null))
    {
      w.e("MicroMsg.NetSceneIbgGetTransaction", "hy: info not valid");
      paramString = paramq;
      if (bg.nm(paramq)) {
        paramString = ab.getContext().getString(a.i.tbj);
      }
      this.fUd.a(paramInt1, i, paramString, this);
      GMTrace.o(7031264116736L, 52387);
      return;
    }
    this.rcB.rhd = localasu.uIE.uIJ;
    paramString = new Orders.Commodity();
    paramString.eRP = localasu.uIE.omN;
    paramString.desc = localasu.uIE.gJm;
    paramString.jWS = (localasu.uIE.uIJ / 100.0D);
    paramString.nEk = String.valueOf(localasu.uIE.uIL);
    paramString.nEl = localasu.uIE.uIM;
    paramString.nEp = localasu.uIE.uIH;
    paramString.nEn = localasu.uIE.uIG;
    paramString.nEr = localasu.uIE.nEr;
    paramString.nEg = localasu.uIE.uIK;
    if (localasu.uIF != null)
    {
      paramString.nEs = localasu.uIF.tZF;
      Orders.b localb = new Orders.b();
      localb.name = localasu.uIF.uIr;
      localb.nEs = localasu.uIF.tZF;
      paramString.rhK = localasu.uIF.tZF;
      localb.nIR = localasu.uIF.jxH;
      paramString.rhm = localasu.uIF.uIp;
      if (!bg.nm(localb.name)) {
        paramString.rhR.add(localb);
      }
    }
    for (this.rcB.rhm = localasu.uIF.uIp;; this.rcB.rhm = 0)
    {
      this.rcB.rhv = new ArrayList();
      this.rcB.rhv.add(paramString);
      this.rcB.rho = localasu.uIE.uIM;
      break;
      w.i("MicroMsg.NetSceneIbgGetTransaction", "hy: no biz info");
    }
  }
  
  public final int getType()
  {
    GMTrace.i(7031398334464L, 52388);
    GMTrace.o(7031398334464L, 52388);
    return 1565;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\wallet_core\c\a\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */