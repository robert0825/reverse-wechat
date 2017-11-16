package com.tencent.mm.plugin.profile.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.g;
import com.tencent.mm.R.h;
import com.tencent.mm.R.l;
import com.tencent.mm.g.b.af;
import com.tencent.mm.pluginsdk.ui.a.b;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.x;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.ui.tools.r;
import junit.framework.Assert;

public class HelperHeaderPreference
  extends Preference
{
  private ImageView hqg;
  private TextView hql;
  private TextView hvS;
  private x iBi;
  private TextView nNR;
  private a nNS;
  private boolean nNT;
  
  public HelperHeaderPreference(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(6802557108224L, 50683);
    this.nNT = false;
    GMTrace.o(6802557108224L, 50683);
  }
  
  public HelperHeaderPreference(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(6802691325952L, 50684);
    this.nNT = false;
    GMTrace.o(6802691325952L, 50684);
  }
  
  private void MP()
  {
    GMTrace.i(6803093979136L, 50687);
    if ((!this.nNT) || (this.iBi == null))
    {
      w.w("MicroMsg.HelperHeaderPreference", "initView : bindView = " + this.nNT + "contact = " + this.iBi);
      GMTrace.o(6803093979136L, 50687);
      return;
    }
    Object localObject = this.iBi.field_username;
    w.d("MicroMsg.HelperHeaderPreference", "updateAvatar : user = " + (String)localObject);
    if ((this.hqg != null) && (this.iBi.field_username.equals(localObject))) {
      a.b.a(this.hqg, (String)localObject);
    }
    if (this.nNR != null) {
      this.nNR.setText(this.iBi.vj());
    }
    if (this.nNS != null)
    {
      this.nNS.a(this);
      localObject = this.nNS.getHint();
      if (localObject != null)
      {
        this.hvS.setText((CharSequence)localObject);
        this.hvS.setVisibility(0);
        GMTrace.o(6803093979136L, 50687);
        return;
      }
      this.hvS.setVisibility(8);
    }
    GMTrace.o(6803093979136L, 50687);
  }
  
  public final void a(x paramx, a parama)
  {
    GMTrace.i(6803228196864L, 50688);
    if (paramx != null) {}
    for (boolean bool = true;; bool = false)
    {
      Assert.assertTrue(bool);
      this.iBi = paramx;
      this.nNS = parama;
      MP();
      GMTrace.o(6803228196864L, 50688);
      return;
    }
  }
  
  public final void gD(boolean paramBoolean)
  {
    GMTrace.i(6802959761408L, 50686);
    if (this.nNS == null)
    {
      GMTrace.o(6802959761408L, 50686);
      return;
    }
    if (paramBoolean)
    {
      this.hql.setTextColor(r.fF(this.mContext));
      this.hql.setText(R.l.dZX);
      this.hql.setCompoundDrawablesWithIntrinsicBounds(R.g.baF, 0, 0, 0);
      GMTrace.o(6802959761408L, 50686);
      return;
    }
    this.hql.setTextColor(r.fG(this.mContext));
    this.hql.setText(R.l.eae);
    this.hql.setCompoundDrawablesWithIntrinsicBounds(R.g.baE, 0, 0, 0);
    GMTrace.o(6802959761408L, 50686);
  }
  
  public final void onBindView(View paramView)
  {
    GMTrace.i(6802825543680L, 50685);
    this.hqg = ((ImageView)paramView.findViewById(R.h.bqt));
    this.hql = ((TextView)paramView.findViewById(R.h.brg));
    this.nNR = ((TextView)paramView.findViewById(R.h.bqQ));
    this.hvS = ((TextView)paramView.findViewById(R.h.bqD));
    this.nNT = true;
    MP();
    super.onBindView(paramView);
    GMTrace.o(6802825543680L, 50685);
  }
  
  public static abstract interface a
  {
    public abstract void a(HelperHeaderPreference paramHelperHeaderPreference);
    
    public abstract CharSequence getHint();
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\profile\ui\HelperHeaderPreference.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */