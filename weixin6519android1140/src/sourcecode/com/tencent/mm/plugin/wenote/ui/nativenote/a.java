package com.tencent.mm.plugin.wenote.ui.nativenote;

import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.f;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.plugin.wenote.model.a.p;
import com.tencent.mm.plugin.wenote.model.c;
import com.tencent.mm.plugin.wenote.model.f;
import com.tencent.mm.plugin.wenote.model.j;
import com.tencent.mm.plugin.wenote.model.nativenote.manager.h;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.ScrollAlwaysTextView;
import java.lang.ref.WeakReference;

public final class a
  extends com.tencent.mm.pluginsdk.ui.b.b
{
  private ScrollAlwaysTextView lIo;
  
  public a(Context paramContext)
  {
    super(paramContext);
    GMTrace.i(20576651444224L, 153308);
    this.lIo = null;
    if (this.view != null)
    {
      this.lIo = ((ScrollAlwaysTextView)this.view.findViewById(R.h.coq));
      this.lIo.setTextSize(0, com.tencent.mm.br.a.V(this.lIo.getContext(), R.f.aQo));
      this.view.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(20590475870208L, 153411);
          w.i("WNNoteBanner", "click WNNoteBanner");
          paramAnonymousView = h.bHH().bHI();
          if (paramAnonymousView == null)
          {
            w.i("WNNoteBanner", "keepTopItem is null");
            a.this.setVisibility(8);
            GMTrace.o(20590475870208L, 153411);
            return;
          }
          if (paramAnonymousView.sdh)
          {
            if (paramAnonymousView.sdk) {
              com.tencent.mm.plugin.report.service.g.ork.i(14789, new Object[] { Integer.valueOf(3) });
            }
            for (;;)
            {
              w.i("WNNoteBanner", "isOpenFromSession: true");
              localObject = new j();
              com.tencent.mm.plugin.wenote.model.b.bGM().sbA = ((c)localObject);
              ((j)localObject).a(paramAnonymousView.sdm, Long.valueOf(paramAnonymousView.sdj), true, (Context)a.this.tyb.get(), paramAnonymousView.sdn, paramAnonymousView.sdo);
              GMTrace.o(20590475870208L, 153411);
              return;
              com.tencent.mm.plugin.report.service.g.ork.i(14789, new Object[] { Integer.valueOf(2) });
            }
          }
          com.tencent.mm.plugin.report.service.g.ork.i(14789, new Object[] { Integer.valueOf(1) });
          w.i("WNNoteBanner", "isOpenFromSession: false");
          Object localObject = new com.tencent.mm.plugin.wenote.model.g();
          com.tencent.mm.plugin.wenote.model.b.bGM().sbA = ((c)localObject);
          ((com.tencent.mm.plugin.wenote.model.g)localObject).a(paramAnonymousView.sdi, (Context)a.this.tyb.get(), Boolean.valueOf(true), paramAnonymousView.sdn, paramAnonymousView.sdo);
          GMTrace.o(20590475870208L, 153411);
        }
      });
    }
    GMTrace.o(20576651444224L, 153308);
  }
  
  public final boolean abd()
  {
    GMTrace.i(20577322532864L, 153313);
    Object localObject = h.bHH().bHI();
    int i;
    if ((localObject != null) && (((p)localObject).sdh) && (((p)localObject).sdj > 0L) && (!bg.nm(((p)localObject).sdm))) {
      i = 1;
    }
    for (;;)
    {
      if (i != 0)
      {
        localObject = ((p)localObject).sdl;
        if (this.lIo != null) {
          this.lIo.setText((CharSequence)localObject);
        }
        setVisibility(0);
        GMTrace.o(20577322532864L, 153313);
        return true;
        if ((localObject != null) && (!((p)localObject).sdh) && (f.ep(((p)localObject).sdi) != null)) {
          i = 1;
        }
      }
      else
      {
        if (localObject != null) {
          h.bHH().a(null);
        }
        setVisibility(8);
        GMTrace.o(20577322532864L, 153313);
        return false;
      }
      i = 0;
    }
  }
  
  public final void destroy()
  {
    GMTrace.i(20577054097408L, 153311);
    GMTrace.o(20577054097408L, 153311);
  }
  
  public final int getLayoutId()
  {
    GMTrace.i(20576785661952L, 153309);
    int i = R.i.cor;
    GMTrace.o(20576785661952L, 153309);
    return i;
  }
  
  public final int getOrder()
  {
    GMTrace.i(20576919879680L, 153310);
    GMTrace.o(20576919879680L, 153310);
    return 0;
  }
  
  public final void setVisibility(int paramInt)
  {
    GMTrace.i(20577188315136L, 153312);
    if (this.view != null) {
      this.view.findViewById(R.h.cor).setVisibility(paramInt);
    }
    GMTrace.o(20577188315136L, 153312);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\wenote\ui\nativenote\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */