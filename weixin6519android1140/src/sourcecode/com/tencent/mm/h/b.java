package com.tencent.mm.h;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.ad.n;
import com.tencent.mm.g.a.ai;
import com.tencent.mm.g.a.ai.a;
import com.tencent.mm.g.a.rl;
import com.tencent.mm.g.a.rl.a;
import com.tencent.mm.platformtools.r;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.b.c;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.bh;
import com.tencent.mm.sdk.platformtools.v;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.account.DisasterUI;
import com.tencent.mm.y.at;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public final class b
{
  public a fLN;
  public Map<Integer, Long> fLO;
  public Map<Long, a> fLP;
  public c fLQ;
  
  public b()
  {
    GMTrace.i(1272384061440L, 9480);
    this.fLO = new HashMap();
    this.fLP = new HashMap();
    this.fLQ = new c() {};
    GMTrace.o(1272384061440L, 9480);
  }
  
  public final boolean a(ai paramai)
  {
    GMTrace.i(1272518279168L, 9481);
    String str = paramai.eBo.eBq;
    if (str == null) {}
    Map localMap;
    for (int i = -1;; i = str.length())
    {
      w.i("MicroMsg.BroadcastController", "summerdiz handleNewDisaster xml len[%d]", new Object[] { Integer.valueOf(i) });
      localMap = bh.q(str, "e");
      if (localMap != null) {
        break;
      }
      w.e("MicroMsg.BroadcastController", "summerdiz handleNewDisaster this is not errmsg");
      GMTrace.o(1272518279168L, 9481);
      return false;
    }
    w.i("MicroMsg.BroadcastController", "summerdiz handleNewDisaster values[%s]", new Object[] { localMap });
    long l1 = bg.getLong((String)localMap.get(".e.NoticeId"), 0L);
    if (l1 <= 0L) {
      w.e("MicroMsg.BroadcastController", "summerdiz handleNewDisaster noticeID null");
    }
    if (!r.hlj) {
      try
      {
        long l2 = bg.getLong((String)localMap.get(".e.ExpiredTime"), 0L);
        if (bg.aG(l2) > 0L)
        {
          w.i("MicroMsg.BroadcastController", "summerdiz handleNewDisaster expiredTime is too small, drop id:%d", new Object[] { Long.valueOf(l2) });
          GMTrace.o(1272518279168L, 9481);
          return false;
        }
      }
      catch (Exception localException)
      {
        w.i("MicroMsg.BroadcastController", "parseLong expiredTime error:%s", new Object[] { localException });
      }
    }
    Object localObject1 = new a();
    ((a)localObject1).fLU = String.valueOf(l1);
    Object localObject2 = ab.getContext().getSharedPreferences("disaster_pref", 4).getString("disaster_noticeid_list_key", "");
    if ((!r.hlk) && (((String)localObject2).contains(((a)localObject1).fLU)))
    {
      w.i("MicroMsg.BroadcastController", "summerdiz handleNewDisaster noticeIdList %s contain notifyID:%s, drop id", new Object[] { localObject2, ((a)localObject1).fLU });
      GMTrace.o(1272518279168L, 9481);
      return false;
    }
    Object localObject4;
    if (this.fLP.size() > 0)
    {
      localObject4 = (a)this.fLP.get(Long.valueOf(l1));
      if (localObject4 != null) {
        w.i("MicroMsg.BroadcastController", "summerdiz  handleNewDisaster found info in map[%s]", new Object[] { localObject4 });
      }
    }
    for (;;)
    {
      localObject1 = (String)localMap.get(".e.Position");
      if (!bg.nm((String)localObject1)) {
        break;
      }
      w.e("MicroMsg.BroadcastController", "summerdiz handleNewDisaster positionStr is null!");
      GMTrace.o(1272518279168L, 9481);
      return false;
      this.fLP.put(Long.valueOf(l1), localObject1);
      localObject4 = localObject1;
      continue;
      this.fLP.put(Long.valueOf(l1), localObject1);
      localObject4 = localObject1;
    }
    Object localObject8 = new ArrayList();
    localObject1 = ((String)localObject1).split(",");
    if ((localObject1 == null) || (localObject1.length <= 0))
    {
      w.e("MicroMsg.BroadcastController", "summerdiz handleNewDisaster positionStr id invaild!");
      GMTrace.o(1272518279168L, 9481);
      return false;
    }
    i = 0;
    int k = localObject1.length;
    int j = 0;
    if (j < k)
    {
      int m = bg.getInt(localObject1[j], 0);
      if (m > 0) {
        if (m == 1)
        {
          i = 1;
          w.i("MicroMsg.BroadcastController", "summerdiz handleNewDisaster found tonyTips[%d]", new Object[] { Integer.valueOf(m) });
        }
      }
      for (;;)
      {
        j += 1;
        break;
        ((ArrayList)localObject8).add(Integer.valueOf(m));
      }
    }
    if ((i == 0) && (((ArrayList)localObject8).size() == 0))
    {
      w.e("MicroMsg.BroadcastController", "summerdiz handleNewDisaster positions size is 0!");
      GMTrace.o(1272518279168L, 9481);
      return false;
    }
    Object localObject6 = v.eq(ab.getContext());
    w.i("MicroMsg.BroadcastController", "summerdiz handleNewDisaster curLang[%s]", new Object[] { localObject6 });
    Object localObject3 = null;
    localObject2 = null;
    localObject1 = null;
    j = 0;
    Object localObject7 = new StringBuilder(".e.Item");
    if (j == 0)
    {
      localObject5 = "";
      label656:
      localObject5 = localObject5;
      localObject7 = (String)localMap.get((String)localObject5 + ".Language");
      if ((localObject7 == null) && (j > 3)) {
        break label1768;
      }
      if (!((String)localObject6).equalsIgnoreCase((String)localObject7)) {
        break label1062;
      }
      localObject7 = (String)localMap.get((String)localObject5 + ".Content");
      localObject6 = (String)localMap.get((String)localObject5 + ".Url");
    }
    for (final Object localObject5 = (String)localMap.get((String)localObject5 + ".Tips");; localObject5 = null)
    {
      w.i("MicroMsg.BroadcastController", "summerdiz handleNewDisaster content[%s] tips[%s]", new Object[] { localObject7, localObject5 });
      if (bg.nm((String)localObject7))
      {
        w.i("MicroMsg.BroadcastController", "summerdiz handleNewDisaster cann't hit curLang");
        label856:
        localObject6 = localObject2;
        if (bg.nm((String)localObject2)) {
          localObject6 = ab.getContext().getString(R.l.dnb);
        }
        localObject5 = localObject1;
        localObject2 = localObject3;
        if (i != 0)
        {
          localObject2 = localObject3;
          if (bg.nm((String)localObject3)) {
            localObject2 = ab.getContext().getString(R.l.dmW);
          }
          localObject5 = localObject1;
          if (bg.nm((String)localObject1)) {
            localObject5 = ab.getContext().getString(R.l.dmZ);
          }
          paramai.eBp.desc = ((String)localObject2);
          paramai.eBp.eBr = 30;
          paramai.eBp.showType = 0;
          paramai.eBp.url = ((String)localObject6);
          paramai.eBp.visible = true;
          paramai.eBp.eBu = 0;
          paramai.eBp.eBs = 6;
          paramai.eBp.eBt = "";
          paramai.eBp.eBv = String.valueOf(l1);
          paramai.eBp.position = 1;
        }
        if (((ArrayList)localObject8).size() == 0)
        {
          w.i("MicroMsg.BroadcastController", "summerdiz handleNewDisaster no other position need to tip");
          GMTrace.o(1272518279168L, 9481);
          return false;
          localObject5 = Integer.valueOf(j);
          break label656;
          label1062:
          if (!"en".equalsIgnoreCase((String)localObject7)) {
            break label1753;
          }
          localObject2 = (String)localMap.get((String)localObject5 + ".Content");
          localObject3 = (String)localMap.get((String)localObject5 + ".Url");
          localObject1 = (String)localMap.get((String)localObject5 + ".Tips");
        }
      }
      for (;;)
      {
        localObject5 = localObject2;
        j += 1;
        localObject2 = localObject3;
        localObject3 = localObject5;
        break;
        if ((((a)localObject4).fLV != 0L) && (bg.aI(((a)localObject4).fLV) < 1800000L))
        {
          w.i("MicroMsg.BroadcastController", "summerdiz handleNewDisaster disasterTick within half an hour, drop it");
          GMTrace.o(1272518279168L, 9481);
          return false;
        }
        ((a)localObject4).fLV = bg.Pw();
        localObject7 = ((ArrayList)localObject8).iterator();
        localObject1 = localObject5;
        while (((Iterator)localObject7).hasNext())
        {
          localObject8 = (Integer)((Iterator)localObject7).next();
          localObject3 = Long.valueOf(bg.a((Long)this.fLO.get(localObject8), 0L));
          if ((((Long)localObject3).longValue() > 0L) && (((Long)localObject3).longValue() >= l1))
          {
            w.i("MicroMsg.BroadcastController", "summerdiz p[%d] has bigger oldPositionNoticeId[%d, %d]", new Object[] { localObject8, localObject3, Long.valueOf(l1) });
          }
          else
          {
            localObject5 = (rl)((a)localObject4).fLX.get(localObject8);
            if (localObject5 != null) {
              break label1735;
            }
            localObject5 = new rl();
            ((rl)localObject5).eWn.showType = 0;
            ((rl)localObject5).eWn.eBr = 30;
            ((rl)localObject5).eWn.eBt = "";
            ((rl)localObject5).eWn.eBu = R.i.cCp;
            ((rl)localObject5).eWn.position = ((Integer)localObject8).intValue();
            ((a)localObject4).fLX.put(localObject8, localObject5);
          }
        }
        label1735:
        for (;;)
        {
          if (bg.nm((String)localObject1)) {
            localObject1 = localObject2;
          }
          for (;;)
          {
            localObject3 = localObject1;
            if (bg.nm((String)localObject1))
            {
              j = R.l.dmY;
              switch (((Integer)localObject8).intValue())
              {
              }
            }
            for (;;)
            {
              localObject3 = ab.getContext().getString(j);
              ((rl)localObject5).eWn.desc = ((String)localObject3);
              ((rl)localObject5).eWn.url = ((String)localObject6);
              ((rl)localObject5).eWn.visible = true;
              ((rl)localObject5).eWn.eBs = 2;
              ((rl)localObject5).eWn.eBv = ((a)localObject4).fLU;
              this.fLO.put(localObject8, Long.valueOf(l1));
              if (i == 0)
              {
                paramai.eBp.desc = ((String)localObject3);
                paramai.eBp.eBr = 30;
                paramai.eBp.showType = 0;
                paramai.eBp.url = ((String)localObject6);
                paramai.eBp.visible = true;
                paramai.eBp.eBu = R.i.cCp;
                paramai.eBp.eBs = 2;
                paramai.eBp.eBt = "";
                paramai.eBp.eBv = String.valueOf(l1);
                paramai.eBp.position = ((Integer)localObject8).intValue();
              }
              af.t(new Runnable()
              {
                public final void run()
                {
                  GMTrace.i(1272249843712L, 9479);
                  a.vgX.m(localObject5);
                  GMTrace.o(1272249843712L, 9479);
                }
              });
              localObject1 = localObject3;
              break;
              j = R.l.dna;
              continue;
              j = R.l.dmX;
            }
            GMTrace.o(1272518279168L, 9481);
            return true;
          }
        }
        localObject3 = localObject7;
        localObject2 = localObject6;
        localObject1 = localObject5;
        break label856;
        label1753:
        localObject5 = localObject2;
        localObject2 = localObject3;
        localObject3 = localObject5;
      }
      label1768:
      localObject7 = null;
      localObject6 = null;
    }
  }
  
  public final boolean dI(final String paramString)
  {
    GMTrace.i(1272652496896L, 9482);
    w.i("MicroMsg.BroadcastController", "summerdiz handleEventOOB oldNoticeInfo[%s], event[%s]", new Object[] { this.fLN, paramString });
    if (bg.nm(paramString))
    {
      GMTrace.o(1272652496896L, 9482);
      return false;
    }
    if (paramString.indexOf("<") < 0)
    {
      GMTrace.o(1272652496896L, 9482);
      return false;
    }
    Map localMap = bh.q(paramString, "e");
    if (localMap == null)
    {
      w.e("MicroMsg.BroadcastController", "this is not errmsg");
      GMTrace.o(1272652496896L, 9482);
      return false;
    }
    if (this.fLN == null)
    {
      this.fLN = new a();
      paramString = new rl();
      this.fLN.fLX.put(Integer.valueOf(0), paramString);
      paramString.eWn.desc = "";
      paramString.eWn.url = "";
      paramString.eWn.showType = 0;
      paramString.eWn.eBr = 30;
      paramString.eWn.visible = false;
      paramString.eWn.eBt = "";
      paramString.eWn.eBs = 0;
      paramString.eWn.eBu = R.i.cCp;
      paramString.eWn.eBv = "";
      paramString.eWn.position = 0;
    }
    if (!r.hli)
    {
      if ((this.fLN.fLV != 0L) && (bg.aI(this.fLN.fLV) < 1800000L))
      {
        w.i("MicroMsg.BroadcastController", "disasterTick within half an hour, drop it");
        GMTrace.o(1272652496896L, 9482);
        return false;
      }
      this.fLN.fLV = bg.Pw();
    }
    if (!r.hlj) {
      try
      {
        long l = bg.getLong((String)localMap.get(".e.ExpiredTime"), 0L);
        if (bg.aG(l) > 0L)
        {
          w.i("MicroMsg.BroadcastController", "expiredTime is too small, drop id:%d", new Object[] { Long.valueOf(l) });
          GMTrace.o(1272652496896L, 9482);
          return false;
        }
      }
      catch (Exception paramString)
      {
        w.i("MicroMsg.BroadcastController", "parseLong expiredTime error:%s", new Object[] { paramString });
      }
    }
    this.fLN.fLU = ((String)localMap.get(".e.NoticeId"));
    paramString = ab.getContext().getSharedPreferences("disaster_pref", 4).getString("disaster_noticeid_list_key", "");
    if ((!r.hlk) && (paramString.contains(this.fLN.fLU)))
    {
      w.i("MicroMsg.BroadcastController", "noticeIdList %s contain notifyID:%s, drop id", new Object[] { paramString, this.fLN.fLU });
      GMTrace.o(1272652496896L, 9482);
      return false;
    }
    String str = v.eq(ab.getContext());
    Object localObject2 = null;
    Object localObject1 = null;
    paramString = null;
    int i = 0;
    Object localObject4 = new StringBuilder(".e.Item");
    if (i == 0)
    {
      localObject3 = "";
      label508:
      localObject3 = localObject3;
      localObject4 = (String)localMap.get((String)localObject3 + ".Language");
      if ((localObject4 == null) && (i > 3)) {
        break label1054;
      }
      if (!str.equalsIgnoreCase((String)localObject4)) {
        break label891;
      }
      str = (String)localMap.get((String)localObject3 + ".Content");
      localObject4 = (String)localMap.get((String)localObject3 + ".Url");
    }
    for (Object localObject3 = (String)localMap.get((String)localObject3 + ".Tips");; localObject3 = null)
    {
      if (bg.nm(str))
      {
        w.i("MicroMsg.BroadcastController", "handleEventOOB cann't hit curLang");
        label686:
        localObject3 = localObject1;
        if (bg.nm((String)localObject1)) {
          localObject3 = ab.getContext().getString(R.l.dnb);
        }
        localObject1 = localObject2;
        if (bg.nm((String)localObject2))
        {
          w.i("MicroMsg.BroadcastController", "handleEventOOB defContent is also null use hardcode");
          localObject1 = ab.getContext().getString(R.l.dmV);
        }
        localObject2 = paramString;
        if (bg.nm(paramString))
        {
          if (bg.nm((String)localObject1)) {
            localObject2 = ab.getContext().getString(R.l.dmY);
          }
        }
        else
        {
          label769:
          paramString = (rl)this.fLN.fLX.get(Integer.valueOf(0));
          paramString.eWn.desc = ((String)localObject2);
          paramString.eWn.url = ((String)localObject3);
          paramString.eWn.visible = true;
          paramString.eWn.eBs = 2;
          paramString.eWn.eBv = this.fLN.fLU;
          af.t(new Runnable()
          {
            public final void run()
            {
              GMTrace.i(1271981408256L, 9477);
              w.i("MicroMsg.BroadcastController", "summerdiz handleEventOOB publish uiEvent");
              a.vgX.m(paramString);
              GMTrace.o(1271981408256L, 9477);
            }
          });
          this.fLN.fLW = ((String)localObject1);
          if (at.wS().foreground) {
            rQ();
          }
          GMTrace.o(1272652496896L, 9482);
          return true;
          localObject3 = Integer.valueOf(i);
          break label508;
          label891:
          if (!"en".equalsIgnoreCase((String)localObject4)) {
            break label1039;
          }
          localObject1 = (String)localMap.get((String)localObject3 + ".Content");
          localObject2 = (String)localMap.get((String)localObject3 + ".Url");
          paramString = (String)localMap.get((String)localObject3 + ".Tips");
        }
      }
      for (;;)
      {
        localObject3 = localObject1;
        i += 1;
        localObject1 = localObject2;
        localObject2 = localObject3;
        break;
        localObject2 = localObject1;
        break label769;
        localObject1 = localObject4;
        localObject2 = str;
        paramString = (String)localObject3;
        break label686;
        label1039:
        localObject3 = localObject1;
        localObject1 = localObject2;
        localObject2 = localObject3;
      }
      label1054:
      localObject4 = null;
      str = null;
    }
  }
  
  final void rQ()
  {
    GMTrace.i(1272786714624L, 9483);
    if ((this.fLN == null) || (this.fLN.fLX.get(Integer.valueOf(0)) == null) || (bg.nm(this.fLN.fLW)))
    {
      GMTrace.o(1272786714624L, 9483);
      return;
    }
    w.i("MicroMsg.BroadcastController", "summerdize checkShowDisasterContent showDisasterContent[%s]", new Object[] { this.fLN.fLW });
    Intent localIntent = new Intent();
    localIntent.putExtra("key_disaster_content", this.fLN.fLW);
    localIntent.putExtra("key_disaster_url", ((rl)this.fLN.fLX.get(Integer.valueOf(0))).eWn.url);
    localIntent.setClass(ab.getContext(), DisasterUI.class).addFlags(268435456);
    ab.getContext().startActivity(localIntent);
    this.fLN.fLW = null;
    GMTrace.o(1272786714624L, 9483);
  }
  
  static final class a
  {
    String fLU;
    long fLV;
    String fLW;
    Map<Integer, rl> fLX;
    
    a()
    {
      GMTrace.i(1271310319616L, 9472);
      this.fLU = null;
      this.fLV = 0L;
      this.fLW = null;
      this.fLX = new HashMap();
      GMTrace.o(1271310319616L, 9472);
    }
    
    public final String toString()
    {
      GMTrace.i(1271444537344L, 9473);
      Object localObject = this.fLX.keySet().iterator();
      Integer localInteger;
      for (String str = ""; ((Iterator)localObject).hasNext(); str = str + localInteger + ",") {
        localInteger = (Integer)((Iterator)localObject).next();
      }
      localObject = str;
      if (str.length() > 0) {
        localObject = str.substring(0, str.length() - 1);
      }
      str = String.format("NoticeInfo(%d){noticeID[%s], disasterTick[%d], content[%s], posistions[%s]}", new Object[] { Integer.valueOf(hashCode()), this.fLU, Long.valueOf(this.fLV), this.fLW, localObject });
      GMTrace.o(1271444537344L, 9473);
      return str;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\h\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */