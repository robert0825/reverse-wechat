package com.tencent.mm.plugin.appbrand.dynamic.ui;

import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.text.style.URLSpan;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.modelappbrand.d;
import com.tencent.mm.modelappbrand.e;
import com.tencent.mm.plugin.appbrand.dynamic.html.CustomURLSpan;
import com.tencent.mm.plugin.appbrand.q.a.a;
import com.tencent.mm.plugin.appbrand.q.a.b;
import com.tencent.mm.plugin.appbrand.q.a.c;
import com.tencent.mm.plugin.appbrand.widget.r;
import com.tencent.mm.plugin.appbrand.widget.s;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.p;
import com.tencent.mm.ui.widget.MMSwitchBtn;
import com.tencent.mm.ui.widget.MMSwitchBtn.a;

public class WxaWidgetDebugUI
  extends MMActivity
{
  String appId;
  int eII;
  int hKC;
  MMSwitchBtn hVB;
  r hVC;
  String id;
  
  public WxaWidgetDebugUI()
  {
    GMTrace.i(18325820145664L, 136538);
    GMTrace.o(18325820145664L, 136538);
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(18326088581120L, 136540);
    int i = a.b.iUw;
    GMTrace.o(18326088581120L, 136540);
    return i;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(18325954363392L, 136539);
    super.onCreate(paramBundle);
    a(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(18318169735168L, 136481);
        WxaWidgetDebugUI.this.finish();
        GMTrace.o(18318169735168L, 136481);
        return false;
      }
    });
    int i = a.c.iUA;
    if (((e)com.tencent.mm.kernel.h.h(e.class)).CH().CK()) {}
    TextView localTextView;
    for (paramBundle = String.format("(%s)", new Object[] { com.tencent.mm.plugin.appbrand.dynamic.widget.b.Vt() });; paramBundle = "")
    {
      sq(getString(i, new Object[] { paramBundle }));
      paramBundle = getIntent();
      this.id = paramBundle.getStringExtra("id");
      this.appId = paramBundle.getStringExtra("app_id");
      this.eII = paramBundle.getIntExtra("pkg_type", 0);
      this.hKC = paramBundle.getIntExtra("pkg_version", 0);
      Ve(String.format("(%s)", new Object[] { this.id }));
      this.hVB = ((MMSwitchBtn)findViewById(a.a.iUo));
      this.hVC = ((com.tencent.mm.plugin.appbrand.widget.a.a)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.appbrand.widget.a.a.class)).Sh().sO(this.appId);
      if (this.hVC == null)
      {
        this.hVC = new r();
        this.hVC.field_appId = this.appId;
      }
      this.hVB.mK(this.hVC.field_openDebug);
      this.hVB.xrE = new MMSwitchBtn.a()
      {
        public final void cc(boolean paramAnonymousBoolean)
        {
          GMTrace.i(18320451436544L, 136498);
          WxaWidgetDebugUI.this.hVC.field_openDebug = paramAnonymousBoolean;
          s locals = ((com.tencent.mm.plugin.appbrand.widget.a.a)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.appbrand.widget.a.a.class)).Sh();
          r localr = WxaWidgetDebugUI.this.hVC;
          if ((localr != null) && (!bg.nm(localr.field_appId)))
          {
            localr.field_appIdHash = localr.field_appId.hashCode();
            locals.a(localr);
          }
          GMTrace.o(18320451436544L, 136498);
        }
      };
      localTextView = (TextView)findViewById(a.a.iUb);
      localObject = Html.fromHtml(getString(a.c.iUB), new com.tencent.mm.plugin.appbrand.dynamic.html.a(), new com.tencent.mm.plugin.appbrand.dynamic.html.b());
      paramBundle = (Bundle)localObject;
      if (!(localObject instanceof Spannable)) {
        break;
      }
      i = ((CharSequence)localObject).length();
      Spannable localSpannable = (Spannable)localObject;
      URLSpan[] arrayOfURLSpan = (URLSpan[])localSpannable.getSpans(0, i, URLSpan.class);
      paramBundle = new SpannableStringBuilder((CharSequence)localObject);
      int j = arrayOfURLSpan.length;
      i = 0;
      while (i < j)
      {
        localObject = arrayOfURLSpan[i];
        paramBundle.removeSpan(localObject);
        paramBundle.setSpan(new CustomURLSpan(((URLSpan)localObject).getURL()), localSpannable.getSpanStart(localObject), localSpannable.getSpanEnd(localObject), 34);
        i += 1;
      }
    }
    localTextView.setText(paramBundle);
    localTextView.setMovementMethod(LinkMovementMethod.getInstance());
    findViewById(a.a.iUq).setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(18323404226560L, 136520);
        ((e)com.tencent.mm.kernel.h.h(e.class)).CG().restart();
        com.tencent.mm.bv.a.V(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(18326893887488L, 136546);
            Toast.makeText(WxaWidgetDebugUI.this.vKB.vKW, a.c.iUD, 1).show();
            GMTrace.o(18326893887488L, 136546);
          }
        });
        GMTrace.o(18323404226560L, 136520);
      }
    });
    findViewById(a.a.iUn).setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(18321256742912L, 136504);
        paramAnonymousView = new Intent(WxaWidgetDebugUI.this.vKB.vKW, WidgetConsoleUI.class);
        paramAnonymousView.setFlags(268435456);
        paramAnonymousView.putExtra("id", WxaWidgetDebugUI.this.id);
        paramAnonymousView.putExtra("app_id", WxaWidgetDebugUI.this.appId);
        paramAnonymousView.putExtra("pkg_type", WxaWidgetDebugUI.this.eII);
        paramAnonymousView.putExtra("pkg_version", WxaWidgetDebugUI.this.hKC);
        WxaWidgetDebugUI.this.startActivity(paramAnonymousView);
        GMTrace.o(18321256742912L, 136504);
      }
    });
    paramBundle = findViewById(a.a.iUs);
    Object localObject = findViewById(a.a.iUt);
    if (((e)com.tencent.mm.kernel.h.h(e.class)).CH().CK())
    {
      paramBundle.setVisibility(0);
      ((View)localObject).setVisibility(0);
      paramBundle.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(18317901299712L, 136479);
          paramAnonymousView = new Intent(WxaWidgetDebugUI.this.vKB.vKW, WxaWidgetPerformanceUI.class);
          paramAnonymousView.setFlags(268435456);
          WxaWidgetDebugUI.this.startActivity(paramAnonymousView);
          GMTrace.o(18317901299712L, 136479);
        }
      });
      ((View)localObject).setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(18318975041536L, 136487);
          paramAnonymousView = new Intent(WxaWidgetDebugUI.this.vKB.vKW, WxaWidgetSettingsUI.class);
          paramAnonymousView.putExtra("app_id", WxaWidgetDebugUI.this.appId);
          paramAnonymousView.putExtra("pkg_type", WxaWidgetDebugUI.this.eII);
          paramAnonymousView.putExtra("pkg_version", WxaWidgetDebugUI.this.hKC);
          WxaWidgetDebugUI.this.startActivity(paramAnonymousView);
          GMTrace.o(18318975041536L, 136487);
        }
      });
      GMTrace.o(18325954363392L, 136539);
      return;
    }
    paramBundle.setVisibility(8);
    ((View)localObject).setVisibility(8);
    GMTrace.o(18325954363392L, 136539);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\dynamic\ui\WxaWidgetDebugUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */