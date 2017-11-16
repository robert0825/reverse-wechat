package com.tencent.mm.plugin.ipcall.ui;

import android.content.Context;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.n;
import com.tencent.mm.sdk.platformtools.bg;

public class IPCallFuncButton
  extends LinearLayout
{
  private boolean jxW;
  private boolean lmH;
  private ImageView mqF;
  private TextView mqG;
  private Drawable mqH;
  private Drawable mqI;
  private Drawable mqJ;
  private boolean mqK;
  a mqL;
  private View.OnTouchListener mqM;
  private String text;
  
  public IPCallFuncButton(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(11657078112256L, 86852);
    this.jxW = false;
    this.lmH = true;
    this.mqM = new View.OnTouchListener()
    {
      public final boolean onTouch(View paramAnonymousView, MotionEvent paramAnonymousMotionEvent)
      {
        GMTrace.i(11695195947008L, 87136);
        if (!IPCallFuncButton.a(IPCallFuncButton.this))
        {
          GMTrace.o(11695195947008L, 87136);
          return false;
        }
        if (paramAnonymousMotionEvent.getAction() == 0) {
          if (!IPCallFuncButton.b(IPCallFuncButton.this)) {
            if (IPCallFuncButton.c(IPCallFuncButton.this) != null) {
              IPCallFuncButton.d(IPCallFuncButton.this).setImageDrawable(IPCallFuncButton.c(IPCallFuncButton.this));
            }
          }
        }
        for (;;)
        {
          GMTrace.o(11695195947008L, 87136);
          return false;
          if (IPCallFuncButton.e(IPCallFuncButton.this))
          {
            IPCallFuncButton.d(IPCallFuncButton.this).setImageDrawable(IPCallFuncButton.f(IPCallFuncButton.this));
            IPCallFuncButton.a(IPCallFuncButton.this, false);
          }
          for (;;)
          {
            if (IPCallFuncButton.g(IPCallFuncButton.this) == null) {
              break label177;
            }
            IPCallFuncButton.g(IPCallFuncButton.this).fw(IPCallFuncButton.e(IPCallFuncButton.this));
            break;
            IPCallFuncButton.d(IPCallFuncButton.this).setImageDrawable(IPCallFuncButton.c(IPCallFuncButton.this));
            IPCallFuncButton.a(IPCallFuncButton.this, true);
          }
          label177:
          continue;
          if (((paramAnonymousMotionEvent.getAction() == 3) || (paramAnonymousMotionEvent.getAction() == 1)) && (!IPCallFuncButton.b(IPCallFuncButton.this)))
          {
            if (IPCallFuncButton.f(IPCallFuncButton.this) != null) {
              IPCallFuncButton.d(IPCallFuncButton.this).setImageDrawable(IPCallFuncButton.f(IPCallFuncButton.this));
            }
            if (IPCallFuncButton.g(IPCallFuncButton.this) != null) {
              IPCallFuncButton.g(IPCallFuncButton.this).fw(false);
            }
          }
        }
      }
    };
    LayoutInflater.from(getContext()).inflate(R.i.cAj, this);
    this.mqF = ((ImageView)findViewById(R.h.button));
    this.mqG = ((TextView)findViewById(R.h.text));
    paramContext = getContext().getTheme().obtainStyledAttributes(paramAttributeSet, R.n.enr, 0, 0);
    this.mqH = paramContext.getDrawable(R.n.enu);
    this.mqI = paramContext.getDrawable(R.n.env);
    this.mqK = paramContext.getBoolean(R.n.ens, false);
    this.mqJ = paramContext.getDrawable(R.n.ent);
    int i = paramContext.getResourceId(R.n.enw, 0);
    if (i != 0) {
      this.text = getContext().getString(i);
    }
    paramContext.recycle();
    if (!bg.nm(this.text)) {
      this.mqG.setText(this.text);
    }
    for (;;)
    {
      if (this.mqH != null) {
        this.mqF.setImageDrawable(this.mqH);
      }
      this.mqF.setClickable(true);
      this.mqF.setOnTouchListener(this.mqM);
      GMTrace.o(11657078112256L, 86852);
      return;
      this.mqG.setVisibility(8);
    }
  }
  
  public final void fv(boolean paramBoolean)
  {
    GMTrace.i(11657346547712L, 86854);
    if (paramBoolean != this.lmH)
    {
      this.lmH = paramBoolean;
      if ((this.lmH) || (this.mqJ == null)) {
        break label60;
      }
      this.mqF.setImageDrawable(this.mqJ);
    }
    for (;;)
    {
      this.jxW = false;
      GMTrace.o(11657346547712L, 86854);
      return;
      label60:
      this.mqF.setImageDrawable(this.mqH);
    }
  }
  
  public final boolean isChecked()
  {
    GMTrace.i(11657212329984L, 86853);
    if (this.mqK)
    {
      boolean bool = this.jxW;
      GMTrace.o(11657212329984L, 86853);
      return bool;
    }
    GMTrace.o(11657212329984L, 86853);
    return false;
  }
  
  public final void setChecked(boolean paramBoolean)
  {
    GMTrace.i(11657480765440L, 86855);
    if ((paramBoolean != this.jxW) && (this.mqK))
    {
      this.jxW = paramBoolean;
      if (this.jxW)
      {
        this.mqF.setImageDrawable(this.mqI);
        GMTrace.o(11657480765440L, 86855);
        return;
      }
      this.mqF.setImageDrawable(this.mqH);
    }
    GMTrace.o(11657480765440L, 86855);
  }
  
  public static abstract interface a
  {
    public abstract void fw(boolean paramBoolean);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\ipcall\ui\IPCallFuncButton.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */