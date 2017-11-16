package com.tencent.mm.plugin.wallet_core.id_verify.util;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface.OnDismissListener;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.ad.k;
import com.tencent.mm.bj.d;
import com.tencent.mm.plugin.wallet_core.ui.f;
import com.tencent.mm.plugin.wallet_core.ui.f.a;
import com.tencent.mm.plugin.wxpay.a.c;
import com.tencent.mm.plugin.wxpay.a.d;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.protocal.c.biw;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import com.tencent.mm.storage.w.a;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.i;
import java.lang.ref.WeakReference;
import org.json.JSONException;
import org.json.JSONObject;

public final class a
  implements com.tencent.mm.ad.e
{
  public int gRb;
  private a rdT;
  public WeakReference<MMActivity> rdU;
  public WeakReference<com.tencent.mm.wallet_core.d.b> rdV;
  private boolean rdW;
  public i rdX;
  
  public a()
  {
    GMTrace.i(6850070183936L, 51037);
    this.rdT = null;
    this.gRb = -1;
    this.rdW = false;
    GMTrace.o(6850070183936L, 51037);
  }
  
  public static void a(MMActivity paramMMActivity, com.tencent.mm.wallet_core.d.b paramb, String paramString1, String paramString2, String paramString3, String paramString4, a parama, boolean paramBoolean, int paramInt)
  {
    GMTrace.i(6850607054848L, 51041);
    new a().b(paramMMActivity, paramb, paramString1, paramString2, paramString3, paramString4, parama, paramBoolean, paramInt);
    GMTrace.o(6850607054848L, 51041);
  }
  
  public static boolean a(Activity paramActivity, int paramInt1, k paramk, Bundle paramBundle, int paramInt2)
  {
    GMTrace.i(6851143925760L, 51045);
    if (paramInt1 != 416)
    {
      w.i("MicroMsg.RealnameVerifyUtil", "don't need realname verify");
      GMTrace.o(6851143925760L, 51045);
      return false;
    }
    w.i("MicroMsg.RealnameVerifyUtil", "need realname verify");
    boolean bool = a(paramActivity, paramk, paramBundle, false, null, paramInt2, 2);
    GMTrace.o(6851143925760L, 51045);
    return bool;
  }
  
  public static boolean a(Activity paramActivity, Bundle paramBundle, int paramInt)
  {
    GMTrace.i(17835791220736L, 132887);
    w.i("MicroMsg.RealnameVerifyUtil", "showRealnameDialog call %d", new Object[] { Integer.valueOf(0) });
    w.i("MicroMsg.RealnameVerifyUtil", "showRealnameDialog click OK");
    Bundle localBundle = paramBundle;
    if (paramBundle == null) {
      localBundle = new Bundle();
    }
    localBundle.putInt("real_name_verify_mode", 0);
    localBundle.putInt("entry_scene", paramInt);
    com.tencent.mm.wallet_core.a.a(paramActivity, com.tencent.mm.plugin.wallet_core.id_verify.a.class, localBundle);
    com.tencent.mm.wallet_core.ui.e.a(19, bg.Pu(), paramInt);
    GMTrace.o(17835791220736L, 132887);
    return true;
  }
  
  public static boolean a(Activity paramActivity, k paramk, Bundle paramBundle, boolean paramBoolean, DialogInterface.OnClickListener paramOnClickListener, int paramInt1, int paramInt2)
  {
    GMTrace.i(6851278143488L, 51046);
    paramOnClickListener = "";
    String str2 = "";
    String str3 = "";
    String str1 = "";
    Object localObject = p(paramk);
    if (localObject != null)
    {
      paramk = (k)localObject;
      if (((JSONObject)localObject).has("real_name_info")) {
        paramk = ((JSONObject)localObject).optJSONObject("real_name_info");
      }
      localObject = paramk.optString("guide_flag", "0");
      paramOnClickListener = paramk.optString("guide_wording");
      str2 = paramk.optString("left_button_wording", paramActivity.getString(a.i.cSk));
      str3 = paramk.optString("right_button_wording", paramActivity.getString(a.i.cTM));
      str1 = paramk.optString("upload_credit_url", "");
    }
    for (paramk = (k)localObject;; paramk = "")
    {
      w.i("MicroMsg.RealnameVerifyUtil", "guide_flag = " + paramk + ";upload_credit_url=" + str1);
      if ("1".equals(paramk))
      {
        w.i("MicroMsg.RealnameVerifyUtil", "showRealnameDialog");
        paramBoolean = a(paramActivity, paramBundle, paramInt1);
        GMTrace.o(6851278143488L, 51046);
        return paramBoolean;
      }
      if (("2".equals(paramk)) && (!bg.nm(str1)))
      {
        w.i("MicroMsg.RealnameVerifyUtil", "showUploadCreditDialog");
        paramBoolean = a(paramActivity, paramOnClickListener, str1, str2, str3, paramBoolean, null);
        GMTrace.o(6851278143488L, 51046);
        return paramBoolean;
      }
      w.e("MicroMsg.RealnameVerifyUtil", "guide_flag=" + paramk + ";upload_credit_url=null?" + bg.nm(str1));
      GMTrace.o(6851278143488L, 51046);
      return false;
    }
  }
  
  public static boolean a(final Activity paramActivity, String paramString1, String paramString2, String paramString3, String paramString4, final boolean paramBoolean, DialogInterface.OnClickListener paramOnClickListener)
  {
    GMTrace.i(6851546578944L, 51048);
    if (bg.nm(paramString3)) {
      paramString3 = paramActivity.getString(a.i.cSk);
    }
    for (;;)
    {
      if (bg.nm(paramString4)) {
        paramString4 = paramActivity.getString(a.i.cTM);
      }
      for (;;)
      {
        if (paramOnClickListener == null)
        {
          w.i("MicroMsg.RealnameVerifyUtil", "showRealnameDialog use default calcel listener");
          paramOnClickListener = new DialogInterface.OnClickListener()
          {
            public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
            {
              GMTrace.i(6851815014400L, 51050);
              w.i("MicroMsg.RealnameVerifyUtil", "showUploadCreditDialog click cancel");
              paramAnonymousDialogInterface.dismiss();
              if (this.reb) {
                paramActivity.finish();
              }
              GMTrace.o(6851815014400L, 51050);
            }
          };
        }
        for (;;)
        {
          paramString1 = com.tencent.mm.ui.base.h.a(paramActivity, paramString1, "", paramString4, paramString3, new DialogInterface.OnClickListener()
          {
            public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
            {
              GMTrace.i(6853291409408L, 51061);
              w.i("MicroMsg.RealnameVerifyUtil", "showUploadCreditDialog click OK");
              Intent localIntent = new Intent();
              localIntent.putExtra("rawUrl", this.val$url);
              localIntent.putExtra("showShare", false);
              d.b(paramActivity, "webview", ".ui.tools.WebViewUI", localIntent);
              paramAnonymousDialogInterface.dismiss();
              if (paramBoolean) {
                paramActivity.finish();
              }
              GMTrace.o(6853291409408L, 51061);
            }
          }, paramOnClickListener, a.c.aPp);
          if (paramString1 != null)
          {
            paramString1.setOnCancelListener(new DialogInterface.OnCancelListener()
            {
              public final void onCancel(DialogInterface paramAnonymousDialogInterface)
              {
                GMTrace.i(6853559844864L, 51063);
                if (this.reb) {
                  paramActivity.finish();
                }
                GMTrace.o(6853559844864L, 51063);
              }
            });
            paramString1.setOnDismissListener(new DialogInterface.OnDismissListener()
            {
              public final void onDismiss(DialogInterface paramAnonymousDialogInterface)
              {
                GMTrace.i(6854096715776L, 51067);
                if (this.reb) {
                  paramActivity.finish();
                }
                GMTrace.o(6854096715776L, 51067);
              }
            });
          }
          GMTrace.o(6851546578944L, 51048);
          return true;
        }
      }
    }
  }
  
  private void aMe()
  {
    GMTrace.i(6850338619392L, 51039);
    if ((this.rdV != null) && (this.rdV.get() != null)) {
      ((com.tencent.mm.wallet_core.d.b)this.rdV.get()).aMe();
    }
    GMTrace.o(6850338619392L, 51039);
  }
  
  private void b(final MMActivity paramMMActivity, com.tencent.mm.wallet_core.d.b paramb, String paramString1, String paramString2, final String paramString3, String paramString4, a parama, boolean paramBoolean, final int paramInt)
  {
    GMTrace.i(6850741272576L, 51042);
    this.rdU = new WeakReference(paramMMActivity);
    this.rdV = new WeakReference(paramb);
    this.rdW = paramBoolean;
    if ((this.rdU != null) && (this.rdU.get() != null))
    {
      this.rdT = parama;
      paramString1 = paramString1 + paramString2;
      paramb = new f(paramMMActivity);
      paramb.rmz = new f.a()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(6852754538496L, 51057);
          com.tencent.mm.wallet_core.ui.e.a(3, bg.Pu(), paramInt);
          paramAnonymousView = new Intent();
          paramAnonymousView.putExtra("rawUrl", paramString3);
          paramAnonymousView.putExtra("showShare", false);
          d.b(paramMMActivity, "webview", ".ui.tools.WebViewUI", paramAnonymousView);
          GMTrace.o(6852754538496L, 51057);
        }
      };
      paramString3 = com.tencent.mm.pluginsdk.ui.d.h.a(paramMMActivity, paramString1);
      paramString1 = new SpannableString(paramString3);
      paramString1.setSpan(paramb, paramString3.length() - paramString2.length(), paramString3.length(), 33);
      paramb = new TextView(paramMMActivity);
      paramb.setText(paramString1);
      paramb.setTextSize(0, com.tencent.mm.br.a.V(paramMMActivity, a.d.aQo));
      paramb.setTextColor(paramMMActivity.getResources().getColorStateList(a.c.aOE));
      paramb.setMovementMethod(LinkMovementMethod.getInstance());
      com.tencent.mm.wallet_core.ui.e.a(0, bg.Pu(), paramInt);
      this.rdX = com.tencent.mm.ui.base.h.a(paramMMActivity, "", paramb, paramString4, paramMMActivity.getString(a.i.cSk), new DialogInterface.OnClickListener()new DialogInterface.OnClickListener
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(6853022973952L, 51059);
          com.tencent.mm.wallet_core.ui.e.a(2, bg.Pu(), paramInt);
          if ((a.this.rdV != null) && (a.this.rdV.get() != null))
          {
            com.tencent.mm.kernel.h.xz();
            com.tencent.mm.kernel.h.xx().fYr.a(385, a.this);
            paramAnonymousDialogInterface = new com.tencent.mm.plugin.wallet_core.id_verify.model.a(a.this.gRb);
            ((com.tencent.mm.wallet_core.d.b)a.this.rdV.get()).a(paramAnonymousDialogInterface, true);
          }
          GMTrace.o(6853022973952L, 51059);
        }
      }, new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(6855573110784L, 51078);
          com.tencent.mm.wallet_core.ui.e.a(1, bg.Pu(), paramInt);
          a.this.b(1, -1, "cancel", false);
          GMTrace.o(6855573110784L, 51078);
        }
      });
    }
    GMTrace.o(6850741272576L, 51042);
  }
  
  private static JSONObject p(k paramk)
  {
    GMTrace.i(6851009708032L, 51044);
    if ((paramk != null) && ((paramk instanceof com.tencent.mm.wallet_core.g.a.h)))
    {
      paramk = ((com.tencent.mm.wallet_core.g.a.h)paramk).fUa;
      if (paramk != null)
      {
        paramk = (biw)paramk.gtD.gtK;
        if (paramk.uwX != null)
        {
          paramk = com.tencent.mm.platformtools.n.b(paramk.uwX);
          try
          {
            paramk = new JSONObject(paramk);
            GMTrace.o(6851009708032L, 51044);
            return paramk;
          }
          catch (JSONException paramk)
          {
            for (;;)
            {
              w.printErrStackTrace("MicroMsg.RealnameVerifyUtil", paramk, "", new Object[0]);
              paramk = null;
            }
          }
        }
      }
    }
    GMTrace.o(6851009708032L, 51044);
    return null;
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(6850472837120L, 51040);
    if ((paramk instanceof com.tencent.mm.plugin.wallet_core.id_verify.model.e))
    {
      com.tencent.mm.kernel.h.xz();
      com.tencent.mm.kernel.h.xx().fYr.b(385, this);
      aMe();
      if ((paramInt1 == 0) && (paramInt2 == 0))
      {
        paramk = (com.tencent.mm.plugin.wallet_core.id_verify.model.e)paramk;
        boolean bool = paramk.rdD.equals("1");
        if (bool)
        {
          w.i("MicroMsg.RealnameVerifyUtil", "user had agreed");
          b(0, paramInt2, paramString, bool);
          GMTrace.o(6850472837120L, 51040);
          return;
        }
        paramString = paramk.title;
        String str1 = paramk.rdE;
        String str2 = paramk.rdF;
        String str3 = paramk.rdG;
        paramInt1 = paramk.rdH;
        b((MMActivity)this.rdU.get(), (com.tencent.mm.wallet_core.d.b)this.rdV.get(), paramString, str1, str2, str3, this.rdT, false, paramInt1);
        GMTrace.o(6850472837120L, 51040);
        return;
      }
      b(2, paramInt2, paramString, false);
      GMTrace.o(6850472837120L, 51040);
      return;
    }
    if ((paramk instanceof com.tencent.mm.plugin.wallet_core.id_verify.model.a))
    {
      com.tencent.mm.kernel.h.xz();
      com.tencent.mm.kernel.h.xx().fYr.a(385, this);
      aMe();
      if ((paramInt1 == 0) && (paramInt2 == 0))
      {
        b(0, paramInt2, paramString, true);
        GMTrace.o(6850472837120L, 51040);
        return;
      }
      b(3, paramInt2, paramString, false);
    }
    GMTrace.o(6850472837120L, 51040);
  }
  
  public final boolean a(MMActivity paramMMActivity, int paramInt1, com.tencent.mm.wallet_core.d.b paramb, a parama, boolean paramBoolean1, int paramInt2, boolean paramBoolean2)
  {
    GMTrace.i(6850204401664L, 51038);
    this.rdW = false;
    com.tencent.mm.kernel.h.xz();
    long l1 = ((Long)com.tencent.mm.kernel.h.xy().xh().get(w.a.vuf, Long.valueOf(0L))).longValue();
    if (l1 > 0L)
    {
      long l2 = System.currentTimeMillis();
      com.tencent.mm.wallet_core.ui.e.a(5, bg.Pu(), paramInt2);
      if (l2 < l1)
      {
        w.i("MicroMsg.RealnameVerifyUtil", "getDisclaimer query is not expired. expiredTime = " + l1);
        GMTrace.o(6850204401664L, 51038);
        return false;
      }
      w.i("MicroMsg.RealnameVerifyUtil", "getDisclaimer query had expired. expiredTime = " + l1);
    }
    if (paramMMActivity == null)
    {
      w.e("MicroMsg.RealnameVerifyUtil", "context is null");
      GMTrace.o(6850204401664L, 51038);
      return false;
    }
    if (paramb == null)
    {
      w.e("MicroMsg.RealnameVerifyUtil", "netmgr is null");
      GMTrace.o(6850204401664L, 51038);
      return false;
    }
    this.rdU = new WeakReference(paramMMActivity);
    this.rdV = new WeakReference(paramb);
    this.gRb = paramInt1;
    this.rdT = parama;
    if ((paramInt1 >= 0) && (parama != null))
    {
      com.tencent.mm.wallet_core.ui.e.a(4, bg.Pu(), paramInt2);
      com.tencent.mm.kernel.h.xz();
      com.tencent.mm.kernel.h.xx().fYr.a(385, this);
      paramb.a(new com.tencent.mm.plugin.wallet_core.id_verify.model.e(paramInt1, paramInt2), paramBoolean2);
      GMTrace.o(6850204401664L, 51038);
      return true;
    }
    paramMMActivity = new StringBuilder("scene = ").append(paramInt1).append(";callback is null?");
    if (parama == null) {}
    for (paramBoolean1 = true;; paramBoolean1 = false)
    {
      w.e("MicroMsg.RealnameVerifyUtil", paramBoolean1);
      this.rdT = null;
      GMTrace.o(6850204401664L, 51038);
      return false;
    }
  }
  
  public final void b(int paramInt1, int paramInt2, String paramString, boolean paramBoolean)
  {
    GMTrace.i(6850875490304L, 51043);
    w.i("MicroMsg.RealnameVerifyUtil", "doGetDisclaimerCallback call");
    t localt;
    w.a locala;
    if (this.rdT != null)
    {
      com.tencent.mm.kernel.h.xz();
      localt = com.tencent.mm.kernel.h.xy().xh();
      locala = w.a.vug;
      if (!paramBoolean) {
        break label192;
      }
    }
    label192:
    for (int i = 0;; i = 1)
    {
      localt.a(locala, Integer.valueOf(i));
      this.rdT.a(paramInt1, paramInt2, paramString, paramBoolean);
      if (this.rdX != null) {
        this.rdX.dismiss();
      }
      this.rdW = false;
      if (this.rdX != null)
      {
        w.i("MicroMsg.RealnameVerifyUtil", "getDisclaimerCallback : close mDisclaimerDialog");
        this.rdX = null;
      }
      if (this.rdV != null)
      {
        w.i("MicroMsg.RealnameVerifyUtil", "getDisclaimerCallback : clear mNetSceneMgr");
        this.rdV.clear();
        this.rdV = null;
      }
      if (this.rdU != null)
      {
        w.i("MicroMsg.RealnameVerifyUtil", "getDisclaimerCallback : clear mContextReference");
        this.rdU.clear();
        this.rdU = null;
      }
      w.i("MicroMsg.RealnameVerifyUtil", "getDisclaimerCallback : clear getDisclaimerCallback");
      this.rdT = null;
      GMTrace.o(6850875490304L, 51043);
      return;
    }
  }
  
  public static abstract interface a
  {
    public abstract boolean a(int paramInt1, int paramInt2, String paramString, boolean paramBoolean);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\wallet_core\id_verify\util\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */