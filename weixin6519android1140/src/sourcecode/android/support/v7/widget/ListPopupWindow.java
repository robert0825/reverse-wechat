package android.support.v7.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.SystemClock;
import android.support.v4.b.a.a;
import android.support.v4.d.f;
import android.support.v4.view.ai;
import android.support.v4.view.o;
import android.support.v4.view.z;
import android.support.v4.widget.k;
import android.support.v4.widget.m;
import android.support.v7.a.a.a;
import android.support.v7.a.a.k;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnTouchListener;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import android.widget.PopupWindow.OnDismissListener;
import java.lang.reflect.Method;

public class ListPopupWindow
{
  private static Method RJ;
  private static Method RK;
  private ListAdapter EP;
  public int Li = 0;
  public int OW = -2;
  private int QM;
  public PopupWindow RL;
  public a RM;
  public int RN = -2;
  int RO;
  int RP;
  private int RQ = 1002;
  boolean RR;
  private boolean RS = false;
  private boolean RT = false;
  int RU = Integer.MAX_VALUE;
  private View RV;
  int RW = 0;
  public View RX;
  private Drawable RY;
  public AdapterView.OnItemClickListener RZ;
  private AdapterView.OnItemSelectedListener Sa;
  public final g Sb = new g();
  private final f Sc = new f();
  private final e Sd = new e();
  private final c Se = new c();
  private Runnable Sf;
  private boolean Sg;
  private Rect dF = new Rect();
  private Context mContext;
  public final Handler mHandler;
  private DataSetObserver mObserver;
  
  static
  {
    try
    {
      RJ = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", new Class[] { Boolean.TYPE });
      try
      {
        RK = PopupWindow.class.getDeclaredMethod("getMaxAvailableHeight", new Class[] { View.class, Integer.TYPE, Boolean.TYPE });
        return;
      }
      catch (NoSuchMethodException localNoSuchMethodException1) {}
    }
    catch (NoSuchMethodException localNoSuchMethodException2)
    {
      for (;;) {}
    }
  }
  
  public ListPopupWindow(Context paramContext)
  {
    this(paramContext, null, a.a.listPopupWindowStyle);
  }
  
  public ListPopupWindow(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, a.a.listPopupWindowStyle);
  }
  
  public ListPopupWindow(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    this(paramContext, paramAttributeSet, paramInt, 0);
  }
  
  public ListPopupWindow(Context paramContext, AttributeSet paramAttributeSet, int paramInt1, int paramInt2)
  {
    this.mContext = paramContext;
    this.mHandler = new Handler(paramContext.getMainLooper());
    TypedArray localTypedArray = paramContext.obtainStyledAttributes(paramAttributeSet, a.k.ListPopupWindow, paramInt1, paramInt2);
    this.RO = localTypedArray.getDimensionPixelOffset(a.k.ListPopupWindow_android_dropDownHorizontalOffset, 0);
    this.RP = localTypedArray.getDimensionPixelOffset(a.k.ListPopupWindow_android_dropDownVerticalOffset, 0);
    if (this.RP != 0) {
      this.RR = true;
    }
    localTypedArray.recycle();
    this.RL = new AppCompatPopupWindow(paramContext, paramAttributeSet, paramInt1);
    this.RL.setInputMethodMode(1);
    this.QM = f.getLayoutDirectionFromLocale(this.mContext.getResources().getConfiguration().locale);
  }
  
  private int b(View paramView, int paramInt, boolean paramBoolean)
  {
    if (RK != null) {
      try
      {
        int i = ((Integer)RK.invoke(this.RL, new Object[] { paramView, Integer.valueOf(paramInt), Boolean.valueOf(paramBoolean) })).intValue();
        return i;
      }
      catch (Exception localException) {}
    }
    return this.RL.getMaxAvailableHeight(paramView, paramInt);
  }
  
  public final void clearListSelection()
  {
    a locala = this.RM;
    if (locala != null)
    {
      a.a(locala, true);
      locala.requestLayout();
    }
  }
  
  public final void dismiss()
  {
    this.RL.dismiss();
    if (this.RV != null)
    {
      ViewParent localViewParent = this.RV.getParent();
      if ((localViewParent instanceof ViewGroup)) {
        ((ViewGroup)localViewParent).removeView(this.RV);
      }
    }
    this.RL.setContentView(null);
    this.RM = null;
    this.mHandler.removeCallbacks(this.Sb);
  }
  
  public final void fd()
  {
    this.RL.setInputMethodMode(2);
  }
  
  public final boolean isInputMethodNotNeeded()
  {
    return this.RL.getInputMethodMode() == 2;
  }
  
  public void setAdapter(ListAdapter paramListAdapter)
  {
    if (this.mObserver == null) {
      this.mObserver = new d((byte)0);
    }
    for (;;)
    {
      this.EP = paramListAdapter;
      if (this.EP != null) {
        paramListAdapter.registerDataSetObserver(this.mObserver);
      }
      if (this.RM != null) {
        this.RM.setAdapter(this.EP);
      }
      return;
      if (this.EP != null) {
        this.EP.unregisterDataSetObserver(this.mObserver);
      }
    }
  }
  
  public final void setBackgroundDrawable(Drawable paramDrawable)
  {
    this.RL.setBackgroundDrawable(paramDrawable);
  }
  
  public final void setContentWidth(int paramInt)
  {
    Drawable localDrawable = this.RL.getBackground();
    if (localDrawable != null)
    {
      localDrawable.getPadding(this.dF);
      this.OW = (this.dF.left + this.dF.right + paramInt);
      return;
    }
    this.OW = paramInt;
  }
  
  public final void setModal(boolean paramBoolean)
  {
    this.Sg = paramBoolean;
    this.RL.setFocusable(paramBoolean);
  }
  
  public final void setOnDismissListener(PopupWindow.OnDismissListener paramOnDismissListener)
  {
    this.RL.setOnDismissListener(paramOnDismissListener);
  }
  
  public final void setVerticalOffset(int paramInt)
  {
    this.RP = paramInt;
    this.RR = true;
  }
  
  public void show()
  {
    boolean bool3 = true;
    boolean bool2 = true;
    Object localObject2;
    boolean bool1;
    Object localObject1;
    View localView;
    LinearLayout.LayoutParams localLayoutParams;
    label246:
    int i;
    int j;
    if (this.RM == null)
    {
      localObject2 = this.mContext;
      this.Sf = new Runnable()
      {
        public final void run()
        {
          View localView = ListPopupWindow.this.RX;
          if ((localView != null) && (localView.getWindowToken() != null)) {
            ListPopupWindow.this.show();
          }
        }
      };
      if (!this.Sg)
      {
        bool1 = true;
        this.RM = new a((Context)localObject2, bool1);
        if (this.RY != null) {
          this.RM.setSelector(this.RY);
        }
        this.RM.setAdapter(this.EP);
        this.RM.setOnItemClickListener(this.RZ);
        this.RM.setFocusable(true);
        this.RM.setFocusableInTouchMode(true);
        this.RM.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener()
        {
          public final void onItemSelected(AdapterView<?> paramAnonymousAdapterView, View paramAnonymousView, int paramAnonymousInt, long paramAnonymousLong)
          {
            if (paramAnonymousInt != -1)
            {
              paramAnonymousAdapterView = ListPopupWindow.this.RM;
              if (paramAnonymousAdapterView != null) {
                ListPopupWindow.a.a(paramAnonymousAdapterView, false);
              }
            }
          }
          
          public final void onNothingSelected(AdapterView<?> paramAnonymousAdapterView) {}
        });
        this.RM.setOnScrollListener(this.Sd);
        if (this.Sa != null) {
          this.RM.setOnItemSelectedListener(this.Sa);
        }
        localObject1 = this.RM;
        localView = this.RV;
        if (localView == null) {
          break label1211;
        }
        localObject2 = new LinearLayout((Context)localObject2);
        ((LinearLayout)localObject2).setOrientation(1);
        localLayoutParams = new LinearLayout.LayoutParams(-1, 0, 1.0F);
        switch (this.RW)
        {
        default: 
          new StringBuilder("Invalid hint position ").append(this.RW);
          if (this.OW >= 0)
          {
            i = this.OW;
            j = Integer.MIN_VALUE;
            label262:
            localView.measure(View.MeasureSpec.makeMeasureSpec(i, j), 0);
            localObject1 = (LinearLayout.LayoutParams)localView.getLayoutParams();
            i = localView.getMeasuredHeight();
            j = ((LinearLayout.LayoutParams)localObject1).topMargin;
            i = ((LinearLayout.LayoutParams)localObject1).bottomMargin + (i + j);
            localObject1 = localObject2;
          }
          break;
        }
      }
    }
    for (;;)
    {
      this.RL.setContentView((View)localObject1);
      for (;;)
      {
        label318:
        localObject1 = this.RL.getBackground();
        int k;
        label381:
        label395:
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
          if (this.RL.getInputMethodMode() != 2) {
            break label714;
          }
          bool1 = true;
          m = b(this.RX, this.RP, bool1);
          if ((!this.RS) && (this.RN != -1)) {
            break label720;
          }
          i = k + m;
          bool1 = isInputMethodNotNeeded();
          m.a(this.RL, this.RQ);
          if (!this.RL.isShowing()) {
            break label972;
          }
          if (this.OW != -1) {
            break label870;
          }
          j = -1;
          label468:
          if (this.RN != -1) {
            break label946;
          }
          if (!bool1) {
            break label898;
          }
          label481:
          if (!bool1) {
            break label908;
          }
          localObject1 = this.RL;
          if (this.OW != -1) {
            break label903;
          }
          k = -1;
          label502:
          ((PopupWindow)localObject1).setWidth(k);
          this.RL.setHeight(0);
          label516:
          localObject1 = this.RL;
          if ((this.RT) || (this.RS)) {
            break label966;
          }
          bool1 = bool2;
          label540:
          ((PopupWindow)localObject1).setOutsideTouchable(bool1);
          localObject1 = this.RL;
          localObject2 = this.RX;
          m = this.RO;
          int n = this.RP;
          k = j;
          if (j < 0) {
            k = -1;
          }
          j = i;
          if (i < 0) {
            j = -1;
          }
          ((PopupWindow)localObject1).update((View)localObject2, m, n, k, j);
        }
        for (;;)
        {
          return;
          bool1 = false;
          break;
          ((LinearLayout)localObject2).addView((View)localObject1, localLayoutParams);
          ((LinearLayout)localObject2).addView(localView);
          break label246;
          ((LinearLayout)localObject2).addView(localView);
          ((LinearLayout)localObject2).addView((View)localObject1, localLayoutParams);
          break label246;
          i = 0;
          j = 0;
          break label262;
          this.RL.getContentView();
          localObject1 = this.RV;
          if (localObject1 != null)
          {
            localObject2 = (LinearLayout.LayoutParams)((View)localObject1).getLayoutParams();
            i = ((View)localObject1).getMeasuredHeight() + ((LinearLayout.LayoutParams)localObject2).topMargin + ((LinearLayout.LayoutParams)localObject2).bottomMargin;
            break label318;
            this.dF.setEmpty();
            k = 0;
            break label381;
            label714:
            bool1 = false;
            break label395;
            label720:
            switch (this.OW)
            {
            default: 
              j = View.MeasureSpec.makeMeasureSpec(this.OW, 1073741824);
            }
            for (;;)
            {
              m = this.RM.L(j, m - i);
              j = i;
              if (m > 0) {
                j = i + k;
              }
              i = m + j;
              break;
              j = View.MeasureSpec.makeMeasureSpec(this.mContext.getResources().getDisplayMetrics().widthPixels - (this.dF.left + this.dF.right), Integer.MIN_VALUE);
              continue;
              j = View.MeasureSpec.makeMeasureSpec(this.mContext.getResources().getDisplayMetrics().widthPixels - (this.dF.left + this.dF.right), 1073741824);
            }
            label870:
            if (this.OW == -2)
            {
              j = this.RX.getWidth();
              break label468;
            }
            j = this.OW;
            break label468;
            label898:
            i = -1;
            break label481;
            label903:
            k = 0;
            break label502;
            label908:
            localObject1 = this.RL;
            if (this.OW == -1) {}
            for (k = -1;; k = 0)
            {
              ((PopupWindow)localObject1).setWidth(k);
              this.RL.setHeight(-1);
              break;
            }
            label946:
            if (this.RN == -2) {
              break label516;
            }
            i = this.RN;
            break label516;
            label966:
            bool1 = false;
            break label540;
            label972:
            if (this.OW == -1)
            {
              j = -1;
              label982:
              if (this.RN != -1) {
                break label1178;
              }
              i = -1;
              label992:
              this.RL.setWidth(j);
              this.RL.setHeight(i);
              if (RJ == null) {}
            }
            try
            {
              RJ.invoke(this.RL, new Object[] { Boolean.valueOf(true) });
              localObject1 = this.RL;
              if ((!this.RT) && (!this.RS)) {}
              for (bool1 = bool3;; bool1 = false)
              {
                ((PopupWindow)localObject1).setOutsideTouchable(bool1);
                this.RL.setTouchInterceptor(this.Sc);
                m.a(this.RL, this.RX, this.RO, this.RP, this.Li);
                this.RM.setSelection(-1);
                if ((!this.Sg) || (this.RM.isInTouchMode())) {
                  clearListSelection();
                }
                if (this.Sg) {
                  break;
                }
                this.mHandler.post(this.Se);
                return;
                if (this.OW == -2)
                {
                  j = this.RX.getWidth();
                  break label982;
                }
                j = this.OW;
                break label982;
                label1178:
                if (this.RN == -2) {
                  break label992;
                }
                i = this.RN;
                break label992;
              }
            }
            catch (Exception localException)
            {
              for (;;) {}
            }
          }
        }
        i = 0;
      }
      label1211:
      i = 0;
    }
  }
  
  private static final class a
    extends ListViewCompat
  {
    private boolean Si;
    private boolean Sj;
    private boolean Sk;
    private ai Sl;
    private k Sm;
    
    public a(Context paramContext, boolean paramBoolean)
    {
      super(null, a.a.dropDownListViewStyle);
      this.Sj = paramBoolean;
      setCacheColorHint(0);
    }
    
    protected final boolean fe()
    {
      return (this.Sk) || (super.fe());
    }
    
    public final boolean h(MotionEvent paramMotionEvent, int paramInt)
    {
      int i = o.d(paramMotionEvent);
      label41:
      View localView;
      switch (i)
      {
      default: 
        paramInt = 0;
      case 3: 
        for (bool = true;; bool = false)
        {
          if ((!bool) || (paramInt != 0))
          {
            this.Sk = false;
            setPressed(false);
            drawableStateChanged();
            localView = getChildAt(this.SD - getFirstVisiblePosition());
            if (localView != null) {
              localView.setPressed(false);
            }
            if (this.Sl != null)
            {
              this.Sl.cancel();
              this.Sl = null;
            }
          }
          if (!bool) {
            break;
          }
          if (this.Sm == null) {
            this.Sm = new k(this);
          }
          this.Sm.s(true);
          this.Sm.onTouch(this, paramMotionEvent);
          label152:
          return bool;
          paramInt = 0;
        }
      }
      for (boolean bool = false;; bool = true)
      {
        int j = paramMotionEvent.findPointerIndex(paramInt);
        if (j < 0)
        {
          paramInt = 0;
          bool = false;
          break label41;
        }
        paramInt = (int)paramMotionEvent.getX(j);
        int k = (int)paramMotionEvent.getY(j);
        j = pointToPosition(paramInt, k);
        if (j == -1)
        {
          paramInt = 1;
          break label41;
        }
        localView = getChildAt(j - getFirstVisiblePosition());
        float f1 = paramInt;
        float f2 = k;
        this.Sk = true;
        if (Build.VERSION.SDK_INT >= 21) {
          drawableHotspotChanged(f1, f2);
        }
        if (!isPressed()) {
          setPressed(true);
        }
        layoutChildren();
        if (this.SD != -1)
        {
          localObject = getChildAt(this.SD - getFirstVisiblePosition());
          if ((localObject != null) && (localObject != localView) && (((View)localObject).isPressed())) {
            ((View)localObject).setPressed(false);
          }
        }
        this.SD = j;
        float f3 = localView.getLeft();
        float f4 = localView.getTop();
        if (Build.VERSION.SDK_INT >= 21) {
          localView.drawableHotspotChanged(f1 - f3, f2 - f4);
        }
        if (!localView.isPressed()) {
          localView.setPressed(true);
        }
        Object localObject = getSelector();
        if ((localObject != null) && (j != -1))
        {
          paramInt = 1;
          label406:
          if (paramInt != 0) {
            ((Drawable)localObject).setVisible(false, false);
          }
          super.a(j, localView);
          if (paramInt != 0)
          {
            Rect localRect = this.Sy;
            f3 = localRect.exactCenterX();
            f4 = localRect.exactCenterY();
            if (getVisibility() != 0) {
              break label541;
            }
          }
        }
        label541:
        for (bool = true;; bool = false)
        {
          ((Drawable)localObject).setVisible(bool, false);
          a.a((Drawable)localObject, f3, f4);
          localObject = getSelector();
          if ((localObject != null) && (j != -1)) {
            a.a((Drawable)localObject, f1, f2);
          }
          Q(false);
          refreshDrawableState();
          if (i != 1) {
            break;
          }
          performItemClick(localView, j, getItemIdAtPosition(j));
          break;
          paramInt = 0;
          break label406;
        }
        if (this.Sm == null) {
          break label152;
        }
        this.Sm.s(false);
        return bool;
      }
    }
    
    public final boolean hasFocus()
    {
      return (this.Sj) || (super.hasFocus());
    }
    
    public final boolean hasWindowFocus()
    {
      return (this.Sj) || (super.hasWindowFocus());
    }
    
    public final boolean isFocused()
    {
      return (this.Sj) || (super.isFocused());
    }
    
    public final boolean isInTouchMode()
    {
      return ((this.Sj) && (this.Si)) || (super.isInTouchMode());
    }
  }
  
  public static abstract class b
    implements View.OnTouchListener
  {
    private final float Sn;
    private final int So;
    private final int Sp;
    public final View Sq;
    private Runnable Sr;
    private Runnable Ss;
    boolean St;
    boolean Su;
    private final int[] Sv = new int[2];
    private int eA;
    
    public b(View paramView)
    {
      this.Sq = paramView;
      this.Sn = ViewConfiguration.get(paramView.getContext()).getScaledTouchSlop();
      this.So = ViewConfiguration.getTapTimeout();
      this.Sp = ((this.So + ViewConfiguration.getLongPressTimeout()) / 2);
    }
    
    private boolean l(MotionEvent paramMotionEvent)
    {
      boolean bool1 = true;
      Object localObject1 = this.Sq;
      Object localObject2 = dn();
      if ((localObject2 == null) || (!((ListPopupWindow)localObject2).RL.isShowing())) {
        bool1 = false;
      }
      for (;;)
      {
        return bool1;
        localObject2 = ((ListPopupWindow)localObject2).RM;
        if ((localObject2 == null) || (!((ListPopupWindow.a)localObject2).isShown())) {
          return false;
        }
        MotionEvent localMotionEvent = MotionEvent.obtainNoHistory(paramMotionEvent);
        int[] arrayOfInt = this.Sv;
        ((View)localObject1).getLocationOnScreen(arrayOfInt);
        localMotionEvent.offsetLocation(arrayOfInt[0], arrayOfInt[1]);
        localObject1 = this.Sv;
        ((View)localObject2).getLocationOnScreen((int[])localObject1);
        localMotionEvent.offsetLocation(-localObject1[0], -localObject1[1]);
        boolean bool2 = ((ListPopupWindow.a)localObject2).h(localMotionEvent, this.eA);
        localMotionEvent.recycle();
        int i = o.d(paramMotionEvent);
        if ((i != 1) && (i != 3)) {}
        for (i = 1; (!bool2) || (i == 0); i = 0) {
          return false;
        }
      }
    }
    
    protected boolean dZ()
    {
      ListPopupWindow localListPopupWindow = dn();
      if ((localListPopupWindow != null) && (localListPopupWindow.RL.isShowing())) {
        localListPopupWindow.dismiss();
      }
      return true;
    }
    
    public abstract ListPopupWindow dn();
    
    public boolean jdMethod_do()
    {
      ListPopupWindow localListPopupWindow = dn();
      if ((localListPopupWindow != null) && (!localListPopupWindow.RL.isShowing())) {
        localListPopupWindow.show();
      }
      return true;
    }
    
    void ff()
    {
      if (this.Ss != null) {
        this.Sq.removeCallbacks(this.Ss);
      }
      if (this.Sr != null) {
        this.Sq.removeCallbacks(this.Sr);
      }
    }
    
    public boolean onTouch(View paramView, MotionEvent paramMotionEvent)
    {
      boolean bool2 = false;
      boolean bool3 = this.St;
      if (bool3)
      {
        if (this.Su) {
          bool1 = l(paramMotionEvent);
        }
        for (;;)
        {
          this.St = bool1;
          if (!bool1)
          {
            bool1 = bool2;
            if (!bool3) {}
          }
          else
          {
            bool1 = true;
          }
          return bool1;
          if ((l(paramMotionEvent)) || (!dZ())) {
            bool1 = true;
          } else {
            bool1 = false;
          }
        }
      }
      paramView = this.Sq;
      if (paramView.isEnabled()) {}
      label128:
      int i;
      switch (o.d(paramMotionEvent))
      {
      default: 
        i = 0;
        label131:
        if ((i == 0) || (!jdMethod_do())) {
          break;
        }
      }
      for (boolean bool1 = true;; bool1 = false)
      {
        if (bool1)
        {
          long l = SystemClock.uptimeMillis();
          paramView = MotionEvent.obtain(l, l, 3, 0.0F, 0.0F, 0);
          this.Sq.onTouchEvent(paramView);
          paramView.recycle();
        }
        break;
        this.eA = paramMotionEvent.getPointerId(0);
        this.Su = false;
        if (this.Sr == null) {
          this.Sr = new a();
        }
        paramView.postDelayed(this.Sr, this.So);
        if (this.Ss == null) {
          this.Ss = new b();
        }
        paramView.postDelayed(this.Ss, this.Sp);
        break label128;
        i = paramMotionEvent.findPointerIndex(this.eA);
        if (i < 0) {
          break label128;
        }
        float f1 = paramMotionEvent.getX(i);
        float f2 = paramMotionEvent.getY(i);
        float f3 = this.Sn;
        if ((f1 >= -f3) && (f2 >= -f3) && (f1 < paramView.getRight() - paramView.getLeft() + f3) && (f2 < paramView.getBottom() - paramView.getTop() + f3)) {}
        for (i = 1; i == 0; i = 0)
        {
          ff();
          paramView.getParent().requestDisallowInterceptTouchEvent(true);
          i = 1;
          break label131;
        }
        ff();
        break label128;
      }
    }
    
    private final class a
      implements Runnable
    {
      public a() {}
      
      public final void run()
      {
        ListPopupWindow.b.this.Sq.getParent().requestDisallowInterceptTouchEvent(true);
      }
    }
    
    private final class b
      implements Runnable
    {
      public b() {}
      
      public final void run()
      {
        ListPopupWindow.b localb = ListPopupWindow.b.this;
        localb.ff();
        View localView = localb.Sq;
        if ((!localView.isEnabled()) || (localView.isLongClickable())) {}
        while (!localb.jdMethod_do()) {
          return;
        }
        localView.getParent().requestDisallowInterceptTouchEvent(true);
        long l = SystemClock.uptimeMillis();
        MotionEvent localMotionEvent = MotionEvent.obtain(l, l, 3, 0.0F, 0.0F, 0);
        localView.onTouchEvent(localMotionEvent);
        localMotionEvent.recycle();
        localb.St = true;
        localb.Su = true;
      }
    }
  }
  
  private final class c
    implements Runnable
  {
    public c() {}
    
    public final void run()
    {
      ListPopupWindow.this.clearListSelection();
    }
  }
  
  private final class d
    extends DataSetObserver
  {
    private d() {}
    
    public final void onChanged()
    {
      if (ListPopupWindow.this.RL.isShowing()) {
        ListPopupWindow.this.show();
      }
    }
    
    public final void onInvalidated()
    {
      ListPopupWindow.this.dismiss();
    }
  }
  
  private final class e
    implements AbsListView.OnScrollListener
  {
    public e() {}
    
    public final void onScroll(AbsListView paramAbsListView, int paramInt1, int paramInt2, int paramInt3) {}
    
    public final void onScrollStateChanged(AbsListView paramAbsListView, int paramInt)
    {
      if ((paramInt == 1) && (!ListPopupWindow.this.isInputMethodNotNeeded()) && (ListPopupWindow.this.RL.getContentView() != null))
      {
        ListPopupWindow.this.mHandler.removeCallbacks(ListPopupWindow.this.Sb);
        ListPopupWindow.this.Sb.run();
      }
    }
  }
  
  private final class f
    implements View.OnTouchListener
  {
    public f() {}
    
    public final boolean onTouch(View paramView, MotionEvent paramMotionEvent)
    {
      int i = paramMotionEvent.getAction();
      int j = (int)paramMotionEvent.getX();
      int k = (int)paramMotionEvent.getY();
      if ((i == 0) && (ListPopupWindow.this.RL != null) && (ListPopupWindow.this.RL.isShowing()) && (j >= 0) && (j < ListPopupWindow.this.RL.getWidth()) && (k >= 0) && (k < ListPopupWindow.this.RL.getHeight())) {
        ListPopupWindow.this.mHandler.postDelayed(ListPopupWindow.this.Sb, 250L);
      }
      for (;;)
      {
        return false;
        if (i == 1) {
          ListPopupWindow.this.mHandler.removeCallbacks(ListPopupWindow.this.Sb);
        }
      }
    }
  }
  
  private final class g
    implements Runnable
  {
    public g() {}
    
    public final void run()
    {
      if ((ListPopupWindow.this.RM != null) && (z.al(ListPopupWindow.this.RM)) && (ListPopupWindow.this.RM.getCount() > ListPopupWindow.this.RM.getChildCount()) && (ListPopupWindow.this.RM.getChildCount() <= ListPopupWindow.this.RU))
      {
        ListPopupWindow.this.RL.setInputMethodMode(2);
        ListPopupWindow.this.show();
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\android\support\v7\widget\ListPopupWindow.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */