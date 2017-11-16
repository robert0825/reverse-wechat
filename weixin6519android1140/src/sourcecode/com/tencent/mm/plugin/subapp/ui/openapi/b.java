package com.tencent.mm.plugin.subapp.ui.openapi;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.g;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.br.a;
import com.tencent.mm.pluginsdk.model.app.f;
import com.tencent.mm.pluginsdk.model.app.g;
import com.tencent.mm.sdk.e.j.a;
import com.tencent.mm.sdk.e.l;
import java.util.List;

public final class b
  extends BaseAdapter
  implements j.a
{
  private Context context;
  boolean qtv;
  private List<f> qtx;
  
  public b(Context paramContext, List<f> paramList)
  {
    GMTrace.i(5796192583680L, 43185);
    this.qtv = false;
    this.context = paramContext;
    this.qtx = paramList;
    GMTrace.o(5796192583680L, 43185);
  }
  
  private int aGD()
  {
    GMTrace.i(5797266325504L, 43193);
    int i = asx();
    GMTrace.o(5797266325504L, 43193);
    return (4 - i % 4) % 4;
  }
  
  private int asx()
  {
    GMTrace.i(5797132107776L, 43192);
    int i = this.qtx.size();
    GMTrace.o(5797132107776L, 43192);
    return i;
  }
  
  public final void a(String paramString, l paraml)
  {
    GMTrace.i(5797400543232L, 43194);
    notifyDataSetChanged();
    GMTrace.o(5797400543232L, 43194);
  }
  
  public final int getCount()
  {
    GMTrace.i(5796595236864L, 43188);
    int i = asx();
    int j = aGD();
    GMTrace.o(5796595236864L, 43188);
    return i + j;
  }
  
  public final Object getItem(int paramInt)
  {
    GMTrace.i(5796863672320L, 43190);
    if (oR(paramInt))
    {
      GMTrace.o(5796863672320L, 43190);
      return null;
    }
    Object localObject = this.qtx.get(paramInt);
    GMTrace.o(5796863672320L, 43190);
    return localObject;
  }
  
  public final long getItemId(int paramInt)
  {
    GMTrace.i(5796997890048L, 43191);
    long l = paramInt;
    GMTrace.o(5796997890048L, 43191);
    return l;
  }
  
  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    GMTrace.i(5796461019136L, 43187);
    if (paramView == null)
    {
      paramViewGroup = new c();
      paramView = View.inflate(this.context, R.i.cpk, null);
      paramViewGroup.iDp = ((ImageView)paramView.findViewById(R.h.beB));
      paramViewGroup.qtS = ((TextView)paramView.findViewById(R.h.beA));
      paramViewGroup.hvQ = ((TextView)paramView.findViewById(R.h.beC));
      paramViewGroup.qtT = paramView.findViewById(R.h.beD);
      paramView.setTag(paramViewGroup);
    }
    for (;;)
    {
      paramViewGroup.qtT.setVisibility(4);
      if (!oR(paramInt)) {
        break;
      }
      paramViewGroup.iDp.setVisibility(4);
      paramViewGroup.qtS.setVisibility(4);
      paramViewGroup.hvQ.setVisibility(4);
      GMTrace.o(5796461019136L, 43187);
      return paramView;
      paramViewGroup = (c)paramView.getTag();
    }
    f localf = (f)getItem(paramInt);
    paramViewGroup.iDp.setVisibility(0);
    Bitmap localBitmap = g.b(localf.field_appId, 5, a.getDensity(this.context));
    if (localBitmap == null)
    {
      paramViewGroup.iDp.setBackgroundResource(R.g.aTM);
      paramViewGroup.hvQ.setVisibility(0);
      paramViewGroup.hvQ.setText(g.a(this.context, localf, null));
      if (!this.qtv) {
        break label271;
      }
      paramViewGroup.qtS.setVisibility(0);
    }
    for (;;)
    {
      GMTrace.o(5796461019136L, 43187);
      return paramView;
      paramViewGroup.iDp.setBackgroundDrawable(new BitmapDrawable(localBitmap));
      break;
      label271:
      paramViewGroup.qtS.setVisibility(8);
    }
  }
  
  public final void ij(boolean paramBoolean)
  {
    GMTrace.i(5796326801408L, 43186);
    this.qtv = paramBoolean;
    notifyDataSetChanged();
    GMTrace.o(5796326801408L, 43186);
  }
  
  public final boolean oR(int paramInt)
  {
    GMTrace.i(5796729454592L, 43189);
    int i = this.qtx.size();
    if ((paramInt >= i) && (paramInt < i + aGD()))
    {
      GMTrace.o(5796729454592L, 43189);
      return true;
    }
    GMTrace.o(5796729454592L, 43189);
    return false;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\subapp\ui\openapi\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */