package com.tencent.mm.modelstat;

import android.content.ContentValues;
import android.database.Cursor;
import android.os.HandlerThread;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.bu.g;
import com.tencent.mm.kernel.h;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.at;
import com.tencent.mm.sdk.platformtools.at.b;
import com.tencent.mm.sdk.platformtools.at.c;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.util.HashSet;
import junit.framework.Assert;

public final class l
  extends com.tencent.mm.sdk.e.j
  implements at.c<Integer, j>
{
  public static final String[] fTX;
  private static final String[] gZg;
  private long gZd;
  public at<Integer, j> gZe;
  private long gZf;
  public g goN;
  
  static
  {
    GMTrace.i(1389690355712L, 10354);
    fTX = new String[] { "CREATE TABLE IF NOT EXISTS netstat ( id INTEGER PRIMARY KEY, peroid INT, textCountIn INT, textBytesIn INT, imageCountIn INT, imageBytesIn INT, voiceCountIn INT, voiceBytesIn INT, videoCountIn INT, videoBytesIn INT, mobileBytesIn INT, wifiBytesIn INT, sysMobileBytesIn INT, sysWifiBytesIn INT, textCountOut INT, textBytesOut INT, imageCountOut INT, imageBytesOut INT, voiceCountOut INT, voiceBytesOut INT, videoCountOut INT, videoBytesOut INT, mobileBytesOut INT, wifiBytesOut INT, sysMobileBytesOut INT, sysWifiBytesOut INT, reserved1 INT, reserved2 INT, reserved3 TEXT, realMobileBytesIn INT, realWifiBytesIn INT, realMobileBytesOut INT, realWifiBytesOut INT) ", "CREATE INDEX IF NOT EXISTS  statInfoIndex ON netstat ( peroid ) " };
    gZg = new String[] { "realMobileBytesIn", "realWifiBytesIn", "realMobileBytesOut", "realWifiBytesOut" };
    GMTrace.o(1389690355712L, 10354);
  }
  
  public l(g paramg)
  {
    GMTrace.i(1388482396160L, 10345);
    this.goN = paramg;
    this.gZe = new at(this, h.xB().ngv.getLooper(), 30, 2, 300000L, 1000L);
    paramg = new HashSet();
    Object localObject1 = gZg;
    int k = localObject1.length;
    int i = 0;
    while (i < k)
    {
      paramg.add(localObject1[i]);
      i += 1;
    }
    localObject1 = this.goN.a("PRAGMA table_info(netstat);", null, 2);
    i = ((Cursor)localObject1).getColumnIndex("name");
    while (((Cursor)localObject1).moveToNext()) {
      paramg.remove(((Cursor)localObject1).getString(i));
    }
    ((Cursor)localObject1).close();
    localObject1 = gZg;
    k = localObject1.length;
    i = j;
    while (i < k)
    {
      Object localObject2 = localObject1[i];
      if (paramg.contains(localObject2))
      {
        localObject2 = "ALTER TABLE netstat ADD COLUMN " + (String)localObject2 + " INT;";
        this.goN.eZ("netstat", (String)localObject2);
      }
      i += 1;
    }
    this.gZf = System.currentTimeMillis();
    GMTrace.o(1388482396160L, 10345);
  }
  
  public final long Mo()
  {
    GMTrace.i(1389019267072L, 10349);
    this.gZe.kI(true);
    int j = (int)((bg.Pv() - 1296000000L) / 86400000L);
    int i = (int)(bg.bQQ() / 86400000L);
    Object localObject = "SELECT peroid FROM netstat  WHERE peroid > " + j + " order by peroid limit 1";
    localObject = this.goN.a((String)localObject, null, 2);
    if (((Cursor)localObject).moveToFirst()) {
      i = ((Cursor)localObject).getInt(((Cursor)localObject).getColumnIndex("peroid"));
    }
    ((Cursor)localObject).close();
    long l = i;
    GMTrace.o(1389019267072L, 10349);
    return l * 86400000L;
  }
  
  public final boolean Mp()
  {
    GMTrace.i(1389287702528L, 10351);
    if (this.goN.inTransaction())
    {
      w.i("MicroMsg.NetStat", "summer preAppend inTransaction return false");
      GMTrace.o(1389287702528L, 10351);
      return false;
    }
    this.gZd = this.goN.cE(Thread.currentThread().getId());
    if (this.gZd <= 0L)
    {
      w.i("MicroMsg.NetStat", "summer preAppend ticket: " + this.gZd + " return false");
      GMTrace.o(1389287702528L, 10351);
      return false;
    }
    GMTrace.o(1389287702528L, 10351);
    return true;
  }
  
  public final void Mq()
  {
    GMTrace.i(1389556137984L, 10353);
    if (this.gZd > 0L) {
      this.goN.aL(this.gZd);
    }
    GMTrace.o(1389556137984L, 10353);
  }
  
  public final void a(j paramj)
  {
    GMTrace.i(1388750831616L, 10347);
    Assert.assertNotNull(paramj);
    long l = System.currentTimeMillis();
    if (paramj.gYq <= 0) {
      paramj.gYq = ((int)(l / 86400000L));
    }
    if (paramj.gYq <= 0)
    {
      GMTrace.o(1388750831616L, 10347);
      return;
    }
    j localj = hf(paramj.gYq);
    if ((localj != null) && (paramj.gYq == localj.gYq))
    {
      localj.eQl |= 0x1;
      paramj.gYr += localj.gYs;
      paramj.gYs += localj.gYs;
      paramj.gYt += localj.gYu;
      paramj.gYu += localj.gYu;
      paramj.gYv += localj.gYv;
      paramj.gYw += localj.gYw;
      paramj.gYx += localj.gYx;
      paramj.gYy += localj.gYy;
      paramj.gYz += localj.gYz;
      paramj.gYA += localj.gYA;
      paramj.gYB += localj.gYB;
      paramj.gYC += localj.gYC;
      paramj.gYD += localj.gYE;
      paramj.gYE += localj.gYE;
      paramj.gYF += localj.gYG;
      paramj.gYG += localj.gYG;
      paramj.gYH += localj.gYH;
      paramj.gYI += localj.gYI;
      paramj.gYJ += localj.gYJ;
      paramj.gYK += localj.gYK;
      paramj.gYL += localj.gYL;
      paramj.gYM += localj.gYM;
      paramj.gYN += localj.gYN;
      paramj.gYO += localj.gYO;
      paramj.gYP += localj.gYP;
      paramj.gYQ += localj.gYQ;
      paramj.gYR += localj.gYR;
      paramj.gYS += localj.gYS;
      if ((paramj.gYz <= 4096) && (paramj.gYA <= 4096) && (paramj.gYL <= 4096)) {
        int i = paramj.gYM;
      }
      paramj.id = localj.id;
      if (l - this.gZf > 300000L) {
        w.i("MicroMsg.NetStat", paramj.toString());
      }
    }
    for (;;)
    {
      this.gZf = l;
      b(paramj);
      GMTrace.o(1388750831616L, 10347);
      return;
      paramj.eQl |= 0x2;
      paramj.id = -1;
      if (localj != null) {
        w.i("MicroMsg.NetStat", localj.toString());
      } else {
        w.i("MicroMsg.NetStat", "NetStat started.");
      }
    }
  }
  
  public final void a(at<Integer, j> paramat, at.b<Integer, j> paramb)
  {
    GMTrace.i(1389421920256L, 10352);
    int i = paramb.vkv;
    paramat = (j)paramb.values;
    if ((paramat != null) && (i == 1))
    {
      i = paramat.gYq;
      int j = paramat.id;
      if (i > 0)
      {
        paramb = new ContentValues();
        if ((paramat.eQl & 0x2) != 0) {
          paramb.put("peroid", Integer.valueOf(paramat.gYq));
        }
        if ((paramat.eQl & 0x4) != 0) {
          paramb.put("textCountIn", Integer.valueOf(paramat.gYr));
        }
        if ((paramat.eQl & 0x8) != 0) {
          paramb.put("textBytesIn", Integer.valueOf(paramat.gYs));
        }
        if ((paramat.eQl & 0x10) != 0) {
          paramb.put("imageCountIn", Integer.valueOf(paramat.gYt));
        }
        if ((paramat.eQl & 0x20) != 0) {
          paramb.put("imageBytesIn", Integer.valueOf(paramat.gYu));
        }
        if ((paramat.eQl & 0x40) != 0) {
          paramb.put("voiceCountIn", Integer.valueOf(paramat.gYv));
        }
        if ((paramat.eQl & 0x80) != 0) {
          paramb.put("voiceBytesIn", Integer.valueOf(paramat.gYw));
        }
        if ((paramat.eQl & 0x100) != 0) {
          paramb.put("videoCountIn", Integer.valueOf(paramat.gYx));
        }
        if ((paramat.eQl & 0x200) != 0) {
          paramb.put("videoBytesIn", Integer.valueOf(paramat.gYy));
        }
        if ((paramat.eQl & 0x400) != 0) {
          paramb.put("mobileBytesIn", Integer.valueOf(paramat.gYz));
        }
        if ((paramat.eQl & 0x800) != 0) {
          paramb.put("wifiBytesIn", Integer.valueOf(paramat.gYA));
        }
        if ((paramat.eQl & 0x1000) != 0) {
          paramb.put("sysMobileBytesIn", Integer.valueOf(paramat.gYB));
        }
        if ((paramat.eQl & 0x2000) != 0) {
          paramb.put("sysWifiBytesIn", Integer.valueOf(paramat.gYC));
        }
        if ((paramat.eQl & 0x4000) != 0) {
          paramb.put("textCountOut", Integer.valueOf(paramat.gYD));
        }
        if ((paramat.eQl & 0x8000) != 0) {
          paramb.put("textBytesOut", Integer.valueOf(paramat.gYE));
        }
        if ((paramat.eQl & 0x10000) != 0) {
          paramb.put("imageCountOut", Integer.valueOf(paramat.gYF));
        }
        if ((paramat.eQl & 0x20000) != 0) {
          paramb.put("imageBytesOut", Integer.valueOf(paramat.gYG));
        }
        if ((paramat.eQl & 0x40000) != 0) {
          paramb.put("voiceCountOut", Integer.valueOf(paramat.gYH));
        }
        if ((paramat.eQl & 0x80000) != 0) {
          paramb.put("voiceBytesOut", Integer.valueOf(paramat.gYI));
        }
        if ((paramat.eQl & 0x100000) != 0) {
          paramb.put("videoCountOut", Integer.valueOf(paramat.gYJ));
        }
        if ((paramat.eQl & 0x200000) != 0) {
          paramb.put("videoBytesOut", Integer.valueOf(paramat.gYK));
        }
        if ((paramat.eQl & 0x400000) != 0) {
          paramb.put("mobileBytesOut", Integer.valueOf(paramat.gYL));
        }
        if ((paramat.eQl & 0x800000) != 0) {
          paramb.put("wifiBytesOut", Integer.valueOf(paramat.gYM));
        }
        if ((paramat.eQl & 0x1000000) != 0) {
          paramb.put("sysMobileBytesOut", Integer.valueOf(paramat.gYN));
        }
        if ((paramat.eQl & 0x2000000) != 0) {
          paramb.put("sysWifiBytesOut", Integer.valueOf(paramat.gYO));
        }
        if ((paramat.eQl & 0x4000000) != 0) {
          paramb.put("realMobileBytesIn", Integer.valueOf(paramat.gYP));
        }
        if ((paramat.eQl & 0x8000000) != 0) {
          paramb.put("realWifiBytesIn", Integer.valueOf(paramat.gYQ));
        }
        if ((paramat.eQl & 0x10000000) != 0) {
          paramb.put("realMobileBytesOut", Integer.valueOf(paramat.gYR));
        }
        if ((paramat.eQl & 0x20000000) != 0) {
          paramb.put("realWifiBytesOut", Integer.valueOf(paramat.gYS));
        }
        if (j < 0)
        {
          paramat.id = ((int)this.goN.insert("netstat", "id", paramb));
          GMTrace.o(1389421920256L, 10352);
          return;
        }
        this.goN.update("netstat", paramb, "peroid=" + i, null);
      }
    }
    GMTrace.o(1389421920256L, 10352);
  }
  
  public final boolean b(j paramj)
  {
    GMTrace.i(1388885049344L, 10348);
    Assert.assertNotNull(paramj);
    if (paramj.gYq > 0) {}
    for (boolean bool = true;; bool = false)
    {
      Assert.assertTrue(bool);
      bool = this.gZe.s(Integer.valueOf(paramj.gYq), paramj);
      GMTrace.o(1388885049344L, 10348);
      return bool;
    }
  }
  
  public final j hf(int paramInt)
  {
    GMTrace.i(1388616613888L, 10346);
    Object localObject2 = (j)this.gZe.get(Integer.valueOf(paramInt));
    Object localObject3;
    Object localObject1;
    if (localObject2 == null)
    {
      localObject3 = this.goN.a("netstat", null, "peroid = " + paramInt, null, null, null, null, 2);
      localObject1 = localObject2;
      if (((Cursor)localObject3).moveToFirst())
      {
        localObject1 = new j();
        ((j)localObject1).b((Cursor)localObject3);
      }
      ((Cursor)localObject3).close();
      if (localObject1 != null) {
        this.gZe.s(Integer.valueOf(paramInt), localObject1);
      }
    }
    for (;;)
    {
      GMTrace.o(1388616613888L, 10346);
      return (j)localObject1;
      localObject2 = this.gZe;
      localObject3 = new j();
      ((j)localObject3).eQl = 0;
      ((j)localObject3).id = 0;
      ((j)localObject3).gYq = 0;
      ((j)localObject3).gYr = 0;
      ((j)localObject3).gYs = 0;
      ((j)localObject3).gYt = 0;
      ((j)localObject3).gYu = 0;
      ((j)localObject3).gYv = 0;
      ((j)localObject3).gYw = 0;
      ((j)localObject3).gYx = 0;
      ((j)localObject3).gYy = 0;
      ((j)localObject3).gYz = 0;
      ((j)localObject3).gYA = 0;
      ((j)localObject3).gYB = 0;
      ((j)localObject3).gYC = 0;
      ((j)localObject3).gYD = 0;
      ((j)localObject3).gYE = 0;
      ((j)localObject3).gYF = 0;
      ((j)localObject3).gYG = 0;
      ((j)localObject3).gYH = 0;
      ((j)localObject3).gYI = 0;
      ((j)localObject3).gYJ = 0;
      ((j)localObject3).gYK = 0;
      ((j)localObject3).gYL = 0;
      ((j)localObject3).gYM = 0;
      ((j)localObject3).gYN = 0;
      ((j)localObject3).gYO = 0;
      ((j)localObject3).gYP = 0;
      ((j)localObject3).gYQ = 0;
      ((j)localObject3).gYR = 0;
      ((j)localObject3).gYS = 0;
      ((at)localObject2).s(Integer.valueOf(paramInt), localObject3);
      continue;
      localObject1 = localObject2;
      if (((j)localObject2).gYq != paramInt) {
        localObject1 = null;
      }
    }
  }
  
  public final j hg(int paramInt)
  {
    j localj = null;
    GMTrace.i(1389153484800L, 10350);
    this.gZe.kI(true);
    Object localObject = "SELECT MAX( id), MAX( peroid), SUM( textCountIn), SUM( textBytesIn), SUM( imageCountIn), SUM( imageBytesIn), SUM( voiceCountIn), SUM( voiceBytesIn), SUM( videoCountIn), SUM( videoBytesIn), SUM( mobileBytesIn), SUM( wifiBytesIn), SUM( sysMobileBytesIn), SUM( sysWifiBytesIn), SUM( textCountOut), SUM( textBytesOut), SUM( imageCountOut), SUM( imageBytesOut), SUM( voiceCountOut), SUM( voiceBytesOut), SUM( videoCountOut), SUM( videoBytesOut), SUM( mobileBytesOut), SUM( wifiBytesOut), SUM( sysMobileBytesOut), SUM( sysWifiBytesOut ), SUM( realMobileBytesIn ), SUM( realWifiBytesIn ), SUM( realMobileBytesOut ), SUM( realWifiBytesOut ) FROM netstat WHERE peroid >= " + paramInt;
    localObject = this.goN.a((String)localObject, null, 2);
    if (((Cursor)localObject).moveToFirst())
    {
      localj = new j();
      localj.b((Cursor)localObject);
    }
    ((Cursor)localObject).close();
    GMTrace.o(1389153484800L, 10350);
    return localj;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\modelstat\l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */