package com.tencent.mm.ui.friend;

import android.content.Context;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.l.a;
import com.tencent.mm.modelfriend.ad;
import com.tencent.mm.modelfriend.ae;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.ar;
import com.tencent.mm.storage.x;
import com.tencent.mm.ui.o;
import com.tencent.mm.y.at;
import com.tencent.mm.y.bq;
import com.tencent.mm.y.c;
import com.tencent.mm.y.s;

public abstract class d
  extends o<ad>
  implements com.tencent.mm.ac.d.a
{
  public d(Context paramContext, ad paramad)
  {
    super(paramContext, paramad);
    GMTrace.i(2787299557376L, 20767);
    GMTrace.o(2787299557376L, 20767);
  }
  
  public static void WM(String paramString)
  {
    GMTrace.i(2787702210560L, 20770);
    if (bg.nm(paramString))
    {
      w.w("MicroMsg.QQFriendAdapterBase", "deal add friend failed. username is null.");
      GMTrace.o(2787702210560L, 20770);
      return;
    }
    Object localObject = com.tencent.mm.modelfriend.af.Ik().jV(paramString);
    if (localObject != null)
    {
      ((ad)localObject).gDW = 2;
      com.tencent.mm.modelfriend.af.Ik().a(((ad)localObject).gDV, (ad)localObject);
    }
    at.AR();
    localObject = c.yK().TE(paramString);
    if (localObject == null)
    {
      w.w("MicroMsg.QQFriendAdapterBase", "[cpan] dealAddFriend failed. contact is null.");
      GMTrace.o(2787702210560L, 20770);
      return;
    }
    if (bg.nm(((com.tencent.mm.g.b.af)localObject).field_username)) {
      ((x)localObject).setUsername(paramString);
    }
    paramString = (String)localObject;
    if ((int)((a)localObject).fTq == 0)
    {
      at.AR();
      c.yK().S((x)localObject);
      if (bg.nm(((com.tencent.mm.g.b.af)localObject).field_username))
      {
        GMTrace.o(2787702210560L, 20770);
        return;
      }
      at.AR();
      paramString = c.yK().TE(((com.tencent.mm.g.b.af)localObject).field_username);
    }
    if ((int)paramString.fTq <= 0)
    {
      w.e("MicroMsg.QQFriendAdapterBase", "addContact : insert contact failed");
      GMTrace.o(2787702210560L, 20770);
      return;
    }
    s.p(paramString);
    bq.BG().c(26, new Object[0]);
    GMTrace.o(2787702210560L, 20770);
  }
  
  public void Au(String paramString)
  {
    GMTrace.i(2787567992832L, 20769);
    GMTrace.o(2787567992832L, 20769);
  }
  
  public void a(a parama)
  {
    GMTrace.i(2787433775104L, 20768);
    GMTrace.o(2787433775104L, 20768);
  }
  
  public static abstract interface a
  {
    public abstract void Bs(int paramInt);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\ui\friend\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */