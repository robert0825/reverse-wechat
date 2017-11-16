package com.tencent.mm.plugin.appbrand.widget.input.autofill;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
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
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.bx.a.a;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.ui.base.q;

public class AutoFillListPopupWindowBase
{
  public ListAdapter EP;
  int OW;
  int RN;
  int RO;
  int RP;
  boolean RR;
  boolean RS;
  boolean RT;
  int RU;
  public View RV;
  private int RW;
  View RX;
  private Drawable RY;
  private AdapterView.OnItemClickListener RZ;
  private AdapterView.OnItemSelectedListener Sa;
  private Runnable Sf;
  boolean Sg;
  private Rect dF;
  public q hwd;
  public a iOX;
  public final f iOY;
  private final e iOZ;
  private final d iPa;
  private final b iPb;
  private boolean iPc;
  private Context mContext;
  public ae mHandler;
  DataSetObserver mObserver;
  
  public AutoFillListPopupWindowBase(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, a.a.listPopupWindowStyle);
    GMTrace.i(18264482643968L, 136081);
    GMTrace.o(18264482643968L, 136081);
  }
  
  public AutoFillListPopupWindowBase(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    GMTrace.i(18264616861696L, 136082);
    this.RN = -2;
    this.OW = -2;
    this.RS = false;
    this.RT = false;
    this.RU = Integer.MAX_VALUE;
    this.RW = 0;
    this.iOY = new f();
    this.iOZ = new e();
    this.iPa = new d();
    this.iPb = new b();
    this.mHandler = new ae();
    this.dF = new Rect();
    this.iPc = false;
    this.mContext = paramContext;
    this.hwd = new q(paramContext);
    this.hwd.setInputMethodMode(1);
    paramContext = this.mContext.getResources().getConfiguration().locale;
    GMTrace.o(18264616861696L, 136082);
  }
  
  private void ads()
  {
    GMTrace.i(18265153732608L, 136086);
    if (this.RV != null)
    {
      ViewParent localViewParent = this.RV.getParent();
      if ((localViewParent instanceof ViewGroup)) {
        ((ViewGroup)localViewParent).removeView(this.RV);
      }
    }
    GMTrace.o(18265153732608L, 136086);
  }
  
  public final void clearListSelection()
  {
    GMTrace.i(18265287950336L, 136087);
    a locala = this.iOX;
    if (locala != null)
    {
      a.a(locala, true);
      locala.requestLayout();
    }
    GMTrace.o(18265287950336L, 136087);
  }
  
  public final void dismiss()
  {
    GMTrace.i(18265019514880L, 136085);
    this.hwd.dismiss();
    ads();
    this.hwd.setContentView(null);
    this.iOX = null;
    this.mHandler.removeCallbacks(this.iOY);
    GMTrace.o(18265019514880L, 136085);
  }
  
  public final boolean isInputMethodNotNeeded()
  {
    GMTrace.i(18265422168064L, 136088);
    if (this.hwd.getInputMethodMode() == 2)
    {
      GMTrace.o(18265422168064L, 136088);
      return true;
    }
    GMTrace.o(18265422168064L, 136088);
    return false;
  }
  
  public final void setVerticalOffset(int paramInt)
  {
    GMTrace.i(18264751079424L, 136083);
    this.RP = paramInt;
    this.RR = true;
    GMTrace.o(18264751079424L, 136083);
  }
  
  public void show()
  {
    boolean bool3 = true;
    boolean bool2 = true;
    int n = -1;
    GMTrace.i(18264885297152L, 136084);
    Object localObject2;
    boolean bool1;
    Object localObject1;
    View localView;
    FrameLayout.LayoutParams localLayoutParams1;
    FrameLayout.LayoutParams localLayoutParams2;
    if (this.iOX == null)
    {
      localObject2 = this.mContext;
      this.Sf = new Runnable()
      {
        public final void run()
        {
          GMTrace.i(18264348426240L, 136080);
          View localView = AutoFillListPopupWindowBase.this.RX;
          if ((localView != null) && (localView.getWindowToken() != null)) {
            AutoFillListPopupWindowBase.this.show();
          }
          GMTrace.o(18264348426240L, 136080);
        }
      };
      if (!this.Sg)
      {
        bool1 = true;
        this.iOX = new a((Context)localObject2, bool1);
        if (this.RY != null) {
          this.iOX.setSelector(this.RY);
        }
        this.iOX.setAdapter(this.EP);
        this.iOX.setOnItemClickListener(this.RZ);
        this.iOX.setFocusable(true);
        this.iOX.setFocusableInTouchMode(true);
        this.iOX.setDivider(null);
        this.iOX.setDividerHeight(0);
        this.iOX.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener()
        {
          public final void onItemSelected(AdapterView<?> paramAnonymousAdapterView, View paramAnonymousView, int paramAnonymousInt, long paramAnonymousLong)
          {
            GMTrace.i(18268240740352L, 136109);
            if (paramAnonymousInt != -1)
            {
              paramAnonymousAdapterView = AutoFillListPopupWindowBase.this.iOX;
              if (paramAnonymousAdapterView != null) {
                AutoFillListPopupWindowBase.a.a(paramAnonymousAdapterView, false);
              }
            }
            GMTrace.o(18268240740352L, 136109);
          }
          
          public final void onNothingSelected(AdapterView<?> paramAnonymousAdapterView)
          {
            GMTrace.i(18268374958080L, 136110);
            GMTrace.o(18268374958080L, 136110);
          }
        });
        this.iOX.setOnScrollListener(this.iPa);
        if (this.Sa != null) {
          this.iOX.setOnItemSelectedListener(this.Sa);
        }
        localObject1 = this.iOX;
        localView = this.RV;
        if (localView == null) {
          break label1357;
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
    label764:
    label918:
    label946:
    label951:
    label956:
    label987:
    label1004:
    label1010:
    label1052:
    label1072:
    label1105:
    label1246:
    label1284:
    label1290:
    label1346:
    label1352:
    label1357:
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
            break label764;
          }
          j = 1;
          localObject1 = this.RX;
          i1 = this.RP;
          localObject2 = new Rect();
          ((View)localObject1).getWindowVisibleDisplayFrame((Rect)localObject2);
          ((View)localObject1).getLocationOnScreen(new int[2]);
          m = ((Rect)localObject2).bottom;
          if (j == 0) {
            break label1346;
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
              break label1052;
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
            GMTrace.o(18264885297152L, 136084);
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
              break label1352;
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
              m = this.iOX.L(j, m - i);
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
          this.hwd.update(this.RX, this.RO, this.RP, this.hwd.getWidth(), this.hwd.getHeight());
          GMTrace.o(18264885297152L, 136084);
          return;
          if (this.OW == -1)
          {
            j = -1;
            if (this.RN != -1) {
              break label1246;
            }
            i = -1;
            this.hwd.setWindowLayoutMode(j, i);
            localObject1 = this.hwd;
            if ((this.RT) || (this.RS)) {
              break label1284;
            }
            bool1 = bool3;
            ((q)localObject1).setOutsideTouchable(bool1);
            this.hwd.setTouchInterceptor(this.iOZ);
            if (!this.iPc) {
              break label1290;
            }
            this.hwd.showAtLocation(this.RX, 17, 0, 0);
          }
          for (;;)
          {
            this.iOX.setSelection(-1);
            if ((!this.Sg) || (this.iOX.isInTouchMode())) {
              clearListSelection();
            }
            if (!this.Sg) {
              this.mHandler.post(this.iPb);
            }
            GMTrace.o(18264885297152L, 136084);
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
              break label1072;
            }
            this.hwd.setHeight(this.RN);
            i = 0;
            break label1072;
            bool1 = false;
            break label1105;
            if (Build.VERSION.SDK_INT >= 19) {
              this.hwd.showAsDropDown(this.RX, this.RO, this.RP, 53);
            } else {
              this.hwd.showAtLocation(this.RX, 53, this.RO, this.RP);
            }
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
      GMTrace.i(18258308628480L, 136035);
      this.Sj = paramBoolean;
      setCacheColorHint(0);
      GMTrace.o(18258308628480L, 136035);
    }
    
    final int L(int paramInt1, int paramInt2)
    {
      GMTrace.i(18258979717120L, 136040);
      int i = getListPaddingTop();
      int k = getListPaddingBottom();
      getListPaddingLeft();
      getListPaddingRight();
      int j = getDividerHeight();
      Object localObject = getDivider();
      ListAdapter localListAdapter = getAdapter();
      if (localListAdapter == null)
      {
        GMTrace.o(18258979717120L, 136040);
        return i + k;
      }
      i = k + i;
      label98:
      int n;
      if ((j > 0) && (localObject != null))
      {
        localObject = null;
        int m = 0;
        int i1 = localListAdapter.getCount();
        k = 0;
        if (k >= i1) {
          break label234;
        }
        n = localListAdapter.getItemViewType(k);
        if (n == m) {
          break label244;
        }
        localObject = null;
        m = n;
        label130:
        localObject = localListAdapter.getView(k, (View)localObject, this);
        n = ((View)localObject).getLayoutParams().height;
        if (n <= 0) {
          break label215;
        }
        n = View.MeasureSpec.makeMeasureSpec(n, 1073741824);
        label168:
        ((View)localObject).measure(paramInt1, n);
        if (k <= 0) {
          break label247;
        }
        i += j;
      }
      label215:
      label234:
      label244:
      label247:
      for (;;)
      {
        i = ((View)localObject).getMeasuredHeight() + i;
        if (i >= paramInt2)
        {
          GMTrace.o(18258979717120L, 136040);
          return paramInt2;
          j = 0;
          break;
          n = View.MeasureSpec.makeMeasureSpec(0, 0);
          break label168;
        }
        k += 1;
        break label98;
        GMTrace.o(18258979717120L, 136040);
        return i;
        break label130;
      }
    }
    
    public final boolean hasFocus()
    {
      GMTrace.i(18258845499392L, 136039);
      if ((this.Sj) || (super.hasFocus()))
      {
        GMTrace.o(18258845499392L, 136039);
        return true;
      }
      GMTrace.o(18258845499392L, 136039);
      return false;
    }
    
    public final boolean hasWindowFocus()
    {
      GMTrace.i(18258577063936L, 136037);
      if ((this.Sj) || (super.hasWindowFocus()))
      {
        GMTrace.o(18258577063936L, 136037);
        return true;
      }
      GMTrace.o(18258577063936L, 136037);
      return false;
    }
    
    public final boolean isFocused()
    {
      GMTrace.i(18258711281664L, 136038);
      if ((this.Sj) || (super.isFocused()))
      {
        GMTrace.o(18258711281664L, 136038);
        return true;
      }
      GMTrace.o(18258711281664L, 136038);
      return false;
    }
    
    public final boolean isInTouchMode()
    {
      GMTrace.i(18258442846208L, 136036);
      if (((this.Sj) && (this.Si)) || (super.isInTouchMode()))
      {
        GMTrace.o(18258442846208L, 136036);
        return true;
      }
      GMTrace.o(18258442846208L, 136036);
      return false;
    }
  }
  
  private final class b
    implements Runnable
  {
    public b()
    {
      GMTrace.i(18259919241216L, 136047);
      GMTrace.o(18259919241216L, 136047);
    }
    
    public final void run()
    {
      GMTrace.i(18260053458944L, 136048);
      AutoFillListPopupWindowBase.this.clearListSelection();
      GMTrace.o(18260053458944L, 136048);
    }
  }
  
  private final class c
    extends DataSetObserver
  {
    private c()
    {
      GMTrace.i(18266898563072L, 136099);
      GMTrace.o(18266898563072L, 136099);
    }
    
    public final void onChanged()
    {
      GMTrace.i(18267032780800L, 136100);
      if (AutoFillListPopupWindowBase.this.hwd.isShowing()) {
        AutoFillListPopupWindowBase.this.show();
      }
      GMTrace.o(18267032780800L, 136100);
    }
    
    public final void onInvalidated()
    {
      GMTrace.i(18267166998528L, 136101);
      AutoFillListPopupWindowBase.this.dismiss();
      GMTrace.o(18267166998528L, 136101);
    }
  }
  
  private final class d
    implements AbsListView.OnScrollListener
  {
    public d()
    {
      GMTrace.i(18259248152576L, 136042);
      GMTrace.o(18259248152576L, 136042);
    }
    
    public final void onScroll(AbsListView paramAbsListView, int paramInt1, int paramInt2, int paramInt3)
    {
      GMTrace.i(18259382370304L, 136043);
      if ((AutoFillListPopupWindowBase.this.iOX != null) && (AutoFillListPopupWindowBase.this.RV != null) && (AutoFillListPopupWindowBase.this.EP != null) && (AutoFillListPopupWindowBase.this.iOX != null))
      {
        if ((AutoFillListPopupWindowBase.this.iOX.getLastVisiblePosition() == AutoFillListPopupWindowBase.this.EP.getCount() - 1) && (AutoFillListPopupWindowBase.this.iOX.getChildAt(AutoFillListPopupWindowBase.this.iOX.getChildCount() - 1) != null) && (AutoFillListPopupWindowBase.this.iOX.getChildAt(AutoFillListPopupWindowBase.this.iOX.getChildCount() - 1).getBottom() <= AutoFillListPopupWindowBase.this.iOX.getHeight()))
        {
          AutoFillListPopupWindowBase.this.RV.setVisibility(8);
          GMTrace.o(18259382370304L, 136043);
          return;
        }
        AutoFillListPopupWindowBase.this.RV.setVisibility(0);
      }
      GMTrace.o(18259382370304L, 136043);
    }
    
    public final void onScrollStateChanged(AbsListView paramAbsListView, int paramInt)
    {
      GMTrace.i(18259516588032L, 136044);
      if ((paramInt == 1) && (!AutoFillListPopupWindowBase.this.isInputMethodNotNeeded()) && (AutoFillListPopupWindowBase.this.hwd.getContentView() != null))
      {
        AutoFillListPopupWindowBase.this.mHandler.removeCallbacks(AutoFillListPopupWindowBase.this.iOY);
        AutoFillListPopupWindowBase.this.iOY.run();
      }
      GMTrace.o(18259516588032L, 136044);
    }
  }
  
  private final class e
    implements View.OnTouchListener
  {
    public e()
    {
      GMTrace.i(18267569651712L, 136104);
      GMTrace.o(18267569651712L, 136104);
    }
    
    public final boolean onTouch(View paramView, MotionEvent paramMotionEvent)
    {
      GMTrace.i(18267703869440L, 136105);
      int i = paramMotionEvent.getAction();
      int j = (int)paramMotionEvent.getX();
      int k = (int)paramMotionEvent.getY();
      if ((i == 0) && (AutoFillListPopupWindowBase.this.hwd != null) && (AutoFillListPopupWindowBase.this.hwd.isShowing()) && (j >= 0) && (j < AutoFillListPopupWindowBase.this.hwd.getWidth()) && (k >= 0) && (k < AutoFillListPopupWindowBase.this.hwd.getHeight())) {
        AutoFillListPopupWindowBase.this.mHandler.postDelayed(AutoFillListPopupWindowBase.this.iOY, 250L);
      }
      for (;;)
      {
        GMTrace.o(18267703869440L, 136105);
        return false;
        if (i == 1) {
          AutoFillListPopupWindowBase.this.mHandler.removeCallbacks(AutoFillListPopupWindowBase.this.iOY);
        }
      }
    }
  }
  
  private final class f
    implements Runnable
  {
    public f()
    {
      GMTrace.i(18260456112128L, 136051);
      GMTrace.o(18260456112128L, 136051);
    }
    
    public final void run()
    {
      GMTrace.i(18260590329856L, 136052);
      if ((AutoFillListPopupWindowBase.this.iOX != null) && (AutoFillListPopupWindowBase.this.iOX.getCount() > AutoFillListPopupWindowBase.this.iOX.getChildCount()) && (AutoFillListPopupWindowBase.this.iOX.getChildCount() <= AutoFillListPopupWindowBase.this.RU))
      {
        AutoFillListPopupWindowBase.this.hwd.setInputMethodMode(2);
        AutoFillListPopupWindowBase.this.show();
      }
      GMTrace.o(18260590329856L, 136052);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\widget\input\autofill\AutoFillListPopupWindowBase.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */