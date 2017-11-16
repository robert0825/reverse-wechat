package com.tencent.mm.ui.base;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Align;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.br.a;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.b;
import com.tencent.mm.v.a.f;
import com.tencent.mm.v.a.g;
import com.tencent.mm.v.a.k;

public abstract class VerticalScrollBar
  extends View
{
  private float gbV;
  private Paint jrC;
  public float mpn;
  public int mpo;
  public String[] mpp;
  private int mpq;
  private float mpr;
  private float mps;
  private q mpt;
  private TextView mpu;
  private int mpv;
  public a wiZ;
  
  public VerticalScrollBar(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(3160424841216L, 23547);
    this.mpr = 0.0F;
    anP();
    setFocusable(true);
    setFocusableInTouchMode(true);
    this.mpv = BackwardSupportUtil.b.a(paramContext, 3.0F);
    paramAttributeSet = inflate(paramContext, aJh(), null);
    int i = BackwardSupportUtil.b.a(paramContext, this.mpo);
    this.mpt = new q(paramAttributeSet, i, i);
    this.mpu = ((TextView)paramAttributeSet.findViewById(a.g.ceL));
    this.jrC = new Paint();
    this.jrC.setAntiAlias(true);
    this.jrC.setColor(-11119018);
    this.jrC.setTextAlign(Paint.Align.CENTER);
    GMTrace.o(3160424841216L, 23547);
  }
  
  public abstract int aJh();
  
  public abstract void anP();
  
  protected void onDraw(Canvas paramCanvas)
  {
    GMTrace.i(3160559058944L, 23548);
    super.onDraw(paramCanvas);
    final int i = getMeasuredHeight();
    final int j = getMeasuredWidth();
    this.gbV = (i / (this.mpp.length * this.mpn));
    this.jrC.setTextSize(this.gbV);
    if (this.mpr != this.gbV)
    {
      this.mpr = this.gbV;
      post(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(3278402224128L, 24426);
          if (VerticalScrollBar.this.mpp.length <= 0)
          {
            GMTrace.o(3278402224128L, 24426);
            return;
          }
          int i = (int)VerticalScrollBar.a(VerticalScrollBar.this).measureText(VerticalScrollBar.this.mpp[(VerticalScrollBar.this.mpp.length - 1)]) + a.fromDPToPix(VerticalScrollBar.this.getContext(), 8);
          if (i > j)
          {
            ViewGroup.LayoutParams localLayoutParams = VerticalScrollBar.this.getLayoutParams();
            localLayoutParams.width = i;
            localLayoutParams.height = i;
            VerticalScrollBar.this.setLayoutParams(localLayoutParams);
          }
          GMTrace.o(3278402224128L, 24426);
        }
      });
    }
    i = 0;
    while (i < this.mpp.length)
    {
      paramCanvas.drawText(this.mpp[i], j / 2.0F, this.gbV + i * this.gbV * this.mpn, this.jrC);
      i += 1;
    }
    GMTrace.o(3160559058944L, 23548);
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    GMTrace.i(3160693276672L, 23549);
    if ((paramMotionEvent.getAction() == 0) || (paramMotionEvent.getAction() == 2))
    {
      this.mps = paramMotionEvent.getY();
      if (this.mps < 0.0F) {
        this.mps = 0.0F;
      }
      if (this.mps > getMeasuredHeight()) {
        this.mps = getMeasuredHeight();
      }
      setBackgroundDrawable(a.b(getContext(), a.f.aZN));
      int j = (int)(this.mps / (this.gbV * this.mpn));
      int i = j;
      if (j >= this.mpp.length) {
        i = this.mpp.length - 1;
      }
      this.mpq = i;
      if (this.mpq != -1) {
        break label229;
      }
      this.mpu.setText(a.k.dVW);
      this.mpt.showAtLocation(this, 17, 0, 0);
      if (this.wiZ != null)
      {
        if (this.mpq != -1) {
          break label248;
        }
        this.wiZ.uW(a.X(getContext(), a.k.dVW));
      }
    }
    for (;;)
    {
      invalidate();
      if ((paramMotionEvent.getAction() == 1) || (paramMotionEvent.getAction() == 3))
      {
        setBackgroundResource(0);
        this.mpt.dismiss();
      }
      GMTrace.o(3160693276672L, 23549);
      return true;
      label229:
      this.mpu.setText(this.mpp[this.mpq]);
      break;
      label248:
      this.wiZ.uW(this.mpp[this.mpq]);
    }
  }
  
  public static abstract interface a
  {
    public abstract void uW(String paramString);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\base\VerticalScrollBar.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */