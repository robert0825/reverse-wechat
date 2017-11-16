package com.tencent.mm.plugin.game.ui;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.g;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.ad.e;
import com.tencent.mm.ad.k;
import com.tencent.mm.br.a;
import com.tencent.mm.plugin.game.c.af;
import com.tencent.mm.plugin.game.c.ag;
import com.tencent.mm.plugin.game.model.SubCoreGameCenter;
import com.tencent.mm.plugin.game.model.ai;
import com.tencent.mm.plugin.game.model.al;
import com.tencent.mm.pluginsdk.model.app.aj;
import com.tencent.mm.pluginsdk.model.app.f;
import com.tencent.mm.pluginsdk.model.app.g;
import com.tencent.mm.pluginsdk.model.app.t;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.bh;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.p;
import com.tencent.mm.y.at;
import java.util.ArrayList;
import java.util.Map;

public class GameSettingsUI
  extends MMActivity
  implements e, t
{
  private String appId;
  private ProgressDialog htG;
  private int lNQ;
  private ImageView lTp;
  private TextView lTq;
  private f lUp;
  private TextView mcH;
  private TextView mcI;
  private CheckBox mcJ;
  private View mcK;
  private View mcL;
  private CheckBox mcM;
  private AuthorizationInfoLayout mcN;
  private ArrayList<String> mcO;
  private boolean mcP;
  
  public GameSettingsUI()
  {
    GMTrace.i(12681830465536L, 94487);
    this.htG = null;
    this.lNQ = 0;
    GMTrace.o(12681830465536L, 94487);
  }
  
  private boolean cl(int paramInt1, int paramInt2)
  {
    GMTrace.i(12682904207360L, 94495);
    if ((this.htG != null) && (this.htG.isShowing()))
    {
      this.htG.dismiss();
      this.htG = null;
    }
    if ((paramInt1 != 0) || (paramInt2 != 0))
    {
      Toast.makeText(this, getString(R.l.dAb, new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) }), 0).show();
      GMTrace.o(12682904207360L, 94495);
      return true;
    }
    GMTrace.o(12682904207360L, 94495);
    return false;
  }
  
  private void g(final k paramk)
  {
    GMTrace.i(12682501554176L, 94492);
    at.wS().a(paramk, 0);
    getString(R.l.cUG);
    this.htG = h.a(this, getString(R.l.cUV), true, new DialogInterface.OnCancelListener()
    {
      public final void onCancel(DialogInterface paramAnonymousDialogInterface)
      {
        GMTrace.i(12667737604096L, 94382);
        at.wS().c(paramk);
        GMTrace.o(12667737604096L, 94382);
      }
    });
    GMTrace.o(12682501554176L, 94492);
  }
  
  protected final void MP()
  {
    int i = 0;
    GMTrace.i(12682367336448L, 94491);
    this.lTp = ((ImageView)findViewById(R.h.bEd));
    this.lTq = ((TextView)findViewById(R.h.bEK));
    this.mcH = ((TextView)findViewById(R.h.bDS));
    this.mcN = ((AuthorizationInfoLayout)findViewById(R.h.bCE));
    if (this.lUp != null)
    {
      Object localObject = g.b(this.lUp.field_appId, 1, a.getDensity(this));
      Map localMap;
      label236:
      StringBuilder localStringBuilder;
      if (localObject == null)
      {
        this.lTp.setImageResource(R.g.aTM);
        if (!bg.nm(this.lUp.field_appName)) {
          this.lTq.setText(g.a(this, this.lUp, null));
        }
        if (!bg.nm(this.lUp.fdK)) {
          this.mcH.setText(this.lUp.fdK);
        }
        localObject = this.lUp.fdJ;
        if (bg.nm((String)localObject)) {
          break label424;
        }
        localMap = bh.q((String)localObject, "ScopeList");
        if ((localMap == null) || (localMap.size() <= 0)) {
          break label396;
        }
        int j = bg.getInt((String)localMap.get(".ScopeList.Count"), 0);
        if (j <= 0) {
          break label354;
        }
        this.mcO = new ArrayList();
        if (i >= j) {
          break label396;
        }
        localStringBuilder = new StringBuilder(".ScopeList.List.item");
        if (i != 0) {
          break label345;
        }
      }
      label345:
      for (localObject = "";; localObject = Integer.valueOf(i))
      {
        localObject = localObject + ".Scope";
        if (!bg.nm((String)localMap.get(localObject))) {
          this.mcO.add(localMap.get(localObject));
        }
        i += 1;
        break label236;
        localObject = com.tencent.mm.sdk.platformtools.d.a((Bitmap)localObject, true, 5.0F);
        this.lTp.setImageBitmap((Bitmap)localObject);
        break;
      }
      label354:
      com.tencent.mm.sdk.platformtools.w.d("MicroMsg.GameSettingsUI", "auth info is null :" + this.lUp.field_appName + ", " + this.appId);
      label396:
      if ((this.mcO == null) || (this.mcO.size() <= 0)) {
        break label577;
      }
      this.mcN.F(this.mcO);
    }
    for (;;)
    {
      label424:
      this.mcI = ((TextView)findViewById(R.h.buw));
      this.mcI.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(12747865587712L, 94979);
          h.a(GameSettingsUI.this, R.l.dzP, R.l.dzO, new DialogInterface.OnClickListener()new DialogInterface.OnClickListener
          {
            public final void onClick(DialogInterface paramAnonymous2DialogInterface, int paramAnonymous2Int)
            {
              GMTrace.i(12775648657408L, 95186);
              GameSettingsUI.a(GameSettingsUI.this);
              GMTrace.o(12775648657408L, 95186);
            }
          }, new DialogInterface.OnClickListener()
          {
            public final void onClick(DialogInterface paramAnonymous2DialogInterface, int paramAnonymous2Int)
            {
              GMTrace.i(12667469168640L, 94380);
              GMTrace.o(12667469168640L, 94380);
            }
          });
          GMTrace.o(12747865587712L, 94979);
        }
      });
      this.mcJ = ((CheckBox)findViewById(R.h.bcv));
      boolean bool = g.Oq(this.appId);
      this.mcJ.setChecked(bool);
      this.mcK = findViewById(R.h.bcn);
      this.mcK.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(12662368894976L, 94342);
          if (GameSettingsUI.b(GameSettingsUI.this).isChecked())
          {
            GameSettingsUI.b(GameSettingsUI.this).setChecked(false);
            GameSettingsUI.a(GameSettingsUI.this, false);
            GMTrace.o(12662368894976L, 94342);
            return;
          }
          GameSettingsUI.b(GameSettingsUI.this).setChecked(true);
          GameSettingsUI.a(GameSettingsUI.this, true);
          GMTrace.o(12662368894976L, 94342);
        }
      });
      this.mcM = ((CheckBox)findViewById(R.h.ceJ));
      this.mcL = findViewById(R.h.ceI);
      this.mcL.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(12780212060160L, 95220);
          if (GameSettingsUI.c(GameSettingsUI.this).isChecked())
          {
            GameSettingsUI.c(GameSettingsUI.this).setChecked(false);
            GameSettingsUI.b(GameSettingsUI.this, false);
            GMTrace.o(12780212060160L, 95220);
            return;
          }
          GameSettingsUI.c(GameSettingsUI.this).setChecked(true);
          GameSettingsUI.b(GameSettingsUI.this, true);
          GMTrace.o(12780212060160L, 95220);
        }
      });
      oM(R.l.dAM);
      a(new MenuItem.OnMenuItemClickListener()
      {
        public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
        {
          GMTrace.i(12717532381184L, 94753);
          GameSettingsUI.this.setResult(0);
          GameSettingsUI.this.finish();
          GMTrace.o(12717532381184L, 94753);
          return true;
        }
      });
      GMTrace.o(12682367336448L, 94491);
      return;
      label577:
      com.tencent.mm.sdk.platformtools.w.d("MicroMsg.GameSettingsUI", "this game's authinfo is null " + this.appId);
      this.mcN.setVisibility(8);
    }
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(12682769989632L, 94494);
    if (cl(paramInt1, paramInt2))
    {
      GMTrace.o(12682769989632L, 94494);
      return;
    }
    switch (paramk.getType())
    {
    }
    for (;;)
    {
      GMTrace.o(12682769989632L, 94494);
      return;
      paramInt2 = ((af)((al)paramk).kzP.gtC.gtK).lQC;
      paramString = (ag)((al)paramk).kzP.gtD.gtK;
      if ((paramString == null) || ((paramString.lQD & 0x1) <= 0)) {
        break;
      }
      paramInt1 = 1;
      switch (paramInt2)
      {
      }
    }
    paramString = this.mcM;
    if (paramInt1 == 0) {}
    for (boolean bool = true;; bool = false)
    {
      paramString.setChecked(bool);
      GMTrace.o(12682769989632L, 94494);
      return;
      paramInt1 = 0;
      break;
    }
    if (this.mcP) {}
    for (paramInt1 = 20;; paramInt1 = 21)
    {
      ai.a(this.vKB.vKW, 10, 1008, AuthorizedGameListUI.lTA, paramInt1, 1, this.appId, this.lNQ, 0, null, null, null);
      break;
    }
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, com.tencent.mm.pluginsdk.model.app.w paramw)
  {
    GMTrace.i(12682635771904L, 94493);
    if (cl(paramInt1, paramInt2))
    {
      GMTrace.o(12682635771904L, 94493);
      return;
    }
    paramString = (aj)paramw;
    if (paramString.cmdId == 0)
    {
      boolean bool = g.Oq(this.appId);
      if (this.mcJ != null) {
        this.mcJ.setChecked(bool);
      }
      if (bool)
      {
        ai.a(this.vKB.vKW, 10, 1008, AuthorizedGameListUI.lTz, 20, 1, this.appId, this.lNQ, 0, null, null, null);
        GMTrace.o(12682635771904L, 94493);
        return;
      }
      ai.a(this.vKB.vKW, 10, 1008, AuthorizedGameListUI.lTz, 21, 1, this.appId, this.lNQ, 0, null, null, null);
      GMTrace.o(12682635771904L, 94493);
      return;
    }
    if (paramString.cmdId == 1)
    {
      com.tencent.mm.sdk.platformtools.w.i("MicroMsg.GameSettingsUI", "relieve app authorization ok");
      paramString = new Intent();
      paramString.putExtra("game_app_id", this.appId);
      setResult(-1, paramString);
      finish();
    }
    GMTrace.o(12682635771904L, 94493);
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(12682098900992L, 94489);
    int i = R.i.cpw;
    GMTrace.o(12682098900992L, 94489);
    return i;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(12681964683264L, 94488);
    super.onCreate(paramBundle);
    this.lNQ = getIntent().getIntExtra("game_report_from_scene", 0);
    SubCoreGameCenter.aGk().a(2, this);
    at.wS().a(1221, this);
    this.appId = getIntent().getStringExtra("game_app_id");
    if (bg.nm(this.appId)) {
      com.tencent.mm.sdk.platformtools.w.f("MicroMsg.GameSettingsUI", "appid is null or nill");
    }
    for (;;)
    {
      MP();
      g(new al(this.appId));
      GMTrace.o(12681964683264L, 94488);
      return;
      this.lUp = g.aP(this.appId, true);
    }
  }
  
  protected void onDestroy()
  {
    GMTrace.i(12682233118720L, 94490);
    super.onDestroy();
    SubCoreGameCenter.aGk().b(2, this);
    at.wS().b(1221, this);
    GMTrace.o(12682233118720L, 94490);
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    GMTrace.i(12683038425088L, 94496);
    if ((paramInt == 4) && (paramKeyEvent.getRepeatCount() == 0))
    {
      setResult(0);
      finish();
      GMTrace.o(12683038425088L, 94496);
      return true;
    }
    boolean bool = super.onKeyDown(paramInt, paramKeyEvent);
    GMTrace.o(12683038425088L, 94496);
    return bool;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\game\ui\GameSettingsUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */