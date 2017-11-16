package com.tencent.mm.plugin.mmsight.segment;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.br.a;

public final class n
  extends View
{
  a neU;
  private boolean neV;
  boolean neW;
  private int neX;
  private int neY;
  Drawable neZ;
  Drawable nfa;
  private int nfb;
  private float nfc;
  private int nfd;
  float nfe;
  private int nff;
  private Paint nfg;
  private Paint nfh;
  private int nfi;
  private float nfj;
  private Paint nfk;
  private Paint nfl;
  private int nfm;
  private float nfn;
  private float nfo;
  private float nfp;
  private int nfq;
  Rect nfr;
  Rect nfs;
  private View.OnTouchListener nft;
  private int padding;
  
  public n(Context paramContext)
  {
    super(paramContext);
    GMTrace.i(7423448317952L, 55309);
    this.neV = false;
    this.neW = false;
    this.nfe = -1.0F;
    this.nfo = -1.0F;
    this.nfp = -1.0F;
    this.padding = 0;
    this.nft = new View.OnTouchListener()
    {
      float iTi;
      float jry;
      int nfA;
      int nfB;
      int nfy;
      int nfz;
      
      public final boolean onTouch(View paramAnonymousView, MotionEvent paramAnonymousMotionEvent)
      {
        GMTrace.i(7471364046848L, 55666);
        if (!n.h(n.this))
        {
          GMTrace.o(7471364046848L, 55666);
          return false;
        }
        boolean bool;
        switch (paramAnonymousMotionEvent.getActionMasked())
        {
        case 4: 
        default: 
          GMTrace.o(7471364046848L, 55666);
          return false;
        case 2: 
          if ((!n.a(n.this, true)) && (!n.a(n.this, false)))
          {
            GMTrace.o(7471364046848L, 55666);
            return false;
          }
          if (n.i(n.this))
          {
            GMTrace.o(7471364046848L, 55666);
            return true;
          }
          this.nfB = 0;
          bool = false;
          if (this.nfB < paramAnonymousMotionEvent.getPointerCount())
          {
            this.nfA = paramAnonymousMotionEvent.getPointerId(this.nfB);
            if ((this.nfA == this.nfy) || (this.nfA == this.nfz))
            {
              paramAnonymousView = n.this;
              if (this.nfA != this.nfy) {
                break label274;
              }
              bool = true;
              n.a(paramAnonymousView, bool, paramAnonymousMotionEvent.getX(this.nfB));
              if (n.j(n.this) != null)
              {
                paramAnonymousView = n.j(n.this);
                if (this.nfA != this.nfy) {
                  break label279;
                }
              }
            }
            for (bool = true;; bool = false)
            {
              paramAnonymousView.ga(bool);
              bool = true;
              this.nfB += 1;
              break;
              bool = false;
              break label208;
            }
          }
          GMTrace.o(7471364046848L, 55666);
          return bool;
        case 1: 
        case 3: 
        case 6: 
          label208:
          label274:
          label279:
          this.nfA = paramAnonymousMotionEvent.getPointerId(paramAnonymousMotionEvent.getActionIndex());
          if ((this.nfA != this.nfy) && (this.nfA != this.nfz))
          {
            GMTrace.o(7471364046848L, 55666);
            return false;
          }
          if (n.j(n.this) != null) {
            n.j(n.this).aQl();
          }
          paramAnonymousView = n.this;
          if (this.nfA == this.nfy)
          {
            bool = true;
            n.a(paramAnonymousView, bool, false);
            if (this.nfA != this.nfy) {
              break label415;
            }
            this.nfy = -1;
          }
          for (;;)
          {
            GMTrace.o(7471364046848L, 55666);
            return true;
            bool = false;
            break;
            label415:
            this.nfz = -1;
          }
        }
        this.nfB = paramAnonymousMotionEvent.getActionIndex();
        this.nfA = paramAnonymousMotionEvent.getPointerId(this.nfB);
        this.jry = paramAnonymousMotionEvent.getX(this.nfB);
        this.iTi = paramAnonymousMotionEvent.getY(this.nfB);
        if (n.a(n.this, n.c(n.this), this.jry, this.iTi))
        {
          if (n.a(n.this, true))
          {
            GMTrace.o(7471364046848L, 55666);
            return false;
          }
          if (n.j(n.this) != null) {
            n.j(n.this).aQk();
          }
          this.nfy = this.nfA;
          n.a(n.this, n.c(n.this).getBounds().left);
          n.a(n.this, true, true);
          GMTrace.o(7471364046848L, 55666);
          return true;
        }
        if (n.a(n.this, n.e(n.this), this.jry, this.iTi))
        {
          if (n.a(n.this, false))
          {
            GMTrace.o(7471364046848L, 55666);
            return false;
          }
          if (n.j(n.this) != null) {
            n.j(n.this).aQk();
          }
          this.nfz = this.nfA;
          n.b(n.this, n.e(n.this).getBounds().right);
          n.a(n.this, false, true);
          GMTrace.o(7471364046848L, 55666);
          return true;
        }
        GMTrace.o(7471364046848L, 55666);
        return false;
      }
    };
    this.nfb = a.fromDPToPix(getContext(), 8);
    this.nfc = (this.nfb * 0.5F);
    this.nfq = a.fromDPToPix(getContext(), 8);
    this.neZ = new b(a.b(getContext(), k.e.neu), a.b(getContext(), k.e.nes));
    this.nfa = new b(a.b(getContext(), k.e.neu), a.b(getContext(), k.e.nes));
    this.nfd = a.fromDPToPix(getContext(), 1);
    this.nff = a.V(getContext(), k.b.neo);
    this.nfe = -1.0F;
    this.nfg = new Paint();
    this.nfg.setColor(a.c(getContext(), k.a.white));
    this.nfg.setAlpha(102);
    this.nfk = new Paint();
    this.nfk.setColor(a.c(getContext(), k.a.black));
    this.nfk.setAlpha(102);
    this.nfh = new Paint();
    this.nfh.setColor(a.c(getContext(), k.a.white));
    this.nfh.setStyle(Paint.Style.STROKE);
    this.nfi = cP(getContext());
    this.nfh.setStrokeWidth(this.nfi);
    this.nfj = (this.nfi * 0.5F);
    this.nfl = new Paint();
    this.nfl.setColor(a.c(getContext(), k.a.white));
    this.nfl.setStyle(Paint.Style.STROKE);
    this.nfm = cP(getContext());
    this.nfn = (this.nfm * 0.5F);
    this.nfl.setStrokeWidth(this.nfm);
    this.nfl.setAlpha(178);
    setOnTouchListener(this.nft);
    GMTrace.o(7423448317952L, 55309);
  }
  
  private static int cP(Context paramContext)
  {
    GMTrace.i(7423582535680L, 55310);
    int i = Math.round(TypedValue.applyDimension(1, 1.5F, paramContext.getResources().getDisplayMetrics()));
    GMTrace.o(7423582535680L, 55310);
    return i;
  }
  
  private boolean gb(boolean paramBoolean)
  {
    GMTrace.i(7424119406592L, 55314);
    if (paramBoolean)
    {
      paramBoolean = b.a((b)this.neZ);
      GMTrace.o(7424119406592L, 55314);
      return paramBoolean;
    }
    paramBoolean = b.a((b)this.nfa);
    GMTrace.o(7424119406592L, 55314);
    return paramBoolean;
  }
  
  public final int aQm()
  {
    GMTrace.i(7424253624320L, 55315);
    int i = this.neZ.getBounds().left;
    GMTrace.o(7424253624320L, 55315);
    return i;
  }
  
  public final int aQn()
  {
    GMTrace.i(7424387842048L, 55316);
    int i = this.nfa.getBounds().right;
    GMTrace.o(7424387842048L, 55316);
    return i;
  }
  
  public final void ag(float paramFloat)
  {
    GMTrace.i(7423850971136L, 55312);
    if (!this.neV)
    {
      GMTrace.o(7423850971136L, 55312);
      return;
    }
    this.nfe = paramFloat;
    invalidate();
    GMTrace.o(7423850971136L, 55312);
  }
  
  protected final void onDraw(Canvas paramCanvas)
  {
    GMTrace.i(7423716753408L, 55311);
    if (this.nfe > 0.0F)
    {
      float f = getWidth() * this.nfe;
      paramCanvas.drawRect(f - this.nfd * 0.5F, 0.0F, this.nfd * 0.5F + f, this.nff, this.nfg);
    }
    if (!this.neV)
    {
      GMTrace.o(7423716753408L, 55311);
      return;
    }
    int i = this.neZ.getBounds().centerX();
    int j = this.nfa.getBounds().centerX();
    if ((gb(true)) || (gb(false))) {
      paramCanvas.drawRect(this.padding + this.nfn, this.nfn, getWidth() - this.padding - this.nfn, getBottom() - this.nfn, this.nfl);
    }
    if (this.neZ.getBounds().left > 0) {
      paramCanvas.drawRect(0.0F, 0.0F, i, getHeight(), this.nfk);
    }
    if (this.nfa.getBounds().right < getWidth()) {
      paramCanvas.drawRect(j, 0.0F, getWidth(), getHeight(), this.nfk);
    }
    paramCanvas.drawLine(i, this.nfj, j, this.nfj, this.nfh);
    paramCanvas.drawLine(i, getHeight() - this.nfj, j, getHeight() - this.nfj, this.nfh);
    this.neZ.draw(paramCanvas);
    this.nfa.draw(paramCanvas);
    GMTrace.o(7423716753408L, 55311);
  }
  
  public static abstract interface a
  {
    public abstract void aQk();
    
    public abstract void aQl();
    
    public abstract void ga(boolean paramBoolean);
  }
  
  private final class b
    extends Drawable
  {
    boolean nfC;
    private Drawable nfD;
    private Drawable nfE;
    
    public b(Drawable paramDrawable1, Drawable paramDrawable2)
    {
      GMTrace.i(7454184177664L, 55538);
      this.nfC = false;
      this.nfD = paramDrawable1;
      this.nfE = paramDrawable2;
      this.nfC = false;
      GMTrace.o(7454184177664L, 55538);
    }
    
    public final void draw(Canvas paramCanvas)
    {
      GMTrace.i(7454318395392L, 55539);
      if (this.nfC) {}
      for (Drawable localDrawable = this.nfD;; localDrawable = this.nfE)
      {
        if (!getBounds().equals(localDrawable.getBounds())) {
          localDrawable.setBounds(getBounds());
        }
        localDrawable.draw(paramCanvas);
        GMTrace.o(7454318395392L, 55539);
        return;
      }
    }
    
    public final int getOpacity()
    {
      GMTrace.i(7454721048576L, 55542);
      GMTrace.o(7454721048576L, 55542);
      return -3;
    }
    
    public final void setAlpha(int paramInt)
    {
      GMTrace.i(7454452613120L, 55540);
      this.nfD.setAlpha(paramInt);
      this.nfE.setAlpha(paramInt);
      GMTrace.o(7454452613120L, 55540);
    }
    
    public final void setColorFilter(ColorFilter paramColorFilter)
    {
      GMTrace.i(7454586830848L, 55541);
      this.nfD.setColorFilter(paramColorFilter);
      this.nfE.setColorFilter(paramColorFilter);
      GMTrace.o(7454586830848L, 55541);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\mmsight\segment\n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */