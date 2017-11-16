package com.tencent.tinker.c.a;

import com.tencent.tinker.a.a.i.e;
import com.tencent.tinker.a.a.r;
import com.tencent.tinker.a.a.s;
import com.tencent.tinker.a.a.t;
import com.tencent.tinker.a.a.t.a;
import com.tencent.tinker.a.a.u;
import com.tencent.tinker.c.a.a.a.j;
import com.tencent.tinker.c.a.a.a.l;
import com.tencent.tinker.c.a.a.a.m;
import com.tencent.tinker.c.a.a.a.o;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.util.Arrays;

public final class a
{
  private final com.tencent.tinker.a.a.i yea;
  private final com.tencent.tinker.a.a.i yeb;
  private final com.tencent.tinker.c.a.b.a yec;
  private final com.tencent.tinker.c.a.c.c yed;
  private com.tencent.tinker.c.a.a.a.i<s> yee;
  private com.tencent.tinker.c.a.a.a.i<Integer> yef;
  private com.tencent.tinker.c.a.a.a.i<r> yeg;
  private com.tencent.tinker.c.a.a.a.i<com.tencent.tinker.a.a.n> yeh;
  private com.tencent.tinker.c.a.a.a.i<com.tencent.tinker.a.a.p> yei;
  private com.tencent.tinker.c.a.a.a.i<com.tencent.tinker.a.a.f> yej;
  private com.tencent.tinker.c.a.a.a.i<u> yek;
  private com.tencent.tinker.c.a.a.a.i<com.tencent.tinker.a.a.c> yel;
  private com.tencent.tinker.c.a.a.a.i<com.tencent.tinker.a.a.b> yem;
  private com.tencent.tinker.c.a.a.a.i<com.tencent.tinker.a.a.e> yen;
  private com.tencent.tinker.c.a.a.a.i<com.tencent.tinker.a.a.g> yeo;
  private com.tencent.tinker.c.a.a.a.i<com.tencent.tinker.a.a.h> yep;
  private com.tencent.tinker.c.a.a.a.i<com.tencent.tinker.a.a.a> yeq;
  private com.tencent.tinker.c.a.a.a.i<com.tencent.tinker.a.a.k> yer;
  private com.tencent.tinker.c.a.a.a.i<com.tencent.tinker.a.a.d> yes;
  
  private a(com.tencent.tinker.a.a.i parami, com.tencent.tinker.c.a.b.a parama)
  {
    this.yea = parami;
    this.yec = parama;
    this.yeb = new com.tencent.tinker.a.a.i(parama.yfb);
    this.yed = new com.tencent.tinker.c.a.c.c();
  }
  
  public a(InputStream paramInputStream1, InputStream paramInputStream2)
  {
    this(new com.tencent.tinker.a.a.i(paramInputStream1), new com.tencent.tinker.c.a.b.a(paramInputStream2));
  }
  
  public final void b(OutputStream paramOutputStream)
  {
    int j = 0;
    Object localObject1 = this.yea.ne(false);
    if (localObject1 == null) {
      throw new IOException("failed to compute old dex's signature.");
    }
    if (this.yec == null) {
      throw new IllegalArgumentException("patch file is null.");
    }
    Object localObject2 = this.yec.yfu;
    if (com.tencent.tinker.a.a.b.c.m((byte[])localObject1, (byte[])localObject2) != 0) {
      throw new IOException(String.format("old dex signature mismatch! expected: %s, actual: %s", new Object[] { Arrays.toString((byte[])localObject1), Arrays.toString((byte[])localObject2) }));
    }
    localObject1 = this.yeb.ycI;
    ((t)localObject1).yde.cNu = 0;
    ((t)localObject1).yde.size = 1;
    ((t)localObject1).ydl.size = 1;
    ((t)localObject1).ydf.cNu = this.yec.yfd;
    ((t)localObject1).ydg.cNu = this.yec.yfe;
    ((t)localObject1).ydm.cNu = this.yec.yfk;
    ((t)localObject1).ydh.cNu = this.yec.yff;
    ((t)localObject1).ydi.cNu = this.yec.yfg;
    ((t)localObject1).ydj.cNu = this.yec.yfh;
    ((t)localObject1).ydk.cNu = this.yec.yfi;
    ((t)localObject1).ydl.cNu = this.yec.yfj;
    ((t)localObject1).ydr.cNu = this.yec.yfp;
    ((t)localObject1).ydt.cNu = this.yec.yfr;
    ((t)localObject1).ydo.cNu = this.yec.yfm;
    ((t)localObject1).ydn.cNu = this.yec.yfl;
    ((t)localObject1).ydv.cNu = this.yec.yft;
    ((t)localObject1).ydu.cNu = this.yec.yfs;
    ((t)localObject1).yds.cNu = this.yec.yfq;
    ((t)localObject1).ydq.cNu = this.yec.yfo;
    ((t)localObject1).ydp.cNu = this.yec.yfn;
    ((t)localObject1).fileSize = this.yec.yfb;
    Arrays.sort(((t)localObject1).ydw);
    ((t)localObject1).cqy();
    this.yee = new com.tencent.tinker.c.a.a.a.n(this.yec, this.yea, this.yeb, this.yed);
    this.yef = new o(this.yec, this.yea, this.yeb, this.yed);
    this.yeg = new l(this.yec, this.yea, this.yeb, this.yed);
    this.yeh = new j(this.yec, this.yea, this.yeb, this.yed);
    this.yei = new com.tencent.tinker.c.a.a.a.k(this.yec, this.yea, this.yeb, this.yed);
    this.yej = new com.tencent.tinker.c.a.a.a.f(this.yec, this.yea, this.yeb, this.yed);
    this.yek = new com.tencent.tinker.c.a.a.a.p(this.yec, this.yea, this.yeb, this.yed);
    this.yel = new com.tencent.tinker.c.a.a.a.b(this.yec, this.yea, this.yeb, this.yed);
    this.yem = new com.tencent.tinker.c.a.a.a.c(this.yec, this.yea, this.yeb, this.yed);
    this.yen = new com.tencent.tinker.c.a.a.a.e(this.yec, this.yea, this.yeb, this.yed);
    this.yeo = new com.tencent.tinker.c.a.a.a.g(this.yec, this.yea, this.yeb, this.yed);
    this.yep = new com.tencent.tinker.c.a.a.a.h(this.yec, this.yea, this.yeb, this.yed);
    this.yeq = new com.tencent.tinker.c.a.a.a.a(this.yec, this.yea, this.yeb, this.yed);
    this.yer = new m(this.yec, this.yea, this.yeb, this.yed);
    this.yes = new com.tencent.tinker.c.a.a.a.d(this.yec, this.yea, this.yeb, this.yed);
    this.yee.execute();
    this.yef.execute();
    this.yek.execute();
    this.yeg.execute();
    this.yeh.execute();
    this.yei.execute();
    this.yeq.execute();
    this.yem.execute();
    this.yel.execute();
    this.yes.execute();
    this.yep.execute();
    this.yeo.execute();
    this.yen.execute();
    this.yer.execute();
    this.yej.execute();
    localObject2 = this.yeb.Fo(((t)localObject1).yde.cNu);
    ((i.e)localObject2).write(("dex\n" + "035" + "\000").getBytes("UTF-8"));
    ((i.e)localObject2).writeInt(((t)localObject1).ydx);
    ((i.e)localObject2).write(((t)localObject1).ycS);
    ((i.e)localObject2).writeInt(((t)localObject1).fileSize);
    ((i.e)localObject2).writeInt(112);
    ((i.e)localObject2).writeInt(305419896);
    ((i.e)localObject2).writeInt(((t)localObject1).ydy);
    ((i.e)localObject2).writeInt(((t)localObject1).ydz);
    ((i.e)localObject2).writeInt(((t)localObject1).ydl.cNu);
    ((i.e)localObject2).writeInt(((t)localObject1).ydf.size);
    if (((t)localObject1).ydf.exists())
    {
      i = ((t)localObject1).ydf.cNu;
      ((i.e)localObject2).writeInt(i);
      ((i.e)localObject2).writeInt(((t)localObject1).ydg.size);
      if (!((t)localObject1).ydg.exists()) {
        break label1360;
      }
      i = ((t)localObject1).ydg.cNu;
      label1125:
      ((i.e)localObject2).writeInt(i);
      ((i.e)localObject2).writeInt(((t)localObject1).ydh.size);
      if (!((t)localObject1).ydh.exists()) {
        break label1365;
      }
      i = ((t)localObject1).ydh.cNu;
      label1164:
      ((i.e)localObject2).writeInt(i);
      ((i.e)localObject2).writeInt(((t)localObject1).ydi.size);
      if (!((t)localObject1).ydi.exists()) {
        break label1370;
      }
      i = ((t)localObject1).ydi.cNu;
      label1203:
      ((i.e)localObject2).writeInt(i);
      ((i.e)localObject2).writeInt(((t)localObject1).ydj.size);
      if (!((t)localObject1).ydj.exists()) {
        break label1375;
      }
    }
    label1360:
    label1365:
    label1370:
    label1375:
    for (int i = ((t)localObject1).ydj.cNu;; i = 0)
    {
      ((i.e)localObject2).writeInt(i);
      ((i.e)localObject2).writeInt(((t)localObject1).ydk.size);
      i = j;
      if (((t)localObject1).ydk.exists()) {
        i = ((t)localObject1).ydk.cNu;
      }
      ((i.e)localObject2).writeInt(i);
      ((i.e)localObject2).writeInt(((t)localObject1).ydA);
      ((i.e)localObject2).writeInt(((t)localObject1).ydB);
      ((t)localObject1).b(this.yeb.Fo(((t)localObject1).ydl.cNu));
      this.yeb.cpZ();
      paramOutputStream.write(this.yeb.ycQ.array());
      paramOutputStream.flush();
      return;
      i = 0;
      break;
      i = 0;
      break label1125;
      i = 0;
      break label1164;
      i = 0;
      break label1203;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\tinker\c\a\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */