package com.tencent.mm.plugin.base.stub;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.ad.k;
import com.tencent.mm.ad.n;
import com.tencent.mm.modelsimple.ai;
import com.tencent.mm.pluginsdk.ui.AutoLoginActivity;
import com.tencent.mm.pluginsdk.ui.AutoLoginActivity.a;
import com.tencent.mm.protocal.c.bjv;
import com.tencent.mm.protocal.c.ci;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.y.at;
import java.util.LinkedList;

public class WXBizEntryActivity
  extends AutoLoginActivity
{
  private int jji;
  
  public WXBizEntryActivity()
  {
    GMTrace.i(12828530442240L, 95580);
    GMTrace.o(12828530442240L, 95580);
  }
  
  protected final void a(AutoLoginActivity.a parama, Intent paramIntent)
  {
    GMTrace.i(12829067313152L, 95584);
    w.i("MicroMsg.WXBizEntryActivity", "postLogin, loginResult = " + parama);
    if (getIntent() != null) {
      this.jji = getIntent().getIntExtra("key_command_id", 0);
    }
    switch (5.jjk[parama.ordinal()])
    {
    default: 
      w.e("MicroMsg.WXBizEntryActivity", "postLogin, unknown login result = " + parama);
    }
    for (;;)
    {
      finish();
      GMTrace.o(12829067313152L, 95584);
      return;
      w.i("MicroMsg.WXBizEntryActivity", "req type = %d", new Object[] { Integer.valueOf(this.jji) });
      switch (this.jji)
      {
      case 10: 
      case 18: 
      default: 
        finish();
      }
      for (;;)
      {
        GMTrace.o(12829067313152L, 95584);
        return;
        com.tencent.mm.bj.d.a(this, "card", ".ui.CardAddEntranceUI", getIntent(), false);
        finish();
        GMTrace.o(12829067313152L, 95584);
        return;
        com.tencent.mm.bj.d.a(this, "card", ".ui.CardListSelectedUI", getIntent(), false);
        finish();
        GMTrace.o(12829067313152L, 95584);
        return;
        parama = getIntent();
        parama.setClassName(this, "com.tencent.mm.ui.CheckCanSubscribeBizUI");
        startActivity(parama);
        finish();
        GMTrace.o(12829067313152L, 95584);
        return;
        parama = getIntent();
        parama.putExtra("device_type", 1);
        com.tencent.mm.bj.d.a(this, "exdevice", ".ui.ExdeviceRankInfoUI", parama, false);
        finish();
        GMTrace.o(12829067313152L, 95584);
        return;
        parama = getIntent();
        parama.putExtra("key_static_from_scene", 100001);
        com.tencent.mm.bj.d.a(this, "luckymoney", ".ui.LuckyMoneyBusiReceiveUI", parama, false);
        finish();
        GMTrace.o(12829067313152L, 95584);
        return;
        new a(this, getIntent().getStringExtra("key_app_id"), getIntent().getStringExtra("open_id"), new d.a()
        {
          public final void dl(boolean paramAnonymousBoolean)
          {
            GMTrace.i(12842623303680L, 95685);
            if (paramAnonymousBoolean) {
              com.tencent.mm.bj.d.a(WXBizEntryActivity.this, "game", ".ui.CreateOrJoinChatroomUI", WXBizEntryActivity.this.getIntent(), false);
            }
            for (;;)
            {
              WXBizEntryActivity.this.finish();
              GMTrace.o(12842623303680L, 95685);
              return;
              w.e("MicroMsg.WXBizEntryActivity", "openIdCheck false");
            }
          }
        }).agL();
        GMTrace.o(12829067313152L, 95584);
        return;
        String str1;
        String str2;
        int i;
        try
        {
          paramIntent = getIntent().getData();
          parama = new Runnable()
          {
            public final void run()
            {
              GMTrace.i(12830946361344L, 95598);
              WXBizEntryActivity.this.findViewById(R.h.bNw).setVisibility(8);
              GMTrace.o(12830946361344L, 95598);
            }
          };
          str1 = getIntent().getStringExtra("key_package_name");
          str2 = getIntent().getStringExtra("key_package_signature");
          i = getIntent().getIntExtra("translate_link_scene", 1);
          w.d("MicroMsg.WXBizLogic", "dealWithHandleScanResult: callPackage=%s, packageSignature=%s", new Object[] { str1, str2 });
          if ((bg.nm(str1)) || (bg.nm(str2)))
          {
            w.e("MicroMsg.WXBizLogic", "dealWithHandleScanResult:packageName or signature null");
            GMTrace.o(12829067313152L, 95584);
            return;
          }
        }
        catch (Exception parama)
        {
          w.e("MicroMsg.WXBizEntryActivity", "get url from intent failed : %s", new Object[] { parama.getMessage() });
          GMTrace.o(12829067313152L, 95584);
          return;
        }
        LinkedList localLinkedList = new LinkedList();
        ci localci = new ci();
        w.i("MicroMsg.WXBizLogic", "dealWithHandleScanResult package name = %s", new Object[] { str1 });
        localci.tQt = str1;
        localci.signature = str2;
        localLinkedList.add(localci);
        paramIntent = new ai(paramIntent.toString(), i, localLinkedList);
        parama = new e.1(this, parama);
        at.wS().a(1200, parama);
        at.wS().a(paramIntent, 0);
        GMTrace.o(12829067313152L, 95584);
        return;
        try
        {
          parama = getIntent().getData();
          if ((parama == null) || (!com.tencent.mm.pluginsdk.d.NX(parama.toString()))) {
            continue;
          }
          com.tencent.mm.y.u.Av().gx("key_data_center_session_id");
          com.tencent.mm.pluginsdk.d.a(this, parama.toString(), getIntent().getIntExtra("translate_link_scene", 1), new com.tencent.mm.pluginsdk.d.a()
          {
            public final void a(int paramAnonymousInt1, int paramAnonymousInt2, String paramAnonymousString, k paramAnonymousk, boolean paramAnonymousBoolean)
            {
              GMTrace.i(16286381768704L, 121343);
              w.i("MicroMsg.WXBizEntryActivity", "DeepLinkHelper.DeepLinkCallback, %d, %d, %s, %b", new Object[] { Integer.valueOf(paramAnonymousInt1), Integer.valueOf(paramAnonymousInt2), paramAnonymousString, Boolean.valueOf(paramAnonymousBoolean) });
              if ((paramAnonymousk != null) && (paramAnonymousInt1 != 0) && (paramAnonymousInt2 != 0) && ((paramAnonymousk instanceof ai)))
              {
                paramAnonymousString = ((ai)paramAnonymousk).LM();
                if ((paramAnonymousString != null) && (!WXBizEntryActivity.this.isFinishing())) {
                  com.tencent.mm.ui.base.u.makeText(WXBizEntryActivity.this, WXBizEntryActivity.this.getString(R.l.cUG) + " : " + bg.nl(paramAnonymousString.uUJ), 0).show();
                }
              }
              WXBizEntryActivity.this.finish();
              GMTrace.o(16286381768704L, 121343);
            }
          }, getIntent().getStringExtra("key_package_name"), getIntent().getStringExtra("key_package_signature"));
          GMTrace.o(12829067313152L, 95584);
          return;
        }
        catch (Exception parama)
        {
          for (;;)
          {
            w.e("MicroMsg.WXBizEntryActivity", "post login get url from intent failed : %s", new Object[] { parama.getMessage() });
            parama = null;
          }
        }
        try
        {
          parama = getIntent().getData();
          if (parama != null)
          {
            com.tencent.mm.pluginsdk.d.a(this, parama.toString(), getIntent().getIntExtra("translate_link_scene", 1), new com.tencent.mm.pluginsdk.d.a()
            {
              public final void a(int paramAnonymousInt1, int paramAnonymousInt2, String paramAnonymousString, k paramAnonymousk, boolean paramAnonymousBoolean)
              {
                GMTrace.i(18436415553536L, 137362);
                w.i("MicroMsg.WXBizEntryActivity", "launchWXMiniprogram, DeepLinkHelper.DeepLinkCallback, %d, %d, %s, %b", new Object[] { Integer.valueOf(paramAnonymousInt1), Integer.valueOf(paramAnonymousInt2), paramAnonymousString, Boolean.valueOf(paramAnonymousBoolean) });
                if ((paramAnonymousk != null) && (paramAnonymousInt1 != 0) && (paramAnonymousInt2 != 0) && ((paramAnonymousk instanceof ai)))
                {
                  paramAnonymousString = ((ai)paramAnonymousk).LM();
                  if ((paramAnonymousString != null) && (!WXBizEntryActivity.this.isFinishing())) {
                    com.tencent.mm.ui.base.u.makeText(WXBizEntryActivity.this, WXBizEntryActivity.this.getString(R.l.cUG) + " : " + bg.nl(paramAnonymousString.uUJ), 0).show();
                  }
                }
                WXBizEntryActivity.this.finish();
                GMTrace.o(18436415553536L, 137362);
              }
            }, getIntent().getStringExtra("key_package_name"), getIntent().getStringExtra("key_package_signature"));
            GMTrace.o(12829067313152L, 95584);
            return;
          }
        }
        catch (Exception parama)
        {
          for (;;)
          {
            w.e("MicroMsg.WXBizEntryActivity", "get data from intent for launch wxminiprogram failed : %s", new Object[] { parama.getMessage() });
            parama = null;
          }
        }
      }
      w.e("MicroMsg.WXBizEntryActivity", "postLogin fail, loginResult = " + parama);
    }
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(12828798877696L, 95582);
    int i = R.i.cqn;
    GMTrace.o(12828798877696L, 95582);
    return i;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(12828664659968L, 95581);
    super.onCreate(paramBundle);
    AU(0);
    GMTrace.o(12828664659968L, 95581);
  }
  
  protected final boolean y(Intent paramIntent)
  {
    GMTrace.i(12828933095424L, 95583);
    GMTrace.o(12828933095424L, 95583);
    return true;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\base\stub\WXBizEntryActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */