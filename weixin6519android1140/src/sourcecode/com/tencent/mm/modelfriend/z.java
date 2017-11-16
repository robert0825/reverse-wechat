package com.tencent.mm.modelfriend;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.azq;
import com.tencent.mm.protocal.c.bbx;
import com.tencent.mm.protocal.c.bby;
import com.tencent.mm.sdk.platformtools.bg;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class z
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  private final b fUa;
  private com.tencent.mm.ad.e fUd;
  
  public z(String paramString, List<String> paramList)
  {
    GMTrace.i(4435761692672L, 33049);
    this.fUd = null;
    Object localObject = new b.a();
    ((b.a)localObject).gtF = new bbx();
    ((b.a)localObject).gtG = new bby();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/sendsmstomfriend";
    ((b.a)localObject).gtE = 432;
    ((b.a)localObject).gtH = 0;
    ((b.a)localObject).gtI = 0;
    this.fUa = ((b.a)localObject).DA();
    localObject = (bbx)this.fUa.gtC.gtK;
    ((bbx)localObject).ugx = paramString;
    ((bbx)localObject).uAR = new LinkedList();
    ((bbx)localObject).uAQ = paramList.size();
    paramString = paramList.iterator();
    while (paramString.hasNext())
    {
      paramList = (String)paramString.next();
      if (!bg.nm(paramList)) {
        ((bbx)localObject).uAR.add(new azq().Rq(paramList));
      }
    }
    GMTrace.o(4435761692672L, 33049);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(4435895910400L, 33050);
    this.fUd = parame1;
    int i = a(parame, this.fUa, this);
    GMTrace.o(4435895910400L, 33050);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(4436164345856L, 33052);
    this.fUd.a(paramInt2, paramInt3, paramString, this);
    GMTrace.o(4436164345856L, 33052);
  }
  
  public final int getType()
  {
    GMTrace.i(4436030128128L, 33051);
    GMTrace.o(4436030128128L, 33051);
    return 432;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\modelfriend\z.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */