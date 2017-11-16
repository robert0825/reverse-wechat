package com.tencent.mm.jsapi.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.ajm;
import com.tencent.mm.protocal.c.ajn;
import com.tencent.mm.protocal.c.bvc;
import com.tencent.mm.sdk.platformtools.w;
import java.util.LinkedList;

public final class a
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  private final b fUa;
  private com.tencent.mm.ad.e fXo;
  private a<a> fXp;
  
  private a(String paramString, LinkedList<String> paramLinkedList, int paramInt1, int paramInt2)
  {
    GMTrace.i(18722836185088L, 139496);
    w.i("MicroMsg.webview.NetSceneJSAuthorize", "NetSceneJSLogin doScene appId [%s], versionType [%d], extScene[%d]", new Object[] { paramString, Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    Object localObject = new b.a();
    ((b.a)localObject).gtF = new ajm();
    ((b.a)localObject).gtG = new ajn();
    ((b.a)localObject).uri = "/cgi-bin/mmbiz-bin/js-authorize";
    ((b.a)localObject).gtE = 1157;
    ((b.a)localObject).gtH = 0;
    ((b.a)localObject).gtI = 0;
    this.fUa = ((b.a)localObject).DA();
    localObject = (ajm)this.fUa.gtC.gtK;
    if (paramInt2 > 0)
    {
      ((ajm)localObject).uyu = new bvc();
      ((ajm)localObject).uyu.scene = paramInt2;
    }
    ((ajm)localObject).lQa = paramString;
    ((ajm)localObject).uyr = paramLinkedList;
    ((ajm)localObject).uyt = paramInt1;
    GMTrace.o(18722836185088L, 139496);
  }
  
  public a(String paramString, LinkedList<String> paramLinkedList, int paramInt1, int paramInt2, a<a> parama)
  {
    this(paramString, paramLinkedList, paramInt1, paramInt2);
    GMTrace.i(18722701967360L, 139495);
    this.fXp = parama;
    GMTrace.o(18722701967360L, 139495);
  }
  
  public a(String paramString, LinkedList<String> paramLinkedList, a<a> parama)
  {
    this(paramString, paramLinkedList, 0, -1, parama);
    GMTrace.i(18722567749632L, 139494);
    GMTrace.o(18722567749632L, 139494);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(18723373056000L, 139500);
    w.i("MicroMsg.webview.NetSceneJSAuthorize", "doScene");
    this.fXo = parame1;
    int i = a(parame, this.fUa, this);
    GMTrace.o(18723373056000L, 139500);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(18722970402816L, 139497);
    w.i("MicroMsg.webview.NetSceneJSAuthorize", "errType = %d, errCode = %d, errMsg = %s", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    if (this.fXo != null) {
      this.fXo.a(paramInt2, paramInt3, paramString, this);
    }
    if (this.fXp != null) {
      this.fXp.b(paramInt2, paramInt3, paramString, this);
    }
    GMTrace.o(18722970402816L, 139497);
  }
  
  public final int getType()
  {
    GMTrace.i(18723104620544L, 139498);
    GMTrace.o(18723104620544L, 139498);
    return 1157;
  }
  
  public final ajn wl()
  {
    GMTrace.i(18723238838272L, 139499);
    ajn localajn = (ajn)this.fUa.gtD.gtK;
    GMTrace.o(18723238838272L, 139499);
    return localajn;
  }
  
  public static abstract interface a<T extends com.tencent.mm.ad.k>
  {
    public abstract void b(int paramInt1, int paramInt2, String paramString, T paramT);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\jsapi\a\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */