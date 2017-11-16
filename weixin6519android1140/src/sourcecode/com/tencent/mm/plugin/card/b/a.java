package com.tencent.mm.plugin.card.b;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.a.e;
import com.tencent.mm.modelcdntran.b;
import com.tencent.mm.modelcdntran.c;
import com.tencent.mm.modelcdntran.d;
import com.tencent.mm.modelcdntran.g;
import com.tencent.mm.modelcdntran.i;
import com.tencent.mm.modelcdntran.i.a;
import com.tencent.mm.modelcdntran.keep_ProgressInfo;
import com.tencent.mm.modelcdntran.keep_SceneResult;
import com.tencent.mm.plugin.card.model.m;
import com.tencent.mm.sdk.platformtools.aa;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

public final class a
{
  public static List<WeakReference<a>> jwK;
  
  static
  {
    GMTrace.i(5045110177792L, 37589);
    jwK = new ArrayList();
    GMTrace.o(5045110177792L, 37589);
  }
  
  public static void a(a parama)
  {
    GMTrace.i(5044573306880L, 37585);
    if (jwK == null) {
      jwK = new ArrayList();
    }
    if (parama == null)
    {
      w.e("MicroMsg.CDNDownloadHelpper", "ICDNDownloadCallback is null");
      GMTrace.o(5044573306880L, 37585);
      return;
    }
    w.i("MicroMsg.CDNDownloadHelpper", "register:%d", new Object[] { Integer.valueOf(parama.hashCode()) });
    jwK.add(new WeakReference(parama));
    GMTrace.o(5044573306880L, 37585);
  }
  
  public static void b(a parama)
  {
    GMTrace.i(5044707524608L, 37586);
    if ((jwK == null) || (parama == null))
    {
      GMTrace.o(5044707524608L, 37586);
      return;
    }
    w.i("MicroMsg.CDNDownloadHelpper", "unregister:%d", new Object[] { Integer.valueOf(parama.hashCode()) });
    int i = 0;
    while (i < jwK.size())
    {
      WeakReference localWeakReference = (WeakReference)jwK.get(i);
      if (localWeakReference != null)
      {
        a locala = (a)localWeakReference.get();
        if ((locala != null) && (locala.equals(parama)))
        {
          jwK.remove(localWeakReference);
          GMTrace.o(5044707524608L, 37586);
          return;
        }
      }
      i += 1;
    }
    GMTrace.o(5044707524608L, 37586);
  }
  
  public static void f(String paramString1, String paramString2, int paramInt1, int paramInt2)
  {
    int j = 0;
    int i = 0;
    GMTrace.i(5044841742336L, 37587);
    if ((paramString1 == null) || (paramString2 == null) || (paramInt1 == 0))
    {
      w.e("MicroMsg.CDNDownloadHelpper", "the params is wrongful");
      GMTrace.o(5044841742336L, 37587);
      return;
    }
    Object localObject = aa.RP(paramString1);
    File localFile = new File(m.jzx);
    if (!localFile.mkdirs()) {
      w.i("MicroMsg.CDNDownloadHelpper", "mkdirs failed.File is exist = " + localFile.exists());
    }
    if (paramInt2 == 2)
    {
      str = ".jpeg";
      if (!localFile.getAbsolutePath().endsWith("/")) {
        break label313;
      }
    }
    label313:
    for (final String str = localFile.getAbsolutePath() + (String)localObject + str;; str = localFile.getAbsolutePath() + File.separator + (String)localObject + str)
    {
      w.i("MicroMsg.CDNDownloadHelpper", "get file path from capture file name : %s == %s", new Object[] { localObject, str });
      w.i("MicroMsg.CDNDownloadHelpper", "before downloadVideoFromCDN fieldId:%s, aseKey:%s, dataLength:%d, type:%d, filePath:%s", new Object[] { paramString1, paramString2, Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), str });
      w.i("MicroMsg.CDNDownloadHelpper", "read file length = " + e.aY(str));
      if ((!e.aZ(str)) || (e.aY(str) != paramInt1)) {
        break label361;
      }
      paramInt1 = i;
      while (paramInt1 < jwK.size())
      {
        paramString2 = (WeakReference)jwK.get(paramInt1);
        if (paramString2 != null)
        {
          paramString2 = (a)paramString2.get();
          if (paramString2 != null) {
            paramString2.bF(paramString1, str);
          }
        }
        paramInt1 += 1;
      }
      str = ".mp4";
      break;
    }
    GMTrace.o(5044841742336L, 37587);
    return;
    label361:
    w.i("MicroMsg.CDNDownloadHelpper", "filePath:%s is't exist, so download from CDN", new Object[] { str });
    localObject = new i();
    ((i)localObject).gAB = new i.a()
    {
      public final int a(String paramAnonymousString, int paramAnonymousInt, keep_ProgressInfo paramAnonymouskeep_ProgressInfo, keep_SceneResult paramAnonymouskeep_SceneResult, boolean paramAnonymousBoolean)
      {
        GMTrace.i(5056787120128L, 37676);
        if (paramAnonymousInt == 44531)
        {
          w.i("MicroMsg.CDNDownloadHelpper", "duplicate request, ignore this request, media id is %s", new Object[] { paramAnonymousString });
          GMTrace.o(5056787120128L, 37676);
          return 0;
        }
        if (paramAnonymousInt != 0)
        {
          w.e("MicroMsg.CDNDownloadHelpper", "start failed : %d, media id is :%s", new Object[] { Integer.valueOf(paramAnonymousInt), paramAnonymousString });
          paramAnonymousInt = 0;
          while (paramAnonymousInt < a.jwK.size())
          {
            paramAnonymousString = (WeakReference)a.jwK.get(paramAnonymousInt);
            if (paramAnonymousString != null)
            {
              paramAnonymousString = (a.a)paramAnonymousString.get();
              if (paramAnonymousString != null) {
                paramAnonymousString.fail(this.hbP);
              }
            }
            paramAnonymousInt += 1;
          }
          GMTrace.o(5056787120128L, 37676);
          return 0;
        }
        if (paramAnonymouskeep_ProgressInfo != null)
        {
          w.i("MicroMsg.CDNDownloadHelpper", "progressInfo : %s", new Object[] { paramAnonymouskeep_ProgressInfo.toString() });
          if (paramAnonymouskeep_ProgressInfo.field_toltalLength <= 0) {
            break label469;
          }
        }
        label466:
        label469:
        for (paramAnonymousInt = paramAnonymouskeep_ProgressInfo.field_finishedLength * 100 / paramAnonymouskeep_ProgressInfo.field_toltalLength;; paramAnonymousInt = 0)
        {
          if (paramAnonymousInt < 0) {
            paramAnonymousInt = 0;
          }
          for (;;)
          {
            int i = 0;
            for (;;)
            {
              if (i < a.jwK.size())
              {
                paramAnonymousString = (WeakReference)a.jwK.get(i);
                if (paramAnonymousString != null)
                {
                  paramAnonymousString = (a.a)paramAnonymousString.get();
                  if (paramAnonymousString != null) {
                    paramAnonymousString.aH(this.hbP, paramAnonymousInt);
                  }
                }
                i += 1;
                continue;
                if (paramAnonymousInt <= 100) {
                  break label466;
                }
                paramAnonymousInt = 100;
                break;
              }
            }
            GMTrace.o(5056787120128L, 37676);
            return 0;
            if (paramAnonymouskeep_SceneResult != null)
            {
              if (paramAnonymouskeep_SceneResult.field_retCode != 0)
              {
                w.e("MicroMsg.CDNDownloadHelpper", "cdntra clientid:%s , sceneResult.retCode:%d , sceneResult[%s]", new Object[] { paramAnonymousString, Integer.valueOf(paramAnonymouskeep_SceneResult.field_retCode), paramAnonymouskeep_SceneResult });
                paramAnonymousInt = 0;
                while (paramAnonymousInt < a.jwK.size())
                {
                  paramAnonymousString = (WeakReference)a.jwK.get(paramAnonymousInt);
                  if (paramAnonymousString != null)
                  {
                    paramAnonymousString = (a.a)paramAnonymousString.get();
                    if (paramAnonymousString != null) {
                      paramAnonymousString.fail(this.hbP);
                    }
                  }
                  paramAnonymousInt += 1;
                }
              }
              w.i("MicroMsg.CDNDownloadHelpper", "cdn trans suceess, sceneResult[%s]", new Object[] { paramAnonymouskeep_SceneResult });
              paramAnonymousInt = 0;
              while (paramAnonymousInt < a.jwK.size())
              {
                paramAnonymousString = (WeakReference)a.jwK.get(paramAnonymousInt);
                if (paramAnonymousString != null)
                {
                  paramAnonymousString = (a.a)paramAnonymousString.get();
                  if (paramAnonymousString != null) {
                    paramAnonymousString.bF(this.hbP, str);
                  }
                }
                paramAnonymousInt += 1;
              }
            }
            GMTrace.o(5056787120128L, 37676);
            return 0;
          }
        }
      }
      
      public final void a(String paramAnonymousString, ByteArrayOutputStream paramAnonymousByteArrayOutputStream)
      {
        GMTrace.i(5056921337856L, 37677);
        w.i("MicroMsg.CDNDownloadHelpper", "getCdnAuthInfo, mediaId = %s", new Object[] { paramAnonymousString });
        GMTrace.o(5056921337856L, 37677);
      }
      
      public final byte[] h(String paramAnonymousString, byte[] paramAnonymousArrayOfByte)
      {
        GMTrace.i(5057055555584L, 37678);
        w.i("MicroMsg.CDNDownloadHelpper", "decodePrepareResponse, mediaId = %s", new Object[] { paramAnonymousString });
        GMTrace.o(5057055555584L, 37678);
        return null;
      }
    };
    ((i)localObject).eYr = false;
    ((i)localObject).field_mediaId = d.a("cardgiftfile", bg.Pv(), paramString1, paramString1);
    ((i)localObject).field_fullpath = str;
    ((i)localObject).field_totalLen = paramInt1;
    ((i)localObject).field_fileType = b.gzg;
    ((i)localObject).field_fileId = paramString1;
    ((i)localObject).field_aesKey = paramString2;
    ((i)localObject).field_priority = b.gzd;
    ((i)localObject).field_needStorage = true;
    boolean bool = g.Gk().b((i)localObject, -1);
    w.i("MicroMsg.CDNDownloadHelpper", "add download cdn task : %b, fileId : %s", new Object[] { Boolean.valueOf(bool), ((i)localObject).field_fileId });
    if (!bool)
    {
      paramInt1 = j;
      while (paramInt1 < jwK.size())
      {
        paramString2 = (WeakReference)jwK.get(paramInt1);
        if (paramString2 != null)
        {
          paramString2 = (a)paramString2.get();
          if (paramString2 != null) {
            paramString2.fail(paramString1);
          }
        }
        paramInt1 += 1;
      }
      w.e("MicroMsg.CDNDownloadHelpper", "can't download from cdn!!!");
    }
    GMTrace.o(5044841742336L, 37587);
  }
  
  public static abstract interface a
  {
    public abstract void aH(String paramString, int paramInt);
    
    public abstract void bF(String paramString1, String paramString2);
    
    public abstract void fail(String paramString);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\card\b\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */