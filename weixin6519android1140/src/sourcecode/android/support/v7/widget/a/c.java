package android.support.v7.widget.a;

import android.graphics.Canvas;
import android.support.v4.view.z;
import android.support.v7.d.a.b;
import android.support.v7.widget.RecyclerView;
import android.view.View;

final class c
{
  static final class a
    implements b
  {
    private static void a(Canvas paramCanvas, RecyclerView paramRecyclerView, View paramView, float paramFloat1, float paramFloat2)
    {
      paramCanvas.save();
      paramCanvas.translate(paramFloat1, paramFloat2);
      paramRecyclerView.drawChild(paramCanvas, paramView, 0L);
      paramCanvas.restore();
    }
    
    public final void a(Canvas paramCanvas, RecyclerView paramRecyclerView, View paramView, float paramFloat1, float paramFloat2, int paramInt)
    {
      if (paramInt == 2) {
        a(paramCanvas, paramRecyclerView, paramView, paramFloat1, paramFloat2);
      }
    }
    
    public final void a(Canvas paramCanvas, RecyclerView paramRecyclerView, View paramView, float paramFloat1, float paramFloat2, int paramInt, boolean paramBoolean)
    {
      if (paramInt != 2) {
        a(paramCanvas, paramRecyclerView, paramView, paramFloat1, paramFloat2);
      }
    }
    
    public final void bA(View paramView)
    {
      paramView.setVisibility(4);
    }
    
    public final void bz(View paramView)
    {
      paramView.setVisibility(0);
    }
  }
  
  static class b
    implements b
  {
    public final void a(Canvas paramCanvas, RecyclerView paramRecyclerView, View paramView, float paramFloat1, float paramFloat2, int paramInt) {}
    
    public void a(Canvas paramCanvas, RecyclerView paramRecyclerView, View paramView, float paramFloat1, float paramFloat2, int paramInt, boolean paramBoolean)
    {
      z.b(paramView, paramFloat1);
      z.c(paramView, paramFloat2);
    }
    
    public final void bA(View paramView) {}
    
    public void bz(View paramView)
    {
      z.b(paramView, 0.0F);
      z.c(paramView, 0.0F);
    }
  }
  
  static final class c
    extends c.b
  {
    public final void a(Canvas paramCanvas, RecyclerView paramRecyclerView, View paramView, float paramFloat1, float paramFloat2, int paramInt, boolean paramBoolean)
    {
      float f3;
      float f1;
      int i;
      if ((paramBoolean) && (paramView.getTag(a.b.Ir) == null))
      {
        f3 = z.X(paramView);
        int j = paramRecyclerView.getChildCount();
        f1 = 0.0F;
        i = 0;
        if (i < j)
        {
          View localView = paramRecyclerView.getChildAt(i);
          if (localView == paramView) {
            break label118;
          }
          float f2 = z.X(localView);
          if (f2 <= f1) {
            break label118;
          }
          f1 = f2;
        }
      }
      label118:
      for (;;)
      {
        i += 1;
        break;
        z.g(paramView, 1.0F + f1);
        paramView.setTag(a.b.Ir, Float.valueOf(f3));
        super.a(paramCanvas, paramRecyclerView, paramView, paramFloat1, paramFloat2, paramInt, paramBoolean);
        return;
      }
    }
    
    public final void bz(View paramView)
    {
      Object localObject = paramView.getTag(a.b.Ir);
      if ((localObject != null) && ((localObject instanceof Float))) {
        z.g(paramView, ((Float)localObject).floatValue());
      }
      paramView.setTag(a.b.Ir, null);
      super.bz(paramView);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\android\support\v7\widget\a\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */