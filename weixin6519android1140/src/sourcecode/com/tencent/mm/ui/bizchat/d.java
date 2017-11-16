package com.tencent.mm.ui.bizchat;

import android.app.Activity;
import android.content.res.Resources;
import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.l;
import com.tencent.mm.af.a.b;
import com.tencent.mm.af.a.c;
import com.tencent.mm.af.a.j;
import com.tencent.mm.af.a.k;
import com.tencent.mm.af.x;
import com.tencent.mm.sdk.e.m;
import com.tencent.mm.sdk.e.m.b;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.contact.MMBaseSelectContactUI;
import com.tencent.mm.ui.contact.a.g;
import com.tencent.mm.ui.contact.l;
import com.tencent.mm.ui.contact.n;
import com.tencent.mm.ui.contact.o;

public final class d
  extends o
  implements m.b
{
  private Cursor hqX;
  private String juZ;
  private int ooT;
  
  public d(MMBaseSelectContactUI paramMMBaseSelectContactUI, String paramString)
  {
    super(paramMMBaseSelectContactUI, null, false, false);
    GMTrace.i(2996410777600L, 22325);
    w.i("MicroMsg.RecentConversationAdapter", "create!");
    this.juZ = paramString;
    ayE();
    GMTrace.o(2996410777600L, 22325);
  }
  
  private void ayE()
  {
    GMTrace.i(2996544995328L, 22326);
    w.i("MicroMsg.RecentConversationAdapter", "resetData");
    if (this.hqX != null)
    {
      this.hqX.close();
      this.hqX = null;
    }
    this.hqX = x.FJ().jb(this.juZ);
    this.ooT = 0;
    GMTrace.o(2996544995328L, 22326);
  }
  
  public final void a(int paramInt, m paramm, Object paramObject)
  {
    GMTrace.i(2997081866240L, 22330);
    ayE();
    notifyDataSetChanged();
    GMTrace.o(2997081866240L, 22330);
  }
  
  public final void finish()
  {
    GMTrace.i(2996947648512L, 22329);
    super.finish();
    w.i("MicroMsg.RecentConversationAdapter", "finish!");
    if (this.hqX != null)
    {
      this.hqX.close();
      this.hqX = null;
    }
    GMTrace.o(2996947648512L, 22329);
  }
  
  public final int getCount()
  {
    GMTrace.i(2996679213056L, 22327);
    int i = this.hqX.getCount();
    GMTrace.o(2996679213056L, 22327);
    return i + 1;
  }
  
  protected final com.tencent.mm.ui.contact.a.a hG(int paramInt)
  {
    GMTrace.i(2996813430784L, 22328);
    Object localObject = null;
    if (paramInt == this.ooT)
    {
      localObject = new g(paramInt);
      ((g)localObject).lAh = this.wSB.getActivity().getResources().getString(R.l.dWQ);
    }
    for (;;)
    {
      GMTrace.o(2996813430784L, 22328);
      return (com.tencent.mm.ui.contact.a.a)localObject;
      if ((paramInt > this.ooT) && (this.hqX.moveToPosition(paramInt - this.ooT - 1)))
      {
        a locala = new a(paramInt);
        com.tencent.mm.af.a.a locala1 = new com.tencent.mm.af.a.a();
        locala1.b(this.hqX);
        localObject = locala;
        if (locala.juT == -1L)
        {
          locala.juT = locala1.field_bizChatId;
          localObject = x.FI().t(locala1.field_bizChatId);
          if (((c)localObject).FU())
          {
            locala.hqB = ((c)localObject).field_chatName;
            locala.woF = ((c)localObject).field_headImageUrl;
            locala.username = ((c)localObject).field_brandUserName;
          }
          for (;;)
          {
            if (bg.L(locala.hqB)) {
              locala.hqB = this.wSB.getActivity().getResources().getString(R.l.dTd);
            }
            localObject = locala;
            if (!bg.nm(locala.username)) {
              break;
            }
            locala.username = locala1.field_brandUserName;
            localObject = locala;
            break;
            localObject = x.FK().bl(((c)localObject).field_bizChatServId);
            if (localObject != null)
            {
              locala.hqB = ((j)localObject).field_userName;
              locala.woF = ((j)localObject).field_headImageUrl;
              locala.username = ((j)localObject).field_brandUserName;
            }
          }
        }
      }
      else
      {
        w.e("MicroMsg.RecentConversationAdapter", "create Data Item Error position=%d", new Object[] { Integer.valueOf(paramInt) });
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\bizchat\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */