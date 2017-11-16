package com.tencent.mm.plugin.brandservice.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.network.q;
import com.tencent.mm.plugin.brandservice.a;
import com.tencent.mm.protocal.c.ag;
import com.tencent.mm.protocal.c.bcj;
import com.tencent.mm.protocal.c.bck;
import com.tencent.mm.sdk.platformtools.w;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class k
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  private final com.tencent.mm.ad.b fUa;
  private com.tencent.mm.ad.e fUd;
  
  public k(List<b> paramList)
  {
    GMTrace.i(10846939906048L, 80816);
    Object localObject = new b.a();
    ((b.a)localObject).gtF = new bcj();
    ((b.a)localObject).gtG = new bck();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/setapplist";
    ((b.a)localObject).gtE = 386;
    ((b.a)localObject).gtH = 0;
    ((b.a)localObject).gtI = 0;
    this.fUa = ((b.a)localObject).DA();
    localObject = (bcj)this.fUa.gtC.gtK;
    LinkedList localLinkedList = new LinkedList();
    paramList = paramList.iterator();
    while (paramList.hasNext())
    {
      b localb = (b)paramList.next();
      ag localag = new ag();
      localag.jhi = localb.userName;
      localLinkedList.add(localag);
    }
    ((bcj)localObject).jhc = localLinkedList.size();
    ((bcj)localObject).jhd = localLinkedList;
    w.i("MicroMsg.BrandService.NetSceneSetAppList", "info: upload size %d, toString %s", new Object[] { Integer.valueOf(localLinkedList.size()), localLinkedList.toString() });
    GMTrace.o(10846939906048L, 80816);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(10847342559232L, 80819);
    this.fUd = parame1;
    w.i("MicroMsg.BrandService.NetSceneSetAppList", "do scene");
    int i = a(parame, this.fUa, this);
    GMTrace.o(10847342559232L, 80819);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(10847074123776L, 80817);
    w.i("MicroMsg.BrandService.NetSceneSetAppList", "on scene end code(%d, %d)", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    if ((paramInt2 == 0) && (paramInt3 == 0))
    {
      paramq = (bck)this.fUa.gtD.gtK;
      w.i("MicroMsg.BrandService.NetSceneSetAppList", "ok, hash code is %d", new Object[] { Integer.valueOf(paramq.uos) });
      a.d(196610, Integer.valueOf(paramq.uos));
      a.d(196611, Boolean.valueOf(false));
    }
    for (;;)
    {
      this.fUd.a(paramInt2, paramInt3, paramString, this);
      GMTrace.o(10847074123776L, 80817);
      return;
      a.d(196611, Boolean.valueOf(true));
    }
  }
  
  public final int getType()
  {
    GMTrace.i(10847208341504L, 80818);
    GMTrace.o(10847208341504L, 80818);
    return 386;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\brandservice\a\k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */