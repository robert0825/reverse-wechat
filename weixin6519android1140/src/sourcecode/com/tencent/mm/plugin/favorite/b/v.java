package com.tencent.mm.plugin.favorite.b;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.kernel.h;
import com.tencent.mm.modelsns.d;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.plugin.sns.b.c;
import com.tencent.mm.plugin.sns.b.i;
import com.tencent.mm.protocal.c.th;
import com.tencent.mm.protocal.c.tk;
import com.tencent.mm.protocal.c.tt;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.util.LinkedList;

public final class v
{
  public static void a(a parama, j paramj)
  {
    GMTrace.i(6274410348544L, 46748);
    if ((paramj.field_favProto.ulB == null) || (paramj.field_favProto.ulB.isEmpty()))
    {
      GMTrace.o(6274410348544L, 46748);
      return;
    }
    Object localObject = ((th)paramj.field_favProto.ulB.getFirst()).ukt;
    if (localObject == null)
    {
      GMTrace.o(6274410348544L, 46748);
      return;
    }
    d locald = new d();
    locald.q("20source_publishid", ((tk)localObject).gkP + ",");
    locald.q("21uxinfo", ((tk)localObject).gkO + ",");
    locald.q("22clienttime", bg.Pv() + ",");
    locald.q("23video_statu", ",");
    localObject = new StringBuilder();
    if (paramj.field_type == 16) {}
    for (int i = 1;; i = 2)
    {
      locald.q("24source_type", i + ",");
      locald.q("25scene", "5,");
      locald.q("26action_type", a.a(parama) + ",");
      locald.q("27scene_chatname", ",");
      locald.q("28scene_username", paramj.field_fromUser + ",");
      locald.q("29curr_publishid", ",");
      locald.q("30curr_msgid", "0,");
      locald.q("31curr_favid", paramj.field_id + ",");
      locald.q("32elapsed_time", "0,");
      locald.q("33load_time", "0,");
      locald.q("34is_load_complete", "0,");
      locald.q("35destination", "0,");
      locald.q("36chatroom_membercount", "0,");
      w.i("MicroMsg.FavVideoStatistic", "report snsad_video_action: " + locald.LT());
      ((c)h.h(c.class)).i(12990, new Object[] { locald });
      GMTrace.o(6274410348544L, 46748);
      return;
    }
  }
  
  public static void a(c paramc, j paramj, d paramd, int paramInt)
  {
    GMTrace.i(6274544566272L, 46749);
    if ((paramj.field_favProto.ulB == null) || (paramj.field_favProto.ulB.isEmpty()))
    {
      GMTrace.o(6274544566272L, 46749);
      return;
    }
    tk localtk = ((th)paramj.field_favProto.ulB.getFirst()).ukt;
    if (localtk == null)
    {
      GMTrace.o(6274544566272L, 46749);
      return;
    }
    d locald = new d();
    locald.q("20source_publishid", localtk.gkP + ",");
    locald.q("21uxinfo", localtk.gkO + ",");
    locald.q("22clienttime", bg.Pv() + ",");
    locald.q("23video_statu", d.a(paramd) + ",");
    paramd = new StringBuilder();
    if (paramj.field_type == 16) {}
    for (int i = 1;; i = 2)
    {
      locald.q("24source_type", i + ",");
      locald.q("25scene", "5,");
      locald.q("26action_type", c.a(paramc) + ",");
      locald.q("27scene_chatname", ",");
      locald.q("28scene_username", paramj.field_fromUser + ",");
      locald.q("29curr_publishid", ",");
      locald.q("30curr_msgid", "0,");
      locald.q("31curr_favid", paramj.field_id + ",");
      locald.q("32chatroom_membercount", "0,");
      locald.q("33chatroom_toMemberCount", paramInt + ",");
      w.i("MicroMsg.FavVideoStatistic", "report snsad_video_spread: " + locald.LT());
      g.ork.i(12991, new Object[] { locald });
      GMTrace.o(6274544566272L, 46749);
      return;
    }
  }
  
  public static void j(j paramj)
  {
    GMTrace.i(6274276130816L, 46747);
    if ((paramj.field_favProto.ulB == null) || (paramj.field_favProto.ulB.isEmpty()))
    {
      GMTrace.o(6274276130816L, 46747);
      return;
    }
    th localth = (th)paramj.field_favProto.ulB.getFirst();
    Object localObject = localth.ukt;
    if (localObject == null)
    {
      GMTrace.o(6274276130816L, 46747);
      return;
    }
    d locald = new d();
    locald.q("20source_publishid", ((tk)localObject).gkP + ",");
    locald.q("21uxinfo", ((tk)localObject).gkO + ",");
    locald.q("22clienttime", bg.Pv() + ",");
    localObject = new StringBuilder();
    if (paramj.field_type == 16) {}
    for (int i = 1;; i = 2)
    {
      locald.q("23source_type", i + ",");
      locald.q("24scene", "5,");
      locald.q("25scene_chatname", ",");
      locald.q("26scene_username", paramj.field_fromUser + ",");
      locald.q("27curr_publishid", ",");
      locald.q("28curr_msgid", "0,");
      locald.q("29curr_favid", paramj.field_id + ",");
      locald.q("30isdownload", "0,");
      locald.q("31chatroom_membercount", "0,");
      ((i)h.h(i.class)).b(localth.eTv, locald);
      w.i("MicroMsg.FavVideoStatistic", "report snsad_video_exposure: " + locald.LT());
      g.ork.i(12989, new Object[] { locald });
      GMTrace.o(6274276130816L, 46747);
      return;
    }
  }
  
  public static enum a
  {
    private int value;
    
    static
    {
      GMTrace.i(6281523888128L, 46801);
      lbw = new a("PlayIcon", 0, 1);
      lbx = new a("EnterFullScreen", 1, 2);
      lby = new a("EnterCompleteVideo", 2, 3);
      lbz = new a("DetailInVideo", 3, 4);
      lbA = new a("LeavelFullScreen", 4, 5);
      lbB = new a("LeaveCompleteVideo", 5, 6);
      lbC = new a("SightLoaded", 6, 7);
      lbD = new a[] { lbw, lbx, lby, lbz, lbA, lbB, lbC };
      GMTrace.o(6281523888128L, 46801);
    }
    
    private a(int paramInt)
    {
      GMTrace.i(6281255452672L, 46799);
      this.value = 0;
      this.value = paramInt;
      GMTrace.o(6281255452672L, 46799);
    }
  }
  
  public static enum b
  {
    public int value;
    
    static
    {
      GMTrace.i(6303804030976L, 46967);
      lbE = new b("Sight", 0, 1);
      lbF = new b("AdUrl", 1, 2);
      lbG = new b("Chat", 2, 3);
      lbH = new b("TalkChat", 3, 4);
      lbI = new b("Fav", 4, 5);
      lbJ = new b[] { lbE, lbF, lbG, lbH, lbI };
      GMTrace.o(6303804030976L, 46967);
    }
    
    private b(int paramInt)
    {
      GMTrace.i(6303669813248L, 46966);
      this.value = 0;
      this.value = paramInt;
      GMTrace.o(6303669813248L, 46966);
    }
  }
  
  public static enum c
  {
    private int value;
    
    static
    {
      GMTrace.i(6271591776256L, 46727);
      lbK = new c("Chat", 0, 2);
      lbL = new c("Chatroom", 1, 3);
      lbM = new c("Sns", 2, 4);
      lbN = new c[] { lbK, lbL, lbM };
      GMTrace.o(6271591776256L, 46727);
    }
    
    private c(int paramInt)
    {
      GMTrace.i(6271323340800L, 46725);
      this.value = 0;
      this.value = paramInt;
      GMTrace.o(6271323340800L, 46725);
    }
  }
  
  public static enum d
  {
    private int value;
    
    static
    {
      GMTrace.i(6298301104128L, 46926);
      lbO = new d("Samll", 0, 1);
      lbP = new d("Full", 1, 2);
      lbQ = new d("Complete", 2, 3);
      lbR = new d[] { lbO, lbP, lbQ };
      GMTrace.o(6298301104128L, 46926);
    }
    
    private d(int paramInt)
    {
      GMTrace.i(6298032668672L, 46924);
      this.value = 0;
      this.value = paramInt;
      GMTrace.o(6298032668672L, 46924);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\favorite\b\v.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */