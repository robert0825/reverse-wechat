package com.tencent.mm.plugin.base.stub;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.k;
import com.tencent.mm.ad.n;
import com.tencent.mm.g.a.bz;
import com.tencent.mm.modelsimple.ai;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.y.at;
import java.net.URLDecoder;

public final class e
{
  public static void k(Activity paramActivity)
  {
    GMTrace.i(16084115652608L, 119836);
    Intent localIntent = new Intent();
    localIntent.setFlags(268435456);
    localIntent.setClassName(ab.getContext(), "com.tencent.mm.plugin.webview.ui.tools.WebViewUI");
    localIntent.putExtra("rawUrl", "https://support.weixin.qq.com/deeplink/noaccess#wechat_redirect");
    localIntent.putExtra("showShare", false);
    ab.getContext().startActivity(localIntent);
    if (paramActivity != null) {
      paramActivity.finish();
    }
    GMTrace.o(16084115652608L, 119836);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\base\stub\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */