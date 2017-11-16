package com.tencent.mm.plugin.webview.ui.tools.game.menu;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnDismissListener;
import android.content.res.Resources;
import android.os.Build.VERSION;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.Window;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ui.base.n;

public final class d
  implements ViewTreeObserver.OnGlobalLayoutListener
{
  private ViewTreeObserver Le;
  private View gO;
  private Context mContext;
  private n qim;
  private e rRo;
  public b.b rRp;
  private GameMenuView rRq;
  private f rRr;
  private boolean rRs;
  private boolean rRt;
  public boolean rRu;
  public boolean rRv;
  
  public d(Context paramContext)
  {
    GMTrace.i(18081275445248L, 134716);
    this.rRs = false;
    this.rRv = false;
    this.mContext = paramContext;
    if ((this.mContext instanceof Activity))
    {
      paramContext = (ViewGroup)((Activity)this.mContext).getWindow().getDecorView();
      if (paramContext.getChildCount() <= 0) {
        break label181;
      }
    }
    label181:
    for (this.gO = paramContext.getChildAt(0);; this.gO = paramContext)
    {
      paramContext = this.mContext;
      this.qim = new n();
      this.rRo = new e(paramContext);
      this.rRq = new GameMenuView(paramContext);
      this.rRr = new f(paramContext);
      paramContext = this.rRq;
      f localf = this.rRr;
      paramContext.rRA = localf;
      localf.registerDataSetObserver(new GameMenuView.1(paramContext));
      localf.notifyDataSetChanged();
      this.rRs = aOU();
      this.rRo.setContentView(this.rRq);
      GMTrace.o(18081275445248L, 134716);
      return;
    }
  }
  
  private boolean aOU()
  {
    GMTrace.i(18081946533888L, 134721);
    DisplayMetrics localDisplayMetrics = this.mContext.getResources().getDisplayMetrics();
    if (localDisplayMetrics.widthPixels > localDisplayMetrics.heightPixels)
    {
      GMTrace.o(18081946533888L, 134721);
      return true;
    }
    GMTrace.o(18081946533888L, 134721);
    return false;
  }
  
  private boolean isShowing()
  {
    GMTrace.i(18081678098432L, 134719);
    if (this.rRo != null)
    {
      if (this.rRo.isShowing())
      {
        GMTrace.o(18081678098432L, 134719);
        return true;
      }
      GMTrace.o(18081678098432L, 134719);
      return false;
    }
    GMTrace.o(18081678098432L, 134719);
    return false;
  }
  
  public final void a(b.c paramc)
  {
    GMTrace.i(18081812316160L, 134720);
    if (this.rRq != null) {
      this.rRq.rRB = paramc;
    }
    GMTrace.o(18081812316160L, 134720);
  }
  
  public final void bFk()
  {
    int i = 0;
    GMTrace.i(18081409662976L, 134717);
    this.rRs = aOU();
    if (this.rRp != null) {
      this.rRp.a(this.qim);
    }
    if (this.rRo != null)
    {
      if (this.rRr != null)
      {
        f localf = this.rRr;
        localf.qim = this.qim;
        localf.notifyDataSetChanged();
      }
      if (Build.VERSION.SDK_INT >= 21) {
        this.rRo.getWindow().addFlags(Integer.MIN_VALUE);
      }
      if ((this.rRt) && (Build.VERSION.SDK_INT >= 23) && (this.rRo != null))
      {
        this.rRo.getWindow().getDecorView().setSystemUiVisibility(9216);
        this.rRo.getWindow().setStatusBarColor(0);
      }
      if (this.rRu) {
        this.rRo.getWindow().addFlags(1024);
      }
      if (!this.rRv) {
        break label298;
      }
      this.rRo.getWindow().setFlags(8, 8);
      this.rRo.getWindow().addFlags(131200);
      this.rRo.getWindow().getDecorView().setSystemUiVisibility(6);
    }
    for (;;)
    {
      if (this.gO != null)
      {
        if (this.Le == null) {
          i = 1;
        }
        this.Le = this.gO.getViewTreeObserver();
        if (i != 0) {
          this.Le.addOnGlobalLayoutListener(this);
        }
      }
      this.rRo.setOnDismissListener(new DialogInterface.OnDismissListener()
      {
        public final void onDismiss(DialogInterface paramAnonymousDialogInterface)
        {
          GMTrace.i(18086509936640L, 134755);
          d.this.bFl();
          GMTrace.o(18086509936640L, 134755);
        }
      });
      if (this.rRq != null) {
        this.rRq.rRC = new b.a()
        {
          public final void onDismiss()
          {
            GMTrace.i(18086778372096L, 134757);
            d.this.bFl();
            GMTrace.o(18086778372096L, 134757);
          }
        };
      }
      this.rRo.show();
      GMTrace.o(18081409662976L, 134717);
      return;
      label298:
      this.rRo.getWindow().clearFlags(8);
      this.rRo.getWindow().clearFlags(131072);
      this.rRo.getWindow().clearFlags(128);
      this.rRo.getWindow().getDecorView().setSystemUiVisibility(0);
    }
  }
  
  public final void bFl()
  {
    GMTrace.i(18081543880704L, 134718);
    if (this.Le != null)
    {
      if (!this.Le.isAlive()) {
        this.Le = this.gO.getViewTreeObserver();
      }
      this.Le.removeGlobalOnLayoutListener(this);
      this.Le = null;
    }
    if (this.rRo != null) {
      this.rRo.dismiss();
    }
    GMTrace.o(18081543880704L, 134718);
  }
  
  public final void onGlobalLayout()
  {
    GMTrace.i(18081141227520L, 134715);
    if (isShowing())
    {
      View localView = this.gO;
      if ((localView == null) || (!localView.isShown()))
      {
        bFl();
        GMTrace.o(18081141227520L, 134715);
        return;
      }
      if ((isShowing()) && (this.rRs != aOU())) {
        bFl();
      }
    }
    GMTrace.o(18081141227520L, 134715);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\webview\ui\tools\game\menu\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */