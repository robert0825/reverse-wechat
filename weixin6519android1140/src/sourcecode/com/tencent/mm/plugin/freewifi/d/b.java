package com.tencent.mm.plugin.freewifi.d;

import android.content.Context;
import android.content.res.Resources;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.l;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.plugin.freewifi.g.d;
import com.tencent.mm.plugin.freewifi.h;
import com.tencent.mm.plugin.freewifi.h.b;
import com.tencent.mm.plugin.freewifi.i;
import com.tencent.mm.plugin.freewifi.i.a;
import com.tencent.mm.plugin.freewifi.m;
import com.tencent.mm.plugin.freewifi.model.j;
import com.tencent.mm.protocal.c.ac;
import com.tencent.mm.protocal.c.bea;
import com.tencent.mm.protocal.c.ck;
import com.tencent.mm.sdk.platformtools.aa;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.util.LinkedList;

public final class b
  extends c
{
  private static int lqO;
  public String mac;
  private String ssid;
  
  static
  {
    GMTrace.i(7254870851584L, 54053);
    lqO = 7200;
    GMTrace.o(7254870851584L, 54053);
  }
  
  public b(String paramString1, String paramString2, int paramInt1, int paramInt2)
  {
    GMTrace.i(7254602416128L, 54051);
    aBl();
    this.ssid = paramString2;
    this.mac = paramString1;
    LinkedList localLinkedList = new LinkedList();
    Object localObject = new ck();
    ((ck)localObject).ssid = paramString2;
    ((ck)localObject).mac = paramString1;
    ((ck)localObject).tQu = paramInt1;
    localLinkedList.add(localObject);
    localObject = (com.tencent.mm.protocal.c.ab)this.fUa.gtC.gtK;
    ((com.tencent.mm.protocal.c.ab)localObject).tNq = h.b.lop.aAv();
    ((com.tencent.mm.protocal.c.ab)localObject).tMY = localLinkedList;
    ((com.tencent.mm.protocal.c.ab)localObject).tNr = m.aAJ();
    ((com.tencent.mm.protocal.c.ab)localObject).tNs = paramInt2;
    w.i("MicroMsg.FreeWifi.NetSceneAPAuth", "new apcheck request. mac = %s, ssid = %s, rssi = %d", new Object[] { paramString1, paramString2, Integer.valueOf(paramInt1) });
    GMTrace.o(7254602416128L, 54051);
  }
  
  protected final void aBl()
  {
    GMTrace.i(7254333980672L, 54049);
    b.a locala = new b.a();
    locala.gtF = new com.tencent.mm.protocal.c.ab();
    locala.gtG = new ac();
    locala.uri = "/cgi-bin/mmo2o-bin/apcheck";
    locala.gtE = 1744;
    locala.gtH = 0;
    locala.gtI = 0;
    this.fUa = locala.DA();
    GMTrace.o(7254333980672L, 54049);
  }
  
  protected final void b(int paramInt1, int paramInt2, int paramInt3, String paramString)
  {
    GMTrace.i(7254736633856L, 54052);
    w.i("MicroMsg.FreeWifi.NetSceneAPAuth", "apcheck returns. onGYNetEnd : errType : %d, errCode : %d, errMsg : %s ", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    boolean bool;
    if ((this.fUa != null) && (this.fUa.gtD.gtK != null))
    {
      h.b.lop.a((ac)this.fUa.gtD.gtK);
      if ((m.cf(paramInt2, paramInt3)) || (m.cg(paramInt2, paramInt3)))
      {
        paramString = (ac)this.fUa.gtD.gtK;
        paramInt1 = paramString.tNv;
        bool = paramString.tNu;
        if ((paramInt1 != 0) && (paramInt1 != i.a.loq.getInt("LOCAL_CONFIG_APCHECK_DELAY_CRD_EXPIRED_DAYS", 7))) {
          i.a.loq.aZ("LOCAL_CONFIG_APCHECK_DELAY_CRD_EXPIRED_DAYS", paramInt1);
        }
        if (bool) {
          i.a.loq.w("LOCAL_CONFIG_LAST_APCHECK_SAVE_DELAY_CRD_TIMEMILLIS", System.currentTimeMillis());
        }
      }
    }
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
        ac localac = (ac)this.fUa.gtD.gtK;
        paramString.field_ssid = this.ssid;
        paramString.field_showUrl = localac.tNg;
        bea localbea = localac.tNh;
        if (localbea != null)
        {
          w.i("MicroMsg.FreeWifi.NetSceneAPAuth", "en : %s, cn : %s, tw : %s", new Object[] { localbea.uPR, localbea.uPS, localbea.uPT });
          paramString.field_showWordCn = localbea.uPS;
          paramString.field_showWordEn = localbea.uPR;
          paramString.field_showWordTw = localbea.uPT;
          paramString.field_action = localac.tNf;
          paramString.field_verifyResult = 1;
          paramString.field_connectState = -1;
          if (localac.tNp <= 0) {
            localac.tNp = lqO;
          }
          paramString.field_expiredTime = (bg.Pu() + localac.tNp);
          paramString.field_mac = this.mac;
          if (paramInt1 == 0) {
            break label489;
          }
          w.i("MicroMsg.FreeWifi.NetSceneAPAuth", "insert freewifi ret = %b", new Object[] { Boolean.valueOf(j.aBe().b(paramString)) });
        }
        for (;;)
        {
          j.aBe().yI(this.ssid);
          GMTrace.o(7254736633856L, 54052);
          return;
          paramString.field_showWordCn = com.tencent.mm.sdk.platformtools.ab.getContext().getResources().getString(R.l.dyc);
          paramString.field_showWordEn = com.tencent.mm.sdk.platformtools.ab.getContext().getResources().getString(R.l.dyc);
          paramString.field_showWordTw = com.tencent.mm.sdk.platformtools.ab.getContext().getResources().getString(R.l.dyc);
          break;
          label489:
          w.i("MicroMsg.FreeWifi.NetSceneAPAuth", "insert freewifi ret = %b", new Object[] { Boolean.valueOf(j.aBe().c(paramString, new String[0])) });
        }
      }
      w.e("MicroMsg.FreeWifi.NetSceneAPAuth", "check this ap failed, ssid is :%s", new Object[] { this.ssid });
      if (paramInt1 == 0)
      {
        bool = j.aBe().a(paramString, new String[0]);
        w.i("MicroMsg.FreeWifi.NetSceneAPAuth", "freewifi verify failed, delte local db infos : %s, ret = %b", new Object[] { this.ssid, Boolean.valueOf(bool) });
      }
      GMTrace.o(7254736633856L, 54052);
      return;
    }
  }
  
  public final int getType()
  {
    GMTrace.i(7254468198400L, 54050);
    GMTrace.o(7254468198400L, 54050);
    return 1744;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\freewifi\d\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */