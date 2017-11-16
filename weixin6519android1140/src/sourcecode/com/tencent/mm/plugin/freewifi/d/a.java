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
import com.tencent.mm.plugin.freewifi.m;
import com.tencent.mm.plugin.freewifi.model.j;
import com.tencent.mm.protocal.c.awa;
import com.tencent.mm.protocal.c.bea;
import com.tencent.mm.protocal.c.ck;
import com.tencent.mm.protocal.c.eb;
import com.tencent.mm.protocal.c.ur;
import com.tencent.mm.protocal.c.z;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.net.URLDecoder;
import java.util.LinkedList;

public final class a
  extends c
{
  private static int lqO;
  private int eHz;
  private String mac;
  private String ssid;
  
  static
  {
    GMTrace.i(7250978537472L, 54024);
    lqO = 7200;
    GMTrace.o(7250978537472L, 54024);
  }
  
  public a(String paramString1, int paramInt, String paramString2)
  {
    GMTrace.i(7249770577920L, 54015);
    aBl();
    this.eHz = 4;
    z localz = (z)this.fUa.gtC.gtK;
    localz.tMX = 4;
    localz.URL = paramString1;
    localz.tMZ = paramInt;
    localz.tNa = paramString2;
    localz.tNb = m.aAH();
    localz.tMY = new LinkedList();
    paramString2 = new ck();
    paramString2.ssid = m.ys("MicroMsg.FreeWifi.NetSceneAPAuth");
    paramString2.mac = m.yt("MicroMsg.FreeWifi.NetSceneAPAuth");
    localz.tMY.add(paramString2);
    localz.tNc = m.yu("MicroMsg.FreeWifi.NetSceneAPAuth");
    w.i("MicroMsg.FreeWifi.NetSceneAPAuth", "Constructing get front page request, HasMobile=%d, Ap_info[0].ssid=%s, Ap_info[0].mac=%s", new Object[] { Integer.valueOf(localz.tNb), paramString2.ssid, paramString2.mac });
    w.i("MicroMsg.FreeWifi.NetSceneAPAuth", "opCode = %d, url = %s", new Object[] { Integer.valueOf(4), paramString1 });
    GMTrace.o(7249770577920L, 54015);
  }
  
  public a(String paramString1, String paramString2, String paramString3, int paramInt1, int paramInt2, String paramString4)
  {
    GMTrace.i(7249636360192L, 54014);
    aBl();
    this.ssid = paramString3;
    this.mac = paramString2;
    this.eHz = 1;
    LinkedList localLinkedList = new LinkedList();
    Object localObject = new ck();
    ((ck)localObject).ssid = paramString3;
    ((ck)localObject).mac = paramString2;
    ((ck)localObject).tQu = paramInt1;
    localLinkedList.add(localObject);
    localObject = (z)this.fUa.gtC.gtK;
    ((z)localObject).tMX = 1;
    ((z)localObject).tMY = localLinkedList;
    ((z)localObject).URL = paramString1;
    ((z)localObject).tMZ = paramInt2;
    ((z)localObject).tNa = paramString4;
    ((z)localObject).tNc = m.yu("MicroMsg.FreeWifi.NetSceneAPAuth");
    w.i("MicroMsg.FreeWifi.NetSceneAPAuth", "opcode = %d, mac = %s, ssid = %s, rssi = %d", new Object[] { Integer.valueOf(1), paramString2, paramString3, Integer.valueOf(paramInt1) });
    GMTrace.o(7249636360192L, 54014);
  }
  
  public a(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, int paramInt, String paramString7)
  {
    GMTrace.i(7249502142464L, 54013);
    aBl();
    this.ssid = paramString2;
    this.mac = paramString3;
    z localz = (z)this.fUa.gtC.gtK;
    String str = URLDecoder.decode(paramString5);
    localz.tMX = 0;
    localz.URL = paramString1;
    localz.SSID = paramString2;
    localz.tMU = paramString4;
    localz.tMV = str;
    localz.tMW = paramString6;
    localz.tMZ = paramInt;
    localz.tNa = paramString7;
    paramString7 = new LinkedList();
    ck localck = new ck();
    localck.ssid = paramString2;
    localck.mac = paramString3;
    paramString7.add(localck);
    localz.tMY = paramString7;
    w.i("MicroMsg.FreeWifi.NetSceneAPAuth", "url : %s, ssid : %s, mid : %s, mac : %s, apauthdata : %s, decoded apauthdata :%s,  token : %s", new Object[] { paramString1, paramString2, paramString4, paramString3, paramString5, str, paramString6 });
    GMTrace.o(7249502142464L, 54013);
  }
  
  protected final void aBl()
  {
    GMTrace.i(7249233707008L, 54011);
    b.a locala = new b.a();
    locala.gtF = new z();
    locala.gtG = new com.tencent.mm.protocal.c.aa();
    locala.uri = "/cgi-bin/micromsg-bin/apauth";
    locala.gtE = 640;
    locala.gtH = 0;
    locala.gtI = 0;
    this.fUa = locala.DA();
    GMTrace.o(7249233707008L, 54011);
  }
  
  public final String aBm()
  {
    GMTrace.i(7250039013376L, 54017);
    Object localObject = (com.tencent.mm.protocal.c.aa)this.fUa.gtD.gtK;
    if (localObject != null)
    {
      localObject = ((com.tencent.mm.protocal.c.aa)localObject).tNd;
      GMTrace.o(7250039013376L, 54017);
      return (String)localObject;
    }
    GMTrace.o(7250039013376L, 54017);
    return null;
  }
  
  public final awa aBn()
  {
    GMTrace.i(7250173231104L, 54018);
    Object localObject = (com.tencent.mm.protocal.c.aa)this.fUa.gtD.gtK;
    if (localObject != null)
    {
      localObject = ((com.tencent.mm.protocal.c.aa)localObject).tNk;
      GMTrace.o(7250173231104L, 54018);
      return (awa)localObject;
    }
    GMTrace.o(7250173231104L, 54018);
    return null;
  }
  
  public final boolean aBo()
  {
    GMTrace.i(7250307448832L, 54019);
    com.tencent.mm.protocal.c.aa localaa = (com.tencent.mm.protocal.c.aa)this.fUa.gtD.gtK;
    if ((localaa != null) && (localaa.tNl != null))
    {
      if (localaa.tNl.tNb == 1)
      {
        GMTrace.o(7250307448832L, 54019);
        return true;
      }
      GMTrace.o(7250307448832L, 54019);
      return false;
    }
    GMTrace.o(7250307448832L, 54019);
    return false;
  }
  
  public final ur aBp()
  {
    GMTrace.i(7250441666560L, 54020);
    Object localObject = (com.tencent.mm.protocal.c.aa)this.fUa.gtD.gtK;
    if (localObject != null)
    {
      localObject = ((com.tencent.mm.protocal.c.aa)localObject).tNl;
      GMTrace.o(7250441666560L, 54020);
      return (ur)localObject;
    }
    GMTrace.o(7250441666560L, 54020);
    return null;
  }
  
  public final String aBq()
  {
    GMTrace.i(7250575884288L, 54021);
    Object localObject = (com.tencent.mm.protocal.c.aa)this.fUa.gtD.gtK;
    if (localObject != null)
    {
      localObject = ((com.tencent.mm.protocal.c.aa)localObject).tNn;
      GMTrace.o(7250575884288L, 54021);
      return (String)localObject;
    }
    GMTrace.o(7250575884288L, 54021);
    return null;
  }
  
  public final String aBr()
  {
    GMTrace.i(7250710102016L, 54022);
    Object localObject = (com.tencent.mm.protocal.c.aa)this.fUa.gtD.gtK;
    if (localObject != null)
    {
      localObject = ((com.tencent.mm.protocal.c.aa)localObject).tNo;
      GMTrace.o(7250710102016L, 54022);
      return (String)localObject;
    }
    GMTrace.o(7250710102016L, 54022);
    return null;
  }
  
  public final eb aBs()
  {
    GMTrace.i(7250844319744L, 54023);
    Object localObject = (com.tencent.mm.protocal.c.aa)this.fUa.gtD.gtK;
    if (localObject != null)
    {
      localObject = ((com.tencent.mm.protocal.c.aa)localObject).tNm;
      GMTrace.o(7250844319744L, 54023);
      return (eb)localObject;
    }
    GMTrace.o(7250844319744L, 54023);
    return null;
  }
  
  protected final void b(int paramInt1, int paramInt2, int paramInt3, String paramString)
  {
    GMTrace.i(7249904795648L, 54016);
    w.i("MicroMsg.FreeWifi.NetSceneAPAuth", "onGYNetEnd : errType : %d, errCode : %d, errMsg : %s, opCode = %d", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString, Integer.valueOf(this.eHz) });
    Object localObject;
    boolean bool;
    switch (this.eHz)
    {
    default: 
    case 0: 
      do
      {
        GMTrace.o(7249904795648L, 54016);
        return;
      } while ((paramInt2 != 0) || (paramInt3 != 0));
      paramString = j.aBe().yH(this.ssid);
      localObject = this.ssid;
      if (paramString == null)
      {
        bool = true;
        w.i("MicroMsg.FreeWifi.NetSceneAPAuth", "get freewifi by ssid :%s, is wifi info = null ? %b", new Object[] { localObject, Boolean.valueOf(bool) });
        if (paramString != null) {
          break label1091;
        }
        paramString = new com.tencent.mm.plugin.freewifi.g.c();
        paramString.field_ssidmd5 = com.tencent.mm.sdk.platformtools.aa.RP(this.ssid);
      }
      break;
    }
    label530:
    label986:
    label1091:
    for (paramInt1 = 1;; paramInt1 = 0)
    {
      paramString.field_wifiType = 1;
      localObject = (com.tencent.mm.protocal.c.aa)this.fUa.gtD.gtK;
      bea localbea = ((com.tencent.mm.protocal.c.aa)localObject).tNh;
      if (localbea != null)
      {
        w.i("MicroMsg.FreeWifi.NetSceneAPAuth", "en : %s, cn : %s, tw : %s", new Object[] { localbea.uPR, localbea.uPS, localbea.uPT });
        paramString.field_showWordCn = localbea.uPS;
        paramString.field_showWordEn = localbea.uPR;
      }
      for (paramString.field_showWordTw = localbea.uPT;; paramString.field_showWordTw = ab.getContext().getResources().getString(R.l.dyc))
      {
        paramString.field_action = ((com.tencent.mm.protocal.c.aa)localObject).tNf;
        paramString.field_verifyResult = 1;
        paramString.field_connectState = -1;
        if (((com.tencent.mm.protocal.c.aa)localObject).tNp <= 0) {
          ((com.tencent.mm.protocal.c.aa)localObject).tNp = lqO;
        }
        paramString.field_expiredTime = (bg.Pu() + ((com.tencent.mm.protocal.c.aa)localObject).tNp);
        paramString.field_showUrl = ((com.tencent.mm.protocal.c.aa)localObject).tNg;
        paramString.field_action = ((com.tencent.mm.protocal.c.aa)localObject).tNf;
        paramString.field_ssid = this.ssid;
        paramString.field_mac = this.mac;
        paramString.field_wifiType = 1;
        if (paramInt1 == 0) {
          break label530;
        }
        bool = j.aBe().b(paramString);
        w.i("MicroMsg.FreeWifi.NetSceneAPAuth", "insert freewifi ret = %b", new Object[] { Boolean.valueOf(bool) });
        w.i("MicroMsg.FreeWifi.NetSceneAPAuth", "insert local freewifi info : %s, %b, expiredTime : %d, action :%d, showurl : %s", new Object[] { this.ssid, Boolean.valueOf(bool), Integer.valueOf(((com.tencent.mm.protocal.c.aa)localObject).tNe), Integer.valueOf(((com.tencent.mm.protocal.c.aa)localObject).tNf), ((com.tencent.mm.protocal.c.aa)localObject).tNg });
        GMTrace.o(7249904795648L, 54016);
        return;
        bool = false;
        break;
        paramString.field_showWordCn = ab.getContext().getResources().getString(R.l.dyc);
        paramString.field_showWordEn = ab.getContext().getResources().getString(R.l.dyc);
      }
      bool = j.aBe().c(paramString, new String[0]);
      w.i("MicroMsg.FreeWifi.NetSceneAPAuth", "update local freewifi info : %s, %b, expiredTime : %d, action :%d, showurl : %s", new Object[] { this.ssid, Boolean.valueOf(bool), Integer.valueOf(((com.tencent.mm.protocal.c.aa)localObject).tNe), Integer.valueOf(((com.tencent.mm.protocal.c.aa)localObject).tNf), ((com.tencent.mm.protocal.c.aa)localObject).tNg });
      GMTrace.o(7249904795648L, 54016);
      return;
      paramString = j.aBe().yH(this.ssid);
      if (paramString == null)
      {
        paramString = new com.tencent.mm.plugin.freewifi.g.c();
        paramString.field_ssidmd5 = com.tencent.mm.sdk.platformtools.aa.RP(this.ssid);
      }
      for (paramInt1 = 1;; paramInt1 = 0)
      {
        if ((paramInt2 == 0) && (paramInt3 == 0))
        {
          localObject = (com.tencent.mm.protocal.c.aa)this.fUa.gtD.gtK;
          paramString.field_ssid = this.ssid;
          paramString.field_showUrl = ((com.tencent.mm.protocal.c.aa)localObject).tNg;
          localbea = ((com.tencent.mm.protocal.c.aa)localObject).tNh;
          w.i("MicroMsg.FreeWifi.NetSceneAPAuth", "get resp info : %s, expiredTime : %d, action :%d, showurl : %s", new Object[] { this.ssid, Integer.valueOf(((com.tencent.mm.protocal.c.aa)localObject).tNe), Integer.valueOf(((com.tencent.mm.protocal.c.aa)localObject).tNf), ((com.tencent.mm.protocal.c.aa)localObject).tNg });
          if (localbea != null)
          {
            w.i("MicroMsg.FreeWifi.NetSceneAPAuth", "en : %s, cn : %s, tw : %s", new Object[] { localbea.uPR, localbea.uPS, localbea.uPT });
            paramString.field_showWordCn = localbea.uPS;
            paramString.field_showWordEn = localbea.uPR;
            paramString.field_showWordTw = localbea.uPT;
            paramString.field_action = ((com.tencent.mm.protocal.c.aa)localObject).tNf;
            paramString.field_verifyResult = 1;
            paramString.field_connectState = -1;
            if (((com.tencent.mm.protocal.c.aa)localObject).tNp <= 0) {
              ((com.tencent.mm.protocal.c.aa)localObject).tNp = lqO;
            }
            paramString.field_expiredTime = (bg.Pu() + ((com.tencent.mm.protocal.c.aa)localObject).tNp);
            paramString.field_mac = this.mac;
            if (paramInt1 == 0) {
              break label986;
            }
            w.i("MicroMsg.FreeWifi.NetSceneAPAuth", "insert freewifi ret = %b", new Object[] { Boolean.valueOf(j.aBe().b(paramString)) });
          }
          for (;;)
          {
            j.aBe().yI(this.ssid);
            GMTrace.o(7249904795648L, 54016);
            return;
            paramString.field_showWordCn = ab.getContext().getResources().getString(R.l.dyc);
            paramString.field_showWordEn = ab.getContext().getResources().getString(R.l.dyc);
            paramString.field_showWordTw = ab.getContext().getResources().getString(R.l.dyc);
            break;
            w.i("MicroMsg.FreeWifi.NetSceneAPAuth", "insert freewifi ret = %b", new Object[] { Boolean.valueOf(j.aBe().c(paramString, new String[0])) });
          }
        }
        w.e("MicroMsg.FreeWifi.NetSceneAPAuth", "check this ap failed, ssid is :%s", new Object[] { this.ssid });
        if (paramInt1 != 0) {
          break;
        }
        bool = j.aBe().a(paramString, new String[0]);
        w.i("MicroMsg.FreeWifi.NetSceneAPAuth", "freewifi verify failed, delte local db infos : %s, ret = %b", new Object[] { this.ssid, Boolean.valueOf(bool) });
        break;
      }
    }
  }
  
  public final int getType()
  {
    GMTrace.i(7249367924736L, 54012);
    GMTrace.o(7249367924736L, 54012);
    return 640;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\freewifi\d\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */