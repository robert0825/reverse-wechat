package com.tencent.mm.t;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Style;
import android.graphics.Rect;
import android.text.Layout;
import android.text.SpannableString;
import android.text.TextPaint;
import android.util.DisplayMetrics;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.bg.a.c;
import com.tencent.mm.pluginsdk.ui.d.h;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.widget.celltextview.g.b;

public final class e
  extends c
{
  private static TextPaint fB;
  private static final float fWO;
  private static final int fWP;
  private static final int fWQ;
  public SpannableString fWR;
  public int rz;
  
  static
  {
    GMTrace.i(19625584623616L, 146222);
    fWO = ab.getResources().getDimension(a.c.tkO);
    fWP = (int)ab.getResources().getDimension(a.c.tkU);
    fWQ = (int)ab.getResources().getDimension(a.c.tkV);
    TextPaint localTextPaint = new TextPaint(1);
    fB = localTextPaint;
    localTextPaint.setStrokeCap(Paint.Cap.ROUND);
    fB.setStyle(Paint.Style.FILL);
    fB.setDither(true);
    fB.setTextSize(fWO);
    GMTrace.o(19625584623616L, 146222);
  }
  
  public e(Context paramContext, Matrix paramMatrix, String paramString, Rect paramRect, SpannableString paramSpannableString, int paramInt)
  {
    super(paramContext, paramMatrix, paramString, paramRect);
    GMTrace.i(19625181970432L, 146219);
    this.rz = -1;
    this.rz = paramInt;
    this.fWR = paramSpannableString;
    GMTrace.o(19625181970432L, 146219);
  }
  
  public final void setSelected(boolean paramBoolean)
  {
    GMTrace.i(19625450405888L, 146221);
    super.setSelected(paramBoolean);
    if (!paramBoolean) {
      this.fWz = false;
    }
    GMTrace.o(19625450405888L, 146221);
  }
  
  protected final Bitmap wc()
  {
    GMTrace.i(19625316188160L, 146220);
    fB.setColor(this.rz);
    if (this.fWR == null)
    {
      GMTrace.o(19625316188160L, 146220);
      return null;
    }
    TextView localTextView = new TextView(this.mContext);
    localTextView.setTextSize(Math.round(fWO / this.mContext.getResources().getDisplayMetrics().density));
    localTextView.setText(h.b(this.mContext, this.fWR, fWO / 1.3F));
    localTextView.setSingleLine(false);
    localTextView.setMaxWidth((int)(b.getScreenWidth(this.mContext) - this.mContext.getResources().getDimension(a.c.tkN) * 2.0F));
    localTextView.measure(0, 0);
    Bitmap localBitmap = Bitmap.createBitmap(localTextView.getMeasuredWidth(), localTextView.getMeasuredHeight(), Bitmap.Config.ARGB_8888);
    Canvas localCanvas = new Canvas(localBitmap);
    localTextView.getLayout().getPaint().setColor(this.rz);
    localTextView.getLayout().draw(localCanvas);
    GMTrace.o(19625316188160L, 146220);
    return localBitmap;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\t\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */