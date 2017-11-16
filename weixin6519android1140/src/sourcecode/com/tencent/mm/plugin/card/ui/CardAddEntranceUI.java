package com.tencent.mm.plugin.card.ui;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.i;
import com.tencent.mm.opensdk.channel.MMessageActV2;
import com.tencent.mm.opensdk.channel.MMessageActV2.Args;
import com.tencent.mm.opensdk.modelbiz.AddCardToWXCardPackage.Resp;
import com.tencent.mm.plugin.card.b.h;
import com.tencent.mm.plugin.card.model.e;
import com.tencent.mm.pluginsdk.model.app.f;
import com.tencent.mm.pluginsdk.model.app.g;
import com.tencent.mm.pluginsdk.model.app.p;
import com.tencent.mm.protocal.c.jn;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

@a(3)
public class CardAddEntranceUI
  extends MMActivity
{
  private String appId;
  private int eTL;
  LinkedList<jn> jDR;
  private String jEc;
  private String jEd;
  private int jEe;
  
  public CardAddEntranceUI()
  {
    GMTrace.i(5000684109824L, 37258);
    this.jDR = new LinkedList();
    this.jEc = "";
    this.eTL = 8;
    this.jEe = 0;
    GMTrace.o(5000684109824L, 37258);
  }
  
  private void I(int paramInt, String paramString)
  {
    GMTrace.i(5001355198464L, 37263);
    Bundle localBundle = new Bundle();
    localBundle.putString("_wxapi_add_card_to_wx_card_list", paramString);
    Object localObject = g.aP(this.appId, true);
    AddCardToWXCardPackage.Resp localResp = new AddCardToWXCardPackage.Resp(localBundle);
    if (localObject != null) {
      localResp.openId = ((f)localObject).field_openId;
    }
    localResp.transaction = this.jEd;
    String str = this.appId;
    if (localObject == null)
    {
      paramString = "null appinfo";
      if (localObject != null) {
        break label214;
      }
      localObject = "null appinfo";
      label87:
      w.i("MicroMsg.CardAddEntranceUI", "setResultToSDK, appid : %s, appname : %s, openid : %s, transcation : %s", new Object[] { str, paramString, localObject, this.jEd });
      localResp.toBundle(localBundle);
      w.i("MicroMsg.CardAddEntranceUI", "setResultToSDK result:" + paramInt);
      if (paramInt != -1) {
        break label222;
      }
    }
    label214:
    label222:
    for (localResp.errCode = 0;; localResp.errCode = -2)
    {
      paramString = new MMessageActV2.Args();
      paramString.targetPkgName = this.jEc;
      paramString.bundle = localBundle;
      p.ag(localBundle);
      p.ah(localBundle);
      MMessageActV2.send(ab.getContext(), paramString);
      GMTrace.o(5001355198464L, 37263);
      return;
      paramString = ((f)localObject).field_appName;
      break;
      localObject = ((f)localObject).field_openId;
      break label87;
    }
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(5000818327552L, 37259);
    int i = R.i.cqE;
    GMTrace.o(5000818327552L, 37259);
    return i;
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    GMTrace.i(5001220980736L, 37262);
    w.v("MicroMsg.CardAddEntranceUI", "CardAddEntranceUI onActivityResult");
    if (paramInt2 == -1) {
      w.i("MicroMsg.CardAddEntranceUI", "CardAddEntranceUI RESULT_OK");
    }
    LinkedList localLinkedList;
    Object localObject1;
    Object localObject2;
    for (;;)
    {
      localLinkedList = new LinkedList();
      localObject1 = this.jDR.iterator();
      while (((Iterator)localObject1).hasNext())
      {
        localObject2 = (jn)((Iterator)localObject1).next();
        e locale = new e();
        locale.jxF = ((jn)localObject2).jxF;
        locale.eTK = ((jn)localObject2).eTK;
        localLinkedList.add(locale);
      }
      w.i("MicroMsg.CardAddEntranceUI", "CardAddEntranceUI RESULT_CANCELED");
    }
    if (paramInt1 == 1)
    {
      w.i("MicroMsg.CardAddEntranceUI", "CardAddEntranceUI REQUEST_CARD_DETAIL");
      if ((this.eTL == 7) || (this.eTL == 16))
      {
        localObject1 = new Intent();
        switch (paramInt2)
        {
        }
      }
    }
    for (;;)
    {
      finish();
      GMTrace.o(5001220980736L, 37262);
      return;
      if ((paramIntent != null) && (localLinkedList.size() > 0)) {
        ((e)localLinkedList.get(0)).code = paramIntent.getStringExtra("key_code");
      }
      ((Intent)localObject1).putExtra("card_list", h.a(localLinkedList, true, this.eTL));
      setResult(-1, (Intent)localObject1);
      continue;
      ((Intent)localObject1).putExtra("card_list", h.a(localLinkedList, false, this.eTL));
      setResult(0, (Intent)localObject1);
      continue;
      if (this.eTL == 26)
      {
        localObject1 = new Intent();
        switch (paramInt2)
        {
        default: 
          break;
        case -1: 
          if ((paramIntent != null) && (localLinkedList.size() > 0)) {
            ((e)localLinkedList.get(0)).code = paramIntent.getStringExtra("key_code");
          }
          ((Intent)localObject1).putExtra("card_list", h.a(localLinkedList, true, this.eTL));
          setResult(-1, (Intent)localObject1);
          break;
        case 0: 
          ((Intent)localObject1).putExtra("card_list", h.a(localLinkedList, false, this.eTL));
          setResult(0, (Intent)localObject1);
          break;
        }
      }
      else
      {
        switch (paramInt2)
        {
        default: 
          break;
        case -1: 
          if ((paramIntent != null) && (localLinkedList.size() > 0)) {
            ((e)localLinkedList.get(0)).code = paramIntent.getStringExtra("key_code");
          }
          I(-1, h.a(localLinkedList, true, this.eTL));
          break;
        case 0: 
          I(0, h.a(localLinkedList, false, this.eTL));
          continue;
          if (paramInt1 == 2)
          {
            w.i("MicroMsg.CardAddEntranceUI", "CardAddEntranceUI REQUEST_CARD_ACCEPT_CARD_LIST");
            localObject1 = "";
            if (paramIntent != null) {
              localObject1 = paramIntent.getStringExtra("card_list");
            }
            if ((this.eTL == 7) || (this.eTL == 16)) {
              localObject2 = new Intent();
            }
            switch (paramInt2)
            {
            default: 
              break;
            case -1: 
              if ((paramIntent != null) && (!TextUtils.isEmpty((CharSequence)localObject1)))
              {
                paramIntent.putExtra("card_list", h.aJ((String)localObject1, this.eTL));
                setResult(-1, paramIntent);
              }
              else
              {
                ((Intent)localObject2).putExtra("card_list", h.a(localLinkedList, true, this.eTL));
                setResult(-1, (Intent)localObject2);
              }
              break;
            case 0: 
              if ((paramIntent != null) && (!TextUtils.isEmpty((CharSequence)localObject1)))
              {
                paramIntent.putExtra("card_list", h.aJ((String)localObject1, this.eTL));
                setResult(0, paramIntent);
              }
              else
              {
                ((Intent)localObject2).putExtra("card_list", h.a(localLinkedList, false, this.eTL));
                ((Intent)localObject2).putExtra("result_code", 1);
                setResult(0, (Intent)localObject2);
                continue;
                if (this.eTL == 26)
                {
                  localObject2 = new Intent();
                  switch (paramInt2)
                  {
                  default: 
                    break;
                  case -1: 
                    if ((paramIntent != null) && (!TextUtils.isEmpty((CharSequence)localObject1)))
                    {
                      paramIntent.putExtra("card_list", h.aJ((String)localObject1, this.eTL));
                      setResult(-1, paramIntent);
                      continue;
                    }
                    ((Intent)localObject2).putExtra("card_list", h.a(localLinkedList, true, this.eTL));
                    setResult(-1, (Intent)localObject2);
                    break;
                  case 0: 
                    if ((paramIntent != null) && (!TextUtils.isEmpty((CharSequence)localObject1)))
                    {
                      paramIntent.putExtra("card_list", h.aJ((String)localObject1, this.eTL));
                      setResult(0, paramIntent);
                      continue;
                    }
                    ((Intent)localObject2).putExtra("card_list", h.a(localLinkedList, false, this.eTL));
                    ((Intent)localObject2).putExtra("result_code", 1);
                    setResult(0, (Intent)localObject2);
                    break;
                  }
                }
                else
                {
                  switch (paramInt2)
                  {
                  default: 
                    break;
                  case -1: 
                    if (!TextUtils.isEmpty((CharSequence)localObject1)) {
                      I(-1, (String)localObject1);
                    } else {
                      I(-1, h.a(localLinkedList, true, this.eTL));
                    }
                    break;
                  case 0: 
                    if (!TextUtils.isEmpty((CharSequence)localObject1)) {
                      I(0, (String)localObject1);
                    } else {
                      I(0, h.a(localLinkedList, false, this.eTL));
                    }
                    break;
                  }
                }
              }
              break;
            }
          }
          break;
        }
      }
    }
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(5000952545280L, 37260);
    super.onCreate(paramBundle);
    paramBundle = getIntent();
    if (paramBundle == null)
    {
      w.e("MicroMsg.CardAddEntranceUI", "CardAddEntranceUI onCreate() intent == null");
      setResult(0);
      finish();
      GMTrace.o(5000952545280L, 37260);
      return;
    }
    w.i("MicroMsg.CardAddEntranceUI", "CardAddEntranceUI doRediect() handle data");
    Object localObject = paramBundle.getStringExtra("key_in_card_list");
    this.eTL = paramBundle.getIntExtra("key_from_scene", 8);
    this.jEe = paramBundle.getIntExtra("key_stastic_scene", 0);
    w.i("MicroMsg.CardAddEntranceUI", "doRediect() from_scene:" + this.eTL + "  from_origin_scene:" + this.jEe);
    this.jEc = paramBundle.getStringExtra("key_package_name");
    String str5 = paramBundle.getStringExtra("key_sign");
    String str1 = getIntent().getStringExtra("src_username");
    w.i("MicroMsg.CardAddEntranceUI", "doRediect() src_username:" + str1);
    String str2 = getIntent().getStringExtra("js_url");
    this.appId = getIntent().getStringExtra("key_app_id");
    this.jEd = getIntent().getStringExtra("key_transaction");
    String str3 = getIntent().getStringExtra("key_consumed_card_id");
    w.i("MicroMsg.CardAddEntranceUI", "doRediect() consumedCardId:" + str3);
    String str4 = getIntent().getStringExtra("key_template_id");
    ArrayList localArrayList = h.aI((String)localObject, this.eTL);
    if ((localArrayList == null) || (localArrayList.size() == 0))
    {
      w.e("MicroMsg.CardAddEntranceUI", "CardAddEntranceUI initView () tempList == null || tempList.size() == 0");
      setResult(0);
      finish();
      GMTrace.o(5000952545280L, 37260);
      return;
    }
    this.jDR.clear();
    this.jDR.addAll(localArrayList);
    Intent localIntent = new Intent();
    localIntent.putExtra("key_from_scene", this.eTL);
    localIntent.putExtra("key_stastic_scene", this.jEe);
    if (localArrayList.size() == 1)
    {
      localObject = (jn)localArrayList.get(0);
      localIntent.putExtra("key_card_id", ((jn)localObject).jxF);
      localIntent.putExtra("key_card_ext", ((jn)localObject).eTK);
      localIntent.putExtra("src_username", str1);
      localIntent.putExtra("js_url", str2);
      localIntent.putExtra("key_consumed_card_id", str3);
      localIntent.putExtra("key_template_id", str4);
      localIntent.putExtra("key_from_appbrand_type", paramBundle.getIntExtra("key_from_appbrand_type", 0));
      localIntent.setClass(this, CardDetailUI.class);
      startActivityForResult(localIntent, 1);
      GMTrace.o(5000952545280L, 37260);
      return;
    }
    localIntent.putExtra("key_in_card_list", (String)localObject);
    localIntent.putExtra("key_package_name", this.jEc);
    localIntent.putExtra("key_sign", str5);
    localIntent.putExtra("src_username", str1);
    localIntent.putExtra("js_url", str2);
    localIntent.putExtra("key_consumed_card_id", str3);
    localIntent.putExtra("key_template_id", str4);
    localIntent.setClass(this, CardAcceptCardListUI.class);
    startActivityForResult(localIntent, 2);
    GMTrace.o(5000952545280L, 37260);
  }
  
  protected void onDestroy()
  {
    GMTrace.i(5001086763008L, 37261);
    super.onDestroy();
    GMTrace.o(5001086763008L, 37261);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes4-dex2jar.jar!\com\tencent\mm\plugin\card\ui\CardAddEntranceUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */