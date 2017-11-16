package com.tencent.mm.y;

import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.af.d;
import com.tencent.mm.af.f;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.ae;
import com.tencent.mm.storage.ar;
import com.tencent.mm.storage.as;
import com.tencent.mm.storage.au;
import com.tencent.mm.storage.x;
import junit.framework.Assert;

public final class i
{
  public static int a(String paramString, final long paramLong, bc.a parama)
  {
    GMTrace.i(649748021248L, 4841);
    w.d("MicroMsg.BizConversationLogic", "deleteMsgByBizChatId %s", new Object[] { Long.valueOf(paramLong) });
    com.tencent.mm.kernel.h.xB().A(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(641023868928L, 4776);
        Cursor localCursor = ((com.tencent.mm.af.o)com.tencent.mm.kernel.h.h(com.tencent.mm.af.o.class)).yN().ai(this.fTa, paramLong);
        if (localCursor.moveToFirst()) {
          while ((!localCursor.isAfterLast()) && ((this.gmq == null) || (!this.gmq.Bl())))
          {
            au localau = new au();
            localau.b(localCursor);
            bc.j(localau);
            localCursor.moveToNext();
          }
        }
        localCursor.close();
        ((com.tencent.mm.af.o)com.tencent.mm.kernel.h.h(com.tencent.mm.af.o.class)).yN().ah(this.fTa, paramLong);
        com.tencent.mm.sdk.platformtools.af.t(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(614985629696L, 4582);
            if (i.1.this.gmq != null) {
              i.1.this.gmq.Bk();
            }
            GMTrace.o(614985629696L, 4582);
          }
        });
        GMTrace.o(641023868928L, 4776);
      }
      
      public final String toString()
      {
        GMTrace.i(641158086656L, 4777);
        String str = super.toString() + "|deleteMsgByTalker";
        GMTrace.o(641158086656L, 4777);
        return str;
      }
    });
    GMTrace.o(649748021248L, 4841);
    return 0;
  }
  
  public static void eY(String paramString)
  {
    GMTrace.i(649613803520L, 4840);
    if (!bg.nm(paramString)) {}
    Object localObject;
    for (boolean bool = true;; bool = false)
    {
      Assert.assertTrue(bool);
      localObject = ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).yK().TE(paramString);
      if ((localObject != null) && (!bg.nm(((com.tencent.mm.g.b.af)localObject).field_username))) {
        break;
      }
      GMTrace.o(649613803520L, 4840);
      return;
    }
    ((x)localObject).setType(((com.tencent.mm.g.b.af)localObject).field_type | 0x800);
    s.t((x)localObject);
    if ((((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).yP().TO(paramString) == null) && (((x)localObject).bSA()))
    {
      if (!f.iM(paramString)) {
        break label273;
      }
      if (((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).yP().TO("officialaccounts") == null)
      {
        localObject = new ae("officialaccounts");
        ((ae)localObject).bSW();
        ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).yP().d((ae)localObject);
      }
      localObject = new ae(paramString);
      ((ae)localObject).x(System.currentTimeMillis());
      ((ae)localObject).cQ("officialaccounts");
      ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).yP().d((ae)localObject);
    }
    for (;;)
    {
      w.i("MicroMsg.BizConversationLogic", "setPlacedTop username = " + paramString);
      ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).yP().TT(paramString);
      GMTrace.o(649613803520L, 4840);
      return;
      label273:
      if ((f.iO(paramString)) && (!f.dL(paramString)))
      {
        localObject = f.iK(paramString);
        if (((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).yP().TO(((d)localObject).field_enterpriseFather) == null)
        {
          localae = new ae(((d)localObject).field_enterpriseFather);
          localae.bSW();
          ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).yP().d(localae);
        }
        ae localae = new ae(paramString);
        localae.x(System.currentTimeMillis());
        localae.cQ(((d)localObject).EN());
        ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).yP().d(localae);
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\y\i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */