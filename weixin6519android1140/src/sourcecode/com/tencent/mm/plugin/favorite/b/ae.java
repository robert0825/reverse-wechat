package com.tencent.mm.plugin.favorite.b;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.ad.k.b;
import com.tencent.mm.network.q;
import com.tencent.mm.plugin.favorite.h;
import com.tencent.mm.protocal.c.ly;
import com.tencent.mm.protocal.c.lz;
import com.tencent.mm.protocal.c.ma;
import com.tencent.mm.protocal.c.tn;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class ae
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  private final b fUa;
  private com.tencent.mm.ad.e fUd;
  private List<String> idList;
  private LinkedList<tn> lcr;
  
  public ae(List<String> paramList)
  {
    GMTrace.i(19313528406016L, 143897);
    this.fUd = null;
    this.idList = null;
    this.lcr = new LinkedList();
    b.a locala = new b.a();
    locala.gtF = new ly();
    locala.gtG = new lz();
    locala.uri = "/cgi-bin/micromsg-bin/checkfavitem";
    locala.gtE = 405;
    locala.gtH = 196;
    locala.gtI = 1000000196;
    this.fUa = locala.DA();
    this.idList = paramList;
    w.i("MicroMsg.NetSceneCheckFavItem", "NetSceneCheckFavItem,ids is :\n %s", new Object[] { paramList.toString() });
    GMTrace.o(19313528406016L, 143897);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(19313662623744L, 143898);
    if ((this.idList == null) || (this.idList.isEmpty()))
    {
      w.e("MicroMsg.NetSceneCheckFavItem", "NetSceneCheckFavItem, doScene, idlist null,return");
      GMTrace.o(19313662623744L, 143898);
      return -1;
    }
    Iterator localIterator = this.idList.iterator();
    while (localIterator.hasNext())
    {
      i = Integer.parseInt((String)localIterator.next());
      if (i > 0)
      {
        j localj = h.axB().cg(i);
        tn localtn = new tn();
        localtn.tPL = i;
        if ((localj != null) && (!bg.nm(localj.field_xml))) {
          localtn.tPS = localj.field_xml;
        }
        this.lcr.add(localtn);
      }
    }
    ((ly)this.fUa.gtC.gtK).ucI = this.lcr;
    this.fUd = parame1;
    int i = a(parame, this.fUa, this);
    GMTrace.o(19313662623744L, 143898);
    return i;
  }
  
  protected final int a(q paramq)
  {
    GMTrace.i(19313931059200L, 143900);
    int i = k.b.gum;
    GMTrace.o(19313931059200L, 143900);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(19313796841472L, 143899);
    w.i("MicroMsg.NetSceneCheckFavItem", "netId %d errType %d errCode %d errMsg %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    paramq = (lz)((b)paramq).gtD.gtK;
    if ((paramInt2 != 0) || (paramInt3 != 0))
    {
      w.i("MicroMsg.NetSceneCheckFavItem", "NetSceneCheckFavItem,cgi return error,errcode:%d,errType:%d", new Object[] { Integer.valueOf(paramInt3), Integer.valueOf(paramInt2) });
      this.fUd.a(paramInt2, paramInt3, paramString, this);
      GMTrace.o(19313796841472L, 143899);
      return;
    }
    paramq = paramq.ucJ.iterator();
    while (paramq.hasNext())
    {
      paramArrayOfByte = (ma)paramq.next();
      w.i("MicroMsg.NetSceneCheckFavItem", "NetSceneCheckFavItem, onGYNetEnd,favid: %d, ret: %d", new Object[] { Integer.valueOf(paramArrayOfByte.tPL), Integer.valueOf(paramArrayOfByte.tST) });
    }
    this.fUd.a(paramInt2, paramInt3, paramString, this);
    GMTrace.o(19313796841472L, 143899);
  }
  
  public final int getType()
  {
    GMTrace.i(19314199494656L, 143902);
    GMTrace.o(19314199494656L, 143902);
    return 405;
  }
  
  protected final int vB()
  {
    GMTrace.i(19314065276928L, 143901);
    GMTrace.o(19314065276928L, 143901);
    return 10;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\favorite\b\ae.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */