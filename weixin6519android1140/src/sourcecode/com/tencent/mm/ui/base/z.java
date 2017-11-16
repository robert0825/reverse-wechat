package com.tencent.mm.ui.base;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Layout;
import android.text.Spannable;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;
import android.view.View.OnTouchListener;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnPreDrawListener;
import android.view.ViewTreeObserver.OnScrollChangedListener;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.widget.TextView.BufferType;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.br.a;
import com.tencent.mm.bx.a.b;
import com.tencent.mm.ui.widget.h;

public final class z
{
  public boolean eWb;
  public TextView jU;
  public Context mContext;
  public b wih;
  public b wii;
  public c wij;
  public w wik;
  Spannable wil;
  public h wim;
  public int win;
  public int wio;
  private int wip;
  public int wiq;
  public int wir;
  private d wis;
  public boolean wit;
  ViewTreeObserver.OnPreDrawListener wiu;
  ViewTreeObserver.OnScrollChangedListener wiv;
  final Runnable wiw;
  private int[] wix;
  
  public z(a parama)
  {
    GMTrace.i(20296807481344L, 151223);
    this.wij = new c();
    this.eWb = true;
    this.wiw = new Runnable()
    {
      public final void run()
      {
        GMTrace.i(20299626053632L, 151244);
        if (z.this.eWb)
        {
          GMTrace.o(20299626053632L, 151244);
          return;
        }
        z.this.caO();
        if (z.this.wih != null) {
          z.this.a(z.this.wih);
        }
        if (z.this.wii != null) {
          z.this.a(z.this.wii);
        }
        GMTrace.o(20299626053632L, 151244);
      }
    };
    this.wix = new int[2];
    this.jU = parama.jU;
    this.wim = parama.wiz;
    this.mContext = this.jU.getContext();
    this.wip = parama.wip;
    this.wiq = parama.wiq;
    this.wir = a.fromDPToPix(this.mContext, 24);
    this.jU.setText(this.jU.getText(), TextView.BufferType.SPANNABLE);
    this.jU.setOnLongClickListener(new View.OnLongClickListener()
    {
      public final boolean onLongClick(View paramAnonymousView)
      {
        GMTrace.i(20298820747264L, 151238);
        paramAnonymousView = z.this;
        int j = z.this.win;
        int i = z.this.wio;
        paramAnonymousView.caM();
        paramAnonymousView.caN();
        paramAnonymousView.eWb = false;
        if (paramAnonymousView.wih == null) {
          paramAnonymousView.wih = new z.b(paramAnonymousView, true);
        }
        if (paramAnonymousView.wii == null) {
          paramAnonymousView.wii = new z.b(paramAnonymousView, false);
        }
        Layout localLayout = paramAnonymousView.jU.getLayout();
        if (localLayout != null)
        {
          i = localLayout.getOffsetForHorizontal(localLayout.getLineForVertical(i), j);
          if ((int)localLayout.getPrimaryHorizontal(i) > j)
          {
            i = localLayout.getOffsetToLeftOf(i);
            if ((paramAnonymousView.jU.getText() instanceof Spannable)) {
              paramAnonymousView.wil = ((Spannable)paramAnonymousView.jU.getText());
            }
            if ((paramAnonymousView.wil != null) && (i < paramAnonymousView.jU.getText().length())) {
              break label196;
            }
          }
        }
        for (;;)
        {
          GMTrace.o(20298820747264L, 151238);
          return true;
          break;
          i = -1;
          break;
          label196:
          paramAnonymousView.eq(i, i + 1);
          paramAnonymousView.a(paramAnonymousView.wih);
          paramAnonymousView.a(paramAnonymousView.wii);
          paramAnonymousView.caO();
        }
      }
    });
    this.jU.setOnTouchListener(new View.OnTouchListener()
    {
      public final boolean onTouch(View paramAnonymousView, MotionEvent paramAnonymousMotionEvent)
      {
        GMTrace.i(20299223400448L, 151241);
        z.this.win = ((int)paramAnonymousMotionEvent.getX());
        z.this.wio = ((int)paramAnonymousMotionEvent.getY());
        GMTrace.o(20299223400448L, 151241);
        return false;
      }
    });
    this.jU.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(20298149658624L, 151233);
        z.this.caN();
        z.this.caM();
        GMTrace.o(20298149658624L, 151233);
      }
    });
    this.jU.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener()
    {
      public final void onViewAttachedToWindow(View paramAnonymousView)
      {
        GMTrace.i(20298418094080L, 151235);
        GMTrace.o(20298418094080L, 151235);
      }
      
      public final void onViewDetachedFromWindow(View paramAnonymousView)
      {
        GMTrace.i(20298552311808L, 151236);
        paramAnonymousView = z.this;
        paramAnonymousView.jU.getViewTreeObserver().removeOnScrollChangedListener(paramAnonymousView.wiv);
        paramAnonymousView.jU.getViewTreeObserver().removeOnPreDrawListener(paramAnonymousView.wiu);
        paramAnonymousView.caN();
        paramAnonymousView.caM();
        paramAnonymousView.wih = null;
        paramAnonymousView.wii = null;
        paramAnonymousView.wim = null;
        GMTrace.o(20298552311808L, 151236);
      }
    });
    this.wiu = new ViewTreeObserver.OnPreDrawListener()
    {
      public final boolean onPreDraw()
      {
        GMTrace.i(20296539045888L, 151221);
        if (z.this.wit)
        {
          z.this.wit = false;
          z localz = z.this;
          localz.jU.removeCallbacks(localz.wiw);
          localz.jU.postDelayed(localz.wiw, 100L);
        }
        GMTrace.o(20296539045888L, 151221);
        return true;
      }
    };
    this.jU.getViewTreeObserver().addOnPreDrawListener(this.wiu);
    this.wiv = new ViewTreeObserver.OnScrollChangedListener()
    {
      public final void onScrollChanged()
      {
        GMTrace.i(20301236666368L, 151256);
        if ((!z.this.wit) && (!z.this.eWb))
        {
          z.this.wit = true;
          if (z.this.wim != null) {
            z.this.wim.cca();
          }
          if (z.this.wih != null) {
            z.this.wih.wiB.dismiss();
          }
          if (z.this.wii != null) {
            z.this.wii.wiB.dismiss();
          }
        }
        GMTrace.o(20301236666368L, 151256);
      }
    };
    this.jU.getViewTreeObserver().addOnScrollChangedListener(this.wiv);
    GMTrace.o(20296807481344L, 151223);
  }
  
  public final void a(b paramb)
  {
    GMTrace.i(20297210134528L, 151226);
    Object localObject = this.jU.getLayout();
    int m;
    int n;
    if (b.b(paramb))
    {
      i = this.wij.Vw;
      m = (int)((Layout)localObject).getPrimaryHorizontal(i);
      n = ((Layout)localObject).getLineBottom(((Layout)localObject).getLineForOffset(i));
      paramb.wiy.jU.getLocationInWindow(paramb.wiH);
      if (!paramb.wiC) {
        break label165;
      }
    }
    label165:
    for (int i = paramb.mWidth;; i = 0)
    {
      int k = n;
      int j = m;
      if (!paramb.wiC)
      {
        localObject = paramb.er(m, n);
        j = localObject[0];
        k = localObject[1];
      }
      paramb.wiB.showAtLocation(paramb.wiy.jU, 0, j - i + paramb.caR(), k + paramb.caS());
      GMTrace.o(20297210134528L, 151226);
      return;
      i = this.wij.vt;
      break;
    }
  }
  
  public final void caM()
  {
    GMTrace.i(20296941699072L, 151224);
    this.eWb = true;
    if (this.wih != null) {
      this.wih.wiB.dismiss();
    }
    if (this.wii != null) {
      this.wii.wiB.dismiss();
    }
    if (this.wim != null) {
      this.wim.cca();
    }
    GMTrace.o(20296941699072L, 151224);
  }
  
  public final void caN()
  {
    GMTrace.i(20297075916800L, 151225);
    this.wij.wiI = null;
    if ((this.wil != null) && (this.wis != null))
    {
      this.wil.removeSpan(this.wis);
      this.wis = null;
    }
    GMTrace.o(20297075916800L, 151225);
  }
  
  public final void caO()
  {
    int j = 16;
    GMTrace.i(20297344352256L, 151227);
    int k;
    int i;
    if (this.wim != null)
    {
      this.jU.getLocationInWindow(this.wix);
      Layout localLayout = this.jU.getLayout();
      int m = (int)localLayout.getPrimaryHorizontal(this.wij.Vw) + this.wix[0];
      k = localLayout.getLineTop(localLayout.getLineForOffset(this.wij.Vw)) + this.wix[1] - 16;
      i = m;
      if (m <= 0) {
        i = 16;
      }
      if (k >= 0) {
        break label149;
      }
    }
    for (;;)
    {
      if (i > ab.getScreenWidth(this.mContext)) {
        i = ab.getScreenWidth(this.mContext) - 16;
      }
      for (;;)
      {
        this.wim.bz(i, j);
        GMTrace.o(20297344352256L, 151227);
        return;
      }
      label149:
      j = k;
    }
  }
  
  public final void eq(int paramInt1, int paramInt2)
  {
    GMTrace.i(20297478569984L, 151228);
    if (paramInt1 != -1) {
      this.wij.Vw = paramInt1;
    }
    if (paramInt2 != -1) {
      this.wij.vt = paramInt2;
    }
    if (this.wij.Vw > this.wij.vt)
    {
      paramInt1 = this.wij.Vw;
      this.wij.Vw = this.wij.vt;
      this.wij.vt = paramInt1;
    }
    if (this.wil != null)
    {
      this.wij.wiI = this.wil.subSequence(this.wij.Vw, this.wij.vt).toString();
      if (this.wis == null) {
        this.wis = new d(this.jU, this.mContext.getResources().getColor(this.wip), this.wij.Vw, this.wij.vt);
      }
      if (this.wis != null)
      {
        localObject = this.wis;
        paramInt1 = this.wij.Vw;
        paramInt2 = this.wij.vt;
        ((d)localObject).start = paramInt1;
        ((d)localObject).end = paramInt2;
      }
      Object localObject = this.jU.getLayout();
      paramInt1 = ((Layout)localObject).getLineStart(((Layout)localObject).getLineForOffset(this.wij.Vw));
      this.wil.setSpan(this.wis, paramInt1, this.wij.vt, 17);
      if (this.wik != null) {
        this.wik.Q(this.wij.wiI);
      }
    }
    GMTrace.o(20297478569984L, 151228);
  }
  
  public final b lM(boolean paramBoolean)
  {
    GMTrace.i(20297612787712L, 151229);
    if (b.b(this.wih) == paramBoolean)
    {
      localb = this.wih;
      GMTrace.o(20297612787712L, 151229);
      return localb;
    }
    b localb = this.wii;
    GMTrace.o(20297612787712L, 151229);
    return localb;
  }
  
  public static final class a
  {
    public TextView jU;
    public float wiA;
    public int wip;
    public int wiq;
    public h wiz;
    
    public a(TextView paramTextView, h paramh)
    {
      GMTrace.i(20299760271360L, 151245);
      this.wiq = a.b.aNo;
      this.wip = a.b.aOQ;
      this.wiA = 24.0F;
      this.jU = paramTextView;
      this.wiz = paramh;
      GMTrace.o(20299760271360L, 151245);
    }
  }
  
  private final class b
    extends View
  {
    private int jRR;
    private int mHeight;
    private Paint mPaint;
    int mWidth;
    private int sfP;
    public PopupWindow wiB;
    boolean wiC;
    private int wiD;
    private int wiE;
    private int wiF;
    private int wiG;
    int[] wiH;
    
    public b(boolean paramBoolean)
    {
      super();
      GMTrace.i(20299894489088L, 151246);
      this.sfP = (z.this.wir / 2);
      this.mWidth = (this.sfP * 2);
      this.mHeight = (this.sfP * 2);
      this.jRR = 25;
      this.wiH = new int[2];
      this.wiC = paramBoolean;
      this.mPaint = new Paint(1);
      this.mPaint.setColor(z.this.mContext.getResources().getColor(z.this.wiq));
      this.wiB = new PopupWindow(this);
      this.wiB.setClippingEnabled(false);
      this.wiB.setWidth(this.mWidth + this.jRR * 2);
      this.wiB.setHeight(this.mHeight + this.jRR / 2);
      invalidate();
      GMTrace.o(20299894489088L, 151246);
    }
    
    private void caP()
    {
      GMTrace.i(20300297142272L, 151249);
      if (!this.wiC) {}
      for (boolean bool = true;; bool = false)
      {
        this.wiC = bool;
        invalidate();
        GMTrace.o(20300297142272L, 151249);
        return;
      }
    }
    
    private void caQ()
    {
      GMTrace.i(20300431360000L, 151250);
      z.this.jU.getLocationInWindow(this.wiH);
      Object localObject = z.this.jU.getLayout();
      if (this.wiC)
      {
        this.wiB.update((int)((Layout)localObject).getPrimaryHorizontal(z.this.wij.Vw) - this.mWidth + caR(), ((Layout)localObject).getLineBottom(((Layout)localObject).getLineForOffset(z.this.wij.Vw)) + caS(), -1, -1);
        GMTrace.o(20300431360000L, 151250);
        return;
      }
      localObject = er((int)((Layout)localObject).getPrimaryHorizontal(z.this.wij.vt), ((Layout)localObject).getLineBottom(((Layout)localObject).getLineForOffset(z.this.wij.vt)));
      int i = localObject[0];
      int j = localObject[1];
      this.wiB.update(i + caR(), j + caS(), -1, -1);
      GMTrace.o(20300431360000L, 151250);
    }
    
    public final int caR()
    {
      GMTrace.i(20300565577728L, 151251);
      int i = this.wiH[0];
      int j = this.jRR;
      int k = z.this.jU.getPaddingLeft();
      GMTrace.o(20300565577728L, 151251);
      return i - j + k;
    }
    
    public final int caS()
    {
      GMTrace.i(20300699795456L, 151252);
      int i = this.wiH[1];
      int j = z.this.jU.getPaddingTop();
      GMTrace.o(20300699795456L, 151252);
      return i + j;
    }
    
    final int[] er(int paramInt1, int paramInt2)
    {
      GMTrace.i(20300834013184L, 151253);
      int j = paramInt1;
      int i = paramInt2;
      if (paramInt1 == 0)
      {
        j = paramInt1;
        i = paramInt2;
        if (z.this.wij.vt > 1)
        {
          z.this.jU.getLocationInWindow(this.wiH);
          Layout localLayout = z.this.jU.getLayout();
          j = paramInt1;
          i = paramInt2;
          if (localLayout != null)
          {
            j = (int)localLayout.getLineWidth(localLayout.getLineForOffset(z.this.wij.vt - 1));
            i = localLayout.getLineBottom(localLayout.getLineForOffset(z.this.wij.vt - 1));
          }
        }
      }
      GMTrace.o(20300834013184L, 151253);
      return new int[] { j, i };
    }
    
    protected final void onDraw(Canvas paramCanvas)
    {
      GMTrace.i(20300028706816L, 151247);
      paramCanvas.drawCircle(this.sfP + this.jRR, this.sfP, this.sfP, this.mPaint);
      if (this.wiC)
      {
        paramCanvas.drawRect(this.sfP + this.jRR, 0.0F, this.sfP * 2 + this.jRR, this.sfP, this.mPaint);
        GMTrace.o(20300028706816L, 151247);
        return;
      }
      paramCanvas.drawRect(this.jRR, 0.0F, this.sfP + this.jRR, this.sfP, this.mPaint);
      GMTrace.o(20300028706816L, 151247);
    }
    
    public final boolean onTouchEvent(MotionEvent paramMotionEvent)
    {
      GMTrace.i(20300162924544L, 151248);
      switch (paramMotionEvent.getAction())
      {
      default: 
      case 0: 
      case 1: 
      case 3: 
        for (;;)
        {
          GMTrace.o(20300162924544L, 151248);
          return true;
          this.wiF = z.this.wij.Vw;
          this.wiG = z.this.wij.vt;
          this.wiD = ((int)paramMotionEvent.getX());
          this.wiE = ((int)paramMotionEvent.getY());
          continue;
          z.this.caO();
        }
      }
      z.this.wim.cca();
      int i = (int)paramMotionEvent.getRawX();
      int j = (int)paramMotionEvent.getRawY();
      int n = i + this.wiD - this.mWidth;
      int k = this.wiE;
      int m = this.mHeight;
      z.this.jU.getLocationInWindow(this.wiH);
      if (this.wiC) {}
      int i1;
      Layout localLayout;
      for (i = z.this.wij.Vw;; i = z.this.wij.vt)
      {
        i1 = k + j - m - this.wiH[1];
        paramMotionEvent = z.this.jU;
        localLayout = paramMotionEvent.getLayout();
        if (localLayout != null) {
          break label319;
        }
        j = -1;
        label230:
        if (j == i) {
          break label619;
        }
        z.this.caN();
        if (!this.wiC) {
          break label544;
        }
        if (j <= this.wiG) {
          break label532;
        }
        paramMotionEvent = z.this.lM(false);
        caP();
        paramMotionEvent.caP();
        this.wiF = this.wiG;
        z.this.eq(this.wiG, j);
        paramMotionEvent.caQ();
        label298:
        caQ();
        break;
      }
      label319:
      k = localLayout.getLineForVertical(i1);
      if (ab.a(localLayout, i))
      {
        j = (int)localLayout.getPrimaryHorizontal(i - 1);
        m = (int)localLayout.getLineRight(k);
        if (n <= m - (m - j) / 2) {}
      }
      for (j = i - 1;; j = i)
      {
        m = localLayout.getLineForOffset(j);
        int i2 = localLayout.getLineTop(m);
        int i3 = localLayout.getLineBottom(m);
        int i4 = (i3 - i2) / 2;
        if (k == m + 1)
        {
          j = m;
          if (i1 - i3 < i4) {}
        }
        else
        {
          if ((k != m - 1) || (i2 - i1 >= i4)) {
            break label621;
          }
        }
        label532:
        label544:
        label619:
        label621:
        for (j = m;; j = k)
        {
          k = localLayout.getOffsetForHorizontal(j, n);
          if ((k < paramMotionEvent.getText().length() - 1) && (ab.a(localLayout, k + 1)))
          {
            m = (int)localLayout.getPrimaryHorizontal(k);
            j = (int)localLayout.getLineRight(j);
            if (n > j - (j - m) / 2)
            {
              j = k + 1;
              break label230;
              z.this.eq(j, -1);
              break label298;
              if (j < this.wiF)
              {
                paramMotionEvent = z.this.lM(true);
                paramMotionEvent.caP();
                caP();
                this.wiG = this.wiF;
                z.this.eq(j, this.wiF);
                paramMotionEvent.caQ();
              }
              for (;;)
              {
                caQ();
                break;
                z.this.eq(this.wiF, j);
              }
            }
          }
          j = k;
          break label230;
          break;
        }
      }
    }
  }
  
  public final class c
  {
    public int Vw;
    public int vt;
    public String wiI;
    
    public c()
    {
      GMTrace.i(20296673263616L, 151222);
      GMTrace.o(20296673263616L, 151222);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\base\z.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */