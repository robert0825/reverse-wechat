package com.tencent.mm.plugin.subapp.c;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.a.f;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.bh;
import com.tencent.mm.sdk.platformtools.w;
import java.util.Map;

public final class e
{
  private static final f<Integer, e> gli;
  public String eAE;
  public int giv;
  public String giw;
  public int qsm;
  public int qsn;
  public String qso;
  public int qsp;
  public int qsq;
  public int qsr;
  public int qss;
  
  static
  {
    GMTrace.i(5843437223936L, 43537);
    gli = new f(100);
    GMTrace.o(5843437223936L, 43537);
  }
  
  public e()
  {
    GMTrace.i(5843168788480L, 43535);
    GMTrace.o(5843168788480L, 43535);
  }
  
  public static e Jw(String paramString)
  {
    GMTrace.i(5843303006208L, 43536);
    if (bg.nm(paramString))
    {
      GMTrace.o(5843303006208L, 43536);
      return null;
    }
    int i = paramString.indexOf('<');
    Object localObject = paramString;
    if (i > 0) {
      localObject = paramString.substring(i);
    }
    i = ((String)localObject).hashCode();
    paramString = (e)gli.get(Integer.valueOf(i));
    if (paramString != null)
    {
      GMTrace.o(5843303006208L, 43536);
      return paramString;
    }
    paramString = bh.q((String)localObject, "msg");
    if (paramString == null)
    {
      w.e("MicroMsg.VoiceRemindAppMsgExInfo", "parse msg failed");
      GMTrace.o(5843303006208L, 43536);
      return null;
    }
    try
    {
      localObject = new e();
      ((e)localObject).giv = bg.getInt((String)paramString.get(".msg.appmsg.appattach.totallen"), 0);
      ((e)localObject).eAE = ((String)paramString.get(".msg.appmsg.appattach.attachid"));
      ((e)localObject).giw = ((String)paramString.get(".msg.appmsg.appattach.fileext"));
      ((e)localObject).qsm = bg.getInt((String)paramString.get(".msg.appmsg.voicecmd.reminder.$remindtime"), 0);
      ((e)localObject).qsn = bg.getInt((String)paramString.get(".msg.appmsg.voicecmd.reminder.$remindid"), 0);
      ((e)localObject).qso = ((String)paramString.get(".msg.appmsg.voicecmd.reminder.$remindattachid"));
      ((e)localObject).qsp = bg.getInt((String)paramString.get(".msg.appmsg.voicecmd.reminder.$remindattachtotallen"), 0);
      ((e)localObject).qsq = bg.getInt((String)paramString.get(".msg.appmsg.voicecmd.reminder.$remindformat"), 0);
      ((e)localObject).qsr = bg.getInt((String)paramString.get(".msg.appmsg.voicecmd.reminder.$originformat"), 0);
      ((e)localObject).qss = bg.getInt((String)paramString.get(".msg.appmsg.voicecmd.reminder.$msgsvrid"), 0);
      gli.m(Integer.valueOf(i), localObject);
      GMTrace.o(5843303006208L, 43536);
      return (e)localObject;
    }
    catch (Exception paramString)
    {
      w.e("MicroMsg.VoiceRemindAppMsgExInfo", "parse amessage xml failed");
      w.printErrStackTrace("MicroMsg.VoiceRemindAppMsgExInfo", paramString, "", new Object[0]);
      GMTrace.o(5843303006208L, 43536);
    }
    return null;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\subapp\c\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */