package com.tencent.mm.plugin.sns.ui;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.ad.k;
import com.tencent.mm.ad.u;
import com.tencent.mm.ad.u.a;
import com.tencent.mm.bj.d;
import com.tencent.mm.plugin.sns.i.a;
import com.tencent.mm.plugin.sns.i.f;
import com.tencent.mm.plugin.sns.i.g;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.e;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.i;
import com.tencent.mm.plugin.sns.storage.x;
import com.tencent.mm.protocal.c.abr;
import com.tencent.mm.protocal.c.abs;
import com.tencent.mm.protocal.c.vv;
import com.tencent.mm.protocal.c.vw;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.a;
import java.util.Map;

@a(3)
public class SnsAdNativeLandingPagesPreviewUI
  extends MMActivity
{
  public SnsAdNativeLandingPagesPreviewUI()
  {
    GMTrace.i(8720394223616L, 64972);
    GMTrace.o(8720394223616L, 64972);
  }
  
  private boolean g(Intent paramIntent, String paramString)
  {
    GMTrace.i(16631723982848L, 123916);
    long l = System.currentTimeMillis();
    if (e.Im(paramString))
    {
      com.tencent.mm.sdk.platformtools.w.i("SnsAdNativeLandingPagesPreviewUI", "isValidCanvas time cost " + (System.currentTimeMillis() - l));
      e.z(paramIntent, this);
      finish();
      if (paramIntent.getBooleanExtra("sns_landing_pages_need_enter_and_exit_animation", false)) {
        overridePendingTransition(0, 0);
      }
      for (;;)
      {
        GMTrace.o(16631723982848L, 123916);
        return true;
        overridePendingTransition(i.a.aMb, i.a.aMa);
      }
    }
    com.tencent.mm.sdk.platformtools.w.i("SnsAdNativeLandingPagesPreviewUI", "unknown canvas goto webview, " + paramString);
    int i = paramString.indexOf("<shareWebUrl>");
    if (i >= 0)
    {
      int j = paramString.indexOf("</shareWebUrl>");
      if (j > i + 13)
      {
        paramIntent = paramString.substring(i + 13, j);
        paramString = new Intent();
        paramString.putExtra("rawUrl", paramIntent);
        paramString.putExtra("showShare", true);
        d.b(this, "webview", ".ui.tools.WebViewUI", paramString);
        finish();
        overridePendingTransition(i.a.aMb, i.a.aMa);
        GMTrace.o(16631723982848L, 123916);
        return true;
      }
    }
    GMTrace.o(16631723982848L, 123916);
    return false;
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(8720662659072L, 64974);
    int i = i.g.pfq;
    GMTrace.o(8720662659072L, 64974);
    return i;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(8720528441344L, 64973);
    super.onCreate(paramBundle);
    com.tencent.mm.sdk.platformtools.w.i("SnsAdNativeLandingPagesPreviewUI", "setFullScreen");
    getWindow().getAttributes();
    getWindow().setFlags(1024, 1024);
    getWindow().getDecorView().setSystemUiVisibility(5126);
    Intent localIntent = getIntent();
    if (localIntent == null)
    {
      finish();
      GMTrace.o(8720528441344L, 64973);
      return;
    }
    final Object localObject = localIntent.getStringExtra("sns_landing_pages_xml");
    final int i;
    final long l;
    final String str;
    if (localIntent.hasExtra("sns_landing_pages_canvasid"))
    {
      i = 1;
      l = localIntent.getLongExtra("sns_landing_pages_pageid", 0L);
      str = localIntent.getStringExtra("sns_landing_pages_canvasid");
      paramBundle = (Bundle)localObject;
      if (TextUtils.isEmpty((CharSequence)localObject))
      {
        paramBundle = (Bundle)localObject;
        if (localIntent.getIntExtra("sns_landing_pages_no_store", 0) != 1)
        {
          if (i != 1) {
            break label316;
          }
          paramBundle = i.bly().P(str, 0, 0);
          label159:
          localIntent.putExtra("sns_landing_pages_xml", paramBundle);
        }
      }
      if (!TextUtils.isEmpty(paramBundle)) {
        break label439;
      }
      localObject = findViewById(i.f.bUy);
      ((View)localObject).setVisibility(0);
      paramBundle = new b.a();
      if ((i != 0) || (l <= 0L)) {
        break label329;
      }
      com.tencent.mm.sdk.platformtools.w.i("SnsAdNativeLandingPagesPreviewUI", "intent without canvas xml, pageId:%d", new Object[] { Long.valueOf(l) });
      paramBundle.gtF = new vv();
      paramBundle.gtG = new vw();
      paramBundle.uri = "/cgi-bin/mmoc-bin/adplayinfo/get_adcanvasinfo";
      paramBundle.gtE = 1286;
      paramBundle = paramBundle.DA();
      ((vv)paramBundle.gtC.gtK).uot = l;
    }
    for (;;)
    {
      u.a(paramBundle, new u.a()
      {
        public final int a(int paramAnonymousInt1, int paramAnonymousInt2, String paramAnonymousString, com.tencent.mm.ad.b paramAnonymousb, k paramAnonymousk)
        {
          GMTrace.i(16635884732416L, 123947);
          localObject.setVisibility(8);
          if ((paramAnonymousInt1 != 0) || (paramAnonymousInt2 != 0)) {
            if (i == 1) {
              com.tencent.mm.sdk.platformtools.w.e("SnsAdNativeLandingPagesPreviewUI", "cgi fail canvas id %s, errType %d,errCode %s", new Object[] { str, Integer.valueOf(paramAnonymousInt1), Integer.valueOf(paramAnonymousInt2) });
            }
          }
          for (;;)
          {
            SnsAdNativeLandingPagesPreviewUI.this.finish();
            GMTrace.o(16635884732416L, 123947);
            return 0;
            com.tencent.mm.sdk.platformtools.w.e("SnsAdNativeLandingPagesPreviewUI", "cgi fail page id %d, errType %d,errCode %d", new Object[] { Long.valueOf(l), Integer.valueOf(paramAnonymousInt1), Integer.valueOf(paramAnonymousInt2) });
            continue;
            if (i == 1)
            {
              paramAnonymousString = ((abs)paramAnonymousb.gtD.gtK).usl.bNS();
              com.tencent.mm.sdk.platformtools.w.i("SnsAdNativeLandingPagesPreviewUI", "getCanvasInfo canvasid %s ,xml %s", new Object[] { str, paramAnonymousString });
              if (!TextUtils.isEmpty(paramAnonymousString))
              {
                this.val$intent.putExtra("sns_landing_pages_xml", paramAnonymousString);
                SnsAdNativeLandingPagesPreviewUI.a(SnsAdNativeLandingPagesPreviewUI.this, this.val$intent, paramAnonymousString);
                paramAnonymousb = i.bly();
                paramAnonymousk = str;
                if ((!TextUtils.isEmpty(paramAnonymousString)) && (!TextUtils.isEmpty(paramAnonymousk)))
                {
                  paramAnonymousb.pLW.put(paramAnonymousk, paramAnonymousString);
                  com.tencent.mm.plugin.sns.storage.w localw = new com.tencent.mm.plugin.sns.storage.w();
                  localw.field_canvasId = paramAnonymousk;
                  localw.field_canvasXml = paramAnonymousString;
                  paramAnonymousb.pLV.a(localw);
                }
              }
            }
            else
            {
              paramAnonymousString = (vw)paramAnonymousb.gtD.gtK;
              com.tencent.mm.sdk.platformtools.w.i("SnsAdNativeLandingPagesPreviewUI", "getCanvasInfo pageid %d ,xml %s", new Object[] { Long.valueOf(l), paramAnonymousString.uou });
              if (!TextUtils.isEmpty(paramAnonymousString.uou))
              {
                this.val$intent.putExtra("sns_landing_pages_xml", paramAnonymousString.uou);
                SnsAdNativeLandingPagesPreviewUI.a(SnsAdNativeLandingPagesPreviewUI.this, this.val$intent, paramAnonymousString.uou);
                i.bly().o(l, paramAnonymousString.uou);
              }
            }
          }
        }
      });
      GMTrace.o(8720528441344L, 64973);
      return;
      i = 0;
      break;
      label316:
      paramBundle = i.bly().e(l, 0, 0);
      break label159;
      label329:
      if ((i != 1) || (bg.nm(str))) {
        break label418;
      }
      com.tencent.mm.sdk.platformtools.w.i("SnsAdNativeLandingPagesPreviewUI", "intent without canvas xml, canvasId:%s", new Object[] { str });
      paramBundle.gtF = new abr();
      paramBundle.gtG = new abs();
      paramBundle.uri = "/cgi-bin/mmux-bin/wxaapp/mmuxwxa_getofficialcanvasinfo";
      paramBundle.gtE = 1890;
      paramBundle = paramBundle.DA();
      ((abr)paramBundle.gtC.gtK).usk = str;
    }
    label418:
    com.tencent.mm.sdk.platformtools.w.e("SnsAdNativeLandingPagesPreviewUI", "intent without canvas xml, or pageId!");
    finish();
    GMTrace.o(8720528441344L, 64973);
    return;
    label439:
    if (g(localIntent, paramBundle))
    {
      GMTrace.o(8720528441344L, 64973);
      return;
    }
    finish();
    GMTrace.o(8720528441344L, 64973);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes4-dex2jar.jar!\com\tencent\mm\plugin\sns\ui\SnsAdNativeLandingPagesPreviewUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */