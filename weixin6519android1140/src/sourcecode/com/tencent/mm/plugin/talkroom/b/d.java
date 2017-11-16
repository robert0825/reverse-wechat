package com.tencent.mm.plugin.talkroom.b;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.bim;
import com.tencent.mm.protocal.c.bin;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;

public final class d
  extends f
{
  public int actionType;
  private final b fUa;
  private com.tencent.mm.ad.e fUd;
  private final String mAH;
  private int nvM;
  public int qxP;
  
  public d(int paramInt1, long paramLong, int paramInt2, String paramString, int paramInt3)
  {
    GMTrace.i(5205903015936L, 38787);
    this.nvM = 0;
    this.nvM = paramInt3;
    Object localObject = new b.a();
    ((b.a)localObject).gtF = new bim();
    ((b.a)localObject).gtG = new bin();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/talkmicaction";
    ((b.a)localObject).gtE = 334;
    ((b.a)localObject).gtH = 146;
    ((b.a)localObject).gtI = 1000000146;
    this.fUa = ((b.a)localObject).DA();
    localObject = (bim)this.fUa.gtC.gtK;
    ((bim)localObject).uhU = paramInt1;
    ((bim)localObject).uhV = paramLong;
    ((bim)localObject).und = paramInt2;
    ((bim)localObject).tPN = ((int)bg.Pu());
    this.actionType = paramInt2;
    this.mAH = paramString;
    ((bim)localObject).tOG = paramInt3;
    GMTrace.o(5205903015936L, 38787);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(5206037233664L, 38788);
    w.d("MicroMsg.NetSceneTalkMicAction", "doScene");
    this.fUd = parame1;
    int i = a(parame, this.fUa, this);
    GMTrace.o(5206037233664L, 38788);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(5206439886848L, 38791);
    w.d("MicroMsg.NetSceneTalkMicAction", "onGYNetEnd errType:" + paramInt2 + " errCode:" + paramInt3);
    if ((paramInt2 != 0) || (paramInt3 != 0))
    {
      this.fUd.a(paramInt2, paramInt3, paramString, this);
      GMTrace.o(5206439886848L, 38791);
      return;
    }
    this.qxP = ((bin)this.fUa.gtD.gtK).uhW;
    this.fUd.a(paramInt2, paramInt3, paramString, this);
    GMTrace.o(5206439886848L, 38791);
  }
  
  public final String bsB()
  {
    GMTrace.i(5206305669120L, 38790);
    String str = this.mAH;
    GMTrace.o(5206305669120L, 38790);
    return str;
  }
  
  public final int bsC()
  {
    GMTrace.i(5206574104576L, 38792);
    int i = this.nvM;
    GMTrace.o(5206574104576L, 38792);
    return i;
  }
  
  public final int getType()
  {
    GMTrace.i(5206171451392L, 38789);
    GMTrace.o(5206171451392L, 38789);
    return 334;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\talkroom\b\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */