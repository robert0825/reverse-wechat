package com.tencent.mm.plugin.game.ui;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.net.Uri;
import android.provider.Settings.Secure;
import android.provider.Settings.SettingNotFoundException;
import android.view.View.OnClickListener;
import android.widget.Toast;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.e;
import com.tencent.mm.R.l;
import com.tencent.mm.g.b.n;
import com.tencent.mm.plugin.downloader.model.FileDownloadTaskInfo;
import com.tencent.mm.plugin.downloader.model.g.a;
import com.tencent.mm.plugin.downloader.model.o;
import com.tencent.mm.plugin.game.model.ai;
import com.tencent.mm.plugin.game.model.l;
import com.tencent.mm.pluginsdk.model.app.q;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.am;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.y.at;
import java.io.File;
import java.util.Map;

public abstract class d
  implements View.OnClickListener
{
  protected com.tencent.mm.plugin.game.model.c lMw;
  protected int lNQ;
  protected long lTL;
  protected String lTM;
  protected FileDownloadTaskInfo lTN;
  protected com.tencent.mm.plugin.downloader.e.a lTO;
  protected String lTP;
  protected String lTQ;
  protected String lTR;
  private String lTS;
  protected Context mContext;
  protected int mStatus;
  
  public d(Context paramContext)
  {
    GMTrace.i(12688944005120L, 94540);
    this.mStatus = -1;
    this.lMw = null;
    this.lTL = -1L;
    this.lTS = "xiaomi";
    this.mContext = paramContext;
    GMTrace.o(12688944005120L, 94540);
  }
  
  protected final void aGo()
  {
    GMTrace.i(12689212440576L, 94542);
    Uri localUri = Uri.fromFile(new File(this.lTN.path));
    q.e(this.mContext, localUri);
    GMTrace.o(12689212440576L, 94542);
  }
  
  protected final void aGp()
  {
    GMTrace.i(12689346658304L, 94543);
    com.tencent.mm.plugin.game.model.e.V(this.mContext, this.lMw.field_appId);
    GMTrace.o(12689346658304L, 94543);
  }
  
  protected final void aGq()
  {
    GMTrace.i(12689615093760L, 94545);
    this.lTO = com.tencent.mm.plugin.downloader.model.e.vr(this.lMw.field_appId);
    this.lTN = com.tencent.mm.plugin.downloader.model.f.apJ().vv(this.lMw.field_appId);
    this.lTL = this.lTN.id;
    this.mStatus = this.lTN.status;
    this.lTM = this.lTN.path;
    GMTrace.o(12689615093760L, 94545);
  }
  
  protected final void eY(final boolean paramBoolean)
  {
    GMTrace.i(12689480876032L, 94544);
    if (!am.isNetworkConnected(this.mContext))
    {
      Toast.makeText(this.mContext, this.mContext.getString(R.l.dzS), 0).show();
      l.aFn();
      l.a(this.lMw.field_appId, com.tencent.mm.plugin.downloader.model.d.keW, false, null);
      GMTrace.o(12689480876032L, 94544);
      return;
    }
    at.AR();
    if (!com.tencent.mm.y.c.isSDCardAvailable())
    {
      Toast.makeText(this.mContext, this.mContext.getString(R.l.dzU), 0).show();
      l.aFn();
      l.a(this.lMw.field_appId, com.tencent.mm.plugin.downloader.model.d.keX, false, null);
      GMTrace.o(12689480876032L, 94544);
      return;
    }
    if (!com.tencent.mm.compatible.util.f.L(this.lMw.lLQ))
    {
      Toast.makeText(this.mContext, this.mContext.getString(R.l.dzT), 0).show();
      l.aFn();
      l.a(this.lMw.field_appId, com.tencent.mm.plugin.downloader.model.d.keX, false, null);
      GMTrace.o(12689480876032L, 94544);
      return;
    }
    if (com.tencent.mm.protocal.d.tJv.toLowerCase().contains(this.lTS)) {}
    try
    {
      if ((Settings.Secure.getInt(this.mContext.getContentResolver(), "install_non_market_apps") == 0) && (!this.mContext.getSharedPreferences("game_center_pref", 0).getBoolean("show_open_download_authority_tips", false)))
      {
        com.tencent.mm.ui.base.h.a(this.mContext, R.l.dAN, R.l.dAO, R.l.dAV, R.l.cSk, false, new DialogInterface.OnClickListener()new DialogInterface.OnClickListener
        {
          public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
          {
            GMTrace.i(17977390923776L, 133942);
            Intent localIntent = new Intent("android.settings.SECURITY_SETTINGS");
            d.this.mContext.startActivity(localIntent);
            paramAnonymousDialogInterface.cancel();
            GMTrace.o(17977390923776L, 133942);
          }
        }, new DialogInterface.OnClickListener()
        {
          public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
          {
            GMTrace.i(17976585617408L, 133936);
            paramAnonymousDialogInterface.cancel();
            GMTrace.o(17976585617408L, 133936);
          }
        });
        this.mContext.getSharedPreferences("game_center_pref", 0).edit().putBoolean("show_open_download_authority_tips", true).commit();
      }
      if ((bg.nm(this.lMw.fdL)) || (bg.nm(this.lMw.fdQ)))
      {
        w.d("MicroMsg.CommonGameClickLinstener", "downloadApk: appdownloadurl is null or appmd5 is null, try gpDownload");
        if (bg.nm(this.lMw.fdR))
        {
          w.e("MicroMsg.CommonGameClickLinstener", "downloadApk fail, gpDownloadUrl is null");
          if (bg.nm(this.lMw.fdL))
          {
            l.aFn();
            l.a(this.lMw.field_appId, com.tencent.mm.plugin.downloader.model.d.DOWNLOAD_ERR_URL_INVALID, false, null);
          }
          if (bg.nm(this.lMw.fdQ))
          {
            l.aFn();
            l.a(this.lMw.field_appId, com.tencent.mm.plugin.downloader.model.d.keU, false, null);
          }
          GMTrace.o(12689480876032L, 94544);
          return;
        }
      }
    }
    catch (Settings.SettingNotFoundException localSettingNotFoundException)
    {
      for (;;)
      {
        w.e("MicroMsg.CommonGameClickLinstener", "SettingNotFoundException ; %S", new Object[] { localSettingNotFoundException.getMessage() });
        continue;
        w.d("MicroMsg.CommonGameClickLinstener", "downloadApk with gp, ret = %b", new Object[] { Boolean.valueOf(q.aR(this.mContext, this.lMw.fdR)) });
      }
      ai.a(this.mContext, this.lMw.scene, this.lMw.eSa, this.lMw.position, 4, this.lMw.field_appId, this.lNQ, this.lMw.eBv, this.lTQ);
      if (am.isWifi(this.mContext))
      {
        eZ(paramBoolean);
        GMTrace.o(12689480876032L, 94544);
        return;
      }
      com.tencent.mm.ui.base.h.a(this.mContext, this.mContext.getString(R.l.ejO), this.mContext.getString(R.l.ejP), this.mContext.getString(R.l.ejJ), this.mContext.getString(R.l.cSk), false, new DialogInterface.OnClickListener()new DialogInterface.OnClickListener
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(12664247943168L, 94356);
          d.this.eZ(paramBoolean);
          paramAnonymousDialogInterface.dismiss();
          GMTrace.o(12664247943168L, 94356);
        }
      }, new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(12661563588608L, 94336);
          paramAnonymousDialogInterface.dismiss();
          w.i("MicroMsg.CommonGameClickLinstener", "addDownloadTask not wifi, user cancel");
          GMTrace.o(12661563588608L, 94336);
        }
      }, R.e.aPp);
      GMTrace.o(12689480876032L, 94544);
    }
  }
  
  public final void eZ(boolean paramBoolean)
  {
    GMTrace.i(17974438133760L, 133920);
    Object localObject;
    com.tencent.mm.plugin.downloader.model.f localf;
    long l;
    if (paramBoolean)
    {
      l.a(this.lMw.fdL, this.lMw.fdQ, this.lMw.eSa, this.lMw.field_appId, this.lTP, "app_update");
      localObject = new g.a();
      ((g.a)localObject).vy(this.lMw.fdL);
      ((g.a)localObject).vz(this.lMw.lLP);
      ((g.a)localObject).bq(this.lMw.lLQ);
      ((g.a)localObject).vA(com.tencent.mm.pluginsdk.model.app.g.a(this.mContext, this.lMw, null));
      ((g.a)localObject).setAppId(this.lMw.field_appId);
      ((g.a)localObject).vB(this.lMw.fdQ);
      ((g.a)localObject).dJ(true);
      ((g.a)localObject).mt(1);
      ((g.a)localObject).bE(this.lMw.field_packageName);
      ((g.a)localObject).lq(this.lMw.eSa);
      if (this.lMw.eJD != 1) {
        break label473;
      }
      localf = com.tencent.mm.plugin.downloader.model.f.apJ();
      localObject = ((g.a)localObject).kfx;
      w.i("MicroMsg.FileDownloadManager", "addDownloadTaskByCDNDownloader, appId = %s", new Object[] { ((com.tencent.mm.plugin.downloader.model.g)localObject).hyD });
      if (!com.tencent.mm.kernel.h.xw().wL()) {
        break label358;
      }
      com.tencent.mm.kernel.h.xw();
      if (com.tencent.mm.kernel.a.wF()) {
        break label358;
      }
      l = localf.apN().a((com.tencent.mm.plugin.downloader.model.g)localObject);
    }
    for (;;)
    {
      w.i("MicroMsg.CommonGameClickLinstener", " add download task result:[%d], appid[%s]，downloaerType[%d]", new Object[] { Long.valueOf(l), this.lMw.field_appId, Integer.valueOf(this.lMw.eJD) });
      com.tencent.mm.plugin.game.model.e.W(this.mContext, this.lMw.field_appId);
      GMTrace.o(17974438133760L, 133920);
      return;
      l.a(this.lMw.fdL, this.lMw.fdQ, this.lMw.eSa, this.lMw.field_appId, this.lTP, this.lTR);
      break;
      label358:
      l = localf.apL().a((com.tencent.mm.plugin.downloader.model.g)localObject);
      if (l >= 0L)
      {
        com.tencent.mm.plugin.downloader.model.f.kfc.put(Long.valueOf(l), Long.valueOf(0L));
        ab.getContext().getSharedPreferences("off_line_download_ids", 0).edit().putLong(String.valueOf(l), 0L).commit();
        w.i("MicroMsg.FileDownloadManager", "Add id: %d to offline ids", new Object[] { Long.valueOf(l) });
      }
      else
      {
        w.i("MicroMsg.FileDownloadManager", "add download task to system downloader failed, use browser to download it");
        localf.apM().a((com.tencent.mm.plugin.downloader.model.g)localObject);
        continue;
        label473:
        l = com.tencent.mm.plugin.downloader.model.f.apJ().a(((g.a)localObject).kfx);
      }
    }
  }
  
  public final void oJ(int paramInt)
  {
    GMTrace.i(12689078222848L, 94541);
    this.lNQ = paramInt;
    GMTrace.o(12689078222848L, 94541);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\game\ui\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */