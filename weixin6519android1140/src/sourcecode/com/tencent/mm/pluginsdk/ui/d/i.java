package com.tencent.mm.pluginsdk.ui.d;

import android.text.GetChars;
import android.text.Spannable;
import android.text.SpannableString;
import com.tencent.gmtrace.GMTrace;

public final class i
  implements GetChars, Spannable, CharSequence
{
  private SpannableString tEc;
  
  public i()
  {
    GMTrace.i(1211717648384L, 9028);
    this.tEc = null;
    this.tEc = new SpannableString("");
    GMTrace.o(1211717648384L, 9028);
  }
  
  public i(SpannableString paramSpannableString)
  {
    GMTrace.i(1212120301568L, 9031);
    this.tEc = null;
    this.tEc = paramSpannableString;
    GMTrace.o(1212120301568L, 9031);
  }
  
  public i(CharSequence paramCharSequence)
  {
    GMTrace.i(1211851866112L, 9029);
    this.tEc = null;
    this.tEc = new SpannableString(paramCharSequence);
    GMTrace.o(1211851866112L, 9029);
  }
  
  public i(String paramString)
  {
    GMTrace.i(1211986083840L, 9030);
    this.tEc = null;
    this.tEc = new SpannableString(paramString);
    GMTrace.o(1211986083840L, 9030);
  }
  
  private void a(Object paramObject, int paramInt1, int paramInt2, int paramInt3)
  {
    GMTrace.i(1212657172480L, 9035);
    if ((paramInt1 >= 0) && (paramInt2 <= this.tEc.length())) {
      this.tEc.setSpan(paramObject, paramInt1, paramInt2, paramInt3);
    }
    GMTrace.o(1212657172480L, 9035);
  }
  
  public final void a(Object paramObject, CharSequence paramCharSequence, int paramInt1, int paramInt2)
  {
    GMTrace.i(1212254519296L, 9032);
    a(paramObject, paramInt1, paramCharSequence.length() + paramInt1, 33);
    GMTrace.o(1212254519296L, 9032);
  }
  
  public final char charAt(int paramInt)
  {
    GMTrace.i(1213596696576L, 9042);
    char c = this.tEc.charAt(paramInt);
    GMTrace.o(1213596696576L, 9042);
    return c;
  }
  
  public final void f(Object paramObject, CharSequence paramCharSequence)
  {
    GMTrace.i(1212388737024L, 9033);
    a(paramObject, paramCharSequence, 0, 33);
    GMTrace.o(1212388737024L, 9033);
  }
  
  public final void getChars(int paramInt1, int paramInt2, char[] paramArrayOfChar, int paramInt3)
  {
    GMTrace.i(1213999349760L, 9045);
    this.tEc.getChars(paramInt1, paramInt2, paramArrayOfChar, paramInt3);
    GMTrace.o(1213999349760L, 9045);
  }
  
  public final int getSpanEnd(Object paramObject)
  {
    GMTrace.i(1213059825664L, 9038);
    int i = this.tEc.getSpanEnd(paramObject);
    GMTrace.o(1213059825664L, 9038);
    return i;
  }
  
  public final int getSpanFlags(Object paramObject)
  {
    GMTrace.i(1213194043392L, 9039);
    int i = this.tEc.getSpanFlags(paramObject);
    GMTrace.o(1213194043392L, 9039);
    return i;
  }
  
  public final int getSpanStart(Object paramObject)
  {
    GMTrace.i(1212925607936L, 9037);
    int i = this.tEc.getSpanStart(paramObject);
    GMTrace.o(1212925607936L, 9037);
    return i;
  }
  
  public final <T> T[] getSpans(int paramInt1, int paramInt2, Class<T> paramClass)
  {
    GMTrace.i(1212791390208L, 9036);
    paramClass = this.tEc.getSpans(paramInt1, paramInt2, paramClass);
    GMTrace.o(1212791390208L, 9036);
    return paramClass;
  }
  
  public final int length()
  {
    GMTrace.i(1213462478848L, 9041);
    int i = this.tEc.length();
    GMTrace.o(1213462478848L, 9041);
    return i;
  }
  
  public final int nextSpanTransition(int paramInt1, int paramInt2, Class paramClass)
  {
    GMTrace.i(1213328261120L, 9040);
    paramInt1 = this.tEc.nextSpanTransition(paramInt1, paramInt2, paramClass);
    GMTrace.o(1213328261120L, 9040);
    return paramInt1;
  }
  
  public final void removeSpan(Object paramObject)
  {
    GMTrace.i(1213865132032L, 9044);
    this.tEc.removeSpan(paramObject);
    GMTrace.o(1213865132032L, 9044);
  }
  
  public final void setSpan(Object paramObject, int paramInt1, int paramInt2, int paramInt3)
  {
    GMTrace.i(1212522954752L, 9034);
    a(paramObject, paramInt1, paramInt2, paramInt3);
    GMTrace.o(1212522954752L, 9034);
  }
  
  public final CharSequence subSequence(int paramInt1, int paramInt2)
  {
    GMTrace.i(1213730914304L, 9043);
    CharSequence localCharSequence = this.tEc.subSequence(paramInt1, paramInt2);
    GMTrace.o(1213730914304L, 9043);
    return localCharSequence;
  }
  
  public final String toString()
  {
    GMTrace.i(1214133567488L, 9046);
    String str = this.tEc.toString();
    GMTrace.o(1214133567488L, 9046);
    return str;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\pluginsdk\ui\d\i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */