package com.tencent.mm.an;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.air;
import com.tencent.mm.protocal.c.ais;
import com.tencent.mm.protocal.c.ait;
import com.tencent.mm.sdk.platformtools.w;
import java.util.ArrayList;
import java.util.LinkedList;

public final class b
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  private final com.tencent.mm.ad.b fUa;
  private com.tencent.mm.ad.e fUd;
  private LinkedList<air> gGd;
  public String gGe;
  
  public b(ArrayList<String> paramArrayList)
  {
    GMTrace.i(1531826929664L, 11413);
    Object localObject = new b.a();
    ((b.a)localObject).gtF = new ais();
    ((b.a)localObject).gtG = new ait();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/invitegooglecontact";
    ((b.a)localObject).gtE = 489;
    ((b.a)localObject).gtH = 0;
    ((b.a)localObject).gtI = 0;
    this.fUa = ((b.a)localObject).DA();
    this.gGd = new LinkedList();
    if (paramArrayList.size() > 0)
    {
      int i = 0;
      while (i < paramArrayList.size())
      {
        localObject = new air();
        ((air)localObject).tUq = ((String)paramArrayList.get(i));
        this.gGd.add(localObject);
        i += 1;
      }
    }
    GMTrace.o(1531826929664L, 11413);
  }
  
  public final ait IB()
  {
    GMTrace.i(1532229582848L, 11416);
    ait localait = (ait)this.fUa.gtD.gtK;
    GMTrace.o(1532229582848L, 11416);
    return localait;
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(1531961147392L, 11414);
    w.i("MicroMsg.GoogleContact.NetSceneInviteGoogleContact", "doScene");
    this.fUd = parame1;
    parame1 = (ais)this.fUa.gtC.gtK;
    parame1.jhc = this.gGd.size();
    parame1.jhd = this.gGd;
    int i = a(parame, this.fUa, this);
    GMTrace.o(1531961147392L, 11414);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(1532095365120L, 11415);
    w.i("MicroMsg.GoogleContact.NetSceneInviteGoogleContact", "NetId:%d, ErrType:%d, ErrCode:%d, errMsg:%s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    if ((paramInt2 != 0) || (paramInt3 != 0))
    {
      this.fUd.a(paramInt2, paramInt3, paramString, this);
      GMTrace.o(1532095365120L, 11415);
      return;
    }
    this.fUd.a(paramInt2, paramInt3, paramString, this);
    GMTrace.o(1532095365120L, 11415);
  }
  
  public final int getType()
  {
    GMTrace.i(1532363800576L, 11417);
    GMTrace.o(1532363800576L, 11417);
    return 489;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\an\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */