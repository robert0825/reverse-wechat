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
import com.tencent.mm.protocal.c.bdk;
import com.tencent.mm.protocal.c.bdl;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import com.tencent.mm.storage.w.a;
import com.tencent.mm.y.at;
import com.tencent.mm.y.c;

public final class g
  extends e
{
  private final b fUa;
  private com.tencent.mm.ad.e fUd;
  
  public g(byte[] paramArrayOfByte, int paramInt1, long paramLong, int paramInt2, boolean paramBoolean, int paramInt3)
  {
    super(paramLong);
    GMTrace.i(6591432622080L, 49110);
    Object localObject = new b.a();
    ((b.a)localObject).gtF = new bdk();
    ((b.a)localObject).gtG = new bdl();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/shaketv";
    ((b.a)localObject).gtE = 408;
    ((b.a)localObject).gtH = 0;
    ((b.a)localObject).gtI = 0;
    this.fUa = ((b.a)localObject).DA();
    localObject = (bdk)this.fUa.gtC.gtK;
    ((bdk)localObject).ues = new azp().be(paramArrayOfByte);
    ((bdk)localObject).uPm = paramInt2;
    if (paramBoolean)
    {
      paramInt2 = 1;
      ((bdk)localObject).tTL = paramInt2;
      ((bdk)localObject).uPn = paramInt1;
      if (!com.tencent.mm.network.ab.bv(com.tencent.mm.sdk.platformtools.ab.getContext())) {
        break label298;
      }
    }
    label252:
    label298:
    for (paramInt1 = j;; paramInt1 = 2)
    {
      ((bdk)localObject).udE = paramInt1;
      ((bdk)localObject).tQM = paramInt3;
      try
      {
        at.AR();
        f1 = bg.getFloat((String)c.xh().get(w.a.vqS, null), 0.0F);
      }
      catch (Exception paramArrayOfByte)
      {
        for (;;)
        {
          f1 = 0.0F;
          f2 = 0.0F;
          paramInt1 = i;
        }
      }
      try
      {
        at.AR();
        f2 = bg.getFloat((String)c.xh().get(w.a.vqT, null), 0.0F);
      }
      catch (Exception paramArrayOfByte)
      {
        f3 = 0.0F;
        f2 = f1;
        f1 = f3;
        paramInt1 = i;
        break label252;
      }
      try
      {
        at.AR();
        paramInt1 = bg.Sy((String)c.xh().get(w.a.vti, null));
        f3 = f2;
        f2 = f1;
        f1 = f3;
      }
      catch (Exception paramArrayOfByte)
      {
        f3 = f1;
        f1 = f2;
        f2 = f3;
        paramInt1 = i;
        break label252;
      }
      ((bdk)localObject).tYz = f2;
      ((bdk)localObject).uPo = f1;
      n.a(2009, ((bdk)localObject).uPo, ((bdk)localObject).tYz, paramInt1);
      GMTrace.o(6591432622080L, 49110);
      return;
      paramInt2 = 0;
      break;
    }
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(6591566839808L, 49111);
    bdk localbdk = (bdk)this.fUa.gtC.gtK;
    w.d("MicroMsg.NetSceneShakeTV", "MusicFingerPrintRecorder doscene dataid:%d data:%d endflag:%d voice:%f nettype:%d ver:%d", new Object[] { Integer.valueOf(localbdk.uPm), Integer.valueOf(localbdk.ues.uNN), Integer.valueOf(localbdk.tTL), Float.valueOf(localbdk.uPn), Integer.valueOf(localbdk.udE), Integer.valueOf(localbdk.tQM) });
    this.fUd = parame1;
    int i = a(parame, this.fUa, this);
    GMTrace.o(6591566839808L, 49111);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(6591701057536L, 49112);
    paramq = (bdk)this.fUa.gtC.gtK;
    paramArrayOfByte = (bdl)this.fUa.gtD.gtK;
    w.d("MicroMsg.NetSceneShakeTV", "MusicFingerPrintRecorder onGYNetEnd [%d,%d] dataid:%d endflag:%d", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), Integer.valueOf(paramq.uPm), Integer.valueOf(paramArrayOfByte.tTL) });
    if ((paramInt2 == 0) && (paramInt3 == 0) && (paramArrayOfByte.tTL == 1)) {
      this.oOn = true;
    }
    this.fUd.a(paramInt2, paramInt3, paramString, this);
    GMTrace.o(6591701057536L, 49112);
  }
  
  public final azh bfM()
  {
    GMTrace.i(6591835275264L, 49113);
    bdl localbdl = (bdl)this.fUa.gtD.gtK;
    GMTrace.o(6591835275264L, 49113);
    return localbdl;
  }
  
  public final int getType()
  {
    GMTrace.i(6591969492992L, 49114);
    GMTrace.o(6591969492992L, 49114);
    return 408;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\shake\d\a\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */