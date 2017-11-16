package com.tencent.mm.plugin.wenote.model.nativenote.manager;

import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.CharacterStyle;
import android.text.style.ParagraphStyle;
import com.tencent.gmtrace.GMTrace;
import java.lang.reflect.Array;

public final class a
  extends SpannableString
{
  private int Qx;
  private Object[] sdN;
  private int[] sdO;
  
  public a(CharSequence paramCharSequence)
  {
    super(paramCharSequence.toString());
    GMTrace.i(17226308517888L, 128346);
    c(paramCharSequence, paramCharSequence.length());
    GMTrace.o(17226308517888L, 128346);
  }
  
  private void c(CharSequence paramCharSequence, int paramInt)
  {
    GMTrace.i(17226442735616L, 128347);
    this.sdN = new Object[20];
    this.sdO = new int[60];
    if ((paramCharSequence instanceof Spanned))
    {
      paramCharSequence = (Spanned)paramCharSequence;
      Object[] arrayOfObject = paramCharSequence.getSpans(0, paramInt, Object.class);
      int n = arrayOfObject.length;
      int i = 0;
      while (i < n)
      {
        Object localObject = arrayOfObject[i];
        if (((localObject instanceof CharacterStyle)) || ((localObject instanceof ParagraphStyle)))
        {
          int k = paramCharSequence.getSpanStart(localObject);
          int m = paramCharSequence.getSpanEnd(localObject);
          int i1 = paramCharSequence.getSpanFlags(localObject);
          int j = k;
          if (k < 0) {
            j = 0;
          }
          k = m;
          if (m > paramInt) {
            k = paramInt;
          }
          setSpan(localObject, j + 0, k + 0, i1);
        }
        i += 1;
      }
    }
    GMTrace.o(17226442735616L, 128347);
  }
  
  public final int getSpanEnd(Object paramObject)
  {
    GMTrace.i(17226979606528L, 128351);
    int i = this.Qx;
    Object[] arrayOfObject = this.sdN;
    int[] arrayOfInt = this.sdO;
    i -= 1;
    while (i >= 0)
    {
      if (arrayOfObject[i] == paramObject)
      {
        i = arrayOfInt[(i * 3 + 1)];
        GMTrace.o(17226979606528L, 128351);
        return i;
      }
      i -= 1;
    }
    GMTrace.o(17226979606528L, 128351);
    return -1;
  }
  
  public final int getSpanFlags(Object paramObject)
  {
    GMTrace.i(17227113824256L, 128352);
    int i = this.Qx;
    Object[] arrayOfObject = this.sdN;
    int[] arrayOfInt = this.sdO;
    i -= 1;
    while (i >= 0)
    {
      if (arrayOfObject[i] == paramObject)
      {
        i = arrayOfInt[(i * 3 + 2)];
        GMTrace.o(17227113824256L, 128352);
        return i;
      }
      i -= 1;
    }
    GMTrace.o(17227113824256L, 128352);
    return 0;
  }
  
  public final int getSpanStart(Object paramObject)
  {
    GMTrace.i(17226845388800L, 128350);
    int i = this.Qx;
    Object[] arrayOfObject = this.sdN;
    int[] arrayOfInt = this.sdO;
    i -= 1;
    while (i >= 0)
    {
      if (arrayOfObject[i] == paramObject)
      {
        i = arrayOfInt[(i * 3 + 0)];
        GMTrace.o(17226845388800L, 128350);
        return i;
      }
      i -= 1;
    }
    GMTrace.o(17226845388800L, 128350);
    return -1;
  }
  
  public final <T> T[] getSpans(int paramInt1, int paramInt2, Class<T> paramClass)
  {
    GMTrace.i(17227248041984L, 128353);
    int m = this.Qx;
    Object[] arrayOfObject2 = this.sdN;
    int[] arrayOfInt = this.sdO;
    Object localObject = null;
    int j = 0;
    Object[] arrayOfObject1 = null;
    int i = 0;
    int k;
    int n;
    if (j < m)
    {
      if ((paramClass != null) && (!paramClass.isInstance(arrayOfObject2[j]))) {
        break label415;
      }
      k = arrayOfInt[(j * 3 + 0)];
      n = arrayOfInt[(j * 3 + 1)];
      if ((k > paramInt2) || (n < paramInt1) || ((k != n) && (paramInt1 != paramInt2) && ((k == paramInt2) || (n == paramInt1)))) {
        break label415;
      }
      if (i == 0)
      {
        localObject = arrayOfObject2[j];
        i += 1;
      }
    }
    label415:
    for (;;)
    {
      j += 1;
      break;
      if (i == 1)
      {
        arrayOfObject1 = (Object[])Array.newInstance(paramClass, m - j + 1);
        arrayOfObject1[0] = localObject;
      }
      n = 0xFF0000 & arrayOfInt[(j * 3 + 2)];
      if (n != 0)
      {
        k = 0;
        while ((k < i) && (n <= (getSpanFlags(arrayOfObject1[k]) & 0xFF0000))) {
          k += 1;
        }
        System.arraycopy(arrayOfObject1, k, arrayOfObject1, k + 1, i - k);
        arrayOfObject1[k] = arrayOfObject2[j];
        i += 1;
      }
      else
      {
        arrayOfObject1[i] = arrayOfObject2[j];
        i += 1;
        continue;
        if (i == 0)
        {
          paramClass = (Object[])Array.newInstance(paramClass, 0);
          GMTrace.o(17227248041984L, 128353);
          return paramClass;
        }
        if (i == 1)
        {
          paramClass = (Object[])Array.newInstance(paramClass, 1);
          paramClass[0] = localObject;
          paramClass = (Object[])paramClass;
          GMTrace.o(17227248041984L, 128353);
          return paramClass;
        }
        if (i == arrayOfObject1.length)
        {
          paramClass = (Object[])arrayOfObject1;
          GMTrace.o(17227248041984L, 128353);
          return paramClass;
        }
        paramClass = (Object[])Array.newInstance(paramClass, i);
        System.arraycopy(arrayOfObject1, 0, paramClass, 0, i);
        paramClass = (Object[])paramClass;
        GMTrace.o(17227248041984L, 128353);
        return paramClass;
      }
    }
  }
  
  public final int nextSpanTransition(int paramInt1, int paramInt2, Class paramClass)
  {
    GMTrace.i(17227382259712L, 128354);
    int m = this.Qx;
    Object[] arrayOfObject = this.sdN;
    int[] arrayOfInt = this.sdO;
    Class localClass = paramClass;
    if (paramClass == null) {
      localClass = Object.class;
    }
    int i = 0;
    int j;
    if (i < m)
    {
      int k = arrayOfInt[(i * 3 + 0)];
      j = arrayOfInt[(i * 3 + 1)];
      if ((k <= paramInt1) || (k >= paramInt2) || (!localClass.isInstance(arrayOfObject[i]))) {
        break label147;
      }
      paramInt2 = k;
    }
    label147:
    for (;;)
    {
      if ((j > paramInt1) && (j < paramInt2) && (localClass.isInstance(arrayOfObject[i]))) {
        paramInt2 = j;
      }
      for (;;)
      {
        i += 1;
        break;
        GMTrace.o(17227382259712L, 128354);
        return paramInt2;
      }
    }
  }
  
  public final void removeSpan(Object paramObject)
  {
    GMTrace.i(17226711171072L, 128349);
    int j = this.Qx;
    Object[] arrayOfObject = this.sdN;
    int[] arrayOfInt = this.sdO;
    int i = j - 1;
    while (i >= 0)
    {
      if (arrayOfObject[i] == paramObject)
      {
        j -= i + 1;
        System.arraycopy(arrayOfObject, i + 1, arrayOfObject, i, j);
        System.arraycopy(arrayOfInt, (i + 1) * 3, arrayOfInt, i * 3, j * 3);
        this.Qx -= 1;
        GMTrace.o(17226711171072L, 128349);
        return;
      }
      i -= 1;
    }
    GMTrace.o(17226711171072L, 128349);
  }
  
  public final void setSpan(Object paramObject, int paramInt1, int paramInt2, int paramInt3)
  {
    GMTrace.i(17226576953344L, 128348);
    if (this.Qx + 1 >= this.sdN.length)
    {
      int i = this.Qx + 10;
      Object[] arrayOfObject = new Object[i];
      int[] arrayOfInt = new int[i * 3];
      System.arraycopy(this.sdN, 0, arrayOfObject, 0, this.Qx);
      System.arraycopy(this.sdO, 0, arrayOfInt, 0, this.Qx * 3);
      this.sdN = arrayOfObject;
      this.sdO = arrayOfInt;
    }
    this.sdN[this.Qx] = paramObject;
    this.sdO[(this.Qx * 3 + 0)] = paramInt1;
    this.sdO[(this.Qx * 3 + 1)] = paramInt2;
    this.sdO[(this.Qx * 3 + 2)] = paramInt3;
    this.Qx += 1;
    GMTrace.o(17226576953344L, 128348);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\wenote\model\nativenote\manager\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */