package com.tencent.mm.plugin.talkroom.b;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.bio;
import com.tencent.mm.protocal.c.bip;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;

public final class e
  extends f
{
  private final b fUa;
  private com.tencent.mm.ad.e fUd;
  private final String mAH;
  private int nvM;
  
  public e(String paramString, int paramInt1, long paramLong, int paramInt2)
  {
    GMTrace.i(5204560838656L, 38777);
    this.nvM = 0;
    this.nvM = paramInt2;
    Object localObject = new b.a();
    ((b.a)localObject).gtF = new bio();
    ((b.a)localObject).gtG = new bip();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/talknoop";
    ((b.a)localObject).gtE = 335;
    ((b.a)localObject).gtH = 149;
    ((b.a)localObject).gtI = 1000000149;
    this.fUa = ((b.a)localObject).DA();
    localObject = (bio)this.fUa.gtC.gtK;
    ((bio)localObject).uhU = paramInt1;
    ((bio)localObject).uhV = paramLong;
    ((bio)localObject).tPN = ((int)bg.Pu());
    this.mAH = paramString;
    ((bio)localObject).tOG = paramInt2;
    GMTrace.o(5204560838656L, 38777);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(5204695056384L, 38778);
    w.d("MicroMsg.NetSceneTalkNoop", "doScene");
    this.fUd = parame1;
    int i = a(parame, this.fUa, this);
    GMTrace.o(5204695056384L, 38778);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(5204963491840L, 38780);
    w.d("MicroMsg.NetSceneTalkNoop", "onGYNetEnd errType:" + paramInt2 + " errCode:" + paramInt3);
    if ((paramInt2 != 0) || (paramInt3 != 0))
    {
      this.fUd.a(paramInt2, paramInt3, paramString, this);
      GMTrace.o(5204963491840L, 38780);
      return;
    }
    this.fUd.a(paramInt2, paramInt3, paramString, this);
    GMTrace.o(5204963491840L, 38780);
  }
  
  public final String bsB()
  {
    GMTrace.i(5205097709568L, 38781);
    String str = this.mAH;
    GMTrace.o(5205097709568L, 38781);
    return str;
  }
  
  public final int bsC()
  {
    GMTrace.i(5205231927296L, 38782);
    int i = this.nvM;
    GMTrace.o(5205231927296L, 38782);
    return i;
  }
  
  public final int getType()
  {
    GMTrace.i(5204829274112L, 38779);
    GMTrace.o(5204829274112L, 38779);
    return 335;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\talkroom\b\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */