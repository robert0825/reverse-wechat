package com.tencent.mm.plugin.webview.ui.tools.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.ImageView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.br.a;
import com.tencent.mm.sdk.platformtools.w;

public class MovingImageButton
  extends ImageView
{
  private int ivM;
  private int ivN;
  private int jsh;
  private int jsi;
  private int lUQ;
  private Context mContext;
  private int rVH;
  private int rVI;
  private int rVJ;
  private int rVK;
  private ViewGroup.MarginLayoutParams rVL;
  private final int rVM;
  private int rVN;
  private boolean rVO;
  public boolean rVP;
  private int x;
  private int y;
  
  public MovingImageButton(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(12068723884032L, 89919);
    this.rVJ = 0;
    this.rVK = 0;
    this.rVM = 100;
    this.rVO = false;
    this.rVP = true;
    this.mContext = paramContext;
    GMTrace.o(12068723884032L, 89919);
  }
  
  public MovingImageButton(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(12068858101760L, 89920);
    this.rVJ = 0;
    this.rVK = 0;
    this.rVM = 100;
    this.rVO = false;
    this.rVP = true;
    this.mContext = paramContext;
    GMTrace.o(12068858101760L, 89920);
  }
  
  protected void onFinishInflate()
  {
    GMTrace.i(12068992319488L, 89921);
    super.onFinishInflate();
    this.rVN = a.fromDPToPix(this.mContext, 100);
    this.jsh = a.ef(this.mContext);
    this.jsi = a.eg(this.mContext);
    this.lUQ = ViewConfiguration.get(this.mContext).getScaledTouchSlop();
    GMTrace.o(12068992319488L, 89921);
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    GMTrace.i(12069126537216L, 89922);
    if (!this.rVP)
    {
      boolean bool = super.onTouchEvent(paramMotionEvent);
      GMTrace.o(12069126537216L, 89922);
      return bool;
    }
    if ((this.rVJ == 0) || (this.rVK == 0))
    {
      Rect localRect = new Rect();
      getWindowVisibleDisplayFrame(localRect);
      this.rVJ = (localRect.right - localRect.left);
      this.rVK = (localRect.bottom - localRect.top);
      w.d("MicroMsg.MovingImageButton", "right = %d, top = %d, left = %d, bottom = %d, screenX = %d, screenY = %d", new Object[] { Integer.valueOf(localRect.right), Integer.valueOf(localRect.top), Integer.valueOf(localRect.left), Integer.valueOf(localRect.bottom), Integer.valueOf(this.rVJ), Integer.valueOf(this.rVK) });
    }
    this.x = ((int)paramMotionEvent.getRawX());
    this.y = ((int)paramMotionEvent.getRawY());
    switch (paramMotionEvent.getAction())
    {
    }
    for (;;)
    {
      this.ivM = this.x;
      this.ivN = this.y;
      GMTrace.o(12069126537216L, 89922);
      return true;
      this.rVH = this.x;
      this.rVI = this.y;
      continue;
      int i = this.x - this.ivM;
      int j = this.y - this.ivN;
      if ((i != 0) || (j != 0))
      {
        this.rVL = ((ViewGroup.MarginLayoutParams)getLayoutParams());
        paramMotionEvent = this.rVL;
        int k = paramMotionEvent.rightMargin;
        paramMotionEvent.rightMargin = (-i + k);
        paramMotionEvent = this.rVL;
        paramMotionEvent.topMargin += j;
        if (this.rVL.rightMargin < 0)
        {
          this.rVL.rightMargin = 0;
          label353:
          if (this.rVL.topMargin >= 0) {
            break label416;
          }
          this.rVL.topMargin = 0;
        }
        for (;;)
        {
          requestLayout();
          break;
          if (this.rVL.rightMargin <= this.rVJ - getWidth()) {
            break label353;
          }
          this.rVL.rightMargin = (this.rVJ - getWidth());
          break label353;
          label416:
          if (this.rVL.topMargin > this.rVK - getHeight()) {
            this.rVL.topMargin = (this.rVK - getHeight());
          }
        }
        if (Math.abs(this.rVH - this.x) + Math.abs(this.rVI - this.y) > this.lUQ)
        {
          if (this.y < this.rVN) {
            this.rVL.topMargin = 0;
          }
          for (;;)
          {
            requestLayout();
            break;
            if (this.y > this.rVK - this.rVN) {
              this.rVL.topMargin = (this.rVK - getHeight());
            } else if (this.x > this.rVJ / 2) {
              this.rVL.rightMargin = 0;
            } else {
              this.rVL.rightMargin = (this.rVJ - getWidth());
            }
          }
        }
        performClick();
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\webview\ui\tools\widget\MovingImageButton.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */