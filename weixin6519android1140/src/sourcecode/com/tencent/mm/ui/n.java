package com.tencent.mm.ui;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.v.a.d;
import com.tencent.mm.v.a.g;
import com.tencent.mm.v.a.h;
import com.tencent.mm.v.a.l;

final class n
  extends Dialog
  implements DialogInterface
{
  private View iIG;
  private TextView kHZ;
  private Context mContext;
  private boolean oND;
  Button rot;
  private LinearLayout vKk;
  TextView vKl;
  private TextView vKm;
  LinearLayout vKn;
  private LinearLayout vKo;
  
  public n(Context paramContext)
  {
    super(paramContext, a.l.eme);
    GMTrace.i(19107772628992L, 142364);
    this.mContext = paramContext;
    this.vKk = ((LinearLayout)v.fb(this.mContext).inflate(a.h.gfa, null));
    this.rot = ((Button)this.vKk.findViewById(a.g.bNq));
    this.kHZ = ((TextView)this.vKk.findViewById(a.g.gdy));
    this.vKl = ((TextView)this.vKk.findViewById(a.g.bNk));
    this.vKm = ((TextView)this.vKk.findViewById(a.g.gdx));
    this.iIG = this.vKk.findViewById(a.g.gdz);
    this.vKn = ((LinearLayout)this.vKk.findViewById(a.g.bNl));
    this.vKo = ((LinearLayout)this.vKk.findViewById(a.g.gdw));
    setCanceledOnTouchOutside(true);
    GMTrace.o(19107772628992L, 142364);
  }
  
  private void AS(int paramInt)
  {
    GMTrace.i(19108309499904L, 142368);
    if (this.vKl != null) {
      this.vKl.setTextColor(this.vKl.getContext().getResources().getColor(paramInt));
    }
    GMTrace.o(19108309499904L, 142368);
  }
  
  public final void bXj()
  {
    GMTrace.i(19108577935360L, 142370);
    super.setCancelable(true);
    GMTrace.o(19108577935360L, 142370);
  }
  
  public final void dismiss()
  {
    GMTrace.i(19108846370816L, 142372);
    if (Looper.myLooper() != Looper.getMainLooper())
    {
      af.t(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(19097437863936L, 142287);
          n.this.dismiss();
          GMTrace.o(19097437863936L, 142287);
        }
      });
      w.e("MicroMsg.LiteDependDialog", bg.bQW().toString());
      GMTrace.o(19108846370816L, 142372);
      return;
    }
    try
    {
      super.dismiss();
      GMTrace.o(19108846370816L, 142372);
      return;
    }
    catch (Exception localException)
    {
      w.e("MicroMsg.LiteDependDialog", "dismiss exception, e = " + localException.getMessage());
      GMTrace.o(19108846370816L, 142372);
    }
  }
  
  protected final void onCreate(Bundle paramBundle)
  {
    GMTrace.i(19107906846720L, 142365);
    super.onCreate(paramBundle);
    setContentView(this.vKk);
    GMTrace.o(19107906846720L, 142365);
  }
  
  public final void setCancelable(boolean paramBoolean)
  {
    GMTrace.i(19108443717632L, 142369);
    super.setCancelable(paramBoolean);
    this.oND = paramBoolean;
    setCanceledOnTouchOutside(this.oND);
    GMTrace.o(19108443717632L, 142369);
  }
  
  public final void setTitle(int paramInt)
  {
    GMTrace.i(19108175282176L, 142367);
    this.iIG.setVisibility(0);
    this.kHZ.setVisibility(0);
    this.kHZ.setMaxLines(2);
    this.kHZ.setText(paramInt);
    AS(a.d.gcl);
    GMTrace.o(19108175282176L, 142367);
  }
  
  public final void setTitle(CharSequence paramCharSequence)
  {
    GMTrace.i(19108041064448L, 142366);
    this.iIG.setVisibility(0);
    this.kHZ.setVisibility(0);
    this.kHZ.setMaxLines(2);
    this.kHZ.setText(paramCharSequence);
    AS(a.d.gcl);
    GMTrace.o(19108041064448L, 142366);
  }
  
  public final void show()
  {
    GMTrace.i(19108712153088L, 142371);
    try
    {
      super.show();
      GMTrace.o(19108712153088L, 142371);
      return;
    }
    catch (Exception localException)
    {
      w.printErrStackTrace("MicroMsg.LiteDependDialog", localException, "", new Object[0]);
      GMTrace.o(19108712153088L, 142371);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */