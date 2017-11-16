package com.tencent.mm.plugin.webview.model;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.bac;
import com.tencent.mm.protocal.c.bad;
import java.util.LinkedList;

public final class u
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  public final b fUa;
  private com.tencent.mm.ad.e fXo;
  
  public u(int paramInt, String paramString1, String paramString2, String paramString3, LinkedList<String> paramLinkedList)
  {
    GMTrace.i(18176570032128L, 135426);
    Object localObject = new b.a();
    ((b.a)localObject).gtF = new bac();
    ((b.a)localObject).gtG = new bad();
    ((b.a)localObject).uri = "/cgi-bin/mmbiz-bin/sdk_oauth_authorize_confirm ";
    ((b.a)localObject).gtE = 1346;
    ((b.a)localObject).gtH = 0;
    ((b.a)localObject).gtI = 0;
    this.fUa = ((b.a)localObject).DA();
    localObject = (bac)this.fUa.gtC.gtK;
    ((bac)localObject).uGQ = paramInt;
    ((bac)localObject).eSd = paramString1;
    ((bac)localObject).uGR = paramLinkedList;
    ((bac)localObject).state = paramString2;
    ((bac)localObject).uOc = paramString3;
    GMTrace.o(18176570032128L, 135426);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(18176972685312L, 135429);
    this.fXo = parame1;
    int i = a(parame, this.fUa, this);
    GMTrace.o(18176972685312L, 135429);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(18176704249856L, 135427);
    this.fXo.a(paramInt2, paramInt3, paramString, this);
    GMTrace.o(18176704249856L, 135427);
  }
  
  public final int getType()
  {
    GMTrace.i(18176838467584L, 135428);
    GMTrace.o(18176838467584L, 135428);
    return 1346;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\webview\model\u.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */