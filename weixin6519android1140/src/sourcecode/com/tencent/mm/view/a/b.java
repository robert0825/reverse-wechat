package com.tencent.mm.view.a;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView.LayoutParams;
import android.widget.ImageView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.bt.e;
import com.tencent.mm.plugin.m.a.d;
import com.tencent.mm.plugin.m.a.e;
import com.tencent.mm.plugin.m.a.f;
import com.tencent.mm.plugin.m.a.h;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.v;

public final class b
  extends a
{
  public b(Context paramContext, com.tencent.mm.view.f.a parama)
  {
    super(paramContext, parama);
    GMTrace.i(20106486743040L, 149805);
    GMTrace.o(20106486743040L, 149805);
  }
  
  public final int getCount()
  {
    GMTrace.i(20106620960768L, 149806);
    int i = this.xAe;
    GMTrace.o(20106620960768L, 149806);
    return i;
  }
  
  public final Object getItem(int paramInt)
  {
    GMTrace.i(20106755178496L, 149807);
    GMTrace.o(20106755178496L, 149807);
    return null;
  }
  
  public final long getItemId(int paramInt)
  {
    GMTrace.i(20106889396224L, 149808);
    long l = paramInt;
    GMTrace.o(20106889396224L, 149808);
    return l;
  }
  
  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    GMTrace.i(20107023613952L, 149809);
    if ((paramView == null) || (paramView.getTag() == null))
    {
      paramView = v.fb(this.mContext).inflate(a.f.kws, null);
      paramViewGroup = this.xzn;
      if (paramViewGroup.xCv == 0) {
        paramViewGroup.xCv = (paramViewGroup.cln() / paramViewGroup.Xr("TAG_DEFAULT_TAB"));
      }
      paramView.setLayoutParams(new AbsListView.LayoutParams(paramViewGroup.xCv, this.xzn.xCs));
      paramViewGroup = new a(paramView);
      paramView.setTag(paramViewGroup);
      if (paramInt != getCount() - 1) {
        break label156;
      }
      paramViewGroup.iub.setImageResource(a.d.aVV);
      paramViewGroup.iub.setContentDescription(this.mContext.getString(a.h.dmB));
    }
    for (;;)
    {
      GMTrace.o(20107023613952L, 149809);
      return paramView;
      paramViewGroup = (a)paramView.getTag();
      break;
      label156:
      paramInt = (this.xAe - 1) * this.xAf + paramInt;
      if (paramInt > this.jtJ - 1)
      {
        paramViewGroup.iub.setImageDrawable(null);
        paramViewGroup.iub.setContentDescription("");
        w.i("MicroMsg.emoji.DefaultSmileyAdapter", "real position is bigger real count.");
      }
      else
      {
        Drawable localDrawable = e.bRA().kg(paramInt);
        paramViewGroup.iub.setImageDrawable(localDrawable);
        String str2 = e.bRA().getText(paramInt);
        String str1 = str2;
        if (bg.nm(str2)) {
          str1 = paramView.getResources().getString(a.h.dpj);
        }
        paramViewGroup.iub.setContentDescription(str1);
        if (localDrawable == null) {
          w.i("MicroMsg.emoji.DefaultSmileyAdapter", "drawable is null. realPosition:%d description:%s", new Object[] { Integer.valueOf(paramInt), str1 });
        }
      }
    }
  }
  
  final class a
  {
    ImageView iub;
    
    public a(View paramView)
    {
      GMTrace.i(20107292049408L, 149811);
      this.iub = ((ImageView)paramView.findViewById(a.e.beT));
      GMTrace.o(20107292049408L, 149811);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\view\a\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */