package com.tencent.mm.ui.widget.celltextview.b;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.tencent.mm.ui.widget.celltextview.c.e;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public final class a
{
  public static abstract interface a
    extends b<a.b>
  {
    public abstract void Em(int paramInt);
    
    public abstract void En(int paramInt);
    
    public abstract void Eo(int paramInt);
    
    public abstract void Ep(int paramInt);
    
    public abstract void a(com.tencent.mm.ui.widget.celltextview.c.b paramb);
    
    public abstract void a(ArrayList<e> paramArrayList, CharSequence paramCharSequence);
    
    public abstract void aB(LinkedList<com.tencent.mm.ui.widget.celltextview.c.b> paramLinkedList);
    
    public abstract String cjA();
    
    public abstract List<com.tencent.mm.ui.widget.celltextview.c.b> cjz();
    
    public abstract int getMaxLines();
    
    public abstract int getMeasuredHeight();
    
    public abstract int getMeasuredWidth();
    
    public abstract int getPaddingBottom();
    
    public abstract int getPaddingLeft();
    
    public abstract int getPaddingRight();
    
    public abstract int getPaddingTop();
    
    public abstract Paint getPaint();
    
    public abstract String getText();
    
    public abstract float getTextSize();
    
    public abstract void onDraw(Canvas paramCanvas);
    
    public abstract void onMeasure(int paramInt1, int paramInt2);
    
    public abstract void requestLayout();
    
    public abstract void setBackgroundDrawable(Drawable paramDrawable);
    
    public abstract void setMaxHeight(int paramInt);
    
    public abstract void setMaxWidth(int paramInt);
    
    public abstract void setMinHeight(int paramInt);
    
    public abstract void setMinWidth(int paramInt);
    
    public abstract void setPadding(int paramInt1, int paramInt2, int paramInt3, int paramInt4);
    
    public abstract void setTextColor(int paramInt);
    
    public abstract void setTextSize(float paramFloat);
  }
  
  public static abstract interface b
    extends c<a.a>
  {
    public abstract View getView();
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\widget\celltextview\b\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */