package com.tencent.mm.ui.widget.picker;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnDismissListener;
import android.support.design.widget.BottomSheetBehavior;
import android.support.design.widget.c;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.Button;
import android.widget.FrameLayout.LayoutParams;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.bx.a.e;
import com.tencent.mm.bx.a.f;
import java.util.ArrayList;

public final class a
  implements ViewTreeObserver.OnGlobalLayoutListener
{
  private Button jgH;
  private Button jgI;
  private View koX;
  private Context mContext;
  private int xpM;
  private BottomSheetBehavior xpN;
  public c xum;
  private String[] xun;
  private int xuo;
  public OptionPicker xup;
  public a xuq;
  
  public a(Context paramContext, ArrayList<String> paramArrayList)
  {
    GMTrace.i(18916243931136L, 140937);
    this.mContext = paramContext;
    this.xun = ((String[])paramArrayList.toArray(new String[paramArrayList.size()]));
    this.xum = new c(this.mContext);
    this.koX = View.inflate(this.mContext, a.f.xvv, null);
    this.xup = ((OptionPicker)this.koX.findViewById(a.e.xvl));
    this.xup.i(this.xun);
    this.xuo = com.tencent.mm.br.a.fromDPToPix(this.mContext, 288);
    this.jgH = ((Button)this.koX.findViewById(a.e.bSm));
    this.jgH.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(18915841277952L, 140934);
        a locala = a.this;
        if (a.this.xup == null) {
          paramAnonymousView = null;
        }
        for (;;)
        {
          locala.e(true, paramAnonymousView);
          GMTrace.o(18915841277952L, 140934);
          return;
          paramAnonymousView = a.this.xup;
          if ((paramAnonymousView.iRL == null) || (paramAnonymousView.iRL.length <= 0)) {
            paramAnonymousView = "";
          } else {
            paramAnonymousView = paramAnonymousView.iRL[paramAnonymousView.getValue()];
          }
        }
      }
    });
    this.jgI = ((Button)this.koX.findViewById(a.e.biN));
    this.jgI.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(18916109713408L, 140936);
        a.this.e(false, null);
        GMTrace.o(18916109713408L, 140936);
      }
    });
    this.xum.setContentView(this.koX);
    this.xpM = com.tencent.mm.br.a.fromDPToPix(this.mContext, 350);
    this.xpN = BottomSheetBehavior.i((View)this.koX.getParent());
    if (this.xpN != null)
    {
      this.xpN.g(this.xpM);
      this.xpN.eq = false;
    }
    this.xum.setOnDismissListener(new DialogInterface.OnDismissListener()
    {
      public final void onDismiss(DialogInterface paramAnonymousDialogInterface)
      {
        GMTrace.i(18916780802048L, 140941);
        a.this.xum = null;
        GMTrace.o(18916780802048L, 140941);
      }
    });
    GMTrace.o(18916243931136L, 140937);
  }
  
  public final void Ex(int paramInt)
  {
    GMTrace.i(20301370884096L, 151257);
    if (paramInt != 0) {
      this.xuo = paramInt;
    }
    FrameLayout.LayoutParams localLayoutParams = (FrameLayout.LayoutParams)this.koX.getLayoutParams();
    localLayoutParams.height = this.xuo;
    this.koX.setLayoutParams(localLayoutParams);
    this.koX.invalidate();
    GMTrace.o(20301370884096L, 151257);
  }
  
  public final void Ey(int paramInt)
  {
    GMTrace.i(20301773537280L, 151260);
    if (this.xup != null) {
      this.xup.setValue(paramInt);
    }
    GMTrace.o(20301773537280L, 151260);
  }
  
  public final int cjK()
  {
    GMTrace.i(20301907755008L, 151261);
    int i = 0;
    if (this.xup != null) {
      i = this.xup.getValue();
    }
    GMTrace.o(20301907755008L, 151261);
    return i;
  }
  
  public final void e(boolean paramBoolean, Object paramObject)
  {
    GMTrace.i(18916512366592L, 140939);
    if (this.xuq != null) {
      this.xuq.d(paramBoolean, paramObject);
    }
    GMTrace.o(18916512366592L, 140939);
  }
  
  public final void hide()
  {
    GMTrace.i(20301639319552L, 151259);
    if (this.xum != null) {
      this.xum.dismiss();
    }
    GMTrace.o(20301639319552L, 151259);
  }
  
  public final void onGlobalLayout()
  {
    GMTrace.i(18916378148864L, 140938);
    GMTrace.o(18916378148864L, 140938);
  }
  
  public final void show()
  {
    GMTrace.i(20301505101824L, 151258);
    if (this.xum != null) {
      this.xum.show();
    }
    GMTrace.o(20301505101824L, 151258);
  }
  
  public static abstract interface a<T>
  {
    public abstract void d(boolean paramBoolean, T paramT);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\ui\widget\picker\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */