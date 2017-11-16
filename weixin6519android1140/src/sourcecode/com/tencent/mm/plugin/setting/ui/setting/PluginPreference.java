package com.tencent.mm.plugin.setting.ui.setting;

import android.content.Context;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.ac.d;
import com.tencent.mm.ac.d.a;
import com.tencent.mm.ac.n;
import com.tencent.mm.g.b.af;
import com.tencent.mm.pluginsdk.ui.a.b;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.ar;
import com.tencent.mm.storage.x;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.y.at;
import com.tencent.mm.y.c;

public final class PluginPreference
  extends Preference
  implements d.a
{
  private MMActivity ezR;
  private ImageView gDc;
  int kXa;
  String oGN;
  String oGO;
  private String oGP;
  private int oGQ;
  private int oGR;
  boolean oGS;
  
  public PluginPreference(Context paramContext)
  {
    this(paramContext, null);
    GMTrace.i(4651046928384L, 34653);
    GMTrace.o(4651046928384L, 34653);
  }
  
  public PluginPreference(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
    GMTrace.i(4651181146112L, 34654);
    GMTrace.o(4651181146112L, 34654);
  }
  
  public PluginPreference(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(4651315363840L, 34655);
    this.oGP = "";
    this.oGQ = -1;
    this.oGR = 8;
    this.oGS = false;
    this.gDc = null;
    this.kXa = 255;
    this.ezR = ((MMActivity)paramContext);
    setLayoutResource(R.i.cBA);
    n.Dh().a(this);
    GMTrace.o(4651315363840L, 34655);
  }
  
  public final boolean Gl(String paramString)
  {
    GMTrace.i(4651449581568L, 34656);
    at.AR();
    paramString = c.yK().TE(paramString);
    if ((paramString == null) || ((int)paramString.fTq == 0))
    {
      w.e("MicroMsg.PluginPreference", "plugin do not exist");
      GMTrace.o(4651449581568L, 34656);
      return false;
    }
    this.oGN = paramString.field_username;
    this.oGO = paramString.vj();
    setKey("settings_plugins_list_#" + this.oGN);
    GMTrace.o(4651449581568L, 34656);
    return true;
  }
  
  public final void bbE()
  {
    GMTrace.i(4651583799296L, 34657);
    if (this.gDc != null) {
      a.b.a(this.gDc, this.oGN);
    }
    GMTrace.o(4651583799296L, 34657);
  }
  
  public final void ib(String paramString)
  {
    GMTrace.i(4652120670208L, 34661);
    if ((this.oGN != null) && (this.oGN.equals(paramString))) {
      new ae(Looper.getMainLooper()).post(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(4663663394816L, 34747);
          PluginPreference.this.bbE();
          GMTrace.o(4663663394816L, 34747);
        }
      });
    }
    GMTrace.o(4652120670208L, 34661);
  }
  
  protected final void onBindView(View paramView)
  {
    GMTrace.i(4651852234752L, 34659);
    super.onBindView(paramView);
    this.gDc = ((ImageView)paramView.findViewById(R.h.bGN));
    this.gDc.setAlpha(this.kXa);
    TextView localTextView = (TextView)paramView.findViewById(R.h.cgQ);
    if (localTextView != null)
    {
      localTextView.setVisibility(this.oGR);
      localTextView.setText(this.oGP);
      if (this.oGQ != -1) {
        localTextView.setBackgroundDrawable(com.tencent.mm.br.a.b(this.ezR, this.oGQ));
      }
    }
    paramView = (TextView)paramView.findViewById(R.h.bQa);
    if (paramView != null) {
      if (!this.oGS) {
        break label134;
      }
    }
    label134:
    for (int i = 0;; i = 8)
    {
      paramView.setVisibility(i);
      bbE();
      GMTrace.o(4651852234752L, 34659);
      return;
    }
  }
  
  protected final View onCreateView(ViewGroup paramViewGroup)
  {
    GMTrace.i(4651718017024L, 34658);
    paramViewGroup = super.onCreateView(paramViewGroup);
    LayoutInflater localLayoutInflater = (LayoutInflater)this.mContext.getSystemService("layout_inflater");
    ViewGroup localViewGroup = (ViewGroup)paramViewGroup.findViewById(R.h.content);
    localViewGroup.removeAllViews();
    localLayoutInflater.inflate(R.i.cBP, localViewGroup);
    GMTrace.o(4651718017024L, 34658);
    return paramViewGroup;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\setting\ui\setting\PluginPreference.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */