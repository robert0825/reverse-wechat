package com.tencent.mm.plugin.bottle.ui;

import com.tencent.gmtrace.GMTrace;
import java.util.Calendar;
import java.util.Date;

final class f
{
  private static final long[] jqR;
  private static final long jqU;
  public int jqS;
  public boolean jqT;
  public int month;
  public int year;
  
  static
  {
    GMTrace.i(7626117087232L, 56819);
    jqR = new long[] { 19416L, 19168L, 42352L, 21717L, 53856L, 55632L, 91476L, 22176L, 39632L, 21970L, 19168L, 42422L, 42192L, 53840L, 119381L, 46400L, 54944L, 44450L, 38320L, 84343L, 18800L, 42160L, 46261L, 27216L, 27968L, 109396L, 11104L, 38256L, 21234L, 18800L, 25958L, 54432L, 59984L, 28309L, 23248L, 11104L, 100067L, 37600L, 116951L, 51536L, 54432L, 120998L, 46416L, 22176L, 107956L, 9680L, 37584L, 53938L, 43344L, 46423L, 27808L, 46416L, 86869L, 19872L, 42448L, 83315L, 21200L, 43432L, 59728L, 27296L, 44710L, 43856L, 19296L, 43748L, 42352L, 21088L, 62051L, 55632L, 23383L, 22176L, 38608L, 19925L, 19152L, 42192L, 54484L, 53840L, 54616L, 46400L, 46496L, 103846L, 38320L, 18864L, 43380L, 42160L, 45690L, 27216L, 27968L, 44870L, 43872L, 38256L, 19189L, 18800L, 25776L, 29859L, 59984L, 27480L, 21952L, 43872L, 38613L, 37600L, 51552L, 55636L, 54432L, 55888L, 30034L, 22176L, 43959L, 9680L, 37584L, 51893L, 43344L, 46240L, 47780L, 44368L, 21977L, 19360L, 42416L, 86390L, 21168L, 43312L, 31060L, 27296L, 44368L, 23378L, 19296L, 42726L, 42208L, 53856L, 60005L, 54576L, 23200L, 30371L, 38608L, 19415L, 19152L, 42192L, 118966L, 53840L, 54560L, 56645L, 46496L, 22224L, 21938L, 18864L, 42359L, 42160L, 43600L, 111189L, 27936L, 44448L };
    jqU = new Date(0, 0, 31).getTime();
    GMTrace.o(7626117087232L, 56819);
  }
  
  public f()
  {
    this(Calendar.getInstance());
    GMTrace.i(7625445998592L, 56814);
    GMTrace.o(7625445998592L, 56814);
  }
  
  private f(Calendar paramCalendar)
  {
    GMTrace.i(7625580216320L, 56815);
    int k = (int)((paramCalendar.getTime().getTime() - jqU) / 86400000L);
    int m = 0;
    int i = 1900;
    while ((i < 2050) && (k > 0))
    {
      m = lk(i);
      k -= m;
      i += 1;
    }
    int n = i;
    int j = k;
    if (k < 0)
    {
      j = k + m;
      n = i - 1;
    }
    this.year = n;
    n = lm(n);
    this.jqT = false;
    m = 0;
    k = j;
    i = 1;
    j = m;
    if ((i < 13) && (k > 0))
    {
      if ((n > 0) && (i == n + 1) && (!this.jqT))
      {
        i -= 1;
        this.jqT = true;
        j = ll(this.year);
      }
      for (;;)
      {
        k -= j;
        if ((this.jqT) && (i == n + 1)) {
          this.jqT = false;
        }
        i += 1;
        break;
        j = this.year;
        if ((jqR[(j - 1900)] & 65536 >> i) == 0L) {
          j = 29;
        } else {
          j = 30;
        }
      }
    }
    if ((k == 0) && (n > 0) && (i == n + 1)) {
      if (this.jqT) {
        this.jqT = false;
      }
    }
    for (;;)
    {
      if (k < 0)
      {
        j = k + j;
        i -= 1;
      }
      for (;;)
      {
        this.month = i;
        this.jqS = (j + 1);
        GMTrace.o(7625580216320L, 56815);
        return;
        this.jqT = true;
        i -= 1;
        break;
        j = k;
      }
    }
  }
  
  private static int lk(int paramInt)
  {
    GMTrace.i(7625714434048L, 56816);
    int i = 348;
    int j = 32768;
    while (j > 8)
    {
      int k = i;
      if ((jqR[(paramInt - 1900)] & j) != 0L) {
        k = i + 1;
      }
      j >>= 1;
      i = k;
    }
    paramInt = ll(paramInt);
    GMTrace.o(7625714434048L, 56816);
    return i + paramInt;
  }
  
  private static int ll(int paramInt)
  {
    GMTrace.i(7625848651776L, 56817);
    if (lm(paramInt) != 0)
    {
      if ((jqR[(paramInt - 1900)] & 0x10000) != 0L)
      {
        GMTrace.o(7625848651776L, 56817);
        return 30;
      }
      GMTrace.o(7625848651776L, 56817);
      return 29;
    }
    GMTrace.o(7625848651776L, 56817);
    return 0;
  }
  
  private static int lm(int paramInt)
  {
    GMTrace.i(7625982869504L, 56818);
    paramInt = (int)(jqR[(paramInt - 1900)] & 0xF);
    GMTrace.o(7625982869504L, 56818);
    return paramInt;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\bottle\ui\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */