package com.tencent.mm.pluginsdk.ui.b;

import android.content.Context;
import android.view.View;
import com.tencent.gmtrace.GMTrace;
import java.lang.ref.WeakReference;

public abstract class b
  implements a
{
  public WeakReference<Context> tyb;
  public View view;
  
  public b(Context paramContext)
  {
    GMTrace.i(1187692675072L, 8849);
    this.view = null;
    this.tyb = null;
    this.tyb = new WeakReference(paramContext);
    if (getLayoutId() > 0) {
      this.view = View.inflate((Context)this.tyb.get(), getLayoutId(), null);
    }
    GMTrace.o(1187692675072L, 8849);
  }
  
  public boolean abd()
  {
    GMTrace.i(14462631280640L, 107755);
    if ((this.view != null) && (this.view.getVisibility() == 0))
    {
      GMTrace.o(14462631280640L, 107755);
      return true;
    }
    GMTrace.o(14462631280640L, 107755);
    return false;
  }
  
  public abstract void destroy();
  
  public abstract int getLayoutId();
  
  public int getOrder()
  {
    GMTrace.i(17440520011776L, 129942);
    GMTrace.o(17440520011776L, 129942);
    return 0;
  }
  
  public View getView()
  {
    GMTrace.i(1188229545984L, 8853);
    View localView = this.view;
    GMTrace.o(1188229545984L, 8853);
    return localView;
  }
  
  public void release()
  {
    GMTrace.i(14462765498368L, 107756);
    GMTrace.o(14462765498368L, 107756);
  }
  
  public void setVisibility(int paramInt)
  {
    GMTrace.i(1187826892800L, 8850);
    if (getView() != null) {
      getView().setVisibility(paramInt);
    }
    GMTrace.o(1187826892800L, 8850);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\pluginsdk\ui\b\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */