package com.tencent.mm.plugin.report;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mars.smc.IDKey;
import com.tencent.mm.sdk.platformtools.w;
import java.util.ArrayList;
import java.util.Map;

public enum d
  implements c
{
  c oqf;
  
  static
  {
    GMTrace.i(13636252729344L, 101598);
    oqe = new d("INSTANCE");
    oqg = new d[] { oqe };
    GMTrace.o(13636252729344L, 101598);
  }
  
  private d()
  {
    GMTrace.i(13634910552064L, 101588);
    this.oqf = new a();
    GMTrace.o(13634910552064L, 101588);
  }
  
  public static Object a(int paramInt1, int[] paramArrayOfInt, int paramInt2, int paramInt3)
  {
    int i = 0;
    GMTrace.i(13635984293888L, 101596);
    if ((paramArrayOfInt == null) || (paramArrayOfInt.length <= 0) || (paramInt3 <= paramInt2) || (paramInt3 > 255) || (paramArrayOfInt.length != paramInt3 - paramInt2))
    {
      GMTrace.o(13635984293888L, 101596);
      return null;
    }
    if (paramInt1 <= paramArrayOfInt[0])
    {
      GMTrace.o(13635984293888L, 101596);
      return Integer.valueOf(paramInt2);
    }
    do
    {
      i += 1;
      if (i >= paramArrayOfInt.length - 1) {
        break;
      }
      if (paramArrayOfInt[i] >= paramArrayOfInt[(i + 1)])
      {
        GMTrace.o(13635984293888L, 101596);
        return null;
      }
    } while ((paramInt1 <= paramArrayOfInt[i]) || (paramInt1 > paramArrayOfInt[(i + 1)]));
    GMTrace.o(13635984293888L, 101596);
    return Integer.valueOf(i + (paramInt2 + 1));
    GMTrace.o(13635984293888L, 101596);
    return Integer.valueOf(paramInt3);
  }
  
  public static Object a(int paramInt, int[] paramArrayOfInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    GMTrace.i(13635850076160L, 101595);
    if ((paramArrayOfInt.length <= 0) || (paramArrayOfInt.length + 1 != paramArrayOfObject.length))
    {
      GMTrace.o(13635850076160L, 101595);
      return null;
    }
    if (paramInt <= paramArrayOfInt[0])
    {
      paramArrayOfInt = paramArrayOfObject[0];
      GMTrace.o(13635850076160L, 101595);
      return paramArrayOfInt;
    }
    do
    {
      i += 1;
      if (i >= paramArrayOfInt.length - 1) {
        break;
      }
      if (paramArrayOfInt[i] >= paramArrayOfInt[(i + 1)])
      {
        GMTrace.o(13635850076160L, 101595);
        return null;
      }
    } while ((paramInt <= paramArrayOfInt[i]) || (paramInt > paramArrayOfInt[(i + 1)]));
    paramArrayOfInt = paramArrayOfObject[(i + 1)];
    GMTrace.o(13635850076160L, 101595);
    return paramArrayOfInt;
    paramArrayOfInt = paramArrayOfObject[(paramArrayOfObject.length - 1)];
    GMTrace.o(13635850076160L, 101595);
    return paramArrayOfInt;
  }
  
  public final void A(int paramInt, String paramString)
  {
    GMTrace.i(14612418265088L, 108871);
    this.oqf.A(paramInt, paramString);
    GMTrace.o(14612418265088L, 108871);
  }
  
  public final void a(int paramInt, String paramString, boolean paramBoolean1, boolean paramBoolean2)
  {
    GMTrace.i(13635178987520L, 101590);
    this.oqf.a(paramInt, paramString, paramBoolean1, paramBoolean2);
    GMTrace.o(13635178987520L, 101590);
  }
  
  public final void a(int paramInt, boolean paramBoolean1, boolean paramBoolean2, Object... paramVarArgs)
  {
    GMTrace.i(13635313205248L, 101591);
    this.oqf.a(paramInt, paramBoolean1, paramBoolean2, paramVarArgs);
    GMTrace.o(13635313205248L, 101591);
  }
  
  public final void a(long paramLong1, long paramLong2, long paramLong3, boolean paramBoolean)
  {
    GMTrace.i(13635447422976L, 101592);
    this.oqf.a(paramLong1, paramLong2, paramLong3, paramBoolean);
    GMTrace.o(13635447422976L, 101592);
  }
  
  public final void b(ArrayList<IDKey> paramArrayList, boolean paramBoolean)
  {
    GMTrace.i(18789676613632L, 139994);
    this.oqf.b(paramArrayList, paramBoolean);
    GMTrace.o(18789676613632L, 139994);
  }
  
  public final void c(int paramInt1, int paramInt2, int paramInt3, int paramInt4, boolean paramBoolean)
  {
    GMTrace.i(13635581640704L, 101593);
    this.oqf.c(paramInt1, paramInt2, paramInt3, paramInt4, paramBoolean);
    GMTrace.o(13635581640704L, 101593);
  }
  
  public final void d(String paramString1, String paramString2, Map<String, Object> paramMap)
  {
    GMTrace.i(13636118511616L, 101597);
    this.oqf.d(paramString1, paramString2, paramMap);
    GMTrace.o(13636118511616L, 101597);
  }
  
  public final void dp(int paramInt)
  {
    GMTrace.i(13635715858432L, 101594);
    this.oqf.dp(paramInt);
    GMTrace.o(13635715858432L, 101594);
  }
  
  public final void i(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(13635044769792L, 101589);
    this.oqf.i(paramInt, paramVarArgs);
    GMTrace.o(13635044769792L, 101589);
  }
  
  private static final class a
    implements c
  {
    public a()
    {
      GMTrace.i(13633434157056L, 101577);
      GMTrace.o(13633434157056L, 101577);
    }
    
    public final void A(int paramInt, String paramString)
    {
      GMTrace.i(14612284047360L, 108870);
      w.i("MicroMsg.ReportService", "this is DummyReportService");
      GMTrace.o(14612284047360L, 108870);
    }
    
    public final void a(int paramInt, String paramString, boolean paramBoolean1, boolean paramBoolean2)
    {
      GMTrace.i(13633971027968L, 101581);
      w.i("MicroMsg.ReportService", "this is DummyReportService");
      GMTrace.o(13633971027968L, 101581);
    }
    
    public final void a(int paramInt, boolean paramBoolean1, boolean paramBoolean2, Object... paramVarArgs)
    {
      GMTrace.i(13634105245696L, 101582);
      w.i("MicroMsg.ReportService", "this is DummyReportService");
      GMTrace.o(13634105245696L, 101582);
    }
    
    public final void a(long paramLong1, long paramLong2, long paramLong3, boolean paramBoolean)
    {
      GMTrace.i(13633568374784L, 101578);
      w.i("MicroMsg.ReportService", "this is DummyReportService");
      GMTrace.o(13633568374784L, 101578);
    }
    
    public final void b(ArrayList<IDKey> paramArrayList, boolean paramBoolean)
    {
      GMTrace.i(18789542395904L, 139993);
      w.i("MicroMsg.ReportService", "this is DummyReportService");
      GMTrace.o(18789542395904L, 139993);
    }
    
    public final void c(int paramInt1, int paramInt2, int paramInt3, int paramInt4, boolean paramBoolean)
    {
      GMTrace.i(13634239463424L, 101583);
      w.i("MicroMsg.ReportService", "this is DummyReportService");
      GMTrace.o(13634239463424L, 101583);
    }
    
    public final void d(String paramString1, String paramString2, Map<String, Object> paramMap)
    {
      GMTrace.i(13634373681152L, 101584);
      w.i("MicroMsg.ReportService", "this is DummyReportService");
      GMTrace.o(13634373681152L, 101584);
    }
    
    public final void dp(int paramInt)
    {
      GMTrace.i(13633702592512L, 101579);
      w.i("MicroMsg.ReportService", "this is DummyReportService");
      GMTrace.o(13633702592512L, 101579);
    }
    
    public final void i(int paramInt, Object... paramVarArgs)
    {
      GMTrace.i(13633836810240L, 101580);
      w.i("MicroMsg.ReportService", "this is DummyReportService");
      GMTrace.o(13633836810240L, 101580);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\report\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */