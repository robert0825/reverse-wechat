package com.tencent.mm.ui.conversation.a;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.pluginsdk.ui.b.b;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.y.at;
import com.tencent.mm.y.c;
import java.lang.ref.WeakReference;

public final class g
  extends b
{
  public String wZI;
  public String wZJ;
  public boolean wqK;
  
  public g(Context paramContext, String paramString1, String paramString2, boolean paramBoolean)
  {
    super(paramContext);
    GMTrace.i(14507728437248L, 108091);
    this.wZI = null;
    this.wZJ = null;
    this.wqK = false;
    this.wZI = paramString1;
    this.wZJ = paramString2;
    this.wqK = paramBoolean;
    if (this.view != null)
    {
      paramContext = (TextView)this.view.findViewById(R.h.boq);
      paramString1 = at.AR().zs().P(this.wZI, "wording");
      paramString2 = at.AR().zs().P(this.wZJ, "wording");
      if (bg.nm(paramString1)) {
        break label166;
      }
      paramContext.setText(paramString1);
    }
    for (;;)
    {
      ((TextView)this.view.findViewById(R.h.bop)).setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(14494440882176L, 107992);
          paramAnonymousView = new Intent();
          paramAnonymousView.putExtra("k_username", g.this.wZI);
          int i = 39;
          if (g.this.wqK) {
            i = 36;
          }
          paramAnonymousView.putExtra("showShare", false);
          paramAnonymousView.putExtra("rawUrl", String.format("https://weixin110.qq.com/security/readtemplate?t=weixin_report/w_type&scene=%d#wechat_redirect", new Object[] { Integer.valueOf(i) }));
          if (g.this.tyb.get() != null) {
            com.tencent.mm.bj.d.b((Context)g.this.tyb.get(), "webview", ".ui.tools.WebViewUI", paramAnonymousView);
          }
          at.AR().zs().hi(g.this.wZI);
          at.AR().zs().hi(g.this.wZJ);
          GMTrace.o(14494440882176L, 107992);
        }
      });
      ((ImageView)this.view.findViewById(R.h.boo)).setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(14506788913152L, 108084);
          at.AR().zs().hi(g.this.wZI);
          at.AR().zs().hi(g.this.wZJ);
          GMTrace.o(14506788913152L, 108084);
        }
      });
      GMTrace.o(14507728437248L, 108091);
      return;
      label166:
      if (!bg.nm(paramString2)) {
        paramContext.setText(paramString2);
      }
    }
  }
  
  public final void destroy()
  {
    GMTrace.i(14507996872704L, 108093);
    GMTrace.o(14507996872704L, 108093);
  }
  
  public final int getLayoutId()
  {
    GMTrace.i(14507862654976L, 108092);
    int i = R.i.ctm;
    GMTrace.o(14507862654976L, 108092);
    return i;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\conversation\a\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */