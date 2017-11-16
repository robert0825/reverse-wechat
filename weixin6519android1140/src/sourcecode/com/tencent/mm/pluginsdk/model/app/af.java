package com.tencent.mm.pluginsdk.model.app;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.amk;
import com.tencent.mm.protocal.c.aml;
import com.tencent.mm.sdk.platformtools.w;

public final class af
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  public b fUa;
  private com.tencent.mm.ad.e fUd;
  
  public af(int paramInt, String paramString)
  {
    GMTrace.i(821680930816L, 6122);
    Object localObject = new b.a();
    ((b.a)localObject).gtF = new amk();
    ((b.a)localObject).gtG = new aml();
    ((b.a)localObject).uri = "/cgi-bin/mmbiz-bin/usrmsg/getserviceapplist";
    ((b.a)localObject).gtE = 1060;
    ((b.a)localObject).gtH = 0;
    ((b.a)localObject).gtI = 0;
    this.fUa = ((b.a)localObject).DA();
    localObject = (amk)this.fUa.gtC.gtK;
    ((amk)localObject).offset = paramInt;
    ((amk)localObject).aCN = 20;
    ((amk)localObject).lang = paramString;
    GMTrace.o(821680930816L, 6122);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(822083584000L, 6125);
    this.fUd = parame1;
    w.i("MicroMsg.NetSceneGetServiceAppList", "do scene");
    int i = a(parame, this.fUa, this);
    GMTrace.o(822083584000L, 6125);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(821815148544L, 6123);
    w.d("MicroMsg.NetSceneGetServiceAppList", "onGYNetEnd code(%d, %d)", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    if (this.fUd != null) {
      this.fUd.a(paramInt2, paramInt3, paramString, this);
    }
    GMTrace.o(821815148544L, 6123);
  }
  
  public final int getType()
  {
    GMTrace.i(821949366272L, 6124);
    GMTrace.o(821949366272L, 6124);
    return 1060;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\pluginsdk\model\app\af.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */