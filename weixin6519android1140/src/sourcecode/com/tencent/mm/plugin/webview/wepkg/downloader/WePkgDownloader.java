package com.tencent.mm.plugin.webview.wepkg.downloader;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.a.e;
import com.tencent.mm.ad.n;
import com.tencent.mm.plugin.webview.wepkg.ipc.WepkgMainProcessService;
import com.tencent.mm.plugin.webview.wepkg.ipc.WepkgMainProcessTask;
import com.tencent.mm.plugin.webview.wepkg.model.WepkgCrossProcessTask;
import com.tencent.mm.pluginsdk.model.app.al;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.am;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.y.at;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class WePkgDownloader
{
  private static volatile WePkgDownloader rXn;
  public Map<String, IWepkgUpdateCallback> rXo;
  private a rXp;
  
  static
  {
    GMTrace.i(12375008739328L, 92201);
    rXn = null;
    GMTrace.o(12375008739328L, 92201);
  }
  
  public WePkgDownloader()
  {
    GMTrace.i(12374337650688L, 92196);
    this.rXp = new a()
    {
      public final void a(g paramAnonymousg)
      {
        for (;;)
        {
          try
          {
            GMTrace.i(12375948263424L, 92208);
            d.bGh().MR(paramAnonymousg.rXc.rXz);
            if (paramAnonymousg.mStatus == 1)
            {
              localObject1 = paramAnonymousg.rXc.mFilePath;
              if ((bg.nm((String)localObject1)) || (!new File((String)localObject1).exists()))
              {
                w.e("MicroMsg.Wepkg.WepkgDownloader", "onDownloadComplete, pkgPath is null or nil");
                localObject1 = WePkgDownloader.IWepkgUpdateCallback.RetCode.rXs;
                w.i("MicroMsg.Wepkg.WepkgDownloader", "download callback retCode:" + localObject1);
                localObject2 = (WePkgDownloader.IWepkgUpdateCallback)WePkgDownloader.this.rXo.remove(paramAnonymousg.rXc.rXz);
                if (localObject2 != null)
                {
                  ((WePkgDownloader.IWepkgUpdateCallback)localObject2).a(paramAnonymousg.rXc.rXA, paramAnonymousg.rXc.mFilePath, (WePkgDownloader.IWepkgUpdateCallback.RetCode)localObject1);
                  if (paramAnonymousg.rXc.kfs != 1) {
                    break label335;
                  }
                  localObject1 = paramAnonymousg.rXc.rXA;
                  localObject2 = new WepkgCrossProcessTask();
                  ((WepkgCrossProcessTask)localObject2).nJ = 3008;
                  ((WepkgCrossProcessTask)localObject2).rYm.rYG = ((String)localObject1);
                  if (!ab.bPY()) {
                    break label327;
                  }
                  ((WepkgCrossProcessTask)localObject2).RY();
                  WePkgDownloader.b(paramAnonymousg);
                  GMTrace.o(12375948263424L, 92208);
                }
              }
              else
              {
                localObject2 = paramAnonymousg.rXc.koc;
                localObject3 = com.tencent.mm.a.g.bg((String)localObject1);
                if (!bg.nl((String)localObject3).equalsIgnoreCase((String)localObject2))
                {
                  w.e("MicroMsg.Wepkg.WepkgDownloader", "onDownloadComplete, file.md5(%s) != net.md5(%s)", new Object[] { localObject3, localObject2 });
                  com.tencent.mm.loader.stub.b.deleteFile((String)localObject1);
                  localObject1 = WePkgDownloader.IWepkgUpdateCallback.RetCode.rXt;
                  paramAnonymousg.kwP = 1012;
                  continue;
                }
                localObject1 = WePkgDownloader.IWepkgUpdateCallback.RetCode.rXr;
                continue;
              }
            }
            else
            {
              localObject1 = WePkgDownloader.IWepkgUpdateCallback.RetCode.rXv;
              continue;
            }
            w.i("MicroMsg.Wepkg.WepkgDownloader", "download callback invalid");
            com.tencent.mm.plugin.webview.wepkg.utils.a.b("CallbackInvalid", paramAnonymousg.rXc.mUrl, paramAnonymousg.rXc.rXA, null, -1L, 0L, null);
            continue;
            WepkgMainProcessService.b((WepkgMainProcessTask)localObject2);
          }
          finally {}
          label327:
          continue;
          label335:
          Object localObject1 = paramAnonymousg.rXc.rXA;
          Object localObject2 = paramAnonymousg.rXc.rXB;
          Object localObject3 = new WepkgCrossProcessTask();
          ((WepkgCrossProcessTask)localObject3).nJ = 4005;
          ((WepkgCrossProcessTask)localObject3).rYo.rYG = ((String)localObject1);
          ((WepkgCrossProcessTask)localObject3).rYo.rYr = ((String)localObject2);
          if (ab.bPY()) {
            ((WepkgCrossProcessTask)localObject3).RY();
          } else {
            WepkgMainProcessService.b((WepkgMainProcessTask)localObject3);
          }
        }
      }
    };
    if (this.rXo == null) {
      this.rXo = new ConcurrentHashMap();
    }
    GMTrace.o(12374337650688L, 92196);
  }
  
  private void a(File paramFile, String paramString, List<String> paramList)
  {
    GMTrace.i(15170898231296L, 113032);
    if ((paramFile == null) || (!paramFile.exists()))
    {
      GMTrace.o(15170898231296L, 113032);
      return;
    }
    if ((paramFile.isFile()) && (paramFile.getName().equals(paramString)))
    {
      paramString = paramList;
      if (paramList == null) {
        paramString = new ArrayList();
      }
      paramString.add(paramFile.getAbsolutePath());
      GMTrace.o(15170898231296L, 113032);
      return;
    }
    if (paramFile.isDirectory())
    {
      paramFile = paramFile.listFiles();
      if (paramFile != null)
      {
        int i = 0;
        while (i < paramFile.length)
        {
          a(paramFile[i], paramString, paramList);
          i += 1;
        }
      }
    }
    GMTrace.o(15170898231296L, 113032);
  }
  
  public static void b(g paramg)
  {
    GMTrace.i(16083310346240L, 119830);
    Object localObject2 = paramg.rXc;
    if (localObject2 != null)
    {
      Object localObject1 = ((f)localObject2).rXA;
      String str = ((f)localObject2).rXC;
      int j = paramg.rXJ;
      int k = paramg.kwP;
      int m = paramg.hiz;
      paramg = ab.getContext();
      int i;
      if (am.isNetworkConnected(paramg)) {
        if (am.is2G(paramg)) {
          i = 2;
        }
      }
      for (;;)
      {
        w.i("MicroMsg.WePkgReport", "pkgId = %s, version = %s, isRange = %d, errCode=%d, retryTimes = %d, netType = %d", new Object[] { localObject1, str, Integer.valueOf(j), Integer.valueOf(k), Integer.valueOf(m), Integer.valueOf(i) });
        localObject2 = com.tencent.mm.plugin.webview.wepkg.utils.a.Nc(((f)localObject2).mUrl);
        paramg = new Object[7];
        paramg[0] = localObject1;
        paramg[1] = str;
        paramg[2] = Integer.valueOf(j);
        paramg[3] = Integer.valueOf(k);
        paramg[4] = Integer.valueOf(i);
        paramg[5] = Integer.valueOf(m);
        paramg[6] = localObject2;
        localObject1 = new StringBuilder();
        i = 0;
        while (i < 6)
        {
          ((StringBuilder)localObject1).append(String.valueOf(paramg[i])).append(',');
          i += 1;
        }
        if (am.is3G(paramg))
        {
          i = 3;
        }
        else if (am.is4G(paramg))
        {
          i = 4;
        }
        else if (am.isWifi(paramg))
        {
          i = 1;
        }
        else
        {
          i = 0;
          continue;
          i = -1;
        }
      }
      ((StringBuilder)localObject1).append(String.valueOf(paramg[6]));
      paramg = new al(14229, ((StringBuilder)localObject1).toString());
      at.wS().a(paramg, 0);
    }
    GMTrace.o(16083310346240L, 119830);
  }
  
  public static WePkgDownloader bGj()
  {
    GMTrace.i(12374203432960L, 92195);
    if (rXn == null) {}
    try
    {
      if (rXn == null) {
        rXn = new WePkgDownloader();
      }
      WePkgDownloader localWePkgDownloader = rXn;
      GMTrace.o(12374203432960L, 92195);
      return localWePkgDownloader;
    }
    finally {}
  }
  
  public final void a(int paramInt1, String paramString1, String paramString2, String paramString3, long paramLong, String paramString4, String paramString5, int paramInt2, IWepkgUpdateCallback paramIWepkgUpdateCallback)
  {
    GMTrace.i(16597498462208L, 123661);
    w.i("MicroMsg.Wepkg.WepkgDownloader", "triggerDownloadWepkg, fileType:%s, pkgid:%s, downloadUrl:%s, pkgSize:%d, version:%s, md5:%s, downloadNetType:%d", new Object[] { Integer.valueOf(paramInt1), paramString1, paramString3, Long.valueOf(paramLong), paramString4, paramString5, Integer.valueOf(paramInt2) });
    Object localObject1;
    if (paramInt1 == 1)
    {
      localObject1 = com.tencent.mm.plugin.webview.wepkg.utils.d.ew(paramString1, paramString4);
      com.tencent.mm.plugin.webview.wepkg.utils.d.Nj((String)localObject1);
    }
    for (String str = (String)localObject1 + "/package"; bg.nm(str); str = (String)localObject1 + "/" + paramString5)
    {
      w.i("MicroMsg.Wepkg.WepkgDownloader", "pkgPath:%s is null", new Object[] { str });
      paramIWepkgUpdateCallback.a(paramString1, "", WePkgDownloader.IWepkgUpdateCallback.RetCode.rXv);
      GMTrace.o(16597498462208L, 123661);
      return;
      localObject1 = com.tencent.mm.plugin.webview.wepkg.utils.d.ew(paramString1, paramString4) + "/preload_files";
      com.tencent.mm.plugin.webview.wepkg.utils.d.Nj((String)localObject1);
    }
    if (com.tencent.mm.pluginsdk.j.a.e.a.aZ(str))
    {
      if (bg.nl(com.tencent.mm.a.g.bg(str)).equals(paramString5))
      {
        w.i("MicroMsg.Wepkg.WepkgDownloader", "file exist in current %s version, pkgPath:%s", new Object[] { paramString4, str });
        paramIWepkgUpdateCallback.a(paramString1, str, WePkgDownloader.IWepkgUpdateCallback.RetCode.rXr);
        GMTrace.o(16597498462208L, 123661);
      }
    }
    else
    {
      localObject1 = com.tencent.mm.plugin.webview.wepkg.utils.d.Ne(paramString1);
      if (!bg.nm((String)localObject1))
      {
        File localFile = new File((String)localObject1);
        ArrayList localArrayList = new ArrayList();
        if ((str == null) || (str.length() <= 0)) {
          localObject1 = "";
        }
        for (;;)
        {
          a(localFile, (String)localObject1, localArrayList);
          w.i("MicroMsg.Wepkg.WepkgDownloader", "local have the same file. size:%s", new Object[] { Integer.valueOf(localArrayList.size()) });
          localObject1 = localArrayList.iterator();
          do
          {
            if (!((Iterator)localObject1).hasNext()) {
              break;
            }
            localObject2 = new File((String)((Iterator)localObject1).next());
          } while ((!((File)localObject2).isFile()) || (((File)localObject2).length() != paramLong) || (!bg.nl(com.tencent.mm.a.g.h((File)localObject2)).equalsIgnoreCase(paramString5)));
          e.o(((File)localObject2).getAbsolutePath(), str);
          w.i("MicroMsg.Wepkg.WepkgDownloader", "file exist in other version path:%s, pkgPath:%s", new Object[] { ((File)localObject2).getAbsolutePath(), str });
          paramIWepkgUpdateCallback.a(paramString1, str, WePkgDownloader.IWepkgUpdateCallback.RetCode.rXr);
          GMTrace.o(16597498462208L, 123661);
          return;
          Object localObject2 = new File(str).getName();
          int i = ((String)localObject2).lastIndexOf('.');
          localObject1 = localObject2;
          if (i >= 0) {
            if (i == 0) {
              localObject1 = "";
            } else {
              localObject1 = ((String)localObject2).substring(0, i);
            }
          }
        }
      }
    }
    boolean bool4 = false;
    boolean bool3 = false;
    boolean bool1 = bool4;
    boolean bool2 = bool3;
    switch (paramInt2)
    {
    default: 
      bool2 = bool3;
      bool1 = bool4;
    case 2: 
    case 5: 
    case 6: 
    case 7: 
    case 8: 
      w.i("MicroMsg.Wepkg.WepkgDownloader", "allowDownload:%s", new Object[] { Boolean.valueOf(bool1) });
      if (!bool1) {
        break label956;
      }
      paramString2 = new c(new f(com.tencent.mm.a.g.n(paramString3.getBytes()), paramInt1, paramString1, paramString2, paramString4, paramString3, str, paramLong, paramString5, bool2, this.rXp));
      paramString4 = d.bGh();
      if (!paramString4.rXm.containsKey(paramString2.rXc.rXz))
      {
        paramString2.rXd = b.bGf().rXb.submit(paramString2);
        paramString4.rXm.put(paramString2.rXc.rXz, paramString2);
      }
      break;
    }
    for (paramInt1 = 1;; paramInt1 = 0)
    {
      if (paramInt1 == 0) {
        break label934;
      }
      this.rXo.put(com.tencent.mm.a.g.n(paramString3.getBytes()), paramIWepkgUpdateCallback);
      GMTrace.o(16597498462208L, 123661);
      return;
      bool1 = true;
      bool2 = bool3;
      break;
      if (!am.ex(ab.getContext()))
      {
        bool1 = bool4;
        bool2 = bool3;
        if (!am.is3G(ab.getContext())) {
          break;
        }
      }
      bool1 = true;
      bool2 = bool3;
      break;
      bool1 = bool4;
      bool2 = bool3;
      if (!am.isWifi(ab.getContext())) {
        break;
      }
      bool1 = true;
      bool2 = true;
      break;
      if (am.isWifi(ab.getContext()))
      {
        bool1 = true;
        bool2 = bool3;
        break;
      }
      if (!am.ex(ab.getContext()))
      {
        bool1 = bool4;
        bool2 = bool3;
        if (!am.is3G(ab.getContext())) {
          break;
        }
      }
      bool1 = bool4;
      bool2 = bool3;
      if (!com.tencent.mm.plugin.webview.wepkg.utils.d.bGs()) {
        break;
      }
      bool1 = true;
      bool2 = bool3;
      break;
    }
    label934:
    paramIWepkgUpdateCallback.a(paramString1, "", WePkgDownloader.IWepkgUpdateCallback.RetCode.rXw);
    GMTrace.o(16597498462208L, 123661);
    return;
    label956:
    w.i("MicroMsg.Wepkg.WepkgDownloader", "net is not match, dont download");
    paramIWepkgUpdateCallback.a(paramString1, "", WePkgDownloader.IWepkgUpdateCallback.RetCode.rXw);
    GMTrace.o(16597498462208L, 123661);
  }
  
  public static abstract interface IWepkgUpdateCallback
  {
    public abstract void a(String paramString1, String paramString2, RetCode paramRetCode);
    
    public static enum RetCode
      implements Parcelable
    {
      public static final Parcelable.Creator<RetCode> CREATOR;
      
      static
      {
        GMTrace.i(12372190167040L, 92180);
        rXr = new RetCode("OK", 0);
        rXs = new RetCode("LOCAL_FILE_NOT_FOUND", 1);
        rXt = new RetCode("PKG_INTEGRITY_FAILED", 2);
        rXu = new RetCode("PKG_INVALID", 3);
        rXv = new RetCode("FAILED", 4);
        rXw = new RetCode("CANCEL", 5);
        rXx = new RetCode[] { rXr, rXs, rXt, rXu, rXv, rXw };
        CREATOR = new Parcelable.Creator() {};
        GMTrace.o(12372190167040L, 92180);
      }
      
      private RetCode()
      {
        GMTrace.i(12372055949312L, 92179);
        GMTrace.o(12372055949312L, 92179);
      }
      
      public final int describeContents()
      {
        GMTrace.i(15170495578112L, 113029);
        GMTrace.o(15170495578112L, 113029);
        return 0;
      }
      
      public final void writeToParcel(Parcel paramParcel, int paramInt)
      {
        GMTrace.i(15170629795840L, 113030);
        paramParcel.writeInt(ordinal());
        GMTrace.o(15170629795840L, 113030);
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\webview\wepkg\downloader\WePkgDownloader.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */