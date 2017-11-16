package com.tencent.mm.plugin.mall.a;

import android.os.Build;
import android.os.Build.VERSION;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.kernel.h;
import com.tencent.mm.network.q;
import com.tencent.mm.plugin.wallet_core.d.i;
import com.tencent.mm.plugin.wallet_core.model.n;
import com.tencent.mm.protocal.c.asr;
import com.tencent.mm.protocal.c.ass;
import com.tencent.mm.protocal.c.bqr;
import com.tencent.mm.protocal.c.bqu;
import com.tencent.mm.protocal.d;
import com.tencent.mm.sdk.platformtools.f;
import com.tencent.mm.sdk.platformtools.v;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import com.tencent.mm.storage.w.a;
import java.util.LinkedList;

public final class c
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  private b fUa;
  private com.tencent.mm.ad.e fUd;
  
  public c()
  {
    GMTrace.i(7989444476928L, 59526);
    Object localObject1 = new b.a();
    ((b.a)localObject1).gtF = new asr();
    ((b.a)localObject1).gtG = new ass();
    ((b.a)localObject1).uri = "/cgi-bin/mmpay-bin/payibggetoverseawallet";
    ((b.a)localObject1).gtE = 1577;
    this.fUa = ((b.a)localObject1).DA();
    localObject1 = (asr)this.fUa.gtC.gtK;
    h.xz();
    Object localObject2 = h.xy().xh().get(w.a.vtq, Boolean.valueOf(false));
    if (localObject2 != null) {}
    for (boolean bool = ((Boolean)localObject2).booleanValue();; bool = false)
    {
      if (bool) {}
      for (int i = 1;; i = 0)
      {
        ((asr)localObject1).uIt = i;
        ((asr)localObject1).aKB = v.bPK();
        ((asr)localObject1).uIw = Build.VERSION.RELEASE;
        ((asr)localObject1).uIv = f.ab(null, d.tJC);
        ((asr)localObject1).uIx = Build.MANUFACTURER;
        w.i("MicroMsg.NetScenePayIBGGetOverseaWallet", "req IsShowTips %s language %s os_ver %s wxg_ver %s phone_type %s", new Object[] { Integer.valueOf(((asr)localObject1).uIt), ((asr)localObject1).aKB, ((asr)localObject1).uIw, ((asr)localObject1).uIv, ((asr)localObject1).uIx });
        GMTrace.o(7989444476928L, 59526);
        return;
      }
    }
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(7989847130112L, 59529);
    this.fUd = parame1;
    int i = a(parame, this.fUa, this);
    GMTrace.o(7989847130112L, 59529);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(7989578694656L, 59527);
    w.i("MicroMsg.NetScenePayIBGGetOverseaWallet", "errCode " + paramInt3 + ", errMsg " + paramString);
    if ((paramInt2 == 0) && (paramInt3 == 0))
    {
      paramq = (ass)((b)paramq).gtD.gtK;
      if ((paramq.uIA == null) || (paramq.uIB == null)) {
        break label202;
      }
      w.i("MicroMsg.NetScenePayIBGGetOverseaWallet", "onGYNetEnd " + paramq.mRi + " wallet_gray_area: " + paramq.uIA.uoL.size() + " wallet_threepoint_area: " + paramq.uIB.uoL.size());
    }
    for (;;)
    {
      h.xz();
      h.xy().xh().a(w.a.vut, Integer.valueOf(paramq.mRi));
      n.byD().a(paramq.mRi, paramq);
      this.fUd.a(paramInt2, paramInt3, paramString, this);
      GMTrace.o(7989578694656L, 59527);
      return;
      label202:
      w.i("MicroMsg.NetScenePayIBGGetOverseaWallet", "onGYNetEnd other is null " + paramq.mRi);
    }
  }
  
  public final int getType()
  {
    GMTrace.i(7989712912384L, 59528);
    GMTrace.o(7989712912384L, 59528);
    return 1577;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\mall\a\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */