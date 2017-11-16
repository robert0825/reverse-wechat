package com.tencent.mm.modelfriend;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ac.h;
import com.tencent.mm.ac.i;
import com.tencent.mm.ac.n;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.aly;
import com.tencent.mm.protocal.c.alz;
import com.tencent.mm.protocal.c.ama;
import com.tencent.mm.protocal.c.azq;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.af.a;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.g;
import com.tencent.mm.y.at;
import com.tencent.mm.y.c;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class y
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  private final b fUa;
  private com.tencent.mm.ad.e fUd;
  
  public y(String paramString, List<String[]> paramList)
  {
    GMTrace.i(4455760134144L, 33198);
    this.fUd = null;
    Object localObject = new b.a();
    ((b.a)localObject).gtF = new alz();
    ((b.a)localObject).gtG = new ama();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/listmfriend";
    ((b.a)localObject).gtE = 431;
    ((b.a)localObject).gtH = 0;
    ((b.a)localObject).gtI = 0;
    this.fUa = ((b.a)localObject).DA();
    localObject = (alz)this.fUa.gtC.gtK;
    ((alz)localObject).ugx = paramString;
    ((alz)localObject).uAS = 0;
    if (paramList == null) {}
    for (;;)
    {
      ((alz)localObject).uAQ = i;
      ((alz)localObject).uAT = new LinkedList();
      ((alz)localObject).uAR = new LinkedList();
      if (paramList == null) {
        break;
      }
      paramString = paramList.iterator();
      while (paramString.hasNext())
      {
        paramList = (String[])paramString.next();
        if (!bg.nm(paramList[2])) {
          ((alz)localObject).uAR.add(new azq().Rq(paramList[2]));
        }
      }
      i = paramList.size();
    }
    GMTrace.o(4455760134144L, 33198);
  }
  
  public final LinkedList<aly> HR()
  {
    GMTrace.i(4456028569600L, 33200);
    Object localObject = ((ama)this.fUa.gtD.gtK).uAU;
    if (localObject != null)
    {
      localObject = ((LinkedList)localObject).iterator();
      while (((Iterator)localObject).hasNext())
      {
        aly localaly = (aly)((Iterator)localObject).next();
        at.AR();
        c.zu().fd(localaly.jhi, localaly.uoe);
      }
    }
    localObject = ((ama)this.fUa.gtD.gtK).uAU;
    GMTrace.o(4456028569600L, 33200);
    return (LinkedList<aly>)localObject;
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(4455894351872L, 33199);
    this.fUd = parame1;
    int i = a(parame, this.fUa, this);
    GMTrace.o(4455894351872L, 33199);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, final q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(4456297005056L, 33202);
    paramq = (ama)this.fUa.gtD.gtK;
    at.xB().a(new af.a()
    {
      public final boolean Dj()
      {
        GMTrace.i(4447304417280L, 33135);
        if ((paramq != null) && (paramq.uAU.size() > 0))
        {
          Iterator localIterator = paramq.uAU.iterator();
          while (localIterator.hasNext())
          {
            aly localaly = (aly)localIterator.next();
            if (localaly.jhA == 1)
            {
              h localh = new h();
              localh.username = localaly.jhi;
              localh.gsU = localaly.ubV;
              localh.gsT = localaly.ubW;
              localh.eQl = -1;
              w.d("MicroMsg.NetSceneListMFriend", "getmlist  %s b[%s] s[%s]", new Object[] { localh.getUsername(), localh.Do(), localh.Dp() });
              localh.fiZ = 3;
              localh.bi(true);
              n.Di().a(localh);
            }
          }
        }
        GMTrace.o(4447304417280L, 33135);
        return true;
      }
      
      public final boolean Dk()
      {
        GMTrace.i(4447170199552L, 33134);
        GMTrace.o(4447170199552L, 33134);
        return false;
      }
      
      public final String toString()
      {
        GMTrace.i(4447438635008L, 33136);
        String str = super.toString() + "|onGYNetEnd";
        GMTrace.o(4447438635008L, 33136);
        return str;
      }
    });
    this.fUd.a(paramInt2, paramInt3, paramString, this);
    GMTrace.o(4456297005056L, 33202);
  }
  
  public final int getType()
  {
    GMTrace.i(4456162787328L, 33201);
    GMTrace.o(4456162787328L, 33201);
    return 431;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\modelfriend\y.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */