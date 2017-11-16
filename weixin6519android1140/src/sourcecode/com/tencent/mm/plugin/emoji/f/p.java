package com.tencent.mm.plugin.emoji.f;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.ad.k.b;
import com.tencent.mm.network.q;
import com.tencent.mm.platformtools.n;
import com.tencent.mm.plugin.emoji.a.a.f;
import com.tencent.mm.protocal.c.ack;
import com.tencent.mm.protocal.c.acl;
import com.tencent.mm.protocal.c.azp;
import com.tencent.mm.protocal.c.rh;
import com.tencent.mm.sdk.platformtools.w;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class p
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  private final b fUa;
  private com.tencent.mm.ad.e fUd;
  private int gRb;
  public byte[] klL;
  private int klW;
  
  public p(int paramInt, byte[] paramArrayOfByte)
  {
    this(paramInt, paramArrayOfByte, (byte)0);
    GMTrace.i(11293482287104L, 84143);
    GMTrace.o(11293482287104L, 84143);
  }
  
  private p(int paramInt, byte[] paramArrayOfByte, byte paramByte)
  {
    GMTrace.i(11293616504832L, 84144);
    this.klL = null;
    b.a locala = new b.a();
    locala.gtF = new ack();
    locala.gtG = new acl();
    locala.uri = "/cgi-bin/micromsg-bin/mmgetpersonaldesigner";
    locala.gtE = 720;
    locala.gtH = 0;
    locala.gtI = 0;
    this.fUa = locala.DA();
    this.klW = paramInt;
    this.klL = paramArrayOfByte;
    this.gRb = 0;
    GMTrace.o(11293616504832L, 84144);
  }
  
  public static com.tencent.mm.plugin.emoji.model.e a(acl paramacl)
  {
    GMTrace.i(11294287593472L, 84149);
    w.d("MicroMsg.emoji.NetSceneGetPersonalDesigner", "getEmotionListModel");
    if (paramacl == null)
    {
      GMTrace.o(11294287593472L, 84149);
      return null;
    }
    com.tencent.mm.plugin.emoji.model.e locale = new com.tencent.mm.plugin.emoji.model.e();
    if ((paramacl != null) && (paramacl.uqI != null))
    {
      locale.kkn = paramacl.uqI.size();
      ArrayList localArrayList = new ArrayList();
      paramacl = paramacl.uqI.iterator();
      while (paramacl.hasNext())
      {
        rh localrh = (rh)paramacl.next();
        if (localrh.tRS != null) {
          localArrayList.add(new f(localrh));
        }
      }
      locale.kko = localArrayList;
    }
    GMTrace.o(11294287593472L, 84149);
    return locale;
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(11294019158016L, 84147);
    this.fUd = parame1;
    parame1 = (ack)this.fUa.gtC.gtK;
    parame1.uqo = this.klW;
    if (this.klL != null)
    {
      parame1.tQz = n.H(this.klL);
      parame1.tOG = this.gRb;
      if (parame1.tQz != null) {
        break label112;
      }
    }
    label112:
    for (parame1 = "Buf is NULL";; parame1 = parame1.tQz.toString())
    {
      w.d("MicroMsg.emoji.NetSceneGetPersonalDesigner", parame1);
      int i = a(parame, this.fUa, this);
      GMTrace.o(11294019158016L, 84147);
      return i;
      parame1.tQz = new azp();
      break;
    }
  }
  
  protected final int a(q paramq)
  {
    GMTrace.i(11294421811200L, 84150);
    int i = k.b.gum;
    GMTrace.o(11294421811200L, 84150);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(11293750722560L, 84145);
    w.i("MicroMsg.emoji.NetSceneGetPersonalDesigner", "NetSceneGetPersonalDesigner errType:%d,errcode:%d,errMsg:%s", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    paramq = (acl)((b)paramq).gtD.gtK;
    if (paramq.tQz != null) {
      this.klL = n.a(paramq.tQz);
    }
    this.fUd.a(paramInt2, paramInt3, paramString, this);
    GMTrace.o(11293750722560L, 84145);
  }
  
  public final acl arE()
  {
    GMTrace.i(11294153375744L, 84148);
    if (this.fUa == null)
    {
      GMTrace.o(11294153375744L, 84148);
      return null;
    }
    acl localacl = (acl)this.fUa.gtD.gtK;
    GMTrace.o(11294153375744L, 84148);
    return localacl;
  }
  
  public final int getType()
  {
    GMTrace.i(11293884940288L, 84146);
    GMTrace.o(11293884940288L, 84146);
    return 720;
  }
  
  protected final int vB()
  {
    GMTrace.i(11294556028928L, 84151);
    GMTrace.o(11294556028928L, 84151);
    return 100;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\emoji\f\p.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */