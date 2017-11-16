package com.tencent.mm.plugin.safedevice.ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.k;
import com.tencent.mm.R.l;
import com.tencent.mm.plugin.safedevice.a;
import com.tencent.mm.pluginsdk.m;
import com.tencent.mm.ui.MMWizardActivity;

public class BindSafeDeviceUI
  extends MMWizardActivity
{
  public BindSafeDeviceUI()
  {
    GMTrace.i(12876714606592L, 95939);
    GMTrace.o(12876714606592L, 95939);
  }
  
  protected final void MP()
  {
    GMTrace.i(12877117259776L, 95942);
    oM(R.l.dUg);
    a(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(12871345897472L, 95899);
        BindSafeDeviceUI.this.finish();
        GMTrace.o(12871345897472L, 95899);
        return true;
      }
    });
    ((ImageView)findViewById(R.h.cbc)).setImageResource(R.k.cIF);
    ((TextView)findViewById(R.h.cbd)).setText(R.l.dUm);
    ((TextView)findViewById(R.h.chx)).setText(R.l.dUn);
    findViewById(R.h.chx).setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(12861413785600L, 95825);
        paramAnonymousView = new Intent();
        paramAnonymousView.putExtra("is_bind_for_safe_device", true);
        BindSafeDeviceUI localBindSafeDeviceUI = BindSafeDeviceUI.this;
        a.hnH.b(localBindSafeDeviceUI, paramAnonymousView);
        GMTrace.o(12861413785600L, 95825);
      }
    });
    GMTrace.o(12877117259776L, 95942);
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(12876848824320L, 95940);
    int i = R.i.cFA;
    GMTrace.o(12876848824320L, 95940);
    return i;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(12876983042048L, 95941);
    super.onCreate(paramBundle);
    MP();
    GMTrace.o(12876983042048L, 95941);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\safedevice\ui\BindSafeDeviceUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */