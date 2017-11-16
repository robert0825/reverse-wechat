package com.tencent.mm.plugin.webview.ui.tools;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.bj.d;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.ui.ScrollAlwaysTextView;
import java.lang.ref.WeakReference;

public final class h
  extends com.tencent.mm.pluginsdk.ui.b.b
{
  private ScrollAlwaysTextView lIo;
  
  public h(Context paramContext)
  {
    super(paramContext);
    GMTrace.i(14571616075776L, 108567);
    if (this.view != null)
    {
      this.lIo = ((ScrollAlwaysTextView)this.view.findViewById(R.h.cnE));
      this.view.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(14572421382144L, 108573);
          paramAnonymousView = com.tencent.mm.be.b.hga;
          paramAnonymousView = com.tencent.mm.be.b.On();
          if (bg.nm(paramAnonymousView))
          {
            GMTrace.o(14572421382144L, 108573);
            return;
          }
          Object localObject = com.tencent.mm.be.b.hga;
          int i = com.tencent.mm.be.b.Oo();
          localObject = new Intent();
          ((Intent)localObject).putExtra("rawUrl", paramAnonymousView);
          ((Intent)localObject).putExtra("is_from_keep_top", true);
          ((Intent)localObject).putExtra("keep_top_scene", i);
          if (i == 2)
          {
            ((Intent)localObject).putExtra("custom_keep_top_url", paramAnonymousView);
            paramAnonymousView = com.tencent.mm.be.b.hga;
            ((Intent)localObject).putExtra("custom_keep_top_title", com.tencent.mm.be.b.Om());
          }
          d.b((Context)h.this.tyb.get(), "webview", ".ui.tools.WebViewUI", (Intent)localObject);
          GMTrace.o(14572421382144L, 108573);
        }
      });
    }
    GMTrace.o(14571616075776L, 108567);
  }
  
  private void setTitle(String paramString)
  {
    GMTrace.i(16613738807296L, 123782);
    if (this.lIo != null) {
      this.lIo.setText(paramString);
    }
    GMTrace.o(16613738807296L, 123782);
  }
  
  public final boolean abd()
  {
    GMTrace.i(14572152946688L, 108571);
    Object localObject = com.tencent.mm.be.b.hga;
    if (com.tencent.mm.be.b.Ok())
    {
      localObject = com.tencent.mm.be.b.hga;
      if (com.tencent.mm.be.b.Oo() == 2)
      {
        localObject = com.tencent.mm.be.b.hga;
        setTitle(com.tencent.mm.be.b.Om());
      }
      for (;;)
      {
        setVisibility(0);
        GMTrace.o(14572152946688L, 108571);
        return true;
        localObject = ab.getContext();
        int i = R.l.elC;
        com.tencent.mm.be.b localb = com.tencent.mm.be.b.hga;
        setTitle(((Context)localObject).getString(i, new Object[] { com.tencent.mm.be.b.Om() }));
      }
    }
    setVisibility(8);
    GMTrace.o(14572152946688L, 108571);
    return false;
  }
  
  public final void destroy()
  {
    GMTrace.i(14571884511232L, 108569);
    GMTrace.o(14571884511232L, 108569);
  }
  
  public final int getLayoutId()
  {
    GMTrace.i(14571750293504L, 108568);
    int i = R.i.cHU;
    GMTrace.o(14571750293504L, 108568);
    return i;
  }
  
  public final void setVisibility(int paramInt)
  {
    GMTrace.i(14572018728960L, 108570);
    if (this.view != null) {
      this.view.findViewById(R.h.cnF).setVisibility(paramInt);
    }
    GMTrace.o(14572018728960L, 108570);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\webview\ui\tools\h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */