package com.tencent.mm.af.a;

import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.protocal.c.aah;
import com.tencent.mm.protocal.c.aai;
import com.tencent.mm.protocal.c.ail;
import com.tencent.mm.protocal.c.awq;
import com.tencent.mm.protocal.c.bkj;
import com.tencent.mm.protocal.c.bkk;
import com.tencent.mm.protocal.c.bkl;
import com.tencent.mm.protocal.c.bkm;
import com.tencent.mm.protocal.c.gy;
import com.tencent.mm.protocal.c.gz;
import com.tencent.mm.protocal.c.ha;
import com.tencent.mm.protocal.c.hb;
import com.tencent.mm.protocal.c.hf;
import com.tencent.mm.protocal.c.hx;
import com.tencent.mm.protocal.c.oe;
import com.tencent.mm.protocal.c.oi;
import com.tencent.mm.protocal.c.oj;
import com.tencent.mm.protocal.c.us;
import com.tencent.mm.protocal.c.xh;
import com.tencent.mm.protocal.c.xi;
import com.tencent.mm.protocal.c.xj;
import com.tencent.mm.protocal.c.xk;
import com.tencent.mm.protocal.c.xl;
import com.tencent.mm.protocal.c.xn;
import com.tencent.mm.sdk.platformtools.bg;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class h
  implements com.tencent.mm.ad.e
{
  private com.tencent.mm.a.f<String, Long> gyA;
  private HashSet<a> gyB;
  private HashSet<a> gyC;
  private final Object gyD;
  private com.tencent.mm.a.f<String, Long> gyE;
  private HashSet<a> gyx;
  private HashSet<a> gyy;
  private final Object gyz;
  
  public h()
  {
    GMTrace.i(4559913091072L, 33974);
    this.gyx = new HashSet();
    this.gyy = new HashSet();
    this.gyz = new Object();
    this.gyA = new com.tencent.mm.a.f(64);
    this.gyB = new HashSet();
    this.gyC = new HashSet();
    this.gyD = new Object();
    this.gyE = new com.tencent.mm.a.f(64);
    com.tencent.mm.kernel.h.xx().fYr.a(1352, this);
    com.tencent.mm.kernel.h.xx().fYr.a(1365, this);
    com.tencent.mm.kernel.h.xx().fYr.a(1353, this);
    com.tencent.mm.kernel.h.xx().fYr.a(1354, this);
    com.tencent.mm.kernel.h.xx().fYr.a(1357, this);
    com.tencent.mm.kernel.h.xx().fYr.a(1356, this);
    com.tencent.mm.kernel.h.xx().fYr.a(1355, this);
    com.tencent.mm.kernel.h.xx().fYr.a(1358, this);
    com.tencent.mm.kernel.h.xx().fYr.a(1367, this);
    com.tencent.mm.kernel.h.xx().fYr.a(1361, this);
    com.tencent.mm.kernel.h.xx().fYr.a(1389, this);
    com.tencent.mm.kernel.h.xx().fYr.a(1315, this);
    GMTrace.o(4559913091072L, 33974);
  }
  
  private void FX()
  {
    GMTrace.i(4560584179712L, 33979);
    LinkedList localLinkedList1 = new LinkedList();
    synchronized (this.gyz)
    {
      if (!this.gyy.isEmpty())
      {
        GMTrace.o(4560584179712L, 33979);
        return;
      }
      if (this.gyx.isEmpty())
      {
        GMTrace.o(4560584179712L, 33979);
        return;
      }
      Iterator localIterator = this.gyx.iterator();
      if (localIterator.hasNext())
      {
        a locala = (a)localIterator.next();
        gz localgz = new gz();
        localgz.tVU = locala.eOB;
        localgz.tVO = locala.id;
        localLinkedList1.add(localgz);
      }
    }
    if (localLinkedList2.isEmpty())
    {
      GMTrace.o(4560584179712L, 33979);
      return;
    }
    this.gyy.addAll(this.gyx);
    this.gyx.clear();
    ??? = new p(localLinkedList2);
    com.tencent.mm.kernel.h.xx().fYr.a((com.tencent.mm.ad.k)???, 0);
    GMTrace.o(4560584179712L, 33979);
  }
  
  private void FY()
  {
    GMTrace.i(4561121050624L, 33983);
    LinkedList localLinkedList = new LinkedList();
    HashMap localHashMap;
    Object localObject6;
    Object localObject7;
    Object localObject4;
    synchronized (this.gyD)
    {
      if (!this.gyC.isEmpty())
      {
        GMTrace.o(4561121050624L, 33983);
        return;
      }
      if (this.gyB.isEmpty())
      {
        GMTrace.o(4561121050624L, 33983);
        return;
      }
      localHashMap = new HashMap();
      localObject6 = this.gyB.iterator();
      if (((Iterator)localObject6).hasNext())
      {
        localObject7 = (a)((Iterator)localObject6).next();
        localObject4 = (LinkedList)localHashMap.get(((a)localObject7).eOB);
        Object localObject1 = localObject4;
        if (localObject4 == null)
        {
          localObject1 = new LinkedList();
          localHashMap.put(((a)localObject7).eOB, localObject1);
        }
        ((LinkedList)localObject1).add(((a)localObject7).id);
      }
    }
    Object localObject3 = localHashMap.keySet().iterator();
    while (((Iterator)localObject3).hasNext())
    {
      localObject4 = (String)((Iterator)localObject3).next();
      localObject6 = (LinkedList)localHashMap.get(localObject4);
      if ((localObject6 != null) && (!((LinkedList)localObject6).isEmpty()))
      {
        localObject7 = new hx();
        ((hx)localObject7).tVU = ((String)localObject4);
        ((hx)localObject7).tWU = ((LinkedList)localObject6);
        localLinkedList.add(localObject7);
      }
    }
    this.gyC.addAll(this.gyB);
    this.gyB.clear();
    localObject3 = new r(localLinkedList, null);
    com.tencent.mm.kernel.h.xx().fYr.a((com.tencent.mm.ad.k)localObject3, 0);
    GMTrace.o(4561121050624L, 33983);
  }
  
  public static n a(String paramString, us paramus, com.tencent.mm.af.n paramn)
  {
    GMTrace.i(4561657921536L, 33987);
    paramString = new n(paramString, paramus, paramn);
    com.tencent.mm.kernel.h.xx().fYr.a(paramString, 0);
    GMTrace.o(4561657921536L, 33987);
    return paramString;
  }
  
  public static w a(String paramString, gy paramgy, com.tencent.mm.af.n paramn)
  {
    GMTrace.i(4561926356992L, 33989);
    paramString = new w(paramString, paramgy, paramn);
    com.tencent.mm.kernel.h.xx().fYr.a(paramString, 0);
    GMTrace.o(4561926356992L, 33989);
    return paramString;
  }
  
  public static x a(String paramString1, String paramString2, hb paramhb1, hb paramhb2, com.tencent.mm.af.n paramn)
  {
    GMTrace.i(4561792139264L, 33988);
    paramString1 = new x(paramString1, paramString2, paramhb1, paramhb2, paramn);
    com.tencent.mm.kernel.h.xx().fYr.a(paramString1, 0);
    GMTrace.o(4561792139264L, 33988);
    return paramString1;
  }
  
  public static void a(String paramString, com.tencent.mm.af.n paramn)
  {
    GMTrace.i(4561523703808L, 33986);
    paramString = new q(paramString, paramn);
    com.tencent.mm.kernel.h.xx().fYr.a(paramString, 0);
    GMTrace.o(4561523703808L, 33986);
  }
  
  public static void a(String paramString1, String paramString2, com.tencent.mm.af.n paramn)
  {
    GMTrace.i(4561389486080L, 33985);
    if (paramn == null)
    {
      GMTrace.o(4561389486080L, 33985);
      return;
    }
    Object localObject = e.ji(paramString2);
    if ((localObject == null) || (((j)localObject).field_userId.equals(paramString1)))
    {
      a(paramString2, paramn);
      GMTrace.o(4561389486080L, 33985);
      return;
    }
    localObject = new LinkedList();
    ((LinkedList)localObject).add(paramString1);
    paramString1 = new hx();
    paramString1.tVU = paramString2;
    paramString1.tWU = ((LinkedList)localObject);
    paramString2 = new LinkedList();
    paramString2.add(paramString1);
    paramString1 = new r(paramString2, paramn);
    com.tencent.mm.kernel.h.xx().fYr.a(paramString1, 0);
    GMTrace.o(4561389486080L, 33985);
  }
  
  private static boolean a(hf paramhf, String paramString)
  {
    GMTrace.i(4562060574720L, 33990);
    if ((bg.nm(paramString)) || (bg.nm(paramhf.tVV)))
    {
      GMTrace.o(4562060574720L, 33990);
      return false;
    }
    j localj = new j();
    localj.field_userId = paramhf.tVV;
    localj.field_userName = paramhf.jBs;
    localj.field_brandUserName = paramString;
    localj.field_headImageUrl = paramhf.tVP;
    localj.field_profileUrl = paramhf.tWd;
    localj.field_UserVersion = paramhf.ver;
    localj.field_addMemberUrl = paramhf.tVT;
    if (!com.tencent.mm.af.x.FK().b(localj)) {
      com.tencent.mm.af.x.FK().a(localj);
    }
    paramhf = new c();
    paramhf.field_bizChatServId = localj.field_userId;
    paramhf.field_brandUserName = localj.field_brandUserName;
    paramhf.field_chatName = localj.field_userName;
    paramhf.field_chatType = 1;
    if (e.e(paramhf) == null)
    {
      GMTrace.o(4562060574720L, 33990);
      return false;
    }
    GMTrace.o(4562060574720L, 33990);
    return true;
  }
  
  private static boolean a(us paramus, String paramString, boolean paramBoolean)
  {
    GMTrace.i(4562194792448L, 33991);
    com.tencent.mm.sdk.platformtools.w.d("MicroMsg.BizChatNetworkMgr", "handleGetBizChatInfoSceneEnd");
    if ((paramus == null) || (paramus.umW == null) || (bg.nm(paramString)))
    {
      com.tencent.mm.sdk.platformtools.w.w("MicroMsg.BizChatNetworkMgr", "fullBizChat or fullBizChat.chat or brandUserName == null");
      GMTrace.o(4562194792448L, 33991);
      return false;
    }
    Object localObject1 = com.tencent.mm.af.x.FI().jd(paramus.umW.tVO);
    if (localObject1 == null)
    {
      paramBoolean = true;
      com.tencent.mm.sdk.platformtools.w.w("MicroMsg.BizChatNetworkMgr", "bizChatInfo == null");
      localObject1 = new c();
      ((c)localObject1).field_bizChatServId = paramus.umW.tVO;
      ((c)localObject1).field_brandUserName = paramString;
    }
    for (int i = 1;; i = 0)
    {
      if (paramus.tVW == null)
      {
        com.tencent.mm.sdk.platformtools.w.w("MicroMsg.BizChatNetworkMgr", "members==null");
        GMTrace.o(4562194792448L, 33991);
        return false;
      }
      Object localObject2;
      label390:
      Object localObject3;
      String str;
      if ((((c)localObject1).FV()) || (paramus.umW.ver > ((c)localObject1).field_chatVersion))
      {
        ((c)localObject1).field_chatType = paramus.umW.type;
        ((c)localObject1).field_headImageUrl = paramus.umW.tVP;
        ((c)localObject1).field_chatName = paramus.umW.name;
        ((c)localObject1).field_chatVersion = paramus.umW.ver;
        ((c)localObject1).field_needToUpdate = false;
        ((c)localObject1).field_bitFlag = paramus.umW.tVQ;
        ((c)localObject1).field_maxMemberCnt = paramus.umW.tVR;
        ((c)localObject1).field_ownerUserId = paramus.umW.tVS;
        ((c)localObject1).field_addMemberUrl = paramus.umW.tVT;
        ((c)localObject1).field_brandUserName = paramString;
        paramString = new LinkedList();
        localObject2 = paramus.tVW.iterator();
        while (((Iterator)localObject2).hasNext()) {
          paramString.add(((ha)((Iterator)localObject2).next()).tVV);
        }
        ((c)localObject1).field_userList = bg.c(paramString, ";");
        if (i != 0) {
          com.tencent.mm.af.x.FI().a((c)localObject1);
        }
      }
      else
      {
        e.h((c)localObject1);
        if (!paramBoolean) {
          break label581;
        }
        paramString = new hx();
        paramString.tVU = ((c)localObject1).field_brandUserName;
        localObject1 = new LinkedList();
        paramus = paramus.tVW.iterator();
        if (!paramus.hasNext()) {
          break label520;
        }
        localObject2 = (ha)paramus.next();
        localObject3 = com.tencent.mm.af.x.FK();
        str = ((ha)localObject2).tVV;
        if (!bg.nm(str)) {
          break label483;
        }
        com.tencent.mm.sdk.platformtools.w.w("MicroMsg.BizChatUserInfoStorage", "getBizChatVersion wrong argument");
        i = -1;
      }
      long l;
      for (;;)
      {
        l = i;
        if (((ha)localObject2).ver <= l) {
          break label390;
        }
        ((LinkedList)localObject1).add(((ha)localObject2).tVV);
        break label390;
        com.tencent.mm.af.x.FI().b((c)localObject1);
        break;
        label483:
        localObject3 = ((k)localObject3).bl(str);
        if (localObject3 != null)
        {
          i = ((j)localObject3).field_UserVersion;
        }
        else
        {
          com.tencent.mm.sdk.platformtools.w.w("MicroMsg.BizChatUserInfoStorage", "getBizChatVersion item == null");
          i = -1;
        }
      }
      label520:
      if (((LinkedList)localObject1).size() > 0)
      {
        paramString.tWU = ((LinkedList)localObject1);
        paramus = new LinkedList();
        paramus.add(paramString);
        paramus = new r(paramus, null);
        com.tencent.mm.kernel.h.xx().fYr.a(paramus, 0);
      }
      for (;;)
      {
        GMTrace.o(4562194792448L, 33991);
        return true;
        label581:
        paramString = com.tencent.mm.af.x.FK().fTZ;
        l = 0L;
        if ((paramString instanceof com.tencent.mm.bu.g)) {
          l = ((com.tencent.mm.bu.g)paramString).cE(Thread.currentThread().getId());
        }
        paramus = paramus.tVW.iterator();
        while (paramus.hasNext())
        {
          localObject2 = (ha)paramus.next();
          localObject3 = com.tencent.mm.af.x.FK().bl(((ha)localObject2).tVV);
          if (localObject3 == null)
          {
            localObject3 = new j();
            ((j)localObject3).field_userId = ((ha)localObject2).tVV;
            ((j)localObject3).field_userName = ((ha)localObject2).jBs;
            ((j)localObject3).field_brandUserName = ((c)localObject1).field_brandUserName;
            ((j)localObject3).field_needToUpdate = true;
            com.tencent.mm.af.x.FK().a((j)localObject3);
          }
          else if (((ha)localObject2).ver > ((j)localObject3).field_UserVersion)
          {
            ((j)localObject3).field_needToUpdate = true;
            com.tencent.mm.af.x.FK().b((j)localObject3);
          }
        }
        if ((paramString instanceof com.tencent.mm.bu.g)) {
          com.tencent.mm.kernel.h.xy().fYV.aL(l);
        }
      }
    }
  }
  
  public static void ab(String paramString1, String paramString2)
  {
    GMTrace.i(4561255268352L, 33984);
    paramString1 = new o(paramString1, paramString2);
    com.tencent.mm.kernel.h.xx().fYr.a(paramString1, 0);
    GMTrace.o(4561255268352L, 33984);
  }
  
  public static void f(com.tencent.mm.ad.k paramk)
  {
    GMTrace.i(14588527509504L, 108693);
    com.tencent.mm.kernel.h.xx().fYr.c(paramk);
    GMTrace.o(14588527509504L, 108693);
  }
  
  public final void Y(String paramString1, String paramString2)
  {
    GMTrace.i(4560315744256L, 33977);
    ??? = (Long)this.gyA.get(paramString1);
    if ((??? == null) || (((Long)???).longValue() + 5000L < System.currentTimeMillis()))
    {
      long l = System.currentTimeMillis();
      synchronized (this.gyz)
      {
        paramString2 = new a(paramString2, paramString1);
        if (this.gyy.contains(paramString2))
        {
          GMTrace.o(4560315744256L, 33977);
          return;
        }
        this.gyx.add(paramString2);
        this.gyA.put(paramString1, new Long(l));
        FX();
        GMTrace.o(4560315744256L, 33977);
        return;
      }
    }
    GMTrace.o(4560315744256L, 33977);
  }
  
  public final void Z(String paramString1, String paramString2)
  {
    GMTrace.i(4560718397440L, 33980);
    Long localLong = (Long)this.gyE.get(paramString1);
    if ((localLong == null) || (localLong.longValue() + 5000L < System.currentTimeMillis())) {
      aa(paramString1, paramString2);
    }
    GMTrace.o(4560718397440L, 33980);
  }
  
  public final void a(int paramInt1, int paramInt2, String arg3, com.tencent.mm.ad.k paramk)
  {
    GMTrace.i(4560181526528L, 33976);
    if ((paramInt1 != 0) || (paramInt2 != 0))
    {
      com.tencent.mm.sdk.platformtools.w.w("MicroMsg.BizChatNetworkMgr", "willen onSceneEnd err:Network not ok");
      if ((paramk.getType() != 1365) && (paramk.getType() != 1353))
      {
        GMTrace.o(4560181526528L, 33976);
        return;
      }
    }
    Object localObject1;
    boolean bool1;
    label332:
    label338:
    label357:
    Object localObject2;
    switch (paramk.getType())
    {
    default: 
      GMTrace.o(4560181526528L, 33976);
      return;
    case 1352: 
      localObject1 = (o)paramk;
      if ((((o)localObject1).fUa != null) && (((o)localObject1).fUa.gtD.gtK != null))
      {
        ??? = (xj)((o)localObject1).fUa.gtD.gtK;
        if ((((o)localObject1).fUa == null) || (((o)localObject1).fUa.gtC.gtK == null)) {
          break label332;
        }
      }
      for (paramk = (xi)((o)localObject1).fUa.gtC.gtK;; paramk = null)
      {
        bool1 = ((o)localObject1).gyN;
        if ((??? != null) && (???.tWa != null) && (???.tWa.ret == 0)) {
          break label357;
        }
        if ((??? == null) || (???.tWa == null)) {
          break label338;
        }
        com.tencent.mm.sdk.platformtools.w.w("MicroMsg.BizChatNetworkMgr", "willen onSceneEnd err:code:%s", new Object[] { Integer.valueOf(???.tWa.ret) });
        GMTrace.o(4560181526528L, 33976);
        return;
        ??? = null;
        break;
      }
      com.tencent.mm.sdk.platformtools.w.w("MicroMsg.BizChatNetworkMgr", "willen onSceneEnd err:resp == null");
      GMTrace.o(4560181526528L, 33976);
      return;
      a(???.ufl, paramk.tVU, bool1);
      GMTrace.o(4560181526528L, 33976);
      return;
    case 1365: 
      synchronized (this.gyz)
      {
        this.gyy.clear();
        FX();
        if ((paramInt1 != 0) || (paramInt2 != 0))
        {
          GMTrace.o(4560181526528L, 33976);
          return;
        }
      }
      paramk = (p)paramk;
      if ((paramk.fUa != null) && (paramk.fUa.gtD.gtK != null)) {
        ??? = (xh)paramk.fUa.gtD.gtK;
      }
      while ((??? == null) || (???.tWa == null) || (???.tWa.ret != 0)) {
        if ((??? != null) && (???.tWa != null))
        {
          com.tencent.mm.sdk.platformtools.w.w("MicroMsg.BizChatNetworkMgr", "willen onSceneEnd err:code:%s", new Object[] { Integer.valueOf(???.tWa.ret) });
          GMTrace.o(4560181526528L, 33976);
          return;
          ??? = null;
        }
        else
        {
          com.tencent.mm.sdk.platformtools.w.w("MicroMsg.BizChatNetworkMgr", "willen onSceneEnd err:resp == null");
          GMTrace.o(4560181526528L, 33976);
          return;
        }
      }
      ??? = ???.upd;
      if ((??? == null) || (???.size() == 0))
      {
        com.tencent.mm.sdk.platformtools.w.w("MicroMsg.BizChatNetworkMgr", "fullBizChats is empty");
        GMTrace.o(4560181526528L, 33976);
        return;
      }
      localObject1 = ???.iterator();
      if (((Iterator)localObject1).hasNext())
      {
        localObject2 = (us)((Iterator)localObject1).next();
        ??? = ((us)localObject2).umW.tVO;
        if ((??? == null) || (paramk.gyO == null)) {}
        for (??? = null;; ??? = (String)paramk.gyO.get(???))
        {
          a((us)localObject2, ???, false);
          break;
        }
      }
      GMTrace.o(4560181526528L, 33976);
      return;
    case 1353: 
      localObject1 = (r)paramk;
      localObject2 = (com.tencent.mm.af.n)((r)localObject1).data;
      if (localObject2 == null) {}
      synchronized (this.gyD)
      {
        this.gyC.clear();
        FY();
        if ((paramInt1 != 0) || (paramInt2 != 0))
        {
          GMTrace.o(4560181526528L, 33976);
          return;
        }
      }
      if ((((r)localObject1).fUa != null) && (((r)localObject1).fUa.gtD.gtK != null))
      {
        ??? = (xn)((r)localObject1).fUa.gtD.gtK;
        paramInt1 = 0;
        if ((??? == null) || (???.tWa == null) || (???.tWa.ret != 0))
        {
          if ((??? == null) || (???.tWa == null)) {
            break label1248;
          }
          com.tencent.mm.sdk.platformtools.w.w("MicroMsg.BizChatNetworkMgr", "willen onSceneEnd err:code:%s", new Object[] { Integer.valueOf(???.tWa.ret) });
          label852:
          paramInt1 = -1;
        }
        if ((paramInt1 < 0) || (???.tWb != null)) {
          break label3806;
        }
        com.tencent.mm.sdk.platformtools.w.w("MicroMsg.BizChatNetworkMgr", "resp.user==null");
        paramInt1 = -1;
      }
      break;
    }
    label917:
    label1028:
    label1166:
    label1189:
    label1248:
    label1280:
    label1292:
    label1304:
    label1418:
    label1429:
    label1487:
    label1568:
    label1587:
    label1924:
    label1994:
    label2077:
    label2159:
    label2211:
    label2336:
    label2418:
    label2470:
    label2681:
    label2805:
    label2843:
    label2910:
    label2944:
    label2954:
    label3185:
    label3191:
    label3203:
    label3209:
    label3215:
    label3385:
    label3785:
    label3788:
    label3793:
    label3798:
    label3801:
    label3806:
    for (;;)
    {
      Object localObject3;
      Object localObject4;
      boolean bool2;
      if (paramInt1 >= 0)
      {
        localObject3 = com.tencent.mm.af.x.FK().fTZ;
        long l = 0L;
        if ((localObject3 instanceof com.tencent.mm.bu.g)) {
          l = ((com.tencent.mm.bu.g)localObject3).cE(Thread.currentThread().getId());
        }
        paramInt2 = 0;
        if (paramInt2 < ???.tWb.size())
        {
          com.tencent.mm.sdk.platformtools.w.d("MicroMsg.BizChatNetworkMgr", "GetBizChatUserInfoList %s", new Object[] { ((hf)???.tWb.get(paramInt2)).jBs });
          localObject4 = new j();
          ((j)localObject4).field_userId = ((hf)???.tWb.get(paramInt2)).tVV;
          ((j)localObject4).field_userName = ((hf)???.tWb.get(paramInt2)).jBs;
          paramk = ((j)localObject4).field_userId;
          if ((paramk == null) || (((r)localObject1).gyP == null))
          {
            paramk = null;
            ((j)localObject4).field_brandUserName = paramk;
            ((j)localObject4).field_UserVersion = ((hf)???.tWb.get(paramInt2)).ver;
            ((j)localObject4).field_headImageUrl = ((hf)???.tWb.get(paramInt2)).tVP;
            ((j)localObject4).field_profileUrl = ((hf)???.tWb.get(paramInt2)).tWd;
            ((j)localObject4).field_bitFlag = ((hf)???.tWb.get(paramInt2)).tVQ;
            ((j)localObject4).field_addMemberUrl = ((hf)???.tWb.get(paramInt2)).tVT;
            ((j)localObject4).field_needToUpdate = false;
            paramk = com.tencent.mm.af.x.FK().bl(((hf)???.tWb.get(paramInt2)).tVV);
            if (paramk != null) {
              break label1280;
            }
            bool1 = false;
            bool2 = ((j)localObject4).fN(16);
            if (paramk != null) {
              break label1292;
            }
            com.tencent.mm.af.x.FK().a((j)localObject4);
            if (bool1 != bool2)
            {
              paramk = com.tencent.mm.af.x.FI().jd(((j)localObject4).field_userId);
              if (paramk != null)
              {
                if ((!bool1) || (bool2)) {
                  break label1304;
                }
                com.tencent.mm.af.x.FJ().ag(paramk.field_bizChatLocalId);
              }
            }
          }
          for (;;)
          {
            paramInt2 += 1;
            break label917;
            ??? = null;
            break;
            com.tencent.mm.sdk.platformtools.w.w("MicroMsg.BizChatNetworkMgr", "willen onSceneEnd err:resp == null");
            break label852;
            paramk = (String)((r)localObject1).gyP.get(paramk);
            break label1028;
            bool1 = paramk.fN(16);
            break label1166;
            com.tencent.mm.af.x.FK().b((j)localObject4);
            break label1189;
            if ((!bool1) && (bool2)) {
              com.tencent.mm.af.x.FJ().af(paramk.field_bizChatLocalId);
            }
          }
        }
        if ((localObject3 instanceof com.tencent.mm.bu.g)) {
          com.tencent.mm.kernel.h.xy().fYV.aL(l);
        }
      }
      if (localObject2 != null) {
        ((com.tencent.mm.af.n)localObject2).a(paramInt1, (com.tencent.mm.ad.k)localObject1);
      }
      GMTrace.o(4560181526528L, 33976);
      return;
      localObject1 = (q)paramk;
      if ((((q)localObject1).fUa != null) && (((q)localObject1).fUa.gtD.gtK != null))
      {
        ??? = (xl)((q)localObject1).fUa.gtD.gtK;
        if (((q)localObject1).fUa != null) {
          break label1568;
        }
        paramk = null;
        if ((??? != null) && (???.tWa != null) && (???.tWa.ret == 0)) {
          break label3801;
        }
        if ((??? == null) || (???.tWa == null)) {
          break label1587;
        }
        com.tencent.mm.sdk.platformtools.w.w("MicroMsg.BizChatNetworkMgr", "willen onSceneEnd err:code:%s", new Object[] { Integer.valueOf(???.tWa.ret) });
      }
      for (paramInt1 = -1;; paramInt1 = 0)
      {
        if (paramInt1 >= 0)
        {
          localObject2 = com.tencent.mm.af.x.FK();
          paramk = paramk.tVU;
          ??? = ???.tVX;
          if ((??? == null) || (bg.nm(paramk))) {
            com.tencent.mm.sdk.platformtools.w.w("MicroMsg.BizChatUserInfoStorage", "setMyUserId: wrong argument");
          }
        }
        else
        {
          ??? = (com.tencent.mm.af.n)((q)localObject1).data;
          if (??? != null) {
            ???.a(paramInt1, (com.tencent.mm.ad.k)localObject1);
          }
          GMTrace.o(4560181526528L, 33976);
          return;
          ??? = null;
          break label1418;
          paramk = (xk)((q)localObject1).fUa.gtC.gtK;
          break label1429;
          com.tencent.mm.sdk.platformtools.w.w("MicroMsg.BizChatNetworkMgr", "willen onSceneEnd err:resp == null");
          break label1487;
        }
        com.tencent.mm.sdk.platformtools.w.i("MicroMsg.BizChatUserInfoStorage", "setMyUserId:%s,%s,%s", new Object[] { paramk, ???.tVV, Boolean.valueOf(bg.nm(???.tVT)) });
        localObject3 = com.tencent.mm.af.x.FL().jn(paramk);
        if (localObject3 == null)
        {
          localObject3 = new f();
          ((f)localObject3).field_brandUserName = paramk;
          ((f)localObject3).field_userId = ???.tVV;
          com.tencent.mm.af.x.FL().a((f)localObject3);
        }
        for (;;)
        {
          localObject3 = new j();
          ((j)localObject3).field_userId = ???.tVV;
          ((j)localObject3).field_userName = ???.jBs;
          ((j)localObject3).field_brandUserName = paramk;
          ((j)localObject3).field_UserVersion = ???.ver;
          ((j)localObject3).field_headImageUrl = ???.tVP;
          ((j)localObject3).field_profileUrl = ???.tWd;
          ((j)localObject3).field_bitFlag = ???.tVQ;
          ((j)localObject3).field_needToUpdate = false;
          ((j)localObject3).field_addMemberUrl = ???.tVT;
          if (!((k)localObject2).b((j)localObject3)) {
            ((k)localObject2).a((j)localObject3);
          }
          ((k)localObject2).gya.put(paramk, ((j)localObject3).field_userId);
          break;
          ((f)localObject3).field_userId = ???.tVV;
          com.tencent.mm.af.x.FL().b((f)localObject3);
          com.tencent.mm.sdk.platformtools.w.i("MicroMsg.BizChatUserInfoStorage", "setMyUserId: MyUserId seted");
        }
        ??? = (n)paramk;
        paramk = ???.Ga();
        localObject1 = ???.Gb();
        paramInt1 = 0;
        if ((paramk == null) || (paramk.tWa == null) || (paramk.tWa.ret != 0))
        {
          if ((paramk != null) && (paramk.tWa != null))
          {
            com.tencent.mm.sdk.platformtools.w.w("MicroMsg.BizChatNetworkMgr", "willen onSceneEnd err:code:%s", new Object[] { Integer.valueOf(paramk.tWa.ret) });
            paramInt1 = -1;
          }
        }
        else
        {
          if (paramInt1 < 0) {
            break label3798;
          }
          if (!a(paramk.ufl, ((oi)localObject1).tVU, true)) {
            break label1994;
          }
          paramInt1 = 0;
        }
        for (;;)
        {
          paramk = (com.tencent.mm.af.n)???.data;
          if (paramk != null) {
            paramk.a(paramInt1, ???);
          }
          GMTrace.o(4560181526528L, 33976);
          return;
          com.tencent.mm.sdk.platformtools.w.w("MicroMsg.BizChatNetworkMgr", "willen onSceneEnd err:resp == null");
          break label1924;
          paramInt1 = -1;
          continue;
          ??? = (t)paramk;
          paramk = ???.Gc();
          paramInt1 = 0;
          if ((paramk == null) || (paramk.tWa == null) || (paramk.tWa.ret != 0))
          {
            if ((paramk != null) && (paramk.tWa != null))
            {
              com.tencent.mm.sdk.platformtools.w.w("MicroMsg.BizChatNetworkMgr", "willen onSceneEnd err:code:%s", new Object[] { Integer.valueOf(paramk.tWa.ret) });
              paramInt1 = -1;
            }
          }
          else
          {
            paramInt2 = paramInt1;
            if (paramInt1 >= 0)
            {
              paramInt2 = paramInt1;
              if (paramk.ufg == null)
              {
                paramInt2 = paramInt1;
                if (paramk.uff == null) {
                  paramInt2 = -1;
                }
              }
            }
            if (paramInt2 < 0) {
              break label3793;
            }
            if (paramk.ufg == null) {
              break label2211;
            }
            bool2 = a(paramk.ufg, paramk.tVU);
            bool1 = bool2;
            if (bool2)
            {
              ???.gyM = paramk.ufg.tVV;
              bool1 = bool2;
            }
            if (bool1) {
              break label3793;
            }
          }
          for (paramInt1 = -1;; paramInt1 = paramInt2)
          {
            paramk = (com.tencent.mm.af.n)???.data;
            if (paramk != null) {
              paramk.a(paramInt1, ???);
            }
            GMTrace.o(4560181526528L, 33976);
            return;
            com.tencent.mm.sdk.platformtools.w.w("MicroMsg.BizChatNetworkMgr", "willen onSceneEnd err:resp == null");
            break label2077;
            bool2 = a(paramk.uff, paramk.tVU, true);
            bool1 = bool2;
            if (!bool2) {
              break label2159;
            }
            ???.gyM = paramk.uff.umW.tVO;
            bool1 = bool2;
            break label2159;
            ??? = (m)paramk;
            paramk = ???.FZ();
            paramInt1 = 0;
            if ((paramk == null) || (paramk.tWa == null) || (paramk.tWa.ret != 0))
            {
              if ((paramk != null) && (paramk.tWa != null))
              {
                com.tencent.mm.sdk.platformtools.w.w("MicroMsg.BizChatNetworkMgr", "willen onSceneEnd err:code:%s", new Object[] { Integer.valueOf(paramk.tWa.ret) });
                paramInt1 = -1;
              }
            }
            else
            {
              paramInt2 = paramInt1;
              if (paramInt1 >= 0)
              {
                paramInt2 = paramInt1;
                if (paramk.ufg == null)
                {
                  paramInt2 = paramInt1;
                  if (paramk.uff == null) {
                    paramInt2 = -1;
                  }
                }
              }
              if (paramInt2 < 0) {
                break label3788;
              }
              if (paramk.ufg == null) {
                break label2470;
              }
              bool2 = a(paramk.ufg, paramk.tVU);
              bool1 = bool2;
              if (bool2)
              {
                ???.gyM = paramk.ufg.tVV;
                bool1 = bool2;
              }
              if (bool1) {
                break label3788;
              }
            }
            for (paramInt1 = -1;; paramInt1 = paramInt2)
            {
              paramk = (com.tencent.mm.af.n)???.data;
              if (paramk != null) {
                paramk.a(paramInt1, ???);
              }
              GMTrace.o(4560181526528L, 33976);
              return;
              com.tencent.mm.sdk.platformtools.w.w("MicroMsg.BizChatNetworkMgr", "willen onSceneEnd err:resp == null");
              break label2336;
              bool2 = a(paramk.uff, paramk.tVU, true);
              bool1 = bool2;
              if (!bool2) {
                break label2418;
              }
              ???.gyM = paramk.uff.umW.tVO;
              bool1 = bool2;
              break label2418;
              com.tencent.mm.sdk.platformtools.w.d("MicroMsg.BizChatNetworkMgr", "handleUpdateBizChatMemberListSceneEnd");
              localObject1 = (x)paramk;
              if ((((x)localObject1).fUa != null) && (((x)localObject1).fUa.gtD.gtK != null))
              {
                ??? = (bkk)((x)localObject1).fUa.gtD.gtK;
                if ((((x)localObject1).fUa == null) || (((x)localObject1).fUa.gtC.gtK == null)) {
                  break label2681;
                }
                paramk = (bkj)((x)localObject1).fUa.gtC.gtK;
              }
              for (;;)
              {
                if ((??? == null) || (???.tWa == null) || (???.tWa.ret != 0))
                {
                  if ((??? != null) && (???.tWa != null))
                  {
                    com.tencent.mm.sdk.platformtools.w.w("MicroMsg.BizChatNetworkMgr", "willen onSceneEnd err:code:%s", new Object[] { Integer.valueOf(???.tWa.ret) });
                    GMTrace.o(4560181526528L, 33976);
                    return;
                    ??? = null;
                    break;
                    paramk = null;
                    continue;
                  }
                  com.tencent.mm.sdk.platformtools.w.w("MicroMsg.BizChatNetworkMgr", "willen onSceneEnd err:resp == null");
                  GMTrace.o(4560181526528L, 33976);
                  return;
                }
              }
              if (a(???.ufl, paramk.tVU, false)) {}
              for (paramInt1 = 0;; paramInt1 = -1)
              {
                ??? = (com.tencent.mm.af.n)((x)localObject1).data;
                if (??? != null) {
                  ???.a(paramInt1, (com.tencent.mm.ad.k)localObject1);
                }
                GMTrace.o(4560181526528L, 33976);
                return;
              }
              localObject1 = (w)paramk;
              if ((((w)localObject1).fUa != null) && (((w)localObject1).fUa.gtD.gtK != null))
              {
                ??? = (bkm)((w)localObject1).fUa.gtD.gtK;
                if ((((w)localObject1).fUa == null) || (((w)localObject1).fUa.gtC.gtK == null)) {
                  break label3185;
                }
                paramk = (bkl)((w)localObject1).fUa.gtC.gtK;
                paramInt1 = 0;
                if ((??? == null) || (???.tWa == null) || (???.tWa.ret != 0) || (???.umW == null))
                {
                  if ((??? == null) || (???.tWa == null)) {
                    break label3191;
                  }
                  com.tencent.mm.sdk.platformtools.w.w("MicroMsg.BizChatNetworkMgr", "willen onSceneEnd err:code:%s", new Object[] { Integer.valueOf(???.tWa.ret) });
                  paramInt1 = -1;
                }
                if (paramInt1 < 0) {
                  break label3785;
                }
                localObject2 = com.tencent.mm.af.x.FI().jd(???.umW.tVO);
                if (localObject2 == null)
                {
                  if (localObject2 != null) {
                    break label3203;
                  }
                  bool1 = true;
                  if (???.umW != null) {
                    break label3209;
                  }
                  bool2 = true;
                  com.tencent.mm.sdk.platformtools.w.w("MicroMsg.BizChatNetworkMgr", "bizChatInfo == null:%s, resp.chat == null:%s", new Object[] { Boolean.valueOf(bool1), Boolean.valueOf(bool2) });
                  paramInt1 = -1;
                }
                if ((paramInt1 < 0) || (((((c)localObject2).field_bitFlag == ???.umW.tVQ) || (!((c)localObject2).FV())) && (???.umW.ver <= ((c)localObject2).field_chatVersion))) {
                  break label3215;
                }
                ((c)localObject2).field_chatType = ???.umW.type;
                ((c)localObject2).field_headImageUrl = ???.umW.tVP;
                ((c)localObject2).field_chatName = ???.umW.name;
                ((c)localObject2).field_chatVersion = ???.umW.ver;
                ((c)localObject2).field_needToUpdate = false;
                ((c)localObject2).field_bitFlag = ???.umW.tVQ;
                ((c)localObject2).field_maxMemberCnt = ???.umW.tVR;
                ((c)localObject2).field_ownerUserId = ???.umW.tVS;
                ((c)localObject2).field_addMemberUrl = ???.umW.tVT;
                ((c)localObject2).field_brandUserName = paramk.tVU;
                com.tencent.mm.af.x.FI().b((c)localObject2);
              }
              for (;;)
              {
                ??? = (com.tencent.mm.af.n)((w)localObject1).data;
                if (??? != null) {
                  ???.a(paramInt1, (com.tencent.mm.ad.k)localObject1);
                }
                GMTrace.o(4560181526528L, 33976);
                return;
                ??? = null;
                break label2805;
                paramk = null;
                break label2843;
                com.tencent.mm.sdk.platformtools.w.w("MicroMsg.BizChatNetworkMgr", "willen onSceneEnd err:resp == null");
                break label2910;
                bool1 = false;
                break label2944;
                bool2 = false;
                break label2954;
                paramInt1 = -1;
                continue;
                GMTrace.o(4560181526528L, 33976);
                return;
                paramk = (s)paramk;
                if ((paramk.fUa != null) && (paramk.fUa.gtD.gtK != null))
                {
                  ??? = (aai)paramk.fUa.gtD.gtK;
                  if ((paramk.fUa == null) || (paramk.fUa.gtC.gtK == null)) {
                    break label3385;
                  }
                  paramk = (aah)paramk.fUa.gtC.gtK;
                }
                for (;;)
                {
                  if ((??? == null) || (???.tWa == null) || (???.tWa.ret != 0))
                  {
                    if ((??? != null) && (???.tWa != null))
                    {
                      com.tencent.mm.sdk.platformtools.w.w("MicroMsg.BizChatNetworkMgr", "willen onSceneEnd err:code:%s", new Object[] { Integer.valueOf(???.tWa.ret) });
                      GMTrace.o(4560181526528L, 33976);
                      return;
                      ??? = null;
                      break;
                      paramk = null;
                      continue;
                    }
                    com.tencent.mm.sdk.platformtools.w.w("MicroMsg.BizChatNetworkMgr", "willen onSceneEnd err:resp == null");
                    GMTrace.o(4560181526528L, 33976);
                    return;
                  }
                }
                localObject2 = ???.uqZ;
                localObject3 = com.tencent.mm.af.x.FI();
                localObject4 = paramk.tVU;
                localObject1 = new ArrayList();
                StringBuilder localStringBuilder = new StringBuilder();
                localStringBuilder.append("select bizChatServId from BizChatInfo");
                localStringBuilder.append(" where brandUserName = '").append((String)localObject4).append("'");
                localStringBuilder.append(" and (bitFlag & 8").append(") != 0 ");
                localObject3 = ((d)localObject3).rawQuery(localStringBuilder.toString(), new String[0]);
                if (localObject3 != null)
                {
                  if (((Cursor)localObject3).moveToFirst()) {
                    do
                    {
                      ((ArrayList)localObject1).add(((Cursor)localObject3).getString(0));
                    } while (((Cursor)localObject3).moveToNext());
                  }
                  ((Cursor)localObject3).close();
                }
                localObject3 = ((List)localObject1).iterator();
                while (((Iterator)localObject3).hasNext())
                {
                  localObject4 = (String)((Iterator)localObject3).next();
                  if (!((List)localObject2).contains(localObject4))
                  {
                    localObject4 = com.tencent.mm.af.x.FI().jd((String)localObject4);
                    if (localObject4 != null)
                    {
                      ((c)localObject4).field_bitFlag &= 0xFFFFFFF7;
                      com.tencent.mm.af.x.FI().b((c)localObject4);
                    }
                  }
                }
                localObject2 = ((List)localObject2).iterator();
                while (((Iterator)localObject2).hasNext())
                {
                  localObject3 = (String)((Iterator)localObject2).next();
                  if (!((List)localObject1).contains(localObject3))
                  {
                    localObject4 = com.tencent.mm.af.x.FI().jd((String)localObject3);
                    if (localObject4 == null)
                    {
                      localObject4 = new c();
                      ((c)localObject4).field_bizChatServId = ((String)localObject3);
                      ((c)localObject4).field_brandUserName = paramk.tVU;
                      ((c)localObject4).field_bitFlag |= 0x8;
                      com.tencent.mm.af.x.FI().a((c)localObject4);
                    }
                    else
                    {
                      ((c)localObject4).field_bitFlag |= 0x8;
                      com.tencent.mm.af.x.FI().b((c)localObject4);
                    }
                  }
                }
                a(???.uqZ, paramk.tVU);
                break;
              }
            }
          }
        }
      }
    }
  }
  
  public final void a(LinkedList<String> paramLinkedList, String paramString)
  {
    GMTrace.i(4560449961984L, 33978);
    long l = System.currentTimeMillis();
    synchronized (this.gyz)
    {
      paramLinkedList = paramLinkedList.iterator();
      while (paramLinkedList.hasNext())
      {
        String str = (String)paramLinkedList.next();
        a locala = new a(paramString, str);
        if (!this.gyy.contains(locala))
        {
          this.gyx.add(locala);
          this.gyA.put(str, new Long(l));
        }
      }
    }
    FX();
    GMTrace.o(4560449961984L, 33978);
  }
  
  public final void aa(String paramString1, String paramString2)
  {
    GMTrace.i(4560852615168L, 33981);
    long l = System.currentTimeMillis();
    synchronized (this.gyD)
    {
      paramString2 = new a(paramString2, paramString1);
      if (this.gyC.contains(paramString2))
      {
        GMTrace.o(4560852615168L, 33981);
        return;
      }
      this.gyB.add(paramString2);
      this.gyE.put(paramString1, new Long(l));
      FY();
      GMTrace.o(4560852615168L, 33981);
      return;
    }
  }
  
  public final void b(LinkedList<String> paramLinkedList, String paramString)
  {
    GMTrace.i(4560986832896L, 33982);
    long l = System.currentTimeMillis();
    synchronized (this.gyD)
    {
      paramLinkedList = paramLinkedList.iterator();
      if (paramLinkedList.hasNext())
      {
        String str = (String)paramLinkedList.next();
        a locala = new a(paramString, str);
        if (this.gyC.contains(locala))
        {
          GMTrace.o(4560986832896L, 33982);
          return;
        }
        this.gyB.add(locala);
        this.gyE.put(str, new Long(l));
      }
    }
    FY();
    GMTrace.o(4560986832896L, 33982);
  }
  
  protected final void finalize()
  {
    GMTrace.i(4560047308800L, 33975);
    com.tencent.mm.kernel.h.xx().fYr.b(1352, this);
    com.tencent.mm.kernel.h.xx().fYr.b(1365, this);
    com.tencent.mm.kernel.h.xx().fYr.b(1353, this);
    com.tencent.mm.kernel.h.xx().fYr.b(1354, this);
    com.tencent.mm.kernel.h.xx().fYr.b(1357, this);
    com.tencent.mm.kernel.h.xx().fYr.b(1356, this);
    com.tencent.mm.kernel.h.xx().fYr.b(1355, this);
    com.tencent.mm.kernel.h.xx().fYr.b(1358, this);
    com.tencent.mm.kernel.h.xx().fYr.b(1367, this);
    com.tencent.mm.kernel.h.xx().fYr.b(1361, this);
    com.tencent.mm.kernel.h.xx().fYr.b(1389, this);
    com.tencent.mm.kernel.h.xx().fYr.b(1315, this);
    super.finalize();
    GMTrace.o(4560047308800L, 33975);
  }
  
  public static class a
  {
    public String eOB;
    public String id;
    
    public a(String paramString1, String paramString2)
    {
      GMTrace.i(4583132758016L, 34147);
      this.eOB = paramString1;
      this.id = paramString2;
      GMTrace.o(4583132758016L, 34147);
    }
    
    public boolean equals(Object paramObject)
    {
      GMTrace.i(4583266975744L, 34148);
      if (paramObject.getClass() != a.class)
      {
        GMTrace.o(4583266975744L, 34148);
        return false;
      }
      paramObject = (a)paramObject;
      if (((this.eOB == null) && (((a)paramObject).eOB == null)) || ((this.eOB != null) && (this.eOB.equals(((a)paramObject).eOB)) && (((this.id == null) && (((a)paramObject).id == null)) || ((this.id != null) && (this.id.equals(((a)paramObject).id))))))
      {
        GMTrace.o(4583266975744L, 34148);
        return true;
      }
      GMTrace.o(4583266975744L, 34148);
      return false;
    }
    
    public int hashCode()
    {
      GMTrace.i(4583401193472L, 34149);
      int i = this.eOB.hashCode();
      int j = this.id.hashCode();
      GMTrace.o(4583401193472L, 34149);
      return i + j;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\af\a\h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */