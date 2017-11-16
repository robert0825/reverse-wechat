package com.tencent.mm.plugin.game.ui;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.l;
import com.tencent.mm.plugin.game.d.a;
import com.tencent.mm.plugin.game.d.a.a;
import com.tencent.mm.plugin.game.model.e;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.base.preference.MMPreference;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.ui.base.preference.PreferenceCategory;
import com.tencent.mm.ui.base.preference.f;
import com.tencent.mm.ui.p.b;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

public class GameRegionSelectUI
  extends MMPreference
{
  private f htU;
  private Map<String, GameRegionPreference.a> mbB;
  private GameRegionPreference.a mbw;
  
  public GameRegionSelectUI()
  {
    GMTrace.i(12733638508544L, 94873);
    GMTrace.o(12733638508544L, 94873);
  }
  
  protected final void MP()
  {
    GMTrace.i(12734175379456L, 94877);
    oM(R.l.dAH);
    a(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(12661295153152L, 94334);
        GameRegionSelectUI.this.setResult(0);
        GameRegionSelectUI.this.aLo();
        GameRegionSelectUI.this.finish();
        GMTrace.o(12661295153152L, 94334);
        return true;
      }
    });
    a(0, getString(R.l.dAG), new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        int i = 0;
        GMTrace.i(12732027895808L, 94861);
        if (GameRegionSelectUI.this.getSharedPreferences("game_center_pref", 0).getInt("game_region_confirm_mark", 0) == 1) {}
        while (i != 0)
        {
          h.a(GameRegionSelectUI.this, true, GameRegionSelectUI.this.getString(R.l.dAE), "", GameRegionSelectUI.this.getString(R.l.dAF), GameRegionSelectUI.this.getString(R.l.dAD), new DialogInterface.OnClickListener()new DialogInterface.OnClickListener
          {
            public final void onClick(DialogInterface paramAnonymous2DialogInterface, int paramAnonymous2Int)
            {
              GMTrace.i(12683977949184L, 94503);
              GameRegionSelectUI.this.getSharedPreferences("game_center_pref", 0).edit().putInt("game_region_confirm_mark", 1).commit();
              if (GameRegionSelectUI.a(GameRegionSelectUI.this) != null)
              {
                e.X(GameRegionSelectUI.this, GameRegionSelectUI.a(GameRegionSelectUI.this).fjq);
                a.a.mdJ.mdI = true;
              }
              paramAnonymous2DialogInterface = new Intent();
              GameRegionPreference.a locala = e.cy(GameRegionSelectUI.this);
              if (locala != null)
              {
                paramAnonymous2DialogInterface.putExtra("gameRegionName", e.a(locala));
                GameRegionSelectUI.this.setResult(-1, paramAnonymous2DialogInterface);
              }
              for (;;)
              {
                GameRegionSelectUI.this.finish();
                GMTrace.o(12683977949184L, 94503);
                return;
                GameRegionSelectUI.this.setResult(1);
              }
            }
          }, new DialogInterface.OnClickListener()
          {
            public final void onClick(DialogInterface paramAnonymous2DialogInterface, int paramAnonymous2Int)
            {
              GMTrace.i(12730148847616L, 94847);
              GMTrace.o(12730148847616L, 94847);
            }
          });
          GMTrace.o(12732027895808L, 94861);
          return true;
          i = 1;
        }
        if (GameRegionSelectUI.a(GameRegionSelectUI.this) != null)
        {
          e.X(GameRegionSelectUI.this, GameRegionSelectUI.a(GameRegionSelectUI.this).fjq);
          a.a.mdJ.mdI = true;
        }
        paramAnonymousMenuItem = new Intent();
        GameRegionPreference.a locala = e.cy(GameRegionSelectUI.this);
        if (locala != null)
        {
          paramAnonymousMenuItem.putExtra("gameRegionName", e.a(locala));
          GameRegionSelectUI.this.setResult(-1, paramAnonymousMenuItem);
        }
        for (;;)
        {
          GameRegionSelectUI.this.finish();
          break;
          GameRegionSelectUI.this.setResult(1);
        }
      }
    }, p.b.vLG);
    this.htU.removeAll();
    this.mbB = a.a.mdJ.aGO();
    Object localObject = e.cy(this);
    if (localObject != null) {
      ((GameRegionPreference.a)localObject).mbA = true;
    }
    localObject = this.mbB.values().iterator();
    while (((Iterator)localObject).hasNext())
    {
      GameRegionPreference.a locala = (GameRegionPreference.a)((Iterator)localObject).next();
      if (locala != null)
      {
        GameRegionPreference localGameRegionPreference = new GameRegionPreference(this);
        if ((locala == null) || (bg.nm(locala.fjq))) {
          w.e("MicroMsg.GameRegionPreference", "setData region error");
        }
        for (;;)
        {
          if (!locala.isDefault) {
            break label188;
          }
          this.htU.a(localGameRegionPreference, 0);
          break;
          localGameRegionPreference.mbw = locala;
          localGameRegionPreference.setKey(locala.fjq);
        }
        label188:
        this.htU.a(localGameRegionPreference);
      }
    }
    localObject = new PreferenceCategory(this);
    this.htU.a((Preference)localObject);
    this.htU.notifyDataSetChanged();
    GMTrace.o(12734175379456L, 94877);
  }
  
  public final int QI()
  {
    GMTrace.i(12734041161728L, 94876);
    GMTrace.o(12734041161728L, 94876);
    return -1;
  }
  
  public final boolean a(f paramf, Preference paramPreference)
  {
    GMTrace.i(12734309597184L, 94878);
    if ((paramPreference instanceof GameRegionPreference))
    {
      paramPreference = ((GameRegionPreference)paramPreference).mbw;
      if (paramPreference == null)
      {
        GMTrace.o(12734309597184L, 94878);
        return false;
      }
      this.mbw = paramPreference;
      Iterator localIterator = this.mbB.values().iterator();
      while (localIterator.hasNext()) {
        ((GameRegionPreference.a)localIterator.next()).mbA = false;
      }
      paramPreference.mbA = true;
      paramf.notifyDataSetChanged();
      GMTrace.o(12734309597184L, 94878);
      return true;
    }
    GMTrace.o(12734309597184L, 94878);
    return false;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(12733772726272L, 94874);
    super.onCreate(paramBundle);
    this.htU = this.wky;
    MP();
    GMTrace.o(12733772726272L, 94874);
  }
  
  protected void onDestroy()
  {
    GMTrace.i(12733906944000L, 94875);
    a.a.mdJ.aGM();
    super.onDestroy();
    GMTrace.o(12733906944000L, 94875);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\game\ui\GameRegionSelectUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */