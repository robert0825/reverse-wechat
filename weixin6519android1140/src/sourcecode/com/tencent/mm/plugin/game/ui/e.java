package com.tencent.mm.plugin.game.ui;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface.OnClickListener;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.g;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.R.m;
import com.tencent.mm.g.b.n;
import com.tencent.mm.plugin.downloader.model.FileDownloadTaskInfo;
import com.tencent.mm.plugin.downloader.model.f;
import com.tencent.mm.plugin.game.model.SubCoreGameCenter;
import com.tencent.mm.plugin.game.model.ai;
import com.tencent.mm.plugin.game.model.ay;
import com.tencent.mm.plugin.game.model.m;
import com.tencent.mm.sdk.platformtools.aj;
import com.tencent.mm.sdk.platformtools.aj.a;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.ui.base.k;
import java.util.Set;

public final class e
{
  public Dialog lKo;
  int lNQ;
  String lTQ;
  private g lUc;
  private u lUd;
  private p lUe;
  private t lUf;
  DialogInterface.OnClickListener lUg;
  private int lUh;
  private aj lUi;
  private Context mContext;
  
  public e(Context paramContext)
  {
    GMTrace.i(12742496878592L, 94939);
    this.lUc = null;
    this.lUd = null;
    this.lUe = null;
    this.lUf = null;
    this.lUg = null;
    this.lNQ = 0;
    this.lTQ = null;
    this.lUh = 3000;
    this.lUi = new aj(Looper.getMainLooper(), new aj.a()
    {
      public final boolean pM()
      {
        GMTrace.i(12756455522304L, 95043);
        if (e.this.lKo != null) {
          e.this.lKo.cancel();
        }
        GMTrace.o(12756455522304L, 95043);
        return true;
      }
    }, false);
    this.mContext = paramContext;
    GMTrace.o(12742496878592L, 94939);
  }
  
  private static boolean a(Set<String> paramSet, String paramString)
  {
    GMTrace.i(12742899531776L, 94942);
    if ((paramSet == null) || (paramSet.isEmpty()))
    {
      GMTrace.o(12742899531776L, 94942);
      return false;
    }
    if (!paramSet.contains(paramString))
    {
      GMTrace.o(12742899531776L, 94942);
      return false;
    }
    GMTrace.o(12742899531776L, 94942);
    return true;
  }
  
  public final void a(ProgressBar paramProgressBar, Button paramButton, com.tencent.mm.plugin.game.model.c paramc, m paramm)
  {
    GMTrace.i(12742765314048L, 94941);
    if ((paramProgressBar == null) || (paramButton == null))
    {
      GMTrace.o(12742765314048L, 94941);
      return;
    }
    paramButton.setEnabled(true);
    paramButton.setVisibility(0);
    if (com.tencent.mm.pluginsdk.model.app.g.a(this.mContext, paramc))
    {
      int i = com.tencent.mm.plugin.game.d.c.zU(paramc.field_packageName);
      if (paramc.versionCode > i) {
        if (paramm.status == 1)
        {
          paramProgressBar.setVisibility(0);
          paramProgressBar.setProgress(paramm.progress);
          paramButton.setVisibility(8);
        }
      }
      for (;;)
      {
        com.tencent.mm.sdk.platformtools.w.i("MicroMsg.GameActionBtnHandler", "AppId: %s installed, local: %d, server: %d", new Object[] { paramc.field_appId, Integer.valueOf(i), Integer.valueOf(paramc.versionCode) });
        GMTrace.o(12742765314048L, 94941);
        return;
        if (paramc.scene == 12) {
          paramButton.setText(R.l.dzM);
        }
        for (;;)
        {
          paramButton.setVisibility(0);
          paramProgressBar.setVisibility(8);
          break;
          paramButton.setText(R.l.dzB);
        }
        paramButton.setVisibility(0);
        paramProgressBar.setVisibility(8);
        if (paramc.scene == 12) {
          paramButton.setText(R.l.dzK);
        } else {
          paramButton.setText(R.l.dAj);
        }
      }
    }
    if (paramc.aFb())
    {
      paramButton.setVisibility(0);
      paramProgressBar.setVisibility(8);
      if (paramc.scene == 12)
      {
        paramButton.setText(R.l.dzK);
        GMTrace.o(12742765314048L, 94941);
        return;
      }
      paramButton.setText(R.l.dAj);
      GMTrace.o(12742765314048L, 94941);
      return;
    }
    switch (paramc.status)
    {
    default: 
      paramButton.setVisibility(8);
      paramProgressBar.setVisibility(8);
    }
    for (;;)
    {
      com.tencent.mm.sdk.platformtools.w.i("MicroMsg.GameActionBtnHandler", "updateBtnStateAndText: %s, Status: %d, Text: %s", new Object[] { paramc.field_appId, Integer.valueOf(paramc.status), paramButton.getText() });
      GMTrace.o(12742765314048L, 94941);
      return;
      if (paramm == null)
      {
        paramButton.setVisibility(8);
        paramProgressBar.setVisibility(8);
        GMTrace.o(12742765314048L, 94941);
        return;
      }
      switch (paramm.status)
      {
      default: 
        break;
      case 0: 
        if (paramc.scene == 12) {
          if (paramc.lLH)
          {
            paramm = paramc.field_appId;
            if (!a(com.tencent.mm.plugin.game.model.e.cz(this.mContext), paramm)) {
              paramButton.setText(R.l.dzR);
            }
          }
        }
        for (;;)
        {
          paramButton.setVisibility(0);
          paramProgressBar.setVisibility(8);
          break;
          paramButton.setText(R.l.dAf);
          continue;
          paramButton.setText(R.l.dAe);
        }
      case 1: 
        if (paramm.mode == 3) {
          paramButton.setText(R.l.dAh);
        }
      case 2: 
      case 3: 
        for (;;)
        {
          paramButton.setVisibility(0);
          paramProgressBar.setVisibility(8);
          break;
          if (paramm.mode != 1) {
            break;
          }
          paramProgressBar.setProgress(paramm.progress);
          paramButton.setVisibility(8);
          paramProgressBar.setVisibility(0);
          break;
          if (paramc.scene == 12) {
            paramButton.setText(R.l.dzQ);
          }
          for (;;)
          {
            paramButton.setVisibility(0);
            paramProgressBar.setVisibility(8);
            break;
            paramButton.setText(R.l.dAg);
          }
          if (paramc.scene == 12) {
            paramButton.setText(R.l.dAd);
          } else {
            paramButton.setText(R.l.dAc);
          }
        }
        if (paramc.lLA)
        {
          paramButton.setEnabled(false);
          paramButton.setText(R.l.dzz);
          paramButton.setVisibility(0);
          paramProgressBar.setVisibility(8);
        }
        else
        {
          paramButton.setText(R.l.dzy);
          paramButton.setVisibility(0);
          paramProgressBar.setVisibility(8);
          continue;
          paramButton.setText(R.l.dzx);
          paramButton.setVisibility(0);
          paramProgressBar.setVisibility(8);
          continue;
          if (paramm == null)
          {
            paramButton.setText(R.l.dzw);
            paramButton.setVisibility(0);
            paramProgressBar.setVisibility(8);
            GMTrace.o(12742765314048L, 94941);
            return;
          }
          switch (paramm.status)
          {
          default: 
            break;
          case 0: 
            paramButton.setText(R.l.dzw);
          case 1: 
          case 2: 
          case 3: 
            for (;;)
            {
              paramButton.setVisibility(0);
              paramProgressBar.setVisibility(8);
              break;
              if (paramm.mode == 3)
              {
                paramButton.setText(R.l.dAh);
                break;
              }
              if (paramm.mode != 1) {
                break;
              }
              paramProgressBar.setProgress(paramm.progress);
              paramButton.setVisibility(8);
              paramProgressBar.setVisibility(0);
              break;
              if (paramc.scene == 12) {
                paramButton.setText(R.l.dzQ);
              }
              for (;;)
              {
                paramButton.setVisibility(0);
                paramProgressBar.setVisibility(8);
                break;
                paramButton.setText(R.l.dAg);
              }
              if (paramc.scene == 12) {
                paramButton.setText(R.l.dAd);
              } else {
                paramButton.setText(R.l.dAc);
              }
            }
            paramButton.setText(R.l.dzA);
            paramButton.setVisibility(0);
            paramProgressBar.setVisibility(8);
          }
        }
        break;
      }
    }
  }
  
  public final void a(com.tencent.mm.plugin.game.model.c paramc, m paramm)
  {
    GMTrace.i(12742631096320L, 94940);
    if ((paramc == null) || (paramm == null))
    {
      com.tencent.mm.sdk.platformtools.w.e("MicroMsg.GameActionBtnHandler", "Null appInfo or null downloadInfo");
      GMTrace.o(12742631096320L, 94940);
      return;
    }
    Object localObject1 = new View(this.mContext);
    ((View)localObject1).setTag(paramc);
    com.tencent.mm.sdk.platformtools.w.i("MicroMsg.GameActionBtnHandler", "App Status: %d, Download Mode: %d, Download Status: %d", new Object[] { Integer.valueOf(paramc.status), Integer.valueOf(paramm.mode), Integer.valueOf(paramm.status) });
    if ((com.tencent.mm.pluginsdk.model.app.g.n(this.mContext, paramc.field_appId)) || (paramc.aFb())) {
      paramm.mode = 1;
    }
    int i;
    if (paramm.mode == 3)
    {
      ay.aGa();
      i = ay.g(this.mContext, "com.tencent.android.qqdownloader", paramc.fea);
      com.tencent.mm.sdk.platformtools.w.i("MicroMsg.GameActionBtnHandler", "qqdownloader install status:[%d], yybSupportedVersionCode:[%d]", new Object[] { Integer.valueOf(i), Integer.valueOf(paramc.fea) });
      if ((i == -1) || (i == 1) || (i == 2)) {
        paramm.mode = 1;
      }
    }
    switch (paramc.status)
    {
    }
    for (;;)
    {
      GMTrace.o(12742631096320L, 94940);
      return;
      Object localObject2 = SubCoreGameCenter.aGf().zH(paramc.field_appId);
      if (localObject2 != null)
      {
        com.tencent.mm.sdk.platformtools.w.i("MicroMsg.GameActionBtnHandler", "delete msg, appid = " + ((com.tencent.mm.plugin.game.model.q)localObject2).field_appId);
        SubCoreGameCenter.aGf().a((com.tencent.mm.sdk.e.c)localObject2, new String[0]);
      }
      switch (paramm.mode)
      {
      default: 
        com.tencent.mm.sdk.platformtools.w.d("MicroMsg.GameActionBtnHandler", "summertoken downloadInfo.mode[%d]", new Object[] { Integer.valueOf(paramm.mode) });
        if (this.lUc == null) {
          this.lUc = new g(this.mContext);
        }
        this.lUc.oJ(this.lNQ);
        this.lUc.cv(this.lTQ, "");
        this.lUc.onClick((View)localObject1);
      }
      while (paramc.lLH)
      {
        localObject1 = com.tencent.mm.plugin.game.model.e.cz(this.mContext);
        if (!a((Set)localObject1, paramc.field_appId))
        {
          if (paramm.mode != 3)
          {
            paramm = LayoutInflater.from(this.mContext).inflate(R.i.cyI, null);
            ((LinearLayout)paramm.findViewById(R.h.bNl)).setGravity(17);
            localObject2 = (ImageView)paramm.findViewById(R.h.bNn);
            localObject3 = (TextView)paramm.findViewById(R.h.bNk);
            TextView localTextView = (TextView)paramm.findViewById(R.h.bNo);
            ((ImageView)localObject2).setBackgroundResource(R.g.aWd);
            ((TextView)localObject3).setText(R.l.dzY);
            localTextView.setText(R.l.dzX);
            this.lKo = new k(this.mContext, R.m.elW);
            this.lKo.setContentView(paramm);
            this.lKo.setCancelable(true);
            this.lKo.setCanceledOnTouchOutside(true);
            this.lKo.show();
            paramm = this.lUi;
            long l = this.lUh;
            paramm.z(l, l);
          }
          SubCoreGameCenter.aGi();
          com.tencent.mm.plugin.game.model.w.b(paramc.field_appId, 1, 0, null, null);
          ((Set)localObject1).add(paramc.field_appId);
          this.mContext.getSharedPreferences("game_center_pref", 0).edit().putStringSet("show_download_gift_tips", (Set)localObject1).commit();
        }
        GMTrace.o(12742631096320L, 94940);
        return;
        localObject2 = f.apJ().vv(paramc.field_appId);
        if ((localObject2 != null) && (((FileDownloadTaskInfo)localObject2).id > 0L)) {
          f.apJ().bf(((FileDownloadTaskInfo)localObject2).id);
        }
        if (this.lUd == null) {
          this.lUd = new u(this.mContext);
        }
        localObject2 = this.lUd;
        i = this.lNQ;
        Object localObject3 = this.lTQ;
        ((u)localObject2).lNQ = i;
        ((u)localObject2).lTQ = ((String)localObject3);
        this.lUd.onClick((View)localObject1);
        continue;
        if (!bg.nm(paramc.fdR))
        {
          com.tencent.mm.sdk.platformtools.w.i("MicroMsg.GameActionBtnHandler", "gp download url is not null and download flag is download directly by gp store");
          com.tencent.mm.pluginsdk.model.app.q.aR(this.mContext, paramc.fdR);
          ai.a(this.mContext, paramc.scene, paramc.eSa, paramc.position, 25, paramc.field_appId, this.lNQ, paramc.eBv, this.lTQ);
        }
      }
      if (this.lUf == null)
      {
        this.lUf = new t(this.mContext);
        this.lUf.mcS = this.lUg;
      }
      this.lUf.lNQ = this.lNQ;
      this.lUf.onClick((View)localObject1);
      ai.a(this.mContext, paramc.scene, paramc.eSa, paramc.position, 9, paramc.field_appId, this.lNQ, paramc.eBv, this.lTQ);
      GMTrace.o(12742631096320L, 94940);
      return;
      paramm = f.apJ().vv(paramc.field_appId);
      if ((paramm != null) && (paramm.id > 0L)) {
        f.apJ().bf(paramm.id);
      }
      if (this.lUe == null) {
        this.lUe = new p(this.mContext);
      }
      this.lUe.jtE = this.lNQ;
      this.lUe.maQ = paramc.fdV;
      this.lUe.onClick((View)localObject1);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\game\ui\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */