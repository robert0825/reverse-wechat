package com.tencent.mm.modelfriend;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.a.o;
import com.tencent.mm.ac.h;
import com.tencent.mm.ac.i;
import com.tencent.mm.ac.n;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.l.a;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.acu;
import com.tencent.mm.protocal.c.acv;
import com.tencent.mm.protocal.c.avo;
import com.tencent.mm.protocal.c.avp;
import com.tencent.mm.protocal.c.avq;
import com.tencent.mm.protocal.c.avr;
import com.tencent.mm.sdk.e.m;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.storage.ar;
import com.tencent.mm.storage.x;
import com.tencent.mm.y.at;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class w
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  public final com.tencent.mm.ad.b fUa;
  private com.tencent.mm.ad.e fUd;
  
  public w(int paramInt)
  {
    GMTrace.i(4449049247744L, 33148);
    this.fUd = null;
    Object localObject = new b.a();
    ((b.a)localObject).gtF = new acu();
    ((b.a)localObject).gtG = new acv();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/getqqgroup";
    ((b.a)localObject).gtE = 143;
    ((b.a)localObject).gtH = 38;
    ((b.a)localObject).gtI = 1000000038;
    this.fUa = ((b.a)localObject).DA();
    localObject = (acu)this.fUa.gtC.gtK;
    ((acu)localObject).lQF = 1;
    ((acu)localObject).usN = paramInt;
    GMTrace.o(4449049247744L, 33148);
  }
  
  private static void a(avr paramavr)
  {
    GMTrace.i(4449586118656L, 33152);
    Object localObject1 = af.Ii().goN.a("select qqgroup.grouopid,qqgroup.membernum,qqgroup.weixinnum,qqgroup.insert_time,qqgroup.lastupdate_time,qqgroup.needupdate,qqgroup.updatekey,qqgroup.groupname from qqgroup ", null, 0);
    HashMap localHashMap;
    int i;
    if (localObject1 == null)
    {
      localHashMap = null;
      i = 0;
      label32:
      if (i >= paramavr.jhc) {
        break label659;
      }
      localObject2 = (avq)paramavr.uKU.get(i);
      com.tencent.mm.sdk.platformtools.w.d("MicroMsg.NetSceneGetQQGroup", "id:" + ((avq)localObject2).usN + " name:" + ((avq)localObject2).umT + " mem:" + ((avq)localObject2).uhX + " wei:" + ((avq)localObject2).uKT + " md5:" + ((avq)localObject2).ugH);
      if (((avq)localObject2).usN >= 0) {
        break label276;
      }
      localObject1 = null;
      label141:
      if (localObject1 != null) {
        break label338;
      }
      com.tencent.mm.sdk.platformtools.w.e("MicroMsg.NetSceneGetQQGroup", "Error Resp Group Info index:" + i);
    }
    label276:
    label338:
    while (((ab)localObject1).gDO == 0)
    {
      i += 1;
      break label32;
      if (((Cursor)localObject1).getCount() <= 0)
      {
        ((Cursor)localObject1).close();
        localHashMap = null;
        break;
      }
      localHashMap = new HashMap();
      i = 0;
      while (i < ((Cursor)localObject1).getCount())
      {
        ((Cursor)localObject1).moveToPosition(i);
        localObject2 = new ab();
        ((ab)localObject2).b((Cursor)localObject1);
        localHashMap.put(Integer.valueOf(((ab)localObject2).gDN), localObject2);
        i += 1;
      }
      ((Cursor)localObject1).close();
      break;
      localObject1 = new ab();
      ((ab)localObject1).gDN = ((avq)localObject2).usN;
      ((ab)localObject1).gDU = ((avq)localObject2).umT;
      ((ab)localObject1).gDO = ((avq)localObject2).uhX;
      ((ab)localObject1).gDP = ((avq)localObject2).uKT;
      ((ab)localObject1).gDT = ((avq)localObject2).ugH;
      break label141;
    }
    if (localHashMap != null) {}
    for (Object localObject2 = (ab)localHashMap.get(Integer.valueOf(((ab)localObject1).gDN));; localObject2 = null)
    {
      if (localObject2 == null)
      {
        ((ab)localObject1).gDQ = ((int)bg.Pu());
        ((ab)localObject1).gDR = ((int)bg.Pu());
        ((ab)localObject1).gDS = 1;
        localObject2 = af.Ii();
        if (localObject1 != null)
        {
          com.tencent.mm.sdk.platformtools.w.d("MicroMsg.QQGroupStorage", "insert: name:" + ((ab)localObject1).HU());
          ((ab)localObject1).eQl = -1;
          ContentValues localContentValues = ((ab)localObject1).HS();
          if ((int)((ac)localObject2).goN.insert("qqgroup", "grouopid", localContentValues) >= 0) {
            ((ac)localObject2).doNotify();
          }
        }
        for (bool = true;; bool = false)
        {
          com.tencent.mm.sdk.platformtools.w.d("MicroMsg.NetSceneGetQQGroup", "Insert name:" + ((ab)localObject1).HU() + " ret:" + bool);
          break;
        }
      }
      ((ab)localObject2).gDS = -1;
      com.tencent.mm.sdk.platformtools.w.d("MicroMsg.NetSceneGetQQGroup", ((ab)localObject1).HT() + " " + ((ab)localObject2).HT() + " " + ((ab)localObject1).gDN);
      if (((ab)localObject2).HT().equals(((ab)localObject1).HT())) {
        break;
      }
      ((ab)localObject1).gDR = ((int)bg.Pu());
      ((ab)localObject1).gDS = 1;
      ((ab)localObject1).eQl = -1;
      boolean bool = af.Ii().a((ab)localObject1);
      com.tencent.mm.sdk.platformtools.w.d("MicroMsg.NetSceneGetQQGroup", "Update name:" + ((ab)localObject1).HU() + " ret:" + bool);
      break;
      label659:
      if (localHashMap != null)
      {
        paramavr = localHashMap.keySet().iterator();
        while (paramavr.hasNext())
        {
          localObject1 = (ab)localHashMap.get(paramavr.next());
          if (((ab)localObject1).gDS == 0)
          {
            localObject2 = af.Ii();
            i = ((ab)localObject1).gDN;
            com.tencent.mm.sdk.platformtools.w.d("MicroMsg.QQGroupStorage", "delete: id:" + i);
            if (((ac)localObject2).goN.delete("qqgroup", "grouopid= ?", new String[] { String.valueOf(i) }) > 0)
            {
              ((ac)localObject2).doNotify();
              bool = true;
              label777:
              com.tencent.mm.sdk.platformtools.w.d("MicroMsg.NetSceneGetQQGroup", "delete name:" + ((ab)localObject1).HU() + " ret:" + bool);
              localObject2 = af.Ik();
              i = ((ab)localObject1).gDN;
              com.tencent.mm.sdk.platformtools.w.d("MicroMsg.QQListStorage", "delete: GroupID:" + i);
              if (((ae)localObject2).goN.delete("qqlist", "groupid= ?", new String[] { String.valueOf(i) }) <= 0) {
                break label921;
              }
            }
            label921:
            for (bool = true;; bool = false)
            {
              com.tencent.mm.sdk.platformtools.w.d("MicroMsg.NetSceneGetQQGroup", "delete QQList name:" + ((ab)localObject1).HU() + " ret:" + bool);
              break;
              bool = false;
              break label777;
            }
          }
        }
      }
      GMTrace.o(4449586118656L, 33152);
      return;
    }
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(4449183465472L, 33149);
    this.fUd = parame1;
    parame1 = (acu)this.fUa.gtC.gtK;
    if ((parame1.lQF == 1) && (af.Ii().gg(parame1.usN) == null))
    {
      com.tencent.mm.sdk.platformtools.w.e("MicroMsg.NetSceneGetQQGroup", "Err group not exist");
      GMTrace.o(4449183465472L, 33149);
      return -1;
    }
    int i = a(parame, this.fUa, this);
    GMTrace.o(4449183465472L, 33149);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(4449451900928L, 33151);
    if ((paramInt2 != 0) || (paramInt3 != 0))
    {
      com.tencent.mm.sdk.platformtools.w.e("MicroMsg.NetSceneGetQQGroup", "onGYNetEnd  errType:" + paramInt2 + " errCode:" + paramInt3);
      this.fUd.a(paramInt2, paramInt3, paramString, this);
      GMTrace.o(4449451900928L, 33151);
      return;
    }
    com.tencent.mm.sdk.platformtools.w.d("MicroMsg.NetSceneGetQQGroup", "onGYNetEnd  errType:" + paramInt2 + " errCode:" + paramInt3);
    paramArrayOfByte = (acu)this.fUa.gtC.gtK;
    Object localObject2 = (acv)this.fUa.gtD.gtK;
    if (paramArrayOfByte.lQF == 0) {
      a(((acv)localObject2).usO);
    }
    for (;;)
    {
      this.fUd.a(paramInt2, paramInt3, paramString, this);
      GMTrace.o(4449451900928L, 33151);
      return;
      Object localObject1 = new ArrayList();
      ArrayList localArrayList1 = new ArrayList();
      ArrayList localArrayList2 = new ArrayList();
      int j = 0;
      while (j < ((acv)localObject2).usP.jhc)
      {
        localObject3 = (avo)((acv)localObject2).usP.uKS.get(j);
        paramInt1 = paramArrayOfByte.usN;
        com.tencent.mm.sdk.platformtools.w.v("MicroMsg.NetSceneGetQQGroup", "friend");
        paramq = new ad();
        paramq.gDV = new o(((avo)localObject3).uKO).longValue();
        com.tencent.mm.ac.b.c(paramq.gDV, 3);
        paramq.gDX = paramInt1;
        paramq.gDW = ((avo)localObject3).uKQ;
        label554:
        label696:
        int i;
        if (((avo)localObject3).uKQ != 0)
        {
          if ((((avo)localObject3).jhi == null) || (((avo)localObject3).jhi.equals("")))
          {
            paramq = null;
            ((List)localObject1).add(paramq);
            paramq = new k();
            paramq.fja = ((avo)localObject3).gCx;
            paramq.fjj = ((avo)localObject3).gCB;
            paramq.fjk = ((avo)localObject3).gCy;
            paramq.fjl = ((avo)localObject3).gCz;
            paramq.signature = ((avo)localObject3).gCA;
            paramq.username = ((avo)localObject3).jhi;
            localArrayList1.add(paramq);
            paramq = new h();
            paramq.fiZ = 3;
            paramq.bi(true);
            paramq.username = ((avo)localObject3).jhi;
            paramq.gsU = ((avo)localObject3).ubV;
            paramq.gsT = ((avo)localObject3).ubW;
            localArrayList2.add(paramq);
            j += 1;
            continue;
          }
          at.AR();
          x localx = com.tencent.mm.y.c.yK().TE(((avo)localObject3).jhi);
          if ((localx != null) && (localx.field_username.equals(((avo)localObject3).jhi)) && (a.eE(localx.field_type))) {
            paramq.gDW = 2;
          }
        }
        else
        {
          paramq.username = ((avo)localObject3).jhi;
          paramq.eCQ = ((avo)localObject3).jio;
          paramq.gEd = ((avo)localObject3).uKR;
          paramq.gEe = com.tencent.mm.platformtools.c.nc(((avo)localObject3).uKR);
          paramq.gEf = com.tencent.mm.platformtools.c.nb(((avo)localObject3).uKR);
          paramq.gDY = com.tencent.mm.platformtools.c.nc(((avo)localObject3).jio);
          paramq.gDZ = com.tencent.mm.platformtools.c.nb(((avo)localObject3).jio);
          paramq.gEa = ((avo)localObject3).uKP;
          paramq.gEb = com.tencent.mm.platformtools.c.nc(((avo)localObject3).uKP);
          paramq.gEc = com.tencent.mm.platformtools.c.nb(((avo)localObject3).uKP);
          paramInt1 = 32;
          if (bg.nm(paramq.Ib())) {
            break label794;
          }
          paramInt1 = paramq.Ib().charAt(0);
          if ((paramInt1 < 97) || (paramInt1 > 122)) {
            break label866;
          }
          i = (char)(paramInt1 - 32);
        }
        for (;;)
        {
          paramq.gsQ = i;
          at.AR();
          com.tencent.mm.y.c.zu().fd(((avo)localObject3).jhi, ((avo)localObject3).uoe);
          com.tencent.mm.sdk.platformtools.w.v("MicroMsg.NetSceneGetQQGroup", "QQ Friend nickname: " + paramq.HX() + "  remark: " + paramq.Ia());
          break;
          paramq.gDW = 1;
          break label554;
          label794:
          if (!bg.nm(paramq.Ic()))
          {
            paramInt1 = paramq.Ic().charAt(0);
            break label696;
          }
          if (!bg.nm(paramq.HY()))
          {
            paramInt1 = paramq.HY().charAt(0);
            break label696;
          }
          if (bg.nm(paramq.HZ())) {
            break label696;
          }
          paramInt1 = paramq.HZ().charAt(0);
          break label696;
          label866:
          if (paramInt1 >= 65)
          {
            i = paramInt1;
            if (paramInt1 <= 90) {}
          }
          else
          {
            i = 123;
          }
        }
      }
      paramq = new HashMap();
      localObject2 = af.Ik();
      paramInt1 = paramArrayOfByte.usN;
      com.tencent.mm.sdk.platformtools.w.d("MicroMsg.QQListStorage", "getByGroupID: GroupID:" + paramInt1);
      Object localObject3 = "select qqlist.qq,qqlist.wexinstatus,qqlist.groupid,qqlist.username,qqlist.nickname,qqlist.pyinitial,qqlist.quanpin,qqlist.qqnickname,qqlist.qqpyinitial,qqlist.qqquanpin,qqlist.qqremark,qqlist.qqremarkpyinitial,qqlist.qqremarkquanpin,qqlist.reserved1,qqlist.reserved2,qqlist.reserved3,qqlist.reserved4 from qqlist  where qqlist.groupid = \"" + paramInt1 + "\"";
      localObject2 = ((ae)localObject2).goN.a((String)localObject3, null, 0);
      while (((Cursor)localObject2).moveToNext())
      {
        localObject3 = new ad();
        ((ad)localObject3).b((Cursor)localObject2);
        paramq.put(Long.valueOf(((ad)localObject3).gDV), localObject3);
      }
      ((Cursor)localObject2).close();
      localObject1 = ((List)localObject1).iterator();
      while (((Iterator)localObject1).hasNext())
      {
        localObject2 = (ad)((Iterator)localObject1).next();
        if (paramq.containsKey(Long.valueOf(((ad)localObject2).gDV)))
        {
          localObject3 = (ad)paramq.get(Long.valueOf(((ad)localObject2).gDV));
          if (!bg.t(Long.valueOf(((ad)localObject3).gDV), Long.valueOf(((ad)localObject2).gDV))) {
            paramInt1 = 0;
          }
          for (;;)
          {
            if (paramInt1 != 0) {
              break label1509;
            }
            af.Ik().a(((ad)localObject2).gDV, (ad)localObject2);
            paramq.remove(Long.valueOf(((ad)localObject2).gDV));
            break;
            if (!bg.t(Integer.valueOf(((ad)localObject3).gDW), Integer.valueOf(((ad)localObject2).gDW))) {
              paramInt1 = 0;
            } else if (!bg.t(Integer.valueOf(((ad)localObject3).gDX), Integer.valueOf(((ad)localObject2).gDX))) {
              paramInt1 = 0;
            } else if (!bg.t(((ad)localObject3).username, ((ad)localObject2).username)) {
              paramInt1 = 0;
            } else if (!bg.t(((ad)localObject3).eCQ, ((ad)localObject2).eCQ)) {
              paramInt1 = 0;
            } else if (!bg.t(((ad)localObject3).gDY, ((ad)localObject2).gDY)) {
              paramInt1 = 0;
            } else if (!bg.t(((ad)localObject3).gDZ, ((ad)localObject2).gDZ)) {
              paramInt1 = 0;
            } else if (!bg.t(((ad)localObject3).gEa, ((ad)localObject2).gEa)) {
              paramInt1 = 0;
            } else if (!bg.t(((ad)localObject3).gEb, ((ad)localObject2).gEb)) {
              paramInt1 = 0;
            } else if (!bg.t(((ad)localObject3).gEc, ((ad)localObject2).gEc)) {
              paramInt1 = 0;
            } else if (!bg.t(((ad)localObject3).gEd, ((ad)localObject2).gEd)) {
              paramInt1 = 0;
            } else if (!bg.t(((ad)localObject3).gEe, ((ad)localObject2).gEe)) {
              paramInt1 = 0;
            } else if (!bg.t(((ad)localObject3).gEf, ((ad)localObject2).gEf)) {
              paramInt1 = 0;
            } else if (!bg.t(((ad)localObject3).gsO, ((ad)localObject2).gsO)) {
              paramInt1 = 0;
            } else if (!bg.t(((ad)localObject3).gsP, ((ad)localObject2).gsP)) {
              paramInt1 = 0;
            } else if (!bg.t(Integer.valueOf(((ad)localObject3).gsQ), Integer.valueOf(((ad)localObject2).gsQ))) {
              paramInt1 = 0;
            } else if (!bg.t(Integer.valueOf(((ad)localObject3).gsR), Integer.valueOf(((ad)localObject2).gsR))) {
              paramInt1 = 0;
            } else {
              paramInt1 = 1;
            }
          }
        }
        else
        {
          label1509:
          af.Ik().a((ad)localObject2);
        }
      }
      paramq = paramq.keySet().iterator();
      while (paramq.hasNext())
      {
        long l = ((Long)paramq.next()).longValue();
        localObject1 = af.Ik();
        com.tencent.mm.sdk.platformtools.w.d("MicroMsg.QQListStorage", "delete: QQ:" + l);
        if (((ae)localObject1).goN.delete("qqlist", "qq= ?", new String[] { String.valueOf(l) }) > 0) {
          ((ae)localObject1).b(5, (m)localObject1, String.valueOf(l));
        }
      }
      af.Ih().A(localArrayList1);
      n.Di().A(localArrayList2);
      paramq = new ab();
      paramq.gDN = paramArrayOfByte.usN;
      paramq.gDS = 0;
      paramq.gDR = ((int)bg.Pu());
      paramq.eQl = 48;
      af.Ii().a(paramq);
    }
  }
  
  public final int getType()
  {
    GMTrace.i(4449317683200L, 33150);
    GMTrace.o(4449317683200L, 33150);
    return 143;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\modelfriend\w.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */