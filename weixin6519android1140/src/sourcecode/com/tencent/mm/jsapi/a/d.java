package com.tencent.mm.jsapi.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.ajo;
import com.tencent.mm.protocal.c.ajp;
import com.tencent.mm.protocal.c.bvc;
import com.tencent.mm.sdk.platformtools.w;
import java.util.LinkedList;

public final class d
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  private final b fUa;
  private com.tencent.mm.ad.e fXo;
  private a<d> fXs;
  
  private d(String paramString1, LinkedList<String> paramLinkedList, int paramInt1, String paramString2, int paramInt2, int paramInt3, int paramInt4)
  {
    GMTrace.i(18724312580096L, 139507);
    w.i("MicroMsg.webview.NetSceneJSLoginConfirm", "NetSceneJSLogin doScene appId [%s], login_type [%d], state [%s], versionType [%d], opt [%d], extScene [%d]", new Object[] { paramString1, Integer.valueOf(paramInt1), paramString2, Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), Integer.valueOf(paramInt4) });
    Object localObject = new b.a();
    ((b.a)localObject).gtF = new ajo();
    ((b.a)localObject).gtG = new ajp();
    ((b.a)localObject).uri = "/cgi-bin/mmbiz-bin/js-login-confirm";
    ((b.a)localObject).gtE = 1117;
    ((b.a)localObject).gtH = 0;
    ((b.a)localObject).gtI = 0;
    this.fUa = ((b.a)localObject).DA();
    localObject = (ajo)this.fUa.gtC.gtK;
    if (paramInt4 > 0)
    {
      ((ajo)localObject).uyu = new bvc();
      ((ajo)localObject).uyu.scene = paramInt4;
    }
    ((ajo)localObject).lQa = paramString1;
    ((ajo)localObject).uyr = paramLinkedList;
    ((ajo)localObject).uyw = paramInt1;
    ((ajo)localObject).uyx = paramString2;
    ((ajo)localObject).uyt = paramInt2;
    ((ajo)localObject).uys = paramInt3;
    GMTrace.o(18724312580096L, 139507);
  }
  
  public d(String paramString1, LinkedList<String> paramLinkedList, int paramInt1, String paramString2, int paramInt2, int paramInt3, int paramInt4, a<d> parama)
  {
    this(paramString1, paramLinkedList, paramInt1, paramString2, paramInt2, paramInt3, paramInt4);
    GMTrace.i(18724178362368L, 139506);
    this.fXs = parama;
    GMTrace.o(18724178362368L, 139506);
  }
  
  public d(String paramString1, LinkedList<String> paramLinkedList, int paramInt1, String paramString2, int paramInt2, int paramInt3, a<d> parama)
  {
    this(paramString1, paramLinkedList, 0, paramString2, 0, paramInt3, -1, parama);
    GMTrace.i(18724044144640L, 139505);
    GMTrace.o(18724044144640L, 139505);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(18724849451008L, 139511);
    w.i("MicroMsg.webview.NetSceneJSLoginConfirm", "doScene");
    this.fXo = parame1;
    int i = a(parame, this.fUa, this);
    GMTrace.o(18724849451008L, 139511);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(18724446797824L, 139508);
    w.i("MicroMsg.webview.NetSceneJSLoginConfirm", "errType = %d, errCode = %d, errMsg = %s", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    if (this.fXo != null) {
      this.fXo.a(paramInt2, paramInt3, paramString, this);
    }
    if (this.fXs != null) {
      this.fXs.b(paramInt2, paramInt3, paramString, this);
    }
    GMTrace.o(18724446797824L, 139508);
  }
  
  public final int getType()
  {
    GMTrace.i(18724581015552L, 139509);
    GMTrace.o(18724581015552L, 139509);
    return 1117;
  }
  
  public final ajp wo()
  {
    GMTrace.i(18724715233280L, 139510);
    ajp localajp = (ajp)this.fUa.gtD.gtK;
    GMTrace.o(18724715233280L, 139510);
    return localajp;
  }
  
  public static abstract interface a<T extends com.tencent.mm.ad.k>
  {
    public abstract void b(int paramInt1, int paramInt2, String paramString, T paramT);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\jsapi\a\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */