package com.tencent.mm.storage;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.messenger.foundation.a.a.c;
import com.tencent.mm.plugin.messenger.foundation.a.a.c.b;
import junit.framework.Assert;

public final class h
  extends e
{
  public static final String[] fTX;
  
  static
  {
    GMTrace.i(1579340005376L, 11767);
    fTX = new String[] { "CREATE TABLE IF NOT EXISTS appbrandmessage ( msgId INTEGER PRIMARY KEY, msgSvrId INTEGER , type INT, status INT, isSend INT, isShowTimer INTEGER, createTime INTEGER, talker TEXT, content TEXT, imgPath TEXT, reserved TEXT, lvbuffer BLOB, transContent TEXT, transBrandWording TEXT ) ", "CREATE INDEX IF NOT EXISTS  appbrandmessageSvrIdIndex ON appbrandmessage ( msgSvrId )", "CREATE INDEX IF NOT EXISTS  appbrandmessageTalkerIndex ON appbrandmessage ( talker )", "CREATE INDEX IF NOT EXISTS  appbrandmessageTalerStatusIndex ON appbrandmessage ( talker,status )", "CREATE INDEX IF NOT EXISTS  appbrandmessageCreateTimeIndex ON appbrandmessage ( createTime )", "CREATE INDEX IF NOT EXISTS  appbrandmessageCreateTaklerTimeIndex ON appbrandmessage ( talker,createTime )", "CREATE INDEX IF NOT EXISTS  appbrandmessageSendCreateTimeIndex ON appbrandmessage ( status,isSend,createTime )", "CREATE INDEX IF NOT EXISTS  appbrandmessageTalkerTypeIndex ON appbrandmessage ( talker,type )" };
    GMTrace.o(1579340005376L, 11767);
  }
  
  public h(c paramc)
  {
    super(paramc);
    GMTrace.i(1579071569920L, 11765);
    a(aOi(), "appbrandmessage");
    a(new c.b(256, "appbrandmessage", c.b.a(3000001L, 3500000L, 102000001L, 105000000L)));
    GMTrace.o(1579071569920L, 11765);
  }
  
  public final String Tg(String paramString)
  {
    GMTrace.i(1579205787648L, 11766);
    if ((paramString != null) && (paramString.length() > 0)) {}
    for (boolean bool = true;; bool = false)
    {
      Assert.assertTrue(bool);
      if (!x.eU(paramString)) {
        break;
      }
      GMTrace.o(1579205787648L, 11766);
      return "appbrandmessage";
    }
    GMTrace.o(1579205787648L, 11766);
    return null;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\storage\h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */