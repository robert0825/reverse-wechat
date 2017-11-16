package com.tencent.mm.ui.conversation.a;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.pluginsdk.ui.b.b;
import com.tencent.mm.storage.t;
import com.tencent.mm.ui.account.FacebookFriendUI;
import com.tencent.mm.y.at;
import com.tencent.mm.y.c;
import java.lang.ref.WeakReference;

public final class h
  extends b
{
  public h(Context paramContext)
  {
    super(paramContext);
    GMTrace.i(14501957074944L, 108048);
    if (this.view != null) {
      this.view.findViewById(R.h.byg).setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(14494709317632L, 107994);
          at.AR();
          c.xh().set(65833, Integer.valueOf(0));
          ((Context)h.this.tyb.get()).startActivity(new Intent((Context)h.this.tyb.get(), FacebookFriendUI.class));
          h.this.view.setVisibility(8);
          GMTrace.o(14494709317632L, 107994);
        }
      });
    }
    GMTrace.o(14501957074944L, 108048);
  }
  
  public final void destroy()
  {
    GMTrace.i(14502225510400L, 108050);
    GMTrace.o(14502225510400L, 108050);
  }
  
  public final int getLayoutId()
  {
    GMTrace.i(14502091292672L, 108049);
    GMTrace.o(14502091292672L, 108049);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\conversation\a\h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */