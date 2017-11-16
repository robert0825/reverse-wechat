package android.support.v7.widget.a;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build.VERSION;
import android.support.v4.a.d;
import android.support.v4.a.g;
import android.support.v4.view.e;
import android.support.v4.view.o;
import android.support.v4.view.y;
import android.support.v4.view.z;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.d;
import android.support.v7.widget.RecyclerView.e;
import android.support.v7.widget.RecyclerView.g;
import android.support.v7.widget.RecyclerView.h;
import android.support.v7.widget.RecyclerView.i;
import android.support.v7.widget.RecyclerView.j;
import android.support.v7.widget.RecyclerView.t;
import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.List;

public final class a
  extends RecyclerView.g
  implements RecyclerView.i
{
  private RecyclerView.d TK = null;
  public RecyclerView Ub;
  final List<View> ZB = new ArrayList();
  private final float[] ZC = new float[2];
  RecyclerView.t ZD = null;
  float ZE;
  float ZF;
  float ZG;
  float ZH;
  float ZI;
  float ZJ;
  float ZK;
  float ZL;
  a ZM;
  int ZN = 0;
  int ZO;
  List<c> ZP = new ArrayList();
  private int ZQ;
  public final Runnable ZR = new Runnable()
  {
    public final void run()
    {
      int k = 0;
      a locala;
      long l2;
      long l1;
      Object localObject;
      int j;
      int i;
      label149:
      int m;
      label206:
      RecyclerView localRecyclerView;
      if (a.this.ZD != null)
      {
        locala = a.this;
        if (locala.ZD == null) {
          break label550;
        }
        l2 = System.currentTimeMillis();
        if (locala.ZY != Long.MIN_VALUE) {
          break label409;
        }
        l1 = 0L;
        localObject = locala.Ub.SW;
        if (locala.fV == null) {
          locala.fV = new Rect();
        }
        ((RecyclerView.h)localObject).a(locala.ZD.UU, locala.fV);
        if (!((RecyclerView.h)localObject).eQ()) {
          break label479;
        }
        j = (int)(locala.ZK + locala.ZI);
        i = j - locala.fV.left - locala.Ub.getPaddingLeft();
        if ((locala.ZI >= 0.0F) || (i >= 0)) {
          break label422;
        }
        if (!((RecyclerView.h)localObject).eR()) {
          break label545;
        }
        m = (int)(locala.ZL + locala.ZJ);
        j = m - locala.fV.top - locala.Ub.getPaddingTop();
        if ((locala.ZJ >= 0.0F) || (j >= 0)) {
          break label484;
        }
        if (i == 0) {
          break label566;
        }
        localObject = locala.ZM;
        localRecyclerView = locala.Ub;
        m = locala.ZD.UU.getWidth();
        locala.Ub.getWidth();
        i = ((a.a)localObject).a(localRecyclerView, m, i, l1);
      }
      label409:
      label422:
      label479:
      label484:
      label545:
      label550:
      label566:
      for (;;)
      {
        if (j != 0)
        {
          localObject = locala.ZM;
          localRecyclerView = locala.Ub;
          m = locala.ZD.UU.getHeight();
          locala.Ub.getHeight();
          j = ((a.a)localObject).a(localRecyclerView, m, j, l1);
        }
        for (;;)
        {
          if ((i != 0) || (j != 0))
          {
            if (locala.ZY == Long.MIN_VALUE) {
              locala.ZY = l2;
            }
            locala.Ub.scrollBy(i, j);
          }
          for (i = 1;; i = k)
          {
            if (i != 0)
            {
              if (a.this.ZD != null) {
                a.this.y(a.this.ZD);
              }
              a.this.Ub.removeCallbacks(a.this.ZR);
              z.a(a.this.Ub, this);
            }
            return;
            l1 = l2 - locala.ZY;
            break;
            if (locala.ZI > 0.0F)
            {
              j = j + locala.ZD.UU.getWidth() + locala.fV.right - (locala.Ub.getWidth() - locala.Ub.getPaddingRight());
              i = j;
              if (j > 0) {
                break label149;
              }
            }
            i = 0;
            break label149;
            if (locala.ZJ > 0.0F)
            {
              m = m + locala.ZD.UU.getHeight() + locala.fV.bottom - (locala.Ub.getHeight() - locala.Ub.getPaddingBottom());
              j = m;
              if (m > 0) {
                break label206;
              }
            }
            j = 0;
            break label206;
            locala.ZY = Long.MIN_VALUE;
          }
        }
      }
    }
  };
  private List<RecyclerView.t> ZS;
  private List<Integer> ZT;
  public View ZU = null;
  public int ZV = -1;
  public e ZW;
  private final RecyclerView.j ZX = new RecyclerView.j()
  {
    public final void T(boolean paramAnonymousBoolean)
    {
      if (!paramAnonymousBoolean) {
        return;
      }
      a.this.d(null, 0);
    }
    
    public final boolean n(MotionEvent paramAnonymousMotionEvent)
    {
      a.this.ZW.onTouchEvent(paramAnonymousMotionEvent);
      int i = o.d(paramAnonymousMotionEvent);
      Object localObject;
      if (i == 0)
      {
        a.this.eA = o.c(paramAnonymousMotionEvent, 0);
        a.this.ZE = paramAnonymousMotionEvent.getX();
        a.this.ZF = paramAnonymousMotionEvent.getY();
        localObject = a.this;
        if (((a)localObject).ez != null) {
          ((a)localObject).ez.recycle();
        }
        ((a)localObject).ez = VelocityTracker.obtain();
        if (a.this.ZD == null)
        {
          a locala = a.this;
          if (locala.ZP.isEmpty()) {
            break label349;
          }
          View localView = locala.p(paramAnonymousMotionEvent);
          i = locala.ZP.size() - 1;
          if (i < 0) {
            break label349;
          }
          localObject = (a.c)locala.ZP.get(i);
          if (((a.c)localObject).Ui.UU != localView) {
            break label342;
          }
          label168:
          if (localObject != null)
          {
            locala = a.this;
            locala.ZE -= ((a.c)localObject).aao;
            locala = a.this;
            locala.ZF -= ((a.c)localObject).aap;
            a.this.a(((a.c)localObject).Ui, true);
            if (a.this.ZB.remove(((a.c)localObject).Ui.UU)) {
              a.this.ZM.c(a.this.Ub, ((a.c)localObject).Ui);
            }
            a.this.d(((a.c)localObject).Ui, ((a.c)localObject).ZN);
            a.this.a(paramAnonymousMotionEvent, a.this.ZO, 0);
          }
        }
      }
      for (;;)
      {
        if (a.this.ez != null) {
          a.this.ez.addMovement(paramAnonymousMotionEvent);
        }
        if (a.this.ZD == null) {
          break label426;
        }
        return true;
        label342:
        i -= 1;
        break;
        label349:
        localObject = null;
        break label168;
        if ((i == 3) || (i == 1))
        {
          a.this.eA = -1;
          a.this.d(null, 0);
        }
        else if (a.this.eA != -1)
        {
          int j = o.b(paramAnonymousMotionEvent, a.this.eA);
          if (j >= 0) {
            a.this.a(i, paramAnonymousMotionEvent, j);
          }
        }
      }
      label426:
      return false;
    }
    
    public final void o(MotionEvent paramAnonymousMotionEvent)
    {
      int i = 0;
      a.this.ZW.onTouchEvent(paramAnonymousMotionEvent);
      if (a.this.ez != null) {
        a.this.ez.addMovement(paramAnonymousMotionEvent);
      }
      if (a.this.eA == -1) {}
      int j;
      do
      {
        int k;
        RecyclerView.t localt;
        do
        {
          return;
          j = o.d(paramAnonymousMotionEvent);
          k = o.b(paramAnonymousMotionEvent, a.this.eA);
          if (k >= 0) {
            a.this.a(j, paramAnonymousMotionEvent, k);
          }
          localt = a.this.ZD;
        } while (localt == null);
        switch (j)
        {
        case 4: 
        case 5: 
        default: 
          return;
        case 1: 
        case 2: 
        case 3: 
          for (;;)
          {
            a.this.d(null, 0);
            a.this.eA = -1;
            return;
            if (k < 0) {
              break;
            }
            a.this.a(paramAnonymousMotionEvent, a.this.ZO, k);
            a.this.y(localt);
            a.this.Ub.removeCallbacks(a.this.ZR);
            a.this.ZR.run();
            a.this.Ub.invalidate();
            return;
            if (a.this.ez != null) {
              a.this.ez.clear();
            }
          }
        }
        j = o.e(paramAnonymousMotionEvent);
      } while (o.c(paramAnonymousMotionEvent, j) != a.this.eA);
      if (j == 0) {
        i = 1;
      }
      a.this.eA = o.c(paramAnonymousMotionEvent, i);
      a.this.a(paramAnonymousMotionEvent, a.this.ZO, j);
    }
  };
  long ZY;
  int eA = -1;
  public VelocityTracker ez;
  Rect fV;
  
  public a(a parama)
  {
    this.ZM = parama;
  }
  
  private void a(float[] paramArrayOfFloat)
  {
    if ((this.ZO & 0xC) != 0) {
      paramArrayOfFloat[0] = (this.ZK + this.ZI - this.ZD.UU.getLeft());
    }
    while ((this.ZO & 0x3) != 0)
    {
      paramArrayOfFloat[1] = (this.ZL + this.ZJ - this.ZD.UU.getTop());
      return;
      paramArrayOfFloat[0] = z.R(this.ZD.UU);
    }
    paramArrayOfFloat[1] = z.S(this.ZD.UU);
  }
  
  private static boolean a(View paramView, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4)
  {
    return (paramFloat1 >= paramFloat3) && (paramFloat1 <= paramView.getWidth() + paramFloat3) && (paramFloat2 >= paramFloat4) && (paramFloat2 <= paramView.getHeight() + paramFloat4);
  }
  
  private int bJ(int paramInt)
  {
    int j = 8;
    if ((paramInt & 0xC) != 0)
    {
      int i;
      if (this.ZI > 0.0F)
      {
        i = 8;
        if ((this.ez == null) || (this.eA < 0)) {
          break label140;
        }
        this.ez.computeCurrentVelocity(1000, a.G(this.ZH));
        f2 = y.a(this.ez, this.eA);
        f1 = y.b(this.ez, this.eA);
        if (f2 <= 0.0F) {
          break label134;
        }
      }
      for (;;)
      {
        f2 = Math.abs(f2);
        if (((j & paramInt) == 0) || (i != j) || (f2 < a.F(this.ZG)) || (f2 <= Math.abs(f1))) {
          break label140;
        }
        return j;
        i = 4;
        break;
        label134:
        j = 4;
      }
      label140:
      float f1 = this.Ub.getWidth();
      float f2 = a.hk();
      if (((paramInt & i) != 0) && (Math.abs(this.ZI) > f1 * f2)) {
        return i;
      }
    }
    return 0;
  }
  
  private int bK(int paramInt)
  {
    int j = 2;
    if ((paramInt & 0x3) != 0)
    {
      int i;
      if (this.ZJ > 0.0F)
      {
        i = 2;
        if ((this.ez == null) || (this.eA < 0)) {
          break label137;
        }
        this.ez.computeCurrentVelocity(1000, a.G(this.ZH));
        f1 = y.a(this.ez, this.eA);
        f2 = y.b(this.ez, this.eA);
        if (f2 <= 0.0F) {
          break label131;
        }
      }
      for (;;)
      {
        f2 = Math.abs(f2);
        if (((j & paramInt) == 0) || (j != i) || (f2 < a.F(this.ZG)) || (f2 <= Math.abs(f1))) {
          break label137;
        }
        return j;
        i = 1;
        break;
        label131:
        j = 1;
      }
      label137:
      float f1 = this.Ub.getHeight();
      float f2 = a.hk();
      if (((paramInt & i) != 0) && (Math.abs(this.ZJ) > f1 * f2)) {
        return i;
      }
    }
    return 0;
  }
  
  private void he()
  {
    if (this.ez != null)
    {
      this.ez.recycle();
      this.ez = null;
    }
  }
  
  public final void B(RecyclerView paramRecyclerView)
  {
    if (this.Ub == paramRecyclerView) {}
    label207:
    do
    {
      do
      {
        return;
        if (this.Ub != null)
        {
          localObject = this.Ub;
          if (((RecyclerView)localObject).SW != null) {
            ((RecyclerView)localObject).SW.r("Cannot remove item decoration during a scroll  or layout");
          }
          ((RecyclerView)localObject).SY.remove(this);
          if (((RecyclerView)localObject).SY.isEmpty()) {
            if (z.C((View)localObject) != 2) {
              break label207;
            }
          }
          for (boolean bool = true;; bool = false)
          {
            ((RecyclerView)localObject).setWillNotDraw(bool);
            ((RecyclerView)localObject).fH();
            ((RecyclerView)localObject).requestLayout();
            localObject = this.Ub;
            RecyclerView.j localj = this.ZX;
            ((RecyclerView)localObject).SZ.remove(localj);
            if (((RecyclerView)localObject).Ta == localj) {
              ((RecyclerView)localObject).Ta = null;
            }
            localObject = this.Ub;
            if (((RecyclerView)localObject).Tl != null) {
              ((RecyclerView)localObject).Tl.remove(this);
            }
            int i = this.ZP.size() - 1;
            while (i >= 0)
            {
              localObject = (c)this.ZP.get(0);
              this.ZM.c(this.Ub, ((c)localObject).Ui);
              i -= 1;
            }
          }
          this.ZP.clear();
          this.ZU = null;
          this.ZV = -1;
          he();
        }
        this.Ub = paramRecyclerView;
      } while (this.Ub == null);
      paramRecyclerView = paramRecyclerView.getResources();
      this.ZG = paramRecyclerView.getDimension(android.support.v7.d.a.a.Iq);
      this.ZH = paramRecyclerView.getDimension(android.support.v7.d.a.a.Ip);
      this.ZQ = ViewConfiguration.get(this.Ub.getContext()).getScaledTouchSlop();
      this.Ub.a(this);
      paramRecyclerView = this.Ub;
      Object localObject = this.ZX;
      paramRecyclerView.SZ.add(localObject);
      paramRecyclerView = this.Ub;
      if (paramRecyclerView.Tl == null) {
        paramRecyclerView.Tl = new ArrayList();
      }
      paramRecyclerView.Tl.add(this);
    } while (this.ZW != null);
    this.ZW = new e(this.Ub.getContext(), new b((byte)0));
  }
  
  public final int a(RecyclerView.t paramt, boolean paramBoolean)
  {
    int i = this.ZP.size() - 1;
    while (i >= 0)
    {
      c localc = (c)this.ZP.get(i);
      if (localc.Ui == paramt)
      {
        localc.aaq |= paramBoolean;
        if (!localc.mQ) {
          localc.aal.cancel();
        }
        this.ZP.remove(i);
        return localc.aam;
      }
      i -= 1;
    }
    return 0;
  }
  
  public final void a(Canvas paramCanvas, RecyclerView paramRecyclerView)
  {
    this.ZV = -1;
    float f2;
    float f1;
    if (this.ZD != null)
    {
      a(this.ZC);
      f2 = this.ZC[0];
      f1 = this.ZC[1];
    }
    for (;;)
    {
      a locala = this.ZM;
      RecyclerView.t localt = this.ZD;
      List localList = this.ZP;
      int j = this.ZN;
      int k = localList.size();
      int i = 0;
      if (i < k)
      {
        c localc = (c)localList.get(i);
        if (localc.aah == localc.aaj)
        {
          localc.aao = z.R(localc.Ui.UU);
          label122:
          if (localc.aai != localc.aak) {
            break label232;
          }
        }
        label232:
        for (localc.aap = z.S(localc.Ui.UU);; localc.aap = (localc.aai + localc.mO * (localc.aak - localc.aai)))
        {
          int m = paramCanvas.save();
          locala.a(paramCanvas, paramRecyclerView, localc.Ui, localc.aao, localc.aap, localc.ZN, false);
          paramCanvas.restoreToCount(m);
          i += 1;
          break;
          localc.aao = (localc.aah + localc.mO * (localc.aaj - localc.aah));
          break label122;
        }
      }
      if (localt != null)
      {
        i = paramCanvas.save();
        locala.a(paramCanvas, paramRecyclerView, localt, f2, f1, j, true);
        paramCanvas.restoreToCount(i);
      }
      return;
      f1 = 0.0F;
      f2 = 0.0F;
    }
  }
  
  public final void a(Rect paramRect, View paramView, RecyclerView paramRecyclerView)
  {
    paramRect.setEmpty();
  }
  
  public final void a(MotionEvent paramMotionEvent, int paramInt1, int paramInt2)
  {
    float f1 = o.d(paramMotionEvent, paramInt2);
    float f2 = o.e(paramMotionEvent, paramInt2);
    this.ZI = (f1 - this.ZE);
    this.ZJ = (f2 - this.ZF);
    if ((paramInt1 & 0x4) == 0) {
      this.ZI = Math.max(0.0F, this.ZI);
    }
    if ((paramInt1 & 0x8) == 0) {
      this.ZI = Math.min(0.0F, this.ZI);
    }
    if ((paramInt1 & 0x1) == 0) {
      this.ZJ = Math.max(0.0F, this.ZJ);
    }
    if ((paramInt1 & 0x2) == 0) {
      this.ZJ = Math.min(0.0F, this.ZJ);
    }
  }
  
  public final boolean a(int paramInt1, MotionEvent paramMotionEvent, int paramInt2)
  {
    Object localObject2 = null;
    if ((this.ZD != null) || (paramInt1 != 2) || (this.ZN == 2) || (!this.ZM.hi())) {}
    Object localObject3;
    Object localObject1;
    label67:
    float f1;
    float f2;
    float f3;
    float f4;
    do
    {
      do
      {
        do
        {
          do
          {
            return false;
          } while (this.Ub.xl == 1);
          localObject3 = this.Ub.SW;
          if (this.eA != -1) {
            break;
          }
          localObject1 = localObject2;
          if (localObject1 == null) {
            break label375;
          }
          paramInt1 = (this.ZM.C(this.Ub) & 0xFF00) >> 8;
        } while (paramInt1 == 0);
        f1 = o.d(paramMotionEvent, paramInt2);
        f2 = o.e(paramMotionEvent, paramInt2);
        f1 -= this.ZE;
        f2 -= this.ZF;
        f3 = Math.abs(f1);
        f4 = Math.abs(f2);
      } while ((f3 < this.ZQ) && (f4 < this.ZQ));
      if (f3 <= f4) {
        break label377;
      }
    } while (((f1 < 0.0F) && ((paramInt1 & 0x4) == 0)) || ((f1 > 0.0F) && ((paramInt1 & 0x8) == 0)));
    label375:
    label377:
    do
    {
      this.ZJ = 0.0F;
      this.ZI = 0.0F;
      this.eA = o.c(paramMotionEvent, 0);
      d((RecyclerView.t)localObject1, 1);
      return true;
      paramInt1 = o.b(paramMotionEvent, this.eA);
      f3 = o.d(paramMotionEvent, paramInt1);
      f4 = this.ZE;
      f1 = o.e(paramMotionEvent, paramInt1);
      f2 = this.ZF;
      f3 = Math.abs(f3 - f4);
      f1 = Math.abs(f1 - f2);
      if (f3 < this.ZQ)
      {
        localObject1 = localObject2;
        if (f1 < this.ZQ) {
          break label67;
        }
      }
      if (f3 > f1)
      {
        localObject1 = localObject2;
        if (((RecyclerView.h)localObject3).eQ()) {
          break label67;
        }
      }
      if (f1 > f3)
      {
        localObject1 = localObject2;
        if (((RecyclerView.h)localObject3).eR()) {
          break label67;
        }
      }
      localObject3 = p(paramMotionEvent);
      localObject1 = localObject2;
      if (localObject3 == null) {
        break label67;
      }
      localObject1 = this.Ub.aQ((View)localObject3);
      break label67;
      break;
      if ((f2 < 0.0F) && ((paramInt1 & 0x1) == 0)) {
        break;
      }
    } while ((f2 <= 0.0F) || ((paramInt1 & 0x2) != 0));
    return false;
  }
  
  public final void b(Canvas paramCanvas, RecyclerView paramRecyclerView)
  {
    float f2;
    float f1;
    if (this.ZD != null)
    {
      a(this.ZC);
      f2 = this.ZC[0];
      f1 = this.ZC[1];
    }
    for (;;)
    {
      RecyclerView.t localt = this.ZD;
      List localList = this.ZP;
      int k = this.ZN;
      int j = localList.size();
      int i = 0;
      while (i < j)
      {
        c localc = (c)localList.get(i);
        int m = paramCanvas.save();
        a.a(paramCanvas, paramRecyclerView, localc.Ui, localc.aao, localc.aap, localc.ZN);
        paramCanvas.restoreToCount(m);
        i += 1;
      }
      if (localt != null)
      {
        i = paramCanvas.save();
        a.a(paramCanvas, paramRecyclerView, localt, f2, f1, k);
        paramCanvas.restoreToCount(i);
      }
      i = 0;
      j -= 1;
      if (j >= 0)
      {
        paramCanvas = (c)localList.get(j);
        if ((paramCanvas.mQ) && (!paramCanvas.aan)) {
          localList.remove(j);
        }
      }
      for (;;)
      {
        j -= 1;
        break;
        if (!paramCanvas.mQ)
        {
          i = 1;
          continue;
          if (i != 0) {
            paramRecyclerView.invalidate();
          }
          return;
        }
      }
      f1 = 0.0F;
      f2 = 0.0F;
    }
  }
  
  public final void bm(View paramView)
  {
    by(paramView);
    paramView = this.Ub.aQ(paramView);
    if (paramView == null) {}
    do
    {
      return;
      if ((this.ZD != null) && (paramView == this.ZD))
      {
        d(null, 0);
        return;
      }
      a(paramView, false);
    } while (!this.ZB.remove(paramView.UU));
    this.ZM.c(this.Ub, paramView);
  }
  
  public final void by(View paramView)
  {
    if (paramView == this.ZU)
    {
      this.ZU = null;
      if (this.TK != null) {
        this.Ub.a(null);
      }
    }
  }
  
  public final void d(RecyclerView.t paramt, int paramInt)
  {
    if ((paramt == this.ZD) && (paramInt == this.ZN)) {
      return;
    }
    this.ZY = Long.MIN_VALUE;
    int k = this.ZN;
    a(paramt, true);
    this.ZN = paramInt;
    if (paramInt == 2)
    {
      this.ZU = paramt.UU;
      if (Build.VERSION.SDK_INT < 21)
      {
        if (this.TK == null) {
          this.TK = new RecyclerView.d()
          {
            public final int X(int paramAnonymousInt1, int paramAnonymousInt2)
            {
              if (a.this.ZU == null) {}
              int i;
              do
              {
                return paramAnonymousInt2;
                int j = a.this.ZV;
                i = j;
                if (j == -1)
                {
                  i = a.this.Ub.indexOfChild(a.this.ZU);
                  a.this.ZV = i;
                }
                if (paramAnonymousInt2 == paramAnonymousInt1 - 1) {
                  return i;
                }
              } while (paramAnonymousInt2 < i);
              return paramAnonymousInt2 + 1;
            }
          };
        }
        this.Ub.a(this.TK);
      }
    }
    final int i = 0;
    int j = 0;
    final Object localObject;
    int m;
    float f1;
    float f2;
    if (this.ZD != null)
    {
      localObject = this.ZD;
      if (((RecyclerView.t)localObject).UU.getParent() == null) {
        break label706;
      }
      if ((k == 2) || (this.ZN == 2)) {
        break label579;
      }
      m = (a.ai(this.ZM.hf(), z.J(this.Ub)) & 0xFF00) >> 8;
      if (m == 0) {
        break label579;
      }
      if (Math.abs(this.ZI) <= Math.abs(this.ZJ)) {
        break label585;
      }
      j = bJ(m);
      if (j > 0)
      {
        i = j;
        if ((j & 0x0) == 0) {
          i = a.ah(j, z.J(this.Ub));
        }
        he();
      }
    }
    else
    {
      switch (i)
      {
      default: 
        f1 = 0.0F;
        f2 = 0.0F;
        label293:
        if (k == 2)
        {
          j = 8;
          label303:
          a(this.ZC);
          localObject = new c((RecyclerView.t)localObject, j, k, this.ZC[0], this.ZC[1], f1, f2, i)
          {
            public final void a(g paramAnonymousg)
            {
              super.a(paramAnonymousg);
              if (this.aaq) {}
              for (;;)
              {
                return;
                if (i <= 0) {
                  a.this.ZM.c(a.this.Ub, localObject);
                }
                while (a.this.ZU == localObject.UU)
                {
                  a.this.by(localObject.UU);
                  return;
                  a.this.ZB.add(localObject.UU);
                  this.aan = true;
                  if (i > 0)
                  {
                    paramAnonymousg = a.this;
                    int i = i;
                    paramAnonymousg.Ub.post(new a.4(paramAnonymousg, this, i));
                  }
                }
              }
            }
          };
          long l = a.f(this.Ub, j);
          ((c)localObject).aal.setDuration(l);
          this.ZP.add(localObject);
          ((c)localObject).Ui.U(false);
          ((c)localObject).aal.start();
          i = 1;
          label403:
          this.ZD = null;
          if (paramt != null)
          {
            this.ZO = ((this.ZM.C(this.Ub) & (1 << paramInt * 8 + 8) - 1) >> this.ZN * 8);
            this.ZK = paramt.UU.getLeft();
            this.ZL = paramt.UU.getTop();
            this.ZD = paramt;
            if (paramInt == 2) {
              this.ZD.UU.performHapticFeedback(0);
            }
          }
          paramt = this.Ub.getParent();
          if (paramt != null) {
            if (this.ZD == null) {
              break label735;
            }
          }
        }
        break;
      }
    }
    label579:
    label585:
    label706:
    label735:
    for (boolean bool = true;; bool = false)
    {
      paramt.requestDisallowInterceptTouchEvent(bool);
      if (i == 0) {
        this.Ub.SW.Ud = true;
      }
      this.ZM.e(this.ZD, this.ZN);
      this.Ub.invalidate();
      return;
      j = bK(m);
      i = j;
      if (j > 0) {
        break;
      }
      do
      {
        i = 0;
        break;
        j = bK(m);
        i = j;
        if (j > 0) {
          break;
        }
        j = bJ(m);
      } while (j <= 0);
      i = j;
      if ((j & 0x0) != 0) {
        break;
      }
      i = a.ah(j, z.J(this.Ub));
      break;
      f2 = 0.0F;
      f1 = Math.signum(this.ZI) * this.Ub.getWidth();
      break label293;
      f1 = 0.0F;
      f2 = Math.signum(this.ZJ) * this.Ub.getHeight();
      break label293;
      if (i > 0)
      {
        j = 2;
        break label303;
      }
      j = 4;
      break label303;
      by(((RecyclerView.t)localObject).UU);
      this.ZM.c(this.Ub, (RecyclerView.t)localObject);
      i = j;
      break label403;
    }
  }
  
  public final View p(MotionEvent paramMotionEvent)
  {
    float f1 = paramMotionEvent.getX();
    float f2 = paramMotionEvent.getY();
    if (this.ZD != null)
    {
      paramMotionEvent = this.ZD.UU;
      if (a(paramMotionEvent, f1, f2, this.ZK + this.ZI, this.ZL + this.ZJ)) {
        return paramMotionEvent;
      }
    }
    int i = this.ZP.size() - 1;
    while (i >= 0)
    {
      paramMotionEvent = (c)this.ZP.get(i);
      View localView = paramMotionEvent.Ui.UU;
      if (a(localView, f1, f2, paramMotionEvent.aao, paramMotionEvent.aap)) {
        return localView;
      }
      i -= 1;
    }
    return this.Ub.j(f1, f2);
  }
  
  public final void y(RecyclerView.t paramt)
  {
    if (this.Ub.isLayoutRequested()) {}
    int m;
    int n;
    label491:
    do
    {
      float f;
      do
      {
        do
        {
          return;
        } while (this.ZN != 2);
        f = this.ZM.hl();
        m = (int)(this.ZK + this.ZI);
        n = (int)(this.ZL + this.ZJ);
      } while ((Math.abs(n - paramt.UU.getTop()) < paramt.UU.getHeight() * f) && (Math.abs(m - paramt.UU.getLeft()) < f * paramt.UU.getWidth()));
      int i1;
      int i2;
      int i3;
      int i4;
      int i5;
      int i6;
      int i7;
      int i;
      if (this.ZS == null)
      {
        this.ZS = new ArrayList();
        this.ZT = new ArrayList();
        a.hj();
        i1 = Math.round(this.ZK + this.ZI) + 0;
        i2 = Math.round(this.ZL + this.ZJ) + 0;
        i3 = paramt.UU.getWidth() + i1 + 0;
        i4 = paramt.UU.getHeight() + i2 + 0;
        i5 = (i1 + i3) / 2;
        i6 = (i2 + i4) / 2;
        localObject = this.Ub.SW;
        i7 = ((RecyclerView.h)localObject).getChildCount();
        i = 0;
      }
      for (;;)
      {
        if (i >= i7) {
          break label491;
        }
        View localView = ((RecyclerView.h)localObject).getChildAt(i);
        if ((localView != paramt.UU) && (localView.getBottom() >= i2) && (localView.getTop() <= i4) && (localView.getRight() >= i1) && (localView.getLeft() <= i3))
        {
          RecyclerView.t localt = this.Ub.aQ(localView);
          a.hg();
          int j = Math.abs(i5 - (localView.getLeft() + localView.getRight()) / 2);
          int k = localView.getTop();
          k = Math.abs(i6 - (localView.getBottom() + k) / 2);
          int i8 = j * j + k * k;
          int i9 = this.ZS.size();
          k = 0;
          j = 0;
          for (;;)
          {
            if ((j < i9) && (i8 > ((Integer)this.ZT.get(j)).intValue()))
            {
              k += 1;
              j += 1;
              continue;
              this.ZS.clear();
              this.ZT.clear();
              break;
            }
          }
          this.ZS.add(k, localt);
          this.ZT.add(k, Integer.valueOf(i8));
        }
        i += 1;
      }
      localObject = this.ZS;
    } while (((List)localObject).size() == 0);
    Object localObject = a.a(paramt, (List)localObject, m, n);
    if (localObject == null)
    {
      this.ZS.clear();
      this.ZT.clear();
      return;
    }
    ((RecyclerView.t)localObject).gd();
    paramt.gd();
    this.ZM.a(paramt, (RecyclerView.t)localObject);
  }
  
  public static abstract class a
  {
    private static final b aad = new c.a();
    private static final Interpolator aae = new Interpolator()
    {
      public final float getInterpolation(float paramAnonymousFloat)
      {
        return paramAnonymousFloat * paramAnonymousFloat * paramAnonymousFloat * paramAnonymousFloat * paramAnonymousFloat;
      }
    };
    private static final Interpolator aaf = new Interpolator()
    {
      public final float getInterpolation(float paramAnonymousFloat)
      {
        paramAnonymousFloat -= 1.0F;
        return paramAnonymousFloat * (paramAnonymousFloat * paramAnonymousFloat * paramAnonymousFloat * paramAnonymousFloat) + 1.0F;
      }
    };
    private int aag = -1;
    
    static
    {
      if (Build.VERSION.SDK_INT >= 21)
      {
        aad = new c.c();
        return;
      }
      if (Build.VERSION.SDK_INT >= 11)
      {
        aad = new c.b();
        return;
      }
    }
    
    public static float F(float paramFloat)
    {
      return paramFloat;
    }
    
    public static float G(float paramFloat)
    {
      return paramFloat;
    }
    
    public static RecyclerView.t a(RecyclerView.t paramt, List<RecyclerView.t> paramList, int paramInt1, int paramInt2)
    {
      int m = paramt.UU.getWidth();
      int n = paramt.UU.getHeight();
      Object localObject2 = null;
      int i = -1;
      int i1 = paramInt1 - paramt.UU.getLeft();
      int i2 = paramInt2 - paramt.UU.getTop();
      int i3 = paramList.size();
      int j = 0;
      Object localObject1;
      int k;
      if (j < i3)
      {
        localObject1 = (RecyclerView.t)paramList.get(j);
        if (i1 <= 0) {
          break label343;
        }
        k = ((RecyclerView.t)localObject1).UU.getRight() - (paramInt1 + m);
        if ((k >= 0) || (((RecyclerView.t)localObject1).UU.getRight() <= paramt.UU.getRight())) {
          break label343;
        }
        k = Math.abs(k);
        if (k <= i) {
          break label343;
        }
        i = k;
        localObject2 = localObject1;
        label142:
        if (i1 >= 0) {
          break label356;
        }
        k = ((RecyclerView.t)localObject1).UU.getLeft() - paramInt1;
        if ((k <= 0) || (((RecyclerView.t)localObject1).UU.getLeft() >= paramt.UU.getLeft())) {
          break label356;
        }
        k = Math.abs(k);
        if (k <= i) {
          break label356;
        }
        localObject2 = localObject1;
        i = k;
      }
      label343:
      label356:
      for (;;)
      {
        if (i2 < 0)
        {
          k = ((RecyclerView.t)localObject1).UU.getTop() - paramInt2;
          if ((k > 0) && (((RecyclerView.t)localObject1).UU.getTop() < paramt.UU.getTop()))
          {
            k = Math.abs(k);
            if (k > i)
            {
              localObject2 = localObject1;
              i = k;
            }
          }
        }
        for (;;)
        {
          if (i2 > 0)
          {
            k = ((RecyclerView.t)localObject1).UU.getBottom() - (paramInt2 + n);
            if ((k < 0) && (((RecyclerView.t)localObject1).UU.getBottom() > paramt.UU.getBottom()))
            {
              k = Math.abs(k);
              if (k > i) {
                i = k;
              }
            }
          }
          for (;;)
          {
            j += 1;
            localObject2 = localObject1;
            break;
            return (RecyclerView.t)localObject2;
            break label142;
            localObject1 = localObject2;
          }
        }
      }
    }
    
    public static void a(Canvas paramCanvas, RecyclerView paramRecyclerView, RecyclerView.t paramt, float paramFloat1, float paramFloat2, int paramInt)
    {
      aad.a(paramCanvas, paramRecyclerView, paramt.UU, paramFloat1, paramFloat2, paramInt);
    }
    
    public static int ah(int paramInt1, int paramInt2)
    {
      int i = paramInt1 & 0xC0C0C;
      if (i == 0) {
        return paramInt1;
      }
      paramInt1 = (i ^ 0xFFFFFFFF) & paramInt1;
      if (paramInt2 == 0) {
        return paramInt1 | i << 2;
      }
      return paramInt1 | i << 1 & 0xFFF3F3F3 | (i << 1 & 0xC0C0C) << 2;
    }
    
    public static int ai(int paramInt1, int paramInt2)
    {
      int i = paramInt1 & 0x303030;
      if (i == 0) {
        return paramInt1;
      }
      paramInt1 = (i ^ 0xFFFFFFFF) & paramInt1;
      if (paramInt2 == 0) {
        return paramInt1 | i >> 2;
      }
      return paramInt1 | i >> 1 & 0xFFCFCFCF | (i >> 1 & 0x303030) >> 2;
    }
    
    public static long f(RecyclerView paramRecyclerView, int paramInt)
    {
      paramRecyclerView = paramRecyclerView.Ts;
      if (paramRecyclerView == null)
      {
        if (paramInt == 8) {
          return 200L;
        }
        return 250L;
      }
      if (paramInt == 8) {
        return paramRecyclerView.TY;
      }
      return paramRecyclerView.TX;
    }
    
    public static boolean hg()
    {
      return true;
    }
    
    public static int hj()
    {
      return 0;
    }
    
    public static float hk()
    {
      return 0.5F;
    }
    
    final int C(RecyclerView paramRecyclerView)
    {
      return ai(3342387, z.J(paramRecyclerView));
    }
    
    public final int a(RecyclerView paramRecyclerView, int paramInt1, int paramInt2, long paramLong)
    {
      float f1 = 1.0F;
      if (this.aag == -1) {
        this.aag = paramRecyclerView.getResources().getDimensionPixelSize(android.support.v7.d.a.a.Io);
      }
      int i = this.aag;
      int j = Math.abs(paramInt2);
      int k = (int)Math.signum(paramInt2);
      float f2 = Math.min(1.0F, j * 1.0F / paramInt1);
      paramInt1 = (int)(i * k * aaf.getInterpolation(f2));
      if (paramLong > 2000L) {}
      for (;;)
      {
        f2 = paramInt1;
        i = (int)(aae.getInterpolation(f1) * f2);
        paramInt1 = i;
        if (i == 0)
        {
          if (paramInt2 <= 0) {
            break;
          }
          paramInt1 = 1;
        }
        return paramInt1;
        f1 = (float)paramLong / 2000.0F;
      }
      return -1;
    }
    
    public void a(Canvas paramCanvas, RecyclerView paramRecyclerView, RecyclerView.t paramt, float paramFloat1, float paramFloat2, int paramInt, boolean paramBoolean)
    {
      aad.a(paramCanvas, paramRecyclerView, paramt.UU, paramFloat1, paramFloat2, paramInt, paramBoolean);
    }
    
    public abstract boolean a(RecyclerView.t paramt1, RecyclerView.t paramt2);
    
    public void c(RecyclerView paramRecyclerView, RecyclerView.t paramt)
    {
      aad.bz(paramt.UU);
    }
    
    public void e(RecyclerView.t paramt, int paramInt)
    {
      if (paramt != null) {
        aad.bA(paramt.UU);
      }
    }
    
    public abstract int hf();
    
    public boolean hh()
    {
      return true;
    }
    
    public boolean hi()
    {
      return true;
    }
    
    public float hl()
    {
      return 0.5F;
    }
    
    public abstract void hm();
  }
  
  private final class b
    extends GestureDetector.SimpleOnGestureListener
  {
    private b() {}
    
    public final boolean onDown(MotionEvent paramMotionEvent)
    {
      return true;
    }
    
    public final void onLongPress(MotionEvent paramMotionEvent)
    {
      Object localObject = a.this.p(paramMotionEvent);
      if (localObject != null)
      {
        localObject = a.this.Ub.aQ((View)localObject);
        if (localObject != null)
        {
          if ((a.this.ZM.C(a.this.Ub) & 0xFF0000) == 0) {
            break label66;
          }
          i = 1;
          if (i != 0) {
            break label72;
          }
        }
      }
      label66:
      label72:
      while (o.c(paramMotionEvent, 0) != a.this.eA)
      {
        return;
        i = 0;
        break;
      }
      int i = o.b(paramMotionEvent, a.this.eA);
      float f1 = o.d(paramMotionEvent, i);
      float f2 = o.e(paramMotionEvent, i);
      a.this.ZE = f1;
      a.this.ZF = f2;
      paramMotionEvent = a.this;
      a.this.ZJ = 0.0F;
      paramMotionEvent.ZI = 0.0F;
      a.this.ZM.hh();
      a.this.d((RecyclerView.t)localObject, 2);
    }
  }
  
  private class c
    implements android.support.v4.a.b
  {
    final RecyclerView.t Ui;
    final int ZN;
    final float aah;
    final float aai;
    final float aaj;
    final float aak;
    final g aal;
    public final int aam;
    public boolean aan;
    float aao;
    float aap;
    boolean aaq = false;
    float mO;
    public boolean mQ = false;
    
    public c(RecyclerView.t paramt, int paramInt1, int paramInt2, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4)
    {
      this.ZN = paramInt2;
      this.aam = paramInt1;
      this.Ui = paramt;
      this.aah = paramFloat1;
      this.aai = paramFloat2;
      this.aaj = paramFloat3;
      this.aak = paramFloat4;
      this.aal = android.support.v4.a.a.aB();
      this.aal.a(new d()
      {
        public final void b(g paramAnonymousg)
        {
          a.c.this.mO = paramAnonymousg.getAnimatedFraction();
        }
      });
      this.aal.w(paramt.UU);
      this.aal.a(this);
      this.mO = 0.0F;
    }
    
    public void a(g paramg)
    {
      if (!this.mQ) {
        this.Ui.U(true);
      }
      this.mQ = true;
    }
    
    public final void aC()
    {
      this.mO = 1.0F;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\android\support\v7\widget\a\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */