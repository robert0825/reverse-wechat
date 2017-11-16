package com.tencent.mm.plugin.sns.model.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.sns.data.e;
import com.tencent.mm.plugin.sns.data.i;
import com.tencent.mm.plugin.sns.model.ae;
import com.tencent.mm.plugin.sns.model.am;
import com.tencent.mm.protocal.c.anu;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.storage.an;

public final class a
{
  public String eDW;
  public String mediaId;
  public e ppb;
  public String psh;
  public String psl;
  public anu psm;
  public boolean pwR;
  public boolean pwS;
  public int pwT;
  public an pwU;
  public String url;
  
  public a(String paramString)
  {
    GMTrace.i(8068498718720L, 60115);
    this.mediaId = "";
    this.url = "";
    this.pwR = false;
    this.pwS = false;
    this.pwT = 0;
    this.psl = "";
    this.ppb = null;
    this.psh = "";
    this.eDW = "";
    this.mediaId = paramString;
    GMTrace.o(8068498718720L, 60115);
  }
  
  public final String bjO()
  {
    GMTrace.i(8068767154176L, 60117);
    if (this.pwT == 4)
    {
      str = i.p(this.psm);
      GMTrace.o(8068767154176L, 60117);
      return str;
    }
    if (this.pwT == 6)
    {
      str = i.q(this.psm);
      GMTrace.o(8068767154176L, 60117);
      return str;
    }
    if (this.pwR)
    {
      str = i.n(this.psm);
      GMTrace.o(8068767154176L, 60117);
      return str;
    }
    String str = i.m(this.psm);
    GMTrace.o(8068767154176L, 60117);
    return str;
  }
  
  public final String getPath()
  {
    GMTrace.i(8068901371904L, 60118);
    if (bg.nm(this.psh)) {
      init();
    }
    String str = this.psh;
    GMTrace.o(8068901371904L, 60118);
    return str;
  }
  
  public final boolean init()
  {
    GMTrace.i(8068632936448L, 60116);
    this.psh = am.dE(ae.getAccSnsPath(), this.mediaId);
    GMTrace.o(8068632936448L, 60116);
    return true;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\sns\model\a\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */