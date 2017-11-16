package com.tencent.mm.ui.widget;

import android.graphics.Bitmap;
import android.graphics.Point;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView;
import android.widget.ListView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.w;

public class j
  implements DragSortListView.h
{
  private ListView Ev;
  private ImageView kve;
  private Bitmap xsA;
  int xsB;
  
  public j(ListView paramListView)
  {
    GMTrace.i(13053345136640L, 97255);
    this.xsB = -16777216;
    this.Ev = paramListView;
    GMTrace.o(13053345136640L, 97255);
  }
  
  public final View Ei(int paramInt)
  {
    GMTrace.i(13053479354368L, 97256);
    Object localObject = this.Ev.getChildAt(this.Ev.getHeaderViewsCount() + paramInt - this.Ev.getFirstVisiblePosition());
    if (localObject == null)
    {
      GMTrace.o(13053479354368L, 97256);
      return null;
    }
    ((View)localObject).setPressed(false);
    ((View)localObject).setDrawingCacheEnabled(true);
    this.xsA = Bitmap.createBitmap(((View)localObject).getDrawingCache());
    ((View)localObject).setDrawingCacheEnabled(false);
    if (this.kve == null) {
      this.kve = new ImageView(this.Ev.getContext());
    }
    this.kve.setBackgroundColor(this.xsB);
    this.kve.setPadding(0, 0, 0, 0);
    this.kve.setImageBitmap(this.xsA);
    this.kve.setLayoutParams(new ViewGroup.LayoutParams(((View)localObject).getWidth(), ((View)localObject).getHeight()));
    localObject = this.kve;
    GMTrace.o(13053479354368L, 97256);
    return (View)localObject;
  }
  
  public final void dG(View paramView)
  {
    GMTrace.i(13053747789824L, 97258);
    ((ImageView)paramView).setImageDrawable(null);
    w.i("MicroMsg.SimpleFloatViewManager", "bitmap recycle %s", new Object[] { this.xsA.toString() });
    this.xsA.recycle();
    this.xsA = null;
    GMTrace.o(13053747789824L, 97258);
  }
  
  public void e(Point paramPoint)
  {
    GMTrace.i(13053613572096L, 97257);
    GMTrace.o(13053613572096L, 97257);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\widget\j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */