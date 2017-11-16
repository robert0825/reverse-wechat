package com.tencent.mm.ui.chatting.b;

import android.util.Base64;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.af.f;
import com.tencent.mm.booter.z;
import com.tencent.mm.booter.z.a;
import com.tencent.mm.g.b.af;
import com.tencent.mm.g.b.aj;
import com.tencent.mm.g.b.ce;
import com.tencent.mm.modelstat.a.a;
import com.tencent.mm.platformtools.t;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.plugin.sns.b.i;
import com.tencent.mm.pointers.PString;
import com.tencent.mm.protocal.c.bhd;
import com.tencent.mm.protocal.c.bhf;
import com.tencent.mm.sdk.f.e;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.as;
import com.tencent.mm.storage.au;
import com.tencent.mm.x.f.a;
import com.tencent.mm.y.at;
import com.tencent.mm.y.bc;
import com.tencent.mm.y.m;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

public final class q
{
  private static String wJA;
  private HashSet<Long> wJv;
  private HashSet<Long> wJw;
  HashSet<Long> wJx;
  private int wJy;
  private boolean wJz;
  h wtd;
  
  static
  {
    GMTrace.i(19093142896640L, 142255);
    wJA = "100134";
    GMTrace.o(19093142896640L, 142255);
  }
  
  public q(h paramh)
  {
    GMTrace.i(19092471808000L, 142250);
    this.wJv = new HashSet();
    this.wJw = new HashSet();
    this.wJx = new HashSet();
    this.wJy = 0;
    this.wJz = false;
    this.wtd = paramh;
    GMTrace.o(19092471808000L, 142250);
  }
  
  public final void aR(final au paramau)
  {
    GMTrace.i(19092606025728L, 142251);
    if (!this.wJv.contains(Long.valueOf(paramau.field_msgSvrId)))
    {
      this.wJv.add(Long.valueOf(paramau.field_msgSvrId));
      e.post(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(19080123777024L, 142158);
          ((i)com.tencent.mm.kernel.h.h(i.class)).U(paramau);
          au localau = paramau;
          boolean bool1 = this.wJB;
          Object localObject2 = new PString();
          Object localObject1 = new PString();
          boolean bool2;
          com.tencent.mm.modelsns.d locald;
          if (com.tencent.mm.ui.chatting.a.a(localau, (PString)localObject2, (PString)localObject1))
          {
            Object localObject3 = ((PString)localObject2).value;
            String str = ((PString)localObject1).value;
            localObject2 = localau.field_talker;
            bool2 = ((String)localObject2).endsWith("@chatroom");
            if (localau.field_isSend != 1) {
              break label538;
            }
            localObject1 = com.tencent.mm.y.q.zE();
            locald = new com.tencent.mm.modelsns.d();
            locald.q("20source_publishid", (String)localObject3 + ",");
            locald.q("21uxinfo", str + ",");
            locald.q("22clienttime", bg.Pv() + ",");
            localObject3 = new StringBuilder();
            if (localau.field_type != 62) {
              break label562;
            }
            i = 1;
            label221:
            locald.q("23source_type", i + ",");
            localObject3 = new StringBuilder();
            if (!bool2) {
              break label567;
            }
            i = 4;
            label257:
            locald.q("24scene", i + ",");
            locald.q("25scene_chatname", (String)localObject2 + ",");
            locald.q("26scene_username", (String)localObject1 + ",");
            locald.q("27curr_publishid", ",");
            locald.q("28curr_msgid", localau.field_msgSvrId + ",");
            locald.q("29curr_favid", "0,");
            localObject1 = new StringBuilder();
            if (!bool1) {
              break label572;
            }
            i = 1;
            label395:
            locald.q("30isdownload", i + ",");
            localObject1 = new StringBuilder();
            if (!bool2) {
              break label577;
            }
          }
          label538:
          label562:
          label567:
          label572:
          label577:
          for (int i = m.fk((String)localObject2);; i = 0)
          {
            locald.q("31chatroom_membercount", i + ",");
            ((i)com.tencent.mm.kernel.h.h(i.class)).b(((i)com.tencent.mm.kernel.h.h(i.class)).y(localau), locald);
            w.i("MicroMsg.AdVideoStatistic", "report snsad_video_exposure: " + locald.LT());
            g.ork.i(12989, new Object[] { locald });
            GMTrace.o(19080123777024L, 142158);
            return;
            if (bool2)
            {
              localObject1 = bc.gP(localau.field_content);
              break;
            }
            localObject1 = localObject2;
            break;
            i = 2;
            break label221;
            i = 3;
            break label257;
            i = 0;
            break label395;
          }
        }
      }, "ChattingUI.adVideoExposeReport");
    }
    GMTrace.o(19092606025728L, 142251);
  }
  
  public final void aS(final au paramau)
  {
    GMTrace.i(19092740243456L, 142252);
    if (this.wJw.contains(Long.valueOf(paramau.field_msgSvrId)))
    {
      GMTrace.o(19092740243456L, 142252);
      return;
    }
    this.wJw.add(Long.valueOf(paramau.field_msgSvrId));
    e.post(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(19080392212480L, 142160);
        com.tencent.mm.modelstat.a.a(paramau, a.a.gWr);
        GMTrace.o(19080392212480L, 142160);
      }
    }, "ChattingUI.expExposeReport");
    GMTrace.o(19092740243456L, 142252);
  }
  
  public final void aT(final au paramau)
  {
    GMTrace.i(19092874461184L, 142253);
    if (!this.wJz)
    {
      this.wJz = true;
      com.tencent.mm.storage.c localc = com.tencent.mm.y.c.c.Ct().er(wJA);
      if (localc.isValid()) {
        this.wJy = t.getInt((String)localc.bSg().get("needUploadData"), 0);
      }
    }
    if (this.wJy == 0)
    {
      GMTrace.o(19092874461184L, 142253);
      return;
    }
    if (this.wJx.contains(Long.valueOf(paramau.field_msgSvrId)))
    {
      GMTrace.o(19092874461184L, 142253);
      return;
    }
    e.post(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(19094216638464L, 142263);
        Object localObject1 = q.this;
        au localau = paramau;
        ((q)localObject1).wJx.add(Long.valueOf(localau.field_msgSvrId));
        com.tencent.mm.modelsns.d locald = new com.tencent.mm.modelsns.d();
        locald.q("20MessageID", localau.field_msgSvrId + ",");
        locald.q("21MessageInnerType", localau.field_type + ",");
        locald.q("22currChatName", localau.field_talker + ",");
        Object localObject2 = "";
        if (localau.field_isSend == 1) {
          localObject1 = com.tencent.mm.y.q.zE();
        }
        for (;;)
        {
          locald.q("23msgPostUserName", (String)localObject1 + ",");
          localObject2 = f.a.eS(localau.field_content);
          if (localObject2 != null)
          {
            locald.q("24AppId", ((f.a)localObject2).appId + ",");
            if (((f.a)localObject2).eTv != null)
            {
              localObject1 = new bhf();
              localObject2 = Base64.decode(((f.a)localObject2).eTv, 0);
            }
          }
          try
          {
            ((bhf)localObject1).aD((byte[])localObject2);
            if (((bhf)localObject1).uTd != null) {
              locald.q("25SourceAppId", ((bhf)localObject1).uTd.lMv + ",");
            }
            w.v("MicroMsg.ChattingUI.StatisticImp", "appExposeReport report logbuffer(13634): " + locald.LT());
            g.ork.i(13634, new Object[] { locald });
            GMTrace.o(19094216638464L, 142263);
            return;
            if (((q)localObject1).wtd.ccU())
            {
              localObject1 = localObject2;
              if (localau.field_content == null) {
                continue;
              }
              int i = bc.gO(localau.field_content);
              localObject1 = localObject2;
              if (i == -1) {
                continue;
              }
              localObject1 = localau.field_content.substring(0, i).trim();
              continue;
            }
            localObject1 = localau.field_talker;
          }
          catch (Exception localException)
          {
            for (;;) {}
          }
        }
      }
    }, "ChattingUI.appExposeReport");
    GMTrace.o(19092874461184L, 142253);
  }
  
  public final void ceH()
  {
    GMTrace.i(19093008678912L, 142254);
    if ((this.wtd.ccY() == null) || (this.wtd.ccY().field_username == null))
    {
      GMTrace.o(19093008678912L, 142254);
      return;
    }
    int k = 0;
    int i = 1;
    int j;
    if ("notification_messages".equals(this.wtd.ccY().field_username))
    {
      j = 8;
      if (!this.wtd.ccX()) {
        break label681;
      }
      j = 0;
    }
    for (;;)
    {
      Object localObject;
      if (j != 0)
      {
        at.AR();
        localObject = com.tencent.mm.y.c.yP().TO(this.wtd.ccY().field_username);
        if (localObject != null) {
          break label735;
        }
      }
      label501:
      label681:
      label735:
      for (int m = 0;; m = ((aj)localObject).field_unReadCount)
      {
        localObject = z.fJI;
        String str = this.wtd.ccY().field_username;
        if (((z)localObject).fJS == null) {
          ((z)localObject).fJS = com.tencent.mm.y.q.zE();
        }
        if (!((z)localObject).fJS.equals(str))
        {
          if (((z)localObject).fJM != null)
          {
            w.i("MicroMsg.StayTimeReport", "enterChattingUI, not close:%s", new Object[] { ((z)localObject).fJM.fJZ });
            ((z)localObject).ds(((z)localObject).fJM.fJZ);
          }
          if (((z)localObject).fJJ.Ar(6) == 0) {
            ((z)localObject).fJJ.setLong(4, t.Pu());
          }
          com.tencent.mm.sdk.b.a.vgX.a(((z)localObject).fJK);
          com.tencent.mm.sdk.b.a.vgX.a(((z)localObject).fJL);
          ((z)localObject).fJM = new z.a((z)localObject);
          ((z)localObject).fJM.fKe = ((z)localObject).fJN;
          ((z)localObject).fJN = 0;
          ((z)localObject).fJM.fJZ = str;
          ((z)localObject).fJQ = t.Pw();
          ((z)localObject).fJM.type = j;
          ((z)localObject).fJM.fKa = i;
          ((z)localObject).fJM.eAs = m;
          ((z)localObject).fJM.fKb = k;
          ((z)localObject).fJM.fKc = t.Pu();
          w.i("MicroMsg.StayTimeReport", "enter chattingUI: chatUser:%s----type:%d, notifyOpen:%d, unreadCount:%d, membercount:%d", new Object[] { str, Integer.valueOf(j), Integer.valueOf(i), Integer.valueOf(m), Integer.valueOf(k) });
        }
        GMTrace.o(19093008678912L, 142254);
        return;
        if (com.tencent.mm.y.s.fD(this.wtd.ccY().field_username))
        {
          if (this.wtd.ccV())
          {
            if (this.wtd.vc()) {}
            for (i = 0;; i = 1)
            {
              if (!this.wtd.ccW()) {
                break label501;
              }
              k = this.wtd.cde().FT().size();
              j = 5;
              break;
            }
            j = 4;
            break;
          }
          if (f.iO(this.wtd.ccY().field_username))
          {
            j = 3;
            if (this.wtd.vc())
            {
              i = 0;
              break;
            }
            i = 1;
            break;
          }
          if (f.iP(this.wtd.ccY().field_username))
          {
            j = 0;
            break;
          }
          if (f.iL(this.wtd.ccY().field_username))
          {
            j = 6;
            i = 0;
            break;
          }
          j = 7;
          i = 0;
          break;
        }
        if (this.wtd.ccT())
        {
          j = 2;
          k = m.fk(this.wtd.ccY().field_username);
          if (this.wtd.vc())
          {
            i = 0;
            break;
          }
          i = 1;
          break;
        }
        j = 1;
        if (this.wtd.vc())
        {
          i = 0;
          break;
        }
        i = 1;
        break;
        localObject = com.tencent.mm.y.s.gmD;
        int n = localObject.length;
        m = 0;
        while (m < n)
        {
          if (localObject[m].equals(this.wtd.ccY().field_username)) {
            j = 0;
          }
          m += 1;
        }
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\chatting\b\q.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */