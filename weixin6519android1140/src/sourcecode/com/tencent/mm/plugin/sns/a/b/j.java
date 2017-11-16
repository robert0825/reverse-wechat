package com.tencent.mm.plugin.sns.a.b;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.kernel.h;
import com.tencent.mm.modelsns.d;
import com.tencent.mm.modelstat.o;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.plugin.sns.b.c;
import com.tencent.mm.plugin.sns.storage.a;
import com.tencent.mm.plugin.sns.storage.m;
import com.tencent.mm.protocal.c.bhq;
import com.tencent.mm.protocal.c.biz;
import com.tencent.mm.protocal.c.oa;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.util.LinkedList;
import java.util.List;

public final class j
{
  public static void a(a parama, String paramString1, String paramString2, int paramInt1, int paramInt2, String paramString3, String paramString4, String paramString5, long paramLong, int paramInt3, int paramInt4)
  {
    GMTrace.i(8158961467392L, 60789);
    d locald = new d();
    locald.q("20source_publishid", paramString1 + ",");
    locald.q("21uxinfo", paramString2 + ",");
    locald.q("22clienttime", bg.Pv() + ",");
    locald.q("23video_statu", ",");
    locald.q("24source_type", paramInt1 + ",");
    locald.q("25scene", paramInt2 + ",");
    locald.q("26action_type", a.a(parama) + ",");
    locald.q("27scene_chatname", paramString4 + ",");
    locald.q("28scene_username", paramString3 + ",");
    locald.q("29curr_publishid", paramString5 + ",");
    locald.q("30curr_msgid", paramLong + ",");
    locald.q("31curr_favid", paramInt3 + ",");
    locald.q("32elapsed_time", "0,");
    locald.q("33load_time", "0,");
    locald.q("34is_load_complete", "0,");
    locald.q("35destination", "0,");
    locald.q("36chatroom_membercount", paramInt4 + ",");
    f.a(paramString5, locald);
    w.i("MicroMsg.SnsVideoStatistic", "report snsad_video_action: " + locald.LT());
    g.ork.i(12990, new Object[] { locald });
    GMTrace.o(8158961467392L, 60789);
  }
  
  public static void a(b paramb, a parama, m paramm)
  {
    GMTrace.i(8158827249664L, 60788);
    biz localbiz = paramm.blD();
    Object localObject = localbiz.uUc.ueW;
    if ((localObject != null) && (!((List)localObject).isEmpty()) && (((localbiz.uUc.ueV == 15) && (paramm.uX(32))) || (localbiz.uUc.ueV == 18)))
    {
      ((List)localObject).get(0);
      if ((paramm.uX(32)) && (localbiz.uUc.ueV == 15))
      {
        localbiz.uUh.gkO = paramm.blB().pyc;
        localbiz.uUh.gkP = localbiz.mmR;
      }
      paramm = new d();
      paramm.q("20source_publishid", localbiz.uUh.gkP + ",");
      paramm.q("21uxinfo", localbiz.uUh.gkO + ",");
      paramm.q("22clienttime", bg.Pv() + ",");
      paramm.q("23video_statu", ",");
      localObject = new StringBuilder();
      if (localbiz.uUc.ueV != 15) {
        break label528;
      }
    }
    label528:
    for (int i = 1;; i = 2)
    {
      paramm.q("24source_type", i + ",");
      paramm.q("25scene", paramb.value + ",");
      paramm.q("26action_type", a.a(parama) + ",");
      paramm.q("27scene_chatname", ",");
      paramm.q("28scene_username", localbiz.jhi + ",");
      paramm.q("29curr_publishid", localbiz.mmR + ",");
      paramm.q("30curr_msgid", "0,");
      paramm.q("31curr_favid", "0,");
      paramm.q("32elapsed_time", "0,");
      paramm.q("33load_time", "0,");
      paramm.q("34is_load_complete", "0,");
      paramm.q("35destination", "0,");
      paramm.q("36chatroom_membercount", "0,");
      o.a(localbiz.pTh, paramm);
      w.i("MicroMsg.SnsVideoStatistic", "report snsad_video_action: " + paramm.LT());
      ((c)h.h(c.class)).i(12990, new Object[] { paramm });
      GMTrace.o(8158827249664L, 60788);
      return;
    }
  }
  
  public static void a(c paramc, String paramString1, String paramString2, int paramInt1, int paramInt2, String paramString3, String paramString4, String paramString5, long paramLong, int paramInt3, int paramInt4, int paramInt5)
  {
    GMTrace.i(8159229902848L, 60791);
    d locald = new d();
    locald.q("20source_publishid", paramString1 + ",");
    locald.q("21uxinfo", paramString2 + ",");
    locald.q("22clienttime", bg.Pv() + ",");
    locald.q("23video_statu", "3,");
    locald.q("24source_type", paramInt1 + ",");
    locald.q("25scene", paramInt2 + ",");
    locald.q("26action_type", paramc.value + ",");
    locald.q("27scene_chatname", paramString4 + ",");
    locald.q("28scene_username", paramString3 + ",");
    locald.q("29curr_publishid", paramString5 + ",");
    locald.q("30curr_msgid", paramLong + ",");
    locald.q("31curr_favid", paramInt3 + ",");
    locald.q("32chatroom_membercount", paramInt4 + ",");
    locald.q("33chatroom_toMemberCount", paramInt5 + ",");
    w.i("MicroMsg.SnsVideoStatistic", "report snsad_video_spread: " + locald.LT());
    f.a(paramString5, locald);
    g.ork.i(12991, new Object[] { locald });
    GMTrace.o(8159229902848L, 60791);
  }
  
  public static void a(d paramd, c paramc, e parame, int paramInt, m paramm)
  {
    GMTrace.i(8159095685120L, 60790);
    biz localbiz = paramm.blD();
    LinkedList localLinkedList = localbiz.uUc.ueW;
    if ((localLinkedList != null) && (!localLinkedList.isEmpty()) && (((localbiz.uUc.ueV == 15) && (paramm.uX(32))) || (localbiz.uUc.ueV == 18)))
    {
      localLinkedList.get(0);
      if ((paramm.uX(32)) && (localbiz.uUc.ueV == 15))
      {
        localbiz.uUh.gkO = paramm.blB().pyc;
        localbiz.uUh.gkP = localbiz.mmR;
      }
      paramm = new d();
      paramm.q("20source_publishid", localbiz.uUh.gkP + ",");
      paramm.q("21uxinfo", localbiz.uUh.gkO + ",");
      paramm.q("22clienttime", bg.Pv() + ",");
      paramm.q("23video_statu", e.a(parame) + ",");
      parame = new StringBuilder();
      if (localbiz.uUc.ueV != 15) {
        break label556;
      }
    }
    label556:
    for (int i = 1;; i = 2)
    {
      paramm.q("24source_type", i + ",");
      paramm.q("25scene", paramd.value + ",");
      paramm.q("26action_type", paramc.value + ",");
      paramm.q("27scene_chatname", ",");
      paramm.q("28scene_username", localbiz.jhi + ",");
      paramm.q("29curr_publishid", localbiz.mmR + ",");
      paramm.q("30curr_msgid", "0,");
      paramm.q("31curr_favid", "0,");
      paramm.q("32chatroom_membercount", "0,");
      paramm.q("33chatroom_toMemberCount", paramInt + ",");
      o.a(localbiz.pTh, paramm);
      w.i("MicroMsg.SnsVideoStatistic", "report snsad_video_spread: " + paramm.LT());
      g.ork.i(12991, new Object[] { paramm });
      GMTrace.o(8159095685120L, 60790);
      return;
    }
  }
  
  public static void a(m paramm, boolean paramBoolean1, boolean paramBoolean2)
  {
    int j = 2;
    GMTrace.i(8158693031936L, 60787);
    biz localbiz = paramm.blD();
    Object localObject = localbiz.uUc.ueW;
    if ((localObject != null) && (!((List)localObject).isEmpty()) && (((localbiz.uUc.ueV == 15) && (paramm.uX(32))) || (localbiz.uUc.ueV == 18)))
    {
      ((List)localObject).get(0);
      if ((paramm.uX(32)) && (localbiz.uUc.ueV == 15))
      {
        localbiz.uUh.gkO = paramm.blB().pyc;
        localbiz.uUh.gkP = localbiz.mmR;
      }
      paramm = new d();
      paramm.q("20source_publishid", localbiz.uUh.gkP + ",");
      paramm.q("21uxinfo", localbiz.uUh.gkO + ",");
      paramm.q("22clienttime", bg.Pv() + ",");
      localObject = new StringBuilder();
      if (localbiz.uUc.ueV != 15) {
        break label505;
      }
      i = 1;
      paramm.q("23souce_type", i + ",");
      localObject = new StringBuilder();
      if (!paramBoolean1) {
        break label510;
      }
      i = 6;
      label295:
      paramm.q("24scene", i + ",");
      paramm.q("25scene_chatname", ",");
      paramm.q("26scene_username", localbiz.jhi + ",");
      paramm.q("27curr_publishid", localbiz.mmR + ",");
      paramm.q("28curr_msgid", ",");
      paramm.q("29curr_favid", "0,");
      localObject = new StringBuilder();
      if (!paramBoolean2) {
        break label531;
      }
    }
    label505:
    label510:
    label531:
    for (int i = 1;; i = 0)
    {
      paramm.q("30isdownload", i + ",");
      paramm.q("31chatroom_membercount", "0,");
      o.a(localbiz.pTh, paramm);
      w.i("MicroMsg.SnsVideoStatistic", "report snsad_video_exposure: " + paramm.LT());
      g.ork.i(12989, new Object[] { paramm });
      GMTrace.o(8158693031936L, 60787);
      return;
      i = 2;
      break;
      i = j;
      if (localbiz.uUc.ueV != 15) {
        break label295;
      }
      i = 1;
      break label295;
    }
  }
  
  public static enum a
  {
    private int value;
    
    static
    {
      GMTrace.i(8164598611968L, 60831);
      pob = new a("PlayIcon", 0, 1);
      poc = new a("EnterFullScreen", 1, 2);
      pod = new a("EnterCompleteVideo", 2, 3);
      poe = new a("DetailInVideo", 3, 4);
      pof = new a("LeavelFullScreen", 4, 5);
      pog = new a("LeaveCompleteVideo", 5, 6);
      poh = new a("SightLoaded", 6, 7);
      poi = new a("DetailTimeline", 7, 8);
      poj = new a[] { pob, poc, pod, poe, pof, pog, poh, poi };
      GMTrace.o(8164598611968L, 60831);
    }
    
    private a(int paramInt)
    {
      GMTrace.i(8164330176512L, 60829);
      this.value = 0;
      this.value = paramInt;
      GMTrace.o(8164330176512L, 60829);
    }
  }
  
  public static enum b
  {
    public int value;
    
    static
    {
      GMTrace.i(8162585346048L, 60816);
      pok = new b("Sight", 0, 1);
      pol = new b("AdUrl", 1, 2);
      pom = new b("Chat", 2, 3);
      pon = new b("TalkChat", 3, 4);
      poo = new b("Fav", 4, 5);
      pop = new b[] { pok, pol, pom, pon, poo };
      GMTrace.o(8162585346048L, 60816);
    }
    
    private b(int paramInt)
    {
      GMTrace.i(8162451128320L, 60815);
      this.value = 0;
      this.value = paramInt;
      GMTrace.o(8162451128320L, 60815);
    }
  }
  
  public static enum c
  {
    public int value;
    
    static
    {
      GMTrace.i(8160974733312L, 60804);
      poq = new c("Fav", 0, 1);
      por = new c("Chat", 1, 2);
      pot = new c("Chatroom", 2, 3);
      pou = new c("Sns", 3, 4);
      pov = new c[] { poq, por, pot, pou };
      GMTrace.o(8160974733312L, 60804);
    }
    
    private c(int paramInt)
    {
      GMTrace.i(8160840515584L, 60803);
      this.value = 0;
      this.value = paramInt;
      GMTrace.o(8160840515584L, 60803);
    }
  }
  
  public static enum d
  {
    public int value;
    
    static
    {
      GMTrace.i(8167819837440L, 60855);
      pow = new d("Sight", 0, 1);
      pox = new d("AdUrl", 1, 2);
      poy = new d("Chat", 2, 3);
      poz = new d("TalkChat", 3, 4);
      poA = new d("Fav", 4, 5);
      poB = new d[] { pow, pox, poy, poz, poA };
      GMTrace.o(8167819837440L, 60855);
    }
    
    private d(int paramInt)
    {
      GMTrace.i(8167685619712L, 60854);
      this.value = 0;
      this.value = paramInt;
      GMTrace.o(8167685619712L, 60854);
    }
  }
  
  public static enum e
  {
    private int value;
    
    static
    {
      GMTrace.i(8166611877888L, 60846);
      poC = new e("Samll", 0, 1);
      poD = new e("Full", 1, 2);
      poE = new e("Complete", 2, 3);
      poF = new e[] { poC, poD, poE };
      GMTrace.o(8166611877888L, 60846);
    }
    
    private e(int paramInt)
    {
      GMTrace.i(8166343442432L, 60844);
      this.value = 0;
      this.value = paramInt;
      GMTrace.o(8166343442432L, 60844);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\sns\a\b\j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */