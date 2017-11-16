package com.tencent.mm.plugin.subapp.c;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.arf;
import com.tencent.mm.protocal.c.arg;
import com.tencent.mm.protocal.c.bnx;
import java.util.LinkedList;

public final class a
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  private b fUa;
  private com.tencent.mm.ad.e fUd;
  
  public a(LinkedList<bnx> paramLinkedList, int paramInt)
  {
    GMTrace.i(5844645183488L, 43546);
    Object localObject = new b.a();
    ((b.a)localObject).gtF = new arf();
    ((b.a)localObject).gtG = new arg();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/opvoicereminder";
    ((b.a)localObject).gtE = 331;
    ((b.a)localObject).gtH = 150;
    ((b.a)localObject).gtI = 1000000150;
    this.fUa = ((b.a)localObject).DA();
    localObject = (arf)this.fUa.gtC.gtK;
    ((arf)localObject).tMX = 1;
    ((arf)localObject).uHs = paramLinkedList;
    ((arf)localObject).uHr = paramInt;
    GMTrace.o(5844645183488L, 43546);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(5844779401216L, 43547);
    this.fUd = parame1;
    int i = a(parame, this.fUa, this);
    GMTrace.o(5844779401216L, 43547);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(5845047836672L, 43549);
    this.fUd.a(paramInt2, paramInt3, paramString, this);
    GMTrace.o(5845047836672L, 43549);
  }
  
  public final int getType()
  {
    GMTrace.i(5844913618944L, 43548);
    GMTrace.o(5844913618944L, 43548);
    return 331;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\subapp\c\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */