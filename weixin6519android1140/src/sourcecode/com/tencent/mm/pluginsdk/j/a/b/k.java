package com.tencent.mm.pluginsdk.j.a.b;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.pluginsdk.j.a.d.f;
import com.tencent.mm.pluginsdk.j.a.d.f.a;
import com.tencent.mm.pluginsdk.j.a.d.f.d;
import com.tencent.mm.pluginsdk.j.a.d.t;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.TimeUnit;

final class k
  extends f<a>
{
  private final f<a>.a tqL;
  
  k()
  {
    GMTrace.i(848658694144L, 6323);
    this.tqL = new f.a(this, 0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), new t());
    GMTrace.o(848658694144L, 6323);
  }
  
  final void a(a parama)
  {
    GMTrace.i(848792911872L, 6324);
    if (OM(parama.tpD))
    {
      w.i("MicroMsg.ResDownloader.CheckResUpdate.DecryptExecutor", "URLKey(%s) is already decrypting, skip repeated task", new Object[] { parama.tpD });
      GMTrace.o(848792911872L, 6324);
      return;
    }
    if (((parama.tpE) && (parama.eCu == parama.tpH) && (parama.tpH >= 0)) || ((!parama.tpE) && (parama.tpF))) {}
    for (int i = 1; i == 0; i = 0)
    {
      GMTrace.o(848792911872L, 6324);
      return;
    }
    w.i("MicroMsg.ResDownloader.CheckResUpdate.DecryptExecutor", "request#URLKey(%s) posted to decryptWorker", new Object[] { parama.tpD });
    super.b(parama);
    GMTrace.o(848792911872L, 6324);
  }
  
  protected final f<a>.a bKe()
  {
    GMTrace.i(848927129600L, 6325);
    f.a locala = this.tqL;
    GMTrace.o(848927129600L, 6325);
    return locala;
  }
  
  private static final class a
    extends f.d<a>
  {
    protected a(a parama)
    {
      super();
      GMTrace.i(844766380032L, 6294);
      GMTrace.o(844766380032L, 6294);
    }
    
    public final void run()
    {
      GMTrace.i(844900597760L, 6295);
      w.i("MicroMsg.ResDownloader.CheckResUpdate.DecryptTask", "%s: decryptTask, entered", new Object[] { ((a)ST()).tpD });
      Object localObject1 = (a)ST();
      int i = ((a)localObject1).eCs;
      int j = ((a)localObject1).eCt;
      int k = ((a)localObject1).eCu;
      label854:
      label873:
      label940:
      label950:
      label953:
      label956:
      for (;;)
      {
        try
        {
          localObject1 = (a)ST();
          localObject1 = new l(((a)localObject1).eCs, ((a)localObject1).eCt, ((a)localObject1).filePath, ((a)localObject1).tpE, ((a)localObject1).tpF, ((a)localObject1).tpG, ((a)localObject1).tpH, ((a)localObject1).tpK, ((a)localObject1).eCv, ((a)localObject1).tpI, ((a)localObject1).tpJ, ((a)localObject1).tpM, ((a)localObject1).tpL, ((a)localObject1).url, ((a)localObject1).tpN, ((a)localObject1).tpO, ((a)localObject1).eCu);
          if (((l)localObject1).tqm)
          {
            w.i("MicroMsg.ResDownloader.CheckResUpdate.FileDecryptPerformer", "%s: checkFileExists(), do fileDecompress", new Object[] { ((l)localObject1).tpD });
            ((l)localObject1).tqM = (((l)localObject1).filePath + ".decompressed");
            ((l)localObject1).state = 32;
            if (((l)localObject1).bKh() == null) {
              break label950;
            }
            ((l)localObject1).state = 16;
            w.i("MicroMsg.ResDownloader.CheckResUpdate.FileDecryptPerformer", "%s: checkFileExists(), file already valid", new Object[] { ((l)localObject1).tpD });
            break label950;
            w.i("MicroMsg.ResDownloader.CheckResUpdate.FileDecryptPerformer", "%s: verify(), file_state " + ((l)localObject1).bKi(), new Object[] { ((l)localObject1).tpD });
            if (16 == ((l)localObject1).state)
            {
              localObject1 = ((l)localObject1).bKf().bKg().bKh();
              if (bg.nm((String)localObject1)) {
                break label873;
              }
              b.c.tqk.b(i, j, (String)localObject1, k);
              if (!Thread.interrupted()) {
                break label940;
              }
              w.i("MicroMsg.ResDownloader.CheckResUpdate.DecryptTask", "%s: decrypting and interrupted", new Object[] { ((a)ST()).tpD });
              com.tencent.mm.pluginsdk.j.a.e.a.OS(((a)ST()).filePath);
              com.tencent.mm.pluginsdk.j.a.e.a.OS(((a)ST()).filePath + ".decrypted");
              com.tencent.mm.pluginsdk.j.a.e.a.OS(((a)ST()).filePath + ".decompressed");
              GMTrace.o(844900597760L, 6295);
            }
          }
          else
          {
            if (((l)localObject1).tqn)
            {
              w.i("MicroMsg.ResDownloader.CheckResUpdate.FileDecryptPerformer", "%s: checkFileExists(), do fileDecrypt", new Object[] { ((l)localObject1).tpD });
              ((l)localObject1).tqM = (((l)localObject1).filePath + ".decrypted");
              ((l)localObject1).state = 32;
              if (((l)localObject1).bKh() == null) {
                break label953;
              }
              ((l)localObject1).state = 16;
              w.i("MicroMsg.ResDownloader.CheckResUpdate.FileDecryptPerformer", "%s: checkFileExists(), file already valid", new Object[] { ((l)localObject1).tpD });
              break label953;
            }
            w.i("MicroMsg.ResDownloader.CheckResUpdate.FileDecryptPerformer", "%s: checkFileExists(), just check sum", new Object[] { ((l)localObject1).tpD });
            ((l)localObject1).tqM = ((l)localObject1).filePath;
            ((l)localObject1).state = 32;
            if (((l)localObject1).bKh() == null) {
              break label956;
            }
            ((l)localObject1).state = 16;
            w.i("MicroMsg.ResDownloader.CheckResUpdate.FileDecryptPerformer", "%s: checkFileExists(), file already valid", new Object[] { ((l)localObject1).tpD });
            break label956;
          }
          if (((l)localObject1).tqn)
          {
            ((l)localObject1).tqM = ((l)localObject1).filePath;
            ((l)localObject1).tqN = (((l)localObject1).filePath + ".decrypted");
            ((l)localObject1).state = 1;
            continue;
          }
          if (!((l)localObject2).tqm) {
            break label854;
          }
        }
        finally
        {
          if (Thread.interrupted())
          {
            w.i("MicroMsg.ResDownloader.CheckResUpdate.DecryptTask", "%s: decrypting and interrupted", new Object[] { ((a)ST()).tpD });
            com.tencent.mm.pluginsdk.j.a.e.a.OS(((a)ST()).filePath);
            com.tencent.mm.pluginsdk.j.a.e.a.OS(((a)ST()).filePath + ".decrypted");
            com.tencent.mm.pluginsdk.j.a.e.a.OS(((a)ST()).filePath + ".decompressed");
          }
        }
        ((l)localObject2).tqM = ((l)localObject2).filePath;
        ((l)localObject2).tqN = (((l)localObject2).filePath + ".decompressed");
        ((l)localObject2).state = 2;
        continue;
        ((l)localObject2).tqM = ((l)localObject2).filePath;
        ((l)localObject2).state = 4;
        continue;
        com.tencent.mm.pluginsdk.j.a.e.a.OS(((a)ST()).filePath + ".decrypted");
        com.tencent.mm.pluginsdk.j.a.e.a.OS(((a)ST()).filePath + ".decompressed");
        continue;
        GMTrace.o(844900597760L, 6295);
        return;
        continue;
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\pluginsdk\j\a\b\k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */