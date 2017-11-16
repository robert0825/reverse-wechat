package com.tencent.mm.plugin.facedetect.views;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.br.a;
import com.tencent.mm.plugin.facedetect.a.b;
import com.tencent.mm.plugin.facedetect.a.c;
import com.tencent.mm.plugin.facedetect.a.d;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.w;
import java.lang.ref.WeakReference;
import java.util.Timer;
import java.util.TimerTask;

public class FaceNumberItemView
  extends View
{
  static final long kZo;
  Timer kZn;
  private boolean kZp;
  private Paint kZq;
  private RectF kZr;
  private Bitmap kZs;
  public int kZt;
  int kZu;
  Runnable kZv;
  
  static
  {
    GMTrace.i(5923162554368L, 44131);
    kZo = 29L;
    GMTrace.o(5923162554368L, 44131);
  }
  
  public FaceNumberItemView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
    GMTrace.i(5922223030272L, 44124);
    GMTrace.o(5922223030272L, 44124);
  }
  
  public FaceNumberItemView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(5922357248000L, 44125);
    this.kZn = null;
    this.kZp = false;
    this.kZq = null;
    this.kZr = null;
    this.kZs = null;
    this.kZt = 17;
    this.kZu = 0;
    this.kZv = new Runnable()
    {
      public final void run()
      {
        GMTrace.i(5913498877952L, 44059);
        if (FaceNumberItemView.a(FaceNumberItemView.this) <= 30)
        {
          FaceNumberItemView.b(FaceNumberItemView.this);
          FaceNumberItemView.this.invalidate();
          GMTrace.o(5913498877952L, 44059);
          return;
        }
        FaceNumberItemView.this.axp();
        GMTrace.o(5913498877952L, 44059);
      }
    };
    setLayerType(1, null);
    this.kZq = new Paint();
    this.kZq.setColor(paramContext.getResources().getColor(a.b.kPe));
    this.kZq.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_ATOP));
    this.kZr = new RectF();
    GMTrace.o(5922357248000L, 44125);
  }
  
  public final void axp()
  {
    GMTrace.i(5922625683456L, 44127);
    if (this.kZn != null)
    {
      this.kZn.cancel();
      this.kZn = null;
    }
    GMTrace.o(5922625683456L, 44127);
  }
  
  protected void onDraw(Canvas paramCanvas)
  {
    GMTrace.i(5922759901184L, 44128);
    super.onDraw(paramCanvas);
    float f2;
    float f1;
    if (this.kZt == 17)
    {
      f2 = getWidth() - this.kZs.getWidth() >> 1;
      f1 = getHeight() - this.kZs.getHeight() >> 1;
    }
    for (;;)
    {
      if (!this.kZp) {
        paramCanvas.drawBitmap(this.kZs, f2, f1, null);
      }
      this.kZr.set(f2, 0.0F, this.kZs.getWidth() * this.kZu / 30.0F + f2, getHeight());
      paramCanvas.drawRect(this.kZr, this.kZq);
      GMTrace.o(5922759901184L, 44128);
      return;
      if (this.kZt == 3)
      {
        f1 = getHeight() - this.kZs.getHeight() >> 1;
        f2 = 0.0F;
      }
      else if (this.kZt == 5)
      {
        f2 = getWidth() - this.kZs.getWidth();
        f1 = getHeight() - this.kZs.getHeight() >> 1;
      }
      else
      {
        w.e("MicroMsg.FaceNumberItemView", "hy: not support gravity! treat as center");
        f2 = getWidth() - this.kZs.getWidth() >> 1;
        f1 = getHeight() - this.kZs.getHeight() >> 1;
      }
    }
  }
  
  public final void setImageResource(int paramInt)
  {
    GMTrace.i(5922491465728L, 44126);
    Bitmap localBitmap1 = BitmapFactory.decodeResource(getResources(), paramInt);
    if (paramInt == a.d.kPy)
    {
      paramInt = (getResources().getDimensionPixelSize(a.c.kPi) - a.fromDPToPix(getContext(), 8)) / 2;
      Bitmap localBitmap2 = Bitmap.createBitmap(localBitmap1.getWidth() + paramInt * 2, localBitmap1.getHeight() + 0, Bitmap.Config.ARGB_8888);
      Canvas localCanvas = new Canvas(localBitmap2);
      localCanvas.drawARGB(0, 255, 255, 255);
      localCanvas.drawBitmap(localBitmap1, paramInt, 0.0F, null);
      this.kZs = localBitmap2;
      GMTrace.o(5922491465728L, 44126);
      return;
    }
    this.kZs = Bitmap.createScaledBitmap(localBitmap1, a.fromDPToPix(getContext(), 48), localBitmap1.getHeight(), false);
    GMTrace.o(5922491465728L, 44126);
  }
  
  private final class a
    extends TimerTask
  {
    private WeakReference<Runnable> kZx;
    
    private a(Runnable paramRunnable)
    {
      GMTrace.i(5918196498432L, 44094);
      this.kZx = null;
      this.kZx = new WeakReference(paramRunnable);
      GMTrace.o(5918196498432L, 44094);
    }
    
    public final void run()
    {
      GMTrace.i(5918330716160L, 44095);
      if ((this.kZx != null) && (this.kZx.get() != null))
      {
        af.t((Runnable)this.kZx.get());
        GMTrace.o(5918330716160L, 44095);
        return;
      }
      cancel();
      GMTrace.o(5918330716160L, 44095);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\facedetect\views\FaceNumberItemView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */