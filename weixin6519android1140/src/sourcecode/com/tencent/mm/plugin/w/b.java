package com.tencent.mm.plugin.w;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.d;
import java.util.Map;

public final class b
{
  public static int nlo;
  public static int nlp;
  public static int nlq;
  public static int nlr;
  public static int nls;
  public static int nlt;
  public static int nlu;
  
  static
  {
    GMTrace.i(14714557956096L, 109632);
    nlo = 0;
    nlp = 1644429312;
    nlq = 302122240;
    nlr = 50;
    nls = 20;
    nlt = 100;
    nlu = 3;
    GMTrace.o(14714557956096L, 109632);
  }
  
  public static void aQK()
  {
    GMTrace.i(14714423738368L, 109631);
    Object localObject = com.tencent.mm.y.c.c.Ct().er("100224");
    if (((com.tencent.mm.storage.c)localObject).isValid())
    {
      localObject = ((com.tencent.mm.storage.c)localObject).bSg();
      nlo = bg.getInt((String)((Map)localObject).get("SyncOpen"), 0);
      nlp = bg.getInt((String)((Map)localObject).get("WindowsVersion"), 1644429312);
      nlq = bg.getInt((String)((Map)localObject).get("MacVersion"), 302122240);
      nlr = bg.getInt((String)((Map)localObject).get("MsgSyncSessionCount"), 50);
      nls = bg.getInt((String)((Map)localObject).get("MsgSyncMsgCount"), 20);
      nlt = bg.getInt((String)((Map)localObject).get("MsgSyncSessionListCount"), 100);
      nlu = bg.getInt((String)((Map)localObject).get("MsgSyncTimeLimit"), 3);
    }
    w.i("MicroMsg.MsgSynchronizeConstants", "initMsgSynchronizeAbtest, SYNC_CLOSE:%d, WINDOWS_VERSION:%d, MAC_VERSION:%d, SESSION_COUNT:%d, MSG_COUNT%d, MSG_LIST_COUNT:%d, TIME_LIMIT:%d", new Object[] { Integer.valueOf(nlo), Integer.valueOf(nlp), Integer.valueOf(nlq), Integer.valueOf(nlr), Integer.valueOf(nls), Integer.valueOf(nlt), Integer.valueOf(nlu) });
    GMTrace.o(14714423738368L, 109631);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\w\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */