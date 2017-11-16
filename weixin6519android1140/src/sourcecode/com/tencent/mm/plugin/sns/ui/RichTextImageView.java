package com.tencent.mm.plugin.sns.ui;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.text.Layout;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.sns.i.f;
import com.tencent.mm.plugin.sns.i.g;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.w;

public class RichTextImageView
  extends LinearLayout
{
  private Activity eNu;
  private TextView hqi;
  private ImageView mRX;
  private TextView pPN;
  private TextView pWg;
  private boolean pWh;
  private String pWi;
  
  public RichTextImageView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(8766162468864L, 65313);
    this.pWh = false;
    this.eNu = ((Activity)paramContext);
    paramContext = inflate(this.eNu, i.g.pge, this);
    this.pPN = ((TextView)paramContext.findViewById(i.f.pbK));
    this.hqi = ((TextView)paramContext.findViewById(i.f.pep));
    this.pWg = ((TextView)paramContext.findViewById(i.f.oZZ));
    this.mRX = ((ImageView)paramContext.findViewById(i.f.paQ));
    GMTrace.o(8766162468864L, 65313);
  }
  
  protected void onLayout(boolean paramBoolean, final int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    GMTrace.i(8766296686592L, 65314);
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    if (!this.pWh)
    {
      GMTrace.o(8766296686592L, 65314);
      return;
    }
    if (this.pWi == null)
    {
      GMTrace.o(8766296686592L, 65314);
      return;
    }
    w.d("MicroMsg.RichTextImageView", "onLayout  Heighth:" + this.pPN.getHeight() + " LineHeight:" + this.pPN.getLineHeight());
    paramInt3 = this.pPN.getHeight() / this.pPN.getLineHeight();
    int i = this.pPN.getLineCount();
    Rect localRect = new Rect();
    paramInt1 = 0;
    paramInt2 = 0;
    for (;;)
    {
      if (paramInt1 < paramInt3) {
        try
        {
          this.pPN.getLineBounds(paramInt1, localRect);
          paramInt2 += localRect.height();
          if (paramInt2 <= this.pPN.getHeight()) {
            paramInt1 += 1;
          }
        }
        catch (IndexOutOfBoundsException localIndexOutOfBoundsException) {}
      }
    }
    if ((i >= paramInt1) && (this.pWh))
    {
      paramInt2 = paramInt1;
      if (paramInt1 <= 0) {
        paramInt2 = 1;
      }
      paramInt1 = this.pPN.getLayout().getLineVisibleEnd(paramInt2 - 1);
      w.e("test", "bottomH:" + this.pWg.getHeight() + "length" + this.pWi.substring(paramInt1, this.pWi.length()).length());
      w.e("test", "bottomH:" + this.pWg.getHeight());
      if (this.pWg.getText().length() > 0)
      {
        this.pWg.setVisibility(0);
        this.pWh = false;
        new ae().post(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(8578257649664L, 63913);
            RichTextImageView.b(RichTextImageView.this).setText(RichTextImageView.a(RichTextImageView.this).substring(0, paramInt1));
            RichTextImageView.c(RichTextImageView.this).setText(RichTextImageView.a(RichTextImageView.this).substring(paramInt1, RichTextImageView.a(RichTextImageView.this).length()));
            RichTextImageView.c(RichTextImageView.this).invalidate();
            RichTextImageView.d(RichTextImageView.this);
            w.e("test", "bottomH:" + RichTextImageView.c(RichTextImageView.this).getHeight());
            GMTrace.o(8578257649664L, 63913);
          }
        });
      }
      w.e("test", "bottom:" + paramInt4 + "   mesH:" + this.pWg.getMeasuredHeight());
    }
    GMTrace.o(8766296686592L, 65314);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\sns\ui\RichTextImageView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */