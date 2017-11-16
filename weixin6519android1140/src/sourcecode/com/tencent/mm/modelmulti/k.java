package com.tencent.mm.modelmulti;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mars.comm.WakerLock;
import com.tencent.mm.ad.i;
import com.tencent.mm.kernel.h;
import com.tencent.mm.network.q;
import com.tencent.mm.plugin.zero.b.b;
import com.tencent.mm.protocal.aa.a;
import com.tencent.mm.protocal.aa.b;
import com.tencent.mm.protocal.k.d;
import com.tencent.mm.protocal.k.e;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;

public final class k
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  private WakerLock fIK;
  private com.tencent.mm.ad.e fUd;
  private final q guL;
  
  public k()
  {
    GMTrace.i(13433583960064L, 100088);
    this.fIK = new WakerLock(ab.getContext());
    this.fIK.lock(3000L, "NetSceneSynCheck");
    this.guL = new a();
    h.xz();
    if (h.xy() != null)
    {
      h.xz();
      if (h.xy().xh() != null)
      {
        h.xz();
        Object localObject = (String)h.xy().xh().get(8195, null);
        ((aa.a)this.guL.DC()).gMx = bg.St((String)localObject);
        localObject = (aa.a)this.guL.DC();
        h.xz();
        h.xw();
        ((aa.a)localObject).uin = com.tencent.mm.kernel.a.ww();
        ((aa.a)this.guL.DC()).netType = com.tencent.mm.protocal.a.getNetType(ab.getContext());
        ((aa.a)this.guL.DC()).tKv = com.tencent.mm.protocal.a.bNT();
        w.d("MicroMsg.MMSyncCheck", "NetSceneSynCheck");
        GMTrace.o(13433583960064L, 100088);
        return;
      }
    }
    w.e("MicroMsg.NetSceneSynCheck", "[arthurdan.NetSceneSynCheckCrash] Notice!!! MMCore.getAccStg() is null");
    GMTrace.o(13433583960064L, 100088);
  }
  
  public final boolean DE()
  {
    GMTrace.i(13433852395520L, 100090);
    GMTrace.o(13433852395520L, 100090);
    return true;
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(13433718177792L, 100089);
    this.fUd = parame1;
    int i = a(parame, this.guL, this);
    if ((i == -1) && (this.fIK.isLocking())) {
      this.fIK.unLock();
    }
    GMTrace.o(13433718177792L, 100089);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(13434120830976L, 100092);
    paramArrayOfByte = (aa.b)paramq.AZ();
    w.i("MicroMsg.NetSceneSynCheck", "new syncCheck complete, selector=" + paramArrayOfByte.tKZ);
    if ((h.xw().wL()) && (!com.tencent.mm.kernel.a.wF()))
    {
      paramq = ((aa.a)paramq.DC()).fYy;
      if (bg.bq(paramq)) {
        w.e("MicroMsg.NetSceneSynCheck", "onGYNetEnd md5 is null");
      }
      paramArrayOfByte.fYy = paramq;
      ((b)h.h(b.class)).JF().a(paramArrayOfByte.tKZ, 2, paramArrayOfByte.bOn());
    }
    this.fUd.a(paramInt2, paramInt3, paramString, this);
    this.fIK.unLock();
    GMTrace.o(13434120830976L, 100092);
  }
  
  public final int getType()
  {
    GMTrace.i(13433986613248L, 100091);
    GMTrace.o(13433986613248L, 100091);
    return 39;
  }
  
  public static final class a
    extends i
  {
    private final aa.a gMK;
    private final aa.b gML;
    
    public a()
    {
      GMTrace.i(13428215250944L, 100048);
      this.gMK = new aa.a();
      this.gML = new aa.b();
      GMTrace.o(13428215250944L, 100048);
    }
    
    protected final k.d AY()
    {
      GMTrace.i(13428349468672L, 100049);
      aa.a locala = this.gMK;
      GMTrace.o(13428349468672L, 100049);
      return locala;
    }
    
    public final k.e AZ()
    {
      GMTrace.i(13428483686400L, 100050);
      aa.b localb = this.gML;
      GMTrace.o(13428483686400L, 100050);
      return localb;
    }
    
    public final int Dz()
    {
      GMTrace.i(13428886339584L, 100053);
      GMTrace.o(13428886339584L, 100053);
      return 1;
    }
    
    public final int getType()
    {
      GMTrace.i(13428617904128L, 100051);
      GMTrace.o(13428617904128L, 100051);
      return 39;
    }
    
    public final String getUri()
    {
      GMTrace.i(13428752121856L, 100052);
      GMTrace.o(13428752121856L, 100052);
      return null;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\modelmulti\k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */