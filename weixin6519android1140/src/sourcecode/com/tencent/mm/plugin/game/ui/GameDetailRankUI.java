package com.tencent.mm.plugin.game.ui;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ListView;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.plugin.game.model.ad;
import com.tencent.mm.plugin.game.model.c;
import com.tencent.mm.plugin.game.model.l;
import com.tencent.mm.plugin.game.model.m;
import com.tencent.mm.pluginsdk.model.app.g;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.p;
import com.tencent.mm.y.at;
import com.tencent.mm.y.u;
import com.tencent.mm.y.u.b;

public class GameDetailRankUI
  extends MMActivity
{
  public static String EXTRA_SESSION_ID;
  public static String lWD;
  private String appId;
  private ListView lWA;
  private GameRankHeadView lWB;
  private h lWC;
  
  static
  {
    GMTrace.i(12666261209088L, 94371);
    EXTRA_SESSION_ID = "extra_session_id";
    lWD = "gameDetailRankDataKey";
    GMTrace.o(12666261209088L, 94371);
  }
  
  public GameDetailRankUI()
  {
    GMTrace.i(12665187467264L, 94363);
    GMTrace.o(12665187467264L, 94363);
  }
  
  protected final void MP()
  {
    GMTrace.i(12665858555904L, 94368);
    sq(g.m(this.vKB.vKW, this.appId));
    a(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(12770414166016L, 95147);
        GameDetailRankUI.this.finish();
        GMTrace.o(12770414166016L, 95147);
        return true;
      }
    });
    GMTrace.o(12665858555904L, 94368);
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(12665724338176L, 94367);
    int i = R.i.cyy;
    GMTrace.o(12665724338176L, 94367);
    return i;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(12665321684992L, 94364);
    super.onCreate(paramBundle);
    paramBundle = getIntent().getStringExtra(EXTRA_SESSION_ID);
    paramBundle = u.Av().gx(paramBundle);
    if (paramBundle == null)
    {
      finish();
      GMTrace.o(12665321684992L, 94364);
      return;
    }
    paramBundle = (a)paramBundle.get(lWD);
    this.lWA = ((ListView)findViewById(R.h.bDK));
    Object localObject;
    if ((!bg.nm(paramBundle.lWF)) && (!bg.nm(paramBundle.lWG)))
    {
      localObject = ((LayoutInflater)this.vKB.vKW.getSystemService("layout_inflater")).inflate(R.i.cyF, this.lWA, false);
      this.lWB = ((GameRankHeadView)((View)localObject).findViewById(R.h.bEQ));
      this.lWA.addHeaderView((View)localObject);
      localObject = this.lWB;
      ((GameRankHeadView)localObject).ikm.setText(paramBundle.lWF);
      ((GameRankHeadView)localObject).mbm.setText(paramBundle.lWG);
      ((GameRankHeadView)localObject).lOm = paramBundle.lWH;
      ((GameRankHeadView)localObject).lOm.eSa = 1203;
      ((GameRankHeadView)localObject).lOm.position = 2;
      if (((GameRankHeadView)localObject).lWO == null) {
        ((GameRankHeadView)localObject).lWO = new m(((GameRankHeadView)localObject).lOm);
      }
      ((GameRankHeadView)localObject).lWO.cB(((GameRankHeadView)localObject).getContext());
      ((GameRankHeadView)localObject).lWO.aFo();
      ((GameRankHeadView)localObject).aGJ();
      if (((GameRankHeadView)localObject).lWM == null) {
        break label329;
      }
      l.a(((GameRankHeadView)localObject).lWM);
    }
    for (;;)
    {
      ((GameRankHeadView)localObject).lWk.setOnClickListener((View.OnClickListener)localObject);
      this.lWC = new h(this);
      this.lWC.CH = R.i.cyz;
      this.lWA.setAdapter(this.lWC);
      this.appId = paramBundle.lWH.field_appId;
      if (!bg.nm(this.appId)) {
        break;
      }
      finish();
      GMTrace.o(12665321684992L, 94364);
      return;
      label329:
      ((GameRankHeadView)localObject).lWM = new GameRankHeadView.1((GameRankHeadView)localObject);
      l.a(((GameRankHeadView)localObject).lWM);
    }
    MP();
    at.xB().A(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(12744107491328L, 94951);
        ad localad = new ad(GameDetailRankUI.a(GameDetailRankUI.this));
        GameDetailRankUI.b(GameDetailRankUI.this).a(localad);
        GMTrace.o(12744107491328L, 94951);
      }
    });
    GMTrace.o(12665321684992L, 94364);
  }
  
  protected void onDestroy()
  {
    GMTrace.i(12665590120448L, 94366);
    super.onDestroy();
    l.b(this.lWB.lWM);
    GMTrace.o(12665590120448L, 94366);
  }
  
  public void onResume()
  {
    GMTrace.i(12665455902720L, 94365);
    super.onResume();
    GMTrace.o(12665455902720L, 94365);
  }
  
  public static final class a
  {
    public String lWF;
    public String lWG;
    c lWH;
    
    public a()
    {
      GMTrace.i(12705587003392L, 94664);
      GMTrace.o(12705587003392L, 94664);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\game\ui\GameDetailRankUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */