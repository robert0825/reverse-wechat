package com.tencent.mm.plugin.accountsync.model;

import android.accounts.Account;
import android.app.Service;
import android.content.AbstractThreadedSyncAdapter;
import android.content.ContentProviderClient;
import android.content.Context;
import android.content.Intent;
import android.content.SyncResult;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Looper;
import com.jg.JgClassChecked;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.k;
import com.tencent.mm.ad.n;
import com.tencent.mm.modelfriend.a.b;
import com.tencent.mm.modelfriend.aa;
import com.tencent.mm.modelfriend.m;
import com.tencent.mm.modelfriend.v;
import com.tencent.mm.modelsimple.b;
import com.tencent.mm.pluginsdk.h.a;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import com.tencent.mm.y.at;
import com.tencent.mm.y.c;

@JgClassChecked(author=20, fComment="checked", lastDate="20140422", reviewer=20, vComment={com.jg.EType.SERVICESCHECK})
public class ContactsSyncService
  extends Service
  implements com.tencent.mm.ad.e
{
  private static Account gTz;
  private a hts;
  private Looper htt;
  
  public ContactsSyncService()
  {
    GMTrace.i(7832141299712L, 58354);
    this.hts = null;
    w.i("MicroMsg.ContactsSyncService", "ContactsSyncService construction");
    GMTrace.o(7832141299712L, 58354);
  }
  
  private void Qx()
  {
    GMTrace.i(7832543952896L, 58357);
    if (this.htt != null) {
      this.htt.quit();
    }
    GMTrace.o(7832543952896L, 58357);
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(7832409735168L, 58356);
    w.i("MicroMsg.ContactsSyncService", "onSceneEnd: errType = " + paramInt1 + " errCode = " + paramInt2 + " errMsg = " + paramString + " type = " + paramk.getType());
    if (paramk.getType() == 133)
    {
      at.wS().b(133, this);
      w.i("MicroMsg.ContactsSyncService", "uploadcontact onSceneEnd: errType = " + paramInt1 + ", errCode = " + paramInt2);
      at.AR();
      long l1 = ((Long)c.xh().get(327728, Long.valueOf(0L))).longValue();
      long l2 = System.currentTimeMillis();
      w.d("MicroMsg.ContactsSyncService", "getMFriend : curTime=" + l2 + ", lastTime=" + l1);
      if ((paramInt2 != 0) && (l2 - l1 < 86400000L))
      {
        Qx();
        w.e("MicroMsg.ContactsSyncService", "uploadmcontact list null, do not do getmfriend.");
        GMTrace.o(7832409735168L, 58356);
        return;
      }
      at.AR();
      c.xh().set(327728, Long.valueOf(l2));
      at.wS().a(32, this);
      paramString = (aa)paramk;
      paramString = new v(paramString.gDI, paramString.gDJ);
      at.wS().a(paramString, 0);
    }
    if (paramk.getType() == 32)
    {
      at.wS().b(32, this);
      w.i("MicroMsg.ContactsSyncService", "getmfriend onSceneEnd: errType = " + paramInt1 + ", errCode = " + paramInt2);
      if ((paramInt1 == 0) && (paramInt2 == 0)) {
        com.tencent.mm.sdk.f.e.b(new b(this, gTz), "MMAccountManager_updateLocalContacts").start();
      }
      Qx();
    }
    GMTrace.o(7832409735168L, 58356);
  }
  
  public IBinder onBind(Intent paramIntent)
  {
    GMTrace.i(7832275517440L, 58355);
    paramIntent = null;
    if (a.aS(this, "android.permission.READ_CONTACTS"))
    {
      if (this.hts == null) {
        this.hts = new a(getApplicationContext());
      }
      paramIntent = this.hts.getSyncAdapterBinder();
    }
    for (;;)
    {
      w.i("MicroMsg.ContactsSyncService", "ContactsSyncService onBind ret[%s]", new Object[] { paramIntent });
      GMTrace.o(7832275517440L, 58355);
      return paramIntent;
      w.i("MicroMsg.ContactsSyncService", "ContactsSyncService onBind no permission");
    }
  }
  
  public void onDestroy()
  {
    GMTrace.i(7832678170624L, 58358);
    w.i("MicroMsg.ContactsSyncService", "contacts sync service destory");
    super.onDestroy();
    GMTrace.o(7832678170624L, 58358);
  }
  
  private final class a
    extends AbstractThreadedSyncAdapter
  {
    private Context mContext;
    
    public a(Context paramContext)
    {
      super(true);
      GMTrace.i(7831201775616L, 58347);
      this.mContext = paramContext;
      w.i("MicroMsg.ContactsSyncService", "ContactsSyncService SyncAdapterImpl construction");
      GMTrace.o(7831201775616L, 58347);
    }
    
    public final void onPerformSync(Account paramAccount, Bundle paramBundle, String paramString, ContentProviderClient paramContentProviderClient, SyncResult paramSyncResult)
    {
      GMTrace.i(7831335993344L, 58348);
      w.i("MicroMsg.ContactsSyncService", "ContactsSyncService SyncAdapterImpl onPerformSync");
      if (!at.AU())
      {
        w.e("MicroMsg.ContactsSyncService", "ContactsSyncService account not ready, ignore this sync");
        GMTrace.o(7831335993344L, 58348);
        return;
      }
      try
      {
        Looper.prepare();
        ContactsSyncService.a(ContactsSyncService.this, Looper.myLooper());
        ContactsSyncService.a(ContactsSyncService.this, paramAccount);
        Looper.loop();
        GMTrace.o(7831335993344L, 58348);
        return;
      }
      catch (Exception paramAccount)
      {
        ContactsSyncService.a(ContactsSyncService.this);
        w.e("MicroMsg.ContactsSyncService", "ContactsSyncService.onPerformSync error: " + paramAccount.getMessage());
        GMTrace.o(7831335993344L, 58348);
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes4-dex2jar.jar!\com\tencent\mm\plugin\accountsync\model\ContactsSyncService.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */