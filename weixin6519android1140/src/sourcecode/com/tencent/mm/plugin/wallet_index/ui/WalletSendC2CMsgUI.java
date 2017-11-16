package com.tencent.mm.plugin.wallet_index.ui;

import android.content.Intent;
import android.os.Bundle;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.k;
import com.tencent.mm.bj.d;
import com.tencent.mm.plugin.wallet_index.c.c;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;

@com.tencent.mm.ui.base.a(7)
public class WalletSendC2CMsgUI
  extends WalletBaseUI
{
  private int gRb;
  private Map<String, String> rsV;
  
  public WalletSendC2CMsgUI()
  {
    GMTrace.i(7568671899648L, 56391);
    this.rsV = null;
    GMTrace.o(7568671899648L, 56391);
  }
  
  private boolean KJ(String paramString)
  {
    GMTrace.i(7569477206016L, 56397);
    String str1 = null;
    String str2 = null;
    String str4 = null;
    String str5 = null;
    String str6 = null;
    String str3 = null;
    String str7 = null;
    if (this.gRb == 1)
    {
      paramString = getIntent().getStringExtra("key_receiver");
      str4 = getIntent().getStringExtra("key_sender_des");
      str5 = getIntent().getStringExtra("key_receiver_des");
      str6 = URLEncoder.encode(getIntent().getStringExtra("key_url"));
      str3 = getIntent().getStringExtra("key_templateid");
      str7 = getIntent().getStringExtra("key_sceneid");
      str1 = getIntent().getStringExtra("key_receivertitle");
      str2 = getIntent().getStringExtra("key_sendertitle");
    }
    for (;;)
    {
      if ((!bg.nm(str6)) && (!bg.nm(str3)))
      {
        w.d("MicroMsg.WalletSendC2CMsgUI", "send c2c msg to" + paramString);
        l(new c(paramString, str1, str2, str3, str4, str5, str6, str7));
        GMTrace.o(7569477206016L, 56397);
        return true;
        Map localMap = bAj();
        if ((localMap != null) && (!bg.nm(paramString)))
        {
          str1 = URLDecoder.decode(bg.nl((String)localMap.get("receivertitle")));
          str2 = URLDecoder.decode(bg.nl((String)localMap.get("sendertitle")));
          str4 = URLDecoder.decode(bg.nl((String)localMap.get("senderdes")));
          str5 = URLDecoder.decode(bg.nl((String)localMap.get("receiverdes")));
          str6 = bg.nl((String)localMap.get("url"));
          str3 = URLDecoder.decode(bg.nl((String)localMap.get("templateid")));
          str7 = URLDecoder.decode(bg.nl((String)localMap.get("senceid")));
        }
      }
      else
      {
        w.w("MicroMsg.WalletSendC2CMsgUI", "url = " + bg.nm(str6) + "templateId=" + bg.nm(str3));
        GMTrace.o(7569477206016L, 56397);
        return false;
      }
    }
  }
  
  private Map<String, String> bAj()
  {
    GMTrace.i(7569611423744L, 56398);
    if (this.rsV == null)
    {
      localObject = getIntent().getStringExtra("packageExt");
      w.d("MicroMsg.WalletSendC2CMsgUI", "func[getPackageData] packageExt: " + (String)localObject);
      if (!bg.nm((String)localObject))
      {
        localObject = ((String)localObject).split("&");
        this.rsV = new HashMap();
        if ((localObject != null) && (localObject.length > 0))
        {
          int i = 0;
          while (i < localObject.length)
          {
            if (!bg.nm(localObject[i]))
            {
              String[] arrayOfString = localObject[i].split("=");
              if ((arrayOfString.length == 2) && (!bg.nm(arrayOfString[0]))) {
                this.rsV.put(arrayOfString[0], arrayOfString[1]);
              }
            }
            i += 1;
          }
        }
      }
    }
    Object localObject = this.rsV;
    GMTrace.o(7569611423744L, 56398);
    return (Map<String, String>)localObject;
  }
  
  public final boolean d(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    int i = 0;
    GMTrace.i(7569074552832L, 56394);
    if ((paramInt1 == 0) && (paramInt2 == 0)) {
      if ((paramk instanceof com.tencent.mm.plugin.wallet_core.c.a))
      {
        w.i("MicroMsg.WalletSendC2CMsgUI", "Check jsapi suc & Go Select Contact");
        w.i("MicroMsg.WalletSendC2CMsgUI", "doCallSelectConversationUI");
        paramString = bAj();
        paramInt1 = i;
        if (paramString != null)
        {
          paramInt1 = i;
          if (paramString.containsKey("togroup"))
          {
            paramInt1 = i;
            if ("0".equals(paramString.get("togroup"))) {
              paramInt1 = 1;
            }
          }
        }
        paramString = new Intent();
        if (paramInt1 == 0) {
          break label309;
        }
      }
    }
    label309:
    for (paramInt1 = 7;; paramInt1 = 3)
    {
      paramString.putExtra("select_is_ret", true);
      paramString.putExtra("Select_Conv_Type", paramInt1);
      d.a(this, ".ui.transmit.SelectConversationUI", paramString, 1);
      GMTrace.o(7569074552832L, 56394);
      return true;
      if ((paramk instanceof c))
      {
        w.i("MicroMsg.WalletSendC2CMsgUI", "Send c2c msg suc");
        if (this.gRb == 1) {
          h.bm(this, getString(a.i.tgt));
        }
        for (;;)
        {
          finish();
          GMTrace.o(7569074552832L, 56394);
          return true;
          h.bm(this, getString(a.i.dCJ));
          setResult(-1);
        }
        if ((paramk instanceof com.tencent.mm.plugin.wallet_core.c.a))
        {
          w.e("MicroMsg.WalletSendC2CMsgUI", "Check jsapi fail");
          setResult(64536);
          finish();
          GMTrace.o(7569074552832L, 56394);
          return true;
        }
        if ((paramk instanceof c))
        {
          if (this.gRb == 1) {
            h.bm(this, paramString);
          }
          for (;;)
          {
            finish();
            GMTrace.o(7569074552832L, 56394);
            return true;
            setResult(64536);
          }
        }
        setResult(64536);
        finish();
      }
      GMTrace.o(7569074552832L, 56394);
      return false;
    }
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(7569342988288L, 56396);
    GMTrace.o(7569342988288L, 56396);
    return -1;
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    GMTrace.i(7569208770560L, 56395);
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    if (paramIntent != null) {
      w.d("MicroMsg.WalletSendC2CMsgUI", "onActivityResult, requestCode = " + paramInt1 + ", resultCode = " + paramInt2 + ", data = " + paramIntent.toString());
    }
    while (paramInt1 == 1) {
      if ((paramInt2 == -1) && (paramIntent != null))
      {
        paramIntent = paramIntent.getStringExtra("Select_Conv_User");
        w.d("MicroMsg.WalletSendC2CMsgUI", "Select user , " + bg.nl(paramIntent));
        if (!KJ(paramIntent))
        {
          w.e("MicroMsg.WalletSendC2CMsgUI", "doSendC2CMsg fail");
          setResult(64536);
          finish();
          GMTrace.o(7569208770560L, 56395);
          return;
          w.e("MicroMsg.WalletSendC2CMsgUI", "onActivityResult, requestCode = " + paramInt1 + ", resultCode = " + paramInt2 + ", data = null");
        }
        else
        {
          GMTrace.o(7569208770560L, 56395);
        }
      }
      else
      {
        w.e("MicroMsg.WalletSendC2CMsgUI", "cancel select contact fail");
        setResult(0);
        finish();
        GMTrace.o(7569208770560L, 56395);
        return;
      }
    }
    w.e("MicroMsg.WalletSendC2CMsgUI", "onActivityResult, unknown requestCode = " + paramInt1);
    GMTrace.o(7569208770560L, 56395);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(7568806117376L, 56392);
    super.onCreate(paramBundle);
    sv(8);
    this.gRb = getIntent().getIntExtra("key_scene", 0);
    w.i("MicroMsg.WalletSendC2CMsgUI", "scene:" + this.gRb);
    if (this.gRb == 0)
    {
      hN(580);
      if (getIntent() == null)
      {
        w.e("MicroMsg.WalletSendC2CMsgUI", "func[doCheckPayNetscene] intent null");
        setResult(64536);
        finish();
        GMTrace.o(7568806117376L, 56392);
        return;
      }
      r(new com.tencent.mm.plugin.wallet_core.c.a(getIntent().getStringExtra("appId"), getIntent().getStringExtra("timeStamp"), getIntent().getStringExtra("nonceStr"), getIntent().getStringExtra("packageExt"), getIntent().getStringExtra("signtype"), getIntent().getStringExtra("paySignature"), getIntent().getStringExtra("url"), 6));
      GMTrace.o(7568806117376L, 56392);
      return;
    }
    if (!KJ(null))
    {
      w.d("MicroMsg.WalletSendC2CMsgUI", "doSendC2CMsg fail");
      setResult(64536);
      finish();
      GMTrace.o(7568806117376L, 56392);
      return;
    }
    GMTrace.o(7568806117376L, 56392);
  }
  
  public void onDestroy()
  {
    GMTrace.i(7568940335104L, 56393);
    super.onDestroy();
    hO(580);
    GMTrace.o(7568940335104L, 56393);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes4-dex2jar.jar!\com\tencent\mm\plugin\wallet_index\ui\WalletSendC2CMsgUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */