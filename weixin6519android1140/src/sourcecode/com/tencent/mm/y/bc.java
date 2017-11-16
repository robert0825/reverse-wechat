package com.tencent.mm.y;

import android.content.Context;
import android.content.SharedPreferences;
import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.d;
import com.tencent.mm.ad.d.a;
import com.tencent.mm.ad.d.c;
import com.tencent.mm.g.a.cb;
import com.tencent.mm.g.a.ji;
import com.tencent.mm.g.b.ce;
import com.tencent.mm.plugin.messenger.foundation.a.a.c;
import com.tencent.mm.protocal.c.bu;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.bh;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.ar;
import com.tencent.mm.storage.as;
import com.tencent.mm.storage.au;
import com.tencent.mm.storage.t;
import com.tencent.mm.storage.w.a;
import com.tencent.mm.storage.x;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class bc
{
  public static long Bg()
  {
    GMTrace.i(15229954031616L, 113472);
    long l1 = System.currentTimeMillis();
    w.i("MicroMsg.MsgInfoStorageLogic", "[oneliang] fix send msg create time, before fix, now is :%s", new Object[] { Long.valueOf(l1) });
    Object localObject = ab.getContext().getSharedPreferences("system_config_prefs", 4);
    int i = ((SharedPreferences)localObject).getInt("client_server_diff_time_enable", 0);
    int j = ((SharedPreferences)localObject).getInt("client_server_diff_time_interval", 0);
    if ((i <= 0) || (j <= 0))
    {
      GMTrace.o(15229954031616L, 113472);
      return l1;
    }
    com.tencent.mm.kernel.h.xz();
    localObject = com.tencent.mm.kernel.h.xy().xh().get(w.a.vxJ, null);
    if (localObject == null)
    {
      GMTrace.o(15229954031616L, 113472);
      return l1;
    }
    long l2 = bg.getLong(localObject.toString(), 0L);
    if (Math.abs(l2 / 1000L) > j)
    {
      GMTrace.o(15229954031616L, 113472);
      return l1 - l2;
    }
    GMTrace.o(15229954031616L, 113472);
    return l1;
  }
  
  public static void Bh()
  {
    GMTrace.i(13289299902464L, 99013);
    List localList = ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).aOf().Cd("bottlemessage");
    if (localList != null)
    {
      int i = 0;
      while (i < localList.size())
      {
        j((au)localList.get(i));
        i += 1;
      }
    }
    ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).aOf().Cf("bottlemessage");
    GMTrace.o(13289299902464L, 99013);
  }
  
  public static void Bi()
  {
    GMTrace.i(13289434120192L, 99014);
    List localList = ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).aOf().Cd("qmessage");
    if (localList != null)
    {
      int i = 0;
      while (i < localList.size())
      {
        j((au)localList.get(i));
        i += 1;
      }
    }
    ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).aOf().Cf("qmessage");
    GMTrace.o(13289434120192L, 99014);
  }
  
  public static void Bj()
  {
    GMTrace.i(13289568337920L, 99015);
    List localList = ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).aOf().Cd("tmessage");
    if (localList != null)
    {
      int i = 0;
      while (i < localList.size())
      {
        j((au)localList.get(i));
        i += 1;
      }
    }
    ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).aOf().Cf("tmessage");
    GMTrace.o(13289568337920L, 99015);
  }
  
  public static String N(String paramString1, String paramString2)
  {
    GMTrace.i(13287286636544L, 98998);
    if (bg.nm(paramString1))
    {
      GMTrace.o(13287286636544L, 98998);
      return null;
    }
    if (bg.nm(paramString2))
    {
      GMTrace.o(13287286636544L, 98998);
      return paramString1;
    }
    paramString1 = paramString2 + ": " + paramString1;
    GMTrace.o(13287286636544L, 98998);
    return paramString1;
  }
  
  public static int S(long paramLong)
  {
    GMTrace.i(13288628813824L, 99008);
    au localau = ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).aOf().cM(paramLong);
    if (localau.field_msgId != paramLong)
    {
      GMTrace.o(13288628813824L, 99008);
      return 0;
    }
    j(localau);
    int i = ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).aOf().cN(paramLong);
    GMTrace.o(13288628813824L, 99008);
    return i;
  }
  
  public static int a(String paramString, a parama)
  {
    GMTrace.i(13289031467008L, 99011);
    w.i("MicroMsg.MsgInfoStorageLogic", "summerdel deleteMsgByTalker[%s] stack[%s]", new Object[] { paramString, bg.bQW() });
    com.tencent.mm.sdk.f.e.post(new Runnable()
    {
      final int gnL;
      final int gnM;
      final int gnN;
      int gnO;
      
      public final void run()
      {
        GMTrace.i(13267019759616L, 98847);
        Object localObject = ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).aOf().Ca(this.fTa);
        long l1;
        long l5;
        int i;
        long l3;
        if (localObject == null)
        {
          l1 = Long.MAX_VALUE;
          if ((localObject != null) && (((ce)localObject).field_createTime > 0L)) {
            ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).zv().z(this.fTa, l1);
          }
          w.i("MicroMsg.MsgInfoStorageLogic", "summerdel deleteMsgByTalker run currentThread[%s, %d] lastMsg[%s] lastMsgCreateTime[%s]", new Object[] { Thread.currentThread().getName(), Long.valueOf(Thread.currentThread().getId()), localObject, Long.valueOf(l1) });
          l5 = bg.Pv();
          i = 0;
          l3 = 0L;
        }
        long l2;
        label289:
        do
        {
          if ((this.gnO < 200) && (this.gnO > 30)) {
            if (l3 <= 500L) {
              break label289;
            }
          }
          long l6;
          for (int j = this.gnO - 5;; j = this.gnO + 5)
          {
            this.gnO = j;
            l6 = bg.Pv();
            localObject = ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).aOf().f(this.fTa, this.gnO, l1);
            l3 = 0L;
            l2 = 0L;
            while (((Cursor)localObject).moveToNext())
            {
              au localau = new au();
              localau.b((Cursor)localObject);
              l4 = l3;
              if (l3 < localau.field_createTime) {
                l4 = localau.field_createTime;
              }
              bc.j(localau);
              l2 = 1L + l2;
              l3 = l4;
            }
            l1 = ((ce)localObject).field_createTime;
            break;
          }
          ((Cursor)localObject).close();
          long l7 = bg.Pv();
          if ((l3 > 0L) && (l2 > 0L)) {
            ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).aOf().J(this.fTa, l3);
          }
          i = (int)(i + l2);
          long l8 = bg.Pv();
          long l4 = l8 - l6;
          w.i("MicroMsg.MsgInfoStorageLogic", "summerdel deleteMsgByTalker:%s delCnt:%d curCnt:%d msgTimeDiff:%d(%d) run:[%d,%d,%d](%d)", new Object[] { bg.SJ(this.fTa), Integer.valueOf(i), Long.valueOf(l2), Long.valueOf(l1 - l3), Long.valueOf(l1), Long.valueOf(l8 - l7), Long.valueOf(l8 - l6), Long.valueOf(l8 - l5), Integer.valueOf(this.gnO) });
          l3 = l4;
        } while (l2 > 0L);
        ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).zv().z(this.fTa, 0L);
        GMTrace.o(13267019759616L, 98847);
      }
    }, "deleteMsgByTalker");
    af.t(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(13263932751872L, 98824);
        if (this.gmq != null) {
          this.gmq.Bk();
        }
        GMTrace.o(13263932751872L, 98824);
      }
    });
    GMTrace.o(13289031467008L, 99011);
    return 0;
  }
  
  public static long a(String paramString, long paramLong1, boolean paramBoolean, long paramLong2)
  {
    GMTrace.i(13290239426560L, 99020);
    long l3 = paramLong1 * 1000L;
    paramLong1 = 0L;
    long l1 = -1L;
    au localau = null;
    long l2 = paramLong1;
    if (paramString != null)
    {
      localau = ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).aOf().Ca(paramString);
      if (localau != null) {
        paramLong1 = localau.field_createTime;
      }
      l1 = ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).aOf().Cu(paramString);
      l2 = paramLong1;
    }
    if (l1 == l2)
    {
      if (l3 == l2)
      {
        GMTrace.o(13290239426560L, 99020);
        return l3 + 1L;
      }
      GMTrace.o(13290239426560L, 99020);
      return l3;
    }
    if (l1 < l2)
    {
      if (l3 == l1)
      {
        GMTrace.o(13290239426560L, 99020);
        return l3 - 1L;
      }
      if (l3 == l2)
      {
        GMTrace.o(13290239426560L, 99020);
        return l3 + 1L;
      }
      if ((paramBoolean) || (paramLong2 == 0L) || (l3 > l2))
      {
        GMTrace.o(13290239426560L, 99020);
        return l3;
      }
      paramString = ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).aOf().D(paramString, l3);
      if ((paramString.field_msgSeq == 0L) || (paramString.field_msgSeq == paramLong2)) {
        break label463;
      }
      if (paramString.field_msgSeq < paramLong2)
      {
        paramLong1 = 1L + l3;
        w.i("MicroMsg.MsgInfoStorageLogic", "summerbadcr fixRecvGetMsgCreateTime 1 seq[%d, %d] need fix serverMillTime[%d]", new Object[] { Long.valueOf(paramString.field_msgSeq), Long.valueOf(paramLong2), Long.valueOf(paramLong1) });
        l1 = paramLong1;
        if (paramLong1 == l2)
        {
          l1 = paramLong1;
          if (localau != null)
          {
            l1 = paramLong1;
            if (localau.field_msgSeq != 0L)
            {
              if (localau.field_msgSeq >= paramLong2) {
                break label407;
              }
              l1 = 1L + l2;
              label349:
              w.i("MicroMsg.MsgInfoStorageLogic", "summerbadcr fixRecvGetMsgCreateTime 2 seq[%d, %d] need fix serverMillTime[%d]", new Object[] { Long.valueOf(localau.field_msgSeq), Long.valueOf(paramLong2), Long.valueOf(l1) });
            }
          }
        }
      }
    }
    for (;;)
    {
      GMTrace.o(13290239426560L, 99020);
      return l1;
      paramLong1 = l3 - 1L;
      break;
      label407:
      l1 = l2 - 1L;
      break label349;
      w.w("MicroMsg.MsgInfoStorageLogic", "summerbadcr fixRecvMsgCreateTime first > last [%d > %d], ret serverMillTime:%d", new Object[] { Long.valueOf(l1), Long.valueOf(l2), Long.valueOf(l3) });
      GMTrace.o(13290239426560L, 99020);
      return l3;
      label463:
      l1 = l3;
    }
  }
  
  public static void a(au paramau, d.a parama)
  {
    GMTrace.i(13289970991104L, 99018);
    if ((paramau == null) || (parama == null) || (parama.gtM == null))
    {
      w.e("MicroMsg.MsgInfoStorageLogic", "summerbadcr fixRecvMsgWithAddMsgInfo error input is null, stack[%s]", new Object[] { bg.bQW() });
      GMTrace.o(13289970991104L, 99018);
      return;
    }
    if (paramau.field_msgSvrId != parama.gtM.tQd)
    {
      GMTrace.o(13289970991104L, 99018);
      return;
    }
    bu localbu = parama.gtM;
    if ((paramau.field_isSend != 0) && (localbu.tQe == 0))
    {
      GMTrace.o(13289970991104L, 99018);
      return;
    }
    if ((paramau.field_msgSeq == 0L) && (localbu.tQe != 0)) {
      paramau.G(localbu.tQe);
    }
    int i = paramau.field_flag;
    if (parama.gtN)
    {
      i |= 0x2;
      if (!parama.gtO) {
        break label239;
      }
      i |= 0x1;
      label158:
      if (!parama.gtP) {
        break label247;
      }
      i |= 0x4;
    }
    for (;;)
    {
      paramau.dL(i);
      if ((paramau.field_msgId == 0L) && (parama.gtN)) {
        paramau.E(a(paramau.field_talker, parama.gtM.nFd, parama.gtP, parama.gtM.tQe));
      }
      GMTrace.o(13289970991104L, 99018);
      return;
      i &= 0xFFFFFFFD;
      break;
      label239:
      i &= 0xFFFFFFFE;
      break label158;
      label247:
      i &= 0xFFFFFFFB;
    }
  }
  
  public static void a(a parama)
  {
    GMTrace.i(13289165684736L, 99012);
    com.tencent.mm.kernel.h.xz();
    com.tencent.mm.kernel.h.xB().A(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(21012590624768L, 156556);
        if ((this.gmq == null) || (!this.gmq.Bl()))
        {
          ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).yP().bSX();
          if ((this.gmq == null) || (!this.gmq.Bl()))
          {
            bc.Bi();
            if ((this.gmq == null) || (!this.gmq.Bl()))
            {
              bc.Bj();
              if ((this.gmq == null) || (!this.gmq.Bl()))
              {
                bc.Bh();
                if ((this.gmq == null) || (!this.gmq.Bl()))
                {
                  List localList = ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).aOf().Cd("message");
                  if (localList != null)
                  {
                    int i = 0;
                    while (i < localList.size())
                    {
                      bc.j((au)localList.get(i));
                      i += 1;
                    }
                  }
                  ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).aOf().Cf("message");
                }
              }
            }
          }
        }
        if (this.gmq != null) {
          af.t(new Runnable()
          {
            public final void run()
            {
              GMTrace.i(21013127495680L, 156560);
              bc.4.this.gmq.Bk();
              GMTrace.o(21013127495680L, 156560);
            }
          });
        }
        GMTrace.o(21012590624768L, 156556);
      }
      
      public final String toString()
      {
        GMTrace.i(21012724842496L, 156557);
        String str = super.toString() + "|deleteAllMsg";
        GMTrace.o(21012724842496L, 156557);
        return str;
      }
    });
    GMTrace.o(13289165684736L, 99012);
  }
  
  public static int c(d.a parama)
  {
    GMTrace.i(13290105208832L, 99019);
    int j = 0;
    if (parama.gtN) {
      j = 2;
    }
    int i = j;
    if (parama.gtO) {
      i = j | 0x1;
    }
    j = i;
    if (parama.gtP) {
      j = i | 0x4;
    }
    GMTrace.o(13290105208832L, 99019);
    return j;
  }
  
  public static boolean fv(int paramInt)
  {
    GMTrace.i(13287957725184L, 99003);
    switch (paramInt)
    {
    case 25: 
    default: 
      GMTrace.o(13287957725184L, 99003);
      return false;
    }
    GMTrace.o(13287957725184L, 99003);
    return true;
  }
  
  public static int gO(String paramString)
  {
    GMTrace.i(13287420854272L, 98999);
    if (paramString == null)
    {
      w.e("MicroMsg.MsgInfoStorageLogic", "dz[getGroupChatMsgTalkerPos text is null]");
      GMTrace.o(13287420854272L, 98999);
      return -1;
    }
    if (paramString.length() <= 0)
    {
      w.e("MicroMsg.MsgInfoStorageLogic", "dz[getGroupChatMsgTalkerPos length < 0]");
      GMTrace.o(13287420854272L, 98999);
      return -1;
    }
    if (paramString.startsWith("~SEMI_XML~"))
    {
      w.e("MicroMsg.MsgInfoStorageLogic", "dz[getGroupChatMsgTalkerPos startsWith(SemiXml.MAGIC_HEAD)]");
      GMTrace.o(13287420854272L, 98999);
      return -1;
    }
    int i = paramString.indexOf(':');
    if ((i != -1) && (paramString.substring(0, i).contains("<")))
    {
      w.e("MicroMsg.MsgInfoStorageLogic", "dz[reject illegal character]");
      GMTrace.o(13287420854272L, 98999);
      return -1;
    }
    GMTrace.o(13287420854272L, 98999);
    return i;
  }
  
  public static String gP(String paramString)
  {
    GMTrace.i(13287555072000L, 99000);
    int i = gO(paramString);
    if (i == -1)
    {
      GMTrace.o(13287555072000L, 99000);
      return null;
    }
    paramString = paramString.substring(0, i);
    GMTrace.o(13287555072000L, 99000);
    return paramString;
  }
  
  public static String gQ(String paramString)
  {
    GMTrace.i(13287689289728L, 99001);
    int i = gO(paramString);
    if (i == -1)
    {
      GMTrace.o(13287689289728L, 99001);
      return paramString;
    }
    if (i + 2 >= paramString.length())
    {
      GMTrace.o(13287689289728L, 99001);
      return paramString;
    }
    paramString = paramString.substring(i + 2);
    GMTrace.o(13287689289728L, 99001);
    return paramString;
  }
  
  public static long gR(String paramString)
  {
    GMTrace.i(13288091942912L, 99004);
    long l = Bg();
    w.i("MicroMsg.MsgInfoStorageLogic", "[oneliang] fix send msg create time, after fix, now is :%s", new Object[] { Long.valueOf(l) });
    if (paramString != null)
    {
      paramString = ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).aOf().Ca(paramString);
      if (paramString != null)
      {
        w.i("MicroMsg.MsgInfoStorageLogic", "[oneliang] fix send msg create time, before return, msg id:%s, now is :%s", new Object[] { Long.valueOf(paramString.field_msgId), Long.valueOf(l) });
        if (paramString.field_createTime + 1L > l)
        {
          l = paramString.field_createTime;
          GMTrace.o(13288091942912L, 99004);
          return l + 1L;
        }
      }
    }
    GMTrace.o(13288091942912L, 99004);
    return l;
  }
  
  public static int gS(String paramString)
  {
    GMTrace.i(13288897249280L, 99010);
    int i = ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).aOf().Cg(paramString);
    GMTrace.o(13288897249280L, 99010);
    return i;
  }
  
  public static b gT(String paramString)
  {
    GMTrace.i(13289702555648L, 99016);
    if (bg.nm(paramString))
    {
      GMTrace.o(13289702555648L, 99016);
      return null;
    }
    try
    {
      paramString = bh.q(paramString, "msgsource");
      if (paramString != null)
      {
        boolean bool = paramString.isEmpty();
        if (!bool) {}
      }
      else
      {
        GMTrace.o(13289702555648L, 99016);
        return null;
      }
      b localb = new b();
      localb.gnR = ((String)paramString.get(".msgsource.bizmsg.msgcluster"));
      localb.gnT = ((String)paramString.get(".msgsource.kf.kf_worker"));
      localb.gnS = bg.nl((String)paramString.get(".msgsource.bizmsg.bizclientmsgid"));
      localb.gnV = bg.nl((String)paramString.get(".msgsource.enterprise_info.qy_msg_type"));
      localb.gnW = bg.nl((String)paramString.get(".msgsource.enterprise_info.bizchat_id"));
      localb.gnX = bg.nl((String)paramString.get(".msgsource.enterprise_info.bizchat_ver"));
      localb.userId = bg.nl((String)paramString.get(".msgsource.enterprise_info.user_id"));
      localb.gnY = bg.nl((String)paramString.get(".msgsource.enterprise_info.user_nickname"));
      localb.gnZ = bg.nl((String)paramString.get(".msgsource.enterprise_info.sync_from_qy_im"));
      localb.gnU = ((String)paramString.get(".msgsource.strangerantispamticket.$ticket"));
      localb.scene = bg.getInt((String)paramString.get(".msgsource.strangerantispamticket.$scene"), 0);
      localb.goa = ((String)paramString.get(".msgsource.NotAutoDownloadRange"));
      localb.gob = bg.getInt((String)paramString.get(".msgsource.DownloadLimitKbps"), 0);
      localb.goc = bg.getInt((String)paramString.get(".msgsource.videopreloadlen"), 0);
      localb.god = bg.getInt((String)paramString.get(".msgsource.PreDownload"), 0);
      localb.goe = bg.getInt((String)paramString.get(".msgsource.PreDownloadNetType"), 0);
      localb.gof = ((String)paramString.get(".msgsource.NoPreDownloadRange"));
      GMTrace.o(13289702555648L, 99016);
      return localb;
    }
    catch (Exception paramString)
    {
      w.e("MicroMsg.MsgInfoStorageLogic", "exception:%s", new Object[] { bg.f(paramString) });
      w.e("MicroMsg.MsgInfoStorageLogic", "Exception in getMsgSourceValue, %s", new Object[] { paramString.getMessage() });
      GMTrace.o(13289702555648L, 99016);
    }
    return null;
  }
  
  public static String gU(String paramString)
  {
    GMTrace.i(13289836773376L, 99017);
    paramString = gT(paramString);
    if (paramString == null)
    {
      GMTrace.o(13289836773376L, 99017);
      return null;
    }
    paramString = paramString.gnT;
    GMTrace.o(13289836773376L, 99017);
    return paramString;
  }
  
  public static long i(au paramau)
  {
    GMTrace.i(13287823507456L, 99002);
    x localx = ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).yK().TE(paramau.field_talker);
    if ((localx == null) || ((int)localx.fTq == 0))
    {
      localx = new x(paramau.field_talker);
      localx.setType(2);
      ji localji = new ji();
      localji.eMX.eMY = localx;
      com.tencent.mm.sdk.b.a.vgX.m(localji);
      ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).yK().R(localx);
    }
    long l = ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).aOf().P(paramau);
    GMTrace.o(13287823507456L, 99002);
    return l;
  }
  
  public static void j(au paramau)
  {
    GMTrace.i(13288360378368L, 99006);
    if (paramau == null)
    {
      GMTrace.o(13288360378368L, 99006);
      return;
    }
    int i = paramau.field_type;
    switch (i)
    {
    }
    for (;;)
    {
      Object localObject = d.c.aF(Integer.valueOf(i));
      if (localObject != null) {
        ((d)localObject).h(paramau);
      }
      localObject = new cb();
      ((cb)localObject).eDq.eDr = paramau.field_msgId;
      ((cb)localObject).eDq.eDs = paramau.field_talker;
      ((cb)localObject).eDq.msgType = paramau.field_type;
      com.tencent.mm.sdk.b.a.vgX.m((com.tencent.mm.sdk.b.b)localObject);
      GMTrace.o(13288360378368L, 99006);
      return;
      i = 49;
    }
  }
  
  public static long k(String paramString, long paramLong)
  {
    GMTrace.i(13288226160640L, 99005);
    if (paramString != null)
    {
      paramString = ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).aOf().Ca(paramString);
      if (paramString == null) {}
    }
    for (long l = paramString.field_createTime + 1L;; l = 0L)
    {
      if (l > paramLong * 1000L)
      {
        GMTrace.o(13288226160640L, 99005);
        return l;
      }
      GMTrace.o(13288226160640L, 99005);
      return paramLong * 1000L;
    }
  }
  
  public static int l(String paramString, long paramLong)
  {
    GMTrace.i(13288763031552L, 99009);
    au localau = ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).aOf().B(paramString, paramLong);
    if (localau.field_msgSvrId != paramLong)
    {
      GMTrace.o(13288763031552L, 99009);
      return 0;
    }
    j(localau);
    int i = ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).aOf().I(paramString, paramLong);
    GMTrace.o(13288763031552L, 99009);
    return i;
  }
  
  public static void w(List<Long> paramList)
  {
    GMTrace.i(13288494596096L, 99007);
    if (paramList.size() == 0)
    {
      GMTrace.o(13288494596096L, 99007);
      return;
    }
    paramList = paramList.iterator();
    while (paramList.hasNext()) {
      S(((Long)paramList.next()).longValue());
    }
    GMTrace.o(13288494596096L, 99007);
  }
  
  public static abstract interface a
  {
    public abstract void Bk();
    
    public abstract boolean Bl();
  }
  
  public static final class b
  {
    public String gnR;
    public String gnS;
    public String gnT;
    public String gnU;
    public String gnV;
    public String gnW;
    public String gnX;
    public String gnY;
    public String gnZ;
    public String goa;
    public int gob;
    public int goc;
    public int god;
    public int goe;
    public String gof;
    public int scene;
    public String userId;
    
    public b()
    {
      GMTrace.i(13266482888704L, 98843);
      this.scene = 0;
      GMTrace.o(13266482888704L, 98843);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\y\bc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */