package com.tencent.mm.plugin.brandservice.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.network.q;
import com.tencent.mm.plugin.brandservice.a;
import com.tencent.mm.protocal.c.ag;
import com.tencent.mm.protocal.c.vt;
import com.tencent.mm.protocal.c.vu;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import com.tencent.mm.y.at;
import com.tencent.mm.y.c;
import java.util.Iterator;
import java.util.LinkedList;

public final class f
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  private final b fUa;
  private com.tencent.mm.ad.e fUd;
  LinkedList<String> jta;
  
  public f()
  {
    GMTrace.i(10844658204672L, 80799);
    Object localObject1 = new b.a();
    ((b.a)localObject1).gtF = new vt();
    ((b.a)localObject1).gtG = new vu();
    ((b.a)localObject1).uri = "/cgi-bin/micromsg-bin/getapplist";
    ((b.a)localObject1).gtE = 387;
    ((b.a)localObject1).gtH = 0;
    ((b.a)localObject1).gtI = 0;
    this.fUa = ((b.a)localObject1).DA();
    this.jta = new LinkedList();
    vt localvt = (vt)this.fUa.gtC.gtK;
    at.AR();
    Object localObject2 = c.xh().get(196610, null);
    if (localObject2 == null) {}
    for (localObject1 = "null";; localObject1 = localObject2.toString())
    {
      w.i("MicroMsg.BrandService.BrandServiceApplication", "get config, key[%d], value[%s]", new Object[] { Integer.valueOf(196610), localObject1 });
      localvt.uos = bg.a((Integer)localObject2, 0);
      w.i("MicroMsg.BrandService.NetSceneGetAppList", "info: request hash code %d", new Object[] { Integer.valueOf(localvt.uos) });
      GMTrace.o(10844658204672L, 80799);
      return;
    }
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(10845060857856L, 80802);
    this.fUd = parame1;
    w.i("MicroMsg.BrandService.NetSceneGetAppList", "do scene");
    int i = a(parame, this.fUa, this);
    GMTrace.o(10845060857856L, 80802);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(10844792422400L, 80800);
    w.w("MicroMsg.BrandService.NetSceneGetAppList", "on scene end code(%d, %d)", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    if ((paramInt2 == 0) && (paramInt3 == 0))
    {
      paramq = (vu)this.fUa.gtD.gtK;
      w.i("MicroMsg.BrandService.NetSceneGetAppList", "ok, hash code is %d, count is %d", new Object[] { Integer.valueOf(paramq.uos), Integer.valueOf(paramq.jhc) });
      w.i("MicroMsg.BrandService.NetSceneGetAppList", "result list is %s", new Object[] { paramq.jhd.toString() });
      a.d(196610, Integer.valueOf(paramq.uos));
      paramq = paramq.jhd.iterator();
      while (paramq.hasNext())
      {
        paramArrayOfByte = (ag)paramq.next();
        this.jta.add(paramArrayOfByte.jhi);
      }
    }
    this.fUd.a(paramInt2, paramInt3, paramString, this);
    GMTrace.o(10844792422400L, 80800);
  }
  
  public final int getType()
  {
    GMTrace.i(10844926640128L, 80801);
    GMTrace.o(10844926640128L, 80801);
    return 387;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\brandservice\a\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */