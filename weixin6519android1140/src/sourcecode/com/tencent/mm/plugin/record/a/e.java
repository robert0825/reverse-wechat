package com.tencent.mm.plugin.record.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.a.kl;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.platformtools.w;

public final class e
  implements i.a
{
  public e()
  {
    GMTrace.i(7504515825664L, 55913);
    GMTrace.o(7504515825664L, 55913);
  }
  
  public final void a(int paramInt, g paramg)
  {
    GMTrace.i(7504650043392L, 55914);
    if (paramg == null)
    {
      GMTrace.o(7504650043392L, 55914);
      return;
    }
    w.d("MircoMsg.RecordInfoStorageProxy", "notify CdnChanged dataId: %s, status: %d", new Object[] { paramg.field_dataId, Integer.valueOf(paramg.field_status) });
    kl localkl = new kl();
    localkl.eOD.field_dataId = paramg.field_dataId;
    localkl.eOD.field_status = paramg.field_status;
    localkl.eOD.field_offset = paramg.field_offset;
    localkl.eOD.field_totalLen = paramg.field_totalLen;
    localkl.eOD.field_localId = paramg.field_localId;
    localkl.eOD.field_path = paramg.field_path;
    a.vgX.m(localkl);
    GMTrace.o(7504650043392L, 55914);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\record\a\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */