package com.tencent.mm.ui.chatting;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.b.ce;
import com.tencent.mm.kernel.h;
import com.tencent.mm.modelsns.d;
import com.tencent.mm.modelvideo.r;
import com.tencent.mm.modelvideo.t;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.plugin.sns.b.c;
import com.tencent.mm.pointers.PString;
import com.tencent.mm.protocal.c.bhr;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.au;
import com.tencent.mm.x.f.a;
import com.tencent.mm.y.bc;
import com.tencent.mm.y.m;
import com.tencent.mm.y.q;
import com.tencent.mm.y.s;

public final class a
{
  public static void a(a parama, au paramau)
  {
    GMTrace.i(2249354903552L, 16759);
    PString localPString1 = new PString();
    PString localPString2 = new PString();
    if (a(paramau, localPString1, localPString2)) {
      a(parama, paramau, localPString1.value, localPString2.value);
    }
    GMTrace.o(2249354903552L, 16759);
  }
  
  public static void a(a parama, au paramau, String paramString1, String paramString2)
  {
    GMTrace.i(2249489121280L, 16760);
    String str2 = paramau.field_talker;
    boolean bool = str2.endsWith("@chatroom");
    String str1;
    d locald;
    if (paramau.field_isSend == 1)
    {
      str1 = q.zE();
      locald = new d();
      locald.q("20source_publishid", paramString1 + ",");
      locald.q("21uxinfo", paramString2 + ",");
      locald.q("22clienttime", bg.Pv() + ",");
      locald.q("23video_statu", ",");
      paramString1 = new StringBuilder();
      if (paramau.field_type != 62) {
        break label504;
      }
      i = 1;
      label155:
      locald.q("24source_type", i + ",");
      paramString1 = new StringBuilder();
      if (!bool) {
        break label510;
      }
      i = 4;
      label192:
      locald.q("25scene", i + ",");
      locald.q("26action_type", a.a(parama) + ",");
      locald.q("27scene_chatname", str2 + ",");
      locald.q("28scene_username", str1 + ",");
      locald.q("29curr_publishid", ",");
      locald.q("30curr_msgid", paramau.field_msgSvrId + ",");
      locald.q("31curr_favid", "0,");
      locald.q("32elapsed_time", "0,");
      locald.q("33load_time", "0,");
      locald.q("34is_load_complete", "0,");
      locald.q("35destination", "0,");
      parama = new StringBuilder();
      if (!bool) {
        break label516;
      }
    }
    label504:
    label510:
    label516:
    for (int i = m.fk(str2);; i = 0)
    {
      locald.q("36chatroom_membercount", i + ",");
      w.i("MicroMsg.AdVideoStatistic", "report snsad_video_action: " + locald.LT());
      ((c)h.h(c.class)).i(12990, new Object[] { locald });
      GMTrace.o(2249489121280L, 16760);
      return;
      if (bool)
      {
        str1 = bc.gP(paramau.field_content);
        break;
      }
      str1 = str2;
      break;
      i = 2;
      break label155;
      i = 3;
      break label192;
    }
  }
  
  public static void a(c paramc, d paramd, au paramau, int paramInt)
  {
    GMTrace.i(2249623339008L, 16761);
    Object localObject2 = new PString();
    Object localObject1 = new PString();
    boolean bool;
    d locald;
    if (a(paramau, (PString)localObject2, (PString)localObject1))
    {
      String str1 = ((PString)localObject2).value;
      String str2 = ((PString)localObject1).value;
      localObject2 = paramau.field_talker;
      bool = ((String)localObject2).endsWith("@chatroom");
      if (paramau.field_isSend != 1) {
        break label528;
      }
      localObject1 = q.zE();
      locald = new d();
      locald.q("20source_publishid", str1 + ",");
      locald.q("21uxinfo", str2 + ",");
      locald.q("22clienttime", bg.Pv() + ",");
      locald.q("23video_statu", d.a(paramd) + ",");
      paramd = new StringBuilder();
      if (paramau.field_type != 62) {
        break label552;
      }
      i = 1;
      label220:
      locald.q("24source_type", i + ",");
      paramd = new StringBuilder();
      if (!bool) {
        break label558;
      }
      i = 4;
      label257:
      locald.q("25scene", i + ",");
      locald.q("26action_type", c.a(paramc) + ",");
      locald.q("27scene_chatname", (String)localObject2 + ",");
      locald.q("28scene_username", (String)localObject1 + ",");
      locald.q("29curr_publishid", ",");
      locald.q("30curr_msgid", paramau.field_msgSvrId + ",");
      locald.q("31curr_favid", "0,");
      paramc = new StringBuilder();
      if (!bool) {
        break label564;
      }
    }
    label528:
    label552:
    label558:
    label564:
    for (int i = m.fk((String)localObject2);; i = 0)
    {
      locald.q("32chatroom_membercount", i + ",");
      locald.q("33chatroom_toMemberCount", paramInt + ",");
      w.i("MicroMsg.AdVideoStatistic", "report snsad_video_spread: " + locald.LT());
      g.ork.i(12991, new Object[] { locald });
      GMTrace.o(2249623339008L, 16761);
      return;
      if (bool)
      {
        localObject1 = bc.gP(paramau.field_content);
        break;
      }
      localObject1 = localObject2;
      break;
      i = 2;
      break label220;
      i = 3;
      break label257;
    }
  }
  
  public static boolean a(au paramau, PString paramPString1, PString paramPString2)
  {
    GMTrace.i(2249757556736L, 16762);
    if (paramau.field_type == 62)
    {
      paramau = t.mw(paramau.field_imgPath);
      if (paramau == null)
      {
        GMTrace.o(2249757556736L, 16762);
        return false;
      }
      paramau = paramau.hcE;
      if ((paramau == null) || (bg.nm(paramau.gkO)))
      {
        GMTrace.o(2249757556736L, 16762);
        return false;
      }
      paramPString1.value = paramau.gkP;
      paramPString2.value = paramau.gkO;
      GMTrace.o(2249757556736L, 16762);
      return true;
    }
    if (paramau.field_type == 49)
    {
      boolean bool = s.eb(paramau.field_talker);
      String str2 = paramau.field_content;
      String str1 = str2;
      if (bool)
      {
        str1 = str2;
        if (paramau.field_content != null)
        {
          str1 = str2;
          if (paramau.field_isSend == 0) {
            str1 = bc.gQ(paramau.field_content);
          }
        }
      }
      paramau = f.a.eS(str1);
      if ((paramau == null) || (paramau.type != 4) || (bg.nm(paramau.gkI)))
      {
        GMTrace.o(2249757556736L, 16762);
        return false;
      }
      paramPString1.value = paramau.gkP;
      paramPString2.value = paramau.gkO;
      GMTrace.o(2249757556736L, 16762);
      return true;
    }
    GMTrace.o(2249757556736L, 16762);
    return false;
  }
  
  public static enum a
  {
    private int value;
    
    static
    {
      GMTrace.i(2268548038656L, 16902);
      wqk = new a("PlayIcon", 0, 1);
      wql = new a("EnterFullScreen", 1, 2);
      wqm = new a("EnterCompleteVideo", 2, 3);
      wqn = new a("DetailInVideo", 3, 4);
      wqo = new a("LeavelFullScreen", 4, 5);
      wqp = new a("LeaveCompleteVideo", 5, 6);
      wqq = new a("SightLoaded", 6, 7);
      wqr = new a[] { wqk, wql, wqm, wqn, wqo, wqp, wqq };
      GMTrace.o(2268548038656L, 16902);
    }
    
    private a(int paramInt)
    {
      GMTrace.i(2268279603200L, 16900);
      this.value = 0;
      this.value = paramInt;
      GMTrace.o(2268279603200L, 16900);
    }
  }
  
  public static enum b
  {
    public int value;
    
    static
    {
      GMTrace.i(2387196510208L, 17786);
      wqs = new b("Sight", 0, 1);
      wqt = new b("AdUrl", 1, 2);
      wqu = new b("Chat", 2, 3);
      wqv = new b("TalkChat", 3, 4);
      wqw = new b("Fav", 4, 5);
      wqx = new b[] { wqs, wqt, wqu, wqv, wqw };
      GMTrace.o(2387196510208L, 17786);
    }
    
    private b(int paramInt)
    {
      GMTrace.i(2387062292480L, 17785);
      this.value = 0;
      this.value = paramInt;
      GMTrace.o(2387062292480L, 17785);
    }
  }
  
  public static enum c
  {
    private int value;
    
    static
    {
      GMTrace.i(2128558948352L, 15859);
      wqy = new c("Fav", 0, 1);
      wqz = new c("Chat", 1, 2);
      wqA = new c("Chatroom", 2, 3);
      wqB = new c("Sns", 3, 4);
      wqC = new c[] { wqy, wqz, wqA, wqB };
      GMTrace.o(2128558948352L, 15859);
    }
    
    private c(int paramInt)
    {
      GMTrace.i(2128290512896L, 15857);
      this.value = 0;
      this.value = paramInt;
      GMTrace.o(2128290512896L, 15857);
    }
  }
  
  public static enum d
  {
    private int value;
    
    static
    {
      GMTrace.i(2232309252096L, 16632);
      wqD = new d("Samll", 0, 1);
      wqE = new d("Full", 1, 2);
      wqF = new d("Complete", 2, 3);
      wqG = new d[] { wqD, wqE, wqF };
      GMTrace.o(2232309252096L, 16632);
    }
    
    private d(int paramInt)
    {
      GMTrace.i(2232040816640L, 16630);
      this.value = 0;
      this.value = paramInt;
      GMTrace.o(2232040816640L, 16630);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\chatting\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */