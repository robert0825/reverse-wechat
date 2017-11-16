package com.tencent.mm.plugin.appbrand.dynamic.ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ipcinvoker.e;
import com.tencent.mm.ipcinvoker.type.IPCInteger;
import com.tencent.mm.ipcinvoker.type.IPCVoid;
import com.tencent.mm.plugin.appbrand.appcache.c.a;
import com.tencent.mm.plugin.appbrand.dynamic.debugger.DebuggerInfo;
import com.tencent.mm.plugin.appbrand.q.a.b;
import com.tencent.mm.plugin.appbrand.q.a.c;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.p;
import com.tencent.mm.ui.widget.MMSwitchBtn;
import com.tencent.mm.ui.widget.MMSwitchBtn.a;
import java.util.ArrayList;

public class WxaWidgetSettingsUI
  extends MMActivity
{
  String appId;
  int eII;
  Button hVL;
  Button hVM;
  
  public WxaWidgetSettingsUI()
  {
    GMTrace.i(18329980895232L, 136569);
    GMTrace.o(18329980895232L, 136569);
  }
  
  private void iv(int paramInt)
  {
    GMTrace.i(18851282550784L, 140453);
    this.hVL.setTag(Integer.valueOf(paramInt));
    switch (paramInt)
    {
    default: 
      this.hVL.setText(getString(a.c.iUF, new Object[] { "MHardwareAccelerateDrawableView" }));
      com.tencent.mm.plugin.appbrand.dynamic.widget.b.iz(0);
      GMTrace.o(18851282550784L, 140453);
      return;
    case 1: 
      this.hVL.setText(getString(a.c.iUF, new Object[] { "MTextureView" }));
      com.tencent.mm.plugin.appbrand.dynamic.widget.b.iz(1);
      GMTrace.o(18851282550784L, 140453);
      return;
    case 2: 
      this.hVL.setText(getString(a.c.iUF, new Object[] { "MSurfaceView" }));
      com.tencent.mm.plugin.appbrand.dynamic.widget.b.iz(2);
      GMTrace.o(18851282550784L, 140453);
      return;
    case 3: 
      this.hVL.setText(getString(a.c.iUF, new Object[] { "MCanvasView" }));
      com.tencent.mm.plugin.appbrand.dynamic.widget.b.iz(3);
      GMTrace.o(18851282550784L, 140453);
      return;
    }
    this.hVL.setText(getString(a.c.iUF, new Object[] { "MDrawableView" }));
    com.tencent.mm.plugin.appbrand.dynamic.widget.b.iz(4);
    GMTrace.o(18851282550784L, 140453);
  }
  
  private void iw(int paramInt)
  {
    GMTrace.i(19925829681152L, 148459);
    this.hVM.setTag(Integer.valueOf(paramInt));
    String str;
    switch (paramInt)
    {
    default: 
      str = "normal";
    }
    for (paramInt = 0;; paramInt = 2)
    {
      this.hVM.setText(String.format("JSON parser : %s", new Object[] { str }));
      com.tencent.mm.u.g.fd(paramInt);
      e.a("com.tencent.mm:support", new IPCInteger(paramInt), a.class, null);
      GMTrace.o(19925829681152L, 148459);
      return;
      str = "minimal-json";
    }
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(18330249330688L, 136571);
    int i = a.b.iUy;
    GMTrace.o(18330249330688L, 136571);
    return i;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    boolean bool2 = false;
    GMTrace.i(18330115112960L, 136570);
    super.onCreate(paramBundle);
    a(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(18328236064768L, 136556);
        WxaWidgetSettingsUI.this.finish();
        GMTrace.o(18328236064768L, 136556);
        return false;
      }
    });
    oM(a.c.iUE);
    this.appId = getIntent().getStringExtra("app_id");
    this.eII = getIntent().getIntExtra("pkg_type", 0);
    MMSwitchBtn localMMSwitchBtn = (MMSwitchBtn)findViewById(com.tencent.mm.plugin.appbrand.q.a.a.iUl);
    paramBundle = com.tencent.mm.plugin.appbrand.dynamic.debugger.b.pL(this.appId);
    if ((paramBundle != null) && (paramBundle.hTv)) {}
    for (boolean bool1 = true;; bool1 = false)
    {
      localMMSwitchBtn.mK(bool1);
      localMMSwitchBtn.xrE = new MMSwitchBtn.a()
      {
        public final void cc(boolean paramAnonymousBoolean)
        {
          GMTrace.i(18318706606080L, 136485);
          DebuggerInfo localDebuggerInfo2 = com.tencent.mm.plugin.appbrand.dynamic.debugger.b.pL(WxaWidgetSettingsUI.this.appId);
          DebuggerInfo localDebuggerInfo1 = localDebuggerInfo2;
          if (localDebuggerInfo2 == null)
          {
            localDebuggerInfo1 = new DebuggerInfo();
            com.tencent.mm.plugin.appbrand.dynamic.debugger.b.a(WxaWidgetSettingsUI.this.appId, localDebuggerInfo1);
          }
          localDebuggerInfo1.hTv = paramAnonymousBoolean;
          GMTrace.o(18318706606080L, 136485);
        }
      };
      localMMSwitchBtn = (MMSwitchBtn)findViewById(com.tencent.mm.plugin.appbrand.q.a.a.iUa);
      if ((paramBundle == null) || (!paramBundle.hTt))
      {
        bool1 = bool2;
        if (!c.a.fI(this.eII)) {}
      }
      else
      {
        bool1 = true;
      }
      localMMSwitchBtn.mK(bool1);
      localMMSwitchBtn.setEnabled(c.a.hX(this.eII));
      localMMSwitchBtn.xrE = new MMSwitchBtn.a()
      {
        public final void cc(boolean paramAnonymousBoolean)
        {
          GMTrace.i(18328504500224L, 136558);
          DebuggerInfo localDebuggerInfo2 = com.tencent.mm.plugin.appbrand.dynamic.debugger.b.pL(WxaWidgetSettingsUI.this.appId);
          DebuggerInfo localDebuggerInfo1 = localDebuggerInfo2;
          if (localDebuggerInfo2 == null)
          {
            localDebuggerInfo1 = new DebuggerInfo();
            com.tencent.mm.plugin.appbrand.dynamic.debugger.b.a(WxaWidgetSettingsUI.this.appId, localDebuggerInfo1);
          }
          localDebuggerInfo1.hTt = paramAnonymousBoolean;
          GMTrace.o(18328504500224L, 136558);
        }
      };
      this.hVL = ((Button)findViewById(com.tencent.mm.plugin.appbrand.q.a.a.iTZ));
      iv(com.tencent.mm.plugin.appbrand.dynamic.widget.b.Vs());
      this.hVL.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(final View paramAnonymousView)
        {
          GMTrace.i(18850879897600L, 140450);
          paramAnonymousView = new ArrayList();
          paramAnonymousView.add("MHardwareAccelerateDrawableView");
          paramAnonymousView.add("MTextureView");
          paramAnonymousView.add("MSurfaceView");
          paramAnonymousView.add("MCanvasView");
          paramAnonymousView.add("MDrawableView");
          paramAnonymousView = new com.tencent.mm.ui.widget.picker.a(WxaWidgetSettingsUI.this.vKB.vKW, paramAnonymousView);
          paramAnonymousView.Ey(((Integer)WxaWidgetSettingsUI.this.hVL.getTag()).intValue());
          paramAnonymousView.xuq = new com.tencent.mm.ui.widget.picker.a.a()
          {
            public final void d(boolean paramAnonymous2Boolean, Object paramAnonymous2Object)
            {
              GMTrace.i(18851148333056L, 140452);
              paramAnonymousView.hide();
              if (paramAnonymous2Boolean) {
                WxaWidgetSettingsUI.this.hVL.setText((CharSequence)paramAnonymous2Object);
              }
              WxaWidgetSettingsUI.a(WxaWidgetSettingsUI.this, paramAnonymousView.cjK());
              GMTrace.o(18851148333056L, 140452);
            }
          };
          paramAnonymousView.Ex(com.tencent.mm.br.a.fromDPToPix(WxaWidgetSettingsUI.this.vKB.vKW, 288));
          paramAnonymousView.show();
          GMTrace.o(18850879897600L, 140450);
        }
      });
      this.hVM = ((Button)findViewById(com.tencent.mm.plugin.appbrand.q.a.a.iUc));
      iw(com.tencent.mm.u.g.wv());
      this.hVM.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(final View paramAnonymousView)
        {
          GMTrace.i(19925158592512L, 148454);
          paramAnonymousView = new ArrayList();
          paramAnonymousView.add("Normal");
          paramAnonymousView.add("Minimal-json");
          paramAnonymousView = new com.tencent.mm.ui.widget.picker.a(WxaWidgetSettingsUI.this.vKB.vKW, paramAnonymousView);
          paramAnonymousView.Ey(((Integer)WxaWidgetSettingsUI.this.hVM.getTag()).intValue());
          paramAnonymousView.xuq = new com.tencent.mm.ui.widget.picker.a.a()
          {
            public final void d(boolean paramAnonymous2Boolean, Object paramAnonymous2Object)
            {
              GMTrace.i(19925427027968L, 148456);
              paramAnonymousView.hide();
              if (paramAnonymous2Boolean) {
                WxaWidgetSettingsUI.this.hVM.setText((CharSequence)paramAnonymous2Object);
              }
              WxaWidgetSettingsUI.b(WxaWidgetSettingsUI.this, paramAnonymousView.cjK());
              GMTrace.o(19925427027968L, 148456);
            }
          };
          paramAnonymousView.Ex(com.tencent.mm.br.a.fromDPToPix(WxaWidgetSettingsUI.this.vKB.vKW, 288));
          paramAnonymousView.show();
          GMTrace.o(19925158592512L, 148454);
        }
      });
      GMTrace.o(18330115112960L, 136570);
      return;
    }
  }
  
  private static class a
    implements com.tencent.mm.ipcinvoker.g<IPCInteger, IPCVoid>
  {
    private a()
    {
      GMTrace.i(19924755939328L, 148451);
      GMTrace.o(19924755939328L, 148451);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\dynamic\ui\WxaWidgetSettingsUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */