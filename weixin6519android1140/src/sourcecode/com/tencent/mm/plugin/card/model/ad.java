package com.tencent.mm.plugin.card.model;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mars.smc.IDKey;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.network.q;
import com.tencent.mm.plugin.card.b.j;
import com.tencent.mm.protocal.c.kj;
import com.tencent.mm.protocal.c.kk;
import com.tencent.mm.protocal.c.yo;
import com.tencent.mm.protocal.c.yp;
import com.tencent.mm.protocal.c.ys;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import com.tencent.mm.storage.w.a;
import com.tencent.mm.y.at;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public final class ad
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  private final b fUa;
  private com.tencent.mm.ad.e fUd;
  public boolean jzW;
  
  public ad(double paramDouble1, double paramDouble2, int paramInt)
  {
    GMTrace.i(4908879183872L, 36574);
    this.jzW = false;
    Object localObject = new b.a();
    ((b.a)localObject).gtF = new yo();
    ((b.a)localObject).gtG = new yp();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/getcardslayout";
    ((b.a)localObject).gtE = 984;
    ((b.a)localObject).gtH = 0;
    ((b.a)localObject).gtI = 0;
    this.fUa = ((b.a)localObject).DA();
    localObject = (yo)this.fUa.gtC.gtK;
    ((yo)localObject).latitude = paramDouble1;
    ((yo)localObject).longitude = paramDouble2;
    ((yo)localObject).scene = paramInt;
    at.AR();
    ((yo)localObject).upx = ((String)com.tencent.mm.y.c.xh().get(w.a.vqZ, null));
    GMTrace.o(4908879183872L, 36574);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(4909281837056L, 36577);
    this.fUd = parame1;
    int i = a(parame, this.fUa, this);
    GMTrace.o(4909281837056L, 36577);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(4909013401600L, 36575);
    w.i("MicroMsg.NetSceneGetCardsLayout", "onGYNetEnd, errType = %d, errCode = %d", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    paramq = (yp)this.fUa.gtD.gtK;
    w.v("MicroMsg.NetSceneGetCardsLayout", "json:" + paramq.jzG);
    long l1;
    boolean bool1;
    if ((paramInt2 == 0) && (paramInt3 == 0))
    {
      at.AR();
      com.tencent.mm.y.c.xh().a(w.a.vqZ, paramq.upx);
      paramq = paramq.jzG;
      l1 = System.currentTimeMillis();
      at.AR();
      paramArrayOfByte = (String)com.tencent.mm.y.c.xh().get(w.a.vqY, null);
      if (!bg.nm(paramArrayOfByte)) {
        paramq = paramArrayOfByte;
      }
      paramArrayOfByte = j.uC(paramq);
      al.akn().fTZ.eZ("UserCardInfo", "update UserCardInfo set stickyIndex=0, stickyEndTime=0 , label_wording='' where stickyIndex>0");
      if (paramArrayOfByte == null)
      {
        w.w("MicroMsg.CardStickyHelper", "[doUpdateStickyInfoLogic] resp null");
        bool1 = false;
        this.jzW = bool1;
      }
    }
    else
    {
      this.fUd.a(paramInt2, paramInt3, paramString, this);
      GMTrace.o(4909013401600L, 36575);
      return;
    }
    Object localObject;
    label316:
    long l2;
    boolean bool2;
    int i;
    if (paramArrayOfByte.upA != null)
    {
      localObject = paramArrayOfByte.upA;
      localObject = new HashMap();
      ((Map)localObject).put("expiring_list", Integer.valueOf(2));
      ((Map)localObject).put("member_card_list", Integer.valueOf(2));
      ((Map)localObject).put("nearby_list", Integer.valueOf(3));
      ((Map)localObject).put("first_list", Integer.valueOf(5));
      if (paramArrayOfByte.upD == 100)
      {
        ((Map)localObject).put("expiring_list", Integer.valueOf(4));
        at.AR();
        l2 = com.tencent.mm.y.c.yH().cE(Thread.currentThread().getId());
        if ((paramArrayOfByte.upA.ubi == null) || (paramArrayOfByte.upA.ubi.ubh == null) || (paramArrayOfByte.upA.ubi.ubh.size() <= 0)) {
          break label1224;
        }
        paramInt1 = ((Integer)((Map)localObject).get("expiring_list")).intValue();
        j.a(paramArrayOfByte.upA.ubi.ubh, paramInt1 * 100000 + 3);
        paramInt1 = paramArrayOfByte.upA.ubi.ubh.size();
        bool2 = true;
        i = paramInt1 + 0;
        label436:
        bool1 = bool2;
        paramInt1 = i;
        if (paramArrayOfByte.upA.ubj != null)
        {
          bool1 = bool2;
          paramInt1 = i;
          if (paramArrayOfByte.upA.ubj.ubh != null)
          {
            bool1 = bool2;
            paramInt1 = i;
            if (paramArrayOfByte.upA.ubj.ubh.size() > 0)
            {
              paramInt1 = ((Integer)((Map)localObject).get("member_card_list")).intValue();
              j.a(paramArrayOfByte.upA.ubj.ubh, paramInt1 * 100000 + 2);
              paramInt1 = i + paramArrayOfByte.upA.ubj.ubh.size();
              bool1 = true;
            }
          }
        }
        bool2 = bool1;
        i = paramInt1;
        if (paramArrayOfByte.upA.ubk != null)
        {
          bool2 = bool1;
          i = paramInt1;
          if (paramArrayOfByte.upA.ubk.ubh != null)
          {
            bool2 = bool1;
            i = paramInt1;
            if (paramArrayOfByte.upA.ubk.ubh.size() > 0)
            {
              i = ((Integer)((Map)localObject).get("nearby_list")).intValue();
              j.a(paramArrayOfByte.upA.ubk.ubh, i * 100000 + 1);
              i = paramInt1 + paramArrayOfByte.upA.ubk.ubh.size();
              bool2 = true;
            }
          }
        }
        bool1 = bool2;
        paramInt1 = i;
        if (paramArrayOfByte.upA.ubl != null)
        {
          bool1 = bool2;
          paramInt1 = i;
          if (paramArrayOfByte.upA.ubl.ubh != null)
          {
            bool1 = bool2;
            paramInt1 = i;
            if (paramArrayOfByte.upA.ubl.ubh.size() > 0)
            {
              bool1 = true;
              paramInt1 = i + paramArrayOfByte.upA.ubl.ubh.size();
              j.b(paramArrayOfByte.upA.ubl.ubh, 0);
            }
          }
        }
        bool2 = bool1;
        i = paramInt1;
        if (paramArrayOfByte.upA.ubm != null)
        {
          bool2 = bool1;
          i = paramInt1;
          if (paramArrayOfByte.upA.ubm.ubh != null)
          {
            bool2 = bool1;
            i = paramInt1;
            if (paramArrayOfByte.upA.ubm.ubh.size() > 0)
            {
              i = ((Integer)((Map)localObject).get("first_list")).intValue() * 100000 + 4;
              j.a(paramArrayOfByte.upA.ubm.ubh, i);
              j.b(paramArrayOfByte.upA.ubm.ubh, i);
              i = paramInt1 + paramArrayOfByte.upA.ubm.ubh.size();
              bool2 = true;
            }
          }
        }
        at.AR();
        com.tencent.mm.y.c.yH().aL(l2);
      }
    }
    for (;;)
    {
      al.aks().putValue("key_get_card_layout_resp", paramArrayOfByte);
      at.AR();
      com.tencent.mm.y.c.xh().a(w.a.vrh, paramq);
      bool1 = bool2;
      if (i <= 0) {
        break;
      }
      l2 = System.currentTimeMillis();
      paramq = new ArrayList();
      paramArrayOfByte = new IDKey();
      paramArrayOfByte.SetID(281);
      paramArrayOfByte.SetKey(36);
      paramArrayOfByte.SetValue(1L);
      localObject = new IDKey();
      ((IDKey)localObject).SetID(281);
      ((IDKey)localObject).SetKey(37);
      ((IDKey)localObject).SetValue((int)(l2 - l1));
      IDKey localIDKey1 = new IDKey();
      localIDKey1.SetID(281);
      localIDKey1.SetKey(38);
      localIDKey1.SetValue(i);
      IDKey localIDKey2 = new IDKey();
      localIDKey2.SetID(281);
      localIDKey2.SetKey(40);
      localIDKey2.SetValue((int)(l2 - l1) / i);
      paramq.add(paramArrayOfByte);
      paramq.add(localObject);
      paramq.add(localIDKey1);
      paramq.add(localIDKey2);
      com.tencent.mm.plugin.report.service.g.ork.b(paramq, true);
      bool1 = bool2;
      break;
      if (paramArrayOfByte.upD == 102)
      {
        ((Map)localObject).put("member_card_list", Integer.valueOf(4));
        break label316;
      }
      if (paramArrayOfByte.upD != 101) {
        break label316;
      }
      ((Map)localObject).put("nearby_list", Integer.valueOf(4));
      break label316;
      label1224:
      bool2 = false;
      i = 0;
      break label436;
      bool2 = false;
      i = 0;
    }
  }
  
  public final int getType()
  {
    GMTrace.i(4909147619328L, 36576);
    GMTrace.o(4909147619328L, 36576);
    return 984;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\card\model\ad.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */