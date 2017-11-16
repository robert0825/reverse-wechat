package android.support.v7.widget;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.v4.view.a.a;
import android.support.v4.view.a.b;
import android.support.v4.view.a.b.l;
import android.support.v4.view.a.f;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.accessibility.AccessibilityEvent;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.List;

public final class StaggeredGridLayoutManager
  extends RecyclerView.h
{
  public int QU;
  private int Qx;
  public boolean Ri;
  boolean Rj;
  private boolean Rl;
  int Rm;
  int Rn;
  private b[] WM;
  ab WN;
  ab WO;
  private int WP;
  private final y WQ;
  private BitSet WR;
  LazySpanLookup WS;
  private int WT;
  private boolean WU;
  private boolean WV;
  private SavedState WW;
  private int WX;
  private final a WY;
  private boolean WZ;
  private final Runnable Xa;
  private final Rect fV;
  
  private View Z(boolean paramBoolean)
  {
    int j = this.WN.fh();
    int k = this.WN.fi();
    int m = getChildCount();
    Object localObject = null;
    int i = 0;
    if (i < m)
    {
      View localView = getChildAt(i);
      int n = this.WN.aV(localView);
      if ((this.WN.aW(localView) <= j) || (n >= k)) {
        break label104;
      }
      if ((n >= j) || (!paramBoolean)) {
        return localView;
      }
      if (localObject != null) {
        break label104;
      }
      localObject = localView;
    }
    label104:
    for (;;)
    {
      i += 1;
      break;
      return (View)localObject;
    }
  }
  
  private int a(RecyclerView.m paramm, y paramy, RecyclerView.q paramq)
  {
    this.WR.set(0, this.Qx, true);
    int i;
    int n;
    label61:
    int j;
    int k;
    label85:
    View localView;
    LayoutParams localLayoutParams;
    int i4;
    label181:
    int i1;
    if (this.WQ.QQ) {
      if (paramy.QM == 1)
      {
        i = Integer.MAX_VALUE;
        ad(paramy.QM, i);
        if (!this.Rj) {
          break label463;
        }
        n = this.WN.fi();
        j = 0;
        if ((paramy.QK < 0) || (paramy.QK >= paramq.getItemCount())) {
          break label475;
        }
        k = 1;
        if ((k == 0) || ((!this.WQ.QQ) && (this.WR.isEmpty()))) {
          break label1653;
        }
        localView = paramm.bk(paramy.QK);
        paramy.QK += paramy.QL;
        localLayoutParams = (LayoutParams)localView.getLayoutParams();
        i4 = localLayoutParams.Ui.gb();
        localObject1 = this.WS;
        if ((((LazySpanLookup)localObject1).mData != null) && (i4 < ((LazySpanLookup)localObject1).mData.length)) {
          break label481;
        }
        j = -1;
        if (j != -1) {
          break label494;
        }
        i1 = 1;
        label190:
        if (i1 == 0) {
          break label704;
        }
        if (!localLayoutParams.Xe) {
          break label500;
        }
        localObject1 = this.WM[0];
      }
    }
    label211:
    Object localObject2;
    label237:
    label260:
    label305:
    label329:
    int m;
    label463:
    label475:
    label481:
    label494:
    label500:
    label525:
    int i5;
    int i2;
    label557:
    do
    {
      localObject2 = this.WS;
      ((LazySpanLookup)localObject2).bz(i4);
      ((LazySpanLookup)localObject2).mData[i4] = ((b)localObject1).mIndex;
      localLayoutParams.Xd = ((b)localObject1);
      if (paramy.QM != 1) {
        break label716;
      }
      super.c(localView, -1, false);
      if (!localLayoutParams.Xe) {
        break label759;
      }
      if (this.QU != 1) {
        break label727;
      }
      a(localView, this.WX, b(this.mHeight, this.Uh, 0, localLayoutParams.height, true), false);
      if (paramy.QM != 1) {
        break label1061;
      }
      if (!localLayoutParams.Xe) {
        break label859;
      }
      j = bu(n);
      k = j + this.WN.aX(localView);
      if ((i1 == 0) || (!localLayoutParams.Xe)) {
        break label1744;
      }
      localObject2 = new StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem();
      ((StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem)localObject2).Xh = new int[this.Qx];
      m = 0;
      while (m < this.Qx)
      {
        ((StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem)localObject2).Xh[m] = (j - this.WM[m].bD(j));
        m += 1;
      }
      i = Integer.MIN_VALUE;
      break;
      if (paramy.QM == 1)
      {
        i = paramy.QO + paramy.QJ;
        break;
      }
      i = paramy.QN - paramy.QJ;
      break;
      n = this.WN.fh();
      break label61;
      k = 0;
      break label85;
      j = localObject1.mData[i4];
      break label181;
      i1 = 0;
      break label190;
      if (!bv(paramy.QM)) {
        break label611;
      }
      j = this.Qx - 1;
      m = -1;
      k = -1;
      if (paramy.QM != 1) {
        break label626;
      }
      localObject2 = null;
      i3 = Integer.MAX_VALUE;
      i5 = this.WN.fh();
      i2 = j;
      j = i3;
      localObject1 = localObject2;
    } while (i2 == m);
    Object localObject1 = this.WM[i2];
    int i3 = ((b)localObject1).bD(i5);
    if (i3 < j) {
      j = i3;
    }
    for (;;)
    {
      i2 += k;
      localObject2 = localObject1;
      break label557;
      label611:
      j = 0;
      m = this.Qx;
      k = 1;
      break label525;
      label626:
      localObject2 = null;
      i3 = Integer.MIN_VALUE;
      i5 = this.WN.fi();
      i2 = j;
      j = i3;
      label650:
      localObject1 = localObject2;
      if (i2 == m) {
        break label211;
      }
      localObject1 = this.WM[i2];
      i3 = ((b)localObject1).bC(i5);
      if (i3 > j) {
        j = i3;
      }
      for (;;)
      {
        i2 += k;
        localObject2 = localObject1;
        break label650;
        label704:
        localObject1 = this.WM[j];
        break label237;
        label716:
        super.c(localView, 0, false);
        break label260;
        label727:
        a(localView, b(this.mWidth, this.Ug, 0, localLayoutParams.width, true), this.WX, false);
        break label305;
        label759:
        if (this.QU == 1)
        {
          a(localView, b(this.WP, this.Ug, 0, localLayoutParams.width, false), b(this.mHeight, this.Uh, 0, localLayoutParams.height, true), false);
          break label305;
        }
        a(localView, b(this.mWidth, this.Ug, 0, localLayoutParams.width, true), b(this.WP, this.Uh, 0, localLayoutParams.height, false), false);
        break label305;
        label859:
        j = ((b)localObject1).bD(n);
        break label329;
        ((StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem)localObject2).Xg = -1;
        ((StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem)localObject2).jP = i4;
        this.WS.a((StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem)localObject2);
        m = j;
        for (;;)
        {
          if ((localLayoutParams.Xe) && (paramy.QL == -1)) {
            if (i1 == 0)
            {
              if (paramy.QM != 1) {
                break label1230;
              }
              i1 = this.WM[0].bD(Integer.MIN_VALUE);
              j = 1;
              label942:
              if (j >= this.Qx) {
                break label1218;
              }
              if (this.WM[j].bD(Integer.MIN_VALUE) == i1) {
                break label1209;
              }
              j = 0;
              label971:
              if (j != 0) {
                break label1224;
              }
              j = 1;
            }
          }
          for (;;)
          {
            if (j != 0)
            {
              localObject2 = this.WS.bA(i4);
              if (localObject2 != null) {
                ((StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem)localObject2).Xi = true;
              }
              this.WZ = true;
            }
            if (paramy.QM != 1) {
              break label1461;
            }
            if (!localLayoutParams.Xe) {
              break label1307;
            }
            j = this.Qx - 1;
            while (j >= 0)
            {
              this.WM[j].br(localView);
              j -= 1;
            }
            label1061:
            if (localLayoutParams.Xe) {}
            for (k = bt(n);; k = ((b)localObject1).bC(n))
            {
              m = this.WN.aX(localView);
              if ((i1 == 0) || (!localLayoutParams.Xe)) {
                break label1199;
              }
              localObject2 = new StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem();
              ((StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem)localObject2).Xh = new int[this.Qx];
              j = 0;
              while (j < this.Qx)
              {
                ((StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem)localObject2).Xh[j] = (this.WM[j].bC(k) - k);
                j += 1;
              }
            }
            ((StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem)localObject2).Xg = 1;
            ((StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem)localObject2).jP = i4;
            this.WS.a((StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem)localObject2);
            label1199:
            m = k - m;
            break;
            label1209:
            j += 1;
            break label942;
            label1218:
            j = 1;
            break label971;
            label1224:
            j = 0;
            continue;
            label1230:
            i1 = this.WM[0].bC(Integer.MIN_VALUE);
            j = 1;
            label1246:
            if (j < this.Qx) {
              if (this.WM[j].bC(Integer.MIN_VALUE) == i1) {}
            }
            for (j = 0;; j = 1)
            {
              if (j != 0) {
                break label1301;
              }
              j = 1;
              break;
              j += 1;
              break label1246;
            }
            label1301:
            j = 0;
          }
          label1307:
          localLayoutParams.Xd.br(localView);
          label1317:
          if ((eT()) && (this.QU == 1)) {
            if (localLayoutParams.Xe)
            {
              j = this.WO.fi();
              label1349:
              i2 = this.WO.aX(localView);
              i1 = j;
              j -= i2;
              if (this.QU != 1) {
                break label1603;
              }
              h(localView, j, m, i1, k);
              label1392:
              if (!localLayoutParams.Xe) {
                break label1619;
              }
              ad(this.WQ.QM, i);
              label1413:
              a(paramm, this.WQ);
              if ((this.WQ.QP) && (localView.isFocusable()))
              {
                if (!localLayoutParams.Xe) {
                  break label1637;
                }
                this.WR.clear();
              }
            }
          }
          for (;;)
          {
            j = 1;
            break;
            label1461:
            if (localLayoutParams.Xe)
            {
              j = this.Qx - 1;
              while (j >= 0)
              {
                this.WM[j].bq(localView);
                j -= 1;
              }
              break label1317;
            }
            localLayoutParams.Xd.bq(localView);
            break label1317;
            j = this.WO.fi() - (this.Qx - 1 - ((b)localObject1).mIndex) * this.WP;
            break label1349;
            if (localLayoutParams.Xe) {}
            for (j = this.WO.fh();; j = ((b)localObject1).mIndex * this.WP + this.WO.fh())
            {
              i1 = this.WO.aX(localView) + j;
              break;
            }
            label1603:
            h(localView, m, j, k, i1);
            break label1392;
            label1619:
            a((b)localObject1, this.WQ.QM, i);
            break label1413;
            label1637:
            this.WR.set(((b)localObject1).mIndex, false);
          }
          label1653:
          if (j == 0) {
            a(paramm, this.WQ);
          }
          if (this.WQ.QM == -1) {
            i = bt(this.WN.fh());
          }
          for (i = this.WN.fh() - i; i > 0; i = bu(this.WN.fi()) - this.WN.fi()) {
            return Math.min(paramy.QJ, i);
          }
          return 0;
          label1744:
          m = j;
        }
        localObject1 = localObject2;
      }
      localObject1 = localObject2;
    }
  }
  
  private void a(int paramInt, RecyclerView.q paramq)
  {
    boolean bool2 = false;
    this.WQ.QJ = 0;
    this.WQ.QK = paramInt;
    int i;
    boolean bool1;
    if (fS())
    {
      i = paramq.Uw;
      if (i != -1)
      {
        boolean bool3 = this.Rj;
        if (i < paramInt)
        {
          bool1 = true;
          if (bool3 != bool1) {
            break label189;
          }
          paramInt = this.WN.fj();
          i = 0;
        }
      }
    }
    for (;;)
    {
      label67:
      int j;
      if ((this.Ub != null) && (RecyclerView.w(this.Ub)))
      {
        j = 1;
        label87:
        if (j == 0) {
          break label208;
        }
        this.WQ.QN = (this.WN.fh() - i);
        this.WQ.QO = (paramInt + this.WN.fi());
      }
      for (;;)
      {
        this.WQ.QP = false;
        this.WQ.QI = true;
        paramq = this.WQ;
        bool1 = bool2;
        if (this.WN.getMode() == 0)
        {
          bool1 = bool2;
          if (this.WN.getEnd() == 0) {
            bool1 = true;
          }
        }
        paramq.QQ = bool1;
        return;
        bool1 = false;
        break;
        label189:
        i = this.WN.fj();
        paramInt = 0;
        break label67;
        j = 0;
        break label87;
        label208:
        this.WQ.QO = (paramInt + this.WN.getEnd());
        this.WQ.QN = (-i);
      }
      paramInt = 0;
      i = 0;
    }
  }
  
  private void a(RecyclerView.m paramm, int paramInt)
  {
    for (;;)
    {
      View localView;
      LayoutParams localLayoutParams;
      if (getChildCount() > 0)
      {
        localView = getChildAt(0);
        if (this.WN.aW(localView) <= paramInt)
        {
          localLayoutParams = (LayoutParams)localView.getLayoutParams();
          if (!localLayoutParams.Xe) {
            break label105;
          }
          i = 0;
          if (i >= this.Qx) {
            break label79;
          }
          if (this.WM[i].Xo.size() != 1) {
            break label72;
          }
        }
      }
      label72:
      label79:
      label105:
      while (localLayoutParams.Xd.Xo.size() == 1)
      {
        for (;;)
        {
          return;
          i += 1;
        }
        int i = 0;
        while (i < this.Qx)
        {
          this.WM[i].gP();
          i += 1;
        }
      }
      localLayoutParams.Xd.gP();
      a(localView, paramm);
    }
  }
  
  private void a(RecyclerView.m paramm, RecyclerView.q paramq, boolean paramBoolean)
  {
    int i = bu(Integer.MIN_VALUE);
    if (i == Integer.MIN_VALUE) {}
    do
    {
      do
      {
        return;
        i = this.WN.fi() - i;
      } while (i <= 0);
      i -= -c(-i, paramm, paramq);
    } while ((!paramBoolean) || (i <= 0));
    this.WN.ba(i);
  }
  
  private void a(RecyclerView.m paramm, y paramy)
  {
    int k = 1;
    int i = 1;
    if ((!paramy.QI) || (paramy.QQ)) {
      return;
    }
    if (paramy.QJ == 0)
    {
      if (paramy.QM == -1)
      {
        b(paramm, paramy.QO);
        return;
      }
      a(paramm, paramy.QN);
      return;
    }
    int m;
    if (paramy.QM == -1)
    {
      n = paramy.QN;
      int i1 = paramy.QN;
      for (j = this.WM[0].bC(i1); i < this.Qx; j = k)
      {
        m = this.WM[i].bC(i1);
        k = j;
        if (m > j) {
          k = m;
        }
        i += 1;
      }
      i = n - j;
      if (i < 0) {}
      for (i = paramy.QO;; i = paramy.QO - Math.min(i, paramy.QJ))
      {
        b(paramm, i);
        return;
      }
    }
    int n = paramy.QO;
    int j = this.WM[0].bD(n);
    i = k;
    while (i < this.Qx)
    {
      m = this.WM[i].bD(n);
      k = j;
      if (m < j) {
        k = m;
      }
      i += 1;
      j = k;
    }
    i = j - paramy.QO;
    if (i < 0) {}
    for (i = paramy.QN;; i = Math.min(i, paramy.QJ) + j)
    {
      a(paramm, i);
      return;
      j = paramy.QN;
    }
  }
  
  private void a(b paramb, int paramInt1, int paramInt2)
  {
    int i = paramb.Xr;
    if (paramInt1 == -1) {
      if (i + paramb.gL() <= paramInt2) {
        this.WR.set(paramb.mIndex, false);
      }
    }
    while (paramb.gN() - i < paramInt2) {
      return;
    }
    this.WR.set(paramb.mIndex, false);
  }
  
  private void a(View paramView, int paramInt1, int paramInt2, boolean paramBoolean)
  {
    a(paramView, this.fV);
    LayoutParams localLayoutParams = (LayoutParams)paramView.getLayoutParams();
    paramInt1 = h(paramInt1, localLayoutParams.leftMargin + this.fV.left, localLayoutParams.rightMargin + this.fV.right);
    paramInt2 = h(paramInt2, localLayoutParams.topMargin + this.fV.top, localLayoutParams.bottomMargin + this.fV.bottom);
    if (a(paramView, paramInt1, paramInt2, localLayoutParams)) {
      paramView.measure(paramInt1, paramInt2);
    }
  }
  
  private View aa(boolean paramBoolean)
  {
    int j = this.WN.fh();
    int k = this.WN.fi();
    Object localObject = null;
    int i = getChildCount() - 1;
    if (i >= 0)
    {
      View localView = getChildAt(i);
      int m = this.WN.aV(localView);
      int n = this.WN.aW(localView);
      if ((n <= j) || (m >= k)) {
        break label106;
      }
      if ((n <= k) || (!paramBoolean)) {
        return localView;
      }
      if (localObject != null) {
        break label106;
      }
      localObject = localView;
    }
    label106:
    for (;;)
    {
      i -= 1;
      break;
      return (View)localObject;
    }
  }
  
  private void ad(int paramInt1, int paramInt2)
  {
    int i = 0;
    while (i < this.Qx)
    {
      if (!this.WM[i].Xo.isEmpty()) {
        a(this.WM[i], paramInt1, paramInt2);
      }
      i += 1;
    }
  }
  
  private void b(RecyclerView.m paramm, int paramInt)
  {
    int i = getChildCount() - 1;
    for (;;)
    {
      View localView;
      LayoutParams localLayoutParams;
      if (i >= 0)
      {
        localView = getChildAt(i);
        if (this.WN.aV(localView) >= paramInt)
        {
          localLayoutParams = (LayoutParams)localView.getLayoutParams();
          if (!localLayoutParams.Xe) {
            break label119;
          }
          j = 0;
          if (j >= this.Qx) {
            break label88;
          }
          if (this.WM[j].Xo.size() != 1) {
            break label79;
          }
        }
      }
      label79:
      label88:
      label119:
      while (localLayoutParams.Xd.Xo.size() == 1)
      {
        for (;;)
        {
          return;
          j += 1;
        }
        int j = 0;
        while (j < this.Qx)
        {
          this.WM[j].gO();
          j += 1;
        }
      }
      localLayoutParams.Xd.gO();
      a(localView, paramm);
      i -= 1;
    }
  }
  
  private void b(RecyclerView.m paramm, RecyclerView.q paramq, boolean paramBoolean)
  {
    int i = bt(Integer.MAX_VALUE);
    if (i == Integer.MAX_VALUE) {}
    do
    {
      do
      {
        return;
        i -= this.WN.fh();
      } while (i <= 0);
      i -= c(i, paramm, paramq);
    } while ((!paramBoolean) || (i <= 0));
    this.WN.ba(-i);
  }
  
  private void br(int paramInt)
  {
    this.WP = (paramInt / this.Qx);
    this.WX = View.MeasureSpec.makeMeasureSpec(paramInt, this.WO.getMode());
  }
  
  private void bs(int paramInt)
  {
    int i = 1;
    this.WQ.QM = paramInt;
    y localy = this.WQ;
    boolean bool2 = this.Rj;
    boolean bool1;
    if (paramInt == -1)
    {
      bool1 = true;
      if (bool2 != bool1) {
        break label49;
      }
    }
    label49:
    for (paramInt = i;; paramInt = -1)
    {
      localy.QL = paramInt;
      return;
      bool1 = false;
      break;
    }
  }
  
  private int bt(int paramInt)
  {
    int j = this.WM[0].bC(paramInt);
    int i = 1;
    while (i < this.Qx)
    {
      int m = this.WM[i].bC(paramInt);
      int k = j;
      if (m < j) {
        k = m;
      }
      i += 1;
      j = k;
    }
    return j;
  }
  
  private int bu(int paramInt)
  {
    int j = this.WM[0].bD(paramInt);
    int i = 1;
    while (i < this.Qx)
    {
      int m = this.WM[i].bD(paramInt);
      int k = j;
      if (m > j) {
        k = m;
      }
      i += 1;
      j = k;
    }
    return j;
  }
  
  private boolean bv(int paramInt)
  {
    int i;
    if (this.QU == 0) {
      if (paramInt == -1)
      {
        i = 1;
        if (i == this.Rj) {
          break label29;
        }
      }
    }
    label29:
    label63:
    label66:
    for (;;)
    {
      return true;
      i = 0;
      break;
      return false;
      if (paramInt == -1)
      {
        i = 1;
        if (i != this.Rj) {
          break label63;
        }
      }
      for (i = 1;; i = 0)
      {
        if (i == eT()) {
          break label66;
        }
        return false;
        i = 0;
        break;
      }
    }
  }
  
  private int c(int paramInt, RecyclerView.m paramm, RecyclerView.q paramq)
  {
    int i;
    int j;
    if (paramInt > 0)
    {
      i = gH();
      j = 1;
      this.WQ.QI = true;
      a(i, paramq);
      bs(j);
      this.WQ.QK = (i + this.WQ.QL);
      j = Math.abs(paramInt);
      this.WQ.QJ = j;
      i = a(paramm, this.WQ, paramq);
      if (j >= i) {
        break label116;
      }
    }
    for (;;)
    {
      this.WN.ba(-paramInt);
      this.WU = this.Rj;
      return paramInt;
      j = -1;
      i = gI();
      break;
      label116:
      if (paramInt < 0) {
        paramInt = -i;
      } else {
        paramInt = i;
      }
    }
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
  
  private boolean eT()
  {
    return android.support.v4.view.z.J(this.Ub) == 1;
  }
  
  private boolean gF()
  {
    if ((getChildCount() == 0) || (this.WT == 0) || (!this.gx)) {
      return false;
    }
    int j;
    if (this.Rj) {
      j = gH();
    }
    for (int i = gI(); (j == 0) && (gG() != null); i = gH())
    {
      this.WS.clear();
      this.Ud = true;
      requestLayout();
      return true;
      j = gI();
    }
    if (!this.WZ) {
      return false;
    }
    if (this.Rj) {}
    StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem localFullSpanItem1;
    for (int k = -1;; k = 1)
    {
      localFullSpanItem1 = this.WS.m(j, i + 1, k);
      if (localFullSpanItem1 != null) {
        break;
      }
      this.WZ = false;
      this.WS.bx(i + 1);
      return false;
    }
    StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem localFullSpanItem2 = this.WS.m(j, localFullSpanItem1.jP, k * -1);
    if (localFullSpanItem2 == null) {
      this.WS.bx(localFullSpanItem1.jP);
    }
    for (;;)
    {
      this.Ud = true;
      requestLayout();
      return true;
      this.WS.bx(localFullSpanItem2.jP + 1);
    }
  }
  
  private View gG()
  {
    int i = getChildCount() - 1;
    BitSet localBitSet = new BitSet(this.Qx);
    localBitSet.set(0, this.Qx, true);
    int j;
    int k;
    label57:
    int m;
    label65:
    int n;
    View localView;
    LayoutParams localLayoutParams;
    Object localObject;
    if ((this.QU == 1) && (eT()))
    {
      j = 1;
      if (!this.Rj) {
        break label184;
      }
      k = -1;
      if (i >= k) {
        break label193;
      }
      m = 1;
      n = i;
      if (n == k) {
        break label458;
      }
      localView = getChildAt(n);
      localLayoutParams = (LayoutParams)localView.getLayoutParams();
      if (!localBitSet.get(localLayoutParams.Xd.mIndex)) {
        break label271;
      }
      localObject = localLayoutParams.Xd;
      if (!this.Rj) {
        break label204;
      }
      if (((b)localObject).gN() >= this.WN.fi()) {
        break label253;
      }
      if (((LayoutParams)((View)((b)localObject).Xo.get(((b)localObject).Xo.size() - 1)).getLayoutParams()).Xe) {
        break label199;
      }
      i = 1;
    }
    for (;;)
    {
      if (i == 0) {
        break label258;
      }
      return localView;
      j = -1;
      break;
      label184:
      k = i + 1;
      i = 0;
      break label57;
      label193:
      m = -1;
      break label65;
      label199:
      i = 0;
      continue;
      label204:
      if (((b)localObject).gL() > this.WN.fh())
      {
        if (!((LayoutParams)((View)((b)localObject).Xo.get(0)).getLayoutParams()).Xe) {
          i = 1;
        } else {
          i = 0;
        }
      }
      else {
        label253:
        i = 0;
      }
    }
    label258:
    localBitSet.clear(localLayoutParams.Xd.mIndex);
    label271:
    int i1;
    if ((!localLayoutParams.Xe) && (n + m != k))
    {
      localObject = getChildAt(n + m);
      if (this.Rj)
      {
        i = this.WN.aW(localView);
        i1 = this.WN.aW((View)localObject);
        if (i < i1) {
          return localView;
        }
        if (i != i1) {
          break label460;
        }
        i = 1;
      }
    }
    for (;;)
    {
      if (i != 0)
      {
        localObject = (LayoutParams)((View)localObject).getLayoutParams();
        if (localLayoutParams.Xd.mIndex - ((LayoutParams)localObject).Xd.mIndex < 0)
        {
          i = 1;
          label380:
          if (j >= 0) {
            break label442;
          }
        }
        label442:
        for (i1 = 1;; i1 = 0)
        {
          if (i == i1) {
            break label448;
          }
          return localView;
          i = this.WN.aV(localView);
          i1 = this.WN.aV((View)localObject);
          if (i > i1) {
            return localView;
          }
          if (i != i1) {
            break label460;
          }
          i = 1;
          break;
          i = 0;
          break label380;
        }
      }
      label448:
      n += m;
      break;
      label458:
      return null;
      label460:
      i = 0;
    }
  }
  
  private int gH()
  {
    int i = getChildCount();
    if (i == 0) {
      return 0;
    }
    return be(getChildAt(i - 1));
  }
  
  private int gI()
  {
    if (getChildCount() == 0) {
      return 0;
    }
    return be(getChildAt(0));
  }
  
  private static int h(int paramInt1, int paramInt2, int paramInt3)
  {
    if ((paramInt2 == 0) && (paramInt3 == 0)) {}
    int i;
    do
    {
      return paramInt1;
      i = View.MeasureSpec.getMode(paramInt1);
    } while ((i != Integer.MIN_VALUE) && (i != 1073741824));
    return View.MeasureSpec.makeMeasureSpec(Math.max(0, View.MeasureSpec.getSize(paramInt1) - paramInt2 - paramInt3), i);
  }
  
  private int h(RecyclerView.q paramq)
  {
    boolean bool2 = true;
    if (getChildCount() == 0) {
      return 0;
    }
    ab localab = this.WN;
    View localView;
    if (!this.Rl)
    {
      bool1 = true;
      localView = Z(bool1);
      if (this.Rl) {
        break label70;
      }
    }
    label70:
    for (boolean bool1 = bool2;; bool1 = false)
    {
      return ah.a(paramq, localab, localView, aa(bool1), this, this.Rl, this.Rj);
      bool1 = false;
      break;
    }
  }
  
  private static void h(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    LayoutParams localLayoutParams = (LayoutParams)paramView.getLayoutParams();
    g(paramView, localLayoutParams.leftMargin + paramInt1, localLayoutParams.topMargin + paramInt2, paramInt3 - localLayoutParams.rightMargin, paramInt4 - localLayoutParams.bottomMargin);
  }
  
  private int i(RecyclerView.q paramq)
  {
    boolean bool2 = true;
    if (getChildCount() == 0) {
      return 0;
    }
    ab localab = this.WN;
    View localView;
    if (!this.Rl)
    {
      bool1 = true;
      localView = Z(bool1);
      if (this.Rl) {
        break label66;
      }
    }
    label66:
    for (boolean bool1 = bool2;; bool1 = false)
    {
      return ah.a(paramq, localab, localView, aa(bool1), this, this.Rl);
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
    ab localab = this.WN;
    View localView;
    if (!this.Rl)
    {
      bool1 = true;
      localView = Z(bool1);
      if (this.Rl) {
        break label66;
      }
    }
    label66:
    for (boolean bool1 = bool2;; bool1 = false)
    {
      return ah.b(paramq, localab, localView, aa(bool1), this, this.Rl);
      bool1 = false;
      break;
    }
  }
  
  private void l(int paramInt1, int paramInt2, int paramInt3)
  {
    int k;
    int j;
    int i;
    if (this.Rj)
    {
      k = gH();
      if (paramInt3 != 8) {
        break label104;
      }
      if (paramInt1 >= paramInt2) {
        break label93;
      }
      j = paramInt2 + 1;
      i = paramInt1;
      label32:
      this.WS.by(i);
      switch (paramInt3)
      {
      default: 
        label76:
        if (j > k) {
          break;
        }
      }
    }
    for (;;)
    {
      return;
      k = gI();
      break;
      label93:
      j = paramInt1 + 1;
      i = paramInt2;
      break label32;
      label104:
      j = paramInt1 + paramInt2;
      i = paramInt1;
      break label32;
      this.WS.af(paramInt1, paramInt2);
      break label76;
      this.WS.ae(paramInt1, paramInt2);
      break label76;
      this.WS.ae(paramInt1, 1);
      this.WS.af(paramInt2, 1);
      break label76;
      if (this.Rj) {}
      for (paramInt1 = gI(); i <= paramInt1; paramInt1 = gH())
      {
        requestLayout();
        return;
      }
    }
  }
  
  public final void A(int paramInt1, int paramInt2)
  {
    l(paramInt1, paramInt2, 4);
  }
  
  public final void B(int paramInt1, int paramInt2)
  {
    l(paramInt1, paramInt2, 8);
  }
  
  public final int a(int paramInt, RecyclerView.m paramm, RecyclerView.q paramq)
  {
    return c(paramInt, paramm, paramq);
  }
  
  public final int a(RecyclerView.m paramm, RecyclerView.q paramq)
  {
    if (this.QU == 0) {
      return this.Qx;
    }
    return super.a(paramm, paramq);
  }
  
  public final RecyclerView.LayoutParams a(Context paramContext, AttributeSet paramAttributeSet)
  {
    return new LayoutParams(paramContext, paramAttributeSet);
  }
  
  public final View a(View paramView, int paramInt, RecyclerView.m paramm, RecyclerView.q paramq)
  {
    int j = 0;
    if (getChildCount() == 0) {
      return null;
    }
    paramView = bf(paramView);
    if (paramView == null) {
      return null;
    }
    eS();
    switch (paramInt)
    {
    default: 
      paramInt = Integer.MIN_VALUE;
    }
    while (paramInt == Integer.MIN_VALUE)
    {
      return null;
      paramInt = -1;
      continue;
      paramInt = 1;
      continue;
      if (this.QU == 1)
      {
        paramInt = -1;
      }
      else
      {
        paramInt = Integer.MIN_VALUE;
        continue;
        if (this.QU == 1)
        {
          paramInt = 1;
        }
        else
        {
          paramInt = Integer.MIN_VALUE;
          continue;
          if (this.QU == 0)
          {
            paramInt = -1;
          }
          else
          {
            paramInt = Integer.MIN_VALUE;
            continue;
            if (this.QU == 0) {
              paramInt = 1;
            } else {
              paramInt = Integer.MIN_VALUE;
            }
          }
        }
      }
    }
    Object localObject = (LayoutParams)paramView.getLayoutParams();
    boolean bool = ((LayoutParams)localObject).Xe;
    localObject = ((LayoutParams)localObject).Xd;
    if (paramInt == 1) {}
    for (int i = gH();; i = gI())
    {
      a(i, paramq);
      bs(paramInt);
      this.WQ.QK = (this.WQ.QL + i);
      this.WQ.QJ = ((int)(0.33333334F * this.WN.fj()));
      this.WQ.QP = true;
      this.WQ.QI = false;
      a(paramm, this.WQ, paramq);
      this.WU = this.Rj;
      if (bool) {
        break;
      }
      paramm = ((b)localObject).ag(i, paramInt);
      if ((paramm == null) || (paramm == paramView)) {
        break;
      }
      return paramm;
    }
    if (bv(paramInt))
    {
      j = this.Qx - 1;
      while (j >= 0)
      {
        paramm = this.WM[j].ag(i, paramInt);
        if ((paramm != null) && (paramm != paramView)) {
          return paramm;
        }
        j -= 1;
      }
    }
    do
    {
      j += 1;
      if (j >= this.Qx) {
        break;
      }
      paramm = this.WM[j].ag(i, paramInt);
    } while ((paramm == null) || (paramm == paramView));
    return paramm;
    return null;
  }
  
  public final void a(Rect paramRect, int paramInt1, int paramInt2)
  {
    int i = getPaddingLeft() + getPaddingRight();
    int j = getPaddingTop() + getPaddingBottom();
    if (this.QU == 1)
    {
      paramInt2 = i(paramInt2, j + paramRect.height(), android.support.v4.view.z.U(this.Ub));
      paramInt1 = i(paramInt1, i + this.WP * this.Qx, android.support.v4.view.z.T(this.Ub));
    }
    for (;;)
    {
      setMeasuredDimension(paramInt1, paramInt2);
      return;
      paramInt1 = i(paramInt1, i + paramRect.width(), android.support.v4.view.z.T(this.Ub));
      paramInt2 = i(paramInt2, j + this.WP * this.Qx, android.support.v4.view.z.U(this.Ub));
    }
  }
  
  public final void a(RecyclerView.m paramm, RecyclerView.q paramq, View paramView, b paramb)
  {
    int k = 1;
    int i = 1;
    int j = -1;
    paramm = paramView.getLayoutParams();
    if (!(paramm instanceof LayoutParams))
    {
      super.b(paramView, paramb);
      return;
    }
    paramm = (LayoutParams)paramm;
    int m;
    int n;
    if (this.QU == 0)
    {
      m = paramm.gJ();
      if (paramm.Xe) {
        i = this.Qx;
      }
      n = -1;
      k = i;
      i = n;
    }
    for (;;)
    {
      paramb.k(b.l.a(m, k, j, i, paramm.Xe));
      return;
      i = paramm.gJ();
      if (paramm.Xe)
      {
        n = this.Qx;
        m = -1;
        j = i;
        k = -1;
        i = n;
      }
      else
      {
        m = -1;
        j = i;
        n = -1;
        i = k;
        k = n;
      }
    }
  }
  
  public final void a(RecyclerView paramRecyclerView, int paramInt)
  {
    paramRecyclerView = new z(paramRecyclerView.getContext())
    {
      public final PointF aW(int paramAnonymousInt)
      {
        paramAnonymousInt = StaggeredGridLayoutManager.this.bw(paramAnonymousInt);
        if (paramAnonymousInt == 0) {
          return null;
        }
        if (StaggeredGridLayoutManager.this.QU == 0) {
          return new PointF(paramAnonymousInt, 0.0F);
        }
        return new PointF(0.0F, paramAnonymousInt);
      }
    };
    paramRecyclerView.Uw = paramInt;
    a(paramRecyclerView);
  }
  
  public final void a(RecyclerView paramRecyclerView, RecyclerView.m paramm)
  {
    removeCallbacks(this.Xa);
    int i = 0;
    while (i < this.Qx)
    {
      this.WM[i].clear();
      i += 1;
    }
  }
  
  public final boolean a(RecyclerView.LayoutParams paramLayoutParams)
  {
    return paramLayoutParams instanceof LayoutParams;
  }
  
  public final void aX(int paramInt)
  {
    if ((this.WW != null) && (this.WW.RB != paramInt))
    {
      SavedState localSavedState = this.WW;
      localSavedState.Xl = null;
      localSavedState.Xk = 0;
      localSavedState.RB = -1;
      localSavedState.Xj = -1;
    }
    this.Rm = paramInt;
    this.Rn = Integer.MIN_VALUE;
    requestLayout();
  }
  
  public final int b(int paramInt, RecyclerView.m paramm, RecyclerView.q paramq)
  {
    return c(paramInt, paramm, paramq);
  }
  
  public final int b(RecyclerView.m paramm, RecyclerView.q paramq)
  {
    if (this.QU == 1) {
      return this.Qx;
    }
    return super.b(paramm, paramq);
  }
  
  public final int b(RecyclerView.q paramq)
  {
    return h(paramq);
  }
  
  public final void bg(int paramInt)
  {
    super.bg(paramInt);
    int i = 0;
    while (i < this.Qx)
    {
      this.WM[i].bF(paramInt);
      i += 1;
    }
  }
  
  public final void bh(int paramInt)
  {
    super.bh(paramInt);
    int i = 0;
    while (i < this.Qx)
    {
      this.WM[i].bF(paramInt);
      i += 1;
    }
  }
  
  public final void bi(int paramInt)
  {
    if (paramInt == 0) {
      gF();
    }
  }
  
  public final int bw(int paramInt)
  {
    if (getChildCount() == 0) {
      if (!this.Rj) {}
    }
    for (;;)
    {
      return 1;
      return -1;
      if (paramInt < gI()) {}
      for (int i = 1; i != this.Rj; i = 0) {
        return -1;
      }
    }
  }
  
  public final int c(RecyclerView.q paramq)
  {
    return h(paramq);
  }
  
  public final void c(RecyclerView.m paramm, RecyclerView.q paramq)
  {
    int j = 1;
    a locala = this.WY;
    locala.jP = -1;
    locala.vq = Integer.MIN_VALUE;
    locala.Rt = false;
    locala.Xc = false;
    if (((this.WW != null) || (this.Rm != -1)) && (paramq.getItemCount() == 0))
    {
      d(paramm);
      label61:
      return;
    }
    int m;
    int i;
    label181:
    Object localObject;
    boolean bool;
    if (this.WW != null)
    {
      if (this.WW.Xk > 0) {
        if (this.WW.Xk == this.Qx)
        {
          k = 0;
          if (k < this.Qx)
          {
            this.WM[k].clear();
            m = this.WW.Xl[k];
            i = m;
            if (m != Integer.MIN_VALUE) {
              if (!this.WW.RD) {
                break label181;
              }
            }
            for (i = m + this.WN.fi();; i = m + this.WN.fh())
            {
              this.WM[k].bE(i);
              k += 1;
              break;
            }
          }
        }
        else
        {
          localObject = this.WW;
          ((SavedState)localObject).Xl = null;
          ((SavedState)localObject).Xk = 0;
          ((SavedState)localObject).Xm = 0;
          ((SavedState)localObject).Xn = null;
          ((SavedState)localObject).Xf = null;
          this.WW.RB = this.WW.Xj;
        }
      }
      this.WV = this.WW.WV;
      bool = this.WW.Ri;
      r(null);
      if ((this.WW != null) && (this.WW.Ri != bool)) {
        this.WW.Ri = bool;
      }
      this.Ri = bool;
      requestLayout();
      eS();
      if (this.WW.RB != -1)
      {
        this.Rm = this.WW.RB;
        locala.Rt = this.WW.RD;
        if (this.WW.Xm > 1)
        {
          this.WS.mData = this.WW.Xn;
          this.WS.Xf = this.WW.Xf;
        }
        label386:
        if ((!paramq.UL) && (this.Rm != -1)) {
          break label635;
        }
        i = 0;
        label404:
        if (i == 0)
        {
          if (!this.WU) {
            break label1154;
          }
          m = paramq.getItemCount();
          i = getChildCount() - 1;
          label430:
          if (i < 0) {
            break label1148;
          }
          k = be(getChildAt(i));
          if ((k < 0) || (k >= m)) {
            break label1139;
          }
          i = k;
        }
      }
    }
    label635:
    label726:
    label792:
    label822:
    label858:
    label996:
    label1024:
    label1046:
    label1139:
    label1148:
    label1154:
    int n;
    int i1;
    for (;;)
    {
      locala.jP = i;
      locala.vq = Integer.MIN_VALUE;
      if ((this.WW == null) && ((locala.Rt != this.WU) || (eT() != this.WV)))
      {
        this.WS.clear();
        locala.Xc = true;
      }
      if ((getChildCount() <= 0) || ((this.WW != null) && (this.WW.Xk > 0))) {
        break label1376;
      }
      if (!locala.Xc) {
        break label1218;
      }
      i = 0;
      while (i < this.Qx)
      {
        this.WM[i].clear();
        if (locala.vq != Integer.MIN_VALUE) {
          this.WM[i].bE(locala.vq);
        }
        i += 1;
      }
      locala.Rt = this.Rj;
      break;
      eS();
      locala.Rt = this.Rj;
      break label386;
      if ((this.Rm < 0) || (this.Rm >= paramq.getItemCount()))
      {
        this.Rm = -1;
        this.Rn = Integer.MIN_VALUE;
        i = 0;
        break label404;
      }
      if ((this.WW == null) || (this.WW.RB == -1) || (this.WW.Xk <= 0))
      {
        localObject = aV(this.Rm);
        if (localObject != null)
        {
          if (this.Rj)
          {
            i = gH();
            locala.jP = i;
            if (this.Rn == Integer.MIN_VALUE) {
              break label822;
            }
            if (!locala.Rt) {
              break label792;
            }
          }
          for (locala.vq = (this.WN.fi() - this.Rn - this.WN.aW((View)localObject));; locala.vq = (this.WN.fh() + this.Rn - this.WN.aV((View)localObject)))
          {
            i = 1;
            break;
            i = gI();
            break label726;
          }
          if (this.WN.aX((View)localObject) > this.WN.fj()) {
            if (locala.Rt)
            {
              i = this.WN.fi();
              locala.vq = i;
            }
          }
        }
      }
      for (;;)
      {
        i = 1;
        break;
        i = this.WN.fh();
        break label858;
        i = this.WN.aV((View)localObject) - this.WN.fh();
        if (i < 0)
        {
          locala.vq = (-i);
        }
        else
        {
          i = this.WN.fi() - this.WN.aW((View)localObject);
          if (i < 0)
          {
            locala.vq = i;
          }
          else
          {
            locala.vq = Integer.MIN_VALUE;
            continue;
            locala.jP = this.Rm;
            if (this.Rn == Integer.MIN_VALUE) {
              if (bw(locala.jP) == 1)
              {
                bool = true;
                locala.Rt = bool;
                if (!locala.Rt) {
                  break label1046;
                }
                i = locala.Xb.WN.fi();
                locala.vq = i;
              }
            }
            for (;;)
            {
              locala.Xc = true;
              break;
              bool = false;
              break label996;
              i = locala.Xb.WN.fh();
              break label1024;
              i = this.Rn;
              if (locala.Rt) {
                locala.vq = (locala.Xb.WN.fi() - i);
              } else {
                locala.vq = (i + locala.Xb.WN.fh());
              }
            }
            locala.vq = Integer.MIN_VALUE;
            locala.jP = this.Rm;
          }
        }
      }
      i -= 1;
      break label430;
      i = 0;
      continue;
      n = paramq.getItemCount();
      i1 = getChildCount();
      k = 0;
      for (;;)
      {
        if (k >= i1) {
          break label1212;
        }
        m = be(getChildAt(k));
        if (m >= 0)
        {
          i = m;
          if (m < n) {
            break;
          }
        }
        k += 1;
      }
      label1212:
      i = 0;
    }
    label1218:
    int k = 0;
    if (k < this.Qx)
    {
      localObject = this.WM[k];
      bool = this.Rj;
      n = locala.vq;
      if (bool)
      {
        i = ((b)localObject).bD(Integer.MIN_VALUE);
        label1266:
        ((b)localObject).clear();
        if ((i != Integer.MIN_VALUE) && ((!bool) || (i >= ((b)localObject).Xb.WN.fi())) && ((bool) || (i <= ((b)localObject).Xb.WN.fh()))) {
          break label1341;
        }
      }
      for (;;)
      {
        k += 1;
        break;
        i = ((b)localObject).bC(Integer.MIN_VALUE);
        break label1266;
        label1341:
        m = i;
        if (n != Integer.MIN_VALUE) {
          m = i + n;
        }
        ((b)localObject).Xq = m;
        ((b)localObject).Xp = m;
      }
    }
    label1376:
    b(paramm);
    this.WQ.QI = false;
    this.WZ = false;
    br(this.WO.fj());
    a(locala.jP, paramq);
    label1475:
    float f1;
    label1499:
    float f2;
    if (locala.Rt)
    {
      bs(-1);
      a(paramm, this.WQ, paramq);
      bs(1);
      this.WQ.QK = (locala.jP + this.WQ.QL);
      a(paramm, this.WQ, paramq);
      if (this.WO.getMode() == 1073741824) {
        break label1861;
      }
      f1 = 0.0F;
      m = getChildCount();
      i = 0;
      if (i >= m) {
        break label1630;
      }
      localObject = getChildAt(i);
      f2 = this.WO.aX((View)localObject);
      if (f2 < f1) {
        break label2045;
      }
      if (!((LayoutParams)((View)localObject).getLayoutParams()).Xe) {
        break label2048;
      }
      f2 = 1.0F * f2 / this.Qx;
    }
    label1630:
    label1799:
    label1861:
    label1889:
    label2039:
    label2045:
    label2048:
    for (;;)
    {
      f1 = Math.max(f1, f2);
      for (;;)
      {
        i += 1;
        break label1499;
        bs(1);
        a(paramm, this.WQ, paramq);
        bs(-1);
        this.WQ.QK = (locala.jP + this.WQ.QL);
        a(paramm, this.WQ, paramq);
        break label1475;
        n = this.WP;
        k = Math.round(this.Qx * f1);
        i = k;
        if (this.WO.getMode() == Integer.MIN_VALUE) {
          i = Math.min(k, this.WO.fj());
        }
        br(i);
        if (this.WP != n)
        {
          i = 0;
          if (i < m)
          {
            localObject = getChildAt(i);
            LayoutParams localLayoutParams = (LayoutParams)((View)localObject).getLayoutParams();
            if (!localLayoutParams.Xe)
            {
              if ((!eT()) || (this.QU != 1)) {
                break label1799;
              }
              ((View)localObject).offsetLeftAndRight(-(this.Qx - 1 - localLayoutParams.Xd.mIndex) * this.WP - -(this.Qx - 1 - localLayoutParams.Xd.mIndex) * n);
            }
            for (;;)
            {
              i += 1;
              break;
              k = localLayoutParams.Xd.mIndex * this.WP;
              i1 = localLayoutParams.Xd.mIndex * n;
              if (this.QU == 1) {
                ((View)localObject).offsetLeftAndRight(k - i1);
              } else {
                ((View)localObject).offsetTopAndBottom(k - i1);
              }
            }
          }
        }
        if (getChildCount() > 0)
        {
          if (this.Rj)
          {
            a(paramm, paramq, true);
            b(paramm, paramq, false);
          }
        }
        else
        {
          m = 0;
          k = 0;
          i = m;
          if (j != 0)
          {
            i = m;
            if (!paramq.UL) {
              if ((this.WT == 0) || (getChildCount() <= 0) || ((!this.WZ) && (gG() == null))) {
                break label2039;
              }
            }
          }
        }
        for (j = 1;; j = 0)
        {
          i = k;
          if (j != 0)
          {
            removeCallbacks(this.Xa);
            i = k;
            if (gF()) {
              i = 1;
            }
          }
          this.Rm = -1;
          this.Rn = Integer.MIN_VALUE;
          this.WU = locala.Rt;
          this.WV = eT();
          this.WW = null;
          if (i == 0) {
            break label61;
          }
          j = 0;
          break;
          b(paramm, paramq, true);
          a(paramm, paramq, false);
          break label1889;
        }
      }
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
  
  public final RecyclerView.LayoutParams e(ViewGroup.LayoutParams paramLayoutParams)
  {
    if ((paramLayoutParams instanceof ViewGroup.MarginLayoutParams)) {
      return new LayoutParams((ViewGroup.MarginLayoutParams)paramLayoutParams);
    }
    return new LayoutParams(paramLayoutParams);
  }
  
  public final void eL()
  {
    this.WS.clear();
    requestLayout();
  }
  
  public final RecyclerView.LayoutParams eM()
  {
    if (this.QU == 0) {
      return new LayoutParams(-2, -1);
    }
    return new LayoutParams(-1, -2);
  }
  
  public final boolean eP()
  {
    return this.WW == null;
  }
  
  public final boolean eQ()
  {
    return this.QU == 0;
  }
  
  public final boolean eR()
  {
    return this.QU == 1;
  }
  
  public final int f(RecyclerView.q paramq)
  {
    return j(paramq);
  }
  
  public final int g(RecyclerView.q paramq)
  {
    return j(paramq);
  }
  
  public final void onInitializeAccessibilityEvent(AccessibilityEvent paramAccessibilityEvent)
  {
    super.onInitializeAccessibilityEvent(paramAccessibilityEvent);
    View localView1;
    View localView2;
    if (getChildCount() > 0)
    {
      paramAccessibilityEvent = a.a(paramAccessibilityEvent);
      localView1 = Z(false);
      localView2 = aa(false);
      if ((localView1 != null) && (localView2 != null)) {}
    }
    else
    {
      return;
    }
    int i = be(localView1);
    int j = be(localView2);
    if (i < j)
    {
      paramAccessibilityEvent.setFromIndex(i);
      paramAccessibilityEvent.setToIndex(j);
      return;
    }
    paramAccessibilityEvent.setFromIndex(j);
    paramAccessibilityEvent.setToIndex(i);
  }
  
  public final void onRestoreInstanceState(Parcelable paramParcelable)
  {
    if ((paramParcelable instanceof SavedState))
    {
      this.WW = ((SavedState)paramParcelable);
      requestLayout();
    }
  }
  
  public final Parcelable onSaveInstanceState()
  {
    if (this.WW != null) {
      return new SavedState(this.WW);
    }
    SavedState localSavedState = new SavedState();
    localSavedState.Ri = this.Ri;
    localSavedState.RD = this.WU;
    localSavedState.WV = this.WV;
    int i;
    label126:
    View localView;
    label146:
    label153:
    int j;
    label181:
    int k;
    if ((this.WS != null) && (this.WS.mData != null))
    {
      localSavedState.Xn = this.WS.mData;
      localSavedState.Xm = localSavedState.Xn.length;
      localSavedState.Xf = this.WS.Xf;
      if (getChildCount() <= 0) {
        break label310;
      }
      if (!this.WU) {
        break label250;
      }
      i = gH();
      localSavedState.RB = i;
      if (!this.Rj) {
        break label258;
      }
      localView = aa(true);
      if (localView != null) {
        break label268;
      }
      i = -1;
      localSavedState.Xj = i;
      localSavedState.Xk = this.Qx;
      localSavedState.Xl = new int[this.Qx];
      j = 0;
      if (j >= this.Qx) {
        break label328;
      }
      if (!this.WU) {
        break label277;
      }
      k = this.WM[j].bD(Integer.MIN_VALUE);
      i = k;
      if (k != Integer.MIN_VALUE) {
        i = k - this.WN.fi();
      }
    }
    for (;;)
    {
      localSavedState.Xl[j] = i;
      j += 1;
      break label181;
      localSavedState.Xm = 0;
      break;
      label250:
      i = gI();
      break label126;
      label258:
      localView = Z(true);
      break label146;
      label268:
      i = be(localView);
      break label153;
      label277:
      k = this.WM[j].bC(Integer.MIN_VALUE);
      i = k;
      if (k != Integer.MIN_VALUE) {
        i = k - this.WN.fh();
      }
    }
    label310:
    localSavedState.RB = -1;
    localSavedState.Xj = -1;
    localSavedState.Xk = 0;
    label328:
    return localSavedState;
  }
  
  public final void r(String paramString)
  {
    if (this.WW == null) {
      super.r(paramString);
    }
  }
  
  public final void y(int paramInt1, int paramInt2)
  {
    l(paramInt1, paramInt2, 1);
  }
  
  public final void z(int paramInt1, int paramInt2)
  {
    l(paramInt1, paramInt2, 2);
  }
  
  public static class LayoutParams
    extends RecyclerView.LayoutParams
  {
    StaggeredGridLayoutManager.b Xd;
    boolean Xe;
    
    public LayoutParams(int paramInt1, int paramInt2)
    {
      super(paramInt2);
    }
    
    public LayoutParams(Context paramContext, AttributeSet paramAttributeSet)
    {
      super(paramAttributeSet);
    }
    
    public LayoutParams(ViewGroup.LayoutParams paramLayoutParams)
    {
      super();
    }
    
    public LayoutParams(ViewGroup.MarginLayoutParams paramMarginLayoutParams)
    {
      super();
    }
    
    public final int gJ()
    {
      if (this.Xd == null) {
        return -1;
      }
      return this.Xd.mIndex;
    }
  }
  
  static final class LazySpanLookup
  {
    List<FullSpanItem> Xf;
    int[] mData;
    
    public final void a(FullSpanItem paramFullSpanItem)
    {
      if (this.Xf == null) {
        this.Xf = new ArrayList();
      }
      int j = this.Xf.size();
      int i = 0;
      while (i < j)
      {
        FullSpanItem localFullSpanItem = (FullSpanItem)this.Xf.get(i);
        if (localFullSpanItem.jP == paramFullSpanItem.jP) {
          this.Xf.remove(i);
        }
        if (localFullSpanItem.jP >= paramFullSpanItem.jP)
        {
          this.Xf.add(i, paramFullSpanItem);
          return;
        }
        i += 1;
      }
      this.Xf.add(paramFullSpanItem);
    }
    
    final void ae(int paramInt1, int paramInt2)
    {
      if ((this.mData == null) || (paramInt1 >= this.mData.length)) {}
      do
      {
        return;
        bz(paramInt1 + paramInt2);
        System.arraycopy(this.mData, paramInt1 + paramInt2, this.mData, paramInt1, this.mData.length - paramInt1 - paramInt2);
        Arrays.fill(this.mData, this.mData.length - paramInt2, this.mData.length, -1);
      } while (this.Xf == null);
      int i = this.Xf.size() - 1;
      label87:
      FullSpanItem localFullSpanItem;
      if (i >= 0)
      {
        localFullSpanItem = (FullSpanItem)this.Xf.get(i);
        if (localFullSpanItem.jP >= paramInt1)
        {
          if (localFullSpanItem.jP >= paramInt1 + paramInt2) {
            break label144;
          }
          this.Xf.remove(i);
        }
      }
      for (;;)
      {
        i -= 1;
        break label87;
        break;
        label144:
        localFullSpanItem.jP -= paramInt2;
      }
    }
    
    final void af(int paramInt1, int paramInt2)
    {
      if ((this.mData == null) || (paramInt1 >= this.mData.length)) {}
      for (;;)
      {
        return;
        bz(paramInt1 + paramInt2);
        System.arraycopy(this.mData, paramInt1, this.mData, paramInt1 + paramInt2, this.mData.length - paramInt1 - paramInt2);
        Arrays.fill(this.mData, paramInt1, paramInt1 + paramInt2, -1);
        if (this.Xf != null)
        {
          int i = this.Xf.size() - 1;
          while (i >= 0)
          {
            FullSpanItem localFullSpanItem = (FullSpanItem)this.Xf.get(i);
            if (localFullSpanItem.jP >= paramInt1) {
              localFullSpanItem.jP += paramInt2;
            }
            i -= 1;
          }
        }
      }
    }
    
    public final FullSpanItem bA(int paramInt)
    {
      Object localObject;
      if (this.Xf == null)
      {
        localObject = null;
        return (FullSpanItem)localObject;
      }
      int i = this.Xf.size() - 1;
      for (;;)
      {
        if (i < 0) {
          break label61;
        }
        FullSpanItem localFullSpanItem = (FullSpanItem)this.Xf.get(i);
        localObject = localFullSpanItem;
        if (localFullSpanItem.jP == paramInt) {
          break;
        }
        i -= 1;
      }
      label61:
      return null;
    }
    
    final int bx(int paramInt)
    {
      if (this.Xf != null)
      {
        int i = this.Xf.size() - 1;
        while (i >= 0)
        {
          if (((FullSpanItem)this.Xf.get(i)).jP >= paramInt) {
            this.Xf.remove(i);
          }
          i -= 1;
        }
      }
      return by(paramInt);
    }
    
    final int by(int paramInt)
    {
      if (this.mData == null) {
        return -1;
      }
      if (paramInt >= this.mData.length) {
        return -1;
      }
      FullSpanItem localFullSpanItem;
      int i;
      if (this.Xf != null)
      {
        localFullSpanItem = bA(paramInt);
        if (localFullSpanItem != null) {
          this.Xf.remove(localFullSpanItem);
        }
        int j = this.Xf.size();
        i = 0;
        if (i >= j) {
          break label178;
        }
        if (((FullSpanItem)this.Xf.get(i)).jP < paramInt) {}
      }
      for (;;)
      {
        if (i != -1)
        {
          localFullSpanItem = (FullSpanItem)this.Xf.get(i);
          this.Xf.remove(i);
        }
        for (i = localFullSpanItem.jP;; i = -1)
        {
          if (i != -1) {
            break label162;
          }
          Arrays.fill(this.mData, paramInt, this.mData.length, -1);
          return this.mData.length;
          i += 1;
          break;
        }
        label162:
        Arrays.fill(this.mData, paramInt, i + 1, -1);
        return i + 1;
        label178:
        i = -1;
      }
    }
    
    final void bz(int paramInt)
    {
      if (this.mData == null)
      {
        this.mData = new int[Math.max(paramInt, 10) + 1];
        Arrays.fill(this.mData, -1);
      }
      while (paramInt < this.mData.length) {
        return;
      }
      int[] arrayOfInt = this.mData;
      int i = this.mData.length;
      while (i <= paramInt) {
        i *= 2;
      }
      this.mData = new int[i];
      System.arraycopy(arrayOfInt, 0, this.mData, 0, arrayOfInt.length);
      Arrays.fill(this.mData, arrayOfInt.length, this.mData.length, -1);
    }
    
    final void clear()
    {
      if (this.mData != null) {
        Arrays.fill(this.mData, -1);
      }
      this.Xf = null;
    }
    
    public final FullSpanItem m(int paramInt1, int paramInt2, int paramInt3)
    {
      Object localObject;
      if (this.Xf == null)
      {
        localObject = null;
        return (FullSpanItem)localObject;
      }
      int j = this.Xf.size();
      int i = 0;
      for (;;)
      {
        if (i >= j) {
          break label112;
        }
        FullSpanItem localFullSpanItem = (FullSpanItem)this.Xf.get(i);
        if (localFullSpanItem.jP >= paramInt2) {
          return null;
        }
        if (localFullSpanItem.jP >= paramInt1)
        {
          localObject = localFullSpanItem;
          if (paramInt3 == 0) {
            break;
          }
          localObject = localFullSpanItem;
          if (localFullSpanItem.Xg == paramInt3) {
            break;
          }
          localObject = localFullSpanItem;
          if (localFullSpanItem.Xi) {
            break;
          }
        }
        i += 1;
      }
      label112:
      return null;
    }
    
    static class FullSpanItem
      implements Parcelable
    {
      public static final Parcelable.Creator<FullSpanItem> CREATOR = new Parcelable.Creator() {};
      int Xg;
      int[] Xh;
      boolean Xi;
      int jP;
      
      public FullSpanItem() {}
      
      public FullSpanItem(Parcel paramParcel)
      {
        this.jP = paramParcel.readInt();
        this.Xg = paramParcel.readInt();
        if (paramParcel.readInt() == 1) {}
        for (;;)
        {
          this.Xi = bool;
          int i = paramParcel.readInt();
          if (i > 0)
          {
            this.Xh = new int[i];
            paramParcel.readIntArray(this.Xh);
          }
          return;
          bool = false;
        }
      }
      
      final int bB(int paramInt)
      {
        if (this.Xh == null) {
          return 0;
        }
        return this.Xh[paramInt];
      }
      
      public int describeContents()
      {
        return 0;
      }
      
      public String toString()
      {
        return "FullSpanItem{mPosition=" + this.jP + ", mGapDir=" + this.Xg + ", mHasUnwantedGapAfter=" + this.Xi + ", mGapPerSpan=" + Arrays.toString(this.Xh) + '}';
      }
      
      public void writeToParcel(Parcel paramParcel, int paramInt)
      {
        paramParcel.writeInt(this.jP);
        paramParcel.writeInt(this.Xg);
        if (this.Xi) {}
        for (paramInt = 1;; paramInt = 0)
        {
          paramParcel.writeInt(paramInt);
          if ((this.Xh == null) || (this.Xh.length <= 0)) {
            break;
          }
          paramParcel.writeInt(this.Xh.length);
          paramParcel.writeIntArray(this.Xh);
          return;
        }
        paramParcel.writeInt(0);
      }
    }
  }
  
  public static class SavedState
    implements Parcelable
  {
    public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.Creator() {};
    int RB;
    boolean RD;
    boolean Ri;
    boolean WV;
    List<StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem> Xf;
    int Xj;
    int Xk;
    int[] Xl;
    int Xm;
    int[] Xn;
    
    public SavedState() {}
    
    SavedState(Parcel paramParcel)
    {
      this.RB = paramParcel.readInt();
      this.Xj = paramParcel.readInt();
      this.Xk = paramParcel.readInt();
      if (this.Xk > 0)
      {
        this.Xl = new int[this.Xk];
        paramParcel.readIntArray(this.Xl);
      }
      this.Xm = paramParcel.readInt();
      if (this.Xm > 0)
      {
        this.Xn = new int[this.Xm];
        paramParcel.readIntArray(this.Xn);
      }
      if (paramParcel.readInt() == 1)
      {
        bool1 = true;
        this.Ri = bool1;
        if (paramParcel.readInt() != 1) {
          break label152;
        }
        bool1 = true;
        label113:
        this.RD = bool1;
        if (paramParcel.readInt() != 1) {
          break label157;
        }
      }
      label152:
      label157:
      for (boolean bool1 = bool2;; bool1 = false)
      {
        this.WV = bool1;
        this.Xf = paramParcel.readArrayList(StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem.class.getClassLoader());
        return;
        bool1 = false;
        break;
        bool1 = false;
        break label113;
      }
    }
    
    public SavedState(SavedState paramSavedState)
    {
      this.Xk = paramSavedState.Xk;
      this.RB = paramSavedState.RB;
      this.Xj = paramSavedState.Xj;
      this.Xl = paramSavedState.Xl;
      this.Xm = paramSavedState.Xm;
      this.Xn = paramSavedState.Xn;
      this.Ri = paramSavedState.Ri;
      this.RD = paramSavedState.RD;
      this.WV = paramSavedState.WV;
      this.Xf = paramSavedState.Xf;
    }
    
    public int describeContents()
    {
      return 0;
    }
    
    public void writeToParcel(Parcel paramParcel, int paramInt)
    {
      int i = 1;
      paramParcel.writeInt(this.RB);
      paramParcel.writeInt(this.Xj);
      paramParcel.writeInt(this.Xk);
      if (this.Xk > 0) {
        paramParcel.writeIntArray(this.Xl);
      }
      paramParcel.writeInt(this.Xm);
      if (this.Xm > 0) {
        paramParcel.writeIntArray(this.Xn);
      }
      if (this.Ri)
      {
        paramInt = 1;
        paramParcel.writeInt(paramInt);
        if (!this.RD) {
          break label120;
        }
        paramInt = 1;
        label87:
        paramParcel.writeInt(paramInt);
        if (!this.WV) {
          break label125;
        }
      }
      label120:
      label125:
      for (paramInt = i;; paramInt = 0)
      {
        paramParcel.writeInt(paramInt);
        paramParcel.writeList(this.Xf);
        return;
        paramInt = 0;
        break;
        paramInt = 0;
        break label87;
      }
    }
  }
  
  private final class a
  {
    boolean Rt;
    boolean Xc;
    int jP;
    int vq;
  }
  
  final class b
  {
    public ArrayList<View> Xo;
    int Xp;
    int Xq;
    int Xr;
    final int mIndex;
    
    private void gK()
    {
      Object localObject = (View)this.Xo.get(0);
      StaggeredGridLayoutManager.LayoutParams localLayoutParams = (StaggeredGridLayoutManager.LayoutParams)((View)localObject).getLayoutParams();
      this.Xp = this.Xb.WN.aV((View)localObject);
      if (localLayoutParams.Xe)
      {
        localObject = this.Xb.WS.bA(localLayoutParams.Ui.gb());
        if ((localObject != null) && (((StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem)localObject).Xg == -1)) {
          this.Xp -= ((StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem)localObject).bB(this.mIndex);
        }
      }
    }
    
    private void gM()
    {
      Object localObject = (View)this.Xo.get(this.Xo.size() - 1);
      StaggeredGridLayoutManager.LayoutParams localLayoutParams = (StaggeredGridLayoutManager.LayoutParams)((View)localObject).getLayoutParams();
      this.Xq = this.Xb.WN.aW((View)localObject);
      if (localLayoutParams.Xe)
      {
        localObject = this.Xb.WS.bA(localLayoutParams.Ui.gb());
        if ((localObject != null) && (((StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem)localObject).Xg == 1))
        {
          int i = this.Xq;
          this.Xq = (((StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem)localObject).bB(this.mIndex) + i);
        }
      }
    }
    
    public final View ag(int paramInt1, int paramInt2)
    {
      View localView2 = null;
      View localView1 = null;
      int i;
      if (paramInt2 == -1)
      {
        i = this.Xo.size();
        paramInt2 = 0;
        if (paramInt2 < i)
        {
          localView2 = (View)this.Xo.get(paramInt2);
          if (localView2.isFocusable())
          {
            if (StaggeredGridLayoutManager.be(localView2) > paramInt1) {}
            for (int k = 1;; k = 0)
            {
              if (k != this.Xb.Ri) {
                break label88;
              }
              paramInt2 += 1;
              localView1 = localView2;
              break;
            }
          }
        }
        label88:
        return localView1;
      }
      paramInt2 = this.Xo.size() - 1;
      localView1 = localView2;
      if (paramInt2 >= 0)
      {
        localView2 = (View)this.Xo.get(paramInt2);
        if (localView2.isFocusable())
        {
          if (StaggeredGridLayoutManager.be(localView2) > paramInt1)
          {
            i = 1;
            label141:
            if (this.Xb.Ri) {
              break label176;
            }
          }
          label176:
          for (int j = 1;; j = 0)
          {
            if (i != j) {
              break label182;
            }
            localView1 = localView2;
            paramInt2 -= 1;
            break;
            i = 0;
            break label141;
          }
        }
      }
      label182:
      return localView1;
    }
    
    final int bC(int paramInt)
    {
      if (this.Xp != Integer.MIN_VALUE) {
        paramInt = this.Xp;
      }
      while (this.Xo.size() == 0) {
        return paramInt;
      }
      gK();
      return this.Xp;
    }
    
    final int bD(int paramInt)
    {
      if (this.Xq != Integer.MIN_VALUE) {
        paramInt = this.Xq;
      }
      while (this.Xo.size() == 0) {
        return paramInt;
      }
      gM();
      return this.Xq;
    }
    
    final void bE(int paramInt)
    {
      this.Xp = paramInt;
      this.Xq = paramInt;
    }
    
    final void bF(int paramInt)
    {
      if (this.Xp != Integer.MIN_VALUE) {
        this.Xp += paramInt;
      }
      if (this.Xq != Integer.MIN_VALUE) {
        this.Xq += paramInt;
      }
    }
    
    final void bq(View paramView)
    {
      StaggeredGridLayoutManager.LayoutParams localLayoutParams = (StaggeredGridLayoutManager.LayoutParams)paramView.getLayoutParams();
      localLayoutParams.Xd = this;
      this.Xo.add(0, paramView);
      this.Xp = Integer.MIN_VALUE;
      if (this.Xo.size() == 1) {
        this.Xq = Integer.MIN_VALUE;
      }
      if ((localLayoutParams.Ui.isRemoved()) || (localLayoutParams.Ui.gq())) {
        this.Xr += this.Xb.WN.aX(paramView);
      }
    }
    
    final void br(View paramView)
    {
      StaggeredGridLayoutManager.LayoutParams localLayoutParams = (StaggeredGridLayoutManager.LayoutParams)paramView.getLayoutParams();
      localLayoutParams.Xd = this;
      this.Xo.add(paramView);
      this.Xq = Integer.MIN_VALUE;
      if (this.Xo.size() == 1) {
        this.Xp = Integer.MIN_VALUE;
      }
      if ((localLayoutParams.Ui.isRemoved()) || (localLayoutParams.Ui.gq())) {
        this.Xr += this.Xb.WN.aX(paramView);
      }
    }
    
    final void clear()
    {
      this.Xo.clear();
      this.Xp = Integer.MIN_VALUE;
      this.Xq = Integer.MIN_VALUE;
      this.Xr = 0;
    }
    
    final int gL()
    {
      if (this.Xp != Integer.MIN_VALUE) {
        return this.Xp;
      }
      gK();
      return this.Xp;
    }
    
    final int gN()
    {
      if (this.Xq != Integer.MIN_VALUE) {
        return this.Xq;
      }
      gM();
      return this.Xq;
    }
    
    final void gO()
    {
      int i = this.Xo.size();
      View localView = (View)this.Xo.remove(i - 1);
      StaggeredGridLayoutManager.LayoutParams localLayoutParams = (StaggeredGridLayoutManager.LayoutParams)localView.getLayoutParams();
      localLayoutParams.Xd = null;
      if ((localLayoutParams.Ui.isRemoved()) || (localLayoutParams.Ui.gq())) {
        this.Xr -= this.Xb.WN.aX(localView);
      }
      if (i == 1) {
        this.Xp = Integer.MIN_VALUE;
      }
      this.Xq = Integer.MIN_VALUE;
    }
    
    final void gP()
    {
      View localView = (View)this.Xo.remove(0);
      StaggeredGridLayoutManager.LayoutParams localLayoutParams = (StaggeredGridLayoutManager.LayoutParams)localView.getLayoutParams();
      localLayoutParams.Xd = null;
      if (this.Xo.size() == 0) {
        this.Xq = Integer.MIN_VALUE;
      }
      if ((localLayoutParams.Ui.isRemoved()) || (localLayoutParams.Ui.gq())) {
        this.Xr -= this.Xb.WN.aX(localView);
      }
      this.Xp = Integer.MIN_VALUE;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\android\support\v7\widget\StaggeredGridLayoutManager.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */