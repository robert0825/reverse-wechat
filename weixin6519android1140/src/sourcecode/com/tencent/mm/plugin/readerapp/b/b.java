package com.tencent.mm.plugin.readerapp.b;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.l;
import com.tencent.mm.g.a.cf;
import com.tencent.mm.modelsfs.FileOp;
import com.tencent.mm.pluginsdk.model.s;
import com.tencent.mm.protocal.c.th;
import com.tencent.mm.protocal.c.tt;
import com.tencent.mm.protocal.c.tw;
import com.tencent.mm.protocal.c.uf;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.y.bh;
import com.tencent.mm.y.q;
import java.util.LinkedList;

public final class b
{
  public static boolean a(cf paramcf, bh parambh, int paramInt)
  {
    GMTrace.i(11744856506368L, 87506);
    if ((paramcf == null) || (parambh == null))
    {
      w.w("MicroMsg.Sns.GetFavDataSource", "fill favorite event fail, event is null or readerAppInfo is null");
      if (paramcf != null) {
        paramcf.eDv.eDB = R.l.dtu;
      }
      GMTrace.o(11744856506368L, 87506);
      return false;
    }
    tt localtt = new tt();
    tw localtw = new tw();
    th localth = new th();
    localtw.QY("newsapp");
    localtw.QZ(q.zE());
    localtw.QZ(q.zE());
    localtw.zZ(1);
    localtw.eE(parambh.goF);
    localtw.Rc(parambh.goK);
    localtw.Rf(parambh.getUrl());
    localtw.Rg("newsapp");
    localth.Qy(String.valueOf(parambh.goK));
    Object localObject;
    if (paramInt == 0)
    {
      localObject = s.s(parambh.Bz(), parambh.type, "@T");
      if (!FileOp.aZ((String)localObject)) {
        break label311;
      }
      localth.Qv((String)localObject);
    }
    for (;;)
    {
      localth.zR(5);
      localth.Qg(parambh.getTitle());
      localth.Qh(parambh.BA());
      localth.kw(true);
      localtt.a(localtw);
      localtt.ulB.add(localth);
      paramcf.eDv.desc = parambh.getTitle();
      paramcf.eDv.eDx = localtt;
      paramcf.eDv.type = 5;
      GMTrace.o(11744856506368L, 87506);
      return true;
      localObject = s.s(parambh.Bz(), parambh.type, "@S");
      break;
      label311:
      localth.kx(true);
      localth.Qp(parambh.Bz());
      localObject = new uf();
      ((uf)localObject).Ro(parambh.Bz());
      localtt.b((uf)localObject);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\readerapp\b\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */