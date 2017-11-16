package com.tencent.mm.modelsimple;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ac.h;
import com.tencent.mm.ac.i;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.azq;
import com.tencent.mm.protocal.c.bai;
import com.tencent.mm.protocal.c.baj;
import com.tencent.mm.protocal.c.bak;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.g;
import com.tencent.mm.y.at;
import com.tencent.mm.y.c;
import java.util.Iterator;
import java.util.LinkedList;

public final class ab
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  private final b fUa;
  private com.tencent.mm.ad.e fUd;
  public final boolean gVh;
  
  public ab(String paramString)
  {
    this(paramString, 0);
    GMTrace.i(1338419183616L, 9972);
    GMTrace.o(1338419183616L, 9972);
  }
  
  public ab(String paramString, int paramInt)
  {
    this(paramString, paramInt, (byte)0);
    GMTrace.i(1338553401344L, 9973);
    GMTrace.o(1338553401344L, 9973);
  }
  
  private ab(String paramString, int paramInt, byte paramByte)
  {
    this(paramString, 1, paramInt, false);
    GMTrace.i(1338687619072L, 9974);
    GMTrace.o(1338687619072L, 9974);
  }
  
  public ab(String paramString, int paramInt1, int paramInt2, boolean paramBoolean)
  {
    GMTrace.i(1338821836800L, 9975);
    this.gVh = paramBoolean;
    Object localObject = new b.a();
    ((b.a)localObject).gtF = new baj();
    ((b.a)localObject).gtG = new bak();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/searchcontact";
    ((b.a)localObject).gtE = 106;
    ((b.a)localObject).gtH = 34;
    ((b.a)localObject).gtI = 1000000034;
    this.fUa = ((b.a)localObject).DA();
    w.d("MicroMsg.NetSceneSearchContact", "search username [%s]", new Object[] { paramString });
    localObject = (baj)this.fUa.gtC.gtK;
    ((baj)localObject).ufy = new azq().Rq(paramString);
    ((baj)localObject).uJH = paramInt1;
    ((baj)localObject).uOf = paramInt2;
    GMTrace.o(1338821836800L, 9975);
  }
  
  public final bak LK()
  {
    GMTrace.i(1339358707712L, 9979);
    bak localbak = (bak)this.fUa.gtD.gtK;
    if (localbak != null)
    {
      Iterator localIterator = localbak.uql.iterator();
      while (localIterator.hasNext())
      {
        bai localbai = (bai)localIterator.next();
        at.AR();
        c.zu().fd(localbai.ufy.uNR, localbai.uoe);
      }
    }
    GMTrace.o(1339358707712L, 9979);
    return localbak;
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(1338956054528L, 9976);
    this.fUd = parame1;
    int i = a(parame, this.fUa, this);
    GMTrace.o(1338956054528L, 9976);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(1339224489984L, 9978);
    paramq = (bak)this.fUa.gtD.gtK;
    if ((paramq != null) && (paramq.uqk > 0)) {
      paramq = paramq.uql.iterator();
    }
    while (paramq.hasNext())
    {
      paramArrayOfByte = (bai)paramq.next();
      w.d("MicroMsg.NetSceneSearchContact", "search RES username [%s]", new Object[] { paramArrayOfByte.ufy });
      h localh = new h();
      localh.username = com.tencent.mm.platformtools.n.a(paramArrayOfByte.ufy);
      localh.gsU = paramArrayOfByte.ubV;
      localh.gsT = paramArrayOfByte.ubW;
      localh.eQl = -1;
      w.d("MicroMsg.NetSceneSearchContact", "dkhurl search %s b[%s] s[%s]", new Object[] { localh.getUsername(), localh.Do(), localh.Dp() });
      localh.fiZ = 3;
      localh.bi(true);
      com.tencent.mm.ac.n.Di().a(localh);
      continue;
      if ((paramq != null) && (!bg.nm(com.tencent.mm.platformtools.n.a(paramq.ufy))))
      {
        paramArrayOfByte = com.tencent.mm.platformtools.n.a(paramq.ufy);
        localh = new h();
        localh.username = paramArrayOfByte;
        localh.gsU = paramq.ubV;
        localh.gsT = paramq.ubW;
        localh.eQl = -1;
        w.d("MicroMsg.NetSceneSearchContact", "dkhurl search %s b[%s] s[%s]", new Object[] { localh.getUsername(), localh.Do(), localh.Dp() });
        localh.fiZ = 3;
        localh.bi(true);
        com.tencent.mm.ac.n.Di().a(localh);
      }
    }
    this.fUd.a(paramInt2, paramInt3, paramString, this);
    GMTrace.o(1339224489984L, 9978);
  }
  
  public final int getType()
  {
    GMTrace.i(1339090272256L, 9977);
    GMTrace.o(1339090272256L, 9977);
    return 106;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\modelsimple\ab.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */