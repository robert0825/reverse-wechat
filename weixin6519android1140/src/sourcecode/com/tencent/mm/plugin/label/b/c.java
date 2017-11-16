package com.tencent.mm.plugin.label.b;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.aky;
import com.tencent.mm.protocal.c.zf;
import com.tencent.mm.protocal.c.zg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.ac;
import com.tencent.mm.storage.t;
import com.tencent.mm.storage.z;
import com.tencent.mm.y.at;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public final class c
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  private final b fUa;
  private com.tencent.mm.ad.e fUd;
  
  public c()
  {
    GMTrace.i(7278493171712L, 54229);
    b.a locala = new b.a();
    locala.gtF = new zf();
    locala.gtG = new zg();
    locala.uri = "/cgi-bin/micromsg-bin/getcontactlabellist";
    locala.gtE = 639;
    locala.gtH = 0;
    locala.gtI = 0;
    this.fUa = locala.DA();
    GMTrace.o(7278493171712L, 54229);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(7278895824896L, 54232);
    this.fUd = parame1;
    int i = a(parame, this.fUa, this);
    GMTrace.o(7278895824896L, 54232);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(7278627389440L, 54230);
    w.d("MicroMsg.Label.NetSceneGetContactLabelList", "cpan[onGYNetEnd] netId:%d errType:%d errCode:%d errMsg:%s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    if ((paramInt2 == 0) && (paramInt3 == 0))
    {
      at.AR();
      com.tencent.mm.y.c.xh().set(209408, Long.valueOf(System.currentTimeMillis()));
      paramq = (zg)this.fUa.gtD.gtK;
      if ((paramq != null) && (paramq.tPJ != null))
      {
        paramq = paramq.tPJ;
        paramArrayOfByte = new ArrayList();
        int i = paramq.size();
        paramInt1 = 0;
        while (paramInt1 < i)
        {
          aky localaky = (aky)paramq.get(paramInt1);
          z localz = new z();
          localz.field_labelID = localaky.uAa;
          localz.field_labelName = localaky.uzZ;
          localz.field_labelPYFull = com.tencent.mm.platformtools.c.nb(localaky.uzZ);
          localz.field_labelPYShort = com.tencent.mm.platformtools.c.nc(localaky.uzZ);
          paramArrayOfByte.add(localz);
          paramInt1 += 1;
        }
        com.tencent.mm.plugin.label.e.aJO().cg(paramArrayOfByte);
        com.tencent.mm.plugin.label.e.aJO().ch(com.tencent.mm.plugin.label.e.aJO().ci(paramArrayOfByte));
      }
    }
    for (;;)
    {
      this.fUd.a(paramInt2, paramInt3, paramString, this);
      GMTrace.o(7278627389440L, 54230);
      return;
      w.w("MicroMsg.Label.NetSceneGetContactLabelList", "cpan[onGYNetEnd] getcontactlabellist fail.");
    }
  }
  
  public final int getType()
  {
    GMTrace.i(7278761607168L, 54231);
    GMTrace.o(7278761607168L, 54231);
    return 639;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\label\b\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */