package com.tencent.mm.plugin.voiceprint.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;

public class NoiseDetectMaskView
  extends RelativeLayout
{
  ProgressBar ktM;
  private Context mContext;
  TextView qCP;
  TextView qCQ;
  b qCR;
  a qCS;
  
  public NoiseDetectMaskView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(12529895997440L, 93355);
    this.ktM = null;
    this.mContext = null;
    this.mContext = paramContext;
    this.mContext.getSystemService("layout_inflater");
    LayoutInflater.from(this.mContext).inflate(R.i.cDh, this);
    this.ktM = ((ProgressBar)findViewById(R.h.bRl));
    this.qCP = ((TextView)findViewById(R.h.bRk));
    this.qCQ = ((TextView)findViewById(R.h.bRm));
    this.qCQ.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(12537277972480L, 93410);
        if (NoiseDetectMaskView.a(NoiseDetectMaskView.this) != null) {
          NoiseDetectMaskView.a(NoiseDetectMaskView.this).btn();
        }
        GMTrace.o(12537277972480L, 93410);
      }
    });
    findViewById(R.h.bJU).setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(12513521434624L, 93233);
        if (NoiseDetectMaskView.b(NoiseDetectMaskView.this) != null) {
          NoiseDetectMaskView.b(NoiseDetectMaskView.this).btm();
        }
        GMTrace.o(12513521434624L, 93233);
      }
    });
    GMTrace.o(12529895997440L, 93355);
  }
  
  public static abstract interface a
  {
    public abstract void btm();
  }
  
  public static abstract interface b
  {
    public abstract void btn();
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\voiceprint\ui\NoiseDetectMaskView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */