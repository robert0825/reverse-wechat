package com.tencent.mm.plugin.backup.f;

import android.util.Pair;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.k;
import com.tencent.mm.bm.a;
import com.tencent.mm.jniinterface.AesEcb;
import com.tencent.mm.kernel.h;
import com.tencent.mm.plugin.backup.h.x;
import com.tencent.mm.plugin.backup.h.y;
import com.tencent.mm.pluginsdk.c.d;
import com.tencent.mm.pointers.PByteArray;
import com.tencent.mm.protocal.c.ek;
import com.tencent.mm.protocal.c.el;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.emotion.EmojiInfo;
import com.tencent.mm.y.at;
import java.io.FileInputStream;
import java.util.HashSet;
import java.util.LinkedList;

public final class c
  extends b
{
  public static String TAG;
  private com.tencent.mm.ad.e gvj;
  public x jbv;
  y jbw;
  int jbx;
  PByteArray jby;
  public a jbz;
  
  static
  {
    GMTrace.i(9515902697472L, 70899);
    TAG = "MicroMsg.dkBackupDataPush";
    GMTrace.o(9515902697472L, 70899);
  }
  
  private c(final b paramb, String paramString, a parama, byte[] paramArrayOfByte)
  {
    GMTrace.i(14811865808896L, 110357);
    this.jbv = new x();
    this.jbw = new y();
    this.jbx = 0;
    this.jby = new PByteArray();
    this.jbz = null;
    this.jbv.jie = paramString;
    this.jbv.jif = 2;
    this.gvj = new com.tencent.mm.ad.e()
    {
      public final void a(int paramAnonymousInt1, int paramAnonymousInt2, String paramAnonymousString, k paramAnonymousk)
      {
        GMTrace.i(9511070859264L, 70863);
        paramAnonymousString = (c)paramAnonymousk;
        paramAnonymousk = paramb;
        c.a locala = paramAnonymousString.jbz;
        if ((!locala.jbC.contains(paramAnonymousString)) && (paramAnonymousString.jbv.jif == 2)) {
          w.e(c.TAG, "!!!!!Error checkSceneAllFinish media scene not in sceneHashSet");
        }
        locala.jbC.remove(paramAnonymousString);
        paramAnonymousk.c(locala.jbC.isEmpty(), paramAnonymousString.jbv.jie, paramAnonymousString.afB());
        GMTrace.o(9511070859264L, 70863);
      }
    };
    this.jbz = parama;
    parama.jbC.add(this);
    paramb = this.jbz;
    if (paramb.gsL <= 0)
    {
      paramb = new Pair(Integer.valueOf(0), new byte[0]);
      if ((paramb.second == null) || (paramb.first == null))
      {
        w.w(TAG, "doScene Error Read OVERFLOW    file:%s", new Object[] { this.jbz.filePath });
        this.jbv.jgP = null;
        GMTrace.o(14811865808896L, 110357);
      }
    }
    else
    {
      if (paramb.gsL - paramb.offset > 524288L) {}
      int i;
      for (long l = 524288L;; l = paramb.gsL - paramb.offset)
      {
        i = (int)l;
        paramString = new byte[i];
        if (paramb.jbD == null) {
          break label281;
        }
        System.arraycopy(paramb.jbD, paramb.offset, paramString, 0, i);
        int j = paramb.offset;
        paramb.offset += i;
        paramb = new Pair(Integer.valueOf(j), paramString);
        break;
      }
      label281:
      if (i < 524288L) {}
      for (bool = true;; bool = false)
      {
        paramb.a(paramString, bool);
        break;
      }
    }
    paramString = (byte[])paramb.second;
    this.jbv.jig = this.jbz.gsL;
    this.jbv.jih = ((Integer)paramb.first).intValue();
    this.jbv.jii = (this.jbv.jih + paramString.length);
    paramb = this.jbv;
    if (this.jbv.jii == this.jbv.jig) {}
    for (boolean bool = true;; bool = false)
    {
      paramb.jgP = a(paramString, bool, paramArrayOfByte);
      afA();
      GMTrace.o(14811865808896L, 110357);
      return;
    }
  }
  
  private c(final b paramb, String paramString, LinkedList<ek> paramLinkedList, byte[] paramArrayOfByte)
  {
    GMTrace.i(14812000026624L, 110358);
    this.jbv = new x();
    this.jbw = new y();
    this.jbx = 0;
    this.jby = new PByteArray();
    this.jbz = null;
    this.jbv.jie = paramString;
    this.jbv.jif = 1;
    this.gvj = new com.tencent.mm.ad.e()
    {
      public final void a(int paramAnonymousInt1, int paramAnonymousInt2, String paramAnonymousString, k paramAnonymousk)
      {
        GMTrace.i(9505031061504L, 70818);
        paramAnonymousString = (c)paramAnonymousk;
        paramb.c(true, paramAnonymousString.jbv.jie, paramAnonymousString.afB());
        GMTrace.o(9505031061504L, 70818);
      }
    };
    try
    {
      paramb = new el();
      paramb.jhd = paramLinkedList;
      paramb.jhc = paramLinkedList.size();
      paramb = paramb.toByteArray();
      paramString = paramb;
      if (paramb == null) {
        paramString = new byte[0];
      }
      this.jbv.jih = 0;
      this.jbv.jii = paramString.length;
      this.jbv.jig = paramString.length;
      this.jbv.jgP = a(paramString, true, paramArrayOfByte);
      afA();
      GMTrace.o(14812000026624L, 110358);
      return;
    }
    catch (Exception paramb)
    {
      paramString = TAG;
      if (paramLinkedList != null) {}
    }
    for (int i = -1;; i = paramLinkedList.size())
    {
      w.e(paramString, "ERROR: BakChatMsgList to Buffer list:%d :%s", new Object[] { Integer.valueOf(i), paramb.getMessage() });
      paramb = null;
      break;
    }
  }
  
  private static com.tencent.mm.bm.b a(byte[] paramArrayOfByte1, boolean paramBoolean, byte[] paramArrayOfByte2)
  {
    GMTrace.i(14812134244352L, 110359);
    if ((bg.br(paramArrayOfByte2) > 0) && (bg.br(paramArrayOfByte1) > 0))
    {
      paramArrayOfByte1 = new com.tencent.mm.bm.b(AesEcb.aesCryptEcb(paramArrayOfByte1, paramArrayOfByte2, true, paramBoolean));
      GMTrace.o(14812134244352L, 110359);
      return paramArrayOfByte1;
    }
    paramArrayOfByte1 = new com.tencent.mm.bm.b(paramArrayOfByte1);
    GMTrace.o(14812134244352L, 110359);
    return paramArrayOfByte1;
  }
  
  public static void a(b paramb, c paramc, String paramString1, String paramString2, byte[] paramArrayOfByte)
  {
    GMTrace.i(14811597373440L, 110355);
    paramString2 = new a(paramString2);
    int i;
    if (paramString2.gsL <= 0) {
      i = 1;
    }
    for (;;)
    {
      new LinkedList();
      int j = 0;
      while (j < i)
      {
        paramc.a(new c(paramb, paramString1, paramString2, paramArrayOfByte));
        j += 1;
      }
      j = (int)(paramString2.gsL / 524288L);
      i = j;
      if (paramString2.gsL % 524288L != 0L) {
        i = j + 1;
      }
    }
    GMTrace.o(14811597373440L, 110355);
  }
  
  public static void a(b paramb, c paramc, String paramString, LinkedList<ek> paramLinkedList, byte[] paramArrayOfByte)
  {
    GMTrace.i(14811731591168L, 110356);
    paramc.a(new c(paramb, paramString, paramLinkedList, paramArrayOfByte));
    GMTrace.o(14811731591168L, 110356);
  }
  
  private void afA()
  {
    GMTrace.i(9514694737920L, 70890);
    this.jbx = afz();
    try
    {
      com.tencent.mm.plugin.backup.e.c.a(this.jbv.toByteArray(), this.jbx, (short)6, this.jby, b.iVq);
      GMTrace.o(9514694737920L, 70890);
      return;
    }
    catch (Exception localException)
    {
      w.printErrStackTrace(TAG, localException, "req to buf fail: " + localException.toString(), new Object[0]);
      GMTrace.o(9514694737920L, 70890);
    }
  }
  
  public final int afB()
  {
    GMTrace.i(9515097391104L, 70893);
    if (this.jby.value == null)
    {
      GMTrace.o(9515097391104L, 70893);
      return 0;
    }
    int i = this.jby.value.length;
    GMTrace.o(9515097391104L, 70893);
    return i;
  }
  
  public final a afr()
  {
    GMTrace.i(9515231608832L, 70894);
    y localy = this.jbw;
    GMTrace.o(9515231608832L, 70894);
    return localy;
  }
  
  public final a afs()
  {
    GMTrace.i(15404302860288L, 114771);
    x localx = this.jbv;
    GMTrace.o(15404302860288L, 114771);
    return localx;
  }
  
  public final void aft()
  {
    GMTrace.i(9514560520192L, 70889);
    this.gvj.a(0, this.jbw.jhA, "", this);
    GMTrace.o(9514560520192L, 70889);
  }
  
  public final boolean afx()
  {
    GMTrace.i(9514828955648L, 70891);
    byte[] arrayOfByte = this.jby.value;
    int i = this.jbx;
    long l = System.currentTimeMillis();
    int j = b.jbo.j(i, arrayOfByte);
    w.i("MicroMsg.BackupBaseScene", "BackupBaseScene doscene [%d] ret:%d sendSeq:%d, type:%d, len:%d", new Object[] { Long.valueOf(System.currentTimeMillis() - l), Integer.valueOf(j), Integer.valueOf(i), Integer.valueOf(getType()), Integer.valueOf(arrayOfByte.length) });
    GMTrace.o(9514828955648L, 70891);
    return true;
  }
  
  public final int getType()
  {
    GMTrace.i(15404437078016L, 114772);
    GMTrace.o(15404437078016L, 114772);
    return 6;
  }
  
  private static final class a
  {
    String filePath;
    int gsL;
    HashSet<c> jbC;
    byte[] jbD;
    private FileInputStream jbE;
    int offset;
    
    public a(String paramString)
    {
      GMTrace.i(9499393916928L, 70776);
      this.jbC = new HashSet();
      this.gsL = 0;
      this.filePath = null;
      this.offset = 0;
      this.jbD = null;
      this.jbE = null;
      this.filePath = paramString;
      this.jbD = null;
      paramString = this.filePath;
      at.AR();
      int i;
      if (!paramString.startsWith(com.tencent.mm.y.c.zb()))
      {
        i = 0;
        if (i == 0) {
          break label225;
        }
      }
      label225:
      for (this.gsL = bg.br(this.jbD);; this.gsL = com.tencent.mm.a.e.aY(this.filePath))
      {
        if (this.gsL < 0) {
          this.gsL = 0;
        }
        GMTrace.o(9499393916928L, 70776);
        return;
        paramString = this.filePath.substring(this.filePath.lastIndexOf("/") + 1);
        paramString = ((com.tencent.mm.plugin.emoji.b.c)h.j(com.tencent.mm.plugin.emoji.b.c.class)).getEmojiMgr().vP(paramString);
        if (paramString == null)
        {
          i = 0;
          break;
        }
        if ((paramString.field_reserved4 & EmojiInfo.vCJ) != EmojiInfo.vCJ)
        {
          i = 0;
          break;
        }
        this.jbD = ((com.tencent.mm.plugin.emoji.b.c)h.j(com.tencent.mm.plugin.emoji.b.c.class)).getEmojiMgr().a(paramString);
        if (bg.br(this.jbD) <= 0)
        {
          i = 0;
          break;
        }
        i = 1;
        break;
      }
    }
    
    final boolean a(byte[] paramArrayOfByte, boolean paramBoolean)
    {
      GMTrace.i(9499528134656L, 70777);
      try
      {
        if (this.jbE == null) {
          this.jbE = new FileInputStream(this.filePath);
        }
        int i = this.jbE.read(paramArrayOfByte);
        int j = paramArrayOfByte.length;
        if (i != j)
        {
          GMTrace.o(9499528134656L, 70777);
          return false;
        }
        if (paramBoolean) {
          this.jbE.close();
        }
        GMTrace.o(9499528134656L, 70777);
        return true;
      }
      catch (Exception paramArrayOfByte)
      {
        GMTrace.o(9499528134656L, 70777);
      }
      return false;
    }
  }
  
  public static abstract interface b
  {
    public abstract void c(boolean paramBoolean, String paramString, int paramInt);
  }
  
  public static abstract interface c
  {
    public abstract void a(c paramc);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\backup\f\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */