package com.tencent.mm.plugin.voip.model.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.k;
import com.tencent.mm.plugin.voip.b.a;
import com.tencent.mm.protocal.c.azq;
import com.tencent.mm.protocal.c.bgx;
import com.tencent.mm.protocal.c.boe;
import com.tencent.mm.protocal.c.bpv;
import com.tencent.mm.protocal.c.bpw;
import java.util.LinkedList;

public final class j
  extends n<bpv, bpw>
{
  public j(long paramLong1, long paramLong2, int paramInt1, String paramString1, String paramString2, int paramInt2, int paramInt3, int[] paramArrayOfInt)
  {
    GMTrace.i(5291802361856L, 39427);
    Object localObject = new b.a();
    ((b.a)localObject).gtF = new bpv();
    ((b.a)localObject).gtG = new bpw();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/voipspeedresult";
    ((b.a)localObject).gtE = 901;
    ((b.a)localObject).gtH = 901;
    ((b.a)localObject).gtI = 1000000901;
    this.fUa = ((b.a)localObject).DA();
    localObject = (bpv)this.fUa.gtC.gtK;
    ((bpv)localObject).vab = paramLong1;
    ((bpv)localObject).uhV = paramLong2;
    ((bpv)localObject).udE = paramInt1;
    ((bpv)localObject).vac = new azq().Rq(paramString1);
    ((bpv)localObject).vad = new azq().Rq(paramString2);
    ((bpv)localObject).tWm = 0.0D;
    ((bpv)localObject).tWn = 0.0D;
    ((bpv)localObject).uhU = paramInt2;
    ((bpv)localObject).vae = paramInt3;
    paramInt1 = 0;
    int i = 0;
    while (i < paramInt3)
    {
      paramString1 = new bgx();
      paramInt2 = paramInt1 + 1;
      paramString1.uSr = paramArrayOfInt[paramInt1];
      paramInt1 = paramInt2 + 1;
      paramString1.uSs = paramArrayOfInt[paramInt2];
      paramInt2 = paramInt1 + 1;
      paramString1.uSt = paramArrayOfInt[paramInt1];
      paramString1.uSu = new boe();
      paramString2 = paramString1.uSu;
      paramInt1 = paramInt2 + 1;
      paramString2.uTR = paramArrayOfInt[paramInt2];
      paramString2 = paramString1.uSu;
      paramInt2 = paramInt1 + 1;
      paramString2.uKd = paramArrayOfInt[paramInt1];
      paramInt1 = paramInt2 + 1;
      paramString1.uSv = paramArrayOfInt[paramInt2];
      paramInt2 = paramInt1 + 1;
      paramString1.uSw = paramArrayOfInt[paramInt1];
      int j = paramInt2 + 1;
      paramString1.uSx = paramArrayOfInt[paramInt2];
      paramInt1 = j + 1;
      paramString1.uSy = paramArrayOfInt[j];
      paramInt2 = 0;
      while (paramInt2 < paramString1.uSy)
      {
        j = paramInt1;
        if (paramInt1 < paramArrayOfInt.length)
        {
          paramString1.uSz.add(Integer.valueOf(paramArrayOfInt[paramInt1]));
          j = paramInt1 + 1;
        }
        paramInt2 += 1;
        paramInt1 = j;
      }
      paramInt2 = paramInt1;
      if (paramInt1 < paramArrayOfInt.length)
      {
        paramString1.uSA = paramArrayOfInt[paramInt1];
        paramInt2 = paramInt1 + 1;
      }
      j = 0;
      paramInt1 = paramInt2;
      paramInt2 = j;
      while (paramInt2 < paramString1.uSA)
      {
        j = paramInt1;
        if (paramInt1 < paramArrayOfInt.length)
        {
          paramString1.uSB.add(Integer.valueOf(paramArrayOfInt[paramInt1]));
          j = paramInt1 + 1;
        }
        paramInt2 += 1;
        paramInt1 = j;
      }
      paramInt2 = paramInt1;
      if (paramInt1 < paramArrayOfInt.length)
      {
        paramString1.uSC = paramArrayOfInt[paramInt1];
        paramInt2 = paramInt1 + 1;
      }
      j = 0;
      paramInt1 = paramInt2;
      paramInt2 = j;
      while (paramInt2 < paramString1.uSC)
      {
        j = paramInt1;
        if (paramInt1 < paramArrayOfInt.length)
        {
          paramString1.uSD.add(Integer.valueOf(paramArrayOfInt[paramInt1]));
          j = paramInt1 + 1;
        }
        paramInt2 += 1;
        paramInt1 = j;
      }
      ((bpv)localObject).uru.add(paramString1);
      i += 1;
    }
    GMTrace.o(5291802361856L, 39427);
  }
  
  public final com.tencent.mm.ad.e bvd()
  {
    GMTrace.i(5292070797312L, 39429);
    com.tencent.mm.ad.e local1 = new com.tencent.mm.ad.e()
    {
      public final void a(int paramAnonymousInt1, int paramAnonymousInt2, String paramAnonymousString, k paramAnonymousk)
      {
        GMTrace.i(5289923313664L, 39413);
        a.dV("MicroMsg.NetSceneVoipSpeedResult", "VoipContext onVoipSpeedResultResp errType=" + paramAnonymousInt1 + " errCode=" + paramAnonymousInt2 + " errMsg=" + paramAnonymousString);
        j.this.qFK.btJ();
        GMTrace.o(5289923313664L, 39413);
      }
    };
    GMTrace.o(5292070797312L, 39429);
    return local1;
  }
  
  public final int getType()
  {
    GMTrace.i(5291936579584L, 39428);
    GMTrace.o(5291936579584L, 39428);
    return 901;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\voip\model\a\j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */