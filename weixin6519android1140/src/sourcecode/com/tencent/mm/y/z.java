package com.tencent.mm.y;

import android.content.Context;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.l;
import com.tencent.mm.g.b.af;
import com.tencent.mm.l.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.ar;
import com.tencent.mm.storage.as;
import com.tencent.mm.storage.x;

public final class z
{
  private c gmU;
  
  public z(c paramc)
  {
    GMTrace.i(687194767360L, 5120);
    this.gmU = paramc;
    GMTrace.o(687194767360L, 5120);
  }
  
  static int a(boolean paramBoolean1, String paramString, boolean paramBoolean2)
  {
    int i = 3;
    GMTrace.i(687328985088L, 5121);
    x localx2 = c.yK().TE(paramString);
    x localx1 = localx2;
    if (localx2 == null) {
      localx1 = new x();
    }
    if ((int)localx1.fTq == 0)
    {
      localx1.setUsername(paramString);
      localx1.uA();
      x(localx1);
      if (paramBoolean2) {
        i = 4;
      }
      localx1.dn(i);
      localx1.uJ();
      c.yK().R(localx1);
      GMTrace.o(687328985088L, 5121);
      return 1;
    }
    if (paramBoolean1)
    {
      localx1.uJ();
      c.yK().a(paramString, localx1);
      GMTrace.o(687328985088L, 5121);
      return 2;
    }
    GMTrace.o(687328985088L, 5121);
    return 3;
  }
  
  public static void w(x paramx)
  {
    GMTrace.i(687463202816L, 5122);
    x localx = paramx;
    if (paramx == null) {
      localx = new x();
    }
    if ((int)localx.fTq == 0)
    {
      localx.setUsername("filehelper");
      at.AR();
      if (c.yP().TO(localx.field_username) != null) {
        break label89;
      }
      localx.uB();
    }
    for (;;)
    {
      localx.dn(3);
      at.AR();
      c.yK().Q(localx);
      GMTrace.o(687463202816L, 5122);
      return;
      label89:
      localx.uA();
    }
  }
  
  static void x(x paramx)
  {
    GMTrace.i(687597420544L, 5123);
    String str = paramx.field_username;
    Context localContext = ab.getContext();
    if (str.equals("qqsync"))
    {
      paramx.cl(localContext.getString(R.l.dCo));
      paramx.cm(localContext.getString(R.l.dCp));
      paramx.cn(localContext.getString(R.l.dCq));
    }
    if (str.equals("floatbottle"))
    {
      paramx.cl(localContext.getString(R.l.dBx));
      paramx.cm(localContext.getString(R.l.dBy));
      paramx.cn(localContext.getString(R.l.dBz));
    }
    if (str.equals("shakeapp"))
    {
      paramx.cl(localContext.getString(R.l.dCv));
      paramx.cm(localContext.getString(R.l.dCw));
      paramx.cn(localContext.getString(R.l.dCx));
    }
    if (str.equals("lbsapp"))
    {
      paramx.cl(localContext.getString(R.l.dBP));
      paramx.cm(localContext.getString(R.l.dBQ));
      paramx.cn(localContext.getString(R.l.dBR));
    }
    if (str.equals("medianote"))
    {
      paramx.cl(localContext.getString(R.l.dBY));
      paramx.cm(localContext.getString(R.l.dBZ));
      paramx.cn(localContext.getString(R.l.dCa));
    }
    if (str.equals("newsapp"))
    {
      paramx.cl(localContext.getString(R.l.dCr));
      paramx.cm(localContext.getString(R.l.dCs));
      paramx.cn(localContext.getString(R.l.dCt));
    }
    if (str.equals("facebookapp"))
    {
      paramx.cl(localContext.getString(R.l.dBD));
      paramx.cm(localContext.getString(R.l.dBE));
      paramx.cn(localContext.getString(R.l.dBF));
    }
    if (str.equals("qqfriend"))
    {
      paramx.cl(localContext.getString(R.l.dCi));
      paramx.cm(localContext.getString(R.l.dCj));
      paramx.cn(localContext.getString(R.l.dCk));
    }
    if (str.equals("masssendapp"))
    {
      paramx.cl(localContext.getString(R.l.dBV));
      paramx.cm(localContext.getString(R.l.dBW));
      paramx.cn(localContext.getString(R.l.dBX));
    }
    if (str.equals("feedsapp"))
    {
      paramx.cl(localContext.getString(R.l.dBG));
      paramx.cm(localContext.getString(R.l.dBH));
      paramx.cn(localContext.getString(R.l.dBI));
    }
    if (str.equals("fmessage"))
    {
      paramx.cl(localContext.getString(R.l.dBJ));
      paramx.cm(localContext.getString(R.l.dBK));
      paramx.cn(localContext.getString(R.l.dBL));
    }
    if (str.equals("voipapp"))
    {
      paramx.cl(localContext.getString(R.l.dCC));
      paramx.cm(localContext.getString(R.l.dCD));
      paramx.cn(localContext.getString(R.l.dCE));
    }
    if (str.equals("officialaccounts"))
    {
      paramx.cl(localContext.getString(R.l.dCf));
      paramx.cm(localContext.getString(R.l.dCg));
      paramx.cn(localContext.getString(R.l.dCh));
    }
    if (str.equals("helper_entry"))
    {
      paramx.cl(localContext.getString(R.l.dBM));
      paramx.cm(localContext.getString(R.l.dBN));
      paramx.cn(localContext.getString(R.l.dBO));
    }
    if (str.equals("cardpackage"))
    {
      paramx.cl(localContext.getString(R.l.dBA));
      paramx.cm(localContext.getString(R.l.dBB));
      paramx.cn(localContext.getString(R.l.dBC));
    }
    if (str.equals("voicevoipapp"))
    {
      paramx.cl(localContext.getString(R.l.dCF));
      paramx.cm(localContext.getString(R.l.dCG));
      paramx.cn(localContext.getString(R.l.dCH));
    }
    if (str.equals("voiceinputapp"))
    {
      paramx.cl(localContext.getString(R.l.dCz));
      paramx.cm(localContext.getString(R.l.dCA));
      paramx.cn(localContext.getString(R.l.dCB));
    }
    if (str.equals("qqmail"))
    {
      paramx.cl(localContext.getString(R.l.dCl));
      paramx.cm(localContext.getString(R.l.dCm));
      paramx.cn(localContext.getString(R.l.dCn));
    }
    if (str.equals("linkedinplugin"))
    {
      paramx.cl(localContext.getString(R.l.dBS));
      paramx.cm(localContext.getString(R.l.dBT));
      paramx.cn(localContext.getString(R.l.dBU));
    }
    if (str.equals("notifymessage"))
    {
      paramx.cl(localContext.getString(R.l.dCc));
      paramx.cm(localContext.getString(R.l.dCd));
      paramx.cn(localContext.getString(R.l.dCe));
    }
    if (str.equals("appbrandcustomerservicemsg"))
    {
      paramx.cl(localContext.getString(R.l.dBu));
      paramx.cm(localContext.getString(R.l.dBv));
      paramx.cn(localContext.getString(R.l.dBw));
    }
    GMTrace.o(687597420544L, 5123);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\y\z.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */