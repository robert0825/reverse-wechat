package com.tencent.mm.au;

import android.content.Context;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.chatroom.c.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.au;
import java.util.LinkedList;
import java.util.Map;

public final class c
  extends a
{
  public String eEU;
  public String gOY;
  public LinkedList<String> gOZ;
  public int gPb;
  public LinkedList<String> gPc;
  public LinkedList<String> gPd;
  public String gPe;
  public String gPf;
  public String gPg;
  public String text;
  
  public c(Map<String, String> paramMap, au paramau)
  {
    super(paramMap, paramau);
    GMTrace.i(315277443072L, 2349);
    this.gOZ = new LinkedList();
    this.gPc = new LinkedList();
    this.gPd = new LinkedList();
    this.gPe = null;
    this.gPf = null;
    this.gPg = null;
    this.text = null;
    GMTrace.o(315277443072L, 2349);
  }
  
  protected final boolean Kb()
  {
    int i = 0;
    GMTrace.i(315411660800L, 2350);
    if (this.values == null)
    {
      w.e("MicroMsg.ChatroomAccessVerifyApplicationNewXmlMsg", "[parseXml] values == null ");
      GMTrace.o(315411660800L, 2350);
      return false;
    }
    w.i("MicroMsg.ChatroomAccessVerifyApplicationNewXmlMsg", "[parseXml] type:%s, values size:%s", new Object[] { bg.nl(this.TYPE), Integer.valueOf(this.values.size()) });
    if ((!bg.nm(this.TYPE)) && (this.TYPE.equalsIgnoreCase("NewXmlChatRoomAccessVerifyApplication")))
    {
      this.gOY = ((String)this.values.get(".sysmsg.NewXmlChatRoomAccessVerifyApplication.RoomName"));
      if (this.values.containsKey(".sysmsg.NewXmlChatRoomAccessVerifyApplication.link.text")) {
        this.gPg = bg.nl((String)this.values.get(".sysmsg.NewXmlChatRoomAccessVerifyApplication.link.text"));
      }
      if (this.values.containsKey(".sysmsg.NewXmlChatRoomAccessVerifyApplication.link.inviterusername")) {
        this.gPe = bg.nl((String)this.values.get(".sysmsg.NewXmlChatRoomAccessVerifyApplication.link.inviterusername"));
      }
      if (this.values.containsKey(".sysmsg.NewXmlChatRoomAccessVerifyApplication.link.invitationreason")) {
        this.gPf = bg.nl((String)this.values.get(".sysmsg.NewXmlChatRoomAccessVerifyApplication.link.invitationreason"));
      }
      if (this.values.containsKey(gOQ)) {
        this.text = bg.nl((String)this.values.get(gOQ));
      }
      if (this.values.containsKey(".sysmsg.NewXmlChatRoomAccessVerifyApplication.link.ticket")) {
        this.eEU = ((String)this.values.get(".sysmsg.NewXmlChatRoomAccessVerifyApplication.link.ticket"));
      }
      if (this.values.containsKey(".sysmsg.NewXmlChatRoomAccessVerifyApplication.link.memberlist.memberlistsize")) {
        this.gPb = bg.getInt((String)this.values.get(".sysmsg.NewXmlChatRoomAccessVerifyApplication.link.memberlist.memberlistsize"), 0);
      }
      if (!this.eRz.bTV())
      {
        this.gOV.add(Integer.valueOf(this.text.length()));
        this.gOU.add(this.gPg);
        this.gOS = (this.text + this.gPg);
        this.gOW.add(Integer.valueOf(this.gOS.length()));
        if (i >= this.gPb) {
          break label773;
        }
        if (i != 0) {
          break label638;
        }
        this.gOZ.add(bg.nl((String)this.values.get(".sysmsg.NewXmlChatRoomAccessVerifyApplication.link.memberlist.member.username")));
        this.gPc.add(bg.nl((String)this.values.get(".sysmsg.NewXmlChatRoomAccessVerifyApplication.link.memberlist.member.nickname")));
        this.gPd.add(bg.nl((String)this.values.get(".sysmsg.NewXmlChatRoomAccessVerifyApplication.link.memberlist.member.headimgurl")));
      }
      for (;;)
      {
        i += 1;
        break;
        this.gOU.clear();
        this.gOV.clear();
        this.gOW.clear();
        this.gOS = (this.text + " ");
        this.gOV.add(Integer.valueOf(this.gOS.length()));
        this.gOU.add(ab.getContext().getString(c.a.dCI));
        this.gOS += ab.getContext().getString(c.a.dCI);
        this.gOW.add(Integer.valueOf(this.gOS.length()));
        break;
        label638:
        this.gOZ.add(bg.nl((String)this.values.get(".sysmsg.NewXmlChatRoomAccessVerifyApplication.link.memberlist.member" + i + ".username")));
        this.gPc.add(bg.nl((String)this.values.get(".sysmsg.NewXmlChatRoomAccessVerifyApplication.link.memberlist.member" + i + ".nickname")));
        this.gPd.add(bg.nl((String)this.values.get(".sysmsg.NewXmlChatRoomAccessVerifyApplication.link.memberlist.member" + i + ".headimgurl")));
      }
      label773:
      GMTrace.o(315411660800L, 2350);
      return true;
    }
    w.e("MicroMsg.ChatroomAccessVerifyApplicationNewXmlMsg", "[parseXml] type err :%s", new Object[] { bg.nl(this.TYPE) });
    GMTrace.o(315411660800L, 2350);
    return false;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\au\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */