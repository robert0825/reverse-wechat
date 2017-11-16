package com.tencent.mm.plugin.card.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.a.o;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.x.f.a;
import java.util.Map;

public final class h
{
  public int gjH;
  public String gjI;
  public String gjJ;
  public String gjK;
  public String gjL;
  public String gjM;
  public String gjN;
  public String gjO;
  public int ver;
  
  public h()
  {
    GMTrace.i(17256775942144L, 128573);
    GMTrace.o(17256775942144L, 128573);
  }
  
  public static h b(f.a parama)
  {
    GMTrace.i(17256910159872L, 128574);
    parama = parama.gle;
    h localh = new h();
    localh.gjI = bg.aq((String)parama.get(".msg.appmsg.giftcard_info.order_id"), "");
    localh.gjH = o.bj((String)parama.get(".msg.appmsg.giftcard_info.biz_uin"));
    localh.gjJ = bg.aq((String)parama.get(".msg.appmsg.giftcard_info.app_name"), "");
    localh.gjK = bg.aq((String)parama.get(".msg.appmsg.giftcard_info.recv_digest"), "");
    localh.gjL = bg.aq((String)parama.get(".msg.appmsg.giftcard_info.send_digest"), "");
    localh.gjM = bg.aq((String)parama.get(".msg.appmsg.giftcard_info.background_pic_url"), "");
    localh.gjN = bg.aq((String)parama.get(".msg.appmsg.giftcard_info.title_color"), "");
    localh.gjO = bg.aq((String)parama.get(".msg.appmsg.giftcard_info.des_color"), "");
    localh.ver = o.bj((String)parama.get(".msg.appmsg.giftcard_info.ver"));
    GMTrace.o(17256910159872L, 128574);
    return localh;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\card\a\h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */