package com.tencent.mm.plugin.favorite.c;

import android.database.Cursor;
import android.os.HandlerThread;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.compatible.util.g.a;
import com.tencent.mm.modelcdntran.i;
import com.tencent.mm.modelcdntran.i.a;
import com.tencent.mm.modelcdntran.keep_ProgressInfo;
import com.tencent.mm.modelcdntran.keep_SceneResult;
import com.tencent.mm.modelsfs.FileOp;
import com.tencent.mm.network.n;
import com.tencent.mm.network.n.a;
import com.tencent.mm.plugin.favorite.b.a;
import com.tencent.mm.plugin.favorite.b.j;
import com.tencent.mm.plugin.favorite.b.k;
import com.tencent.mm.plugin.favorite.b.x;
import com.tencent.mm.protocal.c.th;
import com.tencent.mm.protocal.c.tt;
import com.tencent.mm.sdk.e.e;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.aj;
import com.tencent.mm.sdk.platformtools.aj.a;
import com.tencent.mm.sdk.platformtools.am;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.y.at;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

public final class c
{
  private Queue<a> eyU;
  private Map<String, g.a> eyW;
  public boolean eyY;
  public int eyZ;
  public long eza;
  public aj eze;
  private i.a gIz;
  public n gzE;
  public boolean lcN;
  public Map<String, a> lcP;
  public Set<String> lcQ;
  public int lcR;
  public boolean lcS;
  private Runnable lcT;
  public boolean running;
  
  public c()
  {
    GMTrace.i(6484863746048L, 48316);
    this.running = false;
    this.eyZ = 0;
    this.eza = 0L;
    this.eyY = false;
    this.eyU = new LinkedList();
    this.eyW = new HashMap();
    this.lcP = new HashMap();
    this.lcQ = new HashSet();
    this.lcR = 0;
    this.lcS = true;
    this.gzE = new n.a()
    {
      public final void db(int paramAnonymousInt)
      {
        GMTrace.i(6478152859648L, 48266);
        boolean bool;
        a locala;
        try
        {
          bool = am.isWifi(ab.getContext());
          w.i("MicroMsg.FavCdnService", "onNetworkChange st:%d isWifi:%B, lastIsWifi:%B", new Object[] { Integer.valueOf(paramAnonymousInt), Boolean.valueOf(bool), Boolean.valueOf(c.this.lcN) });
          if ((paramAnonymousInt != 4) && (paramAnonymousInt != 6))
          {
            c.this.lcN = bool;
            GMTrace.o(6478152859648L, 48266);
            return;
          }
          if ((!c.this.lcN) || (bool)) {
            break label424;
          }
          c localc1 = c.this;
          w.i("MicroMsg.FavCdnService", "pauseAll");
          localCursor = com.tencent.mm.plugin.favorite.h.axw().fTZ.rawQuery("select * from FavCdnInfo where type = 0 and status = 1", null);
          if ((localCursor != null) && (localCursor.moveToFirst()))
          {
            while (localCursor.moveToNext())
            {
              locala = new a();
              locala.b(localCursor);
              w.i("MicroMsg.FavCdnService", "pauseAll, pauseUpload dataId:%s", new Object[] { locala.field_dataId });
              locala.field_status = 4;
              com.tencent.mm.plugin.favorite.h.axw().a(locala, new String[] { "dataId" });
              com.tencent.mm.modelcdntran.g.Gk().jy(locala.field_dataId);
              c.d(com.tencent.mm.plugin.favorite.h.axw().xE(locala.field_dataId));
              localc1.xY(locala.field_dataId);
            }
            localCursor.close();
          }
        }
        catch (Exception localException)
        {
          w.printErrStackTrace("MicroMsg.FavCdnService", localException, "", new Object[0]);
          GMTrace.o(6478152859648L, 48266);
          return;
        }
        Cursor localCursor = com.tencent.mm.plugin.favorite.h.axw().fTZ.rawQuery("select * from FavCdnInfo where type = 1 and status = 1", null);
        if ((localCursor != null) && (localCursor.moveToFirst())) {
          while (localCursor.moveToNext())
          {
            locala = new a();
            locala.b(localCursor);
            w.i("MicroMsg.FavCdnService", "pauseAll, pauseDownload dataId:%s", new Object[] { locala.field_dataId });
            locala.field_status = 4;
            com.tencent.mm.plugin.favorite.h.axw().a(locala, new String[] { "dataId" });
            com.tencent.mm.modelcdntran.g.Gk().jz(locala.field_dataId);
            c.d(com.tencent.mm.plugin.favorite.h.axw().xE(locala.field_dataId));
            localException.xY(locala.field_dataId);
          }
        }
        if (localCursor != null) {
          localCursor.close();
        }
        label424:
        if ((!c.this.lcN) && (bool))
        {
          c localc2 = c.this;
          w.i("MicroMsg.FavCdnService", "startAll");
          com.tencent.mm.plugin.favorite.h.axw().fTZ.eZ("FavCdnInfo", "update FavCdnInfo set status = 1 where status <> 3");
          localc2.run();
        }
        c.this.lcN = bool;
        GMTrace.o(6478152859648L, 48266);
      }
    };
    this.lcT = new Runnable()
    {
      public final void run()
      {
        GMTrace.i(6497748647936L, 48412);
        long l = System.currentTimeMillis() - c.this.eza;
        if (c.this.running)
        {
          if (l < 300000L)
          {
            GMTrace.o(6497748647936L, 48412);
            return;
          }
          w.e("MicroMsg.FavCdnService", "klem ERR: Try Run service runningFlag:" + c.this.running + " timeWait:" + l + ">=MAX_TIME_WAIT sending:" + c.this.running);
        }
        w.i("MicroMsg.FavCdnService", "do run cdn job, wait time %d", new Object[] { Long.valueOf(l) });
        c.this.eyY = false;
        c.this.running = true;
        c.this.lcR = 0;
        c.this.eyZ = 3;
        c.this.eze.z(100L, 100L);
        GMTrace.o(6497748647936L, 48412);
      }
      
      public final String toString()
      {
        GMTrace.i(6497882865664L, 48413);
        String str = super.toString() + "|run";
        GMTrace.o(6497882865664L, 48413);
        return str;
      }
    };
    this.eze = new aj(at.xB().ngv.getLooper(), new aj.a()
    {
      public final boolean pM()
      {
        GMTrace.i(6495601164288L, 48396);
        try
        {
          c.this.qG();
          GMTrace.o(6495601164288L, 48396);
          return false;
        }
        catch (Exception localException)
        {
          for (;;)
          {
            w.printErrStackTrace("MicroMsg.FavCdnService", localException, "", new Object[0]);
          }
        }
      }
      
      public final String toString()
      {
        GMTrace.i(6495735382016L, 48397);
        String str = super.toString() + "|scenePusher";
        GMTrace.o(6495735382016L, 48397);
        return str;
      }
    }, false);
    this.gIz = new i.a()
    {
      public final int a(String paramAnonymousString, int paramAnonymousInt, keep_ProgressInfo paramAnonymouskeep_ProgressInfo, keep_SceneResult paramAnonymouskeep_SceneResult, boolean paramAnonymousBoolean)
      {
        GMTrace.i(6489292931072L, 48349);
        if (paramAnonymouskeep_ProgressInfo != null) {
          w.d("MicroMsg.FavCdnService", "cdn transfer callback, mediaid=%s, totallen=%d, offset=%d", new Object[] { paramAnonymouskeep_ProgressInfo.mediaId, Integer.valueOf(paramAnonymouskeep_ProgressInfo.field_toltalLength), Integer.valueOf(paramAnonymouskeep_ProgressInfo.field_finishedLength) });
        }
        Object localObject1 = "";
        if (paramAnonymouskeep_ProgressInfo != null) {
          localObject1 = paramAnonymouskeep_ProgressInfo.mediaId;
        }
        while ((paramAnonymousInt == 44530) || (paramAnonymousInt == 44531))
        {
          c.this.xY((String)localObject1);
          GMTrace.o(6489292931072L, 48349);
          return 0;
          if (paramAnonymouskeep_SceneResult != null) {
            localObject1 = paramAnonymouskeep_SceneResult.mediaId;
          }
        }
        if (bg.nm((String)localObject1)) {}
        for (;;)
        {
          localObject1 = com.tencent.mm.plugin.favorite.h.axw().xE(paramAnonymousString);
          if (localObject1 == null)
          {
            w.e("MicroMsg.FavCdnService", "klem onCdnCallback info null");
            c.this.xY(paramAnonymousString);
            GMTrace.o(6489292931072L, 48349);
            return 0;
          }
          if (paramAnonymousInt != 0)
          {
            w.w("MicroMsg.FavCdnService", "cdn transfer callback, startRet=%d", new Object[] { Integer.valueOf(paramAnonymousInt) });
            com.tencent.mm.plugin.report.service.g.ork.i(10660, new Object[] { Integer.valueOf(((a)localObject1).field_type), Integer.valueOf(paramAnonymousInt) });
            ((a)localObject1).field_status = 4;
            com.tencent.mm.plugin.favorite.h.axw().a((a)localObject1, new String[0]);
            c.d((a)localObject1);
            c.this.xY(paramAnonymousString);
          }
          do
          {
            for (;;)
            {
              GMTrace.o(6489292931072L, 48349);
              return 0;
              if (paramAnonymouskeep_ProgressInfo == null) {
                break;
              }
              ((a)localObject1).field_offset = paramAnonymouskeep_ProgressInfo.field_finishedLength;
              ((a)localObject1).field_totalLen = paramAnonymouskeep_ProgressInfo.field_toltalLength;
              ((a)localObject1).field_status = 1;
              com.tencent.mm.plugin.favorite.h.axw().a((a)localObject1, new String[0]);
            }
          } while (paramAnonymouskeep_SceneResult == null);
          Object localObject2;
          if (paramAnonymouskeep_SceneResult.field_retCode >= 0)
          {
            ((a)localObject1).field_status = 3;
            Object localObject3;
            if (1 == ((a)localObject1).field_type)
            {
              paramAnonymouskeep_ProgressInfo = ((a)localObject1).field_path + ".temp";
              localObject3 = ((a)localObject1).field_path;
              paramAnonymousInt = ((a)localObject1).field_dataType;
              if ((paramAnonymouskeep_ProgressInfo != null) && (localObject3 != null)) {}
            }
            for (;;)
            {
              com.tencent.mm.plugin.favorite.h.axw().a((a)localObject1, new String[0]);
              c.a((a)localObject1, paramAnonymouskeep_SceneResult);
              com.tencent.mm.plugin.favorite.h.axw().b((a)localObject1, new String[] { "dataId" });
              c.this.lcP.remove(((a)localObject1).field_dataId);
              w.i("MicroMsg.FavCdnService", "transfer done, mediaid=%s, md5=%s", new Object[] { paramAnonymouskeep_SceneResult.mediaId, paramAnonymousString });
              w.d("MicroMsg.FavCdnService", "transfer done, completeInfo=%s", new Object[] { paramAnonymouskeep_SceneResult.toString() });
              c.this.xY(paramAnonymousString);
              com.tencent.mm.plugin.report.service.g.ork.i(10625, new Object[] { Integer.valueOf(1), paramAnonymouskeep_SceneResult.field_fileId, "", paramAnonymouskeep_SceneResult.field_transInfo });
              break;
              if ((paramAnonymousInt == -2) && (!c.xX(paramAnonymouskeep_ProgressInfo)) && (c.cg(paramAnonymouskeep_ProgressInfo, (String)localObject3)))
              {
                w.v("MicroMsg.FavCdnService", "renameAndCopyFile write amr head ok!");
              }
              else
              {
                localObject2 = new File(paramAnonymouskeep_ProgressInfo);
                localObject3 = new File((String)localObject3);
                if (((File)localObject2).exists())
                {
                  w.v("MicroMsg.FavCdnService", "rename file suc:%b, old:%s, new:%s", new Object[] { Boolean.valueOf(((File)localObject2).renameTo((File)localObject3)), paramAnonymouskeep_ProgressInfo, localObject3 });
                  continue;
                  ((a)localObject1).field_cdnKey = paramAnonymouskeep_SceneResult.field_aesKey;
                  ((a)localObject1).field_cdnUrl = paramAnonymouskeep_SceneResult.field_fileId;
                }
              }
            }
          }
          w.e("MicroMsg.FavCdnService", "transfer error, mediaid=%s, retCode:%d", new Object[] { paramAnonymouskeep_SceneResult.mediaId, Integer.valueOf(paramAnonymouskeep_SceneResult.field_retCode) });
          paramAnonymouskeep_ProgressInfo = (c.a)c.this.lcP.get(((a)localObject1).field_dataId);
          if (paramAnonymouskeep_ProgressInfo != null) {
            paramAnonymouskeep_ProgressInfo.errCode = paramAnonymouskeep_SceneResult.field_retCode;
          }
          if (59435 == paramAnonymouskeep_SceneResult.field_retCode)
          {
            ((a)localObject1).field_extFlag |= 0x1;
            com.tencent.mm.plugin.report.service.g.ork.a(141L, 1L, 1L, true);
            localObject2 = paramAnonymouskeep_SceneResult.mediaId;
            if (paramAnonymouskeep_ProgressInfo != null)
            {
              paramAnonymousInt = paramAnonymouskeep_ProgressInfo.hji;
              label757:
              w.e("MicroMsg.FavCdnService", "transfer error, mediaid=%s, retCode:-6101,try time = %d,info.field_type: %d , info.field_dataType: %d", new Object[] { localObject2, Integer.valueOf(paramAnonymousInt), Integer.valueOf(((a)localObject1).field_type), Integer.valueOf(((a)localObject1).field_dataType) });
            }
          }
          for (;;)
          {
            ((a)localObject1).field_status = 4;
            com.tencent.mm.plugin.report.service.g.ork.i(10660, new Object[] { Integer.valueOf(((a)localObject1).field_type), Integer.valueOf(paramAnonymouskeep_SceneResult.field_retCode) });
            com.tencent.mm.plugin.favorite.h.axw().a((a)localObject1, new String[0]);
            c.d((a)localObject1);
            break;
            paramAnonymousInt = 1;
            break label757;
            switch (paramAnonymouskeep_SceneResult.field_retCode)
            {
            default: 
              com.tencent.mm.plugin.report.service.g.ork.a(141L, 0L, 1L, true);
              break;
            case -10003: 
              com.tencent.mm.plugin.report.service.g.ork.a(141L, 2L, 1L, true);
              break;
            case -10005: 
              com.tencent.mm.plugin.report.service.g.ork.a(141L, 3L, 1L, true);
              break;
            case -21000: 
              com.tencent.mm.plugin.report.service.g.ork.a(141L, 4L, 1L, true);
              break;
            case -21009: 
              com.tencent.mm.plugin.report.service.g.ork.a(141L, 5L, 1L, true);
              break;
            case -21014: 
              com.tencent.mm.plugin.report.service.g.ork.a(141L, 6L, 1L, true);
              break;
            case -21020: 
              com.tencent.mm.plugin.report.service.g.ork.a(141L, 7L, 1L, true);
              break;
            case -5103015: 
              com.tencent.mm.plugin.report.service.g.ork.a(141L, 8L, 1L, true);
            }
          }
          paramAnonymousString = (String)localObject1;
        }
      }
      
      public final void a(String paramAnonymousString, ByteArrayOutputStream paramAnonymousByteArrayOutputStream)
      {
        GMTrace.i(6489427148800L, 48350);
        GMTrace.o(6489427148800L, 48350);
      }
      
      public final byte[] h(String paramAnonymousString, byte[] paramAnonymousArrayOfByte)
      {
        GMTrace.i(6489561366528L, 48351);
        GMTrace.o(6489561366528L, 48351);
        return null;
      }
    };
    this.lcN = am.isWifi(ab.getContext());
    at.a(this.gzE);
    GMTrace.o(6484863746048L, 48316);
  }
  
  public static void a(a parama, keep_SceneResult paramkeep_SceneResult)
  {
    GMTrace.i(16032576045056L, 119452);
    j localj = com.tencent.mm.plugin.favorite.h.axB().cf(parama.field_favLocalId);
    if (localj == null)
    {
      w.e("MicroMsg.FavCdnService", "klem onCdnTranFinish item info null!");
      GMTrace.o(16032576045056L, 119452);
      return;
    }
    Iterator localIterator = localj.field_favProto.ulB.iterator();
    th localth;
    if (localIterator.hasNext())
    {
      localth = (th)localIterator.next();
      if (!parama.field_dataId.equals(localth.lhq)) {
        break label212;
      }
      localth.Ql(parama.field_cdnKey);
      localth.Qk(parama.field_cdnUrl);
      if ((parama.field_type == 0) && (parama.axC()))
      {
        w.v("MicroMsg.FavCdnService", "video stream, id:%s", new Object[] { paramkeep_SceneResult.field_videoFileId });
        localth.Qz(paramkeep_SceneResult.field_videoFileId);
      }
      localj.field_xml = j.b(localj);
      com.tencent.mm.plugin.favorite.h.axB().a(localj, new String[] { "localId" });
      w.v("MicroMsg.FavCdnService", "klem onCdnTranFinish data key and url updated, md5:%s, cdnUrl:%s", new Object[] { parama.field_dataId, parama.field_cdnUrl });
    }
    for (;;)
    {
      d(parama);
      GMTrace.o(16032576045056L, 119452);
      return;
      label212:
      if (!parama.field_dataId.equals(x.xQ(localth.lhq))) {
        break;
      }
      localth.Qj(parama.field_cdnKey);
      localth.Qi(parama.field_cdnUrl);
      localj.field_xml = j.b(localj);
      com.tencent.mm.plugin.favorite.h.axB().a(localj, new String[] { "localId" });
      w.v("MicroMsg.FavCdnService", "klem onCdnTranFinish thumb key and url updated, md5:%s, cdnUrl:%s", new Object[] { parama.field_dataId, parama.field_cdnUrl });
    }
  }
  
  private static void a(a parama, j paramj)
  {
    GMTrace.i(6487011229696L, 48332);
    Iterator localIterator = paramj.field_favProto.ulB.iterator();
    int i = 0;
    while (localIterator.hasNext())
    {
      th localth = (th)localIterator.next();
      if ((localth.aGU != 1) && (localth.aGU != 6))
      {
        if (!bg.nm(localth.ujt)) {
          break label146;
        }
        i += 1;
      }
    }
    label146:
    for (;;)
    {
      break;
      if (i == 0)
      {
        if (paramj.field_id > 0)
        {
          com.tencent.mm.plugin.favorite.h.axB().s(17, parama.field_favLocalId);
          com.tencent.mm.plugin.favorite.h.axt().run();
          GMTrace.o(6487011229696L, 48332);
          return;
        }
        com.tencent.mm.plugin.favorite.h.axB().s(9, parama.field_favLocalId);
        com.tencent.mm.plugin.favorite.h.axr().run();
      }
      GMTrace.o(6487011229696L, 48332);
      return;
    }
  }
  
  private static void c(a parama)
  {
    GMTrace.i(6485534834688L, 48321);
    if (1 == parama.field_type) {}
    for (parama.field_status = 2;; parama.field_status = 4)
    {
      com.tencent.mm.plugin.favorite.h.axw().a(parama, new String[] { "dataId" });
      d(parama);
      GMTrace.o(6485534834688L, 48321);
      return;
    }
  }
  
  private static int cd(int paramInt1, int paramInt2)
  {
    GMTrace.i(6486071705600L, 48325);
    if ((paramInt1 & 0x1) == 0)
    {
      GMTrace.o(6486071705600L, 48325);
      return paramInt2;
    }
    w.w("MicroMsg.FavCdnService", "NEED To Exchange Type, defType %d", new Object[] { Integer.valueOf(paramInt2) });
    if (com.tencent.mm.modelcdntran.b.MediaType_FAVORITE_VIDEO == paramInt2)
    {
      paramInt1 = com.tencent.mm.modelcdntran.b.MediaType_FAVORITE_FILE;
      GMTrace.o(6486071705600L, 48325);
      return paramInt1;
    }
    paramInt1 = com.tencent.mm.modelcdntran.b.MediaType_FAVORITE_VIDEO;
    GMTrace.o(6486071705600L, 48325);
    return paramInt1;
  }
  
  /* Error */
  static boolean cg(String paramString1, String paramString2)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore 5
    //   3: ldc2_w 373
    //   6: ldc_w 375
    //   9: invokestatic 61	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   12: new 377	java/io/FileInputStream
    //   15: dup
    //   16: aload_0
    //   17: invokespecial 380	java/io/FileInputStream:<init>	(Ljava/lang/String;)V
    //   20: astore 4
    //   22: new 382	java/io/FileOutputStream
    //   25: dup
    //   26: aload_1
    //   27: invokespecial 383	java/io/FileOutputStream:<init>	(Ljava/lang/String;)V
    //   30: astore_0
    //   31: sipush 16384
    //   34: newarray <illegal type>
    //   36: astore_1
    //   37: aload_0
    //   38: ldc_w 385
    //   41: invokevirtual 389	java/lang/String:getBytes	()[B
    //   44: invokevirtual 393	java/io/FileOutputStream:write	([B)V
    //   47: aload 4
    //   49: aload_1
    //   50: invokevirtual 397	java/io/FileInputStream:read	([B)I
    //   53: istore_2
    //   54: iload_2
    //   55: iconst_m1
    //   56: if_icmpeq +65 -> 121
    //   59: aload_0
    //   60: aload_1
    //   61: iconst_0
    //   62: iload_2
    //   63: invokevirtual 400	java/io/FileOutputStream:write	([BII)V
    //   66: goto -19 -> 47
    //   69: astore 5
    //   71: aload 4
    //   73: astore_1
    //   74: aload 5
    //   76: astore 4
    //   78: ldc -85
    //   80: aload 4
    //   82: ldc_w 402
    //   85: iconst_0
    //   86: anewarray 4	java/lang/Object
    //   89: invokestatic 406	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   92: aload_1
    //   93: ifnull +7 -> 100
    //   96: aload_1
    //   97: invokevirtual 409	java/io/FileInputStream:close	()V
    //   100: aload_0
    //   101: ifnull +215 -> 316
    //   104: aload_0
    //   105: invokevirtual 410	java/io/FileOutputStream:close	()V
    //   108: iconst_0
    //   109: istore_3
    //   110: ldc2_w 373
    //   113: ldc_w 375
    //   116: invokestatic 147	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   119: iload_3
    //   120: ireturn
    //   121: iconst_1
    //   122: istore_3
    //   123: aload 4
    //   125: invokevirtual 409	java/io/FileInputStream:close	()V
    //   128: aload_0
    //   129: invokevirtual 410	java/io/FileOutputStream:close	()V
    //   132: goto -22 -> 110
    //   135: astore_0
    //   136: ldc -85
    //   138: aload_0
    //   139: ldc_w 402
    //   142: iconst_0
    //   143: anewarray 4	java/lang/Object
    //   146: invokestatic 406	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   149: iconst_0
    //   150: istore_3
    //   151: goto -41 -> 110
    //   154: astore_1
    //   155: ldc -85
    //   157: aload_1
    //   158: ldc_w 402
    //   161: iconst_0
    //   162: anewarray 4	java/lang/Object
    //   165: invokestatic 406	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   168: iconst_0
    //   169: istore_3
    //   170: goto -42 -> 128
    //   173: astore_1
    //   174: ldc -85
    //   176: aload_1
    //   177: ldc_w 402
    //   180: iconst_0
    //   181: anewarray 4	java/lang/Object
    //   184: invokestatic 406	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   187: goto -87 -> 100
    //   190: astore_0
    //   191: ldc -85
    //   193: aload_0
    //   194: ldc_w 402
    //   197: iconst_0
    //   198: anewarray 4	java/lang/Object
    //   201: invokestatic 406	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   204: iconst_0
    //   205: istore_3
    //   206: goto -96 -> 110
    //   209: astore_1
    //   210: aconst_null
    //   211: astore_0
    //   212: aconst_null
    //   213: astore 4
    //   215: aload 4
    //   217: ifnull +8 -> 225
    //   220: aload 4
    //   222: invokevirtual 409	java/io/FileInputStream:close	()V
    //   225: aload_0
    //   226: ifnull +7 -> 233
    //   229: aload_0
    //   230: invokevirtual 410	java/io/FileOutputStream:close	()V
    //   233: aload_1
    //   234: athrow
    //   235: astore 4
    //   237: ldc -85
    //   239: aload 4
    //   241: ldc_w 402
    //   244: iconst_0
    //   245: anewarray 4	java/lang/Object
    //   248: invokestatic 406	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   251: goto -26 -> 225
    //   254: astore_0
    //   255: ldc -85
    //   257: aload_0
    //   258: ldc_w 402
    //   261: iconst_0
    //   262: anewarray 4	java/lang/Object
    //   265: invokestatic 406	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   268: goto -35 -> 233
    //   271: astore_1
    //   272: aconst_null
    //   273: astore_0
    //   274: goto -59 -> 215
    //   277: astore_1
    //   278: goto -63 -> 215
    //   281: astore 5
    //   283: aload_1
    //   284: astore 4
    //   286: aload 5
    //   288: astore_1
    //   289: goto -74 -> 215
    //   292: astore 4
    //   294: aconst_null
    //   295: astore_0
    //   296: aload 5
    //   298: astore_1
    //   299: goto -221 -> 78
    //   302: astore 5
    //   304: aconst_null
    //   305: astore_0
    //   306: aload 4
    //   308: astore_1
    //   309: aload 5
    //   311: astore 4
    //   313: goto -235 -> 78
    //   316: iconst_0
    //   317: istore_3
    //   318: goto -208 -> 110
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	321	0	paramString1	String
    //   0	321	1	paramString2	String
    //   53	10	2	i	int
    //   109	209	3	bool	boolean
    //   20	201	4	localObject1	Object
    //   235	5	4	localIOException	java.io.IOException
    //   284	1	4	str	String
    //   292	15	4	localException1	Exception
    //   311	1	4	localException2	Exception
    //   1	1	5	localObject2	Object
    //   69	6	5	localException3	Exception
    //   281	16	5	localObject3	Object
    //   302	8	5	localException4	Exception
    // Exception table:
    //   from	to	target	type
    //   31	47	69	java/lang/Exception
    //   47	54	69	java/lang/Exception
    //   59	66	69	java/lang/Exception
    //   128	132	135	java/io/IOException
    //   123	128	154	java/io/IOException
    //   96	100	173	java/io/IOException
    //   104	108	190	java/io/IOException
    //   12	22	209	finally
    //   220	225	235	java/io/IOException
    //   229	233	254	java/io/IOException
    //   22	31	271	finally
    //   31	47	277	finally
    //   47	54	277	finally
    //   59	66	277	finally
    //   78	92	281	finally
    //   12	22	292	java/lang/Exception
    //   22	31	302	java/lang/Exception
  }
  
  public static void d(a parama)
  {
    GMTrace.i(6486608576512L, 48329);
    if (parama.field_type == 0)
    {
      e(parama);
      GMTrace.o(6486608576512L, 48329);
      return;
    }
    if (parama.field_type == 1)
    {
      f(parama);
      GMTrace.o(6486608576512L, 48329);
      return;
    }
    GMTrace.o(6486608576512L, 48329);
  }
  
  public static void e(a parama)
  {
    GMTrace.i(6486742794240L, 48330);
    int i = com.tencent.mm.plugin.favorite.h.axw().m(parama.field_favLocalId, 0);
    w.v("MicroMsg.FavCdnService", "klem updateUploadStatus, upload data status:%d, favlocalId:%d", new Object[] { Integer.valueOf(i), Long.valueOf(parama.field_favLocalId) });
    j localj = com.tencent.mm.plugin.favorite.h.axB().cf(parama.field_favLocalId);
    if (localj == null)
    {
      w.e("MicroMsg.FavCdnService", "klem updateDownloadStatus iteminfo null");
      GMTrace.o(6486742794240L, 48330);
      return;
    }
    if (localj.axN())
    {
      w.i("MicroMsg.FavCdnService", "klem updateUploadStatus waiting server upload skip.");
      GMTrace.o(6486742794240L, 48330);
      return;
    }
    if ((parama.field_status == 3) && (i != parama.field_status) && (localj.field_type == 18) && (com.tencent.mm.plugin.favorite.h.axw().xE(parama.field_dataId).field_status == 3))
    {
      a(parama, localj);
      GMTrace.o(6486742794240L, 48330);
      return;
    }
    switch (i)
    {
    }
    for (;;)
    {
      GMTrace.o(6486742794240L, 48330);
      return;
      if (localj.axM()) {
        com.tencent.mm.plugin.favorite.h.axB().s(15, parama.field_favLocalId);
      }
      for (;;)
      {
        w.i("MicroMsg.FavCdnService", "klem updateUploadStatus, continue upload data, favlocalId:%d, favId:%d, itemStatus:%d", new Object[] { Long.valueOf(parama.field_favLocalId), Integer.valueOf(localj.field_id), Integer.valueOf(localj.field_itemStatus) });
        GMTrace.o(6486742794240L, 48330);
        return;
        com.tencent.mm.plugin.favorite.h.axB().s(4, parama.field_favLocalId);
      }
      if (localj.axM()) {
        com.tencent.mm.plugin.favorite.h.axB().s(16, parama.field_favLocalId);
      }
      for (;;)
      {
        com.tencent.mm.plugin.report.service.g.ork.i(10659, new Object[] { Integer.valueOf(0), Integer.valueOf(localj.field_type), Integer.valueOf(-5), Long.valueOf(x.k(localj)), Long.valueOf(x.ck(localj.field_localId)) });
        w.i("MicroMsg.FavCdnService", "klem updateUploadStatus, error, favLocalId:%d, favId:%d, itemStatus:%d", new Object[] { Long.valueOf(parama.field_favLocalId), Integer.valueOf(localj.field_id), Integer.valueOf(localj.field_itemStatus) });
        GMTrace.o(6486742794240L, 48330);
        return;
        com.tencent.mm.plugin.favorite.h.axB().s(6, parama.field_favLocalId);
      }
      GMTrace.o(6486742794240L, 48330);
      return;
      if (localj.field_type == 18)
      {
        a(parama, localj);
        GMTrace.o(6486742794240L, 48330);
        return;
      }
      if (localj.axM())
      {
        com.tencent.mm.plugin.favorite.h.axB().s(17, parama.field_favLocalId);
        w.i("MicroMsg.FavCdnService", "klem updateUploadStatus start mod faviteminfo, favLocalId:%d, favId:%d, itemStatus:%d", new Object[] { Long.valueOf(parama.field_favLocalId), Integer.valueOf(localj.field_id), Integer.valueOf(localj.field_itemStatus) });
        com.tencent.mm.plugin.favorite.h.axt().run();
        GMTrace.o(6486742794240L, 48330);
        return;
      }
      com.tencent.mm.plugin.favorite.h.axB().s(9, parama.field_favLocalId);
      w.i("MicroMsg.FavCdnService", "klem updateUploadStatus start send faviteminfo, favLocalId:%d, favId:%d, itemStatus:%d", new Object[] { Long.valueOf(parama.field_favLocalId), Integer.valueOf(localj.field_id), Integer.valueOf(localj.field_itemStatus) });
      com.tencent.mm.plugin.favorite.h.axr().run();
      GMTrace.o(6486742794240L, 48330);
      return;
      com.tencent.mm.plugin.favorite.h.axB().s(6, parama.field_favLocalId);
      w.i("MicroMsg.FavCdnService", "klem updateUploadStatus pause, favLocalId:%d, favId:%d, itemStatus:%d", new Object[] { Long.valueOf(parama.field_favLocalId), Integer.valueOf(localj.field_id), Integer.valueOf(localj.field_itemStatus) });
    }
  }
  
  public static void f(a parama)
  {
    GMTrace.i(6486877011968L, 48331);
    int i = com.tencent.mm.plugin.favorite.h.axw().m(parama.field_favLocalId, 1);
    w.v("MicroMsg.FavCdnService", "klem updateDownloadStatus, download data status:%d, favlocalId:%d", new Object[] { Integer.valueOf(i), Long.valueOf(parama.field_favLocalId) });
    j localj = com.tencent.mm.plugin.favorite.h.axB().cf(parama.field_favLocalId);
    if (localj == null)
    {
      w.e("MicroMsg.FavCdnService", "klem updateDownloadStatus iteminfo null");
      GMTrace.o(6486877011968L, 48331);
      return;
    }
    if ((localj.axN()) || (localj.axJ()) || (localj.axK()))
    {
      w.i("MicroMsg.FavCdnService", "klem updateDownloadStatus, status upload, skip. isWaitServerUpload:%b  isUploadding:%b  isUploadFailed:%b", new Object[] { Boolean.valueOf(localj.axN()), Boolean.valueOf(localj.axJ()), Boolean.valueOf(localj.axK()) });
      GMTrace.o(6486877011968L, 48331);
      return;
    }
    switch (i)
    {
    }
    for (;;)
    {
      GMTrace.o(6486877011968L, 48331);
      return;
      x.cl(localj.field_localId);
      com.tencent.mm.plugin.favorite.h.axB().s(7, parama.field_favLocalId);
      GMTrace.o(6486877011968L, 48331);
      return;
      w.i("MicroMsg.FavCdnService", "klem updateDownloadStatus, error, favLocalId:%d, favId:%d, itemStatus:%d", new Object[] { Long.valueOf(parama.field_favLocalId), Integer.valueOf(localj.field_id), Integer.valueOf(localj.field_itemStatus) });
      com.tencent.mm.plugin.report.service.g.ork.i(10659, new Object[] { Integer.valueOf(1), Integer.valueOf(localj.field_type), Integer.valueOf(-5), Long.valueOf(x.k(localj)), Long.valueOf(x.ck(localj.field_localId)) });
      com.tencent.mm.plugin.favorite.h.axB().s(8, parama.field_favLocalId);
      GMTrace.o(6486877011968L, 48331);
      return;
      w.i("MicroMsg.FavCdnService", "klem updateDownloadStatus init, favLocalId:%d, favId:%d", new Object[] { Long.valueOf(parama.field_favLocalId), Integer.valueOf(localj.field_id) });
      com.tencent.mm.plugin.favorite.h.axB().s(10, parama.field_favLocalId);
      GMTrace.o(6486877011968L, 48331);
      return;
      w.i("MicroMsg.FavCdnService", "klem updateDownloadStatus finish, favLocalId:%d, favId:%d", new Object[] { Long.valueOf(parama.field_favLocalId), Integer.valueOf(localj.field_id) });
      com.tencent.mm.plugin.report.service.g.ork.i(10659, new Object[] { Integer.valueOf(1), Integer.valueOf(localj.field_type), Integer.valueOf(0), Long.valueOf(x.k(localj)), Long.valueOf(x.ck(localj.field_localId)) });
      com.tencent.mm.plugin.favorite.h.axB().s(10, parama.field_favLocalId);
      GMTrace.o(6486877011968L, 48331);
      return;
      w.i("MicroMsg.FavCdnService", "klem updateUploadStatus pause, favLocalId:%d, favId:%d", new Object[] { Long.valueOf(parama.field_favLocalId), Integer.valueOf(localj.field_id) });
      com.tencent.mm.plugin.favorite.h.axB().s(8, parama.field_favLocalId);
    }
  }
  
  /* Error */
  static boolean xX(String paramString)
  {
    // Byte code:
    //   0: ldc2_w 518
    //   3: ldc_w 520
    //   6: invokestatic 61	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   9: new 522	java/io/RandomAccessFile
    //   12: dup
    //   13: aload_0
    //   14: ldc_w 524
    //   17: invokespecial 526	java/io/RandomAccessFile:<init>	(Ljava/lang/String;Ljava/lang/String;)V
    //   20: astore_3
    //   21: aload_3
    //   22: astore_0
    //   23: bipush 6
    //   25: newarray <illegal type>
    //   27: astore 4
    //   29: aload_3
    //   30: astore_0
    //   31: aload_3
    //   32: aload 4
    //   34: iconst_0
    //   35: bipush 6
    //   37: invokevirtual 529	java/io/RandomAccessFile:read	([BII)I
    //   40: istore_1
    //   41: iload_1
    //   42: iconst_m1
    //   43: if_icmpne +35 -> 78
    //   46: aload_3
    //   47: invokevirtual 530	java/io/RandomAccessFile:close	()V
    //   50: ldc2_w 518
    //   53: ldc_w 520
    //   56: invokestatic 147	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   59: iconst_0
    //   60: ireturn
    //   61: astore_0
    //   62: ldc -85
    //   64: aload_0
    //   65: ldc_w 402
    //   68: iconst_0
    //   69: anewarray 4	java/lang/Object
    //   72: invokestatic 406	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   75: goto -25 -> 50
    //   78: aload_3
    //   79: astore_0
    //   80: new 216	java/lang/String
    //   83: dup
    //   84: aload 4
    //   86: invokespecial 532	java/lang/String:<init>	([B)V
    //   89: astore 4
    //   91: aload_3
    //   92: astore_0
    //   93: ldc -85
    //   95: new 534	java/lang/StringBuilder
    //   98: dup
    //   99: ldc_w 536
    //   102: invokespecial 537	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   105: aload 4
    //   107: invokevirtual 541	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   110: ldc_w 543
    //   113: invokevirtual 541	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   116: invokevirtual 547	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   119: invokestatic 549	com/tencent/mm/sdk/platformtools/w:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   122: aload_3
    //   123: astore_0
    //   124: aload 4
    //   126: ldc_w 385
    //   129: invokevirtual 552	java/lang/String:endsWith	(Ljava/lang/String;)Z
    //   132: istore_2
    //   133: aload_3
    //   134: invokevirtual 530	java/io/RandomAccessFile:close	()V
    //   137: ldc2_w 518
    //   140: ldc_w 520
    //   143: invokestatic 147	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   146: iload_2
    //   147: ireturn
    //   148: astore_0
    //   149: ldc -85
    //   151: aload_0
    //   152: ldc_w 402
    //   155: iconst_0
    //   156: anewarray 4	java/lang/Object
    //   159: invokestatic 406	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   162: goto -25 -> 137
    //   165: astore 4
    //   167: aconst_null
    //   168: astore_3
    //   169: aload_3
    //   170: astore_0
    //   171: ldc -85
    //   173: aload 4
    //   175: ldc_w 402
    //   178: iconst_0
    //   179: anewarray 4	java/lang/Object
    //   182: invokestatic 406	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   185: aload_3
    //   186: ifnull +7 -> 193
    //   189: aload_3
    //   190: invokevirtual 530	java/io/RandomAccessFile:close	()V
    //   193: ldc2_w 518
    //   196: ldc_w 520
    //   199: invokestatic 147	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   202: iconst_0
    //   203: ireturn
    //   204: astore_0
    //   205: ldc -85
    //   207: aload_0
    //   208: ldc_w 402
    //   211: iconst_0
    //   212: anewarray 4	java/lang/Object
    //   215: invokestatic 406	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   218: goto -25 -> 193
    //   221: astore_3
    //   222: aconst_null
    //   223: astore_0
    //   224: aload_0
    //   225: ifnull +7 -> 232
    //   228: aload_0
    //   229: invokevirtual 530	java/io/RandomAccessFile:close	()V
    //   232: aload_3
    //   233: athrow
    //   234: astore_0
    //   235: ldc -85
    //   237: aload_0
    //   238: ldc_w 402
    //   241: iconst_0
    //   242: anewarray 4	java/lang/Object
    //   245: invokestatic 406	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   248: goto -16 -> 232
    //   251: astore_3
    //   252: goto -28 -> 224
    //   255: astore 4
    //   257: goto -88 -> 169
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	260	0	paramString	String
    //   40	4	1	i	int
    //   132	15	2	bool	boolean
    //   20	170	3	localRandomAccessFile	java.io.RandomAccessFile
    //   221	12	3	localObject1	Object
    //   251	1	3	localObject2	Object
    //   27	98	4	localObject3	Object
    //   165	9	4	localException1	Exception
    //   255	1	4	localException2	Exception
    // Exception table:
    //   from	to	target	type
    //   46	50	61	java/io/IOException
    //   133	137	148	java/io/IOException
    //   9	21	165	java/lang/Exception
    //   189	193	204	java/io/IOException
    //   9	21	221	finally
    //   228	232	234	java/io/IOException
    //   23	29	251	finally
    //   31	41	251	finally
    //   80	91	251	finally
    //   93	122	251	finally
    //   124	133	251	finally
    //   171	185	251	finally
    //   23	29	255	java/lang/Exception
    //   31	41	255	java/lang/Exception
    //   80	91	255	java/lang/Exception
    //   93	122	255	java/lang/Exception
    //   124	133	255	java/lang/Exception
  }
  
  public final void es(final boolean paramBoolean)
  {
    GMTrace.i(6484997963776L, 48317);
    at.xB().A(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(6480300343296L, 48282);
        c.this.lcS = paramBoolean;
        c.this.lcR = 0;
        GMTrace.o(6480300343296L, 48282);
      }
    });
    GMTrace.o(6484997963776L, 48317);
  }
  
  public final void g(a parama)
  {
    GMTrace.i(17621848162304L, 131293);
    if (parama != null) {
      this.eyU.add(parama);
    }
    GMTrace.o(17621848162304L, 131293);
  }
  
  public final void pauseDownload(String paramString)
  {
    GMTrace.i(6485669052416L, 48322);
    if (bg.nm(paramString))
    {
      GMTrace.o(6485669052416L, 48322);
      return;
    }
    if (this.eyW.containsKey(paramString))
    {
      com.tencent.mm.modelcdntran.g.Gk().jz(paramString);
      w.v("MicroMsg.FavCdnService", "pause download md5%s", new Object[] { paramString });
      d(com.tencent.mm.plugin.favorite.h.axw().xE(paramString));
      xY(paramString);
    }
    GMTrace.o(6485669052416L, 48322);
  }
  
  public final void qG()
  {
    GMTrace.i(6485400616960L, 48320);
    this.eza = System.currentTimeMillis();
    if ((!this.eyY) && (this.eyU.size() == 0))
    {
      if (com.tencent.mm.compatible.util.f.ty()) {
        break label94;
      }
      w.e("MicroMsg.FavCdnService", "klem getNeedRunInfo sdcard not available");
      qH();
    }
    label94:
    Object localObject1;
    Object localObject2;
    while ((!this.eyY) && (this.eyU.size() <= 0))
    {
      qH();
      w.d("MicroMsg.FavCdnService", "klem No Data Any More , Stop Service");
      GMTrace.o(6485400616960L, 48320);
      return;
      localObject1 = com.tencent.mm.plugin.favorite.h.axw();
      localObject2 = "select * from FavCdnInfo where status = 1 order by modifyTime desc " + " limit 1";
      localObject2 = ((com.tencent.mm.plugin.favorite.b.b)localObject1).fTZ.a((String)localObject2, null, 2);
      if (localObject2 == null)
      {
        localObject1 = null;
        label140:
        if ((localObject1 == null) || (((List)localObject1).size() == 0)) {
          break label289;
        }
        localObject1 = ((List)localObject1).iterator();
      }
      for (;;)
      {
        if (!((Iterator)localObject1).hasNext()) {
          break label320;
        }
        localObject2 = (a)((Iterator)localObject1).next();
        if (this.eyW.containsKey(((a)localObject2).field_dataId))
        {
          w.d("MicroMsg.FavCdnService", "File is Already running:" + ((a)localObject2).field_dataId);
          continue;
          if (!((Cursor)localObject2).moveToFirst())
          {
            ((Cursor)localObject2).close();
            localObject1 = null;
            break label140;
          }
          localObject1 = new LinkedList();
          do
          {
            a locala = new a();
            locala.b((Cursor)localObject2);
            ((LinkedList)localObject1).add(locala);
          } while (((Cursor)localObject2).moveToNext());
          ((Cursor)localObject2).close();
          break label140;
          label289:
          break;
        }
        this.eyU.add(localObject2);
        this.eyW.put(((a)localObject2).field_dataId, null);
      }
      label320:
      w.d("MicroMsg.FavCdnService", "klem GetNeedRun procing:" + this.eyW.size() + ",send:" + this.eyU.size() + "]");
      this.eyU.size();
    }
    if ((!this.eyY) && (this.eyU.size() > 0))
    {
      localObject2 = (a)this.eyU.poll();
      if ((localObject2 != null) && (!bg.nm(((a)localObject2).field_dataId)))
      {
        localObject1 = (a)this.lcP.get(((a)localObject2).field_dataId);
        label546:
        int i;
        if (localObject1 == null)
        {
          localObject1 = new a();
          ((a)localObject1).hji = 1;
          ((a)localObject1).lcX = bg.Pv();
          this.lcP.put(((a)localObject2).field_dataId, localObject1);
          if (((a)localObject2).field_type != 0) {
            break label903;
          }
          w.i("MicroMsg.FavCdnService", "check favCDN:force job[can upload], localid %d, dataid %s, type %d, dataType %d", new Object[] { Long.valueOf(((a)localObject2).field_favLocalId), ((a)localObject2).field_dataId, Integer.valueOf(((a)localObject2).field_type), Integer.valueOf(((a)localObject2).field_dataType) });
          i = 1;
          label548:
          if (i == 0) {
            break label1467;
          }
          this.eyY = true;
          if (localObject2 == null) {
            break label1440;
          }
          w.d("MicroMsg.FavCdnService", "doTransfer, md5:%s", new Object[] { ((a)localObject2).field_dataId });
          localObject1 = new i();
          ((i)localObject1).gAB = this.gIz;
          ((i)localObject1).field_mediaId = ((a)localObject2).field_dataId;
          if (((a)localObject2).field_type != 0) {
            break label1322;
          }
          ((i)localObject1).eYr = true;
          ((i)localObject1).field_priority = com.tencent.mm.modelcdntran.b.gzc;
          ((i)localObject1).field_needStorage = true;
          ((i)localObject1).field_isStreamMedia = ((a)localObject2).axC();
          ((i)localObject1).field_fullpath = ((a)localObject2).field_path;
          if (!FileOp.aZ(((i)localObject1).field_fullpath)) {
            w.e("MicroMsg.FavCdnService", "favcdnservice upload, but file not exsit,filePath = %s ", new Object[] { ((a)localObject2).field_path });
          }
          if (!((a)localObject2).axC()) {
            break label1305;
          }
        }
        label903:
        label1305:
        for (((i)localObject1).field_fileType = cd(((a)localObject2).field_extFlag, com.tencent.mm.modelcdntran.b.MediaType_FAVORITE_VIDEO);; ((i)localObject1).field_fileType = cd(((a)localObject2).field_extFlag, com.tencent.mm.modelcdntran.b.MediaType_FAVORITE_FILE))
        {
          ((i)localObject1).field_force_aeskeycdn = true;
          ((i)localObject1).field_trysafecdn = false;
          w.i("MicroMsg.FavCdnService", "summersafecdn send force_aeskeycdn[%b] trysafecdn[%b]", new Object[] { Boolean.valueOf(((i)localObject1).field_force_aeskeycdn), Boolean.valueOf(((i)localObject1).field_trysafecdn) });
          com.tencent.mm.modelcdntran.g.Gk().c((i)localObject1);
          GMTrace.o(6485400616960L, 48320);
          return;
          if ((bg.Pv() - ((a)localObject1).lcX > 180000L) && (((a)localObject1).errCode != 59435))
          {
            ((a)localObject1).hji = 1;
            ((a)localObject1).lcX = bg.Pv();
            this.lcP.put(((a)localObject2).field_dataId, localObject1);
            break;
          }
          if (((a)localObject1).hji <= 3)
          {
            ((a)localObject1).hji += 1;
            this.lcP.put(((a)localObject2).field_dataId, localObject1);
            break;
          }
          w.e("MicroMsg.FavCdnService", "check favCDN:match transfer limit 3times , localid %d, dataid %s, type %d, dataType %d", new Object[] { Long.valueOf(((a)localObject2).field_favLocalId), ((a)localObject2).field_dataId, Integer.valueOf(((a)localObject2).field_type), Integer.valueOf(((a)localObject2).field_dataType) });
          c((a)localObject2);
          i = 0;
          break label548;
          if ((this.lcQ.contains(((a)localObject2).field_dataId)) || (x.xR(((a)localObject2).field_dataId)))
          {
            w.i("MicroMsg.FavCdnService", "check favCDN:force job[normal], localid %d, dataid %s, type %d, dataType %d", new Object[] { Long.valueOf(((a)localObject2).field_favLocalId), ((a)localObject2).field_dataId, Integer.valueOf(((a)localObject2).field_type), Integer.valueOf(((a)localObject2).field_dataType) });
            break label546;
          }
          if (!am.isWifi(ab.getContext()))
          {
            w.i("MicroMsg.FavCdnService", "check favCDN:not force job, NOT WIFI, pause it, localid %d, dataid %s, type %d, dataType %d", new Object[] { Long.valueOf(((a)localObject2).field_favLocalId), ((a)localObject2).field_dataId, Integer.valueOf(((a)localObject2).field_type), Integer.valueOf(((a)localObject2).field_dataType) });
            c((a)localObject2);
            i = 0;
            break label548;
          }
          if (((a)localObject2).field_type == 0)
          {
            w.i("MicroMsg.FavCdnService", "check favCDN:not force job, IN WIFI & SENDING, not auto limit, localid %d, dataid %s, type %d, dataType %d", new Object[] { Long.valueOf(((a)localObject2).field_favLocalId), ((a)localObject2).field_dataId, Integer.valueOf(((a)localObject2).field_type), Integer.valueOf(((a)localObject2).field_dataType) });
            break label546;
          }
          if (!this.lcS)
          {
            w.i("MicroMsg.FavCdnService", "check favCDN:not force job, IN WIFI, not auto limit, localid %d, dataid %s, type %d, dataType %d", new Object[] { Long.valueOf(((a)localObject2).field_favLocalId), ((a)localObject2).field_dataId, Integer.valueOf(((a)localObject2).field_type), Integer.valueOf(((a)localObject2).field_dataType) });
            this.lcR = 0;
            break label546;
          }
          if (this.lcR < 10)
          {
            w.i("MicroMsg.FavCdnService", "check favCDN:not force job, IN WIFI, auto limit %d, current index %d, retryTimes %dlocalid %d, dataid %s, type %d, dataType %d", new Object[] { Integer.valueOf(10), Integer.valueOf(this.lcR), Integer.valueOf(((a)localObject1).hji), Long.valueOf(((a)localObject2).field_favLocalId), ((a)localObject2).field_dataId, Integer.valueOf(((a)localObject2).field_type), Integer.valueOf(((a)localObject2).field_dataType) });
            if (((a)localObject1).hji != 1) {
              break label546;
            }
            this.lcR += 1;
            break label546;
          }
          w.i("MicroMsg.FavCdnService", "check favCDN:not force job, IN WIFI, match auto limit %d", new Object[] { Integer.valueOf(10) });
          i = 0;
          break label548;
        }
        label1322:
        ((i)localObject1).eYr = false;
        ((i)localObject1).field_totalLen = ((a)localObject2).field_totalLen;
        ((i)localObject1).field_aesKey = ((a)localObject2).field_cdnKey;
        ((i)localObject1).field_fileId = ((a)localObject2).field_cdnUrl;
        ((i)localObject1).field_priority = com.tencent.mm.modelcdntran.b.gzd;
        ((i)localObject1).gAB = this.gIz;
        ((i)localObject1).field_fullpath = (((a)localObject2).field_path + ".temp");
        ((i)localObject1).field_needStorage = true;
        ((i)localObject1).field_isStreamMedia = ((a)localObject2).axC();
        if (((a)localObject2).axC()) {}
        for (((i)localObject1).field_fileType = cd(((a)localObject2).field_extFlag, com.tencent.mm.modelcdntran.b.MediaType_FAVORITE_VIDEO);; ((i)localObject1).field_fileType = cd(((a)localObject2).field_extFlag, com.tencent.mm.modelcdntran.b.MediaType_FAVORITE_FILE))
        {
          com.tencent.mm.modelcdntran.g.Gk().b((i)localObject1, -1);
          d((a)localObject2);
          label1440:
          GMTrace.o(6485400616960L, 48320);
          return;
        }
        label1467:
        if (this.lcR >= 10)
        {
          qH();
          GMTrace.o(6485400616960L, 48320);
          return;
        }
        this.eze.z(500L, 500L);
      }
    }
    GMTrace.o(6485400616960L, 48320);
  }
  
  public final void qH()
  {
    GMTrace.i(6485937487872L, 48324);
    this.eyU.clear();
    this.eyW.clear();
    this.running = false;
    this.eyY = false;
    GMTrace.o(6485937487872L, 48324);
  }
  
  public final void run()
  {
    GMTrace.i(6485266399232L, 48319);
    w.v("MicroMsg.FavCdnService", "run fav cdn server");
    at.xB().bQi().removeCallbacks(this.lcT);
    at.xB().A(this.lcT);
    GMTrace.o(6485266399232L, 48319);
  }
  
  public final void xV(final String paramString)
  {
    GMTrace.i(6485132181504L, 48318);
    w.d("MicroMsg.FavCdnService", "add force job %s", new Object[] { paramString });
    at.xB().A(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(6483655786496L, 48307);
        c.this.lcQ.add(paramString);
        GMTrace.o(6483655786496L, 48307);
      }
    });
    GMTrace.o(6485132181504L, 48318);
  }
  
  public final void xW(String paramString)
  {
    GMTrace.i(6485803270144L, 48323);
    if (bg.nm(paramString))
    {
      GMTrace.o(6485803270144L, 48323);
      return;
    }
    com.tencent.mm.modelcdntran.g.Gk().jy(paramString);
    w.v("MicroMsg.FavCdnService", "pause upload md5%s", new Object[] { paramString });
    d(com.tencent.mm.plugin.favorite.h.axw().xE(paramString));
    xY(paramString);
    GMTrace.o(6485803270144L, 48323);
  }
  
  public final void xY(String paramString)
  {
    GMTrace.i(6486474358784L, 48328);
    this.eyY = false;
    this.eyW.remove(paramString);
    pauseDownload(paramString);
    if (this.eyZ > 0)
    {
      qG();
      GMTrace.o(6486474358784L, 48328);
      return;
    }
    w.d("MicroMsg.FavCdnService", "klem stopFlag <= 0 , Stop Service");
    qH();
    GMTrace.o(6486474358784L, 48328);
  }
  
  private final class a
  {
    int errCode;
    int hji;
    long lcX;
    
    public a()
    {
      GMTrace.i(6479629254656L, 48277);
      this.errCode = 0;
      GMTrace.o(6479629254656L, 48277);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\favorite\c\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */