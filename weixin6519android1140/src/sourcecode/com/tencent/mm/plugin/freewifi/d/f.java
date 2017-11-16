package com.tencent.mm.plugin.freewifi.d;

import android.content.Context;
import android.content.res.Resources;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.l;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.plugin.freewifi.g.d;
import com.tencent.mm.plugin.freewifi.model.j;
import com.tencent.mm.protocal.c.bea;
import com.tencent.mm.protocal.c.ck;
import com.tencent.mm.protocal.c.eb;
import com.tencent.mm.protocal.c.wo;
import com.tencent.mm.protocal.c.wp;
import com.tencent.mm.sdk.platformtools.aa;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;

public final class f
  extends c
{
  private static int lqO;
  private String mac;
  private String ssid;
  
  static
  {
    GMTrace.i(7254199762944L, 54048);
    lqO = 7200;
    GMTrace.o(7254199762944L, 54048);
  }
  
  public f(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, String paramString7, String paramString8)
  {
    GMTrace.i(7253797109760L, 54045);
    aBl();
    this.ssid = paramString1;
    this.mac = paramString2;
    ck localck = new ck();
    localck.mac = paramString2;
    localck.ssid = paramString1;
    paramString1 = (wo)this.fUa.gtC.gtK;
    paramString1.appId = paramString3;
    paramString1.lro = paramString4;
    paramString1.lrp = paramString5;
    paramString1.lrq = paramString6;
    paramString1.eDJ = paramString7;
    paramString1.sign = paramString8;
    paramString1.uoJ = localck;
    GMTrace.o(7253797109760L, 54045);
  }
  
  protected final void aBl()
  {
    GMTrace.i(7253528674304L, 54043);
    b.a locala = new b.a();
    locala.gtF = new wo();
    locala.gtG = new wp();
    locala.uri = "/cgi-bin/mmo2o-bin/getbackpagefor33";
    locala.gtE = 1726;
    locala.gtH = 0;
    locala.gtI = 0;
    this.fUa = locala.DA();
    GMTrace.o(7253528674304L, 54043);
  }
  
  public final eb aBs()
  {
    GMTrace.i(7254065545216L, 54047);
    eb localeb = ((wp)this.fUa.gtD.gtK).ltA;
    GMTrace.o(7254065545216L, 54047);
    return localeb;
  }
  
  protected final void b(int paramInt1, int paramInt2, int paramInt3, String paramString)
  {
    GMTrace.i(7253931327488L, 54046);
    paramString = j.aBe().yH(this.ssid);
    if (paramString == null)
    {
      paramString = new com.tencent.mm.plugin.freewifi.g.c();
      paramString.field_ssidmd5 = aa.RP(this.ssid);
    }
    for (paramInt1 = 1;; paramInt1 = 0)
    {
      if ((paramInt2 == 0) && (paramInt3 == 0))
      {
        wp localwp = (wp)this.fUa.gtD.gtK;
        paramString.field_ssid = this.ssid;
        paramString.field_showUrl = localwp.tNg;
        bea localbea = localwp.tNh;
        if (localbea != null)
        {
          w.i("MicroMsg.FreeWifi.NetSceneGetBackPageFor33", "en : %s, cn : %s, tw : %s", new Object[] { localbea.uPR, localbea.uPS, localbea.uPT });
          paramString.field_showWordCn = localbea.uPS;
          paramString.field_showWordEn = localbea.uPR;
          paramString.field_showWordTw = localbea.uPT;
          paramString.field_action = localwp.tNf;
          paramString.field_verifyResult = 1;
          paramString.field_connectState = -1;
          if (localwp.tNp <= 0) {
            localwp.tNp = lqO;
          }
          paramString.field_expiredTime = (bg.Pu() + localwp.tNp);
          paramString.field_mac = this.mac;
          if (paramInt1 == 0) {
            break label331;
          }
          w.i("MicroMsg.FreeWifi.NetSceneGetBackPageFor33", "insert freewifi ret = %b", new Object[] { Boolean.valueOf(j.aBe().b(paramString)) });
        }
        for (;;)
        {
          j.aBe().yI(this.ssid);
          GMTrace.o(7253931327488L, 54046);
          return;
          paramString.field_showWordCn = ab.getContext().getResources().getString(R.l.dyc);
          paramString.field_showWordEn = ab.getContext().getResources().getString(R.l.dyc);
          paramString.field_showWordTw = ab.getContext().getResources().getString(R.l.dyc);
          break;
          label331:
          w.i("MicroMsg.FreeWifi.NetSceneGetBackPageFor33", "insert freewifi ret = %b", new Object[] { Boolean.valueOf(j.aBe().c(paramString, new String[0])) });
        }
      }
      w.e("MicroMsg.FreeWifi.NetSceneGetBackPageFor33", "check this ap failed, ssid is :%s", new Object[] { this.ssid });
      if (paramInt1 == 0)
      {
        boolean bool = j.aBe().a(paramString, new String[0]);
        w.i("MicroMsg.FreeWifi.NetSceneGetBackPageFor33", "freewifi verify failed, delte local db infos : %s, ret = %b", new Object[] { this.ssid, Boolean.valueOf(bool) });
      }
      GMTrace.o(7253931327488L, 54046);
      return;
    }
  }
  
  public final int getType()
  {
    GMTrace.i(7253662892032L, 54044);
    GMTrace.o(7253662892032L, 54044);
    return 1726;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\freewifi\d\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */