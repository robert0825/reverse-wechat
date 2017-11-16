package com.tencent.mm.modelsimple;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.bju;
import com.tencent.mm.protocal.c.bjv;
import com.tencent.mm.protocal.c.ci;
import com.tencent.mm.sdk.platformtools.w;
import java.util.LinkedList;

public final class ai
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  private final b fUa;
  private com.tencent.mm.ad.e fUd;
  
  public ai(String paramString, int paramInt, LinkedList<ci> paramLinkedList)
  {
    GMTrace.i(1344861634560L, 10020);
    w.i("MicroMsg.NetSceneTranslateLink", "ticket link = " + paramString + "; scene = " + paramInt);
    Object localObject = new b.a();
    ((b.a)localObject).gtF = new bju();
    ((b.a)localObject).gtG = new bjv();
    ((b.a)localObject).uri = "/cgi-bin/mmbiz-bin/translatelink";
    ((b.a)localObject).gtE = 1200;
    ((b.a)localObject).gtH = 0;
    ((b.a)localObject).gtI = 0;
    this.fUa = ((b.a)localObject).DA();
    localObject = (bju)this.fUa.gtC.gtK;
    ((bju)localObject).gVf = paramString;
    ((bju)localObject).scene = paramInt;
    ((bju)localObject).uUH = paramLinkedList;
    GMTrace.o(1344861634560L, 10020);
  }
  
  public final String LL()
  {
    GMTrace.i(1345398505472L, 10024);
    Object localObject = (bjv)this.fUa.gtD.gtK;
    if (localObject == null)
    {
      GMTrace.o(1345398505472L, 10024);
      return null;
    }
    localObject = ((bjv)localObject).uUI;
    GMTrace.o(1345398505472L, 10024);
    return (String)localObject;
  }
  
  public final bjv LM()
  {
    GMTrace.i(1345532723200L, 10025);
    if ((this.fUa != null) && (this.fUa.gtD.gtK != null))
    {
      bjv localbjv = (bjv)this.fUa.gtD.gtK;
      GMTrace.o(1345532723200L, 10025);
      return localbjv;
    }
    GMTrace.o(1345532723200L, 10025);
    return null;
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(1345130070016L, 10022);
    this.fUd = parame1;
    int i = a(parame, this.fUa, this);
    GMTrace.o(1345130070016L, 10022);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(1345264287744L, 10023);
    w.d("MicroMsg.NetSceneTranslateLink", "swap deep link with ticket onGYNetEnd:[%d,%d,%s]", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    this.fUd.a(paramInt2, paramInt3, paramString, this);
    GMTrace.o(1345264287744L, 10023);
  }
  
  public final int getType()
  {
    GMTrace.i(1344995852288L, 10021);
    GMTrace.o(1344995852288L, 10021);
    return 1200;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\modelsimple\ai.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */