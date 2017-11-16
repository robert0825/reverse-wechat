package com.tencent.mm.plugin.sns.model;

import android.database.Cursor;
import android.util.Base64;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.b.af;
import com.tencent.mm.modelstat.o;
import com.tencent.mm.plugin.sns.b.c;
import com.tencent.mm.plugin.sns.data.i;
import com.tencent.mm.plugin.sns.storage.b;
import com.tencent.mm.plugin.sns.storage.m;
import com.tencent.mm.plugin.sns.storage.u;
import com.tencent.mm.protocal.c.axs;
import com.tencent.mm.protocal.c.azp;
import com.tencent.mm.protocal.c.bem;
import com.tencent.mm.protocal.c.beq;
import com.tencent.mm.protocal.c.ber;
import com.tencent.mm.protocal.c.bew;
import com.tencent.mm.protocal.c.bfh;
import com.tencent.mm.protocal.c.bfv;
import com.tencent.mm.protocal.c.bhf;
import com.tencent.mm.protocal.c.bhg;
import com.tencent.mm.protocal.c.biz;
import com.tencent.mm.protocal.c.ca;
import com.tencent.mm.protocal.c.oa;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.ar;
import com.tencent.mm.storage.x;
import com.tencent.mm.y.q;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map.Entry;

public final class a
{
  private static final String pqI;
  private static LinkedHashMap<Long, Integer> pqJ;
  private static Comparator<bew> pqK;
  
  static
  {
    GMTrace.i(8044607963136L, 59937);
    StringBuilder localStringBuilder = new StringBuilder();
    com.tencent.mm.kernel.h.xz();
    pqI = com.tencent.mm.kernel.h.xy().cachePath + "sns_recvd_ad";
    pqK = new Comparator() {};
    GMTrace.o(8044607963136L, 59937);
  }
  
  public static void Hf(String paramString)
  {
    GMTrace.i(8043668439040L, 59930);
    if (bg.nm(paramString))
    {
      GMTrace.o(8043668439040L, 59930);
      return;
    }
    com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.f.blw().d("adId", paramString, "adxml", 1);
    GMTrace.o(8043668439040L, 59930);
  }
  
  private static int a(bfh parambfh)
  {
    GMTrace.i(8043802656768L, 59931);
    m localm = ae.bjd().dU(parambfh.tXT);
    if (localm == null)
    {
      i = parambfh.nFd;
      GMTrace.o(8043802656768L, 59931);
      return i;
    }
    int i = localm.field_createTime;
    GMTrace.o(8043802656768L, 59931);
    return i;
  }
  
  private static ca a(axs paramaxs)
  {
    GMTrace.i(8042326261760L, 59920);
    if (paramaxs != null)
    {
      ca localca = new ca();
      localca.tQo = paramaxs.uMo;
      if (localca.tQo == null)
      {
        w.i("MicroMsg.AdSnsInfoStorageLogic", "recObject.RecommendInfo is null");
        GMTrace.o(8042326261760L, 59920);
        return null;
      }
      localca.tQn = b(paramaxs.uMn);
      GMTrace.o(8042326261760L, 59920);
      return localca;
    }
    GMTrace.o(8042326261760L, 59920);
    return null;
  }
  
  public static void a(bem parambem)
  {
    GMTrace.i(8041118302208L, 59911);
    if (parambem == null)
    {
      w.i("MicroMsg.AdSnsInfoStorageLogic", "error adobj");
      GMTrace.o(8041118302208L, 59911);
      return;
    }
    if (parambem.uQe == null)
    {
      w.i("MicroMsg.AdSnsInfoStorageLogic", "error adobj");
      GMTrace.o(8041118302208L, 59911);
      return;
    }
    com.tencent.mm.plugin.sns.storage.e locale = c(parambem);
    if (locale == null)
    {
      GMTrace.o(8041118302208L, 59911);
      return;
    }
    if (ae.bjg().dO(parambem.uQe.tXT))
    {
      w.i("MicroMsg.AdSnsInfoStorageLogic", "ind this adobj and update" + parambem.uQe.tXT);
      ae.bjg().b(parambem.uQe.tXT, locale);
      GMTrace.o(8041118302208L, 59911);
      return;
    }
    w.i("MicroMsg.AdSnsInfoStorageLogic", "local can not find this adobj " + parambem.uQe.tXT);
    GMTrace.o(8041118302208L, 59911);
  }
  
  public static void a(bfv parambfv)
  {
    GMTrace.i(8041252519936L, 59912);
    b(b(parambfv));
    GMTrace.o(8041252519936L, 59912);
  }
  
  private static void a(ca paramca)
  {
    GMTrace.i(8043400003584L, 59928);
    paramca = com.tencent.mm.platformtools.n.a(paramca.tQn.uQf);
    if ((!bg.nm(paramca)) && (new b(paramca).pCp)) {
      com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.f.blw().d("adId", paramca, "adxml", 0);
    }
    GMTrace.o(8043400003584L, 59928);
  }
  
  private static void a(ca paramca, int paramInt1, int paramInt2, com.tencent.mm.plugin.sns.storage.a parama)
  {
    GMTrace.i(8042057826304L, 59918);
    if (paramca == null)
    {
      w.i("MicroMsg.AdSnsInfoStorageLogic", "error adobj");
      GMTrace.o(8042057826304L, 59918);
      return;
    }
    if ((paramca.tQn == null) || (paramca.tQn.uQe == null))
    {
      w.i("MicroMsg.AdSnsInfoStorageLogic", "error adobj");
      GMTrace.o(8042057826304L, 59918);
      return;
    }
    bfh localbfh = paramca.tQn.uQe;
    com.tencent.mm.plugin.sns.storage.e locale = c(paramca.tQn);
    biz localbiz = locale.blD();
    bhf localbhf = new bhf();
    localbhf.uTb = new bhg();
    localbhf.uTb.uTf = parama.pyc;
    localbhf.uTb.uTe = localbiz.mmR;
    localbhf.uTb.cfz = locale.getSource();
    localbhf.uTb.pLQ = o.a(localbhf.uTb);
    if (localbiz.uUc.ueV == 1) {
      localbhf.uTb.gVx = 1;
    }
    for (;;)
    {
      parama = localbhf.uTb;
      b localb = locale.blA();
      int i;
      if (localb == null)
      {
        i = 0;
        parama.uTg = i;
      }
      try
      {
        parama = Base64.encodeToString(localbhf.toByteArray(), 0).replace("\n", "");
        w.i("MicroMsg.AdSnsInfoStorageLogic", "replace newly add snsId:%s, statExtStr:%s(id=%s,uxInfo=%s)", new Object[] { localbiz.mmR, parama, localbhf.uTb.uTe, localbhf.uTb.uTf });
        localbiz.pTh = parama;
        locale.c(localbiz);
        if (locale == null)
        {
          GMTrace.o(8042057826304L, 59918);
          return;
          if (localbiz.uUc.ueV == 15)
          {
            localbhf.uTb.gVx = 2;
            continue;
          }
          localbhf.uTb.gVx = 0;
          continue;
          i = localb.pDc;
        }
      }
      catch (IOException parama)
      {
        for (;;)
        {
          w.printErrStackTrace("MicroMsg.AdSnsInfoStorageLogic", parama, "", new Object[0]);
        }
        locale.field_createTime = paramInt1;
        locale.field_exposureTime = 0;
        locale.field_createAdTime = paramInt2;
        parama = com.tencent.mm.platformtools.n.a(paramca.tQn.uQf);
        if (!bg.nm(parama)) {
          locale.field_recxml = parama;
        }
        locale.field_adinfo = com.tencent.mm.platformtools.n.a(paramca.tQo);
        locale.field_adxml = locale.field_recxml;
        ae.bjg().a(localbfh.tXT, locale);
        GMTrace.o(8042057826304L, 59918);
      }
    }
  }
  
  private static void a(LinkedList<ca> paramLinkedList, LinkedList<bfh> paramLinkedList1, boolean paramBoolean)
  {
    GMTrace.i(8042997350400L, 59925);
    if ((paramLinkedList == null) || (paramLinkedList1 == null) || (paramLinkedList1.size() == 0))
    {
      GMTrace.o(8042997350400L, 59925);
      return;
    }
    int k = a((bfh)paramLinkedList1.get(paramLinkedList1.size() - 1));
    int i = 0;
    if (i < paramLinkedList.size())
    {
      ca localca = (ca)paramLinkedList.get(i);
      if (localca == null) {
        w.i("MicroMsg.AdSnsInfoStorageLogic", "ad is null");
      }
      Object localObject;
      com.tencent.mm.plugin.sns.storage.a locala;
      for (;;)
      {
        i += 1;
        break;
        if (localca.tQn == null)
        {
          w.i("MicroMsg.AdSnsInfoStorageLogic", "item.SnsADObject is null");
        }
        else if (localca.tQn.uQe == null)
        {
          w.i("MicroMsg.AdSnsInfoStorageLogic", "item.SnsADObject.SnsObject is null");
        }
        else if ((paramBoolean) && (ae.bjg().dO(localca.tQn.uQe.tXT)))
        {
          w.i("MicroMsg.AdSnsInfoStorageLogic", "snsId %d already exist, ignore ", new Object[] { Long.valueOf(localca.tQn.uQe.tXT) });
        }
        else
        {
          localObject = com.tencent.mm.platformtools.n.a(localca.tQo);
          String str1 = com.tencent.mm.platformtools.n.a(localca.tQn.uQf);
          String str2 = com.tencent.mm.platformtools.n.b(localca.tQn.uQe.uQM);
          locala = new com.tencent.mm.plugin.sns.storage.a((String)localObject);
          w.i("MicroMsg.AdSnsInfoStorageLogic", "skXml " + (String)localObject);
          w.i("MicroMsg.AdSnsInfoStorageLogic", "adXml " + str1);
          w.i("MicroMsg.AdSnsInfoStorageLogic", "snsXml " + str2 + "\r\n");
          localObject = new b(str1);
          if ((((b)localObject).pDd == 0L) || (!dv(((b)localObject).pDd))) {
            break label375;
          }
          w.w("MicroMsg.AdSnsInfoStorageLogic", "ignore recvd ad filter by originSnsId " + ((b)localObject).pDd);
        }
      }
      label375:
      int j = k + 1;
      if ((locala.pBZ < paramLinkedList1.size()) && (locala.pBZ >= 0))
      {
        j = a((bfh)paramLinkedList1.get(locala.pBZ)) + 1;
        w.i("MicroMsg.AdSnsInfoStorageLogic", "create adinfo time  " + j + " pos " + locala.pBZ);
      }
      for (;;)
      {
        int m = (int)(System.currentTimeMillis() / 1000L);
        w.i("MicroMsg.AdSnsInfoStorageLogic", "gettime " + m);
        a(localca, j, m, locala);
        dw(localca.tQn.uQe.tXT);
        dw(((b)localObject).pDd);
        break;
        w.w("MicroMsg.AdSnsInfoStorageLogic", "invalid ad.pos " + locala.pBZ);
      }
    }
    GMTrace.o(8042997350400L, 59925);
  }
  
  public static boolean a(long paramLong, ber paramber)
  {
    GMTrace.i(8044071092224L, 59933);
    beq localbeq = paramber.uQt;
    if ((localbeq.jib != 7) && (localbeq.jib != 8))
    {
      GMTrace.o(8044071092224L, 59933);
      return false;
    }
    com.tencent.mm.plugin.sns.storage.e locale = ae.bjg().dN(paramLong);
    if (locale == null)
    {
      w.i("MicroMsg.AdSnsInfoStorageLogic", "pass the action because the snsinfo is null " + paramLong);
      GMTrace.o(8044071092224L, 59933);
      return false;
    }
    for (;;)
    {
      try
      {
        localbfh = (bfh)new bfh().aD(locale.field_attrBuf);
        localbfh.tXT = paramLong;
        if (localbeq.jib != 7) {
          continue;
        }
        localIterator = localbfh.uQQ.iterator();
        if (localIterator.hasNext())
        {
          localbew = (bew)localIterator.next();
          if ((localbew.nFd != localbeq.nFd) || (!localbew.tRz.equals(localbeq.uKB))) {
            continue;
          }
          w.i("MicroMsg.AdSnsInfoStorageLogic", "like create time " + localbew.nFd + " ");
          GMTrace.o(8044071092224L, 59933);
          return false;
        }
        localbfh.uQQ.add(ac.a(paramber));
        locale.aE(localbfh.toByteArray());
        ae.bjg().a(localbfh.tXT, locale);
      }
      catch (Exception paramber)
      {
        bfh localbfh;
        Iterator localIterator;
        bew localbew;
        w.e("MicroMsg.AdSnsInfoStorageLogic", "e " + paramber.getMessage());
        w.printErrStackTrace("MicroMsg.AdSnsInfoStorageLogic", paramber, "", new Object[0]);
        continue;
      }
      GMTrace.o(8044071092224L, 59933);
      return true;
      if (localbeq.jib == 8)
      {
        localIterator = localbfh.uQT.iterator();
        if (localIterator.hasNext())
        {
          localbew = (bew)localIterator.next();
          if ((localbew.nFd == localbeq.nFd) && (localbew.tRz.equals(localbeq.uKB)))
          {
            w.i("MicroMsg.AdSnsInfoStorageLogic", "like create time " + localbew.nFd + " ");
            GMTrace.o(8044071092224L, 59933);
            return false;
          }
        }
        else
        {
          localbfh.uQT.add(ac.a(paramber));
        }
      }
    }
  }
  
  public static boolean a(long paramLong, ber paramber, int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean)
  {
    GMTrace.i(8043936874496L, 59932);
    Object localObject1;
    if (paramber != null)
    {
      localObject1 = paramber.uQt;
      if ((((beq)localObject1).jib != 7) && (((beq)localObject1).jib != 8))
      {
        GMTrace.o(8043936874496L, 59932);
        return false;
      }
    }
    Object localObject3 = q.zE();
    if ((paramber != null) && (paramber.uQu != null) && (paramber.uQu.uKB != null) && (paramber.uQu.uKB.equals(localObject3)))
    {
      GMTrace.o(8043936874496L, 59932);
      return true;
    }
    Object localObject2 = ae.bjg().dN(paramLong);
    int k;
    Object localObject4;
    long l;
    for (;;)
    {
      try
      {
        localObject1 = (bfh)new bfh().aD(((com.tencent.mm.plugin.sns.storage.e)localObject2).field_attrBuf);
        ((bfh)localObject1).tXT = paramLong;
        k = ((com.tencent.mm.plugin.sns.storage.e)localObject2).field_firstControlTime;
        paramber = paramber.uQt;
        if (paramber.jib != 7) {
          break;
        }
        if ((paramInt2 <= 0) || (k + paramInt2 >= paramber.nFd)) {
          break label798;
        }
        if (paramBoolean)
        {
          localObject3 = ae.bjd().Ir(((com.tencent.mm.plugin.sns.storage.e)localObject2).blE());
          if (localObject3 == null) {
            break label475;
          }
          localObject4 = ((m)localObject3).blB();
          if (localObject4 == null) {
            continue;
          }
          localObject3 = (c)com.tencent.mm.kernel.h.h(c.class);
          i = ((com.tencent.mm.plugin.sns.storage.e)localObject2).getSource();
          l = u.IM(((com.tencent.mm.plugin.sns.storage.e)localObject2).blE());
          localObject2 = ((com.tencent.mm.plugin.sns.storage.a)localObject4).hTy;
          if (((bfh)localObject1).uQQ != null)
          {
            paramInt1 = ((bfh)localObject1).uQQ.size();
            if (((bfh)localObject1).uQT == null) {
              continue;
            }
            paramInt3 = ((bfh)localObject1).uQT.size();
            ((c)localObject3).a(13182, i, new Object[] { Long.valueOf(l), localObject2, Integer.valueOf(2), Integer.valueOf(1), Integer.valueOf(paramInt1), Integer.valueOf(paramInt3), Integer.valueOf((int)(System.currentTimeMillis() / 1000L)) });
          }
        }
        else
        {
          w.i("MicroMsg.AdSnsInfoStorageLogic", "snsid " + paramLong + " firstCreateTime " + k + " actionLikeTimeLimit: " + paramInt2 + " curAction.createTime: " + paramber.nFd + "is over the time limit!");
          GMTrace.o(8043936874496L, 59932);
          return false;
        }
        paramInt1 = 0;
        continue;
        paramInt3 = 0;
        continue;
        w.i("MicroMsg.AdSnsInfoStorageLogic", "when report ad time limit,the adinfo is null!");
        continue;
        GMTrace.o(8043936874496L, 59932);
      }
      catch (Exception paramber)
      {
        w.printErrStackTrace("MicroMsg.AdSnsInfoStorageLogic", paramber, "", new Object[0]);
      }
      return true;
      label475:
      w.i("MicroMsg.AdSnsInfoStorageLogic", "when report ad time limit,the snsInfo is null!");
    }
    if ((paramber.jib == 8) && (paramInt3 > 0) && (k + paramInt3 < paramber.nFd))
    {
      if (paramBoolean)
      {
        localObject3 = ae.bjd().Ir(((com.tencent.mm.plugin.sns.storage.e)localObject2).blE());
        if (localObject3 == null) {
          break label787;
        }
        localObject4 = ((m)localObject3).blB();
        if (localObject4 == null) {
          break label776;
        }
        localObject3 = (c)com.tencent.mm.kernel.h.h(c.class);
        i = ((com.tencent.mm.plugin.sns.storage.e)localObject2).getSource();
        l = u.IM(((com.tencent.mm.plugin.sns.storage.e)localObject2).blE());
        localObject2 = ((com.tencent.mm.plugin.sns.storage.a)localObject4).hTy;
        if (((bfh)localObject1).uQQ == null) {
          break label765;
        }
        paramInt1 = ((bfh)localObject1).uQQ.size();
        if (((bfh)localObject1).uQT == null) {
          break label770;
        }
        paramInt2 = ((bfh)localObject1).uQT.size();
        label617:
        ((c)localObject3).a(13182, i, new Object[] { Long.valueOf(l), localObject2, Integer.valueOf(2), Integer.valueOf(2), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf((int)(System.currentTimeMillis() / 1000L)) });
      }
      for (;;)
      {
        w.i("MicroMsg.AdSnsInfoStorageLogic", "snsid " + paramLong + " firstCreateTime " + k + " actionCommentTimeLimit: " + paramInt3 + " curAction.createTime: " + paramber.nFd + "is over the time limit!");
        GMTrace.o(8043936874496L, 59932);
        return false;
        label765:
        paramInt1 = 0;
        break;
        label770:
        paramInt2 = 0;
        break label617;
        label776:
        w.i("MicroMsg.AdSnsInfoStorageLogic", "when report ad time limit,the adinfo is null!");
        continue;
        label787:
        w.i("MicroMsg.AdSnsInfoStorageLogic", "when report ad time limit,the snsInfo is null!");
      }
    }
    label798:
    int i = 0;
    paramber = ((bfh)localObject1).uQQ.iterator();
    label810:
    int j;
    if (paramber.hasNext())
    {
      localObject4 = (bew)paramber.next();
      if (((bew)localObject4).nFd > k)
      {
        if ((localObject4 == null) || (((bew)localObject4).tRz == null)) {
          break label1243;
        }
        if (!((bew)localObject4).tRz.equals(localObject3)) {
          break label1243;
        }
      }
    }
    else
    {
      j = 0;
      paramber = ((bfh)localObject1).uQT.iterator();
    }
    label1121:
    label1204:
    label1209:
    label1215:
    label1226:
    label1243:
    label1249:
    label1252:
    label1258:
    for (;;)
    {
      if (paramber.hasNext())
      {
        localObject4 = (bew)paramber.next();
        if (((bew)localObject4).nFd > k)
        {
          if ((localObject4 == null) || (((bew)localObject4).tRz == null)) {
            break label1252;
          }
          if (!((bew)localObject4).tRz.equals(localObject3)) {
            break label1252;
          }
        }
      }
      else
      {
        i = i + 0 + j;
        w.i("MicroMsg.AdSnsInfoStorageLogic", "totalsize " + i + " firstCreateTime " + k + " actionLimit: " + paramInt1 + " actionLikeTimeLimit: " + paramInt2 + " actionCommentTimeLimit: " + paramInt3);
        if (i < paramInt1) {
          break;
        }
        if (paramBoolean)
        {
          paramber = ae.bjd().Ir(((com.tencent.mm.plugin.sns.storage.e)localObject2).blE());
          if (paramber == null) {
            break label1226;
          }
          localObject3 = paramber.blB();
          if (localObject3 == null) {
            break label1215;
          }
          paramber = (c)com.tencent.mm.kernel.h.h(c.class);
          paramInt3 = ((com.tencent.mm.plugin.sns.storage.e)localObject2).getSource();
          paramLong = u.IM(((com.tencent.mm.plugin.sns.storage.e)localObject2).blE());
          localObject2 = ((com.tencent.mm.plugin.sns.storage.a)localObject3).hTy;
          if (((bfh)localObject1).uQQ == null) {
            break label1204;
          }
          paramInt1 = ((bfh)localObject1).uQQ.size();
          if (((bfh)localObject1).uQT == null) {
            break label1209;
          }
          paramInt2 = ((bfh)localObject1).uQT.size();
          paramber.a(13182, paramInt3, new Object[] { Long.valueOf(paramLong), localObject2, Integer.valueOf(1), Integer.valueOf(2), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf((int)(System.currentTimeMillis() / 1000L)) });
        }
        for (;;)
        {
          GMTrace.o(8043936874496L, 59932);
          return false;
          paramInt1 = 0;
          break;
          paramInt2 = 0;
          break label1121;
          w.i("MicroMsg.AdSnsInfoStorageLogic", "when report ad time limit,the adinfo is null!");
          continue;
          w.i("MicroMsg.AdSnsInfoStorageLogic", "when report ad time limit,the snsInfo is null!");
        }
      }
      break label1258;
      break label1249;
      i += 1;
      break label810;
      j += 1;
    }
  }
  
  private static boolean a(bew parambew, List<bew> paramList)
  {
    GMTrace.i(8041789390848L, 59916);
    paramList = paramList.iterator();
    while (paramList.hasNext())
    {
      bew localbew = (bew)paramList.next();
      if ((!bg.nm(parambew.tRz)) && (parambew.tRz.equals(localbew.tRz)))
      {
        GMTrace.o(8041789390848L, 59916);
        return true;
      }
    }
    GMTrace.o(8041789390848L, 59916);
    return false;
  }
  
  private static LinkedList<ca> af(LinkedList<axs> paramLinkedList)
  {
    GMTrace.i(8042863132672L, 59924);
    LinkedList localLinkedList = new LinkedList();
    paramLinkedList = paramLinkedList.iterator();
    while (paramLinkedList.hasNext())
    {
      ca localca = a((axs)paramLinkedList.next());
      if (localca != null) {
        localLinkedList.add(localca);
      }
    }
    GMTrace.o(8042863132672L, 59924);
    return localLinkedList;
  }
  
  public static void ag(LinkedList<axs> paramLinkedList)
  {
    GMTrace.i(8043131568128L, 59926);
    if ((paramLinkedList != null) && (!paramLinkedList.isEmpty()))
    {
      paramLinkedList = af(paramLinkedList);
      w.i("MicroMsg.AdSnsInfoStorageLogic", "convert " + paramLinkedList.size() + " recObj to AdvertiseObj");
      ah(paramLinkedList);
    }
    GMTrace.o(8043131568128L, 59926);
  }
  
  public static void ah(LinkedList<ca> paramLinkedList)
  {
    GMTrace.i(8043265785856L, 59927);
    if (paramLinkedList == null)
    {
      GMTrace.o(8043265785856L, 59927);
      return;
    }
    int i = 0;
    while (i < paramLinkedList.size())
    {
      a((ca)paramLinkedList.get(i));
      i += 1;
    }
    GMTrace.o(8043265785856L, 59927);
  }
  
  public static void ai(LinkedList<bfh> paramLinkedList)
  {
    GMTrace.i(8043534221312L, 59929);
    if (paramLinkedList == null)
    {
      GMTrace.o(8043534221312L, 59929);
      return;
    }
    com.tencent.mm.plugin.sns.storage.n localn = ae.bjd();
    int i = 0;
    while (i < paramLinkedList.size())
    {
      Object localObject = (bfh)paramLinkedList.get(i);
      if (localObject != null)
      {
        localObject = localn.dU(((bfh)localObject).tXT);
        if (localObject != null)
        {
          localObject = ((m)localObject).blD();
          if ((localObject != null) && (!bg.nm(((biz)localObject).pRQ))) {
            com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.f.blw().d("adId", ((biz)localObject).pRQ, "adxml", 0);
          }
        }
      }
      i += 1;
    }
    GMTrace.o(8043534221312L, 59929);
  }
  
  private static bem b(bfv parambfv)
  {
    GMTrace.i(8042192044032L, 59919);
    if (parambfv != null)
    {
      bem localbem = new bem();
      localbem.uQf = parambfv.uRF;
      if (localbem.uQf == null) {
        w.i("MicroMsg.AdSnsInfoStorageLogic", "recommendObj.RecommendXml is null");
      }
      localbem.uQe = parambfv.uQe;
      GMTrace.o(8042192044032L, 59919);
      return localbem;
    }
    GMTrace.o(8042192044032L, 59919);
    return null;
  }
  
  public static void b(axs paramaxs)
  {
    GMTrace.i(8042460479488L, 59921);
    ca localca = a(paramaxs);
    if (localca == null)
    {
      GMTrace.o(8042460479488L, 59921);
      return;
    }
    com.tencent.mm.plugin.sns.storage.a locala = new com.tencent.mm.plugin.sns.storage.a(com.tencent.mm.platformtools.n.a(localca.tQo));
    int j = locala.pBZ;
    Object localObject;
    if (j <= 0)
    {
      i = 1;
      int k = ae.bjd().IF("");
      w.i("MicroMsg.AdSnsInfoStorageLogic", "ad.pos = %d, dbLimit = %d, createTime.limit = %d", new Object[] { Integer.valueOf(j), Integer.valueOf(i), Integer.valueOf(k) });
      com.tencent.mm.plugin.sns.storage.n localn = ae.bjd();
      paramaxs = com.tencent.mm.plugin.sns.storage.n.pMt + " from SnsInfo where ";
      localObject = paramaxs + com.tencent.mm.plugin.sns.storage.n.bmo();
      paramaxs = (axs)localObject;
      if (com.tencent.mm.plugin.sns.storage.n.IA("")) {
        paramaxs = (String)localObject + " AND " + localn.IB("");
      }
      paramaxs = paramaxs + " AND createTime >= " + k;
      paramaxs = paramaxs + " UNION ";
      paramaxs = paramaxs + com.tencent.mm.plugin.sns.storage.n.pMt + " from AdSnsInfo where createTime" + " > " + k;
      paramaxs = paramaxs + com.tencent.mm.plugin.sns.storage.n.pMu;
      paramaxs = paramaxs + " limit " + i;
      w.d("MicroMsg.SnsInfoStorage", "getAdCursorForTimeLine " + paramaxs + " limtiSeq: " + "");
      paramaxs = localn.fTZ.rawQuery(paramaxs, null);
      if ((paramaxs == null) || (paramaxs.getCount() <= 0)) {
        break label553;
      }
      w.i("MicroMsg.AdSnsInfoStorageLogic", "db return %d feeds", new Object[] { Integer.valueOf(paramaxs.getCount()) });
      localObject = new m();
      if (j >= 0) {
        break label532;
      }
      i = 0;
      label426:
      if (!paramaxs.moveToPosition(i)) {
        break label537;
      }
      ((m)localObject).b(paramaxs);
    }
    label442:
    for (int i = ((m)localObject).field_createTime + 1;; i = (int)bg.Pu())
    {
      paramaxs.close();
      w.i("MicroMsg.AdSnsInfoStorageLogic", "inserting snsid  " + localca.tQn.uQe.tXT + " ,createTime " + i);
      a(localca, i, (int)bg.Pu(), locala);
      a(localca);
      GMTrace.o(8042460479488L, 59921);
      return;
      i = j + 1;
      break;
      label532:
      i = j;
      break label426;
      label537:
      paramaxs.moveToLast();
      ((m)localObject).b(paramaxs);
      break label442;
      label553:
      w.i("MicroMsg.AdSnsInfoStorageLogic", "db return nothing");
    }
  }
  
  public static void b(bem parambem)
  {
    GMTrace.i(8041386737664L, 59913);
    if (parambem == null)
    {
      w.i("MicroMsg.AdSnsInfoStorageLogic", "error adobj");
      GMTrace.o(8041386737664L, 59913);
      return;
    }
    if (parambem.uQe == null)
    {
      w.i("MicroMsg.AdSnsInfoStorageLogic", "error adobj");
      GMTrace.o(8041386737664L, 59913);
      return;
    }
    com.tencent.mm.plugin.sns.storage.e locale = c(parambem);
    ae.bjg().a(parambem.uQe.tXT, locale);
    GMTrace.o(8041386737664L, 59913);
  }
  
  private static boolean b(bew parambew, List<bew> paramList)
  {
    GMTrace.i(8041923608576L, 59917);
    paramList = paramList.iterator();
    while (paramList.hasNext())
    {
      bew localbew = (bew)paramList.next();
      if ((parambew.uQp == localbew.uQp) && (localbew.uQp != 0L))
      {
        GMTrace.o(8041923608576L, 59917);
        return true;
      }
    }
    GMTrace.o(8041923608576L, 59917);
    return false;
  }
  
  /* Error */
  private static void bif()
  {
    // Byte code:
    //   0: ldc2_w 763
    //   3: ldc_w 765
    //   6: invokestatic 27	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   9: getstatic 767	com/tencent/mm/plugin/sns/model/a:pqJ	Ljava/util/LinkedHashMap;
    //   12: ifnonnull +77 -> 89
    //   15: getstatic 59	com/tencent/mm/plugin/sns/model/a:pqI	Ljava/lang/String;
    //   18: invokestatic 773	com/tencent/mm/pluginsdk/j/a/e/a:OR	(Ljava/lang/String;)[B
    //   21: astore_0
    //   22: aload_0
    //   23: ifnull +41 -> 64
    //   26: new 775	java/io/ByteArrayInputStream
    //   29: dup
    //   30: aload_0
    //   31: invokespecial 777	java/io/ByteArrayInputStream:<init>	([B)V
    //   34: astore_0
    //   35: new 779	java/io/ObjectInputStream
    //   38: dup
    //   39: aload_0
    //   40: invokespecial 782	java/io/ObjectInputStream:<init>	(Ljava/io/InputStream;)V
    //   43: astore_1
    //   44: aload_1
    //   45: astore_0
    //   46: aload_1
    //   47: invokeinterface 787 1 0
    //   52: checkcast 789	java/util/LinkedHashMap
    //   55: putstatic 767	com/tencent/mm/plugin/sns/model/a:pqJ	Ljava/util/LinkedHashMap;
    //   58: aload_1
    //   59: invokeinterface 790 1 0
    //   64: getstatic 767	com/tencent/mm/plugin/sns/model/a:pqJ	Ljava/util/LinkedHashMap;
    //   67: ifnonnull +22 -> 89
    //   70: new 8	com/tencent/mm/plugin/sns/model/a$2
    //   73: dup
    //   74: ldc2_w 791
    //   77: invokestatic 798	java/lang/Math:ceil	(D)D
    //   80: d2i
    //   81: iconst_1
    //   82: iadd
    //   83: invokespecial 801	com/tencent/mm/plugin/sns/model/a$2:<init>	(I)V
    //   86: putstatic 767	com/tencent/mm/plugin/sns/model/a:pqJ	Ljava/util/LinkedHashMap;
    //   89: ldc2_w 763
    //   92: ldc_w 765
    //   95: invokestatic 65	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   98: return
    //   99: astore_2
    //   100: aconst_null
    //   101: astore_1
    //   102: aload_1
    //   103: astore_0
    //   104: ldc -115
    //   106: aload_2
    //   107: invokestatic 805	com/tencent/mm/sdk/platformtools/bg:f	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   110: invokestatic 529	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   113: aload_1
    //   114: ifnull -50 -> 64
    //   117: aload_1
    //   118: invokeinterface 790 1 0
    //   123: goto -59 -> 64
    //   126: astore_0
    //   127: goto -63 -> 64
    //   130: astore_2
    //   131: aconst_null
    //   132: astore_1
    //   133: aload_1
    //   134: astore_0
    //   135: ldc -115
    //   137: aload_2
    //   138: invokestatic 805	com/tencent/mm/sdk/platformtools/bg:f	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   141: invokestatic 529	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   144: aload_1
    //   145: ifnull -81 -> 64
    //   148: aload_1
    //   149: invokeinterface 790 1 0
    //   154: goto -90 -> 64
    //   157: astore_0
    //   158: goto -94 -> 64
    //   161: astore_2
    //   162: aconst_null
    //   163: astore_1
    //   164: aload_1
    //   165: astore_0
    //   166: ldc -115
    //   168: aload_2
    //   169: invokestatic 805	com/tencent/mm/sdk/platformtools/bg:f	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   172: invokestatic 529	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   175: aload_1
    //   176: ifnull -112 -> 64
    //   179: aload_1
    //   180: invokeinterface 790 1 0
    //   185: goto -121 -> 64
    //   188: astore_0
    //   189: goto -125 -> 64
    //   192: astore_1
    //   193: aconst_null
    //   194: astore_0
    //   195: aload_0
    //   196: ifnull +9 -> 205
    //   199: aload_0
    //   200: invokeinterface 790 1 0
    //   205: aload_1
    //   206: athrow
    //   207: astore_0
    //   208: goto -144 -> 64
    //   211: astore_0
    //   212: goto -7 -> 205
    //   215: astore_1
    //   216: goto -21 -> 195
    //   219: astore_2
    //   220: goto -56 -> 164
    //   223: astore_2
    //   224: goto -91 -> 133
    //   227: astore_2
    //   228: goto -126 -> 102
    // Local variable table:
    //   start	length	slot	name	signature
    //   21	83	0	localObject1	Object
    //   126	1	0	localIOException1	IOException
    //   134	1	0	localObject2	Object
    //   157	1	0	localIOException2	IOException
    //   165	1	0	localObject3	Object
    //   188	1	0	localIOException3	IOException
    //   194	6	0	localObject4	Object
    //   207	1	0	localIOException4	IOException
    //   211	1	0	localIOException5	IOException
    //   43	137	1	localObjectInputStream	java.io.ObjectInputStream
    //   192	14	1	localObject5	Object
    //   215	1	1	localObject6	Object
    //   99	8	2	localStreamCorruptedException1	java.io.StreamCorruptedException
    //   130	8	2	localIOException6	IOException
    //   161	8	2	localClassNotFoundException1	ClassNotFoundException
    //   219	1	2	localClassNotFoundException2	ClassNotFoundException
    //   223	1	2	localIOException7	IOException
    //   227	1	2	localStreamCorruptedException2	java.io.StreamCorruptedException
    // Exception table:
    //   from	to	target	type
    //   35	44	99	java/io/StreamCorruptedException
    //   117	123	126	java/io/IOException
    //   35	44	130	java/io/IOException
    //   148	154	157	java/io/IOException
    //   35	44	161	java/lang/ClassNotFoundException
    //   179	185	188	java/io/IOException
    //   35	44	192	finally
    //   58	64	207	java/io/IOException
    //   199	205	211	java/io/IOException
    //   46	58	215	finally
    //   104	113	215	finally
    //   135	144	215	finally
    //   166	175	215	finally
    //   46	58	219	java/lang/ClassNotFoundException
    //   46	58	223	java/io/IOException
    //   46	58	227	java/io/StreamCorruptedException
  }
  
  private static com.tencent.mm.plugin.sns.storage.e c(bem parambem)
  {
    GMTrace.i(8041520955392L, 59914);
    locale = ae.bjg().dN(parambem.uQe.tXT);
    localbfh = parambem.uQe;
    localObject1 = null;
    if (locale == null) {
      locale = new com.tencent.mm.plugin.sns.storage.e();
    }
    for (;;)
    {
      localObject2 = com.tencent.mm.platformtools.n.b(localbfh.uQM);
      if (!bg.nm((String)localObject2)) {
        break;
      }
      GMTrace.o(8041520955392L, 59914);
      return null;
      localObject1 = locale.blD().pTh;
    }
    if (!locale.Iq((String)localObject2))
    {
      GMTrace.o(8041520955392L, 59914);
      return null;
    }
    if (!bg.nm((String)localObject1))
    {
      localObject2 = locale.blD();
      ((biz)localObject2).pTh = ((String)localObject1);
      locale.c((biz)localObject2);
    }
    localbfh.uRd = ai.b(localbfh.uRd, locale.field_attrBuf);
    w.d("MicroMsg.AdSnsInfoStorageLogic", "from server xml ok %d", new Object[] { Long.valueOf(localbfh.tXT) });
    localbfh.uQM.be(new byte[0]);
    locale.field_userName = localbfh.tRz;
    if (parambem.uQf != null)
    {
      parambem = com.tencent.mm.platformtools.n.a(parambem.uQf);
      if (!bg.nm(parambem)) {
        locale.field_recxml = parambem;
      }
      parambem = locale.field_recxml;
      if ((!bg.nm(parambem)) && (!parambem.equals(locale.field_adxml)))
      {
        w.i("MicroMsg.AdSnsInfoStorageLogic", "update field adxml " + parambem);
        locale.field_adxml = parambem;
      }
    }
    locale.field_likeFlag = localbfh.uQN;
    long l = localbfh.tXT;
    locale.field_snsId = l;
    if (l != 0L)
    {
      locale.field_stringSeq = i.dt(l);
      locale.field_stringSeq = i.GW(locale.field_stringSeq);
      w.d("MicroMsg.AdSnsInfo", l + " stringSeq " + locale.field_stringSeq);
    }
    locale.uV(2);
    locale.uV(32);
    try
    {
      if (locale.field_attrBuf == null) {
        parambem = new bfh();
      }
      for (;;)
      {
        Object localObject3;
        Iterator localIterator;
        bew localbew;
        if ((parambem != null) && (parambem.uQT != null))
        {
          localObject1 = new LinkedList();
          localObject2 = localbfh.uQT.iterator();
          for (;;)
          {
            if (!((Iterator)localObject2).hasNext()) {
              break label691;
            }
            localObject3 = (bew)((Iterator)localObject2).next();
            if (((bew)localObject3).uED > 0)
            {
              ((List)localObject1).add(localObject3);
              localIterator = parambem.uQT.iterator();
              if (localIterator.hasNext())
              {
                localbew = (bew)localIterator.next();
                if (localbew.uQp != ((bew)localObject3).uQp) {
                  break;
                }
                parambem.uQT.remove(localbew);
              }
            }
          }
        }
        try
        {
          for (;;)
          {
            locale.aE(localbfh.toByteArray());
            parambem = locale.blD();
            parambem.jhi = localbfh.tRz;
            locale.field_pravited = parambem.uCQ;
            w.d("MicroMsg.AdSnsInfoStorageLogic", "ext flag " + localbfh.uEI + " " + localbfh.uQT.size() + " " + localbfh.uQQ.size());
            locale.c(parambem);
            locale.field_type = parambem.uUc.ueV;
            locale.field_subType = parambem.uUc.ueX;
            GMTrace.o(8041520955392L, 59914);
            return locale;
            parambem = (bfh)new bfh().aD(locale.field_attrBuf);
            break;
            localObject2 = ((List)localObject1).iterator();
            while (((Iterator)localObject2).hasNext())
            {
              localObject3 = (bew)((Iterator)localObject2).next();
              localbfh.uQT.remove(localObject3);
            }
            ((List)localObject1).clear();
            localObject1 = parambem.uQT.iterator();
            while (((Iterator)localObject1).hasNext())
            {
              localObject2 = (bew)((Iterator)localObject1).next();
              if ((!b((bew)localObject2, localbfh.uQT)) && (((bew)localObject2).uQp != 0L))
              {
                com.tencent.mm.kernel.h.xz();
                localObject3 = ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).yK().TE(((bew)localObject2).tRz);
                if ((localObject3 != null) && (com.tencent.mm.l.a.eE(((af)localObject3).field_type)) && (!((x)localObject3).uZ()))
                {
                  localbfh.uQT.add(localObject2);
                  localbfh.uQS = localbfh.uQT.size();
                }
                else
                {
                  w.i("MicroMsg.AdSnsInfoStorageLogic", "not in ommentlist not mycontact " + ((bew)localObject2).tRz);
                }
              }
            }
            Collections.sort(localbfh.uQT, pqK);
            if (localbfh.uQQ != null)
            {
              localObject1 = new LinkedList();
              localObject2 = localbfh.uQQ.iterator();
              for (;;)
              {
                if (!((Iterator)localObject2).hasNext()) {
                  break label1056;
                }
                localObject3 = (bew)((Iterator)localObject2).next();
                if (((bew)localObject3).uED > 0)
                {
                  ((List)localObject1).add(localObject3);
                  localIterator = parambem.uQQ.iterator();
                  if (localIterator.hasNext())
                  {
                    localbew = (bew)localIterator.next();
                    if ((!bg.nm(localbew.tRz)) && (!localbew.tRz.equals(((bew)localObject3).tRz))) {
                      break;
                    }
                    parambem.uQQ.remove(localbew);
                  }
                }
              }
              localObject2 = ((List)localObject1).iterator();
              while (((Iterator)localObject2).hasNext())
              {
                localObject3 = (bew)((Iterator)localObject2).next();
                localbfh.uQQ.remove(localObject3);
              }
              ((List)localObject1).clear();
              if ((parambem != null) && (parambem.uQQ != null))
              {
                parambem = parambem.uQQ.iterator();
                while (parambem.hasNext())
                {
                  localObject1 = (bew)parambem.next();
                  if (!a((bew)localObject1, localbfh.uQQ))
                  {
                    com.tencent.mm.kernel.h.xz();
                    localObject2 = ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).yK().TE(((bew)localObject1).tRz);
                    if ((localObject2 != null) && (com.tencent.mm.l.a.eE(((af)localObject2).field_type)) && (!((x)localObject2).uZ()))
                    {
                      localbfh.uQQ.add(localObject1);
                      localbfh.uQP = localbfh.uQQ.size();
                    }
                    else
                    {
                      w.i("MicroMsg.AdSnsInfoStorageLogic", "not in likelist not mycontact " + ((bew)localObject1).tRz);
                    }
                  }
                }
              }
              Collections.sort(localbfh.uQQ, pqK);
            }
          }
        }
        catch (Exception parambem)
        {
          for (;;)
          {
            w.printErrStackTrace("MicroMsg.AdSnsInfoStorageLogic", parambem, "", new Object[0]);
          }
        }
      }
    }
    catch (Exception parambem)
    {
      w.i("MicroMsg.AdSnsInfoStorageLogic", "error " + parambem.getMessage());
      w.printErrStackTrace("MicroMsg.AdSnsInfoStorageLogic", parambem, "", new Object[0]);
    }
  }
  
  public static void d(LinkedList<axs> paramLinkedList, LinkedList<bfh> paramLinkedList1)
  {
    GMTrace.i(8042594697216L, 59922);
    if (paramLinkedList != null)
    {
      paramLinkedList = af(paramLinkedList);
      w.i("MicroMsg.AdSnsInfoStorageLogic", "convert " + paramLinkedList.size() + " recObj to AdvertiseObj");
      Iterator localIterator = paramLinkedList.iterator();
      while (localIterator.hasNext())
      {
        ca localca = (ca)localIterator.next();
        if (dv(localca.tQn.uQe.tXT))
        {
          w.w("MicroMsg.AdSnsInfoStorageLogic", "ignore recvd ad filter by snsId " + localca.tQn.uQe.tXT);
          localIterator.remove();
        }
      }
      a(paramLinkedList, paramLinkedList1, true);
    }
    GMTrace.o(8042594697216L, 59922);
  }
  
  private static boolean dv(long paramLong)
  {
    GMTrace.i(8044205309952L, 59934);
    bif();
    if (pqJ.get(Long.valueOf(paramLong)) != null)
    {
      GMTrace.o(8044205309952L, 59934);
      return true;
    }
    GMTrace.o(8044205309952L, 59934);
    return false;
  }
  
  private static void dw(long paramLong)
  {
    GMTrace.i(8044473745408L, 59936);
    if (paramLong == 0L)
    {
      GMTrace.o(8044473745408L, 59936);
      return;
    }
    if (pqJ == null) {
      bif();
    }
    pqJ.put(Long.valueOf(paramLong), Integer.valueOf(0));
    ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
    try
    {
      Object localObject1 = new ObjectOutputStream(localByteArrayOutputStream);
      ((ObjectOutput)localObject1).writeObject(pqJ);
      ((ObjectOutput)localObject1).flush();
      localObject1 = localByteArrayOutputStream.toByteArray();
      com.tencent.mm.pluginsdk.j.a.e.a.u(pqI, (byte[])localObject1);
      try
      {
        localByteArrayOutputStream.close();
        GMTrace.o(8044473745408L, 59936);
        return;
      }
      catch (IOException localIOException1)
      {
        GMTrace.o(8044473745408L, 59936);
        return;
      }
      try
      {
        localIOException2.close();
        throw ((Throwable)localObject2);
      }
      catch (IOException localIOException3)
      {
        for (;;) {}
      }
    }
    catch (IOException localIOException4)
    {
      localIOException4 = localIOException4;
      w.e("MicroMsg.AdSnsInfoStorageLogic", bg.f(localIOException4));
      try
      {
        localIOException1.close();
        GMTrace.o(8044473745408L, 59936);
        return;
      }
      catch (IOException localIOException2)
      {
        GMTrace.o(8044473745408L, 59936);
        return;
      }
    }
    finally {}
  }
  
  public static void e(LinkedList<ca> paramLinkedList, LinkedList<bfh> paramLinkedList1)
  {
    GMTrace.i(8042728914944L, 59923);
    a(paramLinkedList, paramLinkedList1, false);
    GMTrace.o(8042728914944L, 59923);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\sns\model\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */