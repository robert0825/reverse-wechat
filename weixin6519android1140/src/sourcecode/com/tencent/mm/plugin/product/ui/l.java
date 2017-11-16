package com.tencent.mm.plugin.product.ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.platformtools.j;
import com.tencent.mm.plugin.product.b.n.a;
import com.tencent.mm.plugin.wxpay.a.f;
import com.tencent.mm.plugin.wxpay.a.g;
import java.util.List;

public final class l
  extends BaseAdapter
{
  private Context mContext;
  List<n.a> nKx;
  
  public l(Context paramContext)
  {
    GMTrace.i(6021275713536L, 44862);
    this.mContext = paramContext;
    GMTrace.o(6021275713536L, 44862);
  }
  
  private n.a sA(int paramInt)
  {
    GMTrace.i(6021544148992L, 44864);
    n.a locala = (n.a)this.nKx.get(paramInt);
    GMTrace.o(6021544148992L, 44864);
    return locala;
  }
  
  public final int getCount()
  {
    GMTrace.i(6021409931264L, 44863);
    if (this.nKx != null)
    {
      int i = this.nKx.size();
      GMTrace.o(6021409931264L, 44863);
      return i;
    }
    GMTrace.o(6021409931264L, 44863);
    return 0;
  }
  
  public final long getItemId(int paramInt)
  {
    GMTrace.i(6021678366720L, 44865);
    long l = paramInt;
    GMTrace.o(6021678366720L, 44865);
    return l;
  }
  
  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    GMTrace.i(6021812584448L, 44866);
    Object localObject = sA(paramInt);
    if ((paramView == null) || (paramView.getTag() == null))
    {
      paramViewGroup = new m();
      paramView = View.inflate(this.mContext, a.g.sOc, null);
      paramViewGroup.hqi = ((TextView)paramView.findViewById(a.f.sBR));
      paramViewGroup.iDp = ((ImageView)paramView.findViewById(a.f.sBQ));
      paramView.setTag(paramViewGroup);
    }
    for (;;)
    {
      paramViewGroup.nKy = ((n.a)localObject);
      paramViewGroup.hqi.setText(((n.a)localObject).title);
      localObject = j.a(new c(((n.a)localObject).iconUrl));
      paramViewGroup.iDp.setImageBitmap((Bitmap)localObject);
      j.a(paramViewGroup);
      GMTrace.o(6021812584448L, 44866);
      return paramView;
      paramViewGroup = (m)paramView.getTag();
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\product\ui\l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */