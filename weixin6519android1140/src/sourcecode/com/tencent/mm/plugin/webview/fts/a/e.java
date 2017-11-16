package com.tencent.mm.plugin.webview.fts.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.b.af;
import com.tencent.mm.plugin.fts.a.a.i;
import com.tencent.mm.storage.ar;
import com.tencent.mm.storage.x;
import com.tencent.mm.y.at;
import com.tencent.mm.y.c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public final class e
  extends a<a>
{
  public List<a> lzI;
  
  public e(String paramString, int paramInt)
  {
    super(paramString, Integer.MAX_VALUE);
    GMTrace.i(19475394985984L, 145103);
    this.lzI = Collections.emptyList();
    GMTrace.o(19475394985984L, 145103);
  }
  
  public final void bR(List<i> paramList)
  {
    GMTrace.i(19475529203712L, 145104);
    this.lzI = new ArrayList(paramList.size());
    paramList = paramList.iterator();
    while (paramList.hasNext())
    {
      i locali = (i)paramList.next();
      at.AR();
      x localx = c.yK().TE(locali.lwH);
      a locala = new a();
      locala.userName = localx.field_username;
      locala.rCR = locali.content;
      locala.aDn = localx.field_nickname;
      locala.hLO = localx.field_conRemark;
      locala.fsF = localx.qQ();
      locala.desc = localx.fjt;
      this.lzI.add(locala);
    }
    GMTrace.o(19475529203712L, 145104);
  }
  
  public static final class a
  {
    public String aDn;
    public String desc;
    public String fsF;
    public String hLO;
    public String rCR;
    public String userName;
    
    public a()
    {
      GMTrace.i(19477676687360L, 145120);
      GMTrace.o(19477676687360L, 145120);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\webview\fts\a\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */