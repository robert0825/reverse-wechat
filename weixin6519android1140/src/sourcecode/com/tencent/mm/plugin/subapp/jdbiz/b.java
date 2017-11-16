package com.tencent.mm.plugin.subapp.jdbiz;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.pluginsdk.p.d;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.bh;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import com.tencent.mm.y.at;
import com.tencent.mm.y.c;
import java.util.Map;

public final class b
  implements p.d
{
  public String eQH;
  public long gXo;
  public String iconUrl;
  public String jumpUrl;
  public String qrF;
  public String qrG;
  public boolean qrH;
  public boolean qrI;
  public String qrJ;
  public String qrK;
  public long qrL;
  public long qrM;
  public long qrN;
  public long qrO;
  public String qrP;
  public String qrQ;
  public String qrR;
  public String qrS;
  public long startTime;
  public String title;
  
  public b()
  {
    GMTrace.i(5852564029440L, 43605);
    this.qrF = "";
    this.qrG = "";
    this.gXo = 0L;
    this.title = "";
    this.iconUrl = "";
    this.qrH = false;
    this.qrI = false;
    this.qrJ = "";
    this.qrK = "";
    this.qrP = "";
    this.qrQ = "";
    this.qrR = "";
    this.qrS = "";
    this.jumpUrl = "";
    this.eQH = "";
    GMTrace.o(5852564029440L, 43605);
  }
  
  public static b brj()
  {
    GMTrace.i(5852698247168L, 43606);
    at.AR();
    String str = (String)c.xh().get(327942, "");
    b localb = new b();
    w.i("MicroMsg.JdMsgContent", " create xml : " + str);
    localb.Ie(str);
    GMTrace.o(5852698247168L, 43606);
    return localb;
  }
  
  public final void Ie(String paramString)
  {
    GMTrace.i(5852832464896L, 43607);
    this.qrF = "";
    this.qrG = "";
    this.gXo = 0L;
    this.qrJ = "";
    this.qrH = false;
    this.qrI = false;
    this.qrQ = "";
    this.qrR = "";
    this.qrS = "";
    this.qrP = "";
    this.jumpUrl = "";
    this.eQH = "";
    this.eQH = paramString;
    if (bg.nm(paramString))
    {
      GMTrace.o(5852832464896L, 43607);
      return;
    }
    w.i("MicroMsg.JdMsgContent", "feed xml %s", new Object[] { paramString });
    paramString = bh.q(paramString, "sysmsg");
    if (paramString != null)
    {
      this.qrF = bg.aq((String)paramString.get(".sysmsg.biztype"), "");
      this.qrP = bg.aq((String)paramString.get(".sysmsg.alert"), "");
      this.qrG = bg.aq((String)paramString.get(".sysmsg.activityid"), "");
      this.startTime = bg.Sz((String)paramString.get(".sysmsg.starttime"));
      this.gXo = bg.Sz((String)paramString.get(".sysmsg.expiretime"));
      this.title = bg.aq((String)paramString.get(".sysmsg.content.title"), "");
      this.iconUrl = bg.aq((String)paramString.get(".sysmsg.content.icon"), "");
      this.jumpUrl = bg.aq((String)paramString.get(".sysmsg.content.jumpurl"), "");
      this.qrL = bg.Sz((String)paramString.get(".sysmsg.content.urlstarttime"));
      this.qrM = bg.Sz((String)paramString.get(".sysmsg.content.urlexpiretime"));
      this.qrJ = bg.aq((String)paramString.get(".sysmsg.content.jdcelltitle"), "");
      this.qrK = bg.aq((String)paramString.get(".sysmsg.content.jdcellicon"), "");
      this.qrN = bg.Sz((String)paramString.get(".sysmsg.content.titlestarttime"));
      this.qrO = bg.Sz((String)paramString.get(".sysmsg.content.titleexpiretime"));
      this.qrH = "1".equals(paramString.get(".sysmsg.content.findshowreddot"));
      this.qrI = "1".equals(paramString.get(".sysmsg.content.jdcellshowred"));
      this.qrQ = bg.aq((String)paramString.get(".sysmsg.content.alertviewtitle"), "");
      this.qrR = bg.aq((String)paramString.get(".sysmsg.content.alertviewconfirm"), "");
      this.qrS = bg.aq((String)paramString.get(".sysmsg.content.alertviewcancel"), "");
    }
    GMTrace.o(5852832464896L, 43607);
  }
  
  public final boolean a(b paramb)
  {
    GMTrace.i(5853235118080L, 43610);
    if (paramb == null)
    {
      GMTrace.o(5853235118080L, 43610);
      return true;
    }
    if (!bg.aq(this.qrG, "").equals(bg.aq(paramb.qrG, "")))
    {
      GMTrace.o(5853235118080L, 43610);
      return true;
    }
    GMTrace.o(5853235118080L, 43610);
    return false;
  }
  
  public final boolean aCe()
  {
    GMTrace.i(5852966682624L, 43608);
    if (this.startTime < System.currentTimeMillis() / 1000L)
    {
      GMTrace.o(5852966682624L, 43608);
      return true;
    }
    GMTrace.o(5852966682624L, 43608);
    return false;
  }
  
  public final boolean brk()
  {
    GMTrace.i(5853100900352L, 43609);
    if ((this.gXo != 0L) && (this.gXo < System.currentTimeMillis() / 1000L))
    {
      GMTrace.o(5853100900352L, 43609);
      return true;
    }
    GMTrace.o(5853100900352L, 43609);
    return false;
  }
  
  public final String brl()
  {
    GMTrace.i(5853369335808L, 43611);
    String str = bg.aq(this.eQH, "");
    GMTrace.o(5853369335808L, 43611);
    return str;
  }
  
  public final String brm()
  {
    GMTrace.i(5853503553536L, 43612);
    String str = this.qrG;
    GMTrace.o(5853503553536L, 43612);
    return str;
  }
  
  public final String brn()
  {
    GMTrace.i(5853637771264L, 43613);
    String str = this.qrJ;
    GMTrace.o(5853637771264L, 43613);
    return str;
  }
  
  public final boolean bro()
  {
    GMTrace.i(5853771988992L, 43614);
    boolean bool = this.qrI;
    GMTrace.o(5853771988992L, 43614);
    return bool;
  }
  
  public final String brp()
  {
    GMTrace.i(5853906206720L, 43615);
    String str = this.qrF;
    GMTrace.o(5853906206720L, 43615);
    return str;
  }
  
  public final String brq()
  {
    GMTrace.i(5854040424448L, 43616);
    String str = this.jumpUrl;
    GMTrace.o(5854040424448L, 43616);
    return str;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\subapp\jdbiz\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */