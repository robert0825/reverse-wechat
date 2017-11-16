package android.support.v7.widget;

import android.view.View;

final class ah
{
  static int a(RecyclerView.q paramq, ab paramab, View paramView1, View paramView2, RecyclerView.h paramh, boolean paramBoolean)
  {
    if ((paramh.getChildCount() == 0) || (paramq.getItemCount() == 0) || (paramView1 == null) || (paramView2 == null)) {
      return 0;
    }
    if (!paramBoolean) {
      return Math.abs(RecyclerView.h.be(paramView1) - RecyclerView.h.be(paramView2)) + 1;
    }
    int i = paramab.aW(paramView2);
    int j = paramab.aV(paramView1);
    return Math.min(paramab.fj(), i - j);
  }
  
  static int a(RecyclerView.q paramq, ab paramab, View paramView1, View paramView2, RecyclerView.h paramh, boolean paramBoolean1, boolean paramBoolean2)
  {
    int i = 0;
    int j = i;
    if (paramh.getChildCount() != 0)
    {
      j = i;
      if (paramq.getItemCount() != 0)
      {
        j = i;
        if (paramView1 != null)
        {
          if (paramView2 != null) {
            break label45;
          }
          j = i;
        }
      }
    }
    return j;
    label45:
    i = Math.min(RecyclerView.h.be(paramView1), RecyclerView.h.be(paramView2));
    j = Math.max(RecyclerView.h.be(paramView1), RecyclerView.h.be(paramView2));
    if (paramBoolean2) {}
    for (i = Math.max(0, paramq.getItemCount() - j - 1);; i = Math.max(0, i))
    {
      j = i;
      if (!paramBoolean1) {
        break;
      }
      j = Math.abs(paramab.aW(paramView2) - paramab.aV(paramView1));
      int k = Math.abs(RecyclerView.h.be(paramView1) - RecyclerView.h.be(paramView2));
      float f = j / (k + 1);
      return Math.round(i * f + (paramab.fh() - paramab.aV(paramView1)));
    }
  }
  
  static int b(RecyclerView.q paramq, ab paramab, View paramView1, View paramView2, RecyclerView.h paramh, boolean paramBoolean)
  {
    if ((paramh.getChildCount() == 0) || (paramq.getItemCount() == 0) || (paramView1 == null) || (paramView2 == null)) {
      return 0;
    }
    if (!paramBoolean) {
      return paramq.getItemCount();
    }
    int i = paramab.aW(paramView2);
    int j = paramab.aV(paramView1);
    int k = Math.abs(RecyclerView.h.be(paramView1) - RecyclerView.h.be(paramView2));
    return (int)((i - j) / (k + 1) * paramq.getItemCount());
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\android\support\v7\widget\ah.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */