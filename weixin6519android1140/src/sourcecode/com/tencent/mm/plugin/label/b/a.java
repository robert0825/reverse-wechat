package com.tencent.mm.plugin.label.b;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.network.q;
import com.tencent.mm.platformtools.c;
import com.tencent.mm.protocal.c.aky;
import com.tencent.mm.protocal.c.bl;
import com.tencent.mm.protocal.c.bm;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.ac;
import com.tencent.mm.storage.z;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public final class a
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  private final b fUa;
  private com.tencent.mm.ad.e fUd;
  private LinkedList<aky> muN;
  
  public a(String paramString)
  {
    GMTrace.i(7277687865344L, 54223);
    this.muN = new LinkedList();
    Object localObject = new b.a();
    ((b.a)localObject).gtF = new bl();
    ((b.a)localObject).gtG = new bm();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/addcontactlabel";
    ((b.a)localObject).gtE = 635;
    ((b.a)localObject).gtH = 0;
    ((b.a)localObject).gtI = 0;
    this.fUa = ((b.a)localObject).DA();
    if (!bg.nm(paramString))
    {
      localObject = new aky();
      ((aky)localObject).uzZ = paramString;
      this.muN.add(localObject);
    }
    GMTrace.o(7277687865344L, 54223);
  }
  
  public a(List<String> paramList)
  {
    GMTrace.i(7277822083072L, 54224);
    this.muN = new LinkedList();
    Object localObject = new b.a();
    ((b.a)localObject).gtF = new bl();
    ((b.a)localObject).gtG = new bm();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/addcontactlabel";
    ((b.a)localObject).gtE = 635;
    ((b.a)localObject).gtH = 0;
    ((b.a)localObject).gtI = 0;
    this.fUa = ((b.a)localObject).DA();
    if ((paramList != null) && (paramList.size() > 0))
    {
      int j = paramList.size();
      int i = 0;
      while (i < j)
      {
        localObject = new aky();
        ((aky)localObject).uzZ = ((String)paramList.get(i));
        this.muN.add(localObject);
        i += 1;
      }
    }
    GMTrace.o(7277822083072L, 54224);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(7277956300800L, 54225);
    w.d("MicroMsg.Label.NetSceneAddContactLabel", "cpan[doScene].");
    this.fUd = parame1;
    bl localbl = (bl)this.fUa.gtC.gtK;
    if ((this.muN != null) && (this.muN.size() > 0))
    {
      localbl.tPJ = this.muN;
      localbl.tPI = this.muN.size();
      int i = a(parame, this.fUa, this);
      GMTrace.o(7277956300800L, 54225);
      return i;
    }
    w.e("MicroMsg.Label.NetSceneAddContactLabel", "cpan[doScene] label list is null.");
    parame1.a(3, -1, "[doScene]empty contact list.", this);
    GMTrace.o(7277956300800L, 54225);
    return 0;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(7278090518528L, 54226);
    w.d("MicroMsg.Label.NetSceneAddContactLabel", "cpan[onGYNetEnd] netId:%d errType:%d errCode:%d errMsg:%s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    paramq = aJQ();
    if (paramq != null)
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
        localz.field_labelPYFull = c.nb(localaky.uzZ);
        localz.field_labelPYShort = c.nc(localaky.uzZ);
        localz.field_isTemporary = false;
        paramArrayOfByte.add(localz);
        paramInt1 += 1;
      }
      com.tencent.mm.plugin.label.e.aJO().cf(paramArrayOfByte);
      com.tencent.mm.plugin.label.e.aJO().cg(paramArrayOfByte);
    }
    this.fUd.a(paramInt2, paramInt3, paramString, this);
    GMTrace.o(7278090518528L, 54226);
  }
  
  public final bm aJQ()
  {
    GMTrace.i(7278358953984L, 54228);
    bm localbm = (bm)this.fUa.gtD.gtK;
    GMTrace.o(7278358953984L, 54228);
    return localbm;
  }
  
  public final int getType()
  {
    GMTrace.i(7278224736256L, 54227);
    GMTrace.o(7278224736256L, 54227);
    return 635;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\label\b\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */