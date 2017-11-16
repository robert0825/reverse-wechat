package com.tencent.mm.plugin.exdevice.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.k;
import com.tencent.mm.sdk.platformtools.w;

public class ExdeviceLikeView
  extends RelativeLayout
{
  a kHA;
  private int kHB;
  TextView kHC;
  private ImageView kHD;
  private ProgressBar kHE;
  int kHz;
  private Context mContext;
  
  public ExdeviceLikeView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, -1);
    GMTrace.i(11094034743296L, 82657);
    GMTrace.o(11094034743296L, 82657);
  }
  
  public ExdeviceLikeView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(11093900525568L, 82656);
    this.kHB = 2;
    this.mContext = paramContext;
    paramContext = LayoutInflater.from(this.mContext).inflate(R.i.cvL, this, true);
    this.kHC = ((TextView)paramContext.findViewById(R.h.bxs));
    this.kHD = ((ImageView)paramContext.findViewById(R.h.bxr));
    this.kHE = ((ProgressBar)paramContext.findViewById(R.h.bxv));
    setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(11037663297536L, 82237);
        if ((ExdeviceLikeView.a(ExdeviceLikeView.this) != null) && (!ExdeviceLikeView.a(ExdeviceLikeView.this).auH()) && (ExdeviceLikeView.b(ExdeviceLikeView.this) == 0))
        {
          w.d("MicroMsg.ExdeviceLikeView", "click listener is not null");
          ExdeviceLikeView.this.ng(ExdeviceLikeView.nh(ExdeviceLikeView.b(ExdeviceLikeView.this)));
          if (ExdeviceLikeView.b(ExdeviceLikeView.this) == 1) {
            ExdeviceLikeView.c(ExdeviceLikeView.this);
          }
          if (ExdeviceLikeView.a(ExdeviceLikeView.this) != null)
          {
            ExdeviceLikeView.a(ExdeviceLikeView.this).hQ(ExdeviceLikeView.b(ExdeviceLikeView.this));
            GMTrace.o(11037663297536L, 82237);
          }
        }
        else
        {
          w.d("MicroMsg.ExdeviceLikeView", "hy: loading or has liked or consumed. abort event");
        }
        GMTrace.o(11037663297536L, 82237);
      }
    });
    GMTrace.o(11093900525568L, 82656);
  }
  
  public final void ng(int paramInt)
  {
    GMTrace.i(11094168961024L, 82658);
    this.kHB = paramInt;
    if (this.kHB == 1)
    {
      this.kHE.setVisibility(8);
      this.kHC.setVisibility(0);
      this.kHD.setVisibility(0);
      this.kHD.setImageResource(R.k.cLV);
      GMTrace.o(11094168961024L, 82658);
      return;
    }
    if (this.kHB == 0)
    {
      this.kHE.setVisibility(8);
      this.kHC.setVisibility(0);
      this.kHD.setVisibility(0);
      this.kHD.setImageResource(R.k.cLW);
      GMTrace.o(11094168961024L, 82658);
      return;
    }
    if (this.kHB == 2)
    {
      this.kHC.setVisibility(8);
      this.kHE.setVisibility(0);
      this.kHD.setVisibility(8);
      GMTrace.o(11094168961024L, 82658);
      return;
    }
    w.w("MicroMsg.ExdeviceLikeView", "hy: error state");
    GMTrace.o(11094168961024L, 82658);
  }
  
  public static abstract interface a
  {
    public abstract boolean auH();
    
    public abstract void hQ(int paramInt);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\exdevice\ui\ExdeviceLikeView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */