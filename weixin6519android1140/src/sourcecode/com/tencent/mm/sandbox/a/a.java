package com.tencent.mm.sandbox.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.ad.n;
import com.tencent.mm.c.i;
import com.tencent.mm.modelsimple.al;
import com.tencent.mm.network.q;
import com.tencent.mm.platformtools.r;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.plugin.sandbox.SubCoreSandBox;
import com.tencent.mm.pluginsdk.p.t;
import com.tencent.mm.protocal.c.aeh;
import com.tencent.mm.protocal.c.aei;
import com.tencent.mm.protocal.c.azq;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.f;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.y.at;
import java.util.LinkedList;

public final class a
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k, p.t
{
  public final b fUa;
  private com.tencent.mm.ad.e fUd;
  
  public a(int paramInt)
  {
    GMTrace.i(3557172445184L, 26503);
    Object localObject = new b.a();
    ((b.a)localObject).gtF = new aeh();
    ((b.a)localObject).gtG = new aei();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/getupdateinfo";
    ((b.a)localObject).gtE = 113;
    ((b.a)localObject).gtH = 35;
    ((b.a)localObject).gtI = 1000000035;
    this.fUa = ((b.a)localObject).DA();
    localObject = (aeh)this.fUa.gtC.gtK;
    ((aeh)localObject).utV = paramInt;
    ((aeh)localObject).tMZ = f.eqV;
    if ((10012 == r.hkj) && (r.hkk > 0)) {
      ((aeh)localObject).tMZ = r.hkk;
    }
    switch (paramInt)
    {
    }
    for (;;)
    {
      w.i("MicroMsg.NetSceneGetUpdateInfo", "summerupdate dkchan NetSceneGetUpdateInfo updateType:%d channel:%d release:%d, stack[%s]", new Object[] { Integer.valueOf(((aeh)localObject).utV), Integer.valueOf(((aeh)localObject).tMZ), Integer.valueOf(f.eqV), bg.bQW() });
      GMTrace.o(3557172445184L, 26503);
      return;
      g.ork.a(405L, 3L, 1L, true);
      continue;
      g.ork.a(405L, 4L, 1L, true);
      continue;
      g.ork.a(405L, 5L, 1L, true);
      continue;
      g.ork.a(405L, 6L, 1L, true);
    }
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(3557306662912L, 26504);
    this.fUd = parame1;
    int i = a(parame, this.fUa, this);
    GMTrace.o(3557306662912L, 26504);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(3557575098368L, 26506);
    w.i("MicroMsg.NetSceneGetUpdateInfo", "summertoken GetUpdateInfo onGYNetEnd errType[%d], errCode[%d], errMsg[%s]", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    if ((paramInt2 == 0) && (paramInt3 == 0)) {
      g.ork.a(405L, 7L, 1L, true);
    }
    for (;;)
    {
      this.fUd.a(paramInt2, paramInt3, paramString, this);
      paramString = bOH();
      if (paramString == null) {
        break label293;
      }
      paramq = i.bt(paramString);
      if (paramq == null) {
        break;
      }
      paramInt1 = paramq.versionCode;
      w.i("MicroMsg.NetSceneGetUpdateInfo", "summertoken patchVersionCode[%d]", new Object[] { Integer.valueOf(paramInt1) });
      at.wS().a(new al(ab.getPackageName(), paramInt1), 0);
      g.ork.a(405L, 13L, 1L, true);
      GMTrace.o(3557575098368L, 26506);
      return;
      g.ork.a(405L, 8L, 1L, true);
      if (paramInt2 == 4)
      {
        g.ork.a(405L, 9L, 1L, true);
        if (paramInt3 == -16) {
          g.ork.a(405L, 10L, 1L, true);
        } else if (paramInt3 == -17) {
          g.ork.a(405L, 11L, 1L, true);
        } else if (paramInt3 == -18) {
          g.ork.a(405L, 12L, 1L, true);
        }
      }
    }
    w.i("MicroMsg.NetSceneGetUpdateInfo", "summertoken patchInfo is null patchXml[%s]", new Object[] { paramString });
    GMTrace.o(3557575098368L, 26506);
    return;
    label293:
    w.w("MicroMsg.NetSceneGetUpdateInfo", "summertoken patchXml is null!");
    g.ork.a(405L, 14L, 1L, true);
    GMTrace.o(3557575098368L, 26506);
  }
  
  public final int bIS()
  {
    GMTrace.i(3557977751552L, 26509);
    int i = ((aei)this.fUa.gtD.gtK).utW;
    GMTrace.o(3557977751552L, 26509);
    return i;
  }
  
  public final String[] bIT()
  {
    GMTrace.i(3558111969280L, 26510);
    aei localaei = (aei)this.fUa.gtD.gtK;
    String[] arrayOfString = new String[localaei.uub.size()];
    int j = arrayOfString.length;
    int i = 0;
    while (i < j)
    {
      arrayOfString[i] = ((azq)localaei.uub.get(i)).uNR;
      i += 1;
    }
    GMTrace.o(3558111969280L, 26510);
    return arrayOfString;
  }
  
  public final aei bIU()
  {
    int i = 1;
    GMTrace.i(3558380404736L, 26512);
    aei localaei;
    if (SubCoreSandBox.osy)
    {
      localaei = (aei)this.fUa.gtD.gtK;
      localaei.uud = 1;
      localaei.uue = "http://support.weixin.qq.com/cgi-bin/mmsupport-bin/readtemplate?t=page/android_exp__index";
      if (!SubCoreSandBox.osz) {
        break label79;
      }
    }
    for (;;)
    {
      localaei.uuf = i;
      localaei = (aei)this.fUa.gtD.gtK;
      GMTrace.o(3558380404736L, 26512);
      return localaei;
      label79:
      i = 0;
    }
  }
  
  public final int bOF()
  {
    GMTrace.i(3557709316096L, 26507);
    int i = ((aei)this.fUa.gtD.gtK).utY;
    GMTrace.o(3557709316096L, 26507);
    return i;
  }
  
  public final String bOG()
  {
    GMTrace.i(3557843533824L, 26508);
    String str = ((aei)this.fUa.gtD.gtK).utX;
    GMTrace.o(3557843533824L, 26508);
    return str;
  }
  
  public final String bOH()
  {
    GMTrace.i(3558246187008L, 26511);
    Object localObject = (aei)this.fUa.gtD.gtK;
    w.d("MicroMsg.NetSceneGetUpdateInfo", "summertoken getPatchInfo[%s], stack[%s]", new Object[] { ((aei)localObject).uuc, bg.bQW() });
    localObject = ((aei)localObject).uuc;
    GMTrace.o(3558246187008L, 26511);
    return (String)localObject;
  }
  
  public final int getType()
  {
    GMTrace.i(3557440880640L, 26505);
    GMTrace.o(3557440880640L, 26505);
    return 11;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\sandbox\a\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */