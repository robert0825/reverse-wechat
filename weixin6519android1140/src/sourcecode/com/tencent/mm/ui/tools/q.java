package com.tencent.mm.ui.tools;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface.OnCancelListener;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.app.d;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnKeyListener;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.Window;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.BaseAdapter;
import android.widget.FrameLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow.OnDismissListener;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.b;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.base.MMListPopupWindow;
import com.tencent.mm.v.a.d;
import com.tencent.mm.v.a.e;
import com.tencent.mm.v.a.f;
import com.tencent.mm.v.a.l;

public abstract class q
  implements View.OnKeyListener, ViewTreeObserver.OnGlobalLayoutListener, AdapterView.OnItemClickListener, PopupWindow.OnDismissListener
{
  private int La;
  private ViewTreeObserver Le;
  private ViewGroup Lf;
  private int dividerHeight;
  private View gO;
  private boolean iPc;
  private BaseAdapter jDh;
  protected Context mContext;
  private boolean rRs;
  private MMListPopupWindow wtY;
  private int wtZ;
  private DialogInterface.OnCancelListener xjC;
  private PopupWindow.OnDismissListener xjD;
  private boolean xjE;
  private View xjF;
  private int xjG;
  private int xjH;
  private int xjI;
  private int xjJ;
  private float xjK;
  private float xjL;
  
  public q(Context paramContext)
  {
    GMTrace.i(1950183587840L, 14530);
    this.iPc = false;
    this.wtZ = a.l.ggz;
    this.rRs = false;
    this.xjE = true;
    this.xjH = 0;
    this.xjI = 0;
    this.xjJ = 0;
    this.xjK = 0.0F;
    this.xjL = 0.0F;
    this.mContext = paramContext;
    paramContext = paramContext.getResources();
    this.La = Math.min(paramContext.getDisplayMetrics().widthPixels * 4 / 5, paramContext.getDimensionPixelSize(a.e.abc_config_prefDialogWidth));
    ViewGroup localViewGroup;
    if ((this.mContext instanceof Activity))
    {
      localViewGroup = (ViewGroup)((Activity)this.mContext).getWindow().getDecorView();
      if (localViewGroup.getChildCount() <= 0) {
        break label205;
      }
    }
    label205:
    for (this.gO = localViewGroup.getChildAt(0);; this.gO = localViewGroup)
    {
      this.dividerHeight = BackwardSupportUtil.b.a(this.mContext, 1.0F);
      this.xjH = (paramContext.getDimensionPixelSize(a.e.aQE) * 2);
      this.xjI = paramContext.getDimensionPixelSize(a.e.aQM);
      this.xjJ = BackwardSupportUtil.b.a(this.mContext, 36.0F);
      this.jDh = aiO();
      GMTrace.o(1950183587840L, 14530);
      return;
    }
  }
  
  private boolean aOU()
  {
    GMTrace.i(1950720458752L, 14534);
    DisplayMetrics localDisplayMetrics = this.mContext.getResources().getDisplayMetrics();
    if (localDisplayMetrics.widthPixels > localDisplayMetrics.heightPixels)
    {
      GMTrace.o(1950720458752L, 14534);
      return true;
    }
    GMTrace.o(1950720458752L, 14534);
    return false;
  }
  
  private int b(ListAdapter paramListAdapter)
  {
    GMTrace.i(1950988894208L, 14536);
    int n = View.MeasureSpec.makeMeasureSpec(0, 0);
    int i1 = View.MeasureSpec.makeMeasureSpec(0, 0);
    int i2 = paramListAdapter.getCount();
    int j = 0;
    int i = 0;
    View localView = null;
    int k = 0;
    if (j < i2)
    {
      int m = paramListAdapter.getItemViewType(j);
      if (m == i) {
        break label145;
      }
      localView = null;
      i = m;
    }
    label145:
    for (;;)
    {
      if (this.Lf == null) {
        this.Lf = new FrameLayout(this.mContext);
      }
      localView = paramListAdapter.getView(j, localView, this.Lf);
      localView.measure(n, i1);
      k = Math.max(k, localView.getMeasuredWidth());
      j += 1;
      break;
      GMTrace.o(1950988894208L, 14536);
      return k;
    }
  }
  
  public abstract BaseAdapter aiO();
  
  public boolean dK()
  {
    GMTrace.i(1950586241024L, 14533);
    Object localObject1 = new Rect();
    int i;
    int j;
    Object localObject2;
    if ((this.mContext instanceof ActionBarActivity))
    {
      i = ((ActionBarActivity)this.mContext).cN().cO().getHeight();
      i -= this.mContext.getResources().getDimensionPixelSize(a.e.aQE);
      if (!(this.mContext instanceof Activity)) {
        break label981;
      }
      ((Activity)this.mContext).getWindow().getDecorView().getWindowVisibleDisplayFrame((Rect)localObject1);
      j = ((Activity)this.mContext).getWindow().getDecorView().getHeight();
      localObject2 = new int[2];
      ((Activity)this.mContext).getWindow().getDecorView().getLocationOnScreen((int[])localObject2);
      if ((j - ((Rect)localObject1).height() < 0) || (localObject2[1] <= 200)) {
        break label891;
      }
      i = j - ((Rect)localObject1).height() + i;
    }
    label159:
    label300:
    label455:
    label527:
    label891:
    label902:
    label908:
    label925:
    label966:
    label978:
    label981:
    for (;;)
    {
      this.rRs = aOU();
      if ((this.wtY == null) || (true == this.xjE)) {
        this.wtY = new MMListPopupWindow(this.mContext, null, 0);
      }
      this.wtY.setOnDismissListener(this);
      this.wtY.RZ = this;
      this.wtY.setAdapter(this.jDh);
      this.wtY.bZX();
      this.wtY.setBackgroundDrawable(this.mContext.getResources().getDrawable(a.f.gcG));
      this.wtY.setAnimationStyle(this.wtZ);
      this.wtY.RO = 0;
      this.wtY.RX = this.gO;
      boolean bool;
      if (this.gO != null)
      {
        if (this.Le != null) {
          break label902;
        }
        bool = true;
        this.Le = this.gO.getViewTreeObserver();
        w.v("MicroMsg.SubMenuHelperBase", "tryshow addGlobalListener:%b", new Object[] { Boolean.valueOf(bool) });
        if (bool) {
          this.Le.addOnGlobalLayoutListener(this);
        }
      }
      this.wtY.setVerticalOffset(i);
      this.wtY.iPc = this.iPc;
      this.wtY.setContentWidth(Math.min(b(this.jDh), this.La));
      this.wtY.fd();
      if ((this.xjK != 0.0F) && (this.xjL != 0.0F))
      {
        localObject1 = new DisplayMetrics();
        ((Activity)this.mContext).getWindowManager().getDefaultDisplay().getMetrics((DisplayMetrics)localObject1);
        if (((DisplayMetrics)localObject1).widthPixels <= ((DisplayMetrics)localObject1).heightPixels) {
          break label908;
        }
        i = 1;
        localObject1 = new Rect();
        ((Activity)this.mContext).getWindow().getDecorView().getWindowVisibleDisplayFrame((Rect)localObject1);
        j = ((Activity)this.mContext).getWindow().getDecorView().getHeight();
        if (j <= ((Rect)localObject1).height()) {
          break label978;
        }
        j = ((Rect)localObject1).height();
      }
      for (;;)
      {
        if (i != 0)
        {
          i = (int)(this.xjL * j);
          w.d("MicroMsg.SubMenuHelperBase", "menuHeightPercentPort(%f), menuHeightPercentLand(%f), frameHeight(%d), decorViewHeight(%d), menuHeight(%d)", new Object[] { Float.valueOf(this.xjK), Float.valueOf(this.xjL), Integer.valueOf(((Rect)localObject1).height()), Integer.valueOf(j), Integer.valueOf(i) });
          i = Math.round(i / this.xjI);
          if ((i <= 0) || (this.jDh == null)) {
            break label966;
          }
          j = this.xjI * i + this.xjH;
          if ((j == 0) || (j >= this.jDh.getCount() * this.xjI)) {
            break label925;
          }
          j = this.xjI;
          int k = this.xjH;
          int m = this.xjJ;
          this.wtY.RN = ((i - 1) * j + k + m);
        }
        for (;;)
        {
          if ((this.wtY != null) && (this.xjF != null))
          {
            localObject1 = this.wtY;
            localObject2 = this.xjF;
            bool = ((MMListPopupWindow)localObject1).hwd.isShowing();
            if (bool) {
              ((MMListPopupWindow)localObject1).ads();
            }
            ((MMListPopupWindow)localObject1).RV = ((View)localObject2);
            if (bool) {
              ((MMListPopupWindow)localObject1).show();
            }
            this.wtY.RW = this.xjG;
          }
          this.wtY.show();
          this.wtY.wdp.setOnKeyListener(this);
          this.wtY.wdp.setSelector(new ColorDrawable(this.mContext.getResources().getColor(a.d.transparent)));
          this.wtY.wdp.setDividerHeight(0);
          this.wtY.wdp.setVerticalScrollBarEnabled(true);
          this.wtY.wdp.setHorizontalScrollBarEnabled(false);
          GMTrace.o(1950586241024L, 14533);
          return true;
          localObject2 = this.mContext.getResources().getDisplayMetrics();
          if (((DisplayMetrics)localObject2).widthPixels > ((DisplayMetrics)localObject2).heightPixels)
          {
            i = BackwardSupportUtil.b.a(this.mContext, 40.0F);
            break;
          }
          i = BackwardSupportUtil.b.a(this.mContext, 49.0F);
          break;
          i = ((Rect)localObject1).top + i;
          break label159;
          bool = false;
          break label300;
          i = 0;
          break label455;
          i = (int)(this.xjK * j);
          break label527;
          w.w("MicroMsg.SubMenuHelperBase", "[cpan] menuheight:%d,listHeight:%d", new Object[] { Integer.valueOf(j), Integer.valueOf(this.jDh.getCount() * this.xjI) });
          continue;
          w.e("MicroMsg.SubMenuHelperBase", "[cpan] setpopuHeight error.");
        }
      }
    }
  }
  
  public final void dismiss()
  {
    GMTrace.i(1950854676480L, 14535);
    if (isShowing()) {
      this.wtY.dismiss();
    }
    GMTrace.o(1950854676480L, 14535);
  }
  
  public final boolean isShowing()
  {
    GMTrace.i(1951257329664L, 14538);
    if ((this.wtY != null) && (this.wtY.hwd.isShowing()))
    {
      GMTrace.o(1951257329664L, 14538);
      return true;
    }
    GMTrace.o(1951257329664L, 14538);
    return false;
  }
  
  public final void mE(boolean paramBoolean)
  {
    GMTrace.i(1950317805568L, 14531);
    this.iPc = paramBoolean;
    if (paramBoolean)
    {
      this.wtZ = a.l.ggy;
      GMTrace.o(1950317805568L, 14531);
      return;
    }
    this.wtZ = a.l.ggz;
    GMTrace.o(1950317805568L, 14531);
  }
  
  public void onDismiss()
  {
    GMTrace.i(1951123111936L, 14537);
    this.wtY = null;
    if (this.Le != null)
    {
      if (!this.Le.isAlive()) {
        this.Le = this.gO.getViewTreeObserver();
      }
      this.Le.removeGlobalOnLayoutListener(this);
      this.Le = null;
    }
    if (this.xjC != null) {
      this.xjC.onCancel(null);
    }
    if (this.xjD != null) {
      this.xjD.onDismiss();
    }
    GMTrace.o(1951123111936L, 14537);
  }
  
  public void onGlobalLayout()
  {
    GMTrace.i(1951391547392L, 14539);
    w.v("MicroMsg.SubMenuHelperBase", "onGlobalLayout showing:%b, anchorshown:%b", new Object[] { Boolean.valueOf(isShowing()), Boolean.valueOf(this.gO.isShown()) });
    if (isShowing())
    {
      View localView = this.gO;
      if ((localView == null) || (!localView.isShown()))
      {
        dismiss();
        GMTrace.o(1951391547392L, 14539);
        return;
      }
      if ((isShowing()) && (this.rRs != aOU())) {
        this.wtY.dismiss();
      }
    }
    GMTrace.o(1951391547392L, 14539);
  }
  
  public void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    GMTrace.i(1951659982848L, 14541);
    dismiss();
    GMTrace.o(1951659982848L, 14541);
  }
  
  public boolean onKey(View paramView, int paramInt, KeyEvent paramKeyEvent)
  {
    GMTrace.i(1951525765120L, 14540);
    w.v("MicroMsg.SubMenuHelperBase", "onKey");
    if ((paramKeyEvent.getAction() == 1) && (paramInt == 82))
    {
      dismiss();
      GMTrace.o(1951525765120L, 14540);
      return true;
    }
    GMTrace.o(1951525765120L, 14540);
    return false;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\tools\q.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */