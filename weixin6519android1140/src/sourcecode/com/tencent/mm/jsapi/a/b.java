package com.tencent.mm.jsapi.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.ajk;
import com.tencent.mm.protocal.c.ajl;
import com.tencent.mm.protocal.c.bvc;
import com.tencent.mm.sdk.platformtools.w;
import java.util.LinkedList;

public final class b
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  private final com.tencent.mm.ad.b fUa;
  private com.tencent.mm.ad.e fXo;
  private a<b> fXq;
  
  private b(String paramString, LinkedList<String> paramLinkedList, int paramInt1, int paramInt2, int paramInt3)
  {
    GMTrace.i(18721896660992L, 139489);
    w.i("MicroMsg.webview.NetSceneJSAuthorizeConfirm", "NetSceneJSLogin doScene appId [%s], versionType [%d], opt [%d], extScene [%d]", new Object[] { paramString, Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    Object localObject = new com.tencent.mm.ad.b.a();
    ((com.tencent.mm.ad.b.a)localObject).gtF = new ajk();
    ((com.tencent.mm.ad.b.a)localObject).gtG = new ajl();
    ((com.tencent.mm.ad.b.a)localObject).uri = "/cgi-bin/mmbiz-bin/js-authorize-confirm";
    ((com.tencent.mm.ad.b.a)localObject).gtE = 1158;
    ((com.tencent.mm.ad.b.a)localObject).gtH = 0;
    ((com.tencent.mm.ad.b.a)localObject).gtI = 0;
    this.fUa = ((com.tencent.mm.ad.b.a)localObject).DA();
    localObject = (ajk)this.fUa.gtC.gtK;
    if (paramInt3 > 0)
    {
      ((ajk)localObject).uyu = new bvc();
      ((ajk)localObject).uyu.scene = paramInt3;
    }
    ((ajk)localObject).lQa = paramString;
    ((ajk)localObject).uyr = paramLinkedList;
    ((ajk)localObject).uyt = paramInt1;
    ((ajk)localObject).uys = paramInt2;
    GMTrace.o(18721896660992L, 139489);
  }
  
  public b(String paramString, LinkedList<String> paramLinkedList, int paramInt1, int paramInt2, int paramInt3, a<b> parama)
  {
    this(paramString, paramLinkedList, paramInt1, paramInt2, paramInt3);
    GMTrace.i(18721628225536L, 139487);
    this.fXq = parama;
    GMTrace.o(18721628225536L, 139487);
  }
  
  public b(String paramString, LinkedList<String> paramLinkedList, int paramInt1, int paramInt2, a<b> parama)
  {
    this(paramString, paramLinkedList, 0, paramInt2, -1, parama);
    GMTrace.i(18721762443264L, 139488);
    GMTrace.o(18721762443264L, 139488);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(18722433531904L, 139493);
    w.i("MicroMsg.webview.NetSceneJSAuthorizeConfirm", "doScene");
    this.fXo = parame1;
    int i = a(parame, this.fUa, this);
    GMTrace.o(18722433531904L, 139493);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(18722030878720L, 139490);
    w.i("MicroMsg.webview.NetSceneJSAuthorizeConfirm", "errType = %d, errCode = %d, errMsg = %s", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    if (this.fXo != null) {
      this.fXo.a(paramInt2, paramInt3, paramString, this);
    }
    if (this.fXq != null) {
      this.fXq.b(paramInt2, paramInt3, paramString, this);
    }
    GMTrace.o(18722030878720L, 139490);
  }
  
  public final int getType()
  {
    GMTrace.i(18722165096448L, 139491);
    GMTrace.o(18722165096448L, 139491);
    return 1158;
  }
  
  public final ajl wm()
  {
    GMTrace.i(18722299314176L, 139492);
    ajl localajl = (ajl)this.fUa.gtD.gtK;
    GMTrace.o(18722299314176L, 139492);
    return localajl;
  }
  
  public static abstract interface a<T extends com.tencent.mm.ad.k>
  {
    public abstract void b(int paramInt1, int paramInt2, String paramString, T paramT);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\jsapi\a\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */