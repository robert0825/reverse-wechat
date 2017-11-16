package com.tencent.mm.pluginsdk.ui;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.PaintFlagsDrawFilter;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.os.Looper;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.w;

public class j
  extends BitmapDrawable
  implements d.a
{
  protected static final Paint gid;
  protected static final ae gie;
  private Runnable gig;
  private Paint jrC;
  protected final a nPm;
  protected boolean ndd;
  private Rect rect;
  protected String tag;
  protected boolean ttC;
  private int ttD;
  private int ttE;
  protected boolean ttF;
  protected boolean ttG;
  protected float ttH;
  private PaintFlagsDrawFilter ttI;
  private Path ttJ;
  
  static
  {
    GMTrace.i(1180176482304L, 8793);
    Paint localPaint = new Paint();
    gid = localPaint;
    localPaint.setAntiAlias(true);
    gid.setFilterBitmap(true);
    gie = new ae(Looper.getMainLooper());
    GMTrace.o(1180176482304L, 8793);
  }
  
  public j(a parama, String paramString)
  {
    super(parama.oT());
    GMTrace.i(1178968522752L, 8784);
    this.ndd = false;
    this.ttC = false;
    this.ttD = 0;
    this.ttE = 0;
    this.ttH = 1.0F;
    this.rect = new Rect();
    this.ttI = new PaintFlagsDrawFilter(0, 3);
    this.jrC = new Paint();
    this.jrC.setStyle(Paint.Style.STROKE);
    this.jrC.setFlags(1);
    this.jrC.setAntiAlias(true);
    this.ttJ = new Path();
    this.gig = new Runnable()
    {
      public final void run()
      {
        GMTrace.i(1157091033088L, 8621);
        j.this.invalidateSelf();
        GMTrace.o(1157091033088L, 8621);
      }
    };
    this.nPm = parama;
    this.tag = paramString;
    this.nPm.a(this);
    GMTrace.o(1178968522752L, 8784);
  }
  
  public j(a parama, String paramString, boolean paramBoolean)
  {
    super(parama.oT());
    GMTrace.i(1179102740480L, 8785);
    this.ndd = false;
    this.ttC = false;
    this.ttD = 0;
    this.ttE = 0;
    this.ttH = 1.0F;
    this.rect = new Rect();
    this.ttI = new PaintFlagsDrawFilter(0, 3);
    this.jrC = new Paint();
    this.jrC.setStyle(Paint.Style.STROKE);
    this.jrC.setFlags(1);
    this.jrC.setAntiAlias(true);
    this.ttJ = new Path();
    this.gig = new Runnable()
    {
      public final void run()
      {
        GMTrace.i(1157091033088L, 8621);
        j.this.invalidateSelf();
        GMTrace.o(1157091033088L, 8621);
      }
    };
    this.ndd = false;
    this.nPm = parama;
    this.tag = paramString;
    this.nPm.a(this);
    GMTrace.o(1179102740480L, 8785);
  }
  
  public final void bKP()
  {
    GMTrace.i(1179773829120L, 8790);
    this.ttF = true;
    GMTrace.o(1179773829120L, 8790);
  }
  
  public final void bKQ()
  {
    GMTrace.i(1179908046848L, 8791);
    if (!this.ttF)
    {
      GMTrace.o(1179908046848L, 8791);
      return;
    }
    this.ttF = false;
    if (this.ttG)
    {
      this.ttG = false;
      invalidateSelf();
    }
    GMTrace.o(1179908046848L, 8791);
  }
  
  public void draw(Canvas paramCanvas)
  {
    GMTrace.i(1179505393664L, 8788);
    Bitmap localBitmap;
    if (this.ttC)
    {
      localBitmap = this.nPm.b(this.tag, paramCanvas.getWidth(), paramCanvas.getHeight(), 1);
      if ((localBitmap != null) && (!localBitmap.isRecycled())) {
        break label222;
      }
      localBitmap = this.nPm.oT();
      if (!this.ttF) {
        break label214;
      }
      this.ttG = true;
    }
    for (;;)
    {
      Rect localRect2 = getBounds();
      Rect localRect1 = null;
      if ((this.ttH > 1.0F) || (this.ndd))
      {
        int i = localBitmap.getHeight() / 15 / 2;
        int j = localBitmap.getWidth() / 15 / 2;
        localRect1 = new Rect(j, i, localBitmap.getWidth() - j, localBitmap.getHeight() - i);
      }
      paramCanvas.drawBitmap(localBitmap, localRect1, localRect2, gid);
      GMTrace.o(1179505393664L, 8788);
      return;
      if (this.ttF)
      {
        localBitmap = this.nPm.bx(this.tag);
        break;
      }
      localBitmap = this.nPm.bw(this.tag);
      break;
      label214:
      this.ttG = false;
      continue;
      label222:
      this.ttG = false;
    }
  }
  
  public void ib(String paramString)
  {
    GMTrace.i(1179639611392L, 8789);
    if ((paramString == null) || (!paramString.equals(this.tag)))
    {
      GMTrace.o(1179639611392L, 8789);
      return;
    }
    w.v("MicroMsg.SDK.LazyBitmapDrawable", "notifyChanged :%s", new Object[] { paramString });
    gie.post(this.gig);
    GMTrace.o(1179639611392L, 8789);
  }
  
  public final void jY(boolean paramBoolean)
  {
    GMTrace.i(1179371175936L, 8787);
    this.ttC = paramBoolean;
    GMTrace.o(1179371175936L, 8787);
  }
  
  public final void oZ(String paramString)
  {
    GMTrace.i(1179236958208L, 8786);
    if ((paramString == null) || (paramString.length() <= 0))
    {
      GMTrace.o(1179236958208L, 8786);
      return;
    }
    if (!paramString.equals(this.tag))
    {
      this.tag = paramString;
      gie.post(this.gig);
    }
    GMTrace.o(1179236958208L, 8786);
  }
  
  public void onScrollStateChanged(boolean paramBoolean)
  {
    GMTrace.i(1180042264576L, 8792);
    if (paramBoolean)
    {
      this.ttF = true;
      GMTrace.o(1180042264576L, 8792);
      return;
    }
    bKQ();
    GMTrace.o(1180042264576L, 8792);
  }
  
  public static abstract interface a
  {
    public abstract void a(j paramj);
    
    public abstract Bitmap b(String paramString, int paramInt1, int paramInt2, int paramInt3);
    
    public abstract Bitmap bw(String paramString);
    
    public abstract Bitmap bx(String paramString);
    
    public abstract Bitmap oT();
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\pluginsdk\ui\j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */