package com.tencent.mm.plugin.webview.model;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.aqp;
import com.tencent.mm.protocal.c.aqq;
import java.util.LinkedList;

public final class s
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  public final b fUa;
  private com.tencent.mm.ad.e fXo;
  public Object tag;
  
  public s(String paramString, int paramInt, LinkedList<String> paramLinkedList)
  {
    GMTrace.i(18180328128512L, 135454);
    Object localObject = new b.a();
    ((b.a)localObject).gtF = new aqp();
    ((b.a)localObject).gtG = new aqq();
    ((b.a)localObject).uri = "/cgi-bin/mmbiz-bin/oauth_authorize_confirm";
    ((b.a)localObject).gtE = 1373;
    ((b.a)localObject).gtH = 0;
    ((b.a)localObject).gtI = 0;
    this.fUa = ((b.a)localObject).DA();
    localObject = (aqp)this.fUa.gtC.gtK;
    ((aqp)localObject).uGP = paramString;
    ((aqp)localObject).uGQ = paramInt;
    ((aqp)localObject).uGR = paramLinkedList;
    GMTrace.o(18180328128512L, 135454);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(18180730781696L, 135457);
    this.fXo = parame1;
    int i = a(parame, this.fUa, this);
    GMTrace.o(18180730781696L, 135457);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(18180462346240L, 135455);
    this.fXo.a(paramInt2, paramInt3, paramString, this);
    GMTrace.o(18180462346240L, 135455);
  }
  
  public final int getType()
  {
    GMTrace.i(18180596563968L, 135456);
    GMTrace.o(18180596563968L, 135456);
    return 1373;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\webview\model\s.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */