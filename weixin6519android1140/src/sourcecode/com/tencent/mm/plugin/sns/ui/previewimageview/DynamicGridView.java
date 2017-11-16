package com.tencent.mm.plugin.sns.ui.previewimageview;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TypeEvaluator;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Message;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Pair;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnPreDrawListener;
import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListAdapter;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.sns.i.d;
import com.tencent.mm.plugin.sns.i.f;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class DynamicGridView
  extends WrappingGridView
{
  private int eA;
  private List<Long> idList;
  boolean kHI;
  private BitmapDrawable qnH;
  private Rect qnI;
  private Rect qnJ;
  private Rect qnK;
  private int qnL;
  private int qnM;
  private int qnN;
  private int qnO;
  private int qnP;
  private int qnQ;
  private int qnR;
  private long qnS;
  private boolean qnT;
  private boolean qnU;
  private int qnV;
  private boolean qnW;
  private List<ObjectAnimator> qnX;
  boolean qnY;
  boolean qnZ;
  boolean qoa;
  private boolean qob;
  private AbsListView.OnScrollListener qoc;
  f qod;
  e qoe;
  private AdapterView.OnItemClickListener qof;
  private AdapterView.OnItemClickListener qog;
  private boolean qoh;
  private Stack<a> qoi;
  private a qoj;
  private View qok;
  d qol;
  int qom;
  float qon;
  float qoo;
  private float qop;
  private float qoq;
  private AbsListView.OnScrollListener qor;
  private int xl;
  
  public DynamicGridView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(15981841743872L, 119074);
    this.qnL = 0;
    this.qnM = 0;
    this.qnN = -1;
    this.qnO = -1;
    this.qnP = -1;
    this.qnQ = -1;
    this.idList = new ArrayList();
    this.qnS = -1L;
    this.qnT = false;
    this.eA = -1;
    this.qnV = 0;
    this.qnW = false;
    this.xl = 0;
    this.kHI = false;
    this.qnX = new LinkedList();
    this.qoa = true;
    this.qob = true;
    this.qog = new AdapterView.OnItemClickListener()
    {
      public final void onItemClick(AdapterView<?> paramAnonymousAdapterView, View paramAnonymousView, int paramAnonymousInt, long paramAnonymousLong)
      {
        GMTrace.i(15981170655232L, 119069);
        if ((!DynamicGridView.this.kHI) && (DynamicGridView.this.isEnabled()) && (DynamicGridView.a(DynamicGridView.this) != null)) {
          DynamicGridView.a(DynamicGridView.this).onItemClick(paramAnonymousAdapterView, paramAnonymousView, paramAnonymousInt, paramAnonymousLong);
        }
        GMTrace.o(15981170655232L, 119069);
      }
    };
    this.qol = new d((byte)0);
    this.qom = -1;
    this.qor = new AbsListView.OnScrollListener()
    {
      private int jOs;
      private int qot;
      private int qou;
      private int qov;
      private int qow;
      
      public final void onScroll(AbsListView paramAnonymousAbsListView, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3)
      {
        GMTrace.i(15976204599296L, 119032);
        this.qov = paramAnonymousInt1;
        this.qow = paramAnonymousInt2;
        int i;
        label52:
        label215:
        View localView;
        if (this.qot == -1)
        {
          i = this.qov;
          this.qot = i;
          if (this.qou != -1) {
            break label311;
          }
          i = this.qow;
          this.qou = i;
          if ((this.qov != this.qot) && (DynamicGridView.k(DynamicGridView.this)) && (DynamicGridView.h(DynamicGridView.this) != -1L))
          {
            DynamicGridView.a(DynamicGridView.this, DynamicGridView.h(DynamicGridView.this));
            DynamicGridView.p(DynamicGridView.this);
          }
          if ((this.qov + this.qow != this.qot + this.qou) && (DynamicGridView.k(DynamicGridView.this)) && (DynamicGridView.h(DynamicGridView.this) != -1L))
          {
            DynamicGridView.a(DynamicGridView.this, DynamicGridView.h(DynamicGridView.this));
            DynamicGridView.p(DynamicGridView.this);
          }
          this.qot = this.qov;
          this.qou = this.qow;
          if ((!DynamicGridView.bqo()) || (!DynamicGridView.i(DynamicGridView.this))) {
            break label377;
          }
          i = 0;
          if (i >= paramAnonymousInt2) {
            break label377;
          }
          localView = DynamicGridView.this.getChildAt(i);
          if (localView != null)
          {
            if ((DynamicGridView.h(DynamicGridView.this) == -1L) || (Boolean.TRUE == localView.getTag(i.f.pax))) {
              break label332;
            }
            if (i % 2 != 0) {
              break label320;
            }
            DynamicGridView.c(DynamicGridView.this, localView);
            label281:
            localView.setTag(i.f.pax, Boolean.valueOf(true));
          }
        }
        for (;;)
        {
          i += 1;
          break label215;
          i = this.qot;
          break;
          label311:
          i = this.qou;
          break label52;
          label320:
          DynamicGridView.d(DynamicGridView.this, localView);
          break label281;
          label332:
          if ((DynamicGridView.h(DynamicGridView.this) == -1L) && (localView.getRotation() != 0.0F))
          {
            localView.setRotation(0.0F);
            localView.setTag(i.f.pax, Boolean.valueOf(false));
          }
        }
        label377:
        if (DynamicGridView.j(DynamicGridView.this) != null) {
          DynamicGridView.j(DynamicGridView.this).onScroll(paramAnonymousAbsListView, paramAnonymousInt1, paramAnonymousInt2, paramAnonymousInt3);
        }
        GMTrace.o(15976204599296L, 119032);
      }
      
      public final void onScrollStateChanged(AbsListView paramAnonymousAbsListView, int paramAnonymousInt)
      {
        GMTrace.i(15976338817024L, 119033);
        this.jOs = paramAnonymousInt;
        DynamicGridView.c(DynamicGridView.this, paramAnonymousInt);
        if ((this.qow > 0) && (this.jOs == 0))
        {
          if ((!DynamicGridView.k(DynamicGridView.this)) || (!DynamicGridView.l(DynamicGridView.this))) {
            break label96;
          }
          DynamicGridView.m(DynamicGridView.this);
        }
        for (;;)
        {
          if (DynamicGridView.j(DynamicGridView.this) != null) {
            DynamicGridView.j(DynamicGridView.this).onScrollStateChanged(paramAnonymousAbsListView, paramAnonymousInt);
          }
          GMTrace.o(15976338817024L, 119033);
          return;
          label96:
          if (DynamicGridView.n(DynamicGridView.this)) {
            DynamicGridView.o(DynamicGridView.this);
          }
        }
      }
    };
    init(paramContext);
    GMTrace.o(15981841743872L, 119074);
  }
  
  public DynamicGridView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(15981975961600L, 119075);
    this.qnL = 0;
    this.qnM = 0;
    this.qnN = -1;
    this.qnO = -1;
    this.qnP = -1;
    this.qnQ = -1;
    this.idList = new ArrayList();
    this.qnS = -1L;
    this.qnT = false;
    this.eA = -1;
    this.qnV = 0;
    this.qnW = false;
    this.xl = 0;
    this.kHI = false;
    this.qnX = new LinkedList();
    this.qoa = true;
    this.qob = true;
    this.qog = new AdapterView.OnItemClickListener()
    {
      public final void onItemClick(AdapterView<?> paramAnonymousAdapterView, View paramAnonymousView, int paramAnonymousInt, long paramAnonymousLong)
      {
        GMTrace.i(15981170655232L, 119069);
        if ((!DynamicGridView.this.kHI) && (DynamicGridView.this.isEnabled()) && (DynamicGridView.a(DynamicGridView.this) != null)) {
          DynamicGridView.a(DynamicGridView.this).onItemClick(paramAnonymousAdapterView, paramAnonymousView, paramAnonymousInt, paramAnonymousLong);
        }
        GMTrace.o(15981170655232L, 119069);
      }
    };
    this.qol = new d((byte)0);
    this.qom = -1;
    this.qor = new AbsListView.OnScrollListener()
    {
      private int jOs;
      private int qot;
      private int qou;
      private int qov;
      private int qow;
      
      public final void onScroll(AbsListView paramAnonymousAbsListView, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3)
      {
        GMTrace.i(15976204599296L, 119032);
        this.qov = paramAnonymousInt1;
        this.qow = paramAnonymousInt2;
        int i;
        label52:
        label215:
        View localView;
        if (this.qot == -1)
        {
          i = this.qov;
          this.qot = i;
          if (this.qou != -1) {
            break label311;
          }
          i = this.qow;
          this.qou = i;
          if ((this.qov != this.qot) && (DynamicGridView.k(DynamicGridView.this)) && (DynamicGridView.h(DynamicGridView.this) != -1L))
          {
            DynamicGridView.a(DynamicGridView.this, DynamicGridView.h(DynamicGridView.this));
            DynamicGridView.p(DynamicGridView.this);
          }
          if ((this.qov + this.qow != this.qot + this.qou) && (DynamicGridView.k(DynamicGridView.this)) && (DynamicGridView.h(DynamicGridView.this) != -1L))
          {
            DynamicGridView.a(DynamicGridView.this, DynamicGridView.h(DynamicGridView.this));
            DynamicGridView.p(DynamicGridView.this);
          }
          this.qot = this.qov;
          this.qou = this.qow;
          if ((!DynamicGridView.bqo()) || (!DynamicGridView.i(DynamicGridView.this))) {
            break label377;
          }
          i = 0;
          if (i >= paramAnonymousInt2) {
            break label377;
          }
          localView = DynamicGridView.this.getChildAt(i);
          if (localView != null)
          {
            if ((DynamicGridView.h(DynamicGridView.this) == -1L) || (Boolean.TRUE == localView.getTag(i.f.pax))) {
              break label332;
            }
            if (i % 2 != 0) {
              break label320;
            }
            DynamicGridView.c(DynamicGridView.this, localView);
            label281:
            localView.setTag(i.f.pax, Boolean.valueOf(true));
          }
        }
        for (;;)
        {
          i += 1;
          break label215;
          i = this.qot;
          break;
          label311:
          i = this.qou;
          break label52;
          label320:
          DynamicGridView.d(DynamicGridView.this, localView);
          break label281;
          label332:
          if ((DynamicGridView.h(DynamicGridView.this) == -1L) && (localView.getRotation() != 0.0F))
          {
            localView.setRotation(0.0F);
            localView.setTag(i.f.pax, Boolean.valueOf(false));
          }
        }
        label377:
        if (DynamicGridView.j(DynamicGridView.this) != null) {
          DynamicGridView.j(DynamicGridView.this).onScroll(paramAnonymousAbsListView, paramAnonymousInt1, paramAnonymousInt2, paramAnonymousInt3);
        }
        GMTrace.o(15976204599296L, 119032);
      }
      
      public final void onScrollStateChanged(AbsListView paramAnonymousAbsListView, int paramAnonymousInt)
      {
        GMTrace.i(15976338817024L, 119033);
        this.jOs = paramAnonymousInt;
        DynamicGridView.c(DynamicGridView.this, paramAnonymousInt);
        if ((this.qow > 0) && (this.jOs == 0))
        {
          if ((!DynamicGridView.k(DynamicGridView.this)) || (!DynamicGridView.l(DynamicGridView.this))) {
            break label96;
          }
          DynamicGridView.m(DynamicGridView.this);
        }
        for (;;)
        {
          if (DynamicGridView.j(DynamicGridView.this) != null) {
            DynamicGridView.j(DynamicGridView.this).onScrollStateChanged(paramAnonymousAbsListView, paramAnonymousInt);
          }
          GMTrace.o(15976338817024L, 119033);
          return;
          label96:
          if (DynamicGridView.n(DynamicGridView.this)) {
            DynamicGridView.o(DynamicGridView.this);
          }
        }
      }
    };
    init(paramContext);
    GMTrace.o(15981975961600L, 119075);
  }
  
  @TargetApi(11)
  private void bqg()
  {
    GMTrace.i(15982512832512L, 119079);
    int i = 0;
    if (i < getChildCount())
    {
      View localView = getChildAt(i);
      if ((localView != null) && (Boolean.TRUE != localView.getTag(i.f.pax)))
      {
        if (i % 2 != 0) {
          break label71;
        }
        cJ(localView);
      }
      for (;;)
      {
        localView.setTag(i.f.pax, Boolean.valueOf(true));
        i += 1;
        break;
        label71:
        cK(localView);
      }
    }
    GMTrace.o(15982512832512L, 119079);
  }
  
  private boolean bqh()
  {
    GMTrace.i(15984257662976L, 119092);
    int i = ec(this.qnS);
    if (i != -1)
    {
      this.qoe.vF(i);
      if (this.qok == null)
      {
        GMTrace.o(15984257662976L, 119092);
        return false;
      }
    }
    else
    {
      GMTrace.o(15984257662976L, 119092);
      return false;
    }
    i = getPositionForView(this.qok);
    int j = getChildCount() - 1;
    new StringBuilder("switch ").append(i).append(",").append(j);
    dj(i, j);
    if (this.qoh) {
      this.qoj.dk(i, j);
    }
    this.qnO = this.qnP;
    this.qnN = this.qnQ;
    Object localObject;
    if ((bqk()) && (bql())) {
      localObject = new b(0, 0);
    }
    for (;;)
    {
      eb(this.qnS);
      ((h)localObject).dl(i, j);
      GMTrace.o(15984257662976L, 119092);
      return true;
      if (bql()) {
        localObject = new g(0, 0);
      } else {
        localObject = new c(0, 0);
      }
    }
  }
  
  private void bqi()
  {
    boolean bool = true;
    GMTrace.i(15984526098432L, 119094);
    Rect localRect = this.qnI;
    int i = computeVerticalScrollOffset();
    int j = getHeight();
    int k = computeVerticalScrollExtent();
    int m = computeVerticalScrollRange();
    int n = localRect.top;
    int i1 = localRect.height();
    if ((n <= 0) && (i > 0)) {
      smoothScrollBy(-this.qnV, 0);
    }
    for (;;)
    {
      this.qnU = bool;
      GMTrace.o(15984526098432L, 119094);
      return;
      if ((i1 + n >= j) && (i + k < m)) {
        smoothScrollBy(this.qnV, 0);
      } else {
        bool = false;
      }
    }
  }
  
  private void bqj()
  {
    GMTrace.i(15984794533888L, 119096);
    this.qol.removeMessages(1);
    final View localView = ed(this.qnS);
    Object localObject;
    if (this.qnI != null)
    {
      localObject = new Rect(this.qnI);
      ((Rect)localObject).offset(0, this.qnI.height() >>> 1);
    }
    for (;;)
    {
      if ((this.qoe != null) && (this.qoe.l((Rect)localObject)) && (bqh()))
      {
        this.qnH = null;
        bqm();
        if (this.qod != null) {
          this.qod.bqf();
        }
      }
      for (;;)
      {
        if (this.qoe != null) {
          this.qoe.bqe();
        }
        GMTrace.o(15984794533888L, 119096);
        return;
        if ((localView != null) && ((this.qnT) || (this.qnW)))
        {
          this.qnT = false;
          this.qnW = false;
          this.qnU = false;
          this.eA = -1;
          this.qnI.set(localView.getLeft(), localView.getTop(), localView.getRight(), localView.getBottom());
          new StringBuilder("animating to  ").append(this.qnI);
          if (Build.VERSION.SDK_INT > 11)
          {
            localObject = new TypeEvaluator()
            {
              private static int c(int paramAnonymousInt1, int paramAnonymousInt2, float paramAnonymousFloat)
              {
                GMTrace.i(15968151535616L, 118972);
                paramAnonymousInt1 = (int)(paramAnonymousInt1 + (paramAnonymousInt2 - paramAnonymousInt1) * paramAnonymousFloat);
                GMTrace.o(15968151535616L, 118972);
                return paramAnonymousInt1;
              }
            };
            localObject = ObjectAnimator.ofObject(this.qnH, "bounds", (TypeEvaluator)localObject, new Object[] { this.qnI });
            ((ObjectAnimator)localObject).addUpdateListener(new ValueAnimator.AnimatorUpdateListener()
            {
              public final void onAnimationUpdate(ValueAnimator paramAnonymousValueAnimator)
              {
                GMTrace.i(15981439090688L, 119071);
                DynamicGridView.this.invalidate();
                GMTrace.o(15981439090688L, 119071);
              }
            });
            ((ObjectAnimator)localObject).addListener(new AnimatorListenerAdapter()
            {
              public final void onAnimationEnd(Animator paramAnonymousAnimator)
              {
                GMTrace.i(15972580720640L, 119005);
                DynamicGridView.a(DynamicGridView.this, false);
                DynamicGridView.b(DynamicGridView.this);
                if ((DynamicGridView.c(DynamicGridView.this) != null) && (DynamicGridView.d(DynamicGridView.this) != null)) {
                  DynamicGridView.d(DynamicGridView.this).bqf();
                }
                DynamicGridView.a(DynamicGridView.this, localView);
                GMTrace.o(15972580720640L, 119005);
              }
              
              public final void onAnimationStart(Animator paramAnonymousAnimator)
              {
                GMTrace.i(15972446502912L, 119004);
                DynamicGridView.a(DynamicGridView.this, true);
                DynamicGridView.b(DynamicGridView.this);
                GMTrace.o(15972446502912L, 119004);
              }
            });
            ((ObjectAnimator)localObject).setDuration(200L);
            ((ObjectAnimator)localObject).start();
          }
          else
          {
            this.qnH.setBounds(this.qnI);
            invalidate();
            cM(localView);
          }
        }
        else
        {
          bqm();
        }
      }
      localObject = null;
    }
  }
  
  static boolean bqk()
  {
    GMTrace.i(15985062969344L, 119098);
    if (Build.VERSION.SDK_INT >= 11)
    {
      GMTrace.o(15985062969344L, 119098);
      return true;
    }
    GMTrace.o(15985062969344L, 119098);
    return false;
  }
  
  private static boolean bql()
  {
    GMTrace.i(15985197187072L, 119099);
    if (Build.VERSION.SDK_INT < 21)
    {
      GMTrace.o(15985197187072L, 119099);
      return true;
    }
    GMTrace.o(15985197187072L, 119099);
    return false;
  }
  
  private void bqm()
  {
    GMTrace.i(15985331404800L, 119100);
    View localView = ed(this.qnS);
    if (localView == null)
    {
      GMTrace.o(15985331404800L, 119100);
      return;
    }
    if (this.qnT) {
      cM(localView);
    }
    this.qnT = false;
    this.qnU = false;
    this.eA = -1;
    GMTrace.o(15985331404800L, 119100);
  }
  
  private void bqn()
  {
    GMTrace.i(15985465622528L, 119101);
    int j = this.qnP - this.qnO;
    int k = this.qnQ - this.qnN;
    int m = this.qnJ.centerY() + this.qnL + j;
    int n = this.qnJ.centerX() + this.qnM + k;
    this.qok = ed(this.qnS);
    if (this.qok == null)
    {
      GMTrace.o(15985465622528L, 119101);
      return;
    }
    Object localObject = null;
    float f1 = 0.0F;
    float f2 = 0.0F;
    Point localPoint1 = cN(this.qok);
    Iterator localIterator = this.idList.iterator();
    int i;
    label193:
    label247:
    label301:
    label355:
    label409:
    label458:
    label507:
    label556:
    float f3;
    if (localIterator.hasNext())
    {
      View localView = ed(((Long)localIterator.next()).longValue());
      if (localView == null) {
        break label934;
      }
      Point localPoint2 = cN(localView);
      if ((localPoint2.y < localPoint1.y) && (localPoint2.x > localPoint1.x))
      {
        i = 1;
        if ((i == 0) || (m >= localView.getBottom()) || (n <= localView.getLeft()))
        {
          if ((localPoint2.y >= localPoint1.y) || (localPoint2.x >= localPoint1.x)) {
            break label648;
          }
          i = 1;
          if ((i == 0) || (m >= localView.getBottom()) || (n >= localView.getRight()))
          {
            if ((localPoint2.y <= localPoint1.y) || (localPoint2.x <= localPoint1.x)) {
              break label654;
            }
            i = 1;
            if ((i == 0) || (m <= localView.getTop()) || (n <= localView.getLeft()))
            {
              if ((localPoint2.y <= localPoint1.y) || (localPoint2.x >= localPoint1.x)) {
                break label660;
              }
              i = 1;
              if ((i == 0) || (m <= localView.getTop()) || (n >= localView.getRight()))
              {
                if ((localPoint2.y >= localPoint1.y) || (localPoint2.x != localPoint1.x)) {
                  break label666;
                }
                i = 1;
                if ((i == 0) || (m >= localView.getBottom() - this.qnR))
                {
                  if ((localPoint2.y <= localPoint1.y) || (localPoint2.x != localPoint1.x)) {
                    break label672;
                  }
                  i = 1;
                  if ((i == 0) || (m <= localView.getTop() + this.qnR))
                  {
                    if ((localPoint2.y != localPoint1.y) || (localPoint2.x <= localPoint1.x)) {
                      break label678;
                    }
                    i = 1;
                    if ((i == 0) || (n <= localView.getLeft() + this.qnR))
                    {
                      if ((localPoint2.y != localPoint1.y) || (localPoint2.x >= localPoint1.x)) {
                        break label684;
                      }
                      i = 1;
                      if ((i == 0) || (n >= localView.getRight() - this.qnR)) {
                        break label934;
                      }
                    }
                  }
                }
              }
            }
          }
        }
        float f4 = Math.abs(f.cH(localView) - f.cH(this.qok));
        f3 = Math.abs(f.cI(localView) - f.cI(this.qok));
        if ((f4 < f1) || (f3 < f2)) {
          break label934;
        }
        f2 = f4;
        localObject = localView;
        f1 = f3;
      }
    }
    for (;;)
    {
      f3 = f2;
      f2 = f1;
      f1 = f3;
      break;
      i = 0;
      break label193;
      label648:
      i = 0;
      break label247;
      label654:
      i = 0;
      break label301;
      label660:
      i = 0;
      break label355;
      label666:
      i = 0;
      break label409;
      label672:
      i = 0;
      break label458;
      label678:
      i = 0;
      break label507;
      label684:
      i = 0;
      break label556;
      if (localObject != null)
      {
        i = getPositionForView(this.qok);
        m = getPositionForView((View)localObject);
        new StringBuilder("switch ").append(i).append(",").append(m);
        localObject = (d)getAdapter();
        if ((m == -1) || (!((d)localObject).vD(i)) || (!((d)localObject).vD(m)))
        {
          eb(this.qnS);
          GMTrace.o(15985465622528L, 119101);
          return;
        }
        dj(i, m);
        if (this.qoh) {
          this.qoj.dk(i, m);
        }
        this.qnO = this.qnP;
        this.qnN = this.qnQ;
        if ((!bqk()) || (!bql())) {
          break label894;
        }
        localObject = new b(k, j);
      }
      for (;;)
      {
        eb(this.qnS);
        ((h)localObject).dl(i, m);
        GMTrace.o(15985465622528L, 119101);
        return;
        label894:
        if (bql()) {
          localObject = new g(k, j);
        } else {
          localObject = new c(k, j);
        }
      }
      label934:
      f3 = f1;
      f1 = f2;
      f2 = f3;
    }
  }
  
  @TargetApi(11)
  private void cJ(View paramView)
  {
    GMTrace.i(15982915485696L, 119082);
    paramView = cL(paramView);
    paramView.setFloatValues(new float[] { -2.0F, 2.0F });
    paramView.start();
    this.qnX.add(paramView);
    GMTrace.o(15982915485696L, 119082);
  }
  
  @TargetApi(11)
  private void cK(View paramView)
  {
    GMTrace.i(15983049703424L, 119083);
    paramView = cL(paramView);
    paramView.setFloatValues(new float[] { 2.0F, -2.0F });
    paramView.start();
    this.qnX.add(paramView);
    GMTrace.o(15983049703424L, 119083);
  }
  
  @TargetApi(11)
  private ObjectAnimator cL(final View paramView)
  {
    GMTrace.i(15983183921152L, 119084);
    if (!bql()) {
      paramView.setLayerType(1, null);
    }
    ObjectAnimator localObjectAnimator = new ObjectAnimator();
    localObjectAnimator.setDuration(180L);
    localObjectAnimator.setRepeatMode(2);
    localObjectAnimator.setRepeatCount(-1);
    localObjectAnimator.setPropertyName("rotation");
    localObjectAnimator.setTarget(paramView);
    localObjectAnimator.addListener(new AnimatorListenerAdapter()
    {
      public final void onAnimationEnd(Animator paramAnonymousAnimator)
      {
        GMTrace.i(15968554188800L, 118975);
        paramView.setLayerType(0, null);
        GMTrace.o(15968554188800L, 118975);
      }
    });
    GMTrace.o(15983183921152L, 119084);
    return localObjectAnimator;
  }
  
  private void cM(View paramView)
  {
    GMTrace.i(15984928751616L, 119097);
    this.idList.clear();
    this.qnS = -1L;
    paramView.setVisibility(0);
    this.qnH = null;
    if ((bqk()) && (this.qoa))
    {
      if (!this.kHI) {
        break label101;
      }
      ih(false);
      bqg();
    }
    for (;;)
    {
      int i = 0;
      while (i < getLastVisiblePosition() - getFirstVisiblePosition())
      {
        paramView = getChildAt(i);
        if (paramView != null) {
          paramView.setVisibility(0);
        }
        i += 1;
      }
      label101:
      ih(true);
    }
    invalidate();
    GMTrace.o(15984928751616L, 119097);
  }
  
  private Point cN(View paramView)
  {
    GMTrace.i(15985599840256L, 119102);
    int i = getPositionForView(paramView);
    int j = getColumnCount();
    paramView = new Point(i % j, i / j);
    GMTrace.o(15985599840256L, 119102);
    return paramView;
  }
  
  @TargetApi(11)
  private static AnimatorSet d(View paramView, float paramFloat1, float paramFloat2)
  {
    GMTrace.i(15985868275712L, 119104);
    ObjectAnimator localObjectAnimator = ObjectAnimator.ofFloat(paramView, "translationX", new float[] { paramFloat1, 0.0F });
    paramView = ObjectAnimator.ofFloat(paramView, "translationY", new float[] { paramFloat2, 0.0F });
    AnimatorSet localAnimatorSet = new AnimatorSet();
    localAnimatorSet.playTogether(new Animator[] { localObjectAnimator, paramView });
    GMTrace.o(15985868275712L, 119104);
    return localAnimatorSet;
  }
  
  private void dj(int paramInt1, int paramInt2)
  {
    GMTrace.i(15983318138880L, 119085);
    ((d)getAdapter()).di(paramInt1, paramInt2);
    GMTrace.o(15983318138880L, 119085);
  }
  
  private void eb(long paramLong)
  {
    GMTrace.i(15983586574336L, 119087);
    this.idList.clear();
    int j = ec(paramLong);
    int i = getFirstVisiblePosition();
    while (i <= getLastVisiblePosition())
    {
      if ((j != i) && (((d)getAdapter()).vD(i))) {
        this.idList.add(Long.valueOf(vI(i)));
      }
      i += 1;
    }
    GMTrace.o(15983586574336L, 119087);
  }
  
  private int getColumnCount()
  {
    GMTrace.i(15983452356608L, 119086);
    int i = ((d)getAdapter()).getColumnCount();
    GMTrace.o(15983452356608L, 119086);
    return i;
  }
  
  private void init(Context paramContext)
  {
    GMTrace.i(15982781267968L, 119081);
    super.setOnScrollListener(this.qor);
    this.qnV = ((int)(paramContext.getResources().getDisplayMetrics().density * 8.0F + 0.5F));
    this.qnR = getResources().getDimensionPixelSize(i.d.oXo);
    GMTrace.o(15982781267968L, 119081);
  }
  
  private boolean vH(int paramInt)
  {
    GMTrace.i(15984391880704L, 119093);
    if (!((d)getAdapter()).vC(paramInt))
    {
      GMTrace.o(15984391880704L, 119093);
      return false;
    }
    this.qnL = 0;
    this.qnM = 0;
    View localView = getChildAt(paramInt - getFirstVisiblePosition());
    if (localView != null)
    {
      this.qnS = getAdapter().getItemId(paramInt);
      int j = localView.getWidth();
      int i = localView.getHeight();
      int k = localView.getTop();
      int m = localView.getLeft();
      Object localObject = Bitmap.createBitmap(localView.getWidth(), localView.getHeight(), Bitmap.Config.ARGB_8888);
      localView.draw(new Canvas((Bitmap)localObject));
      localObject = new BitmapDrawable(getResources(), (Bitmap)localObject);
      this.qnJ = new Rect(m, k, m + j, k + i);
      k = this.qnJ.left;
      m = (int)(j * 0.05F);
      int n = this.qnJ.top;
      int i1 = (int)(i * 0.05F);
      int i2 = this.qnJ.right;
      j = (int)(j * 0.05F);
      int i3 = this.qnJ.bottom;
      this.qnI = new Rect(k - m, n - i1, j + i2, (int)(i * 0.05F) + i3);
      this.qnK = new Rect(this.qnI);
      ((BitmapDrawable)localObject).setBounds(this.qnJ);
      this.qnH = ((BitmapDrawable)localObject);
      localObject = new TypeEvaluator()
      {
        private static int c(int paramAnonymousInt1, int paramAnonymousInt2, float paramAnonymousFloat)
        {
          GMTrace.i(15978486300672L, 119049);
          paramAnonymousInt1 = (int)(paramAnonymousInt1 + (paramAnonymousInt2 - paramAnonymousInt1) * paramAnonymousFloat);
          GMTrace.o(15978486300672L, 119049);
          return paramAnonymousInt1;
        }
      };
      localObject = ObjectAnimator.ofObject(this.qnH, "bounds", (TypeEvaluator)localObject, new Object[] { this.qnI });
      ((ObjectAnimator)localObject).addUpdateListener(new ValueAnimator.AnimatorUpdateListener()
      {
        public final void onAnimationUpdate(ValueAnimator paramAnonymousValueAnimator)
        {
          GMTrace.i(15973654462464L, 119013);
          DynamicGridView.this.invalidate();
          GMTrace.o(15973654462464L, 119013);
        }
      });
      ((ObjectAnimator)localObject).addListener(new AnimatorListenerAdapter()
      {
        public final void onAnimationEnd(Animator paramAnonymousAnimator)
        {
          GMTrace.i(15979828477952L, 119059);
          DynamicGridView.a(DynamicGridView.this, false);
          DynamicGridView.b(DynamicGridView.this);
          GMTrace.o(15979828477952L, 119059);
        }
        
        public final void onAnimationStart(Animator paramAnonymousAnimator)
        {
          GMTrace.i(15979694260224L, 119058);
          DynamicGridView.a(DynamicGridView.this, true);
          DynamicGridView.b(DynamicGridView.this);
          GMTrace.o(15979694260224L, 119058);
        }
      });
      ((ObjectAnimator)localObject).setDuration(10L);
      ((ObjectAnimator)localObject).start();
      if (bqk()) {
        localView.setVisibility(4);
      }
      eb(this.qnS);
      if (this.qoe != null) {
        this.qoe.vE(paramInt);
      }
      GMTrace.o(15984391880704L, 119093);
      return true;
    }
    GMTrace.o(15984391880704L, 119093);
    return false;
  }
  
  private long vI(int paramInt)
  {
    GMTrace.i(15985734057984L, 119103);
    long l = getAdapter().getItemId(paramInt);
    GMTrace.o(15985734057984L, 119103);
    return l;
  }
  
  protected void dispatchDraw(Canvas paramCanvas)
  {
    GMTrace.i(15986002493440L, 119105);
    super.dispatchDraw(paramCanvas);
    if (this.qnH != null) {
      this.qnH.draw(paramCanvas);
    }
    GMTrace.o(15986002493440L, 119105);
  }
  
  public final int ec(long paramLong)
  {
    GMTrace.i(15983720792064L, 119088);
    View localView = ed(paramLong);
    if (localView == null)
    {
      GMTrace.o(15983720792064L, 119088);
      return -1;
    }
    int i = getPositionForView(localView);
    GMTrace.o(15983720792064L, 119088);
    return i;
  }
  
  public final View ed(long paramLong)
  {
    GMTrace.i(15983855009792L, 119089);
    int j = getFirstVisiblePosition();
    ListAdapter localListAdapter = getAdapter();
    int i = 0;
    while (i < getChildCount())
    {
      View localView = getChildAt(i);
      if (localListAdapter.getItemId(j + i) == paramLong)
      {
        GMTrace.o(15983855009792L, 119089);
        return localView;
      }
      i += 1;
    }
    GMTrace.o(15983855009792L, 119089);
    return null;
  }
  
  @TargetApi(11)
  final void ih(boolean paramBoolean)
  {
    GMTrace.i(15982647050240L, 119080);
    Object localObject = this.qnX.iterator();
    while (((Iterator)localObject).hasNext()) {
      ((Animator)((Iterator)localObject).next()).cancel();
    }
    this.qnX.clear();
    int i = 0;
    while (i < getChildCount())
    {
      localObject = getChildAt(i);
      if (localObject != null)
      {
        if (paramBoolean) {
          ((View)localObject).setRotation(0.0F);
        }
        ((View)localObject).setTag(i.f.pax, Boolean.valueOf(false));
      }
      i += 1;
    }
    GMTrace.o(15982647050240L, 119080);
  }
  
  public boolean onInterceptTouchEvent(MotionEvent paramMotionEvent)
  {
    GMTrace.i(15983989227520L, 119090);
    boolean bool = super.onInterceptTouchEvent(paramMotionEvent);
    new StringBuilder("onInterceptTouchEvent ").append(paramMotionEvent.getAction()).append(" ").append(bool);
    GMTrace.o(15983989227520L, 119090);
    return bool;
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    GMTrace.i(15984123445248L, 119091);
    int i = paramMotionEvent.findPointerIndex(this.eA);
    new StringBuilder("onTouchEvent ").append(paramMotionEvent.getAction());
    switch (paramMotionEvent.getAction() & 0xFF)
    {
    }
    for (;;)
    {
      boolean bool = super.onTouchEvent(paramMotionEvent);
      GMTrace.o(15984123445248L, 119091);
      return bool;
      this.qon = paramMotionEvent.getX();
      this.qoo = paramMotionEvent.getY();
      this.qom = f.a(this, paramMotionEvent.getX(), paramMotionEvent.getY());
      new StringBuilder("onTouchEvent ").append(paramMotionEvent.getAction()).append(",downPos ").append(this.qom);
      Object localObject;
      if ((!this.qnY) && (this.qom >= 0))
      {
        localObject = this.qol;
        ((d)localObject).removeMessages(1);
        ((d)localObject).sendEmptyMessageDelayed(1, 300L);
      }
      this.qnP = -1;
      this.qnQ = -1;
      this.qnN = ((int)paramMotionEvent.getX());
      this.qnO = ((int)paramMotionEvent.getY());
      this.eA = paramMotionEvent.getPointerId(0);
      if ((this.kHI) && (isEnabled()))
      {
        layoutChildren();
        vH(pointToPosition(this.qnN, this.qnO));
      }
      else if (!isEnabled())
      {
        GMTrace.o(15984123445248L, 119091);
        return false;
        this.qon = paramMotionEvent.getX();
        this.qoo = paramMotionEvent.getY();
        if ((this.qnT) && (this.eA != -1)) {
          if ((this.qnQ == -1) && (this.qnP == -1))
          {
            this.qnP = ((int)paramMotionEvent.getY(i));
            this.qnQ = ((int)paramMotionEvent.getX(i));
            this.qnN = this.qnQ;
            this.qnO = this.qnP;
          }
          else
          {
            this.qop = paramMotionEvent.getRawX();
            this.qoq = paramMotionEvent.getRawY();
            this.qnP = ((int)paramMotionEvent.getY(i));
            this.qnQ = ((int)paramMotionEvent.getX(i));
            i = this.qnP;
            int j = this.qnO;
            int k = this.qnQ;
            int m = this.qnN;
            this.qnI.offsetTo(k - m + this.qnK.left + this.qnM, i - j + this.qnK.top + this.qnL);
            if (this.qnH != null) {
              this.qnH.setBounds(this.qnI);
            }
            invalidate();
            bqn();
            this.qnU = false;
            bqi();
            if (this.qoe != null)
            {
              paramMotionEvent = new Rect(this.qnI);
              paramMotionEvent.offset(0, this.qnI.height() >>> 1);
              this.qoe.k(paramMotionEvent);
            }
            GMTrace.o(15984123445248L, 119091);
            return false;
            bqj();
            if ((this.qoh) && (this.qoj != null))
            {
              localObject = this.qoj;
              Collections.reverse(((a)localObject).qoy);
              if (!((a)localObject).qoy.isEmpty())
              {
                this.qoi.push(this.qoj);
                this.qoj = new a();
                continue;
                bqm();
                bqj();
                continue;
                if (paramMotionEvent.getPointerId((paramMotionEvent.getAction() & 0xFF00) >> 8) == this.eA) {
                  bqj();
                }
              }
            }
          }
        }
      }
    }
  }
  
  public void setAdapter(ListAdapter paramListAdapter)
  {
    GMTrace.i(15984660316160L, 119095);
    super.setAdapter(paramListAdapter);
    GMTrace.o(15984660316160L, 119095);
  }
  
  public void setOnItemClickListener(AdapterView.OnItemClickListener paramOnItemClickListener)
  {
    GMTrace.i(15982378614784L, 119078);
    this.qof = paramOnItemClickListener;
    super.setOnItemClickListener(this.qog);
    GMTrace.o(15982378614784L, 119078);
  }
  
  public void setOnScrollListener(AbsListView.OnScrollListener paramOnScrollListener)
  {
    GMTrace.i(15982110179328L, 119076);
    this.qoc = paramOnScrollListener;
    GMTrace.o(15982110179328L, 119076);
  }
  
  public final void vG(int paramInt)
  {
    GMTrace.i(15982244397056L, 119077);
    if (!this.qob)
    {
      GMTrace.o(15982244397056L, 119077);
      return;
    }
    requestDisallowInterceptTouchEvent(true);
    if ((bqk()) && (this.qoa)) {
      bqg();
    }
    if (paramInt != -1)
    {
      this.kHI = vH(paramInt);
      if (this.kHI) {
        this.qnT = true;
      }
    }
    GMTrace.o(15982244397056L, 119077);
  }
  
  private static final class a
  {
    List<Pair<Integer, Integer>> qoy;
    
    a()
    {
      GMTrace.i(15973788680192L, 119014);
      this.qoy = new Stack();
      GMTrace.o(15973788680192L, 119014);
    }
    
    public final void dk(int paramInt1, int paramInt2)
    {
      GMTrace.i(15973922897920L, 119015);
      this.qoy.add(new Pair(Integer.valueOf(paramInt1), Integer.valueOf(paramInt2)));
      GMTrace.o(15973922897920L, 119015);
    }
  }
  
  private final class b
    implements DynamicGridView.h
  {
    public int Ai;
    public int Aj;
    
    static
    {
      GMTrace.i(15975936163840L, 119030);
      if (!DynamicGridView.class.desiredAssertionStatus()) {}
      for (boolean bool = true;; bool = false)
      {
        $assertionsDisabled = bool;
        GMTrace.o(15975936163840L, 119030);
        return;
      }
    }
    
    public b(int paramInt1, int paramInt2)
    {
      GMTrace.i(15975399292928L, 119026);
      this.Ai = paramInt1;
      this.Aj = paramInt2;
      GMTrace.o(15975399292928L, 119026);
    }
    
    public final void dl(int paramInt1, int paramInt2)
    {
      GMTrace.i(15975533510656L, 119027);
      assert (DynamicGridView.g(DynamicGridView.this) != null);
      DynamicGridView.this.getViewTreeObserver().addOnPreDrawListener(new a(DynamicGridView.g(DynamicGridView.this), paramInt1, paramInt2));
      DynamicGridView.b(DynamicGridView.this, DynamicGridView.this.ed(DynamicGridView.h(DynamicGridView.this)));
      GMTrace.o(15975533510656L, 119027);
    }
    
    private final class a
      implements ViewTreeObserver.OnPreDrawListener
    {
      private final int Uw;
      private final int qoA;
      private final View qoz;
      
      a(View paramView, int paramInt1, int paramInt2)
      {
        GMTrace.i(15967748882432L, 118969);
        this.qoz = paramView;
        this.qoA = paramInt1;
        this.Uw = paramInt2;
        GMTrace.o(15967748882432L, 118969);
      }
      
      public final boolean onPreDraw()
      {
        GMTrace.i(15967883100160L, 118970);
        DynamicGridView.this.getViewTreeObserver().removeOnPreDrawListener(this);
        DynamicGridView.a(DynamicGridView.this, DynamicGridView.e(DynamicGridView.this) + DynamicGridView.b.this.Aj);
        DynamicGridView.b(DynamicGridView.this, DynamicGridView.f(DynamicGridView.this) + DynamicGridView.b.this.Ai);
        DynamicGridView.a(DynamicGridView.this, this.qoA, this.Uw);
        this.qoz.setVisibility(0);
        if (DynamicGridView.g(DynamicGridView.this) != null) {
          DynamicGridView.g(DynamicGridView.this).setVisibility(4);
        }
        GMTrace.o(15967883100160L, 118970);
        return true;
      }
    }
  }
  
  private final class c
    implements DynamicGridView.h
  {
    public int Ai;
    public int Aj;
    
    public c(int paramInt1, int paramInt2)
    {
      GMTrace.i(15968688406528L, 118976);
      this.Ai = paramInt1;
      this.Aj = paramInt2;
      GMTrace.o(15968688406528L, 118976);
    }
    
    public final void dl(int paramInt1, int paramInt2)
    {
      GMTrace.i(15968822624256L, 118977);
      DynamicGridView.this.getViewTreeObserver().addOnPreDrawListener(new a(paramInt1, paramInt2));
      GMTrace.o(15968822624256L, 118977);
    }
    
    private final class a
      implements ViewTreeObserver.OnPreDrawListener
    {
      private final int Uw;
      private final int qoA;
      
      static
      {
        GMTrace.i(15979023171584L, 119053);
        if (!DynamicGridView.class.desiredAssertionStatus()) {}
        for (boolean bool = true;; bool = false)
        {
          $assertionsDisabled = bool;
          GMTrace.o(15979023171584L, 119053);
          return;
        }
      }
      
      a(int paramInt1, int paramInt2)
      {
        GMTrace.i(15978754736128L, 119051);
        this.qoA = paramInt1;
        this.Uw = paramInt2;
        GMTrace.o(15978754736128L, 119051);
      }
      
      public final boolean onPreDraw()
      {
        GMTrace.i(15978888953856L, 119052);
        DynamicGridView.this.getViewTreeObserver().removeOnPreDrawListener(this);
        DynamicGridView.a(DynamicGridView.this, DynamicGridView.e(DynamicGridView.this) + DynamicGridView.c.this.Aj);
        DynamicGridView.b(DynamicGridView.this, DynamicGridView.f(DynamicGridView.this) + DynamicGridView.c.this.Ai);
        DynamicGridView.a(DynamicGridView.this, this.qoA, this.Uw);
        new StringBuilder("id ").append(DynamicGridView.this.ec(DynamicGridView.h(DynamicGridView.this)));
        if (DynamicGridView.g(DynamicGridView.this) == null)
        {
          GMTrace.o(15978888953856L, 119052);
          return true;
        }
        if (DynamicGridView.g(DynamicGridView.this) == null)
        {
          GMTrace.o(15978888953856L, 119052);
          return true;
        }
        assert (DynamicGridView.g(DynamicGridView.this) != null);
        DynamicGridView.g(DynamicGridView.this).setVisibility(0);
        DynamicGridView.b(DynamicGridView.this, DynamicGridView.this.ed(DynamicGridView.h(DynamicGridView.this)));
        if (DynamicGridView.g(DynamicGridView.this) == null)
        {
          GMTrace.o(15978888953856L, 119052);
          return true;
        }
        assert (DynamicGridView.g(DynamicGridView.this) != null);
        DynamicGridView.g(DynamicGridView.this).setVisibility(4);
        GMTrace.o(15978888953856L, 119052);
        return true;
      }
    }
  }
  
  private final class d
    extends Handler
  {
    private d()
    {
      GMTrace.i(15980633784320L, 119065);
      GMTrace.o(15980633784320L, 119065);
    }
    
    public final void handleMessage(Message paramMessage)
    {
      GMTrace.i(15980768002048L, 119066);
      switch (paramMessage.what)
      {
      }
      for (;;)
      {
        GMTrace.o(15980768002048L, 119066);
        return;
        paramMessage = DynamicGridView.this;
        View localView = paramMessage.getChildAt(paramMessage.qom);
        new StringBuilder("downView ").append(localView).append(",downPos ").append(paramMessage.qom).append(",lastTouchX ").append(paramMessage.qon).append(",lastTouchY ").append(paramMessage.qoo);
        if ((!paramMessage.qnY) && (!paramMessage.qnZ) && (f.c(localView, paramMessage.qon, paramMessage.qoo))) {
          paramMessage.vG(paramMessage.qom);
        }
      }
    }
  }
  
  public static abstract interface e
  {
    public abstract void bqe();
    
    public abstract void k(Rect paramRect);
    
    public abstract boolean l(Rect paramRect);
    
    public abstract void vE(int paramInt);
    
    public abstract void vF(int paramInt);
  }
  
  public static abstract interface f
  {
    public abstract void bqf();
  }
  
  private final class g
    implements DynamicGridView.h
  {
    private int Ai;
    private int Aj;
    
    public g(int paramInt1, int paramInt2)
    {
      GMTrace.i(15972714938368L, 119006);
      this.Ai = paramInt1;
      this.Aj = paramInt2;
      GMTrace.o(15972714938368L, 119006);
    }
    
    public final void dl(int paramInt1, int paramInt2)
    {
      GMTrace.i(15972849156096L, 119007);
      DynamicGridView.a(DynamicGridView.this, DynamicGridView.e(DynamicGridView.this) + this.Aj);
      DynamicGridView.b(DynamicGridView.this, DynamicGridView.f(DynamicGridView.this) + this.Ai);
      GMTrace.o(15972849156096L, 119007);
    }
  }
  
  private static abstract interface h
  {
    public abstract void dl(int paramInt1, int paramInt2);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\sns\ui\previewimageview\DynamicGridView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */