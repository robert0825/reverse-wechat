package com.tencent.mm.plugin.webview.ui.tools.game.menu;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.v7.app.i;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.Window;
import android.view.WindowManager.LayoutParams;
import android.widget.FrameLayout;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.m;

public final class e
  extends i
{
  private Context mContext;
  
  public e(Context paramContext)
  {
    this(paramContext, (byte)0);
    GMTrace.i(18078725308416L, 134697);
    GMTrace.o(18078725308416L, 134697);
  }
  
  private e(Context paramContext, byte paramByte)
  {
    super(paramContext, R.m.elV);
    GMTrace.i(18078859526144L, 134698);
    cY();
    this.mContext = paramContext;
    GMTrace.o(18078859526144L, 134698);
  }
  
  private boolean aOU()
  {
    GMTrace.i(18079664832512L, 134704);
    DisplayMetrics localDisplayMetrics = this.mContext.getResources().getDisplayMetrics();
    if (localDisplayMetrics.widthPixels > localDisplayMetrics.heightPixels)
    {
      GMTrace.o(18079664832512L, 134704);
      return true;
    }
    GMTrace.o(18079664832512L, 134704);
    return false;
  }
  
  private View b(int paramInt, View paramView, ViewGroup.LayoutParams paramLayoutParams)
  {
    GMTrace.i(18079530614784L, 134703);
    Object localObject1 = getWindow();
    Object localObject2;
    View localView;
    if (aOU())
    {
      ((Window)localObject1).setGravity(5);
      ((Window)localObject1).setWindowAnimations(R.m.emc);
      ((Window)localObject1).getDecorView().setPadding(0, 0, 0, 0);
      localObject2 = ((Window)localObject1).getAttributes();
      ((WindowManager.LayoutParams)localObject2).width = -1;
      ((WindowManager.LayoutParams)localObject2).height = -1;
      ((Window)localObject1).setAttributes((WindowManager.LayoutParams)localObject2);
      localObject2 = (ViewGroup)LayoutInflater.from(this.mContext).inflate(R.i.cza, null);
      localView = ((ViewGroup)localObject2).findViewById(R.h.ax);
      localObject1 = paramView;
      if (paramInt != 0)
      {
        localObject1 = paramView;
        if (paramView == null) {
          localObject1 = getLayoutInflater().inflate(paramInt, (ViewGroup)localObject2, false);
        }
      }
      if (!aOU()) {
        break label219;
      }
      paramView = (FrameLayout)((ViewGroup)localObject2).findViewById(R.h.bMW);
      label148:
      paramView.setVisibility(0);
      if (paramLayoutParams != null) {
        break label234;
      }
      paramView.addView((View)localObject1);
      label163:
      if (Build.VERSION.SDK_INT >= 11) {
        break label244;
      }
      paramInt = 1;
    }
    for (;;)
    {
      if (paramInt != 0) {
        localView.setOnClickListener(new View.OnClickListener()
        {
          public final void onClick(View paramAnonymousView)
          {
            GMTrace.i(18085436194816L, 134747);
            if (e.this.isShowing()) {
              e.this.cancel();
            }
            GMTrace.o(18085436194816L, 134747);
          }
        });
      }
      GMTrace.o(18079530614784L, 134703);
      return (View)localObject2;
      ((Window)localObject1).setGravity(80);
      ((Window)localObject1).setWindowAnimations(R.m.elS);
      break;
      label219:
      paramView = (FrameLayout)((ViewGroup)localObject2).findViewById(R.h.bMV);
      break label148;
      label234:
      paramView.addView((View)localObject1, paramLayoutParams);
      break label163;
      label244:
      paramView = new TypedValue();
      if (getContext().getTheme().resolveAttribute(16843611, paramView, true))
      {
        if (paramView.data != 0) {
          paramInt = 1;
        } else {
          paramInt = 0;
        }
      }
      else {
        paramInt = 0;
      }
    }
  }
  
  protected final void onCreate(Bundle paramBundle)
  {
    GMTrace.i(18079127961600L, 134700);
    super.onCreate(paramBundle);
    getWindow().setLayout(-1, -1);
    GMTrace.o(18079127961600L, 134700);
  }
  
  public final void setContentView(int paramInt)
  {
    GMTrace.i(18078993743872L, 134699);
    super.setContentView(b(paramInt, null, null));
    GMTrace.o(18078993743872L, 134699);
  }
  
  public final void setContentView(View paramView)
  {
    GMTrace.i(18079262179328L, 134701);
    super.setContentView(b(0, paramView, null));
    GMTrace.o(18079262179328L, 134701);
  }
  
  public final void setContentView(View paramView, ViewGroup.LayoutParams paramLayoutParams)
  {
    GMTrace.i(18079396397056L, 134702);
    super.setContentView(b(0, paramView, paramLayoutParams));
    GMTrace.o(18079396397056L, 134702);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\webview\ui\tools\game\menu\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */