package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage;

import android.text.TextUtils;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.kernel.h;
import com.tencent.mm.plugin.downloader.e.b;
import com.tencent.mm.plugin.downloader.model.FileDownloadTaskInfo;
import com.tencent.mm.plugin.downloader.model.c;
import com.tencent.mm.plugin.downloader.model.f;
import com.tencent.mm.plugin.downloader.model.n;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.sdk.platformtools.w;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.util.concurrent.ConcurrentHashMap;

public final class a
{
  public ConcurrentHashMap<Long, WeakReference<a>> pDF;
  public ConcurrentHashMap<String, b> pDG;
  
  public a()
  {
    GMTrace.i(8197079302144L, 61073);
    this.pDF = new ConcurrentHashMap();
    this.pDG = new ConcurrentHashMap();
    f.apJ();
    c.a(new n()
    {
      public final void bs(long paramAnonymousLong)
      {
        GMTrace.i(8195737124864L, 61063);
        Object localObject = (WeakReference)a.this.pDF.get(Long.valueOf(paramAnonymousLong));
        if (localObject != null)
        {
          localObject = (a.a)((WeakReference)localObject).get();
          if (localObject != null)
          {
            FileDownloadTaskInfo localFileDownloadTaskInfo = f.apJ().bg(paramAnonymousLong);
            if ((localFileDownloadTaskInfo.eJd >= 0L) && (localFileDownloadTaskInfo.eJe > 0L)) {
              ((a.a)localObject).uk((int)(localFileDownloadTaskInfo.eJd * 100L / localFileDownloadTaskInfo.eJe));
            }
          }
        }
        GMTrace.o(8195737124864L, 61063);
      }
      
      public final void c(long paramAnonymousLong, int paramAnonymousInt, boolean paramAnonymousBoolean)
      {
        GMTrace.i(8195334471680L, 61060);
        Object localObject = (WeakReference)a.this.pDF.get(Long.valueOf(paramAnonymousLong));
        if (localObject != null)
        {
          localObject = (a.a)((WeakReference)localObject).get();
          if (localObject != null)
          {
            ((a.a)localObject).bid();
            a.this.pDF.remove(Long.valueOf(paramAnonymousLong));
          }
          a.this.G(8, paramAnonymousLong);
        }
        GMTrace.o(8195334471680L, 61060);
      }
      
      public final void c(long paramAnonymousLong, String paramAnonymousString, boolean paramAnonymousBoolean)
      {
        GMTrace.i(8195200253952L, 61059);
        paramAnonymousString = (WeakReference)a.this.pDF.get(Long.valueOf(paramAnonymousLong));
        if (paramAnonymousString != null)
        {
          paramAnonymousString = (a.a)paramAnonymousString.get();
          if (paramAnonymousString != null)
          {
            paramAnonymousString.bic();
            a.this.pDF.remove(Long.valueOf(paramAnonymousLong));
          }
          a.this.G(3, paramAnonymousLong);
        }
        GMTrace.o(8195200253952L, 61059);
      }
      
      public final void k(long paramAnonymousLong, String paramAnonymousString)
      {
        GMTrace.i(14313649602560L, 106645);
        paramAnonymousString = (WeakReference)a.this.pDF.get(Long.valueOf(paramAnonymousLong));
        if (paramAnonymousString != null)
        {
          paramAnonymousString = (a.a)paramAnonymousString.get();
          if (paramAnonymousString != null) {
            paramAnonymousString.bie();
          }
          a.this.G(7, paramAnonymousLong);
        }
        GMTrace.o(14313649602560L, 106645);
      }
      
      public final void onTaskPaused(long paramAnonymousLong)
      {
        GMTrace.i(8195602907136L, 61062);
        Object localObject = (WeakReference)a.this.pDF.get(Long.valueOf(paramAnonymousLong));
        if (localObject != null)
        {
          localObject = (a.a)((WeakReference)localObject).get();
          if (localObject != null) {
            ((a.a)localObject).bia();
          }
          a.this.G(6, paramAnonymousLong);
        }
        GMTrace.o(8195602907136L, 61062);
      }
      
      public final void onTaskRemoved(long paramAnonymousLong)
      {
        GMTrace.i(8195468689408L, 61061);
        Object localObject = (WeakReference)a.this.pDF.get(Long.valueOf(paramAnonymousLong));
        if (localObject != null)
        {
          localObject = (a.a)((WeakReference)localObject).get();
          if (localObject != null)
          {
            ((a.a)localObject).bib();
            a.this.pDF.remove(Long.valueOf(paramAnonymousLong));
          }
          a.this.G(2, paramAnonymousLong);
        }
        GMTrace.o(8195468689408L, 61061);
      }
      
      public final void onTaskStarted(long paramAnonymousLong, String paramAnonymousString)
      {
        GMTrace.i(8195066036224L, 61058);
        a.this.G(1, paramAnonymousLong);
        GMTrace.o(8195066036224L, 61058);
      }
    });
    GMTrace.o(8197079302144L, 61073);
  }
  
  private static String o(Object... paramVarArgs)
  {
    GMTrace.i(8198018826240L, 61080);
    StringBuilder localStringBuilder = new StringBuilder();
    int i = 0;
    while (i < 3)
    {
      localStringBuilder.append(String.valueOf(paramVarArgs[i])).append(',');
      i += 1;
    }
    localStringBuilder.append(String.valueOf(paramVarArgs[3]));
    paramVarArgs = localStringBuilder.toString();
    GMTrace.o(8198018826240L, 61080);
    return paramVarArgs;
  }
  
  public static long queryIdByAppid(String paramString)
  {
    GMTrace.i(15248476078080L, 113610);
    paramString = f.apJ().vv(paramString);
    if (paramString != null)
    {
      long l = paramString.id;
      GMTrace.o(15248476078080L, 113610);
      return l;
    }
    GMTrace.o(15248476078080L, 113610);
    return Long.MAX_VALUE;
  }
  
  public static void stopTask(long paramLong)
  {
    GMTrace.i(15248341860352L, 113609);
    f.apJ().bf(paramLong);
    GMTrace.o(15248341860352L, 113609);
  }
  
  public final void G(int paramInt, long paramLong)
  {
    GMTrace.i(8197884608512L, 61079);
    Object localObject = ((com.tencent.mm.plugin.downloader.b.a)h.h(com.tencent.mm.plugin.downloader.b.a.class)).yQ().bt(paramLong);
    if (localObject == null)
    {
      GMTrace.o(8197884608512L, 61079);
      return;
    }
    localObject = ((com.tencent.mm.plugin.downloader.e.a)localObject).field_appId;
    com.tencent.mm.plugin.downloader.e.a locala = ((com.tencent.mm.plugin.downloader.b.a)h.h(com.tencent.mm.plugin.downloader.b.a.class)).yQ().vr((String)localObject);
    if (locala == null)
    {
      w.i("MicroMsg.AdDownloadApkMgr", "downloadinfo not found");
      GMTrace.o(8197884608512L, 61079);
      return;
    }
    String str1 = locala.field_packageName;
    String str2 = locala.field_md5;
    c(paramInt, (String)localObject, str1, locala.field_downloadUrl);
    GMTrace.o(8197884608512L, 61079);
  }
  
  public final void c(int paramInt, String paramString1, String paramString2, String paramString3)
  {
    GMTrace.i(18581504917504L, 138443);
    System.currentTimeMillis();
    b localb = (b)this.pDG.get(paramString1);
    String str = paramString2;
    if (!TextUtils.isEmpty(paramString2)) {
      str = paramString2.replaceAll("\\.", "_");
    }
    if (localb == null) {}
    for (paramString2 = "";; paramString2 = localb.pCr + "." + localb.hVd + "." + str + ".0.20.0")
    {
      paramString1 = o(new Object[] { paramString1, Integer.valueOf(paramInt), paramString3, paramString2 });
      w.i("MicroMsg.AdDownloadApkMgr", "reporting %d  %s", new Object[] { Integer.valueOf(14542), paramString1 });
      w.d("MicroMsg.AdDownloadApkMgr", "14542  extinfo : " + paramString2);
      g.ork.A(14542, paramString1);
      GMTrace.o(18581504917504L, 138443);
      return;
    }
  }
  
  public static abstract interface a
  {
    public abstract void bia();
    
    public abstract void bib();
    
    public abstract void bic();
    
    public abstract void bid();
    
    public abstract void bie();
    
    public abstract void start();
    
    public abstract void uk(int paramInt);
  }
  
  public static final class b
    implements Serializable
  {
    public String hVd;
    public String pCr;
    
    public b(String paramString1, String paramString2)
    {
      GMTrace.i(15248207642624L, 113608);
      this.pCr = paramString1;
      this.hVd = paramString2;
      GMTrace.o(15248207642624L, 113608);
    }
  }
  
  private static final class c
  {
    public static final a pDI;
    
    static
    {
      GMTrace.i(8193723858944L, 61048);
      pDI = new a();
      GMTrace.o(8193723858944L, 61048);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\sns\storage\AdLandingPagesStorage\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */