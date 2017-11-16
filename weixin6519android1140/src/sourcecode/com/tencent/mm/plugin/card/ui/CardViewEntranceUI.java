package com.tencent.mm.plugin.card.ui;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.i;
import com.tencent.mm.plugin.card.b.k;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.a;
import java.util.LinkedList;

@a(3)
public class CardViewEntranceUI
  extends MMActivity
{
  public CardViewEntranceUI()
  {
    GMTrace.i(4968471855104L, 37018);
    GMTrace.o(4968471855104L, 37018);
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(4968606072832L, 37019);
    int i = R.i.cqE;
    GMTrace.o(4968606072832L, 37019);
    return i;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(4968740290560L, 37020);
    super.onCreate(paramBundle);
    paramBundle = getIntent();
    if (paramBundle == null)
    {
      w.e("MicroMsg.CardViewEntranceUI", "CardViewEntranceUI onCreate() intent == null");
      setResult(0, paramBundle);
      finish();
      GMTrace.o(4968740290560L, 37020);
      return;
    }
    int i = paramBundle.getIntExtra("key_from_scene", 50);
    w.i("MicroMsg.CardViewEntranceUI", "CardViewEntranceUI doRediect() handle data");
    String str = paramBundle.getStringExtra("card_list");
    if (TextUtils.isEmpty(str))
    {
      w.e("MicroMsg.CardViewEntranceUI", "CardViewEntranceUI oncreate card_list is empty");
      setResult(0, paramBundle);
      finish();
      GMTrace.o(4968740290560L, 37020);
      return;
    }
    LinkedList localLinkedList = k.aK(str, i);
    if ((localLinkedList == null) || (localLinkedList.size() == 0))
    {
      w.e("MicroMsg.CardViewEntranceUI", "CardViewEntranceUI oncreate tempList size is empty");
      setResult(0, paramBundle);
      finish();
      GMTrace.o(4968740290560L, 37020);
      return;
    }
    Intent localIntent = new Intent();
    if (localLinkedList.size() == 1)
    {
      localIntent.putExtra("card_list", str);
      localIntent.putExtra("key_from_scene", 50);
      localIntent.putExtra("key_previous_scene", i);
      if (!bg.nm(paramBundle.getStringExtra("key_template_id"))) {
        localIntent.putExtra("key_template_id", paramBundle.getStringExtra("key_template_id"));
      }
      localIntent.putExtra("key_from_appbrand_type", paramBundle.getIntExtra("key_from_appbrand_type", 0));
      localIntent.setClass(this, CardDetailUI.class);
      startActivity(localIntent);
    }
    for (;;)
    {
      w.e("MicroMsg.CardViewEntranceUI", "CardViewEntranceUI onCreate() parameter is ok");
      setResult(-1, paramBundle);
      finish();
      GMTrace.o(4968740290560L, 37020);
      return;
      localIntent.putExtra("view_type", 0);
      localIntent.putExtra("card_list", str);
      localIntent.putExtra("key_previous_scene", i);
      if (!bg.nm(paramBundle.getStringExtra("key_template_id"))) {
        localIntent.putExtra("key_template_id", paramBundle.getStringExtra("key_template_id"));
      }
      localIntent.putExtra("key_from_appbrand_type", paramBundle.getIntExtra("key_from_appbrand_type", 0));
      localIntent.setClass(this, CardViewUI.class);
      startActivity(localIntent);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes4-dex2jar.jar!\com\tencent\mm\plugin\card\ui\CardViewEntranceUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */