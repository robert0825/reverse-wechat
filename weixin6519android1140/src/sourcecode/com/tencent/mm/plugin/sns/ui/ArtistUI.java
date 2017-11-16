package com.tencent.mm.plugin.sns.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.widget.ListView;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.e;
import com.tencent.mm.ad.k;
import com.tencent.mm.ad.m;
import com.tencent.mm.ad.n;
import com.tencent.mm.plugin.sns.c.a;
import com.tencent.mm.plugin.sns.i.f;
import com.tencent.mm.plugin.sns.i.g;
import com.tencent.mm.plugin.sns.i.j;
import com.tencent.mm.plugin.sns.model.ae;
import com.tencent.mm.pluginsdk.l;
import com.tencent.mm.protocal.c.do;
import com.tencent.mm.protocal.c.dp;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.v;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.an;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.r;

public class ArtistUI
  extends MMActivity
  implements e
{
  private SharedPreferences ghC;
  private r hsU;
  private ListView juD;
  private String mwK;
  private g pOA;
  private ArtistHeader pOB;
  private k pOC;
  
  public ArtistUI()
  {
    GMTrace.i(8635837054976L, 64342);
    this.mwK = "";
    this.pOC = null;
    this.hsU = null;
    GMTrace.o(8635837054976L, 64342);
  }
  
  protected final void MP()
  {
    GMTrace.i(8636508143616L, 64347);
    oM(i.j.pik);
    getString(i.j.cUG);
    this.hsU = com.tencent.mm.ui.base.h.a(this, getString(i.j.cTt), true, new DialogInterface.OnCancelListener()
    {
      public final void onCancel(DialogInterface paramAnonymousDialogInterface)
      {
        GMTrace.i(8741600624640L, 65130);
        GMTrace.o(8741600624640L, 65130);
      }
    });
    this.juD = ((ListView)findViewById(i.f.pcB));
    a.hnI.at(false);
    this.pOA = new g(this, this.mwK, new g.b()new g.a
    {
      public final void vc(int paramAnonymousInt)
      {
        GMTrace.i(8627783991296L, 64282);
        Intent localIntent = new Intent();
        localIntent.putExtra("sns_gallery_is_artist", true);
        localIntent.putExtra("sns_gallery_position", paramAnonymousInt);
        localIntent.putExtra("sns_gallery_artist_lan", ArtistUI.a(ArtistUI.this));
        localIntent.putExtra("sns_gallery_showtype", 2);
        localIntent.setClass(ArtistUI.this, ArtistBrowseUI.class);
        ArtistUI.this.startActivity(localIntent);
        GMTrace.o(8627783991296L, 64282);
      }
    }, new g.a()
    {
      public final void a(do paramAnonymousdo)
      {
        GMTrace.i(8566714925056L, 63827);
        ArtistHeader localArtistHeader;
        if (ArtistUI.b(ArtistUI.this) != null)
        {
          ArtistUI.b(ArtistUI.this).setVisibility(0);
          localArtistHeader = ArtistUI.b(ArtistUI.this);
          if (paramAnonymousdo != null) {
            break label131;
          }
          w.e("MicroMsg.ArtistHeader", "userName or selfName is null ");
        }
        for (;;)
        {
          paramAnonymousdo = paramAnonymousdo.lPi;
          if ((paramAnonymousdo != null) && (!paramAnonymousdo.equals(""))) {
            ArtistUI.c(ArtistUI.this).edit().putString("artist_name", paramAnonymousdo).commit();
          }
          if (ArtistUI.d(ArtistUI.this) != null) {
            ArtistUI.d(ArtistUI.this).notifyDataSetChanged();
          }
          ArtistUI.e(ArtistUI.this).dismiss();
          GMTrace.o(8566714925056L, 63827);
          return;
          label131:
          localArtistHeader.pOo = paramAnonymousdo;
          ae.bja().b(paramAnonymousdo.tRQ.tRR, localArtistHeader.pOt.hqg, localArtistHeader.context.hashCode(), an.vBh);
          localArtistHeader.pOt.pOy.setText(paramAnonymousdo.lPi);
          localArtistHeader.pOt.mrx.setText(paramAnonymousdo.tRP);
          localArtistHeader.pOt.hqi.setText(paramAnonymousdo.eBt);
          localArtistHeader.pOt.pOz.setText(paramAnonymousdo.tRO);
        }
      }
      
      public final void bmE()
      {
        GMTrace.i(8566849142784L, 63828);
        if ((ArtistUI.f(ArtistUI.this) == null) && (ArtistUI.e(ArtistUI.this) != null))
        {
          w.d("MicroMsg.ArtistUI", "onNothingBgGet");
          a.hnI.at(true);
        }
        GMTrace.o(8566849142784L, 63828);
      }
    });
    this.pOB = new ArtistHeader(this);
    this.juD.addHeaderView(this.pOB);
    this.juD.setAdapter(this.pOA);
    this.pOA.notifyDataSetChanged();
    this.pOB.setVisibility(8);
    a(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(8597585002496L, 64057);
        ArtistUI.this.finish();
        GMTrace.o(8597585002496L, 64057);
        return true;
      }
    });
    GMTrace.o(8636508143616L, 64347);
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(8636776579072L, 64349);
    if ((!(paramk instanceof m)) || (((m)paramk).DM() != 4))
    {
      w.d("MicroMsg.ArtistUI", "another scene");
      GMTrace.o(8636776579072L, 64349);
      return;
    }
    w.i("MicroMsg.ArtistUI", "onSceneEnd: errType = " + paramInt1 + " errCode = " + paramInt2 + " errMsg = " + paramString + " type = " + paramk.getType() + " @" + hashCode());
    if ((paramInt1 != 0) || (paramInt2 != 0))
    {
      if ((paramk.getType() == 159) && (this.hsU != null)) {
        this.hsU.dismiss();
      }
      GMTrace.o(8636776579072L, 64349);
      return;
    }
    switch (paramk.getType())
    {
    }
    for (;;)
    {
      GMTrace.o(8636776579072L, 64349);
      return;
      if (this.pOA != null) {
        this.pOA.QF();
      }
      this.pOC = null;
    }
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(8636642361344L, 64348);
    int i = i.g.pfw;
    GMTrace.o(8636642361344L, 64348);
    return i;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(8635971272704L, 64343);
    super.onCreate(paramBundle);
    String str = v.d(getSharedPreferences(ab.bPU(), 0));
    w.d("MicroMsg.ArtistUI", "filterLan temp " + str);
    paramBundle = str;
    if (!str.equals("zh_CN"))
    {
      paramBundle = str;
      if (!str.equals("en"))
      {
        if (!str.equals("zh_TW")) {
          break label167;
        }
        paramBundle = str;
      }
    }
    for (;;)
    {
      this.mwK = paramBundle;
      w.d("MicroMsg.ArtistUI", "lan " + this.mwK);
      com.tencent.mm.kernel.h.xz();
      com.tencent.mm.kernel.h.xx().fYr.a(159, this);
      this.ghC = getSharedPreferences(ab.bPU(), 0);
      MP();
      paramBundle = this.pOB;
      ae.biY().a(paramBundle);
      GMTrace.o(8635971272704L, 64343);
      return;
      label167:
      if (str.equals("zh_HK")) {
        paramBundle = "zh_TW";
      } else {
        paramBundle = "en";
      }
    }
  }
  
  protected void onDestroy()
  {
    GMTrace.i(8636105490432L, 64344);
    super.onDestroy();
    if (this.hsU != null) {
      this.hsU = null;
    }
    if (this.pOB != null)
    {
      ArtistHeader localArtistHeader = this.pOB;
      ae.biY().b(localArtistHeader);
    }
    ae.bja().K(this);
    com.tencent.mm.kernel.h.xz();
    com.tencent.mm.kernel.h.xx().fYr.b(159, this);
    GMTrace.o(8636105490432L, 64344);
  }
  
  protected void onPause()
  {
    GMTrace.i(8636373925888L, 64346);
    super.onPause();
    GMTrace.o(8636373925888L, 64346);
  }
  
  protected void onResume()
  {
    GMTrace.i(8636239708160L, 64345);
    super.onResume();
    GMTrace.o(8636239708160L, 64345);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\sns\ui\ArtistUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */