package com.tencent.mm.plugin.sns.ui.b;

import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.View;
import android.view.View.OnCreateContextMenuListener;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.w;

public abstract class c
  implements View.OnCreateContextMenuListener
{
  public c()
  {
    GMTrace.i(8651540529152L, 64459);
    GMTrace.o(8651540529152L, 64459);
  }
  
  public abstract void a(ContextMenu paramContextMenu, View paramView, ContextMenu.ContextMenuInfo paramContextMenuInfo);
  
  public abstract boolean cG(View paramView);
  
  public void onCreateContextMenu(ContextMenu paramContextMenu, View paramView, ContextMenu.ContextMenuInfo paramContextMenuInfo)
  {
    GMTrace.i(8651943182336L, 64462);
    if (cG(paramView))
    {
      a(paramContextMenu, paramView, paramContextMenuInfo);
      GMTrace.o(8651943182336L, 64462);
      return;
    }
    w.e("MicroMsg.TimelineOnCreateContextMenuListener", "onMMCreateContextMenu error");
    GMTrace.o(8651943182336L, 64462);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\sns\ui\b\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */