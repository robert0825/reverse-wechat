package com.tencent.mm.plugin.webview.fts;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.az.e.b;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.btj;
import com.tencent.mm.protocal.c.btm;
import com.tencent.mm.protocal.c.btn;
import com.tencent.mm.protocal.c.bvf;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.io.IOException;
import java.net.URLDecoder;
import java.util.LinkedList;
import org.json.JSONArray;

public final class k
  extends com.tencent.mm.az.b
  implements com.tencent.mm.network.k
{
  private com.tencent.mm.ad.e fUd;
  private com.tencent.mm.ad.b gMj;
  e.b rBV;
  private btn rCI;
  
  public k(e.b paramb)
  {
    GMTrace.i(14450685902848L, 107666);
    this.rBV = paramb;
    this.gRc = paramb.eBj;
    this.gRb = paramb.scene;
    this.gQZ = paramb.eQd;
    Object localObject;
    if (!bg.nm(paramb.eBj))
    {
      w.i("MicroMsg.FTS.NetSceneWebSuggest", "Constructors: query=%s", new Object[] { paramb.eBj });
      localObject = new b.a();
      ((b.a)localObject).gtE = 1161;
      ((b.a)localObject).uri = "/cgi-bin/mmsearch-bin/searchsuggestion";
      ((b.a)localObject).gtF = new btm();
      ((b.a)localObject).gtG = new btn();
      this.gMj = ((b.a)localObject).DA();
      localObject = (btm)this.gMj.gtC.gtK;
      ((btm)localObject).unf = paramb.eBj;
      ((btm)localObject).tXu = paramb.gRj;
      ((btm)localObject).vaT = com.tencent.mm.az.e.GL();
      ((btm)localObject).uMX = paramb.gRi;
      ((btm)localObject).uBS = com.tencent.mm.az.e.CO();
      ((btm)localObject).tOG = paramb.scene;
      ((btm)localObject).vaX = com.tencent.mm.az.e.gN(paramb.scene);
      if (paramb.gRA == null) {}
    }
    try
    {
      ((btm)localObject).vcm = new com.tencent.mm.bm.b(paramb.gRA.toByteArray());
      if (paramb.gRz != null) {}
      try
      {
        ((btm)localObject).vcl = new com.tencent.mm.bm.b(paramb.gRz.toByteArray());
        int i;
        try
        {
          JSONArray localJSONArray = new JSONArray(paramb.gRr);
          ((btm)localObject).vcj = new LinkedList();
          i = 0;
          while (i < localJSONArray.length())
          {
            String str = URLDecoder.decode(localJSONArray.getString(i), "UTF-8");
            ((btm)localObject).vcj.add(str);
            i += 1;
          }
          bool = true;
        }
        catch (Exception localException1)
        {
          w.printErrStackTrace("MicroMsg.FTS.NetSceneWebSuggest", localException1, "decode json error", new Object[0]);
          i = paramb.gRj;
          if (((btm)localObject).uBS == null) {}
        }
        for (;;)
        {
          w.i("MicroMsg.FTS.NetSceneWebSuggest", "businessTypeList is %d | contains location = %b | scene=%d | businessType=%d | isHomePage=%b | webViewId=%d", new Object[] { Integer.valueOf(i), Boolean.valueOf(bool), Integer.valueOf(paramb.scene), Integer.valueOf(paramb.gRj), Integer.valueOf(paramb.gRi), Integer.valueOf(paramb.eQd) });
          GMTrace.o(14450685902848L, 107666);
          return;
          boolean bool = false;
        }
        w.e("MicroMsg.FTS.NetSceneWebSuggest", "keyword is unavailable");
        GMTrace.o(14450685902848L, 107666);
        return;
      }
      catch (IOException localIOException)
      {
        for (;;) {}
      }
    }
    catch (Exception localException2)
    {
      for (;;) {}
    }
  }
  
  public final String CM()
  {
    GMTrace.i(12467484753920L, 92890);
    if (this.rCI != null)
    {
      String str = this.rCI.tWC;
      GMTrace.o(12467484753920L, 92890);
      return str;
    }
    GMTrace.o(12467484753920L, 92890);
    return "";
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(12467350536192L, 92889);
    this.fUd = parame1;
    int i = a(parame, this.gMj, this);
    GMTrace.o(12467350536192L, 92889);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(12467082100736L, 92887);
    w.i("MicroMsg.FTS.NetSceneWebSuggest", "netId %d | errType %d | errCode %d | errMsg %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    if ((paramInt2 != 0) || (paramInt3 != 0))
    {
      this.fUd.a(paramInt2, paramInt3, paramString, this);
      GMTrace.o(12467082100736L, 92887);
      return;
    }
    this.rCI = ((btn)this.gMj.gtD.gtK);
    if (this.rCI != null) {
      w.v("MicroMsg.FTS.NetSceneWebSuggest", "return data\n%s", new Object[] { this.rCI.tWC });
    }
    this.fUd.a(paramInt2, paramInt3, paramString, this);
    GMTrace.o(12467082100736L, 92887);
  }
  
  public final int getType()
  {
    GMTrace.i(12467216318464L, 92888);
    GMTrace.o(12467216318464L, 92888);
    return 1161;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\webview\fts\k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */