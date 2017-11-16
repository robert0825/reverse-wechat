package com.tencent.mm.plugin.record.ui.b;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.plugin.record.ui.a.b;
import com.tencent.mm.plugin.record.ui.h.b;
import com.tencent.mm.pluginsdk.ui.d.h;
import com.tencent.mm.protocal.c.th;

public final class d
  implements h.b
{
  Context context;
  
  public d(Context paramContext)
  {
    GMTrace.i(7544110055424L, 56208);
    this.context = paramContext;
    GMTrace.o(7544110055424L, 56208);
  }
  
  public final void a(View paramView, int paramInt, b paramb)
  {
    GMTrace.i(7544378490880L, 56210);
    paramView = (TextView)paramView.findViewById(R.h.bXJ);
    paramView.setText(paramb.eIc.desc);
    h.e(paramView, 1);
    if ((this.context instanceof Activity)) {
      ((Activity)this.context).registerForContextMenu(paramView);
    }
    GMTrace.o(7544378490880L, 56210);
  }
  
  public final View cZ(Context paramContext)
  {
    GMTrace.i(7544244273152L, 56209);
    paramContext = View.inflate(paramContext, R.i.cED, null);
    GMTrace.o(7544244273152L, 56209);
    return paramContext;
  }
  
  public final void destroy()
  {
    GMTrace.i(7544512708608L, 56211);
    this.context = null;
    GMTrace.o(7544512708608L, 56211);
  }
  
  public final void pause()
  {
    GMTrace.i(7544646926336L, 56212);
    GMTrace.o(7544646926336L, 56212);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\record\ui\b\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */