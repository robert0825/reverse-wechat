package com.tencent.mm.ui.conversation.a;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.pluginsdk.ui.b.a;
import com.tencent.mm.pluginsdk.ui.b.b;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.y.bb;
import com.tencent.mm.y.bb.b;

public final class j
  extends b
{
  public LinearLayout wZQ;
  
  public j(final Context paramContext)
  {
    super(paramContext);
    GMTrace.i(14511218098176L, 108117);
    this.wZQ = null;
    this.wZQ = new LinearLayout(paramContext);
    this.wZQ.setVisibility(8);
    bb.Bc().gnE = new bb.b()
    {
      public final void Bf()
      {
        GMTrace.i(14496185712640L, 108005);
        j.this.wZQ.post(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(14508533743616L, 108097);
            if (j.this.wZQ != null)
            {
              j.this.wZQ.setVisibility(8);
              j.this.wZQ.removeAllViews();
            }
            a locala = e.a(j.1.this.val$context, e.a.wZC, null);
            Object localObject = locala;
            if (locala == null) {
              localObject = e.a(j.1.this.val$context, e.a.wZw, null);
            }
            if ((localObject != null) && (((a)localObject).getView() != null))
            {
              w.i("MicroMsg.MainFrameAndAbtestBanner", "summerinit MainFrameBannerStorage onNotify banner[%s], view[%s]", new Object[] { localObject, ((a)localObject).getView() });
              j.this.wZQ.setVisibility(0);
              localObject = ((a)localObject).getView();
              j.this.wZQ.addView((View)localObject, new LinearLayout.LayoutParams(-1, -2));
            }
            GMTrace.o(14508533743616L, 108097);
          }
        });
        GMTrace.o(14496185712640L, 108005);
      }
    };
    bb.Bc().gnE.Bf();
    GMTrace.o(14511218098176L, 108117);
  }
  
  public final boolean abd()
  {
    GMTrace.i(14511352315904L, 108118);
    if ((this.wZQ != null) && (this.wZQ.getVisibility() == 0))
    {
      GMTrace.o(14511352315904L, 108118);
      return true;
    }
    GMTrace.o(14511352315904L, 108118);
    return false;
  }
  
  public final void destroy()
  {
    GMTrace.i(14511754969088L, 108121);
    bb.Bc().gnE = null;
    GMTrace.o(14511754969088L, 108121);
  }
  
  public final int getLayoutId()
  {
    GMTrace.i(14511620751360L, 108120);
    GMTrace.o(14511620751360L, 108120);
    return -1;
  }
  
  public final View getView()
  {
    GMTrace.i(14511486533632L, 108119);
    LinearLayout localLinearLayout = this.wZQ;
    GMTrace.o(14511486533632L, 108119);
    return localLinearLayout;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\conversation\a\j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */