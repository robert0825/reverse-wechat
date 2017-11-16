package com.tencent.mm.pluginsdk.model;

import android.content.Intent;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.a.cf;
import com.tencent.mm.plugin.fav.a.b;
import com.tencent.mm.protocal.c.th;
import com.tencent.mm.protocal.c.tk;
import com.tencent.mm.protocal.c.tt;
import com.tencent.mm.protocal.c.tw;
import com.tencent.mm.protocal.c.uf;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.y.q;
import java.util.LinkedList;

public final class f
  implements b
{
  public f()
  {
    GMTrace.i(17956721393664L, 133788);
    GMTrace.o(17956721393664L, 133788);
  }
  
  public final boolean a(cf paramcf, int paramInt, String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, String paramString7, String paramString8, String paramString9, String paramString10, String paramString11)
  {
    GMTrace.i(17956855611392L, 133789);
    tt localtt = new tt();
    tw localtw = new tw();
    th localth = new th();
    localth.zR(5);
    localth.Qv(paramString7);
    localth.Qm(paramString3);
    localth.zQ(paramInt);
    localth.Qg(paramString1);
    localth.Qh(paramString2);
    localth.QE(paramString11);
    paramString2 = new tk();
    paramString2.gkK = paramString1;
    paramString2.ulk = paramInt;
    paramString2.gkI = paramString3;
    paramString2.gkM = paramString5;
    paramString2.gkL = paramString4;
    paramString2.gkN = paramString6;
    paramString2.gkO = paramString9;
    paramString2.gkP = paramString10;
    localth.a(paramString2);
    localtw.QY(paramString8);
    localtw.QZ(q.zE());
    localtw.zZ(0);
    localtw.eE(bg.Pv());
    localtt.a(localtw);
    localtt.ulB.add(localth);
    paramcf.eDv.title = localth.title;
    paramcf.eDv.desc = localth.title;
    paramcf.eDv.eDx = localtt;
    paramcf.eDv.type = 4;
    GMTrace.o(17956855611392L, 133789);
    return true;
  }
  
  public final boolean a(cf paramcf, long paramLong)
  {
    GMTrace.i(17957124046848L, 133791);
    boolean bool = e.a(paramcf, paramLong);
    GMTrace.o(17957124046848L, 133791);
    return bool;
  }
  
  public final boolean a(cf paramcf, Intent paramIntent)
  {
    GMTrace.i(17956989829120L, 133790);
    boolean bool = e.a(paramcf, paramIntent);
    GMTrace.o(17956989829120L, 133790);
    return bool;
  }
  
  public final boolean a(cf paramcf, String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6)
  {
    GMTrace.i(17957258264576L, 133792);
    String str = String.format("%s#%s", new Object[] { paramString1, "" });
    tt localtt = new tt();
    tw localtw = new tw();
    localtw.QY(paramString2);
    localtw.zZ(2);
    localtw.eE(System.currentTimeMillis());
    localtw.Rd(paramString1);
    localtw.Ra(str);
    paramString1 = new th();
    paramString1.Qy(str);
    paramString1.kx(true);
    paramString1.zR(5);
    paramString1.Qg(paramString3);
    paramString1.Qh(paramString4);
    paramString1.QF(paramString5);
    paramString1.kw(true);
    localtt.ulB.add(paramString1);
    paramString1 = new uf();
    paramString1.Ro(paramString6);
    localtt.b(paramString1);
    localtt.a(localtw);
    paramcf.eDv.eDx = localtt;
    paramcf.eDv.desc = paramString3;
    paramcf.eDv.type = 5;
    GMTrace.o(17957258264576L, 133792);
    return true;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\pluginsdk\model\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */