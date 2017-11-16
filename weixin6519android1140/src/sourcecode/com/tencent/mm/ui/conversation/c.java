package com.tencent.mm.ui.conversation;

import android.app.Activity;
import android.os.Build.VERSION;
import android.widget.ListView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.a.bb;
import com.tencent.mm.g.a.jc;
import com.tencent.mm.g.a.mr;
import com.tencent.mm.g.b.af;
import com.tencent.mm.g.b.aj;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.c;
import com.tencent.mm.sdk.platformtools.az;
import com.tencent.mm.sdk.platformtools.ba;
import com.tencent.mm.storage.ar;
import com.tencent.mm.ui.HomeUI;
import com.tencent.mm.ui.LauncherUI;
import com.tencent.mm.y.at;
import com.tencent.mm.y.s;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

public final class c
{
  public Activity activity;
  public ListView wVF;
  HashMap<String, Integer> wWj;
  int wWk;
  public int wWl;
  public g wWm;
  com.tencent.mm.sdk.b.c wWn;
  com.tencent.mm.sdk.b.c wWo;
  com.tencent.mm.sdk.b.c wWp;
  
  public c()
  {
    GMTrace.i(14515781500928L, 108151);
    this.wWj = new HashMap();
    this.wWk = -1;
    this.wWl = -1;
    this.wWn = new com.tencent.mm.sdk.b.c() {};
    this.wWo = new com.tencent.mm.sdk.b.c() {};
    this.wWp = new com.tencent.mm.sdk.b.c()
    {
      private final long INTERVAL;
      public long wWs;
      public int wWt;
    };
    GMTrace.o(14515781500928L, 108151);
  }
  
  final com.tencent.mm.storage.ae WD(String paramString)
  {
    GMTrace.i(14516184154112L, 108154);
    if (this.wWm != null)
    {
      paramString = (com.tencent.mm.storage.ae)this.wWm.bM(paramString);
      GMTrace.o(14516184154112L, 108154);
      return paramString;
    }
    GMTrace.o(14516184154112L, 108154);
    return null;
  }
  
  public final void Z(Activity paramActivity)
  {
    GMTrace.i(14515915718656L, 108152);
    this.wWl = ((LauncherUI)paramActivity).vJi.vIy.bXX();
    GMTrace.o(14515915718656L, 108152);
  }
  
  public final void cgT()
  {
    GMTrace.i(14516049936384L, 108153);
    if (this.activity == null)
    {
      GMTrace.o(14516049936384L, 108153);
      return;
    }
    long l = System.currentTimeMillis();
    Object localObject1 = (LauncherUI)this.activity;
    com.tencent.mm.sdk.platformtools.w.i("MicroMsg.ConvUnreadHelper", "unreadcheck postSetLauncherUIUnReadCount  resetStatus %d", new Object[] { Integer.valueOf(this.wWk) });
    switch (this.wWk)
    {
    default: 
      this.wWl = ((LauncherUI)localObject1).vJi.vIy.bXX();
      com.tencent.mm.sdk.platformtools.w.i("MicroMsg.ConvUnreadHelper", "unreadcheck postSetLauncherUIUnReadCount UNREAD_RESET_ALL totalUnReadCount %d, usetime %d,", new Object[] { Integer.valueOf(this.wWl), Long.valueOf(System.currentTimeMillis() - l) });
      GMTrace.o(14516049936384L, 108153);
      return;
    case 2: 
      Iterator localIterator = this.wWj.entrySet().iterator();
      int i = 0;
      while (localIterator.hasNext())
      {
        Object localObject2 = (Map.Entry)localIterator.next();
        String str = (String)((Map.Entry)localObject2).getKey();
        j = ((Integer)((Map.Entry)localObject2).getValue()).intValue();
        com.tencent.mm.sdk.platformtools.w.i("MicroMsg.ConvUnreadHelper", "unreadcheck postSetLauncherUIUnReadCount  username %s, preunread %d", new Object[] { str, Integer.valueOf(j) });
        localObject2 = WD(str);
        if ((localObject2 == null) || (com.tencent.mm.ui.ae.bYn().contains(str)))
        {
          j = 0 - j;
          com.tencent.mm.sdk.platformtools.w.i("MicroMsg.ConvUnreadHelper", "unreadcheck postSetLauncherUIUnReadCount  cov == null username %s, change %d", new Object[] { str, Integer.valueOf(j) });
          label280:
          if ((j != 0) && (this.wWm.WE(str)))
          {
            com.tencent.mm.sdk.platformtools.w.i("MicroMsg.ConvUnreadHelper", "unreadcheck postSetLauncherUIUnReadCount  username %s isWithoutItemCache", new Object[] { str });
            at.AR();
            localObject2 = com.tencent.mm.y.c.yK().TE(str);
            if (localObject2 == null) {
              continue;
            }
            if (!s.eb(str)) {
              break label422;
            }
            if (((af)localObject2).fji == 0) {
              continue;
            }
          }
        }
        for (;;)
        {
          i += j;
          com.tencent.mm.sdk.platformtools.w.i("MicroMsg.ConvUnreadHelper", "unreadcheck postSetLauncherUIUnReadCount  real change usename %s, change %d, totalchange %d", new Object[] { str, Integer.valueOf(j), Integer.valueOf(i) });
          break;
          j = ((aj)localObject2).field_unReadCount - j + 0;
          com.tencent.mm.sdk.platformtools.w.i("MicroMsg.ConvUnreadHelper", "unreadcheck postSetLauncherUIUnReadCount  cov != null username %s, change %d", new Object[] { str, Integer.valueOf(j) });
          break label280;
          label422:
          if (((com.tencent.mm.storage.x)localObject2).vc()) {
            break;
          }
        }
      }
      this.wWl += i;
      localObject1 = ((LauncherUI)localObject1).vJi.vIy;
      int j = this.wWl;
      ((com.tencent.mm.ui.w)localObject1).vMO.Bl(j);
      com.tencent.mm.sdk.platformtools.w.i("MicroMsg.ConvUnreadHelper", "unreadcheck postSetLauncherUIUnReadCount UNREAD_RESET_PART totalUnReadCount %d, change %d, usetime %d,", new Object[] { Integer.valueOf(this.wWl), Integer.valueOf(i), Long.valueOf(System.currentTimeMillis() - l) });
      GMTrace.o(14516049936384L, 108153);
      return;
    }
    GMTrace.o(14516049936384L, 108153);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\conversation\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */