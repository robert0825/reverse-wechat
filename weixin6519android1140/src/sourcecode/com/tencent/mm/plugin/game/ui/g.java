package com.tencent.mm.plugin.game.ui;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.net.Uri;
import android.view.View;
import android.widget.Toast;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.e;
import com.tencent.mm.R.l;
import com.tencent.mm.g.b.n;
import com.tencent.mm.plugin.downloader.e.a;
import com.tencent.mm.plugin.downloader.model.FileDownloadTaskInfo;
import com.tencent.mm.plugin.downloader.model.f;
import com.tencent.mm.plugin.game.c.bb;
import com.tencent.mm.plugin.game.model.ai;
import com.tencent.mm.plugin.game.model.l;
import com.tencent.mm.pluginsdk.model.app.q;
import com.tencent.mm.sdk.platformtools.am;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.base.h;
import java.io.File;

public final class g
  extends d
{
  public g(Context paramContext)
  {
    super(paramContext);
    GMTrace.i(12741691572224L, 94933);
    GMTrace.o(12741691572224L, 94933);
  }
  
  public final void aGy()
  {
    GMTrace.i(17976182964224L, 133933);
    this.lTO.field_scene = this.lMw.scene;
    com.tencent.mm.plugin.downloader.model.e.c(this.lTO);
    if (f.apJ().bi(this.lTO.field_downloadId))
    {
      com.tencent.mm.plugin.game.model.e.W(this.mContext, this.lMw.field_appId);
      ai.a(this.mContext, this.lMw.scene, this.lMw.eSa, this.lMw.position, 4, this.lMw.field_appId, this.lNQ, this.lMw.eBv, this.lTQ);
      GMTrace.o(17976182964224L, 133933);
      return;
    }
    w.e("MicsoMsg.GameClickListener", "resumeDownloadTask false");
    f.apJ().bf(this.lTO.field_downloadId);
    eY(false);
    GMTrace.o(17976182964224L, 133933);
  }
  
  public final void cv(String paramString1, String paramString2)
  {
    GMTrace.i(12741825789952L, 94934);
    this.lTQ = paramString1;
    this.lTR = paramString2;
    GMTrace.o(12741825789952L, 94934);
  }
  
  public final void onClick(View paramView)
  {
    GMTrace.i(12741960007680L, 94935);
    int i;
    int k;
    int j;
    if ((paramView.getTag() instanceof com.tencent.mm.plugin.game.model.c))
    {
      this.lMw = ((com.tencent.mm.plugin.game.model.c)paramView.getTag());
      w.i("MicsoMsg.GameClickListener", "Clicked appid = " + this.lMw.field_appId);
      aGq();
      if ((this.lTN == null) || (!this.lTN.kfD)) {
        break label329;
      }
      this.lTN.kfD = false;
      if (this.lTO != null)
      {
        this.lTO.field_autoInstall = true;
        this.lTO.field_showNotification = true;
        this.lTO.field_autoDownload = false;
        com.tencent.mm.plugin.downloader.model.e.c(this.lTO);
      }
      i = 1;
      if (!com.tencent.mm.pluginsdk.model.app.g.n(this.mContext, this.lMw.field_appId)) {
        break label717;
      }
      if (!(this.lMw instanceof com.tencent.mm.plugin.game.model.c)) {
        break label1200;
      }
      k = com.tencent.mm.plugin.game.d.c.zU(this.lMw.field_packageName);
      j = this.lMw.versionCode;
    }
    for (;;)
    {
      boolean bool;
      if (j > k)
      {
        w.i("MicsoMsg.GameClickListener", "AppId: %s installed, local: %d, server: %d", new Object[] { this.lMw.field_appId, Integer.valueOf(k), Integer.valueOf(j) });
        l.a(this.lMw.fdL, this.lMw.fdQ, this.lMw.eSa, this.lMw.field_appId, this.lTP, "app_update");
        if (this.lTN.status == 1)
        {
          if (i != 0) {
            break label708;
          }
          bool = f.apJ().bh(this.lTN.id);
          w.e("MicsoMsg.GameClickListener", "pauseDownloadTask ret = " + bool);
          GMTrace.o(12741960007680L, 94935);
          return;
          w.e("MicsoMsg.GameClickListener", "No AppInfo");
          GMTrace.o(12741960007680L, 94935);
          return;
          label329:
          i = 0;
          break;
        }
        if (this.lTN.status == 2)
        {
          if (f.apJ().bi(this.lTN.id))
          {
            com.tencent.mm.plugin.game.model.e.W(this.mContext, this.lMw.field_appId);
            ai.a(this.mContext, this.lMw.scene, this.lMw.eSa, this.lMw.position, 4, this.lMw.field_appId, this.lNQ, this.lMw.eBv, this.lTQ);
            GMTrace.o(12741960007680L, 94935);
            return;
          }
          w.e("MicsoMsg.GameClickListener", "resumeDownloadTask false");
          eY(true);
          GMTrace.o(12741960007680L, 94935);
          return;
        }
        if (this.lTN.status == 3)
        {
          if ((com.tencent.mm.a.e.aZ(this.lTN.path)) && (com.tencent.mm.plugin.game.d.c.zV(this.lTN.path) > k))
          {
            paramView = Uri.fromFile(new File(this.lTN.path));
            q.e(this.mContext, paramView);
            ai.a(this.mContext, this.lMw.scene, this.lMw.eSa, this.lMw.position, 8, this.lMw.field_appId, this.lNQ, this.lMw.eBv, this.lTQ);
            GMTrace.o(12741960007680L, 94935);
            return;
          }
          eY(true);
          GMTrace.o(12741960007680L, 94935);
          return;
        }
        eY(true);
        GMTrace.o(12741960007680L, 94935);
        return;
      }
      w.i("MicsoMsg.GameClickListener", "launchFromWX, appId = %s, pkg = %s, openId = %s", new Object[] { this.lMw.field_appId, this.lMw.field_packageName, this.lMw.field_openId });
      ai.a(this.mContext, this.lMw.scene, this.lMw.eSa, this.lMw.position, 3, this.lMw.field_appId, this.lNQ, this.lMw.eBv, this.lTQ);
      aGp();
      label708:
      GMTrace.o(12741960007680L, 94935);
      return;
      label717:
      if (this.lMw.aFb())
      {
        com.tencent.mm.plugin.game.d.c.p(this.mContext, this.lMw.lLS.lRS, "game_center_hv_game");
        ai.a(this.mContext, this.lMw.scene, this.lMw.eSa, this.lMw.position, 29, this.lMw.field_appId, this.lNQ, this.lMw.eBv, this.lTQ);
        GMTrace.o(12741960007680L, 94935);
        return;
      }
      l.a(this.lMw.fdL, this.lMw.fdQ, this.lMw.eSa, this.lMw.field_appId, this.lTP, this.lTR);
      switch (this.mStatus)
      {
      default: 
        eY(false);
      case 1: 
        do
        {
          GMTrace.o(12741960007680L, 94935);
          return;
        } while (i != 0);
        bool = f.apJ().bh(this.lTN.id);
        w.e("MicsoMsg.GameClickListener", "pauseDownloadTask ret = " + bool);
        GMTrace.o(12741960007680L, 94935);
        return;
      case 2: 
        if (!am.isNetworkConnected(this.mContext))
        {
          Toast.makeText(this.mContext, this.mContext.getString(R.l.dzS), 0).show();
          GMTrace.o(12741960007680L, 94935);
          return;
        }
        if (am.isWifi(this.mContext))
        {
          aGy();
          GMTrace.o(12741960007680L, 94935);
          return;
        }
        h.a(this.mContext, this.mContext.getString(R.l.ejO), this.mContext.getString(R.l.ejP), this.mContext.getString(R.l.ejJ), this.mContext.getString(R.l.cSk), false, new DialogInterface.OnClickListener()new DialogInterface.OnClickListener
        {
          public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
          {
            GMTrace.i(17974035480576L, 133917);
            g.this.aGy();
            paramAnonymousDialogInterface.dismiss();
            GMTrace.o(17974035480576L, 133917);
          }
        }, new DialogInterface.OnClickListener()
        {
          public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
          {
            GMTrace.i(17977122488320L, 133940);
            paramAnonymousDialogInterface.dismiss();
            w.i("MicsoMsg.GameClickListener", "resumeDownloadTask not wifi, user cancel");
            GMTrace.o(17977122488320L, 133940);
          }
        }, R.e.aPp);
        GMTrace.o(12741960007680L, 94935);
        return;
      }
      if ((!bg.nm(this.lTM)) && (com.tencent.mm.a.e.aZ(this.lTM)) && (com.tencent.mm.plugin.game.d.c.cw(this.lTM, this.lTO.field_md5)))
      {
        aGo();
        ai.a(this.mContext, this.lMw.scene, this.lMw.eSa, this.lMw.position, 8, this.lMw.field_appId, this.lNQ, this.lMw.eBv, this.lTQ);
        GMTrace.o(12741960007680L, 94935);
        return;
      }
      eY(false);
      GMTrace.o(12741960007680L, 94935);
      return;
      label1200:
      j = 0;
      k = 0;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\game\ui\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */