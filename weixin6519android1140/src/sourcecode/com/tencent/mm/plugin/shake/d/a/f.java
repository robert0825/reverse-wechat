package com.tencent.mm.plugin.shake.d.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.modelstat.n;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.azh;
import com.tencent.mm.protocal.c.azp;
import com.tencent.mm.protocal.c.bdg;
import com.tencent.mm.protocal.c.bdh;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import com.tencent.mm.storage.w.a;
import com.tencent.mm.y.at;

public final class f
  extends e
{
  private final b fUa;
  private com.tencent.mm.ad.e fUd;
  
  public f(byte[] paramArrayOfByte, int paramInt1, long paramLong, int paramInt2, boolean paramBoolean, int paramInt3)
  {
    super(paramLong);
    GMTrace.i(6592909017088L, 49121);
    Object localObject = new b.a();
    ((b.a)localObject).gtF = new bdg();
    ((b.a)localObject).gtG = new bdh();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/shakemusic";
    ((b.a)localObject).gtE = 367;
    ((b.a)localObject).gtH = 177;
    ((b.a)localObject).gtI = 1000000177;
    this.fUa = ((b.a)localObject).DA();
    localObject = (bdg)this.fUa.gtC.gtK;
    ((bdg)localObject).ues = new azp().be(paramArrayOfByte);
    ((bdg)localObject).uPm = paramInt2;
    if (paramBoolean)
    {
      paramInt2 = 1;
      ((bdg)localObject).tTL = paramInt2;
      ((bdg)localObject).uPn = paramInt1;
      if (!com.tencent.mm.network.ab.bv(com.tencent.mm.sdk.platformtools.ab.getContext())) {
        break label372;
      }
    }
    label372:
    for (paramInt1 = 1;; paramInt1 = 2)
    {
      ((bdg)localObject).udE = paramInt1;
      ((bdg)localObject).tQM = paramInt3;
      float f3 = 0.0F;
      f4 = 0.0F;
      f1 = f4;
      float f2 = f3;
      try
      {
        at.AR();
        f1 = f4;
        f2 = f3;
        f3 = bg.getFloat((String)com.tencent.mm.y.c.xh().get(w.a.vqS, null), 0.0F);
        f1 = f4;
        f2 = f3;
        at.AR();
        f1 = f4;
        f2 = f3;
        f4 = bg.getFloat((String)com.tencent.mm.y.c.xh().get(w.a.vqT, null), 0.0F);
        f1 = f4;
        f2 = f3;
        at.AR();
        f1 = f4;
        f2 = f3;
        paramInt1 = bg.Sy((String)com.tencent.mm.y.c.xh().get(w.a.vti, null));
        f2 = f3;
      }
      catch (Exception paramArrayOfByte)
      {
        for (;;)
        {
          paramInt1 = 0;
          f4 = f1;
          continue;
          paramInt2 = 1;
          continue;
          paramInt2 = 0;
        }
      }
      ((bdg)localObject).tYz = f2;
      ((bdg)localObject).uPo = f4;
      if (!com.tencent.mm.at.c.JZ()) {
        break label387;
      }
      paramInt2 = 0;
      ((bdg)localObject).usS = paramInt2;
      if (!com.tencent.mm.at.c.JY()) {
        break label393;
      }
      paramInt2 = 1;
      ((bdg)localObject).usT = paramInt2;
      n.a(2014, ((bdg)localObject).uPo, ((bdg)localObject).tYz, paramInt1);
      GMTrace.o(6592909017088L, 49121);
      return;
      paramInt2 = 0;
      break;
    }
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(6593043234816L, 49122);
    bdg localbdg = (bdg)this.fUa.gtC.gtK;
    w.d("MicroMsg.NetSceneShakeMusic", "MusicFingerPrintRecorder doscene dataid:%d data:%d endflag:%d voice:%f nettype:%d ver:%d", new Object[] { Integer.valueOf(localbdg.uPm), Integer.valueOf(localbdg.ues.uNN), Integer.valueOf(localbdg.tTL), Float.valueOf(localbdg.uPn), Integer.valueOf(localbdg.udE), Integer.valueOf(localbdg.tQM) });
    this.fUd = parame1;
    int i = a(parame, this.fUa, this);
    GMTrace.o(6593043234816L, 49122);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(6593177452544L, 49123);
    paramq = (bdg)this.fUa.gtC.gtK;
    paramArrayOfByte = (bdh)this.fUa.gtD.gtK;
    w.d("MicroMsg.NetSceneShakeMusic", "MusicFingerPrintRecorder onGYNetEnd [%d,%d] dataid:%d endflag:%d", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), Integer.valueOf(paramq.uPm), Integer.valueOf(paramArrayOfByte.tTL) });
    if ((paramInt2 == 0) && (paramInt3 == 0) && (paramArrayOfByte.tTL == 1)) {
      this.oOn = true;
    }
    this.fUd.a(paramInt2, paramInt3, paramString, this);
    GMTrace.o(6593177452544L, 49123);
  }
  
  public final azh bfM()
  {
    GMTrace.i(6593311670272L, 49124);
    bdh localbdh = (bdh)this.fUa.gtD.gtK;
    GMTrace.o(6593311670272L, 49124);
    return localbdh;
  }
  
  public final int getType()
  {
    GMTrace.i(6593445888000L, 49125);
    GMTrace.o(6593445888000L, 49125);
    return 367;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\shake\d\a\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */