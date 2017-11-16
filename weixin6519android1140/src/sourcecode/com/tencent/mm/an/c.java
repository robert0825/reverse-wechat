package com.tencent.mm.an;

import android.text.TextUtils;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ac.h;
import com.tencent.mm.ac.i;
import com.tencent.mm.ac.n;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.ad.k.b;
import com.tencent.mm.g.b.f;
import com.tencent.mm.l.a;
import com.tencent.mm.modelfriend.o;
import com.tencent.mm.modelfriend.p;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.agm;
import com.tencent.mm.protocal.c.agn;
import com.tencent.mm.protocal.c.alw;
import com.tencent.mm.protocal.c.alx;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.ar;
import com.tencent.mm.storage.g;
import com.tencent.mm.storage.g.a;
import com.tencent.mm.y.at;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public final class c
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  private final com.tencent.mm.ad.b fUa;
  private com.tencent.mm.ad.e fUd;
  private ArrayList<o> gGf;
  private int gGg;
  private int gGh;
  private int gGi;
  private int gGj;
  private HashMap<String, o> gGk;
  private String mToken;
  
  public c(ArrayList<o> paramArrayList, int paramInt, HashMap<String, o> paramHashMap, String paramString)
  {
    GMTrace.i(1530753187840L, 11405);
    this.gGk = new HashMap();
    b.a locala = new b.a();
    locala.gtF = new alw();
    locala.gtG = new alx();
    locala.uri = "/cgi-bin/micromsg-bin/listgooglecontact";
    locala.gtE = 488;
    locala.gtH = 0;
    locala.gtI = 0;
    this.fUa = locala.DA();
    this.gGf = paramArrayList;
    this.gGg = paramInt;
    this.gGh = 0;
    this.gGj = 1;
    this.gGk = paramHashMap;
    this.mToken = paramString;
    GMTrace.o(1530753187840L, 11405);
  }
  
  private void a(alx paramalx)
  {
    for (;;)
    {
      ArrayList localArrayList;
      LinkedList localLinkedList;
      int j;
      String str1;
      String str2;
      try
      {
        GMTrace.i(1531290058752L, 11409);
        w.i("MicroMsg.GoogleContact.NetSceneListGoogleContact", "handleListGoogleContactCGIResponse Count:%d", new Object[] { Integer.valueOf(paramalx.jhc) });
        if ((paramalx.jhd == null) || (paramalx.jhd.size() <= 0)) {
          break label566;
        }
        int k = paramalx.jhd.size();
        localArrayList = new ArrayList();
        localLinkedList = new LinkedList();
        j = 0;
        if (j >= k) {
          break label545;
        }
        agm localagm = (agm)paramalx.jhd.get(j);
        if (TextUtils.isEmpty(localagm.jhi)) {
          break label590;
        }
        at.AR();
        localObject1 = com.tencent.mm.y.c.yK().TE(localagm.jhi);
        if ((localObject1 == null) || (!a.eE(((com.tencent.mm.g.b.af)localObject1).field_type))) {
          break label585;
        }
        i = 2;
        if ((this.gGk == null) || (!this.gGk.containsKey(localagm.tUq))) {
          break label578;
        }
        localObject2 = (o)this.gGk.get(localagm.tUq);
        ((o)localObject2).field_username = localagm.jhi;
        ((o)localObject2).field_nickname = localagm.jio;
        ((o)localObject2).field_usernamepy = com.tencent.mm.platformtools.c.nc(localagm.jio);
        ((o)localObject2).field_nicknameqp = com.tencent.mm.platformtools.c.nb(localagm.jio);
        ((o)localObject2).field_ret = localagm.tST;
        ((o)localObject2).field_small_url = localagm.uwe;
        ((o)localObject2).field_big_url = localagm.uwd;
        ((o)localObject2).field_status = i;
        ((o)localObject2).field_googlecgistatus = 2;
        if ((i == 2) || (i == 0))
        {
          ((o)localObject2).field_contecttype = ("weixin" + j);
          ((o)localObject2).field_googlenamepy = com.tencent.mm.platformtools.c.nc(((o)localObject2).field_googlename);
          localArrayList.add(localObject2);
          localObject1 = ((o)localObject2).field_googleid;
          str1 = ((o)localObject2).field_googlephotourl;
          str2 = this.mToken;
          if ((TextUtils.isEmpty((CharSequence)localObject1)) || (TextUtils.isEmpty(str1)) || (TextUtils.isEmpty(str2)))
          {
            localObject1 = new g.a();
            ((f)localObject1).field_userName = localagm.jhi;
            ((f)localObject1).field_scene = 58;
            ((f)localObject1).field_ticket = localagm.uoe;
            localLinkedList.add(localObject1);
            break label578;
          }
        }
        else
        {
          ((o)localObject2).field_contecttype = "google";
          continue;
        }
        str3 = (String)localObject1 + "@google";
      }
      finally {}
      String str3;
      Object localObject2 = n.Di().ig(str3);
      Object localObject1 = localObject2;
      if (localObject2 == null) {
        localObject1 = new h();
      }
      ((h)localObject1).username = str3;
      ((h)localObject1).fiZ = 3;
      ((h)localObject1).gsU = com.tencent.mm.ac.b.S(str1, str2);
      ((h)localObject1).gsT = com.tencent.mm.ac.b.S(str1, str2);
      ((h)localObject1).bi(true);
      ((h)localObject1).eQl = 31;
      n.Di().a((h)localObject1);
      continue;
      label545:
      com.tencent.mm.modelfriend.af.In().f(localArrayList);
      at.AR();
      com.tencent.mm.y.c.zu().cd(localLinkedList);
      label566:
      GMTrace.o(1531290058752L, 11409);
      return;
      label578:
      j += 1;
      continue;
      label585:
      int i = 0;
      continue;
      label590:
      i = 1;
    }
  }
  
  public final alx IC()
  {
    GMTrace.i(1531155841024L, 11408);
    alx localalx = (alx)this.fUa.gtD.gtK;
    GMTrace.o(1531155841024L, 11408);
    return localalx;
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(1530887405568L, 11406);
    w.i("MicroMsg.GoogleContact.NetSceneListGoogleContact", "doScene");
    this.fUd = parame1;
    parame1 = (alw)this.fUa.gtC.gtK;
    int i;
    if (this.gGf != null)
    {
      LinkedList localLinkedList = new LinkedList();
      this.gGi = this.gGf.size();
      i = this.gGh;
      while ((i < this.gGi) && (i < this.gGh + 500))
      {
        agn localagn = new agn();
        localagn.tUq = ((o)this.gGf.get(i)).field_googlegmail;
        localLinkedList.add(localagn);
        i += 1;
      }
      parame1.jhd = localLinkedList;
      parame1.jhc = localLinkedList.size();
      if (this.gGh + 500 <= this.gGi) {
        break label246;
      }
    }
    label246:
    for (this.gGj = 0;; this.gGj = 1)
    {
      parame1.tXv = this.gGj;
      parame1.uAP = this.gGg;
      w.i("MicroMsg.GoogleContact.NetSceneListGoogleContact", "doscene mTotalSize:%d, mStarIndex:%d, mContinueFlag:%d", new Object[] { Integer.valueOf(this.gGi), Integer.valueOf(this.gGh), Integer.valueOf(this.gGj) });
      i = a(parame, this.fUa, this);
      GMTrace.o(1530887405568L, 11406);
      return i;
    }
  }
  
  protected final int a(q paramq)
  {
    GMTrace.i(1531692711936L, 11412);
    int i = k.b.gum;
    GMTrace.o(1531692711936L, 11412);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(1531021623296L, 11407);
    w.i("MicroMsg.GoogleContact.NetSceneListGoogleContact", "NetId:%d, ErrType:%d, ErrCode:%d, errMsg:%s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    if ((paramInt2 != 0) || (paramInt3 != 0))
    {
      this.fUd.a(paramInt2, paramInt3, paramString, this);
      GMTrace.o(1531021623296L, 11407);
      return;
    }
    a(IC());
    if (this.gGj == 1)
    {
      this.gGh += 500;
      if (a(this.gtW, this.fUd) < 0)
      {
        w.e("MicroMsg.GoogleContact.NetSceneListGoogleContact", "doScene again failed");
        this.fUd.a(3, -1, "", this);
      }
    }
    this.fUd.a(paramInt2, paramInt3, paramString, this);
    GMTrace.o(1531021623296L, 11407);
  }
  
  public final int getType()
  {
    GMTrace.i(1531424276480L, 11410);
    GMTrace.o(1531424276480L, 11410);
    return 488;
  }
  
  protected final int vB()
  {
    GMTrace.i(1531558494208L, 11411);
    GMTrace.o(1531558494208L, 11411);
    return 20;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\an\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */