package com.tencent.mm.plugin.emoji.f;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.ad.k.b;
import com.tencent.mm.bu.g;
import com.tencent.mm.g.a.au;
import com.tencent.mm.g.a.au.b;
import com.tencent.mm.network.q;
import com.tencent.mm.plugin.emoji.a.a.f;
import com.tencent.mm.plugin.emoji.e.l;
import com.tencent.mm.plugin.emoji.model.h;
import com.tencent.mm.plugin.emoji.sync.BKGLoaderManager;
import com.tencent.mm.protocal.c.aab;
import com.tencent.mm.protocal.c.aac;
import com.tencent.mm.protocal.c.azp;
import com.tencent.mm.protocal.c.rh;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.emotion.EmojiGroupInfo;
import com.tencent.mm.storage.emotion.p;
import com.tencent.mm.storage.t;
import com.tencent.mm.storage.w.a;
import com.tencent.mm.y.at;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public final class n
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  private final com.tencent.mm.ad.b fUa;
  private com.tencent.mm.ad.e fUd;
  private final int gRb;
  public byte[] klL;
  public int klN;
  private boolean klO;
  private ArrayList<rh> klP;
  public final int mType;
  
  public n(int paramInt1, int paramInt2)
  {
    this(paramInt1, null, paramInt2);
    GMTrace.i(11294690246656L, 84152);
    GMTrace.o(11294690246656L, 84152);
  }
  
  public n(int paramInt1, byte[] paramArrayOfByte, int paramInt2)
  {
    this(paramInt1, paramArrayOfByte, paramInt2, false);
    GMTrace.i(11294824464384L, 84153);
    GMTrace.o(11294824464384L, 84153);
  }
  
  public n(int paramInt1, byte[] paramArrayOfByte, int paramInt2, boolean paramBoolean)
  {
    GMTrace.i(11294958682112L, 84154);
    this.klO = false;
    this.klP = new ArrayList();
    this.klL = null;
    b.a locala = new b.a();
    locala.gtF = new aab();
    locala.gtG = new aac();
    locala.uri = "/cgi-bin/micromsg-bin/getemotionlist";
    locala.gtE = 411;
    locala.gtH = 210;
    locala.gtI = 1000000210;
    this.fUa = locala.DA();
    this.klL = paramArrayOfByte;
    this.mType = paramInt1;
    this.gRb = paramInt2;
    this.klO = paramBoolean;
    GMTrace.o(11294958682112L, 84154);
  }
  
  public static com.tencent.mm.plugin.emoji.model.e a(aac paramaac)
  {
    GMTrace.i(11295629770752L, 84159);
    w.d("MicroMsg.emoji.NetSceneGetEmotionList", "getEmotionListModel");
    if (paramaac == null)
    {
      GMTrace.o(11295629770752L, 84159);
      return null;
    }
    com.tencent.mm.plugin.emoji.model.e locale = new com.tencent.mm.plugin.emoji.model.e();
    if (paramaac != null)
    {
      locale.kkn = paramaac.uqH;
      Object localObject1 = new ArrayList();
      if ((paramaac.uqI != null) && (!paramaac.uqI.isEmpty()))
      {
        Object[] arrayOfObject = paramaac.uqI.toArray();
        if ((arrayOfObject != null) && (arrayOfObject.length > 0))
        {
          int j = arrayOfObject.length;
          int i = 0;
          while (i < j)
          {
            Object localObject2 = arrayOfObject[i];
            if ((localObject2 != null) && ((localObject2 instanceof rh)))
            {
              localObject2 = (rh)localObject2;
              if ((localObject2 != null) && (!bg.nm(((rh)localObject2).tRS))) {
                ((List)localObject1).add(new f((rh)localObject2));
              }
            }
            i += 1;
          }
        }
      }
      locale.kko = ((List)localObject1);
      locale.kkp = paramaac.uqJ;
      locale.kkq = paramaac.uqL;
      localObject1 = paramaac.uqT;
      if (locale.kks == null)
      {
        locale.kks = new LinkedList();
        locale.kks.addAll((Collection)localObject1);
      }
      locale.kkr = paramaac.uqP;
    }
    GMTrace.o(11295629770752L, 84159);
    return locale;
  }
  
  private void arC()
  {
    GMTrace.i(11296032423936L, 84162);
    aac localaac = arB();
    if ((localaac != null) && (localaac.uqI != null) && (localaac.uqI.size() > 0))
    {
      this.klP.addAll(localaac.uqI);
      GMTrace.o(11296032423936L, 84162);
      return;
    }
    w.w("MicroMsg.emoji.NetSceneGetEmotionList", "addSummaryList faild. response is null or emotion list is empty.");
    GMTrace.o(11296032423936L, 84162);
  }
  
  private void u(ArrayList<rh> paramArrayList)
  {
    GMTrace.i(11296166641664L, 84163);
    com.tencent.mm.storage.emotion.a locala = h.arl().kjz;
    if (locala == null)
    {
      w.w("MicroMsg.emoji.NetSceneGetEmotionList", "preparedDownloadStoreEmojiList failed. get emoji group info storage failed.");
      GMTrace.o(11296166641664L, 84163);
      return;
    }
    long l2 = System.currentTimeMillis();
    Object localObject2;
    long l1;
    if ((locala.fTZ instanceof g))
    {
      localObject2 = (g)locala.fTZ;
      l1 = ((g)localObject2).cE(Thread.currentThread().getId());
      w.i("MicroMsg.emoji.EmojiGroupInfoStorage", "surround preparedDownloadCustomEmojiList in a transaction, ticket = %d", new Object[] { Long.valueOf(l1) });
    }
    for (;;)
    {
      if ((paramArrayList != null) && (paramArrayList.size() > 0)) {
        if ((paramArrayList == null) || (paramArrayList.size() <= 0))
        {
          w.e("MicroMsg.emoji.EmojiGroupInfoStorage", "updateEmojiGroupByEmotionSummary empty summary.");
          if (localObject2 != null)
          {
            ((g)localObject2).aL(l1);
            w.i("MicroMsg.emoji.EmojiGroupInfoStorage", "end updateList transaction");
          }
          w.i("MicroMsg.emoji.EmojiGroupInfoStorage", "[cpan] preparedDownloadCustomEmojiList use time:%d", new Object[] { Long.valueOf(System.currentTimeMillis() - Long.valueOf(l2).longValue()) });
          locala.a("event_update_group", 0, bg.bQW().toString());
          if (!this.klO) {
            break label1374;
          }
          if ((paramArrayList == null) || (paramArrayList.size() <= 0)) {
            break label1537;
          }
          w.i("MicroMsg.emoji.NetSceneGetEmotionList", "try to sync store emoji list:size:%d force", new Object[] { Integer.valueOf(paramArrayList.size()) });
          localObject1 = new ArrayList();
          paramArrayList = paramArrayList.iterator();
        }
      }
      for (;;)
      {
        if (!paramArrayList.hasNext()) {
          break label1336;
        }
        localObject2 = (rh)paramArrayList.next();
        if ((localObject2 != null) && (!bg.nm(((rh)localObject2).tRS)))
        {
          if (((rh)localObject2).tRS.equals(String.valueOf(EmojiGroupInfo.vCl)))
          {
            ((ArrayList)localObject1).add(new com.tencent.mm.plugin.emoji.sync.a.c("com.tencent.xin.emoticon.tusiji"));
            continue;
            HashMap localHashMap = locala.bUy();
            ArrayList localArrayList1 = new ArrayList();
            ArrayList localArrayList2 = new ArrayList();
            int j = paramArrayList.size();
            w.i("MicroMsg.emoji.EmojiGroupInfoStorage", "updateEmojiGroupByEmotionSummary size:%d", new Object[] { Integer.valueOf(j) });
            int i = 0;
            Object localObject3;
            while (i < j)
            {
              rh localrh = (rh)paramArrayList.get(i);
              if ((localrh == null) || (bg.nm(localrh.tRS)))
              {
                w.w("MicroMsg.emoji.EmojiGroupInfoStorage", "summary is null or product id is null.");
                i += 1;
              }
              else
              {
                w.i("MicroMsg.emoji.EmojiGroupInfoStorage", "summary productID:%s", new Object[] { localrh.tRS });
                localArrayList1.add(localrh.tRS);
                if (localHashMap.containsKey(localrh.tRS))
                {
                  localObject3 = (EmojiGroupInfo)localHashMap.get(localrh.tRS);
                  localObject1 = localObject3;
                  if (localObject3 == null) {
                    localObject1 = new EmojiGroupInfo();
                  }
                  ((EmojiGroupInfo)localObject1).field_productID = localrh.tRS;
                  label519:
                  if (!localrh.tRS.equals("com.tencent.xin.emoticon.tusiji")) {
                    break label959;
                  }
                  ((EmojiGroupInfo)localObject1).field_flag = 0;
                  ((EmojiGroupInfo)localObject1).field_packName = "emoji_custom_all";
                  ((EmojiGroupInfo)localObject1).field_type = EmojiGroupInfo.TYPE_SYSTEM;
                  label555:
                  ((EmojiGroupInfo)localObject1).field_packIconUrl = localrh.lRV;
                  ((EmojiGroupInfo)localObject1).field_packGrayIconUrl = localrh.uhr;
                  ((EmojiGroupInfo)localObject1).field_packCoverUrl = localrh.uhm;
                  ((EmojiGroupInfo)localObject1).field_packDesc = localrh.uhf;
                  ((EmojiGroupInfo)localObject1).field_packAuthInfo = localrh.uhg;
                  ((EmojiGroupInfo)localObject1).field_packPrice = localrh.uhh;
                  ((EmojiGroupInfo)localObject1).field_packType = localrh.uhi;
                  ((EmojiGroupInfo)localObject1).field_packFlag = localrh.uhj;
                  ((EmojiGroupInfo)localObject1).field_packExpire = localrh.uhn;
                  ((EmojiGroupInfo)localObject1).field_packTimeStamp = localrh.uhM;
                  ((EmojiGroupInfo)localObject1).field_sort = 1;
                  ((EmojiGroupInfo)localObject1).field_idx = i;
                  if (((EmojiGroupInfo)localObject1).field_sync == 0) {
                    if ((((EmojiGroupInfo)localObject1).field_status != 7) || (((EmojiGroupInfo)localObject1).field_packStatus != 1)) {
                      break label980;
                    }
                  }
                }
                label959:
                label980:
                for (((EmojiGroupInfo)localObject1).field_sync = 2;; ((EmojiGroupInfo)localObject1).field_sync = 1)
                {
                  if (((EmojiGroupInfo)localObject1).field_sync == 2) {
                    ((EmojiGroupInfo)localObject1).field_status = 7;
                  }
                  if ((((EmojiGroupInfo)localObject1).field_sync == 2) && (!localrh.tRS.equals("com.tencent.xin.emoticon.tusiji")))
                  {
                    localObject3 = new au();
                    ((au)localObject3).eBY.type = 1;
                    ((au)localObject3).eBY.eCb = localrh.tRS;
                    com.tencent.mm.sdk.b.a.vgX.m((com.tencent.mm.sdk.b.b)localObject3);
                    if (!((au)localObject3).eBZ.eAO)
                    {
                      w.d("MicroMsg.emoji.EmojiGroupInfoStorage", "decode failed re download product:%s.", new Object[] { localrh.tRS });
                      ((EmojiGroupInfo)localObject1).field_sync = 1;
                    }
                  }
                  w.d("MicroMsg.emoji.EmojiGroupInfoStorage", "jacks updateEmojiGroupByEmotionSummary: prodcutId: %s, lasttime: %d, sort: %d", new Object[] { ((EmojiGroupInfo)localObject1).field_productID, Long.valueOf(((EmojiGroupInfo)localObject1).field_lastUseTime), Integer.valueOf(((EmojiGroupInfo)localObject1).field_sort) });
                  locala.a((com.tencent.mm.sdk.e.c)localObject1);
                  break;
                  if (localrh.tRS.equals("com.tencent.xin.emoticon.tusiji"))
                  {
                    localObject3 = (EmojiGroupInfo)localHashMap.get(String.valueOf(EmojiGroupInfo.vCl));
                    localObject1 = localObject3;
                    if (localObject3 == null) {
                      localObject1 = new EmojiGroupInfo();
                    }
                    ((EmojiGroupInfo)localObject1).field_productID = String.valueOf(EmojiGroupInfo.vCl);
                    break label519;
                  }
                  localObject1 = new EmojiGroupInfo();
                  ((EmojiGroupInfo)localObject1).field_productID = localrh.tRS;
                  break label519;
                  ((EmojiGroupInfo)localObject1).field_packName = localrh.uhe;
                  ((EmojiGroupInfo)localObject1).field_type = EmojiGroupInfo.vCi;
                  break label555;
                }
              }
            }
            localObject1 = localHashMap.values().iterator();
            while (((Iterator)localObject1).hasNext())
            {
              localObject3 = (EmojiGroupInfo)((Iterator)localObject1).next();
              if ((localObject3 != null) && (!bg.nm(((EmojiGroupInfo)localObject3).field_productID)) && (!((EmojiGroupInfo)localObject3).field_productID.equals(String.valueOf(EmojiGroupInfo.vCm)))) {
                if (((EmojiGroupInfo)localObject3).field_productID.equals(String.valueOf(EmojiGroupInfo.vCl)))
                {
                  if (!localArrayList1.contains("com.tencent.xin.emoticon.tusiji"))
                  {
                    w.i("MicroMsg.emoji.EmojiGroupInfoStorage", "need to delete product id:%s", new Object[] { "com.tencent.xin.emoticon.tusiji" });
                    localArrayList2.add("com.tencent.xin.emoticon.tusiji");
                  }
                }
                else if (!localArrayList1.contains(((EmojiGroupInfo)localObject3).field_productID))
                {
                  w.i("MicroMsg.emoji.EmojiGroupInfoStorage", "need to delete product id:%s", new Object[] { ((EmojiGroupInfo)localObject3).field_productID });
                  localArrayList2.add(((EmojiGroupInfo)localObject3).field_productID);
                }
              }
            }
            if (localArrayList2.size() > 0)
            {
              localObject1 = localArrayList2.iterator();
              while (((Iterator)localObject1).hasNext()) {
                locala.UG((String)((Iterator)localObject1).next());
              }
            }
            locala.a("event_update_group", 0, bg.bQW().toString());
            break;
            localObject1 = locala.bUz().iterator();
            while (((Iterator)localObject1).hasNext())
            {
              localObject3 = (EmojiGroupInfo)((Iterator)localObject1).next();
              if (((EmojiGroupInfo)localObject3).field_sync > 0)
              {
                w.i("MicroMsg.emoji.EmojiGroupInfoStorage", "delete pid:%s", new Object[] { ((EmojiGroupInfo)localObject3).field_productID });
                locala.UG(((EmojiGroupInfo)localObject3).field_productID);
              }
            }
            locala.UG("com.tencent.xin.emoticon.tusiji");
            break;
          }
          ((ArrayList)localObject1).add(new com.tencent.mm.plugin.emoji.sync.a.b(((rh)localObject2).tRS, (byte)0));
        }
      }
      label1336:
      h.ari().w((ArrayList)localObject1);
      if (!h.ari().kmc.kms) {
        h.ari().kmc.arG();
      }
      GMTrace.o(11296166641664L, 84163);
      return;
      label1374:
      Object localObject1 = (ArrayList)locala.bUJ();
      if (((ArrayList)localObject1).size() > 0)
      {
        w.i("MicroMsg.emoji.NetSceneGetEmotionList", "try to sync store emoji list:size:%d", new Object[] { Integer.valueOf(((ArrayList)localObject1).size()) });
        paramArrayList = new ArrayList();
        localObject1 = ((ArrayList)localObject1).iterator();
        while (((Iterator)localObject1).hasNext())
        {
          localObject2 = (String)((Iterator)localObject1).next();
          if (!bg.nm((String)localObject2)) {
            if (((String)localObject2).equals(String.valueOf(EmojiGroupInfo.vCl))) {
              paramArrayList.add(new com.tencent.mm.plugin.emoji.sync.a.c("com.tencent.xin.emoticon.tusiji"));
            } else {
              paramArrayList.add(new com.tencent.mm.plugin.emoji.sync.a.b((String)localObject2));
            }
          }
        }
        h.ari().w(paramArrayList);
        if (!h.ari().kmc.kms) {
          h.ari().kmc.arG();
        }
      }
      label1537:
      GMTrace.o(11296166641664L, 84163);
      return;
      l1 = -1L;
      localObject2 = null;
    }
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(11295227117568L, 84156);
    this.fUd = parame1;
    aab localaab = (aab)this.fUa.gtC.gtK;
    if (this.klL != null)
    {
      localaab.tQz = com.tencent.mm.platformtools.n.H(this.klL);
      if (localaab.tQz != null) {
        break label139;
      }
    }
    label139:
    for (parame1 = "Buf is NULL";; parame1 = localaab.tQz.toString())
    {
      w.d("MicroMsg.emoji.NetSceneGetEmotionList", parame1);
      localaab.tTJ = this.mType;
      localaab.tOG = this.gRb;
      if (this.mType == 7) {
        localaab.uqG = this.klN;
      }
      int i = a(parame, this.fUa, this);
      GMTrace.o(11295227117568L, 84156);
      return i;
      localaab.tQz = new azp();
      break;
    }
  }
  
  protected final int a(q paramq)
  {
    GMTrace.i(11295898206208L, 84161);
    int i = k.b.gum;
    GMTrace.o(11295898206208L, 84161);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(11295495553024L, 84158);
    w.d("MicroMsg.emoji.NetSceneGetEmotionList", "ErrType:" + paramInt2 + "   errCode:" + paramInt3);
    if (this.mType == 8)
    {
      if ((paramInt2 == 0) && (paramInt3 == 0))
      {
        at.AR();
        com.tencent.mm.y.c.xh().a(w.a.vqa, Long.valueOf(System.currentTimeMillis()));
      }
    }
    else if (this.mType == 11)
    {
      if ((paramInt2 != 0) || (paramInt3 != 0)) {
        break label194;
      }
      at.AR();
      com.tencent.mm.y.c.xh().a(w.a.vqe, Long.valueOf(System.currentTimeMillis()));
    }
    for (;;)
    {
      h.arl().kjB.a(this.mType, arB());
      if ((paramInt2 == 0) || (paramInt2 == 4)) {
        break label224;
      }
      this.fUd.a(paramInt2, paramInt3, paramString, this);
      GMTrace.o(11295495553024L, 84158);
      return;
      at.AR();
      com.tencent.mm.y.c.xh().a(w.a.vqa, Long.valueOf(System.currentTimeMillis() - 86400000L + 3600000L));
      break;
      label194:
      at.AR();
      com.tencent.mm.y.c.xh().a(w.a.vqe, Long.valueOf(System.currentTimeMillis() - 28800000L + 600000L));
    }
    label224:
    paramArrayOfByte = (aac)((com.tencent.mm.ad.b)paramq).gtD.gtK;
    if (paramArrayOfByte.tQz != null) {
      this.klL = com.tencent.mm.platformtools.n.a(paramArrayOfByte.tQz);
    }
    if (this.mType == 8)
    {
      if (paramInt3 != 0) {
        break label328;
      }
      arC();
      u(this.klP);
      at.AR();
      com.tencent.mm.y.c.xh().a(w.a.vqa, Long.valueOf(System.currentTimeMillis()));
    }
    for (;;)
    {
      this.fUd.a(paramInt2, paramInt3, paramString, this);
      GMTrace.o(11295495553024L, 84158);
      return;
      label328:
      if (paramInt3 == 2)
      {
        arC();
        ((aab)((com.tencent.mm.ad.b)paramq).gtC.gtK).tQz = ((aac)((com.tencent.mm.ad.b)paramq).gtD.gtK).tQz;
        a(this.gtW, this.fUd);
      }
      else if (paramInt3 == 3)
      {
        if (this.klP != null) {
          this.klP.clear();
        }
        ((aab)((com.tencent.mm.ad.b)paramq).gtC.gtK).tQz = new azp();
        a(this.gtW, this.fUd);
      }
    }
  }
  
  public final aac arB()
  {
    GMTrace.i(11295361335296L, 84157);
    if (this.fUa == null)
    {
      GMTrace.o(11295361335296L, 84157);
      return null;
    }
    aac localaac = (aac)this.fUa.gtD.gtK;
    GMTrace.o(11295361335296L, 84157);
    return localaac;
  }
  
  public final int getType()
  {
    GMTrace.i(11295092899840L, 84155);
    GMTrace.o(11295092899840L, 84155);
    return 411;
  }
  
  protected final int vB()
  {
    GMTrace.i(11295763988480L, 84160);
    GMTrace.o(11295763988480L, 84160);
    return 100;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\emoji\f\n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */