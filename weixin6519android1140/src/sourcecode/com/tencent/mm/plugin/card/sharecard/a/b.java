package com.tencent.mm.plugin.card.sharecard.a;

import android.content.Context;
import android.database.Cursor;
import android.os.Looper;
import android.text.TextUtils;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mars.smc.IDKey;
import com.tencent.mm.R.l;
import com.tencent.mm.plugin.card.b.s;
import com.tencent.mm.plugin.card.model.al;
import com.tencent.mm.plugin.card.sharecard.model.ShareCardInfo;
import com.tencent.mm.plugin.card.sharecard.model.i;
import com.tencent.mm.plugin.card.sharecard.model.k;
import com.tencent.mm.plugin.card.sharecard.model.m;
import com.tencent.mm.plugin.card.sharecard.model.p;
import com.tencent.mm.plugin.card.sharecard.ui.b.a;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.y.at;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;

public final class b
{
  private static boolean gqR;
  public static boolean jAR;
  public b.a jAQ;
  private Context mContext;
  
  static
  {
    GMTrace.i(5097589309440L, 37980);
    gqR = false;
    jAR = false;
    GMTrace.o(5097589309440L, 37980);
  }
  
  public b(Context paramContext)
  {
    GMTrace.i(5093294342144L, 37948);
    this.jAQ = null;
    this.mContext = paramContext;
    jAR = false;
    GMTrace.o(5093294342144L, 37948);
  }
  
  private static void D(String paramString1, String paramString2, String paramString3)
  {
    GMTrace.i(5096247132160L, 37970);
    Object localObject = (Map)al.aks().getValue("key_share_user_info_map");
    if (localObject == null) {
      localObject = new HashMap();
    }
    for (;;)
    {
      ArrayList localArrayList = (ArrayList)((Map)localObject).get(paramString2);
      if (localArrayList == null) {
        localArrayList = new ArrayList();
      }
      for (;;)
      {
        int i = 0;
        while (i < localArrayList.size())
        {
          com.tencent.mm.plugin.card.sharecard.model.r localr = (com.tencent.mm.plugin.card.sharecard.model.r)localArrayList.get(i);
          if ((paramString3 != null) && (paramString3.equals(localr.jBs)))
          {
            localr.jBu = false;
            localr.cen -= 1;
            localr.jBt.remove(paramString1);
            localArrayList.set(i, localr);
          }
          i += 1;
        }
        ((Map)localObject).put(paramString2, localArrayList);
        al.aks().putValue("key_share_user_info_map", localObject);
        GMTrace.o(5096247132160L, 37970);
        return;
      }
    }
  }
  
  public static void O(Context paramContext, String paramString)
  {
    GMTrace.i(5096515567616L, 37972);
    w.i("MicroMsg.ShareCardDataMgr", "updateCardCountbyCardTpId() card_tp_id:" + paramString);
    Object localObject1 = (Map)al.aks().getValue("key_share_card_count_map");
    if (localObject1 == null) {
      localObject1 = new HashMap();
    }
    for (;;)
    {
      Map localMap = (Map)al.aks().getValue("key_share_card_username_map");
      Object localObject2 = localMap;
      if (localMap == null) {
        localObject2 = new HashMap();
      }
      ((Map)localObject1).put(paramString, Integer.valueOf(al.akv().uh(paramString)));
      ((Map)localObject2).put(paramString, a(paramContext, al.akv().ug(paramString)));
      al.aks().putValue("key_share_card_count_map", localObject1);
      al.aks().putValue("key_share_card_username_map", localObject2);
      GMTrace.o(5096515567616L, 37972);
      return;
    }
  }
  
  private static String a(Context paramContext, ArrayList<String> paramArrayList)
  {
    GMTrace.i(5094502301696L, 37957);
    if ((paramArrayList == null) || (paramArrayList.size() == 0))
    {
      w.e("MicroMsg.ShareCardDataMgr", "getShareUserName， username_list == null || username_list.size() == 0");
      GMTrace.o(5094502301696L, 37957);
      return "";
    }
    StringBuilder localStringBuilder = new StringBuilder();
    int i = 0;
    if ((i < paramArrayList.size()) && (i < 2))
    {
      if (i != 0) {
        localStringBuilder.append("、");
      }
      String str1 = com.tencent.mm.y.r.ft((String)paramArrayList.get(i));
      String str2 = com.tencent.mm.y.r.fs((String)paramArrayList.get(i));
      if (!TextUtils.isEmpty(str1)) {
        localStringBuilder.append(str1);
      }
      for (;;)
      {
        i += 1;
        break;
        localStringBuilder.append(str2);
      }
    }
    if (paramContext == null)
    {
      w.e("MicroMsg.ShareCardDataMgr", "context == null");
      GMTrace.o(5094502301696L, 37957);
      return "";
    }
    if ((paramArrayList.size() == 1) || (paramArrayList.size() == 2))
    {
      paramContext = paramContext.getString(R.l.ddM, new Object[] { localStringBuilder.toString() });
      GMTrace.o(5094502301696L, 37957);
      return paramContext;
    }
    paramContext = paramContext.getString(R.l.ddy, new Object[] { localStringBuilder.toString(), Integer.valueOf(paramArrayList.size()) });
    GMTrace.o(5094502301696L, 37957);
    return paramContext;
  }
  
  public static void a(Context paramContext, com.tencent.mm.plugin.card.base.b paramb)
  {
    GMTrace.i(5097455091712L, 37979);
    w.i("MicroMsg.ShareCardDataMgr", "updateShareCardData()");
    w.i("MicroMsg.ShareCardDataMgr", "card id:" + paramb.ajz() + " cardtpid:" + paramb.ajA());
    bB(paramb.ajz(), paramb.ajA());
    if (paramContext != null) {
      O(paramContext, paramb.ajA());
    }
    D(paramb.ajz(), paramb.ajA(), paramb.ajB());
    ua(paramb.ajA());
    GMTrace.o(5097455091712L, 37979);
  }
  
  private static void a(com.tencent.mm.plugin.card.sharecard.model.l paraml1, com.tencent.mm.plugin.card.sharecard.model.l paraml2, boolean paramBoolean)
  {
    GMTrace.i(5094099648512L, 37954);
    if ((paraml1 == null) && (paraml2 == null))
    {
      w.e("MicroMsg.ShareCardDataMgr", "don't updateCategoryType(), newData == null && oldData == null");
      GMTrace.o(5094099648512L, 37954);
      return;
    }
    if ((paraml1 != null) && (paraml1.jBg == null) && (paraml1.jBf == null) && (paraml2 != null) && (paraml2.jBg == null) && (paraml2.jBf == null))
    {
      w.e("MicroMsg.ShareCardDataMgr", "don't updateCategoryType(), newData.local_city_list == null && oldData.local_city_list == null");
      GMTrace.o(5094099648512L, 37954);
      return;
    }
    w.i("MicroMsg.ShareCardDataMgr", "updateCategoryType()");
    Object localObject1 = (ArrayList)al.aks().getValue("key_share_card_local_city_category_info_list");
    if (localObject1 == null) {
      localObject1 = new ArrayList();
    }
    for (;;)
    {
      ArrayList localArrayList = (ArrayList)al.aks().getValue("key_share_card_other_city_category_info_list");
      if (localArrayList == null) {
        localArrayList = new ArrayList();
      }
      for (;;)
      {
        int j = 0;
        int i;
        if (paramBoolean)
        {
          al.akv().lK(10);
          ((ArrayList)localObject1).clear();
          al.akv().lK(0);
          localArrayList.clear();
          j = 0;
          i = 0;
        }
        for (;;)
        {
          long l1 = System.currentTimeMillis();
          at.AR();
          long l2 = com.tencent.mm.y.c.yH().cE(Thread.currentThread().getId());
          Object localObject2;
          if ((paraml1 != null) && (paraml1.jBf != null) && (paraml1.jBf.size() > 0))
          {
            int k = 0;
            for (;;)
            {
              if (k < paraml1.jBf.size())
              {
                localObject2 = (m)paraml1.jBf.get(k);
                al.akv().z(((m)localObject2).jxF, 10, k + j);
                i locali = new i();
                locali.jxF = ((m)localObject2).jxF;
                locali.jBa = (k + j);
                ((ArrayList)localObject1).add(locali);
                k += 1;
                continue;
                i = j;
                if (paraml2 != null)
                {
                  i = j;
                  if (paraml2.jBf != null)
                  {
                    i = j;
                    if (paraml2.jBf.size() >= 0) {
                      i = paraml2.jBf.size();
                    }
                  }
                }
                if ((paraml2 == null) || (paraml2.jBg == null) || (paraml2.jBg.size() < 0)) {
                  break label702;
                }
                k = paraml2.jBg.size();
                j = i;
                i = k;
                break;
              }
            }
            if ((!paramBoolean) && (paraml2 != null) && (paraml2.jBf != null)) {
              paraml1.jBf.addAll(paraml2.jBf);
            }
          }
          for (;;)
          {
            al.aks().putValue("key_share_card_local_city_category_info_list", localObject1);
            if ((paraml1 == null) || (paraml1.jBg == null) || (paraml1.jBg.size() <= 0)) {
              break label672;
            }
            j = 0;
            while (j < paraml1.jBg.size())
            {
              localObject1 = (m)paraml1.jBg.get(j);
              al.akv().z(((m)localObject1).jxF, 0, j + i);
              localObject2 = new i();
              ((i)localObject2).jxF = ((m)localObject1).jxF;
              ((i)localObject2).jBa = (j + i);
              localArrayList.add(localObject2);
              j += 1;
            }
            if ((paraml1 != null) && (!paramBoolean) && (paraml2 != null) && (paraml2.jBf != null)) {
              paraml1.jBf = paraml2.jBf;
            }
          }
          if ((!paramBoolean) && (paraml2 != null) && (paraml2.jBg != null)) {
            paraml1.jBg.addAll(paraml2.jBg);
          }
          for (;;)
          {
            al.aks().putValue("key_share_card_other_city_category_info_list", localArrayList);
            at.AR();
            com.tencent.mm.y.c.yH().aL(l2);
            w.d("MicroMsg.ShareCardDataMgr", "updateCategoryType  >> updateCategoryInfo use time %s", new Object[] { Long.valueOf(System.currentTimeMillis() - l1) });
            GMTrace.o(5094099648512L, 37954);
            return;
            label672:
            if ((paraml1 != null) && (!paramBoolean) && (paraml2 != null) && (paraml2.jBg != null)) {
              paraml1.jBg = paraml2.jBg;
            }
          }
          label702:
          j = i;
          i = 0;
        }
      }
    }
  }
  
  private void a(com.tencent.mm.plugin.card.sharecard.model.l paraml, boolean paramBoolean)
  {
    GMTrace.i(5093965430784L, 37953);
    if (paraml == null)
    {
      w.e("MicroMsg.ShareCardDataMgr", "don't parserShareCardListData, data is null");
      GMTrace.o(5093965430784L, 37953);
      return;
    }
    w.i("MicroMsg.ShareCardDataMgr", "parserShareCardListData()");
    Object localObject1 = (Map)al.aks().getValue("key_share_card_annoucement_map");
    if (localObject1 == null) {
      localObject1 = new HashMap();
    }
    for (;;)
    {
      Object localObject2 = (Map)al.aks().getValue("key_share_card_count_map");
      if (localObject2 == null) {
        localObject2 = new HashMap();
      }
      for (;;)
      {
        Object localObject3 = (Map)al.aks().getValue("key_share_card_username_map");
        if (localObject3 == null) {
          localObject3 = new HashMap();
        }
        for (;;)
        {
          ArrayList localArrayList1 = (ArrayList)al.aks().getValue("key_share_card_local_city_ids");
          if (localArrayList1 == null) {
            localArrayList1 = new ArrayList();
          }
          for (;;)
          {
            ArrayList localArrayList2 = (ArrayList)al.aks().getValue("key_share_card_other_city_ids");
            if (localArrayList2 == null) {
              localArrayList2 = new ArrayList();
            }
            for (;;)
            {
              ArrayList localArrayList3 = (ArrayList)al.aks().getValue("key_share_card_other_city_top_info_list");
              if (localArrayList3 == null) {
                localArrayList3 = new ArrayList();
              }
              for (;;)
              {
                if (paramBoolean)
                {
                  localArrayList1.clear();
                  localArrayList2.clear();
                  localArrayList3.clear();
                }
                ArrayList localArrayList4 = new ArrayList();
                int i;
                m localm;
                int j;
                Object localObject4;
                if ((paraml.jBf != null) && (paraml.jBf.size() > 0))
                {
                  i = 0;
                  if (i < paraml.jBf.size())
                  {
                    localm = (m)paraml.jBf.get(i);
                    if (!TextUtils.isEmpty(localm.jBn)) {
                      ((Map)localObject1).put(localm.jxF, localm.jBn);
                    }
                    j = al.akv().uh(localm.jxF);
                    ((Map)localObject2).put(localm.jxF, Integer.valueOf(j));
                    ((Map)localObject3).put(localm.jxF, o(al.akv().ug(localm.jxF)));
                    if (!localArrayList4.contains(localm.jxF))
                    {
                      localObject4 = al.akv().ui(localm.jxF);
                      if ((TextUtils.isEmpty((CharSequence)localObject4)) || (localArrayList1.contains(localObject4))) {
                        break label471;
                      }
                      localArrayList1.add(localObject4);
                    }
                    for (;;)
                    {
                      localArrayList4.add(localm.jxF);
                      localObject4 = new p();
                      ((p)localObject4).jxF = localm.jxF;
                      ((p)localObject4).top = localm.top;
                      localArrayList3.add(localObject4);
                      i += 1;
                      break;
                      label471:
                      if (!localArrayList1.contains(localm.eTJ)) {
                        localArrayList1.add(localm.eTJ);
                      }
                    }
                  }
                }
                localArrayList4.clear();
                if ((paraml.jBg != null) && (paraml.jBg.size() > 0))
                {
                  i = 0;
                  if (i < paraml.jBg.size())
                  {
                    localm = (m)paraml.jBg.get(i);
                    if (!TextUtils.isEmpty(localm.jBn)) {
                      ((Map)localObject1).put(localm.jxF, localm.jBn);
                    }
                    j = al.akv().uh(localm.jxF);
                    ((Map)localObject2).put(localm.jxF, Integer.valueOf(j));
                    ((Map)localObject3).put(localm.jxF, o(al.akv().ug(localm.jxF)));
                    if (!localArrayList4.contains(localm.jxF))
                    {
                      localObject4 = al.akv().ui(localm.jxF);
                      if ((TextUtils.isEmpty((CharSequence)localObject4)) || (localArrayList2.contains(localObject4))) {
                        break label741;
                      }
                      localArrayList2.add(localObject4);
                    }
                    for (;;)
                    {
                      localArrayList4.add(localm.jxF);
                      localObject4 = new p();
                      ((p)localObject4).jxF = localm.jxF;
                      ((p)localObject4).top = localm.top;
                      localArrayList3.add(localObject4);
                      i += 1;
                      break;
                      label741:
                      if (!localArrayList2.contains(localm.eTJ)) {
                        localArrayList2.add(localm.eTJ);
                      }
                    }
                  }
                }
                al.aks().putValue("key_share_card_annoucement_map", localObject1);
                al.aks().putValue("key_share_card_count_map", localObject2);
                al.aks().putValue("key_share_card_username_map", localObject3);
                al.aks().putValue("key_share_card_local_city", paraml.jBh);
                al.aks().putValue("key_share_card_local_city_ids", localArrayList1);
                al.aks().putValue("key_share_card_other_city_ids", localArrayList2);
                al.aks().putValue("key_share_card_other_city_top_info_list", localArrayList3);
                GMTrace.o(5093965430784L, 37953);
                return;
              }
            }
          }
        }
      }
    }
  }
  
  public static int akF()
  {
    int i = 0;
    GMTrace.i(5093562777600L, 37950);
    Object localObject1 = al.akn();
    Object localObject2 = new StringBuilder();
    ((StringBuilder)localObject2).append(" where (status=0 OR ").append("status=5) AND ").append("card_type=10");
    localObject2 = "select count(*) from UserCardInfo" + ((StringBuilder)localObject2).toString();
    localObject1 = ((com.tencent.mm.plugin.card.model.c)localObject1).fTZ.a((String)localObject2, null, 2);
    if (localObject1 == null)
    {
      GMTrace.o(5093562777600L, 37950);
      return 0;
    }
    if (((Cursor)localObject1).moveToFirst()) {
      i = ((Cursor)localObject1).getInt(0);
    }
    ((Cursor)localObject1).close();
    GMTrace.o(5093562777600L, 37950);
    return i;
  }
  
  public static void akG()
  {
    GMTrace.i(5094233866240L, 37955);
    long l1 = System.currentTimeMillis();
    at.AR();
    long l2 = com.tencent.mm.y.c.yH().cE(Thread.currentThread().getId());
    w.i("MicroMsg.ShareCardDataMgr", "updateShareCardCategory()");
    Object localObject = (ArrayList)al.aks().getValue("key_share_card_local_city_category_info_list");
    if (localObject == null) {
      localObject = new ArrayList();
    }
    for (;;)
    {
      ArrayList localArrayList = (ArrayList)al.aks().getValue("key_share_card_other_city_category_info_list");
      if (localArrayList == null) {
        localArrayList = new ArrayList();
      }
      for (;;)
      {
        int i = 0;
        while (i < ((ArrayList)localObject).size())
        {
          i locali = (i)((ArrayList)localObject).get(i);
          al.akv().z(locali.jxF, 10, locali.jBa);
          i += 1;
        }
        i = 0;
        while (i < localArrayList.size())
        {
          localObject = (i)localArrayList.get(i);
          al.akv().z(((i)localObject).jxF, 0, ((i)localObject).jBa);
          i += 1;
        }
        at.AR();
        com.tencent.mm.y.c.yH().aL(l2);
        w.i("MicroMsg.ShareCardDataMgr", "updateShareCardCategory  >> updateCategoryInfo use time %s", new Object[] { Long.valueOf(System.currentTimeMillis() - l1) });
        GMTrace.o(5094233866240L, 37955);
        return;
      }
    }
  }
  
  public static int akH()
  {
    GMTrace.i(5095307608064L, 37963);
    if (akJ())
    {
      GMTrace.o(5095307608064L, 37963);
      return 1;
    }
    if (akI())
    {
      if (jAR)
      {
        GMTrace.o(5095307608064L, 37963);
        return 3;
      }
      GMTrace.o(5095307608064L, 37963);
      return 4;
    }
    GMTrace.o(5095307608064L, 37963);
    return 0;
  }
  
  public static boolean akI()
  {
    GMTrace.i(5095441825792L, 37964);
    ArrayList localArrayList = (ArrayList)al.aks().getValue("key_share_card_other_city_ids");
    if ((localArrayList != null) && (localArrayList.size() > 0))
    {
      GMTrace.o(5095441825792L, 37964);
      return true;
    }
    GMTrace.o(5095441825792L, 37964);
    return false;
  }
  
  public static boolean akJ()
  {
    GMTrace.i(5095576043520L, 37965);
    ArrayList localArrayList = (ArrayList)al.aks().getValue("key_share_card_local_city_ids");
    if ((localArrayList != null) && (localArrayList.size() > 0))
    {
      GMTrace.o(5095576043520L, 37965);
      return true;
    }
    GMTrace.o(5095576043520L, 37965);
    return false;
  }
  
  public static void akK()
  {
    GMTrace.i(5096381349888L, 37971);
    w.i("MicroMsg.ShareCardDataMgr", "delelteAllIllegalStatusCard()");
    com.tencent.mm.sdk.f.e.post(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(5093160124416L, 37947);
        w.i("MicroMsg.ShareCardDataMgr", "begin to delelteAllIllegalStatusCard()");
        Object localObject1 = al.akv();
        Object localObject2 = new StringBuilder();
        ((StringBuilder)localObject2).append(" where (status=1 OR ").append("status=2 OR status").append("=3 OR status=4").append(" OR status=6)");
        localObject2 = "delete from ShareCardInfo" + ((StringBuilder)localObject2).toString();
        boolean bool = ((k)localObject1).fTZ.eZ("ShareCardInfo", (String)localObject2);
        localObject1 = new StringBuilder("delelteAllIllegalStatusCard updateRet is ");
        if (bool) {}
        for (int i = 1;; i = 0)
        {
          w.i("MicroMsg.ShareCardInfoStorage", i);
          w.i("MicroMsg.ShareCardDataMgr", "end to delelteAllIllegalStatusCard()");
          GMTrace.o(5093160124416L, 37947);
          return;
        }
      }
    }, "delelteAllIllegalStatusCard");
    GMTrace.o(5096381349888L, 37971);
  }
  
  public static boolean akL()
  {
    GMTrace.i(5097186656256L, 37977);
    com.tencent.mm.plugin.card.sharecard.model.l locall = (com.tencent.mm.plugin.card.sharecard.model.l)al.aks().getValue("key_share_card_layout_data");
    if (locall == null)
    {
      GMTrace.o(5097186656256L, 37977);
      return true;
    }
    boolean bool = locall.jBi;
    GMTrace.o(5097186656256L, 37977);
    return bool;
  }
  
  public static boolean akM()
  {
    GMTrace.i(5097320873984L, 37978);
    com.tencent.mm.plugin.card.sharecard.model.l locall = (com.tencent.mm.plugin.card.sharecard.model.l)al.aks().getValue("key_share_card_layout_data");
    if (locall == null)
    {
      GMTrace.o(5097320873984L, 37978);
      return true;
    }
    boolean bool = locall.jBj;
    GMTrace.o(5097320873984L, 37978);
    return bool;
  }
  
  public static void bB(String paramString1, String paramString2)
  {
    GMTrace.i(5095039172608L, 37961);
    if (gqR)
    {
      w.i("MicroMsg.ShareCardDataMgr", "is isUpdating data, don't do updateCardIdsListByCardId");
      GMTrace.o(5095039172608L, 37961);
      return;
    }
    w.i("MicroMsg.ShareCardDataMgr", "do updateCardIdsListByCardId");
    gqR = true;
    ArrayList localArrayList = lG(1);
    if ((localArrayList != null) && (localArrayList.contains(paramString1)))
    {
      localArrayList.remove(paramString1);
      String str = al.akv().bE(paramString1, paramString2);
      if (!TextUtils.isEmpty(str)) {
        localArrayList.add(str);
      }
      al.aks().putValue("key_share_card_local_city_ids", localArrayList);
    }
    localArrayList = lG(2);
    if ((localArrayList != null) && (localArrayList.contains(paramString1)))
    {
      localArrayList.remove(paramString1);
      paramString1 = al.akv().bE(paramString1, paramString2);
      if (!TextUtils.isEmpty(paramString1)) {
        localArrayList.add(paramString1);
      }
      al.aks().putValue("key_share_card_other_city_ids", localArrayList);
    }
    gqR = false;
    GMTrace.o(5095039172608L, 37961);
  }
  
  public static void bC(String paramString1, String paramString2)
  {
    GMTrace.i(5095173390336L, 37962);
    w.i("MicroMsg.ShareCardDataMgr", "addCardIdsListByCardId card_id:" + paramString1 + ", card_tp_id:" + paramString2);
    ArrayList localArrayList1 = lG(1);
    if ((localArrayList1 != null) && (localArrayList1.contains(paramString1)))
    {
      GMTrace.o(5095173390336L, 37962);
      return;
    }
    ArrayList localArrayList2 = lG(2);
    if ((localArrayList2 != null) && (localArrayList2.contains(paramString1)))
    {
      GMTrace.o(5095173390336L, 37962);
      return;
    }
    com.tencent.mm.plugin.card.sharecard.model.l locall = (com.tencent.mm.plugin.card.sharecard.model.l)al.aks().getValue("key_share_card_layout_data");
    if (locall == null)
    {
      w.e("MicroMsg.ShareCardDataMgr", "addCardIdsListByCardId data == null");
      GMTrace.o(5095173390336L, 37962);
      return;
    }
    int j = al.akv().uh(paramString2);
    int k = uc(paramString2);
    w.e("MicroMsg.ShareCardDataMgr", "addCardIdsListByCardId realCount:" + j + " cacheCount:" + k);
    int i;
    if ((locall.jBf != null) && (locall.jBf.size() > 0) && ((k <= 0) || (j == 1))) {
      i = 0;
    }
    while (i < locall.jBf.size())
    {
      m localm = (m)locall.jBf.get(i);
      if ((paramString2 != null) && (paramString2.contains(localm.jxF)))
      {
        localArrayList1.add(paramString1);
        al.aks().putValue("key_share_card_local_city_ids", localArrayList1);
        w.i("MicroMsg.ShareCardDataMgr", "addCardIdsListByCardId add for local ids, card id is " + paramString1);
        GMTrace.o(5095173390336L, 37962);
        return;
      }
      i += 1;
      continue;
      w.i("MicroMsg.ShareCardDataMgr", "addCardIdsListByCardId, not add for local_ids");
    }
    if ((localArrayList2 != null) && ((k <= 0) || (j == 1)))
    {
      localArrayList2.add(paramString1);
      al.aks().putValue("key_share_card_other_city_ids", localArrayList2);
      w.i("MicroMsg.ShareCardDataMgr", "addCardIdsListByCardId add for other ids, card id is " + paramString1);
      GMTrace.o(5095173390336L, 37962);
      return;
    }
    w.i("MicroMsg.ShareCardDataMgr", "addCardIdsListByCardId, not add for other_ids");
    GMTrace.o(5095173390336L, 37962);
  }
  
  public static String bD(String paramString1, String paramString2)
  {
    GMTrace.i(5097052438528L, 37976);
    w.i("MicroMsg.ShareCardDataMgr", "initShareUserCardId()");
    if (paramString2 != null)
    {
      paramString2 = ud(paramString2);
      if ((paramString2 != null) && (paramString2.size() > 0))
      {
        paramString2 = (com.tencent.mm.plugin.card.sharecard.model.r)paramString2.get(0);
        if ((paramString2 != null) && (paramString2.jBt != null) && (paramString2.jBt.size() > 0) && (!paramString1.equals(paramString2.jBt.get(0))))
        {
          paramString1 = (String)paramString2.jBt.get(0);
          w.i("MicroMsg.ShareCardDataMgr", "initShareUserCardId(), mCardId is not first!, reset it");
        }
      }
    }
    for (;;)
    {
      GMTrace.o(5097052438528L, 37976);
      return paramString1;
      w.i("MicroMsg.ShareCardDataMgr", "initShareUserCardId(), mCardId is first!");
      continue;
      w.e("MicroMsg.ShareCardDataMgr", "initShareUserCardId(), shareUserInfoList is null");
      continue;
      w.e("MicroMsg.ShareCardDataMgr", "initShareUserCardId(), card_tp_id is null");
    }
  }
  
  public static String jg(String paramString)
  {
    GMTrace.i(5095978696704L, 37968);
    Map localMap = (Map)al.aks().getValue("key_share_card_username_map");
    if (localMap == null)
    {
      GMTrace.o(5095978696704L, 37968);
      return "";
    }
    paramString = (String)localMap.get(paramString);
    GMTrace.o(5095978696704L, 37968);
    return paramString;
  }
  
  public static ArrayList<String> lG(int paramInt)
  {
    GMTrace.i(5094770737152L, 37959);
    ArrayList localArrayList;
    if (paramInt == 1)
    {
      localArrayList = (ArrayList)al.aks().getValue("key_share_card_local_city_ids");
      if ((localArrayList == null) || (localArrayList.size() == 0))
      {
        w.e("MicroMsg.ShareCardDataMgr", "getCardIds() ids == null || ids.size() == 0 for showType == " + paramInt);
        localArrayList = lH(paramInt);
        GMTrace.o(5094770737152L, 37959);
        return localArrayList;
      }
      GMTrace.o(5094770737152L, 37959);
      return localArrayList;
    }
    if (paramInt == 2)
    {
      localArrayList = (ArrayList)al.aks().getValue("key_share_card_other_city_ids");
      if ((localArrayList == null) || (localArrayList.size() == 0))
      {
        w.e("MicroMsg.ShareCardDataMgr", "getCardIds() ids == null || ids.size() == 0 for showType == " + paramInt);
        localArrayList = lH(paramInt);
        GMTrace.o(5094770737152L, 37959);
        return localArrayList;
      }
      GMTrace.o(5094770737152L, 37959);
      return localArrayList;
    }
    GMTrace.o(5094770737152L, 37959);
    return null;
  }
  
  private static ArrayList<String> lH(int paramInt)
  {
    GMTrace.i(5094904954880L, 37960);
    com.tencent.mm.plugin.card.sharecard.model.l locall = (com.tencent.mm.plugin.card.sharecard.model.l)al.aks().getValue("key_share_card_layout_data");
    if (locall == null)
    {
      w.e("MicroMsg.ShareCardDataMgr", "getCardIdsByType() data == null for showType = " + paramInt);
      GMTrace.o(5094904954880L, 37960);
      return null;
    }
    ArrayList localArrayList1 = new ArrayList();
    ArrayList localArrayList2 = new ArrayList();
    m localm;
    String str;
    if (paramInt == 1)
    {
      if ((locall.jBf != null) && (locall.jBf.size() > 0))
      {
        paramInt = 0;
        if (paramInt < locall.jBf.size())
        {
          localm = (m)locall.jBf.get(paramInt);
          if (!localArrayList2.contains(localm.jxF))
          {
            str = al.akv().ui(localm.jxF);
            if ((TextUtils.isEmpty(str)) || (localArrayList1.contains(str))) {
              break label189;
            }
            localArrayList1.add(str);
          }
          for (;;)
          {
            localArrayList2.add(localm.jxF);
            paramInt += 1;
            break;
            label189:
            if (!localArrayList1.contains(localm.eTJ)) {
              localArrayList1.add(localm.eTJ);
            }
          }
        }
        al.aks().putValue("key_share_card_local_city_ids", localArrayList1);
      }
      GMTrace.o(5094904954880L, 37960);
      return localArrayList1;
    }
    if (paramInt == 2)
    {
      if ((locall.jBg != null) && (locall.jBg.size() > 0))
      {
        paramInt = 0;
        if (paramInt < locall.jBg.size())
        {
          localm = (m)locall.jBg.get(paramInt);
          if (!localArrayList2.contains(localm.jxF))
          {
            str = al.akv().ui(localm.jxF);
            if ((TextUtils.isEmpty(str)) || (localArrayList1.contains(str))) {
              break label349;
            }
            localArrayList1.add(str);
          }
          for (;;)
          {
            localArrayList2.add(localm.jxF);
            paramInt += 1;
            break;
            label349:
            if (!localArrayList1.contains(localm.eTJ)) {
              localArrayList1.add(localm.eTJ);
            }
          }
        }
        al.aks().putValue("key_share_card_other_city_ids", localArrayList1);
      }
      GMTrace.o(5094904954880L, 37960);
      return localArrayList1;
    }
    GMTrace.o(5094904954880L, 37960);
    return null;
  }
  
  public static boolean lI(int paramInt)
  {
    GMTrace.i(5096649785344L, 37973);
    Object localObject = (Integer)al.aks().getValue("key_share_card_show_type");
    if (localObject == null)
    {
      GMTrace.o(5096649785344L, 37973);
      return false;
    }
    if (((Integer)localObject).intValue() == 0)
    {
      GMTrace.o(5096649785344L, 37973);
      return false;
    }
    if (paramInt == 0)
    {
      localObject = (ArrayList)al.aks().getValue("key_share_card_other_city_ids");
      if ((localObject == null) || (((ArrayList)localObject).size() == 0))
      {
        GMTrace.o(5096649785344L, 37973);
        return false;
      }
      GMTrace.o(5096649785344L, 37973);
      return true;
    }
    if (paramInt == 10)
    {
      localObject = (ArrayList)al.aks().getValue("key_share_card_local_city_ids");
      if ((localObject == null) || (((ArrayList)localObject).size() == 0))
      {
        GMTrace.o(5096649785344L, 37973);
        return false;
      }
      GMTrace.o(5096649785344L, 37973);
      return true;
    }
    GMTrace.o(5096649785344L, 37973);
    return false;
  }
  
  private String o(ArrayList<String> paramArrayList)
  {
    GMTrace.i(5094368083968L, 37956);
    paramArrayList = a(this.mContext, paramArrayList);
    GMTrace.o(5094368083968L, 37956);
    return paramArrayList;
  }
  
  public static void ua(String paramString)
  {
    GMTrace.i(5094636519424L, 37958);
    w.i("MicroMsg.ShareCardDataMgr", "updateShareUserInfo()");
    if (TextUtils.isEmpty(paramString))
    {
      w.e("MicroMsg.ShareCardDataMgr", "updateShareUserInfo(), card_tp_id is empty");
      GMTrace.o(5094636519424L, 37958);
      return;
    }
    com.tencent.mm.sdk.f.e.post(new Runnable()
    {
      public final void run()
      {
        final Object localObject1 = null;
        GMTrace.i(5098126180352L, 37984);
        w.i("MicroMsg.ShareCardDataMgr", "begin to getShareUserInfo()");
        Object localObject2 = al.akv();
        Object localObject3 = this.jAS;
        w.i("MicroMsg.ShareCardInfoStorage", "getShareUserInfo()");
        Object localObject4 = new StringBuilder();
        ((StringBuilder)localObject4).append(" where ( status=0) ");
        ((StringBuilder)localObject4).append(" AND (card_tp_id = '" + (String)localObject3 + "' )");
        ((StringBuilder)localObject4).append(" order by share_time desc ");
        localObject3 = "select * from ShareCardInfo" + ((StringBuilder)localObject4).toString();
        localObject3 = ((k)localObject2).fTZ.a((String)localObject3, null, 2);
        if (localObject3 == null)
        {
          w.i("MicroMsg.ShareCardInfoStorage", "getShareUserInfo(), cursor == null");
          w.i("MicroMsg.ShareCardDataMgr", "end to getShareUserInfo(), 1");
          if ((localObject1 == null) || (((ArrayList)localObject1).size() == 0))
          {
            w.e("MicroMsg.ShareCardDataMgr", "getShareUserInfo(), share_user_list is null");
            GMTrace.o(5098126180352L, 37984);
          }
        }
        else
        {
          localObject2 = new ArrayList();
          localObject4 = new ArrayList();
        }
        label187:
        label305:
        label454:
        label457:
        for (;;)
        {
          ShareCardInfo localShareCardInfo;
          int i;
          if (((Cursor)localObject3).moveToNext())
          {
            localShareCardInfo = new ShareCardInfo();
            localShareCardInfo.b((Cursor)localObject3);
            if (!((ArrayList)localObject4).contains(localShareCardInfo.field_from_username))
            {
              localObject1 = new com.tencent.mm.plugin.card.sharecard.model.r();
              ((com.tencent.mm.plugin.card.sharecard.model.r)localObject1).jxF = localShareCardInfo.field_card_tp_id;
              ((com.tencent.mm.plugin.card.sharecard.model.r)localObject1).jBs = localShareCardInfo.field_from_username;
              ((com.tencent.mm.plugin.card.sharecard.model.r)localObject1).jBt = new ArrayList();
              ((com.tencent.mm.plugin.card.sharecard.model.r)localObject1).jBt.add(localShareCardInfo.field_card_id);
              ((com.tencent.mm.plugin.card.sharecard.model.r)localObject1).cen = 1;
              ((ArrayList)localObject2).add(localObject1);
              ((ArrayList)localObject4).add(localShareCardInfo.field_from_username);
              continue;
            }
            i = 0;
            localObject1 = null;
            if (i >= ((ArrayList)localObject2).size()) {
              break label454;
            }
            localObject1 = (com.tencent.mm.plugin.card.sharecard.model.r)((ArrayList)localObject2).get(i);
            if ((localShareCardInfo.field_from_username == null) || (!localShareCardInfo.field_from_username.equals(((com.tencent.mm.plugin.card.sharecard.model.r)localObject1).jBs))) {}
          }
          for (;;)
          {
            if (localObject1 == null) {
              break label457;
            }
            ((com.tencent.mm.plugin.card.sharecard.model.r)localObject1).jBt.add(0, localShareCardInfo.field_card_id);
            ((com.tencent.mm.plugin.card.sharecard.model.r)localObject1).cen += 1;
            ((ArrayList)localObject2).set(i, localObject1);
            break label187;
            i += 1;
            break label305;
            ((Cursor)localObject3).close();
            localObject1 = localObject2;
            break;
            if (((ArrayList)localObject1).get(0) != null) {
              ((com.tencent.mm.plugin.card.sharecard.model.r)((ArrayList)localObject1).get(0)).jBu = true;
            }
            w.i("MicroMsg.ShareCardDataMgr", "end to getShareUserInfo(), 2");
            this.jAT.post(new Runnable()
            {
              public final void run()
              {
                GMTrace.i(5098931486720L, 37990);
                Map localMap = (Map)al.aks().getValue("key_share_user_info_map");
                Object localObject = localMap;
                if (localMap == null) {
                  localObject = new HashMap();
                }
                ((Map)localObject).put(b.1.this.jAS, localObject1);
                al.aks().putValue("key_share_user_info_map", localObject);
                GMTrace.o(5098931486720L, 37990);
              }
            });
            GMTrace.o(5098126180352L, 37984);
            return;
            i = 0;
          }
        }
      }
    }, "updateShareUserInfo_thread");
    GMTrace.o(5094636519424L, 37958);
  }
  
  public static String ub(String paramString)
  {
    GMTrace.i(5095710261248L, 37966);
    Map localMap = (Map)al.aks().getValue("key_share_card_annoucement_map");
    if (localMap == null)
    {
      GMTrace.o(5095710261248L, 37966);
      return "";
    }
    paramString = (String)localMap.get(paramString);
    GMTrace.o(5095710261248L, 37966);
    return paramString;
  }
  
  public static int uc(String paramString)
  {
    GMTrace.i(5095844478976L, 37967);
    Map localMap = (Map)al.aks().getValue("key_share_card_count_map");
    if (localMap == null)
    {
      GMTrace.o(5095844478976L, 37967);
      return 0;
    }
    paramString = (Integer)localMap.get(paramString);
    if (paramString == null)
    {
      GMTrace.o(5095844478976L, 37967);
      return 0;
    }
    int i = paramString.intValue();
    GMTrace.o(5095844478976L, 37967);
    return i;
  }
  
  public static ArrayList<com.tencent.mm.plugin.card.sharecard.model.r> ud(String paramString)
  {
    GMTrace.i(5096112914432L, 37969);
    Map localMap = (Map)al.aks().getValue("key_share_user_info_map");
    Object localObject = localMap;
    if (localMap == null) {
      localObject = new HashMap();
    }
    paramString = (ArrayList)((Map)localObject).get(paramString);
    if (paramString == null)
    {
      paramString = new ArrayList();
      GMTrace.o(5096112914432L, 37969);
      return paramString;
    }
    GMTrace.o(5096112914432L, 37969);
    return paramString;
  }
  
  public static boolean ue(String paramString)
  {
    GMTrace.i(5096784003072L, 37974);
    if (TextUtils.isEmpty(paramString))
    {
      GMTrace.o(5096784003072L, 37974);
      return false;
    }
    Object localObject2 = (ArrayList)al.aks().getValue("key_share_card_other_city_top_info_list");
    Object localObject1 = localObject2;
    if (localObject2 == null) {
      localObject1 = new ArrayList();
    }
    localObject1 = ((ArrayList)localObject1).iterator();
    while (((Iterator)localObject1).hasNext())
    {
      localObject2 = (p)((Iterator)localObject1).next();
      if ((localObject2 != null) && (paramString.equals(((p)localObject2).jxF)) && (((p)localObject2).top == 1))
      {
        GMTrace.o(5096784003072L, 37974);
        return true;
      }
    }
    GMTrace.o(5096784003072L, 37974);
    return false;
  }
  
  public static void uf(String paramString)
  {
    GMTrace.i(5096918220800L, 37975);
    if (TextUtils.isEmpty(paramString))
    {
      GMTrace.o(5096918220800L, 37975);
      return;
    }
    ArrayList localArrayList = (ArrayList)al.aks().getValue("key_share_card_other_city_top_info_list");
    if (localArrayList == null) {
      localArrayList = new ArrayList();
    }
    for (;;)
    {
      int i = 0;
      while (i < localArrayList.size())
      {
        p localp = (p)localArrayList.get(i);
        if ((localp != null) && (paramString.equals(localp.jxF)) && (localp.top == 1))
        {
          localp.jBr = true;
          localArrayList.set(i, localp);
          al.aks().putValue("key_share_card_other_city_top_info_list", localArrayList);
          GMTrace.o(5096918220800L, 37975);
          return;
        }
        i += 1;
      }
      GMTrace.o(5096918220800L, 37975);
      return;
    }
  }
  
  public final void R(String paramString, boolean paramBoolean)
  {
    GMTrace.i(5093831213056L, 37952);
    if (TextUtils.isEmpty(paramString))
    {
      w.e("MicroMsg.ShareCardDataMgr", "updateGetShareLayoutData json is empty");
      GMTrace.o(5093831213056L, 37952);
      return;
    }
    long l = System.currentTimeMillis();
    Object localObject1 = s.uN(paramString);
    Object localObject2 = (com.tencent.mm.plugin.card.sharecard.model.l)al.aks().getValue("key_share_card_layout_data");
    if (localObject1 == null)
    {
      w.e("MicroMsg.ShareCardDataMgr", "updateGetShareLayoutData data == null");
      a((com.tencent.mm.plugin.card.sharecard.model.l)localObject1, (com.tencent.mm.plugin.card.sharecard.model.l)localObject2, paramBoolean);
      al.aks().putValue("key_share_card_layout_data", localObject1);
      GMTrace.o(5093831213056L, 37952);
      return;
    }
    if (paramBoolean) {
      com.tencent.mm.plugin.card.b.l.uF(paramString);
    }
    a((com.tencent.mm.plugin.card.sharecard.model.l)localObject1, paramBoolean);
    a((com.tencent.mm.plugin.card.sharecard.model.l)localObject1, (com.tencent.mm.plugin.card.sharecard.model.l)localObject2, paramBoolean);
    al.aks().putValue("key_share_card_layout_data", localObject1);
    int j = 0;
    int i = j;
    if (((com.tencent.mm.plugin.card.sharecard.model.l)localObject1).jBf != null)
    {
      i = j;
      if (((com.tencent.mm.plugin.card.sharecard.model.l)localObject1).jBf.size() > 0) {
        i = ((com.tencent.mm.plugin.card.sharecard.model.l)localObject1).jBf.size();
      }
    }
    j = i;
    if (((com.tencent.mm.plugin.card.sharecard.model.l)localObject1).jBg != null)
    {
      j = i;
      if (((com.tencent.mm.plugin.card.sharecard.model.l)localObject1).jBg.size() > 0) {
        j = i + ((com.tencent.mm.plugin.card.sharecard.model.l)localObject1).jBg.size();
      }
    }
    if (j > 0)
    {
      i = (int)(System.currentTimeMillis() - l);
      paramString = new ArrayList();
      localObject1 = new IDKey();
      ((IDKey)localObject1).SetID(281);
      ((IDKey)localObject1).SetKey(10);
      ((IDKey)localObject1).SetValue(1L);
      localObject2 = new IDKey();
      ((IDKey)localObject2).SetID(281);
      ((IDKey)localObject2).SetKey(11);
      ((IDKey)localObject2).SetValue(i);
      IDKey localIDKey1 = new IDKey();
      localIDKey1.SetID(281);
      localIDKey1.SetKey(12);
      localIDKey1.SetValue(j);
      IDKey localIDKey2 = new IDKey();
      localIDKey2.SetID(281);
      localIDKey2.SetKey(14);
      localIDKey2.SetValue(i / j);
      paramString.add(localObject1);
      paramString.add(localObject2);
      paramString.add(localIDKey1);
      paramString.add(localIDKey2);
      com.tencent.mm.plugin.report.service.g.ork.b(paramString, true);
    }
    GMTrace.o(5093831213056L, 37952);
  }
  
  public final void init()
  {
    GMTrace.i(5093428559872L, 37949);
    if ((com.tencent.mm.plugin.card.sharecard.model.l)al.aks().getValue("key_share_card_layout_data") == null)
    {
      w.e("MicroMsg.ShareCardDataMgr", "initShareCardLayoutData, data cache is empty!, load data from db!");
      Object localObject = com.tencent.mm.plugin.card.b.l.amY();
      if (TextUtils.isEmpty((CharSequence)localObject))
      {
        w.e("MicroMsg.ShareCardDataMgr", "initShareCardLayoutData, json is empty");
        GMTrace.o(5093428559872L, 37949);
        return;
      }
      localObject = s.uN((String)localObject);
      if (localObject != null)
      {
        w.i("MicroMsg.ShareCardDataMgr", "load share card layout data success!");
        al.aks().putValue("key_share_card_layout_data", localObject);
        a((com.tencent.mm.plugin.card.sharecard.model.l)localObject, true);
        GMTrace.o(5093428559872L, 37949);
        return;
      }
      w.e("MicroMsg.ShareCardDataMgr", "load share card layout data fail!");
      GMTrace.o(5093428559872L, 37949);
      return;
    }
    w.i("MicroMsg.ShareCardDataMgr", "the share card layout cache is valid!");
    GMTrace.o(5093428559872L, 37949);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\card\sharecard\a\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */