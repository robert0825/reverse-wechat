package com.tencent.mm.plugin.safedevice.ui;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.ad.e;
import com.tencent.mm.ad.k;
import com.tencent.mm.ad.n;
import com.tencent.mm.plugin.safedevice.a.c;
import com.tencent.mm.plugin.safedevice.a.d;
import com.tencent.mm.plugin.safedevice.a.f;
import com.tencent.mm.pluginsdk.l;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.y.at;

public class SafeDeviceListPreference
  extends Preference
  implements e
{
  public Context context;
  public ProgressDialog htG;
  private Button jUq;
  private int mode;
  c osa;
  private boolean osb;
  a osc;
  b osd;
  
  public SafeDeviceListPreference(Context paramContext)
  {
    this(paramContext, null);
    GMTrace.i(12859400519680L, 95810);
    GMTrace.o(12859400519680L, 95810);
  }
  
  public SafeDeviceListPreference(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
    GMTrace.i(12859534737408L, 95811);
    GMTrace.o(12859534737408L, 95811);
  }
  
  public SafeDeviceListPreference(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(12859668955136L, 95812);
    this.mode = -2;
    this.osb = false;
    this.context = paramContext;
    GMTrace.o(12859668955136L, 95812);
  }
  
  private void MP()
  {
    GMTrace.i(12860340043776L, 95817);
    if (!this.osb)
    {
      w.d("MicroMsg.SafeDeviceListPreference", "has not binded");
      GMTrace.o(12860340043776L, 95817);
      return;
    }
    switch (this.mode)
    {
    case -1: 
    case 0: 
    default: 
      setWidgetLayoutResource(R.i.cCj);
    case 1: 
      do
      {
        GMTrace.o(12860340043776L, 95817);
        return;
        setWidgetLayoutResource(R.i.cup);
      } while (this.jUq == null);
      this.jUq.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(12876311953408L, 95936);
          paramAnonymousView = SafeDeviceListPreference.this;
          h.a(paramAnonymousView.context, paramAnonymousView.context.getString(R.l.dUq, new Object[] { paramAnonymousView.osa.field_name }), "", com.tencent.mm.br.a.X(paramAnonymousView.context, R.l.dUr), com.tencent.mm.br.a.X(paramAnonymousView.context, R.l.cSk), new SafeDeviceListPreference.1(paramAnonymousView), new SafeDeviceListPreference.2(paramAnonymousView));
          GMTrace.o(12876311953408L, 95936);
        }
      });
      GMTrace.o(12860340043776L, 95817);
      return;
    }
    setWidgetLayoutResource(R.i.cCj);
    GMTrace.o(12860340043776L, 95817);
  }
  
  public final void NY()
  {
    GMTrace.i(12860205826048L, 95816);
    at.wS().b(362, this);
    GMTrace.o(12860205826048L, 95816);
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(12860474261504L, 95818);
    NY();
    if ((this.htG != null) && (this.htG.isShowing()))
    {
      this.htG.dismiss();
      this.htG = null;
    }
    if ((paramInt2 == 0) && (paramInt2 == 0))
    {
      f.bcf().a(this.osa, new String[0]);
      if (this.osd != null)
      {
        this.osd.FK(this.hiu);
        GMTrace.o(12860474261504L, 95818);
      }
    }
    else
    {
      if (com.tencent.mm.plugin.c.a.hnI.a(this.context, paramInt1, paramInt2, paramString))
      {
        GMTrace.o(12860474261504L, 95818);
        return;
      }
      Toast.makeText(this.context, this.context.getString(R.l.dUs, new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) }), 0).show();
      if (this.osc != null) {
        this.osc.FL(this.osa.field_uid);
      }
    }
    GMTrace.o(12860474261504L, 95818);
  }
  
  protected final void onBindView(View paramView)
  {
    GMTrace.i(12859937390592L, 95814);
    this.osb = true;
    this.jUq = ((Button)paramView.findViewById(R.h.bta));
    MP();
    super.onBindView(paramView);
    GMTrace.o(12859937390592L, 95814);
  }
  
  protected final View onCreateView(ViewGroup paramViewGroup)
  {
    GMTrace.i(12859803172864L, 95813);
    paramViewGroup = super.onCreateView(paramViewGroup);
    LayoutInflater localLayoutInflater = (LayoutInflater)this.context.getSystemService("layout_inflater");
    ViewGroup localViewGroup = (ViewGroup)paramViewGroup.findViewById(R.h.content);
    if (localViewGroup != null)
    {
      localViewGroup.removeAllViews();
      localLayoutInflater.inflate(R.i.cBZ, localViewGroup);
    }
    GMTrace.o(12859803172864L, 95813);
    return paramViewGroup;
  }
  
  public final void ts(int paramInt)
  {
    GMTrace.i(12860071608320L, 95815);
    this.mode = paramInt;
    MP();
    GMTrace.o(12860071608320L, 95815);
  }
  
  public static abstract interface a
  {
    public abstract void FL(String paramString);
  }
  
  public static abstract interface b
  {
    public abstract void FK(String paramString);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\safedevice\ui\SafeDeviceListPreference.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */