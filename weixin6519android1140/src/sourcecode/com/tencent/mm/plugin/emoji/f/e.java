package com.tencent.mm.plugin.emoji.f;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.ad.k.b;
import com.tencent.mm.g.a.au;
import com.tencent.mm.g.a.au.b;
import com.tencent.mm.g.a.ms;
import com.tencent.mm.network.q;
import com.tencent.mm.plugin.emoji.e.l;
import com.tencent.mm.plugin.emoji.e.n;
import com.tencent.mm.plugin.emoji.model.h;
import com.tencent.mm.plugin.emoji.sync.BKGLoaderManager;
import com.tencent.mm.protocal.c.ez;
import com.tencent.mm.protocal.c.fa;
import com.tencent.mm.protocal.c.qp;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.am;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.emotion.EmojiInfo;
import com.tencent.mm.storage.emotion.d;
import com.tencent.mm.storage.t;
import com.tencent.mm.storage.w.a;
import com.tencent.mm.y.at;
import com.tencent.mm.y.c;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class e
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  public static int kln;
  public static int klo;
  public final b fUa;
  private com.tencent.mm.ad.e fUd;
  private ArrayList<String> klm;
  private HashMap<String, qp> klp;
  public int klq;
  private LinkedList<String> klr;
  private int mIndex;
  
  static
  {
    GMTrace.i(11292140109824L, 84133);
    kln = 0;
    klo = 1;
    GMTrace.o(11292140109824L, 84133);
  }
  
  public e()
  {
    GMTrace.i(11291066368000L, 84125);
    this.klm = new ArrayList();
    this.klp = new HashMap();
    this.mIndex = 0;
    this.klq = 0;
    this.klr = new LinkedList();
    b.a locala = new b.a();
    locala.gtF = new ez();
    locala.gtG = new fa();
    locala.uri = "/cgi-bin/micromsg-bin/mmbatchemojidownload";
    locala.gtE = 697;
    locala.gtH = 0;
    locala.gtI = 0;
    this.fUa = locala.DA();
    this.mIndex = 0;
    this.klq = kln;
    this.klr = new LinkedList();
    GMTrace.o(11291066368000L, 84125);
  }
  
  public e(LinkedList<String> paramLinkedList)
  {
    GMTrace.i(11291200585728L, 84126);
    this.klm = new ArrayList();
    this.klp = new HashMap();
    this.mIndex = 0;
    this.klq = 0;
    this.klr = new LinkedList();
    b.a locala = new b.a();
    locala.gtF = new ez();
    locala.gtG = new fa();
    locala.uri = "/cgi-bin/micromsg-bin/mmbatchemojidownload";
    locala.gtE = 697;
    locala.gtH = 0;
    locala.gtI = 0;
    this.fUa = locala.DA();
    this.mIndex = 0;
    this.klq = klo;
    this.klr = paramLinkedList;
    GMTrace.o(11291200585728L, 84126);
  }
  
  private void a(fa paramfa)
  {
    GMTrace.i(11291469021184L, 84128);
    if (paramfa == null)
    {
      w.i("MicroMsg.emoji.NetSceneBatchEmojiDownLoad", "addEmojiInfoList response is null.");
      GMTrace.o(11291469021184L, 84128);
      return;
    }
    if ((paramfa.tTM == null) || (paramfa.tTM.size() <= 0))
    {
      w.i("MicroMsg.emoji.NetSceneBatchEmojiDownLoad", "addemojiInfoList EmojiList is null or size is empty.");
      GMTrace.o(11291469021184L, 84128);
      return;
    }
    paramfa = paramfa.tTM.iterator();
    while (paramfa.hasNext())
    {
      qp localqp = (qp)paramfa.next();
      String str = localqp.ugy.toLowerCase();
      this.klm.add(str);
      this.klp.put(str, localqp);
    }
    GMTrace.o(11291469021184L, 84128);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(11291737456640L, 84130);
    this.fUd = parame1;
    parame1 = (ez)this.fUa.gtC.gtK;
    parame1.tTI = this.mIndex;
    parame1.tTJ = this.klq;
    parame1.tTK = this.klr;
    int i = a(parame, this.fUa, this);
    GMTrace.o(11291737456640L, 84130);
    return i;
  }
  
  protected final int a(q paramq)
  {
    GMTrace.i(11292005892096L, 84132);
    int i = k.b.gum;
    GMTrace.o(11292005892096L, 84132);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(11291334803456L, 84127);
    w.i("MicroMsg.emoji.NetSceneBatchEmojiDownLoad", "errType:%d, errCode:%d", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    ArrayList localArrayList;
    boolean bool;
    Object localObject;
    long l2;
    if (this.klq == kln)
    {
      if ((paramInt2 != 0) || (paramInt3 != 0))
      {
        this.fUd.a(paramInt2, paramInt3, paramString, this);
        com.tencent.mm.plugin.report.service.g.ork.a(164L, 1L, 1L, false);
        at.AR();
        c.xh().a(w.a.vqj, Long.valueOf(System.currentTimeMillis() - 86400000L + 3600000L));
        GMTrace.o(11291334803456L, 84127);
        return;
      }
      paramq = (fa)this.fUa.gtD.gtK;
      paramArrayOfByte = (ez)this.fUa.gtC.gtK;
      if ((paramq.tTL == 0) && ((paramq.tSJ == null) || (paramq.tSJ.size() <= 0)))
      {
        this.fUd.a(paramInt2, paramInt3, paramString, this);
        w.i("MicroMsg.emoji.NetSceneBatchEmojiDownLoad", "[cpan] donwload list is null");
        com.tencent.mm.plugin.report.service.g.ork.a(164L, 0L, 1L, false);
        GMTrace.o(11291334803456L, 84127);
        return;
      }
      if (paramq.tTL == 1)
      {
        if (this.klp == null) {}
        for (paramInt1 = 0;; paramInt1 = this.klp.size())
        {
          w.i("MicroMsg.emoji.NetSceneBatchEmojiDownLoad", "[cpan] preparedDownloadCustomEmojiList size:%s", new Object[] { Integer.valueOf(paramInt1) });
          this.fUd.a(paramInt2, paramInt3, paramString, this);
          at.AR();
          c.xh().a(w.a.vqj, Long.valueOf(System.currentTimeMillis()));
          a(paramq);
          localArrayList = this.klm;
          if ((localArrayList != null) && (localArrayList.size() > 0)) {
            break;
          }
          w.w("MicroMsg.emoji.NetSceneBatchEmojiDownLoad", "[cpan] perparedDownloadCustomEmojiList failed. list is null.");
          at.AR();
          c.xh().a(w.a.vpY, Boolean.valueOf(false));
          com.tencent.mm.plugin.report.service.g.ork.a(164L, 0L, 1L, false);
          GMTrace.o(11291334803456L, 84127);
          return;
        }
        if (localArrayList.size() < n.aqT())
        {
          at.AR();
          c.xh().a(w.a.vpY, Boolean.valueOf(false));
        }
        at.AR();
        bool = ((Boolean)c.xh().get(w.a.vqb, Boolean.valueOf(true))).booleanValue();
        localObject = h.arl().kjy;
        w.i("MicroMsg.emoji.EmojiInfoStorage", "[cpan] begin preparedDownloadCustomEmojiList");
        l2 = System.currentTimeMillis();
        if ((localArrayList == null) || (localArrayList.size() <= 0))
        {
          w.i("MicroMsg.emoji.EmojiInfoStorage", "[cpan] perparedDownloadCustomEmojiList failed. list is null");
          at.AR();
          c.xh().a(w.a.vqb, Boolean.valueOf(false));
          paramString = h.arl().kjy;
          w.i("MicroMsg.emoji.EmojiInfoStorage", "[cpan] begin preparedDeleteCustomEmojiList");
          l1 = System.currentTimeMillis();
          if ((localArrayList == null) || (localArrayList.size() <= 0))
          {
            w.i("MicroMsg.emoji.EmojiInfoStorage", "[cpan] preparedDeleteCustomEmojiList failed. list is null");
            label531:
            paramq = (ArrayList)h.arl().kjy.bUY();
            if (paramq.size() <= 0) {
              break label1439;
            }
            w.i("MicroMsg.emoji.NetSceneBatchEmojiDownLoad", "try to sync emoji downloadList:%d", new Object[] { Integer.valueOf(paramq.size()) });
            paramString = new ArrayList();
            paramInt2 = paramq.size();
            paramInt1 = 0;
          }
        }
        else
        {
          for (;;)
          {
            if (paramInt1 < paramInt2)
            {
              paramArrayOfByte = ((String)paramq.get(paramInt1)).toLowerCase();
              if ((this.klp != null) && (this.klp.containsKey(paramArrayOfByte)) && (this.klp.get(paramArrayOfByte) != null))
              {
                localObject = (qp)this.klp.get(paramArrayOfByte);
                paramString.add(new com.tencent.mm.plugin.emoji.sync.a.a(paramArrayOfByte, ((qp)localObject).lPM, ((qp)localObject).nFH, ((qp)localObject).ugz, ((qp)localObject).ugA, ((qp)localObject).ugB, ((qp)localObject).tRS, ((qp)localObject).ugE));
                label707:
                paramInt1 += 1;
                continue;
                if (!(((d)localObject).fTZ instanceof com.tencent.mm.bu.g)) {
                  break label1702;
                }
                paramString = (com.tencent.mm.bu.g)((d)localObject).fTZ;
              }
            }
          }
        }
      }
    }
    for (long l1 = paramString.cE(Thread.currentThread().getId());; l1 = -1L)
    {
      Iterator localIterator = localArrayList.iterator();
      paramInt1 = 1;
      for (;;)
      {
        if (!localIterator.hasNext()) {
          break label1084;
        }
        String str = (String)localIterator.next();
        paramArrayOfByte = ((d)localObject).UK(str);
        if ((paramArrayOfByte == null) || (bg.nm(paramArrayOfByte.GS())) || (!paramArrayOfByte.bUN()))
        {
          paramq = new EmojiInfo();
          paramq.field_md5 = str;
          paramq.field_catalog = 85;
          paramq.field_source = EmojiInfo.vCG;
          paramq.field_lastUseTime = System.currentTimeMillis();
          label853:
          paramq.field_reserved3 = paramInt1;
          if (bool)
          {
            w.d("MicroMsg.emoji.EmojiInfoStorage", "need repair");
            paramq.field_temp = 2;
          }
          if (paramq.bUN()) {
            break label1011;
          }
          w.d("MicroMsg.emoji.EmojiInfoStorage", "file don't exist");
          paramq.field_temp = 2;
        }
        for (;;)
        {
          paramq = paramq.qL();
          if (((d)localObject).fTZ.replace("EmojiInfo", "md5", paramq) >= 0L) {
            break label1077;
          }
          if (paramString != null) {
            paramString.aL(l1);
          }
          w.i("MicroMsg.emoji.EmojiInfoStorage", "[cpan] end preparedDownloadCustomEmojiList user time:%d faild ", new Object[] { Long.valueOf(System.currentTimeMillis() - l2) });
          break;
          paramArrayOfByte.field_source = EmojiInfo.vCG;
          paramq = paramArrayOfByte;
          if (paramArrayOfByte.field_catalog != EmojiInfo.vCo) {
            break label853;
          }
          paramArrayOfByte.field_catalog = EmojiInfo.vCu;
          paramq = paramArrayOfByte;
          break label853;
          label1011:
          paramArrayOfByte = new au();
          paramArrayOfByte.eBY.type = 0;
          paramArrayOfByte.eBY.eCa = paramq;
          com.tencent.mm.sdk.b.a.vgX.m(paramArrayOfByte);
          if (!paramArrayOfByte.eBZ.eAO)
          {
            w.d("MicroMsg.emoji.EmojiInfoStorage", "decode failed re download.");
            paramq.field_temp = 2;
          }
        }
        label1077:
        paramInt1 += 1;
      }
      label1084:
      if (paramString != null) {
        paramString.aL(l1);
      }
      l1 = System.currentTimeMillis();
      if (localArrayList == null) {}
      for (paramInt1 = 0;; paramInt1 = localArrayList.size())
      {
        w.i("MicroMsg.emoji.EmojiInfoStorage", "[cpan] end preparedDownloadCustomEmojiList user time:%d succes. size:%d", new Object[] { Long.valueOf(l1 - l2), Integer.valueOf(paramInt1) });
        break;
      }
      paramArrayOfByte = paramString.bUX();
      if (paramArrayOfByte.size() <= 0)
      {
        w.i("MicroMsg.emoji.EmojiInfoStorage", "[cpan] preparedDeleteCustomEmojiList failed. sync list is null");
        break label531;
      }
      paramq = new ArrayList();
      paramArrayOfByte = paramArrayOfByte.iterator();
      while (paramArrayOfByte.hasNext())
      {
        localObject = (String)paramArrayOfByte.next();
        if (!localArrayList.contains(((String)localObject).toLowerCase()))
        {
          paramq.add(localObject);
          w.i("MicroMsg.emoji.EmojiInfoStorage", "[cpan] delete:%s", new Object[] { localObject });
        }
      }
      paramString.cv(paramq);
      w.i("MicroMsg.emoji.EmojiInfoStorage", "[cpan] end preparedDeleteCustomEmojiList user time:%d succes. size:%d", new Object[] { Long.valueOf(System.currentTimeMillis() - l1), Integer.valueOf(paramq.size()) });
      break label531;
      w.i("MicroMsg.emoji.NetSceneBatchEmojiDownLoad", "emoji info list no contains md5:%s", new Object[] { paramArrayOfByte });
      break label707;
      paramq = h.ari();
      paramInt1 = localArrayList.size();
      paramq.kmc.kmn = paramInt1;
      h.ari().v(paramString);
      h.ari().kmc.arG();
      com.tencent.mm.plugin.report.service.g.ork.i(11595, new Object[] { Integer.valueOf(2) });
      if (am.isWifi(ab.getContext())) {
        com.tencent.mm.plugin.report.service.g.ork.i(11595, new Object[] { Integer.valueOf(3) });
      }
      for (;;)
      {
        com.tencent.mm.sdk.b.a.vgX.m(new ms());
        break;
        label1439:
        at.AR();
        c.xh().a(w.a.vqg, Boolean.valueOf(false));
        w.i("MicroMsg.emoji.NetSceneBatchEmojiDownLoad", "no things need to download.");
      }
      w.i("MicroMsg.emoji.NetSceneBatchEmojiDownLoad", "[cpan] do next scene. index:%d size:%d", new Object[] { Integer.valueOf(paramArrayOfByte.tTI), Integer.valueOf(paramq.tSJ.size()) });
      this.fUd.a(paramInt2, paramInt3, paramString, this);
      paramArrayOfByte.tTI = paramq.tTI;
      this.mIndex = paramArrayOfByte.tTI;
      a(paramq);
      paramInt2 = a(this.gtW, this.fUd);
      if (paramInt1 < 0) {
        w.e("MicroMsg.emoji.NetSceneBatchEmojiDownLoad", "[cpan] doScene error.nextNetId:%d", new Object[] { Integer.valueOf(paramInt2) });
      }
      GMTrace.o(11291334803456L, 84127);
      return;
      if ((paramInt2 != 0) || (paramInt3 != 0))
      {
        this.fUd.a(paramInt2, paramInt3, paramString, this);
        GMTrace.o(11291334803456L, 84127);
        return;
      }
      paramq = (fa)this.fUa.gtD.gtK;
      if ((paramq.tTM == null) || (paramq.tTM.size() <= 0)) {
        w.i("MicroMsg.emoji.NetSceneBatchEmojiDownLoad", "Change MD5 to URL failed.");
      }
      for (;;)
      {
        this.fUd.a(paramInt2, paramInt3, paramString, this);
        GMTrace.o(11291334803456L, 84127);
        return;
        h.arl().kjy.cx(paramq.tTM);
      }
      label1702:
      paramString = null;
    }
  }
  
  public final int getType()
  {
    GMTrace.i(11291603238912L, 84129);
    GMTrace.o(11291603238912L, 84129);
    return 697;
  }
  
  protected final int vB()
  {
    GMTrace.i(11291871674368L, 84131);
    GMTrace.o(11291871674368L, 84131);
    return 20;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\emoji\f\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */