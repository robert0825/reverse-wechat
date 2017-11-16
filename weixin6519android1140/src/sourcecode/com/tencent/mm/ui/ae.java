package com.tencent.mm.ui;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import com.tencent.mm.storage.w.a;
import com.tencent.mm.y.at;
import com.tencent.mm.y.c;
import com.tencent.mm.y.q;
import java.util.ArrayList;
import java.util.List;

public final class ae
{
  public static List<String> bYn()
  {
    GMTrace.i(2940576202752L, 21909);
    int i = q.zI();
    ArrayList localArrayList = new ArrayList();
    if ((i & 0x8000) == 0)
    {
      localArrayList.add("floatbottle");
      w.d("MicroMsg.LauncherUI", "add bottle into show unread count blacklist.");
    }
    at.AR();
    if (!c.xh().getBoolean(w.a.vve, true))
    {
      localArrayList.add("notifymessage");
      w.d("MicroMsg.UnreadCountHelper", "add service notify message into show unread count blacklist.");
    }
    at.AR();
    if (!c.xh().getBoolean(w.a.vvf, true))
    {
      localArrayList.add("appbrandcustomerservicemsg");
      w.d("MicroMsg.UnreadCountHelper", "add wxa custom session notify message into show unread count blacklist.");
    }
    w.d("MicroMsg.LauncherUI", "getShowUnreadCountBlacklist unread count blacklist(size : %s).", new Object[] { Integer.valueOf(localArrayList.size()) });
    GMTrace.o(2940576202752L, 21909);
    return localArrayList;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\ae.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */