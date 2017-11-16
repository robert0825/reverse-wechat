package com.tencent.mm.pluginsdk.j.a.b;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.azg;
import com.tencent.mm.protocal.c.mk;
import com.tencent.mm.protocal.c.ml;
import java.util.LinkedList;
import java.util.List;

public final class m
  extends n
{
  public m()
  {
    GMTrace.i(851477266432L, 6344);
    GMTrace.o(851477266432L, 6344);
  }
  
  public m(int paramInt)
  {
    GMTrace.i(851611484160L, 6345);
    azg localazg = new azg();
    localazg.jib = paramInt;
    this.tqO.clear();
    this.tqO.add(localazg);
    GMTrace.o(851611484160L, 6345);
  }
  
  protected final q bKj()
  {
    GMTrace.i(851745701888L, 6346);
    Object localObject = new b.a();
    mk localmk = new mk();
    localmk.udm.addAll(this.tqO);
    ((b.a)localObject).gtF = localmk;
    ((b.a)localObject).gtG = new ml();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/checkresupdate";
    ((b.a)localObject).gtE = 721;
    ((b.a)localObject).gtH = 0;
    ((b.a)localObject).gtI = 0;
    localObject = ((b.a)localObject).DA();
    GMTrace.o(851745701888L, 6346);
    return (q)localObject;
  }
  
  protected final String getTag()
  {
    GMTrace.i(851208830976L, 6342);
    GMTrace.o(851208830976L, 6342);
    return "MicroMsg.ResDownloader.CheckResUpdate.NetSceneCheckResUpdate";
  }
  
  public final int getType()
  {
    GMTrace.i(851879919616L, 6347);
    GMTrace.o(851879919616L, 6347);
    return 721;
  }
  
  protected final ml i(q paramq)
  {
    GMTrace.i(851343048704L, 6343);
    paramq = (ml)((b)paramq).gtD.gtK;
    GMTrace.o(851343048704L, 6343);
    return paramq;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\pluginsdk\j\a\b\m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */