package com.tencent.mm.plugin.sns.model;

import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.modelsfs.FileOp;
import com.tencent.mm.plugin.sns.data.i;
import com.tencent.mm.plugin.sns.g.a;
import com.tencent.mm.plugin.sns.storage.h;
import com.tencent.mm.plugin.sns.storage.k;
import com.tencent.mm.plugin.sns.storage.l;
import com.tencent.mm.plugin.sns.storage.m;
import com.tencent.mm.plugin.sns.storage.n;
import com.tencent.mm.plugin.sns.storage.r;
import com.tencent.mm.plugin.sns.storage.s;
import com.tencent.mm.plugin.sns.storage.t;
import com.tencent.mm.protocal.c.agq;
import com.tencent.mm.protocal.c.amb;
import com.tencent.mm.protocal.c.anu;
import com.tencent.mm.protocal.c.anv;
import com.tencent.mm.protocal.c.anx;
import com.tencent.mm.protocal.c.aug;
import com.tencent.mm.protocal.c.azp;
import com.tencent.mm.protocal.c.beq;
import com.tencent.mm.protocal.c.ber;
import com.tencent.mm.protocal.c.bew;
import com.tencent.mm.protocal.c.bfd;
import com.tencent.mm.protocal.c.bfh;
import com.tencent.mm.protocal.c.bfp;
import com.tencent.mm.protocal.c.bfw;
import com.tencent.mm.protocal.c.biz;
import com.tencent.mm.protocal.c.cc;
import com.tencent.mm.protocal.c.oa;
import com.tencent.mm.sdk.e.e;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public final class ai
{
  private static Map<String, bfh> pvq;
  
  static
  {
    GMTrace.i(8127688736768L, 60556);
    pvq = new ConcurrentHashMap();
    GMTrace.o(8127688736768L, 60556);
  }
  
  public static boolean F(int paramInt, boolean paramBoolean)
  {
    GMTrace.i(8126078124032L, 60544);
    if (paramBoolean)
    {
      if (paramInt > 0)
      {
        GMTrace.o(8126078124032L, 60544);
        return true;
      }
      GMTrace.o(8126078124032L, 60544);
      return false;
    }
    GMTrace.o(8126078124032L, 60544);
    return false;
  }
  
  public static m Hu(String paramString)
  {
    GMTrace.i(8124467511296L, 60532);
    paramString = ae.bjd().a(true, paramString, 1, false, "");
    if (paramString.getCount() == 0)
    {
      paramString.close();
      GMTrace.o(8124467511296L, 60532);
      return null;
    }
    paramString.moveToFirst();
    m localm = new m();
    localm.b(paramString);
    if (!paramString.isClosed()) {
      paramString.close();
    }
    GMTrace.o(8124467511296L, 60532);
    return localm;
  }
  
  public static boolean Hv(String paramString)
  {
    GMTrace.i(8126346559488L, 60546);
    boolean bool = com.tencent.mm.y.q.zE().equals(paramString.trim());
    GMTrace.o(8126346559488L, 60546);
    return bool;
  }
  
  public static String Hw(String paramString)
  {
    GMTrace.i(8126614994944L, 60548);
    int i = 1;
    LinkedList localLinkedList = new LinkedList();
    Object localObject = ae.bjj().getCursor();
    if (((Cursor)localObject).moveToFirst()) {
      do
      {
        s locals = new s();
        locals.b((Cursor)localObject);
        localLinkedList.add(bg.aq(locals.field_tagName, ""));
      } while (((Cursor)localObject).moveToNext());
    }
    ((Cursor)localObject).close();
    localObject = paramString;
    while (localLinkedList.contains(localObject))
    {
      localObject = paramString + i;
      i += 1;
    }
    GMTrace.o(8126614994944L, 60548);
    return (String)localObject;
  }
  
  public static List<com.tencent.mm.plugin.sns.g.b> Hx(String paramString)
  {
    GMTrace.i(8127151865856L, 60552);
    ArrayList localArrayList = new ArrayList();
    if (ae.biM())
    {
      GMTrace.o(8127151865856L, 60552);
      return localArrayList;
    }
    Object localObject = h.Is(paramString);
    if (localObject == null)
    {
      GMTrace.o(8127151865856L, 60552);
      return localArrayList;
    }
    localObject = ((m)localObject).blD();
    if ((((biz)localObject).uUc == null) || (((biz)localObject).uUc.ueW.size() == 0))
    {
      GMTrace.o(8127151865856L, 60552);
      return localArrayList;
    }
    localArrayList.clear();
    Iterator localIterator = ((biz)localObject).uUc.ueW.iterator();
    int i = 0;
    while (localIterator.hasNext())
    {
      anu localanu = (anu)localIterator.next();
      com.tencent.mm.plugin.sns.g.b localb = new com.tencent.mm.plugin.sns.g.b();
      localb.eUs = localanu;
      localb.pyW = paramString;
      localb.gGY = ((biz)localObject).nFd;
      localb.pyX = i;
      localArrayList.add(localb);
      i += 1;
    }
    GMTrace.o(8127151865856L, 60552);
    return localArrayList;
  }
  
  private static long a(m paramm, bfh parambfh, String paramString, int paramInt)
  {
    GMTrace.i(8125541253120L, 60540);
    m localm = paramm;
    if (paramm == null) {
      localm = new m();
    }
    long l;
    if (!ae.bjc().dF(localm.field_snsId))
    {
      l = parambfh.tXT;
      GMTrace.o(8125541253120L, 60540);
      return l;
    }
    int i;
    if (parambfh.uQX != 0)
    {
      w.i("MicroMsg.SnsInfoStorageLogic", "hit the filter id:" + parambfh.tXT + "  " + i.dt(parambfh.tXT));
      i = 0;
      if (!localm.uX(paramInt))
      {
        localm.uV(paramInt);
        i = 1;
      }
      if (i != 0) {
        ae.bjd().a(parambfh.tXT, localm);
      }
      l = parambfh.tXT;
      GMTrace.o(8125541253120L, 60540);
      return l;
    }
    paramm = parambfh.uQT;
    w.i("MicroMsg.SnsInfoStorageLogic", "hasChange id:  %s listSize %s Stringid %s", new Object[] { Long.valueOf(parambfh.tXT), Integer.valueOf(paramm.size()), i.dt(parambfh.tXT) });
    if ((parambfh.uQM == null) || (parambfh.uQM.uNP == null))
    {
      w.i("MicroMsg.SnsInfoStorageLogic", "object desc is null");
      l = parambfh.tXT;
      GMTrace.o(8125541253120L, 60540);
      return l;
    }
    paramm = new String(parambfh.uQM.uNP.toByteArray());
    w.d("MicroMsg.SnsInfoStorageLogic", "from server %d ", new Object[] { Long.valueOf(parambfh.tXT) });
    if (bg.nm(paramm))
    {
      l = parambfh.tXT;
      GMTrace.o(8125541253120L, 60540);
      return l;
    }
    if (!localm.Iq(paramm))
    {
      l = parambfh.tXT;
      GMTrace.o(8125541253120L, 60540);
      return l;
    }
    parambfh.uRd = b(parambfh.uRd, localm.field_attrBuf);
    w.d("MicroMsg.SnsInfoStorageLogic", "from server xml ok %d", new Object[] { Long.valueOf(parambfh.tXT) });
    parambfh.uQM.be(new byte[0]);
    localm.field_userName = parambfh.tRz;
    localm.gl(parambfh.nFd);
    localm.field_likeFlag = parambfh.uQN;
    localm.dQ(parambfh.tXT);
    localm.dS(parambfh.tXT);
    localm.uV(paramInt);
    for (;;)
    {
      try
      {
        l = bg.Pw();
      }
      catch (Exception paramm)
      {
        int j;
        w.printErrStackTrace("MicroMsg.SnsInfoStorageLogic", paramm, "", new Object[0]);
        continue;
        i = 0;
        continue;
        localm.blW();
        continue;
        if ((j != 1) && ((paramString.equals(parambfh.tRz)) || (paramInt != 4))) {
          continue;
        }
        localm.blS();
        localm.c(paramm);
        localm.field_type = paramm.uUc.ueV;
        localm.field_subType = paramm.uUc.ueX;
        ae.bjd().a(parambfh.tXT, localm);
        l = parambfh.tXT;
        GMTrace.o(8125541253120L, 60540);
      }
      try
      {
        if (localm.field_type == 15)
        {
          paramm = (bfh)new bfh().aD(localm.field_attrBuf);
          if ((paramm != null) && (paramm.uRf != null) && (paramm.uRf.uJC > 0))
          {
            parambfh.uRf = paramm.uRf;
            w.i("MicroMsg.SnsInfoStorageLogic", "mergePreloadInfo predownload info [%d %d %s] cost[%d]", new Object[] { Integer.valueOf(parambfh.uRf.uJC), Integer.valueOf(parambfh.uRf.uJD), parambfh.uRf.uJE, Long.valueOf(bg.aI(l)) });
          }
        }
      }
      catch (Exception paramm)
      {
        w.e("MicroMsg.SnsInfoStorageLogic", "mergePreloadInfo error %s", new Object[] { paramm.toString() });
      }
    }
    localm.aE(parambfh.toByteArray());
    paramm = localm.blD();
    paramm.jhi = parambfh.tRz;
    j = paramm.uCQ;
    localm.field_pravited = j;
    w.i("MicroMsg.SnsInfoStorageLogic", "ext flag %s  extflag %s", new Object[] { Long.valueOf(parambfh.tXT), Integer.valueOf(parambfh.uEI) });
    if ((parambfh.uEI & 0x1) > 0)
    {
      i = 1;
      if (i == 0) {
        break label734;
      }
      localm.blV();
      if ((j != 1) || (paramInt == 4)) {
        break label742;
      }
      w.e("MicroMsg.SnsInfoStorageLogic", "svr error push me the private pic in timelnie or others");
      GMTrace.o(8125541253120L, 60540);
      return 0L;
    }
    label734:
    label742:
    return l;
  }
  
  public static anu a(m paramm, int paramInt)
  {
    GMTrace.i(8127017648128L, 60551);
    if (ae.biM())
    {
      GMTrace.o(8127017648128L, 60551);
      return null;
    }
    if (paramm == null)
    {
      GMTrace.o(8127017648128L, 60551);
      return null;
    }
    paramm = paramm.blD();
    if ((paramm.uUc == null) || (paramm.uUc.ueW.size() == 0) || (paramm.uUc.ueW.size() <= paramInt))
    {
      GMTrace.o(8127017648128L, 60551);
      return null;
    }
    paramm = (anu)paramm.uUc.ueW.get(paramInt);
    GMTrace.o(8127017648128L, 60551);
    return paramm;
  }
  
  public static anu a(m paramm, String paramString)
  {
    GMTrace.i(16340471513088L, 121746);
    paramm = paramm.blD();
    if ((paramm.uUc == null) || (paramm.uUc.ueW.size() == 0))
    {
      GMTrace.o(16340471513088L, 121746);
      return null;
    }
    paramm = paramm.uUc.ueW.iterator();
    while (paramm.hasNext())
    {
      anu localanu = (anu)paramm.next();
      if (localanu.mmR.equals(paramString))
      {
        GMTrace.o(16340471513088L, 121746);
        return localanu;
      }
    }
    GMTrace.o(16340471513088L, 121746);
    return null;
  }
  
  public static List<m> a(String paramString1, boolean paramBoolean1, String paramString2, boolean paramBoolean2)
  {
    GMTrace.i(8124333293568L, 60531);
    if (paramBoolean2) {}
    for (paramString1 = ae.bjd().a(false, paramString1, 10, paramBoolean1, paramString2);; paramString1 = ae.bjd().a(false, paramString1, 0, paramBoolean1, paramString2))
    {
      paramString2 = new ArrayList();
      if (paramString1.getCount() != 0) {
        break;
      }
      paramString1.close();
      GMTrace.o(8124333293568L, 60531);
      return paramString2;
    }
    if (paramString1.moveToFirst()) {
      do
      {
        m localm = new m();
        localm.b(paramString1);
        paramString2.add(localm);
      } while (paramString1.moveToNext());
    }
    paramString1.close();
    GMTrace.o(8124333293568L, 60531);
    return paramString2;
  }
  
  public static void a(String paramString1, int paramInt, LinkedList<bfh> paramLinkedList, String paramString2)
  {
    GMTrace.i(8125943906304L, 60543);
    if ((paramLinkedList == null) || (paramLinkedList.isEmpty()))
    {
      GMTrace.o(8125943906304L, 60543);
      return;
    }
    Object localObject3 = ae.bjd();
    ArrayList localArrayList = new ArrayList();
    LinkedList localLinkedList = new LinkedList();
    int i = 0;
    Object localObject2;
    while (i < paramLinkedList.size())
    {
      bfh localbfh = (bfh)paramLinkedList.get(i);
      localObject2 = ((n)localObject3).dU(localbfh.tXT);
      localObject1 = localObject2;
      if (localObject2 == null) {
        localObject1 = new m();
      }
      if (a((m)localObject1, localbfh, paramString1, paramInt) != 0L)
      {
        if ((localLinkedList.size() < 3) && ((((m)localObject1).field_type == 1) || (((m)localObject1).field_type == 15))) {
          localLinkedList.add(i.dt(((m)localObject1).field_snsId));
        }
        localArrayList.add(Long.valueOf(localbfh.tXT));
      }
      i += 1;
    }
    if (((paramInt == 4) || (paramInt == 8)) && (paramString2.equals("")))
    {
      localObject1 = ae.bjh().Iw(paramString1);
      if (localObject1 != null)
      {
        localObject1 = ((k)localObject1).field_newerIds;
        localObject1 = bg.g(bg.aq((String)localObject1, "").split(","));
        w.d("MicroMsg.SnsInfoStorageLogic", "newerIds " + bt(localLinkedList));
        label277:
        do
        {
          if ((localLinkedList.size() >= 3) || (((List)localObject1).size() <= 0)) {
            break;
          }
          localObject2 = (String)((List)localObject1).remove(0);
        } while (localObject2 == null);
        i = 0;
      }
      for (;;)
      {
        if (i < localLinkedList.size())
        {
          localObject3 = (String)localLinkedList.get(i);
          if (((String)localObject2).compareTo((String)localObject3) != 0)
          {
            if (((String)localObject2).compareTo((String)localObject3) <= 0) {
              break label407;
            }
            localLinkedList.add(0, localObject2);
          }
        }
        if (localLinkedList.contains(localObject2)) {
          break label277;
        }
        localLinkedList.add(localObject2);
        break label277;
        localObject1 = "";
        break;
        label407:
        i += 1;
      }
      w.i("MicroMsg.SnsInfoStorageLogic", "merge newerIds " + bt(localLinkedList));
      ae.bjh().dO(paramString1, bt(localLinkedList));
    }
    Object localObject1 = i.GW(i.dt(((bfh)paramLinkedList.getLast()).tXT));
    w.d("MicroMsg.SnsInfoStorageLogic", "FIlTER SEQ :: " + paramString2 + "  -  " + (String)localObject1);
    if (paramInt == 2)
    {
      localObject2 = ae.bjd();
      paramLinkedList = n.bmq();
      if (paramString2 != null)
      {
        paramString1 = paramLinkedList;
        if (paramString2.equals("")) {}
      }
      else
      {
        paramString1 = paramLinkedList + " AND " + ((n)localObject2).IE(paramString2);
      }
      paramLinkedList = paramString1;
      if (n.IA((String)localObject1)) {
        paramLinkedList = paramString1 + " AND " + ((n)localObject2).IB((String)localObject1);
      }
      w.d("MicroMsg.SnsInfoStorage", "getCursorByUserSeq " + paramLinkedList);
      paramString1 = ((n)localObject2).fTZ.rawQuery(paramLinkedList, null);
      if (paramString1 == null) {
        GMTrace.o(8125943906304L, 60543);
      }
    }
    else
    {
      localObject2 = ae.bjd();
      if (paramInt == 4) {}
      for (boolean bool = true;; bool = false)
      {
        paramLinkedList = n.d(true, paramString1, bool);
        paramString1 = paramLinkedList;
        if (n.IA(paramString2)) {
          paramString1 = paramLinkedList + " AND " + ((n)localObject2).IE(paramString2);
        }
        paramLinkedList = paramString1;
        if (n.IA((String)localObject1)) {
          paramLinkedList = paramString1 + " AND " + ((n)localObject2).IB((String)localObject1);
        }
        w.d("MicroMsg.SnsInfoStorage", "getCursorByUserSeq " + paramLinkedList);
        paramString1 = ((n)localObject2).fTZ.rawQuery(paramLinkedList, null);
        break;
      }
    }
    if (!paramString1.moveToFirst())
    {
      paramString1.close();
      GMTrace.o(8125943906304L, 60543);
      return;
    }
    for (;;)
    {
      paramLinkedList = new m();
      paramLinkedList.b(paramString1);
      long l = paramLinkedList.field_snsId;
      if (paramLinkedList.blZ()) {
        w.d("MicroMsg.SnsInfoStorageLogic", "uploading one ");
      }
      while (!paramString1.moveToNext())
      {
        paramString1.close();
        GMTrace.o(8125943906304L, 60543);
        return;
        if (paramLinkedList.bma())
        {
          w.d("MicroMsg.SnsInfoStorageLogic", "die one ");
        }
        else if (!localArrayList.contains(Long.valueOf(l)))
        {
          paramLinkedList.uY(paramInt);
          ae.bjd().b(l, paramLinkedList);
          w.i("MicroMsg.SnsInfoStorageLogic", "removeSourceFlag sns Id " + l + " source " + paramInt);
        }
      }
    }
  }
  
  public static boolean a(long paramLong, ber paramber)
  {
    GMTrace.i(8125272817664L, 60538);
    beq localbeq = paramber.uQt;
    if ((localbeq.jib != 1) && (localbeq.jib != 2))
    {
      GMTrace.o(8125272817664L, 60538);
      return true;
    }
    m localm = ae.bjd().dU(paramLong);
    if (localm == null)
    {
      GMTrace.o(8125272817664L, 60538);
      return true;
    }
    if ((localm.field_type == 21) && (!com.tencent.mm.plugin.sns.lucky.a.g.bhX()))
    {
      w.i("MicroMsg.SnsInfoStorageLogic", "passed because close lucky");
      GMTrace.o(8125272817664L, 60538);
      return false;
    }
    for (;;)
    {
      try
      {
        localbfh = (bfh)new bfh().aD(localm.field_attrBuf);
        localbfh.tXT = paramLong;
        if (localbeq.jib != 1) {
          continue;
        }
        localIterator = localbfh.uQQ.iterator();
        if (localIterator.hasNext())
        {
          localbew = (bew)localIterator.next();
          if (localbew.nFd != localbeq.nFd) {
            continue;
          }
          bool = localbew.tRz.equals(localbeq.uKB);
          if (!bool) {
            continue;
          }
          GMTrace.o(8125272817664L, 60538);
          return true;
        }
        localbfh.uQQ.add(ac.a(paramber));
        localm.aE(localbfh.toByteArray());
        ae.bjd().a(localbfh.tXT, localm);
      }
      catch (Exception paramber)
      {
        bfh localbfh;
        Iterator localIterator;
        bew localbew;
        boolean bool;
        w.printErrStackTrace("MicroMsg.SnsInfoStorageLogic", paramber, "", new Object[0]);
        continue;
      }
      GMTrace.o(8125272817664L, 60538);
      return true;
      if (localbeq.jib == 2)
      {
        localIterator = localbfh.uQT.iterator();
        if (localIterator.hasNext())
        {
          localbew = (bew)localIterator.next();
          if (localbew.nFd == localbeq.nFd)
          {
            bool = localbew.tRz.equals(localbeq.uKB);
            if (bool)
            {
              GMTrace.o(8125272817664L, 60538);
              return true;
            }
          }
        }
        else
        {
          localbfh.uQT.add(ac.a(paramber));
        }
      }
    }
  }
  
  public static azp b(azp paramazp, byte[] paramArrayOfByte)
  {
    GMTrace.i(8125675470848L, 60541);
    if (paramArrayOfByte != null) {}
    for (;;)
    {
      try
      {
        azp localazp = ((bfh)new bfh().aD(paramArrayOfByte)).uRd;
        if (paramazp == null)
        {
          GMTrace.o(8125675470848L, 60541);
          return localazp;
        }
        bfp localbfp = new bfp();
        paramArrayOfByte = localbfp;
        if (localazp != null) {
          paramArrayOfByte = (bfp)localbfp.aD(localazp.uNP.tJp);
        }
        paramazp = (bfp)new bfp().aD(paramazp.uNP.tJp);
        if (paramazp.uRs == null) {
          paramazp.uRs = paramArrayOfByte.uRs;
        }
        if (paramArrayOfByte.uRr == null)
        {
          paramazp.uRr = null;
          paramazp = paramazp.toByteArray();
          paramazp = new azp().be(paramazp);
          GMTrace.o(8125675470848L, 60541);
          return paramazp;
        }
        if (paramazp.uRr == null)
        {
          paramazp.uRr = paramArrayOfByte.uRr;
          continue;
          localazp = null;
        }
      }
      catch (Exception paramazp)
      {
        w.printErrStackTrace("MicroMsg.SnsInfoStorageLogic", paramazp, "", new Object[0]);
        GMTrace.o(8125675470848L, 60541);
        return null;
      }
    }
  }
  
  public static void b(long paramLong, ber paramber)
  {
    GMTrace.i(8125004382208L, 60536);
    paramber = paramber.uQt;
    if (paramber.jib != 9)
    {
      GMTrace.o(8125004382208L, 60536);
      return;
    }
    m localm = ae.bjd().dU(paramLong);
    if (localm == null)
    {
      GMTrace.o(8125004382208L, 60536);
      return;
    }
    try
    {
      bfh localbfh = (bfh)new bfh().aD(localm.field_attrBuf);
      localbfh.tXT = paramLong;
      Iterator localIterator = localbfh.uQT.iterator();
      while (localIterator.hasNext())
      {
        bew localbew = (bew)localIterator.next();
        if ((localbew.uQm == paramber.uQm) && (!bg.nm(localbew.tRz)) && (localbew.tRz.equals(paramber.uKB))) {
          localbfh.uQT.remove(localbew);
        }
      }
      localm.aE(localbfh.toByteArray());
      ae.bjd().a(localbfh.tXT, localm);
      GMTrace.o(8125004382208L, 60536);
      return;
    }
    catch (Exception paramber)
    {
      w.printErrStackTrace("MicroMsg.SnsInfoStorageLogic", paramber, "", new Object[0]);
      GMTrace.o(8125004382208L, 60536);
    }
  }
  
  public static void bjw()
  {
    GMTrace.i(8124601729024L, 60533);
    if (pvq != null) {
      pvq.clear();
    }
    GMTrace.o(8124601729024L, 60533);
  }
  
  public static List<m> bjx()
  {
    GMTrace.i(8126480777216L, 60547);
    ArrayList localArrayList = new ArrayList();
    Object localObject1 = ae.bjd();
    Object localObject2 = n.bmr() + " AND " + n.pMA + " AND  (snsId = 0  ) ";
    localObject1 = ((n)localObject1).fTZ.rawQuery((String)localObject2, null);
    if (((Cursor)localObject1).getCount() == 0)
    {
      ((Cursor)localObject1).close();
      GMTrace.o(8126480777216L, 60547);
      return localArrayList;
    }
    ((Cursor)localObject1).moveToFirst();
    do
    {
      localObject2 = new m();
      ((m)localObject2).b((Cursor)localObject1);
      localArrayList.add(localObject2);
    } while (((Cursor)localObject1).moveToNext());
    ((Cursor)localObject1).close();
    GMTrace.o(8126480777216L, 60547);
    return localArrayList;
  }
  
  public static void bjy()
  {
    GMTrace.i(8127554519040L, 60555);
    Cursor localCursor = ae.bjd().bS("", 0);
    if (localCursor != null)
    {
      w.i("MicroMsg.SnsInfoStorageLogic", "all timeline snsId begin");
      while (localCursor.moveToNext())
      {
        m localm = new m();
        localm.b(localCursor);
        w.i("MicroMsg.SnsInfoStorageLogic", localm.blE());
      }
      w.i("MicroMsg.SnsInfoStorageLogic", "all timeline snsId end");
      localCursor.close();
    }
    GMTrace.o(8127554519040L, 60555);
  }
  
  private static String bt(List<String> paramList)
  {
    GMTrace.i(8125809688576L, 60542);
    Iterator localIterator = paramList.iterator();
    paramList = "";
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      if (paramList.length() == 0) {
        paramList = str;
      } else {
        paramList = paramList + "," + str;
      }
    }
    GMTrace.o(8125809688576L, 60542);
    return paramList;
  }
  
  public static List<com.tencent.mm.plugin.sns.g.b> bu(List<String> paramList)
  {
    GMTrace.i(8127286083584L, 60553);
    ArrayList localArrayList = new ArrayList();
    if (paramList == null)
    {
      GMTrace.o(8127286083584L, 60553);
      return localArrayList;
    }
    localArrayList.clear();
    paramList = paramList.iterator();
    int i = 0;
    while (paramList.hasNext())
    {
      String str = (String)paramList.next();
      com.tencent.mm.plugin.sns.g.b localb = new com.tencent.mm.plugin.sns.g.b();
      anu localanu = new anu();
      localanu.mmR = ("pre_temp_extend_pic" + str);
      localb.eUs = localanu;
      localb.pyW = "";
      localb.pyX = i;
      localArrayList.add(localb);
      i += 1;
    }
    GMTrace.o(8127286083584L, 60553);
    return localArrayList;
  }
  
  public static void c(long paramLong, ber paramber)
  {
    GMTrace.i(8125138599936L, 60537);
    paramber = paramber.uQt;
    if (paramber.jib != 13)
    {
      GMTrace.o(8125138599936L, 60537);
      return;
    }
    m localm = ae.bjd().dU(paramLong);
    if (localm == null)
    {
      GMTrace.o(8125138599936L, 60537);
      return;
    }
    try
    {
      bfh localbfh = (bfh)new bfh().aD(localm.field_attrBuf);
      localbfh.tXT = paramLong;
      if (localbfh.uRe == null) {
        localbfh.uRe = new bfw();
      }
      if (paramber.jib == 13)
      {
        Object localObject = localbfh.uRe.uRH.iterator();
        while (((Iterator)localObject).hasNext())
        {
          boolean bool = ((bfd)((Iterator)localObject).next()).tRz.equals(paramber.uKB);
          if (bool)
          {
            GMTrace.o(8125138599936L, 60537);
            return;
          }
        }
        localObject = new bfd();
        ((bfd)localObject).uQq = paramber.uQq;
        ((bfd)localObject).nFd = paramber.nFd;
        ((bfd)localObject).tRz = paramber.uKB;
        localbfh.uRe.uRH.add(localObject);
        localbfh.uRe.uRG = localbfh.uRe.uRH.size();
      }
      localm.aE(localbfh.toByteArray());
      ae.bjd().a(localbfh.tXT, localm);
      GMTrace.o(8125138599936L, 60537);
      return;
    }
    catch (Exception paramber)
    {
      w.e("MicroMsg.SnsInfoStorageLogic", "error for update hbaction " + paramber.getMessage());
      w.printErrStackTrace("MicroMsg.SnsInfoStorageLogic", paramber, "", new Object[0]);
      GMTrace.o(8125138599936L, 60537);
    }
  }
  
  public static long d(bfh parambfh)
  {
    GMTrace.i(8125407035392L, 60539);
    m localm2 = ae.bjd().dU(parambfh.tXT);
    m localm1 = localm2;
    if (localm2 == null) {
      localm1 = new m();
    }
    long l = a(localm1, parambfh, "", 0);
    GMTrace.o(8125407035392L, 60539);
    return l;
  }
  
  public static List<com.tencent.mm.plugin.sns.g.b> dD(String paramString1, String paramString2)
  {
    int i = 0;
    GMTrace.i(8126883430400L, 60550);
    localArrayList = new ArrayList();
    Object localObject1 = null;
    try
    {
      Object localObject2 = paramString2 + paramString1 + "_ARTISTF.mm";
      Object localObject3 = paramString2 + paramString1 + "_ARTIST.mm";
      paramString1 = (String)localObject1;
      if (FileOp.aZ((String)localObject2))
      {
        paramString1 = FileOp.c((String)localObject2, 0, (int)FileOp.kX((String)localObject2));
        paramString1 = (cc)new cc().aD(paramString1);
      }
      paramString2 = paramString1;
      if (paramString1 == null)
      {
        FileOp.deleteFile((String)localObject2);
        paramString2 = a.HZ(new String(FileOp.c((String)localObject3, 0, (int)FileOp.kX((String)localObject3))));
        FileOp.b((String)localObject2, paramString2.toByteArray(), -1);
      }
      paramString1 = paramString2.tQs.iterator();
      if (paramString1.hasNext())
      {
        localObject1 = (agq)paramString1.next();
        paramString2 = ((agq)localObject1).lPi;
        localObject1 = ((agq)localObject1).ueW.iterator();
        int j = i;
        for (;;)
        {
          i = j;
          if (!((Iterator)localObject1).hasNext()) {
            break;
          }
          localObject2 = (anu)((Iterator)localObject1).next();
          ((anu)localObject2).lPj = paramString2;
          localObject3 = new com.tencent.mm.plugin.sns.g.b();
          ((com.tencent.mm.plugin.sns.g.b)localObject3).eUs = ((anu)localObject2);
          ((com.tencent.mm.plugin.sns.g.b)localObject3).pyW = "";
          ((com.tencent.mm.plugin.sns.g.b)localObject3).pyX = j;
          localArrayList.add(localObject3);
          j += 1;
        }
      }
      return localArrayList;
    }
    catch (Exception paramString1)
    {
      w.e("MicroMsg.SnsInfoStorageLogic", "error initDataArtist");
      GMTrace.o(8126883430400L, 60550);
    }
  }
  
  public static bfh m(m paramm)
  {
    GMTrace.i(8124735946752L, 60534);
    try
    {
      paramm = (bfh)new bfh().aD(paramm.field_attrBuf);
      paramm = ae.bjc().c(paramm);
      pvq.clear();
      GMTrace.o(8124735946752L, 60534);
      return paramm;
    }
    catch (Exception paramm)
    {
      w.e("MicroMsg.SnsInfoStorageLogic", "SnsObject parseFrom error");
      w.printErrStackTrace("MicroMsg.SnsInfoStorageLogic", paramm, "", new Object[0]);
      paramm = new bfh();
      GMTrace.o(8124735946752L, 60534);
    }
    return paramm;
  }
  
  public static bfh n(m paramm)
  {
    GMTrace.i(8124870164480L, 60535);
    try
    {
      if (paramm.pMd == null) {
        paramm.pMd = (com.tencent.mm.a.g.n(paramm.field_content) + com.tencent.mm.a.g.n(paramm.field_attrBuf));
      }
      if (pvq.containsKey(paramm.pMd))
      {
        localbfh = (bfh)pvq.get(paramm.pMd);
        if (localbfh != null)
        {
          ae.bjc().c(localbfh);
          GMTrace.o(8124870164480L, 60535);
          return localbfh;
        }
      }
      bfh localbfh = (bfh)new bfh().aD(paramm.field_attrBuf);
      pvq.put(paramm.pMd, localbfh);
      ae.bjc().c(localbfh);
      GMTrace.o(8124870164480L, 60535);
      return localbfh;
    }
    catch (Exception paramm)
    {
      w.e("MicroMsg.SnsInfoStorageLogic", "SnsObject parseFrom error");
      w.printErrStackTrace("MicroMsg.SnsInfoStorageLogic", paramm, "", new Object[0]);
      paramm = new bfh();
      GMTrace.o(8124870164480L, 60535);
    }
    return paramm;
  }
  
  public static boolean uv(int paramInt)
  {
    GMTrace.i(8126212341760L, 60545);
    w.d("MicroMsg.SnsInfoStorageLogic", "retryPostItem localId　" + paramInt);
    m localm = ae.bjd().va(paramInt);
    if (localm == null)
    {
      GMTrace.o(8126212341760L, 60545);
      return false;
    }
    localm.bmb();
    localm.gl((int)(System.currentTimeMillis() / 1000L));
    Object localObject2 = null;
    for (;;)
    {
      try
      {
        localObject1 = (anv)new anv().aD(localm.field_postBuf);
        w.printErrStackTrace("MicroMsg.SnsInfoStorageLogic", (Throwable)localObject2, "", new Object[0]);
      }
      catch (Exception localException3)
      {
        try
        {
          ((anv)localObject1).gsq = 0;
          ((anv)localObject1).uDp = System.currentTimeMillis();
          localm.field_postBuf = ((anv)localObject1).toByteArray();
          if (localObject1 != null) {
            break;
          }
          GMTrace.o(8126212341760L, 60545);
          return false;
        }
        catch (Exception localException2)
        {
          for (;;)
          {
            Object localObject1;
            int i;
            anx localanx;
            continue;
            paramInt += 1;
          }
        }
        localException3 = localException3;
        localObject1 = localObject2;
        localObject2 = localException3;
      }
    }
    ae.bjd().b(paramInt, localm);
    paramInt = 0;
    if (paramInt < ((anv)localObject1).uDm.size())
    {
      i = ((amb)((anv)localObject1).uDm.get(paramInt)).uAW;
      localObject2 = ae.biS().dV(i);
      if (localObject2 != null)
      {
        ((com.tencent.mm.plugin.sns.storage.q)localObject2).offset = 0;
        try
        {
          localanx = (anx)new anx().aD(((com.tencent.mm.plugin.sns.storage.q)localObject2).pMO);
          if (localanx.uDK == 0) {
            break label311;
          }
          localanx.uDK = 2;
          localanx.uDL = "";
          ((com.tencent.mm.plugin.sns.storage.q)localObject2).pMO = localanx.toByteArray();
          ae.biS().a(i, (com.tencent.mm.plugin.sns.storage.q)localObject2);
        }
        catch (Exception localException1)
        {
          w.e("MicroMsg.SnsInfoStorageLogic", "MediaUploadInfo parseFrom MediaUploadInfo Exception");
          GMTrace.o(8126212341760L, 60545);
          return false;
        }
      }
    }
    else
    {
      GMTrace.o(8126212341760L, 60545);
      return true;
    }
  }
  
  public static m uw(int paramInt)
  {
    GMTrace.i(8126749212672L, 60549);
    m localm = new m();
    Object localObject1 = ae.bjd();
    Object localObject2 = n.bms();
    localObject2 = (String)localObject2 + " and createTime < " + paramInt;
    localObject2 = (String)localObject2 + n.pMu;
    localObject2 = (String)localObject2 + " LIMIT 1";
    w.i("MicroMsg.SnsInfoStorage", "getTimelineByCreateTime sql %s", new Object[] { localObject2 });
    localObject2 = ((n)localObject1).fTZ.rawQuery((String)localObject2, null);
    localObject1 = localObject2;
    if (localObject2 == null) {
      localObject1 = null;
    }
    if (localObject1 == null)
    {
      GMTrace.o(8126749212672L, 60549);
      return null;
    }
    if (((Cursor)localObject1).moveToFirst())
    {
      localm.b((Cursor)localObject1);
      ((Cursor)localObject1).close();
      GMTrace.o(8126749212672L, 60549);
      return localm;
    }
    ((Cursor)localObject1).close();
    GMTrace.o(8126749212672L, 60549);
    return null;
  }
  
  public static void ux(int paramInt)
  {
    GMTrace.i(8127420301312L, 60554);
    w.d("MicroMsg.SnsInfoStorageLogic", "unsetOmitResendFlag localId　" + paramInt);
    m localm = ae.bjd().va(paramInt);
    if (localm == null)
    {
      GMTrace.o(8127420301312L, 60554);
      return;
    }
    if ((localm.field_localFlag & 0x40) > 0) {}
    for (int i = 1;; i = 0)
    {
      if (i != 0) {
        localm.field_localFlag &= 0xFFFFFFBF;
      }
      ae.bjd().b(paramInt, localm);
      GMTrace.o(8127420301312L, 60554);
      return;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\sns\model\ai.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */