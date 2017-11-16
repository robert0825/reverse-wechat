package com.tencent.mm.ui.widget;

import android.content.Context;
import android.view.View;
import android.widget.Checkable;
import com.tencent.gmtrace.GMTrace;

public final class d
  extends c
  implements Checkable
{
  public d(Context paramContext)
  {
    super(paramContext);
    GMTrace.i(13078578069504L, 97443);
    GMTrace.o(13078578069504L, 97443);
  }
  
  public final boolean isChecked()
  {
    GMTrace.i(13078712287232L, 97444);
    View localView = getChildAt(0);
    if ((localView instanceof Checkable))
    {
      boolean bool = ((Checkable)localView).isChecked();
      GMTrace.o(13078712287232L, 97444);
      return bool;
    }
    GMTrace.o(13078712287232L, 97444);
    return false;
  }
  
  public final void setChecked(boolean paramBoolean)
  {
    GMTrace.i(13078846504960L, 97445);
    View localView = getChildAt(0);
    if ((localView instanceof Checkable)) {
      ((Checkable)localView).setChecked(paramBoolean);
    }
    GMTrace.o(13078846504960L, 97445);
  }
  
  public final void toggle()
  {
    GMTrace.i(13078980722688L, 97446);
    View localView = getChildAt(0);
    if ((localView instanceof Checkable)) {
      ((Checkable)localView).toggle();
    }
    GMTrace.o(13078980722688L, 97446);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\widget\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */