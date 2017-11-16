package com.tencent.mm.modelsimple;

import android.content.Context;
import android.os.Build.VERSION;
import android.provider.Settings.System;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.g.a.rq;
import com.tencent.mm.g.a.rs;
import com.tencent.mm.kernel.h;
import com.tencent.mm.protocal.c.acs;
import com.tencent.mm.protocal.c.act;
import com.tencent.mm.protocal.c.apk;
import com.tencent.mm.protocal.c.azq;
import com.tencent.mm.protocal.c.bmq;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import com.tencent.mm.storage.w.a;
import com.tencent.mm.y.as;

public final class r
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  private b fUa;
  private com.tencent.mm.ad.e fUd;
  private String gUy;
  
  public r(String paramString)
  {
    GMTrace.i(13160450883584L, 98053);
    this.gUy = paramString;
    b.a locala = new b.a();
    locala.gtF = new acs();
    locala.gtG = new act();
    locala.uri = "/cgi-bin/micromsg-bin/getprofile";
    locala.gtE = 302;
    locala.gtH = 0;
    locala.gtI = 0;
    this.fUa = locala.DA();
    ((acs)this.fUa.gtC.gtK).jhi = paramString;
    GMTrace.o(13160450883584L, 98053);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(13160719319040L, 98055);
    if (bg.nm(this.gUy))
    {
      w.e("MicroMsg.NetSceneGetProfile", "null or empty username");
      GMTrace.o(13160719319040L, 98055);
      return -1;
    }
    this.fUd = parame1;
    int i = a(parame, this.fUa, this);
    GMTrace.o(13160719319040L, 98055);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, com.tencent.mm.network.q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(13160853536768L, 98056);
    w.d("MicroMsg.NetSceneGetProfile", "get profile ret: errType=" + paramInt2 + " errCode=" + paramInt3 + " errMsg=" + paramString);
    if ((paramInt2 == 0) && (paramInt3 == 0))
    {
      paramq = (act)this.fUa.gtD.gtK;
      paramArrayOfByte = new rs();
      paramArrayOfByte.eWy.eWz = paramq;
      a.vgX.m(paramArrayOfByte);
      paramArrayOfByte = new rq();
      paramArrayOfByte.eWw.eWx = paramq.usM.uWQ;
      a.vgX.m(paramArrayOfByte);
      if ((com.tencent.mm.y.q.zE().equals(paramq.usL.ufy.toString())) && (!bg.nm(paramq.usM.ubW))) {
        h.xy().xh().a(w.a.vqD, paramq.usM.ubW);
      }
      w.d("MicroMsg.NetSceneGetProfile", "summersafecdn resp.UserInfo.PluginSwitch[%d], GrayscaleFlag[%d]", new Object[] { Integer.valueOf(paramq.usL.uFh), Integer.valueOf(paramq.usM.uWK) });
      h.xy().xh().set(64, Integer.valueOf(paramq.usM.tOy));
      h.xy().xh().set(144385, Integer.valueOf(paramq.usM.uWK));
      h.xy().xh().set(40, Integer.valueOf(paramq.usL.uFh));
      h.xy().xh().set(339975, Integer.valueOf(paramq.usM.uWS));
      w.i("MicroMsg.NetSceneGetProfile", "hy: getprofile pay wallet type: %d", new Object[] { Integer.valueOf(paramq.usM.uWS) });
      h.xy().xh().a(w.a.vut, Integer.valueOf(paramq.usM.unV));
      w.i("MicroMsg.NetSceneGetProfile", "hy: getprofile pay wallet type: %d %d", new Object[] { Integer.valueOf(paramq.usM.uWS), Integer.valueOf(paramq.usM.unV) });
      h.xy().xh().set(208903, paramq.usM.tUq);
      h.xy().xh().set(274433, paramq.usM.uEw);
      h.xy().xh().set(274434, paramq.usM.uEv);
      h.xy().xh().set(274436, paramq.usM.uWL);
      h.xy().xh().a(w.a.vsB, bg.aq(paramq.usM.fjy, ""));
      h.xy().xh().a(w.a.vwp, paramq.usM.uWU);
      w.d("MicroMsg.NetSceneGetProfile", "weidianInfo:%s", new Object[] { paramq.usM.fjy });
      as.gnb.M("last_login_use_voice", paramq.usL.uFh);
      if (Build.VERSION.SDK_INT < 23) {
        Settings.System.putString(ab.getContext().getContentResolver(), "89884a87498ef44f", paramq.usM.uWR);
      }
    }
    this.fUd.a(paramInt2, paramInt3, paramString, this);
    GMTrace.o(13160853536768L, 98056);
  }
  
  public final int getType()
  {
    GMTrace.i(13160585101312L, 98054);
    GMTrace.o(13160585101312L, 98054);
    return 302;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\modelsimple\r.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */