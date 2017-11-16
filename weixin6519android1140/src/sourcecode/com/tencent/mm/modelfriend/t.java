package com.tencent.mm.modelfriend;

import android.content.Context;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.l;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.g.a.rs;
import com.tencent.mm.g.a.rt;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.gl;
import com.tencent.mm.protocal.c.gm;
import com.tencent.mm.protocal.d;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.f;
import com.tencent.mm.sdk.platformtools.v;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.y.at;
import com.tencent.mm.y.c;

public final class t
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  private String eKL;
  private String eKN;
  public final b fUa;
  private com.tencent.mm.ad.e fUd;
  
  public t(String paramString1, int paramInt1, String paramString2, int paramInt2, String paramString3)
  {
    GMTrace.i(4429319241728L, 33001);
    this.fUd = null;
    this.eKL = null;
    this.eKN = null;
    Object localObject = new b.a();
    ((b.a)localObject).gtF = new gl();
    ((b.a)localObject).gtG = new gm();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/bindopmobile";
    ((b.a)localObject).gtE = 132;
    ((b.a)localObject).gtH = 45;
    ((b.a)localObject).gtI = 1000000045;
    this.fUa = ((b.a)localObject).DA();
    localObject = (gl)this.fUa.gtC.gtK;
    ((gl)localObject).tSK = paramInt1;
    ((gl)localObject).tUF = paramInt2;
    ((gl)localObject).tUG = paramString3;
    if ((bg.nm(this.eKL)) && (bg.nm(this.eKN)))
    {
      if (f.vhv)
      {
        paramString3 = ab.getContext().getString(R.l.dUl);
        ((gl)localObject).tUI = paramString3;
        ((gl)localObject).tUJ = d.tJA;
      }
    }
    else
    {
      if ((paramString1 == null) || (paramString1.length() <= 0) || ((paramInt1 != 1) && (paramInt1 != 4) && (paramInt1 != 18))) {
        break label308;
      }
      at.AR();
      c.xh().set(4097, paramString1);
    }
    for (;;)
    {
      w.d("MicroMsg.NetSceneBindOpMobile", "Get mobile:" + paramString1 + " opcode:" + paramInt1 + " verifyCode:" + paramString2);
      ((gl)localObject).tUD = paramString1;
      ((gl)localObject).tUE = paramString2;
      ((gl)localObject).kBh = v.bPK();
      GMTrace.o(4429319241728L, 33001);
      return;
      paramString3 = ab.getContext().getString(R.l.dUk);
      break;
      label308:
      if ((paramInt1 == 2) || (paramInt1 == 19))
      {
        at.AR();
        paramString1 = (String)c.xh().get(4097, null);
      }
      else if (paramInt1 == 3)
      {
        at.AR();
        paramString1 = (String)c.xh().get(6, null);
      }
    }
  }
  
  public t(String paramString1, int paramInt, String paramString2, String paramString3, String paramString4, String paramString5)
  {
    this(paramString1, paramInt, paramString2, 0, paramString3);
    GMTrace.i(4429185024000L, 33000);
    this.eKL = paramString4;
    this.eKN = paramString5;
    paramString1 = (gl)this.fUa.gtC.gtK;
    paramString1.tUI = paramString4;
    paramString1.tUJ = paramString5;
    GMTrace.o(4429185024000L, 33000);
  }
  
  public final int CD()
  {
    GMTrace.i(4429453459456L, 33002);
    int i = ((gl)this.fUa.gtC.gtK).tSK;
    GMTrace.o(4429453459456L, 33002);
    return i;
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(4429587677184L, 33003);
    this.fUd = parame1;
    parame1 = (gl)this.fUa.gtC.gtK;
    if ((parame1.tUD == null) || (parame1.tUD.length() <= 0))
    {
      w.e("MicroMsg.NetSceneBindOpMobile", "doScene getMobile Error: " + parame1.tUD);
      GMTrace.o(4429587677184L, 33003);
      return -1;
    }
    if (((parame1.tSK == 2) || (parame1.tSK == 19)) && ((parame1.tUE == null) || (parame1.tUE.length() <= 0)))
    {
      w.e("MicroMsg.NetSceneBindOpMobile", "doScene getVerifyCode Error: " + parame1.tUD);
      GMTrace.o(4429587677184L, 33003);
      return -1;
    }
    int i = a(parame, this.fUa, this);
    GMTrace.o(4429587677184L, 33003);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(4429856112640L, 33005);
    if ((paramInt2 != 0) || (paramInt3 != 0))
    {
      w.e("MicroMsg.NetSceneBindOpMobile", "onGYNetEnd  errType:" + paramInt2 + " errCode:" + paramInt3);
      this.fUd.a(paramInt2, paramInt3, paramString, this);
      GMTrace.o(4429856112640L, 33005);
      return;
    }
    paramq = (gl)this.fUa.gtC.gtK;
    paramArrayOfByte = (gm)this.fUa.gtD.gtK;
    w.d("MicroMsg.NetSceneBindOpMobile", "onGYNetEnd  errType:" + paramInt2 + " errCode:" + paramInt3 + " sms:" + paramArrayOfByte.tUP + "safedevice status = " + paramArrayOfByte.tOy);
    if ((paramq.tSK == 2) || (paramq.tSK == 4) || (paramq.tSK == 11) || (paramq.tSK == 19))
    {
      at.AR();
      c.xh().set(4097, "");
      at.AR();
      c.xh().set(6, paramq.tUD);
      if ((bg.nm(this.eKL)) || (bg.nm(this.eKN))) {
        m.Hl();
      }
      if ((!bg.nm(this.eKL)) && (!bg.nm(this.eKN)))
      {
        rs localrs = new rs();
        localrs.eWy.eWz = paramArrayOfByte;
        a.vgX.m(localrs);
        at.AR();
        c.xh().set(64, Integer.valueOf(paramArrayOfByte.tOy));
        paramArrayOfByte = new rt();
        paramArrayOfByte.eWA.eWB = true;
        paramArrayOfByte.eWA.eWC = true;
        a.vgX.m(paramArrayOfByte);
      }
      if (paramq.tSK == 19)
      {
        at.AR();
        c.xh().set(12322, null);
      }
      w.d("MicroMsg.NetSceneBindOpMobile", "onGYNetEnd  mobile binded");
    }
    for (;;)
    {
      this.fUd.a(paramInt2, paramInt3, paramString, this);
      GMTrace.o(4429856112640L, 33005);
      return;
      if (paramq.tSK == 3)
      {
        at.AR();
        c.xh().set(4097, "");
        at.AR();
        c.xh().set(6, "");
        at.AR();
        c.xh().set(12322, null);
        at.AR();
        c.xh().set(64, Integer.valueOf(paramArrayOfByte.tOy));
        paramq = new rt();
        paramq.eWA.eWB = false;
        paramq.eWA.eWC = true;
        a.vgX.m(paramq);
        m.Hs();
        m.Ht();
        w.d("MicroMsg.NetSceneBindOpMobile", "onGYNetEnd  mobile unbinded");
      }
    }
  }
  
  public final int getType()
  {
    GMTrace.i(4429721894912L, 33004);
    GMTrace.o(4429721894912L, 33004);
    return 132;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\modelfriend\t.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */