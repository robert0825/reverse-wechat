package com.tencent.mm.plugin.scanner.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.l;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.base.preference.Preference;

public class VcardContactUserHeaderPreference
  extends Preference
{
  String aDn;
  private final Context context;
  private TextView mbd;
  String otY;
  private ImageView ozP;
  private TextView ozQ;
  private TextView ozR;
  private TextView ozS;
  String ozT;
  String title;
  
  public VcardContactUserHeaderPreference(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(6158446231552L, 45884);
    this.context = paramContext;
    GMTrace.o(6158446231552L, 45884);
  }
  
  public VcardContactUserHeaderPreference(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(6158580449280L, 45885);
    this.context = paramContext;
    GMTrace.o(6158580449280L, 45885);
  }
  
  protected final void onBindView(View paramView)
  {
    GMTrace.i(6158714667008L, 45886);
    super.onBindView(paramView);
    w.e("MicroMsg.scanner.VcardContactUserHeaderPreference", "onbindview");
    this.ozP = ((ImageView)paramView.findViewById(R.h.cjP));
    this.mbd = ((TextView)paramView.findViewById(R.h.cjQ));
    if (this.ozT != null) {
      this.mbd.setText(this.ozT);
    }
    this.ozQ = ((TextView)paramView.findViewById(R.h.cjR));
    if (this.aDn != null)
    {
      this.ozQ.setText(this.context.getString(R.l.efK, new Object[] { this.aDn }));
      this.ozQ.setVisibility(0);
    }
    this.ozR = ((TextView)paramView.findViewById(R.h.cjS));
    if (this.otY != null)
    {
      this.ozR.setText(this.context.getString(R.l.efM, new Object[] { this.otY }));
      this.ozR.setVisibility(0);
    }
    this.ozS = ((TextView)paramView.findViewById(R.h.cjT));
    if (this.title != null)
    {
      this.ozS.setText(this.context.getString(R.l.efN, new Object[] { this.title }));
      this.ozS.setVisibility(0);
    }
    GMTrace.o(6158714667008L, 45886);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\scanner\ui\VcardContactUserHeaderPreference.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */