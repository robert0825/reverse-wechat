package com.tencent.mm.plugin.favorite.ui.base;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.l;
import com.tencent.mm.plugin.favorite.b.j;
import com.tencent.mm.plugin.favorite.b.u;

public class FavDetailFooterView
  extends TextView
{
  public FavDetailFooterView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(6460033466368L, 48131);
    GMTrace.o(6460033466368L, 48131);
  }
  
  public FavDetailFooterView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(6459899248640L, 48130);
    GMTrace.o(6459899248640L, 48130);
  }
  
  public final void C(j paramj)
  {
    GMTrace.i(6460167684096L, 48132);
    if (paramj == null)
    {
      GMTrace.o(6460167684096L, 48132);
      return;
    }
    if (paramj.field_edittime > 0L)
    {
      setText(getContext().getString(R.l.dtj) + u.d(getContext(), paramj.field_edittime * 1000L));
      GMTrace.o(6460167684096L, 48132);
      return;
    }
    setText(getContext().getString(R.l.duZ) + u.d(getContext(), paramj.field_updateTime));
    GMTrace.o(6460167684096L, 48132);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\favorite\ui\base\FavDetailFooterView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */