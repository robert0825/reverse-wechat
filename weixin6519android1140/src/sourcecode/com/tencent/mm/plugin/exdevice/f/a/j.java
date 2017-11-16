package com.tencent.mm.plugin.exdevice.f.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.n;
import com.tencent.mm.network.q;
import com.tencent.mm.plugin.exdevice.f.b.f;
import com.tencent.mm.plugin.exdevice.model.ad;
import com.tencent.mm.protocal.c.aer;
import com.tencent.mm.protocal.c.aes;
import com.tencent.mm.protocal.c.bvp;
import com.tencent.mm.protocal.c.bvq;
import com.tencent.mm.protocal.c.uk;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.ar;
import com.tencent.mm.y.at;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public final class j
  extends com.tencent.mm.plugin.exdevice.a.a<aer, aes>
{
  public String appName;
  public String kBQ;
  public String kBR;
  public boolean kCa;
  public boolean kCb;
  public String kCc;
  public String kCd;
  public com.tencent.mm.plugin.exdevice.f.b.a.a kCe;
  public ArrayList<com.tencent.mm.plugin.exdevice.f.b.a.d> kCf;
  public ArrayList<com.tencent.mm.plugin.exdevice.f.b.a.c> kCg;
  public ArrayList<com.tencent.mm.plugin.exdevice.f.b.a.e> kCh;
  public ArrayList<String> kCi;
  public String kCj;
  public String kCk;
  public boolean kCl;
  public boolean kCm;
  public String kCn;
  private final WeakReference<com.tencent.mm.plugin.exdevice.a.b<j>> kCo;
  public a kCp;
  
  public j(String paramString1, String paramString2, String paramString3, boolean paramBoolean, com.tencent.mm.plugin.exdevice.a.b<j> paramb)
  {
    GMTrace.i(11180470960128L, 83301);
    this.kCo = new WeakReference(paramb);
    this.kCj = paramString1;
    this.kCc = paramString1;
    this.appName = bg.nl(paramString2);
    this.kCb = paramBoolean;
    this.kCd = paramString3;
    GMTrace.o(11180470960128L, 83301);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(11180739395584L, 83303);
    w.d("MicroMsg.NetSceneGetRankInfo", "hy: get rank info end. errType: %d, errCode: %d, errMsg: %s", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    aes localaes;
    Object localObject1;
    Object localObject3;
    Object localObject4;
    String str1;
    String str2;
    Object localObject2;
    if ((paramInt2 == 0) && (paramInt3 == 0))
    {
      localaes = (aes)afr();
      localObject1 = "";
      this.kCg = new ArrayList();
      if (localaes.tPU != null)
      {
        localObject3 = localaes.tPU.iterator();
        while (((Iterator)localObject3).hasNext())
        {
          localObject4 = (uk)((Iterator)localObject3).next();
          at.AR();
          if (com.tencent.mm.y.c.yK().TA(((uk)localObject4).username))
          {
            str1 = localaes.gjb;
            str2 = this.appName;
            if ((bg.nm(str1)) || (localObject4 == null))
            {
              w.w("MicroMsg.ExdeviceRankConverter", "hy: param error");
              localObject2 = null;
            }
            for (;;)
            {
              if (localObject2 == null) {
                break label228;
              }
              this.kCg.add(localObject2);
              break;
              localObject2 = new com.tencent.mm.plugin.exdevice.f.b.a.c();
              ((com.tencent.mm.plugin.exdevice.f.b.a.c)localObject2).field_rankID = str1;
              ((com.tencent.mm.plugin.exdevice.f.b.a.c)localObject2).field_username = ((uk)localObject4).username;
              ((com.tencent.mm.plugin.exdevice.f.b.a.c)localObject2).field_step = ((uk)localObject4).hZC;
              ((com.tencent.mm.plugin.exdevice.f.b.a.c)localObject2).field_appusername = str2;
            }
          }
          else
          {
            label228:
            at.wS().a(new h(((uk)localObject4).username, null), 0);
          }
        }
      }
      this.kCf = new ArrayList();
      localObject2 = localObject1;
      if (localaes.uuy != null)
      {
        localObject3 = localaes.uuy.iterator();
        localObject2 = localObject1;
        if (((Iterator)localObject3).hasNext())
        {
          localObject4 = (bvp)((Iterator)localObject3).next();
          str1 = localaes.gjb;
          str2 = this.appName;
          if ((bg.nm(str1)) || (localObject4 == null))
          {
            w.w("MicroMsg.ExdeviceRankConverter", "hy: param error");
            localObject2 = null;
            label349:
            if (localObject2 == null) {
              break label457;
            }
            if (((com.tencent.mm.plugin.exdevice.f.b.a.d)localObject2).field_ranknum != 1) {
              break label1240;
            }
            localObject1 = ((com.tencent.mm.plugin.exdevice.f.b.a.d)localObject2).field_username;
          }
        }
      }
    }
    label457:
    label608:
    label785:
    label931:
    label967:
    label983:
    label1164:
    label1170:
    label1222:
    label1228:
    label1234:
    label1240:
    for (;;)
    {
      this.kCf.add(localObject2);
      break;
      localObject2 = new com.tencent.mm.plugin.exdevice.f.b.a.d();
      ((com.tencent.mm.plugin.exdevice.f.b.a.d)localObject2).field_appusername = str2;
      ((com.tencent.mm.plugin.exdevice.f.b.a.d)localObject2).field_rankID = str1;
      ((com.tencent.mm.plugin.exdevice.f.b.a.d)localObject2).field_likecount = ((bvp)localObject4).vdQ;
      ((com.tencent.mm.plugin.exdevice.f.b.a.d)localObject2).field_ranknum = ((bvp)localObject4).vdP;
      ((com.tencent.mm.plugin.exdevice.f.b.a.d)localObject2).field_score = ((bvp)localObject4).score;
      ((com.tencent.mm.plugin.exdevice.f.b.a.d)localObject2).field_selfLikeState = ((bvp)localObject4).vdR;
      ((com.tencent.mm.plugin.exdevice.f.b.a.d)localObject2).field_username = ((bvp)localObject4).username;
      break label349;
      break;
      this.kCh = new ArrayList();
      if (localaes.uuz != null)
      {
        localObject3 = localaes.uuz.iterator();
        while (((Iterator)localObject3).hasNext())
        {
          localObject4 = (bvq)((Iterator)localObject3).next();
          str1 = localaes.gjb;
          str2 = this.appName;
          if ((bg.nm(str1)) || (localObject4 == null))
          {
            w.w("MicroMsg.ExdeviceRankConverter", "hy: param error");
            localObject1 = null;
          }
          for (;;)
          {
            if (localObject1 == null) {
              break label608;
            }
            this.kCh.add(localObject1);
            break;
            localObject1 = new com.tencent.mm.plugin.exdevice.f.b.a.e();
            ((com.tencent.mm.plugin.exdevice.f.b.a.e)localObject1).field_appusername = str2;
            ((com.tencent.mm.plugin.exdevice.f.b.a.e)localObject1).field_rankID = str1;
            ((com.tencent.mm.plugin.exdevice.f.b.a.e)localObject1).field_timestamp = ((bvq)localObject4).jWT;
            ((com.tencent.mm.plugin.exdevice.f.b.a.e)localObject1).field_username = ((bvq)localObject4).username;
          }
        }
      }
      this.kCi = new ArrayList();
      if (localaes.uur != null)
      {
        localObject1 = localaes.uur.iterator();
        while (((Iterator)localObject1).hasNext())
        {
          localObject3 = (String)((Iterator)localObject1).next();
          this.kCi.add(localObject3);
        }
      }
      if (!bg.nm(this.kCd)) {
        localObject2 = this.kCd;
      }
      localObject3 = localaes.uuA;
      localObject4 = localaes.uuB;
      boolean bool;
      int i;
      int j;
      if (bg.nm((String)localObject2))
      {
        w.w("MicroMsg.ExdeviceRankConverter", "hy: param error");
        localObject1 = null;
        this.kCe = ((com.tencent.mm.plugin.exdevice.f.b.a.a)localObject1);
        this.kCj = localaes.gjb;
        this.kBR = localaes.uut;
        this.kBQ = localaes.uus;
        this.kCk = localaes.uuC;
        this.kCl = localaes.kCl;
        if (localaes.uuF != 1) {
          break label1164;
        }
        bool = true;
        this.kCm = bool;
        this.kCn = localaes.uuG;
        this.kCa = localaes.uuv;
        w.d("MicroMsg.NetSceneGetRankInfo", "hy: get score info ok.");
        if ((this.kCc == null) || (!this.kCc.equals(this.kCj)))
        {
          localObject1 = ad.atZ().kCw;
          if (localObject1 != null) {
            ((f)localObject1).wM(this.kCj);
          }
        }
        if ((this.kCp != null) && (this.kCb)) {
          this.kCp.a(this);
        }
        if (this.kCb) {
          ad.atT().av(this.kCg);
        }
        localObject1 = ad.atS();
        localObject2 = this.kCj;
        if (!bg.nm((String)localObject2)) {
          break label1170;
        }
        w.w("MicroMsg.ExdeviceRankInfoStg", "delete rankInfo by rankId failed, rankId is null or nil.");
        ad.atS().d(this.kCj, this.kCf);
        bool = this.kCl;
        if (this.kCg == null) {
          break label1222;
        }
        i = this.kCg.size();
        if (this.kCf == null) {
          break label1228;
        }
        j = this.kCf.size();
        if (this.kCh == null) {
          break label1234;
        }
      }
      for (int k = this.kCh.size();; k = 0)
      {
        w.i("MicroMsg.NetSceneGetRankInfo", "isCacheExist(%s), RankFollowInfo size(%s), RankInfo size(%d), LikeInfo size(%d).", new Object[] { Boolean.valueOf(bool), Integer.valueOf(i), Integer.valueOf(j), Integer.valueOf(k) });
        ad.atW().a(this.kCj, this.appName, this.kCh);
        if (this.kCe != null) {
          ad.atV().a(this.kCe, true);
        }
        super.a(paramInt1, paramInt2, paramInt3, paramString, paramq, paramArrayOfByte);
        paramq = (com.tencent.mm.plugin.exdevice.a.b)this.kCo.get();
        if (paramq != null) {
          paramq.b(paramInt2, paramInt3, paramString, this);
        }
        GMTrace.o(11180739395584L, 83303);
        return;
        localObject1 = new com.tencent.mm.plugin.exdevice.f.b.a.a();
        ((com.tencent.mm.plugin.exdevice.f.b.a.a)localObject1).field_username = ((String)localObject2);
        ((com.tencent.mm.plugin.exdevice.f.b.a.a)localObject1).field_championUrl = ((String)localObject3);
        ((com.tencent.mm.plugin.exdevice.f.b.a.a)localObject1).field_championMotto = ((String)localObject4);
        break;
        bool = false;
        break label785;
        w.i("MicroMsg.ExdeviceRankInfoStg", "delete rankInfo by rankId (%s).(r : %d)", new Object[] { localObject2, Integer.valueOf(((com.tencent.mm.plugin.exdevice.f.b.b.d)localObject1).fTZ.delete("HardDeviceRankInfo", "rankID = ? ", new String[] { localObject2 })) });
        break label931;
        i = 0;
        break label967;
        j = 0;
        break label983;
      }
    }
  }
  
  public final int getType()
  {
    GMTrace.i(11180605177856L, 83302);
    GMTrace.o(11180605177856L, 83302);
    return 1042;
  }
  
  protected final String getUri()
  {
    GMTrace.i(11180873613312L, 83304);
    GMTrace.o(11180873613312L, 83304);
    return "/cgi-bin/mmbiz-bin/rank/getuserranklike";
  }
  
  public static abstract interface a
  {
    public abstract void a(j paramj);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\exdevice\f\a\j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */