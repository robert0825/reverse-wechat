package com.tencent.mm.plugin.sns.ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.w;
import java.lang.reflect.Field;

public class ShowCommentImageView
  extends ImageView
{
  private static Bitmap pWn;
  private static Bitmap pWo;
  private static Field pWp;
  private static Field pWq;
  private static boolean pWr;
  private boolean pWm;
  
  static
  {
    GMTrace.i(8562285740032L, 63794);
    pWr = false;
    GMTrace.o(8562285740032L, 63794);
  }
  
  public ShowCommentImageView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(8560809345024L, 63783);
    this.pWm = false;
    init();
    GMTrace.o(8560809345024L, 63783);
  }
  
  public ShowCommentImageView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(8560943562752L, 63784);
    this.pWm = false;
    init();
    GMTrace.o(8560943562752L, 63784);
  }
  
  private boolean hZ(boolean paramBoolean)
  {
    GMTrace.i(8561346215936L, 63787);
    if (!pWr)
    {
      GMTrace.o(8561346215936L, 63787);
      return false;
    }
    if (paramBoolean) {}
    try
    {
      for (Field localField = pWp; (Bitmap)localField.get(this) != null; localField = pWq)
      {
        GMTrace.o(8561346215936L, 63787);
        return true;
      }
      GMTrace.o(8561346215936L, 63787);
      return false;
    }
    catch (Exception localException)
    {
      w.printErrStackTrace("MicroMsg.ShowCommentImageView", localException, "", new Object[0]);
      w.e("MicroMsg.ShowCommentImageView", "checkIfCanReuseDrawingCache error: %s", new Object[] { localException.getMessage() });
      GMTrace.o(8561346215936L, 63787);
    }
    return false;
  }
  
  private static void init()
  {
    GMTrace.i(8561077780480L, 63785);
    if ((pWp != null) && (pWq != null))
    {
      GMTrace.o(8561077780480L, 63785);
      return;
    }
    try
    {
      pWp = View.class.getDeclaredField("mDrawingCache");
      pWq = View.class.getDeclaredField("mUnscaledDrawingCache");
      pWp.setAccessible(true);
      pWq.setAccessible(true);
      pWr = true;
      GMTrace.o(8561077780480L, 63785);
      return;
    }
    catch (Exception localException)
    {
      w.e("MicroMsg.ShowCommentImageView", "init error: %s", new Object[] { localException.getMessage() });
      pWr = false;
      GMTrace.o(8561077780480L, 63785);
    }
  }
  
  private void u(boolean paramBoolean1, boolean paramBoolean2)
  {
    GMTrace.i(8561480433664L, 63788);
    if (paramBoolean1) {}
    try
    {
      for (Field localField = pWp; paramBoolean2; localField = pWq)
      {
        localField.set(this, null);
        GMTrace.o(8561480433664L, 63788);
        return;
      }
      Bitmap localBitmap;
      if (paramBoolean1)
      {
        localBitmap = pWo;
        if (localBitmap != null) {
          break label112;
        }
      }
      label112:
      for (paramBoolean2 = true;; paramBoolean2 = false)
      {
        w.d("MicroMsg.ShowCommentImageView", "setDrawingCache, autoScale: %s, cache==null: %s", new Object[] { Boolean.valueOf(paramBoolean1), Boolean.valueOf(paramBoolean2) });
        if (localBitmap != null) {
          localField.set(this, localBitmap);
        }
        GMTrace.o(8561480433664L, 63788);
        return;
        localBitmap = pWn;
        break;
      }
      return;
    }
    catch (Exception localException)
    {
      w.e("MicroMsg.ShowCommentImageView", "setDrawingCache error: %s", new Object[] { localException.getMessage() });
      GMTrace.o(8561480433664L, 63788);
    }
  }
  
  public void buildDrawingCache(boolean paramBoolean)
  {
    GMTrace.i(8561211998208L, 63786);
    Object localObject;
    if (pWr) {
      if (!this.pWm) {
        if (!hZ(paramBoolean))
        {
          if (paramBoolean) {}
          for (localObject = pWo; (localObject != null) && (!((Bitmap)localObject).isRecycled()); localObject = pWn)
          {
            u(paramBoolean, false);
            GMTrace.o(8561211998208L, 63786);
            return;
          }
          super.buildDrawingCache(paramBoolean);
          if (!paramBoolean) {}
        }
      }
    }
    for (;;)
    {
      try
      {
        localObject = pWp;
        localObject = (Bitmap)((Field)localObject).get(this);
        if (localObject != null) {
          break label226;
        }
        bool = true;
        w.d("MicroMsg.ShowCommentImageView", "getStaticDrawingCache, autoScale: %s, cache==null: %s", new Object[] { Boolean.valueOf(paramBoolean), Boolean.valueOf(bool) });
        if (localObject == null) {
          break label183;
        }
        if (!paramBoolean) {
          break label179;
        }
        pWo = (Bitmap)localObject;
        GMTrace.o(8561211998208L, 63786);
        return;
      }
      catch (Exception localException)
      {
        w.e("MicroMsg.ShowCommentImageView", "getStaticDrawingCache error: %s", new Object[] { localException.getMessage() });
        GMTrace.o(8561211998208L, 63786);
        return;
      }
      Field localField = pWq;
      continue;
      label179:
      pWn = localField;
      label183:
      GMTrace.o(8561211998208L, 63786);
      return;
      super.buildDrawingCache(paramBoolean);
      GMTrace.o(8561211998208L, 63786);
      return;
      u(paramBoolean, true);
      super.buildDrawingCache(paramBoolean);
      GMTrace.o(8561211998208L, 63786);
      return;
      label226:
      boolean bool = false;
    }
  }
  
  public void destroyDrawingCache()
  {
    GMTrace.i(8561748869120L, 63790);
    super.destroyDrawingCache();
    GMTrace.o(8561748869120L, 63790);
  }
  
  protected void onDetachedFromWindow()
  {
    GMTrace.i(8561614651392L, 63789);
    try
    {
      pWp.set(this, null);
      pWq.set(this, null);
      super.onDetachedFromWindow();
      GMTrace.o(8561614651392L, 63789);
      return;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        w.e("MicroMsg.ShowCommentImageView", "setDrawingCache error: %s", new Object[] { localException.getMessage() });
      }
    }
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    GMTrace.i(8562017304576L, 63792);
    if ((paramMotionEvent.getAction() == 3) || (paramMotionEvent.getAction() == 1)) {
      postDelayed(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(8369414864896L, 62357);
          ShowCommentImageView.a(ShowCommentImageView.this, false);
          GMTrace.o(8369414864896L, 62357);
        }
      }, 100L);
    }
    for (;;)
    {
      boolean bool = super.onTouchEvent(paramMotionEvent);
      GMTrace.o(8562017304576L, 63792);
      return bool;
      this.pWm = true;
    }
  }
  
  public void setOnClickListener(final View.OnClickListener paramOnClickListener)
  {
    GMTrace.i(8561883086848L, 63791);
    super.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(8683081695232L, 64694);
        ShowCommentImageView.a(ShowCommentImageView.this, true);
        paramOnClickListener.onClick(paramAnonymousView);
        GMTrace.o(8683081695232L, 64694);
      }
    });
    GMTrace.o(8561883086848L, 63791);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\sns\ui\ShowCommentImageView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */