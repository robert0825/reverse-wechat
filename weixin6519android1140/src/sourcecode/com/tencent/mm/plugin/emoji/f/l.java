package com.tencent.mm.plugin.emoji.f;

import android.content.ContentValues;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.network.q;
import com.tencent.mm.plugin.emoji.model.h;
import com.tencent.mm.protocal.c.rd;
import com.tencent.mm.protocal.c.zx;
import com.tencent.mm.protocal.c.zy;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.v;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.emotion.i;
import com.tencent.mm.storage.emotion.j;

public final class l
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  private int afp;
  private final b fUa;
  private com.tencent.mm.ad.e fUd;
  private int gRb;
  public String klt;
  
  public l(String paramString, int paramInt)
  {
    this(paramString, paramInt, -1);
    GMTrace.i(11301401133056L, 84202);
    GMTrace.o(11301401133056L, 84202);
  }
  
  public l(String paramString, int paramInt1, int paramInt2)
  {
    GMTrace.i(11301266915328L, 84201);
    this.klt = paramString;
    this.gRb = paramInt1;
    this.afp = paramInt2;
    paramString = new b.a();
    paramString.gtF = new zx();
    paramString.gtG = new zy();
    paramString.uri = "/cgi-bin/micromsg-bin/getemotiondetail";
    paramString.gtE = 412;
    paramString.gtH = 211;
    paramString.gtI = 1000000211;
    this.fUa = paramString.DA();
    GMTrace.o(11301266915328L, 84201);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(11301669568512L, 84204);
    w.i("MicroMsg.emoji.NetSceneGetEmotionDetail", "ProductID:%s, Scene:%d, Version:%d", new Object[] { this.klt, Integer.valueOf(this.gRb), Integer.valueOf(this.afp) });
    this.fUd = parame1;
    parame1 = (zx)this.fUa.gtC.gtK;
    parame1.tRS = this.klt;
    parame1.tOG = this.gRb;
    parame1.jia = this.afp;
    int i = a(parame, this.fUa, this);
    GMTrace.o(11301669568512L, 84204);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(11301803786240L, 84205);
    w.i("MicroMsg.emoji.NetSceneGetEmotionDetail", "ErrType:" + paramInt2 + "   errCode:" + paramInt3);
    if ((paramInt2 != 0) && (paramInt3 != 0) && (paramInt3 != 5))
    {
      this.fUd.a(paramInt2, paramInt3, paramString, this);
      GMTrace.o(11301803786240L, 84205);
      return;
    }
    Object localObject;
    String str;
    if ((paramInt2 == 0) && (paramInt3 == 0))
    {
      paramq = h.arl().kjC;
      paramArrayOfByte = this.klt;
      localObject = (zy)this.fUa.gtD.gtK;
      str = v.eq(ab.getContext());
      if ((bg.nm(paramArrayOfByte)) || (localObject == null)) {
        w.w("MicroMsg.emoji.EmotionDetailInfoStorage", "saveEmotionRewardResponseWithPID failed. productId or response is null.");
      }
    }
    try
    {
      i locali = new i();
      locali.field_productID = paramArrayOfByte;
      locali.field_content = ((zy)localObject).toByteArray();
      locali.field_lan = str;
      localObject = locali.qL();
      if (paramq.fTZ.replace("EmotionDetailInfo", "productID", (ContentValues)localObject) > 0L) {
        w.i("MicroMsg.emoji.EmotionDetailInfoStorage", "saveEmotionDetailResponseWithPID success. ProductId:%s", new Object[] { paramArrayOfByte });
      }
      for (;;)
      {
        this.fUd.a(paramInt2, paramInt3, paramString, this);
        GMTrace.o(11301803786240L, 84205);
        return;
        w.i("MicroMsg.emoji.EmotionDetailInfoStorage", "saveEmotionDetailResponseWithPID failed. ProductId:%s", new Object[] { paramArrayOfByte });
      }
    }
    catch (Exception paramq)
    {
      for (;;)
      {
        w.e("MicroMsg.emoji.EmotionDetailInfoStorage", "saveEmotionRewardResponseWithPID exception:%s", new Object[] { bg.f(paramq) });
      }
    }
  }
  
  public final rd arz()
  {
    GMTrace.i(11301938003968L, 84206);
    new rd();
    rd localrd = ((zy)this.fUa.gtD.gtK).uqD;
    GMTrace.o(11301938003968L, 84206);
    return localrd;
  }
  
  public final int getType()
  {
    GMTrace.i(11301535350784L, 84203);
    GMTrace.o(11301535350784L, 84203);
    return 412;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\emoji\f\l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */