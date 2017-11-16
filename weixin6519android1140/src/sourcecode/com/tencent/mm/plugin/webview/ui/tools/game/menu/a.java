package com.tencent.mm.plugin.webview.ui.tools.game.menu;

import android.content.res.Resources;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.l;
import com.tencent.mm.protocal.c.aob;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.LinkedList;
import java.util.List;

public final class a
{
  public static final List<aob> rQV;
  
  static
  {
    GMTrace.i(18083557146624L, 134733);
    rQV = new LinkedList();
    aob localaob = new aob();
    localaob.eBt = ab.getResources().getString(R.l.dAq);
    localaob.nFH = "game_menu_icon_share_to_friend";
    localaob.uDZ = 1;
    localaob.uDY = 1;
    localaob.und = c.a.rRe.code;
    rQV.add(localaob);
    localaob = new aob();
    localaob.eBt = ab.getResources().getString(R.l.dAo);
    localaob.nFH = "game_menu_icon_exit";
    localaob.uDZ = 2;
    localaob.uDY = 2;
    localaob.und = c.a.rRd.code;
    rQV.add(localaob);
    localaob = new aob();
    localaob.eBt = ab.getResources().getString(R.l.dAs);
    localaob.nFH = "game_menu_icon_stick_on";
    localaob.uDZ = 3;
    localaob.uDY = 3;
    localaob.und = c.a.rRg.code;
    rQV.add(localaob);
    localaob = new aob();
    localaob.eBt = ab.getResources().getString(R.l.dAr);
    localaob.nFH = "game_menu_icon_stick_off";
    localaob.uDZ = 3;
    localaob.uDY = 4;
    localaob.und = c.a.rRh.code;
    rQV.add(localaob);
    localaob = new aob();
    localaob.eBt = ab.getResources().getString(R.l.dAp);
    localaob.nFH = "game_menu_icon_refresh";
    localaob.uDZ = 4;
    localaob.uDY = 5;
    localaob.und = c.a.rRi.code;
    rQV.add(localaob);
    localaob = new aob();
    localaob.eBt = ab.getResources().getString(R.l.dAm);
    localaob.nFH = "game_menu_icon_collect";
    localaob.uDZ = 5;
    localaob.uDY = 6;
    localaob.und = c.a.rRf.code;
    rQV.add(localaob);
    localaob = new aob();
    localaob.eBt = ab.getResources().getString(R.l.dAn);
    localaob.nFH = "game_menu_icon_complaint";
    localaob.uDZ = 6;
    localaob.uDY = 7;
    localaob.und = c.a.rRk.code;
    rQV.add(localaob);
    localaob = new aob();
    localaob.eBt = ab.getResources().getString(R.l.dAl);
    localaob.nFH = "game_menu_icon_add_to_desktop";
    localaob.uDZ = 7;
    localaob.uDY = 8;
    localaob.und = c.a.rRj.code;
    rQV.add(localaob);
    GMTrace.o(18083557146624L, 134733);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\webview\ui\tools\game\menu\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */