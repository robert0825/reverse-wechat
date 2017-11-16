package com.tencent.mm.plugin.pwdgroup.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ac.h;
import com.tencent.mm.ac.i;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.tc;
import com.tencent.mm.protocal.c.td;
import com.tencent.mm.protocal.c.te;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public final class a
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  private b fUa;
  private com.tencent.mm.ad.e fUd;
  public int nPp;
  
  public a(int paramInt1, String paramString1, String paramString2, float paramFloat1, float paramFloat2, int paramInt2, int paramInt3, String paramString3, String paramString4)
  {
    GMTrace.i(10691247341568L, 79656);
    Object localObject = new b.a();
    ((b.a)localObject).gtF = new tc();
    ((b.a)localObject).gtG = new td();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/mmfacingcreatechatroom";
    ((b.a)localObject).gtE = 653;
    ((b.a)localObject).gtH = 0;
    ((b.a)localObject).gtI = 0;
    this.fUa = ((b.a)localObject).DA();
    localObject = (tc)this.fUa.gtC.gtK;
    this.nPp = paramInt1;
    ((tc)localObject).tMX = paramInt1;
    ((tc)localObject).uja = paramString1;
    ((tc)localObject).ugx = paramString2;
    ((tc)localObject).tYy = paramFloat2;
    ((tc)localObject).tYz = paramFloat1;
    ((tc)localObject).ujb = paramInt2;
    if (!bg.nm(paramString3)) {
      ((tc)localObject).ujc = paramString3;
    }
    if (!bg.nm(paramString4)) {
      ((tc)localObject).ujd = paramString4;
    }
    ((tc)localObject).uje = paramInt3;
    w.d("MicroMsg.Facing.NetSceneFacingCreateChatRoom", "OpCode:%d, Ticket:%s, Longitude:%f, Latitude:%f, Precision:%d, MackAddr:%s, CellId:%s, GPSSource:%d", new Object[] { Integer.valueOf(paramInt1), paramString2, Float.valueOf(paramFloat2), Float.valueOf(paramFloat1), Integer.valueOf(paramInt2), paramString3, paramString4, Integer.valueOf(paramInt3) });
    com.tencent.mm.modelstat.n.a(2007, paramFloat2, paramFloat1, paramInt2);
    GMTrace.o(10691247341568L, 79656);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(10691381559296L, 79657);
    this.fUd = parame1;
    int i = a(parame, this.fUa, this);
    GMTrace.o(10691381559296L, 79657);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(10691515777024L, 79658);
    w.d("MicroMsg.Facing.NetSceneFacingCreateChatRoom", "netId:%d errType:%d errCode:%d errMsg:%s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    if (this.nPp == 0)
    {
      paramq = aXZ();
      if (paramq != null)
      {
        paramq = paramq.tPE;
        if (paramq != null)
        {
          long l = System.currentTimeMillis();
          int i = paramq.size();
          paramArrayOfByte = new ArrayList();
          paramInt1 = 0;
          if (paramInt1 < i)
          {
            te localte = (te)paramq.get(paramInt1);
            h localh = new h();
            if (!bg.nm(localte.jhi)) {}
            for (localh.username = localte.jhi;; localh.username = localte.ujf)
            {
              w.d("MicroMsg.Facing.NetSceneFacingCreateChatRoom", "cpan[onGYNetEnd]UserName:%s SmallImgUrl:%s", new Object[] { localte.jhi, localte.uhb });
              localh.gsT = localte.uhb;
              localh.bi(true);
              paramArrayOfByte.add(localh);
              paramInt1 += 1;
              break;
            }
          }
          com.tencent.mm.ac.n.Di().A(paramArrayOfByte);
          w.d("MicroMsg.Facing.NetSceneFacingCreateChatRoom", "use time:%s", new Object[] { System.currentTimeMillis() - l });
        }
      }
    }
    this.fUd.a(paramInt2, paramInt3, paramString, this);
    GMTrace.o(10691515777024L, 79658);
  }
  
  public final td aXZ()
  {
    GMTrace.i(10691784212480L, 79660);
    td localtd = (td)this.fUa.gtD.gtK;
    GMTrace.o(10691784212480L, 79660);
    return localtd;
  }
  
  public final int getType()
  {
    GMTrace.i(15569793318912L, 116004);
    GMTrace.o(15569793318912L, 116004);
    return 653;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\pwdgroup\a\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */