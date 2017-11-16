package com.tencent.mm.modelstat;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.b.ce;
import com.tencent.mm.modelsns.d;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.au;
import com.tencent.mm.x.f.a;
import com.tencent.mm.y.bc;
import com.tencent.mm.y.q;

public final class a
{
  public static void a(au paramau, a parama)
  {
    GMTrace.i(1382174162944L, 10298);
    if (bg.nm(paramau.fwE))
    {
      GMTrace.o(1382174162944L, 10298);
      return;
    }
    d locald = new d();
    locald.q("20ExpIdStr", paramau.fwE + ",");
    locald.q("21OpType", parama.value + ",");
    locald.q("22msgId", paramau.field_msgSvrId + ",");
    locald.q("23MessageType", paramau.field_type + ",");
    int i;
    if (paramau.aCp())
    {
      parama = f.a.C(paramau.field_content, paramau.field_reserved);
      if (parama == null) {
        i = 0;
      }
    }
    for (;;)
    {
      parama = paramau.field_talker;
      locald.q("24AppMsgInnerType", i + ",");
      locald.q("25curUsername", parama + ",");
      String str = "";
      if (paramau.field_isSend == 1) {
        parama = q.zE();
      }
      for (;;)
      {
        locald.q("26msgPostUserName", parama + ",");
        locald.q("27MediaState", paramau.fwF + ",");
        w.v("MicroMsg.ChattingExpUtil", "report logbuffer(13564): [chatting_exp]" + locald.LT());
        g.ork.i(13564, new Object[] { locald });
        GMTrace.o(1382174162944L, 10298);
        return;
        i = parama.type;
        break;
        if ((parama != null) && (parama.endsWith("@chatroom")))
        {
          parama = str;
          if (paramau.field_content != null)
          {
            i = bc.gO(paramau.field_content);
            parama = str;
            if (i != -1) {
              parama = paramau.field_content.substring(0, i).trim();
            }
          }
        }
      }
      i = 0;
    }
  }
  
  public static enum a
  {
    public int value;
    
    static
    {
      GMTrace.i(1386737565696L, 10332);
      gWr = new a("Expose", 0, 1);
      gWs = new a("Click", 1, 2);
      gWt = new a[] { gWr, gWs };
      GMTrace.o(1386737565696L, 10332);
    }
    
    private a(int paramInt)
    {
      GMTrace.i(1386603347968L, 10331);
      this.value = 0;
      this.value = paramInt;
      GMTrace.o(1386603347968L, 10331);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\modelstat\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */