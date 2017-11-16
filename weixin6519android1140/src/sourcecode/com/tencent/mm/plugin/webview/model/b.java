package com.tencent.mm.plugin.webview.model;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.l;
import com.tencent.mm.g.a.cf;
import com.tencent.mm.protocal.c.th;
import com.tencent.mm.protocal.c.tt;
import com.tencent.mm.protocal.c.tw;
import com.tencent.mm.protocal.c.uf;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.y.q;
import java.util.LinkedList;

public final class b
{
  public static boolean a(cf paramcf, a parama)
  {
    GMTrace.i(16931029516288L, 126146);
    if (!bg.nm(parama.url)) {}
    for (int i = 1; i == 0; i = 0)
    {
      w.w("MicroMsg.GetFavDataSource", "fill favorite event fail, event is null or wrapper is invalid");
      paramcf.eDv.eDB = R.l.dtu;
      GMTrace.o(16931029516288L, 126146);
      return false;
    }
    tt localtt = new tt();
    tw localtw = new tw();
    th localth = new th();
    localth.Qm(parama.url);
    localth.Qg(parama.title);
    localth.Qh(parama.desc);
    localth.Qp(parama.thumbUrl);
    localth.QE(parama.eTv);
    localth.kw(true);
    localth.kx(true);
    localth.zR(5);
    uf localuf = new uf();
    localuf.Ro(parama.thumbUrl);
    localtt.b(localuf);
    localtw.QY(q.zE());
    localtw.QZ(q.zE());
    localtw.zZ(3);
    localtw.eE(bg.Pv());
    localtw.Re(parama.eSd);
    localtw.Rf(parama.url);
    paramcf.eDv.title = localth.title;
    paramcf.eDv.eDx = localtt;
    paramcf.eDv.type = 5;
    localtt.a(localtw);
    localtt.ulB.add(localth);
    GMTrace.o(16931029516288L, 126146);
    return true;
  }
  
  public static final class a
  {
    public String desc;
    public String eSd;
    public String eTv;
    public String thumbUrl;
    public String title;
    public String url;
    
    public a()
    {
      GMTrace.i(12002151890944L, 89423);
      GMTrace.o(12002151890944L, 89423);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\webview\model\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */