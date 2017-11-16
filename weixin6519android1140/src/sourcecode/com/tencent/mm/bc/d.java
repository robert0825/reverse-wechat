package com.tencent.mm.bc;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ac.h;
import com.tencent.mm.ac.i;
import com.tencent.mm.g.a.fk;
import com.tencent.mm.g.a.fk.b;
import com.tencent.mm.g.b.af;
import com.tencent.mm.protocal.c.bu;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.ar;
import com.tencent.mm.storage.au;
import com.tencent.mm.storage.au.a;
import com.tencent.mm.storage.x;
import com.tencent.mm.y.at;

public final class d
  extends com.tencent.mm.y.e
{
  public d()
  {
    GMTrace.i(1424184311808L, 10611);
    GMTrace.o(1424184311808L, 10611);
  }
  
  protected final au a(bu parambu, String paramString1, String paramString2, String paramString3)
  {
    GMTrace.i(1424318529536L, 10612);
    paramString2 = com.tencent.mm.platformtools.n.a(parambu.tPY);
    if ((paramString2 == null) || (paramString2.length() <= 0))
    {
      w.e("MicroMsg.FMessageExtension", "possible friend msg : content is null");
      GMTrace.o(1424318529536L, 10612);
      return null;
    }
    paramString2 = au.a.Uh(paramString2);
    if (((paramString2.vBs != null) || (paramString2.vBt != null)) && ((paramString2.scene == 10) || (paramString2.scene == 11)))
    {
      paramString3 = new fk();
      paramString3.eHK.eHM = paramString2.vBs;
      paramString3.eHK.eHN = paramString2.vBt;
      com.tencent.mm.sdk.b.a.vgX.m(paramString3);
      if (paramString3.eHL.eHO)
      {
        w.v("MicroMsg.FMessageExtension", "possible mobile friend is not in local address book");
        GMTrace.o(1424318529536L, 10612);
        return null;
      }
    }
    if (paramString2.nNL > 0L) {
      com.tencent.mm.ac.b.c(paramString2.nNL, paramString2.vBr);
    }
    if (bg.nl(paramString2.rAP).length() > 0)
    {
      paramString3 = new h();
      paramString3.username = paramString2.rAP;
      paramString3.fiZ = 3;
      paramString3.bi(true);
      paramString3.eQl = -1;
      paramString3.gsU = paramString2.vBu;
      paramString3.gsT = paramString2.vBv;
      paramString3.eQl = -1;
      w.d("MicroMsg.FMessageExtension", "dkhurl user:[%s] big:[%s] sm:[%s]", new Object[] { paramString2.rAP, paramString3.Do(), paramString3.Dp() });
      com.tencent.mm.ac.n.Di().a(paramString3);
    }
    paramString3 = new f();
    paramString3.field_createTime = e.k(paramString1, parambu.nFd);
    paramString3.field_isSend = 0;
    paramString3.field_msgContent = com.tencent.mm.platformtools.n.a(parambu.tPY);
    paramString3.field_svrId = parambu.tQd;
    paramString3.field_talker = paramString2.rAP;
    paramString3.field_type = 0;
    parambu = l.ML().lM(paramString3.field_talker);
    if (parambu != null)
    {
      w.d("MicroMsg.FMessageExtension", "getByEncryptTalker success. encryptTalker = " + paramString3.field_talker + " , real talker = " + parambu.field_talker);
      paramString3.field_encryptTalker = paramString3.field_talker;
      paramString3.field_talker = parambu.field_talker;
    }
    at.AR();
    parambu = com.tencent.mm.y.c.yK().TE(paramString3.field_talker);
    if ((parambu != null) && (com.tencent.mm.l.a.eE(parambu.field_type)) && (parambu.fTq > 0L))
    {
      w.d("MicroMsg.FMessageExtension", "The biz contact whose talker is " + paramString3.field_talker + " has already been in user's contact list");
      GMTrace.o(1424318529536L, 10612);
      return null;
    }
    l.MK().a(paramString3);
    GMTrace.o(1424318529536L, 10612);
    return null;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\bc\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */