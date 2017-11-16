package com.tencent.mm.t;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PaintFlagsDrawFilter;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.NinePatchDrawable;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.api.i;
import com.tencent.mm.bg.a.d;
import com.tencent.mm.sdk.platformtools.d;
import com.tencent.mm.sdk.platformtools.w;
import java.util.ArrayList;
import java.util.List;

public class c
  implements Cloneable
{
  public List<PointF> fWA;
  public float fWB;
  private float fWC;
  private Rect fWn;
  public String fWq;
  private i fWr;
  public Bitmap fWs;
  public PointF fWt;
  private float fWu;
  public boolean fWv;
  public PointF fWw;
  private float fWx;
  private float fWy;
  public boolean fWz;
  public float fy;
  protected Context mContext;
  private Matrix mMatrix;
  public int mRotation;
  
  public c(Context paramContext, Matrix paramMatrix, String paramString, Rect paramRect)
  {
    GMTrace.i(19622497615872L, 146199);
    this.mRotation = 0;
    this.fy = 1.0F;
    this.fWu = 1.0F;
    this.fWz = false;
    this.fWA = new ArrayList();
    this.fWq = paramString;
    this.mMatrix = paramMatrix;
    this.mContext = paramContext;
    this.fWn = paramRect;
    this.fWt = new PointF();
    this.fWw = new PointF();
    GMTrace.o(19622497615872L, 146199);
  }
  
  public c(Context paramContext, Matrix paramMatrix, String paramString, i parami, Rect paramRect)
  {
    GMTrace.i(19622363398144L, 146198);
    this.mRotation = 0;
    this.fy = 1.0F;
    this.fWu = 1.0F;
    this.fWz = false;
    this.fWA = new ArrayList();
    this.fWq = paramString;
    this.mMatrix = paramMatrix;
    this.fWr = parami;
    this.mContext = paramContext;
    this.fWn = paramRect;
    this.fWt = new PointF();
    this.fWw = new PointF();
    GMTrace.o(19622363398144L, 146198);
  }
  
  private Bitmap e(Bitmap paramBitmap)
  {
    GMTrace.i(19623839793152L, 146209);
    int i = (int)(paramBitmap.getWidth() + 80.0F);
    int j = (int)(paramBitmap.getHeight() + 80.0F);
    Bitmap localBitmap = Bitmap.createBitmap(i, j, Bitmap.Config.ARGB_8888);
    Canvas localCanvas = new Canvas(localBitmap);
    localCanvas.drawBitmap(paramBitmap, 40.0F, 40.0F, null);
    paramBitmap = BitmapFactory.decodeResource(this.mContext.getResources(), a.d.tkX).getNinePatchChunk();
    paramBitmap = new NinePatchDrawable(this.mContext.getResources(), BitmapFactory.decodeResource(this.mContext.getResources(), a.d.tkX), paramBitmap, new Rect(), null);
    paramBitmap.setBounds(0, 0, i, j);
    paramBitmap.draw(localCanvas);
    GMTrace.o(19623839793152L, 146209);
    return localBitmap;
  }
  
  private int wa()
  {
    GMTrace.i(19623437139968L, 146206);
    if (this.fWs != null)
    {
      int i = this.fWs.getWidth();
      GMTrace.o(19623437139968L, 146206);
      return i;
    }
    GMTrace.o(19623437139968L, 146206);
    return 0;
  }
  
  private int wb()
  {
    GMTrace.i(19623571357696L, 146207);
    if (this.fWs != null)
    {
      int i = this.fWs.getHeight();
      GMTrace.o(19623571357696L, 146207);
      return i;
    }
    GMTrace.o(19623571357696L, 146207);
    return 0;
  }
  
  public PointF I(float paramFloat)
  {
    GMTrace.i(19624108228608L, 146211);
    PointF localPointF = new PointF();
    double d1 = (this.mRotation + paramFloat) * 3.141592653589793D / 180.0D;
    localPointF.x = (this.fWt.x + (float)(this.fWC * Math.cos(d1)));
    paramFloat = this.fWt.y;
    double d2 = this.fWC;
    localPointF.y = (paramFloat + (float)(Math.sin(d1) * d2));
    GMTrace.o(19624108228608L, 146211);
    return localPointF;
  }
  
  public final void a(float paramFloat1, float paramFloat2, float paramFloat3, int paramInt)
  {
    GMTrace.i(19622631833600L, 146200);
    this.fWs = e(wc());
    this.fWx = (1.2F * this.fWn.width() / this.fWs.getWidth());
    this.fWy = (0.1F * this.fWn.width() / this.fWs.getWidth());
    this.fWu = paramFloat3;
    this.mRotation = paramInt;
    this.fy /= paramFloat3;
    w.i("MicroMsg.EmojiItem", "MAX_SCALE:%s MIN_SCALE:%s mInitScale:%s", new Object[] { Float.valueOf(this.fWx), Float.valueOf(this.fWy), Float.valueOf(this.fWu) });
    this.fWt.set(paramFloat1, paramFloat2);
    w.d("MicroMsg.EmojiItem", "[setPoint] point:%s", new Object[] { this.fWt });
    wd();
    GMTrace.o(19622631833600L, 146200);
  }
  
  public final void b(float paramFloat1, float paramFloat2, float paramFloat3, int paramInt)
  {
    GMTrace.i(19623034486784L, 146203);
    this.fWt.offset(paramFloat1, paramFloat2);
    if (0.0F != paramFloat3) {
      this.fy = paramFloat3;
    }
    this.mRotation = paramInt;
    GMTrace.o(19623034486784L, 146203);
  }
  
  public final void clear()
  {
    GMTrace.i(19623168704512L, 146204);
    w.i("MicroMsg.EmojiItem", "[clear]");
    if ((this.fWs != null) && (!this.fWs.isRecycled()))
    {
      this.fWs.recycle();
      this.fWs = null;
    }
    GMTrace.o(19623168704512L, 146204);
  }
  
  public final void draw(Canvas paramCanvas)
  {
    GMTrace.i(19623302922240L, 146205);
    if ((this.fWs == null) || (this.fWs.isRecycled()))
    {
      w.w("MicroMsg.EmojiItem", "[draw] null == bitmap || bitmap isRecycled");
      GMTrace.o(19623302922240L, 146205);
      return;
    }
    paramCanvas.setDrawFilter(new PaintFlagsDrawFilter(0, 3));
    if (this.fWx < this.fy * this.fWu)
    {
      this.fy = (this.fWx / this.fWu);
      paramCanvas.save();
      paramCanvas.translate(this.fWt.x, this.fWt.y);
      paramCanvas.rotate(this.mRotation);
      paramCanvas.scale(this.fy, this.fy);
      if (!this.fWv) {
        break label215;
      }
      paramCanvas.drawBitmap(this.fWs, -wa() / 2, -wb() / 2, null);
    }
    for (;;)
    {
      paramCanvas.restore();
      paramCanvas.setDrawFilter(null);
      GMTrace.o(19623302922240L, 146205);
      return;
      if (this.fWy <= this.fy * this.fWu) {
        break;
      }
      this.fy = (this.fWy / this.fWu);
      break;
      label215:
      paramCanvas.clipRect(-wa() / 2 + 40.0F, -wb() / 2 + 40.0F, this.fWs.getWidth() / 2 - 40.0F, this.fWs.getHeight() / 2 - 40.0F);
      paramCanvas.drawBitmap(this.fWs, -wa() / 2, -wb() / 2, null);
    }
  }
  
  public void setSelected(boolean paramBoolean)
  {
    GMTrace.i(19622900269056L, 146202);
    this.fWv = paramBoolean;
    GMTrace.o(19622900269056L, 146202);
  }
  
  public final boolean vZ()
  {
    GMTrace.i(19622766051328L, 146201);
    w.d("MicroMsg.EmojiItem", "[checkBitmap]");
    if ((this.fWs == null) || (this.fWs.isRecycled()))
    {
      this.fWs = e(wc());
      GMTrace.o(19622766051328L, 146201);
      return true;
    }
    GMTrace.o(19622766051328L, 146201);
    return false;
  }
  
  protected Bitmap wc()
  {
    GMTrace.i(19623705575424L, 146208);
    if ((this.fWs == null) || (this.fWs.isRecycled())) {
      this.fWs = this.fWr.ae(this.mContext);
    }
    if (this.fWs == null)
    {
      w.e("MicroMsg.EmojiItem", "[getEmojiBitmap] NULL!");
      new d();
      this.fWs = d.createBitmap(120, 120, Bitmap.Config.ARGB_4444);
      new Canvas(this.fWs).drawColor(-7829368);
    }
    Bitmap localBitmap = this.fWs;
    GMTrace.o(19623705575424L, 146208);
    return localBitmap;
  }
  
  public final void wd()
  {
    GMTrace.i(19623974010880L, 146210);
    double d1 = wa() * 1.0F / 2.0F;
    double d2 = wb() * 1.0F / 2.0F;
    this.fWC = ((float)Math.sqrt(d1 * d1 + d2 * d2));
    this.fWC *= this.fy / this.fWu;
    this.fWB = ((float)Math.toDegrees(Math.atan(d2 / d1)));
    GMTrace.o(19623974010880L, 146210);
  }
  
  public final c we()
  {
    GMTrace.i(19624242446336L, 146212);
    for (;;)
    {
      try
      {
        c localc = (c)super.clone();
        w.printErrStackTrace("MicroMsg.EmojiItem", localCloneNotSupportedException1, "", new Object[0]);
      }
      catch (CloneNotSupportedException localCloneNotSupportedException1)
      {
        try
        {
          localc.fWt = new PointF(this.fWt.x, this.fWt.y);
          localc.fWr = this.fWr;
          GMTrace.o(19624242446336L, 146212);
          return localc;
        }
        catch (CloneNotSupportedException localCloneNotSupportedException2)
        {
          for (;;) {}
        }
        localCloneNotSupportedException1 = localCloneNotSupportedException1;
        localc = null;
      }
    }
  }
  
  private final class a
  {
    public float[] fWD;
    public float[] fWE;
    public int fWF;
    
    public a()
    {
      GMTrace.i(19626121494528L, 146226);
      Object localObject;
      this.fWF = ((List)localObject).size();
      this.fWD = new float[this.fWF];
      this.fWE = new float[this.fWF];
      int i = 0;
      while (i < this.fWF)
      {
        this.fWD[i] = ((PointF)((List)localObject).get(i)).x;
        this.fWE[i] = ((PointF)((List)localObject).get(i)).y;
        i += 1;
      }
      new StringBuilder("lasso size:").append(this.fWF);
      GMTrace.o(19626121494528L, 146226);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\t\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */