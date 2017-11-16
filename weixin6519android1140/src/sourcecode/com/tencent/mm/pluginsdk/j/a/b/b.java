package com.tencent.mm.pluginsdk.j.a.b;

import android.os.Looper;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.d.a;
import com.tencent.mm.g.a.bd;
import com.tencent.mm.g.a.be;
import com.tencent.mm.g.a.lq;
import com.tencent.mm.pluginsdk.j.a.d.a.a;
import com.tencent.mm.pluginsdk.j.a.d.l;
import com.tencent.mm.pluginsdk.j.a.d.m.a;
import com.tencent.mm.pluginsdk.j.a.d.o;
import com.tencent.mm.pluginsdk.j.a.d.o.a;
import com.tencent.mm.pluginsdk.j.a.d.q;
import com.tencent.mm.protocal.c.aza;
import com.tencent.mm.protocal.c.azc;
import com.tencent.mm.protocal.c.azd;
import com.tencent.mm.protocal.c.beb;
import com.tencent.mm.protocal.c.bu;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.bh;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.y.as;
import com.tencent.mm.y.bt;
import com.tencent.mm.y.bt.a;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;

public final class b
{
  private final com.tencent.mm.pluginsdk.j.a.d.d rGr;
  private final Set<b> tpP;
  private final k tpQ;
  
  public b()
  {
    GMTrace.i(845303250944L, 6298);
    this.tpP = Collections.newSetFromMap(new android.support.v4.e.a(i.tqs.length));
    this.tpQ = new k();
    this.rGr = new com.tencent.mm.pluginsdk.j.a.d.d()
    {
      public final void LA(String paramAnonymousString)
      {
        GMTrace.i(14459007401984L, 107728);
        o localo = o.a.trx;
        if (localo.rFD) {}
        for (boolean bool = localo.trv.isDownloading(paramAnonymousString);; bool = false)
        {
          if (!bool) {
            i.OK(paramAnonymousString);
          }
          GMTrace.o(14459007401984L, 107728);
          return;
        }
      }
      
      public final String SM()
      {
        GMTrace.i(14459141619712L, 107729);
        GMTrace.o(14459141619712L, 107729);
        return "CheckResUpdate";
      }
      
      public final void a(String paramAnonymousString, l paramAnonymousl)
      {
        GMTrace.i(14458738966528L, 107726);
        w.i("MicroMsg.ResDownloader.CheckResUpdateHelper", "networkEventListener.onComplete, urlkey = " + paramAnonymousString);
        paramAnonymousString = o.a.trx.OO(paramAnonymousString);
        if (paramAnonymousString == null)
        {
          GMTrace.o(14458738966528L, 107726);
          return;
        }
        j.r(paramAnonymousString.field_reportId, 10L);
        j.r(paramAnonymousString.field_reportId, 15L);
        if (((!paramAnonymousString.field_fileCompress) || (paramAnonymousString.field_fileEncrypt)) && (paramAnonymousString.field_fileUpdated)) {
          if (paramAnonymousString.field_maxRetryTimes <= paramAnonymousString.field_retryTimes) {
            break label260;
          }
        }
        label260:
        for (int i = j.a.tqG;; i = j.a.tqE)
        {
          j.a(paramAnonymousString.field_resType, paramAnonymousString.field_subType, paramAnonymousString.field_url, bg.getInt(paramAnonymousString.field_fileVersion, 0), i, true, bg.nl(paramAnonymousString.field_groupId2).equals("NewXml"), false, paramAnonymousString.field_sampleId);
          if ((paramAnonymousString.field_fileCompress) || (paramAnonymousString.field_fileEncrypt)) {
            break;
          }
          paramAnonymousl = new bd();
          paramAnonymousl.eCr.filePath = paramAnonymousString.field_filePath;
          paramAnonymousl.eCr.eCv = paramAnonymousString.field_fileUpdated;
          paramAnonymousl.eCr.eCu = bg.getInt(paramAnonymousString.field_fileVersion, 0);
          paramAnonymousl.eCr.eCs = paramAnonymousString.field_resType;
          paramAnonymousl.eCr.eCt = paramAnonymousString.field_subType;
          com.tencent.mm.sdk.b.a.vgX.a(paramAnonymousl, Looper.getMainLooper());
          paramAnonymousString.field_fileUpdated = false;
          o.a.trx.e(paramAnonymousString);
          GMTrace.o(14458738966528L, 107726);
          return;
        }
        w.i("MicroMsg.ResDownloader.CheckResUpdateHelper", "networkEventListener, addDecryptRequest");
        b.this.a(paramAnonymousString);
        GMTrace.o(14458738966528L, 107726);
      }
      
      public final void b(String paramAnonymousString, l paramAnonymousl)
      {
        GMTrace.i(14458873184256L, 107727);
        i.OK(paramAnonymousString);
        paramAnonymousString = o.a.trx.OO(paramAnonymousString);
        if (paramAnonymousString == null)
        {
          GMTrace.o(14458873184256L, 107727);
          return;
        }
        int j = 1;
        int i = j;
        if (paramAnonymousl != null)
        {
          i = j;
          if (paramAnonymousl.tro != null)
          {
            if (!(paramAnonymousl.tro instanceof com.tencent.mm.pluginsdk.j.a.c.a)) {
              break label150;
            }
            j.r(paramAnonymousString.field_reportId, 7L);
            i = 0;
          }
        }
        for (;;)
        {
          if (i != 0) {
            j.r(paramAnonymousString.field_reportId, 11L);
          }
          j.r(paramAnonymousString.field_reportId, 44L);
          j.a(paramAnonymousString.field_resType, paramAnonymousString.field_subType, paramAnonymousString.field_url, bg.getInt(paramAnonymousString.field_fileVersion, 0), j.a.tqF, false, "NewXml".equalsIgnoreCase(paramAnonymousString.field_groupId2), false, paramAnonymousString.field_sampleId);
          GMTrace.o(14458873184256L, 107727);
          return;
          label150:
          i = j;
          if ((paramAnonymousl.tro instanceof com.tencent.mm.pluginsdk.j.a.c.c))
          {
            j.r(paramAnonymousString.field_reportId, 16L);
            i = 0;
          }
        }
      }
    };
    o.a.trx.a("CheckResUpdate", this.rGr);
    GMTrace.o(845303250944L, 6298);
  }
  
  public static String dT(int paramInt1, int paramInt2)
  {
    GMTrace.i(845437468672L, 6299);
    q localq = o.a.trx.OO(i.dU(paramInt1, paramInt2));
    if (localq == null)
    {
      w.i("MicroMsg.ResDownloader.CheckResUpdateHelper", "getCachedFilePath, %d.%d, get null info, return", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
      GMTrace.o(845437468672L, 6299);
      return null;
    }
    w.v("MicroMsg.ResDownloader.CheckResUpdateHelper", "getCachedFilePath, queried primeInfo { deleted = %b, filepath = %s, md5 = %s, compress = %b, encrypt = %b, originalMd5 = %s }", new Object[] { Boolean.valueOf(localq.field_deleted), localq.field_filePath, localq.field_md5, Boolean.valueOf(localq.field_fileCompress), Boolean.valueOf(localq.field_fileEncrypt), localq.field_originalMd5 });
    if ((!localq.field_fileCompress) && (!localq.field_fileEncrypt))
    {
      if ((!localq.field_deleted) && (!bg.nm(localq.field_filePath)) && (bg.nl(com.tencent.mm.a.g.bg(localq.field_filePath)).equals(localq.field_md5)))
      {
        w.i("MicroMsg.ResDownloader.CheckResUpdateHelper", "getCachedFilePath, %d.%d, not need decrypt and file valid, return path(%s)", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), localq.field_filePath });
        str = localq.field_filePath;
        GMTrace.o(845437468672L, 6299);
        return str;
      }
      w.i("MicroMsg.ResDownloader.CheckResUpdateHelper", "getCachedFilePath, %d.%d, not need decrypt and file invalid, return null", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
      GMTrace.o(845437468672L, 6299);
      return null;
    }
    String str = null;
    if (localq.field_fileCompress) {
      str = localq.field_filePath + ".decompressed";
    }
    while (bg.nm(str))
    {
      w.i("MicroMsg.ResDownloader.CheckResUpdateHelper", "getCachedFilePath, %d.%d, need decrypt or decompress, filePath invalid return null ", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
      GMTrace.o(845437468672L, 6299);
      return null;
      if (localq.field_fileEncrypt) {
        str = localq.field_filePath + ".decrypted";
      }
    }
    if ((!bg.nm(localq.field_originalMd5)) && (bg.nl(com.tencent.mm.a.g.bg(str)).equals(localq.field_originalMd5)))
    {
      w.i("MicroMsg.ResDownloader.CheckResUpdateHelper", "getCachedFilePath, %d.%d, need decrypt or decompress, file valid, ret = %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), str });
      GMTrace.o(845437468672L, 6299);
      return str;
    }
    w.i("MicroMsg.ResDownloader.CheckResUpdateHelper", "getCachedFilePath, %d.%d, need decrypt, return null ", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    GMTrace.o(845437468672L, 6299);
    return null;
  }
  
  public static void yR(int paramInt)
  {
    GMTrace.i(20378680295424L, 151833);
    w.i("MicroMsg.ResDownloader.CheckResUpdateHelper", "doCheck, resType = %d", new Object[] { Integer.valueOf(paramInt) });
    com.tencent.mm.kernel.h.xw();
    boolean bool1 = com.tencent.mm.kernel.a.wK();
    boolean bool2 = as.gnb.B("login_user_name", "").equals("");
    if ((!bool1) && (bool2))
    {
      w.i("MicroMsg.ResDownloader.CheckResUpdateHelper", "doCheck, not login, skip");
      GMTrace.o(20378680295424L, 151833);
      return;
    }
    m localm = new m(paramInt);
    com.tencent.mm.kernel.h.xx().fYr.a(localm, 0);
    GMTrace.o(20378680295424L, 151833);
  }
  
  final void a(final int paramInt, final aza paramaza, final boolean paramBoolean)
  {
    GMTrace.i(845705904128L, 6301);
    final String str = i.dU(paramInt, paramaza.uJY);
    if (paramaza.uNn == null)
    {
      w.i("MicroMsg.ResDownloader.CheckResUpdateHelper", "onReceiveDeleteOperation(), resource.Info = null");
      GMTrace.o(845705904128L, 6301);
      return;
    }
    w.i("MicroMsg.ResDownloader.CheckResUpdateHelper", "receive delete-op, fromNewXml(%b), %d.%d, file version (%d)", new Object[] { Boolean.valueOf(paramBoolean), Integer.valueOf(paramInt), Integer.valueOf(paramaza.uJY), Integer.valueOf(paramaza.uNn.uNx) });
    j.r(paramaza.uNp, 3L);
    final int i = paramaza.uNn.uNx;
    final int j = paramaza.uJY;
    final int k = paramaza.uNp;
    paramaza = paramaza.uNq;
    o.a.trx.v(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(845169033216L, 6297);
        q localq = o.a.trx.OO(str);
        int i = paramInt;
        int j = j;
        int k = i;
        int m = k;
        String str1 = paramaza;
        boolean bool2 = paramBoolean;
        w.i("MicroMsg.ResDownloader.CheckResUpdate.DoDeleteLogic", "record " + localq);
        w.i("MicroMsg.ResDownloader.CheckResUpdate.DoDeleteLogic", "delete version %d", new Object[] { Integer.valueOf(k) });
        boolean bool1 = false;
        String str2;
        if (localq != null) {
          if (bg.getInt(localq.field_fileVersion, 0) <= k)
          {
            bool1 = true;
            str2 = i.dU(i, j);
            String str3 = i.OJ(str2);
            w.i("MicroMsg.ResDownloader.CheckResUpdate.DoDeleteLogic", "doDelete(%b), filePath(%s)", new Object[] { Boolean.valueOf(bool1), str3 });
            if (!bool1) {
              break label458;
            }
            o.a.trx.OQ(str2);
            b.c.tqk.f(i, j, 2, bool2);
            if (!(com.tencent.mm.pluginsdk.j.a.e.a.OS(str3) & true & com.tencent.mm.pluginsdk.j.a.e.a.OS(str3 + ".decompressed") & com.tencent.mm.pluginsdk.j.a.e.a.OS(str3 + ".decrypted"))) {
              break label405;
            }
            if (localq != null)
            {
              j.r(localq.field_reportId, 21L);
              j.a(localq.field_resType, localq.field_subType, k, bool2, localq.field_sampleId);
            }
          }
        }
        for (;;)
        {
          if (localq != null) {
            break label435;
          }
          localq = new q();
          localq.field_urlKey = str2;
          localq.field_resType = i;
          localq.field_subType = j;
          localq.field_deleted = true;
          localq.field_fileVersion = String.valueOf(k);
          localq.field_reportId = m;
          localq.field_sampleId = str1;
          o.a.trx.e(localq);
          GMTrace.o(845169033216L, 6297);
          return;
          j.r(localq.field_reportId, 47L);
          j.r(localq.field_reportId, 22L);
          break;
          j.r(m, 47L);
          j.r(m, 22L);
          bool1 = true;
          break;
          label405:
          if (localq != null)
          {
            j.r(localq.field_reportId, 22L);
            j.r(localq.field_reportId, 47L);
          }
        }
        label435:
        localq.field_deleted = true;
        localq.field_fileVersion = String.valueOf(k);
        o.a.trx.e(localq);
        label458:
        GMTrace.o(845169033216L, 6297);
      }
    });
    GMTrace.o(845705904128L, 6301);
  }
  
  final void a(q paramq)
  {
    GMTrace.i(845571686400L, 6300);
    w.d("MicroMsg.ResDownloader.CheckResUpdateHelper", "addDecryptRequest, urlkey = " + paramq.field_urlKey);
    k localk = this.tpQ;
    if (localk.OM(paramq.field_urlKey))
    {
      w.i("MicroMsg.ResDownloader.CheckResUpdate.DecryptExecutor", "URLKey(%s) is already decrypting, skip repeated task");
      GMTrace.o(845571686400L, 6300);
      return;
    }
    localk.a(new a(paramq.field_urlKey, paramq.field_resType, paramq.field_subType, bg.getInt(paramq.field_fileVersion, 0), paramq.field_fileUpdated, paramq.field_filePath, paramq.field_fileEncrypt, paramq.field_fileCompress, paramq.field_encryptKey, paramq.field_keyVersion, paramq.field_eccSignature, paramq.field_originalMd5, bg.nl(paramq.field_groupId2).equals("NewXml"), paramq.field_reportId, paramq.field_sampleId, paramq.field_url, paramq.field_maxRetryTimes, paramq.field_retryTimes));
    GMTrace.o(845571686400L, 6300);
  }
  
  final void b(final int paramInt1, final int paramInt2, final String paramString, final int paramInt3)
  {
    GMTrace.i(846108557312L, 6304);
    o.a.trx.v(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(853893185536L, 6362);
        b localb = b.this;
        int i = paramInt1;
        int j = paramInt2;
        String str = paramString;
        int k = paramInt3;
        Object localObject = i.dU(i, j);
        localObject = o.a.trx.OO((String)localObject);
        if (localObject == null)
        {
          GMTrace.o(853893185536L, 6362);
          return;
        }
        boolean bool = ((q)localObject).field_fileUpdated;
        ((q)localObject).field_fileUpdated = false;
        o.a.trx.e((q)localObject);
        if (k == bg.getInt(((q)localObject).field_fileVersion, 0))
        {
          if (o.a.trx.handler == null)
          {
            w.f("MicroMsg.ResDownloader.CheckResUpdateHelper", "sendEventFileCached: get null eventThread ");
            GMTrace.o(853893185536L, 6362);
            return;
          }
          o.a.trx.handler.post(new b.8(localb, i, j, str, k, bool));
        }
        GMTrace.o(853893185536L, 6362);
      }
    });
    GMTrace.o(846108557312L, 6304);
  }
  
  final void b(int paramInt, final aza paramaza, boolean paramBoolean)
  {
    GMTrace.i(845840121856L, 6302);
    final String str = i.dU(paramInt, paramaza.uJY);
    if (paramaza.uNn == null)
    {
      w.i("MicroMsg.ResDownloader.CheckResUpdateHelper", "onReceiveCacheOperation(), resource.Info = null, return");
      GMTrace.o(845840121856L, 6302);
      return;
    }
    int i = paramaza.uJY;
    int j = paramaza.uNn.uNx;
    if (paramaza.uNn.uNz == null) {}
    for (Object localObject = "null";; localObject = String.valueOf(paramaza.uNn.uNz.size()))
    {
      w.i("MicroMsg.ResDownloader.CheckResUpdateHelper", "receive cache-op, urlKey = %d.%d,  fromNewXml = %b, file version = %d, eccSignatureList.size = %s, reportId = %s, sampleId = %s, url = %s, data = %s", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(i), Boolean.valueOf(paramBoolean), Integer.valueOf(j), localObject, Integer.valueOf(paramaza.uNp), paramaza.uNq, paramaza.uNn.lPM, paramaza.uNn.ugp });
      if (paramaza.uNn.uNz == null) {
        break;
      }
      localObject = paramaza.uNn.uNz.iterator();
      while (((Iterator)localObject).hasNext())
      {
        beb localbeb = (beb)((Iterator)localObject).next();
        w.i("MicroMsg.ResDownloader.CheckResUpdateHelper", "cache-op, sigInfo: version(%d), signature(%s) ", new Object[] { Integer.valueOf(localbeb.jia), localbeb.uPU.bNS() });
      }
    }
    j.ew(paramaza.uNp);
    if (!paramBoolean) {
      j.r(paramaza.uNp, 1L);
    }
    if ((paramaza.tYf != 0) && (paramaza.tYf <= bg.Pu()))
    {
      w.i("MicroMsg.ResDownloader.CheckResUpdateHelper", "recourse(%s) is expired before do download, expireTime = %d, fileVersion = %d", new Object[] { str, Integer.valueOf(paramaza.tYf), Integer.valueOf(paramaza.uNn.uNx) });
      j.r(paramaza.uNp, 14L);
      j.r(paramaza.uNp, 44L);
      j.a(paramInt, paramaza.uJY, paramaza.uNn.lPM, paramaza.uNn.uNx, j.a.tqI, false, paramBoolean, false, paramaza.uNq);
      GMTrace.o(845840121856L, 6302);
      return;
    }
    if ((bg.nm(paramaza.uNn.lPM)) && (paramaza.uNn.ugp == null))
    {
      w.i("MicroMsg.ResDownloader.CheckResUpdateHelper", "cache-op, invalid cache operation, url and data is null or nil, skip");
      GMTrace.o(845840121856L, 6302);
      return;
    }
    localObject = new g.a(paramaza.uNn.lPM);
    ((a.a)localObject).tpD = str;
    ((g.a)localObject).eCs = paramInt;
    ((g.a)localObject).eCt = paramaza.uJY;
    ((a.a)localObject).gXo = paramaza.tYf;
    ((g.a)localObject).eCu = paramaza.uNn.uNx;
    ((a.a)localObject).eDW = paramaza.uNn.ugH;
    ((g.a)localObject).tqm = i.a.yT(paramaza.uNn.uNy);
    ((g.a)localObject).tqn = i.a.yS(paramaza.uNn.uNy);
    ((g.a)localObject).tpL = paramaza.uNp;
    ((g.a)localObject).tpM = paramaza.uNq;
    if (paramaza.uNr > 0) {}
    for (paramInt = paramaza.uNr;; paramInt = 3)
    {
      ((a.a)localObject).tpN = paramInt;
      ((g.a)localObject).tqo = paramaza.tqo;
      ((a.a)localObject).networkType = paramaza.uNs;
      ((g.a)localObject).eCy = paramBoolean;
      if (!bg.cc(paramaza.uNn.uNz)) {
        ((g.a)localObject).tpI = ((beb)paramaza.uNn.uNz.get(0)).uPU.tJp;
      }
      if ((paramaza.uNo != null) && (!bg.nm(paramaza.uNo.uNw)))
      {
        ((g.a)localObject).tpG = paramaza.uNo.uNw;
        ((g.a)localObject).tpH = paramaza.uNo.uNv;
      }
      if ((paramaza.uNn.ugp != null) && (paramaza.uNn.ugp.tJp.length > 0)) {
        ((g.a)localObject).tql = paramaza.uNn.ugp.toByteArray();
      }
      ((g.a)localObject).tpJ = paramaza.uNn.uNA;
      ((g.a)localObject).fileSize = paramaza.uNn.ufa;
      ((a.a)localObject).priority = paramaza.uxd;
      paramaza = new g(((g.a)localObject).url, ((g.a)localObject).tpD, ((g.a)localObject).eCu, ((g.a)localObject).networkType, ((g.a)localObject).tpN, ((g.a)localObject).gXo, ((g.a)localObject).eDW, ((g.a)localObject).eCs, ((g.a)localObject).eCt, ((g.a)localObject).tpL, ((g.a)localObject).tpM, ((g.a)localObject).tpI, ((g.a)localObject).tpJ, ((g.a)localObject).tqm, ((g.a)localObject).tqn, ((g.a)localObject).tpG, ((g.a)localObject).tpH, ((g.a)localObject).tqo, ((g.a)localObject).tql, ((g.a)localObject).fileSize, ((g.a)localObject).eCy, ((g.a)localObject).eCv, ((g.a)localObject).priority);
      w.d("MicroMsg.ResDownloader.CheckResUpdateHelper", "request (%s)", new Object[] { paramaza.toString() });
      o.a.trx.v(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(860738289664L, 6413);
          f.a.a(o.a.trx.OO(str), paramaza);
          GMTrace.o(860738289664L, 6413);
        }
      });
      GMTrace.o(845840121856L, 6302);
      return;
    }
  }
  
  final Set<b> bJZ()
  {
    GMTrace.i(15304444870656L, 114027);
    synchronized (this.tpP)
    {
      Set localSet2 = Collections.newSetFromMap(new android.support.v4.e.a(this.tpP.size()));
      Iterator localIterator = this.tpP.iterator();
      if (localIterator.hasNext()) {
        localSet2.add((b)localIterator.next());
      }
    }
    GMTrace.o(15304444870656L, 114027);
    return localSet;
  }
  
  final void c(final int paramInt, final aza paramaza, boolean paramBoolean)
  {
    GMTrace.i(845974339584L, 6303);
    final String str1 = i.dU(paramInt, paramaza.uJY);
    if (paramaza.uNo == null)
    {
      w.i("MicroMsg.ResDownloader.CheckResUpdateHelper", "onReceiveDecryptOperation(), resource.Key = null");
      GMTrace.o(845974339584L, 6303);
      return;
    }
    if (bg.nm(paramaza.uNo.uNw))
    {
      w.i("MicroMsg.ResDownloader.CheckResUpdateHelper", "encryptKey null, skip");
      GMTrace.o(845974339584L, 6303);
      return;
    }
    w.i("MicroMsg.ResDownloader.CheckResUpdateHelper", "receive decrypt-op, fromNewXml(%b), %d.%d, key version (%d)", new Object[] { Boolean.valueOf(paramBoolean), Integer.valueOf(paramInt), Integer.valueOf(paramaza.uJY), Integer.valueOf(paramaza.uNo.uNv) });
    w.d("MicroMsg.ResDownloader.CheckResUpdateHelper", "key (%s)", new Object[] { paramaza.uNo.uNw });
    j.r(paramaza.uNp, 4L);
    final String str2 = paramaza.uNn.uNA;
    final String str3 = paramaza.uNo.uNw;
    paramInt = paramaza.uNo.uNv;
    final int i = paramaza.uNp;
    paramaza = paramaza.uNq;
    o.a.trx.v(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(846645428224L, 6308);
        q localq = o.a.trx.OO(str1);
        String str1 = str2;
        String str2 = str3;
        int i = paramInt;
        int j = i;
        String str3 = paramaza;
        if (localq == null)
        {
          localq = new q();
          localq.field_keyVersion = i;
          localq.field_encryptKey = str2;
          localq.field_reportId = j;
          localq.field_sampleId = str3;
          localq.field_originalMd5 = str1;
          o.a.trx.e(localq);
          j.r(j, 51L);
          j.r(j, 45L);
          GMTrace.o(846645428224L, 6308);
          return;
        }
        if (localq.field_keyVersion < i)
        {
          localq.field_keyVersion = i;
          localq.field_encryptKey = str2;
          localq.field_reportId = j;
          localq.field_sampleId = str3;
          if (bg.nm(localq.field_originalMd5)) {
            localq.field_originalMd5 = str1;
          }
          o.a.trx.e(localq);
          f.b.a(localq, true);
        }
        GMTrace.o(846645428224L, 6308);
      }
    });
    GMTrace.o(845974339584L, 6303);
  }
  
  public final void e(int paramInt1, final int paramInt2, final int paramInt3, final boolean paramBoolean)
  {
    GMTrace.i(16133507776512L, 120204);
    o.a.trx.v(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(14458336313344L, 107723);
        q localq = o.a.trx.OO(i.dU(this.tpR, paramInt2));
        if ((localq != null) && (String.valueOf(paramInt3).equals(localq.field_fileVersion))) {
          if (paramBoolean) {
            break label77;
          }
        }
        label77:
        for (boolean bool = true;; bool = false)
        {
          localq.field_needRetry = bool;
          o.a.trx.e(localq);
          GMTrace.o(14458336313344L, 107723);
          return;
        }
      }
    });
    GMTrace.o(16133507776512L, 120204);
  }
  
  final void f(final int paramInt1, final int paramInt2, final int paramInt3, final boolean paramBoolean)
  {
    GMTrace.i(846242775040L, 6305);
    if (o.a.trx.handler == null)
    {
      w.f("MicroMsg.ResDownloader.CheckResUpdateHelper", "sendEventPreOperation: get null eventThread ");
      GMTrace.o(846242775040L, 6305);
      return;
    }
    o.a.trx.handler.post(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(14459410055168L, 107731);
        be localbe = new be();
        localbe.eCw.eCx = paramInt3;
        localbe.eCw.eCs = paramInt1;
        localbe.eCw.eCt = paramInt2;
        localbe.eCw.eCy = paramBoolean;
        com.tencent.mm.sdk.b.a.vgX.m(localbe);
        GMTrace.o(14459410055168L, 107731);
      }
    });
    GMTrace.o(846242775040L, 6305);
  }
  
  public static final class a
    implements com.tencent.mm.pluginsdk.j.a.d.g
  {
    private final bt.a rFQ;
    private final com.tencent.mm.sdk.b.c tqh;
    private final h tqi;
    
    public a()
    {
      GMTrace.i(857919717376L, 6392);
      this.tqh = new com.tencent.mm.sdk.b.c() {};
      this.rFQ = new bt.a()
      {
        public final void a(d.a paramAnonymousa)
        {
          GMTrace.i(851074613248L, 6341);
          paramAnonymousa = com.tencent.mm.platformtools.n.a(paramAnonymousa.gtM.tPY);
          if (bg.nm(paramAnonymousa))
          {
            w.w("MicroMsg.ResDownloader.CheckResUpdateHelper", "msg content is null");
            GMTrace.o(851074613248L, 6341);
            return;
          }
          w.d("MicroMsg.CheckResUpdateNewXmlParser", "receive msg: \n" + paramAnonymousa);
          Map localMap;
          if (!bg.nm(paramAnonymousa))
          {
            localMap = bh.q(paramAnonymousa, "sysmsg");
            j.r(0L, 0L);
            if (localMap != null) {
              break label186;
            }
            paramAnonymousa = "null";
            w.i("MicroMsg.CheckResUpdateNewXmlParser", "parsed values.size = %s", new Object[] { paramAnonymousa });
            if (localMap != null) {
              break label199;
            }
            j.r(0L, 30L);
          }
          for (;;)
          {
            if ((localMap != null) && (localMap.size() > 0) && (bg.nl((String)localMap.get(".sysmsg.$type")).equalsIgnoreCase("resourcemgr")))
            {
              e.f(".sysmsg", "delete", localMap);
              e.f(".sysmsg", "cache", localMap);
              e.f(".sysmsg", "decrypt", localMap);
            }
            GMTrace.o(851074613248L, 6341);
            return;
            label186:
            paramAnonymousa = String.valueOf(localMap.size());
            break;
            label199:
            j.r(0L, 31L);
          }
        }
      };
      this.tqi = new h();
      GMTrace.o(857919717376L, 6392);
    }
    
    public final String SM()
    {
      GMTrace.i(858322370560L, 6395);
      GMTrace.o(858322370560L, 6395);
      return "CheckResUpdate";
    }
    
    public final void bCN()
    {
      GMTrace.i(858053935104L, 6393);
      com.tencent.mm.sdk.b.a.vgX.b(this.tqh);
      ((com.tencent.mm.plugin.messenger.foundation.a.n)com.tencent.mm.kernel.h.j(com.tencent.mm.plugin.messenger.foundation.a.n.class)).getSysCmdMsgExtension().a("resourcemgr", this.rFQ, true);
      com.tencent.mm.kernel.h.xB().h(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(18810748796928L, 140151);
          p.agL();
          GMTrace.o(18810748796928L, 140151);
        }
      }, 10000L);
      GMTrace.o(858053935104L, 6393);
    }
    
    public final com.tencent.mm.pluginsdk.j.a.d.h bCO()
    {
      GMTrace.i(858590806016L, 6397);
      h localh = this.tqi;
      GMTrace.o(858590806016L, 6397);
      return localh;
    }
    
    public final m.a c(com.tencent.mm.pluginsdk.j.a.d.k paramk)
    {
      GMTrace.i(858456588288L, 6396);
      if (!(paramk instanceof c))
      {
        w.i("MicroMsg.ResDownloader.CheckResUpdateHelper", "get mismatch NetworkRequest type, return null");
        GMTrace.o(858456588288L, 6396);
        return null;
      }
      w.i("MicroMsg.ResDownloader.CheckResUpdateHelper", "return CheckResUpdateNetworkRequestHandler");
      paramk = new d((c)paramk);
      GMTrace.o(858456588288L, 6396);
      return paramk;
    }
    
    public final void onAccountRelease()
    {
      GMTrace.i(858188152832L, 6394);
      com.tencent.mm.sdk.b.a.vgX.c(this.tqh);
      ((com.tencent.mm.plugin.messenger.foundation.a.n)com.tencent.mm.kernel.h.j(com.tencent.mm.plugin.messenger.foundation.a.n.class)).getSysCmdMsgExtension().b("resourcemgr", this.rFQ, true);
      GMTrace.o(858188152832L, 6394);
    }
  }
  
  public static abstract interface b
  {
    public abstract boolean bKa();
  }
  
  private static final class c
  {
    public static final b tqk;
    
    static
    {
      GMTrace.i(854161620992L, 6364);
      tqk = new b();
      GMTrace.o(854161620992L, 6364);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\pluginsdk\j\a\b\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */