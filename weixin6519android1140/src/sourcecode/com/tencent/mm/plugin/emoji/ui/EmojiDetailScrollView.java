package com.tencent.mm.plugin.emoji.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ScrollView;
import com.tencent.gmtrace.GMTrace;

public class EmojiDetailScrollView
  extends ScrollView
{
  boolean kpc;
  
  public EmojiDetailScrollView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
    GMTrace.i(11414680895488L, 85046);
    GMTrace.o(11414680895488L, 85046);
  }
  
  public EmojiDetailScrollView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(11414815113216L, 85047);
    this.kpc = true;
    setFadingEdgeLength(0);
    GMTrace.o(11414815113216L, 85047);
  }
  
  public boolean onInterceptTouchEvent(MotionEvent paramMotionEvent)
  {
    GMTrace.i(11415754637312L, 85054);
    if (!this.kpc)
    {
      GMTrace.o(11415754637312L, 85054);
      return false;
    }
    boolean bool = super.onInterceptTouchEvent(paramMotionEvent);
    GMTrace.o(11415754637312L, 85054);
    return bool;
  }
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    GMTrace.i(11415217766400L, 85050);
    this.kpc = false;
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    GMTrace.o(11415217766400L, 85050);
  }
  
  protected void onSizeChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    GMTrace.i(11414949330944L, 85048);
    GMTrace.o(11414949330944L, 85048);
  }
  
  public void requestChildFocus(View paramView1, View paramView2)
  {
    GMTrace.i(11415620419584L, 85053);
    GMTrace.o(11415620419584L, 85053);
  }
  
  public void requestLayout()
  {
    GMTrace.i(11415083548672L, 85049);
    this.kpc = false;
    super.requestLayout();
    GMTrace.o(11415083548672L, 85049);
  }
  
  public void scrollBy(int paramInt1, int paramInt2)
  {
    GMTrace.i(11415486201856L, 85052);
    GMTrace.o(11415486201856L, 85052);
  }
  
  public void scrollTo(int paramInt1, int paramInt2)
  {
    GMTrace.i(11415351984128L, 85051);
    this.kpc = true;
    GMTrace.o(11415351984128L, 85051);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\emoji\ui\EmojiDetailScrollView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */