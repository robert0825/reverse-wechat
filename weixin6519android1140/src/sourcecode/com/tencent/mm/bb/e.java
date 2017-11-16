package com.tencent.mm.bb;

import android.os.Looper;
import android.os.MessageQueue;
import android.os.MessageQueue.IdleHandler;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.k;
import com.tencent.mm.ad.n;
import com.tencent.mm.e.b.g;
import com.tencent.mm.kernel.h;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.am;
import com.tencent.mm.sdk.platformtools.ar;
import com.tencent.mm.sdk.platformtools.ar.a;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import java.io.File;

public final class e
{
  private static e gWl;
  byte[] fWT;
  public ar gEP;
  public String gWm;
  public com.tencent.mm.ad.e gWn;
  
  static
  {
    GMTrace.i(3503888007168L, 26106);
    gWl = null;
    GMTrace.o(3503888007168L, 26106);
  }
  
  public e()
  {
    GMTrace.i(3502545829888L, 26096);
    this.gEP = new ar(1, "speex_worker");
    this.fWT = new byte[0];
    this.gWn = new com.tencent.mm.ad.e()
    {
      public final void a(int paramAnonymousInt1, int paramAnonymousInt2, String paramAnonymousString, k paramAnonymousk)
      {
        GMTrace.i(3502008958976L, 26092);
        if (e.this.gWm == null)
        {
          GMTrace.o(3502008958976L, 26092);
          return;
        }
        w.d("MicroMsg.SpeexUploadCore", "onSceneEnd " + ((a)paramAnonymousk).filename + " filepath " + e.this.gWm + " errCode " + paramAnonymousInt2);
        if (((a)paramAnonymousk).filename.equals(e.this.gWm))
        {
          h.wS().b(240, e.this.gWn);
          if (paramAnonymousInt2 == 0)
          {
            d.LX();
            d.LZ();
          }
          paramAnonymousString = new File(e.this.gWm);
          try
          {
            boolean bool = paramAnonymousString.delete();
            w.d("MicroMsg.SpeexUploadCore", "delete " + e.this.gWm + " delete " + bool + " errCode " + paramAnonymousInt2);
            e.Me().start();
            e.this.gWm = null;
            GMTrace.o(3502008958976L, 26092);
            return;
          }
          catch (Exception paramAnonymousString)
          {
            w.e("MicroMsg.SpeexUploadCore", "exception:%s", new Object[] { bg.f(paramAnonymousString) });
            e.Me().start();
            e.this.gWm = null;
            GMTrace.o(3502008958976L, 26092);
            return;
          }
          finally
          {
            e.Me().start();
            e.this.gWm = null;
          }
        }
        GMTrace.o(3502008958976L, 26092);
      }
    };
    GMTrace.o(3502545829888L, 26096);
  }
  
  public static e Me()
  {
    GMTrace.i(3502680047616L, 26097);
    if (gWl == null) {
      gWl = new e();
    }
    e locale = gWl;
    GMTrace.o(3502680047616L, 26097);
    return locale;
  }
  
  static File aZ(int paramInt1, int paramInt2)
  {
    GMTrace.i(3503082700800L, 26100);
    Object localObject1 = new File(b.LW());
    if ((!((File)localObject1).exists()) || (!((File)localObject1).isDirectory()))
    {
      GMTrace.o(3503082700800L, 26100);
      return null;
    }
    File[] arrayOfFile = ((File)localObject1).listFiles();
    int i = 0;
    localObject1 = null;
    Object localObject2 = localObject1;
    if (arrayOfFile != null)
    {
      localObject2 = localObject1;
      if (i < arrayOfFile.length)
      {
        localObject2 = arrayOfFile[i];
        localObject1 = localObject2;
        long l;
        if (localObject2 != null)
        {
          localObject1 = localObject2;
          if (((File)localObject2).isFile())
          {
            w.d("MicroMsg.SpeexUploadCore", "file " + ((File)localObject2).getPath());
            localObject1 = ((File)localObject2).getPath();
            l = ((File)localObject2).length();
            if (((File)localObject2).getName().endsWith(".spx")) {
              break label168;
            }
          }
        }
        for (localObject1 = null;; localObject1 = null)
        {
          i += 1;
          break;
          label168:
          if ((l >= paramInt1) && (l <= paramInt2)) {
            break label224;
          }
          w.d("MicroMsg.SpeexUploadCore", "unfit delete %s, minsize: %d, maxSize: %d", new Object[] { localObject1, Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
          com.tencent.mm.loader.stub.b.deleteFile((String)localObject1);
        }
      }
    }
    label224:
    GMTrace.o(3503082700800L, 26100);
    return (File)localObject2;
  }
  
  public final void b(ar.a parama)
  {
    GMTrace.i(3502814265344L, 26098);
    w.d("MicroMsg.SpeexUploadCore", "pushWork");
    this.gEP.c(parama);
    GMTrace.o(3502814265344L, 26098);
  }
  
  public final void start()
  {
    GMTrace.i(3502948483072L, 26099);
    if (!am.isWifi(ab.getContext()))
    {
      GMTrace.o(3502948483072L, 26099);
      return;
    }
    new ae(Looper.getMainLooper()).postDelayed(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(3497848209408L, 26061);
        Looper.myQueue().addIdleHandler(new MessageQueue.IdleHandler()
        {
          public final boolean queueIdle()
          {
            GMTrace.i(3497311338496L, 26057);
            e.this.b(new ar.a()
            {
              public final boolean Dj()
              {
                GMTrace.i(3502277394432L, 26094);
                GMTrace.o(3502277394432L, 26094);
                return true;
              }
              
              public final boolean Dk()
              {
                GMTrace.i(3502411612160L, 26095);
                e locale = e.this;
                w.d("MicroMsg.SpeexUploadCore", "uploadOneFile");
                Object localObject2;
                int i;
                synchronized (locale.fWT)
                {
                  if (locale.gWm != null)
                  {
                    w.d("MicroMsg.SpeexUploadCore", "uploading...");
                    GMTrace.o(3502411612160L, 26095);
                    return false;
                  }
                  localObject2 = d.a.Md();
                  if (localObject2 != null)
                  {
                    if (1 == g.k("EnableSpeexVoiceUpload", 0)) {
                      break label600;
                    }
                    if (((d.a)localObject2).Mb() == 0)
                    {
                      i = 0;
                      break label588;
                    }
                  }
                  else
                  {
                    w.d("MicroMsg.SpeexUploadCore", "SpeexConfig not allow");
                  }
                }
                boolean bool;
                if (!am.isWifi(ab.getContext()))
                {
                  i = 0;
                }
                else
                {
                  h.xz();
                  i = bg.a((Integer)h.xy().xh().get(12290, null), 0);
                  if (((d.a)localObject2).fja == 0) {}
                  for (bool = true;; bool = true)
                  {
                    label165:
                    w.d("upload", "fitSex " + ((d.a)localObject2).fja + " " + bool + " " + ((d.a)localObject2).fja);
                    if (bool) {
                      break;
                    }
                    i = 0;
                    break label588;
                    if (((d.a)localObject2).fja != i) {
                      break label595;
                    }
                  }
                  if (((d.a)localObject2).Ma()) {
                    break label600;
                  }
                  i = 0;
                }
                label443:
                label553:
                label588:
                label595:
                label600:
                label603:
                for (;;)
                {
                  localObject2 = e.aZ(((d.a)localObject2).gWe, ((d.a)localObject2).gWf);
                  if (localObject2 == null)
                  {
                    w.d("MicroMsg.SpeexUploadCore", "no target to upload");
                    break;
                  }
                  Object localObject3 = ((File)localObject2).getPath();
                  try
                  {
                    localObject3 = new File(((String)localObject3).replace(".spx", ".uploading"));
                    if (!((File)localObject2).renameTo((File)localObject3)) {
                      break label553;
                    }
                    ((e)localObject1).gWm = ((File)localObject3).getPath();
                    localObject2 = ((File)localObject3).getName();
                    w.d("MicroMsg.SpeexUploadCore", "upload file " + ((e)localObject1).gWm);
                    localObject3 = new d.b();
                    arrayOfString = ((String)localObject2).substring(0, ((String)localObject2).indexOf('.')).split("_");
                    i = arrayOfString.length;
                    if (i != 5) {}
                  }
                  catch (Exception localException)
                  {
                    for (;;)
                    {
                      String[] arrayOfString;
                      a locala;
                      w.e("MicroMsg.SpeexUploadCore", "exception:%s", new Object[] { bg.f(localException) });
                      continue;
                      w.d("MicroMsg.SpeexUploadCore", "delete " + ((File)localObject2).getPath());
                      ((File)localObject2).delete();
                    }
                  }
                  try
                  {
                    ((d.b)localObject3).gTl = arrayOfString[0];
                    ((d.b)localObject3).sampleRate = bg.getInt(arrayOfString[1], 0);
                    ((d.b)localObject3).gVQ = bg.getInt(arrayOfString[2], 0);
                    ((d.b)localObject3).gVR = bg.getInt(arrayOfString[3], 0);
                    h.wS().a(240, ((e)localObject1).gWn);
                    locala = new a(((e)localObject1).gWm, d.lB((String)localObject2), ((d.b)localObject3).sampleRate, ((d.b)localObject3).gVQ, ((d.b)localObject3).gVR);
                    h.wS().a(locala, 0);
                  }
                  catch (NumberFormatException localNumberFormatException)
                  {
                    w.e("upload", "wrong format", new Object[] { localNumberFormatException });
                    break label443;
                  }
                  for (;;)
                  {
                    if (i != 0) {
                      break label603;
                    }
                    break;
                    bool = false;
                    break label165;
                    i = 1;
                  }
                }
              }
            });
            GMTrace.o(3497311338496L, 26057);
            return false;
          }
        });
        GMTrace.o(3497848209408L, 26061);
      }
    }, 100L);
    GMTrace.o(3502948483072L, 26099);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\bb\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */