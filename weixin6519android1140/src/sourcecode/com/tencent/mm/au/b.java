package com.tencent.mm.au;

import android.content.Context;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.chatroom.c.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.au;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;

public final class b
  extends a
{
  public String eEU;
  public String gOY;
  public LinkedList<String> gOZ;
  public String gPa;
  public String text;
  
  public b(Map<String, String> paramMap, au paramau)
  {
    super(paramMap, paramau);
    GMTrace.i(315814313984L, 2353);
    this.gOZ = new LinkedList();
    this.text = null;
    this.gPa = null;
    this.eEU = null;
    GMTrace.o(315814313984L, 2353);
  }
  
  protected final boolean Kb()
  {
    GMTrace.i(315948531712L, 2354);
    if (this.values == null)
    {
      w.e("MicroMsg.ChatroomAccessVerifyApprovalNewXmlMsg", "[parseXml] values == null ");
      GMTrace.o(315948531712L, 2354);
      return false;
    }
    w.i("MicroMsg.ChatroomAccessVerifyApprovalNewXmlMsg", "[parseXml] type:%s, values size:%s", new Object[] { bg.nl(this.TYPE), Integer.valueOf(this.values.size()) });
    if ((!bg.nm(this.TYPE)) && (this.TYPE.equalsIgnoreCase("NewXmlChatRoomAccessVerifyApproval")))
    {
      this.gOY = ((String)this.values.get(".sysmsg.NewXmlChatRoomAccessVerifyApproval.RoomName"));
      if (this.values.containsKey(gOQ)) {
        this.text = bg.nl((String)this.values.get(gOQ));
      }
      if (this.values.containsKey(".sysmsg.NewXmlChatRoomAccessVerifyApproval.link.text")) {
        this.gPa = bg.nl((String)this.values.get(".sysmsg.NewXmlChatRoomAccessVerifyApproval.link.text"));
      }
      if (this.values.containsKey(".sysmsg.NewXmlChatRoomAccessVerifyApproval.link.ticket")) {
        this.eEU = bg.nl((String)this.values.get(".sysmsg.NewXmlChatRoomAccessVerifyApproval.link.ticket"));
      }
      this.gOS = this.text;
      if (!this.eRz.bTV())
      {
        this.gOU.add(this.gPa);
        this.gOV.add(Integer.valueOf(this.gOS.length()));
        this.gOS += this.gPa;
        this.gOW.add(Integer.valueOf(this.gOS.length()));
      }
      for (;;)
      {
        Iterator localIterator = this.values.keySet().iterator();
        while (localIterator.hasNext())
        {
          String str = (String)localIterator.next();
          if (str.startsWith(".sysmsg.NewXmlChatRoomAccessVerifyApproval.link.memberlist.username")) {
            this.gOZ.add(this.values.get(str));
          }
        }
        this.gOS = (this.gOS + " " + ab.getContext().getString(c.a.jME));
      }
      GMTrace.o(315948531712L, 2354);
      return true;
    }
    w.e("MicroMsg.ChatroomAccessVerifyApprovalNewXmlMsg", "[parseXml] type err :%s", new Object[] { bg.nl(this.TYPE) });
    GMTrace.o(315948531712L, 2354);
    return false;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\au\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */