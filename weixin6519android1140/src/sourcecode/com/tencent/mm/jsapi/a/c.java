package com.tencent.mm.jsapi.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.ajq;
import com.tencent.mm.protocal.c.ajr;
import com.tencent.mm.protocal.c.bvc;
import com.tencent.mm.sdk.platformtools.w;
import java.util.LinkedList;

public final class c
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  private final b fUa;
  private com.tencent.mm.ad.e fXo;
  private a<c> fXr;
  
  private c(String paramString1, LinkedList<String> paramLinkedList, int paramInt1, String paramString2, String paramString3, int paramInt2, int paramInt3)
  {
    GMTrace.i(18725252104192L, 139514);
    w.i("MicroMsg.webview.NetSceneJSLogin", "NetSceneJSLogin doScene appId [%s], loginType [%d], url [%s], state [%s], versionType [%d], extScene [%d]", new Object[] { paramString1, Integer.valueOf(paramInt1), paramString2, paramString3, Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    Object localObject = new b.a();
    ((b.a)localObject).gtF = new ajq();
    ((b.a)localObject).gtG = new ajr();
    ((b.a)localObject).uri = "/cgi-bin/mmbiz-bin/js-login";
    ((b.a)localObject).gtE = 1029;
    ((b.a)localObject).gtH = 0;
    ((b.a)localObject).gtI = 0;
    this.fUa = ((b.a)localObject).DA();
    localObject = (ajq)this.fUa.gtC.gtK;
    ((ajq)localObject).lQa = paramString1;
    ((ajq)localObject).uyr = paramLinkedList;
    ((ajq)localObject).uyw = paramInt1;
    ((ajq)localObject).lPM = paramString2;
    ((ajq)localObject).uyx = paramString3;
    ((ajq)localObject).uyt = paramInt2;
    if (paramInt3 > 0)
    {
      ((ajq)localObject).uyu = new bvc();
      ((ajq)localObject).uyu.scene = paramInt3;
    }
    GMTrace.o(18725252104192L, 139514);
  }
  
  public c(String paramString1, LinkedList<String> paramLinkedList, int paramInt1, String paramString2, String paramString3, int paramInt2, int paramInt3, a<c> parama)
  {
    this(paramString1, paramLinkedList, paramInt1, paramString2, paramString3, paramInt2, paramInt3);
    GMTrace.i(18725117886464L, 139513);
    this.fXr = parama;
    GMTrace.o(18725117886464L, 139513);
  }
  
  public c(String paramString1, LinkedList<String> paramLinkedList, String paramString2, String paramString3, a<c> parama)
  {
    this(paramString1, paramLinkedList, 0, paramString2, paramString3, 0, -1, parama);
    GMTrace.i(18724983668736L, 139512);
    GMTrace.o(18724983668736L, 139512);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(18725788975104L, 139518);
    w.i("MicroMsg.webview.NetSceneJSLogin", "doScene");
    this.fXo = parame1;
    int i = a(parame, this.fUa, this);
    GMTrace.o(18725788975104L, 139518);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(18725386321920L, 139515);
    w.i("MicroMsg.webview.NetSceneJSLogin", "errType = %d, errCode = %d, errMsg = %s", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    if (this.fXo != null) {
      this.fXo.a(paramInt2, paramInt3, paramString, this);
    }
    if (this.fXr != null) {
      this.fXr.b(paramInt2, paramInt3, paramString, this);
    }
    GMTrace.o(18725386321920L, 139515);
  }
  
  public final int getType()
  {
    GMTrace.i(18725520539648L, 139516);
    GMTrace.o(18725520539648L, 139516);
    return 1029;
  }
  
  public final ajr wn()
  {
    GMTrace.i(18725654757376L, 139517);
    ajr localajr = (ajr)this.fUa.gtD.gtK;
    GMTrace.o(18725654757376L, 139517);
    return localajr;
  }
  
  public static abstract interface a<T extends com.tencent.mm.ad.k>
  {
    public abstract void b(int paramInt1, int paramInt2, String paramString, T paramT);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\jsapi\a\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */