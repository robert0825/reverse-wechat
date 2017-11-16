package com.tencent.mm.plugin.exdevice.f.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.network.q;
import com.tencent.mm.plugin.exdevice.a.b;
import com.tencent.mm.plugin.exdevice.model.ad;
import com.tencent.mm.protocal.c.bs;
import com.tencent.mm.protocal.c.bt;
import com.tencent.mm.protocal.c.uk;
import com.tencent.mm.sdk.platformtools.w;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class g
  extends com.tencent.mm.plugin.exdevice.a.a<bs, bt>
{
  List<String> jdJ;
  public ArrayList<uk> kBM;
  private final WeakReference<b<g>> kxl;
  
  public g(List<String> paramList, b<g> paramb)
  {
    GMTrace.i(11181678919680L, 83310);
    this.jdJ = paramList;
    this.kxl = new WeakReference(paramb);
    GMTrace.o(11181678919680L, 83310);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(11181947355136L, 83312);
    w.d("MicroMsg.NetSceneAddFollow", "ap: errType: %s, errCode: %s, errMsg: %s", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    if ((paramInt2 == 0) && (paramInt3 == 0))
    {
      bt localbt = (bt)afr();
      this.kBM = new ArrayList();
      if (localbt.tPU != null)
      {
        Iterator localIterator = localbt.tPU.iterator();
        while (localIterator.hasNext())
        {
          uk localuk = (uk)localIterator.next();
          w.d("MicroMsg.NetSceneAddFollow", "follow: index:%s step: %s username: %s", new Object[] { Integer.valueOf(localuk.index), Integer.valueOf(localuk.hZC), localuk.username });
          this.kBM.add(localuk);
        }
        w.d("MicroMsg.NetSceneAddFollow", "follows: %s, %d", new Object[] { this.kBM.toString(), Integer.valueOf(localbt.tPU.size()) });
      }
      ad.atT().a(this.kBM, "hardcode_rank_id", "hardcode_app_name");
    }
    super.a(paramInt1, paramInt2, paramInt3, paramString, paramq, paramArrayOfByte);
    paramq = (b)this.kxl.get();
    if (paramq != null) {
      paramq.b(paramInt2, paramInt3, paramString, this);
    }
    GMTrace.o(11181947355136L, 83312);
  }
  
  public final int getType()
  {
    GMTrace.i(11181813137408L, 83311);
    GMTrace.o(11181813137408L, 83311);
    return 1777;
  }
  
  protected final String getUri()
  {
    GMTrace.i(11182081572864L, 83313);
    GMTrace.o(11182081572864L, 83313);
    return "/cgi-bin/mmoc-bin/hardware/addfollow";
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\exdevice\f\a\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */