package com.tencent.mm.plugin.chatroom;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.bu.g.d;
import com.tencent.mm.g.a.jp;
import com.tencent.mm.g.a.jq;
import com.tencent.mm.g.a.jr;
import com.tencent.mm.g.a.js;
import com.tencent.mm.g.a.jw;
import com.tencent.mm.g.a.qu;
import com.tencent.mm.kernel.h;
import com.tencent.mm.y.aq;
import com.tencent.mm.y.at;
import com.tencent.mm.y.br;
import com.tencent.mm.y.bt;
import java.util.HashMap;

public class d
  implements aq
{
  private static com.tencent.mm.plugin.chatroom.c.a jML;
  public com.tencent.mm.pluginsdk.e.c<jp> jMF;
  public com.tencent.mm.pluginsdk.e.c<js> jMG;
  public com.tencent.mm.pluginsdk.e.c<jr> jMH;
  public com.tencent.mm.pluginsdk.e.c<jw> jMI;
  public com.tencent.mm.pluginsdk.e.c<jq> jMJ;
  private com.tencent.mm.sdk.b.c jMK;
  
  public d()
  {
    GMTrace.i(9168949870592L, 68314);
    this.jMF = new com.tencent.mm.pluginsdk.e.c()
    {
      public final int ann()
      {
        GMTrace.i(9059025551360L, 67495);
        GMTrace.o(9059025551360L, 67495);
        return 181;
      }
    };
    this.jMG = new com.tencent.mm.pluginsdk.e.c()
    {
      public final int ann()
      {
        GMTrace.i(9058354462720L, 67490);
        GMTrace.o(9058354462720L, 67490);
        return 551;
      }
    };
    this.jMH = new com.tencent.mm.pluginsdk.e.c()
    {
      public final int ann()
      {
        GMTrace.i(9171500007424L, 68333);
        GMTrace.o(9171500007424L, 68333);
        return 179;
      }
    };
    this.jMI = new com.tencent.mm.pluginsdk.e.c()
    {
      public final int ann()
      {
        GMTrace.i(9068555010048L, 67566);
        GMTrace.o(9068555010048L, 67566);
        return 700;
      }
    };
    this.jMJ = new com.tencent.mm.pluginsdk.e.c()
    {
      public final int ann()
      {
        GMTrace.i(9168010346496L, 68307);
        GMTrace.o(9168010346496L, 68307);
        return 119;
      }
    };
    this.jMK = new com.tencent.mm.sdk.b.c() {};
    GMTrace.o(9168949870592L, 68314);
  }
  
  private static d anl()
  {
    GMTrace.i(9169084088320L, 68315);
    d locald2 = (d)at.AK().gZ("plugin.chatroom");
    d locald1 = locald2;
    if (locald2 == null)
    {
      locald1 = locald2;
      if (locald2 != null) {}
    }
    try
    {
      locald1 = new d();
      at.AK().a("plugin.chatroom", locald1);
      GMTrace.o(9169084088320L, 68315);
      return locald1;
    }
    finally {}
  }
  
  private static com.tencent.mm.plugin.chatroom.c.a anm()
  {
    GMTrace.i(9169218306048L, 68316);
    h.xw().wG();
    anl();
    if (jML == null)
    {
      anl();
      jML = new com.tencent.mm.plugin.chatroom.c.a();
    }
    anl();
    com.tencent.mm.plugin.chatroom.c.a locala = jML;
    GMTrace.o(9169218306048L, 68316);
    return locala;
  }
  
  public final void aX(boolean paramBoolean)
  {
    GMTrace.i(9169620959232L, 68319);
    com.tencent.mm.sdk.b.a.vgX.b(this.jMK);
    com.tencent.mm.sdk.b.a.vgX.b(this.jMF);
    com.tencent.mm.sdk.b.a.vgX.b(this.jMJ);
    com.tencent.mm.sdk.b.a.vgX.b(this.jMG);
    com.tencent.mm.sdk.b.a.vgX.b(this.jMH);
    com.tencent.mm.sdk.b.a.vgX.b(this.jMI);
    com.tencent.mm.plugin.chatroom.c.a locala = anm();
    at.getSysCmdMsgExtension().a("NewXmlChatRoomAccessVerifyApplication", locala.jMW, true);
    at.getSysCmdMsgExtension().a("NewXmlChatRoomAccessVerifyApproval", locala.jMW, true);
    GMTrace.o(9169620959232L, 68319);
  }
  
  public final void aY(boolean paramBoolean)
  {
    GMTrace.i(9169755176960L, 68320);
    GMTrace.o(9169755176960L, 68320);
  }
  
  public final void eI(int paramInt)
  {
    GMTrace.i(9169486741504L, 68318);
    GMTrace.o(9169486741504L, 68318);
  }
  
  public final void onAccountRelease()
  {
    GMTrace.i(9169889394688L, 68321);
    com.tencent.mm.sdk.b.a.vgX.c(this.jMK);
    com.tencent.mm.sdk.b.a.vgX.c(this.jMF);
    com.tencent.mm.sdk.b.a.vgX.c(this.jMJ);
    com.tencent.mm.sdk.b.a.vgX.c(this.jMG);
    com.tencent.mm.sdk.b.a.vgX.c(this.jMH);
    com.tencent.mm.sdk.b.a.vgX.c(this.jMI);
    com.tencent.mm.plugin.chatroom.c.a locala = anm();
    at.getSysCmdMsgExtension().b("NewXmlChatRoomAccessVerifyApplication", locala.jMW, true);
    at.getSysCmdMsgExtension().b("NewXmlChatRoomAccessVerifyApproval", locala.jMW, true);
    GMTrace.o(9169889394688L, 68321);
  }
  
  public final HashMap<Integer, g.d> vH()
  {
    GMTrace.i(9169352523776L, 68317);
    GMTrace.o(9169352523776L, 68317);
    return null;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\chatroom\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */