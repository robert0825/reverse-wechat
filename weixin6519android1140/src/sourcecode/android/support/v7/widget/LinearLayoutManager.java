package android.support.v7.widget;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.v4.view.a.a;
import android.support.v4.view.a.f;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.accessibility.AccessibilityEvent;
import java.util.List;

public class LinearLayoutManager
  extends RecyclerView.h
{
  int QU;
  private c Rf;
  ab Rg;
  private boolean Rh;
  private boolean Ri = false;
  boolean Rj = false;
  private boolean Rk = false;
  private boolean Rl = true;
  int Rm = -1;
  int Rn = Integer.MIN_VALUE;
  private boolean Ro;
  SavedState Rp = null;
  final a Rq = new a();
  
  public LinearLayoutManager()
  {
    this(1, false);
  }
  
  public LinearLayoutManager(int paramInt, boolean paramBoolean)
  {
    setOrientation(paramInt);
    r(null);
    if (this.Ri)
    {
      this.Ri = false;
      requestLayout();
    }
    this.Ue = true;
  }
  
  private void H(int paramInt1, int paramInt2)
  {
    this.Rf.QJ = (this.Rg.fi() - paramInt2);
    c localc = this.Rf;
    if (this.Rj) {}
    for (int i = -1;; i = 1)
    {
      localc.QL = i;
      this.Rf.QK = paramInt1;
      this.Rf.QM = 1;
      this.Rf.vq = paramInt2;
      this.Rf.Rw = Integer.MIN_VALUE;
      return;
    }
  }
  
  private void I(int paramInt1, int paramInt2)
  {
    this.Rf.QJ = (paramInt2 - this.Rg.fh());
    this.Rf.QK = paramInt1;
    c localc = this.Rf;
    if (this.Rj) {}
    for (paramInt1 = 1;; paramInt1 = -1)
    {
      localc.QL = paramInt1;
      this.Rf.QM = -1;
      this.Rf.vq = paramInt2;
      this.Rf.Rw = Integer.MIN_VALUE;
      return;
    }
  }
  
  private View O(boolean paramBoolean)
  {
    if (this.Rj) {
      return a(getChildCount() - 1, -1, paramBoolean, true);
    }
    return a(0, getChildCount(), paramBoolean, true);
  }
  
  private View P(boolean paramBoolean)
  {
    if (this.Rj) {
      return a(0, getChildCount(), paramBoolean, true);
    }
    return a(getChildCount() - 1, -1, paramBoolean, true);
  }
  
  private int a(int paramInt, RecyclerView.m paramm, RecyclerView.q paramq, boolean paramBoolean)
  {
    int i = this.Rg.fi() - paramInt;
    if (i > 0)
    {
      int j = -c(-i, paramm, paramq);
      i = j;
      if (paramBoolean)
      {
        paramInt = this.Rg.fi() - (paramInt + j);
        i = j;
        if (paramInt > 0)
        {
          this.Rg.ba(paramInt);
          i = j + paramInt;
        }
      }
      return i;
    }
    return 0;
  }
  
  private int a(RecyclerView.m paramm, c paramc, RecyclerView.q paramq, boolean paramBoolean)
  {
    int k = paramc.QJ;
    if (paramc.Rw != Integer.MIN_VALUE)
    {
      if (paramc.QJ < 0) {
        paramc.Rw += paramc.QJ;
      }
      a(paramm, paramc);
    }
    int i = paramc.QJ + paramc.Rx;
    b localb = new b();
    do
    {
      int j;
      do
      {
        if (((!paramc.QQ) && (i <= 0)) || (!paramc.k(paramq))) {
          break;
        }
        localb.Ru = 0;
        localb.mFinished = false;
        localb.Rv = false;
        localb.Iw = false;
        a(paramm, paramq, paramc, localb);
        if (localb.mFinished) {
          break;
        }
        paramc.vq += localb.Ru * paramc.QM;
        if ((localb.Rv) && (this.Rf.RA == null))
        {
          j = i;
          if (paramq.UL) {}
        }
        else
        {
          paramc.QJ -= localb.Ru;
          j = i - localb.Ru;
        }
        if (paramc.Rw != Integer.MIN_VALUE)
        {
          paramc.Rw += localb.Ru;
          if (paramc.QJ < 0) {
            paramc.Rw += paramc.QJ;
          }
          a(paramm, paramc);
        }
        i = j;
      } while (!paramBoolean);
      i = j;
    } while (!localb.Iw);
    return k - paramc.QJ;
  }
  
  private void a(int paramInt1, int paramInt2, boolean paramBoolean, RecyclerView.q paramq)
  {
    int i = -1;
    int j = 1;
    this.Rf.QQ = eV();
    this.Rf.Rx = a(paramq);
    this.Rf.QM = paramInt1;
    if (paramInt1 == 1)
    {
      paramq = this.Rf;
      paramq.Rx += this.Rg.getEndPadding();
      paramq = eY();
      localc = this.Rf;
      if (this.Rj) {}
      for (paramInt1 = i;; paramInt1 = 1)
      {
        localc.QL = paramInt1;
        this.Rf.QK = (be(paramq) + this.Rf.QL);
        this.Rf.vq = this.Rg.aW(paramq);
        paramInt1 = this.Rg.aW(paramq) - this.Rg.fi();
        this.Rf.QJ = paramInt2;
        if (paramBoolean)
        {
          paramq = this.Rf;
          paramq.QJ -= paramInt1;
        }
        this.Rf.Rw = paramInt1;
        return;
      }
    }
    paramq = eX();
    c localc = this.Rf;
    localc.Rx += this.Rg.fh();
    localc = this.Rf;
    if (this.Rj) {}
    for (paramInt1 = j;; paramInt1 = -1)
    {
      localc.QL = paramInt1;
      this.Rf.QK = (be(paramq) + this.Rf.QL);
      this.Rf.vq = this.Rg.aV(paramq);
      paramInt1 = -this.Rg.aV(paramq) + this.Rg.fh();
      break;
    }
  }
  
  private void a(a parama)
  {
    H(parama.jP, parama.Rs);
  }
  
  private void a(RecyclerView.m paramm, int paramInt1, int paramInt2)
  {
    if (paramInt1 == paramInt2) {}
    for (;;)
    {
      return;
      int i = paramInt1;
      if (paramInt2 > paramInt1)
      {
        paramInt2 -= 1;
        while (paramInt2 >= paramInt1)
        {
          a(paramInt2, paramm);
          paramInt2 -= 1;
        }
      }
      else
      {
        while (i > paramInt2)
        {
          a(i, paramm);
          i -= 1;
        }
      }
    }
  }
  
  private void a(RecyclerView.m paramm, c paramc)
  {
    if ((!paramc.QI) || (paramc.QQ)) {}
    for (;;)
    {
      return;
      int i;
      int j;
      int k;
      if (paramc.QM == -1)
      {
        i = paramc.Rw;
        j = getChildCount();
        if (i >= 0)
        {
          k = this.Rg.getEnd() - i;
          if (this.Rj)
          {
            i = 0;
            while (i < j)
            {
              paramc = getChildAt(i);
              if (this.Rg.aV(paramc) < k)
              {
                a(paramm, 0, i);
                return;
              }
              i += 1;
            }
          }
          else
          {
            i = j - 1;
            while (i >= 0)
            {
              paramc = getChildAt(i);
              if (this.Rg.aV(paramc) < k)
              {
                a(paramm, j - 1, i);
                return;
              }
              i -= 1;
            }
          }
        }
      }
      else
      {
        j = paramc.Rw;
        if (j >= 0)
        {
          k = getChildCount();
          if (this.Rj)
          {
            i = k - 1;
            while (i >= 0)
            {
              paramc = getChildAt(i);
              if (this.Rg.aW(paramc) > j)
              {
                a(paramm, k - 1, i);
                return;
              }
              i -= 1;
            }
          }
          else
          {
            i = 0;
            while (i < k)
            {
              paramc = getChildAt(i);
              if (this.Rg.aW(paramc) > j)
              {
                a(paramm, 0, i);
                return;
              }
              i += 1;
            }
          }
        }
      }
    }
  }
  
  private int b(int paramInt, RecyclerView.m paramm, RecyclerView.q paramq, boolean paramBoolean)
  {
    int i = paramInt - this.Rg.fh();
    if (i > 0)
    {
      int j = -c(i, paramm, paramq);
      i = j;
      if (paramBoolean)
      {
        paramInt = paramInt + j - this.Rg.fh();
        i = j;
        if (paramInt > 0)
        {
          this.Rg.ba(-paramInt);
          i = j - paramInt;
        }
      }
      return i;
    }
    return 0;
  }
  
  private void b(a parama)
  {
    I(parama.jP, parama.Rs);
  }
  
  private int c(int paramInt, RecyclerView.m paramm, RecyclerView.q paramq)
  {
    if ((getChildCount() == 0) || (paramInt == 0)) {
      return 0;
    }
    this.Rf.QI = true;
    eU();
    if (paramInt > 0) {}
    int j;
    int k;
    for (int i = 1;; i = -1)
    {
      j = Math.abs(paramInt);
      a(i, j, true, paramq);
      k = this.Rf.Rw + a(paramm, this.Rf, paramq, false);
      if (k >= 0) {
        break;
      }
      return 0;
    }
    if (j > k) {
      paramInt = i * k;
    }
    this.Rg.ba(-paramInt);
    this.Rf.Rz = paramInt;
    return paramInt;
  }
  
  private View d(RecyclerView.m paramm, RecyclerView.q paramq)
  {
    if (this.Rj) {
      return f(paramm, paramq);
    }
    return g(paramm, paramq);
  }
  
  private View e(RecyclerView.m paramm, RecyclerView.q paramq)
  {
    if (this.Rj) {
      return g(paramm, paramq);
    }
    return f(paramm, paramq);
  }
  
  private void eS()
  {
    boolean bool = true;
    if ((this.QU == 1) || (!eT())) {
      bool = this.Ri;
    }
    for (;;)
    {
      this.Rj = bool;
      return;
      if (this.Ri) {
        bool = false;
      }
    }
  }
  
  private boolean eV()
  {
    return (this.Rg.getMode() == 0) && (this.Rg.getEnd() == 0);
  }
  
  private View eX()
  {
    if (this.Rj) {}
    for (int i = getChildCount() - 1;; i = 0) {
      return getChildAt(i);
    }
  }
  
  private View eY()
  {
    if (this.Rj) {}
    for (int i = 0;; i = getChildCount() - 1) {
      return getChildAt(i);
    }
  }
  
  private View f(RecyclerView.m paramm, RecyclerView.q paramq)
  {
    return a(paramm, paramq, 0, getChildCount(), paramq.getItemCount());
  }
  
  private View g(RecyclerView.m paramm, RecyclerView.q paramq)
  {
    return a(paramm, paramq, getChildCount() - 1, -1, paramq.getItemCount());
  }
  
  private int h(RecyclerView.q paramq)
  {
    boolean bool2 = true;
    if (getChildCount() == 0) {
      return 0;
    }
    eU();
    ab localab = this.Rg;
    View localView;
    if (!this.Rl)
    {
      bool1 = true;
      localView = O(bool1);
      if (this.Rl) {
        break label74;
      }
    }
    label74:
    for (boolean bool1 = bool2;; bool1 = false)
    {
      return ah.a(paramq, localab, localView, P(bool1), this, this.Rl, this.Rj);
      bool1 = false;
      break;
    }
  }
  
  private int i(RecyclerView.q paramq)
  {
    boolean bool2 = true;
    if (getChildCount() == 0) {
      return 0;
    }
    eU();
    ab localab = this.Rg;
    View localView;
    if (!this.Rl)
    {
      bool1 = true;
      localView = O(bool1);
      if (this.Rl) {
        break label70;
      }
    }
    label70:
    for (boolean bool1 = bool2;; bool1 = false)
    {
      return ah.a(paramq, localab, localView, P(bool1), this, this.Rl);
      bool1 = false;
      break;
    }
  }
  
  private int j(RecyclerView.q paramq)
  {
    boolean bool2 = true;
    if (getChildCount() == 0) {
      return 0;
    }
    eU();
    ab localab = this.Rg;
    View localView;
    if (!this.Rl)
    {
      bool1 = true;
      localView = O(bool1);
      if (this.Rl) {
        break label70;
      }
    }
    label70:
    for (boolean bool1 = bool2;; bool1 = false)
    {
      return ah.b(paramq, localab, localView, P(bool1), this, this.Rl);
      bool1 = false;
      break;
    }
  }
  
  public final void J(int paramInt1, int paramInt2)
  {
    this.Rm = paramInt1;
    this.Rn = paramInt2;
    if (this.Rp != null) {
      this.Rp.RB = -1;
    }
    requestLayout();
  }
  
  public int a(int paramInt, RecyclerView.m paramm, RecyclerView.q paramq)
  {
    if (this.QU == 1) {
      return 0;
    }
    return c(paramInt, paramm, paramq);
  }
  
  public int a(RecyclerView.q paramq)
  {
    int j = 0;
    if (paramq.Uw != -1) {}
    for (int i = 1;; i = 0)
    {
      if (i != 0) {
        j = this.Rg.fj();
      }
      return j;
    }
  }
  
  public final View a(int paramInt1, int paramInt2, boolean paramBoolean1, boolean paramBoolean2)
  {
    eU();
    int j = this.Rg.fh();
    int k = this.Rg.fi();
    if (paramInt2 > paramInt1) {}
    Object localObject;
    View localView;
    for (int i = 1;; i = -1)
    {
      localObject = null;
      if (paramInt1 == paramInt2) {
        break label130;
      }
      localView = getChildAt(paramInt1);
      int m = this.Rg.aV(localView);
      int n = this.Rg.aW(localView);
      if ((m >= k) || (n <= j)) {
        break label133;
      }
      if ((paramBoolean1) && ((m < j) || (n > k))) {
        break;
      }
      return localView;
    }
    if ((paramBoolean2) && (localObject == null)) {
      localObject = localView;
    }
    label130:
    label133:
    for (;;)
    {
      paramInt1 += i;
      break;
      return (View)localObject;
    }
  }
  
  View a(RecyclerView.m paramm, RecyclerView.q paramq, int paramInt1, int paramInt2, int paramInt3)
  {
    paramm = null;
    eU();
    int j = this.Rg.fh();
    int k = this.Rg.fi();
    int i;
    label35:
    View localView;
    if (paramInt2 > paramInt1)
    {
      i = 1;
      paramq = null;
      if (paramInt1 == paramInt2) {
        break label147;
      }
      localView = getChildAt(paramInt1);
      int m = be(localView);
      if ((m < 0) || (m >= paramInt3)) {
        break label159;
      }
      if (!((RecyclerView.LayoutParams)localView.getLayoutParams()).Ui.isRemoved()) {
        break label105;
      }
      if (paramq != null) {
        break label159;
      }
      paramq = localView;
    }
    label105:
    label147:
    label157:
    label159:
    for (;;)
    {
      paramInt1 += i;
      break label35;
      i = -1;
      break;
      Object localObject;
      if (this.Rg.aV(localView) < k)
      {
        localObject = localView;
        if (this.Rg.aW(localView) >= j) {}
      }
      else
      {
        if (paramm != null) {
          break label159;
        }
        paramm = localView;
        continue;
        if (paramm == null) {
          break label157;
        }
        localObject = paramm;
      }
      return (View)localObject;
      return paramq;
    }
  }
  
  public View a(View paramView, int paramInt, RecyclerView.m paramm, RecyclerView.q paramq)
  {
    eS();
    if (getChildCount() == 0) {}
    label42:
    label134:
    label136:
    label142:
    for (;;)
    {
      return null;
      paramInt = aY(paramInt);
      if (paramInt != Integer.MIN_VALUE)
      {
        eU();
        if (paramInt == -1)
        {
          paramView = e(paramm, paramq);
          if (paramView == null) {
            break label134;
          }
          eU();
          a(paramInt, (int)(0.33333334F * this.Rg.fj()), false, paramq);
          this.Rf.Rw = Integer.MIN_VALUE;
          this.Rf.QI = false;
          a(paramm, this.Rf, paramq, true);
          if (paramInt != -1) {
            break label136;
          }
        }
        for (paramm = eX();; paramm = eY())
        {
          if ((paramm == paramView) || (!paramm.isFocusable())) {
            break label142;
          }
          return paramm;
          paramView = d(paramm, paramq);
          break label42;
          break;
        }
      }
    }
  }
  
  void a(RecyclerView.m paramm, RecyclerView.q paramq, a parama, int paramInt) {}
  
  void a(RecyclerView.m paramm, RecyclerView.q paramq, c paramc, b paramb)
  {
    paramm = paramc.a(paramm);
    if (paramm == null)
    {
      paramb.mFinished = true;
      return;
    }
    paramq = (RecyclerView.LayoutParams)paramm.getLayoutParams();
    boolean bool2;
    boolean bool1;
    label63:
    int k;
    int m;
    int i;
    int j;
    label286:
    int n;
    int i1;
    if (paramc.RA == null)
    {
      bool2 = this.Rj;
      if (paramc.QM == -1)
      {
        bool1 = true;
        if (bool2 != bool1) {
          break label410;
        }
        super.c(paramm, -1, false);
        RecyclerView.LayoutParams localLayoutParams = (RecyclerView.LayoutParams)paramm.getLayoutParams();
        Rect localRect = this.Ub.bc(paramm);
        k = localRect.left;
        m = localRect.right;
        i = localRect.top;
        j = localRect.bottom;
        k = RecyclerView.h.b(this.mWidth, this.Ug, k + m + 0 + (getPaddingLeft() + getPaddingRight() + localLayoutParams.leftMargin + localLayoutParams.rightMargin), localLayoutParams.width, eQ());
        i = RecyclerView.h.b(this.mHeight, this.Uh, j + i + 0 + (getPaddingTop() + getPaddingBottom() + localLayoutParams.topMargin + localLayoutParams.bottomMargin), localLayoutParams.height, eR());
        if (a(paramm, k, i, localLayoutParams)) {
          paramm.measure(k, i);
        }
        paramb.Ru = this.Rg.aX(paramm);
        if (this.QU != 1) {
          break label533;
        }
        if (!eT()) {
          break label470;
        }
        i = this.mWidth - getPaddingRight();
        j = i - this.Rg.aY(paramm);
        if (paramc.QM != -1) {
          break label492;
        }
        m = paramc.vq;
        n = paramc.vq;
        i1 = paramb.Ru;
        k = j;
        n -= i1;
        j = i;
        i = k;
        k = n;
      }
    }
    for (;;)
    {
      g(paramm, i + paramq.leftMargin, k + paramq.topMargin, j - paramq.rightMargin, m - paramq.bottomMargin);
      if ((paramq.Ui.isRemoved()) || (paramq.Ui.gq())) {
        paramb.Rv = true;
      }
      paramb.Iw = paramm.isFocusable();
      return;
      bool1 = false;
      break;
      label410:
      super.c(paramm, 0, false);
      break label63;
      bool2 = this.Rj;
      if (paramc.QM == -1) {}
      for (bool1 = true;; bool1 = false)
      {
        if (bool2 != bool1) {
          break label460;
        }
        super.c(paramm, -1, true);
        break;
      }
      label460:
      super.c(paramm, 0, true);
      break label63;
      label470:
      j = getPaddingLeft();
      i = this.Rg.aY(paramm) + j;
      break label286;
      label492:
      k = paramc.vq;
      m = paramc.vq;
      i1 = paramb.Ru;
      n = i;
      m += i1;
      i = j;
      j = n;
      continue;
      label533:
      k = getPaddingTop();
      m = this.Rg.aY(paramm) + k;
      if (paramc.QM == -1)
      {
        j = paramc.vq;
        i = paramc.vq - paramb.Ru;
      }
      else
      {
        i = paramc.vq;
        j = paramc.vq + paramb.Ru;
      }
    }
  }
  
  public void a(RecyclerView paramRecyclerView, int paramInt)
  {
    paramRecyclerView = new z(paramRecyclerView.getContext())
    {
      public final PointF aW(int paramAnonymousInt)
      {
        return LinearLayoutManager.this.aW(paramAnonymousInt);
      }
    };
    paramRecyclerView.Uw = paramInt;
    a(paramRecyclerView);
  }
  
  public final void a(RecyclerView paramRecyclerView, RecyclerView.m paramm)
  {
    super.a(paramRecyclerView, paramm);
    if (this.Ro)
    {
      d(paramm);
      paramm.clear();
    }
  }
  
  public final View aV(int paramInt)
  {
    int i = getChildCount();
    Object localObject;
    if (i == 0) {
      localObject = null;
    }
    View localView;
    do
    {
      return (View)localObject;
      int j = paramInt - be(getChildAt(0));
      if ((j < 0) || (j >= i)) {
        break;
      }
      localView = getChildAt(j);
      localObject = localView;
    } while (be(localView) == paramInt);
    return super.aV(paramInt);
  }
  
  public final PointF aW(int paramInt)
  {
    int i = 1;
    int j = 0;
    if (getChildCount() == 0) {
      return null;
    }
    if (paramInt < be(getChildAt(0))) {
      j = 1;
    }
    paramInt = i;
    if (j != this.Rj) {
      paramInt = -1;
    }
    if (this.QU == 0) {
      return new PointF(paramInt, 0.0F);
    }
    return new PointF(0.0F, paramInt);
  }
  
  public final void aX(int paramInt)
  {
    this.Rm = paramInt;
    this.Rn = Integer.MIN_VALUE;
    if (this.Rp != null) {
      this.Rp.RB = -1;
    }
    requestLayout();
  }
  
  final int aY(int paramInt)
  {
    int j = -1;
    int i = j;
    switch (paramInt)
    {
    default: 
      i = Integer.MIN_VALUE;
    case 1: 
    case 2: 
    case 33: 
    case 130: 
    case 17: 
      do
      {
        do
        {
          return i;
          return 1;
          i = j;
        } while (this.QU == 1);
        return Integer.MIN_VALUE;
        if (this.QU == 1) {
          return 1;
        }
        return Integer.MIN_VALUE;
        i = j;
      } while (this.QU == 0);
      return Integer.MIN_VALUE;
    }
    if (this.QU == 0) {
      return 1;
    }
    return Integer.MIN_VALUE;
  }
  
  public int b(int paramInt, RecyclerView.m paramm, RecyclerView.q paramq)
  {
    if (this.QU == 0) {
      return 0;
    }
    return c(paramInt, paramm, paramq);
  }
  
  public final int b(RecyclerView.q paramq)
  {
    return h(paramq);
  }
  
  public final int c(RecyclerView.q paramq)
  {
    return h(paramq);
  }
  
  public void c(RecyclerView.m paramm, RecyclerView.q paramq)
  {
    if (((this.Rp != null) || (this.Rm != -1)) && (paramq.getItemCount() == 0))
    {
      d(paramm);
      return;
    }
    if ((this.Rp != null) && (this.Rp.fc())) {
      this.Rm = this.Rp.RB;
    }
    eU();
    this.Rf.QI = false;
    eS();
    Object localObject1 = this.Rq;
    ((a)localObject1).jP = -1;
    ((a)localObject1).Rs = Integer.MIN_VALUE;
    ((a)localObject1).Rt = false;
    this.Rq.Rt = (this.Rj ^ this.Rk);
    Object localObject2 = this.Rq;
    int i;
    label157:
    label211:
    int j;
    label240:
    label242:
    label265:
    label290:
    int m;
    int n;
    int k;
    if ((paramq.UL) || (this.Rm == -1))
    {
      i = 0;
      if (i == 0)
      {
        if (getChildCount() == 0) {
          break label1759;
        }
        if (this.Ub != null) {
          break label1261;
        }
        localObject1 = null;
        if (localObject1 == null) {
          break label1608;
        }
        RecyclerView.LayoutParams localLayoutParams = (RecyclerView.LayoutParams)((View)localObject1).getLayoutParams();
        if ((localLayoutParams.Ui.isRemoved()) || (localLayoutParams.Ui.gb() < 0) || (localLayoutParams.Ui.gb() >= paramq.getItemCount())) {
          break label1296;
        }
        i = 1;
        if (i == 0) {
          break label1608;
        }
        j = ((a)localObject2).Rr.Rg.fg();
        if (j < 0) {
          break label1301;
        }
        ((a)localObject2).aT((View)localObject1);
        i = 1;
        if (i == 0)
        {
          ((a)localObject2).fb();
          if (!this.Rk) {
            break label1764;
          }
          i = paramq.getItemCount() - 1;
          ((a)localObject2).jP = i;
        }
      }
      i = a(paramq);
      if (this.Rf.Rz < 0) {
        break label1769;
      }
      j = 0;
      m = j + this.Rg.fh();
      n = i + this.Rg.getEndPadding();
      j = m;
      k = n;
      if (paramq.UL)
      {
        j = m;
        k = n;
        if (this.Rm != -1)
        {
          j = m;
          k = n;
          if (this.Rn != Integer.MIN_VALUE)
          {
            localObject1 = aV(this.Rm);
            j = m;
            k = n;
            if (localObject1 != null)
            {
              if (!this.Rj) {
                break label1781;
              }
              i = this.Rg.fi() - this.Rg.aW((View)localObject1) - this.Rn;
              label414:
              if (i <= 0) {
                break label1813;
              }
              j = m + i;
              k = n;
            }
          }
        }
      }
      label428:
      if (!this.Rq.Rt) {
        break label1831;
      }
      if (!this.Rj) {
        break label1826;
      }
      i = 1;
      label447:
      a(paramm, paramq, this.Rq, i);
      b(paramm);
      this.Rf.QQ = eV();
      this.Rf.Ry = paramq.UL;
      if (!this.Rq.Rt) {
        break label1848;
      }
      b(this.Rq);
      this.Rf.Rx = j;
      a(paramm, this.Rf, paramq, false);
      j = this.Rf.vq;
      m = this.Rf.QK;
      i = k;
      if (this.Rf.QJ > 0) {
        i = k + this.Rf.QJ;
      }
      a(this.Rq);
      this.Rf.Rx = i;
      localObject1 = this.Rf;
      ((c)localObject1).QK += this.Rf.QL;
      a(paramm, this.Rf, paramq, false);
      k = this.Rf.vq;
      i = j;
      if (this.Rf.QJ > 0)
      {
        i = this.Rf.QJ;
        I(m, j);
        this.Rf.Rx = i;
        a(paramm, this.Rf, paramq, false);
        i = this.Rf.vq;
      }
      j = i;
      i = k;
    }
    for (;;)
    {
      label690:
      if (getChildCount() > 0) {
        if ((this.Rj ^ this.Rk))
        {
          k = a(i, paramm, paramq, true);
          m = j + k;
          j = b(m, paramm, paramq, false);
          m += j;
          k = i + k + j;
        }
      }
      for (;;)
      {
        boolean bool;
        label1166:
        label1193:
        label1199:
        label1261:
        label1296:
        label1301:
        int i1;
        if ((!paramq.UN) || (getChildCount() == 0) || (paramq.UL) || (!eP()))
        {
          if (!paramq.UL)
          {
            this.Rm = -1;
            this.Rn = Integer.MIN_VALUE;
            paramm = this.Rg;
            paramm.SI = paramm.fj();
          }
          this.Rh = this.Rk;
          this.Rp = null;
          return;
          if ((this.Rm < 0) || (this.Rm >= paramq.getItemCount()))
          {
            this.Rm = -1;
            this.Rn = Integer.MIN_VALUE;
            i = 0;
            break;
          }
          ((a)localObject2).jP = this.Rm;
          if ((this.Rp != null) && (this.Rp.fc()))
          {
            ((a)localObject2).Rt = this.Rp.RD;
            if (((a)localObject2).Rt) {}
            for (((a)localObject2).Rs = (this.Rg.fi() - this.Rp.RC);; ((a)localObject2).Rs = (this.Rg.fh() + this.Rp.RC))
            {
              i = 1;
              break;
            }
          }
          if (this.Rn == Integer.MIN_VALUE)
          {
            localObject1 = aV(this.Rm);
            if (localObject1 != null) {
              if (this.Rg.aX((View)localObject1) > this.Rg.fj()) {
                ((a)localObject2).fb();
              }
            }
          }
          for (;;)
          {
            i = 1;
            break;
            if (this.Rg.aV((View)localObject1) - this.Rg.fh() < 0)
            {
              ((a)localObject2).Rs = this.Rg.fh();
              ((a)localObject2).Rt = false;
            }
            else if (this.Rg.fi() - this.Rg.aW((View)localObject1) < 0)
            {
              ((a)localObject2).Rs = this.Rg.fi();
              ((a)localObject2).Rt = true;
            }
            else
            {
              if (((a)localObject2).Rt) {}
              for (i = this.Rg.aW((View)localObject1) + this.Rg.fg();; i = this.Rg.aV((View)localObject1))
              {
                ((a)localObject2).Rs = i;
                i = 1;
                break;
              }
              if (getChildCount() > 0)
              {
                i = be(getChildAt(0));
                if (this.Rm >= i) {
                  break label1193;
                }
                bool = true;
                if (bool != this.Rj) {
                  break label1199;
                }
              }
              for (bool = true;; bool = false)
              {
                ((a)localObject2).Rt = bool;
                ((a)localObject2).fb();
                break;
                bool = false;
                break label1166;
              }
              ((a)localObject2).Rt = this.Rj;
              if (this.Rj) {
                ((a)localObject2).Rs = (this.Rg.fi() - this.Rn);
              } else {
                ((a)localObject2).Rs = (this.Rg.fh() + this.Rn);
              }
            }
          }
          localObject1 = this.Ub.getFocusedChild();
          if ((localObject1 == null) || (this.SR.aP((View)localObject1)))
          {
            localObject1 = null;
            break label157;
          }
          break label157;
          i = 0;
          break label211;
          ((a)localObject2).jP = be((View)localObject1);
          if (((a)localObject2).Rt)
          {
            i = ((a)localObject2).Rr.Rg.fi() - j - ((a)localObject2).Rr.Rg.aW((View)localObject1);
            ((a)localObject2).Rs = (((a)localObject2).Rr.Rg.fi() - i);
            if (i <= 0) {
              break label240;
            }
            j = ((a)localObject2).Rr.Rg.aX((View)localObject1);
            k = ((a)localObject2).Rs;
            m = ((a)localObject2).Rr.Rg.fh();
            j = k - j - (Math.min(((a)localObject2).Rr.Rg.aV((View)localObject1) - m, 0) + m);
            if (j >= 0) {
              break label240;
            }
            k = ((a)localObject2).Rs;
            ((a)localObject2).Rs = (Math.min(i, -j) + k);
            break label240;
          }
          k = ((a)localObject2).Rr.Rg.aV((View)localObject1);
          i = k - ((a)localObject2).Rr.Rg.fh();
          ((a)localObject2).Rs = k;
          if (i <= 0) {
            break label240;
          }
          m = ((a)localObject2).Rr.Rg.aX((View)localObject1);
          n = ((a)localObject2).Rr.Rg.fi();
          i1 = ((a)localObject2).Rr.Rg.aW((View)localObject1);
          j = ((a)localObject2).Rr.Rg.fi() - Math.min(0, n - j - i1) - (k + m);
          if (j >= 0) {
            break label240;
          }
          ((a)localObject2).Rs -= Math.min(i, -j);
          break label240;
          label1608:
          if (this.Rh == this.Rk)
          {
            if (((a)localObject2).Rt)
            {
              localObject1 = d(paramm, paramq);
              label1635:
              if (localObject1 == null) {
                break label1759;
              }
              ((a)localObject2).aT((View)localObject1);
              if ((!paramq.UL) && (eP()))
              {
                if ((this.Rg.aV((View)localObject1) < this.Rg.fi()) && (this.Rg.aW((View)localObject1) >= this.Rg.fh())) {
                  break label1743;
                }
                i = 1;
                label1701:
                if (i != 0) {
                  if (!((a)localObject2).Rt) {
                    break label1748;
                  }
                }
              }
            }
            label1743:
            label1748:
            for (i = this.Rg.fi();; i = this.Rg.fh())
            {
              ((a)localObject2).Rs = i;
              i = 1;
              break;
              localObject1 = e(paramm, paramq);
              break label1635;
              i = 0;
              break label1701;
            }
          }
          label1759:
          i = 0;
          break label242;
          label1764:
          i = 0;
          break label265;
          label1769:
          k = 0;
          j = i;
          i = k;
          break label290;
          label1781:
          i = this.Rg.aV((View)localObject1);
          j = this.Rg.fh();
          i = this.Rn - (i - j);
          break label414;
          label1813:
          k = n - i;
          j = m;
          break label428;
          label1826:
          i = -1;
          break label447;
          label1831:
          if (this.Rj)
          {
            i = -1;
            break label447;
          }
          i = 1;
          break label447;
          label1848:
          a(this.Rq);
          this.Rf.Rx = k;
          a(paramm, this.Rf, paramq, false);
          k = this.Rf.vq;
          m = this.Rf.QK;
          i = j;
          if (this.Rf.QJ > 0) {
            i = j + this.Rf.QJ;
          }
          b(this.Rq);
          this.Rf.Rx = i;
          localObject1 = this.Rf;
          ((c)localObject1).QK += this.Rf.QL;
          a(paramm, this.Rf, paramq, false);
          i = this.Rf.vq;
          if (this.Rf.QJ <= 0) {
            break label2418;
          }
          j = this.Rf.QJ;
          H(m, k);
          this.Rf.Rx = j;
          a(paramm, this.Rf, paramq, false);
          k = this.Rf.vq;
          j = i;
          i = k;
          break label690;
          k = b(j, paramm, paramq, true);
          i += k;
          n = a(i, paramm, paramq, false);
          m = j + k + n;
          k = i + n;
          continue;
        }
        i = 0;
        j = 0;
        localObject1 = paramm.Ur;
        int i2 = ((List)localObject1).size();
        int i3 = be(getChildAt(0));
        n = 0;
        label2123:
        if (n < i2)
        {
          localObject2 = (RecyclerView.t)((List)localObject1).get(n);
          if (((RecyclerView.t)localObject2).isRemoved()) {
            break label2395;
          }
          if (((RecyclerView.t)localObject2).gb() < i3)
          {
            bool = true;
            label2165:
            if (bool == this.Rj) {
              break label2235;
            }
            i1 = -1;
            label2177:
            if (i1 != -1) {
              break label2241;
            }
            i1 = this.Rg.aX(((RecyclerView.t)localObject2).UU) + i;
            i = j;
            j = i1;
          }
        }
        for (;;)
        {
          i1 = n + 1;
          n = j;
          j = i;
          i = n;
          n = i1;
          break label2123;
          bool = false;
          break label2165;
          label2235:
          i1 = 1;
          break label2177;
          label2241:
          i1 = this.Rg.aX(((RecyclerView.t)localObject2).UU) + j;
          j = i;
          i = i1;
          continue;
          this.Rf.RA = ((List)localObject1);
          if (i > 0)
          {
            I(be(eX()), m);
            this.Rf.Rx = i;
            this.Rf.QJ = 0;
            this.Rf.aU(null);
            a(paramm, this.Rf, paramq, false);
          }
          if (j > 0)
          {
            H(be(eY()), k);
            this.Rf.Rx = j;
            this.Rf.QJ = 0;
            this.Rf.aU(null);
            a(paramm, this.Rf, paramq, false);
          }
          this.Rf.RA = null;
          break;
          label2395:
          i1 = i;
          i = j;
          j = i1;
        }
        k = i;
        m = j;
      }
      label2418:
      j = k;
      k = i;
      i = j;
      j = k;
    }
  }
  
  public final int d(RecyclerView.q paramq)
  {
    return i(paramq);
  }
  
  public final int e(RecyclerView.q paramq)
  {
    return i(paramq);
  }
  
  public RecyclerView.LayoutParams eM()
  {
    return new RecyclerView.LayoutParams(-2, -2);
  }
  
  public boolean eP()
  {
    return (this.Rp == null) && (this.Rh == this.Rk);
  }
  
  public final boolean eQ()
  {
    return this.QU == 0;
  }
  
  public final boolean eR()
  {
    return this.QU == 1;
  }
  
  protected final boolean eT()
  {
    return android.support.v4.view.z.J(this.Ub) == 1;
  }
  
  final void eU()
  {
    if (this.Rf == null) {
      this.Rf = new c();
    }
    if (this.Rg == null) {
      switch (this.QU)
      {
      default: 
        throw new IllegalArgumentException("invalid orientation");
      }
    }
    for (Object localObject = new ab.1(this);; localObject = new ab.2(this))
    {
      this.Rg = ((ab)localObject);
      return;
    }
  }
  
  final boolean eW()
  {
    if ((this.Uh != 1073741824) && (this.Ug != 1073741824))
    {
      int j = getChildCount();
      int i = 0;
      if (i < j)
      {
        ViewGroup.LayoutParams localLayoutParams = getChildAt(i).getLayoutParams();
        if ((localLayoutParams.width >= 0) || (localLayoutParams.height >= 0)) {}
      }
      for (i = 1;; i = 0)
      {
        if (i == 0) {
          break label75;
        }
        return true;
        i += 1;
        break;
      }
    }
    label75:
    return false;
  }
  
  public final int eZ()
  {
    View localView = a(0, getChildCount(), false, true);
    if (localView == null) {
      return -1;
    }
    return be(localView);
  }
  
  public final int f(RecyclerView.q paramq)
  {
    return j(paramq);
  }
  
  public final int fa()
  {
    View localView = a(getChildCount() - 1, -1, false, true);
    if (localView == null) {
      return -1;
    }
    return be(localView);
  }
  
  public final int g(RecyclerView.q paramq)
  {
    return j(paramq);
  }
  
  public final void onInitializeAccessibilityEvent(AccessibilityEvent paramAccessibilityEvent)
  {
    super.onInitializeAccessibilityEvent(paramAccessibilityEvent);
    if (getChildCount() > 0)
    {
      paramAccessibilityEvent = a.a(paramAccessibilityEvent);
      paramAccessibilityEvent.setFromIndex(eZ());
      paramAccessibilityEvent.setToIndex(fa());
    }
  }
  
  public final void onRestoreInstanceState(Parcelable paramParcelable)
  {
    if ((paramParcelable instanceof SavedState))
    {
      this.Rp = ((SavedState)paramParcelable);
      requestLayout();
    }
  }
  
  public final Parcelable onSaveInstanceState()
  {
    if (this.Rp != null) {
      return new SavedState(this.Rp);
    }
    SavedState localSavedState = new SavedState();
    if (getChildCount() > 0)
    {
      eU();
      boolean bool = this.Rh ^ this.Rj;
      localSavedState.RD = bool;
      if (bool)
      {
        localView = eY();
        localSavedState.RC = (this.Rg.fi() - this.Rg.aW(localView));
        localSavedState.RB = be(localView);
        return localSavedState;
      }
      View localView = eX();
      localSavedState.RB = be(localView);
      localSavedState.RC = (this.Rg.aV(localView) - this.Rg.fh());
      return localSavedState;
    }
    localSavedState.RB = -1;
    return localSavedState;
  }
  
  public final void r(String paramString)
  {
    if (this.Rp == null) {
      super.r(paramString);
    }
  }
  
  public final void setOrientation(int paramInt)
  {
    if ((paramInt != 0) && (paramInt != 1)) {
      throw new IllegalArgumentException("invalid orientation:" + paramInt);
    }
    r(null);
    if (paramInt == this.QU) {
      return;
    }
    this.QU = paramInt;
    this.Rg = null;
    requestLayout();
  }
  
  public static class SavedState
    implements Parcelable
  {
    public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.Creator() {};
    int RB;
    int RC;
    boolean RD;
    
    public SavedState() {}
    
    SavedState(Parcel paramParcel)
    {
      this.RB = paramParcel.readInt();
      this.RC = paramParcel.readInt();
      if (paramParcel.readInt() == 1) {}
      for (;;)
      {
        this.RD = bool;
        return;
        bool = false;
      }
    }
    
    public SavedState(SavedState paramSavedState)
    {
      this.RB = paramSavedState.RB;
      this.RC = paramSavedState.RC;
      this.RD = paramSavedState.RD;
    }
    
    public int describeContents()
    {
      return 0;
    }
    
    final boolean fc()
    {
      return this.RB >= 0;
    }
    
    public void writeToParcel(Parcel paramParcel, int paramInt)
    {
      paramParcel.writeInt(this.RB);
      paramParcel.writeInt(this.RC);
      if (this.RD) {}
      for (paramInt = 1;; paramInt = 0)
      {
        paramParcel.writeInt(paramInt);
        return;
      }
    }
  }
  
  final class a
  {
    int Rs;
    boolean Rt;
    int jP;
    
    a() {}
    
    public final void aT(View paramView)
    {
      if (this.Rt) {}
      for (this.Rs = (LinearLayoutManager.this.Rg.aW(paramView) + LinearLayoutManager.this.Rg.fg());; this.Rs = LinearLayoutManager.this.Rg.aV(paramView))
      {
        this.jP = LinearLayoutManager.be(paramView);
        return;
      }
    }
    
    final void fb()
    {
      if (this.Rt) {}
      for (int i = LinearLayoutManager.this.Rg.fi();; i = LinearLayoutManager.this.Rg.fh())
      {
        this.Rs = i;
        return;
      }
    }
    
    public final String toString()
    {
      return "AnchorInfo{mPosition=" + this.jP + ", mCoordinate=" + this.Rs + ", mLayoutFromEnd=" + this.Rt + '}';
    }
  }
  
  protected static final class b
  {
    public boolean Iw;
    public int Ru;
    public boolean Rv;
    public boolean mFinished;
  }
  
  static final class c
  {
    boolean QI = true;
    int QJ;
    int QK;
    int QL;
    int QM;
    boolean QQ;
    List<RecyclerView.t> RA = null;
    int Rw;
    int Rx = 0;
    boolean Ry = false;
    int Rz;
    int vq;
    
    final View a(RecyclerView.m paramm)
    {
      if (this.RA != null)
      {
        int j = this.RA.size();
        int i = 0;
        while (i < j)
        {
          paramm = ((RecyclerView.t)this.RA.get(i)).UU;
          RecyclerView.LayoutParams localLayoutParams = (RecyclerView.LayoutParams)paramm.getLayoutParams();
          if ((!localLayoutParams.Ui.isRemoved()) && (this.QK == localLayoutParams.Ui.gb()))
          {
            aU(paramm);
            return paramm;
          }
          i += 1;
        }
        return null;
      }
      paramm = paramm.bk(this.QK);
      this.QK += this.QL;
      return paramm;
    }
    
    public final void aU(View paramView)
    {
      int m = this.RA.size();
      Object localObject = null;
      int i = Integer.MAX_VALUE;
      int j = 0;
      if (j < m)
      {
        View localView = ((RecyclerView.t)this.RA.get(j)).UU;
        RecyclerView.LayoutParams localLayoutParams = (RecyclerView.LayoutParams)localView.getLayoutParams();
        if ((localView == paramView) || (localLayoutParams.Ui.isRemoved())) {
          break label154;
        }
        int k = (localLayoutParams.Ui.gb() - this.QK) * this.QL;
        if ((k < 0) || (k >= i)) {
          break label154;
        }
        localObject = localView;
        if (k != 0)
        {
          localObject = localView;
          i = k;
        }
      }
      label154:
      for (;;)
      {
        j += 1;
        break;
        if (localObject == null)
        {
          this.QK = -1;
          return;
        }
        this.QK = ((RecyclerView.LayoutParams)((View)localObject).getLayoutParams()).Ui.gb();
        return;
      }
    }
    
    final boolean k(RecyclerView.q paramq)
    {
      return (this.QK >= 0) && (this.QK < paramq.getItemCount());
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\android\support\v7\widget\LinearLayoutManager.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */