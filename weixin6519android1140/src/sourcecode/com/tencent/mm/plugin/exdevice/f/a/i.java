package com.tencent.mm.plugin.exdevice.f.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.n;
import com.tencent.mm.plugin.exdevice.model.ad;
import com.tencent.mm.protocal.c.aep;
import com.tencent.mm.protocal.c.aeq;
import com.tencent.mm.protocal.c.bhn;
import com.tencent.mm.protocal.c.bvr;
import com.tencent.mm.protocal.c.bvs;
import com.tencent.mm.protocal.c.iv;
import com.tencent.mm.protocal.c.uk;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.ar;
import com.tencent.mm.y.at;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class i
  extends com.tencent.mm.plugin.exdevice.a.a<aep, aeq>
{
  public String aEe;
  public String appName;
  public String kBN;
  public String kBO;
  public String kBP;
  public String kBQ;
  public String kBR;
  public List<bhn> kBS;
  public List<bvs> kBT;
  public bvr kBU;
  public ArrayList<String> kBV;
  public List<uk> kBW;
  public List<iv> kBX;
  public boolean kBY;
  public int kBZ;
  public boolean kCa;
  private final WeakReference<com.tencent.mm.plugin.exdevice.a.b<i>> kxl;
  public String username;
  
  public i(String paramString1, String paramString2, com.tencent.mm.plugin.exdevice.a.b<i> paramb)
  {
    GMTrace.i(11182618443776L, 83317);
    w.d("MicroMsg.NetSceneGetProfileDetail", "appusername: %s, username: %s", new Object[] { paramString2, paramString1 });
    this.username = paramString1;
    this.appName = paramString2;
    this.kxl = new WeakReference(paramb);
    GMTrace.o(11182618443776L, 83317);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, com.tencent.mm.network.q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(11182752661504L, 83318);
    super.a(paramInt1, paramInt2, paramInt3, paramString, paramq, paramArrayOfByte);
    w.d("MicroMsg.NetSceneGetProfileDetail", "hy: getdetail scene gy end. errType: %d, errCode: %d, errMsg: %s", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    if ((paramInt2 == 0) && (paramInt3 == 0))
    {
      paramq = (aeq)afr();
      this.kBO = paramq.uun;
      this.kBP = paramq.kBP;
      this.kBT = paramq.uuq;
      this.kBU = paramq.uuo;
      this.kBQ = paramq.uus;
      this.aEe = paramq.aEe;
      this.kBR = paramq.uut;
      this.kBS = paramq.tQq;
      this.kBY = paramq.kBY;
      this.kBW = paramq.tPU;
      this.kBX = paramq.uuu;
      this.kBV = new ArrayList();
      this.kBZ = paramq.kID;
      this.kCa = paramq.uuv;
      this.kBN = paramq.kBN;
      if (paramq.uur != null) {
        this.kBV.addAll(paramq.uur);
      }
      this.kBS = new LinkedList();
      if (paramq.tQq != null) {
        this.kBS.addAll(paramq.tQq);
      }
      Object localObject1;
      if ((this.username != null) && (!this.username.equalsIgnoreCase(com.tencent.mm.y.q.zE())))
      {
        if (!this.kBY) {
          ad.atT().wO(this.username);
        }
      }
      else
      {
        if (paramq.tPU == null) {
          break label566;
        }
        paramArrayOfByte = new ArrayList();
        localObject1 = paramq.tPU.iterator();
      }
      for (;;)
      {
        if (!((Iterator)localObject1).hasNext()) {
          break label514;
        }
        Object localObject2 = (uk)((Iterator)localObject1).next();
        at.AR();
        if (com.tencent.mm.y.c.yK().TA(((uk)localObject2).username))
        {
          com.tencent.mm.plugin.exdevice.f.b.a.c localc = new com.tencent.mm.plugin.exdevice.f.b.a.c();
          localc.field_username = ((uk)localObject2).username;
          localc.field_step = ((uk)localObject2).hZC;
          paramArrayOfByte.add(localc);
          continue;
          paramArrayOfByte = ad.atT();
          localObject1 = this.username;
          if (paramArrayOfByte.a(new com.tencent.mm.plugin.exdevice.f.b.b("hardcode_rank_id", "hardcode_app_name", (String)localObject1)) != null) {
            break;
          }
          localObject2 = new com.tencent.mm.plugin.exdevice.f.b.a.c();
          ((com.tencent.mm.plugin.exdevice.f.b.a.c)localObject2).field_rankID = "hardcode_rank_id";
          ((com.tencent.mm.plugin.exdevice.f.b.a.c)localObject2).field_appusername = "hardcode_app_name";
          ((com.tencent.mm.plugin.exdevice.f.b.a.c)localObject2).field_username = ((String)localObject1);
          ((com.tencent.mm.plugin.exdevice.f.b.a.c)localObject2).field_step = 0;
          paramArrayOfByte.b((com.tencent.mm.sdk.e.c)localObject2);
          break;
        }
        at.wS().a(new h(((uk)localObject2).username, null), 0);
      }
      label514:
      w.d("MicroMsg.NetSceneGetProfileDetail", "follows %d %s", new Object[] { Integer.valueOf(paramArrayOfByte.size()), paramArrayOfByte.toString() });
      if (com.tencent.mm.y.q.zE().equalsIgnoreCase(this.username)) {
        ad.atT().av(paramArrayOfByte);
      }
      label566:
      this.kBX = new ArrayList();
      if (paramq.uuu != null) {
        this.kBX.addAll(paramq.uuu);
      }
      this.kBY = paramq.kBY;
      paramArrayOfByte = new com.tencent.mm.plugin.exdevice.f.b.a.a();
      paramArrayOfByte.field_championMotto = this.kBP;
      paramArrayOfByte.field_championUrl = this.kBO;
      paramArrayOfByte.field_username = this.username;
      paramq = paramq.tQq;
      ad.atV().a(paramArrayOfByte, true);
    }
    paramq = (com.tencent.mm.plugin.exdevice.a.b)this.kxl.get();
    if (paramq != null) {
      paramq.b(paramInt2, paramInt3, paramString, this);
    }
    GMTrace.o(11182752661504L, 83318);
  }
  
  public final int getType()
  {
    GMTrace.i(11183021096960L, 83320);
    GMTrace.o(11183021096960L, 83320);
    return 1043;
  }
  
  protected final String getUri()
  {
    GMTrace.i(11182886879232L, 83319);
    GMTrace.o(11182886879232L, 83319);
    return "/cgi-bin/mmbiz-bin/rank/getuserrankdetail";
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\exdevice\f\a\i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */