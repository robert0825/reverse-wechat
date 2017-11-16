package com.tencent.mm.plugin.extqlauncher.ui;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.ac.n;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.ar;
import com.tencent.mm.storage.x;
import com.tencent.mm.ui.MMBaseActivity;
import com.tencent.mm.ui.contact.s;
import com.tencent.mm.y.at;
import com.tencent.mm.y.c;
import com.tencent.mm.y.q;
import com.tencent.mm.y.r;
import java.util.List;

public class QLauncherCreateShortcutUI
  extends MMBaseActivity
{
  public QLauncherCreateShortcutUI()
  {
    GMTrace.i(9029229215744L, 67273);
    GMTrace.o(9029229215744L, 67273);
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    GMTrace.i(9029497651200L, 67275);
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    w.d("MicroMsg.extqlauncher.QLauncherCreateShortcutUI", "onActivityResult resultCode = %s", new Object[] { Integer.valueOf(paramInt2) });
    if (paramInt2 != -1)
    {
      finish();
      GMTrace.o(9029497651200L, 67275);
      return;
    }
    switch (paramInt1)
    {
    }
    do
    {
      finish();
      GMTrace.o(9029497651200L, 67275);
      return;
    } while (paramIntent == null);
    if (!at.AU())
    {
      w.e("MicroMsg.extqlauncher.QLauncherCreateShortcutUI", "account not ready");
      Toast.makeText(this, R.l.dsk, 0).show();
      finish();
      GMTrace.o(9029497651200L, 67275);
      return;
    }
    paramIntent = paramIntent.getStringExtra("Select_Contact");
    if (!bg.nm(paramIntent)) {}
    for (paramIntent = bg.g(paramIntent.split(","));; paramIntent = null)
    {
      if ((paramIntent == null) || (paramIntent.size() <= 0))
      {
        w.e("MicroMsg.extqlauncher.QLauncherCreateShortcutUI", "userNames empty");
        break;
      }
      w.d("MicroMsg.extqlauncher.QLauncherCreateShortcutUI", "userNames count " + paramIntent.size());
      String str1 = q.zE();
      try
      {
        ContentValues[] arrayOfContentValues = new ContentValues[paramIntent.size()];
        paramInt1 = 0;
        while (paramInt1 < paramIntent.size())
        {
          at.AR();
          Object localObject = c.yK().TE((String)paramIntent.get(paramInt1));
          if ((localObject == null) || ((int)((com.tencent.mm.l.a)localObject).fTq <= 0))
          {
            w.e("MicroMsg.extqlauncher.QLauncherCreateShortcutUI", "no such user");
            finish();
            GMTrace.o(9029497651200L, 67275);
            return;
          }
          String str2 = com.tencent.mm.plugin.base.model.b.tt((String)paramIntent.get(paramInt1));
          if (bg.nm(str2))
          {
            w.e("MicroMsg.extqlauncher.QLauncherCreateShortcutUI", "null encryptShortcutUser");
            finish();
            GMTrace.o(9029497651200L, 67275);
            return;
          }
          ContentValues localContentValues = new ContentValues();
          localContentValues.put("source_key", com.tencent.mm.plugin.base.model.b.jiQ);
          localContentValues.put("owner_id", com.tencent.mm.plugin.base.model.b.tt(str1));
          localContentValues.put("unique_id", str2);
          localContentValues.put("container", Integer.valueOf(1));
          localContentValues.put("item_type", Integer.valueOf(com.tencent.mm.plugin.base.model.b.y((x)localObject)));
          localContentValues.put("name", r.a((x)localObject, (String)paramIntent.get(paramInt1)));
          n.Dh();
          localContentValues.put("icon_path", com.tencent.mm.ac.d.t((String)paramIntent.get(paramInt1), false));
          localObject = new Intent("com.tencent.mm.action.BIZSHORTCUT");
          ((Intent)localObject).putExtra("LauncherUI.Shortcut.Username", str2);
          ((Intent)localObject).putExtra("LauncherUI.From.Biz.Shortcut", true);
          ((Intent)localObject).addFlags(67108864);
          localContentValues.put("intent", ((Intent)localObject).toUri(0));
          arrayOfContentValues[paramInt1] = localContentValues;
          paramInt1 += 1;
        }
        getContentResolver().bulkInsert(a.kOX, arrayOfContentValues);
        Toast.makeText(this, R.l.dsl, 0).show();
        com.tencent.mm.plugin.extqlauncher.b.avK().avN();
      }
      catch (Exception paramIntent)
      {
        w.d("MicroMsg.extqlauncher.QLauncherCreateShortcutUI", "bulkInsert shortcut failed, %s", new Object[] { paramIntent.getMessage() });
        w.printErrStackTrace("MicroMsg.extqlauncher.QLauncherCreateShortcutUI", paramIntent, "", new Object[0]);
        Toast.makeText(this, R.l.dsk, 0).show();
      }
      break;
    }
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(9029363433472L, 67274);
    super.onCreate(paramBundle);
    w.d("MicroMsg.extqlauncher.QLauncherCreateShortcutUI", "onCreate");
    requestWindowFeature(1);
    setContentView(R.i.cuk);
    paramBundle = new Intent();
    int i = s.q(new int[] { s.wTj, 64, 16384 });
    s.ex(i, 1);
    paramBundle.putExtra("list_attr", i);
    paramBundle.putExtra("list_type", 12);
    paramBundle.putExtra("stay_in_wechat", false);
    paramBundle.putExtra("titile", getString(R.l.cRp));
    paramBundle.putExtra("block_contact", q.zE());
    com.tencent.mm.bj.d.a(this, ".ui.contact.SelectContactUI", paramBundle, 1);
    GMTrace.o(9029363433472L, 67274);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes4-dex2jar.jar!\com\tencent\mm\plugin\extqlauncher\ui\QLauncherCreateShortcutUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */