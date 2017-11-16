package com.tencent.mm.plugin.messenger.foundation.a.a;

import android.database.Cursor;
import android.os.Looper;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.bu.g;
import com.tencent.mm.g.b.ce;
import com.tencent.mm.sdk.e.f;
import com.tencent.mm.storage.au;
import com.tencent.mm.storage.au.a;
import com.tencent.mm.storage.au.b;
import com.tencent.mm.storage.au.c;
import com.tencent.mm.storage.au.d;
import com.tencent.mm.storage.e;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import junit.framework.Assert;

public abstract interface c
  extends f
{
  public abstract void A(String paramString, long paramLong);
  
  public abstract Cursor B(String paramString1, String paramString2, int paramInt);
  
  public abstract au B(String paramString, long paramLong);
  
  public abstract void BW(String paramString);
  
  public abstract void BX(String paramString);
  
  public abstract Cursor BY(String paramString);
  
  public abstract au BZ(String paramString);
  
  public abstract au C(String paramString, long paramLong);
  
  public abstract long CA(String paramString);
  
  public abstract au Ca(String paramString);
  
  public abstract au Cb(String paramString);
  
  public abstract au Cc(String paramString);
  
  public abstract List<au> Cd(String paramString);
  
  public abstract Cursor Ce(String paramString);
  
  public abstract void Cf(String paramString);
  
  public abstract int Cg(String paramString);
  
  public abstract boolean Ch(String paramString);
  
  public abstract int Ci(String paramString);
  
  public abstract Cursor Cj(String paramString);
  
  public abstract Cursor Ck(String paramString);
  
  public abstract au.c Cl(String paramString);
  
  public abstract au.d Cm(String paramString);
  
  public abstract au.a Cn(String paramString);
  
  public abstract au.b Co(String paramString);
  
  public abstract int Cp(String paramString);
  
  public abstract boolean Cq(String paramString);
  
  public abstract int Cr(String paramString);
  
  public abstract int Cs(String paramString);
  
  public abstract String Ct(String paramString);
  
  public abstract long Cu(String paramString);
  
  public abstract long Cv(String paramString);
  
  public abstract long Cw(String paramString);
  
  public abstract au Cx(String paramString);
  
  public abstract int Cy(String paramString);
  
  public abstract List<au> Cz(String paramString);
  
  public abstract au D(String paramString, long paramLong);
  
  public abstract List<au> E(String paramString, long paramLong);
  
  public abstract List<au> F(String paramString, long paramLong);
  
  public abstract boolean G(String paramString, long paramLong);
  
  public abstract long H(String paramString, long paramLong);
  
  public abstract int I(String paramString, long paramLong);
  
  public abstract List<au> I(String paramString, int paramInt1, int paramInt2);
  
  public abstract int J(String paramString, long paramLong);
  
  public abstract Cursor J(String paramString, int paramInt1, int paramInt2);
  
  public abstract void J(ArrayList<Long> paramArrayList);
  
  public abstract int K(String paramString, long paramLong);
  
  public abstract String L(String paramString, long paramLong);
  
  public abstract au M(String paramString, long paramLong);
  
  public abstract long N(String paramString, long paramLong);
  
  public abstract int O(au paramau);
  
  public abstract long O(String paramString, long paramLong);
  
  public abstract long P(au paramau);
  
  public abstract void Q(au paramau);
  
  public abstract int R(au paramau);
  
  public abstract Cursor a(String paramString, long paramLong1, long paramLong2, int paramInt);
  
  public abstract Cursor a(String paramString, long paramLong1, long paramLong2, boolean paramBoolean);
  
  public abstract void a(long paramLong, au paramau);
  
  public abstract void a(g paramg, String paramString);
  
  public abstract void a(a parama);
  
  public abstract void a(a parama, Looper paramLooper);
  
  public abstract void a(b paramb);
  
  public abstract void a(c paramc);
  
  public abstract void a(e parame);
  
  public abstract boolean a(long paramLong, String paramString1, String paramString2, String paramString3);
  
  public abstract g aOi();
  
  public abstract void aOj();
  
  public abstract void aOk();
  
  public abstract void aOl();
  
  public abstract ArrayList<au> aOm();
  
  public abstract List<au> aOn();
  
  public abstract Cursor aOo();
  
  public abstract Cursor aOp();
  
  public abstract String aOq();
  
  public abstract String aOr();
  
  public abstract List<au> aOs();
  
  public abstract void b(long paramLong, au paramau);
  
  public abstract void b(String paramString1, String paramString2, String[] paramArrayOfString);
  
  public abstract List<au> bj(String paramString, int paramInt);
  
  public abstract List<au> bk(String paramString, int paramInt);
  
  public abstract Cursor bl(String paramString, int paramInt);
  
  public abstract Cursor bm(String paramString, int paramInt);
  
  public abstract int bn(String paramString, int paramInt);
  
  public abstract Cursor bo(String paramString, int paramInt);
  
  public abstract Cursor bp(String paramString, int paramInt);
  
  public abstract int bq(String paramString, int paramInt);
  
  public abstract Cursor br(String paramString, int paramInt);
  
  public abstract au[] bs(String paramString, int paramInt);
  
  public abstract int c(String paramString, long paramLong, int paramInt);
  
  public abstract long c(au paramau, boolean paramBoolean);
  
  public abstract List<au> c(String paramString, long paramLong, boolean paramBoolean);
  
  public abstract au cM(long paramLong);
  
  public abstract int cN(long paramLong);
  
  public abstract boolean cO(long paramLong);
  
  public abstract boolean cP(long paramLong);
  
  public abstract void cQ(long paramLong);
  
  public abstract au cS(String paramString1, String paramString2);
  
  public abstract Cursor cT(String paramString1, String paramString2);
  
  public abstract int cU(String paramString1, String paramString2);
  
  public abstract LinkedList<au> cV(String paramString1, String paramString2);
  
  public abstract Cursor d(String paramString, long paramLong, int paramInt);
  
  public abstract Cursor f(String paramString, int paramInt, long paramLong);
  
  public abstract Cursor g(String paramString, int paramInt, long paramLong);
  
  public abstract Cursor h(String paramString, int paramInt, long paramLong);
  
  public abstract Cursor i(String paramString, long paramLong1, long paramLong2);
  
  public abstract int j(String paramString, long paramLong1, long paramLong2);
  
  public abstract int k(String paramString, long paramLong1, long paramLong2);
  
  public abstract Cursor l(String paramString, long paramLong1, long paramLong2);
  
  public abstract int m(String paramString, long paramLong1, long paramLong2);
  
  public abstract Cursor n(String paramString, long paramLong1, long paramLong2);
  
  public abstract au qq(int paramInt);
  
  public static abstract interface a
  {
    public abstract void a(c paramc, c.c paramc1);
  }
  
  public static final class b
  {
    public long gGZ;
    public a[] mUV;
    public int mUW;
    public String name;
    
    public b(int paramInt, String paramString, a[] paramArrayOfa)
    {
      GMTrace.i(13370635845632L, 99619);
      if (paramString.length() > 0)
      {
        bool1 = true;
        Assert.assertTrue(bool1);
        this.name = paramString;
        if (paramArrayOfa.length != 2) {
          break label157;
        }
        bool1 = true;
        label44:
        Assert.assertTrue(bool1);
        if (paramArrayOfa[0].mUY < paramArrayOfa[0].mUX) {
          break label163;
        }
        bool1 = true;
        label68:
        Assert.assertTrue(bool1);
        if (paramArrayOfa[1].mUY < paramArrayOfa[1].mUX) {
          break label169;
        }
        bool1 = true;
        label92:
        Assert.assertTrue(bool1);
        if (paramArrayOfa[1].mUX < paramArrayOfa[0].mUY) {
          break label175;
        }
      }
      label157:
      label163:
      label169:
      label175:
      for (boolean bool1 = bool2;; bool1 = false)
      {
        Assert.assertTrue(bool1);
        this.mUV = paramArrayOfa;
        this.mUW = paramInt;
        this.gGZ = paramArrayOfa[0].mUX;
        GMTrace.o(13370635845632L, 99619);
        return;
        bool1 = false;
        break;
        bool1 = false;
        break label44;
        bool1 = false;
        break label68;
        bool1 = false;
        break label92;
      }
    }
    
    public static a[] a(long paramLong1, long paramLong2, long paramLong3, long paramLong4)
    {
      GMTrace.i(13371038498816L, 99622);
      a locala1 = new a();
      locala1.mUX = paramLong1;
      locala1.mUY = paramLong2;
      a locala2 = new a();
      locala2.mUX = paramLong3;
      locala2.mUY = paramLong4;
      GMTrace.o(13371038498816L, 99622);
      return new a[] { locala1, locala2 };
    }
    
    /* Error */
    public final void aOt()
    {
      // Byte code:
      //   0: aload_0
      //   1: monitorenter
      //   2: ldc2_w 69
      //   5: ldc 71
      //   7: invokestatic 32	com/tencent/gmtrace/GMTrace:i	(JI)V
      //   10: aload_0
      //   11: getfield 54	com/tencent/mm/plugin/messenger/foundation/a/a/c$b:mUV	[Lcom/tencent/mm/plugin/messenger/foundation/a/a/c$b$a;
      //   14: iconst_0
      //   15: aaload
      //   16: astore_1
      //   17: aload_0
      //   18: getfield 58	com/tencent/mm/plugin/messenger/foundation/a/a/c$b:gGZ	J
      //   21: aload_1
      //   22: getfield 49	com/tencent/mm/plugin/messenger/foundation/a/a/c$b$a:mUY	J
      //   25: lcmp
      //   26: ifne +68 -> 94
      //   29: aload_0
      //   30: aload_0
      //   31: getfield 54	com/tencent/mm/plugin/messenger/foundation/a/a/c$b:mUV	[Lcom/tencent/mm/plugin/messenger/foundation/a/a/c$b$a;
      //   34: iconst_1
      //   35: aaload
      //   36: getfield 52	com/tencent/mm/plugin/messenger/foundation/a/a/c$b$a:mUX	J
      //   39: putfield 58	com/tencent/mm/plugin/messenger/foundation/a/a/c$b:gGZ	J
      //   42: getstatic 77	com/tencent/mm/plugin/report/d:oqe	Lcom/tencent/mm/plugin/report/d;
      //   45: ldc2_w 78
      //   48: ldc2_w 80
      //   51: lconst_1
      //   52: iconst_0
      //   53: invokevirtual 84	com/tencent/mm/plugin/report/d:a	(JJJZ)V
      //   56: invokestatic 90	com/tencent/mm/sdk/a/b:bPs	()Z
      //   59: ifne +24 -> 83
      //   62: ldc 92
      //   64: ldc 94
      //   66: iconst_1
      //   67: anewarray 4	java/lang/Object
      //   70: dup
      //   71: iconst_0
      //   72: aload_0
      //   73: getfield 58	com/tencent/mm/plugin/messenger/foundation/a/a/c$b:gGZ	J
      //   76: invokestatic 100	java/lang/Long:valueOf	(J)Ljava/lang/Long;
      //   79: aastore
      //   80: invokestatic 105	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
      //   83: ldc2_w 69
      //   86: ldc 71
      //   88: invokestatic 61	com/tencent/gmtrace/GMTrace:o	(JI)V
      //   91: aload_0
      //   92: monitorexit
      //   93: return
      //   94: aload_0
      //   95: aload_0
      //   96: getfield 58	com/tencent/mm/plugin/messenger/foundation/a/a/c$b:gGZ	J
      //   99: lconst_1
      //   100: ladd
      //   101: putfield 58	com/tencent/mm/plugin/messenger/foundation/a/a/c$b:gGZ	J
      //   104: goto -48 -> 56
      //   107: astore_1
      //   108: aload_0
      //   109: monitorexit
      //   110: aload_1
      //   111: athrow
      // Local variable table:
      //   start	length	slot	name	signature
      //   0	112	0	this	b
      //   16	6	1	locala	a
      //   107	4	1	localObject	Object
      // Exception table:
      //   from	to	target	type
      //   2	56	107	finally
      //   56	83	107	finally
      //   83	91	107	finally
      //   94	104	107	finally
    }
    
    public final boolean cR(long paramLong)
    {
      boolean bool = true;
      GMTrace.i(13370904281088L, 99621);
      a[] arrayOfa = this.mUV;
      int k = arrayOfa.length;
      int i = 0;
      int j;
      if (i < k)
      {
        a locala = arrayOfa[i];
        if ((paramLong >= locala.mUX) && (paramLong <= locala.mUY))
        {
          j = 1;
          label59:
          if (j == 0) {
            break label81;
          }
        }
      }
      for (;;)
      {
        GMTrace.o(13370904281088L, 99621);
        return bool;
        j = 0;
        break label59;
        label81:
        i += 1;
        break;
        bool = false;
      }
    }
    
    private static final class a
    {
      public long mUX;
      public long mUY;
      
      public a()
      {
        GMTrace.i(13370367410176L, 99617);
        GMTrace.o(13370367410176L, 99617);
      }
    }
  }
  
  public static final class c
  {
    public String eDs;
    public long juT;
    public String mUZ;
    public ArrayList<au> mVa;
    public int mVb;
    public int mVc;
    public int mVd;
    public long mVe;
    
    public c(String paramString1, String paramString2, int paramInt)
    {
      this(paramString1, paramString2, null, 0);
      GMTrace.i(13369562103808L, 99611);
      this.mVd = paramInt;
      GMTrace.o(13369562103808L, 99611);
    }
    
    public c(String paramString1, String paramString2, au paramau)
    {
      this(paramString1, paramString2, paramau, 0);
      GMTrace.i(13369293668352L, 99609);
      GMTrace.o(13369293668352L, 99609);
    }
    
    public c(String paramString1, String paramString2, au paramau, int paramInt)
    {
      GMTrace.i(13369427886080L, 99610);
      this.mVa = new ArrayList();
      this.mVc = 0;
      this.mVd = 0;
      this.mVe = 0L;
      this.juT = -1L;
      this.eDs = paramString1;
      this.mUZ = paramString2;
      this.mVb = paramInt;
      if (paramau != null) {
        l = paramau.field_bizChatId;
      }
      this.juT = l;
      if (paramau != null) {
        this.mVa.add(paramau);
      }
      GMTrace.o(13369427886080L, 99610);
    }
    
    public static boolean S(au paramau)
    {
      GMTrace.i(13369696321536L, 99612);
      if ((paramau != null) && (paramau.field_isSend == 0) && (paramau.field_status == 3))
      {
        GMTrace.o(13369696321536L, 99612);
        return true;
      }
      GMTrace.o(13369696321536L, 99612);
      return false;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\messenger\foundation\a\a\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */