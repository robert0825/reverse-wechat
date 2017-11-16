package com.tencent.mm.plugin.game.gamewebview.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.View.OnCreateContextMenuListener;
import android.webkit.WebView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.l;
import com.tencent.mm.compatible.util.f;
import com.tencent.mm.plugin.game.gamewebview.a.d;
import com.tencent.mm.plugin.game.gamewebview.ipc.CommonActivityTask;
import com.tencent.mm.plugin.game.gamewebview.ipc.CommonLogicTask;
import com.tencent.mm.plugin.game.gamewebview.ipc.GameWebViewMainProcessService;
import com.tencent.mm.plugin.game.gamewebview.model.QBarLogicTask;
import com.tencent.mm.plugin.webview.modeltools.g;
import com.tencent.mm.plugin.webview.modeltools.g.c;
import com.tencent.mm.plugin.webview.ui.tools.e;
import com.tencent.mm.pluginsdk.model.c;
import com.tencent.mm.pluginsdk.ui.tools.s;
import com.tencent.mm.pluginsdk.ui.tools.s.b;
import com.tencent.mm.protocal.GeneralControlWrapper;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.tools.l;
import com.tencent.xweb.WebView.a;

public final class h
  implements View.OnCreateContextMenuListener
{
  public MMActivity hyB;
  public l iok;
  String iol;
  public int iom;
  public int ion;
  public g ioo;
  WebView.a iop;
  private g.c iot;
  private e lJA;
  public com.tencent.mm.plugin.game.gamewebview.e.b lJr;
  WebView.a lKE;
  
  public h(MMActivity paramMMActivity, com.tencent.mm.plugin.game.gamewebview.e.b paramb, e parame)
  {
    GMTrace.i(17017465733120L, 126790);
    this.iot = new g.c()
    {
      public final void qV(String paramAnonymousString)
      {
        GMTrace.i(16991024840704L, 126593);
        QBarLogicTask localQBarLogicTask = new QBarLogicTask();
        localQBarLogicTask.type = 1;
        localQBarLogicTask.eMk = paramAnonymousString;
        GameWebViewMainProcessService.a(localQBarLogicTask);
        GMTrace.o(16991024840704L, 126593);
      }
    };
    this.hyB = paramMMActivity;
    this.lJr = paramb;
    this.lJA = parame;
    this.iok = new l(paramMMActivity);
    this.iok.a(this.lJr, this, null);
    this.iok.e(new DialogInterface.OnCancelListener()
    {
      public final void onCancel(DialogInterface paramAnonymousDialogInterface)
      {
        GMTrace.i(16991830147072L, 126599);
        if (h.this.ioo != null)
        {
          paramAnonymousDialogInterface = new QBarLogicTask();
          paramAnonymousDialogInterface.type = 1;
          paramAnonymousDialogInterface.eMk = h.this.ioo.rHl;
          GameWebViewMainProcessService.a(paramAnonymousDialogInterface);
          h.this.ioo.bDa();
        }
        GMTrace.o(16991830147072L, 126599);
      }
    });
    GMTrace.o(17017465733120L, 126790);
  }
  
  private boolean a(ContextMenu paramContextMenu, final String paramString)
  {
    GMTrace.i(17017734168576L, 126792);
    if (!f.ty())
    {
      w.e("MicroMsg.GameWebViewMenuListHelper", "SD card unavailable");
      GMTrace.o(17017734168576L, 126792);
      return true;
    }
    boolean bool = d.aDJ();
    paramContextMenu.setHeaderTitle(R.l.elA);
    w.i("MicroMsg.GameWebViewMenuListHelper", "hasSetAcc = %b", new Object[] { Boolean.valueOf(bool) });
    if (bool) {
      paramContextMenu.add(0, 0, 0, this.hyB.getString(R.l.dPA)).setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener()
      {
        public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
        {
          GMTrace.i(16993709195264L, 126613);
          s.a(h.this.hyB, paramString, com.tencent.xweb.b.crS().getCookie(paramString), f.ty(), new s.b()
          {
            public final void qU(String paramAnonymous2String)
            {
              GMTrace.i(16990487969792L, 126589);
              if (bg.nm(paramAnonymous2String))
              {
                w.w("MicroMsg.GameWebViewMenuListHelper", "share image to friend fail, imgPath is null");
                GMTrace.o(16990487969792L, 126589);
                return;
              }
              CommonActivityTask localCommonActivityTask = new CommonActivityTask(h.this.hyB);
              localCommonActivityTask.type = 2;
              localCommonActivityTask.ler.putString("img_path", paramAnonymous2String);
              localCommonActivityTask.aAb();
              GMTrace.o(16990487969792L, 126589);
            }
          });
          GMTrace.o(16993709195264L, 126613);
          return true;
        }
      });
    }
    paramContextMenu.add(0, 0, 0, this.hyB.getString(R.l.dUM)).setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(16997735727104L, 126643);
        try
        {
          s.a(h.this.hyB, paramString, com.tencent.xweb.b.crS().getCookie(paramString), f.ty());
          GMTrace.o(16997735727104L, 126643);
          return true;
        }
        catch (Exception paramAnonymousMenuItem)
        {
          for (;;)
          {
            w.e("MicroMsg.GameWebViewMenuListHelper", "save to sdcard failed : %s", new Object[] { paramAnonymousMenuItem.getMessage() });
          }
        }
      }
    });
    if (bool) {
      paramContextMenu.add(0, 0, 0, this.hyB.getString(R.l.dNH)).setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener()
      {
        public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
        {
          GMTrace.i(17023639748608L, 126836);
          paramAnonymousMenuItem = paramString.replaceAll("tp=webp", "");
          s.a(h.this.hyB, paramAnonymousMenuItem, com.tencent.xweb.b.crS().getCookie(paramAnonymousMenuItem), f.ty(), new s.b()
          {
            public final void qU(String paramAnonymous2String)
            {
              GMTrace.i(16978676809728L, 126501);
              h localh = h.this;
              CommonLogicTask localCommonLogicTask = new CommonLogicTask();
              localCommonLogicTask.type = 7;
              localCommonLogicTask.ler.putString("image_path", paramAnonymous2String);
              GameWebViewMainProcessService.b(localCommonLogicTask);
              c.a(localCommonLogicTask.ler.getInt("fav_simple_img_result"), 34, localh.hyB, i.lKN);
              GMTrace.o(16978676809728L, 126501);
            }
          });
          GMTrace.o(17023639748608L, 126836);
          return true;
        }
      });
    }
    if (this.iol != null)
    {
      final String str = this.iol;
      if (this.iom == 22) {}
      for (paramString = this.hyB.getString(R.l.dQh);; paramString = this.hyB.getString(R.l.dQg))
      {
        paramContextMenu.add(0, 0, 0, paramString).setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener()
        {
          public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
          {
            GMTrace.i(16989682663424L, 126583);
            w.i("MicroMsg.GameWebViewMenuListHelper", "onMenuItemClick recognize qbcode");
            CommonActivityTask localCommonActivityTask = new CommonActivityTask(h.this.hyB);
            localCommonActivityTask.type = 1;
            localCommonActivityTask.ler.putString("result", str);
            Bundle localBundle = localCommonActivityTask.ler;
            paramAnonymousMenuItem = h.this;
            if (paramAnonymousMenuItem.lJr != null) {}
            for (paramAnonymousMenuItem = paramAnonymousMenuItem.lJr.getUrl();; paramAnonymousMenuItem = "")
            {
              localBundle.putString("url", paramAnonymousMenuItem);
              localCommonActivityTask.ler.putInt("codeType", h.this.iom);
              localCommonActivityTask.ler.putInt("codeVersion", h.this.ion);
              localCommonActivityTask.aAb();
              GMTrace.o(16989682663424L, 126583);
              return false;
            }
          }
        });
        this.iol = null;
        GMTrace.o(17017734168576L, 126792);
        return true;
      }
    }
    GMTrace.o(17017734168576L, 126792);
    return false;
  }
  
  private static boolean aEI()
  {
    GMTrace.i(17018136821760L, 126795);
    CommonLogicTask localCommonLogicTask = new CommonLogicTask();
    localCommonLogicTask.type = 5;
    GameWebViewMainProcessService.b(localCommonLogicTask);
    boolean bool = localCommonLogicTask.ler.getBoolean("allow_webview_scan", false);
    GMTrace.o(17018136821760L, 126795);
    return bool;
  }
  
  public final void a(ContextMenu paramContextMenu, WebView.a parama)
  {
    GMTrace.i(19286147989504L, 143693);
    if ((!a(paramContextMenu, parama.mExtra)) && (this.lJA.bDN().bOe()) && (aEI()))
    {
      this.iop = parama;
      this.ioo = new g();
      this.ioo.a(this.lJr, this.iot);
    }
    GMTrace.o(19286147989504L, 143693);
  }
  
  public final void b(ContextMenu paramContextMenu, WebView.a parama)
  {
    GMTrace.i(19286013771776L, 143692);
    if ((!a(paramContextMenu, parama.mExtra)) && (this.lJA.bDN().bOe()) && (aEI()))
    {
      this.lKE = parama;
      this.ioo = new g();
      this.ioo.a(this.lJr, this.iot);
    }
    GMTrace.o(19286013771776L, 143692);
  }
  
  public final void onCreateContextMenu(ContextMenu paramContextMenu, View paramView, ContextMenu.ContextMenuInfo paramContextMenuInfo)
  {
    GMTrace.i(17017599950848L, 126791);
    w.d("MicroMsg.GameWebViewMenuListHelper", "onCreateContextMenu");
    if ((paramView instanceof WebView))
    {
      paramView = this.lJr.getHitTestResult();
      if (paramView == null)
      {
        GMTrace.o(17017599950848L, 126791);
        return;
      }
      if ((paramView.mType == 5) || (paramView.mType == 8)) {
        a(paramContextMenu, paramView);
      }
      GMTrace.o(17017599950848L, 126791);
      return;
    }
    paramView = this.lJr.getHitTestResult();
    if (paramView == null)
    {
      GMTrace.o(17017599950848L, 126791);
      return;
    }
    if ((paramView.mType == 5) || (paramView.mType == 8)) {
      b(paramContextMenu, paramView);
    }
    GMTrace.o(17017599950848L, 126791);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\game\gamewebview\ui\h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */