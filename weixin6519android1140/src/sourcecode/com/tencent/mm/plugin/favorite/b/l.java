package com.tencent.mm.plugin.favorite.b;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.a.kd;
import com.tencent.mm.g.a.ke;
import com.tencent.mm.g.a.kl;
import com.tencent.mm.plugin.favorite.h;
import com.tencent.mm.sdk.b.b;
import com.tencent.mm.sdk.e.j.a;
import com.tencent.mm.sdk.platformtools.w;

public final class l
  implements b.a, j.a
{
  private int lbf;
  
  public l()
  {
    GMTrace.i(6301388111872L, 46949);
    GMTrace.o(6301388111872L, 46949);
  }
  
  public final void a(String paramString, com.tencent.mm.sdk.e.l paraml)
  {
    GMTrace.i(6301656547328L, 46951);
    paraml = String.valueOf(this.lbf);
    w.d("MircoMsg.FavItemInfoStorageProxy", "on notify change event %s, favIDStr %s", new Object[] { paramString, paraml });
    if (paraml.equals(paramString))
    {
      paramString = new ke();
      paramString.eOv.eOw = this.lbf;
      com.tencent.mm.sdk.b.a.vgX.m(paramString);
    }
    GMTrace.o(6301656547328L, 46951);
  }
  
  public final void b(a parama)
  {
    GMTrace.i(6301522329600L, 46950);
    if (parama == null)
    {
      GMTrace.o(6301522329600L, 46950);
      return;
    }
    w.d("MircoMsg.FavItemInfoStorageProxy", "notify CdnChanged dataId: %s, status: %d", new Object[] { parama.field_dataId, Integer.valueOf(parama.field_status) });
    Object localObject = h.axB().cf(parama.field_favLocalId);
    if (((localObject != null) && (((j)localObject).field_type == 18)) || (parama.field_favLocalId < 0L))
    {
      localObject = new kl();
      ((kl)localObject).eOD.field_favLocalId = parama.field_favLocalId;
      ((kl)localObject).eOD.field_dataId = parama.field_dataId;
      ((kl)localObject).eOD.field_status = parama.field_status;
      ((kl)localObject).eOD.field_offset = parama.field_offset;
      ((kl)localObject).eOD.field_totalLen = parama.field_totalLen;
      ((kl)localObject).eOD.field_path = parama.field_path;
      com.tencent.mm.sdk.b.a.vgX.m((b)localObject);
      GMTrace.o(6301522329600L, 46950);
      return;
    }
    localObject = new kd();
    ((kd)localObject).eOu.field_favLocalId = parama.field_favLocalId;
    ((kd)localObject).eOu.field_dataId = parama.field_dataId;
    ((kd)localObject).eOu.field_status = parama.field_status;
    ((kd)localObject).eOu.field_offset = parama.field_offset;
    ((kd)localObject).eOu.field_totalLen = parama.field_totalLen;
    com.tencent.mm.sdk.b.a.vgX.m((b)localObject);
    GMTrace.o(6301522329600L, 46950);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\favorite\b\l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */