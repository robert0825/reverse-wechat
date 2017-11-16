package com.tencent.mm.plugin.record.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.a.ft;
import com.tencent.mm.g.a.ft.b;
import com.tencent.mm.g.a.fv;
import com.tencent.mm.g.a.fv.a;
import com.tencent.mm.g.a.fv.b;
import com.tencent.mm.plugin.record.ui.a.b;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.platformtools.w;

public final class d
{
  public static String a(b paramb)
  {
    GMTrace.i(7500623511552L, 55884);
    ft localft = new ft();
    localft.eIo.type = 2;
    localft.eIo.eIq = paramb.eIc;
    a.vgX.m(localft);
    paramb = localft.eIp.path;
    GMTrace.o(7500623511552L, 55884);
    return paramb;
  }
  
  public static String b(b paramb)
  {
    GMTrace.i(7500757729280L, 55885);
    ft localft = new ft();
    localft.eIo.type = 2;
    localft.eIo.eIq = paramb.eIc;
    a.vgX.m(localft);
    paramb = localft.eIp.eIy;
    GMTrace.o(7500757729280L, 55885);
    return paramb;
  }
  
  public static boolean c(b paramb)
  {
    GMTrace.i(7500891947008L, 55886);
    ft localft = new ft();
    localft.eIo.type = 14;
    localft.eIo.eIq = paramb.eIc;
    a.vgX.m(localft);
    if (localft.eIp.ret == 1)
    {
      GMTrace.o(7500891947008L, 55886);
      return true;
    }
    GMTrace.o(7500891947008L, 55886);
    return false;
  }
  
  public static c de(long paramLong)
  {
    GMTrace.i(7501026164736L, 55887);
    fv localfv = new fv();
    localfv.eIJ.eDp = paramLong;
    a.vgX.m(localfv);
    if (localfv.eIK.ret == 0)
    {
      w.w("MicroMsg.RecordFavLogic", "can not fetch FavItem");
      GMTrace.o(7501026164736L, 55887);
      return null;
    }
    w.d("MicroMsg.RecordFavLogic", "fetch favitem localId %s, itemStatus %d", new Object[] { Long.valueOf(localfv.eIJ.eDp), Integer.valueOf(localfv.eIK.field_itemStatus) });
    c localc = new c();
    localc.field_localId = localfv.eIJ.eDp;
    localc.field_id = localfv.eIK.field_id;
    localc.field_fromUser = localfv.eIK.field_fromUser;
    localc.field_toUser = localfv.eIK.field_toUser;
    localc.field_favProto = localfv.eIK.field_favProto;
    localc.field_realChatName = localfv.eIK.field_realChatName;
    localc.field_type = localfv.eIK.field_type;
    localc.field_itemStatus = localfv.eIK.field_itemStatus;
    GMTrace.o(7501026164736L, 55887);
    return localc;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\record\a\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */