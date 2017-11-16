package com.tencent.mm.ui.base;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewParent;
import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow.OnDismissListener;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.bx.a.a;
import com.tencent.mm.sdk.platformtools.ae;

public class MMListPopupWindow
{
  public ListAdapter EP;
  private int OW;
  public int RN;
  public int RO;
  private int RP;
  private boolean RR;
  private boolean RS;
  private boolean RT;
  int RU;
  public View RV;
  public int RW;
  public View RX;
  private Drawable RY;
  public AdapterView.OnItemClickListener RZ;
  private AdapterView.OnItemSelectedListener Sa;
  private Runnable Sf;
  private boolean Sg;
  private Rect dF;
  public q hwd;
  public boolean iPc;
  private Context mContext;
  public ae mHandler;
  private DataSetObserver mObserver;
  public a wdp;
  public final f wdq;
  private final e wdr;
  private final d wds;
  private final b wdt;
  
  public MMListPopupWindow(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, a.a.listPopupWindowStyle);
    GMTrace.i(3316654276608L, 24711);
    GMTrace.o(3316654276608L, 24711);
  }
  
  public MMListPopupWindow(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    GMTrace.i(3316788494336L, 24712);
    this.RN = -2;
    this.OW = -2;
    this.RS = false;
    this.RT = false;
    this.RU = Integer.MAX_VALUE;
    this.RW = 0;
    this.wdq = new f();
    this.wdr = new e();
    this.wds = new d();
    this.wdt = new b();
    this.mHandler = new ae();
    this.dF = new Rect();
    this.iPc = false;
    this.mContext = paramContext;
    this.hwd = new q(paramContext);
    this.hwd.setInputMethodMode(1);
    paramContext = this.mContext.getResources().getConfiguration().locale;
    GMTrace.o(3316788494336L, 24712);
  }
  
  public final void ads()
  {
    GMTrace.i(3318130671616L, 24722);
    if (this.RV != null)
    {
      ViewParent localViewParent = this.RV.getParent();
      if ((localViewParent instanceof ViewGroup)) {
        ((ViewGroup)localViewParent).removeView(this.RV);
      }
    }
    GMTrace.o(3318130671616L, 24722);
  }
  
  public final void bZX()
  {
    GMTrace.i(3317056929792L, 24714);
    this.Sg = true;
    this.hwd.setFocusable(true);
    GMTrace.o(3317056929792L, 24714);
  }
  
  public final void clearListSelection()
  {
    GMTrace.i(3318399107072L, 24724);
    a locala = this.wdp;
    if (locala != null)
    {
      a.a(locala, true);
      locala.requestLayout();
    }
    GMTrace.o(3318399107072L, 24724);
  }
  
  public final void dismiss()
  {
    GMTrace.i(3317862236160L, 24720);
    this.hwd.dismiss();
    ads();
    this.hwd.setContentView(null);
    this.wdp = null;
    this.mHandler.removeCallbacks(this.wdq);
    GMTrace.o(3317862236160L, 24720);
  }
  
  public final void fd()
  {
    GMTrace.i(3318264889344L, 24723);
    this.hwd.setInputMethodMode(2);
    GMTrace.o(3318264889344L, 24723);
  }
  
  public final boolean isInputMethodNotNeeded()
  {
    GMTrace.i(3318533324800L, 24725);
    if (this.hwd.getInputMethodMode() == 2)
    {
      GMTrace.o(3318533324800L, 24725);
      return true;
    }
    GMTrace.o(3318533324800L, 24725);
    return false;
  }
  
  public final void setAdapter(ListAdapter paramListAdapter)
  {
    GMTrace.i(3316922712064L, 24713);
    if (this.mObserver == null) {
      this.mObserver = new c((byte)0);
    }
    for (;;)
    {
      this.EP = paramListAdapter;
      if (this.EP != null) {
        paramListAdapter.registerDataSetObserver(this.mObserver);
      }
      if (this.wdp != null) {
        this.wdp.setAdapter(this.EP);
      }
      GMTrace.o(3316922712064L, 24713);
      return;
      if (this.EP != null) {
        this.EP.unregisterDataSetObserver(this.mObserver);
      }
    }
  }
  
  public final void setAnimationStyle(int paramInt)
  {
    GMTrace.i(3317325365248L, 24716);
    this.hwd.setAnimationStyle(paramInt);
    GMTrace.o(3317325365248L, 24716);
  }
  
  public final void setBackgroundDrawable(Drawable paramDrawable)
  {
    GMTrace.i(3317191147520L, 24715);
    this.hwd.setBackgroundDrawable(paramDrawable);
    GMTrace.o(3317191147520L, 24715);
  }
  
  public final void setContentWidth(int paramInt)
  {
    GMTrace.i(3317593800704L, 24718);
    Drawable localDrawable = this.hwd.getBackground();
    if (localDrawable != null)
    {
      localDrawable.getPadding(this.dF);
      this.OW = (this.dF.left + this.dF.right + paramInt);
      GMTrace.o(3317593800704L, 24718);
      return;
    }
    this.OW = paramInt;
    GMTrace.o(3317593800704L, 24718);
  }
  
  public final void setOnDismissListener(PopupWindow.OnDismissListener paramOnDismissListener)
  {
    GMTrace.i(3317996453888L, 24721);
    this.hwd.setOnDismissListener(paramOnDismissListener);
    GMTrace.o(3317996453888L, 24721);
  }
  
  public final void setVerticalOffset(int paramInt)
  {
    GMTrace.i(3317459582976L, 24717);
    this.RP = paramInt;
    this.RR = true;
    GMTrace.o(3317459582976L, 24717);
  }
  
  public final void show()
  {
    boolean bool3 = true;
    boolean bool2 = true;
    int n = -1;
    GMTrace.i(3317728018432L, 24719);
    Object localObject2;
    boolean bool1;
    Object localObject1;
    View localView;
    FrameLayout.LayoutParams localLayoutParams1;
    FrameLayout.LayoutParams localLayoutParams2;
    if (this.wdp == null)
    {
      localObject2 = this.mContext;
      this.Sf = new Runnable()
      {
        public final void run()
        {
          GMTrace.i(3335578976256L, 24852);
          View localView = MMListPopupWindow.this.RX;
          if ((localView != null) && (localView.getWindowToken() != null)) {
            MMListPopupWindow.this.show();
          }
          GMTrace.o(3335578976256L, 24852);
        }
      };
      if (!this.Sg)
      {
        bool1 = true;
        this.wdp = new a((Context)localObject2, bool1);
        if (this.RY != null) {
          this.wdp.setSelector(this.RY);
        }
        this.wdp.setAdapter(this.EP);
        this.wdp.setOnItemClickListener(this.RZ);
        this.wdp.setFocusable(true);
        this.wdp.setFocusableInTouchMode(true);
        this.wdp.setDivider(null);
        this.wdp.setDividerHeight(0);
        this.wdp.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener()
        {
          public final void onItemSelected(AdapterView<?> paramAnonymousAdapterView, View paramAnonymousView, int paramAnonymousInt, long paramAnonymousLong)
          {
            GMTrace.i(3191026483200L, 23775);
            if (paramAnonymousInt != -1)
            {
              paramAnonymousAdapterView = MMListPopupWindow.this.wdp;
              if (paramAnonymousAdapterView != null) {
                MMListPopupWindow.a.a(paramAnonymousAdapterView, false);
              }
            }
            GMTrace.o(3191026483200L, 23775);
          }
          
          public final void onNothingSelected(AdapterView<?> paramAnonymousAdapterView)
          {
            GMTrace.i(3191160700928L, 23776);
            GMTrace.o(3191160700928L, 23776);
          }
        });
        this.wdp.setOnScrollListener(this.wds);
        if (this.Sa != null) {
          this.wdp.setOnItemSelectedListener(this.Sa);
        }
        localObject1 = this.wdp;
        localView = this.RV;
        if (localView == null) {
          break label1315;
        }
        ads();
        localObject2 = new FrameLayout((Context)localObject2);
        localLayoutParams1 = new FrameLayout.LayoutParams(-1, -1);
        localLayoutParams2 = new FrameLayout.LayoutParams(-1, -2);
        switch (this.RW)
        {
        default: 
          new StringBuilder("Invalid hint position ").append(this.RW);
          label282:
          localView.measure(View.MeasureSpec.makeMeasureSpec(this.OW, Integer.MIN_VALUE), 0);
          localObject1 = localObject2;
        }
      }
    }
    label313:
    label376:
    label389:
    label549:
    label562:
    label584:
    label591:
    label765:
    label918:
    label946:
    label951:
    label956:
    label987:
    label1004:
    label1010:
    label1041:
    label1061:
    label1094:
    label1236:
    label1274:
    label1280:
    label1304:
    label1310:
    label1315:
    for (;;)
    {
      this.hwd.setContentView((View)localObject1);
      int i = 0;
      for (;;)
      {
        localObject1 = this.hwd.getBackground();
        int k;
        int i1;
        int m;
        if (localObject1 != null)
        {
          ((Drawable)localObject1).getPadding(this.dF);
          j = this.dF.top + this.dF.bottom;
          k = j;
          if (!this.RR)
          {
            this.RP = (-this.dF.top);
            k = j;
          }
          if (this.hwd.getInputMethodMode() != 2) {
            break label765;
          }
          j = 1;
          localObject1 = this.RX;
          i1 = this.RP;
          localObject2 = new Rect();
          ((View)localObject1).getWindowVisibleDisplayFrame((Rect)localObject2);
          ((View)localObject1).getLocationOnScreen(new int[2]);
          m = ((Rect)localObject2).bottom;
          if (j == 0) {
            break label1304;
          }
        }
        for (int j = ((View)localObject1).getContext().getResources().getDisplayMetrics().heightPixels;; j = m)
        {
          j -= i1;
          m = j;
          if (this.hwd.getBackground() != null)
          {
            this.hwd.getBackground().getPadding(this.dF);
            m = j - (this.dF.top + this.dF.bottom);
          }
          if ((this.RS) || (this.RN == -1))
          {
            i = m + k;
            bool1 = isInputMethodNotNeeded();
            if (!this.hwd.isShowing()) {
              break label1041;
            }
            if (this.OW != -1) {
              break label918;
            }
            j = -1;
            if (this.RN != -1) {
              break label987;
            }
            if (!bool1) {
              break label946;
            }
            if (!bool1) {
              break label956;
            }
            localObject1 = this.hwd;
            if (this.OW != -1) {
              break label951;
            }
            k = n;
            ((q)localObject1).setWindowLayoutMode(k, 0);
            this.hwd.update(j, i);
            localObject1 = this.hwd;
            if ((this.RT) || (this.RS)) {
              break label1004;
            }
          }
          for (bool1 = bool2;; bool1 = false)
          {
            ((q)localObject1).setOutsideTouchable(bool1);
            if (!this.iPc) {
              break label1010;
            }
            this.hwd.showAtLocation(this.RX, 17, 0, 0);
            GMTrace.o(3317728018432L, 24719);
            return;
            bool1 = false;
            break;
            localLayoutParams2.gravity = 80;
            ((FrameLayout)localObject2).addView((View)localObject1, localLayoutParams1);
            ((FrameLayout)localObject2).addView(localView, localLayoutParams2);
            break label282;
            localLayoutParams2.gravity = 48;
            ((FrameLayout)localObject2).addView((View)localObject1, localLayoutParams1);
            ((FrameLayout)localObject2).addView(localView, localLayoutParams2);
            break label282;
            this.hwd.getContentView();
            localObject1 = this.RV;
            if (localObject1 == null) {
              break label1310;
            }
            i = ((View)localObject1).getMeasuredHeight();
            break label313;
            this.dF.setEmpty();
            k = 0;
            break label376;
            j = 0;
            break label389;
            switch (this.OW)
            {
            default: 
              j = View.MeasureSpec.makeMeasureSpec(this.OW, 1073741824);
            }
            for (;;)
            {
              m = this.wdp.L(j, m - i);
              j = i;
              if (m > 0) {
                j = i + k;
              }
              i = j + m;
              break;
              j = View.MeasureSpec.makeMeasureSpec(this.mContext.getResources().getDisplayMetrics().widthPixels - (this.dF.left + this.dF.right), Integer.MIN_VALUE);
              continue;
              j = View.MeasureSpec.makeMeasureSpec(this.mContext.getResources().getDisplayMetrics().widthPixels - (this.dF.left + this.dF.right), 1073741824);
            }
            if (this.OW == -2)
            {
              j = this.RX.getWidth();
              break label549;
            }
            j = this.OW;
            break label549;
            i = -1;
            break label562;
            k = 0;
            break label584;
            localObject1 = this.hwd;
            if (this.OW == -1) {}
            for (k = -1;; k = 0)
            {
              ((q)localObject1).setWindowLayoutMode(k, -1);
              break;
            }
            if (this.RN == -2) {
              break label591;
            }
            i = this.RN;
            break label591;
          }
          this.hwd.showAtLocation(this.RX, 53, this.RO, this.RP);
          GMTrace.o(3317728018432L, 24719);
          return;
          if (this.OW == -1)
          {
            j = -1;
            if (this.RN != -1) {
              break label1236;
            }
            i = -1;
            this.hwd.setWindowLayoutMode(j, i);
            localObject1 = this.hwd;
            if ((this.RT) || (this.RS)) {
              break label1274;
            }
            bool1 = bool3;
            ((q)localObject1).setOutsideTouchable(bool1);
            this.hwd.setTouchInterceptor(this.wdr);
            if (!this.iPc) {
              break label1280;
            }
            this.hwd.showAtLocation(this.RX, 17, 0, 0);
          }
          for (;;)
          {
            this.wdp.setSelection(-1);
            if ((!this.Sg) || (this.wdp.isInTouchMode())) {
              clearListSelection();
            }
            if (!this.Sg) {
              this.mHandler.post(this.wdt);
            }
            GMTrace.o(3317728018432L, 24719);
            return;
            if (this.OW == -2)
            {
              this.hwd.setWidth(this.RX.getWidth());
              j = 0;
              break;
            }
            this.hwd.setWidth(this.OW);
            j = 0;
            break;
            if (this.RN == -2)
            {
              this.hwd.setHeight(i);
              i = 0;
              break label1061;
            }
            this.hwd.setHeight(this.RN);
            i = 0;
            break label1061;
            bool1 = false;
            break label1094;
            this.hwd.showAtLocation(this.RX, 53, this.RO, this.RP);
          }
        }
        i = 0;
      }
    }
  }
  
  private static final class a
    extends ListView
  {
    private boolean Si;
    private boolean Sj;
    
    public a(Context paramContext, boolean paramBoolean)
    {
      super(null, a.a.dropDownListViewStyle);
      GMTrace.i(3347927007232L, 24944);
      this.Sj = paramBoolean;
      setCacheColorHint(0);
      GMTrace.o(3347927007232L, 24944);
    }
    
    final int L(int paramInt1, int paramInt2)
    {
      GMTrace.i(3348598095872L, 24949);
      int i = getListPaddingTop();
      int k = getListPaddingBottom();
      getListPaddingLeft();
      getListPaddingRight();
      int j = getDividerHeight();
      Object localObject = getDivider();
      ListAdapter localListAdapter = getAdapter();
      if (localListAdapter == null)
      {
        GMTrace.o(3348598095872L, 24949);
        return i + k;
      }
      i = k + i;
      label100:
      int n;
      if ((j > 0) && (localObject != null))
      {
        localObject = null;
        int m = 0;
        int i1 = localListAdapter.getCount();
        k = 0;
        if (k >= i1) {
          break label237;
        }
        n = localListAdapter.getItemViewType(k);
        if (n == m) {
          break label248;
        }
        localObject = null;
        m = n;
        label132:
        localObject = localListAdapter.getView(k, (View)localObject, this);
        n = ((View)localObject).getLayoutParams().height;
        if (n <= 0) {
          break label218;
        }
        n = View.MeasureSpec.makeMeasureSpec(n, 1073741824);
        label170:
        ((View)localObject).measure(paramInt1, n);
        if (k <= 0) {
          break label251;
        }
        i += j;
      }
      label218:
      label237:
      label248:
      label251:
      for (;;)
      {
        i = ((View)localObject).getMeasuredHeight() + i;
        if (i >= paramInt2)
        {
          GMTrace.o(3348598095872L, 24949);
          return paramInt2;
          j = 0;
          break;
          n = View.MeasureSpec.makeMeasureSpec(0, 0);
          break label170;
        }
        k += 1;
        break label100;
        GMTrace.o(3348598095872L, 24949);
        return i;
        break label132;
      }
    }
    
    public final boolean hasFocus()
    {
      GMTrace.i(3348463878144L, 24948);
      if ((this.Sj) || (super.hasFocus()))
      {
        GMTrace.o(3348463878144L, 24948);
        return true;
      }
      GMTrace.o(3348463878144L, 24948);
      return false;
    }
    
    public final boolean hasWindowFocus()
    {
      GMTrace.i(3348195442688L, 24946);
      if ((this.Sj) || (super.hasWindowFocus()))
      {
        GMTrace.o(3348195442688L, 24946);
        return true;
      }
      GMTrace.o(3348195442688L, 24946);
      return false;
    }
    
    public final boolean isFocused()
    {
      GMTrace.i(3348329660416L, 24947);
      if ((this.Sj) || (super.isFocused()))
      {
        GMTrace.o(3348329660416L, 24947);
        return true;
      }
      GMTrace.o(3348329660416L, 24947);
      return false;
    }
    
    public final boolean isInTouchMode()
    {
      GMTrace.i(3348061224960L, 24945);
      if (((this.Sj) && (this.Si)) || (super.isInTouchMode()))
      {
        GMTrace.o(3348061224960L, 24945);
        return true;
      }
      GMTrace.o(3348061224960L, 24945);
      return false;
    }
  }
  
  private final class b
    implements Runnable
  {
    public b()
    {
      GMTrace.i(3188207910912L, 23754);
      GMTrace.o(3188207910912L, 23754);
    }
    
    public final void run()
    {
      GMTrace.i(3188342128640L, 23755);
      MMListPopupWindow.this.clearListSelection();
      GMTrace.o(3188342128640L, 23755);
    }
  }
  
  private final class c
    extends DataSetObserver
  {
    private c()
    {
      GMTrace.i(3266456846336L, 24337);
      GMTrace.o(3266456846336L, 24337);
    }
    
    public final void onChanged()
    {
      GMTrace.i(3266591064064L, 24338);
      if (MMListPopupWindow.this.hwd.isShowing()) {
        MMListPopupWindow.this.show();
      }
      GMTrace.o(3266591064064L, 24338);
    }
    
    public final void onInvalidated()
    {
      GMTrace.i(3266725281792L, 24339);
      MMListPopupWindow.this.dismiss();
      GMTrace.o(3266725281792L, 24339);
    }
  }
  
  private final class d
    implements AbsListView.OnScrollListener
  {
    public d()
    {
      GMTrace.i(3185791991808L, 23736);
      GMTrace.o(3185791991808L, 23736);
    }
    
    public final void onScroll(AbsListView paramAbsListView, int paramInt1, int paramInt2, int paramInt3)
    {
      GMTrace.i(3185926209536L, 23737);
      if ((MMListPopupWindow.this.wdp != null) && (MMListPopupWindow.this.RV != null) && (MMListPopupWindow.this.EP != null) && (MMListPopupWindow.this.wdp != null))
      {
        if ((MMListPopupWindow.this.wdp.getLastVisiblePosition() == MMListPopupWindow.this.EP.getCount() - 1) && (MMListPopupWindow.this.wdp.getChildAt(MMListPopupWindow.this.wdp.getChildCount() - 1) != null) && (MMListPopupWindow.this.wdp.getChildAt(MMListPopupWindow.this.wdp.getChildCount() - 1).getBottom() <= MMListPopupWindow.this.wdp.getHeight()))
        {
          MMListPopupWindow.this.RV.setVisibility(8);
          GMTrace.o(3185926209536L, 23737);
          return;
        }
        MMListPopupWindow.this.RV.setVisibility(0);
      }
      GMTrace.o(3185926209536L, 23737);
    }
    
    public final void onScrollStateChanged(AbsListView paramAbsListView, int paramInt)
    {
      GMTrace.i(3186060427264L, 23738);
      if ((paramInt == 1) && (!MMListPopupWindow.this.isInputMethodNotNeeded()) && (MMListPopupWindow.this.hwd.getContentView() != null))
      {
        MMListPopupWindow.this.mHandler.removeCallbacks(MMListPopupWindow.this.wdq);
        MMListPopupWindow.this.wdq.run();
      }
      GMTrace.o(3186060427264L, 23738);
    }
  }
  
  private final class e
    implements View.OnTouchListener
  {
    public e()
    {
      GMTrace.i(3268335894528L, 24351);
      GMTrace.o(3268335894528L, 24351);
    }
    
    public final boolean onTouch(View paramView, MotionEvent paramMotionEvent)
    {
      GMTrace.i(3268470112256L, 24352);
      int i = paramMotionEvent.getAction();
      int j = (int)paramMotionEvent.getX();
      int k = (int)paramMotionEvent.getY();
      if ((i == 0) && (MMListPopupWindow.this.hwd != null) && (MMListPopupWindow.this.hwd.isShowing()) && (j >= 0) && (j < MMListPopupWindow.this.hwd.getWidth()) && (k >= 0) && (k < MMListPopupWindow.this.hwd.getHeight())) {
        MMListPopupWindow.this.mHandler.postDelayed(MMListPopupWindow.this.wdq, 250L);
      }
      for (;;)
      {
        GMTrace.o(3268470112256L, 24352);
        return false;
        if (i == 1) {
          MMListPopupWindow.this.mHandler.removeCallbacks(MMListPopupWindow.this.wdq);
        }
      }
    }
  }
  
  private final class f
    implements Runnable
  {
    public f()
    {
      GMTrace.i(3172772872192L, 23639);
      GMTrace.o(3172772872192L, 23639);
    }
    
    public final void run()
    {
      GMTrace.i(3172907089920L, 23640);
      if ((MMListPopupWindow.this.wdp != null) && (MMListPopupWindow.this.wdp.getCount() > MMListPopupWindow.this.wdp.getChildCount()) && (MMListPopupWindow.this.wdp.getChildCount() <= MMListPopupWindow.this.RU))
      {
        MMListPopupWindow.this.hwd.setInputMethodMode(2);
        MMListPopupWindow.this.show();
      }
      GMTrace.o(3172907089920L, 23640);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\base\MMListPopupWindow.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */