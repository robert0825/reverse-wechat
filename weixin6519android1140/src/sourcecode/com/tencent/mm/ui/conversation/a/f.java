package com.tencent.mm.ui.conversation.a;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.ui.contact.SelectContactUI;
import com.tencent.mm.ui.contact.s;
import com.tencent.mm.y.at;
import java.lang.ref.WeakReference;

public final class f
  extends com.tencent.mm.pluginsdk.ui.b.b
{
  public String wZI;
  public String wZJ;
  
  public f(Context paramContext, String paramString1, String paramString2)
  {
    super(paramContext);
    GMTrace.i(14497527889920L, 108015);
    this.wZI = null;
    this.wZJ = null;
    this.wZI = paramString1;
    this.wZJ = paramString2;
    if (this.view != null)
    {
      paramContext = (ImageView)this.view.findViewById(R.h.bmZ);
      this.view.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(14496991019008L, 108011);
          paramAnonymousView = new Intent((Context)f.this.tyb.get(), SelectContactUI.class);
          paramAnonymousView.putExtra("list_attr", s.ex(s.wTj, 256));
          paramAnonymousView.putExtra("list_type", 10);
          paramAnonymousView.putExtra("received_card_name", f.this.wZI);
          paramAnonymousView.putExtra("recommend_friends", true);
          paramAnonymousView.putExtra("titile", ((Context)f.this.tyb.get()).getString(R.l.cRp));
          ((Context)f.this.tyb.get()).startActivity(paramAnonymousView);
          at.AR().zr().hi(f.this.wZI);
          at.AR().zr().hi(f.this.wZJ);
          g.ork.i(11003, new Object[] { f.this.wZI, Integer.valueOf(2), Integer.valueOf(0) });
          GMTrace.o(14496991019008L, 108011);
        }
      });
      paramContext.setImageBitmap(com.tencent.mm.ac.b.a(this.wZI, true, -1));
    }
    GMTrace.o(14497527889920L, 108015);
  }
  
  public final void destroy()
  {
    GMTrace.i(14497796325376L, 108017);
    GMTrace.o(14497796325376L, 108017);
  }
  
  public final int getLayoutId()
  {
    GMTrace.i(14497662107648L, 108016);
    int i = R.i.ctl;
    GMTrace.o(14497662107648L, 108016);
    return i;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\conversation\a\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */