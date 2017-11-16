package com.tencent.mm.plugin.downloader.d;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.RemoteException;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.kernel.h;
import com.tencent.mm.network.n.a;
import com.tencent.mm.plugin.downloader.a.a.a;
import com.tencent.mm.plugin.downloader.a.b.a;
import com.tencent.mm.plugin.downloader.ipc.CDNDownloadService;
import com.tencent.mm.plugin.downloader.ipc.CDNTaskInfo;
import com.tencent.mm.plugin.downloader.ipc.CDNTaskState;
import com.tencent.mm.plugin.downloader.model.d;
import com.tencent.mm.plugin.downloader.model.p;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.aj;
import com.tencent.mm.sdk.platformtools.aj.a;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.util.Iterator;
import java.util.Set;

public final class a
  implements com.tencent.mm.ipcinvoker.wx_extension.b.a
{
  private static a keb;
  private long kec;
  public long ked;
  public com.tencent.mm.plugin.downloader.a.a kee;
  public Set<CDNTaskInfo> kef;
  public b keg;
  private ServiceConnection keh;
  aj kei;
  com.tencent.mm.plugin.downloader.a.b kej;
  private n.a kek;
  private Context mContext;
  
  public a()
  {
    GMTrace.i(20076421971968L, 149581);
    this.kec = 0L;
    this.ked = 0L;
    this.kef = new com.tencent.mm.plugin.downloader.model.a(new p()
    {
      public final void apD()
      {
        GMTrace.i(20375190634496L, 151807);
        w.i("MicroMsg.CDNDownloadClient", "notify add");
        a.this.apv();
        a locala = a.this;
        w.i("MicroMsg.CDNDownloadClient", "startCheckProcessActiveTimer");
        locala.kei.z(20000L, 20000L);
        GMTrace.o(20375190634496L, 151807);
      }
      
      public final void clear()
      {
        GMTrace.i(20375459069952L, 151809);
        w.i("MicroMsg.CDNDownloadClient", "notify clear");
        a.this.apw();
        a.this.apA();
        GMTrace.o(20375459069952L, 151809);
      }
      
      public final void remove()
      {
        GMTrace.i(20375324852224L, 151808);
        w.i("MicroMsg.CDNDownloadClient", "notify remove");
        if (a.this.kef.size() == 0)
        {
          a.this.apw();
          a.this.apA();
        }
        GMTrace.o(20375324852224L, 151808);
      }
    });
    this.keh = new ServiceConnection()
    {
      public final void onServiceConnected(ComponentName paramAnonymousComponentName, IBinder paramAnonymousIBinder)
      {
        GMTrace.i(20078703673344L, 149598);
        w.i("MicroMsg.CDNDownloadClient", "onServiceConnected");
        a.this.kee = a.a.H(paramAnonymousIBinder);
        paramAnonymousComponentName = a.this;
        try
        {
          w.i("MicroMsg.CDNDownloadClient", "registerCallback");
          paramAnonymousComponentName.kee.a(paramAnonymousComponentName.kej);
          a.this.apC();
          GMTrace.o(20078703673344L, 149598);
          return;
        }
        catch (RemoteException paramAnonymousComponentName)
        {
          for (;;)
          {
            w.e("MicroMsg.CDNDownloadClient", "registerCallback: " + paramAnonymousComponentName.getMessage());
          }
        }
      }
      
      public final void onServiceDisconnected(ComponentName paramAnonymousComponentName)
      {
        GMTrace.i(20078837891072L, 149599);
        w.i("MicroMsg.CDNDownloadClient", "onServiceDisconnected");
        if (a.this.kef.size() != 0)
        {
          paramAnonymousComponentName = a.this.kef.iterator();
          while (paramAnonymousComponentName.hasNext()) {
            ((CDNTaskInfo)paramAnonymousComponentName.next()).kez = true;
          }
        }
        GMTrace.o(20078837891072L, 149599);
      }
    };
    this.kei = new aj(com.tencent.mm.bv.a.bVB().getLooper(), new aj.a()
    {
      public final boolean pM()
      {
        GMTrace.i(20375056416768L, 151806);
        w.d("MicroMsg.CDNDownloadClient", "checkProcessTimer");
        if (a.this.kef.size() == 0)
        {
          GMTrace.o(20375056416768L, 151806);
          return false;
        }
        if (a.this.kee != null) {}
        try
        {
          w.d("MicroMsg.CDNDownloadClient", "checkActive");
          a.this.kee.apx();
          GMTrace.o(20375056416768L, 151806);
          return true;
        }
        catch (RemoteException localRemoteException)
        {
          w.e("MicroMsg.CDNDownloadClient", "check process active false");
          g.ork.a(710L, 3L, 1L, false);
          localObject = a.this;
          int i;
          if (System.currentTimeMillis() - ((a)localObject).ked > 120000L) {
            i = 1;
          }
          while (i != 0)
          {
            a.this.ked = System.currentTimeMillis();
            localObject = a.this.kef.iterator();
            for (;;)
            {
              if (((Iterator)localObject).hasNext())
              {
                ((CDNTaskInfo)((Iterator)localObject).next()).kez = true;
                continue;
                i = 0;
                break;
              }
            }
            a.this.apB();
            GMTrace.o(20375056416768L, 151806);
            return true;
          }
        }
        w.i("MicroMsg.CDNDownloadClient", "dead twice in 1 min, something wrong must be happened");
        g.ork.a(710L, 4L, 1L, false);
        Object localObject = a.this.kef.iterator();
        while (((Iterator)localObject).hasNext())
        {
          CDNTaskInfo localCDNTaskInfo = (CDNTaskInfo)((Iterator)localObject).next();
          a.this.keg.e(localCDNTaskInfo.downloadUrl, 4, d.keS, null);
        }
        a.this.kef.clear();
        GMTrace.o(20375056416768L, 151806);
        return false;
      }
    }, true);
    this.kej = new b.a()
    {
      public final void d(String paramAnonymousString1, int paramAnonymousInt1, int paramAnonymousInt2, String paramAnonymousString2)
      {
        GMTrace.i(20374519545856L, 151802);
        w.i("MicroMsg.CDNDownloadClient", "onDownloadStateChange, mediaId = %s, state = %d, errCode = %d, errMsg = %s", new Object[] { paramAnonymousString1, Integer.valueOf(paramAnonymousInt1), Integer.valueOf(paramAnonymousInt2), paramAnonymousString2 });
        if (paramAnonymousInt1 != 1) {
          a.this.kef.remove(new CDNTaskInfo(paramAnonymousString1));
        }
        if (a.this.keg != null) {
          a.this.keg.e(paramAnonymousString1, paramAnonymousInt1, paramAnonymousInt2, paramAnonymousString2);
        }
        GMTrace.o(20374519545856L, 151802);
      }
      
      public final void g(String paramAnonymousString, long paramAnonymousLong1, long paramAnonymousLong2)
      {
        GMTrace.i(20374653763584L, 151803);
        w.d("MicroMsg.CDNDownloadClient", "onDownloadProgressChange, mediaId = %s, receiveLen = %d, totalLen = %d", new Object[] { paramAnonymousString, Long.valueOf(paramAnonymousLong1), Long.valueOf(paramAnonymousLong2) });
        if (a.this.keg != null) {
          a.this.keg.h(paramAnonymousString, paramAnonymousLong1, paramAnonymousLong2);
        }
        GMTrace.o(20374653763584L, 151803);
      }
    };
    this.kek = new n.a()
    {
      public final void db(int paramAnonymousInt)
      {
        GMTrace.i(20375727505408L, 151811);
        a locala = a.this;
        w.i("MicroMsg.CDNDownloadClient", "notifyNetworkChange: " + paramAnonymousInt);
        if (locala.kee != null) {
          try
          {
            locala.kee.ms(paramAnonymousInt);
            GMTrace.o(20375727505408L, 151811);
            return;
          }
          catch (RemoteException localRemoteException) {}
        }
        GMTrace.o(20375727505408L, 151811);
      }
    };
    this.mContext = ab.getContext();
    h.xz();
    h.xx().a(this.kek);
    apB();
    GMTrace.o(20076421971968L, 149581);
  }
  
  public static a apz()
  {
    try
    {
      GMTrace.i(20076287754240L, 149580);
      if (keb == null) {
        keb = new a();
      }
      a locala = keb;
      GMTrace.o(20076287754240L, 149580);
      return locala;
    }
    finally {}
  }
  
  public final int a(CDNTaskInfo paramCDNTaskInfo)
  {
    GMTrace.i(20076824625152L, 149584);
    if ((paramCDNTaskInfo == null) || (bg.nm(paramCDNTaskInfo.downloadUrl)))
    {
      w.w("MicroMsg.CDNDownloadClient", "addDownloadTask, info invalid");
      GMTrace.o(20076824625152L, 149584);
      return -1;
    }
    w.i("MicroMsg.CDNDownloadClient", "addDownloadTask filePath:%s, url:%s", new Object[] { paramCDNTaskInfo.filePath, paramCDNTaskInfo.downloadUrl });
    if (this.kef.contains(paramCDNTaskInfo))
    {
      w.i("MicroMsg.CDNDownloadClient", "addDownloadTask, already in running");
      GMTrace.o(20076824625152L, 149584);
      return -2;
    }
    if (this.kee != null) {
      try
      {
        int i = this.kee.a(paramCDNTaskInfo);
        if ((i == 0) || (i == -2)) {
          this.kef.add(paramCDNTaskInfo);
        }
        GMTrace.o(20076824625152L, 149584);
        return i;
      }
      catch (RemoteException localRemoteException)
      {
        w.e("MicroMsg.CDNDownloadClient", "addDownloadTask, " + localRemoteException.getMessage());
      }
    }
    this.kef.add(paramCDNTaskInfo);
    apB();
    GMTrace.o(20076824625152L, 149584);
    return 0;
  }
  
  public final void apA()
  {
    GMTrace.i(20374787981312L, 151804);
    w.i("MicroMsg.CDNDownloadClient", "stopCheckProcessActiveTimer");
    this.kei.stopTimer();
    GMTrace.o(20374787981312L, 151804);
  }
  
  public final void apB()
  {
    try
    {
      GMTrace.i(20076556189696L, 149582);
      Intent localIntent = new Intent(this.mContext, CDNDownloadService.class);
      try
      {
        boolean bool = this.mContext.bindService(localIntent, this.keh, 1);
        w.i("MicroMsg.CDNDownloadClient", "bindService: " + bool);
        GMTrace.o(20076556189696L, 149582);
      }
      catch (Exception localException)
      {
        for (;;)
        {
          w.e("MicroMsg.CDNDownloadClient", "bindService: " + localException.getMessage());
          GMTrace.o(20076556189696L, 149582);
        }
      }
      return;
    }
    finally {}
  }
  
  public final void apC()
  {
    GMTrace.i(20076690407424L, 149583);
    w.i("MicroMsg.CDNDownloadClient", "resumeTaskWhenSvrConnected");
    if (this.kef.size() > 0) {
      apv();
    }
    Iterator localIterator = this.kef.iterator();
    while (localIterator.hasNext())
    {
      CDNTaskInfo localCDNTaskInfo = (CDNTaskInfo)localIterator.next();
      w.i("MicroMsg.CDNDownloadClient", "resumeTaskWhenSvrConnected, url: %s, resume: %b", new Object[] { localCDNTaskInfo.downloadUrl, Boolean.valueOf(localCDNTaskInfo.kez) });
      try
      {
        if (!localCDNTaskInfo.kez) {
          break label148;
        }
        this.kee.b(localCDNTaskInfo);
      }
      catch (RemoteException localRemoteException)
      {
        w.e("MicroMsg.CDNDownloadClient", "resumeTaskWhenSvrConnected: " + localRemoteException);
        g.ork.a(710L, 0L, 1L, false);
      }
      continue;
      label148:
      this.kee.a(localRemoteException);
    }
    GMTrace.o(20076690407424L, 149583);
  }
  
  public final void apv()
  {
    GMTrace.i(20077495713792L, 149589);
    if (this.kee != null) {
      try
      {
        this.kee.apv();
        GMTrace.o(20077495713792L, 149589);
        return;
      }
      catch (RemoteException localRemoteException)
      {
        w.e("MicroMsg.CDNDownloadClient", "addIPCTaskMarker: " + localRemoteException);
      }
    }
    GMTrace.o(20077495713792L, 149589);
  }
  
  public final void apw()
  {
    GMTrace.i(20374922199040L, 151805);
    if (this.kee != null) {
      try
      {
        this.kee.apw();
        GMTrace.o(20374922199040L, 151805);
        return;
      }
      catch (RemoteException localRemoteException)
      {
        w.e("MicroMsg.CDNDownloadClient", "removeIPCTaskMarker: " + localRemoteException);
      }
    }
    GMTrace.o(20374922199040L, 151805);
  }
  
  public final int b(CDNTaskInfo paramCDNTaskInfo)
  {
    GMTrace.i(20077093060608L, 149586);
    if ((paramCDNTaskInfo == null) || (bg.nm(paramCDNTaskInfo.downloadUrl)))
    {
      w.w("MicroMsg.CDNDownloadClient", "resumeDownloadTask, info invalid");
      GMTrace.o(20077093060608L, 149586);
      return -1;
    }
    w.i("MicroMsg.CDNDownloadClient", "resumeDownloadTask: " + paramCDNTaskInfo.downloadUrl);
    paramCDNTaskInfo.kez = true;
    if (this.kee != null) {
      try
      {
        int i = this.kee.b(paramCDNTaskInfo);
        if ((i == 0) || (i == -2)) {
          this.kef.add(paramCDNTaskInfo);
        }
        GMTrace.o(20077093060608L, 149586);
        return i;
      }
      catch (RemoteException localRemoteException)
      {
        w.e("MicroMsg.CDNDownloadClient", "resumeDownloadTask, " + localRemoteException.getMessage());
      }
    }
    this.kef.add(paramCDNTaskInfo);
    apB();
    GMTrace.o(20077093060608L, 149586);
    return 0;
  }
  
  public final boolean vn(String paramString)
  {
    GMTrace.i(20076958842880L, 149585);
    w.i("MicroMsg.CDNDownloadClient", "pauseDownloadTask: " + paramString);
    if (bg.nm(paramString))
    {
      w.w("MicroMsg.CDNDownloadClient", "pauseDownloadTask, url invalid");
      GMTrace.o(20076958842880L, 149585);
      return false;
    }
    if (this.kee != null) {
      try
      {
        this.kef.remove(new CDNTaskInfo(paramString));
        boolean bool = this.kee.vn(paramString);
        GMTrace.o(20076958842880L, 149585);
        return bool;
      }
      catch (RemoteException paramString)
      {
        w.e("MicroMsg.CDNDownloadClient", "pauseDownloadTask, " + paramString.getMessage());
      }
    }
    w.i("MicroMsg.CDNDownloadClient", "pauseDownloadTask false, service interface is null");
    GMTrace.o(20076958842880L, 149585);
    return false;
  }
  
  public final boolean vo(String paramString)
  {
    GMTrace.i(20077227278336L, 149587);
    w.i("MicroMsg.CDNDownloadClient", "removeDownloadTask: " + paramString);
    if (bg.nm(paramString))
    {
      w.w("MicroMsg.CDNDownloadClient", "removeDownloadTask, url invalid");
      GMTrace.o(20077227278336L, 149587);
      return false;
    }
    if (this.kee != null) {
      try
      {
        this.kef.remove(new CDNTaskInfo(paramString));
        boolean bool = this.kee.vo(paramString);
        GMTrace.o(20077227278336L, 149587);
        return bool;
      }
      catch (RemoteException paramString)
      {
        w.e("MicroMsg.CDNDownloadClient", "removeDownloadTask, " + paramString.getMessage());
      }
    }
    w.i("MicroMsg.CDNDownloadClient", "removeDownloadTask false, service interface is null");
    GMTrace.o(20077227278336L, 149587);
    return false;
  }
  
  public final CDNTaskState vp(String paramString)
  {
    GMTrace.i(20077361496064L, 149588);
    if (bg.nm(paramString))
    {
      w.w("MicroMsg.CDNDownloadClient", "queryDownloadTask, url invalid");
      GMTrace.o(20077361496064L, 149588);
      return null;
    }
    if (this.kee != null) {
      try
      {
        paramString = this.kee.vp(paramString);
        GMTrace.o(20077361496064L, 149588);
        return paramString;
      }
      catch (RemoteException paramString)
      {
        w.e("MicroMsg.CDNDownloadClient", "queryDownloadTask, " + paramString.getMessage());
      }
    }
    GMTrace.o(20077361496064L, 149588);
    return null;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\downloader\d\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */