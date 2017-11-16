package com.tencent.mm.plugin.emoji.f;

import android.content.ContentValues;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.network.q;
import com.tencent.mm.plugin.emoji.e.j;
import com.tencent.mm.plugin.emoji.model.h;
import com.tencent.mm.protocal.c.aad;
import com.tencent.mm.protocal.c.aae;
import com.tencent.mm.protocal.c.rg;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.emotion.n;
import java.io.IOException;

public final class o
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  public static int klQ;
  public static int klR;
  public static int klS;
  public static int klT;
  public static int klU;
  private final b fUa;
  private com.tencent.mm.ad.e fUd;
  private int klV;
  private String klj;
  
  static
  {
    GMTrace.i(11285697658880L, 84085);
    klQ = 0;
    klR = 1;
    klS = 1;
    klT = 2;
    klU = 256;
    GMTrace.o(11285697658880L, 84085);
  }
  
  public o(String paramString, int paramInt)
  {
    GMTrace.i(11285026570240L, 84080);
    b.a locala = new b.a();
    locala.gtF = new aad();
    locala.gtG = new aae();
    locala.uri = "/cgi-bin/micromsg-bin/mmgetemotionreward";
    locala.gtE = 822;
    locala.gtH = 0;
    locala.gtI = 0;
    this.fUa = locala.DA();
    this.klj = paramString;
    this.klV = paramInt;
    GMTrace.o(11285026570240L, 84080);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(11285429223424L, 84083);
    this.fUd = parame1;
    parame1 = (aad)this.fUa.gtC.gtK;
    parame1.tRS = this.klj;
    parame1.tMX = this.klV;
    int i = a(parame, this.fUa, this);
    GMTrace.o(11285429223424L, 84083);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(11285160787968L, 84081);
    w.i("MicroMsg.emoji.NetSceneGetEmotionReward", "errType:%d, errCode:%d", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    Object localObject;
    if ((paramInt2 == 0) && (paramInt3 == 0)) {
      if (this.klV == klQ)
      {
        paramq = h.arl().kjD;
        paramArrayOfByte = this.klj;
        localObject = arD();
        if ((bg.nm(paramArrayOfByte)) || (localObject == null)) {
          w.w("MicroMsg.emoji.EmotionRewardInfoStorage", "saveEmotionRewardResponseWithPID failed. productId or response is null.");
        }
      }
      else
      {
        if ((arD() == null) || (arD().uqV == null)) {
          break label291;
        }
        h.arl().kjF.cO(this.klj, arD().uqV.tPM);
        h.arm().aP(this.klj, arD().uqV.tPM);
      }
    }
    for (;;)
    {
      this.fUd.a(paramInt2, paramInt3, paramString, this);
      GMTrace.o(11285160787968L, 84081);
      return;
      try
      {
        com.tencent.mm.storage.emotion.k localk = new com.tencent.mm.storage.emotion.k();
        localk.field_productID = paramArrayOfByte;
        localk.field_content = ((aae)localObject).toByteArray();
        localObject = localk.qL();
        if (paramq.fTZ.replace("EmotionRewardInfo", "productID", (ContentValues)localObject) <= 0L) {
          break label272;
        }
        w.i("MicroMsg.emoji.EmotionRewardInfoStorage", "saveEmotionRewardResponseWithPID success. ProductId:%s", new Object[] { paramArrayOfByte });
      }
      catch (IOException paramq)
      {
        w.e("MicroMsg.emoji.EmotionRewardInfoStorage", "saveEmotionRewardResponseWithPID exception:%s", new Object[] { bg.f(paramq) });
      }
      break;
      label272:
      w.i("MicroMsg.emoji.EmotionRewardInfoStorage", "saveEmotionRewardResponseWithPID failed. ProductId:%s", new Object[] { paramArrayOfByte });
      break;
      label291:
      w.i("MicroMsg.emoji.NetSceneGetEmotionReward", "getEmotionRewardRespone is null. so i think no such product reward information");
      h.arl().kjF.cO(this.klj, klU);
      h.arm().aP(this.klj, klU);
      continue;
      if (paramInt3 == 1)
      {
        h.arl().kjF.cO(this.klj, klU);
        h.arm().aP(this.klj, klU);
      }
    }
  }
  
  public final aae arD()
  {
    GMTrace.i(11285563441152L, 84084);
    aae localaae = (aae)this.fUa.gtD.gtK;
    GMTrace.o(11285563441152L, 84084);
    return localaae;
  }
  
  public final int getType()
  {
    GMTrace.i(11285295005696L, 84082);
    GMTrace.o(11285295005696L, 84082);
    return 822;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\emoji\f\o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */