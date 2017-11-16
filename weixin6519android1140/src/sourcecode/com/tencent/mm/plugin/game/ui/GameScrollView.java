package com.tencent.mm.plugin.game.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.MotionEvent;
import android.widget.ScrollView;
import com.tencent.gmtrace.GMTrace;

public class GameScrollView
  extends ScrollView
{
  private GestureDetector imP;
  
  public GameScrollView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(12724109049856L, 94802);
    this.imP = new GestureDetector(paramContext, new a());
    setFadingEdgeLength(0);
    GMTrace.o(12724109049856L, 94802);
  }
  
  public boolean onInterceptTouchEvent(MotionEvent paramMotionEvent)
  {
    GMTrace.i(12724243267584L, 94803);
    if ((super.onInterceptTouchEvent(paramMotionEvent)) && (this.imP.onTouchEvent(paramMotionEvent)))
    {
      GMTrace.o(12724243267584L, 94803);
      return true;
    }
    GMTrace.o(12724243267584L, 94803);
    return false;
  }
  
  final class a
    extends GestureDetector.SimpleOnGestureListener
  {
    a()
    {
      GMTrace.i(12744241709056L, 94952);
      GMTrace.o(12744241709056L, 94952);
    }
    
    public final boolean onScroll(MotionEvent paramMotionEvent1, MotionEvent paramMotionEvent2, float paramFloat1, float paramFloat2)
    {
      GMTrace.i(12744375926784L, 94953);
      if (Math.abs(paramFloat2) > Math.abs(paramFloat1))
      {
        GMTrace.o(12744375926784L, 94953);
        return true;
      }
      GMTrace.o(12744375926784L, 94953);
      return false;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\game\ui\GameScrollView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */