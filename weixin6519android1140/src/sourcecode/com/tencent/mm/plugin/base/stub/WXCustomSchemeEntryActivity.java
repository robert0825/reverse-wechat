package com.tencent.mm.plugin.base.stub;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.Toast;
import com.jg.JgClassChecked;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.ad.k;
import com.tencent.mm.g.a.gg;
import com.tencent.mm.modelsimple.ai;
import com.tencent.mm.pluginsdk.d.a;
import com.tencent.mm.pluginsdk.ui.AutoLoginActivity;
import com.tencent.mm.pluginsdk.ui.AutoLoginActivity.a;
import com.tencent.mm.pluginsdk.wallet.g;
import com.tencent.mm.protocal.c.bjv;
import com.tencent.mm.sdk.b.b;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.s;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.y.q;
import com.tencent.mm.y.u.b;
import java.util.ArrayList;
import java.util.List;

@JgClassChecked(author=50, fComment="checked", lastDate="20141016", reviewer=50, vComment={com.jg.EType.ACTIVITYCHECK})
public class WXCustomSchemeEntryActivity
  extends AutoLoginActivity
{
  private List<String> jjA;
  
  public WXCustomSchemeEntryActivity()
  {
    GMTrace.i(12826785611776L, 95567);
    GMTrace.o(12826785611776L, 95567);
  }
  
  protected final void a(AutoLoginActivity.a parama, Intent paramIntent)
  {
    GMTrace.i(12827322482688L, 95571);
    switch (5.jjk[parama.ordinal()])
    {
    }
    int i;
    Object localObject1;
    for (;;)
    {
      finish();
      GMTrace.o(12827322482688L, 95571);
      return;
      try
      {
        parama = getIntent().getData();
        if (parama != null) {
          if (parama != null)
          {
            i = 2;
            if (paramIntent != null) {
              i = s.a(paramIntent, "translate_link_scene", 2);
            }
            int j = s.a(paramIntent, "pay_channel", -1);
            w.i("MicroMsg.WXCustomSchemeEntryActivity", "translateLinkScene = %d, payChannel = %d", new Object[] { Integer.valueOf(i), Integer.valueOf(j) });
            localObject1 = null;
            if (j >= 0)
            {
              w.i("MicroMsg.WXCustomSchemeEntryActivity", "doTicketsDeepLink put paychannel to extraData: %s", new Object[] { Integer.valueOf(j) });
              localObject1 = new Bundle();
              ((Bundle)localObject1).putInt("pay_channel", j);
            }
            if (!com.tencent.mm.pluginsdk.d.NW(parama.toString())) {
              break label535;
            }
            if (!com.tencent.mm.pluginsdk.d.i(parama)) {
              break label295;
            }
            boolean bool = com.tencent.mm.pluginsdk.d.j(parama);
            w.i("MicroMsg.WXCustomSchemeEntryActivity", "isTicketLink uri:%s, %b", new Object[] { parama.toString(), Boolean.valueOf(bool) });
            if (bool)
            {
              com.tencent.mm.pluginsdk.d.a(this, parama.toString(), i, (Bundle)localObject1, new d.a()
              {
                public final void a(int paramAnonymousInt1, int paramAnonymousInt2, String paramAnonymousString, k paramAnonymousk, boolean paramAnonymousBoolean)
                {
                  GMTrace.i(12835375546368L, 95631);
                  w.i("MicroMsg.WXCustomSchemeEntryActivity", "DeepLinkHelper.DeepLinkCallback, %d, %d, %s, %b", new Object[] { Integer.valueOf(paramAnonymousInt1), Integer.valueOf(paramAnonymousInt2), paramAnonymousString, Boolean.valueOf(paramAnonymousBoolean) });
                  if ((paramAnonymousk != null) && (paramAnonymousInt1 != 0) && (paramAnonymousInt2 != 0) && ((paramAnonymousk instanceof ai)))
                  {
                    paramAnonymousString = ((ai)paramAnonymousk).LM();
                    if ((paramAnonymousString != null) && (!WXCustomSchemeEntryActivity.this.isFinishing())) {
                      com.tencent.mm.ui.base.u.makeText(WXCustomSchemeEntryActivity.this, WXCustomSchemeEntryActivity.this.getString(R.l.cUG) + " : " + bg.nl(paramAnonymousString.uUJ), 0).show();
                    }
                  }
                  WXCustomSchemeEntryActivity.this.finish();
                  GMTrace.o(12835375546368L, 95631);
                }
              });
              i = 1;
              if (i == 0) {
                continue;
              }
              GMTrace.o(12827322482688L, 95571);
              return;
            }
          }
        }
      }
      catch (Exception parama)
      {
        for (;;)
        {
          w.e("MicroMsg.WXCustomSchemeEntryActivity", "post login get url from intent failed : %s", new Object[] { parama.getMessage() });
          parama = null;
        }
        com.tencent.mm.pluginsdk.d.a(this, parama.toString(), i, (Bundle)localObject1, new d.a()
        {
          public final void a(int paramAnonymousInt1, int paramAnonymousInt2, String paramAnonymousString, k paramAnonymousk, boolean paramAnonymousBoolean)
          {
            GMTrace.i(12828396224512L, 95579);
            WXCustomSchemeEntryActivity.this.finish();
            GMTrace.o(12828396224512L, 95579);
          }
        });
      }
    }
    label295:
    label535:
    label878:
    label908:
    label961:
    for (;;)
    {
      i = 0;
      break;
      String str2;
      if (com.tencent.mm.pluginsdk.d.NX(parama.toString()))
      {
        if (i == 1)
        {
          localObject2 = com.tencent.mm.y.u.Av().gw("key_data_center_session_id");
          if (localObject2 == null)
          {
            w.e("MicroMsg.WXCustomSchemeEntryActivity", "null keyvalue for opensdk scene");
            finish();
            continue;
          }
          str1 = ((u.b)localObject2).getString("key_package_name", "");
          localObject2 = ((u.b)localObject2).getString("key_package_signature", "");
          str2 = paramIntent.getStringExtra("key_package_name");
          String str3 = paramIntent.getStringExtra("key_package_signature");
          w.i("MicroMsg.WXCustomSchemeEntryActivity", "pkg = %s, sig = %s, intentpkg = %s, intentsig = %s", new Object[] { str1, localObject2, str2, str3 });
          com.tencent.mm.y.u.Av().gx("key_data_center_session_id");
          if ((!str1.equals(str2)) || (!((String)localObject2).equals(str3)))
          {
            w.e("MicroMsg.WXCustomSchemeEntryActivity", "signature or package check failed");
            finish();
            continue;
          }
        }
        com.tencent.mm.pluginsdk.d.a(this, parama.toString(), i, (Bundle)localObject1, new d.a()
        {
          public final void a(int paramAnonymousInt1, int paramAnonymousInt2, String paramAnonymousString, k paramAnonymousk, boolean paramAnonymousBoolean)
          {
            GMTrace.i(12829469966336L, 95587);
            w.i("MicroMsg.WXCustomSchemeEntryActivity", "DeepLinkHelper.DeepLinkCallback, %d, %d, %s, %b", new Object[] { Integer.valueOf(paramAnonymousInt1), Integer.valueOf(paramAnonymousInt2), paramAnonymousString, Boolean.valueOf(paramAnonymousBoolean) });
            if ((paramAnonymousk != null) && (paramAnonymousInt1 != 0) && (paramAnonymousInt2 != 0) && ((paramAnonymousk instanceof ai)))
            {
              paramAnonymousString = ((ai)paramAnonymousk).LM();
              if ((paramAnonymousString != null) && (!WXCustomSchemeEntryActivity.this.isFinishing())) {
                com.tencent.mm.ui.base.u.makeText(WXCustomSchemeEntryActivity.this, WXCustomSchemeEntryActivity.this.getString(R.l.cUG) + " : " + bg.nl(paramAnonymousString.uUJ), 0).show();
              }
            }
            WXCustomSchemeEntryActivity.this.finish();
            GMTrace.o(12829469966336L, 95587);
          }
        }, paramIntent.getStringExtra("key_package_name"), paramIntent.getStringExtra("key_package_signature"));
        i = 1;
        break;
      }
      paramIntent = q.zE();
      w.i("MicroMsg.WXCustomSchemeEntryActivity", "not TicketLink uri:%s", new Object[] { parama.toString() });
      com.tencent.mm.pluginsdk.d.a(this, parama.toString(), paramIntent, 23, parama.toString(), new d.a()
      {
        public final void a(int paramAnonymousInt1, int paramAnonymousInt2, String paramAnonymousString, k paramAnonymousk, boolean paramAnonymousBoolean)
        {
          GMTrace.i(12841683779584L, 95678);
          WXCustomSchemeEntryActivity.this.finish();
          GMTrace.o(12841683779584L, 95678);
        }
      });
      continue;
      Object localObject2 = parama.getScheme();
      localObject1 = parama.getHost();
      String str1 = parama.getQuery();
      w.i("MicroMsg.WXCustomSchemeEntryActivity", "scheme is %s, host is %s, query is %s", new Object[] { localObject2, localObject1, str1 });
      if ((!bg.nm((String)localObject1)) && (this.jjA.contains(localObject1)))
      {
        if ((((String)localObject1).equals("cardpackage")) && (!bg.nm(parama.getQueryParameter("encrystr"))))
        {
          paramIntent.setClassName(this, "com.tencent.mm.ui.CheckSmsCanAddCardUI");
          startActivity(paramIntent);
        }
        if (((String)localObject1).equals("connectToFreeWifi"))
        {
          if ((bg.nm(str1)) || (!str1.startsWith("apKey="))) {
            break label908;
          }
          localObject2 = parama.getQueryParameter("apKey");
          w.i("MicroMsg.WXCustomSchemeEntryActivity", "apKey value = %s", new Object[] { localObject2 });
          str2 = parama.getQueryParameter("ticket");
          if ((!bg.nm((String)localObject2)) && (((String)localObject2).length() < 1024))
          {
            paramIntent = new Intent();
            paramIntent.putExtra("free_wifi_schema_uri", parama.toString());
            paramIntent.putExtra("free_wifi_ap_key", (String)localObject2);
            paramIntent.putExtra("free_wifi_source", 5);
            paramIntent.putExtra("free_wifi_threeone_startup_type", 1);
            if (!bg.nm(str2)) {
              paramIntent.putExtra("free_wifi_schema_ticket", str2);
            }
            if ((!((String)localObject2).startsWith("_")) && (!bg.nm(str2))) {
              break label878;
            }
            paramIntent.addFlags(67108864);
            com.tencent.mm.bj.d.b(this, "freewifi", ".ui.FreeWifiEntryUI", paramIntent);
          }
        }
        for (;;)
        {
          if ((!((String)localObject1).equals("wap")) || (!parama.toString().startsWith("weixin://wap/pay"))) {
            break label961;
          }
          w.i("MicroMsg.WXCustomSchemeEntryActivity", "postLogin for WX_WAP_PAY");
          if (TextUtils.isEmpty(str1)) {
            break;
          }
          g.a(this, com.tencent.mm.pluginsdk.g.a.Of(str1), false);
          break;
          localObject2 = new gg();
          ((gg)localObject2).eJq.intent = paramIntent;
          com.tencent.mm.sdk.b.a.vgX.m((b)localObject2);
          continue;
          if (parama.toString().startsWith("weixin://connectToFreeWifi/friendWifi"))
          {
            paramIntent = new Intent();
            paramIntent.putExtra("key_connected_router", parama.toString());
            com.tencent.mm.bj.d.b(this, "exdevice", ".ui.ExdeviceConnectedRouterActivateStateUI", paramIntent);
            w.i("MicroMsg.WXCustomSchemeEntryActivity", "Jump to ExdeviceConnectedRouterUi.");
          }
        }
      }
    }
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(12827054047232L, 95569);
    int i = R.i.cqn;
    GMTrace.o(12827054047232L, 95569);
    return i;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(12826919829504L, 95568);
    w.i("MicroMsg.WXCustomSchemeEntryActivity", "onCreate");
    this.jjA = new ArrayList();
    this.jjA.add("cardpackage");
    this.jjA.add("connectToFreeWifi");
    this.jjA.add("wap");
    super.onCreate(paramBundle);
    AU(0);
    GMTrace.o(12826919829504L, 95568);
  }
  
  protected final boolean y(Intent paramIntent)
  {
    GMTrace.i(12827188264960L, 95570);
    try
    {
      paramIntent = getIntent().getData();
      if (paramIntent != null) {
        if (com.tencent.mm.pluginsdk.d.NW(paramIntent.toString()))
        {
          GMTrace.o(12827188264960L, 95570);
          return true;
        }
      }
    }
    catch (Exception paramIntent)
    {
      for (;;)
      {
        w.e("MicroMsg.WXCustomSchemeEntryActivity", "get url from intent failed : %s", new Object[] { paramIntent.getMessage() });
        paramIntent = null;
      }
      String str3 = paramIntent.getScheme();
      String str1 = paramIntent.getHost();
      String str2 = paramIntent.getQuery();
      w.i("MicroMsg.WXCustomSchemeEntryActivity", "uri is %s,scheme is %s, host is %s, query is %s", new Object[] { paramIntent.toString(), str3, str1, str2 });
      if ((!bg.nm(str1)) && (this.jjA.contains(str1)))
      {
        w.i("MicroMsg.WXCustomSchemeEntryActivity", "match the host : %s", new Object[] { str1 });
        if (str1.equals("cardpackage"))
        {
          str3 = paramIntent.getQueryParameter("encrystr");
          w.i("MicroMsg.WXCustomSchemeEntryActivity", "card encrypt value = %s", new Object[] { str3 });
          if ((!bg.nm(str3)) && (str3.length() < 1024))
          {
            GMTrace.o(12827188264960L, 95570);
            return true;
          }
        }
        if (str1.equals("connectToFreeWifi")) {
          if ((!bg.nm(str2)) && (str2.startsWith("apKey=")) && (str2.length() > 6))
          {
            str2 = str2.substring(6);
            w.i("MicroMsg.WXCustomSchemeEntryActivity", "apKey value = %s", new Object[] { str2 });
            if ((!bg.nm(str2)) && (str2.length() < 1024))
            {
              GMTrace.o(12827188264960L, 95570);
              return true;
            }
          }
          else if (paramIntent.toString().startsWith("weixin://connectToFreeWifi/friendWifi"))
          {
            GMTrace.o(12827188264960L, 95570);
            return true;
          }
        }
        if ((str1.equals("wap")) && (paramIntent.toString().startsWith("weixin://wap/pay")))
        {
          w.i("MicroMsg.WXCustomSchemeEntryActivity", "preLogin for WX_WAP_PAY");
          GMTrace.o(12827188264960L, 95570);
          return true;
        }
      }
      finish();
      GMTrace.o(12827188264960L, 95570);
    }
    return false;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\base\stub\WXCustomSchemeEntryActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */