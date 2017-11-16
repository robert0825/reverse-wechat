package com.tencent.mm.plugin.webview.modeltools;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.l;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.pluginsdk.model.q;
import com.tencent.mm.pluginsdk.model.u;
import com.tencent.mm.pluginsdk.ui.tools.AppChooserUI;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;

public final class a
{
  public a()
  {
    GMTrace.i(11982153449472L, 89274);
    GMTrace.o(11982153449472L, 89274);
  }
  
  public static Intent a(MMActivity paramMMActivity, Intent paramIntent, String paramString)
  {
    GMTrace.i(16316178104320L, 121565);
    Bundle localBundle = new Bundle();
    localBundle.putString("targeturl", paramString);
    localBundle.putParcelable("targetintent", paramIntent);
    paramString = new Intent();
    paramString.setClass(paramMMActivity, AppChooserUI.class);
    paramString.putExtra("scene", 4);
    paramString.putExtra("type", 0);
    paramString.putExtra("title", paramMMActivity.getString(R.l.dhQ));
    paramString.putExtra("targetintent", paramIntent);
    paramString.putExtra("transferback", localBundle);
    GMTrace.o(16316178104320L, 121565);
    return paramString;
  }
  
  public static boolean a(MMActivity paramMMActivity, int paramInt1, int paramInt2, Intent paramIntent)
  {
    GMTrace.i(16316312322048L, 121566);
    if (2 == paramInt1)
    {
      String str;
      Bundle localBundle;
      boolean bool;
      if ((-1 == paramInt2) && (paramIntent != null))
      {
        str = paramIntent.getStringExtra("selectpkg");
        localBundle = paramIntent.getBundleExtra("transferback");
        bool = paramIntent.getBooleanExtra("isalways", false);
        w.i("MicroMsg.BrowserChooserHelper", "App Chooser Browser is %s", new Object[] { str });
        u.bJl();
        paramIntent = (q)u.s(0, null);
        if (!paramIntent.Og(str)) {
          break label217;
        }
        if (!paramIntent.dI(paramMMActivity)) {
          break label147;
        }
        q.aO(paramMMActivity, localBundle.getString("targeturl"));
        if (!bool) {
          break label187;
        }
        g.ork.i(10998, new Object[] { Integer.valueOf(4), Integer.valueOf(2) });
      }
      for (;;)
      {
        GMTrace.o(16316312322048L, 121566);
        return true;
        label147:
        paramIntent = new Intent((Intent)localBundle.getParcelable("targetintent"));
        paramIntent.setPackage(str);
        paramIntent.addFlags(524288);
        paramMMActivity.startActivity(paramIntent);
        break;
        label187:
        g.ork.i(10998, new Object[] { Integer.valueOf(4), Integer.valueOf(1) });
        continue;
        label217:
        paramIntent = new Intent((Intent)localBundle.getParcelable("targetintent"));
        paramIntent.setPackage(str);
        paramIntent.addFlags(524288);
        paramMMActivity.startActivity(paramIntent);
        g.ork.i(10998, new Object[] { Integer.valueOf(5) });
        if (bool) {
          g.ork.i(10998, new Object[] { Integer.valueOf(5), Integer.valueOf(2) });
        } else {
          g.ork.i(10998, new Object[] { Integer.valueOf(5), Integer.valueOf(1) });
        }
      }
    }
    GMTrace.o(16316312322048L, 121566);
    return false;
  }
  
  public static void d(MMActivity paramMMActivity, String paramString)
  {
    GMTrace.i(16316043886592L, 121564);
    if ((paramMMActivity == null) || (paramMMActivity.isFinishing()) || (bg.nm(paramString)))
    {
      GMTrace.o(16316043886592L, 121564);
      return;
    }
    String str = paramString;
    if (!paramString.startsWith("http://"))
    {
      str = paramString;
      if (!paramString.startsWith("https://")) {
        str = "http://" + paramString;
      }
    }
    paramString = new Intent("android.intent.action.VIEW", Uri.parse(str));
    try
    {
      if (bg.Jw())
      {
        paramMMActivity.startActivity(paramString);
        GMTrace.o(16316043886592L, 121564);
        return;
      }
    }
    catch (Exception paramMMActivity)
    {
      w.e("MicroMsg.BrowserChooserHelper", "open in browser failed : %s", new Object[] { paramMMActivity.getMessage() });
      GMTrace.o(16316043886592L, 121564);
      return;
    }
    paramMMActivity.startActivityForResult(a(paramMMActivity, paramString, str), 2);
    GMTrace.o(16316043886592L, 121564);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\webview\modeltools\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */