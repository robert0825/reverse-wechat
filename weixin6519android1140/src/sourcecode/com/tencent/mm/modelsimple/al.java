package com.tencent.mm.modelsimple;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.network.q;
import com.tencent.mm.plugin.normsg.a.d;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.protocal.c.bvn;
import com.tencent.mm.protocal.c.bvo;
import com.tencent.mm.sdk.platformtools.MultiProcessSharedPreferences;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.v;
import com.tencent.mm.sdk.platformtools.w;

public final class al
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  private com.tencent.mm.ad.e fUd;
  private final b gTY;
  private int retryCount;
  
  public al(String paramString, int paramInt)
  {
    GMTrace.i(1350096125952L, 10059);
    this.retryCount = 3;
    Object localObject = new b.a();
    ((b.a)localObject).gtF = new bvn();
    ((b.a)localObject).gtG = new bvo();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/yybgetpkgsig";
    ((b.a)localObject).gtE = 729;
    ((b.a)localObject).gtH = 0;
    ((b.a)localObject).gtI = 0;
    this.gTY = ((b.a)localObject).DA();
    localObject = (bvn)this.gTY.gtC.gtK;
    ((bvn)localObject).kBh = v.bPK();
    ((bvn)localObject).tSw = d.nxJ.rR(0);
    ((bvn)localObject).vdM = paramString;
    ((bvn)localObject).lPm = paramInt;
    w.i("MicroMsg.NetSceneYybGetPkgSig", "summertoken YybGetPkgSig Language[%s], PkgName[%s], versionCode[%d], stack[%s]", new Object[] { ((bvn)localObject).kBh, paramString, Integer.valueOf(paramInt), bg.bQW() });
    GMTrace.o(1350096125952L, 10059);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(1350364561408L, 10061);
    this.fUd = parame1;
    int i = a(parame, this.gTY, this);
    GMTrace.o(1350364561408L, 10061);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(1350498779136L, 10062);
    paramq = (bvn)this.gTY.gtC.gtK;
    paramArrayOfByte = (bvo)this.gTY.gtD.gtK;
    w.i("MicroMsg.NetSceneYybGetPkgSig", "summertoken YybGetPkgSig onGYNetEnd netId[%d], errType[%d], errCode[%d], errMsg[%s], ret[%d], sig[%s]", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString, Integer.valueOf(paramArrayOfByte.vdN), paramArrayOfByte.vdO });
    if ((paramInt2 != 0) || (paramInt3 != 0))
    {
      w.w("MicroMsg.NetSceneYybGetPkgSig", "summertoken YybGetPkgSig err and return!");
      g.ork.a(322L, 1L, 1L, false);
      g.ork.i(11098, new Object[] { Integer.valueOf(4001), String.format("%s,%d,%d,%d", new Object[] { paramq.vdM, Integer.valueOf(paramq.lPm), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) }) });
      this.fUd.a(paramInt2, paramInt3, paramString, this);
      GMTrace.o(1350498779136L, 10062);
      return;
    }
    if ((paramArrayOfByte.vdN == 2) || (paramArrayOfByte.vdN == 3))
    {
      this.retryCount -= 1;
      if (this.retryCount <= 0)
      {
        w.w("MicroMsg.NetSceneYybGetPkgSig", "summertoken err and return with no try!");
        g.ork.a(322L, 2L, 1L, false);
        g.ork.i(11098, new Object[] { Integer.valueOf(4002), String.format("%s,%d", new Object[] { paramq.vdM, Integer.valueOf(paramq.lPm) }) });
        this.fUd.a(3, -1, "", this);
        GMTrace.o(1350498779136L, 10062);
        return;
      }
      w.i("MicroMsg.NetSceneYybGetPkgSig", "summertoken do scene again retryCount:%d", new Object[] { Integer.valueOf(this.retryCount) });
      a(this.gtW, this.fUd);
    }
    for (;;)
    {
      this.fUd.a(paramInt2, paramInt3, paramString, this);
      GMTrace.o(1350498779136L, 10062);
      return;
      if (paramArrayOfByte.vdN == 1)
      {
        MultiProcessSharedPreferences.getSharedPreferences(ab.getContext(), "yyb_pkg_sig_prefs", 4).edit().remove(paramq.vdM).commit();
        g.ork.a(322L, 5L, 1L, false);
        g.ork.i(11098, new Object[] { Integer.valueOf(4005), String.format("%s,%d", new Object[] { paramq.vdM, Integer.valueOf(paramq.lPm) }) });
        w.i("MicroMsg.NetSceneYybGetPkgSig", "summertoken ret no sig[%s] and remove", new Object[] { paramArrayOfByte.vdO });
      }
      else if (paramArrayOfByte.vdN == 4)
      {
        w.w("MicroMsg.NetSceneYybGetPkgSig", "summertoken ret no need try and revise");
        g.ork.a(322L, 4L, 1L, false);
        g.ork.i(11098, new Object[] { Integer.valueOf(4004), String.format("%s,%d", new Object[] { paramq.vdM, Integer.valueOf(paramq.lPm) }) });
      }
      else
      {
        w.i("MicroMsg.NetSceneYybGetPkgSig", "summertoken ret sig[%s]", new Object[] { paramArrayOfByte.vdO });
        MultiProcessSharedPreferences.getSharedPreferences(ab.getContext(), "yyb_pkg_sig_prefs", 4).edit().putString(paramq.vdM, paramArrayOfByte.vdO).commit();
        g.ork.a(322L, 3L, 1L, false);
        g.ork.i(11098, new Object[] { Integer.valueOf(4003), String.format("%s,%d,%s", new Object[] { paramq.vdM, Integer.valueOf(paramq.lPm), paramArrayOfByte.vdO }) });
      }
    }
  }
  
  public final int getType()
  {
    GMTrace.i(1350230343680L, 10060);
    GMTrace.o(1350230343680L, 10060);
    return 729;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\modelsimple\al.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */