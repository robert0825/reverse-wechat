package com.tencent.mm.plugin.game.ui;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import android.widget.Toast;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.ad.n;
import com.tencent.mm.plugin.game.model.SubCoreGameCenter;
import com.tencent.mm.plugin.game.model.ai;
import com.tencent.mm.plugin.game.model.ao;
import com.tencent.mm.pluginsdk.model.app.d;
import com.tencent.mm.pluginsdk.model.app.t;
import com.tencent.mm.pluginsdk.model.app.x;
import com.tencent.mm.protocal.c.ds;
import com.tencent.mm.protocal.c.wl;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.v;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.p;
import com.tencent.mm.y.at;
import java.util.LinkedList;

public class AuthorizedGameListUI
  extends MMActivity
  implements AdapterView.OnItemClickListener, t
{
  public static int lTA;
  public static int lTw;
  public static int lTx;
  public static int lTy;
  public static int lTz;
  private ProgressDialog htG;
  private int lNQ;
  private ListView lTs;
  private a lTt;
  private View lTu;
  private int lTv;
  
  static
  {
    GMTrace.i(12686259650560L, 94520);
    lTw = 1;
    lTx = 2;
    lTy = 4;
    lTz = 5;
    lTA = 6;
    GMTrace.o(12686259650560L, 94520);
  }
  
  public AuthorizedGameListUI()
  {
    GMTrace.i(12684783255552L, 94509);
    this.htG = null;
    this.lTv = -1;
    this.lNQ = 0;
    GMTrace.o(12684783255552L, 94509);
  }
  
  protected final void MP()
  {
    GMTrace.i(12685320126464L, 94513);
    this.lTs = ((ListView)findViewById(R.h.bEx));
    this.lTu = findViewById(R.h.bwC);
    this.lTt = new a(this);
    this.lTt.lTD = new b.a()
    {
      public final void oI(int paramAnonymousInt)
      {
        GMTrace.i(12758200352768L, 95056);
        if (paramAnonymousInt <= 0)
        {
          AuthorizedGameListUI.a(AuthorizedGameListUI.this).setVisibility(8);
          AuthorizedGameListUI.b(AuthorizedGameListUI.this).setVisibility(0);
          GMTrace.o(12758200352768L, 95056);
          return;
        }
        AuthorizedGameListUI.a(AuthorizedGameListUI.this).setVisibility(0);
        AuthorizedGameListUI.b(AuthorizedGameListUI.this).setVisibility(8);
        GMTrace.o(12758200352768L, 95056);
      }
    };
    this.lTs.setVerticalScrollBarEnabled(false);
    this.lTs.setOnItemClickListener(this);
    this.lTs.setAdapter(this.lTt);
    oM(R.l.dAk);
    a(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(12664516378624L, 94358);
        AuthorizedGameListUI.this.finish();
        GMTrace.o(12664516378624L, 94358);
        return true;
      }
    });
    GMTrace.o(12685320126464L, 94513);
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, com.tencent.mm.pluginsdk.model.app.w paramw)
  {
    GMTrace.i(12685856997376L, 94517);
    if ((this.htG != null) && (this.htG.isShowing())) {
      this.htG.dismiss();
    }
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      paramString = ((wl)((ao)paramw).kzP.gtD.gtK).uoG;
      if ((paramString == null) || (paramString.size() == 0)) {
        com.tencent.mm.sdk.platformtools.w.d("MicroMsg.AuthorizedGameListUI", "no authapp");
      }
      this.lTt.P(paramString);
      GMTrace.o(12685856997376L, 94517);
      return;
    }
    Toast.makeText(this, getString(R.l.dAi, new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) }), 0).show();
    GMTrace.o(12685856997376L, 94517);
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(12685185908736L, 94512);
    int i = R.i.bEw;
    GMTrace.o(12685185908736L, 94512);
    return i;
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    GMTrace.i(12685722779648L, 94516);
    if (paramInt1 != 0)
    {
      com.tencent.mm.sdk.platformtools.w.e("MicroMsg.AuthorizedGameListUI", "invaild requestcode" + paramInt1);
      GMTrace.o(12685722779648L, 94516);
      return;
    }
    if (paramInt2 == -1)
    {
      this.lTt.remove(this.lTv);
      paramIntent = paramIntent.getStringExtra("game_app_id");
      ai.a(this.vKB.vKW, 10, 1008, lTy, 21, 1, paramIntent, this.lNQ, 0, null, null, null);
    }
    if (this.lTt != null) {
      this.lTt.notifyDataSetChanged();
    }
    GMTrace.o(12685722779648L, 94516);
  }
  
  public void onCreate(final Bundle paramBundle)
  {
    GMTrace.i(12684917473280L, 94510);
    super.onCreate(paramBundle);
    this.lNQ = getIntent().getIntExtra("game_report_from_scene", 0);
    SubCoreGameCenter.aGk().a(3, this);
    MP();
    paramBundle = new x(3, new ao(v.d(getSharedPreferences(ab.bPU(), 0))));
    at.wS().a(paramBundle, 0);
    getString(R.l.cUG);
    this.htG = h.a(this, getString(R.l.cUV), true, new DialogInterface.OnCancelListener()
    {
      public final void onCancel(DialogInterface paramAnonymousDialogInterface)
      {
        GMTrace.i(12702097342464L, 94638);
        at.wS().c(paramBundle);
        GMTrace.o(12702097342464L, 94638);
      }
    });
    GMTrace.o(12684917473280L, 94510);
  }
  
  protected void onDestroy()
  {
    GMTrace.i(12685454344192L, 94514);
    super.onDestroy();
    SubCoreGameCenter.aGk().b(3, this);
    if (this.lTt != null) {
      this.lTt.clear();
    }
    GMTrace.o(12685454344192L, 94514);
  }
  
  public void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    GMTrace.i(12685588561920L, 94515);
    paramAdapterView = new Intent(this, GameSettingsUI.class);
    this.lTv = paramInt;
    paramAdapterView.putExtra("game_app_id", ((ds)this.lTt.getItem(paramInt)).lPg);
    paramAdapterView.putExtra("game_report_from_scene", this.lNQ);
    startActivityForResult(paramAdapterView, 0);
    ai.a(this, 10, 1008, lTx, 6, this.lNQ, null);
    GMTrace.o(12685588561920L, 94515);
  }
  
  protected void onResume()
  {
    GMTrace.i(12685051691008L, 94511);
    super.onResume();
    GMTrace.o(12685051691008L, 94511);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\game\ui\AuthorizedGameListUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */