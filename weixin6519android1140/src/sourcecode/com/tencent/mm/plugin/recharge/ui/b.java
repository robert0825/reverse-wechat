package com.tencent.mm.plugin.recharge.ui;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.StateListDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.br.a;
import com.tencent.mm.plugin.wallet.a.n;
import com.tencent.mm.plugin.wxpay.a.c;
import com.tencent.mm.plugin.wxpay.a.f;
import com.tencent.mm.plugin.wxpay.a.g;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.ui.v;
import java.util.ArrayList;

public final class b
  extends BaseAdapter
{
  ArrayList<n> oeF;
  a oeG;
  
  public b()
  {
    GMTrace.i(7881533423616L, 58722);
    this.oeF = null;
    this.oeG = null;
    GMTrace.o(7881533423616L, 58722);
  }
  
  public final int getCount()
  {
    GMTrace.i(7881667641344L, 58723);
    if (this.oeF == null)
    {
      GMTrace.o(7881667641344L, 58723);
      return 0;
    }
    int i = this.oeF.size();
    GMTrace.o(7881667641344L, 58723);
    return i;
  }
  
  public final Object getItem(int paramInt)
  {
    GMTrace.i(7881801859072L, 58724);
    Object localObject = this.oeF.get(paramInt);
    GMTrace.o(7881801859072L, 58724);
    return localObject;
  }
  
  public final long getItemId(int paramInt)
  {
    GMTrace.i(7881936076800L, 58725);
    long l = paramInt;
    GMTrace.o(7881936076800L, 58725);
    return l;
  }
  
  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    GMTrace.i(7882070294528L, 58726);
    final n localn = (n)getItem(paramInt);
    b localb;
    if (paramView == null)
    {
      paramView = v.fb(paramViewGroup.getContext()).inflate(a.g.sOs, paramViewGroup, false);
      localb = new b();
      localb.mrx = ((TextView)paramView.findViewById(a.f.btg));
      localb.hvQ = ((TextView)paramView.findViewById(a.f.name));
      localb.oeJ = ((TextView)paramView.findViewById(a.f.sEz));
      paramView.setTag(localb);
      localb.hvQ.setText(localn.name);
      if (bg.nm(localn.desc)) {
        break label587;
      }
      localb.mrx.setVisibility(0);
      localb.mrx.setText(localn.desc);
      label145:
      if (bg.nm(localn.qXW)) {
        break label600;
      }
      localb.oeJ.setVisibility(0);
      localb.oeJ.setText(localn.qXW);
      label178:
      if (localn.status != 1) {
        break label613;
      }
      paramView.setEnabled(true);
      localb.mrx.setEnabled(true);
      localb.hvQ.setEnabled(true);
    }
    for (;;)
    {
      if ((localn.type == 1) && (localn.qXX.equals("1")) && (!localn.qXY.equals("0")))
      {
        Object localObject1 = paramViewGroup.getContext();
        paramInt = Color.parseColor(localn.qXY);
        Object localObject2 = new GradientDrawable();
        ((GradientDrawable)localObject2).setShape(0);
        ((GradientDrawable)localObject2).setCornerRadius(a.fromDPToPix((Context)localObject1, 2));
        ((GradientDrawable)localObject2).setColor(paramInt);
        Object localObject3 = new GradientDrawable();
        ((GradientDrawable)localObject3).setShape(0);
        ((GradientDrawable)localObject3).setCornerRadius(a.fromDPToPix((Context)localObject1, 2));
        ((GradientDrawable)localObject3).setStroke(2, a.c((Context)localObject1, a.c.smH));
        GradientDrawable localGradientDrawable = new GradientDrawable();
        localGradientDrawable.setShape(0);
        localGradientDrawable.setCornerRadius(a.fromDPToPix((Context)localObject1, 2));
        localGradientDrawable.setColor(a.c((Context)localObject1, a.c.smF));
        localGradientDrawable.setStroke(2, paramInt);
        localObject1 = new StateListDrawable();
        ((StateListDrawable)localObject1).addState(new int[] { 16842919 }, (Drawable)localObject2);
        ((StateListDrawable)localObject1).addState(new int[] { -16842910 }, (Drawable)localObject3);
        ((StateListDrawable)localObject1).addState(new int[0], localGradientDrawable);
        paramViewGroup = paramViewGroup.getContext();
        paramInt = Color.parseColor(localn.qXY);
        localObject2 = new int[] { 16842919 };
        localObject3 = new int[0];
        int i = a.c(paramViewGroup, a.c.white);
        int j = a.c(paramViewGroup, a.c.smD);
        paramViewGroup = new ColorStateList(new int[][] { localObject2, { -16842910 }, localObject3 }, new int[] { i, j, paramInt });
        localb.mrx.setTextColor(paramViewGroup);
        localb.hvQ.setTextColor(paramViewGroup);
        paramView.setBackground((Drawable)localObject1);
      }
      paramView.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(7900994994176L, 58867);
          if (b.a(b.this) != null) {
            b.a(b.this).a(localn);
          }
          GMTrace.o(7900994994176L, 58867);
        }
      });
      GMTrace.o(7882070294528L, 58726);
      return paramView;
      localb = (b)paramView.getTag();
      break;
      label587:
      localb.mrx.setVisibility(8);
      break label145;
      label600:
      localb.oeJ.setVisibility(8);
      break label178;
      label613:
      paramView.setEnabled(false);
      localb.mrx.setEnabled(false);
      localb.hvQ.setEnabled(false);
    }
  }
  
  public static abstract interface a
  {
    public abstract void a(n paramn);
  }
  
  private final class b
  {
    TextView hvQ;
    TextView mrx;
    TextView oeJ;
    
    public b()
    {
      GMTrace.i(7882875600896L, 58732);
      GMTrace.o(7882875600896L, 58732);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\recharge\ui\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */