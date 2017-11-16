package com.tencent.mm.plugin.aa.ui;

import android.content.Intent;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.bj.d;
import com.tencent.mm.plugin.aa.a.h;
import com.tencent.mm.plugin.wxpay.a.f;
import com.tencent.mm.plugin.wxpay.a.g;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.pluginsdk.ui.d.k;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.p;
import com.tencent.mm.y.q;

@com.tencent.mm.ui.base.a(1)
public class AAEntranceUI
  extends MMActivity
{
  private Button hqd;
  private TextView hqe;
  
  public AAEntranceUI()
  {
    GMTrace.i(15036948938752L, 112034);
    GMTrace.o(15036948938752L, 112034);
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(15037217374208L, 112036);
    int i = a.g.sLt;
    GMTrace.o(15037217374208L, 112036);
    return i;
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    GMTrace.i(15037351591936L, 112037);
    if (paramInt2 != -1)
    {
      GMTrace.o(15037351591936L, 112037);
      return;
    }
    if (paramInt1 == 1)
    {
      paramIntent = paramIntent.getStringExtra("Select_Conv_User");
      w.i("MicroMsg.AAEntranceUI", "select chatroom：%s", new Object[] { paramIntent });
      if (!bg.nm(paramIntent))
      {
        Intent localIntent = new Intent(this.vKB.vKW, LaunchAAUI.class);
        localIntent.putExtra("enter_scene", 2);
        localIntent.putExtra("chatroom_name", paramIntent);
        startActivity(localIntent);
      }
    }
    GMTrace.o(15037351591936L, 112037);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(15037083156480L, 112035);
    super.onCreate(paramBundle);
    oM(a.i.sTX);
    this.hqd = ((Button)findViewById(a.f.swN));
    this.hqe = ((TextView)findViewById(a.f.ssZ));
    this.hqd.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(15036277850112L, 112029);
        paramAnonymousView = new Intent();
        paramAnonymousView.putExtra("key_from_scene", 1);
        paramAnonymousView.putExtra("Select_Conv_Type", 3);
        paramAnonymousView.putExtra("select_is_ret", false);
        paramAnonymousView.putExtra("mutil_select_is_ret", false);
        paramAnonymousView.putExtra("Select_block_List", q.zE());
        paramAnonymousView.putExtra("recent_remittance_contact_list", h.PP());
        d.b(AAEntranceUI.this.vKB.vKW, "remittance", ".ui.SelectRemittanceContactUI", paramAnonymousView, 1);
        GMTrace.o(15036277850112L, 112029);
      }
    });
    this.hqe.setClickable(true);
    this.hqe.setOnTouchListener(new k(this));
    paramBundle = new SpannableStringBuilder(getString(a.i.sSm));
    paramBundle.setSpan(new a(new a.a()
    {
      public final void PT()
      {
        GMTrace.i(15035472543744L, 112023);
        Intent localIntent = new Intent(AAEntranceUI.this.vKB.vKW, AAQueryListUI.class);
        AAEntranceUI.this.startActivity(localIntent);
        GMTrace.o(15035472543744L, 112023);
      }
    }), 0, paramBundle.length(), 18);
    this.hqe.setText(paramBundle);
    a(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(15040170164224L, 112058);
        AAEntranceUI.this.finish();
        GMTrace.o(15040170164224L, 112058);
        return false;
      }
    });
    GMTrace.o(15037083156480L, 112035);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\aa\ui\AAEntranceUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */