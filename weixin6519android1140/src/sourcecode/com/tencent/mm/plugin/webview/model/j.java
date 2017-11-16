package com.tencent.mm.plugin.webview.model;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.ada;
import com.tencent.mm.protocal.c.adb;
import com.tencent.mm.sdk.platformtools.w;

public final class j
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  public final b fUa;
  private com.tencent.mm.ad.e fXo;
  public Object tag;
  
  public j(String paramString1, String paramString2, int paramInt1, int paramInt2)
  {
    GMTrace.i(11999601754112L, 89404);
    w.d("MicroMsg.NetSceneGetReadingModeInfoProxy", "NetSceneSetOAuthScope doScene url[%s], userAgent[%s], width[%d], height[%d]", new Object[] { paramString1, paramString2, Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    Object localObject = new b.a();
    ((b.a)localObject).gtF = new ada();
    ((b.a)localObject).gtG = new adb();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/getreadingmodeinfo";
    ((b.a)localObject).gtE = 673;
    ((b.a)localObject).gtH = 0;
    ((b.a)localObject).gtI = 0;
    this.fUa = ((b.a)localObject).DA();
    localObject = (ada)this.fUa.gtC.gtK;
    ((ada)localObject).URL = paramString1;
    ((ada)localObject).utc = paramString2;
    ((ada)localObject).Width = paramInt1;
    ((ada)localObject).Height = paramInt2;
    GMTrace.o(11999601754112L, 89404);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(12000004407296L, 89407);
    w.i("MicroMsg.NetSceneGetReadingModeInfoProxy", "doScene");
    this.fXo = parame1;
    int i = a(parame, this.fUa, this);
    GMTrace.o(12000004407296L, 89407);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(11999735971840L, 89405);
    w.i("MicroMsg.NetSceneGetReadingModeInfoProxy", "errType = " + paramInt2 + ", errCode = " + paramInt3);
    this.fXo.a(paramInt2, paramInt3, paramString, this);
    if ((paramInt2 != 0) || (paramInt3 != 0))
    {
      w.e("MicroMsg.NetSceneGetReadingModeInfoProxy", "errType = " + paramInt2 + ", errCode = " + paramInt3);
      GMTrace.o(11999735971840L, 89405);
      return;
    }
    GMTrace.o(11999735971840L, 89405);
  }
  
  public final int getType()
  {
    GMTrace.i(11999870189568L, 89406);
    GMTrace.o(11999870189568L, 89406);
    return 673;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\webview\model\j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */