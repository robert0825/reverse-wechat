package com.tencent.mm.ui.friend;

import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.b.af;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.ar;
import com.tencent.mm.storage.x;
import com.tencent.mm.y.at;
import com.tencent.mm.y.c;
import com.tencent.mm.y.s;
import java.util.LinkedList;

public final class a
  implements View.OnClickListener
{
  private Context context;
  public a xbm;
  
  public a(Context paramContext, a parama)
  {
    GMTrace.i(2821256642560L, 21020);
    this.context = paramContext;
    this.xbm = parama;
    GMTrace.o(2821256642560L, 21020);
  }
  
  public static void Y(x paramx)
  {
    GMTrace.i(16019154272256L, 119352);
    x localx = paramx;
    if ((int)paramx.fTq == 0)
    {
      at.AR();
      c.yK().S(paramx);
      if (bg.nm(paramx.field_username))
      {
        GMTrace.o(16019154272256L, 119352);
        return;
      }
      at.AR();
      localx = c.yK().TE(paramx.field_username);
    }
    if ((int)localx.fTq <= 0)
    {
      w.e("MicroMsg.AddContactListener", "addContact : insert contact failed");
      GMTrace.o(16019154272256L, 119352);
      return;
    }
    s.p(localx);
    GMTrace.o(16019154272256L, 119352);
  }
  
  public final void onClick(final View paramView)
  {
    GMTrace.i(2821390860288L, 21021);
    final Object localObject = (b)paramView.getTag();
    paramView = ((b)localObject).username;
    int i = ((b)localObject).nLz;
    final int j = ((b)localObject).position;
    at.AR();
    localObject = c.yK().TE(paramView);
    if (bg.nm(((af)localObject).field_username)) {
      ((x)localObject).setUsername(paramView);
    }
    localObject = new com.tencent.mm.pluginsdk.ui.applet.a(this.context, new com.tencent.mm.pluginsdk.ui.applet.a.a()
    {
      public final void a(boolean paramAnonymousBoolean1, boolean paramAnonymousBoolean2, String paramAnonymousString1, String paramAnonymousString2)
      {
        GMTrace.i(2805284732928L, 20901);
        if (paramAnonymousBoolean1)
        {
          a.Y(localObject);
          a.this.xbm.WL(paramView);
          GMTrace.o(2805284732928L, 20901);
          return;
        }
        a.this.xbm.bh(paramView, paramAnonymousBoolean2);
        GMTrace.o(2805284732928L, 20901);
      }
    });
    LinkedList localLinkedList = new LinkedList();
    localLinkedList.add(Integer.valueOf(i));
    ((com.tencent.mm.pluginsdk.ui.applet.a)localObject).c(paramView, localLinkedList);
    GMTrace.o(2821390860288L, 21021);
  }
  
  public static abstract interface a
  {
    public abstract void WL(String paramString);
    
    public abstract void bh(String paramString, boolean paramBoolean);
  }
  
  public static final class b
  {
    public int nLz;
    public int position;
    public String username;
    
    public b()
    {
      GMTrace.i(2804479426560L, 20895);
      GMTrace.o(2804479426560L, 20895);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\friend\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */