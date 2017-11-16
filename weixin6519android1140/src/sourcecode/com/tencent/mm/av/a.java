package com.tencent.mm.av;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.i;
import com.tencent.mm.network.q;
import com.tencent.mm.plugin.messenger.foundation.a.a.e.b;
import com.tencent.mm.protocal.c.arv;
import com.tencent.mm.protocal.c.arw;
import com.tencent.mm.protocal.c.azp;
import com.tencent.mm.protocal.c.nk;
import com.tencent.mm.protocal.c.nl;
import com.tencent.mm.protocal.k.c;
import com.tencent.mm.protocal.k.d;
import com.tencent.mm.protocal.k.e;
import com.tencent.mm.sdk.platformtools.w;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class a
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  private com.tencent.mm.ad.e fUd;
  public a gPi;
  public final List<e.b> gPj;
  
  public a(List<e.b> paramList)
  {
    GMTrace.i(13185012727808L, 98236);
    this.gPj = new ArrayList();
    this.gPj.addAll(paramList);
    this.gPi = new a();
    ((b)this.gPi.DC()).gPm.uGE = K(paramList);
    GMTrace.o(13185012727808L, 98236);
  }
  
  private static nl K(List<e.b> paramList)
  {
    GMTrace.i(13185146945536L, 98237);
    nl localnl = new nl();
    Iterator localIterator = paramList.iterator();
    while (localIterator.hasNext())
    {
      e.b localb = (e.b)localIterator.next();
      byte[] arrayOfByte = localb.getBuffer();
      nk localnk = new nk();
      localnk.uei = localb.getCmdId();
      localnk.uej = new azp().be(arrayOfByte);
      localnl.jhd.add(localnk);
    }
    localnl.jhc = paramList.size();
    w.d("MicroMsg.NetSceneOplog", "summeroplog oplogs size=" + paramList.size());
    GMTrace.o(13185146945536L, 98237);
    return localnl;
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(13185281163264L, 98238);
    this.fUd = parame1;
    int i = a(parame, this.gPi, this);
    GMTrace.o(13185281163264L, 98238);
    return i;
  }
  
  protected final int a(q paramq)
  {
    GMTrace.i(13185415380992L, 98239);
    int i = com.tencent.mm.ad.k.b.gum;
    GMTrace.o(13185415380992L, 98239);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(13185683816448L, 98241);
    this.fUd.a(paramInt2, paramInt3, paramString, this);
    GMTrace.o(13185683816448L, 98241);
  }
  
  public final int getType()
  {
    GMTrace.i(13185818034176L, 98242);
    GMTrace.o(13185818034176L, 98242);
    return 681;
  }
  
  protected final int vB()
  {
    GMTrace.i(13185549598720L, 98240);
    GMTrace.o(13185549598720L, 98240);
    return 5;
  }
  
  public static final class a
    extends i
  {
    private final a.b gPk;
    public final a.c gPl;
    
    public a()
    {
      GMTrace.i(13186489122816L, 98247);
      this.gPk = new a.b();
      this.gPl = new a.c();
      GMTrace.o(13186489122816L, 98247);
    }
    
    public final k.d AY()
    {
      GMTrace.i(13186623340544L, 98248);
      a.b localb = this.gPk;
      GMTrace.o(13186623340544L, 98248);
      return localb;
    }
    
    public final k.e AZ()
    {
      GMTrace.i(13186757558272L, 98249);
      a.c localc = this.gPl;
      GMTrace.o(13186757558272L, 98249);
      return localc;
    }
    
    public final int getType()
    {
      GMTrace.i(13186891776000L, 98250);
      GMTrace.o(13186891776000L, 98250);
      return 681;
    }
    
    public final String getUri()
    {
      GMTrace.i(13187025993728L, 98251);
      GMTrace.o(13187025993728L, 98251);
      return "/cgi-bin/micromsg-bin/oplog";
    }
  }
  
  static final class b
    extends k.d
    implements com.tencent.mm.protocal.k.b
  {
    public arv gPm;
    
    b()
    {
      GMTrace.i(13182999461888L, 98221);
      this.gPm = new arv();
      GMTrace.o(13182999461888L, 98221);
    }
    
    public final byte[] Ba()
    {
      GMTrace.i(13183133679616L, 98222);
      byte[] arrayOfByte = this.gPm.toByteArray();
      GMTrace.o(13183133679616L, 98222);
      return arrayOfByte;
    }
    
    public final int Bb()
    {
      GMTrace.i(13183267897344L, 98223);
      GMTrace.o(13183267897344L, 98223);
      return 681;
    }
  }
  
  public static final class c
    extends k.e
    implements k.c
  {
    public arw gPn;
    
    public c()
    {
      GMTrace.i(13184744292352L, 98234);
      this.gPn = new arw();
      GMTrace.o(13184744292352L, 98234);
    }
    
    public final int y(byte[] paramArrayOfByte)
    {
      GMTrace.i(13184878510080L, 98235);
      this.gPn = ((arw)new arw().aD(paramArrayOfByte));
      int i = this.gPn.tST;
      GMTrace.o(13184878510080L, 98235);
      return i;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\av\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */