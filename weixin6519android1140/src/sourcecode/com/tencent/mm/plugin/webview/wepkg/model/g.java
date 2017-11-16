package com.tencent.mm.plugin.webview.wepkg.model;

import android.os.Bundle;
import android.os.Message;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.webview.wepkg.ipc.WepkgMainProcessService;
import com.tencent.mm.plugin.webview.wepkg.ipc.WepkgProcessPreloadService;
import com.tencent.mm.plugin.webview.wepkg.utils.b;
import com.tencent.mm.plugin.webview.wepkg.utils.b.a;
import com.tencent.mm.plugin.webview.wepkg.utils.d;
import com.tencent.mm.protocal.c.brk;
import com.tencent.mm.protocal.c.uh;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

public final class g
{
  public static f MT(String paramString)
  {
    for (;;)
    {
      String str1;
      Object localObject2;
      long l;
      Object localObject1;
      try
      {
        GMTrace.i(15174522109952L, 113059);
        str1 = d.Nf(paramString);
        localObject2 = d.Ng(paramString);
        l = System.currentTimeMillis();
        if ((bg.nm(str1)) || (bg.nm((String)localObject2)))
        {
          w.e("MicroMsg.Wepkg.WepkgManager", "pkgId = %s, domain = %s", new Object[] { str1, localObject2 });
          paramString = null;
          GMTrace.o(15174522109952L, 113059);
          return paramString;
        }
        localObject1 = b.rZo.Nd(str1);
        if ((localObject1 != null) && (((f)localObject1).rYm != null) && (((String)localObject2).equalsIgnoreCase(((f)localObject1).rYm.eYR)))
        {
          w.i("MicroMsg.Wepkg.WepkgManager", "memory has pkgid:%s record, version:%s", new Object[] { ((f)localObject1).rYm.rYG, ((f)localObject1).rYm.version });
          GMTrace.o(15174522109952L, 113059);
          paramString = (String)localObject1;
          continue;
        }
        localWepkgVersion = h.MZ(str1);
      }
      finally {}
      WepkgVersion localWepkgVersion;
      if (localWepkgVersion == null)
      {
        w.i("MicroMsg.Wepkg.WepkgManager", "DB dont have valid record, pkgid:%s, domain:%s, version:%s:", new Object[] { str1, "", "" });
        com.tencent.mm.plugin.webview.wepkg.utils.a.b("EnterWeb", paramString, str1, null, 0L, 0L, com.tencent.mm.plugin.webview.wepkg.utils.a.yu(14));
        paramString = null;
        GMTrace.o(15174522109952L, 113059);
      }
      else if (!((String)localObject2).equalsIgnoreCase(localWepkgVersion.eYR))
      {
        w.i("MicroMsg.Wepkg.WepkgManager", "the domain not match, pkgid:%s, version:%s, UrlDomain[%s] != DBDomain[%s]", new Object[] { str1, localWepkgVersion.version, localObject2, localWepkgVersion.eYR });
        com.tencent.mm.plugin.webview.wepkg.utils.a.b("EnterWeb", paramString, str1, null, 0L, 0L, com.tencent.mm.plugin.webview.wepkg.utils.a.yu(13));
        paramString = null;
        GMTrace.o(15174522109952L, 113059);
      }
      else if (bg.nm(localWepkgVersion.version))
      {
        w.i("MicroMsg.Wepkg.WepkgManager", "this pkgid(%s) is disable form server", new Object[] { str1 });
        com.tencent.mm.plugin.webview.wepkg.utils.a.b("EnterWeb", paramString, str1, null, 0L, 0L, com.tencent.mm.plugin.webview.wepkg.utils.a.yu(15));
        paramString = null;
        GMTrace.o(15174522109952L, 113059);
      }
      else if ((!localWepkgVersion.rZc) || ((!localWepkgVersion.rZd) && (localWepkgVersion.rZe)))
      {
        w.i("MicroMsg.Wepkg.WepkgManager", "local cache disable, pkgid:%s, version:%s, bigPackageReady:%s, preloadFilesReady:%s, preloadFilesAtomic:%s", new Object[] { localWepkgVersion.rYG, localWepkgVersion.version, Boolean.valueOf(localWepkgVersion.rZc), Boolean.valueOf(localWepkgVersion.rZd), Boolean.valueOf(localWepkgVersion.rZe) });
        com.tencent.mm.plugin.webview.wepkg.utils.a.b("EnterWeb", paramString, str1, localWepkgVersion.version, 0L, 0L, com.tencent.mm.plugin.webview.wepkg.utils.a.yu(16));
        paramString = null;
        GMTrace.o(15174522109952L, 113059);
      }
      else
      {
        localObject1 = localWepkgVersion.version;
        String str2 = localWepkgVersion.hKI;
        localObject2 = localWepkgVersion.eDW;
        int i = localWepkgVersion.rZa;
        if ((bg.nm(str1)) || (bg.nm(str2)) || (bg.nm((String)localObject2)))
        {
          w.i("MicroMsg.Wepkg.WepkgManager", "pkgid or pkgPath or md5 is null, pkg invalid");
          localObject1 = null;
        }
        for (;;)
        {
          if ((localObject1 != null) || (bg.nm(localWepkgVersion.hKI))) {
            break label885;
          }
          com.tencent.mm.plugin.webview.wepkg.utils.a.b("EnterWeb", paramString, str1, localWepkgVersion.version, 0L, 0L, com.tencent.mm.plugin.webview.wepkg.utils.a.yu(17));
          paramString = null;
          GMTrace.o(15174522109952L, 113059);
          break;
          File localFile = new File(str2);
          if (!localFile.exists())
          {
            w.i("MicroMsg.Wepkg.WepkgManager", "readCacheWepkg, pkgPath:%s, file dont exist", new Object[] { str2 });
            MX(str1);
            com.tencent.mm.plugin.webview.wepkg.utils.a.b("PkgModified", null, str1, (String)localObject1, 1L, 0L, null);
            localObject1 = null;
          }
          else if (localFile.length() != i)
          {
            w.i("MicroMsg.Wepkg.WepkgManager", "readCacheWepkg, [server_pkgSize:%d] != [local_pkgSize:%d]", new Object[] { Integer.valueOf(i), Long.valueOf(localFile.length()) });
            localFile.delete();
            MX(str1);
            com.tencent.mm.plugin.webview.wepkg.utils.a.b("PkgModified", null, str1, (String)localObject1, 2L, 0L, null);
            localObject1 = null;
          }
          else
          {
            if (localFile.length() <= 5242880L)
            {
              str2 = com.tencent.mm.a.g.h(localFile);
              if (!((String)localObject2).equalsIgnoreCase(str2))
              {
                w.i("MicroMsg.Wepkg.WepkgManager", "readCacheBigPackage, [server_md5:%s] != [local_md5:%s]", new Object[] { localObject2, str2 });
                localFile.delete();
                MX(str1);
                com.tencent.mm.plugin.webview.wepkg.utils.a.b("PkgModified", null, str1, (String)localObject1, 3L, 0L, null);
                localObject1 = null;
              }
            }
            else
            {
              w.i("MicroMsg.Wepkg.WepkgManager", "readCacheBigPackage fileLength(%d) > checkSize(%d). dont check md5", new Object[] { Long.valueOf(localFile.length()), Long.valueOf(5242880L) });
            }
            localObject1 = new e(localFile);
            if ((!((e)localObject1).hJn) || (((e)localObject1).rYj == null))
            {
              MU(str1);
              localObject1 = null;
            }
          }
        }
        label885:
        localObject2 = aK(str1, localWepkgVersion.rZe);
        if (localObject2 == null)
        {
          com.tencent.mm.plugin.webview.wepkg.utils.a.b("EnterWeb", paramString, str1, localWepkgVersion.version, 0L, 0L, com.tencent.mm.plugin.webview.wepkg.utils.a.yu(18));
          paramString = null;
          GMTrace.o(15174522109952L, 113059);
        }
        else
        {
          paramString = new f(localWepkgVersion, (e)localObject1, (Map)localObject2);
          b.rZo.rZq.put(str1, paramString);
          w.i("MicroMsg.Wepkg.WepkgManager", "loadWepkg time:%s", new Object[] { Long.valueOf(System.currentTimeMillis() - l) });
          GMTrace.o(15174522109952L, 113059);
        }
      }
    }
  }
  
  public static void MU(String paramString)
  {
    GMTrace.i(15174656327680L, 113060);
    w.i("MicroMsg.Wepkg.WepkgManager", "clear all wepkg info");
    WepkgCrossProcessTask localWepkgCrossProcessTask = new WepkgCrossProcessTask();
    localWepkgCrossProcessTask.nJ = 2001;
    localWepkgCrossProcessTask.rYm.rYG = paramString;
    if (ab.bPY())
    {
      d.xB().A(new h.2(localWepkgCrossProcessTask, null));
      GMTrace.o(15174656327680L, 113060);
      return;
    }
    localWepkgCrossProcessTask.hYr = new h.3(null, localWepkgCrossProcessTask);
    localWepkgCrossProcessTask.VM();
    WepkgMainProcessService.a(localWepkgCrossProcessTask);
    GMTrace.o(15174656327680L, 113060);
  }
  
  public static void MV(String paramString)
  {
    GMTrace.i(15174790545408L, 113061);
    c local1 = new c()
    {
      public final void m(final Message paramAnonymousMessage)
      {
        GMTrace.i(15193446809600L, 113200);
        paramAnonymousMessage = paramAnonymousMessage.getData().getString("used_wepkg_version");
        d.xB().A(new Runnable()
        {
          public final void run()
          {
            int i = 0;
            GMTrace.i(15192104632320L, 113190);
            Object localObject1 = d.Ne(g.1.this.rXW);
            String str = "";
            Object localObject2 = h.MY(g.1.this.rXW);
            if (localObject2 != null) {
              str = ((WepkgVersion)localObject2).version;
            }
            w.i("MicroMsg.Wepkg.WepkgManager", "clear all local wepkg, pkgid:%s, currVersion:%s, usedVersion:%s", new Object[] { g.1.this.rXW, str, paramAnonymousMessage });
            try
            {
              if ((bg.nm(paramAnonymousMessage)) && (bg.nm(str)))
              {
                g.MW((String)localObject1);
                GMTrace.o(15192104632320L, 113190);
                return;
              }
              localObject2 = new File((String)localObject1);
              if (((File)localObject2).exists())
              {
                boolean bool = ((File)localObject2).isFile();
                if (!bool) {}
              }
              else
              {
                GMTrace.o(15192104632320L, 113190);
                return;
              }
              localObject1 = ((File)localObject2).listFiles();
              if ((localObject1 == null) || (localObject1.length == 0))
              {
                ((File)localObject2).delete();
                GMTrace.o(15192104632320L, 113190);
                return;
              }
              int j = localObject1.length;
              while (i < j)
              {
                localObject2 = localObject1[i];
                if (((File)localObject2).isFile()) {
                  ((File)localObject2).delete();
                }
                if ((((File)localObject2).isDirectory()) && (!((File)localObject2).getName().equalsIgnoreCase(paramAnonymousMessage)) && (!((File)localObject2).getName().equalsIgnoreCase(str)))
                {
                  w.i("MicroMsg.Wepkg.WepkgManager", "delete local path:%s", new Object[] { ((File)localObject2).getAbsolutePath() });
                  g.MW(((File)localObject2).getAbsolutePath());
                }
                i += 1;
              }
              GMTrace.o(15192104632320L, 113190);
              return;
            }
            catch (Exception localException)
            {
              w.i("MicroMsg.Wepkg.WepkgManager", "clearAllLocalWepkg err:" + localException.getMessage());
              GMTrace.o(15192104632320L, 113190);
            }
          }
        });
        GMTrace.o(15193446809600L, 113200);
      }
    };
    Bundle localBundle = new Bundle(1);
    localBundle.putInt("call_cmd_type", 1);
    localBundle.putString("call_pkg_id", paramString);
    WepkgProcessPreloadService.a(local1, localBundle);
    GMTrace.o(15174790545408L, 113061);
  }
  
  public static boolean MW(String paramString)
  {
    GMTrace.i(15175058980864L, 113063);
    try
    {
      paramString = new File(paramString);
      Object localObject = paramString.getName() + "_temp";
      localObject = new File(paramString.getParent(), (String)localObject);
      if (paramString.renameTo((File)localObject))
      {
        com.tencent.mm.a.e.f((File)localObject);
        GMTrace.o(15175058980864L, 113063);
        return true;
      }
    }
    catch (Exception paramString)
    {
      w.i("MicroMsg.Wepkg.WepkgManager", "safeDeleteDir err:" + paramString.getMessage());
      GMTrace.o(15175058980864L, 113063);
    }
    return false;
  }
  
  private static void MX(String paramString)
  {
    GMTrace.i(15175193198592L, 113064);
    if (bg.nm(paramString))
    {
      GMTrace.o(15175193198592L, 113064);
      return;
    }
    h.a(paramString, "", false, new a()
    {
      public final void a(BaseWepkgProcessTask paramAnonymousBaseWepkgProcessTask)
      {
        GMTrace.i(15186333270016L, 113147);
        GMTrace.o(15186333270016L, 113147);
      }
    });
    GMTrace.o(15175193198592L, 113064);
  }
  
  public static void a(final a parama)
  {
    GMTrace.i(16888750931968L, 125831);
    final String str = b.hLB;
    final File localFile = new File(str);
    if ((!localFile.exists()) || (!localFile.isDirectory())) {
      parama.A(null);
    }
    WepkgCrossProcessTask localWepkgCrossProcessTask = new WepkgCrossProcessTask();
    localWepkgCrossProcessTask.nJ = 1001;
    localWepkgCrossProcessTask.hYr = new Runnable()
    {
      public final void run()
      {
        GMTrace.i(16598840639488L, 123671);
        if (this.rYz.eAO) {
          d.xB().A(new Runnable()
          {
            public final void run()
            {
              GMTrace.i(16598572204032L, 123669);
              JSONArray localJSONArray;
              for (;;)
              {
                JSONObject localJSONObject2;
                Object localObject4;
                try
                {
                  JSONObject localJSONObject1 = new JSONObject();
                  localJSONObject1.put("rootDir", g.3.this.rYA);
                  Object localObject1 = new HashMap();
                  g.a(g.3.this.rYB, (Map)localObject1);
                  localJSONArray = new JSONArray();
                  localObject1 = ((Map)localObject1).entrySet().iterator();
                  if (!((Iterator)localObject1).hasNext()) {
                    break;
                  }
                  localObject3 = (Map.Entry)((Iterator)localObject1).next();
                  if (((List)((Map.Entry)localObject3).getValue()).size() == 0) {
                    continue;
                  }
                  localJSONObject2 = new JSONObject();
                  localJSONObject2.put("pkgId", ((Map.Entry)localObject3).getKey());
                  localObject2 = h.MY((String)((Map.Entry)localObject3).getKey());
                  if (localObject2 != null) {
                    localJSONObject2.put("controlInfo", ((WepkgVersion)localObject2).bGo());
                  }
                  localObject4 = h.Nb((String)((Map.Entry)localObject3).getKey());
                  if (!bg.cc((List)localObject4))
                  {
                    localObject2 = new JSONArray();
                    localObject4 = ((List)localObject4).iterator();
                    if (((Iterator)localObject4).hasNext())
                    {
                      ((JSONArray)localObject2).put(((WepkgPreloadFile)((Iterator)localObject4).next()).bGo());
                      continue;
                    }
                    localJSONObject2.put("preloadFilesInfo", localObject2);
                  }
                }
                catch (Exception localException)
                {
                  if (g.3.this.rYC != null) {
                    g.3.this.rYC.A(null);
                  }
                  GMTrace.o(16598572204032L, 123669);
                  return;
                }
                Object localObject2 = new JSONArray();
                Object localObject3 = ((List)((Map.Entry)localObject3).getValue()).iterator();
                while (((Iterator)localObject3).hasNext())
                {
                  Object localObject5 = (g.b)((Iterator)localObject3).next();
                  localObject4 = new JSONObject();
                  ((JSONObject)localObject4).put("version", ((g.b)localObject5).version);
                  if (!bg.nm(((g.b)localObject5).pOr))
                  {
                    localObject6 = new File(((g.b)localObject5).pOr);
                    if ((!((File)localObject6).exists()) || (!((File)localObject6).isFile())) {
                      continue;
                    }
                    ((JSONObject)localObject4).put("md5", com.tencent.mm.a.g.h((File)localObject6));
                    ((JSONObject)localObject4).put("size", ((File)localObject6).length());
                    Object localObject7 = new e((File)localObject6).rYj;
                    if (localObject7 != null)
                    {
                      ((JSONObject)localObject4).put("charset", ((brk)localObject7).vbh);
                      ((JSONObject)localObject4).put("desc", ((brk)localObject7).lPj);
                      if (((brk)localObject7).vbg != null)
                      {
                        localObject6 = new JSONArray();
                        localObject7 = ((brk)localObject7).vbg.iterator();
                        while (((Iterator)localObject7).hasNext())
                        {
                          uh localuh = (uh)((Iterator)localObject7).next();
                          JSONObject localJSONObject3 = new JSONObject();
                          localJSONObject3.put("rid", localuh.umC);
                          localJSONObject3.put("offset", localuh.umD);
                          localJSONObject3.put("size", localuh.jhV);
                          localJSONObject3.put("mimeType", localuh.umE);
                          ((JSONArray)localObject6).put(localJSONObject3);
                        }
                        ((JSONObject)localObject4).put("resList", localObject6);
                      }
                    }
                  }
                  Object localObject6 = ((g.b)localObject5).rYF;
                  if (!bg.cc((List)localObject6))
                  {
                    localObject5 = new JSONArray();
                    localObject6 = ((List)localObject6).iterator();
                    while (((Iterator)localObject6).hasNext()) {
                      ((JSONArray)localObject5).put((String)((Iterator)localObject6).next());
                    }
                    ((JSONObject)localObject4).put("preloadFiles", localObject5);
                  }
                  ((JSONArray)localObject2).put(localObject4);
                }
                localJSONObject2.put("versionList", localObject2);
                localJSONArray.put(localJSONObject2);
              }
              localException.put("pkgList", localJSONArray);
              if (g.3.this.rYC != null) {
                g.3.this.rYC.A(localException);
              }
              GMTrace.o(16598572204032L, 123669);
            }
          });
        }
        this.rYz.VN();
        GMTrace.o(16598840639488L, 123671);
      }
    };
    localWepkgCrossProcessTask.VM();
    WepkgMainProcessService.a(localWepkgCrossProcessTask);
    GMTrace.o(16888750931968L, 125831);
  }
  
  public static boolean a(File paramFile, Map<String, List<b>> paramMap)
  {
    GMTrace.i(16083444563968L, 119831);
    if ((paramFile == null) || (!paramFile.isDirectory()))
    {
      GMTrace.o(16083444563968L, 119831);
      return false;
    }
    paramFile = paramFile.listFiles();
    if ((paramFile == null) || (paramFile.length == 0))
    {
      GMTrace.o(16083444563968L, 119831);
      return false;
    }
    int i = 0;
    while (i < paramFile.length)
    {
      Object localObject1 = paramFile[i];
      File[] arrayOfFile = ((File)localObject1).listFiles();
      if ((arrayOfFile != null) && (arrayOfFile.length != 0))
      {
        ArrayList localArrayList = new ArrayList();
        int j = 0;
        if (j < arrayOfFile.length)
        {
          Object localObject2 = arrayOfFile[j];
          b localb = new b();
          localb.version = ((File)localObject2).getName();
          Object localObject3 = ((File)localObject2).getAbsolutePath() + File.separator + "package";
          if (com.tencent.mm.a.e.aZ((String)localObject3)) {
            localb.pOr = ((String)localObject3);
          }
          localObject2 = new File(((File)localObject2).getAbsolutePath() + File.separator + "preload_files");
          if (!((File)localObject2).isDirectory()) {
            localArrayList.add(localb);
          }
          for (;;)
          {
            j += 1;
            break;
            localObject2 = ((File)localObject2).listFiles();
            if ((localObject2 == null) || (localObject2.length == 0))
            {
              localArrayList.add(localb);
            }
            else
            {
              localObject3 = new ArrayList();
              int m = localObject2.length;
              int k = 0;
              while (k < m)
              {
                ((List)localObject3).add(localObject2[k].getName());
                k += 1;
              }
              localb.rYF = ((List)localObject3);
              localArrayList.add(localb);
            }
          }
        }
        paramMap.put(((File)localObject1).getName(), localArrayList);
      }
      i += 1;
    }
    GMTrace.o(16083444563968L, 119831);
    return true;
  }
  
  private static Map<String, WepkgPreloadFile> aK(String paramString, boolean paramBoolean)
  {
    GMTrace.i(15174924763136L, 113062);
    if (bg.nm(paramString))
    {
      GMTrace.o(15174924763136L, 113062);
      return null;
    }
    HashMap localHashMap = new HashMap();
    Object localObject = h.Nb(paramString);
    if (bg.cc((List)localObject))
    {
      GMTrace.o(15174924763136L, 113062);
      return localHashMap;
    }
    localObject = ((List)localObject).iterator();
    int i = 0;
    while (((Iterator)localObject).hasNext())
    {
      WepkgPreloadFile localWepkgPreloadFile = (WepkgPreloadFile)((Iterator)localObject).next();
      if (localWepkgPreloadFile != null) {
        if (bg.nm(localWepkgPreloadFile.filePath))
        {
          w.i("MicroMsg.Wepkg.WepkgManager", "readCachePreloadFiles, pkgPath is null, isAtomic:%s", new Object[] { Boolean.valueOf(paramBoolean) });
          if (paramBoolean)
          {
            ev(localWepkgPreloadFile.rYG, localWepkgPreloadFile.rYr);
            i = 1;
          }
          else
          {
            h.a(paramString, localWepkgPreloadFile.rYr, "", null);
          }
        }
        else
        {
          File localFile = new File(localWepkgPreloadFile.filePath);
          if (!localFile.exists())
          {
            w.i("MicroMsg.Wepkg.WepkgManager", "readCachePreloadFiles, pkgPath:%s, file dont exist, isAtomic:%s", new Object[] { localWepkgPreloadFile.filePath, Boolean.valueOf(paramBoolean) });
            if (paramBoolean)
            {
              ev(localWepkgPreloadFile.rYG, localWepkgPreloadFile.rYr);
              i = 1;
            }
            else
            {
              h.a(paramString, localWepkgPreloadFile.rYr, "", null);
            }
          }
          else if (localFile.length() != localWepkgPreloadFile.size)
          {
            w.i("MicroMsg.Wepkg.WepkgManager", "readCachePreloadFiles, [server_pkgSize:%d] != [local_pkgSize:%d], isAtomic:%s", new Object[] { Integer.valueOf(localWepkgPreloadFile.size), Long.valueOf(localFile.length()), Boolean.valueOf(paramBoolean) });
            if (paramBoolean)
            {
              ev(localWepkgPreloadFile.rYG, localWepkgPreloadFile.rYr);
              localFile.delete();
              i = 1;
            }
            else
            {
              h.a(paramString, localWepkgPreloadFile.rYr, "", null);
            }
          }
          else
          {
            localHashMap.put(localWepkgPreloadFile.rYr, localWepkgPreloadFile);
          }
        }
      }
    }
    if (i != 0)
    {
      GMTrace.o(15174924763136L, 113062);
      return null;
    }
    GMTrace.o(15174924763136L, 113062);
    return localHashMap;
  }
  
  private static void ev(String paramString1, String paramString2)
  {
    GMTrace.i(15175327416320L, 113065);
    if ((bg.nm(paramString1)) || (bg.nm(paramString2)))
    {
      GMTrace.o(15175327416320L, 113065);
      return;
    }
    h.a(paramString1, paramString2, "", new a()
    {
      public final void a(BaseWepkgProcessTask paramAnonymousBaseWepkgProcessTask)
      {
        GMTrace.i(15172106190848L, 113041);
        GMTrace.o(15172106190848L, 113041);
      }
    }
    {
      public final void a(BaseWepkgProcessTask paramAnonymousBaseWepkgProcessTask)
      {
        GMTrace.i(16597901115392L, 123664);
        paramAnonymousBaseWepkgProcessTask = this.rXW;
        a locala = this.rYE;
        WepkgCrossProcessTask localWepkgCrossProcessTask = new WepkgCrossProcessTask();
        localWepkgCrossProcessTask.nJ = 3006;
        localWepkgCrossProcessTask.rYm.rYG = paramAnonymousBaseWepkgProcessTask;
        localWepkgCrossProcessTask.rYm.rZd = false;
        if (ab.bPY())
        {
          d.xB().A(new h.10(localWepkgCrossProcessTask, locala));
          GMTrace.o(16597901115392L, 123664);
          return;
        }
        localWepkgCrossProcessTask.hYr = new h.11(locala, localWepkgCrossProcessTask);
        localWepkgCrossProcessTask.VM();
        WepkgMainProcessService.a(localWepkgCrossProcessTask);
        GMTrace.o(16597901115392L, 123664);
      }
    });
    GMTrace.o(15175327416320L, 113065);
  }
  
  public static abstract interface a
  {
    public abstract void A(JSONObject paramJSONObject);
  }
  
  private static final class b
  {
    String pOr;
    List<String> rYF;
    String version;
    
    public b()
    {
      GMTrace.i(16002242838528L, 119226);
      GMTrace.o(16002242838528L, 119226);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\webview\wepkg\model\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */