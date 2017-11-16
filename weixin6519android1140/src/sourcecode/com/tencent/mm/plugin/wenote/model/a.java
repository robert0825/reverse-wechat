package com.tencent.mm.plugin.wenote.model;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.ad.k.b;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.azh;
import com.tencent.mm.protocal.c.es;
import com.tencent.mm.protocal.c.tr;
import com.tencent.mm.protocal.c.tu;
import com.tencent.mm.protocal.c.tv;
import com.tencent.mm.sdk.platformtools.w;
import java.util.LinkedList;

public final class a
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  private final b fUa;
  private com.tencent.mm.ad.e fUd;
  public int sbs;
  private String sbt;
  private tr sbu;
  private LinkedList<tr> sbv;
  public int sbw;
  
  public a(int paramInt1, int paramInt2, String paramString, LinkedList<tr> paramLinkedList, tr paramtr)
  {
    GMTrace.i(20646042009600L, 153825);
    this.fUd = null;
    this.sbs = 1;
    this.sbt = "";
    this.sbu = null;
    this.sbv = new LinkedList();
    this.sbw = 0;
    this.sbv = paramLinkedList;
    this.sbu = paramtr;
    this.sbt = paramString;
    this.sbs = paramInt2;
    this.sbw = paramInt1;
    paramString = new b.a();
    paramString.gtF = new tu();
    paramString.gtG = new tv();
    paramString.uri = "/cgi-bin/micromsg-bin/favsecurity ";
    paramString.gtE = 921;
    paramString.gtH = 0;
    paramString.gtI = 0;
    this.fUa = paramString.DA();
    GMTrace.o(20646042009600L, 153825);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(20646176227328L, 153826);
    tu localtu = (tu)this.fUa.gtC.gtK;
    localtu.lQF = this.sbs;
    localtu.ulG = this.sbu;
    localtu.ulF = this.sbv;
    localtu.ulE = this.sbt;
    this.fUd = parame1;
    int i = a(parame, this.fUa, this);
    GMTrace.o(20646176227328L, 153826);
    return i;
  }
  
  protected final int a(q paramq)
  {
    GMTrace.i(20646444662784L, 153828);
    int i = k.b.gum;
    GMTrace.o(20646444662784L, 153828);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(20646310445056L, 153827);
    w.i("MicroMsg.NetSceneCheckNoteSecurity", "netId %d errType %d errCode %d errMsg %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    paramq = (tv)((b)paramq).gtD.gtK;
    if (paramInt2 != 0)
    {
      w.i("MicroMsg.NetSceneCheckNoteSecurity", "NetSceneCheckNoteSecurity,errType:%d,fail", new Object[] { Integer.valueOf(paramInt2) });
      this.fUd.a(paramInt2, -1, paramString, this);
      GMTrace.o(20646310445056L, 153827);
      return;
    }
    if ((paramq == null) || (paramq.uND == null))
    {
      w.i("MicroMsg.NetSceneCheckNoteSecurity", "NetSceneCheckNoteSecurity,response == null,ok");
      this.fUd.a(paramInt2, 0, paramString, this);
      GMTrace.o(20646310445056L, 153827);
      return;
    }
    if (paramq.uND.tST != 0)
    {
      w.i("MicroMsg.NetSceneCheckNoteSecurity", "NetSceneCheckNoteSecurity,baseresponse.ret != 0,ok");
      this.fUd.a(paramInt2, 0, paramString, this);
      GMTrace.o(20646310445056L, 153827);
      return;
    }
    if (paramq.ulH > 0)
    {
      w.i("MicroMsg.NetSceneCheckNoteSecurity", "NetSceneCheckNoteSecurity,SecurityResult > 0,fail");
      this.fUd.a(paramInt2, -1, paramString, this);
      GMTrace.o(20646310445056L, 153827);
      return;
    }
    w.i("MicroMsg.NetSceneCheckNoteSecurity", "NetSceneCheckNoteSecurity,SecurityResult = 0,fail");
    this.fUd.a(paramInt2, 0, paramString, this);
    GMTrace.o(20646310445056L, 153827);
  }
  
  public final int getType()
  {
    GMTrace.i(20646578880512L, 153829);
    GMTrace.o(20646578880512L, 153829);
    return 921;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\wenote\model\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */