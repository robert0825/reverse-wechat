package com.tencent.mm.plugin.music.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.MotionEvent;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.pluginsdk.ui.applet.CdnImageView;

public class MusicItemLayout
  extends LinearLayout
{
  private GestureDetector mHA;
  
  public MusicItemLayout(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(4879619719168L, 36356);
    MP();
    GMTrace.o(4879619719168L, 36356);
  }
  
  public MusicItemLayout(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(4879753936896L, 36357);
    MP();
    GMTrace.o(4879753936896L, 36357);
  }
  
  private void MP()
  {
    GMTrace.i(4879888154624L, 36358);
    this.mHA = new GestureDetector(getContext(), new a((byte)0));
    GMTrace.o(4879888154624L, 36358);
  }
  
  public boolean onInterceptTouchEvent(MotionEvent paramMotionEvent)
  {
    GMTrace.i(4880022372352L, 36359);
    b.a locala = (b.a)getTag();
    if (!locala.aTt())
    {
      if ((locala.nsQ.getX() > paramMotionEvent.getX()) || (paramMotionEvent.getX() > locala.nsQ.getX() + locala.nsQ.getMeasuredWidth()) || (locala.nsQ.getY() > paramMotionEvent.getY())) {
        break label131;
      }
      float f1 = paramMotionEvent.getY();
      float f2 = locala.nsQ.getY();
      if (f1 > locala.nsQ.getMeasuredHeight() + f2) {
        break label131;
      }
    }
    label131:
    for (int i = 1; i != 0; i = 0)
    {
      GMTrace.o(4880022372352L, 36359);
      return false;
    }
    GMTrace.o(4880022372352L, 36359);
    return true;
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    GMTrace.i(4880156590080L, 36360);
    this.mHA.onTouchEvent(paramMotionEvent);
    GMTrace.o(4880156590080L, 36360);
    return true;
  }
  
  private final class a
    extends GestureDetector.SimpleOnGestureListener
  {
    private a()
    {
      GMTrace.i(4881498767360L, 36370);
      GMTrace.o(4881498767360L, 36370);
    }
    
    public final boolean onScroll(MotionEvent paramMotionEvent1, MotionEvent paramMotionEvent2, float paramFloat1, float paramFloat2)
    {
      GMTrace.i(4881632985088L, 36371);
      if (Math.abs(paramFloat2) > Math.abs(paramFloat1))
      {
        paramMotionEvent1 = (b.a)MusicItemLayout.this.getTag();
        if (paramFloat2 <= 0.0F) {
          break label53;
        }
        paramMotionEvent1.aTv();
      }
      for (;;)
      {
        GMTrace.o(4881632985088L, 36371);
        return false;
        label53:
        paramMotionEvent1.aTu();
      }
    }
    
    public final boolean onSingleTapUp(MotionEvent paramMotionEvent)
    {
      GMTrace.i(4881767202816L, 36372);
      b.a locala = (b.a)MusicItemLayout.this.getTag();
      if (locala.aTt()) {
        if ((paramMotionEvent.getY() <= locala.nsP.getMeasuredHeight()) && (paramMotionEvent.getY() > 100.0F)) {
          locala.aTw();
        }
      }
      for (;;)
      {
        GMTrace.o(4881767202816L, 36372);
        return false;
        if ((paramMotionEvent.getY() >= locala.nsS.getY() - 100.0F) && (paramMotionEvent.getY() < locala.nsS.getMeasuredHeight() + locala.nsS.getY())) {
          locala.aTw();
        }
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\music\ui\MusicItemLayout.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */